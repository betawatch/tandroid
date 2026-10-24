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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class yy extends lm0 {
    public yt E;
    public boolean F;
    public int G;
    public int H;
    public boolean K;
    public final /* synthetic */ tz L;
    public final Context c;
    public final boolean d;
    public final az e;
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

    public yy(tz tzVar, Context context, boolean z10, int i10) {
        this.L = tzVar;
        this.c = context;
        this.d = z10;
        this.f = i10;
        this.e = z10 ? null : new az(tzVar, context);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    public final void E(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, TLObject tLObject) {
        tz tzVar = this.L;
        uw uwVar = tzVar.h0;
        HashMap hashMap = tzVar.l0;
        yy yyVar = tzVar.n0;
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
            tzVar.o0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            if (!hashMap.containsKey(str3)) {
                hashMap.put(str3, messages_botresults);
            }
            if (!z12 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(tzVar.c1).saveBotCache(str3, messages_botresults);
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
                        yyVar.getClass();
                        s(size, i10);
                    } else if (size != 0) {
                        int i12 = this.H;
                        yyVar.getClass();
                        m(i12 + size);
                        int i13 = this.H;
                        yyVar.getClass();
                        s(i13 + size + 1, i10);
                    } else {
                        int i14 = this.H;
                        yyVar.getClass();
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
            tzVar.i0.h1(0, 0);
            tzVar.E(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z10, final boolean z11, final boolean z12) {
        tz tzVar = this.L;
        HashMap hashMap = tzVar.l0;
        uw uwVar = tzVar.h0;
        xw xwVar = tzVar.o0;
        int i10 = tzVar.c1;
        int i11 = this.h;
        if (i11 != 0) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = str;
        this.v = z11;
        az azVar = this.e;
        if (azVar != null) {
            azVar.a(z11);
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
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new x1(this, 5));
                }
                if (z14) {
                    return;
                }
                xwVar.e(true);
                return;
            }
            return;
        }
        if (!z14 && TextUtils.isEmpty(str2)) {
            xwVar.e(true);
        }
        this.n = (TLRPC.User) userOrChat;
        final String j10 = com.google.android.gms.internal.play_billing.k3.j("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.wy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final yy yyVar = yy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final boolean z17 = z12;
                final String str5 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.xy
                    @Override // java.lang.Runnable
                    public final void run() {
                        yy.this.E(str3, str4, z15, z16, z17, str5, tLObject);
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
            tzVar.i0.h1(0, 0);
            tzVar.E(2);
        }
        if (z12 && hashMap.containsKey(j10)) {
            E(str, str2, z10, z11, true, j10, (TLObject) hashMap.get(j10));
            return;
        }
        if (tzVar.k0.a.contains(j10)) {
            return;
        }
        if (z12) {
            this.h = -1;
            MessagesStorage.getInstance(i10).getBotCache(j10, requestDelegate);
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
        tz tzVar = this.L;
        uw uwVar = tzVar.h0;
        int i10 = tzVar.c1;
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
        az azVar = this.e;
        if (azVar != null) {
            azVar.a(false);
        }
        yt ytVar = this.E;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            yt ytVar2 = new yt(7, this, str);
            this.E = ytVar2;
            AndroidUtilities.runOnUIThread(ytVar2, z10 ? 300L : 0L);
            return;
        }
        this.w = null;
        if (this.K) {
            F("", "", true, true, true);
            return;
        }
        int currentPosition = tzVar.p0.getCurrentPosition();
        if (currentPosition != tzVar.r0 && currentPosition != tzVar.s0) {
            H(MessagesController.getInstance(i10).gifSearchEmojies.get(currentPosition - tzVar.t0));
            return;
        }
        s4.g0 adapter = uwVar.getAdapter();
        yy yyVar = tzVar.n0;
        if (adapter != yyVar) {
            uwVar.setAdapter(yyVar);
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

    @Override // s4.g0
    public final int h() {
        return this.G;
    }

    @Override // s4.g0
    public final int j(int i10) {
        boolean z10 = this.d;
        if (z10 && i10 == this.I) {
            return 2;
        }
        return (z10 || !this.x.isEmpty()) ? 0 : 3;
    }

    @Override // s4.g0
    public final void l() {
        int i10;
        tz tzVar = this.L;
        uw uwVar = tzVar.h0;
        if (this.d && (i10 = this.f) != 0) {
            if (i10 == Integer.MAX_VALUE) {
                this.H = tzVar.i1.size();
            } else {
                zy zyVar = tzVar.i0;
                if (uwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = uwVar.getMeasuredWidth();
                    int i11 = zyVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.H = 0;
                    int size = tzVar.i1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) tzVar.i1.get(i15);
                        iw0 C1 = wz.C1(zyVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * dp) / measuredWidth) * i11));
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) b1Var.a;
        int i11 = this.J;
        if (i11 >= 0 && i10 >= i11) {
            e2Var.e((TLRPC.BotInlineResult) this.x.get(i10 - i11), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.L.i1.get(i10);
        e2Var.getClass();
        e2Var.d(0, document, "gif" + document);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            tz tzVar = this.L;
            if (i10 == 1) {
                View view2 = new View(tzVar.getContext());
                view2.setLayoutParams(new s4.o0(-1, tzVar.b1));
                view = view2;
            } else if (i10 != 2) {
                ViewGroup.LayoutParams o0Var = new s4.o0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(o0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(this.c, false, false, tzVar.Z1, tzVar.i2);
                o8Var.a(0, LocaleController.getString(R.string.FeaturedGifs));
                s4.o0 o0Var2 = new s4.o0(-1, -2);
                ((ViewGroup.MarginLayoutParams) o0Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                o8Var.setLayoutParams(o0Var2);
                view = o8Var;
            }
        } else {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(this.c);
            e2Var.setIsKeyboard(true);
            e2Var.setCanPreviewGif(true);
            view = e2Var;
        }
        return new wl0(view);
    }
}
