// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jz8 extends FrameLayout implements vlb {
    public final pc0 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final jh2 e;
    public final Path f;
    public final Paint h;
    public final ylb n;
    public final int[] r;
    public boolean s;

    public jz8(Context context, ylb ylbVar) {
        super(context);
        this.a = new pc0((ylb) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = ylbVar;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        anb.X(textView, cmb.F6, ylbVar);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 16.0f);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -2.0f, 7, z ? 40.0f : 78.0f, 10.33f, z ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setTextSize(1, 15.0f);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.d(-1, -2.0f, 7, z2 ? 40.0f : 78.0f, 32.0f, z2 ? 78.0f : 40.0f, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, getContext());
        this.e = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var, qoe.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = jb6.a0 ? getMeasuredWidth() - gm.L(65.0f) : gm.L(9.0f);
        float L = gm.L(11.33f);
        float L2 = gm.L(56.0f);
        float L3 = gm.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint U0 = cmb.U0("paintDivider", this.n);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            canvas.drawRect(gm.L(jb6.a0 ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - gm.L(jb6.a0 ? 78.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.N(1.66f));
        paint.setColor(cmb.p1(0.85f, cmb.v0(cmb.y6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = jb6.a0 ? gm.N(29.66f) : getMeasuredWidth() - gm.N(24.33f);
        path.moveTo(N, measuredHeight - gm.N(5.66f));
        path.lineTo((gm.N(5.33f) * (jb6.a0 ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, gm.N(5.66f) + measuredHeight);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.h.setColor(cmb.p1(0.85f, cmb.v0(cmb.y6, this.n)));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
