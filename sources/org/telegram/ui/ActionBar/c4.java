package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c4 extends ImageButton {
    public final /* synthetic */ g4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(g4 g4Var, Context context) {
        super(context);
        this.a = g4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
