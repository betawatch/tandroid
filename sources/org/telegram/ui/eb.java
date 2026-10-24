package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class eb extends org.telegram.ui.Components.cp {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.s = i10;
        this.v = o2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        fb fbVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (fbVar = ((vb) this.v).F0) != null) {
                    fbVar.dismiss();
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
        fb fbVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (fbVar = ((vb) this.v).F0) != null) {
                    fbVar.dismiss();
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
