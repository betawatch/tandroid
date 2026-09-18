package org.telegram.ui.Cells;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public interface n4 {
    boolean a();

    void c(boolean z10, boolean z11);

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
