// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bp1 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final int[] b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Object d;

    public bp1(h75 h75Var, Rect rect) {
        this.a = (byte) 1;
        this.d = h75Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m65 m65Var;
        byte b = this.a;
        Object obj = this.d;
        int[] iArr = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4) {
                        mu1Var.G5(true);
                        break;
                    }
                } else {
                    m8 m8Var = mu1Var.g9;
                    if (m8Var != null && m8Var.isShowing()) {
                        View contentView = mu1Var.g9.getContentView();
                        contentView.getLocationInWindow(iArr);
                        int i = iArr[0];
                        rect.set(i, iArr[1], contentView.getMeasuredWidth() + i, contentView.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            mu1Var.G5(true);
                            break;
                        }
                    }
                }
                break;
            default:
                h75 h75Var = (h75) obj;
                if (motionEvent.getActionMasked() != 0) {
                    if (motionEvent.getActionMasked() == 4 && (m65Var = h75Var.U4) != null && m65Var.isShowing()) {
                        h75Var.U4.dismiss();
                        break;
                    }
                } else {
                    m65 m65Var2 = h75Var.U4;
                    if (m65Var2 != null && m65Var2.isShowing()) {
                        View contentView2 = h75Var.U4.getContentView();
                        contentView2.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        rect.set(i2, iArr[1], contentView2.getMeasuredWidth() + i2, contentView2.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            h75Var.U4.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    public bp1(mu1 mu1Var, Rect rect) {
        this.a = (byte) 0;
        this.d = mu1Var;
        this.c = rect;
        this.b = new int[2];
    }
}
