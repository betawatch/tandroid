package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xy extends mm0 {
    public so E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final /* synthetic */ sz L;
    public final Context c;
    public final boolean d;
    public final zy e;
    public final int f;
    public int h;
    public TLRPC.User n;
    public String r;
    public boolean s;
    public boolean v;
    public String w;
    public final ArrayList x = new ArrayList();
    public final HashMap y = new HashMap();
    public int I = -1;
    public int J = -1;

    public xy(sz szVar, Context context, boolean z10, int i10) {
        this.L = szVar;
        this.c = context;
        this.d = z10;
        this.f = i10;
        this.e = z10 ? null : new zy(szVar, context);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        sz szVar = this.L;
        uw uwVar = szVar.h0;
        HashMap hashMap = szVar.l0;
        xy xyVar = szVar.n0;
        if (str == null || !str.equals(this.w)) {
            return;
        }
        this.h = 0;
        if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            F(str, str2, z10, z11, false);
            return;
        }
        HashMap hashMap2 = this.y;
        boolean z13 = this.d;
        ArrayList arrayList = this.x;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap2.clear();
            szVar.o0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            if (!hashMap.containsKey(str3)) {
                hashMap.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(szVar.c1).saveBotCache(str3, messages_botresults);
            }
            this.r = messages_botresults.next_offset;
            int i10 = 0;
            for (int i11 = 0; i11 < messages_botresults.results.size(); i11++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                if (!hashMap2.containsKey(botInlineResult.id)) {
                    botInlineResult.query_id = messages_botresults.query_id;
                    arrayList.add(botInlineResult);
                    hashMap2.put(botInlineResult.id, botInlineResult);
                    i10++;
                }
            }
            this.s = size == arrayList.size() || TextUtils.isEmpty(this.r);
            if (i10 != 0) {
                if (z11 && size == 0) {
                    l();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            m(size);
                        }
                        xyVar.getClass();
                        s(size, i10);
                    } else if (size != 0) {
                        int i12 = this.H;
                        xyVar.getClass();
                        m(i12 + size);
                        int i13 = this.H;
                        xyVar.getClass();
                        s(i13 + size + 1, i10);
                    } else {
                        int i14 = this.H;
                        xyVar.getClass();
                        s(i14, i10 + 1);
                    }
                }
            } else if (arrayList.isEmpty()) {
                l();
            }
        } else {
            l();
        }
        if (z13) {
            return;
        }
        if (uwVar.getAdapter() != this) {
            uwVar.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            szVar.i0.h1(0, 0);
            szVar.G(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        sz szVar = this.L;
        HashMap hashMap = szVar.l0;
        uw uwVar = szVar.h0;
        ww wwVar = szVar.o0;
        int i10 = szVar.c1;
        int i11 = this.h;
        if (i11 != 0) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = str;
        this.v = z11;
        zy zyVar = this.e;
        if (zyVar != null) {
            zyVar.a(z11);
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(MessagesController.getInstance(i10).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i10).gifSearchBot;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new b2(this, 5));
                }
                if (z14) {
                    return;
                }
                wwVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            wwVar.e(true);
        }
        this.n = (TLRPC.User) userOrChat;
        final String m10 = c3.h0.m("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.vy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final xy xyVar = xy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = m10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.wy
                    @Override // java.lang.Runnable
                    public final void run() {
                        xy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.x.clear();
            this.y.clear();
            if (uwVar.getAdapter() != this) {
                uwVar.setAdapter(this);
            }
            l();
            szVar.i0.h1(0, 0);
            szVar.G(2);
        }
        if (z12 && hashMap.containsKey(m10)) {
            E(str, str2, z10, z11, true, m10, (TLObject) hashMap.get(m10));
            return;
        }
        if (szVar.k0.a.contains(m10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            MessagesStorage.getInstance(i10).getBotCache(m10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        sz szVar = this.L;
        uw uwVar = szVar.h0;
        int i10 = szVar.c1;
        if (this.d) {
            return;
        }
        int i11 = this.h;
        if (i11 != 0) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.v = false;
        zy zyVar = this.e;
        if (zyVar != null) {
            zyVar.a(false);
        }
        so soVar = this.E;
        if (soVar != null) {
            AndroidUtilities.cancelRunOnUIThread(soVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            so soVar2 = new so(17, this, str);
            this.E = soVar2;
            AndroidUtilities.runOnUIThread(soVar2, z10 ? 300L : 0L);
            return;
        }
        this.w = null;
        if (this.K) {
            F("", "", true, true, true);
            return;
        }
        int currentPosition = szVar.p0.getCurrentPosition();
        if (currentPosition != szVar.r0 && currentPosition != szVar.s0) {
            H(MessagesController.getInstance(i10).gifSearchEmojies.get(currentPosition - szVar.t0));
            return;
        }
        s4.h0 adapter = uwVar.getAdapter();
        xy xyVar = szVar.n0;
        if (adapter != xyVar) {
            uwVar.setAdapter(xyVar);
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.w, str)) {
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
        ArrayList arrayList = this.x;
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

    @Override // s4.h0
    public final int h() {
        return this.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.I) {
            return 2;
        }
        return (z10 || !this.x.isEmpty()) ? 0 : 3;
    }

    @Override // s4.h0
    public final void l() {
        int i10;
        sz szVar = this.L;
        uw uwVar = szVar.h0;
        if (this.d && (i10 = this.f) != 0) {
            if (i10 == Integer.MAX_VALUE) {
                this.H = szVar.i1.size();
            } else {
                yy yyVar = szVar.i0;
                if (uwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = uwVar.getMeasuredWidth();
                    int i11 = yyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = szVar.i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) szVar.i1.get(i15);
                        rw0 D1 = vz.D1(yyVar.G1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((D1.a / D1.b) * dp) / measuredWidth) * i11));
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
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) e1Var.a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            d2Var.e((TLRPC.BotInlineResult) this.x.get(i10 - i11), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.i1.get(i10);
        d2Var.getClass();
        d2Var.d(0, document, "gif" + document);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            sz szVar = this.L;
            if (i10 == 1) {
                View view2 = new View(szVar.getContext());
                view2.setLayoutParams(new s4.q0(-1, szVar.b1));
                view = view2;
            } else if (i10 != 2) {
                ViewGroup.LayoutParams q0Var = new s4.q0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(q0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(this.c, false, false, szVar.Z1, szVar.i2);
                s8Var.a(0, LocaleController.getString(R.string.FeaturedGifs));
                s4.q0 q0Var2 = new s4.q0(-1, -2);
                ((ViewGroup.MarginLayoutParams) q0Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                s8Var.setLayoutParams(q0Var2);
                view = s8Var;
            }
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.c);
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            view = d2Var;
        }
        return new wl0(view);
    }
}
