package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class li implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public li(e60 e60Var, Rect rect) {
        this.a = 1;
        this.d = e60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f50 f50Var;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        znVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.p1 p1Var = znVar.N8;
                    if (p1Var != null && p1Var.isShowing()) {
                        View contentView = znVar.N8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            znVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                e60 e60Var = (e60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (f50Var = e60Var.c3) != null && f50Var.isShowing()) {
                        e60Var.c3.dismiss();
                        break;
                    }
                } else {
                    f50 f50Var2 = e60Var.c3;
                    if (f50Var2 != null && f50Var2.isShowing()) {
                        View contentView2 = e60Var.c3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            e60Var.c3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public li(zn znVar, Rect rect) {
        this.a = 0;
        this.d = znVar;
        this.c = rect;
        this.b = new int[2];
    }
}
