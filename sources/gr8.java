// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gr8 extends LinearLayout implements tjb {
    public final wjb a;
    public final r86 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public gr8(Context context, wjb wjbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = wjbVar;
        setOrientation(1);
        r86 r86Var = new r86();
        this.b = r86Var;
        int i = bkb.F6;
        int v0 = bkb.v0(i, wjbVar);
        r86Var.g(bkb.p1(0.05f, v0), bkb.p1(0.15f, v0), bkb.p1(0.1f, v0), bkb.p1(0.3f, v0));
        r86Var.j(4.0f);
        r86Var.x.setStrokeWidth(gl.L(1.0f));
        imageReceiver.q0(gl.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(k96.a0 ? 5 : 3);
        zkb.X(textView, i, wjbVar);
        textView.setTextSize(1, 16.0f);
        boolean z = k96.a0;
        addView(textView, nme.t(-1, -2, 55, z ? 70 : 18, 10, z ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(k96.a0 ? 5 : 3);
        ug8.x(textView2, bkb.y6, wjbVar, null, 2131752677);
        textView2.setTextSize(1, 13.0f);
        boolean z2 = k96.a0;
        addView(textView2, nme.t(-1, -2, 55, z2 ? 70 : 18, 0, z2 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            TLRPC.GeoPoint geoPoint = tL_businessLocation.geo_point;
            ImageReceiver imageReceiver = this.c;
            if (geoPoint != null) {
                imageReceiver.c0(gl5.p(usc.b(tL_businessLocation.geo_point, gl.L(44.0f), gl.L(44.0f), 15, Math.min(2, (int) Math.ceil(gl.p)))), "44_44", this.b, 0L, null, null, 0);
            } else {
                imageReceiver.g0(null);
            }
        }
        this.e = z;
        setPadding(0, 0, 0, z ? 1 : 0);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float L = k96.a0 ? gl.L(16.0f) : getWidth() - gl.L(60.0f);
        float L2 = gl.L(8.0f);
        float L3 = gl.L(44.0f);
        float L4 = gl.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = bkb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            canvas.drawRect(gl.L(k96.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - gl.L(k96.a0 ? 21.33f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // tjb
    public final void updateColors() {
        r86 r86Var = this.b;
        if (r86Var != null) {
            try {
                int v0 = bkb.v0(bkb.F6, this.a);
                r86Var.g(bkb.p1(0.05f, v0), bkb.p1(0.15f, v0), bkb.p1(0.1f, v0), bkb.p1(0.3f, v0));
                invalidate();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
