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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lx extends oj0 {
    public ro E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final /* synthetic */ gy L;
    public final Context c;
    public final boolean d;
    public final nx e;
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

    public lx(gy gyVar, Context context, boolean z9, int i7) {
        this.L = gyVar;
        this.c = context;
        this.d = z9;
        this.f = i7;
        this.e = z9 ? null : new nx(gyVar, context);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    public final void E(String str, String str2, boolean z9, boolean z10, boolean z11, String str3, TLObject tLObject) {
        if (str == null || !str.equals(this.x)) {
            return;
        }
        this.h = 0;
        if (z11 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            F(str, str2, z9, z10, false);
            return;
        }
        HashMap hashMap = this.D;
        boolean z12 = this.d;
        ArrayList arrayList = this.y;
        gy gyVar = this.L;
        if (!z12 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            gyVar.o0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = gyVar.l0;
            lx lxVar = gyVar.n0;
            if (!hashMap2.containsKey(str3)) {
                gyVar.l0.put(str3, messages_botresults);
            }
            if (!z11 && messages_botresults.cache_time != 0) {
                org.telegram.messenger.yr.a0(gyVar.c1).v1(str3, messages_botresults);
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
                if (z10 && size == 0) {
                    f();
                } else {
                    I();
                    if (!z12) {
                        if (size != 0) {
                            g(size);
                        }
                        lxVar.getClass();
                        o(size, i7);
                    } else if (size != 0) {
                        int i11 = this.H;
                        lxVar.getClass();
                        g(i11 + size);
                        int i12 = this.H;
                        lxVar.getClass();
                        o(i12 + size + 1, i7);
                    } else {
                        int i13 = this.H;
                        lxVar.getClass();
                        o(i13, i7 + 1);
                    }
                }
            } else if (arrayList.isEmpty()) {
                f();
            }
        } else {
            f();
        }
        if (z12) {
            return;
        }
        if (gyVar.h0.getAdapter() != this) {
            gyVar.h0.setAdapter(this);
        }
        if (z10 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            gyVar.i0.h1(0, 0);
            gyVar.E(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z9, final boolean z10, final boolean z11) {
        int i7 = this.h;
        gy gyVar = this.L;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(gyVar.c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.x = str;
        this.w = z10;
        nx nxVar = this.e;
        if (nxVar != null) {
            nxVar.a(z10);
        }
        int i10 = gyVar.c1;
        HashMap hashMap = gyVar.l0;
        kv kvVar = gyVar.h0;
        mv mvVar = gyVar.o0;
        int i11 = gyVar.c1;
        TLObject f22 = org.telegram.messenger.qp.s1(i10).f2(org.telegram.messenger.qp.s1(i11).K3);
        boolean z12 = f22 instanceof TLRPC.User;
        boolean z13 = this.d;
        if (!z12) {
            if (z9) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = org.telegram.messenger.qp.s1(i11).K3;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new w1(this, 4));
                }
                if (z13) {
                    return;
                }
                mvVar.e(true);
                return;
            }
            return;
        }
        if (!z13 && TextUtils.isEmpty(str2)) {
            mvVar.e(true);
        }
        this.n = (TLRPC.User) f22;
        final String l10 = com.google.android.recaptcha.internal.a.l("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.jx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final lx lxVar = lx.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z14 = z9;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final String str5 = l10;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.Components.kx
                    @Override // java.lang.Runnable
                    public final void run() {
                        lx.this.E(str3, str4, z14, z15, z16, str5, tLObject);
                    }
                });
            }
        };
        if (!z11 && !z13 && z10 && TextUtils.isEmpty(str2)) {
            this.y.clear();
            this.D.clear();
            if (kvVar.getAdapter() != this) {
                kvVar.setAdapter(this);
            }
            f();
            gyVar.i0.h1(0, 0);
            gyVar.E(2);
        }
        if (z11 && hashMap.containsKey(l10)) {
            E(str, str2, z9, z10, true, l10, (TLObject) hashMap.get(l10));
            return;
        }
        if (gyVar.k0.a.contains(l10)) {
            return;
        }
        if (z11) {
            this.h = -1;
            org.telegram.messenger.yr.a0(i11).M(l10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.qp.s1(i11).q1(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z9) {
        if (this.d) {
            return;
        }
        int i7 = this.h;
        gy gyVar = this.L;
        if (i7 != 0) {
            if (i7 >= 0) {
                ConnectionsManager.getInstance(gyVar.c1).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = false;
        nx nxVar = this.e;
        if (nxVar != null) {
            nxVar.a(false);
        }
        ro roVar = this.E;
        if (roVar != null) {
            org.telegram.messenger.g0.r(roVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.x = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            ro roVar2 = new ro(15, this, str);
            this.E = roVar2;
            org.telegram.messenger.g0.i3(roVar2, z9 ? 300L : 0L);
            return;
        }
        this.x = null;
        if (this.K) {
            F("", "", true, true, true);
            return;
        }
        nw nwVar = gyVar.p0;
        kv kvVar = gyVar.h0;
        int currentPosition = nwVar.getCurrentPosition();
        if (currentPosition != gyVar.r0 && currentPosition != gyVar.s0) {
            H((String) org.telegram.messenger.qp.s1(gyVar.c1).b4.get(currentPosition - gyVar.t0));
            return;
        }
        v4.g0 adapter = kvVar.getAdapter();
        lx lxVar = gyVar.n0;
        if (adapter != lxVar) {
            kvVar.setAdapter(lxVar);
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
        boolean z9 = this.d;
        if (z9) {
            this.G = this.H;
        }
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            if (z9) {
                return;
            }
            this.G++;
            return;
        }
        if (z9 && this.H > 0) {
            int i7 = this.G;
            this.G = i7 + 1;
            this.I = i7;
        }
        int i10 = this.G;
        this.J = i10;
        this.G = arrayList.size() + i10;
    }

    @Override // v4.g0
    public final int b() {
        return this.G;
    }

    @Override // v4.g0
    public final int d(int i7) {
        boolean z9 = this.d;
        if (z9 && i7 == this.I) {
            return 2;
        }
        return (z9 || !this.y.isEmpty()) ? 0 : 3;
    }

    @Override // v4.g0
    public final void f() {
        int i7;
        if (this.d && (i7 = this.f) != 0) {
            gy gyVar = this.L;
            if (i7 == Integer.MAX_VALUE) {
                this.H = gyVar.i1.size();
            } else {
                kv kvVar = gyVar.h0;
                mx mxVar = gyVar.i0;
                if (kvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = gyVar.h0.getMeasuredWidth();
                    int i10 = mxVar.J;
                    int L = org.telegram.messenger.g0.L(100.0f);
                    this.H = 0;
                    int size = gyVar.i1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) gyVar.i1.get(i14);
                        nt0 C1 = jy.C1(mxVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.a / C1.b) * L) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.H += i12;
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
                        this.H += i12;
                    }
                }
            }
        }
        I();
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) d1Var.a;
        int i10 = this.J;
        if (i10 >= 0 && i7 >= i10) {
            h2Var.e((TLRPC.BotInlineResult) this.y.get(i7 - i10), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.i1.get(i7);
        h2Var.getClass();
        h2Var.d(0, "gif" + document, document);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        if (i7 != 0) {
            gy gyVar = this.L;
            if (i7 == 1) {
                View view2 = new View(gyVar.getContext());
                view2.setLayoutParams(new v4.o0(-1, gyVar.b1));
                view = view2;
            } else if (i7 != 2) {
                ViewGroup.LayoutParams o0Var = new v4.o0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(o0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.c, false, false, gyVar.Z1, gyVar.i2);
                j8Var.a(0, org.telegram.messenger.id.M0(2131750834, null));
                v4.o0 o0Var2 = new v4.o0(-1, -2);
                ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = org.telegram.messenger.g0.L(2.5f);
                ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = org.telegram.messenger.g0.L(5.5f);
                j8Var.setLayoutParams(o0Var2);
                view = j8Var;
            }
        } else {
            org.telegram.ui.Cells.h2 h2Var = new org.telegram.ui.Cells.h2(this.c);
            h2Var.setIsKeyboard(true);
            h2Var.setCanPreviewGif(true);
            view = h2Var;
        }
        return new xi0(view);
    }
}
