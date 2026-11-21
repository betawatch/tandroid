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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xx extends dk0 {
    public ou F;
    public boolean G;
    public int H;
    public int I;
    public boolean L;
    public final /* synthetic */ ty M;
    public final Context c;
    public final boolean d;
    public final zx e;
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

    public xx(ty tyVar, Context context, boolean z10, int i7) {
        this.M = tyVar;
        this.c = context;
        this.d = z10;
        this.f = i7;
        this.e = z10 ? null : new zx(tyVar, context);
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
        ty tyVar = this.M;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            tyVar.p0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = tyVar.m0;
            xx xxVar = tyVar.o0;
            if (!hashMap2.containsKey(str3)) {
                tyVar.m0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                org.telegram.messenger.tr.a0(tyVar.d1).v1(str3, messages_botresults);
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
                        xxVar.getClass();
                        o(size, i7);
                    } else if (size != 0) {
                        int i11 = this.I;
                        xxVar.getClass();
                        g(i11 + size);
                        int i12 = this.I;
                        xxVar.getClass();
                        o(i12 + size + 1, i7);
                    } else {
                        int i13 = this.I;
                        xxVar.getClass();
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
        if (tyVar.i0.getAdapter() != this) {
            tyVar.i0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            tyVar.j0.h1(0, 0);
            tyVar.F(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i7 = this.h;
        ty tyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(tyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z11;
        zx zxVar = this.e;
        if (zxVar != null) {
            zxVar.a(z11);
        }
        int i10 = tyVar.d1;
        HashMap hashMap = tyVar.m0;
        yv yvVar = tyVar.i0;
        aw awVar = tyVar.p0;
        int i11 = tyVar.d1;
        TLObject h22 = org.telegram.messenger.mp.u1(i10).h2(org.telegram.messenger.mp.u1(i11).N3);
        boolean z13 = h22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.G) {
                    this.G = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.mp.u1(i11).N3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new f2(this, 4));
                }
                if (z14) {
                    return;
                }
                awVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            awVar.e(true);
        }
        this.n = (TLRPC.User) h22;
        final String l10 = com.google.android.gms.internal.vision.e2.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.vx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final xx xxVar = xx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = l10;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.Components.wx
                    @Override // java.lang.Runnable
                    public final void run() {
                        xx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.E.clear();
            if (yvVar.getAdapter() != this) {
                yvVar.setAdapter(this);
            }
            f();
            tyVar.j0.h1(0, 0);
            tyVar.F(2);
        }
        if (z12 && hashMap.containsKey(l10)) {
            E(str, str2, z10, z11, true, l10, (TLObject) hashMap.get(l10));
            return;
        }
        if (tyVar.l0.a.contains(l10)) {
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
        ty tyVar = this.M;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(tyVar.d1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = false;
        zx zxVar = this.e;
        if (zxVar != null) {
            zxVar.a(false);
        }
        ou ouVar = this.F;
        if (ouVar != null) {
            org.telegram.messenger.g0.r(ouVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            ou ouVar2 = new ou(6, this, str);
            this.F = ouVar2;
            org.telegram.messenger.g0.h3(ouVar2, z10 ? 300L : 0L);
            return;
        }
        this.x = null;
        if (this.L) {
            F("", "", true, true, true);
            return;
        }
        bx bxVar = tyVar.q0;
        yv yvVar = tyVar.i0;
        int currentPosition = bxVar.getCurrentPosition();
        if (currentPosition != tyVar.s0 && currentPosition != tyVar.t0) {
            H((String) org.telegram.messenger.mp.u1(tyVar.d1).e4.get(currentPosition - tyVar.u0));
            return;
        }
        v4.i0 adapter = yvVar.getAdapter();
        xx xxVar = tyVar.o0;
        if (adapter != xxVar) {
            yvVar.setAdapter(xxVar);
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
            ty tyVar = this.M;
            if (i7 == Integer.MAX_VALUE) {
                this.I = tyVar.j1.size();
            } else {
                yv yvVar = tyVar.i0;
                yx yxVar = tyVar.j0;
                if (yvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = tyVar.i0.getMeasuredWidth();
                    int i10 = yxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.I = 0;
                    int size = tyVar.j1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) tyVar.j1.get(i14);
                        yt0 C1 = wy.C1(yxVar.F1(document, document.attributes));
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
            ty tyVar = this.M;
            if (i7 == 1) {
                View view2 = new View(tyVar.getContext());
                view2.setLayoutParams(new v4.q0(-1, tyVar.c1));
                view = view2;
            } else if (i7 != 2) {
                ViewGroup.LayoutParams q0Var = new v4.q0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(q0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(this.c, false, false, tyVar.a2, tyVar.j2);
                k8Var.a(0, org.telegram.messenger.gd.N0(2131750822, null));
                v4.q0 q0Var2 = new v4.q0(-1, -2);
                ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                k8Var.setLayoutParams(q0Var2);
                view = k8Var;
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
