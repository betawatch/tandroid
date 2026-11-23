package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c00 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs, te.b {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public jg.o0 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final org.telegram.ui.ActionBar.g2 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final vz T;
    public final wz U;
    public final a00 V;
    public final xz W;
    public final te.a a;
    public final zz a0;
    public final et b;
    public final xz b0;
    public final org.telegram.ui.Components.nv0 c;
    public final xz c0;
    public org.telegram.ui.Components.dk0 d;
    public final ArrayList d0;
    public mz e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final m4 g0;
    public final SparseArray h;
    public final pz h0;
    public tz i0;
    public org.telegram.ui.Components.qm0 j0;
    public final v4.c0 k0;
    public final qz l0;
    public final h2.f m0;
    public final ArrayList n;
    public final uz n0;
    public final lz o0;
    public b00 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public int s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public c00(org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getParentActivity());
        this.a = new te.a(0, this, org.telegram.ui.Components.nr.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = 3;
        this.T = new vz(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new m4(this, 5);
        this.h0 = new pz(this);
        this.m0 = new h2.f((int[]) null);
        this.o0 = new lz(this, 0);
        this.M = g2Var;
        Activity parentActivity = g2Var.getParentActivity();
        this.L = parentActivity;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this, null);
        et etVar = new et(2, parentActivity, this);
        this.b = etVar;
        etVar.setOnItemClickListener(new h(this, 12));
        etVar.setOnItemLongClickListener(new f(this, 15));
        v4.c0 c0Var = new v4.c0();
        this.k0 = c0Var;
        etVar.setLayoutManager(c0Var);
        qz qzVar = new qz(0, parentActivity, this);
        this.l0 = qzVar;
        addView(qzVar);
        addView(etVar);
        etVar.setSectionsType(2);
        etVar.setSkipDrawSection(true);
        etVar.setOnScrollListener(new rz(this));
        uz uzVar = new uz(parentActivity);
        this.n0 = uzVar;
        String u10 = org.telegram.messenger.hd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(uzVar.c, u10)) {
            uzVar.c = u10;
            uzVar.a.t(u10, true, true);
        }
        addView(uzVar, c8.ma.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new wz(this);
        this.V = new a00(this, getContext());
        this.W = new xz(this, getContext(), 1);
        this.a0 = new zz(this, getContext());
        this.b0 = new xz(this, getContext(), 4);
        this.c0 = new xz(this, getContext(), 2);
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(parentActivity, qzVar, 1, null);
        this.c = nv0Var;
        addView(nv0Var);
        etVar.setEmptyView(nv0Var);
        nv0Var.setVisibility(8);
        b();
    }

    public static void a(c00 c00Var, org.telegram.messenger.gj gjVar, View view, int i7) {
        if (!c00Var.p0.V1()) {
            c00Var.p0.n();
        }
        if (c00Var.p0.V1()) {
            c00Var.p0.Z0(gjVar, view, i7);
        }
    }

    public static CharSequence c(org.telegram.messenger.gj gjVar, boolean z10) {
        return d(gjVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.gj gjVar, boolean z10, int i7, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat O0;
        TLRPC.Chat O02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f10;
        TLRPC.TL_forumTopic f11;
        int i10;
        if (gjVar == null || (message = gjVar.k) == null) {
            return "";
        }
        if (org.telegram.messenger.gj.b4(message)) {
            kg.u1 c10 = kg.v1.f(gjVar.K1).c(org.telegram.messenger.gj.I1(gjVar.k));
            return c10 == null ? "" : c10.b;
        }
        CharSequence charSequence = null;
        if (gjVar.r4()) {
            return gjVar.b1 ? org.telegram.messenger.hd.N0(2131745015, null) : gjVar.U0 ? org.telegram.messenger.hd.N0(2131745016, null) : org.telegram.messenger.hd.N0(2131745017, null);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t0;
        if (spannableStringBuilderArr[i7] == null) {
            spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
            if (i7 == 0) {
                i10 = R.drawable.attach_arrow_right;
            } else if (i7 == 1) {
                i10 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i7 != 2) {
                    return "";
                }
                i10 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(i7 == 0 ? 2 : 1, org.telegram.messenger.t0.b.getDrawable(i10).mutate());
            if (i7 == 1 || i7 == 2) {
                nqVar.I = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
            spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = gjVar.k;
        if (message2.saved_peer_id != null) {
            if (gjVar.P1() >= 0) {
                user = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).c2(Long.valueOf(gjVar.P1()));
                O0 = null;
            } else if (gjVar.P1() < 0) {
                O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(-gjVar.P1()));
                user = null;
                O02 = null;
            } else {
                user = null;
                O0 = null;
            }
            O02 = O0;
        } else {
            TLRPC.User c22 = message2.from_id.user_id != 0 ? org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).c2(Long.valueOf(gjVar.k.from_id.user_id)) : null;
            O0 = gjVar.k.from_id.chat_id != 0 ? org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(gjVar.k.peer_id.chat_id)) : null;
            if (O0 == null) {
                O0 = gjVar.k.from_id.channel_id != 0 ? org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(gjVar.k.peer_id.channel_id)) : null;
            }
            O02 = gjVar.k.peer_id.channel_id != 0 ? org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(gjVar.k.peer_id.channel_id)) : null;
            if (O02 == null) {
                O02 = gjVar.k.peer_id.chat_id != 0 ? org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).O0(Long.valueOf(gjVar.k.peer_id.chat_id)) : null;
            }
            if (!org.telegram.messenger.v3.V(O02) && !z10) {
                O02 = null;
            }
            user = c22;
        }
        if (user != null && O02 != null) {
            CharSequence charSequence2 = O02.title;
            if (org.telegram.messenger.v3.c0(O02) && (f11 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).t7.f(O02.id, org.telegram.messenger.gj.b2(gjVar.K1, gjVar.k, true, false))) != null) {
                charSequence2 = qg.c.k(f11, null, null);
            }
            CharSequence m10 = org.telegram.messenger.j6.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(org.telegram.messenger.j6.m(org.telegram.messenger.p10.k(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
            charSequence = spannableStringBuilder2;
        } else if (user != null) {
            charSequence = org.telegram.messenger.j6.m(org.telegram.messenger.p10.q(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        } else if (O0 != null) {
            CharSequence charSequence3 = O0.title;
            if (org.telegram.messenger.v3.c0(O0) && (f10 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).t7.f(O0.id, org.telegram.messenger.gj.b2(gjVar.K1, gjVar.k, true, false))) != null) {
                charSequence3 = qg.c.k(f10, null, null);
            }
            charSequence = org.telegram.messenger.j6.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence == null ? "" : charSequence;
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
    }

    public final void b() {
        float f10 = this.a.e;
        uz uzVar = this.n0;
        uzVar.setTranslationY((1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f)));
        uzVar.setAlpha(f10);
        uzVar.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.l4) {
            et etVar = this.b;
            int childCount = etVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (etVar.getChildAt(i11) instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) etVar.getChildAt(i11)).i0(0, true);
                }
                etVar.getChildAt(i11).invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (org.telegram.messenger.v3.S(org.telegram.messenger.k10.t0, r5) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ArrayList arrayList, long j3) {
        org.telegram.ui.Components.dk0 dk0Var;
        int i7;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i10 >= arrayList2.size()) {
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i10);
            TLRPC.Message message = gjVar.k;
            String str = gjVar.Y;
            long B0 = org.telegram.messenger.gj.B0(message);
            if (B0 < 0) {
                i7 = (int) (-B0);
            }
            i7 = 0;
            if (i7 == j3) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (gjVar.e1() == ((Integer) arrayList.get(i11)).intValue()) {
                        arrayList2.remove(i10);
                        this.h.remove(gjVar.e1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(gjVar);
                        if (arrayList3.size() == 0) {
                            this.n.remove(str);
                            hashMap.remove(str);
                        }
                        i10--;
                        this.P--;
                        z10 = true;
                    }
                }
            }
            i10++;
        }
        if (!z10 || (dk0Var = this.d) == null) {
            return;
        }
        dk0Var.f();
    }

    public final void f(int i7, View view, org.telegram.messenger.gj gjVar, int i10) {
        String str;
        if (gjVar == null) {
            return;
        }
        if (this.p0.V1()) {
            this.p0.Z0(gjVar, view, i10);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.u2) {
            this.p0.t0(gjVar);
            return;
        }
        int i11 = this.E.d;
        pz pzVar = this.h0;
        ArrayList arrayList = this.f;
        String str2 = null;
        org.telegram.ui.ActionBar.g2 g2Var = this.M;
        if (i11 == 0) {
            PhotoViewer.p1().I2(null, g2Var, null);
            PhotoViewer.p1().a2(arrayList, i7, 0L, 0L, 0L, pzVar);
            this.S = PhotoViewer.p1().c;
            return;
        }
        if (i11 == 3 || i11 == 5) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).a();
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                TLRPC.Document F0 = gjVar.F0();
                if (!i7Var.H) {
                    if (i7Var.G) {
                        org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.k10.t0).a).f(F0);
                        i7Var.f(true);
                        return;
                    } else {
                        org.telegram.messenger.gj message = i7Var.getMessage();
                        message.P = true;
                        org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.k10.t0).a).W(F0, message, 0, 0);
                        i7Var.f(true);
                        return;
                    }
                }
                if (!gjVar.x()) {
                    org.telegram.messenger.g0.s2(gjVar, this.L, g2Var);
                    return;
                }
                PhotoViewer.p1().I2(null, g2Var, null);
                int indexOf = arrayList.indexOf(gjVar);
                if (indexOf >= 0) {
                    PhotoViewer.p1().I2(null, g2Var, null);
                    PhotoViewer.p1().a2(arrayList, indexOf, 0L, 0L, 0L, pzVar);
                    this.S = PhotoViewer.p1().c;
                    return;
                } else {
                    ArrayList i12 = org.telegram.messenger.f3.i(gjVar);
                    PhotoViewer.p1().I2(null, g2Var, null);
                    PhotoViewer.p1().a2(i12, 0, 0L, 0L, 0L, pzVar);
                    this.S = PhotoViewer.p1().c;
                    return;
                }
            }
            return;
        }
        if (i11 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = gjVar.k.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(gjVar) == null) {
                            g2Var.createArticleViewer(false).L(gjVar, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str3 = webPage.embed_url;
                    if (str3 != null && str3.length() != 0) {
                        org.telegram.ui.Components.iu.O0(this.M, gjVar, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.l7) view).F;
                    if (arrayList2.size() > 0) {
                        str2 = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = str2;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.g0.H3(str)) {
            org.telegram.ui.Components.c5.n0(this.M, str, true, true);
        } else {
            vf.c.t(this.L, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.a7));
        int i7 = org.telegram.ui.ActionBar.m6.i7;
        et etVar = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, TLObject.FLAG_13, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, TLObject.FLAG_14, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        org.telegram.ui.Components.nv0 nv0Var = this.c;
        arrayList.add(new org.telegram.ui.ActionBar.v6(nv0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(nv0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.y6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, org.telegram.ui.mz] */
    public final void h(final long j3, final long j10, final long j11, final long j12, final jg.o0 o0Var, final boolean z10, String str, boolean z11) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j3 + j10 + j11 + j12 + (o0Var == null ? -1 : o0Var.d) + str2 + z10;
        String str4 = this.y;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.E = o0Var;
        this.F = j3;
        this.G = j10;
        this.I = j11;
        this.H = j12;
        this.J = str2;
        this.K = z10;
        mz mzVar = this.e;
        if (mzVar != null) {
            org.telegram.messenger.g0.r(mzVar);
        }
        m4 m4Var = this.g0;
        org.telegram.messenger.g0.r(m4Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList2 = this.e0;
        final boolean z14 = z12;
        ArrayList arrayList3 = this.d0;
        org.telegram.ui.Components.nv0 nv0Var = this.c;
        ArrayList arrayList4 = this.f;
        if (z13 || (o0Var == null && j10 == 0 && j3 == 0 && j11 == 0 && j12 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.N = true;
            nv0Var.setVisibility(0);
            org.telegram.ui.Components.dk0 dk0Var = this.d;
            if (dk0Var != null) {
                dk0Var.f();
            }
            this.Q++;
            et etVar = this.b;
            if (etVar.getPinnedHeader() != null) {
                arrayList = arrayList4;
                etVar.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z13) {
                return;
            }
        } else if (z11 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.N = true;
        org.telegram.ui.Components.dk0 dk0Var2 = this.d;
        if (dk0Var2 != null) {
            dk0Var2.f();
        }
        if (!z14) {
            m4Var.run();
            nv0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            tz tzVar = this.i0;
            if (tzVar != null) {
                ((ju) tzVar).j(false, null, null, false);
            }
        }
        final int i7 = this.Q + 1;
        this.Q = i7;
        final int i10 = org.telegram.messenger.k10.t0;
        ?? r02 = new Runnable() { // from class: org.telegram.ui.mz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                String str5;
                jg.o0 o0Var2;
                int i12;
                long j13;
                boolean z15;
                long j14;
                int i13;
                int i14;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final c00 c00Var = c00.this;
                ArrayList arrayList5 = c00Var.f;
                final long j15 = j3;
                long j16 = j10;
                String str6 = str2;
                jg.o0 o0Var3 = o0Var;
                int i15 = i10;
                long j17 = j11;
                long j18 = j12;
                boolean z16 = z14;
                ArrayList arrayList6 = null;
                if (j15 == 0 || j16 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str6);
                    boolean z17 = z10;
                    if (isEmpty) {
                        i11 = i15;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        i12 = z17 ? 1 : 0;
                        j13 = j17;
                        z15 = z16;
                        j14 = j18;
                        i13 = 20;
                    } else {
                        j13 = j17;
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        z15 = z16;
                        ArrayList arrayList9 = new ArrayList();
                        org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i15);
                        j14 = j18;
                        i11 = i15;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        i13 = 20;
                        a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                        i12 = z17 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i13;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = o0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : o0Var2.e;
                    tL_messages_searchGlobal2.community = org.telegram.messenger.np.u1(i11).j1(j16);
                    if (j13 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j13 / 1000);
                    }
                    if (j14 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                    }
                    if (z15 && str5.equals(c00Var.x) && !arrayList5.isEmpty()) {
                        i14 = 1;
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList5);
                        tL_messages_searchGlobal2.offset_id = gjVar.e1();
                        tL_messages_searchGlobal2.offset_rate = c00Var.w;
                        tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.np.u1(i11).l1(org.telegram.messenger.gj.B1(gjVar.k.peer_id));
                    } else {
                        i14 = 1;
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i14;
                    tL_messages_searchGlobal2.folder_id = i12;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str6;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = o0Var3 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : o0Var3.e;
                    tL_messages_search.peer = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i15).a).l1(j15);
                    if (j17 > 0) {
                        tL_messages_search.min_date = (int) (j17 / 1000);
                    }
                    if (j18 > 0) {
                        tL_messages_search.max_date = (int) (j18 / 1000);
                    }
                    if (z16 && str6.equals(c00Var.x) && !arrayList5.isEmpty()) {
                        tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList5)).e1();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    i11 = i15;
                    str5 = str6;
                    o0Var2 = o0Var3;
                    j13 = j17;
                    tL_messages_searchGlobal = tL_messages_search;
                    z15 = z16;
                }
                c00Var.x = str5;
                c00Var.y = str3;
                final ArrayList arrayList10 = new ArrayList();
                jg.q0.B1(c00Var.x, arrayList10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                final boolean z18 = z15;
                final int i16 = i7;
                final jg.o0 o0Var4 = o0Var2;
                final String str7 = str5;
                final int i17 = i11;
                final ArrayList arrayList11 = arrayList6;
                final long j19 = j13;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.r10() { // from class: org.telegram.ui.nz
                    @Override // org.telegram.messenger.r10
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList12 = new ArrayList();
                        final int i18 = i17;
                        final String str8 = str7;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i18, messages_messages.messages.get(i19), false, true);
                                gjVar2.K5(str8, true);
                                arrayList12.add(gjVar2);
                            }
                        }
                        final c00 c00Var2 = c00.this;
                        final int i20 = i16;
                        final boolean z19 = z18;
                        final jg.o0 o0Var5 = o0Var4;
                        final long j20 = j15;
                        final long j21 = j19;
                        final ArrayList arrayList13 = arrayList11;
                        final ArrayList arrayList14 = arrayList10;
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.oz
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
                            /* JADX WARN: Removed duplicated region for block: B:139:0x02c7  */
                            /* JADX WARN: Type inference failed for: r12v12 */
                            /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r12v16 */
                            /* JADX WARN: Type inference failed for: r16v0 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2 */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                View view;
                                int i21;
                                ?? r12;
                                tz tzVar2;
                                ArrayList arrayList15;
                                ArrayList arrayList16;
                                SparseArray sparseArray;
                                ?? r16;
                                char c10;
                                c00 c00Var3 = c00.this;
                                wz wzVar = c00Var3.U;
                                a00 a00Var = c00Var3.V;
                                ArrayList arrayList17 = c00Var3.n;
                                SparseArray sparseArray2 = c00Var3.h;
                                ArrayList arrayList18 = c00Var3.e0;
                                HashMap hashMap = c00Var3.r;
                                ArrayList arrayList19 = c00Var3.f;
                                ArrayList arrayList20 = c00Var3.d0;
                                et etVar2 = c00Var3.b;
                                org.telegram.ui.Components.nv0 nv0Var2 = c00Var3.c;
                                if (i20 != c00Var3.Q) {
                                    return;
                                }
                                c00Var3.N = false;
                                if (tL_error != null) {
                                    xh.l lVar = nv0Var2.d;
                                    org.telegram.ui.Components.m80 m80Var = nv0Var2.e;
                                    lVar.setText(org.telegram.messenger.hd.N0(2131745604, null));
                                    m80Var.setVisibility(0);
                                    m80Var.setText(org.telegram.messenger.hd.N0(2131745611, null));
                                    nv0Var2.e(false, true);
                                    return;
                                }
                                nv0Var2.e(false, true);
                                xh.l lVar2 = nv0Var2.d;
                                org.telegram.ui.Components.m80 m80Var2 = nv0Var2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                c00Var3.w = messages_messages2.next_rate;
                                int i22 = i18;
                                org.telegram.messenger.ur.a0(i22).m1(messages_messages2.users, messages_messages2.chats, true, true);
                                org.telegram.messenger.np.u1(i22).f4(messages_messages2.users, false);
                                org.telegram.messenger.np.u1(i22).Z3(messages_messages2.chats, false);
                                boolean z20 = z19;
                                if (!z20) {
                                    arrayList19.clear();
                                    sparseArray2.clear();
                                    arrayList17.clear();
                                    hashMap.clear();
                                }
                                c00Var3.P = messages_messages2.count;
                                String str9 = str8;
                                c00Var3.R = str9;
                                ArrayList arrayList21 = arrayList12;
                                int size2 = arrayList21.size();
                                int i23 = 0;
                                while (i23 < size2) {
                                    boolean z21 = z20;
                                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList21.get(i23);
                                    ArrayList arrayList22 = arrayList21;
                                    String str10 = gjVar3.Y;
                                    ArrayList arrayList23 = (ArrayList) hashMap.get(str10);
                                    int i24 = i23;
                                    if (arrayList23 == null) {
                                        arrayList15 = new ArrayList();
                                        hashMap.put(str10, arrayList15);
                                        arrayList17.add(str10);
                                    } else {
                                        arrayList15 = arrayList23;
                                    }
                                    arrayList15.add(gjVar3);
                                    arrayList19.add(gjVar3);
                                    sparseArray2.put(gjVar3.e1(), gjVar3);
                                    if (PhotoViewer.p1().P1()) {
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i25 = c00Var3.S;
                                        arrayList16 = arrayList17;
                                        SparseArray[] sparseArrayArr = p12.Z6;
                                        ArrayList arrayList24 = p12.Y6;
                                        sparseArray = sparseArray2;
                                        if (i25 == p12.c) {
                                            if (sparseArrayArr[0].indexOfKey(gjVar3.e1()) < 0) {
                                                if (p12.Q5) {
                                                    arrayList24.add(gjVar3);
                                                    c10 = 0;
                                                } else {
                                                    c10 = 0;
                                                    arrayList24.add(0, gjVar3);
                                                }
                                                r16 = c10;
                                                sparseArrayArr[c10].put(gjVar3.e1(), gjVar3);
                                            } else {
                                                r16 = 0;
                                            }
                                            p12.P5[r16] = arrayList24.size() == p12.J5 ? true : r16;
                                            p12.B2();
                                        }
                                    } else {
                                        arrayList16 = arrayList17;
                                        sparseArray = sparseArray2;
                                    }
                                    i23 = i24 + 1;
                                    arrayList21 = arrayList22;
                                    z20 = z21;
                                    arrayList17 = arrayList16;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z22 = z20;
                                if (arrayList19.size() > c00Var3.P) {
                                    c00Var3.P = arrayList19.size();
                                }
                                c00Var3.O = arrayList19.size() >= c00Var3.P;
                                boolean isEmpty2 = arrayList19.isEmpty();
                                jg.o0 o0Var6 = o0Var5;
                                if (isEmpty2) {
                                    if (o0Var6 == null) {
                                        lVar2.setText(org.telegram.messenger.hd.N0(2131745604, null));
                                        m80Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(c00Var3.R) && j20 == 0 && j21 == 0) {
                                        lVar2.setText(org.telegram.messenger.hd.N0(2131745605, null));
                                        int i26 = o0Var6.d;
                                        String N0 = i26 == 1 ? org.telegram.messenger.hd.N0(2131745610, null) : i26 == 0 ? org.telegram.messenger.hd.N0(2131745608, null) : i26 == 2 ? org.telegram.messenger.hd.N0(2131745609, null) : i26 == 3 ? org.telegram.messenger.hd.N0(2131745607, null) : org.telegram.messenger.hd.N0(2131745606, null);
                                        m80Var2.setVisibility(0);
                                        m80Var2.setText(N0);
                                    } else {
                                        lVar2.setText(org.telegram.messenger.hd.N0(2131745604, null));
                                        m80Var2.setVisibility(0);
                                        m80Var2.setText(org.telegram.messenger.hd.N0(2131745611, null));
                                    }
                                }
                                if (o0Var6 != null) {
                                    int i27 = o0Var6.d;
                                    if (i27 != 0) {
                                        if (i27 == 1) {
                                            c00Var3.d = c00Var3.W;
                                        } else if (i27 == 2) {
                                            c00Var3.d = c00Var3.a0;
                                        } else if (i27 == 3) {
                                            c00Var3.d = c00Var3.b0;
                                        } else if (i27 == 5) {
                                            c00Var3.d = c00Var3.c0;
                                        }
                                    } else if (TextUtils.isEmpty(c00Var3.R)) {
                                        c00Var3.d = a00Var;
                                    } else {
                                        c00Var3.d = wzVar;
                                    }
                                } else {
                                    c00Var3.d = wzVar;
                                }
                                v4.i0 adapter = etVar2.getAdapter();
                                org.telegram.ui.Components.dk0 dk0Var3 = c00Var3.d;
                                if (adapter != dk0Var3) {
                                    etVar2.setAdapter(dk0Var3);
                                }
                                if (z22) {
                                    view = null;
                                    i21 = 0;
                                } else {
                                    arrayList20.clear();
                                    ArrayList arrayList25 = arrayList13;
                                    if (arrayList25 != null) {
                                        arrayList20.addAll(arrayList25);
                                    }
                                    if (str9.length() >= 3 && (org.telegram.messenger.hd.N0(2131745705, null).toLowerCase().startsWith(str9) || "saved messages".startsWith(str9))) {
                                        for (int i28 = 0; i28 < arrayList20.size(); i28++) {
                                            if (!(arrayList20.get(i28) instanceof TLRPC.User) || org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).f().id != ((TLRPC.User) arrayList20.get(i28)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList20.add(0, org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).f());
                                        arrayList18.clear();
                                        arrayList18.addAll(arrayList14);
                                        c00Var3.f0 = r12;
                                        if (str9.length() < 3) {
                                            view = null;
                                            if (org.telegram.messenger.hd.N0(2131754147, null).toLowerCase().startsWith(str9) || "archive".startsWith(str9)) {
                                                c00Var3.f0 = true;
                                            }
                                        } else {
                                            view = null;
                                        }
                                        tzVar2 = c00Var3.i0;
                                        i21 = r12;
                                        if (tzVar2 != null) {
                                            ((ju) tzVar2).j(TextUtils.isEmpty(c00Var3.R), arrayList20, arrayList18, c00Var3.f0);
                                            i21 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList18.clear();
                                    arrayList18.addAll(arrayList14);
                                    c00Var3.f0 = r12;
                                    if (str9.length() < 3) {
                                    }
                                    tzVar2 = c00Var3.i0;
                                    i21 = r12;
                                    if (tzVar2 != null) {
                                    }
                                }
                                int i29 = -1;
                                View view2 = view;
                                for (int i30 = i21; i30 < size2; i30++) {
                                    View childAt = etVar2.getChildAt(i30);
                                    if (childAt instanceof org.telegram.ui.Components.yz) {
                                        i29 = RecyclerView.R(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    etVar2.removeView(view2);
                                }
                                if ((c00Var3.l0.getVisibility() == 0 && etVar2.getChildCount() == 0) || (etVar2.getAdapter() != a00Var && view2 != null)) {
                                    c00Var3.getViewTreeObserver().addOnPreDrawListener(new yp(c00Var3, (org.telegram.ui.Components.yz) view2, i29, 3));
                                }
                                c00Var3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r02;
        org.telegram.messenger.g0.h3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 0L);
        qz qzVar = this.l0;
        if (o0Var == null) {
            qzVar.setViewType(1);
            return;
        }
        int i11 = o0Var.d;
        if (i11 == 0) {
            if (TextUtils.isEmpty(this.J)) {
                qzVar.setViewType(2);
                return;
            } else {
                qzVar.setViewType(1);
                return;
            }
        }
        if (i11 == 1) {
            qzVar.setViewType(3);
            return;
        }
        if (i11 == 3 || i11 == 5) {
            qzVar.setViewType(4);
        } else if (i11 == 2) {
            qzVar.setViewType(5);
        }
    }

    public final void i(tz tzVar, boolean z10) {
        this.i0 = tzVar;
        if (!z10 || tzVar == null) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((ju) tzVar).j(false, arrayList, this.e0, this.f0);
    }

    public final void j(int i7, int i10, boolean z10) {
        setClipToPadding(false);
        this.s0 = z10;
        setPadding(0, i7, 0, i10);
        et etVar = this.b;
        if (z10) {
            etVar.q1(0, i7, 0, i10);
        } else {
            etVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) etVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.s0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.k10.t0;
        this.r0 = i7;
        org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.l4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.r0).n(this, org.telegram.messenger.ls.l4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.dk0 dk0Var;
        int i11 = this.s;
        if (org.telegram.messenger.g0.Q1()) {
            this.s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.s = 6;
        } else {
            this.s = 3;
        }
        if (i11 != this.s && (dk0Var = this.d) == this.V) {
            this.s0 = true;
            dk0Var.f();
            this.s0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.e = new g0.e(15);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        uz uzVar = this.n0;
        fh.g c10 = cVar.c(uzVar, eVar, false);
        uzVar.b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        uzVar.b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.qm0 qm0Var) {
        this.j0 = qm0Var;
    }

    public void setUiCallback(b00 b00Var) {
        this.p0 = b00Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.q0 = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            uz uzVar = this.n0;
            if (uzVar != null) {
                uzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
