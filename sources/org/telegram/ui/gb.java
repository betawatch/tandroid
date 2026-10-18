package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gb extends org.telegram.ui.Components.cp {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.s = i10;
        this.v = n2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hb hbVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (hbVar = ((xb) this.v).F0) != null) {
                    hbVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((sn) this.v).D7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        hb hbVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (hbVar = ((xb) this.v).F0) != null) {
                    hbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((sn) this.v).D7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
