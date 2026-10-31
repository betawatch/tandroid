package ih;

import ag.a1;
import ag.t0;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ig.c0;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.l0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gr;
import org.telegram.ui.lg;
import org.telegram.ui.un;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, k6 {
    public final int[] D;
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final fe.b H;
    public final fe.b I;
    public final b a;
    public final c b;
    public final e c;
    public final un d;
    public final FrameLayout.LayoutParams e;
    public final u5 f;
    public f h;
    public q1 n;
    public int r;
    public lg s;
    public final a5 w;
    public final a5 x;
    public final int y;

    public d(Activity activity, p6 p6Var, un unVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.D = new int[2];
        this.E = new Rect();
        int i10 = 1;
        c0 c0Var = new c0(this, i10);
        gr grVar = gr.h;
        this.H = new fe.b(0, c0Var, grVar, 380L, false);
        this.I = new fe.b(0, new c0(this, i10), grVar, 380L, false);
        this.d = unVar;
        this.y = ((l0) unVar.getMessagesController().y7.I.a).c;
        b bVar = new b(this, activity, p6Var, 0);
        this.a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        a7.V(bVar, t6.G6, p6Var);
        a7.H(bVar, t6.Uc, p6Var);
        a7.E(bVar, t6.H6, p6Var);
        bVar.setHint(cd.L0(2131747198, null));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | TLObject.FLAG_14);
        bVar.addTextChangedListener(new a1(this, 3));
        c cVar = new c(activity, 0);
        this.b = cVar;
        int i11 = t6.Ji;
        y h02 = t6.h0(t6.w0(i11, p6Var), 1, -1);
        w6 N = a7.N(i11);
        cVar.setBackground(h02);
        a7.k(cVar, h02, null, N, p6Var);
        e6.a(cVar);
        e eVar = new e(getContext(), 36);
        this.c = eVar;
        y h03 = t6.h0(t6.w0(i11, p6Var), 1, -1);
        w6 N2 = a7.N(i11);
        eVar.setBackground(h03);
        a7.k(eVar, h03, null, N2, p6Var);
        eVar.setOnClickListener(new t0(5, this, unVar));
        e6.a(eVar);
        u5 u5Var = new u5(getContext());
        this.f = u5Var;
        u5Var.setTextSize(13);
        u5Var.setGravity(17);
        u5Var.setTranslationY(i0.L(44.0f));
        u5Var.setVisibility(8);
        a5 a5Var = new a5(activity, 4);
        this.x = a5Var;
        addView(a5Var, layoutParams);
        a5 a5Var2 = new a5(activity, 3);
        this.w = a5Var2;
        a5Var.addView(a5Var2, b6.c(-2.0f, -1));
        a5Var2.addView(u5Var, b6.e(54, 24, 53));
        a5Var2.addView(cVar, b6.e(44, 44, 51));
        a5Var2.addView(eVar, b6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        a5Var2.addView(bVar, b6.d(-1, -2.0f, zs.E1, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(i0.L(5.0f), i0.L(11.0f), i0.L(5.0f), i0.L(11.0f));
    }

    public static void a(d dVar) {
        u5 u5Var = dVar.f;
        f10.d(u5Var, dVar.H.e);
        int i10 = t6.A6;
        un unVar = dVar.d;
        u5Var.setTextColor(i0.b.f(dVar.I.e, t6.w0(i10, unVar.getResourceProvider()), t6.w0(t6.p7, unVar.getResourceProvider())));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.A6));
        hashSet.add(Integer.valueOf(t6.p7));
    }

    public f getAttachedMedia() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.F.removeOnPreDrawListener(this);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w1 w1Var;
        kh.a aVar;
        q1 q1Var = this.n;
        if (q1Var != null) {
            int f12 = q1Var.getMessageObject().f1();
            if (this.n.isAttachedToWindow() && this.r == f12 && (w1Var = this.n.v2) != null && (aVar = w1Var.l) != null && w1Var.s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                q1 q1Var2 = this.n;
                int[] iArr = this.D;
                q1Var2.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                a5 a5Var = this.x;
                if (i12 != width) {
                    layoutParams.width = width;
                    a5Var.setLayoutParams(layoutParams);
                }
                a5Var.setTranslationX(rect.left);
                a5Var.setTranslationY(i0.L(0.66f) + rect.top);
                return true;
            }
            lg lgVar = this.s;
            if (lgVar != null) {
                lgVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.w.setAlpha(f7);
    }

    public void setCellToWatch(q1 q1Var) {
        this.n = q1Var;
        this.r = q1Var.getMessageObject().f1();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            c cVar = this.b;
            ((Drawable) cVar.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) cVar.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.c.c).setColorFilter(porterDuffColorFilter);
            b bVar = this.a;
            bVar.setCursorColor(i10);
            bVar.setHandlesColor(i10);
            bVar.setHintTextColor(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        un unVar;
        try {
            u5 u5Var = this.f;
            if (u5Var == null || (unVar = this.d) == null) {
                return;
            }
            u5Var.setTextColor(i0.b.f(this.I.e, t6.w0(t6.A6, unVar.getResourceProvider()), t6.w0(t6.p7, unVar.getResourceProvider())));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
