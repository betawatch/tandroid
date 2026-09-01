package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ji implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ji(d60 d60Var, Rect rect) {
        this.a = 1;
        this.d = d60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e50 e50Var;
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
                d60 d60Var = (d60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (e50Var = d60Var.c3) != null && e50Var.isShowing()) {
                        d60Var.c3.dismiss();
                        break;
                    }
                } else {
                    e50 e50Var2 = d60Var.c3;
                    if (e50Var2 != null && e50Var2.isShowing()) {
                        View contentView2 = d60Var.c3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            d60Var.c3.dismiss();
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
