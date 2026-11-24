// default package

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kg1 extends FrameLayout {
    public int E;
    public final ig1 F;
    public final o39 G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public byte M;
    public byte N;
    public int O;
    public int P;
    public final long a;
    public final int b;
    public final uxa c;
    public TL_stories.TL_premium_boostsStatus d;
    public final wjb e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public kg1(uxa uxaVar, long j, wjb wjbVar) {
        super(uxaVar.getParentActivity());
        int i = y6c.t0;
        this.b = i;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        ig1 ig1Var = new ig1(this);
        this.F = ig1Var;
        this.K = "";
        this.L = "";
        this.M = (byte) 5;
        this.N = (byte) 5;
        this.c = uxaVar;
        Activity parentActivity = uxaVar.getParentActivity();
        this.e = wjbVar;
        this.a = j;
        this.J = na7.q1(i).K0(Long.valueOf(-j));
        o39 o39Var = new o39(parentActivity, null);
        this.G = o39Var;
        o39Var.setSections(true);
        o39Var.setCaptureSectionsDecoratorAllowed(true);
        o39Var.setLayoutManager(new t26());
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        o39Var.setItemAnimator(gb3Var);
        o39Var.setClipToPadding(false);
        o39Var.setOnItemClickListener(new gg1(this, parentActivity, j, wjbVar, uxaVar));
        addView(o39Var);
        na7.q1(i).E0().a(j, new be2(this, (byte) 14));
        o39Var.setAdapter(ig1Var);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        ry8 ry8Var = new ry8(context);
        ry8Var.setAutoRepeat(true);
        ry8Var.f(R.raw.statistic_preload, 120, 120, null);
        ry8Var.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        int i2 = bkb.Ej;
        zkb.X(textView, i2, null);
        textView.setTag(Integer.valueOf(i2));
        textView.setText(k96.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = bkb.Fj;
        zkb.X(textView2, i3, null);
        textView2.setTag(Integer.valueOf(i3));
        textView2.setText(k96.M0(2131748584, null));
        textView2.setGravity(1);
        this.I.addView(ry8Var, nme.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(textView, nme.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, nme.r(-2, -2, 1));
        addView(this.I, nme.d(kk7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        gta.v(i, false).s();
    }

    public final void a(CountDownLatch countDownLatch, hg1 hg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i = this.b;
        tL_premium_getBoostsList.peer = na7.q1(i).h1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new en0((Object) this, (Object) countDownLatch, (Object) hg1Var, (byte) 13), 2);
    }

    public final void b(CountDownLatch countDownLatch, hg1 hg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i = this.b;
        tL_premium_getBoostsList.peer = na7.q1(i).h1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new en0((Object) this, (Object) countDownLatch, (Object) hg1Var, (byte) 12), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        byte b = 1;
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new hg1(this, (byte) 0));
        } else if (bool.booleanValue()) {
            b(null, new hg1(this, b));
        } else {
            a(null, new hg1(this, (byte) 2));
        }
    }

    public final void d(boolean z) {
        ArrayList arrayList = new ArrayList(this.y);
        this.y.clear();
        if (this.d != null) {
            this.y.add(new jg1(4, false));
            this.y.add(new jg1(1, k96.M0(2131744658, null)));
            this.y.add(new jg1(0, false));
            this.y.add(new jg1(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                this.y.add(new jg1(12, k96.M0(2131753321, null)));
                int i = 0;
                while (i < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i);
                    ArrayList arrayList2 = this.y;
                    boolean z2 = i == this.d.prepaid_giveaways.size() - 1;
                    jg1 jg1Var = new jg1(11, true);
                    jg1Var.e = prepaidGiveaway;
                    jg1Var.f = z2;
                    arrayList2.add(jg1Var);
                    i++;
                }
                this.y.add(new jg1(6, k96.M0(2131753283, null)));
            }
            this.y.add(new jg1(13, k96.M0(2131753603, null)));
            if (this.E == 0) {
                if (this.h.isEmpty()) {
                    this.y.add(new jg1(8, false));
                    this.y.add(new jg1(2, false));
                } else {
                    int i2 = 0;
                    while (i2 < this.h.size()) {
                        this.y.add(new jg1((TL_stories.Boost) this.h.get(i2), i2 == this.h.size() - 1 && !this.r, this.E));
                        i2++;
                    }
                    boolean z3 = this.r;
                    ArrayList arrayList3 = this.y;
                    if (z3) {
                        arrayList3.add(new jg1(9, true));
                    } else {
                        arrayList3.add(new jg1(7, false));
                    }
                    this.y.add(new jg1(6, k96.M0(hc2.V(this.J) ? 2131753602 : 2131753601, null)));
                }
            } else if (this.n.isEmpty()) {
                this.y.add(new jg1(8, false));
                this.y.add(new jg1(2, false));
            } else {
                int i3 = 0;
                while (i3 < this.n.size()) {
                    this.y.add(new jg1((TL_stories.Boost) this.n.get(i3), i3 == this.n.size() - 1 && !this.w, this.E));
                    i3++;
                }
                boolean z4 = this.w;
                ArrayList arrayList4 = this.y;
                if (z4) {
                    arrayList4.add(new jg1(9, true));
                } else {
                    arrayList4.add(new jg1(7, false));
                }
                this.y.add(new jg1(6, k96.M0(hc2.V(this.J) ? 2131753602 : 2131753601, null)));
            }
            this.y.add(new jg1(1, k96.M0(2131748722, null)));
            this.y.add(new jg1(3, this.d.boost_url));
            if (na7.q1(this.b).k4.O1.f && hc2.N(this.J)) {
                this.y.add(new jg1(6, k96.M0(hc2.V(this.J) ? 2131753266 : 2131753265, null)));
                this.y.add(new jg1(10, true));
                this.y.add(new jg1(6, k96.M0(hc2.V(this.J) ? 2131753500 : 2131753499, null)));
            }
        }
        ig1 ig1Var = this.F;
        if (z) {
            ig1Var.E(arrayList, this.y);
        } else {
            ig1Var.f();
        }
    }
}
