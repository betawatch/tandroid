package org.telegram.ui.Cells;

import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public interface q4 {
    boolean b();

    void c(boolean z10, boolean z11);

    void d(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    fj getMessageObject();

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
