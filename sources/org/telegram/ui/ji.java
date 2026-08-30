package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ji implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ji(c60 c60Var, Rect rect) {
        this.a = 1;
        this.d = c60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d50 d50Var;
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        xnVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                    if (p1Var != null && p1Var.isShowing()) {
                        View contentView = xnVar.N8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            xnVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                c60 c60Var = (c60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (d50Var = c60Var.c3) != null && d50Var.isShowing()) {
                        c60Var.c3.dismiss();
                        break;
                    }
                } else {
                    d50 d50Var2 = c60Var.c3;
                    if (d50Var2 != null && d50Var2.isShowing()) {
                        View contentView2 = c60Var.c3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            c60Var.c3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ji(xn xnVar, Rect rect) {
        this.a = 0;
        this.d = xnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
