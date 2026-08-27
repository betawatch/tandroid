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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cy extends yk0 {
    public xq A;
    public boolean B;
    public int C;
    public int D;
    public boolean G;
    public final /* synthetic */ yy H;
    public final Context c;
    public final boolean d;
    public final ey e;
    public final int f;
    public int h;
    public TLRPC.User n;
    public String r;
    public boolean s;
    public boolean v;
    public String w;
    public final ArrayList x = new ArrayList();
    public final HashMap y = new HashMap();
    public int E = -1;
    public int F = -1;

    public cy(yy yyVar, Context context, boolean z10, int i10) {
        this.H = yyVar;
        this.c = context;
        this.d = z10;
        this.f = i10;
        this.e = z10 ? null : new ey(yyVar, context);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        if (str == null || !str.equals(this.w)) {
            return;
        }
        this.h = 0;
        if (z12 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            F(str, str2, z10, z11, false);
            return;
        }
        HashMap hashMap = this.y;
        boolean z13 = this.d;
        ArrayList arrayList = this.x;
        yy yyVar = this.H;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            yyVar.k0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = yyVar.h0;
            cy cyVar = yyVar.j0;
            if (!hashMap2.containsKey(str3)) {
                yyVar.h0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(yyVar.Y0).saveBotCache(str3, messages_botresults);
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
                    l();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            m(size);
                        }
                        cyVar.getClass();
                        s(size, i10);
                    } else if (size != 0) {
                        int i12 = this.D;
                        cyVar.getClass();
                        m(i12 + size);
                        int i13 = this.D;
                        cyVar.getClass();
                        s(i13 + size + 1, i10);
                    } else {
                        int i14 = this.D;
                        cyVar.getClass();
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
        if (yyVar.d0.getAdapter() != this) {
            yyVar.d0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            yyVar.e0.h1(0, 0);
            yyVar.H(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        yy yyVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(yyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = str;
        this.v = z11;
        ey eyVar = this.e;
        if (eyVar != null) {
            eyVar.a(z11);
        }
        int i11 = yyVar.Y0;
        HashMap hashMap = yyVar.h0;
        yv yvVar = yyVar.d0;
        bw bwVar = yyVar.k0;
        int i12 = yyVar.Y0;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.B) {
                    this.B = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new w1(this, 5));
                }
                if (z14) {
                    return;
                }
                bwVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            bwVar.e(true);
        }
        this.n = (TLRPC.User) userOrChat;
        final String n10 = i0.a.n("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.zx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final cy cyVar = cy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = n10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ay
                    @Override // java.lang.Runnable
                    public final void run() {
                        cy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.x.clear();
            this.y.clear();
            if (yvVar.getAdapter() != this) {
                yvVar.setAdapter(this);
            }
            l();
            yyVar.e0.h1(0, 0);
            yyVar.H(2);
        }
        if (z12 && hashMap.containsKey(n10)) {
            E(str, str2, z10, z11, true, n10, (TLObject) hashMap.get(n10));
            return;
        }
        if (yyVar.g0.a.contains(n10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            MessagesStorage.getInstance(i12).getBotCache(n10, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i10 = this.h;
        yy yyVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(yyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.v = false;
        ey eyVar = this.e;
        if (eyVar != null) {
            eyVar.a(false);
        }
        xq xqVar = this.A;
        if (xqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xqVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            xq xqVar2 = new xq(12, this, str);
            this.A = xqVar2;
            AndroidUtilities.runOnUIThread(xqVar2, z10 ? 300L : 0L);
            return;
        }
        this.w = null;
        if (this.G) {
            F("", "", true, true, true);
            return;
        }
        dx dxVar = yyVar.l0;
        yv yvVar = yyVar.d0;
        int currentPosition = dxVar.getCurrentPosition();
        if (currentPosition != yyVar.n0 && currentPosition != yyVar.o0) {
            H(MessagesController.getInstance(yyVar.Y0).gifSearchEmojies.get(currentPosition - yyVar.p0));
            return;
        }
        f2.q0 adapter = yvVar.getAdapter();
        cy cyVar = yyVar.j0;
        if (adapter != cyVar) {
            yvVar.setAdapter(cyVar);
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.w, str)) {
            this.H.e0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.E = -1;
        this.F = -1;
        this.C = 0;
        boolean z10 = this.d;
        if (z10) {
            this.C = this.D;
        }
        ArrayList arrayList = this.x;
        if (arrayList.isEmpty()) {
            if (z10) {
                return;
            }
            this.C++;
            return;
        }
        if (z10 && this.D > 0) {
            int i10 = this.C;
            this.C = i10 + 1;
            this.E = i10;
        }
        int i11 = this.C;
        this.F = i11;
        this.C = arrayList.size() + i11;
    }

    @Override // f2.q0
    public final int h() {
        return this.C;
    }

    @Override // f2.q0
    public final int j(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.E) {
            return 2;
        }
        return (z10 || !this.x.isEmpty()) ? 0 : 3;
    }

    @Override // f2.q0
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f) != 0) {
            yy yyVar = this.H;
            if (i10 == Integer.MAX_VALUE) {
                this.D = yyVar.e1.size();
            } else {
                yv yvVar = yyVar.d0;
                dy dyVar = yyVar.e0;
                if (yvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = yyVar.d0.getMeasuredWidth();
                    int i11 = dyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.D = 0;
                    int size = yyVar.e1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) yyVar.e1.get(i15);
                        tu0 C1 = bz.C1(dyVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * dp) / measuredWidth) * i11));
                        if (i12 < min) {
                            this.D += i13;
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
                        this.D += i13;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) o1Var.a;
        int i11 = this.F;
        if (i11 >= 0 && i10 >= i11) {
            d2Var.e((TLRPC.BotInlineResult) this.x.get(i10 - i11), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.H.e1.get(i10);
        d2Var.getClass();
        d2Var.d(0, document, "gif" + document);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            yy yyVar = this.H;
            if (i10 == 1) {
                View view2 = new View(yyVar.getContext());
                view2.setLayoutParams(new f2.y0(-1, yyVar.X0));
                view = view2;
            } else if (i10 != 2) {
                ViewGroup.LayoutParams y0Var = new f2.y0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(y0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(this.c, false, false, yyVar.V1, yyVar.e2);
                j8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
                f2.y0 y0Var2 = new f2.y0(-1, -2);
                ((ViewGroup.MarginLayoutParams) y0Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                j8Var.setLayoutParams(y0Var2);
                view = j8Var;
            }
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.c);
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            view = d2Var;
        }
        return new lk0(view);
    }
}
