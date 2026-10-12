package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ib extends org.telegram.ui.Components.fp {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(int i10, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.s = i10;
        this.v = m2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jb jbVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (jbVar = ((ac) this.v).F0) != null) {
                    jbVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((fo) this.v).D7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jb jbVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (jbVar = ((ac) this.v).F0) != null) {
                    jbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((fo) this.v).D7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
