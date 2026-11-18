package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s;
import c8.ma;
import c8.ra;
import di.eb;
import di.ua;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public a(Context context, i6 i6Var, ck0 ck0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new c6(this);
        this.b = i6Var;
        this.c = ck0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(n6.w0(n6.a7, (i6) this.b));
                ck0 ck0Var = (ck0) this.c;
                if (ck0Var != null) {
                    paint.setAlpha((int) (c6Var.e(false, ck0Var.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
                } else {
                    paint.setAlpha((int) (c6Var.e(false, 1.0f) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), g0.f1(), paint);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    public a(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, ma.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(g0.o());
        textView.setGravity(1);
        addView(textView, ma.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        k80 k80Var = new k80(context, null);
        this.c = k80Var;
        k80Var.setTextSize(1, 14.0f);
        k80Var.setLineSpacing(g0.L(2.0f), 1.0f);
        k80Var.setGravity(1);
        addView(k80Var, ma.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, ma.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, i6 i6Var) {
        super(context);
        setPadding(g0.L(24.0f), g0.L(21.0f), g0.L(24.0f), g0.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        int i7 = n6.y6;
        u6.U(textView, i7, i6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, ma.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        s sVar = new s(2, context, i6Var, true);
        this.c = sVar;
        sVar.setMinWidth(g0.L(200.0f));
        sVar.i(gd.M0(2131746522, null), false, true);
        addView(sVar, ma.r(-2, 44, 17));
        gi.j jVar = new gi.j(context, i6Var);
        this.d = jVar;
        u6.U(jVar, i7, i6Var);
        jVar.setText(gd.M0(2131746508, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        addView(jVar, ma.t(ks.v2, -2, 17, 0, 17, 0, 12));
        hi.d dVar = new hi.d(context, i6Var, false);
        this.e = dVar;
        dVar.setMinWidth(g0.L(200.0f));
        addView(dVar, ma.r(-2, 44, 17));
    }

    public a(int i7, Context context, i6 i6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ua uaVar = new ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, ma.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        this.b = mVar;
        vg.f fVar = mVar.b;
        fVar.z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, ma.d(ks.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        eb ebVar = new eb(i7, context, i6Var);
        this.c = ebVar;
        ra.a(ebVar);
        ebVar.setOnClickListener(new d(this, 21));
        frameLayout.addView(ebVar, ma.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, ma.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        i5.c.x(textView, 1, 20.0f);
        int i10 = n6.j5;
        u6.U(textView, i10, i6Var);
        textView.setGravity(17);
        addView(textView, ma.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, i10, i6Var);
        textView2.setGravity(17);
        addView(textView2, ma.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
