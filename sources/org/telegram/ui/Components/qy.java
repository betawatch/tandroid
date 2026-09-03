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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qy extends rl0 {
    public eo B;
    public boolean C;
    public int D;
    public int E;
    public boolean H;
    public final /* synthetic */ mz I;
    public final Context c;
    public final boolean d;
    public final sy e;
    public final int f;
    public int h;
    public TLRPC.User n;
    public String r;
    public boolean s;
    public boolean v;
    public String w;
    public final ArrayList x = new ArrayList();
    public final HashMap y = new HashMap();
    public int F = -1;
    public int G = -1;

    public qy(mz mzVar, Context context, boolean z4, int i10) {
        this.I = mzVar;
        this.c = context;
        this.d = z4;
        this.f = i10;
        this.e = z4 ? null : new sy(mzVar, context);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
    }

    public final void E(String str, String str2, boolean z4, boolean z10, boolean z11, String str3, TLObject tLObject) {
        if (str == null || !str.equals(this.w)) {
            return;
        }
        this.h = 0;
        if (z11 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            F(str, str2, z4, z10, false);
            return;
        }
        HashMap hashMap = this.y;
        boolean z12 = this.d;
        ArrayList arrayList = this.x;
        mz mzVar = this.I;
        if (!z12 && TextUtils.isEmpty(str2)) {
            arrayList.clear();
            hashMap.clear();
            mzVar.l0.e(false);
        }
        if (tLObject instanceof TLRPC.messages_BotResults) {
            int size = arrayList.size();
            TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
            HashMap hashMap2 = mzVar.i0;
            qy qyVar = mzVar.k0;
            if (!hashMap2.containsKey(str3)) {
                mzVar.i0.put(str3, messages_botresults);
            }
            if (!z11 && messages_botresults.cache_time != 0) {
                MessagesStorage.getInstance(mzVar.Z0).saveBotCache(str3, messages_botresults);
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
                if (z10 && size == 0) {
                    l();
                } else {
                    I();
                    if (!z12) {
                        if (size != 0) {
                            m(size);
                        }
                        qyVar.getClass();
                        s(size, i10);
                    } else if (size != 0) {
                        int i12 = this.E;
                        qyVar.getClass();
                        m(i12 + size);
                        int i13 = this.E;
                        qyVar.getClass();
                        s(i13 + size + 1, i10);
                    } else {
                        int i14 = this.E;
                        qyVar.getClass();
                        s(i14, i10 + 1);
                    }
                }
            } else if (arrayList.isEmpty()) {
                l();
            }
        } else {
            l();
        }
        if (z12) {
            return;
        }
        if (mzVar.e0.getAdapter() != this) {
            mzVar.e0.setAdapter(this);
        }
        if (z10 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            mzVar.f0.h1(0, 0);
            mzVar.G(2);
        }
    }

    public final void F(final String str, final String str2, final boolean z4, final boolean z10, final boolean z11) {
        int i10 = this.h;
        mz mzVar = this.I;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(mzVar.Z0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.w = str;
        this.v = z10;
        sy syVar = this.e;
        if (syVar != null) {
            syVar.a(z10);
        }
        int i11 = mzVar.Z0;
        HashMap hashMap = mzVar.i0;
        lw lwVar = mzVar.e0;
        ow owVar = mzVar.l0;
        int i12 = mzVar.Z0;
        TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(MessagesController.getInstance(i12).gifSearchBot);
        boolean z12 = userOrChat instanceof TLRPC.User;
        boolean z13 = this.d;
        if (!z12) {
            if (z4) {
                if (!this.C) {
                    this.C = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new y1(this, 5));
                }
                if (z13) {
                    return;
                }
                owVar.e(true);
                return;
            }
            return;
        }
        if (!z13 && TextUtils.isEmpty(str2)) {
            owVar.e(true);
        }
        this.n = (TLRPC.User) userOrChat;
        final String k10 = e2.c.k("gif_search_", str, "_", str2);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: org.telegram.ui.Components.oy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final qy qyVar = qy.this;
                final String str3 = str;
                final String str4 = str2;
                final boolean z14 = z4;
                final boolean z15 = z10;
                final boolean z16 = z11;
                final String str5 = k10;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.py
                    @Override // java.lang.Runnable
                    public final void run() {
                        qy.this.E(str3, str4, z14, z15, z16, str5, tLObject);
                    }
                });
            }
        };
        if (!z11 && !z13 && z10 && TextUtils.isEmpty(str2)) {
            this.x.clear();
            this.y.clear();
            if (lwVar.getAdapter() != this) {
                lwVar.setAdapter(this);
            }
            l();
            mzVar.f0.h1(0, 0);
            mzVar.G(2);
        }
        if (z11 && hashMap.containsKey(k10)) {
            E(str, str2, z4, z10, true, k10, (TLObject) hashMap.get(k10));
            return;
        }
        if (mzVar.h0.a.contains(k10)) {
            return;
        }
        if (z11) {
            this.h = -1;
            MessagesStorage.getInstance(i12).getBotCache(k10, requestDelegate);
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

    public final void G(String str, boolean z4) {
        if (this.d) {
            return;
        }
        int i10 = this.h;
        mz mzVar = this.I;
        if (i10 != 0) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(mzVar.Z0).cancelRequest(this.h, true);
            }
            this.h = 0;
        }
        this.v = false;
        sy syVar = this.e;
        if (syVar != null) {
            syVar.a(false);
        }
        eo eoVar = this.B;
        if (eoVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eoVar);
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.w = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            eo eoVar2 = new eo(16, this, str);
            this.B = eoVar2;
            AndroidUtilities.runOnUIThread(eoVar2, z4 ? 300L : 0L);
            return;
        }
        this.w = null;
        if (this.H) {
            F("", "", true, true, true);
            return;
        }
        rx rxVar = mzVar.m0;
        lw lwVar = mzVar.e0;
        int currentPosition = rxVar.getCurrentPosition();
        if (currentPosition != mzVar.o0 && currentPosition != mzVar.p0) {
            H(MessagesController.getInstance(mzVar.Z0).gifSearchEmojies.get(currentPosition - mzVar.q0));
            return;
        }
        f2.p0 adapter = lwVar.getAdapter();
        qy qyVar = mzVar.k0;
        if (adapter != qyVar) {
            lwVar.setAdapter(qyVar);
        }
    }

    public final void H(String str) {
        if (this.v && TextUtils.equals(this.w, str)) {
            this.I.f0.h1(0, 0);
        } else {
            F(str, "", true, true, true);
        }
    }

    public final void I() {
        this.F = -1;
        this.G = -1;
        this.D = 0;
        boolean z4 = this.d;
        if (z4) {
            this.D = this.E;
        }
        ArrayList arrayList = this.x;
        if (arrayList.isEmpty()) {
            if (z4) {
                return;
            }
            this.D++;
            return;
        }
        if (z4 && this.E > 0) {
            int i10 = this.D;
            this.D = i10 + 1;
            this.F = i10;
        }
        int i11 = this.D;
        this.G = i11;
        this.D = arrayList.size() + i11;
    }

    @Override // f2.p0
    public final int h() {
        return this.D;
    }

    @Override // f2.p0
    public final int j(int i10) {
        boolean z4 = this.d;
        if (z4 && i10 == this.F) {
            return 2;
        }
        return (z4 || !this.x.isEmpty()) ? 0 : 3;
    }

    @Override // f2.p0
    public final void l() {
        int i10;
        if (this.d && (i10 = this.f) != 0) {
            mz mzVar = this.I;
            if (i10 == Integer.MAX_VALUE) {
                this.E = mzVar.f1.size();
            } else {
                lw lwVar = mzVar.e0;
                ry ryVar = mzVar.f0;
                if (lwVar.getMeasuredWidth() != 0) {
                    int measuredWidth = mzVar.e0.getMeasuredWidth();
                    int i11 = ryVar.J;
                    int dp = AndroidUtilities.dp(100.0f);
                    this.E = 0;
                    int size = mzVar.f1.size();
                    int i12 = i11;
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.Document document = (TLRPC.Document) mzVar.f1.get(i15);
                        jv0 C1 = pz.C1(ryVar.F1(document, document.attributes));
                        int min = Math.min(i11, (int) Math.floor((((C1.a / C1.b) * dp) / measuredWidth) * i11));
                        if (i12 < min) {
                            this.E += i13;
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
                        this.E += i13;
                    }
                }
            }
        }
        I();
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) m1Var.a;
        int i11 = this.G;
        if (i11 >= 0 && i10 >= i11) {
            e2Var.e((TLRPC.BotInlineResult) this.x.get(i10 - i11), this.n, true, false, false, true);
            return;
        }
        TLRPC.Document document = (TLRPC.Document) this.I.f1.get(i10);
        e2Var.getClass();
        e2Var.d(0, document, "gif" + document);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            mz mzVar = this.I;
            if (i10 == 1) {
                View view2 = new View(mzVar.getContext());
                view2.setLayoutParams(new f2.x0(-1, mzVar.Y0));
                view = view2;
            } else if (i10 != 2) {
                ViewGroup.LayoutParams x0Var = new f2.x0(-1, -2);
                View view3 = this.e;
                view3.setLayoutParams(x0Var);
                view = view3;
            } else {
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(this.c, false, false, mzVar.W1, mzVar.f2);
                m8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
                f2.x0 x0Var2 = new f2.x0(-1, -2);
                ((ViewGroup.MarginLayoutParams) x0Var2).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) x0Var2).bottomMargin = AndroidUtilities.dp(5.5f);
                m8Var.setLayoutParams(x0Var2);
                view = m8Var;
            }
        } else {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(this.c);
            e2Var.setIsKeyboard(true);
            e2Var.setCanPreviewGif(true);
            view = e2Var;
        }
        return new el0(view);
    }
}
