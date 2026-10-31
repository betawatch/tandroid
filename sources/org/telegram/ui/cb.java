package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cb extends org.telegram.ui.Components.ko {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context);
        this.s = i10;
        this.w = k2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        db dbVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (dbVar = ((sb) this.w).F0) != null) {
                    dbVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((un) this.w).I7(true);
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
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (dbVar = ((sb) this.w).F0) != null) {
                    dbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((un) this.w).I7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
