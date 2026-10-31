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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zx extends sk0 {
    public at E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final /* synthetic */ vy L;
    public final Context c;
    public final boolean d;
    public final cy e;
    public final int f;
    public int h;
    public TLRPC.User n;
    public String r;
    public boolean s;
    public boolean w;
    public String x;
    public final ArrayList y = new ArrayList();
    public final HashMap D = new HashMap();
    public int I = -1;
    public int J = -1;

    public zx(vy vyVar, Context context, boolean z10, int i10) {
        this.L = vyVar;
        this.c = context;
        this.d = z10;
        this.f = i10;
        this.e = z10 ? null : new cy(vyVar, context);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
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
        HashMap hashMap = this.D;
        boolean z13 = this.d;
        ArrayList arrayList = this.y;
        vy vyVar = this.L;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            vyVar.o0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = vyVar.l0;
            zx zxVar = vyVar.n0;
            if (!hashMap2.containsKey(str3)) {
                vyVar.l0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                org.telegram.messenger.hs.a0(vyVar.c1).v1(str3, messages_botresults);
            }
            this.r = messages_botresults.next_offset;
            int i10 = 0;
            for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                if (!hashMap.containsKey(botInlineResult.id)) {
                    botInlineResult.query_id = messages_botresults.query_id;
                    arrayList.add(botInlineResult);
                    hashMap.put(botInlineResult.id, botInlineResult);
                    i10++;
                }
            }
            this.s = size == arrayList.size() || TextUtils.isEmpty(this.r);
            if (i10 != 0) {
                if (z11 && size == 0) {
                    f();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            g(size);
                        }
                        zxVar.getClass();
                        o(size, i10);
                    } else if (size != 0) {
                        int i12 = this.H;
                        zxVar.getClass();
                        g(i12 + size);
                        int i13 = this.H;
                        zxVar.getClass();
                        o(i13 + size + 1, i10);
                    } else {
                        int i14 = this.H;
                        zxVar.getClass();
                        o(i14, i10 + 1);
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
        if (vyVar.h0.getAdapter() != this) {
            vyVar.h0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            vyVar.i0.h1(0, 0);
            vyVar.G(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        vy vyVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(vyVar.c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z11;
        cy cyVar = this.e;
        if (cyVar != null) {
            cyVar.a(z11);
        }
        int i11 = vyVar.c1;
        HashMap hashMap = vyVar.l0;
        wv wvVar = vyVar.h0;
        yv yvVar = vyVar.o0;
        int i12 = vyVar.c1;
        TLObject e22 = org.telegram.messenger.vp.r1(i11).e2(org.telegram.messenger.vp.r1(i12).M3);
        boolean z13 = e22 instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.vp.r1(i12).M3;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new x1(this, 4));
                }
                if (z14) {
                    return;
                }
                yvVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            yvVar.e(true);
        }
        this.n = (TLRPC.User) e22;
        final String n10 = c3.i0.n("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.xx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final zx zxVar = zx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = n10;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.Components.yx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zx.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.D.clear();
            if (wvVar.getAdapter() != this) {
                wvVar.setAdapter(this);
            }
            f();
            vyVar.i0.h1(0, 0);
            vyVar.G(2);
        }
        if (z12 && hashMap.containsKey(n10)) {
            E(str, str2, z10, z11, true, n10, (TLObject) hashMap.get(n10));
            return;
        }
        if (vyVar.k0.a.contains(n10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            org.telegram.messenger.hs.a0(i12).M(n10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.vp.r1(i12).p1(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i10 = this.h;
        vy vyVar = this.L;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(vyVar.c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = false;
        cy cyVar = this.e;
        if (cyVar != null) {
            cyVar.a(false);
        }
        at atVar = this.E;
        if (atVar != null) {
            org.telegram.messenger.i0.r(atVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            at atVar2 = new at(8, this, str);
            this.E = atVar2;
            org.telegram.messenger.i0.h3(atVar2, z10 ? 300L : 0L);
            return;
        }
        this.x = null;
        if (this.K) {
            F("", "", true, true, true);
            return;
        }
        cx cxVar = vyVar.p0;
        wv wvVar = vyVar.h0;
        int currentPosition = cxVar.getCurrentPosition();
        if (currentPosition != vyVar.r0 && currentPosition != vyVar.s0) {
            H((String) org.telegram.messenger.vp.r1(vyVar.c1).d4.get(currentPosition - vyVar.t0));
            return;
        }
        s4.g0 adapter = wvVar.getAdapter();
        zx zxVar = vyVar.n0;
        if (adapter != zxVar) {
            wvVar.setAdapter(zxVar);
        }
    }

    public final void H(String str) {
        if (this.w && TextUtils.equals(this.x, str)) {
            this.L.i0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.I = -1;
        this.J = -1;
        this.G = 0;
        boolean z10 = this.d;
        if (z10) {
            this.G = this.H;
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            if (z10) {
                return;
            }
            this.G++;
            return;
        }
        if (z10 && this.H > 0) {
            int i10 = this.G;
            this.G = i10 + 1;
            this.I = i10;
        }
        int i11 = this.G;
        this.J = i11;
        this.G = arrayList.size() + i11;
    }

    @Override // s4.g0
    public final int b() {
        return this.G;
    }

    @Override // s4.g0
    public final int d(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.I) {
            return 2;
        }
        return (z10 || !this.y.isEmpty()) ? 0 : 3;
    }

    @Override // s4.g0
    public final void f() {
        int i10;
        if (this.d && (i10 = this.f) != 0) {
            vy vyVar = this.L;
            if (i10 == Integer.MAX_VALUE) {
                this.H = vyVar.i1.size();
            } else {
                wv wvVar = vyVar.h0;
                ay ayVar = vyVar.i0;
                if (wvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = vyVar.h0.getMeasuredWidth();
                    int i11 = ayVar.J;
                    int L = org.telegram.messenger.i0.L(100.0f);
                    this.H = 0;
                    int size = vyVar.i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) vyVar.i1.get(i15);
                        pu0 C1 = yy.C1(ayVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * L) / measuredWidth) * i11));
                        if (i12 < min) {
                            this.H += i13;
                            i14++;
                            if (i14 == i10) {
                                break;
                            }
                            i12 = i11;
                            i13 = 0;
                        }
                        i13++;
                        i12 -= min;
                    }
                    if (i14 < i10) {
                        this.H += i13;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) c1Var.a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            h2Var.e((TLRPC.BotInlineResult) this.y.get(i10 - i11), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.i1.get(i10);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            vy vyVar = this.L;
            if (i10 == 1) {
                View view2 = new View(vyVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, vyVar.b1));
                view = view2;
            } else if (i10 != 2) {
                ViewGroup.LayoutParams o0Var = new s4.o0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(o0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(this.c, false, false, vyVar.Z1, vyVar.i2);
                n8Var.a(0, org.telegram.messenger.cd.L0(2131750835, null));
                s4.o0 o0Var2 = new s4.o0(-1, -2);
                ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = org.telegram.messenger.i0.L(2.5f);
                ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = org.telegram.messenger.i0.L(5.5f);
                n8Var.setLayoutParams(o0Var2);
                view = n8Var;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            view = h2Var;
        }
        return new ck0(view);
    }
}
