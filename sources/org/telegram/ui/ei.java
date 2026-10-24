package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ei implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ei(u50 u50Var, Rect rect) {
        this.a = 1;
        this.d = u50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        t40 t40Var;
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        snVar.D7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.m1 m1Var = snVar.c9;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = snVar.c9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            snVar.D7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                u50 u50Var = (u50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (t40Var = u50Var.f3) != null && t40Var.isShowing()) {
                        u50Var.f3.dismiss();
                        break;
                    }
                } else {
                    t40 t40Var2 = u50Var.f3;
                    if (t40Var2 != null && t40Var2.isShowing()) {
                        View contentView2 = u50Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            u50Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ei(sn snVar, Rect rect) {
        this.a = 0;
        this.d = snVar;
        this.c = rect;
        this.b = new int[2];
    }
}
