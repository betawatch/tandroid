package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fi implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public fi(v50 v50Var, Rect rect) {
        this.a = 1;
        this.d = v50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        v40 v40Var;
        switch (this.a) {
            case 0:
                un unVar = (un) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        unVar.H7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o1 o1Var = unVar.c9;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = unVar.c9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            unVar.H7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                v50 v50Var = (v50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (v40Var = v50Var.f3) != null && v40Var.isShowing()) {
                        v50Var.f3.dismiss();
                        break;
                    }
                } else {
                    v40 v40Var2 = v50Var.f3;
                    if (v40Var2 != null && v40Var2.isShowing()) {
                        View contentView2 = v50Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            v50Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public fi(un unVar, Rect rect) {
        this.a = 0;
        this.d = unVar;
        this.c = rect;
        this.b = new int[2];
    }
}
