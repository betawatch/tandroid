package org.telegram.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ii implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public ii(x50 x50Var, Rect rect) {
        this.a = 1;
        this.d = x50Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        x40 x40Var;
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        wnVar.J7(true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.o1 o1Var = wnVar.g9;
                    if (o1Var != null && o1Var.isShowing()) {
                        View contentView = wnVar.g9.getContentView();
                        int[] iArr = this.b;
                        contentView.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int measuredWidth = contentView.getMeasuredWidth() + i10;
                        int measuredHeight = contentView.getMeasuredHeight() + iArr[1];
                        Rect rect = this.c;
                        rect.set(i10, i11, measuredWidth, measuredHeight);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            wnVar.J7(true);
                            break;
                        }
                    }
                }
                break;
            default:
                x50 x50Var = (x50) this.d;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (x40Var = x50Var.f3) != null && x40Var.isShowing()) {
                        x50Var.f3.dismiss();
                        break;
                    }
                } else {
                    x40 x40Var2 = x50Var.f3;
                    if (x40Var2 != null && x40Var2.isShowing()) {
                        View contentView2 = x50Var.f3.getContentView();
                        int[] iArr2 = this.b;
                        contentView2.getLocationInWindow(iArr2);
                        int i12 = iArr2[0];
                        int i13 = iArr2[1];
                        int measuredWidth2 = contentView2.getMeasuredWidth() + i12;
                        int measuredHeight2 = contentView2.getMeasuredHeight() + iArr2[1];
                        Rect rect2 = this.c;
                        rect2.set(i12, i13, measuredWidth2, measuredHeight2);
                        if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            x50Var.f3.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public ii(wn wnVar, Rect rect) {
        this.a = 0;
        this.d = wnVar;
        this.c = rect;
        this.b = new int[2];
    }
}
