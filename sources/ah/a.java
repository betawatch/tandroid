package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.gc;
import bi.sc;
import bi.w;
import c8.ha;
import c8.ka;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final View c;
    public final Object d;
    public final Object e;

    public a(Context context, h6 h6Var, pj0 pj0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new v5(this);
        this.b = h6Var;
        this.c = pj0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                v5 v5Var = (v5) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(m6.w0(m6.a7, (h6) this.b));
                pj0 pj0Var = (pj0) this.c;
                if (pj0Var != null) {
                    paint.setAlpha((int) (v5Var.e(false, pj0Var.canScrollVertically(1) ? 1.0f : 0.0f) * 255.0f));
                } else {
                    paint.setAlpha((int) (v5Var.e(false, 1.0f) * 255.0f));
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
        addView(frameLayout, ha.r(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(g0.o());
        textView.setGravity(1);
        addView(textView, ha.q(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        w70 w70Var = new w70(context, null);
        this.c = w70Var;
        w70Var.setTextSize(1, 14.0f);
        w70Var.setLineSpacing(g0.L(2.0f), 1.0f);
        w70Var.setGravity(1);
        addView(w70Var, ha.q(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, ha.r(-1, -2, 1));
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
        addView(textView, ha.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        w wVar = new w(1, context, h6Var, true);
        this.c = wVar;
        wVar.setMinWidth(g0.L(200.0f));
        wVar.i(id.M0(2131746715, null), false, true);
        addView(wVar, ha.r(-2, 44, 17));
        ei.k kVar = new ei.k(context, h6Var);
        this.d = kVar;
        t6.U(kVar, i7, h6Var);
        kVar.setText(id.M0(2131746703, null));
        kVar.setTextSize(1, 14.0f);
        kVar.setTextAlignment(4);
        kVar.setGravity(17);
        kVar.setTypeface(g0.o());
        addView(kVar, ha.t(qs.v2, -2, 17, 0, 17, 0, 12));
        fi.d dVar = new fi.d(context, h6Var, false);
        this.e = dVar;
        dVar.setMinWidth(g0.L(200.0f));
        addView(dVar, ha.r(-2, 44, 17));
    }

    public a(int i7, Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        gc gcVar = new gc(context, 70, 0, 0);
        frameLayout.addView(gcVar, ha.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        this.b = mVar;
        vg.f fVar = mVar.b;
        fVar.z = m6.Tk;
        fVar.A = m6.Uk;
        fVar.b();
        mVar.setStarParticlesView(gcVar);
        frameLayout.addView(mVar, ha.d(qs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        sc scVar = new sc(i7, context, h6Var);
        this.c = scVar;
        ka.a(scVar);
        scVar.setOnClickListener(new d(this, 12));
        frameLayout.addView(scVar, ha.d(-2, -2.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, ha.c(150.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i10 = m6.j5;
        t6.U(textView, i10, h6Var);
        textView.setGravity(17);
        addView(textView, ha.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, i10, h6Var);
        textView2.setGravity(17);
        addView(textView2, ha.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
