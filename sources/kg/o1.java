package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.t8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout implements z5 {
    public final t8 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final fp e;
    public final Path f;
    public final Paint h;
    public final e6 n;
    public final int[] r;
    public boolean s;

    public o1(Context context, e6 e6Var) {
        super(context);
        this.a = new t8((e6) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = e6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        q6.U(textView, j6.G6, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = hd.a0;
        addView(textView, ja.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        q6.U(textView2, j6.z6, e6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = hd.a0;
        addView(textView2, ja.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        fp fpVar = new fp(21, getContext(), e6Var);
        this.e = fpVar;
        fpVar.b(-1, j6.d6, j6.k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        addView(fpVar, ja.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = hd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f) : org.telegram.messenger.g0.L(9.0f);
        float L = org.telegram.messenger.g0.L(11.33f);
        float L2 = org.telegram.messenger.g0.L(56.0f);
        float L3 = org.telegram.messenger.g0.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint W0 = j6.W0("paintDivider", this.n);
            if (W0 == null) {
                W0 = j6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(hd.a0 ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(hd.a0 ? 78.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(j6.r1(0.85f, j6.w0(j6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = hd.a0 ? org.telegram.messenger.g0.N(29.66f) : getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        path.moveTo(N, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        path.lineTo((org.telegram.messenger.g0.N(5.33f) * (hd.a0 ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, org.telegram.messenger.g0.N(5.66f) + measuredHeight);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.h.setColor(j6.r1(0.85f, j6.w0(j6.z6, this.n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
