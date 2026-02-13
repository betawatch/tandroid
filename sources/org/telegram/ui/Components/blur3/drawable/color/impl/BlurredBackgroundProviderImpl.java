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
    public static /* synthetic */ int $r8$lambda$15gD65yOpa3rDErTy8NwfewFuCA(Theme.ResourcesProvider resourcesProvider, boolean z) {
        int i;
        i = AndroidUtilities.DARK_STATUS_BAR_OVERLAY;
        return i;
    }

    public static BlurredBackgroundProvider mainTabs(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda1
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
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$topPanel$1;
                lambda$topPanel$1 = BlurredBackgroundProviderImpl.lambda$topPanel$1(resourcesProvider2, z);
                return lambda$topPanel$1;
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(637534208, 83886079).setShadowLayer(AndroidUtilities.dpf2(3.3333333f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topPanel$1(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_glass_targetMainTopPanel, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider attachMenuSearch(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$attachMenuSearch$2;
                lambda$attachMenuSearch$2 = BlurredBackgroundProviderImpl.lambda$attachMenuSearch$2(resourcesProvider2, z);
                return lambda$attachMenuSearch$2;
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(285212672, 83886079).setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$attachMenuSearch$2(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider searchFloatingDate(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                return BlurredBackgroundProviderImpl.$r8$lambda$15gD65yOpa3rDErTy8NwfewFuCA(resourcesProvider2, z);
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(0, 0).setStrokeWidth(1.0f, 1.0f).build();
    }

    public static BlurredBackgroundProvider topPanelChatActivity(final Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda3
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$topPanelChatActivity$4;
                lambda$topPanelChatActivity$4 = BlurredBackgroundProviderImpl.lambda$topPanelChatActivity$4(Theme.ResourcesProvider.this, resourcesProvider2, z);
                return lambda$topPanelChatActivity$4;
            }
        }).setStrokeColorTop(-1, 687865855).setStrokeColorBottom(-1, 352321535).setShadowColor(TLObject.FLAG_29, 0).setStrokeWidth(AndroidUtilities.dpf2(0.5f), AndroidUtilities.dpf2(0.5f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$topPanelChatActivity$4(Theme.ResourcesProvider resourcesProvider, Theme.ResourcesProvider resourcesProvider2, boolean z) {
        if (!checkBlurEnabled(resourcesProvider)) {
            return ColorUtils.setAlphaComponent(Theme.getColor(z ? Theme.key_actionBarDefault : Theme.key_chat_topPanelBackground, resourcesProvider2), NotificationCenter.cameraInitied);
        }
        return Theme.multAlpha(Theme.getColor(Theme.key_chat_topPanelBackground, resourcesProvider2), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static BlurredBackgroundProvider inputFieldDialogActivity(Theme.ResourcesProvider resourcesProvider) {
        return topPanel(resourcesProvider);
    }

    public static BlurredBackgroundProvider inputFieldShareAlert(Theme.ResourcesProvider resourcesProvider) {
        return new BlurredBackgroundProviderBuilder(resourcesProvider).setBackgroundColor(new BlurredBackgroundProviderBuilder.ColorProvider() { // from class: org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder.ColorProvider
            public final int getColor(Theme.ResourcesProvider resourcesProvider2, boolean z) {
                int lambda$inputFieldShareAlert$5;
                lambda$inputFieldShareAlert$5 = BlurredBackgroundProviderImpl.lambda$inputFieldShareAlert$5(resourcesProvider2, z);
                return lambda$inputFieldShareAlert$5;
            }
        }).setStrokeColorTop(385875968, 402653183).setStrokeColorBottom(385875968, 402653183).setShadowColor(637534208, 83886079).setShadowLayer(AndroidUtilities.dpf2(3.3333333f), 0.0f, AndroidUtilities.dpf2(0.6666667f)).setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$inputFieldShareAlert$5(Theme.ResourcesProvider resourcesProvider, boolean z) {
        return solveSrcColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), Theme.getColor(Theme.key_chat_messagePanelBackground, resourcesProvider), LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public static int solveSrcColor(int i, int i2, float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (clamp >= 1.0f) {
            return Color.argb(NotificationCenter.cameraInitied, Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        float f2 = 1.0f - clamp;
        return Color.argb(MathUtils.clamp(Math.round(clamp * 255.0f), 0, NotificationCenter.cameraInitied), MathUtils.clamp(Math.round((Color.red(i2) - (red * f2)) / clamp), 0, NotificationCenter.cameraInitied), MathUtils.clamp(Math.round((Color.green(i2) - (green * f2)) / clamp), 0, NotificationCenter.cameraInitied), MathUtils.clamp(Math.round((Color.blue(i2) - (blue * f2)) / clamp), 0, NotificationCenter.cameraInitied));
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
