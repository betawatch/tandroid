package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ei implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ei(r50 r50Var, Rect rect) {
        this.a = 1;
        this.d = r50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r40 r40Var;
        switch (this.a) {
            case 0:
                tn tnVar = (tn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        tnVar.A7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = tnVar.M8.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            tnVar.A7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                r50 r50Var = (r50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (r40Var = r50Var.b3) != null && r40Var.isShowing()) {
                        r50Var.b3.dismiss();
                        break;
                    }
                } else {
                    r40 r40Var2 = r50Var.b3;
                    if (r40Var2 != null && r40Var2.isShowing()) {
                        View contentView2 = r50Var.b3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            r50Var.b3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ei(tn tnVar, Rect rect) {
        this.a = 0;
        this.d = tnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
