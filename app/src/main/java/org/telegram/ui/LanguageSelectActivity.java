package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection$EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextRadioCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
/* loaded from: classes3.dex */
public class LanguageSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private EmptyTextProgressView emptyView;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private ListAdapter searchListViewAdapter;
    private ArrayList<LocaleController.LocaleInfo> searchResult;
    private boolean searchWas;
    private boolean searching;
    private ArrayList<LocaleController.LocaleInfo> sortedLanguages;
    private ArrayList<LocaleController.LocaleInfo> unofficialLanguages;

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(2131165449);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("Language", 2131626393));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        this.actionBar.createMenu().addItem(0, 2131165456).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass2()).setSearchFieldHint(LocaleController.getString("Search", 2131628154));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString("NoResult", 2131626910));
        this.emptyView.showTextView();
        this.emptyView.setShowAtCenter(true);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new LanguageSelectActivity$$ExternalSyntheticLambda6(this));
        this.listView.setOnItemLongClickListener(new LanguageSelectActivity$$ExternalSyntheticLambda7(this));
        this.listView.setOnScrollListener(new AnonymousClass3());
        return this.fragmentView;
    }

    /* renamed from: org.telegram.ui.LanguageSelectActivity$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
            LanguageSelectActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            if (i == -1) {
                LanguageSelectActivity.this.finishFragment();
            }
        }
    }

    /* renamed from: org.telegram.ui.LanguageSelectActivity$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        AnonymousClass2() {
            LanguageSelectActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchExpand() {
            LanguageSelectActivity.this.searching = true;
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchCollapse() {
            LanguageSelectActivity.this.search(null);
            LanguageSelectActivity.this.searching = false;
            LanguageSelectActivity.this.searchWas = false;
            if (LanguageSelectActivity.this.listView != null) {
                LanguageSelectActivity.this.emptyView.setVisibility(8);
                LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.listAdapter);
            }
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onTextChanged(EditText editText) {
            String obj = editText.getText().toString();
            LanguageSelectActivity.this.search(obj);
            if (obj.length() != 0) {
                LanguageSelectActivity.this.searchWas = true;
                if (LanguageSelectActivity.this.listView == null) {
                    return;
                }
                LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.searchListViewAdapter);
                return;
            }
            LanguageSelectActivity.this.searching = false;
            LanguageSelectActivity.this.searchWas = false;
            if (LanguageSelectActivity.this.listView == null) {
                return;
            }
            LanguageSelectActivity.this.emptyView.setVisibility(8);
            LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.listAdapter);
        }
    }

    public /* synthetic */ void lambda$createView$1(View view, int i) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof TextRadioCell)) {
                boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
                if (!z) {
                    i -= 2;
                }
                if (z) {
                    localeInfo = this.searchResult.get(i);
                } else if (!this.unofficialLanguages.isEmpty() && i >= 0 && i < this.unofficialLanguages.size()) {
                    localeInfo = this.unofficialLanguages.get(i);
                } else {
                    if (!this.unofficialLanguages.isEmpty()) {
                        i -= this.unofficialLanguages.size() + 1;
                    }
                    localeInfo = this.sortedLanguages.get(i);
                }
                if (localeInfo == null) {
                    return;
                }
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                LocaleController.getInstance().applyLanguage(localeInfo, true, false, false, true, this.currentAccount);
                this.parentLayout.rebuildAllFragmentViews(false, false);
                String str = localeInfo.pluralLangCode;
                String str2 = currentLocaleInfo.pluralLangCode;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                HashSet hashSet = new HashSet(restrictedLanguages);
                if (restrictedLanguages.contains(str)) {
                    Collection$EL.removeIf(hashSet, new LanguageSelectActivity$$ExternalSyntheticLambda5(str));
                    if (!restrictedLanguages.contains(str2)) {
                        hashSet.add(str2);
                    }
                }
                globalMainSettings.edit().putStringSet("translate_button_restricted_languages", hashSet).apply();
                finishFragment();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ boolean lambda$createView$0(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    public /* synthetic */ boolean lambda$createView$3(View view, int i) {
        LocaleController.LocaleInfo localeInfo;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (getParentActivity() != null && this.parentLayout != null && (view instanceof TextRadioCell)) {
            boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
            if (!z) {
                i -= 2;
            }
            if (z) {
                localeInfo = this.searchResult.get(i);
            } else if (!this.unofficialLanguages.isEmpty() && i >= 0 && i < this.unofficialLanguages.size()) {
                localeInfo = this.unofficialLanguages.get(i);
            } else {
                if (!this.unofficialLanguages.isEmpty()) {
                    i -= this.unofficialLanguages.size() + 1;
                }
                localeInfo = this.sortedLanguages.get(i);
            }
            if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("DeleteLocalizationTitle", 2131625432));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", 2131625431, localeInfo.name)));
                builder.setPositiveButton(LocaleController.getString("Delete", 2131625384), new LanguageSelectActivity$$ExternalSyntheticLambda0(this, localeInfo));
                builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
                AlertDialog create = builder.create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void lambda$createView$2(LocaleController.LocaleInfo localeInfo, DialogInterface dialogInterface, int i) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, this.currentAccount)) {
            fillLanguages();
            ArrayList<LocaleController.LocaleInfo> arrayList = this.searchResult;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            ListAdapter listAdapter2 = this.searchListViewAdapter;
            if (listAdapter2 == null) {
                return;
            }
            listAdapter2.notifyDataSetChanged();
        }
    }

    /* renamed from: org.telegram.ui.LanguageSelectActivity$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends RecyclerView.OnScrollListener {
        AnonymousClass3() {
            LanguageSelectActivity.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AndroidUtilities.hideKeyboard(LanguageSelectActivity.this.getParentActivity().getCurrentFocus());
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages();
        AndroidUtilities.runOnUIThread(new LanguageSelectActivity$$ExternalSyntheticLambda1(this));
    }

    public /* synthetic */ void lambda$didReceivedNotification$4() {
        this.listAdapter.notifyDataSetChanged();
    }

    private void fillLanguages() {
        LanguageSelectActivity$$ExternalSyntheticLambda4 languageSelectActivity$$ExternalSyntheticLambda4 = new LanguageSelectActivity$$ExternalSyntheticLambda4(LocaleController.getInstance().getCurrentLocaleInfo());
        this.sortedLanguages = new ArrayList<>();
        this.unofficialLanguages = new ArrayList<>(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.sortedLanguages.add(localeInfo);
            } else {
                this.unofficialLanguages.add(localeInfo);
            }
        }
        Collections.sort(this.sortedLanguages, languageSelectActivity$$ExternalSyntheticLambda4);
        Collections.sort(this.unofficialLanguages, languageSelectActivity$$ExternalSyntheticLambda4);
    }

    public static /* synthetic */ int lambda$fillLanguages$5(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
        if (localeInfo2 == localeInfo) {
            return -1;
        }
        if (localeInfo3 == localeInfo) {
            return 1;
        }
        int i = localeInfo2.serverIndex;
        int i2 = localeInfo3.serverIndex;
        if (i == i2) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void search(String str) {
        if (str == null) {
            this.searching = false;
            this.searchResult = null;
            if (this.listView == null) {
                return;
            }
            this.emptyView.setVisibility(8);
            this.listView.setAdapter(this.listAdapter);
            return;
        }
        processSearch(str);
    }

    private void processSearch(String str) {
        Utilities.searchQueue.postRunnable(new LanguageSelectActivity$$ExternalSyntheticLambda2(this, str));
    }

    public /* synthetic */ void lambda$processSearch$6(String str) {
        if (str.trim().toLowerCase().length() == 0) {
            updateSearchResults(new ArrayList<>());
            return;
        }
        System.currentTimeMillis();
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>();
        int size = this.unofficialLanguages.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = this.unofficialLanguages.get(i);
            if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo);
            }
        }
        int size2 = this.sortedLanguages.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LocaleController.LocaleInfo localeInfo2 = this.sortedLanguages.get(i2);
            if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo2);
            }
        }
        updateSearchResults(arrayList);
    }

    private void updateSearchResults(ArrayList<LocaleController.LocaleInfo> arrayList) {
        AndroidUtilities.runOnUIThread(new LanguageSelectActivity$$ExternalSyntheticLambda3(this, arrayList));
    }

    public /* synthetic */ void lambda$updateSearchResults$7(ArrayList arrayList) {
        this.searchResult = arrayList;
        this.searchListViewAdapter.notifyDataSetChanged();
    }

    /* loaded from: classes3.dex */
    public class TranslateSettings extends LinearLayout {
        private TextSettingsCell doNotTranslateCell;
        private HeaderCell header;
        private TextInfoPrivacyCell info;
        private TextInfoPrivacyCell info2;
        private SharedPreferences.OnSharedPreferenceChangeListener listener;
        private TextCheckCell showButtonCheck;
        private ValueAnimator doNotTranslateCellAnimation = null;
        private SharedPreferences preferences = MessagesController.getGlobalMainSettings();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranslateSettings(Context context) {
            super(context);
            LanguageSelectActivity.this = r12;
            setFocusable(false);
            setOrientation(1);
            HeaderCell headerCell = new HeaderCell(context);
            this.header = headerCell;
            headerCell.setFocusable(true);
            this.header.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.header.setText(LocaleController.getString("TranslateMessages", 2131628759));
            this.header.setContentDescription(LocaleController.getString("TranslateMessages", 2131628759));
            addView(this.header, LayoutHelper.createLinear(-1, -2));
            boolean value = getValue();
            TextCheckCell textCheckCell = new TextCheckCell(context);
            this.showButtonCheck = textCheckCell;
            textCheckCell.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("windowBackgroundWhite")));
            this.showButtonCheck.setTextAndCheck(LocaleController.getString("ShowTranslateButton", 2131628410), value, value);
            this.showButtonCheck.setOnClickListener(new LanguageSelectActivity$TranslateSettings$$ExternalSyntheticLambda1(this));
            addView(this.showButtonCheck, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            this.doNotTranslateCell = textSettingsCell;
            textSettingsCell.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("windowBackgroundWhite")));
            this.doNotTranslateCell.setOnClickListener(new LanguageSelectActivity$TranslateSettings$$ExternalSyntheticLambda2(this));
            this.doNotTranslateCell.setClickable(value && LanguageDetector.hasSupport());
            float f = 1.0f;
            this.doNotTranslateCell.setAlpha((!value || !LanguageDetector.hasSupport()) ? 0.0f : 1.0f);
            addView(this.doNotTranslateCell, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            this.info = textInfoPrivacyCell;
            textInfoPrivacyCell.setTopPadding(11);
            this.info.setBottomPadding(16);
            this.info.setFocusable(true);
            this.info.setText(LocaleController.getString("TranslateMessagesInfo1", 2131628760));
            this.info.setContentDescription(LocaleController.getString("TranslateMessagesInfo1", 2131628760));
            addView(this.info, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
            this.info2 = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setTopPadding(0);
            this.info2.setBottomPadding(16);
            this.info2.setFocusable(true);
            this.info2.setText(LocaleController.getString("TranslateMessagesInfo2", 2131628761));
            this.info2.setContentDescription(LocaleController.getString("TranslateMessagesInfo2", 2131628761));
            this.info2.setAlpha(value ? 0.0f : f);
            addView(this.info2, LayoutHelper.createLinear(-1, -2));
            updateHeight();
            update();
        }

        public /* synthetic */ void lambda$new$0(View view) {
            this.preferences.edit().putBoolean("translate_button", !getValue()).apply();
        }

        public /* synthetic */ void lambda$new$1(View view) {
            LanguageSelectActivity.this.presentFragment(new RestrictedLanguagesSelectActivity());
            update();
        }

        private boolean getValue() {
            return this.preferences.getBoolean("translate_button", false);
        }

        private ArrayList<String> getRestrictedLanguages() {
            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
            ArrayList<String> arrayList = new ArrayList<>(RestrictedLanguagesSelectActivity.getRestrictedLanguages());
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            return arrayList;
        }

        public void update() {
            boolean z = getValue() && LanguageDetector.hasSupport();
            this.showButtonCheck.setChecked(getValue());
            ValueAnimator valueAnimator = this.doNotTranslateCellAnimation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.showButtonCheck.setDivider(z);
            ArrayList<String> restrictedLanguages = getRestrictedLanguages();
            String str = null;
            if (restrictedLanguages.size() == 1) {
                try {
                    str = LocaleController.getInstance().getLanguageFromDict(restrictedLanguages.get(0)).name;
                } catch (Exception unused) {
                }
            }
            if (str == null) {
                str = String.format(LocaleController.getPluralString("Languages", getRestrictedLanguages().size()), Integer.valueOf(getRestrictedLanguages().size()));
            }
            this.doNotTranslateCell.setTextAndValue(LocaleController.getString("DoNotTranslate", 2131625539), str, false);
            this.doNotTranslateCell.setClickable(z);
            this.info2.setVisibility(0);
            float[] fArr = new float[2];
            fArr[0] = this.doNotTranslateCell.getAlpha();
            float f = 1.0f;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.doNotTranslateCellAnimation = ofFloat;
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doNotTranslateCellAnimation.addUpdateListener(new LanguageSelectActivity$TranslateSettings$$ExternalSyntheticLambda0(this));
            this.doNotTranslateCellAnimation.addListener(new AnonymousClass1());
            ValueAnimator valueAnimator2 = this.doNotTranslateCellAnimation;
            float alpha = this.doNotTranslateCell.getAlpha();
            if (!z) {
                f = 0.0f;
            }
            valueAnimator2.setDuration(Math.abs(alpha - f) * 200.0f);
            this.doNotTranslateCellAnimation.start();
        }

        public /* synthetic */ void lambda$update$2(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.doNotTranslateCell.setAlpha(floatValue);
            float f = 1.0f - floatValue;
            this.doNotTranslateCell.setTranslationY((-AndroidUtilities.dp(8.0f)) * f);
            this.info.setTranslationY((-this.doNotTranslateCell.getHeight()) * f);
            this.info2.setAlpha(f);
            this.info2.setTranslationY((-this.doNotTranslateCell.getHeight()) * f);
        }

        /* renamed from: org.telegram.ui.LanguageSelectActivity$TranslateSettings$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
                TranslateSettings.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (TranslateSettings.this.doNotTranslateCell.getAlpha() > 0.5d) {
                    TranslateSettings.this.info2.setVisibility(8);
                } else {
                    TranslateSettings.this.info2.setVisibility(0);
                }
            }
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            updateHeight();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            updateHeight();
            super.onLayout(z, i, i2, i3, i4);
        }

        void updateHeight() {
            int i = 0;
            this.header.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.showButtonCheck.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.doNotTranslateCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.info.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.info2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            if (!LanguageSelectActivity.this.searching) {
                i = height();
            }
            if (getLayoutParams() == null) {
                setLayoutParams(new RecyclerView.LayoutParams(-1, i));
            } else if (getLayoutParams().height == i) {
            } else {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = i;
                setLayoutParams(layoutParams);
            }
        }

        int height() {
            return Math.max(AndroidUtilities.dp(40.0f), this.header.getMeasuredHeight()) + Math.max(AndroidUtilities.dp(50.0f), this.showButtonCheck.getMeasuredHeight()) + Math.max(Math.max(AndroidUtilities.dp(50.0f), this.doNotTranslateCell.getMeasuredHeight()), this.info2.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(51.0f) : this.info2.getMeasuredHeight()) + (this.info.getMeasuredHeight() <= 0 ? AndroidUtilities.dp(62.0f) : this.info.getMeasuredHeight());
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            updateHeight();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            update();
            SharedPreferences sharedPreferences = this.preferences;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.listener = anonymousClass2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(anonymousClass2);
            updateHeight();
        }

        /* renamed from: org.telegram.ui.LanguageSelectActivity$TranslateSettings$2 */
        /* loaded from: classes3.dex */
        class AnonymousClass2 implements SharedPreferences.OnSharedPreferenceChangeListener {
            AnonymousClass2() {
                TranslateSettings.this = r1;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                TranslateSettings.this.preferences = sharedPreferences;
                TranslateSettings.this.update();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.preferences.unregisterOnSharedPreferenceChangeListener(this.listener);
        }
    }

    /* loaded from: classes3.dex */
    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private boolean search;

        public ListAdapter(Context context, boolean z) {
            LanguageSelectActivity.this = r1;
            this.mContext = context;
            this.search = z;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.search) {
                if (LanguageSelectActivity.this.searchResult != null) {
                    return LanguageSelectActivity.this.searchResult.size();
                }
                return 0;
            }
            int size = LanguageSelectActivity.this.sortedLanguages.size();
            if (size != 0) {
                size++;
            }
            if (!LanguageSelectActivity.this.unofficialLanguages.isEmpty()) {
                size += LanguageSelectActivity.this.unofficialLanguages.size() + 1;
            }
            return size + 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            TextRadioCell textRadioCell;
            if (i == 0) {
                TextRadioCell textRadioCell2 = new TextRadioCell(this.mContext);
                textRadioCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textRadioCell = textRadioCell2;
            } else {
                if (i == 2) {
                    view = new TranslateSettings(this.mContext);
                } else if (i == 3) {
                    HeaderCell headerCell = new HeaderCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    headerCell.setText(LocaleController.getString("Language", 2131626393));
                    textRadioCell = headerCell;
                } else {
                    view = new ShadowSectionCell(this.mContext);
                }
                return new RecyclerListView.Holder(view);
            }
            view = textRadioCell;
            return new RecyclerListView.Holder(view);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
            if (r12 == (org.telegram.ui.LanguageSelectActivity.this.searchResult.size() - 1)) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
            r12 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
            if (r12 == (org.telegram.ui.LanguageSelectActivity.this.unofficialLanguages.size() - 1)) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
            if (r12 == (org.telegram.ui.LanguageSelectActivity.this.sortedLanguages.size() - 1)) goto L26;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            LocaleController.LocaleInfo localeInfo;
            int itemViewType = viewHolder.getItemViewType();
            boolean z2 = false;
            int i2 = 0;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    TranslateSettings translateSettings = (TranslateSettings) viewHolder.itemView;
                    if (LanguageSelectActivity.this.searching) {
                        i2 = 8;
                    }
                    translateSettings.setVisibility(i2);
                    translateSettings.updateHeight();
                    return;
                }
                if (!this.search) {
                    i--;
                }
                ShadowSectionCell shadowSectionCell = (ShadowSectionCell) viewHolder.itemView;
                if (!LanguageSelectActivity.this.unofficialLanguages.isEmpty() && i == LanguageSelectActivity.this.unofficialLanguages.size()) {
                    shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, 2131165435, "windowBackgroundGrayShadow"));
                    return;
                } else {
                    shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, 2131165436, "windowBackgroundGrayShadow"));
                    return;
                }
            }
            boolean z3 = this.search;
            if (!z3) {
                i -= 2;
            }
            TextRadioCell textRadioCell = (TextRadioCell) viewHolder.itemView;
            if (z3) {
                localeInfo = (LocaleController.LocaleInfo) LanguageSelectActivity.this.searchResult.get(i);
            } else if (LanguageSelectActivity.this.unofficialLanguages.isEmpty() || i < 0 || i >= LanguageSelectActivity.this.unofficialLanguages.size()) {
                if (!LanguageSelectActivity.this.unofficialLanguages.isEmpty()) {
                    i -= LanguageSelectActivity.this.unofficialLanguages.size() + 1;
                }
                localeInfo = (LocaleController.LocaleInfo) LanguageSelectActivity.this.sortedLanguages.get(i);
            } else {
                localeInfo = (LocaleController.LocaleInfo) LanguageSelectActivity.this.unofficialLanguages.get(i);
            }
            if (localeInfo.isLocal()) {
                textRadioCell.setTextAndValueAndCheck(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString("LanguageCustom", 2131626396)), localeInfo.nameEnglish, false, false, !z);
            } else {
                textRadioCell.setTextAndValueAndCheck(localeInfo.name, localeInfo.nameEnglish, false, false, !z);
            }
            if (localeInfo == LocaleController.getInstance().getCurrentLocaleInfo()) {
                z2 = true;
            }
            textRadioCell.setChecked(z2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            boolean z = this.search;
            if (!z) {
                i -= 2;
            }
            if (i == -2) {
                return 2;
            }
            if (i == -1) {
                return 3;
            }
            if (z) {
                return 0;
            }
            return ((LanguageSelectActivity.this.unofficialLanguages.isEmpty() || !(i == LanguageSelectActivity.this.unofficialLanguages.size() || i == (LanguageSelectActivity.this.unofficialLanguages.size() + LanguageSelectActivity.this.sortedLanguages.size()) + 1)) && (!LanguageSelectActivity.this.unofficialLanguages.isEmpty() || i != LanguageSelectActivity.this.sortedLanguages.size())) ? 0 : 1;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LanguageCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "emptyListPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"checkImage"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_addedIcon"));
        return arrayList;
    }
}
