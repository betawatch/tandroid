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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ux extends dk0 {
    public bt F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final /* synthetic */ qy M;
    public final Context c;
    public final boolean d;
    public final wx e;
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

    public ux(qy qyVar, Context context, boolean z10, int i7) {
        this.M = qyVar;
        this.c = context;
        this.d = z10;
        this.f = i7;
        this.e = z10 ? null : new wx(qyVar, context);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
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
        qy qyVar = this.M;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            qyVar.p0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = qyVar.m0;
            ux uxVar = qyVar.o0;
            if (!hashMap2.containsKey(str3)) {
                qyVar.m0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                org.telegram.messenger.tr.a0(qyVar.d1).v1(str3, messages_botresults);
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
                        uxVar.getClass();
                        o(size, i7);
                    } else if (size != 0) {
                        int i11 = this.I;
                        uxVar.getClass();
                        g(i11 + size);
                        int i12 = this.I;
                        uxVar.getClass();
                        o(i12 + size + 1, i7);
                    } else {
                        int i13 = this.I;
                        uxVar.getClass();
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
        if (qyVar.i0.getAdapter() != this) {
            qyVar.i0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            qyVar.j0.h1(0, 0);
            qyVar.E(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        qy qyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(qyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z11;
        wx wxVar = this.e;
        if (wxVar != null) {
            wxVar.a(z11);
        }
        int i10 = qyVar.d1;
        HashMap hashMap = qyVar.m0;
        vv vvVar = qyVar.i0;
        xv xvVar = qyVar.p0;
        int i11 = qyVar.d1;
        TLObject h22 = org.telegram.messenger.mp.u1(i10).h2(org.telegram.messenger.mp.u1(i11).N3);
        boolean z13 = h22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.mp.u1(i11).N3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new e2(this, 4));
                }
                if (z14) {
                    return;
                }
                xvVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            xvVar.e(true);
        }
        this.n = (TLRPC.User) h22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.sx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ux uxVar = ux.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.tx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ux.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (vvVar.getAdapter() != this) {
                vvVar.setAdapter(this);
            }
            f();
            qyVar.j0.h1(0, 0);
            qyVar.E(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
            return;
        }
        if (qyVar.l0.a.contains(l10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            org.telegram.messenger.tr.a0(i11).M(l10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.mp.u1(i11).s1(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i7 = this.h;
        qy qyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(qyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = false;
        wx wxVar = this.e;
        if (wxVar != null) {
            wxVar.a(false);
        }
        bt btVar = this.F;
        if (btVar != null) {
            org.telegram.messenger.g0.r(btVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            bt btVar2 = new bt(8, this, str);
            this.F = btVar2;
            org.telegram.messenger.g0.h3(btVar2, z10 ? 300L : 0L);
            return;
        }
        this.x = null;
        if (this.L) {
            F("", "", true, true, true);
            return;
        }
        yw ywVar = qyVar.q0;
        vv vvVar = qyVar.i0;
        int currentPosition = ywVar.getCurrentPosition();
        if (currentPosition != qyVar.s0 && currentPosition != qyVar.t0) {
            H((String) org.telegram.messenger.mp.u1(qyVar.d1).e4.get(currentPosition - qyVar.u0));
            return;
        }
        v4.i0 adapter = vvVar.getAdapter();
        ux uxVar = qyVar.o0;
        if (adapter != uxVar) {
            vvVar.setAdapter(uxVar);
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

    @Override // v4.i0
    public final int b() {
        return this.H;
    }

    @Override // v4.i0
    public final int d(int i7) {
        boolean z10 = this.d;
        if (z10 && i7 == this.J) {
            return 2;
        }
        return (z10 || !this.y.isEmpty()) ? 0 : 3;
    }

    @Override // v4.i0
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f) != 0) {
            qy qyVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = qyVar.j1.size();
            } else {
                vv vvVar = qyVar.i0;
                vx vxVar = qyVar.j0;
                if (vvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = qyVar.i0.getMeasuredWidth();
                    int i10 = vxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = qyVar.j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) qyVar.j1.get(i14);
                        xt0 C1 = ty.C1(vxVar.F1(document, document.attributes));
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) f1Var.a;
        int i10 = this.K;
        if (i10 >= 0 && i7 >= i10) {
            i2Var.e((TLRPC.BotInlineResult) this.y.get(i7 - i10), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.M.j1.get(i7);
        i2Var.getClass();
        i2Var.d(0, "gif" + document, document);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        if (i7 != 0) {
            qy qyVar = this.M;
            if (i7 == 1) {
                View view2 = new View(qyVar.getContext());
                view2.setLayoutParams(new v4.q0(-1, qyVar.c1));
                view = view2;
            } else if (i7 != 2) {
                ViewGroup.LayoutParams q0Var = new v4.q0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(q0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.c, false, false, qyVar.a2, qyVar.j2);
                j8Var.a(0, org.telegram.messenger.gd.N0(2131750822, null));
                v4.q0 q0Var2 = new v4.q0(-1, -2);
                ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                j8Var.setLayoutParams(q0Var2);
                view = j8Var;
            }
        } else {
            org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(this.c);
            i2Var.setIsKeyboard(true);
            i2Var.setCanPreviewGif(true);
            view = i2Var;
        }
        return new mj0(view);
    }
}
