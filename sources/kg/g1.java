package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a80;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g1 extends LinearLayout implements c6 {
    public final h6 a;
    public final a80 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public g1(Context context, h6 h6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = h6Var;
        setOrientation(1);
        a80 a80Var = new a80();
        this.b = a80Var;
        int i7 = m6.G6;
        int w02 = m6.w0(i7, h6Var);
        a80Var.g(m6.r1(0.05f, w02), m6.r1(0.15f, w02), m6.r1(0.1f, w02), m6.r1(0.3f, w02));
        a80Var.k(4.0f);
        a80Var.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(id.a0 ? 5 : 3);
        t6.U(textView, i7, h6Var);
        textView.setTextSize(1, 16.0f);
        boolean z9 = id.a0;
        addView(textView, ha.t(-1, -2, 55, z9 ? 70 : 18, 10, z9 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(id.a0 ? 5 : 3);
        org.telegram.messenger.camera.q.o(textView2, m6.z6, h6Var, null, 2131752689);
        textView2.setTextSize(1, 13.0f);
        boolean z10 = id.a0;
        addView(textView2, ha.t(-1, -2, 55, z10 ? 70 : 18, 0, z10 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z9) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.c.p0(hc.p(m20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), "44_44", this.b, 0L, null, null, 0);
            } else {
                this.c.w0(null);
            }
        }
        this.e = z9;
        setPadding(0, 0, 0, z9 ? 1 : 0);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float L = id.a0 ? org.telegram.messenger.g0.L(16.0f) : getWidth() - org.telegram.messenger.g0.L(60.0f);
        float L2 = org.telegram.messenger.g0.L(8.0f);
        float L3 = org.telegram.messenger.g0.L(44.0f);
        float L4 = org.telegram.messenger.g0.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.y0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = m6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = m6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(id.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(id.a0 ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        a80 a80Var = this.b;
        if (a80Var != null) {
            try {
                int w02 = m6.w0(m6.G6, this.a);
                a80Var.g(m6.r1(0.05f, w02), m6.r1(0.15f, w02), m6.r1(0.1f, w02), m6.r1(0.3f, w02));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
