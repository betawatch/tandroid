package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mi implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public mi(i60 i60Var, Rect rect) {
        this.a = 1;
        this.d = i60Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i50 i50Var;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        znVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = znVar.Q8.getContentView();
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
                i60 i60Var = (i60) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (i50Var = i60Var.f3) != null && i50Var.isShowing()) {
                        i60Var.f3.dismiss();
                        break;
                    }
                } else {
                    i50 i50Var2 = i60Var.f3;
                    if (i50Var2 != null && i50Var2.isShowing()) {
                        View contentView2 = i60Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            i60Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public mi(zn znVar, Rect rect) {
        this.a = 0;
        this.d = znVar;
        this.c = rect;
        this.b = new int[2];
    }
}
