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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ix8 extends FrameLayout implements tjb {
    public final pb0 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final wf2 e;
    public final Path f;
    public final Paint h;
    public final wjb n;
    public final int[] r;
    public boolean s;

    public ix8(Context context, wjb wjbVar) {
        super(context);
        this.a = new pb0((wjb) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = wjbVar;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 16.0f);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -2.0f, 7, z ? 40.0f : 78.0f, 10.33f, z ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        zkb.X(textView2, bkb.y6, wjbVar);
        textView2.setTextSize(1, 15.0f);
        boolean z2 = k96.a0;
        addView(textView2, nme.d(-1, -2.0f, 7, z2 ? 40.0f : 78.0f, 32.0f, z2 ? 78.0f : 40.0f, 0.0f));
        wf2 wf2Var = new wf2(21, wjbVar, getContext());
        this.e = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var, nme.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = k96.a0 ? getMeasuredWidth() - gl.L(65.0f) : gl.L(9.0f);
        float L = gl.L(11.33f);
        float L2 = gl.L(56.0f);
        float L3 = gl.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint U0 = bkb.U0("paintDivider", this.n);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            canvas.drawRect(gl.L(k96.a0 ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - gl.L(k96.a0 ? 78.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.N(1.66f));
        paint.setColor(bkb.p1(0.85f, bkb.v0(bkb.y6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = k96.a0 ? gl.N(29.66f) : getMeasuredWidth() - gl.N(24.33f);
        path.moveTo(N, measuredHeight - gl.N(5.66f));
        path.lineTo((gl.N(5.33f) * (k96.a0 ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, gl.N(5.66f) + measuredHeight);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.h.setColor(bkb.p1(0.85f, bkb.v0(bkb.y6, this.n)));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
