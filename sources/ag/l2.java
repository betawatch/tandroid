package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.t80;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l2 extends LinearLayout implements k6 {
    public final p6 a;
    public final t80 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public l2(Context context, p6 p6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = p6Var;
        setOrientation(1);
        t80 t80Var = new t80();
        this.b = t80Var;
        int i10 = t6.G6;
        int w02 = t6.w0(i10, p6Var);
        t80Var.g(t6.r1(0.05f, w02), t6.r1(0.15f, w02), t6.r1(0.1f, w02), t6.r1(0.3f, w02));
        t80Var.k(4.0f);
        t80Var.x.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(cd.X ? 5 : 3);
        a7.V(textView, i10, p6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = cd.X;
        addView(textView, b6.t(-1, -2, 55, z10 ? 70 : 18, 10, z10 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(cd.X ? 5 : 3);
        z20.p(textView2, t6.z6, p6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = cd.X;
        addView(textView2, b6.t(-1, -2, 55, z11 ? 70 : 18, 0, z11 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.c.p0(ic.p(b30.b(tL_businessLocation.geo_point, org.telegram.messenger.i0.L(44.0f), org.telegram.messenger.i0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.p)))), "44_44", this.b, 0L, null, null, 0);
            } else {
                this.c.w0(null);
            }
        }
        this.e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float L = cd.X ? org.telegram.messenger.i0.L(16.0f) : getWidth() - org.telegram.messenger.i0.L(60.0f);
        float L2 = org.telegram.messenger.i0.L(8.0f);
        float L3 = org.telegram.messenger.i0.L(44.0f);
        float L4 = org.telegram.messenger.i0.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.y0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = t6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(cd.X ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.i0.L(cd.X ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        t80 t80Var = this.b;
        if (t80Var != null) {
            try {
                int w02 = t6.w0(t6.G6, this.a);
                t80Var.g(t6.r1(0.05f, w02), t6.r1(0.15f, w02), t6.r1(0.1f, w02), t6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
