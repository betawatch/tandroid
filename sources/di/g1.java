package di;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g1 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final FrameLayout b;
    public final bi.e2 c;
    public final org.telegram.ui.Components.i9 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final te.a r;
    public boolean s;
    public d1 w;

    public g1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new te.a(0, this, er.h, 320L, false);
        this.a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        bi.e2 e2Var = new bi.e2(frameLayout, e6Var, true);
        this.c = e2Var;
        frameLayout.setBackground(e2Var);
        e2Var.w = 1;
        addView(frameLayout, c8.ja.e(-1, -1, ns.E1));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.getImageReceiver().W(0);
        addView(i9Var, c8.ja.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, c8.ja.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), 285212671));
        addView(textView2, c8.ja.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(g1 g1Var, TLRPC.Document document, int i7, Object obj, boolean z10) {
        org.telegram.ui.Components.i9 i9Var = g1Var.d;
        if (document == null) {
            i9Var.b();
            g1Var.n = null;
            return;
        }
        if (g1Var.n == document) {
            return;
        }
        g1Var.n = document;
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
        pz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.a7, 0.3f, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i7);
        sb2.append("_");
        sb2.append(i7);
        sb2.append(z10 ? "_nolimit_pcache" : "");
        String sb3 = sb2.toString();
        i9Var.setLayoutParams(c8.ja.d(i7, i7, 49, 0.0f, r3 + 17, 0.0f, (80 - i7) / 2));
        i9Var.m(org.telegram.messenger.gc.b(document), sb3, org.telegram.messenger.gc.c(w10, document), sb3, f10, obj);
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        b();
    }

    public final void b() {
        int f10;
        bi.e2 e2Var = this.c;
        e2Var.z = null;
        Integer num = this.h;
        te.a aVar = this.r;
        TextView textView = this.f;
        if (num != null) {
            f10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.r1(org.telegram.messenger.g0.T1(0.15f, 1.0f, aVar.e), this.h.intValue()));
            e2Var.z = this.h;
            this.b.invalidate();
            textView.setTextColor(i0.a.f(aVar.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i7 = org.telegram.ui.ActionBar.j6.d6;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            int f11 = i0.a.f(aVar.e, i0.a.f(0.05f, x02, org.telegram.ui.ActionBar.j6.x0(null, i10, false)), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
            textView.setTextColor(i0.a.f(aVar.e, i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false)), -1));
            f10 = f11;
        } else {
            f10 = i0.a.f(0.5f, i0.a.o(this.w.a.center_color, ns.e4), i0.a.o(this.w.a.pattern_color, ns.e4));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(f10);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.j6.H1(textView.getBackground(), f10, false)) {
            textView.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        d1 d1Var;
        try {
            if (this.f != null && this.b != null && this.c != null) {
                if (this.h != null || this.s || ((d1Var = this.w) != null && d1Var.a != null)) {
                    b();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
