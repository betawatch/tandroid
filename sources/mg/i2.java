package mg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.j20;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m10;
import org.telegram.ui.t10;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class i2 extends ha implements us {
    public static b2 B2;
    public int A2;
    public final int P1;
    public final g2 Q1;
    public final f2 R1;
    public final bi.t0 S1;
    public final e2 T1;
    public final ep U1;
    public final m10 V1;
    public final FrameLayout W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final HashMap d2;
    public final ArrayList e2;
    public final LinkedHashMap f2;
    public String g2;
    public ng.i h2;
    public int i2;
    public final ArrayList j2;
    public boolean k2;
    public float l2;
    public d2 m2;
    public final org.telegram.messenger.w1 n2;
    public final c2 o2;
    public int p2;
    public eq q2;
    public String r2;
    public t10 s2;
    public q20 t2;
    public final HashSet u2;
    public j20 v2;
    public eq w2;
    public eq x2;
    public boolean y2;
    public boolean z2;

    public i2(Context context, int i10, org.telegram.messenger.w1 w1Var, int i11, p6 p6Var) {
        super(context, null, true, false, p6Var);
        float f7;
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        this.a2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b2 = arrayList2;
        this.c2 = new ArrayList();
        this.d2 = new HashMap();
        this.e2 = new ArrayList();
        this.f2 = new LinkedHashMap();
        this.i2 = org.telegram.messenger.i0.L(120.0f);
        this.j2 = new ArrayList();
        int i12 = 0;
        this.k2 = false;
        this.o2 = new c2(this, i12);
        this.p2 = -1;
        this.u2 = new HashSet();
        this.a = i10;
        int i13 = t6.h5;
        Q(i13);
        this.s = false;
        this.P1 = i11;
        this.n2 = w1Var;
        ng.i iVar = this.h2;
        int i14 = 4;
        if (iVar != null) {
            iVar.y = i11 == 4;
        }
        e2 e2Var = new e2(i12, getContext(), p6Var);
        this.T1 = e2Var;
        e2Var.setOnCloseClickListener(new w1(this, 11));
        e2Var.setText(O0());
        e2Var.setCloseImageVisible(false);
        e2Var.f.c(false, 0.0f);
        this.m2 = new d2(this, 0);
        f2 f2Var = new f2(this, getContext(), p6Var, i12);
        this.R1 = f2Var;
        a7.i(i13, f2Var, p6Var);
        f2Var.setOnSearchTextChange(new x1(this, 3));
        f2Var.b.r(cd.L0((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 2131745853 : 2131749659, null), false);
        bi.t0 t0Var = new bi.t0(this, getContext(), i14);
        this.S1 = t0Var;
        ViewGroup viewGroup = this.b;
        int i15 = this.t0;
        viewGroup.addView(e2Var, 0, b6.f(-2.0f, -1, 55, i15, 0, i15, 0));
        ViewGroup viewGroup2 = this.b;
        int i16 = this.t0;
        viewGroup2.addView(f2Var, b6.f(-2.0f, -1, 55, i16, 0, i16, 0));
        ViewGroup viewGroup3 = this.b;
        int i17 = this.t0;
        viewGroup3.addView(t0Var, b6.f(1.0f, -1, 55, i17, 0, i17, 0));
        m10 m10Var = new m10(getContext(), p6Var, (tk0) null);
        this.V1 = m10Var;
        m10Var.setClickable(true);
        m10Var.setOrientation(1);
        m10Var.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
        a7.i(i13, m10Var, p6Var);
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i18 = t6.i6;
            org.telegram.ui.Cells.y a02 = t6.a0(t6.w0(i18, this.I0), 6, 6);
            w6 N = a7.N(i18);
            linearLayout.setBackground(a02);
            a7.k(linearLayout, a02, null, N, p6Var);
            ep epVar = new ep(24, context, p6Var);
            this.U1 = epVar;
            epVar.b(t6.Ci, t6.j7, t6.k7);
            epVar.setDrawUnchecked(true);
            epVar.a(false, false);
            epVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(epVar, b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            a7.V(textView, t6.j5, p6Var);
            sc.e.u(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
            e6.b(linearLayout, 0.025f, 1.5f);
            final int i19 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: mg.a2
                public final /* synthetic */ i2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            this.b.U1.a(!r3.a.q, true);
                            break;
                        default:
                            this.b.k1();
                            break;
                    }
                }
            });
            m10Var.addView(linearLayout, b6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        g2 g2Var = new g2(this, getContext(), p6Var, 0);
        this.Q1 = g2Var;
        if (i11 == 4) {
            f7 = 0.0f;
            m10Var.setAlpha(0.0f);
            m10Var.setVisibility(8);
        } else {
            f7 = 0.0f;
        }
        final int i20 = 1;
        g2Var.setOnClickListener(new View.OnClickListener(this) { // from class: mg.a2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        this.b.U1.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.k1();
                        break;
                }
            }
        });
        m10Var.addView(g2Var, b6.r(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.b;
            int i21 = this.t0;
            viewGroup4.addView(m10Var, b6.f(-2.0f, -1, 87, i21, 0, i21, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        ViewGroup viewGroup5 = this.b;
        int i22 = this.t0;
        viewGroup5.addView(frameLayout, b6.f(300.0f, -1, 87, i22, 0, i22, org.telegram.messenger.i0.L(68.0f)));
        ng.i iVar2 = this.h2;
        tk0 tk0Var = this.k1;
        iVar2.n = arrayList;
        iVar2.f = tk0Var;
        int i23 = this.t0;
        tk0Var.setPadding(i23, 0, i23, org.telegram.messenger.i0.L(i11 != 1 ? 60.0f : f7));
        this.k1.j(new ag.u(this, 7));
        this.k1.setOnItemClickListener(new m4.s0(this, i11, p6Var, i10));
        int i24 = 4;
        if (i11 == 4) {
            this.k1.setOnItemLongClickListener((jk0) new i2.q(this, i11, i24));
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(gr.h);
        int i25 = 0;
        jVar.C = false;
        jVar.m = false;
        this.k1.setItemAnimator(jVar);
        this.k1.i(new u1(this, 1));
        f2Var.setText("");
        f2Var.d.b(false);
        f2Var.b(false, hashSet, new w1(this, 12), null);
        e2Var.setText(O0());
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ui.b0(this.a).i1);
        }
        p1(false, true);
        if (i11 == 0 || i11 == 2) {
            k0.j(i10, null, new x1(this, i25));
        }
        if (i11 == 0 || i11 == 2) {
            rh.e6.y(i10, false).U();
        }
    }

    public static boolean i1(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    l1(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String uri = data.toString();
                if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                    l1(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static i2 l1(int i10, org.telegram.messenger.w1 w1Var) {
        k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return null;
        }
        b2 b2Var = B2;
        if (b2Var != null) {
            return b2Var;
        }
        b2 b2Var2 = new b2(Q.getContext(), Q.getCurrentAccount(), w1Var, i10, Q.getResourceProvider());
        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(Q)) {
            b2Var2.a0(Q);
        }
        Q.showDialog(b2Var2);
        B2 = b2Var2;
        return b2Var2;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        B2 = null;
        org.telegram.messenger.i0.r(this.o2);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        ng.i iVar = new ng.i(getContext(), this.I0, false);
        this.h2 = iVar;
        iVar.s = true;
        return iVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        String str = this.r2;
        if (str != null) {
            return str;
        }
        int i10 = this.P1;
        if (i10 != 0) {
            if (i10 == 1) {
                return cd.L0(2131749616, null);
            }
            if (i10 != 2) {
                return i10 != 4 ? cd.L0(2131749609, null) : cd.L0(2131743451, null);
            }
        }
        return cd.L0(2131749610, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void R0(Canvas canvas, int i10) {
        float max = Math.max(i10, org.telegram.messenger.i0.m - org.telegram.messenger.i0.L(8.0f)) + org.telegram.messenger.i0.L(8.0f);
        e2 e2Var = this.T1;
        e2Var.setTranslationY(max);
        float translationY = e2Var.getTranslationY() + e2Var.getMeasuredHeight();
        f2 f2Var = this.R1;
        f2Var.setTranslationY(translationY);
        float translationY2 = f2Var.getTranslationY() + f2Var.getMeasuredHeight();
        this.S1.setTranslationY(translationY2);
        this.k1.setTranslationY((r2.getMeasuredHeight() + (f2Var.getMeasuredHeight() + e2Var.getMeasuredHeight())) - org.telegram.messenger.i0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void c0(Configuration configuration) {
        o1(false, true);
    }

    public final int d1(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !h20.A(user.id)) {
                long j10 = user.id;
                if (j10 != 0 && !this.u2.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.Z1;
                    hashSet.contains(valueOf);
                    i10 += org.telegram.messenger.i0.L(56.0f);
                    ng.h c10 = ng.h.c(user, hashSet.contains(Long.valueOf(user.id)));
                    g1(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int L = org.telegram.messenger.i0.L(32.0f) + i10;
        arrayList.add(ng.h.b(str));
        arrayList.addAll(arrayList3);
        return L;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.S2) {
            dismiss();
            return;
        }
        if (i10 == zs.O) {
            org.telegram.messenger.i0.g3(new w1(this, 0));
        } else if (i10 == zs.S0) {
            org.telegram.messenger.i0.g3(new w1(this, 6));
        } else if (i10 == zs.E0) {
            org.telegram.messenger.i0.g3(new w1(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        org.telegram.messenger.i0.v1(this.R1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i10;
        if (!this.Z1.isEmpty() || (i10 = this.P1) == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            if (this.k2) {
                return;
            }
            this.k2 = true;
            org.telegram.messenger.i0.h3(new w1(this, 3), 10L);
            return;
        }
        if (this.k2) {
            this.k2 = false;
            org.telegram.messenger.i0.h3(new w1(this, 4), 10L);
        }
    }

    public final void f1() {
        if (TextUtils.isEmpty(this.g2)) {
            return;
        }
        this.g2 = null;
        this.R1.setText("");
        org.telegram.messenger.i0.r(this.o2);
        o1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [mg.y1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [mg.y1] */
    public final ng.h g1(ng.h hVar) {
        int i10 = this.P1;
        if (i10 != 4) {
            hVar.n = i10 == 3 ? null : new ag.t0(10, this, hVar.c);
            return hVar;
        }
        TLRPC.User user = hVar.c;
        if (user == null) {
            return hVar;
        }
        final long j10 = user.id;
        final int i11 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: mg.y1
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        i2 i2Var = this.b;
                        HashSet hashSet = i2Var.Z1;
                        hashSet.add(Long.valueOf(j10));
                        j20 j20Var = i2Var.v2;
                        if (j20Var != null) {
                            j20Var.a(Boolean.FALSE, hashSet);
                            i2Var.v2 = null;
                        }
                        i2Var.dismiss();
                        break;
                    default:
                        i2 i2Var2 = this.b;
                        HashSet hashSet2 = i2Var2.Z1;
                        hashSet2.add(Long.valueOf(j10));
                        j20 j20Var2 = i2Var2.v2;
                        if (j20Var2 != null) {
                            j20Var2.a(Boolean.TRUE, hashSet2);
                            i2Var2.v2 = null;
                        }
                        i2Var2.dismiss();
                        break;
                }
            }
        };
        final int i12 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: mg.y1
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i2 i2Var = this.b;
                        HashSet hashSet = i2Var.Z1;
                        hashSet.add(Long.valueOf(j10));
                        j20 j20Var = i2Var.v2;
                        if (j20Var != null) {
                            j20Var.a(Boolean.FALSE, hashSet);
                            i2Var.v2 = null;
                        }
                        i2Var.dismiss();
                        break;
                    default:
                        i2 i2Var2 = this.b;
                        HashSet hashSet2 = i2Var2.Z1;
                        hashSet2.add(Long.valueOf(j10));
                        j20 j20Var2 = i2Var2.v2;
                        if (j20Var2 != null) {
                            j20Var2.a(Boolean.TRUE, hashSet2);
                            i2Var2.v2 = null;
                        }
                        i2Var2.dismiss();
                        break;
                }
            }
        };
        hVar.o = r22;
        hVar.p = r32;
        return hVar;
    }

    public final int h1() {
        if (this.P1 == 4) {
            return Math.max(0, (vp.r1(this.a).Q6 - this.u2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z10) {
        ArrayList arrayList = this.a2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(i5.r(this.a).e0);
            this.d2.putAll(i5.r(this.a).g0);
            this.e2.addAll(i5.r(this.a).h0);
            if (z10) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.Z1;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.j2;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.P1;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f2.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.i0.v1(this.R1.getEditText());
                if (i10 == 1) {
                    return;
                }
                if (i10 == 4) {
                    j20 j20Var = this.v2;
                    if (j20Var != null) {
                        ep epVar = this.U1;
                        j20Var.a(Boolean.valueOf(epVar != null && epVar.a.q), hashSet);
                        this.v2 = null;
                    }
                    dismiss();
                    return;
                }
                List c10 = k0.c(k0.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (h20.b(vp.r1(d20.s0).a2(j10))) {
                        z20.s(cd.a0(null, null, 2131743768, o5.t(j10)), new cc(this.c, this.I0), R.raw.error, 36);
                        return;
                    }
                    ph.l1 l1Var = new ph.l1(getContext(), this.a, j10, c10, new x1(this, r5 ? 1 : 0));
                    org.telegram.messenger.w1 w1Var = this.n2;
                    l1Var.e1(w1Var != null && w1Var.a(j10));
                    l1Var.show();
                }
            }
        }
    }

    public final void m1() {
        String H = this.P1 == 4 ? cd.H(',', "UserSelectorLimit", h1()) : cd.L0(2131753272, null);
        p6 p6Var = this.I0;
        p2 p2Var = this.c;
        new cc(p2Var, p6Var).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            p2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z10) {
        g2 g2Var = this.Q1;
        g2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.P1;
        HashSet hashSet = this.Z1;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) cd.L0(2131752623, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) cd.L0(2131749670, "GiftPremiumProceedBtn"));
        } else if (cd.X) {
            spannableStringBuilder.append((CharSequence) cd.L0(2131749683, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.m2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.m2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) cd.L0(2131749683, "GiftPremiumChooseRecipientsBtn"));
        }
        g2Var.c(hashSet.size(), true);
        g2Var.i(spannableStringBuilder, z10, false);
        g2Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(boolean z10, boolean z11) {
        float f7;
        float f10;
        int L;
        TLRPC.User f11;
        HashSet hashSet;
        float f12;
        long j10;
        ng.h hVar;
        int size;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.messenger.w1 w1Var;
        String str;
        ng.i iVar;
        ArrayList arrayList2 = this.X1;
        arrayList2.clear();
        ArrayList arrayList3 = this.Y1;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        boolean isEmpty = TextUtils.isEmpty(this.g2);
        HashSet hashSet2 = this.u2;
        int i12 = this.P1;
        HashSet hashSet3 = this.Z1;
        if (isEmpty) {
            if (this.y2 && i12 == 3) {
                if (this.x2 == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.filled_gift_send).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    eq eqVar = new eq(t6.L(org.telegram.messenger.i0.L(40.0f), t6.w0(t6.Ci, this.I0)), mutate);
                    int L2 = org.telegram.messenger.i0.L(24.0f);
                    int L3 = org.telegram.messenger.i0.L(24.0f);
                    eqVar.e = L2;
                    eqVar.f = L3;
                    this.x2 = eqVar;
                }
                eq eqVar2 = this.x2;
                String L0 = cd.L0(2131750116, null);
                ng.h hVar2 = new ng.h(3, true);
                hVar2.i = 5;
                hVar2.r = eqVar2;
                hVar2.g = L0;
                hVar2.h = "";
                arrayList3.add(hVar2);
            }
            if (this.z2 && i12 == 3 && ((org.telegram.messenger.j0) vp.r1(this.a).y7.j0.b).c) {
                if (this.w2 == null) {
                    Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_wallet_move).mutate();
                    f7 = 40.0f;
                    mutate2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    f10 = 24.0f;
                    eq eqVar3 = new eq(t6.L(org.telegram.messenger.i0.L(40.0f), t6.w0(t6.Ci, this.I0)), mutate2);
                    int L4 = org.telegram.messenger.i0.L(24.0f);
                    int L5 = org.telegram.messenger.i0.L(24.0f);
                    eqVar3.e = L4;
                    eqVar3.f = L5;
                    this.w2 = eqVar3;
                } else {
                    f7 = 40.0f;
                    f10 = 24.0f;
                }
                String t10 = org.telegram.ui.Wallet.k0.x(this.a).t();
                int i13 = this.A2;
                if (i13 > 0) {
                    str = cd.G(i13, "Gift2ExportTONUnlocksIn", new Object[0]);
                } else if (t10 == null || t10.length() < 20) {
                    str = "";
                } else {
                    int w02 = t6.w0(t6.r5, this.I0);
                    int length = t10.length();
                    String substring = t10.substring(0, 4);
                    String substring2 = t10.substring(4, 8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t10.substring(8, 10));
                    int i14 = length - 8;
                    sb2.append(t10.substring(length - 10, i14));
                    String sb3 = sb2.toString();
                    int i15 = length - 4;
                    String[] strArr = {substring, substring2, sb3, t10.substring(i14, i15), t10.substring(i15, length)};
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i16 = 0;
                    while (i16 < 5) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) strArr[i16]);
                        spannableStringBuilder.setSpan(new h2(w02, i16 == 2), length2, spannableStringBuilder.length(), 33);
                        i16++;
                    }
                    str = spannableStringBuilder;
                }
                eq eqVar4 = this.w2;
                String L02 = cd.L0(2131750113, null);
                ng.h hVar3 = new ng.h(3, true);
                hVar3.i = 4;
                hVar3.r = eqVar4;
                hVar3.g = L02;
                hVar3.h = str;
                arrayList3.add(hVar3);
            } else {
                f7 = 40.0f;
                f10 = 24.0f;
            }
            if (this.z2 && i12 == 3 && !((org.telegram.messenger.j0) vp.r1(this.a).y7.j0.b).c) {
                if (this.q2 == null) {
                    Drawable mutate3 = getContext().getResources().getDrawable(R.drawable.fragment).mutate();
                    mutate3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    eq eqVar5 = new eq(t6.L(org.telegram.messenger.i0.L(f7), -16777216), mutate3);
                    int L6 = org.telegram.messenger.i0.L(f10);
                    int L7 = org.telegram.messenger.i0.L(f10);
                    eqVar5.e = L6;
                    eqVar5.f = L7;
                    this.q2 = eqVar5;
                }
                eq eqVar6 = this.q2;
                String L03 = cd.L0(2131749999, null);
                int i17 = this.A2;
                String G = i17 > 0 ? cd.G(i17, "Gift2ExportTONUnlocksIn", new Object[0]) : "";
                ng.h hVar4 = new ng.h(3, true);
                hVar4.i = 2;
                hVar4.r = eqVar6;
                hVar4.g = L03;
                hVar4.h = G;
                arrayList3.add(hVar4);
            }
            TLRPC.UserFull a2 = vp.r1(this.a).a2(d20.i(this.a).e());
            if (a2 == null) {
                vp.r1(this.a).U2(d20.i(this.a).f(), 0, true, null);
            }
            if ((i12 == 0 || i12 == 2) && a2 != null && a2.birthday == null) {
                L = org.telegram.messenger.i0.L(50.0f);
                String L04 = cd.L0(2131749585, null);
                ng.h hVar5 = new ng.h(9, false);
                hVar5.i = 1;
                hVar5.j = R.drawable.menu_birthday;
                hVar5.g = L04;
                arrayList3.add(hVar5);
            } else {
                L = 0;
            }
            if (this.s2 != null && i12 == 4) {
                String L05 = cd.L0(2131743446, null);
                ng.h hVar6 = new ng.h(9, false);
                hVar6.i = 3;
                hVar6.j = R.drawable.msg2_link2;
                hVar6.g = L05;
                arrayList3.add(hVar6);
            }
            org.telegram.messenger.w1 w1Var2 = this.n2;
            if (w1Var2 != null) {
                L = d1(cd.L0(2131753704, null), arrayList3, w1Var2.b) + d1(cd.L0(2131753711, null), arrayList3, w1Var2.c) + L + d1(cd.L0(2131753705, null), arrayList3, w1Var2.d);
            }
            if ((i12 == 0 || i12 == 2) && (f11 = d20.i(this.a).f()) != null) {
                arrayList3.add(ng.h.b(cd.L0(2131750108, null)));
                ng.h c10 = ng.h.c(f11, hashSet3.contains(Long.valueOf(f11.id)));
                c10.h = cd.L0(2131750109, null);
                arrayList3.add(c10);
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = this.b2;
            if (arrayList5.isEmpty()) {
                hashSet = hashSet2;
                f12 = 32.0f;
                j10 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size2 = arrayList5.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList5.get(i18);
                    i18++;
                    HashSet hashSet4 = hashSet2;
                    TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (Z1 != null) {
                        long j11 = Z1.id;
                        if (j11 != 0 && !Z1.self && !Z1.bot && !h20.A(j11) && !h20.x(Z1) && ((w1Var2 == null || !w1Var2.a(Z1.id)) && !hashSet4.contains(Long.valueOf(Z1.id)))) {
                            if (hashSet3.contains(Long.valueOf(Z1.id))) {
                                arrayList4.add(Long.valueOf(Z1.id));
                            }
                            L += org.telegram.messenger.i0.L(56.0f);
                            ng.h c11 = ng.h.c(Z1, hashSet3.contains(Long.valueOf(Z1.id)));
                            g1(c11);
                            arrayList6.add(c11);
                        }
                    }
                    hashSet2 = hashSet4;
                }
                hashSet = hashSet2;
                f12 = 32.0f;
                j10 = 0;
                if (!arrayList6.isEmpty()) {
                    L += org.telegram.messenger.i0.L(32.0f);
                    hVar = ng.h.b(cd.L0(2131749681, null));
                    arrayList3.add(hVar);
                    arrayList3.addAll(arrayList6);
                    ArrayList arrayList7 = this.e2;
                    size = arrayList7.size();
                    i10 = L;
                    i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList7.get(i11);
                        int i19 = i11 + 1;
                        String str2 = (String) obj2;
                        ArrayList arrayList8 = new ArrayList();
                        for (TLRPC.TL_contact tL_contact : (List) this.d2.get(str2)) {
                            int i20 = i19;
                            long e = d20.i(this.a).e();
                            ArrayList arrayList9 = arrayList7;
                            int i21 = size;
                            long j12 = tL_contact.user_id;
                            if (j12 == e || j12 == j10 || ((w1Var2 != null && w1Var2.a(j12)) || hashSet.contains(Long.valueOf(tL_contact.user_id)))) {
                                arrayList = arrayList9;
                                w1Var = w1Var2;
                            } else {
                                arrayList = arrayList9;
                                w1Var = w1Var2;
                                TLRPC.User Z12 = vp.r1(this.a).Z1(Long.valueOf(tL_contact.user_id));
                                if (Z12 != null && !Z12.bot && !h20.A(Z12.id)) {
                                    i10 += org.telegram.messenger.i0.L(56.0f);
                                    if (hashSet3.contains(Long.valueOf(Z12.id))) {
                                        arrayList4.add(Long.valueOf(Z12.id));
                                    }
                                    ng.h c12 = ng.h.c(Z12, hashSet3.contains(Long.valueOf(Z12.id)));
                                    g1(c12);
                                    arrayList8.add(c12);
                                }
                            }
                            w1Var2 = w1Var;
                            i19 = i20;
                            arrayList7 = arrayList;
                            size = i21;
                        }
                        int i22 = i19;
                        ArrayList arrayList10 = arrayList7;
                        int i23 = size;
                        org.telegram.messenger.w1 w1Var3 = w1Var2;
                        if (!arrayList8.isEmpty()) {
                            int L8 = org.telegram.messenger.i0.L(f12) + i10;
                            String upperCase = str2.toUpperCase();
                            ng.h hVar7 = new ng.h(7, false);
                            hVar7.g = upperCase;
                            arrayList3.add(hVar7);
                            arrayList3.addAll(arrayList8);
                            i10 = L8;
                        }
                        w1Var2 = w1Var3;
                        i11 = i22;
                        arrayList7 = arrayList10;
                        size = i23;
                    }
                    if (hVar != null && arrayList4.size() > 0 && !hashSet3.isEmpty()) {
                        String L06 = cd.L0(2131751458, null);
                        ag.t0 t0Var = new ag.t0(9, this, arrayList4);
                        hVar.h = L06;
                        hVar.m = t0Var;
                    }
                }
            }
            hVar = null;
            ArrayList arrayList72 = this.e2;
            size = arrayList72.size();
            i10 = L;
            i11 = 0;
            while (i11 < size) {
            }
            if (hVar != null) {
                String L062 = cd.L0(2131751458, null);
                ag.t0 t0Var2 = new ag.t0(9, this, arrayList4);
                hVar.h = L062;
                hVar.m = t0Var2;
            }
        } else {
            ArrayList arrayList11 = this.c2;
            int size3 = arrayList11.size();
            int i24 = 0;
            i10 = 0;
            while (i24 < size3) {
                Object obj3 = arrayList11.get(i24);
                i24++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (!user.bot && !h20.A(user.id)) {
                        long j13 = user.id;
                        i10 = org.telegram.messenger.i0.L(56.0f) + i10;
                        if (!hashSet2.contains(Long.valueOf(user.id))) {
                            ng.h c13 = ng.h.c(user, hashSet3.contains(Long.valueOf(j13)));
                            g1(c13);
                            arrayList3.add(c13);
                        }
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (i12 == 3 && w3.V(chat)) {
                        long j14 = -chat.id;
                        i10 += org.telegram.messenger.i0.L(56.0f);
                        if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                            boolean contains = hashSet3.contains(Long.valueOf(j14));
                            ng.h hVar8 = new ng.h(3, true);
                            hVar8.e = chat;
                            hVar8.c = null;
                            hVar8.d = null;
                            hVar8.k = contains;
                            arrayList3.add(hVar8);
                        }
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new ng.h(5, false));
            i10 += org.telegram.messenger.i0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.i0.q.y * 0.6f)) - i10);
        ng.h hVar9 = new ng.h(-1, false);
        hVar9.l = max;
        arrayList3.add(hVar9);
        if (!z11 || (iVar = this.h2) == null) {
            return;
        }
        if (z10) {
            iVar.E(arrayList2, arrayList3);
        } else {
            iVar.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.a).c(this, zs.S2);
        zs.f(this.a).c(this, zs.E0);
        zs.f(this.a).c(this, zs.O);
        zs.f(this.a).c(this, zs.S0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.a).n(this, zs.S2);
        zs.f(this.a).n(this, zs.E0);
        zs.f(this.a).n(this, zs.O);
        zs.f(this.a).n(this, zs.S0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 int, still in use, count: 2, list:
          (r5v2 int) from 0x0053: MOVE (r3v6 int) = (r5v2 int) (LINE:84)
          (r5v2 int) from 0x002b: MOVE (r2v4 int) = (r5v2 int) (LINE:44)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final void p1(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.o1(r10, r11)
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
            r3 = r1
        L8:
            org.telegram.ui.Components.tk0 r4 = r9.k1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof qg.k
            if (r5 == 0) goto L54
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L54
            java.util.ArrayList r7 = r9.Y1
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L54
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            ng.h r3 = (ng.h) r3
            qg.k r4 = (qg.k) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            ng.i r7 = r9.h2
            int r3 = r7.F(r3)
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 <= r7) goto L4c
            r6 = 1050253722(0x3e99999a, float:0.3)
        L4c:
            r4.i(r10, r6)
            goto L53
        L50:
            r4.i(r10, r6)
        L53:
            r3 = r5
        L54:
            int r1 = r1 + 1
            goto L8
        L57:
            if (r10 == 0) goto L68
            ng.i r11 = r9.h2
            r11.k(r0, r2)
            ng.i r11 = r9.h2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.k(r3, r0)
        L68:
            r9.n1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.i2.p1(boolean, boolean):void");
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            int w02 = t6.w0(t6.Ci, this.I0);
            eq eqVar = this.x2;
            if (eqVar != null) {
                t6.C1(w02, eqVar.a);
            }
            eq eqVar2 = this.w2;
            if (eqVar2 != null) {
                t6.C1(w02, eqVar2.a);
            }
            tk0 tk0Var = this.k1;
            if (tk0Var != null) {
                for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
                    tk0Var.getChildAt(i10).invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
