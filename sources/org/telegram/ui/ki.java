package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ki implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ki(d60 d60Var, Rect rect) {
        this.a = 1;
        this.d = d60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        d50 d50Var;
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        wnVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
                    if (m1Var != null && m1Var.isShowing()) {
                        View contentView = wnVar.Q8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            wnVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                d60 d60Var = (d60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (d50Var = d60Var.f3) != null && d50Var.isShowing()) {
                        d60Var.f3.dismiss();
                        break;
                    }
                } else {
                    d50 d50Var2 = d60Var.f3;
                    if (d50Var2 != null && d50Var2.isShowing()) {
                        View contentView2 = d60Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            d60Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ki(wn wnVar, Rect rect) {
        this.a = 0;
        this.d = wnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
