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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public a(Context context, h6 h6Var, ek0 ek0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new d6(this);
        this.b = h6Var;
        this.c = ek0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                d6 d6Var = (d6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(m6.w0(m6.a7, (h6) this.b));
                ek0 ek0Var = (ek0) this.c;
                if (ek0Var != null) {
                    paint.setAlpha((int) (d6Var.e(false, ek0Var.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
                } else {
                    paint.setAlpha((int) (d6Var.e(false, 1.0f) * 255.0f));
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
        m80 m80Var = new m80(context, null);
        this.c = m80Var;
        m80Var.setTextSize(1, 14.0f);
        m80Var.setLineSpacing(g0.L(2.0f), 1.0f);
        m80Var.setGravity(1);
        addView(m80Var, ma.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, ma.r(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public a(Context context, h6 h6Var) {
        super(context);
        setPadding(g0.L(24.0f), g0.L(21.0f), g0.L(24.0f), g0.L(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.b = textView;
        int i7 = m6.y6;
        t6.U(textView, i7, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, ma.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        s sVar = new s(2, context, h6Var, true);
        this.c = sVar;
        sVar.setMinWidth(g0.L(200.0f));
        sVar.i(gd.N0(2131746521, null), false, true);
        addView(sVar, ma.r(-2, 44, 17));
        gi.j jVar = new gi.j(context, h6Var);
        this.d = jVar;
        t6.U(jVar, i7, h6Var);
        jVar.setText(gd.N0(2131746507, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        addView(jVar, ma.t(ks.v2, -2, 17, 0, 17, 0, 12));
        hi.e eVar = new hi.e(context, h6Var, false);
        this.e = eVar;
        eVar.setMinWidth(g0.L(200.0f));
        addView(eVar, ma.r(-2, 44, 17));
    }

    public a(int i7, Context context, h6 h6Var) {
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
        fVar.z = m6.Wk;
        fVar.A = m6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, ma.d(ks.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        eb ebVar = new eb(i7, context, h6Var);
        this.c = ebVar;
        ra.a(ebVar);
        ebVar.setOnClickListener(new d(this, 20));
        frameLayout.addView(ebVar, ma.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, ma.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        i5.c.x(textView, 1, 20.0f);
        int i10 = m6.j5;
        t6.U(textView, i10, h6Var);
        textView.setGravity(17);
        addView(textView, ma.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, i10, h6Var);
        textView2.setGravity(17);
        addView(textView2, ma.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
