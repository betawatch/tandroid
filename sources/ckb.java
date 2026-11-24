// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ckb extends FrameLayout {
    public final ImageView a;
    public final lka b;
    public final ylb c;
    public boolean d;

    public ckb(Context context, ylb ylbVar) {
        super(context);
        this.c = ylbVar;
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        anb.W(lkaVar, cmb.i5, ylbVar);
        lkaVar.setTextSize(16);
        lkaVar.setGravity(19);
        addView(lkaVar, qoe.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        anb.s(imageView, cmb.B6, ylbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, qoe.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i = cmb.g5;
        int i2 = ulb.a;
        int w0 = cmb.w0(null, i, false);
        setBackground(ulb.d(w0, ulb.b(w0), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            ylb ylbVar = this.c;
            Paint d = ylbVar != null ? ylbVar.d("paintDivider") : null;
            if (d == null) {
                d = cmb.j0;
            }
            canvas.drawLine(gm.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z) {
        this.d = z;
    }
}
