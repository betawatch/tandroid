package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ni implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ni(j60 j60Var, Rect rect) {
        this.a = 1;
        this.d = j60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j50 j50Var;
        switch (this.a) {
            case 0:
                co coVar = (co) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        coVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = coVar.Q8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            coVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                j60 j60Var = (j60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (j50Var = j60Var.f3) != null && j50Var.isShowing()) {
                        j60Var.f3.dismiss();
                        break;
                    }
                } else {
                    j50 j50Var2 = j60Var.f3;
                    if (j50Var2 != null && j50Var2.isShowing()) {
                        View contentView2 = j60Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            j60Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ni(co coVar, Rect rect) {
        this.a = 0;
        this.d = coVar;
        this.c = rect;
        this.b = new int[2];
    }
}
