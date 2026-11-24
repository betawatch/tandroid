// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oq1 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public oq1(g95 g95Var, Rect rect) {
        this.a = (byte) 1;
        this.d = g95Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k85 k85Var;
        byte b = this.a;
        Object obj = this.d;
        int[] iArr = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        yv1Var.N5(true);
                        break;
                    }
                } else {
                    m8 m8Var = yv1Var.g9;
                    if (m8Var != null && m8Var.isShowing()) {
                        View contentView = yv1Var.g9.getContentView();
                        contentView.getLocationInWindow(iArr);
                        int i = iArr[0];
                        rect.set(i, iArr[1], contentView.getMeasuredWidth() + i, contentView.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            yv1Var.N5(true);
                            break;
                        }
                    }
                }
                break;
            default:
                g95 g95Var = (g95) obj;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (k85Var = g95Var.U4) != null && k85Var.isShowing()) {
                        g95Var.U4.dismiss();
                        break;
                    }
                } else {
                    k85 k85Var2 = g95Var.U4;
                    if (k85Var2 != null && k85Var2.isShowing()) {
                        View contentView2 = g95Var.U4.getContentView();
                        contentView2.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        rect.set(i2, iArr[1], contentView2.getMeasuredWidth() + i2, contentView2.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            g95Var.U4.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public oq1(yv1 yv1Var, Rect rect) {
        this.a = (byte) 0;
        this.d = yv1Var;
        this.c = rect;
        this.b = new int[2];
    }
}
