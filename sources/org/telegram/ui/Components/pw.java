package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pw extends ow {
    public final /* synthetic */ qw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(qw qwVar, Context context, int i10) {
        super(qwVar.s, context, i10);
        this.K = qwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
