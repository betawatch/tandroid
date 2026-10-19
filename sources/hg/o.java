package hg;

import ai.y9;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import ei.r5;
import gi.g2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ki.h2;
import ki.w3;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.b91;
import org.telegram.ui.cy;
import org.telegram.ui.jg0;
import yh.g4;
import yh.l2;
import yh.m2;
import yh.s3;
import yh.z2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        final int i10;
        final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.web.i iVar = kVar.y;
        ArrayList arrayList2 = kVar.x;
        if (!kVar.b && arrayList2.isEmpty()) {
            arrayList.add(g61.k(kVar.d));
        }
        final int i11 = 0;
        SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
        ArrayList arrayList3 = new ArrayList();
        String string = sharedPreferences.getString("queries_json", null);
        if (string != null) {
            try {
                ArrayList arrayList4 = new ArrayList();
                JSONArray jSONArray = new JSONArray(string);
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    jVar.c = jSONObject.optDouble("rank", 0.0d);
                    arrayList4.add(jVar);
                }
                Collections.sort(arrayList4, new jg0(12));
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj3;
                    if (arrayList3.size() >= 20) {
                        break;
                    } else {
                        arrayList3.add(jVar2.a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        arrayList2.size();
        arrayList3.size();
        if (!arrayList2.isEmpty()) {
            arrayList.add(g61.k(kVar.v));
        }
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= arrayList2.size()) {
                break;
            }
            final String str = (String) arrayList2.get(i14);
            boolean z10 = i14 == 0;
            boolean z11 = i14 == arrayList2.size() - 1;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            org.telegram.ui.r rVar = kVar.M;
                            if (rVar != null) {
                                rVar.run(str);
                                break;
                            }
                            break;
                        default:
                            org.telegram.ui.r rVar2 = kVar.M;
                            if (rVar2 != null) {
                                rVar2.run(str);
                                break;
                            }
                            break;
                    }
                }
            };
            int i15 = org.telegram.ui.web.d.a;
            g61 J = g61.J(org.telegram.ui.web.d.class);
            J.z = 1;
            J.l = str;
            J.D = onClickListener;
            J.q = z10;
            J.r = z11;
            J.G = Boolean.TRUE;
            J.H = kVar;
            arrayList.add(J);
            i14++;
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(g61.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new r0(kVar, 15)));
            int i16 = 0;
            while (i16 < arrayList3.size()) {
                final String str2 = (String) arrayList3.get(i16);
                boolean z12 = i16 == 0;
                boolean z13 = i16 == arrayList3.size() - 1;
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                org.telegram.ui.r rVar = kVar.M;
                                if (rVar != null) {
                                    rVar.run(str2);
                                    break;
                                }
                                break;
                            default:
                                org.telegram.ui.r rVar2 = kVar.M;
                                if (rVar2 != null) {
                                    rVar2.run(str2);
                                    break;
                                }
                                break;
                        }
                    }
                };
                int i17 = org.telegram.ui.web.d.a;
                g61 J2 = g61.J(org.telegram.ui.web.d.class);
                J2.z = 0;
                J2.l = str2;
                J2.D = onClickListener2;
                J2.q = z12;
                J2.r = z13;
                J2.G = Boolean.TRUE;
                J2.H = kVar;
                arrayList.add(J2);
                i16++;
            }
        }
        if (iVar != null) {
            ArrayList arrayList5 = iVar.a;
            if (arrayList5.isEmpty()) {
                return;
            }
            arrayList.add(g61.q(LocaleController.getString(R.string.WebSectionBookmarks)));
            while (i11 < arrayList5.size()) {
                MessageObject messageObject = (MessageObject) arrayList5.get(i11);
                if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                    int i18 = org.telegram.ui.web.g.a;
                    g61 J3 = g61.J(org.telegram.ui.web.g.class);
                    J3.z = 3;
                    J3.q = true;
                    J3.H = messageObject;
                    arrayList.add(J3);
                }
                i11++;
            }
            if (iVar.f) {
                return;
            }
            arrayList.add(g61.o(arrayList.size(), 32));
            arrayList.add(g61.o(arrayList.size(), 32));
            arrayList.add(g61.o(arrayList.size(), 32));
        }
    }

    private final void b(Object obj, Object obj2) {
        ((ArrayList) obj).add(g61.j(-1, ((yh.v) this.b).Z));
    }

    private final void c(Object obj, Object obj2) {
        ((ArrayList) obj).add(g61.j(-1, ((yh.c0) this.b).Z));
    }

    private final void d(Object obj, Object obj2) {
        int i10;
        l2 l2Var = (l2) this.b;
        ArrayList arrayList = (ArrayList) obj;
        js0 js0Var = l2Var.a;
        y9 y9Var = l2Var.e;
        if (y9Var == null) {
            return;
        }
        if ((!y9Var.e || y9Var.g != 783) && y9Var.l.size() <= 0) {
            y9 y9Var2 = l2Var.e;
            if (y9Var2.j && !y9Var2.i) {
                return;
            }
        }
        y9 y9Var3 = l2Var.e;
        int i11 = 1;
        int max = Math.max(1, (y9Var3 == null || (i10 = y9Var3.n) == 0) ? 3 : Math.min(3, i10));
        y9 y9Var4 = l2Var.e;
        if (y9Var4 != null) {
            ArrayList arrayList2 = y9Var4.l;
            int size = arrayList2.size();
            int i12 = 3;
            int i13 = 0;
            while (i13 < size) {
                Object obj3 = arrayList2.get(i13);
                i13++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                boolean z10 = l2Var.d;
                int i14 = yh.f1.a;
                g61 J = g61.J(yh.f1.class);
                J.u = 1;
                J.z = 0;
                J.G = savedStarGift;
                J.q = true;
                J.f = false;
                J.r = z10;
                J.h = l2Var.n && (l2Var.e != js0Var.d || savedStarGift.pinned_to_top);
                arrayList.add(J);
                i12--;
                if (i12 == 0) {
                    i12 = 3;
                }
            }
            y9 y9Var5 = l2Var.e;
            if (y9Var5.i || !y9Var5.j) {
                int i15 = 0;
                while (true) {
                    if (i15 >= (i12 <= 0 ? 3 : i12)) {
                        break;
                    }
                    i15++;
                    g61 o10 = g61.o(i15, 34);
                    o10.u = 1;
                    arrayList.add(o10);
                }
            }
        }
        if (js0Var.d == l2Var.e) {
            arrayList.add(g61.C(AndroidUtilities.dp(20.0f)));
            if (js0Var.c == UserConfig.getInstance(l2Var.b).getClientUserId()) {
                int w02 = h6.w0(h6.z6, l2Var.c);
                String string = LocaleController.getString(R.string.ProfileGiftsInfo);
                int dp = AndroidUtilities.dp(24.0f);
                int i16 = m2.a;
                g61 J2 = g61.J(m2.class);
                J2.l = string;
                J2.z = 17;
                J2.B = w02;
                J2.A = 14.0f;
                J2.i = dp;
                J2.k = 0;
                J2.q = false;
                arrayList.add(J2);
            }
            arrayList.add(g61.C(AndroidUtilities.dp(82.0f)));
        } else if (!arrayList.isEmpty()) {
            arrayList.add(g61.C(AndroidUtilities.dp(82.0f)));
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(0, g61.C(AndroidUtilities.dp(l2Var.I ? 42.0f : 12.0f)));
        }
        if (l2Var.f.getSpanCount() != max) {
            AndroidUtilities.runOnUIThread(new yh.r1(l2Var, max, i11));
        }
        js0Var.o();
        js0Var.post(new tg.p(js0Var, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0499  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        t61 t61Var;
        int i10;
        boolean z11;
        int i11;
        h2 h2Var;
        int i12 = -1;
        final int i13 = 1;
        switch (this.a) {
            case 0:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                oo0 oo0Var = (oo0) ((h0) this.b);
                cy cyVar = oo0Var.I0;
                AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                i80 I = i80.I(cyVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    i80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new rc0(I, 24), false);
                    J.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J.k();
                        }
                        J.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z10 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new g2(I, J, 8), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new i90(oo0Var, cyVar, oo0Var.J0, I, 3), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new i90(oo0Var, cyVar, tL_sponsoredPeer, I, 4), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new lg(oo0Var, cyVar, I, 19), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 1:
                ((hi.r) this.b).v.c((ArrayList) obj);
                break;
            case 2:
                ig.c.U((ig.c) this.b, (ArrayList) obj, (t61) obj2);
                break;
            case 3:
                ig.m mVar = (ig.m) this.b;
                mVar.L.dismiss();
                mVar.y = (String) obj;
                mVar.E = (TLRPC.InputDocument) obj2;
                mVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(mVar.d);
                mVar.n.setSticker(mVar.y);
                mVar.e0(true);
                v61 v61Var = mVar.a;
                if (v61Var != null && (t61Var = v61Var.W2) != null) {
                    t61Var.N(true);
                    break;
                }
                break;
            case 4:
                ig.k0 k0Var = (ig.k0) this.b;
                ArrayList arrayList = (ArrayList) obj;
                t61 t61Var2 = (t61) obj2;
                t61Var2.E = 1;
                LinearLayout linearLayout = k0Var.a0;
                g61 g61Var = new g61(-4);
                g61Var.d = -5;
                g61Var.c = linearLayout;
                g61Var.z = -1;
                arrayList.add(g61Var);
                TL_account.TL_connectedBot tL_connectedBot = k0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        i2.e.p(R.string.SessionBotConnectedFrom, arrayList);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList.add(g61.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList.add(g61.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList.add(g61.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList.add(g61.B(null));
                    }
                    t61Var2.U();
                    i2.e.p(R.string.BusinessBotChats2, arrayList);
                    int i14 = ig.k0.g0;
                    g61 w9 = g61.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w9.K(k0Var.e0);
                    arrayList.add(w9);
                    int i15 = ig.k0.h0;
                    g61 w10 = g61.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w10.K(!k0Var.e0);
                    arrayList.add(w10);
                    t61Var2.T();
                    arrayList.add(g61.B(null));
                    ig.a0 a0Var = k0Var.Z;
                    if (a0Var != null) {
                        a0Var.a(arrayList, t61Var2, true);
                    }
                    i2.e.B(R.string.BusinessBotChatsInfo2, arrayList);
                    break;
                }
                break;
            case 5:
                final ig.t0 t0Var = (ig.t0) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                t61 t61Var3 = (t61) obj2;
                LongSparseArray longSparseArray = t0Var.N;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                g61 g61Var2 = new g61(2);
                g61Var2.l = string;
                g61Var2.o = string2;
                g61Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                g61Var2.n = "🤖🏝️";
                g61Var2.z = 120;
                arrayList2.add(g61Var2);
                if (t0Var.M != null) {
                    t61Var3.U();
                    long j10 = t0Var.M.id;
                    g61 g61Var3 = new g61(13);
                    g61Var3.x = j10;
                    g61Var3.K(true);
                    final int i16 = 0;
                    g61Var3.D = new View.OnClickListener() { // from class: ig.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.W2.N(true);
                                    t0Var2.Y(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = t0Var3.J;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    t0Var3.c.W2.N(true);
                                    t0Var3.Y(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        t0Var4.X(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        t0Var4.c.W2.N(true);
                                        t0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        t0Var5.X(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        t0Var5.c.W2.N(true);
                                        t0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.W2.N(true);
                                    t0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(g61Var3);
                    t61Var3.T();
                } else {
                    t61Var3.U();
                    arrayList2.add(g61.k(t0Var.e));
                    longSparseArray.clear();
                    boolean z12 = false;
                    for (int i17 = 0; i17 < t0Var.d.d.size(); i17++) {
                        TLObject tLObject = (TLObject) t0Var.d.d.get(i17);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j11 = user.id;
                                String str = t0Var.y;
                                g61 g61Var4 = new g61(13);
                                g61Var4.x = j11;
                                g61Var4.n = str;
                                arrayList2.add(g61Var4);
                                longSparseArray.put(user.id, user);
                                z12 = true;
                            }
                        }
                    }
                    for (int i18 = 0; i18 < t0Var.d.e.size(); i18++) {
                        TLObject tLObject2 = (TLObject) t0Var.d.e.get(i18);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j12 = user2.id;
                                String str2 = t0Var.y;
                                g61 g61Var5 = new g61(13);
                                g61Var5.x = j12;
                                g61Var5.n = str2;
                                arrayList2.add(g61Var5);
                                longSparseArray.put(user2.id, user2);
                                z12 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(t0Var.f.getText().toString()) || t0Var.d.e() || t0Var.x)) {
                        arrayList2.add(g61.k(t0Var.n));
                        z12 = true;
                    }
                    t0Var.h.setVisibility(z12 ? 0 : 8);
                    t61Var3.T();
                }
                arrayList2.add(g61.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                t61Var3.U();
                g61 t10 = g61.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = t0Var.M != null;
                arrayList2.add(t10);
                g61 w11 = g61.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w11.K(t0Var.I);
                w11.g = t0Var.M != null;
                arrayList2.add(w11);
                g61 w12 = g61.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w12.K(!t0Var.I);
                w12.g = t0Var.M != null;
                arrayList2.add(w12);
                t61Var3.T();
                arrayList2.add(g61.B(null));
                t0Var.v.a(arrayList2, t61Var3, t0Var.M != null);
                i2.e.B(R.string.BusinessBotChatsInfo2, arrayList2);
                if (t0Var.M != null) {
                    t61Var3.U();
                    i2.e.p(R.string.BusinessBotPermissions, arrayList2);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    g61 m10 = g61.m(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.J;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !t0Var.P;
                    m10.D = new View.OnClickListener() { // from class: ig.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.W2.N(true);
                                    t0Var2.Y(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var3.J;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    t0Var3.c.W2.N(true);
                                    t0Var3.Y(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.X(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.W2.N(true);
                                        t0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        t0Var5.X(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        t0Var5.c.W2.N(true);
                                        t0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.W2.N(true);
                                    t0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(m10);
                    if (t0Var.P) {
                        g61 y3 = g61.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(true);
                        y3.g = false;
                        y3.i = 1;
                        arrayList2.add(y3);
                        g61 y10 = g61.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(t0Var.J.reply);
                        y10.i = 1;
                        arrayList2.add(y10);
                        g61 y11 = g61.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(t0Var.J.read_messages);
                        y11.i = 1;
                        arrayList2.add(y11);
                        g61 y12 = g61.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(t0Var.J.delete_sent_messages);
                        y12.i = 1;
                        arrayList2.add(y12);
                        g61 y13 = g61.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(t0Var.J.delete_received_messages);
                        y13.i = 1;
                        arrayList2.add(y13);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.J;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    g61 m11 = g61.m(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.J;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !t0Var.Q;
                    final int i19 = 2;
                    m11.D = new View.OnClickListener() { // from class: ig.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.W2.N(true);
                                    t0Var2.Y(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var3.J;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    t0Var3.c.W2.N(true);
                                    t0Var3.Y(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.X(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.W2.N(true);
                                        t0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.X(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.W2.N(true);
                                        t0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.W2.N(true);
                                    t0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(m11);
                    if (t0Var.Q) {
                        g61 y14 = g61.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(t0Var.J.edit_name);
                        y14.i = 1;
                        arrayList2.add(y14);
                        g61 y15 = g61.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(t0Var.J.edit_bio);
                        y15.i = 1;
                        arrayList2.add(y15);
                        g61 y16 = g61.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(t0Var.J.edit_profile_photo);
                        y16.i = 1;
                        arrayList2.add(y16);
                        g61 y17 = g61.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(t0Var.J.edit_username);
                        y17.i = 1;
                        arrayList2.add(y17);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.J;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    g61 m12 = g61.m(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.J;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !t0Var.R;
                    final int i20 = 3;
                    m12.D = new View.OnClickListener() { // from class: ig.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.W2.N(true);
                                    t0Var2.Y(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var3.J;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    t0Var3.c.W2.N(true);
                                    t0Var3.Y(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.X(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.W2.N(true);
                                        t0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.X(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.W2.N(true);
                                        t0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.W2.N(true);
                                    t0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(m12);
                    if (t0Var.R) {
                        g61 y18 = g61.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(t0Var.J.view_gifts);
                        y18.i = 1;
                        arrayList2.add(y18);
                        g61 y19 = g61.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(t0Var.J.sell_gifts);
                        y19.i = 1;
                        arrayList2.add(y19);
                        g61 y20 = g61.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(t0Var.J.change_gift_settings);
                        y20.i = 1;
                        arrayList2.add(y20);
                        g61 y21 = g61.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(t0Var.J.transfer_and_upgrade_gifts);
                        y21.i = 1;
                        arrayList2.add(y21);
                        g61 y22 = g61.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(t0Var.J.transfer_stars);
                        y22.i = 1;
                        arrayList2.add(y22);
                    }
                    g61 m13 = g61.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m13.K(t0Var.J.manage_stories);
                    final int i21 = 4;
                    m13.D = new View.OnClickListener() { // from class: ig.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.W2.N(true);
                                    t0Var2.Y(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var3.J;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    t0Var3.c.W2.N(true);
                                    t0Var3.Y(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.X(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.W2.N(true);
                                        t0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.X(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.W2.N(true);
                                        t0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.W2.N(true);
                                    t0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(m13);
                    t61Var3.T();
                    arrayList2.add(g61.A(-4, null));
                    arrayList2.add(g61.A(-5, null));
                    arrayList2.add(g61.A(-6, null));
                    arrayList2.add(g61.A(-7, null));
                    break;
                }
                break;
            case 6:
                ig.v0.U((ig.v0) this.b, (ArrayList) obj, (t61) obj2);
                break;
            case 7:
                ig.d1 d1Var = (ig.d1) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i22 = R.raw.biz_map;
                g61 g61Var6 = new g61(2);
                g61Var6.l = string6;
                g61Var6.o = string7;
                g61Var6.k = i22;
                arrayList3.add(g61Var6);
                arrayList3.add(g61.k(d1Var.e));
                arrayList3.add(g61.B(null));
                g61 i23 = g61.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i23.K(d1Var.x != null);
                arrayList3.add(i23);
                if (d1Var.x != null) {
                    arrayList3.add(g61.k(d1Var.h));
                }
                arrayList3.add(g61.B(null));
                boolean z13 = (d1Var.w == null || (d1Var.x == null && TextUtils.isEmpty(d1Var.y))) ? false : true;
                d1Var.G = z13;
                if (z13) {
                    g61 e = g61.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.r = true;
                    arrayList3.add(e);
                    arrayList3.add(g61.B(null));
                }
                d1Var.U(true);
                break;
            case 8:
                ig.f1.V((ig.f1) this.b, (ArrayList) obj);
                break;
            case 9:
                ig.h1 h1Var = (ig.h1) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = h1Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                g61 g61Var7 = new g61(9);
                g61Var7.d = -1;
                g61Var7.l = string8;
                g61Var7.K(h1Var.r);
                arrayList4.add(g61Var7);
                arrayList4.add(g61.B(null));
                if (h1Var.r) {
                    for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                        if (i24 > 0) {
                            arrayList4.add(g61.B(null));
                        }
                        ig.e1 e1Var = (ig.e1) arrayList5.get(i24);
                        if (!h1Var.U()) {
                            int i25 = i24 * 3;
                            arrayList4.add(g61.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), ig.e1.a(e1Var.a), i25));
                            arrayList4.add(g61.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), ig.e1.a(e1Var.b), i25 + 1));
                            g61 e7 = g61.e(i25 + 2, LocaleController.getString(R.string.Remove));
                            e7.r = true;
                            arrayList4.add(e7);
                        }
                    }
                    if (h1Var.V()) {
                        arrayList4.add(g61.B(null));
                        g61 c10 = g61.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.q = true;
                        arrayList4.add(c10);
                    }
                    i2.e.B(R.string.BusinessHoursDayInfo, arrayList4);
                    break;
                }
                break;
            case 10:
                ig.d2.V((ig.d2) this.b, (ArrayList) obj, (t61) obj2);
                break;
            case 11:
                ji.a aVar = (ji.a) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                arrayList6.add(g61.D(0, AndroidUtilities.dp(12.0f)));
                arrayList6.add(g61.j(1, aVar.Z));
                arrayList6.add(g61.D(2, AndroidUtilities.dp(12.0f)));
                arrayList6.add(g61.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.c0 = arrayList6.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z14 = aVar.b0;
                g61 x10 = g61.x(151, string9, LocaleController.getString(z14 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                x10.K(true ^ aVar.Y);
                arrayList6.add(x10);
                g61 x11 = g61.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z14 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                x11.K(aVar.Y);
                arrayList6.add(x11);
                arrayList6.add(g61.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 12:
                ((ArrayList) obj).add(g61.j(0, ((ji.b) this.b).X));
                break;
            case 13:
                Utilities.themeQueue.postRunnable(new hi.t(19, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 14:
                ki.x xVar = (ki.x) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                arrayList7.add(g61.j(1, xVar.a0));
                arrayList7.add(g61.j(3, xVar.d0));
                if (xVar.i0 != null) {
                    arrayList7.add(g61.j(2, xVar.b0));
                    break;
                }
                break;
            case 15:
                w3.J1((w3[]) this.b, (ArrayList) obj, (t61) obj2);
                break;
            case 16:
                w3 w3Var = (w3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = w3Var.j3;
                ArrayList arrayList10 = new ArrayList(arrayList8.size());
                int size = arrayList8.size();
                int i26 = 0;
                while (i26 < size) {
                    Object obj3 = arrayList8.get(i26);
                    i26++;
                    Object obj4 = ((g61) obj3).G;
                    if (obj4 instanceof ki.a) {
                        arrayList10.add((ki.a) obj4);
                    }
                }
                if (arrayList10.size() >= 2) {
                    ArrayList arrayList11 = new ArrayList();
                    int size2 = arrayList10.size();
                    int i27 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i28 = 0;
                    int i29 = 0;
                    while (i29 < size2) {
                        Object obj5 = arrayList10.get(i29);
                        i29++;
                        ki.a aVar2 = (ki.a) obj5;
                        int indexOf = arrayList9.indexOf(aVar2);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i30 = indexOf + 1;
                            if (w3.y3(aVar2) && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                                int Q3 = w3Var.Q3(indexOf);
                                i30 = Q3 >= arrayList9.size() ? arrayList9.size() : Q3 + 1;
                            }
                            arrayList11.add(new ArrayList(arrayList9.subList(indexOf, i30)));
                            i27 = Math.min(i27, indexOf);
                            i12 = Math.max(i12, i30);
                            i28 += i30 - indexOf;
                        }
                    }
                    if (i28 == i12 - i27) {
                        ArrayList arrayList12 = new ArrayList(i28);
                        int size3 = arrayList11.size();
                        int i31 = 0;
                        while (i31 < size3) {
                            Object obj6 = arrayList11.get(i31);
                            i31++;
                            arrayList12.addAll((ArrayList) obj6);
                        }
                        for (int i32 = 0; i32 < arrayList12.size(); i32++) {
                            if (arrayList9.get(i27 + i32) != arrayList12.get(i32)) {
                                h2 h2Var2 = w3Var.H3;
                                if (h2Var2 != null) {
                                    h2Var2.d();
                                }
                                for (int i33 = 0; i33 < arrayList12.size(); i33++) {
                                    arrayList9.set(i27 + i33, (ki.a) arrayList12.get(i33));
                                }
                                ki.a aVar3 = w3Var.Q3;
                                ArrayList arrayList13 = w3.q4;
                                if (aVar3 != null) {
                                    ArrayList arrayList14 = aVar3.k;
                                    int indexOf2 = arrayList9.indexOf(aVar3);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList15 = indexOf2 > 0 ? ((ki.a) arrayList9.get(indexOf2 - 1)).k : arrayList13;
                                        int i34 = indexOf2 + 1;
                                        if (i34 < arrayList9.size()) {
                                            arrayList13 = ((ki.a) arrayList9.get(i34)).k;
                                        }
                                        if (arrayList15.size() < arrayList13.size()) {
                                            arrayList15 = arrayList13;
                                        }
                                        if (!arrayList14.equals(arrayList15)) {
                                            arrayList14.clear();
                                            arrayList14.addAll(arrayList15);
                                            z11 = true;
                                            boolean y23 = w3Var.y2();
                                            i11 = 0;
                                            while (i11 < arrayList9.size()) {
                                                ki.a aVar4 = (ki.a) arrayList9.get(i11);
                                                if (!aVar4.i && !w3.y3(aVar4)) {
                                                    ki.a aVar5 = i11 > 0 ? (ki.a) arrayList9.get(i11 - 1) : null;
                                                    int max = aVar5 != null ? Math.max(0, aVar5.c) : 0;
                                                    if (w3.F3(aVar4.b)) {
                                                        aVar4.c = max;
                                                        if (max > 0) {
                                                            aVar4.d = aVar5.d > 0 ? 1 : 0;
                                                            aVar4.e = false;
                                                            aVar4.f = false;
                                                        }
                                                    } else {
                                                        int i35 = max + 1;
                                                        if (aVar4.c > i35) {
                                                            aVar4.c = i35;
                                                        }
                                                    }
                                                    if (aVar4.c <= 0) {
                                                        aVar4.c = 0;
                                                        aVar4.d = 0;
                                                        aVar4.e = false;
                                                        aVar4.f = false;
                                                    }
                                                }
                                                i11++;
                                            }
                                            w3Var.t4();
                                            w3Var.b2();
                                            if (!z11 || y23) {
                                                w3Var.W2.N(true);
                                                w3Var.y4();
                                            } else {
                                                w3Var.y4();
                                            }
                                            h2Var = w3Var.H3;
                                            if (h2Var == null) {
                                                h2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                boolean y232 = w3Var.y2();
                                i11 = 0;
                                while (i11 < arrayList9.size()) {
                                }
                                w3Var.t4();
                                w3Var.b2();
                                if (z11) {
                                }
                                w3Var.W2.N(true);
                                w3Var.y4();
                                h2Var = w3Var.H3;
                                if (h2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 17:
                a(obj, obj2);
                break;
            case 18:
                r5 r5Var = (r5) this.b;
                r5Var.y0 = ((Integer) obj).intValue();
                r5Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(r5Var, 12), 60L);
                break;
            case 19:
                uh.f fVar = (uh.f) this.b;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = fVar.a0;
                if (arrayList17 != null && !arrayList17.isEmpty()) {
                    int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
                    int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
                    arrayList16.add(g61.D(0, dp2));
                    int i36 = dp - dp2;
                    int size4 = arrayList17.size();
                    int i37 = 0;
                    while (i37 < size4) {
                        Object obj7 = arrayList17.get(i37);
                        i37++;
                        for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj7)) {
                            if (TextUtils.isEmpty(fVar.c0) || ug.y0.V(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                                i36 -= AndroidUtilities.dp(44.0f);
                                boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                                int i38 = uh.e.a;
                                g61 J2 = g61.J(uh.e.class);
                                J2.l = tL_help_country.iso2;
                                J2.G = tL_help_country;
                                J2.e = containsKey;
                                arrayList16.add(J2);
                            }
                        }
                    }
                    arrayList16.add(g61.D(1, Math.max(0, i36)));
                    break;
                }
                break;
            case 20:
                ArrayList arrayList18 = (ArrayList) obj;
                b91 b91Var = ((uh.g) this.b).Y;
                if (b91Var != null) {
                    arrayList18.add(g61.C(AndroidUtilities.dp(12.0f)));
                    arrayList18.add(g61.h(0, 0, b91Var));
                    break;
                }
                break;
            case 21:
                ((j3) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 22:
                yh.c cVar = (yh.c) this.b;
                ArrayList arrayList19 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.X;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        GiftAuctionController.Auction auction = cVar.Y;
                        qg.n nVar = new qg.n(11, cVar, tL_StarGiftAuctionAcquiredGift);
                        int i39 = yh.a.a;
                        g61 J3 = g61.J(yh.a.class);
                        J3.G = tL_StarGiftAuctionAcquiredGift;
                        J3.H = auction;
                        J3.D = nVar;
                        arrayList19.add(J3);
                    }
                    arrayList19.add(g61.C(AndroidUtilities.dp(16.0f)));
                    break;
                }
                break;
            case 23:
                ((ArrayList) obj).add(((yh.e) this.b).X);
                break;
            case 24:
                ArrayList arrayList20 = (ArrayList) obj;
                arrayList20.add(((yh.m) this.b).Y);
                arrayList20.add(g61.C(AndroidUtilities.dp(16.0f)));
                break;
            case 25:
                b(obj, obj2);
                break;
            case 26:
                c(obj, obj2);
                break;
            case 27:
                ((yh.o1) this.b).V((ArrayList) obj, (t61) obj2);
                break;
            case 28:
                d(obj, obj2);
                break;
            default:
                g4 g4Var = (g4) this.b;
                ArrayList arrayList21 = (ArrayList) obj;
                s3 s3Var = g4Var.d;
                ArrayList arrayList22 = s3Var.d;
                int size5 = arrayList22.size();
                int i40 = 0;
                while (i40 < size5) {
                    Object obj8 = arrayList22.get(i40);
                    i40++;
                    arrayList21.add(yh.f1.a(0, (TL_stars.TL_starGiftUnique) obj8, false, false, false, true, false));
                }
                if (s3Var.t || !s3Var.u) {
                    g61 o10 = g61.o(-1, 34);
                    o10.u = 1;
                    arrayList21.add(o10);
                    g61 o11 = g61.o(-2, 34);
                    o11.u = 1;
                    arrayList21.add(o11);
                    g61 o12 = g61.o(-3, 34);
                    o12.u = 1;
                    arrayList21.add(o12);
                    if (s3Var.d.isEmpty()) {
                        g61 o13 = g61.o(-4, 34);
                        o13.u = 1;
                        arrayList21.add(o13);
                        g61 o14 = g61.o(-5, 34);
                        o14.u = 1;
                        arrayList21.add(o14);
                        g61 o15 = g61.o(-6, 34);
                        o15.u = 1;
                        arrayList21.add(o15);
                        g61 o16 = g61.o(-7, 34);
                        o16.u = 1;
                        arrayList21.add(o16);
                        g61 o17 = g61.o(-8, 34);
                        o17.u = 1;
                        arrayList21.add(o17);
                        g61 o18 = g61.o(-9, 34);
                        o18.u = 1;
                        arrayList21.add(o18);
                        g61 o19 = g61.o(-10, 34);
                        o19.u = 1;
                        arrayList21.add(o19);
                        g61 o20 = g61.o(-11, 34);
                        o20.u = 1;
                        arrayList21.add(o20);
                        g61 o21 = g61.o(-12, 34);
                        o21.u = 1;
                        arrayList21.add(o21);
                        g61 o22 = g61.o(-13, 34);
                        o22.u = 1;
                        arrayList21.add(o22);
                        g61 o23 = g61.o(-14, 34);
                        o23.u = 1;
                        arrayList21.add(o23);
                        g61 o24 = g61.o(-15, 34);
                        o24.u = 1;
                        arrayList21.add(o24);
                    }
                }
                boolean z15 = arrayList21.isEmpty() && !s3Var.t;
                if (g4Var.x != z15) {
                    g4Var.x = z15;
                    g4Var.w.setVisibility(0);
                    g4Var.w.animate().alpha(z15 ? 1.0f : 0.0f).scaleX(z15 ? 1.0f : 0.95f).scaleY(z15 ? 1.0f : 0.95f).setInterpolator(bs.h).setDuration(320L).setListener(new z2(g4Var, z15, 1)).start();
                    break;
                }
                break;
        }
    }
}
