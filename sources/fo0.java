// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fo0 extends View {
    public final /* synthetic */ byte a = 0;
    public final di2 b;

    public fo0(Activity activity) {
        super(activity);
        this.b = new di2(hl.L(30.0f), hl.L(3.0f), aob.w0(null, aob.m5, false));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        di2 di2Var = this.b;
        switch (b) {
            case 0:
                di2Var.setBounds(0, 0, getWidth(), getHeight());
                di2Var.b(aob.w0(null, aob.m5, false));
                di2Var.setAlpha(jn7.d4);
                di2Var.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
            default:
                int L = hl.L(1.0f);
                di2Var.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                di2Var.draw(canvas);
                invalidate();
                break;
        }
    }

    public fo0(Context context) {
        super(context);
        this.b = new di2(hl.L(36.0f), hl.L(2.0f), -13522392);
    }
}
