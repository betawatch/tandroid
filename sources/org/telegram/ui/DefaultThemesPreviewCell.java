package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThemeSmallPreviewView;
import org.telegram.ui.DefaultThemesPreviewCell;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public class DefaultThemesPreviewCell extends LinearLayout {
    private final ChatThemeBottomSheet.Adapter adapter;
    TextCell browseThemesCell;
    int currentType;
    RLottieDrawable darkThemeDrawable;
    TextCell dayNightCell;
    private LinearLayoutManager layoutManager;
    private ValueAnimator navBarAnimator;
    private int navBarColor;
    BaseFragment parentFragment;
    private final FlickerLoadingView progressView;
    private final RecyclerListView recyclerView;
    private int selectedPosition;
    int themeIndex;
    private Boolean wasPortrait;

    public DefaultThemesPreviewCell(Context context, final BaseFragment baseFragment, int i) {
        super(context);
        LinearLayoutManager linearLayoutManager;
        this.layoutManager = null;
        this.selectedPosition = -1;
        this.wasPortrait = null;
        this.currentType = i;
        this.parentFragment = baseFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
        int currentAccount = baseFragment.getCurrentAccount();
        int i2 = this.currentType;
        ChatThemeBottomSheet.Adapter adapter = new ChatThemeBottomSheet.Adapter(currentAccount, null, (i2 == 0 || i2 == -1) ? 0 : 1);
        this.adapter = adapter;
        RecyclerListView recyclerListView = new RecyclerListView(getContext()) { // from class: org.telegram.ui.DefaultThemesPreviewCell.1
            @Override // org.telegram.ui.Components.RecyclerListView
            public Integer getSelectorColor(int i3) {
                return 0;
            }
        };
        this.recyclerView = recyclerListView;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setSelectorDrawableColor(0);
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setHasFixedSize(true);
        recyclerListView.setItemAnimator(null);
        recyclerListView.setNestedScrollingEnabled(false);
        updateLayoutManager();
        recyclerListView.setFocusable(false);
        recyclerListView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.DefaultThemesPreviewCell$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i3) {
                DefaultThemesPreviewCell.this.lambda$new$0(baseFragment, view, i3);
            }
        });
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), null);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(14);
        flickerLoadingView.setVisibility(0);
        int i3 = this.currentType;
        if (i3 == 0 || i3 == -1) {
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        recyclerListView.setEmptyView(flickerLoadingView);
        recyclerListView.setAnimateEmptyView(true, 0);
        if (this.currentType == 0) {
            int i4 = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, "" + i4, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.darkThemeDrawable = rLottieDrawable;
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            this.darkThemeDrawable.beginApplyLayerColors();
            this.darkThemeDrawable.commitApplyLayerColors();
            TextCell textCell = new TextCell(context);
            this.dayNightCell = textCell;
            textCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            TextCell textCell2 = this.dayNightCell;
            textCell2.imageLeft = 21;
            addView(textCell2, LayoutHelper.createFrame(-1, -2.0f));
            TextCell textCell3 = new TextCell(context);
            this.browseThemesCell = textCell3;
            textCell3.setTextAndIcon((CharSequence) LocaleController.getString("SettingsBrowseThemes", R.string.SettingsBrowseThemes), R.drawable.msg_colors, false);
            addView(this.browseThemesCell, LayoutHelper.createFrame(-1, -2.0f));
            this.dayNightCell.setOnClickListener(new 2(context, baseFragment));
            this.darkThemeDrawable.setPlayInDirectionOfCustomEndFrame(true);
            this.browseThemesCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.DefaultThemesPreviewCell$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultThemesPreviewCell.lambda$new$1(BaseFragment.this, view);
                }
            });
            if (!Theme.isCurrentThemeDay()) {
                RLottieDrawable rLottieDrawable2 = this.darkThemeDrawable;
                rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount() - 1);
                this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString("SettingsSwitchToDayMode", R.string.SettingsSwitchToDayMode), (Drawable) this.darkThemeDrawable, true);
            } else {
                this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString("SettingsSwitchToNightMode", R.string.SettingsSwitchToNightMode), (Drawable) this.darkThemeDrawable, true);
            }
        }
        if (!MediaDataController.getInstance(baseFragment.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(baseFragment.getCurrentAccount()).defaultEmojiThemes);
            if (this.currentType == 0) {
                EmojiThemes createPreviewCustom = EmojiThemes.createPreviewCustom(baseFragment.getCurrentAccount());
                createPreviewCustom.loadPreviewColors(baseFragment.getCurrentAccount());
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(createPreviewCustom);
                chatThemeItem.themeIndex = Theme.isCurrentThemeDay() ? 0 : 2;
                arrayList.add(chatThemeItem);
            }
            adapter.setItems(arrayList);
        }
        updateDayNightMode();
        updateSelectedPosition();
        updateColors();
        int i5 = this.selectedPosition;
        if (i5 < 0 || (linearLayoutManager = this.layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i5, AndroidUtilities.dp(16.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(BaseFragment baseFragment, View view, int i) {
        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = this.adapter.items.get(i);
        Theme.ThemeInfo themeInfo = chatThemeItem.chatTheme.getThemeInfo(this.themeIndex);
        int accentId = (chatThemeItem.chatTheme.getEmoticon().equals("🏠") || chatThemeItem.chatTheme.getEmoticon().equals("🎨")) ? chatThemeItem.chatTheme.getAccentId(this.themeIndex) : -1;
        if (themeInfo == null) {
            TLRPC$TL_theme tlTheme = chatThemeItem.chatTheme.getTlTheme(this.themeIndex);
            Theme.ThemeInfo theme = Theme.getTheme(Theme.getBaseThemeKey(tlTheme.settings.get(chatThemeItem.chatTheme.getSettingsIndex(this.themeIndex))));
            if (theme != null) {
                Theme.ThemeAccent themeAccent = theme.accentsByThemeId.get(tlTheme.id);
                if (themeAccent == null) {
                    themeAccent = theme.createNewAccent(tlTheme, baseFragment.getCurrentAccount());
                }
                accentId = themeAccent.id;
                theme.setCurrentAccentId(accentId);
            }
            themeInfo = theme;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, Integer.valueOf(accentId));
        this.selectedPosition = i;
        int i2 = 0;
        while (i2 < this.adapter.items.size()) {
            this.adapter.items.get(i2).isSelected = i2 == this.selectedPosition;
            i2++;
        }
        this.adapter.setSelectedItem(this.selectedPosition);
        for (int i3 = 0; i3 < this.recyclerView.getChildCount(); i3++) {
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i3);
            if (themeSmallPreviewView != view) {
                themeSmallPreviewView.cancelAnimation();
            }
        }
        ((ThemeSmallPreviewView) view).playEmojiAnimation();
        if (themeInfo != null) {
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString((this.currentType == 1 || themeInfo.isDark()) ? "lastDarkTheme" : "lastDayTheme", themeInfo.getKey());
            edit.commit();
        }
        Theme.turnOffAutoNight(baseFragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 2 implements View.OnClickListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ BaseFragment val$parentFragment;

        2(Context context, BaseFragment baseFragment) {
            this.val$context = context;
            this.val$parentFragment = baseFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
        @Override // android.view.View.OnClickListener
        @SuppressLint({"NotifyDataSetChanged"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onClick(View view) {
            final boolean z;
            Theme.ThemeInfo theme;
            if (DrawerProfileCell.switchingTheme) {
                return;
            }
            final int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4);
            final int color2 = Theme.getColor(Theme.key_windowBackgroundGray);
            DrawerProfileCell.switchingTheme = true;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            string = (Theme.getTheme(string) == null || Theme.getTheme(string).isDark()) ? "Blue" : "Blue";
            String str2 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            string2 = (Theme.getTheme(string2) == null || !Theme.getTheme(string2).isDark()) ? "Dark Blue" : "Dark Blue";
            Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
            if (!string.equals(string2)) {
                str2 = string2;
            } else if (activeTheme.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                str2 = string2;
                z = !Theme.isCurrentThemeDark();
                if (!z) {
                    theme = Theme.getTheme(str2);
                } else {
                    theme = Theme.getTheme(str);
                }
                Theme.ThemeInfo themeInfo = theme;
                RLottieDrawable rLottieDrawable = DefaultThemesPreviewCell.this.darkThemeDrawable;
                rLottieDrawable.setCustomEndFrame(!z ? rLottieDrawable.getFramesCount() - 1 : 0);
                DefaultThemesPreviewCell.this.dayNightCell.getImageView().playAnimation();
                DefaultThemesPreviewCell.this.dayNightCell.getImageView().getLocationInWindow(r11);
                int[] iArr = {iArr[0] + (DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredWidth() / 2), iArr[1] + (DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredHeight() / 2) + AndroidUtilities.dp(3.0f)};
                final Context context = this.val$context;
                final BaseFragment baseFragment = this.val$parentFragment;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), DefaultThemesPreviewCell.this.dayNightCell.getImageView(), DefaultThemesPreviewCell.this.dayNightCell, new Runnable() { // from class: org.telegram.ui.DefaultThemesPreviewCell$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultThemesPreviewCell.2.this.lambda$onClick$0(color, context, color2, z, baseFragment);
                    }
                });
            }
            str = string;
            z = !Theme.isCurrentThemeDark();
            if (!z) {
            }
            Theme.ThemeInfo themeInfo2 = theme;
            RLottieDrawable rLottieDrawable2 = DefaultThemesPreviewCell.this.darkThemeDrawable;
            rLottieDrawable2.setCustomEndFrame(!z ? rLottieDrawable2.getFramesCount() - 1 : 0);
            DefaultThemesPreviewCell.this.dayNightCell.getImageView().playAnimation();
            DefaultThemesPreviewCell.this.dayNightCell.getImageView().getLocationInWindow(iArr);
            int[] iArr2 = {iArr2[0] + (DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredWidth() / 2), iArr2[1] + (DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredHeight() / 2) + AndroidUtilities.dp(3.0f)};
            final Context context2 = this.val$context;
            final BaseFragment baseFragment2 = this.val$parentFragment;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo2, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z), DefaultThemesPreviewCell.this.dayNightCell.getImageView(), DefaultThemesPreviewCell.this.dayNightCell, new Runnable() { // from class: org.telegram.ui.DefaultThemesPreviewCell$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultThemesPreviewCell.2.this.lambda$onClick$0(color, context2, color2, z, baseFragment2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$0(final int i, Context context, int i2, boolean z, BaseFragment baseFragment) {
            DefaultThemesPreviewCell.this.updateDayNightMode();
            DefaultThemesPreviewCell.this.updateSelectedPosition();
            final int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4);
            DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.DefaultThemesPreviewCell.2.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(i, color, ((Float) valueAnimator.getAnimatedValue()).floatValue()), PorterDuff.Mode.SRC_IN));
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.DefaultThemesPreviewCell.2.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.setDuration(350L);
            ofFloat.start();
            final int color2 = Theme.getColor(Theme.key_windowBackgroundGray);
            final Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
            if (window != null) {
                if (DefaultThemesPreviewCell.this.navBarAnimator != null && DefaultThemesPreviewCell.this.navBarAnimator.isRunning()) {
                    DefaultThemesPreviewCell.this.navBarAnimator.cancel();
                }
                final int i3 = (DefaultThemesPreviewCell.this.navBarAnimator == null || !DefaultThemesPreviewCell.this.navBarAnimator.isRunning()) ? i2 : DefaultThemesPreviewCell.this.navBarColor;
                DefaultThemesPreviewCell.this.navBarAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f = z ? 50.0f : 200.0f;
                DefaultThemesPreviewCell.this.navBarAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.DefaultThemesPreviewCell.2.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DefaultThemesPreviewCell.this.navBarColor = ColorUtils.blendARGB(i3, color2, Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * r2) - f) / r4)));
                        AndroidUtilities.setNavigationBarColor(window, DefaultThemesPreviewCell.this.navBarColor, false);
                        AndroidUtilities.setLightNavigationBar(window, AndroidUtilities.computePerceivedBrightness(DefaultThemesPreviewCell.this.navBarColor) >= 0.721f);
                    }
                });
                DefaultThemesPreviewCell.this.navBarAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.DefaultThemesPreviewCell.2.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        AndroidUtilities.setNavigationBarColor(window, color2, false);
                        AndroidUtilities.setLightNavigationBar(window, AndroidUtilities.computePerceivedBrightness(color2) >= 0.721f);
                    }
                });
                DefaultThemesPreviewCell.this.navBarAnimator.setDuration(350L);
                DefaultThemesPreviewCell.this.navBarAnimator.start();
            }
            if (Theme.isCurrentThemeDay()) {
                DefaultThemesPreviewCell.this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString("SettingsSwitchToNightMode", R.string.SettingsSwitchToNightMode), (Drawable) DefaultThemesPreviewCell.this.darkThemeDrawable, true);
            } else {
                DefaultThemesPreviewCell.this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString("SettingsSwitchToDayMode", R.string.SettingsSwitchToDayMode), (Drawable) DefaultThemesPreviewCell.this.darkThemeDrawable, true);
            }
            Theme.turnOffAutoNight(baseFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(BaseFragment baseFragment, View view) {
        baseFragment.presentFragment(new ThemeActivity(3));
    }

    public void updateLayoutManager() {
        Point point = AndroidUtilities.displaySize;
        boolean z = point.y > point.x;
        Boolean bool = this.wasPortrait;
        if (bool == null || bool.booleanValue() != z) {
            int i = this.currentType;
            if (i == 0 || i == -1) {
                if (this.layoutManager == null) {
                    RecyclerListView recyclerListView = this.recyclerView;
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
                    this.layoutManager = linearLayoutManager;
                    recyclerListView.setLayoutManager(linearLayoutManager);
                }
            } else {
                int i2 = z ? 3 : 9;
                LinearLayoutManager linearLayoutManager2 = this.layoutManager;
                if (linearLayoutManager2 instanceof GridLayoutManager) {
                    ((GridLayoutManager) linearLayoutManager2).setSpanCount(i2);
                } else {
                    this.recyclerView.setHasFixedSize(false);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i2);
                    gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.DefaultThemesPreviewCell.3
                        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                        public int getSpanSize(int i3) {
                            return 1;
                        }
                    });
                    RecyclerListView recyclerListView2 = this.recyclerView;
                    this.layoutManager = gridLayoutManager;
                    recyclerListView2.setLayoutManager(gridLayoutManager);
                }
            }
            this.wasPortrait = Boolean.valueOf(z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        updateLayoutManager();
        super.onMeasure(i, i2);
    }

    public void updateDayNightMode() {
        int i;
        int i2;
        int i3 = this.currentType;
        if (i3 == 0 || i3 == -1) {
            this.themeIndex = Theme.isCurrentThemeDay() ? 0 : 2;
        } else if (Theme.getActiveTheme().getKey().equals("Blue")) {
            this.themeIndex = 0;
        } else if (Theme.getActiveTheme().getKey().equals("Day")) {
            this.themeIndex = 1;
        } else if (Theme.getActiveTheme().getKey().equals("Night")) {
            this.themeIndex = 2;
        } else if (Theme.getActiveTheme().getKey().equals("Dark Blue")) {
            this.themeIndex = 3;
        } else {
            if (Theme.isCurrentThemeDay() && ((i2 = this.themeIndex) == 2 || i2 == 3)) {
                this.themeIndex = 0;
            }
            if (!Theme.isCurrentThemeDay() && ((i = this.themeIndex) == 0 || i == 1)) {
                this.themeIndex = 2;
            }
        }
        if (this.adapter.items != null) {
            for (int i4 = 0; i4 < this.adapter.items.size(); i4++) {
                this.adapter.items.get(i4).themeIndex = this.themeIndex;
            }
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            adapter.notifyItemRangeChanged(0, adapter.items.size());
        }
        updateSelectedPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectedPosition() {
        if (this.adapter.items == null) {
            return;
        }
        this.selectedPosition = -1;
        int i = 0;
        while (true) {
            if (i >= this.adapter.items.size()) {
                break;
            }
            TLRPC$TL_theme tlTheme = this.adapter.items.get(i).chatTheme.getTlTheme(this.themeIndex);
            Theme.ThemeInfo themeInfo = this.adapter.items.get(i).chatTheme.getThemeInfo(this.themeIndex);
            if (tlTheme != null) {
                if (!Theme.getActiveTheme().name.equals(Theme.getBaseThemeKey(tlTheme.settings.get(this.adapter.items.get(i).chatTheme.getSettingsIndex(this.themeIndex))))) {
                    continue;
                } else if (Theme.getActiveTheme().accentsByThemeId == null) {
                    this.selectedPosition = i;
                    break;
                } else {
                    Theme.ThemeAccent themeAccent = Theme.getActiveTheme().accentsByThemeId.get(tlTheme.id);
                    if (themeAccent != null && themeAccent.id == Theme.getActiveTheme().currentAccentId) {
                        this.selectedPosition = i;
                        break;
                    }
                }
                i++;
            } else {
                if (themeInfo != null) {
                    if (Theme.getActiveTheme().name.equals(themeInfo.getKey()) && this.adapter.items.get(i).chatTheme.getAccentId(this.themeIndex) == Theme.getActiveTheme().currentAccentId) {
                        this.selectedPosition = i;
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        if (this.selectedPosition == -1 && this.currentType != 3) {
            this.selectedPosition = this.adapter.items.size() - 1;
        }
        int i2 = 0;
        while (i2 < this.adapter.items.size()) {
            this.adapter.items.get(i2).isSelected = i2 == this.selectedPosition;
            i2++;
        }
        this.adapter.setSelectedItem(this.selectedPosition);
    }

    public void updateColors() {
        int i = this.currentType;
        if (i == 0 || i == -1) {
            RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4), PorterDuff.Mode.SRC_IN));
            }
            TextCell textCell = this.dayNightCell;
            if (textCell != null) {
                Theme.setSelectorDrawableColor(textCell.getBackground(), Theme.getColor(Theme.key_listSelector), true);
                this.dayNightCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
            }
            TextCell textCell2 = this.browseThemesCell;
            if (textCell2 != null) {
                textCell2.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(Theme.key_windowBackgroundWhite), Theme.getColor(Theme.key_listSelector)));
                TextCell textCell3 = this.browseThemesCell;
                int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                textCell3.setColors(i2, i2);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
    }
}
