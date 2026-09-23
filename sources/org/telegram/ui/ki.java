package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ki implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ki(f60 f60Var, Rect rect) {
        this.a = 1;
        this.d = f60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f50 f50Var;
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        xnVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n1 n1Var = xnVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = xnVar.Q8.getContentView();
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
                f60 f60Var = (f60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (f50Var = f60Var.f3) != null && f50Var.isShowing()) {
                        f60Var.f3.dismiss();
                        break;
                    }
                } else {
                    f50 f50Var2 = f60Var.f3;
                    if (f50Var2 != null && f50Var2.isShowing()) {
                        View contentView2 = f60Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            f60Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ki(xn xnVar, Rect rect) {
        this.a = 0;
        this.d = xnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
