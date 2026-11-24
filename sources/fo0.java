// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fo0 extends View {
    public final /* synthetic */ byte a = 0;
    public final ih2 b;

    public fo0(Activity activity) {
        super(activity);
        this.b = new ih2(gl.L(30.0f), gl.L(3.0f), bkb.w0(null, bkb.l5, false));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        ih2 ih2Var = this.b;
        switch (b) {
            case 0:
                ih2Var.setBounds(0, 0, getWidth(), getHeight());
                ih2Var.b(bkb.w0(null, bkb.l5, false));
                ih2Var.setAlpha(kk7.d4);
                ih2Var.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
            default:
                int L = gl.L(1.0f);
                ih2Var.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                ih2Var.draw(canvas);
                invalidate();
                break;
        }
    }

    public fo0(Context context) {
        super(context);
        this.b = new ih2(gl.L(36.0f), gl.L(2.0f), -13522392);
    }
}
