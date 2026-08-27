package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class di implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public di(s50 s50Var, Rect rect) {
        this.a = 1;
        this.d = s50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s40 s40Var;
        switch (this.a) {
            case 0:
                rn rnVar = (rn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        rnVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
                    if (n1Var != null && n1Var.isShowing()) {
                        View contentView = rnVar.M8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            rnVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                s50 s50Var = (s50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (s40Var = s50Var.b3) != null && s40Var.isShowing()) {
                        s50Var.b3.dismiss();
                        break;
                    }
                } else {
                    s40 s40Var2 = s50Var.b3;
                    if (s40Var2 != null && s40Var2.isShowing()) {
                        View contentView2 = s50Var.b3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            s50Var.b3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public di(rn rnVar, Rect rect) {
        this.a = 0;
        this.d = rnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
