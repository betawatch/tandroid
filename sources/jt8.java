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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jt8 extends LinearLayout implements vlb {
    public final ylb a;
    public final qa6 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public jt8(Context context, ylb ylbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = ylbVar;
        setOrientation(1);
        qa6 qa6Var = new qa6();
        this.b = qa6Var;
        int i = cmb.F6;
        int v0 = cmb.v0(i, ylbVar);
        qa6Var.g(cmb.p1(0.05f, v0), cmb.p1(0.15f, v0), cmb.p1(0.1f, v0), cmb.p1(0.3f, v0));
        qa6Var.j(4.0f);
        qa6Var.x.setStrokeWidth(gm.L(1.0f));
        imageReceiver.q0(gm.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(jb6.a0 ? 5 : 3);
        anb.X(textView, i, ylbVar);
        textView.setTextSize(1, 16.0f);
        boolean z = jb6.a0;
        addView(textView, qoe.t(-1, -2, 55, z ? 70 : 18, 10, z ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        wi8.x(textView2, cmb.y6, ylbVar, null, 2131752642);
        textView2.setTextSize(1, 13.0f);
        boolean z2 = jb6.a0;
        addView(textView2, qoe.t(-1, -2, 55, z2 ? 70 : 18, 0, z2 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            TLRPC.GeoPoint geoPoint = tL_businessLocation.geo_point;
            ImageReceiver imageReceiver = this.c;
            if (geoPoint != null) {
                imageReceiver.c0(gn5.p(vuc.b(tL_businessLocation.geo_point, gm.L(44.0f), gm.L(44.0f), 15, Math.min(2, (int) Math.ceil(gm.p)))), "44_44", this.b, 0L, null, null, 0);
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
        float L = jb6.a0 ? gm.L(16.0f) : getWidth() - gm.L(60.0f);
        float L2 = gm.L(8.0f);
        float L3 = gm.L(44.0f);
        float L4 = gm.L(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = cmb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            canvas.drawRect(gm.L(jb6.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - gm.L(jb6.a0 ? 21.33f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // vlb
    public final void updateColors() {
        qa6 qa6Var = this.b;
        if (qa6Var != null) {
            try {
                int v0 = cmb.v0(cmb.F6, this.a);
                qa6Var.g(cmb.p1(0.05f, v0), cmb.p1(0.15f, v0), cmb.p1(0.1f, v0), cmb.p1(0.3f, v0));
                invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
