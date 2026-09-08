package org.telegram.ui.Cells;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public interface n4 {
    boolean a();

    void e(boolean z10, boolean z11);

    void f(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    float getAlpha();

    float getCheckBoxTranslation();

    float getDeltaBottom();

    int getHeight();

    int getMeasuredHeight();

    MessageObject getMessageObject();

    float getPivotX();

    float getScaleX();

    float getScaleY();

    float getSlidingOffsetX();

    float getX();

    float getY();

    boolean h();

    boolean i();

    boolean j();
}
