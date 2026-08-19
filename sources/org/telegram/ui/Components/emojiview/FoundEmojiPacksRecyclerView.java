package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.UniversalRecyclerView;

/* loaded from: classes5.dex */
public abstract class FoundEmojiPacksRecyclerView extends UniversalRecyclerView {
    public FoundEmojiPacksRecyclerView(Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, Theme.ResourcesProvider resourcesProvider, int i3, int i4) {
        super(context, i, i2, z, callback2, callback5, callback5Return, resourcesProvider, i3, i4);
        setAdaptiveOverScroll();
    }

    public void scrollOnSelect(final View view) {
        if (view == null) {
            return;
        }
        float dp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - dp;
        float x = view.getX();
        float width2 = view.getWidth() + x;
        final int i = x < dp ? (int) (x - dp) : width2 > width ? (int) (width2 - width) : 0;
        if (i != 0) {
            AndroidUtilities.doOnLayout(this, new Runnable() { // from class: org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FoundEmojiPacksRecyclerView.$r8$lambda$iotaPCQNFp90pxMy9oK18jci40Q(FoundEmojiPacksRecyclerView.this, view, i);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$iotaPCQNFp90pxMy9oK18jci40Q(final FoundEmojiPacksRecyclerView foundEmojiPacksRecyclerView, View view, final int i) {
        foundEmojiPacksRecyclerView.getClass();
        view.postOnAnimation(new Runnable() { // from class: org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FoundEmojiPacksRecyclerView.this.smoothScrollBy(i, 0);
            }
        });
    }
}
