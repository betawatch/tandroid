package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cb extends org.telegram.ui.Components.no {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.s = i10;
        this.v = p2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        db dbVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (dbVar = ((ub) this.v).G0) != null) {
                    dbVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((zn) this.v).A7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        db dbVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (dbVar = ((ub) this.v).G0) != null) {
                    dbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((zn) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
