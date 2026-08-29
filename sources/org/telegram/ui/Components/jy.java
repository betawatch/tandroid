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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jy extends il0 {
    public gt A;
    public boolean B;
    public int C;
    public int D;
    public boolean G;
    public final /* synthetic */ fz H;
    public final Context c;
    public final boolean d;
    public final ly e;
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

    public jy(fz fzVar, Context context, boolean z10, int i10) {
        this.H = fzVar;
        this.c = context;
        this.d = z10;
        this.f = i10;
        this.e = z10 ? null : new ly(fzVar, context);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
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
        fz fzVar = this.H;
        if (!z13 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            fzVar.k0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = fzVar.h0;
            jy jyVar = fzVar.j0;
            if (!hashMap2.containsKey(str3)) {
                fzVar.h0.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(fzVar.Y0).saveBotCache(str3, messages_botresults);
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
                        jyVar.getClass();
                        s(size, i10);
                    } else if (size != 0) {
                        int i12 = this.D;
                        jyVar.getClass();
                        m(i12 + size);
                        int i13 = this.D;
                        jyVar.getClass();
                        s(i13 + size + 1, i10);
                    } else {
                        int i14 = this.D;
                        jyVar.getClass();
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
        if (fzVar.d0.getAdapter() != this) {
            fzVar.d0.setAdapter(this);
        }
        if (z11 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            fzVar.e0.h1(0, 0);
            fzVar.G(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        int i10 = this.h;
        fz fzVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(fzVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = str;
        this.v = z11;
        ly lyVar = this.e;
        if (lyVar != null) {
            lyVar.a(z11);
        }
        int i11 = fzVar.Y0;
        HashMap hashMap = fzVar.h0;
        fw fwVar = fzVar.d0;
        iw iwVar = fzVar.k0;
        int i12 = fzVar.Y0;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z13 = userOrChat instanceof TLRPC.User;
        boolean z14 = this.d;
        if (!z13) {
            if (z10) {
                if (!this.B) {
                    this.B = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new a2(this, 5));
                }
                if (z14) {
                    return;
                }
                iwVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            iwVar.e(true);
        }
        this.n = (TLRPC.User) userOrChat;
        final String n10 = j7.l1.n("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.hy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final jy jyVar = jy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = n10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.iy
                    @Override // java.lang.Runnable
                    public final void run() {
                        jy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
                    }
                });
            }
        };
        if (!z12 && !z14 && z11 && TextUtils.isEmpty(str2)) {
            this.x.clear();
            this.y.clear();
            if (fwVar.getAdapter() != this) {
                fwVar.setAdapter(this);
            }
            l();
            fzVar.e0.h1(0, 0);
            fzVar.G(2);
        }
        if (z12 && hashMap.containsKey(n10)) {
            E(str, str2, z10, z11, true, n10, (TLObject) hashMap.get(n10));
            return;
        }
        if (fzVar.g0.a.contains(n10)) {
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
        fz fzVar = this.H;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(fzVar.Y0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.v = false;
        ly lyVar = this.e;
        if (lyVar != null) {
            lyVar.a(false);
        }
        gt gtVar = this.A;
        if (gtVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gtVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            gt gtVar2 = new gt(9, this, str);
            this.A = gtVar2;
            AndroidUtilities.runOnUIThread(gtVar2, z10 ? 300L : 0L);
            return;
        }
        this.w = null;
        if (this.G) {
            F("", "", true, true, true);
            return;
        }
        kx kxVar = fzVar.l0;
        fw fwVar = fzVar.d0;
        int currentPosition = kxVar.getCurrentPosition();
        if (currentPosition != fzVar.n0 && currentPosition != fzVar.o0) {
            H(MessagesController.getInstance(fzVar.Y0).gifSearchEmojies.get(currentPosition - fzVar.p0));
            return;
        }
        f2.p0 adapter = fwVar.getAdapter();
        jy jyVar = fzVar.j0;
        if (adapter != jyVar) {
            fwVar.setAdapter(jyVar);
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

    @Override // f2.p0
    public final int h() {
        return this.C;
    }

    @Override // f2.p0
    public final int j(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.E) {
            return 2;
        }
        return (z10 || !this.x.isEmpty()) ? 0 : 3;
    }

    @Override // f2.p0
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f) != 0) {
            fz fzVar = this.H;
            if (i10 == Integer.MAX_VALUE) {
                this.D = fzVar.e1.size();
            } else {
                fw fwVar = fzVar.d0;
                ky kyVar = fzVar.e0;
                if (fwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = fzVar.d0.getMeasuredWidth();
                    int i11 = kyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.D = 0;
                    int size = fzVar.e1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) fzVar.e1.get(i15);
                        bv0 C1 = iz.C1(kyVar.F1(document, document.attributes));
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

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) n1Var.a;
        int i11 = this.F;
        if (i11 >= 0 && i10 >= i11) {
            d2Var.e((TLRPC.BotInlineResult) this.x.get(i10 - i11), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.H.e1.get(i10);
        d2Var.getClass();
        d2Var.d(0, document, "gif" + document);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            fz fzVar = this.H;
            if (i10 == 1) {
                View view2 = new View(fzVar.getContext());
                view2.setLayoutParams(new f2.x0(-1, fzVar.X0));
                view = view2;
            } else if (i10 != 2) {
                ViewGroup.LayoutParams x0Var = new f2.x0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(x0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(this.c, false, false, fzVar.V1, fzVar.e2);
                k8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
                f2.x0 x0Var2 = new f2.x0(-1, -2);
                ((ViewGroup.MarginLayoutParams) x0Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                k8Var.setLayoutParams(x0Var2);
                view = k8Var;
            }
        } else {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(this.c);
            d2Var.setIsKeyboard(true);
            d2Var.setCanPreviewGif(true);
            view = d2Var;
        }
        return new vk0(view);
    }
}
