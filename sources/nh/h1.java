package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class h1 extends GestureDetector.SimpleOnGestureListener {
    public float a;
    public float b;
    public final /* synthetic */ int c;

    public h1(int i10) {
        iv0 iv0Var = j1.U;
        this.c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        j1 j1Var = j1.W;
        if (j1Var.E) {
            for (int i10 = 1; i10 < j1Var.e.getChildCount(); i10++) {
                View childAt = j1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    j1Var.D = childAt;
                    return true;
                }
            }
        }
        this.a = j1Var.K;
        this.b = j1Var.L;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j1 j1Var = j1.W;
        if (!j1Var.B || j1Var.C) {
            return false;
        }
        o1.j jVar = j1Var.M;
        jVar.a = f10;
        float f12 = j1Var.K;
        jVar.b = f12;
        jVar.c = true;
        jVar.u.i = (f10 / 7.0f) + ((j1Var.G / 2.0f) + f12) >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r3 - r2) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        j1Var.M.f();
        o1.j jVar2 = j1Var.N;
        jVar2.a = f10;
        jVar2.b = j1Var.L;
        jVar2.c = true;
        jVar2.u.i = k7.n.a((f11 / 10.0f) + r9, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
        j1Var.N.f();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j1 j1Var = j1.W;
        if (!j1Var.B && j1Var.F == null && !j1Var.C) {
            float abs = Math.abs(f10);
            float f12 = this.c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                j1Var.B = true;
                j1Var.M.c();
                j1Var.N.c();
            }
        }
        if (j1Var.B) {
            WindowManager.LayoutParams layoutParams = j1Var.c;
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            j1Var.K = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = j1Var.c;
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            j1Var.L = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, j1Var.c);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j1 j1Var = j1.W;
        lh.b bVar = j1Var.R;
        if (j1Var.F == null) {
            if (j1Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(bVar);
                j1Var.Q = false;
            }
            boolean z4 = !j1Var.E;
            j1Var.E = z4;
            j1Var.p(z4);
            if (j1Var.E && !j1Var.Q) {
                AndroidUtilities.runOnUIThread(bVar, 2500L);
                j1Var.Q = true;
            }
        }
        return true;
    }
}
