package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ei implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ei(q50 q50Var, Rect rect) {
        this.a = 1;
        this.d = q50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        q40 q40Var;
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        qnVar.D7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = qnVar.Q8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            qnVar.D7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                q50 q50Var = (q50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (q40Var = q50Var.f3) != null && q40Var.isShowing()) {
                        q50Var.f3.dismiss();
                        break;
                    }
                } else {
                    q40 q40Var2 = q50Var.f3;
                    if (q40Var2 != null && q40Var2.isShowing()) {
                        View contentView2 = q50Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            q50Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ei(qn qnVar, Rect rect) {
        this.a = 0;
        this.d = qnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
