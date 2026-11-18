package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j1 extends LinearLayout implements c6 {
    public final i6 a;
    public final o80 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public j1(Context context, i6 i6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = i6Var;
        setOrientation(1);
        o80 o80Var = new o80();
        this.b = o80Var;
        int i7 = n6.G6;
        int w02 = n6.w0(i7, i6Var);
        o80Var.g(n6.r1(0.05f, w02), n6.r1(0.15f, w02), n6.r1(0.1f, w02), n6.r1(0.3f, w02));
        o80Var.k(4.0f);
        o80Var.x.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(gd.a0 ? 5 : 3);
        u6.U(textView, i7, i6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = gd.a0;
        addView(textView, ma.t(-1, -2, 55, z10 ? 70 : 18, 10, z10 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(gd.a0 ? 5 : 3);
        n10.r(textView2, n6.z6, i6Var, null, 2131752678);
        textView2.setTextSize(1, 13.0f);
        boolean z11 = gd.a0;
        addView(textView2, ma.t(-1, -2, 55, z11 ? 70 : 18, 0, z11 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.c.p0(fc.p(h20.b(tL_businessLocation.geo_point, org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.L(44.0f), 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), "44_44", this.b, 0L, null, null, 0);
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
        float L = gd.a0 ? org.telegram.messenger.g0.L(16.0f) : getWidth() - org.telegram.messenger.g0.L(60.0f);
        float L2 = org.telegram.messenger.g0.L(8.0f);
        float L3 = org.telegram.messenger.g0.L(44.0f);
        float L4 = org.telegram.messenger.g0.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.y0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint W0 = n6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = n6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(gd.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(gd.a0 ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        o80 o80Var = this.b;
        if (o80Var != null) {
            try {
                int w02 = n6.w0(n6.G6, this.a);
                o80Var.g(n6.r1(0.05f, w02), n6.r1(0.15f, w02), n6.r1(0.1f, w02), n6.r1(0.3f, w02));
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
