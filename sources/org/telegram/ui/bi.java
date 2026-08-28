package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bi implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public bi(o50 o50Var, Rect rect) {
        this.a = 1;
        this.d = o50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o40 o40Var;
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        qnVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = qnVar.M8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i9 = iArr[0];
                        int i10 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i9;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i9, i10, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            qnVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                o50 o50Var = (o50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (o40Var = o50Var.b3) != null && o40Var.isShowing()) {
                        o50Var.b3.dismiss();
                        break;
                    }
                } else {
                    o40 o40Var2 = o50Var.b3;
                    if (o40Var2 != null && o40Var2.isShowing()) {
                        View contentView2 = o50Var.b3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i11 = iArr2[0];
                        int i12 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i11;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i11, i12, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            o50Var.b3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public bi(qn qnVar, Rect rect) {
        this.a = 0;
        this.d = qnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
