package org.telegram.ui.Components.blur3.drawable.color.impl;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;

/* loaded from: classes5.dex */
public abstract class BlurredBackgroundProviderImpl {
    public static /* synthetic */ int $r8$lambda$AxD0EE9eDsEVUvzZv7iGt71hrAg(Theme.ResourcesProvider resourcesProvider, boolean z) {
        int i;
        i = TLObject.FLAG_30;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$searchFloatingDate$6(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return 855638016;
    }

    public static BlurredBackgroundProvider mainTabs(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$mainTabs$0;
                lambda$mainTabs$0 = BlurredBackgroundProviderImpl.lambda$mainTabs$0(resourcesProvider2, z);
                return lambda$mainTabs$0;
            }
        }).setStrokeColorTop(285212672, 117440511).setStrokeColorBottom(TLObject.FLAG_29, 301989887).setShadowColor(TLObject.FLAG_29, 83886079).setShadowLayer(AndroidUtilities.dpf2(2.667f), 0.0f, AndroidUtilities.dpf2(0.85f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$mainTabs$0(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTabs, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider topPanel(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$topPanel$1;
                lambda$topPanel$1 = BlurredBackgroundProviderImpl.lambda$topPanel$1(resourcesProvider2, z);
                return lambda$topPanel$1;
            }
        }).setStrokeColorTop(285212672, 117440511).setStrokeColorBottom(TLObject.FLAG_29, 301989887).setShadowColor(TLObject.FLAG_29, 83886079).setShadowLayer(AndroidUtilities.dpf2(2.667f), 0.0f, AndroidUtilities.dpf2(0.85f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topPanel$1(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTopPanel, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider emojiViewButton(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda9
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$emojiViewButton$2;
                lambda$emojiViewButton$2 = BlurredBackgroundProviderImpl.lambda$emojiViewButton$2(resourcesProvider2, z);
                return lambda$emojiViewButton$2;
            }
        }).setStrokeColorTop(-1, 687865855).setStrokeColorBottom(-1, 352321535).setShadowColor(TLObject.FLAG_30, 0).setShadowLayer(AndroidUtilities.dpf2(3.6666667f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(0.5f), AndroidUtilities.dpf2(0.5f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$emojiViewButton$2(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider counterMini(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda14
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$counterMini$3;
                lambda$counterMini$3 = BlurredBackgroundProviderImpl.lambda$counterMini$3(resourcesProvider2, z);
                return lambda$counterMini$3;
            }
        }).setStrokeColorTop(1627389951, 1358954495).setStrokeColorBottom(603979776, 603979776).setShadowColor(0, 0).setShadowLayer(0.0f, 0.0f, 0.0f).setStrokeWidth(AndroidUtilities.dpf2(0.43f), AndroidUtilities.dpf2(0.43f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$counterMini$3(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(-16777216, 0.075f);
    }

    public static BlurredBackgroundProvider scrimMenuBackground(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$scrimMenuBackground$4;
                lambda$scrimMenuBackground$4 = BlurredBackgroundProviderImpl.lambda$scrimMenuBackground$4(resourcesProvider2, z);
                return lambda$scrimMenuBackground$4;
            }
        }).setStrokeColorTop(-1, 0).setStrokeColorBottom(-1, 0).setShadowColor(637534208, 0).setShadowLayer(AndroidUtilities.dpf2(4.0f), 0.0f, 0.0f).setStrokeWidth(AndroidUtilities.dpf2(0.6666667f), AndroidUtilities.dpf2(0.6666667f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$scrimMenuBackground$4(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground), z ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider attachMenuSearch(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda3
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$attachMenuSearch$5;
                lambda$attachMenuSearch$5 = BlurredBackgroundProviderImpl.lambda$attachMenuSearch$5(resourcesProvider2, z);
                return lambda$attachMenuSearch$5;
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(285212672, 83886079).setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$attachMenuSearch$5(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider searchFloatingDate(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda12
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$searchFloatingDate$6;
                lambda$searchFloatingDate$6 = BlurredBackgroundProviderImpl.lambda$searchFloatingDate$6(resourcesProvider2, z);
                return lambda$searchFloatingDate$6;
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(0, 0).setStrokeWidth(1.0f, 1.0f).build();
    }

    public static BlurredBackgroundProvider bottomPanelChatActivity(final Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda15
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$bottomPanelChatActivity$7;
                lambda$bottomPanelChatActivity$7 = BlurredBackgroundProviderImpl.lambda$bottomPanelChatActivity$7(Theme.ResourcesProvider.this, resourcesProvider2, z);
                return lambda$bottomPanelChatActivity$7;
            }
        }).setStrokeColorTop(-1, 687865855).setStrokeColorBottom(-1, 352321535).setShadowColor(TLObject.FLAG_29, 0).setStrokeWidth(AndroidUtilities.dpf2(0.5f), AndroidUtilities.dpf2(0.5f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$bottomPanelChatActivity$7(Theme.ResourcesProvider resourcesProvider, Theme.ResourcesProvider resourcesProvider2, boolean z) {
        if (!checkBlurEnabled(resourcesProvider)) {
            return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider2), NotificationCenter.didReceiveSmsCode);
        }
        return Theme.multAlpha(Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider2), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider topPanelChatActivity(final Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$topPanelChatActivity$8;
                lambda$topPanelChatActivity$8 = BlurredBackgroundProviderImpl.lambda$topPanelChatActivity$8(Theme.ResourcesProvider.this, resourcesProvider2, z);
                return lambda$topPanelChatActivity$8;
            }
        }).setStrokeColorTop(-1, 553648127).setStrokeColorBottom(-1, 352321535).setShadowColor(TLObject.FLAG_29, 0).setStrokeWidth(AndroidUtilities.dpf2(0.55f), AndroidUtilities.dpf2(0.55f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topPanelChatActivity$8(Theme.ResourcesProvider resourcesProvider, Theme.ResourcesProvider resourcesProvider2, boolean z) {
        if (!checkBlurEnabled(resourcesProvider)) {
            return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider2), NotificationCenter.didReceiveSmsCode);
        }
        return Theme.multAlpha(Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider2), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider topPanelChatActivityTags(final Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$topPanelChatActivityTags$9;
                lambda$topPanelChatActivityTags$9 = BlurredBackgroundProviderImpl.lambda$topPanelChatActivityTags$9(Theme.ResourcesProvider.this, resourcesProvider2, z);
                return lambda$topPanelChatActivityTags$9;
            }
        }).setStrokeColorTop(0, 0).setStrokeColorBottom(0, 0).setShadowColor(0, 0).setShadowLayer(0.0f, 0.0f, 0.0f).setStrokeWidth(0.0f, 0.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topPanelChatActivityTags$9(Theme.ResourcesProvider resourcesProvider, Theme.ResourcesProvider resourcesProvider2, boolean z) {
        if (!checkBlurEnabled(resourcesProvider)) {
            return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider2), NotificationCenter.didReceiveSmsCode);
        }
        return Theme.multAlpha(Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider2), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider topPanelChatActivitySearchListBg(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda7
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$topPanelChatActivitySearchListBg$10;
                lambda$topPanelChatActivitySearchListBg$10 = BlurredBackgroundProviderImpl.lambda$topPanelChatActivitySearchListBg$10(resourcesProvider2, z);
                return lambda$topPanelChatActivitySearchListBg$10;
            }
        }).setStrokeColorTop(0, 0).setStrokeColorBottom(0, 0).setShadowColor(0, 0).setShadowLayer(0.0f, 0.0f, 0.0f).setStrokeWidth(0.0f, 0.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topPanelChatActivitySearchListBg$10(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), 0.7f);
    }

    public static BlurredBackgroundProvider bulletin(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda11
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$bulletin$11;
                lambda$bulletin$11 = BlurredBackgroundProviderImpl.lambda$bulletin$11(resourcesProvider2, z);
                return lambda$bulletin$11;
            }
        }).setStrokeWidth(AndroidUtilities.dpf2(0.5f), AndroidUtilities.dpf2(0.5f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$bulletin$11(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_undo_background, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider inputFieldDialogActivity(Theme.ResourcesProvider resourcesProvider) {
        return topPanel(resourcesProvider);
    }

    public static BlurredBackgroundProvider inputFieldShareAlert(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$inputFieldShareAlert$12;
                lambda$inputFieldShareAlert$12 = BlurredBackgroundProviderImpl.lambda$inputFieldShareAlert$12(resourcesProvider2, z);
                return lambda$inputFieldShareAlert$12;
            }
        }).setStrokeColorTop(687865855, 687865855).setStrokeColorBottom(352321535, 352321535).setShadowColor(TLObject.FLAG_29, 0).setShadowLayer(AndroidUtilities.dpf2(3.3333333f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(0.6666667f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$inputFieldShareAlert$12(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider photoViewer(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda8
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$photoViewer$13;
                lambda$photoViewer$13 = BlurredBackgroundProviderImpl.lambda$photoViewer$13(resourcesProvider2, z);
                return lambda$photoViewer$13;
            }
        }).setStrokeColorTop(687865855, 687865855).setStrokeColorBottom(352321535, 352321535).setStrokeWidth(AndroidUtilities.dpf2(0.6666667f), AndroidUtilities.dpf2(0.6666667f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$photoViewer$13(Theme.ResourcesProvider resourcesProvider, boolean z) {
        LiteMode.isEnabled(262144);
        return 0;
    }

    public static BlurredBackgroundProvider photoViewerMenu(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda13
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                return BlurredBackgroundProviderImpl.$r8$lambda$AxD0EE9eDsEVUvzZv7iGt71hrAg(resourcesProvider2, z);
            }
        }).setStrokeColorTop(687865855, 687865855).setStrokeColorBottom(352321535, 352321535).setStrokeWidth(AndroidUtilities.dpf2(0.6666667f), AndroidUtilities.dpf2(0.6666667f)).build();
    }

    public static BlurredBackgroundProvider premiumButton(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda6
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$premiumButton$15;
                lambda$premiumButton$15 = BlurredBackgroundProviderImpl.lambda$premiumButton$15(resourcesProvider2, z);
                return lambda$premiumButton$15;
            }
        }).setStrokeColorTop(-1, 553648127).setStrokeColorBottom(0, 553648127).setShadowColor(805306368, 83886079).setShadowLayer(AndroidUtilities.dpf2(4.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f)).setStrokeWidth(AndroidUtilities.dpf2(0.67f), AndroidUtilities.dpf2(0.67f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$premiumButton$15(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), 0.78f);
    }

    public static BlurredBackgroundProvider shadow(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setStrokeColorTop(0, 687865855).setStrokeColorBottom(0, 352321535).setShadowColor(805306368, 83886079).setShadowLayer(AndroidUtilities.dpf2(4.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    public static int solveSrcColor(int i, int i2, float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (clamp >= 1.0f) {
            return Color.argb(NotificationCenter.didReceiveSmsCode, Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        float f2 = 1.0f - clamp;
        return Color.argb(MathUtils.clamp(Math.round(clamp * 255.0f), 0, NotificationCenter.didReceiveSmsCode), MathUtils.clamp(Math.round((Color.red(i2) - (red * f2)) / clamp), 0, NotificationCenter.didReceiveSmsCode), MathUtils.clamp(Math.round((Color.green(i2) - (green * f2)) / clamp), 0, NotificationCenter.didReceiveSmsCode), MathUtils.clamp(Math.round((Color.blue(i2) - (blue * f2)) / clamp), 0, NotificationCenter.didReceiveSmsCode));
    }

    public static boolean checkBlurEnabled(Theme.ResourcesProvider resourcesProvider) {
        return checkBlurEnabled(UserConfig.selectedAccount, resourcesProvider);
    }

    public static boolean checkBlurEnabled(int i, Theme.ResourcesProvider resourcesProvider) {
        boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !isDark && MessagesController.getInstance(i).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && isDark && MessagesController.getInstance(i).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }
}
