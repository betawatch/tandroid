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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ay extends vk0 {
    public zq A;
    public boolean B;
    public int C;
    public int D;
    public boolean G;
    public final /* synthetic */ wy H;
    public final Context c;
    public final boolean d;
    public final dy e;
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

    public ay(wy wyVar, Context context, boolean z10, int i9) {
        this.H = wyVar;
        this.c = context;
        this.d = z10;
        this.f = i9;
        this.e = z10 ? null : new dy(wyVar, context);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
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
        wy wyVar = this.H;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            wyVar.k0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = wyVar.h0;
            ay ayVar = wyVar.j0;
            if (!hashMap2.containsKey(str3)) {
                wyVar.h0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(wyVar.Y0).saveBotCache(str3, messages_botresults);
            }
            this.r = messages_botresults.next_offset;
            int i9 = 0;
            for (int i10 = 0; i10 < messages_botresults.results.size(); i10++) {
                TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                if (!hashMap.containsKey(botInlineResult.id)) {
                    botInlineResult.query_id = messages_botresults.query_id;
                    arrayList.add(botInlineResult);
                    hashMap.put(botInlineResult.id, botInlineResult);
                    i9++;
                }
            }
            this.s = size == arrayList.size() || TextUtils.isEmpty(this.r);
            if (i9 != 0) {
                if (z11 && size == 0) {
                    l();
                } else {
                    I();
                    if (!z13) {
                        if (size != 0) {
                            m(size);
                        }
                        ayVar.getClass();
                        s(size, i9);
                    } else if (size != 0) {
                        int i11 = this.D;
                        ayVar.getClass();
                        m(i11 + size);
                        int i12 = this.D;
                        ayVar.getClass();
                        s(i12 + size + 1, i9);
                    } else {
                        int i13 = this.D;
                        ayVar.getClass();
                        s(i13, i9 + 1);
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
        if (wyVar.d0.getAdapter() != this) {
            wyVar.d0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            wyVar.e0.h1(0, 0);
            wyVar.G(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i9 = this.h;
        wy wyVar = this.H;
        if (i9 != 0) {
            if (i9 >= 0) {
                ConnectionsManager.getInstance(wyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = str;
        this.v = z11;
        dy dyVar = this.e;
        if (dyVar != null) {
            dyVar.a(z11);
        }
        int i10 = wyVar.Y0;
        HashMap hashMap = wyVar.h0;
        zv zvVar = wyVar.d0;
        cw cwVar = wyVar.k0;
        int i11 = wyVar.Y0;
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(MessagesController.getInstance(i11).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.B) {
                    this.B = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i11).gifSearchBot;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new w1(this, 5));
                }
                if (z14) {
                    return;
                }
                cwVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            cwVar.e(true);
        }
        this.n = (TLRPC.User) userOrChat;
        final String o6 = j3.r0.o("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.yx
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final ay ayVar = ay.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = o6;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.zx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ay.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.x.clear();
            this.y.clear();
            if (zvVar.getAdapter() != this) {
                zvVar.setAdapter(this);
            }
            l();
            wyVar.e0.h1(0, 0);
            wyVar.G(2);
        }
        if (z12 && hashMap.containsKey(o6)) {
            E(str, str2, z10, z11, true, o6, (TLObject) hashMap.get(o6));
            return;
        }
        if (wyVar.g0.a.contains(o6)) {
            return;
        }
        if (z12) {
            this.h = -1;
            MessagesStorage.getInstance(i11).getBotCache(o6, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        if (str == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i11).getInputUser(this.n);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        this.h = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
    }

    public final void G(String str, boolean z10) {
        if (this.d) {
            return;
        }
        int i9 = this.h;
        wy wyVar = this.H;
        if (i9 != 0) {
            if (i9 >= 0) {
                ConnectionsManager.getInstance(wyVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.v = false;
        dy dyVar = this.e;
        if (dyVar != null) {
            dyVar.a(false);
        }
        zq zqVar = this.A;
        if (zqVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zqVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            zq zqVar2 = new zq(12, this, str);
            this.A = zqVar2;
            AndroidUtilities.runOnUIThread(zqVar2, z10 ? 300L : 0L);
            return;
        }
        this.w = null;
        if (this.G) {
            F("", "", true, true, true);
            return;
        }
        dx dxVar = wyVar.l0;
        zv zvVar = wyVar.d0;
        int currentPosition = dxVar.getCurrentPosition();
        if (currentPosition != wyVar.n0 && currentPosition != wyVar.o0) {
            H(MessagesController.getInstance(wyVar.Y0).gifSearchEmojies.get(currentPosition - wyVar.p0));
            return;
        }
        f2.r0 adapter = zvVar.getAdapter();
        ay ayVar = wyVar.j0;
        if (adapter != ayVar) {
            zvVar.setAdapter(ayVar);
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
            int i9 = this.C;
            this.C = i9 + 1;
            this.E = i9;
        }
        int i10 = this.C;
        this.F = i10;
        this.C = arrayList.size() + i10;
    }

    @Override // f2.r0
    public final int h() {
        return this.C;
    }

    @Override // f2.r0
    public final int j(int i9) {
        boolean z10 = this.d;
        if (z10 && i9 == this.E) {
            return 2;
        }
        return (z10 || !this.x.isEmpty()) ? 0 : 3;
    }

    @Override // f2.r0
    public final void l() {
        int i9;
        if (this.d && (i9 = this.f) != 0) {
            wy wyVar = this.H;
            if (i9 == Integer.MAX_VALUE) {
                this.D = wyVar.e1.size();
            } else {
                zv zvVar = wyVar.d0;
                cy cyVar = wyVar.e0;
                if (zvVar.getMeasuredWidth() != 0) {
                    int measuredWidth = wyVar.d0.getMeasuredWidth();
                    int i10 = cyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.D = 0;
                    int size = wyVar.e1.size();
                    int i11 = i10;
                    int i12 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.Document document = (TLRPC.Document) wyVar.e1.get(i14);
                        qu0 C1 = zy.C1(cyVar.F1(document, document.attributes));
                        int min = Math.min(i10, (int) Math.floor((((C1.a / C1.b) * dp) / measuredWidth) * i10));
                        if (i11 < min) {
                            this.D += i12;
                            i13++;
                            if (i13 == i9) {
                                break;
                            }
                            i11 = i10;
                            i12 = 0;
                        }
                        i12++;
                        i11 -= min;
                    }
                    if (i13 < i9) {
                        this.D += i12;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) q1Var.a;
        int i10 = this.F;
        if (i10 >= 0 && i9 >= i10) {
            e2Var.e((TLRPC.BotInlineResult) this.x.get(i9 - i10), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.H.e1.get(i9);
        e2Var.getClass();
        e2Var.d(0, document, "gif" + document);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        if (i9 != 0) {
            wy wyVar = this.H;
            if (i9 == 1) {
                View view2 = new View(wyVar.getContext());
                view2.setLayoutParams(new f2.a1(-1, wyVar.X0));
                view = view2;
            } else if (i9 != 2) {
                ViewGroup.LayoutParams a1Var = new f2.a1(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(a1Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(this.c, false, false, wyVar.V1, wyVar.e2);
                m8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
                f2.a1 a1Var2 = new f2.a1(-1, -2);
                ((ViewGroup.MarginLayoutParams) a1Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) a1Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                m8Var.setLayoutParams(a1Var2);
                view = m8Var;
            }
        } else {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(this.c);
            e2Var.setIsKeyboard(true);
            e2Var.setCanPreviewGif(true);
            view = e2Var;
        }
        return new ik0(view);
    }
}
