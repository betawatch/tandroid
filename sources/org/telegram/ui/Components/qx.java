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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qx extends tj0 {
    public vs F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final /* synthetic */ ly M;
    public final Context c;
    public final boolean d;
    public final sx e;
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

    public qx(ly lyVar, Context context, boolean z10, int i7) {
        this.M = lyVar;
        this.c = context;
        this.d = z10;
        this.f = i7;
        this.e = z10 ? null : new sx(lyVar, context);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
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
        ly lyVar = this.M;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            lyVar.p0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = lyVar.m0;
            qx qxVar = lyVar.o0;
            if (!hashMap2.containsKey(str3)) {
                lyVar.m0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                org.telegram.messenger.vr.a0(lyVar.d1).v1(str3, messages_botresults);
            }
            this.r = messages_botresults.next_offset;
            int i7 = 0;
            for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                if (!hashMap.containsKey(botInlineResult.id)) {
                    botInlineResult.query_id = messages_botresults.query_id;
                    arrayList.add(botInlineResult);
                    hashMap.put(botInlineResult.id, botInlineResult);
                    i7++;
                }
            }
            this.s = size == arrayList.size() || TextUtils.isEmpty(this.r);
            if (i7 != 0) {
                if (z11 && size == 0) {
                    f();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            g(size);
                        }
                        qxVar.getClass();
                        o(size, i7);
                    } else if (size != 0) {
                        int i11 = this.I;
                        qxVar.getClass();
                        g(i11 + size);
                        int i12 = this.I;
                        qxVar.getClass();
                        o(i12 + size + 1, i7);
                    } else {
                        int i13 = this.I;
                        qxVar.getClass();
                        o(i13, i7 + 1);
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
        if (lyVar.i0.getAdapter() != this) {
            lyVar.i0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            lyVar.j0.h1(0, 0);
            lyVar.F(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        ly lyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(lyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z11;
        sx sxVar = this.e;
        if (sxVar != null) {
            sxVar.a(z11);
        }
        int i10 = lyVar.d1;
        HashMap hashMap = lyVar.m0;
        qv qvVar = lyVar.i0;
        sv svVar = lyVar.p0;
        int i11 = lyVar.d1;
        TLObject f22 = org.telegram.messenger.np.s1(i10).f2(org.telegram.messenger.np.s1(i11).L3);
        boolean z13 = f22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.np.s1(i11).L3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new v1(this, 4));
                }
                if (z14) {
                    return;
                }
                svVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            svVar.e(true);
        }
        this.n = (TLRPC.User) f22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.ox
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final qx qxVar = qx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.px
                    @Override // java.lang.Runnable
                    public final void run() {
                        qx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (qvVar.getAdapter() != this) {
                qvVar.setAdapter(this);
            }
            f();
            lyVar.j0.h1(0, 0);
            lyVar.F(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
            return;
        }
        if (lyVar.l0.a.contains(l10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            org.telegram.messenger.vr.a0(i11).M(l10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.s1(i11).q1(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i7 = this.h;
        ly lyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(lyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = false;
        sx sxVar = this.e;
        if (sxVar != null) {
            sxVar.a(false);
        }
        vs vsVar = this.F;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            vs vsVar2 = new vs(8, this, str);
            this.F = vsVar2;
            org.telegram.messenger.g0.i3(vsVar2, z10 ? 300L : 0L);
            return;
        }
        this.x = null;
        if (this.L) {
            F("", "", true, true, true);
            return;
        }
        tw twVar = lyVar.q0;
        qv qvVar = lyVar.i0;
        int currentPosition = twVar.getCurrentPosition();
        if (currentPosition != lyVar.s0 && currentPosition != lyVar.t0) {
            H((String) org.telegram.messenger.np.s1(lyVar.d1).c4.get(currentPosition - lyVar.u0));
            return;
        }
        v4.h0 adapter = qvVar.getAdapter();
        qx qxVar = lyVar.o0;
        if (adapter != qxVar) {
            qvVar.setAdapter(qxVar);
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
            int i7 = this.H;
            this.H = i7 + 1;
            this.J = i7;
        }
        int i10 = this.H;
        this.K = i10;
        this.H = arrayList.size() + i10;
    }

    @Override // v4.h0
    public final int b() {
        return this.H;
    }

    @Override // v4.h0
    public final int d(int i7) {
        boolean z10 = this.d;
        if (z10 && i7 == this.J) {
            return 2;
        }
        return (z10 || !this.y.isEmpty()) ? 0 : 3;
    }

    @Override // v4.h0
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f) != 0) {
            ly lyVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = lyVar.j1.size();
            } else {
                qv qvVar = lyVar.i0;
                rx rxVar = lyVar.j0;
                if (qvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = lyVar.i0.getMeasuredWidth();
                    int i10 = rxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = lyVar.j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) lyVar.j1.get(i14);
                        nt0 C1 = oy.C1(rxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.a / C1.b) * L) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.I += i12;
                            i13++;
                            if (i13 == i7) {
                                break;
                            }
                            i11 = i10;
                            i12 = 0;
                        }
                        i12++;
                        i11 -= min;
                    }
                    if (i13 < i7) {
                        this.I += i12;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) e1Var.a;
        int i10 = this.K;
        if (i10 >= 0 && i7 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.y.get(i7 - i10), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.j1.get(i7);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        if (i7 != 0) {
            ly lyVar = this.M;
            if (i7 == 1) {
                View view2 = new View(lyVar.getContext());
                view2.setLayoutParams(new v4.p0(-1, lyVar.c1));
                view = view2;
            } else if (i7 != 2) {
                ViewGroup.LayoutParams p0Var = new v4.p0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(p0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.i8 i8Var = new org.telegram.ui.Cells.i8(this.c, false, false, lyVar.a2, lyVar.j2);
                i8Var.a(0, org.telegram.messenger.hd.M0(2131750834, null));
                v4.p0 p0Var2 = new v4.p0(-1, -2);
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
        return new cj0(view);
    }
}
