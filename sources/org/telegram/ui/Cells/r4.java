package org.telegram.ui.Cells;

import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public interface r4 {
    boolean a();

    void b(boolean z10, boolean z11);

    void e(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    boolean g();

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    jj getMessageObject();

    float getPivotX();

    float getScaleX();

    float getScaleY();

    float getSlidingOffsetX();

    float getX();

    float getY();

    boolean k();

    boolean l();
}
