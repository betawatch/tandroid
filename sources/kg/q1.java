package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.lp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q1 extends FrameLayout implements c6 {
    public final a9 a;
    public final ImageReceiver b;
    public final TextView c;
    public final TextView d;
    public final lp e;
    public final Path f;
    public final Paint h;
    public final i6 n;
    public final int[] r;
    public boolean s;

    public q1(Context context, i6 i6Var) {
        super(context);
        this.a = new a9((i6) null);
        this.b = new ImageReceiver(this);
        this.f = new Path();
        this.h = new Paint(1);
        this.r = new int[1];
        this.n = i6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        u6.U(textView, n6.G6, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        boolean z10 = gd.a0;
        addView(textView, na.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        u6.U(textView2, n6.z6, i6Var);
        textView2.setTextSize(1, 15.0f);
        boolean z11 = gd.a0;
        addView(textView2, na.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        lp lpVar = new lp(21, getContext(), i6Var);
        this.e = lpVar;
        lpVar.b(-1, n6.d6, n6.k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(3);
        addView(lpVar, na.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = gd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(65.0f) : org.telegram.messenger.g0.L(9.0f);
        float L = org.telegram.messenger.g0.L(11.33f);
        float L2 = org.telegram.messenger.g0.L(56.0f);
        float L3 = org.telegram.messenger.g0.L(56.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.z0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        canvas.drawPath(this.f, this.h);
        if (this.s) {
            Paint W0 = n6.W0("paintDivider", this.n);
            if (W0 == null) {
                W0 = n6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(gd.a0 ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(gd.a0 ? 78.0f : 0.0f), getMeasuredHeight(), W0);
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
        paint.setColor(n6.r1(0.85f, n6.w0(n6.z6, this.n)));
        Path path = this.f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = gd.a0 ? org.telegram.messenger.g0.N(29.66f) : getMeasuredWidth() - org.telegram.messenger.g0.N(24.33f);
        path.moveTo(N, measuredHeight - org.telegram.messenger.g0.N(5.66f));
        path.lineTo((org.telegram.messenger.g0.N(5.33f) * (gd.a0 ? -1 : 1)) + N, measuredHeight);
        path.lineTo(N, org.telegram.messenger.g0.N(5.66f) + measuredHeight);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.h.setColor(n6.r1(0.85f, n6.w0(n6.z6, this.n)));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
