package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class db extends org.telegram.ui.Components.to {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.s = i10;
        this.v = n2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        eb ebVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (ebVar = ((ub) this.v).F0) != null) {
                    ebVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((xn) this.v).A7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eb ebVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (ebVar = ((ub) this.v).F0) != null) {
                    ebVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((xn) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
