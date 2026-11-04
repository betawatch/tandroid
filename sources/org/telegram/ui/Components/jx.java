package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jx extends sj0 {
    public cl F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final /* synthetic */ ey M;
    public final Context c;
    public final boolean d;
    public final lx e;
    public final int f;
    public int h;
    public TLRPC.User n;
    public String r;
    public boolean s;
    public boolean w;
    public String x;
    public final ArrayList y = new ArrayList();
    public final HashMap E = new HashMap();
    public int J = -1;
    public int K = -1;

    public jx(ey eyVar, Context context, boolean z10, int i3) {
        this.M = eyVar;
        this.c = context;
        this.d = z10;
        this.f = i3;
        this.e = z10 ? null : new lx(eyVar, context);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        if (str == null || !str.equals(this.x)) {
            return;
        }
        this.h = 0;
        if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            F(str, str2, z10, z11, false);
            return;
        }
        HashMap hashMap = this.E;
        boolean z13 = this.d;
        ArrayList arrayList = this.y;
        ey eyVar = this.M;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            eyVar.p0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = eyVar.m0;
            jx jxVar = eyVar.o0;
            if (!hashMap2.containsKey(str3)) {
                eyVar.m0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                org.telegram.messenger.qr.a0(eyVar.d1).v1(str3, messages_botresults);
            }
            this.r = messages_botresults.next_offset;
            int i3 = 0;
            for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                if (!hashMap.containsKey(botInlineResult.id)) {
                    botInlineResult.query_id = messages_botresults.query_id;
                    arrayList.add(botInlineResult);
                    hashMap.put(botInlineResult.id, botInlineResult);
                    i3++;
                }
            }
            this.s = size == arrayList.size() || TextUtils.isEmpty(this.r);
            if (i3 != 0) {
                if (z11 && size == 0) {
                    f();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            g(size);
                        }
                        jxVar.getClass();
                        o(size, i3);
                    } else if (size != 0) {
                        int i11 = this.I;
                        jxVar.getClass();
                        g(i11 + size);
                        int i12 = this.I;
                        jxVar.getClass();
                        o(i12 + size + 1, i3);
                    } else {
                        int i13 = this.I;
                        jxVar.getClass();
                        o(i13, i3 + 1);
                    }
                }
            } else if (arrayList.isEmpty()) {
                f();
            }
        } else {
            f();
        }
        if (z13) {
            return;
        }
        if (eyVar.i0.getAdapter() != this) {
            eyVar.i0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            eyVar.j0.h1(0, 0);
            eyVar.E(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i3 = this.h;
        ey eyVar = this.M;
        if (i3 != 0) {
            if (i3 >= 0) {
                ConnectionsManager.getInstance(eyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z11;
        lx lxVar = this.e;
        if (lxVar != null) {
            lxVar.a(z11);
        }
        int i10 = eyVar.d1;
        HashMap hashMap = eyVar.m0;
        jv jvVar = eyVar.i0;
        lv lvVar = eyVar.p0;
        int i11 = eyVar.d1;
        TLObject f22 = org.telegram.messenger.hp.s1(i10).f2(org.telegram.messenger.hp.s1(i11).L3);
        boolean z13 = f22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.hp.s1(i11).L3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new w1(this, 4));
                }
                if (z14) {
                    return;
                }
                lvVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            lvVar.e(true);
        }
        this.n = (TLRPC.User) f22;
        final String k10 = com.google.android.recaptcha.internal.a.k("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.hx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final jx jxVar = jx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = k10;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.ix
                    @Override // java.lang.Runnable
                    public final void run() {
                        jx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (jvVar.getAdapter() != this) {
                jvVar.setAdapter(this);
            }
            f();
            eyVar.j0.h1(0, 0);
            eyVar.E(2);
        }
        if (z12 && hashMap.containsKey(k10)) {
            E(str, str2, z10, z11, true, k10, (TLObject) hashMap.get(k10));
            return;
        }
        if (eyVar.l0.a.contains(k10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            org.telegram.messenger.qr.a0(i11).M(k10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.hp.s1(i11).q1(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i3 = this.h;
        ey eyVar = this.M;
        if (i3 != 0) {
            if (i3 >= 0) {
                ConnectionsManager.getInstance(eyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = false;
        lx lxVar = this.e;
        if (lxVar != null) {
            lxVar.a(false);
        }
        cl clVar = this.F;
        if (clVar != null) {
            org.telegram.messenger.g0.r(clVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            cl clVar2 = new cl(19, this, str);
            this.F = clVar2;
            org.telegram.messenger.g0.i3(clVar2, z10 ? 300L : 0L);
            return;
        }
        this.x = null;
        if (this.L) {
            F("", "", true, true, true);
            return;
        }
        mw mwVar = eyVar.q0;
        jv jvVar = eyVar.i0;
        int currentPosition = mwVar.getCurrentPosition();
        if (currentPosition != eyVar.s0 && currentPosition != eyVar.t0) {
            H((String) org.telegram.messenger.hp.s1(eyVar.d1).c4.get(currentPosition - eyVar.u0));
            return;
        }
        u4.h0 adapter = jvVar.getAdapter();
        jx jxVar = eyVar.o0;
        if (adapter != jxVar) {
            jvVar.setAdapter(jxVar);
        }
    }

    public final void H(String str) {
        if (this.w && TextUtils.equals(this.x, str)) {
            this.M.j0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.J = -1;
        this.K = -1;
        this.H = 0;
        boolean z10 = this.d;
        if (z10) {
            this.H = this.I;
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            if (z10) {
                return;
            }
            this.H++;
            return;
        }
        if (z10 && this.I > 0) {
            int i3 = this.H;
            this.H = i3 + 1;
            this.J = i3;
        }
        int i10 = this.H;
        this.K = i10;
        this.H = arrayList.size() + i10;
    }

    @Override // u4.h0
    public final int b() {
        return this.H;
    }

    @Override // u4.h0
    public final int d(int i3) {
        boolean z10 = this.d;
        if (z10 && i3 == this.J) {
            return 2;
        }
        return (z10 || !this.y.isEmpty()) ? 0 : 3;
    }

    @Override // u4.h0
    public final void f() {
        int i3;
        if (this.d && (i3 = this.f) != 0) {
            ey eyVar = this.M;
            if (i3 == Integer.MAX_VALUE) {
                this.I = eyVar.j1.size();
            } else {
                jv jvVar = eyVar.i0;
                kx kxVar = eyVar.j0;
                if (jvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = eyVar.i0.getMeasuredWidth();
                    int i10 = kxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = eyVar.j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) eyVar.j1.get(i14);
                        lt0 C1 = hy.C1(kxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.a / C1.b) * L) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.I += i12;
                            i13++;
                            if (i13 == i3) {
                                break;
                            }
                            i11 = i10;
                            i12 = 0;
                        }
                        i12++;
                        i11 -= min;
                    }
                    if (i13 < i3) {
                        this.I += i12;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) d1Var.a;
        int i10 = this.K;
        if (i10 >= 0 && i3 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.y.get(i3 - i10), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.j1.get(i3);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        if (i3 != 0) {
            ey eyVar = this.M;
            if (i3 == 1) {
                View view2 = new View(eyVar.getContext());
                view2.setLayoutParams(new u4.p0(-1, eyVar.c1));
                view = view2;
            } else if (i3 != 2) {
                ViewGroup.LayoutParams p0Var = new u4.p0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(p0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(this.c, false, false, eyVar.a2, eyVar.j2);
                i8Var.a(0, org.telegram.messenger.bd.M0(2131750835, null));
                u4.p0 p0Var2 = new u4.p0(-1, -2);
                ((ViewGroup.MarginLayoutParams) p0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                ((ViewGroup.MarginLayoutParams) p0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                i8Var.setLayoutParams(p0Var2);
                view = i8Var;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            view = h2Var;
        }
        return new bj0(view);
    }
}
