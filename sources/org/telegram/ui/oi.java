package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oi implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public oi(k60 k60Var, Rect rect) {
        this.a = 1;
        this.d = k60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k50 k50Var;
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        boVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = boVar.Q8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            boVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                k60 k60Var = (k60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (k50Var = k60Var.f3) != null && k50Var.isShowing()) {
                        k60Var.f3.dismiss();
                        break;
                    }
                } else {
                    k50 k50Var2 = k60Var.f3;
                    if (k50Var2 != null && k50Var2.isShowing()) {
                        View contentView2 = k60Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            k60Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public oi(bo boVar, Rect rect) {
        this.a = 0;
        this.d = boVar;
        this.c = rect;
        this.b = new int[2];
    }
}
