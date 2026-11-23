package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.s;
import c8.na;
import c8.sa;
import di.eb;
import di.ua;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public a(Context context, i6 i6Var, ek0 ek0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new c6(this);
        this.b = i6Var;
        this.c = ek0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(n6.w0(n6.a7, (i6) this.b));
                ek0 ek0Var = (ek0) this.c;
                if (ek0Var != null) {
                    paint.setAlpha((int) (c6Var.e(false, ek0Var.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
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
        addView(frameLayout, na.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(g0.o());
        textView.setGravity(1);
        addView(textView, na.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        j80 j80Var = new j80(context, null);
        this.c = j80Var;
        j80Var.setTextSize(1, 14.0f);
        j80Var.setLineSpacing(g0.L(2.0f), 1.0f);
        j80Var.setGravity(1);
        addView(j80Var, na.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, na.r(-1, -2, 1));
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
        addView(textView, na.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        s sVar = new s(2, context, i6Var, true);
        this.c = sVar;
        sVar.setMinWidth(g0.L(200.0f));
        sVar.i(gd.N0(2131746521, null), false, true);
        addView(sVar, na.r(-2, 44, 17));
        gi.j jVar = new gi.j(context, i6Var);
        this.d = jVar;
        u6.U(jVar, i7, i6Var);
        jVar.setText(gd.N0(2131746507, null));
        jVar.setTextSize(1, 14.0f);
        jVar.setTextAlignment(4);
        jVar.setGravity(17);
        jVar.setTypeface(g0.o());
        addView(jVar, na.t(ks.v2, -2, 17, 0, 17, 0, 12));
        hi.e eVar = new hi.e(context, i6Var, false);
        this.e = eVar;
        eVar.setMinWidth(g0.L(200.0f));
        addView(eVar, na.r(-2, 44, 17));
    }

    public a(int i7, Context context, i6 i6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ua uaVar = new ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, na.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        this.b = mVar;
        vg.f fVar = mVar.b;
        fVar.z = n6.Wk;
        fVar.A = n6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, na.d(ks.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        eb ebVar = new eb(i7, context, i6Var);
        this.c = ebVar;
        sa.a(ebVar);
        ebVar.setOnClickListener(new d(this, 20));
        frameLayout.addView(ebVar, na.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, na.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        i5.c.x(textView, 1, 20.0f);
        int i10 = n6.j5;
        u6.U(textView, i10, i6Var);
        textView.setGravity(17);
        addView(textView, na.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, i10, i6Var);
        textView2.setGravity(17);
        addView(textView2, na.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
