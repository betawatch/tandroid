package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateAlert3;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

/* loaded from: classes5.dex */
public class TranslateAlert3 extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private ButtonWithCounterView button;
    private FrameLayout buttonContainer;
    private ImageView closeView;
    private boolean collapsed;
    private long dialogId;
    private String from_lang;
    private int messageId;
    private boolean noforwards;
    private Utilities.CallbackReturn onLinkPress;
    private Utilities.Callback onUseListener;
    private int requestId;
    private boolean summarized;
    private CharSequence text;
    private String to_lang;
    private int tone;
    private String[] tones;
    private String[] tonesText;
    private CharSequence translated;
    private boolean translatedLoading;

    public TranslateAlert3(Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.tone = 1;
        this.tones = new String[]{"formal", "neutral", "casual"};
        this.tonesText = new String[]{"Formal", "Neutral", "Casual"};
        this.collapsed = true;
        this.requestId = -1;
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeView.setImageResource(R.drawable.ic_close_white);
        ImageView imageView2 = this.closeView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView2.setColorFilter(getThemedColor(i));
        this.closeView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(i), 0.1f)));
        this.actionBar.addView(this.closeView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ScaleStateListAnimator.apply(this.closeView, 0.1f, 1.5f);
        this.closeView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateAlert3.this.lambda$new$0(view);
            }
        });
        String toLanguage = TranslateAlert2.getToLanguage();
        this.to_lang = toLanguage;
        if (toLanguage == null) {
            this.to_lang = TranslateController.currentLanguage();
        }
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        int i2 = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(getThemedColor(i2), 0.0f), getThemedColor(i2), getThemedColor(i2)}));
        ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i3 = createFrame.leftMargin;
        int i4 = this.backgroundPaddingLeft;
        createFrame.leftMargin = i3 + i4;
        createFrame.rightMargin += i4;
        this.buttonContainer.addView(this.button, createFrame);
        this.containerView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i5 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i5, 0, i5, AndroidUtilities.dp(66.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i6) {
                TranslateAlert3.this.lambda$new$1(resourcesProvider, view, i6);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.adapter.update(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        UItem item = this.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        int i2 = item.id;
        if (i2 == 1) {
            CharSequence charSequence = this.translated;
            if (charSequence == null || this.translatedLoading) {
                return;
            }
            AndroidUtilities.addToClipboard(charSequence);
            return;
        }
        if (i2 == 2) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                if (LaunchActivity.getSafeLastFragment() == null) {
                    return;
                }
                new PremiumFeatureBottomSheet(getContext(), 13, true, resourcesProvider).show();
            } else {
                MessagesController.getInstance(this.currentAccount).getTranslateController().toggleTranslatingDialog(this.dialogId);
                lambda$new$0();
            }
        }
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView, org.telegram.ui.ActionBar.BottomSheet
    protected void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        if (valueAnimator != null) {
            this.buttonContainer.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            this.buttonContainer.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected void onActionBarAlpha(float f) {
        float f2 = 1.0f - f;
        this.closeView.setAlpha(f2);
        this.closeView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f2));
        this.closeView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f2));
    }

    public TranslateAlert3 setText(CharSequence charSequence) {
        this.text = charSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(charSequence.toString(), new LanguageDetector.StringCallback() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.LanguageDetector.StringCallback
                public final void run(String str) {
                    TranslateAlert3.this.lambda$setText$2(str);
                }
            }, new LanguageDetector.ExceptionCallback() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda1
                @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
                public final void run(Exception exc) {
                    FileLog.e(exc);
                }
            });
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setText$2(String str) {
        this.from_lang = str;
        this.adapter.update(true);
    }

    public TranslateAlert3 setOnUse(Utilities.Callback callback) {
        this.onUseListener = callback;
        return this;
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return (this.dialogId == 0 || this.messageId == 0 || !this.summarized) ? "Translate" : "Summarize & Translate";
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TranslateAlert3.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onToLangMenu(View view) {
        ItemOptions makeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        makeOptions.setMaxHeight(AndroidUtilities.dp(450.0f));
        makeOptions.setDrawScrim(false);
        makeOptions.setOnTopOfScrim();
        ScrollView scrollView = new ScrollView(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        makeOptions.addView(scrollView);
        final int i = 0;
        while (i < this.tones.length) {
            addChecked(makeOptions, linearLayout, this.tone == i, this.tonesText[i], new Runnable() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateAlert3.this.lambda$onToLangMenu$4(i);
                }
            });
            i++;
        }
        View gapView = new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider);
        gapView.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(this.to_lang)) {
            addChecked(makeOptions, linearLayout, true, TranslateAlert2.capitalFirst(TranslateAlert2.languageName(this.to_lang)), null);
        }
        Iterator<TranslateController.Language> it = suggestedLanguages.iterator();
        while (it.hasNext()) {
            final TranslateController.Language next = it.next();
            if (!TextUtils.equals(next.code, this.to_lang)) {
                addChecked(makeOptions, linearLayout, false, next.displayName, new Runnable() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateAlert3.this.lambda$onToLangMenu$5(next);
                    }
                });
            }
        }
        View gapView2 = new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider);
        gapView2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView2, LayoutHelper.createLinear(-1, 8));
        Iterator<TranslateController.Language> it2 = languages.iterator();
        while (it2.hasNext()) {
            final TranslateController.Language next2 = it2.next();
            addChecked(makeOptions, linearLayout, TextUtils.equals(next2.code, this.to_lang), next2.displayName, new Runnable() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    TranslateAlert3.this.lambda$onToLangMenu$6(next2);
                }
            });
        }
        makeOptions.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onToLangMenu$4(int i) {
        cancelRequest();
        this.tone = i;
        TranslateAlert2.setToLanguage(this.to_lang);
        requestTranslate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onToLangMenu$5(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        requestTranslate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onToLangMenu$6(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        requestTranslate();
    }

    private void addChecked(final ItemOptions itemOptions, LinearLayout linearLayout, final boolean z, CharSequence charSequence, final Runnable runnable) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(charSequence);
        actionBarMenuSubItem.setChecked(z);
        actionBarMenuSubItem.setColors(Theme.getColor(i, this.resourcesProvider), Theme.getColor(i2, this.resourcesProvider));
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.12f));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateAlert3.lambda$addChecked$7(ItemOptions.this, z, runnable, view);
            }
        });
        linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addChecked$7(ItemOptions itemOptions, boolean z, Runnable runnable, View view) {
        itemOptions.dismiss();
        if (z || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLinkPressed(ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        Utilities.CallbackReturn callbackReturn = this.onLinkPress;
        if (callbackReturn != null && (clickableSpan instanceof URLSpan) && ((Boolean) callbackReturn.run((URLSpan) clickableSpan)).booleanValue()) {
            return;
        }
        clickableSpan.onClick(this.containerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItems(ArrayList arrayList, final UniversalAdapter universalAdapter) {
        String str;
        arrayList.add(UItem.asShadow(null));
        universalAdapter.itemsOffset = 1;
        universalAdapter.whiteSectionStart();
        String str2 = this.from_lang;
        arrayList.add(Header.Factory.of(3, "", str2 != null ? TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str2)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
        arrayList.add(Text.Factory.of(4, this.text, this.collapsed, this.noforwards, new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateAlert3.this.lambda$fillItems$8(universalAdapter, view);
            }
        }, new LinkSpanDrawable.LinksTextView.OnLinkPress() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.Components.LinkSpanDrawable.LinksTextView.OnLinkPress
            public final void run(ClickableSpan clickableSpan) {
                TranslateAlert3.this.onLinkPressed(clickableSpan);
            }
        }, null));
        StringBuilder sb = new StringBuilder();
        sb.append(TranslateAlert2.languageName(this.to_lang));
        if (this.tone == 1 || this.tonesText == null) {
            str = "";
        } else {
            str = " (" + this.tonesText[this.tone] + ")";
        }
        sb.append(str);
        arrayList.add(Header.Factory.of(5, "", TranslateAlert2.capitalFirst(sb.toString()), null, new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslateAlert3.this.onToLangMenu(view);
            }
        }));
        arrayList.add(Text.Factory.of(6, this.translated, false, this.noforwards, null, new LinkSpanDrawable.LinksTextView.OnLinkPress() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.Components.LinkSpanDrawable.LinksTextView.OnLinkPress
            public final void run(ClickableSpan clickableSpan) {
                TranslateAlert3.this.onLinkPressed(clickableSpan);
            }
        }, null));
        universalAdapter.whiteSectionEnd();
        arrayList.add(UItem.asShadow(null));
        universalAdapter.whiteSectionStart();
        if (!this.noforwards) {
            arrayList.add(UItem.asButton(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
        }
        if (this.dialogId != 0 && !MessagesController.getInstance(this.currentAccount).getTranslateController().isTranslatingDialog(this.dialogId)) {
            arrayList.add(UItem.asButton(2, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateEntireChat)));
        }
        universalAdapter.whiteSectionEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillItems$8(UniversalAdapter universalAdapter, View view) {
        this.collapsed = false;
        saveScrollPosition();
        universalAdapter.update(true);
        applyScrolledPosition(true);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        super.show();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        this.adapter.update(false);
        requestTranslate();
        if (this.onUseListener != null) {
            this.button.setText("Use This Translation");
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateAlert3.this.lambda$show$9(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$9(View view) {
        CharSequence charSequence = this.translated;
        if (charSequence != null) {
            this.onUseListener.run(charSequence);
        }
        lambda$new$0();
    }

    private void requestTranslate() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.text};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.onUseListener != null) {
            this.button.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new LoadingSpan(null, AndroidUtilities.dp(120.0f), 0), 0, spannableStringBuilder.length(), 33);
        this.translated = spannableStringBuilder;
        this.translatedLoading = true;
        if (this.summarized && this.dialogId != 0 && this.messageId != 0) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = this.to_lang;
            tL_messages_summarizeText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_messages_summarizeText.id = this.messageId;
            int i = this.tone;
            if (i != 1) {
                tL_messages_summarizeText.flags |= 4;
                tL_messages_summarizeText.tone = this.tones[i];
            }
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda9
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TranslateAlert3.this.lambda$requestTranslate$11((TLRPC.TL_textWithEntities) obj, (TLRPC.TL_error) obj2);
                }
            });
        } else {
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.to_lang = this.to_lang;
            if (this.dialogId != 0 && this.messageId != 0) {
                tL_messages_translateText.flags |= 1;
                tL_messages_translateText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_messages_translateText.id.add(Integer.valueOf(this.messageId));
            } else {
                tL_messages_translateText.flags |= 2;
                tL_messages_translateText.text.add(tL_textWithEntities);
            }
            int i2 = this.tone;
            if (i2 != 1) {
                tL_messages_translateText.flags |= 4;
                tL_messages_translateText.tone = this.tones[i2];
            }
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda10
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TranslateAlert3.this.lambda$requestTranslate$14((TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
        this.adapter.update(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTranslate$11(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.button.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).showForError(tL_error);
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateAlert3.this.lambda$requestTranslate$10(view);
                }
            });
        } else {
            this.translated = MessageObject.formatTextWithEntities(tL_textWithEntities);
            this.translatedLoading = false;
            this.adapter.update(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTranslate$10(View view) {
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTranslate$14(TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.button.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).showForError(tL_error);
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateAlert3.this.lambda$requestTranslate$12(view);
                }
            });
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.TranslateAlert3$$ExternalSyntheticLambda15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateAlert3.this.lambda$requestTranslate$13(view);
                }
            });
        } else {
            this.translated = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            this.translatedLoading = false;
            this.adapter.update(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTranslate$12(View view) {
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTranslate$13(View view) {
        lambda$new$0();
    }

    private void cancelRequest() {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
    }

    public static class Header extends FrameLayout implements Theme.Colorable {
        public final CheckBox2 emojifyCheckbox;
        public final LinearLayout emojifyContainer;
        public final TextView emojifyTextView;
        public final ImageView imageView;
        public final LinearLayout layout1;
        public final LinearLayout layout2;
        private final Theme.ResourcesProvider resourcesProvider;
        public final TextView text1View;
        public final TextView text2View;
        public final TextView text3View;

        public Header(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setClipToPadding(false);
            setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout1 = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 19));
            TextView textView = new TextView(context);
            this.text1View = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_EXTRA_BOLD));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.layout2 = linearLayout2;
            linearLayout2.setOrientation(0);
            linearLayout2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
            ScaleStateListAnimator.apply(linearLayout2);
            linearLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.text2View = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_EXTRA_BOLD));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            linearLayout2.addView(imageView, LayoutHelper.createLinear(16, 16, 19, 1, 0, 0, 0));
            imageView.setTranslationY(AndroidUtilities.dp(1.0f));
            TextView textView3 = new TextView(context);
            this.text3View = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_EXTRA_BOLD));
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 19, -6, 0, 0, 0));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.emojifyContainer = linearLayout3;
            linearLayout3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            linearLayout3.setClipToPadding(false);
            linearLayout3.setOrientation(0);
            CheckBox2 checkBox2 = new CheckBox2(context, 20, resourcesProvider);
            this.emojifyCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(true);
            checkBox2.setChecked(false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout3.addView(checkBox2, LayoutHelper.createLinear(22, 22, 16, 0, 0, 0, 0));
            TextView textView4 = new TextView(context);
            this.emojifyTextView = textView4;
            textView4.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView4.setTextSize(1, 14.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
            linearLayout3.addView(textView4, LayoutHelper.createLinear(-2, -2, 16, 3, -1, 2, 0));
            addView(linearLayout3, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
            ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
            updateColors();
        }

        @Override // org.telegram.ui.ActionBar.Theme.Colorable
        public void updateColors() {
            TextView textView = this.text1View;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            TextView textView2 = this.text2View;
            int i2 = Theme.key_windowBackgroundWhiteBlueHeader;
            textView2.setTextColor(Theme.getColor(i2, this.resourcesProvider));
            this.text3View.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            LinearLayout linearLayout = this.layout2;
            linearLayout.setBackground(linearLayout.isClickable() ? Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i2), 0.1f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)) : null);
            if (this.layout2.isClickable()) {
                ScaleStateListAnimator.apply(this.layout2);
            } else {
                ScaleStateListAnimator.reset(this.layout2);
            }
            this.emojifyContainer.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 24, 24));
        }

        public void set(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2) {
            this.text1View.setText(charSequence);
            this.text2View.setText(charSequence2);
            this.text3View.setText(charSequence3);
            this.imageView.setVisibility(onClickListener != null ? 0 : 8);
            this.layout2.setOnClickListener(onClickListener);
            this.layout2.setClickable(onClickListener != null);
            this.emojifyCheckbox.setChecked(z, false);
            this.emojifyContainer.setVisibility(onClickListener2 != null ? 0 : 8);
            this.emojifyContainer.setOnClickListener(onClickListener2);
            updateColors();
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean isClickable() {
                return false;
            }

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public Header createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Header(context, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((Header) view).set(uItem.text, uItem.subtext, uItem.textValue, uItem.clickCallback, uItem.checked, uItem.clickCallback2);
            }

            public static UItem of(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener) {
                return of(i, charSequence, charSequence2, charSequence3, onClickListener, false, null);
            }

            public static UItem of(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.text = charSequence;
                ofFactory.subtext = charSequence2;
                ofFactory.textValue = charSequence3;
                ofFactory.clickCallback = onClickListener;
                ofFactory.checked = z;
                ofFactory.clickCallback2 = onClickListener2;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return TextUtils.equals(uItem.text, uItem2.text) && TextUtils.equals(uItem.subtext, uItem2.subtext) && TextUtils.equals(uItem.textValue, uItem2.textValue) && uItem.clickCallback2 == uItem2.clickCallback2;
            }
        }
    }

    public static class Text extends FrameLayout implements Theme.Colorable {
        private final AnimatedFloat animatedClipHeight;
        private int clipHeight;
        public boolean collapsed;
        public final ImageView copyButton;
        public TextView moreView;
        public boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        public SpoilersTextView shortTextView;
        public SpoilersTextView textView;
        private FrameLayout.LayoutParams textViewLayoutParams;

        public Text(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.clipHeight = -1;
            this.animatedClipHeight = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.resourcesProvider = resourcesProvider;
            setClipToPadding(false);
            setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context) { // from class: org.telegram.ui.Components.TranslateAlert3.Text.1
                private GradientClip clip = new GradientClip();

                @Override // org.telegram.ui.Components.spoilers.SpoilersTextView, android.widget.TextView, android.view.View
                protected void onDraw(Canvas canvas) {
                    int width = Text.this.moreView.getWidth() + AndroidUtilities.dp(8.0f);
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, (getScrollX() + getWidth()) - width, getHeight(), NotificationCenter.invalidateMotionBackground, 31);
                    super.onDraw(canvas);
                    canvas.save();
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                    SquigglyLinesSpan.drawOnText(canvas, getLayout());
                    canvas.restore();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getWidth() - width) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - width, getHeight());
                    this.clip.draw(canvas, rectF, 2, 1.0f);
                    canvas.restore();
                }
            };
            this.shortTextView = spoilersTextView;
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            this.shortTextView.setTextSize(1, 16.0f);
            this.shortTextView.setMaxLines(1);
            this.shortTextView.setSingleLine();
            this.shortTextView.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.shortTextView, LayoutHelper.createFrame(-1, -2.0f));
            TextView textView = new TextView(context);
            this.moreView = textView;
            textView.setText(LocaleController.getString(R.string.DescriptionMore));
            this.moreView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.moreView.setGravity(17);
            ScaleStateListAnimator.apply(this.moreView);
            addView(this.moreView, LayoutHelper.createFrame(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
            SpoilersTextView spoilersTextView2 = new SpoilersTextView(context) { // from class: org.telegram.ui.Components.TranslateAlert3.Text.2
                @Override // org.telegram.ui.Components.spoilers.SpoilersTextView, android.widget.TextView, android.view.View
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    canvas.save();
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                    SquigglyLinesSpan.drawOnText(canvas, getLayout());
                    canvas.restore();
                }
            };
            this.textView = spoilersTextView2;
            NotificationCenter.listenEmojiLoading(spoilersTextView2);
            this.textView.setTextSize(1, 16.0f);
            this.textView.setTextIsSelectable(true);
            View view = this.textView;
            FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, -2.0f);
            this.textViewLayoutParams = createFrame;
            addView(view, createFrame);
            ImageView imageView = new ImageView(context);
            this.copyButton = imageView;
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            ScaleStateListAnimator.apply(imageView);
            addView(imageView, LayoutHelper.createFrame(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
            imageView.setVisibility(8);
            updateColors();
        }

        @Override // org.telegram.ui.ActionBar.Theme.Colorable
        public void updateColors() {
            SpoilersTextView spoilersTextView = this.shortTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            spoilersTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            TextView textView = this.moreView;
            int i2 = Theme.key_windowBackgroundWhiteBlueHeader;
            textView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
            this.moreView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), Theme.multAlpha(Theme.getColor(i2, this.resourcesProvider), 0.1f)));
            this.textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView.setLinkTextColor(Theme.getColor(i2, this.resourcesProvider));
            this.textView.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
            setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, this.resourcesProvider));
            ImageView imageView = this.copyButton;
            int i3 = Theme.key_featuredStickers_addButton;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.copyButton.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(i3, this.resourcesProvider), 0.1f)));
        }

        public void setHandlesColor(int i) {
            Drawable textSelectHandleLeft;
            Drawable textSelectHandle;
            Drawable textSelectHandleRight;
            if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
                return;
            }
            try {
                textSelectHandleLeft = this.textView.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i, mode);
                this.textView.setTextSelectHandleLeft(textSelectHandleLeft);
                textSelectHandle = this.textView.getTextSelectHandle();
                textSelectHandle.setColorFilter(i, mode);
                this.textView.setTextSelectHandle(textSelectHandle);
                textSelectHandleRight = this.textView.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i, mode);
                this.textView.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }

        public void set(CharSequence charSequence, boolean z, View.OnClickListener onClickListener, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, boolean z2, View.OnClickListener onClickListener2, boolean z3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : AnimatedEmojiSpan.cloneSpans(charSequence));
            LoadingSpan[] loadingSpanArr = (LoadingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), LoadingSpan.class);
            if (loadingSpanArr != null) {
                for (int i = 0; i < loadingSpanArr.length; i++) {
                    int spanStart = spannableStringBuilder.getSpanStart(loadingSpanArr[i]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(loadingSpanArr[i]);
                    spannableStringBuilder.removeSpan(loadingSpanArr[i]);
                    SpoilersTextView spoilersTextView = this.textView;
                    LoadingSpan loadingSpan = loadingSpanArr[i];
                    spannableStringBuilder.setSpan(new LoadingSpan(spoilersTextView, loadingSpan.size, loadingSpan.yOffset).setHeight(loadingSpanArr[i].height).setAlpha(loadingSpanArr[i].alpha).setFullWidth(loadingSpanArr[i].fullWidth), spanStart, spanEnd, 33);
                }
            }
            if (this.collapsed && !z) {
                this.shortTextView.setVisibility(0);
                this.textView.setVisibility(0);
                ViewPropertyAnimator withEndAction = this.shortTextView.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.TranslateAlert3$Text$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslateAlert3.Text.this.lambda$set$0();
                    }
                });
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                withEndAction.setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
                this.textView.animate().alpha(1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
            } else {
                this.shortTextView.setVisibility(z ? 0 : 8);
                this.textView.setVisibility(!z ? 0 : 8);
            }
            this.collapsed = z;
            this.moreView.setVisibility(z ? 0 : 8);
            this.moreView.setOnClickListener(onClickListener);
            setClipChildren(z);
            this.shortTextView.setText(spannableStringBuilder);
            this.textView.setText(spannableStringBuilder);
            this.textView.setTextIsSelectable(!z2 && (loadingSpanArr == null || loadingSpanArr.length == 0));
            this.textView.setOnLinkPressListener(onLinkPress);
            this.copyButton.setVisibility(onClickListener2 == null ? 8 : 0);
            this.copyButton.setOnClickListener(onClickListener2);
            this.needDivider = z3;
            setWillNotDraw(!z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$set$0() {
            this.shortTextView.setVisibility(8);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                SpoilersTextView spoilersTextView = this.collapsed ? this.shortTextView : this.textView;
                if (LocaleController.isRTL) {
                    canvas.drawRect(0.0f, getMeasuredHeight() - 1, spoilersTextView.getRight(), getMeasuredHeight(), Theme.dividerPaint);
                } else {
                    canvas.drawRect(spoilersTextView.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), this.animatedClipHeight.set(this.clipHeight));
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        private boolean needsBottomMargin() {
            if (this.copyButton.getVisibility() != 0) {
                return false;
            }
            Layout layout = this.textView.getLayout();
            return layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > ((float) (layout.getWidth() - AndroidUtilities.dp(42.0f)));
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            this.clipHeight = getMeasuredHeight();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
            this.textViewLayoutParams.bottomMargin = 0;
            super.onMeasure(makeMeasureSpec, i2);
            if (needsBottomMargin()) {
                this.textViewLayoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i2);
            }
            if (getMeasuredHeight() > this.clipHeight && !this.collapsed) {
                this.clipHeight = getMeasuredHeight();
                invalidate();
            } else {
                AnimatedFloat animatedFloat = this.animatedClipHeight;
                int measuredHeight = getMeasuredHeight();
                this.clipHeight = measuredHeight;
                animatedFloat.force(measuredHeight);
            }
        }

        public static class Factory extends UItem.UItemFactory {
            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean isClickable() {
                return false;
            }

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public Text createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Text(context, resourcesProvider);
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Text text = (Text) view;
                CharSequence charSequence = uItem.text;
                boolean z2 = uItem.collapsed;
                View.OnClickListener onClickListener = uItem.clickCallback;
                Object obj = uItem.object;
                text.set(charSequence, z2, onClickListener, obj != null ? (LinkSpanDrawable.LinksTextView.OnLinkPress) obj : null, uItem.locked, uItem.clickCallback2, z);
            }

            public static UItem of(int i, CharSequence charSequence, boolean z, boolean z2, View.OnClickListener onClickListener, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, View.OnClickListener onClickListener2) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.text = charSequence;
                ofFactory.collapsed = z;
                ofFactory.locked = z2;
                ofFactory.clickCallback = onClickListener;
                ofFactory.object = onLinkPress;
                ofFactory.clickCallback2 = onClickListener2;
                return ofFactory;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override // org.telegram.ui.Components.UItem.UItemFactory
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return TextUtils.equals(uItem.text, uItem2.text) && uItem.collapsed == uItem2.collapsed;
            }
        }
    }
}
