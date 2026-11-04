package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout implements z5 {
    public final u8 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final wo e;
    public final Path f;
    public final Paint h;
    public final e6 n;
    public final int[] r;
    public boolean s;

    public o1(Context context, e6 e6Var) {
        super(context);
        this.a = new u8((e6) null);
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
        r6.V(textView, k6.G6, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = bd.a0;
        addView(textView, mf.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        r6.V(textView2, k6.z6, e6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = bd.a0;
        addView(textView2, mf.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        wo woVar = new wo(21, getContext(), e6Var);
        this.e = woVar;
        woVar.b(-1, k6.d6, k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, mf.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = bd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f) : org.telegram.messenger.g0.L(9.0f);
        float L = org.telegram.messenger.g0.L(11.33f);
        float L2 = org.telegram.messenger.g0.L(56.0f);
        float L3 = org.telegram.messenger.g0.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint W0 = k6.W0("paintDivider", this.n);
            if (W0 == null) {
                W0 = k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(bd.a0 ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(bd.a0 ? 78.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(k6.r1(0.85f, k6.w0(k6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = bd.a0 ? org.telegram.messenger.g0.N(29.66f) : getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        path.moveTo(N, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        path.lineTo((org.telegram.messenger.g0.N(5.33f) * (bd.a0 ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, org.telegram.messenger.g0.N(5.66f) + measuredHeight);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.h.setColor(k6.r1(0.85f, k6.w0(k6.z6, this.n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
