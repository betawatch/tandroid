package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.Components.fp {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context);
        this.s = i10;
        this.v = r2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gb gbVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (gbVar = ((wb) this.v).F0) != null) {
                    gbVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((wn) this.v).J7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gb gbVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (gbVar = ((wb) this.v).F0) != null) {
                    gbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((wn) this.v).J7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
