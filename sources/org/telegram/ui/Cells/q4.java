package org.telegram.ui.Cells;

import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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

    gj getMessageObject();

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
