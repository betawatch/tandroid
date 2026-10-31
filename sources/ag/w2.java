package ag;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout implements k6 {
    public final r8 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final ep e;
    public final Path f;
    public final Paint h;
    public final p6 n;
    public final int[] r;
    public boolean s;

    public w2(Context context, p6 p6Var) {
        super(context);
        this.a = new r8((p6) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = p6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        a7.V(textView, t6.G6, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = cd.X;
        addView(textView, b6.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        a7.V(textView2, t6.z6, p6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = cd.X;
        addView(textView2, b6.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        ep epVar = new ep(21, getContext(), p6Var);
        this.e = epVar;
        epVar.b(-1, t6.d6, t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar, b6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = cd.X ? getMeasuredWidth() - org.telegram.messenger.i0.L(65.0f) : org.telegram.messenger.i0.L(9.0f);
        float L = org.telegram.messenger.i0.L(11.33f);
        float L2 = org.telegram.messenger.i0.L(56.0f);
        float L3 = org.telegram.messenger.i0.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint W0 = t6.W0("paintDivider", this.n);
            if (W0 == null) {
                W0 = t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(cd.X ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.i0.L(cd.X ? 78.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(78.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
        paint.setColor(t6.r1(0.85f, t6.w0(t6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = cd.X ? org.telegram.messenger.i0.N(29.66f) : getMeasuredWidth() - org.telegram.messenger.i0.N(24.33f);
        path.moveTo(N, measuredHeight - org.telegram.messenger.i0.N(5.66f));
        path.lineTo((org.telegram.messenger.i0.N(5.33f) * (cd.X ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, org.telegram.messenger.i0.N(5.66f) + measuredHeight);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.h.setColor(t6.r1(0.85f, t6.w0(t6.z6, this.n)));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
