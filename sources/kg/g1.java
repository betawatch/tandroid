package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.d80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g1 extends LinearLayout implements z5 {
    public final e6 a;
    public final d80 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public g1(Context context, e6 e6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = e6Var;
        setOrientation(1);
        d80 d80Var = new d80();
        this.b = d80Var;
        int i7 = j6.G6;
        int w02 = j6.w0(i7, e6Var);
        d80Var.g(j6.r1(0.05f, w02), j6.r1(0.15f, w02), j6.r1(0.1f, w02), j6.r1(0.3f, w02));
        d80Var.k(4.0f);
        d80Var.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(hd.a0 ? 5 : 3);
        q6.U(textView, i7, e6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = hd.a0;
        addView(textView, ja.t(-1, -2, 55, z10 ? 70 : 18, 10, z10 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(hd.a0 ? 5 : 3);
        i20.q(textView2, j6.z6, e6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = hd.a0;
        addView(textView2, ja.t(-1, -2, 55, z11 ? 70 : 18, 0, z11 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.c.p0(gc.p(k20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), "44_44", this.b, 0L, null, null, 0);
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
        float L = hd.a0 ? org.telegram.messenger.g0.L(16.0f) : getWidth() - org.telegram.messenger.g0.L(60.0f);
        float L2 = org.telegram.messenger.g0.L(8.0f);
        float L3 = org.telegram.messenger.g0.L(44.0f);
        float L4 = org.telegram.messenger.g0.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.y0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = j6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = j6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(hd.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(hd.a0 ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        d80 d80Var = this.b;
        if (d80Var != null) {
            try {
                int w02 = j6.w0(j6.G6, this.a);
                d80Var.g(j6.r1(0.05f, w02), j6.r1(0.15f, w02), j6.r1(0.1f, w02), j6.r1(0.3f, w02));
                invalidate();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
