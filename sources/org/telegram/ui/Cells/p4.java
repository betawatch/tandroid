package org.telegram.ui.Cells;

import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public interface p4 {
    boolean b();

    void c(boolean z9, boolean z10);

    void e(TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11);

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    ij getMessageObject();

    float getPivotX();

    float getScaleX();

    float getScaleY();

    float getSlidingOffsetX();

    float getX();

    float getY();

    boolean j();

    boolean l();

    boolean m();
}
