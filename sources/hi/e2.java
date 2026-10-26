package hi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import fi.q5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.bv;
import org.telegram.ui.cy;
import org.telegram.ui.i91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        vh.f fVar = (vh.f) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = fVar.a0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int dp = AndroidUtilities.dp(13.0f) + ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f));
        int dp2 = AndroidUtilities.dp(88.0f) + fVar.l0;
        arrayList.add(t61.E(0, dp2));
        int i10 = dp - dp2;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            for (TLRPC.TL_help_country tL_help_country : (List) fVar.Z.get((String) obj3)) {
                if (TextUtils.isEmpty(fVar.c0) || vg.z0.U(tL_help_country, AndroidUtilities.translitSafe(fVar.c0).toLowerCase())) {
                    i10 -= AndroidUtilities.dp(44.0f);
                    boolean containsKey = fVar.j0.containsKey(tL_help_country.iso2);
                    int i12 = vh.e.a;
                    t61 K = t61.K(vh.e.class);
                    K.l = tL_help_country.iso2;
                    K.G = tL_help_country;
                    K.e = containsKey;
                    arrayList.add(K);
                }
            }
        }
        arrayList.add(t61.E(1, Math.max(0, i10)));
    }

    private final void b(Object obj, Object obj2) {
        zh.c cVar = (zh.c) this.b;
        ArrayList arrayList = (ArrayList) obj;
        List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = cVar.X;
        if (list == null) {
            return;
        }
        for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
            GiftAuctionController.Auction auction = cVar.Y;
            org.telegram.ui.web.c cVar2 = new org.telegram.ui.web.c(12, cVar, tL_StarGiftAuctionAcquiredGift);
            int i10 = zh.a.a;
            t61 K = t61.K(zh.a.class);
            K.G = tL_StarGiftAuctionAcquiredGift;
            K.H = auction;
            K.D = cVar2;
            arrayList.add(K);
        }
        arrayList.add(t61.D(AndroidUtilities.dp(16.0f)));
    }

    private final void c(Object obj, Object obj2) {
        ((ArrayList) obj).add(t61.j(-1, ((zh.v) this.b).Z));
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        j71 j71Var;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        li.f2 f2Var;
        ArrayList arrayList;
        boolean z12;
        int size;
        int i12;
        int i13;
        int i14 = 16;
        int i15 = -1;
        boolean z13 = false;
        r15 = false;
        boolean z14 = false;
        z13 = false;
        z13 = false;
        z13 = false;
        z13 = false;
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    m3Var.getClass();
                    break;
                } else {
                    c5 c5Var = m3Var.w0;
                    if (c5Var != null) {
                        c5Var.a(tL_webViewResultUrl);
                        m3Var.o();
                        break;
                    }
                }
                break;
            case 1:
                ((d4) this.b).E0((ArrayList) obj, (j71) obj2);
                break;
            case 2:
                ((b5) this.b).V((ArrayList) obj, (j71) obj2);
                break;
            case 3:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                wo0 wo0Var = (wo0) ((ig.i0) this.b);
                cy cyVar = wo0Var.I0;
                AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                k80 I = k80.I(cyVar, (m6) obj);
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    k80 J = I.J();
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new wa0(I, 27), false);
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
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new o2(I, J, 8), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new e10(wo0Var, cyVar, (Object) wo0Var.J0, I, 6), false);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new e10(wo0Var, cyVar, (Object) tL_sponsoredPeer, I, 7), false);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new kg(wo0Var, cyVar, I, 20), false);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = false;
                I.Z();
                break;
            case 4:
                ((ii.r) this.b).v.c((ArrayList) obj);
                break;
            case 5:
                jg.c.V((jg.c) this.b, (ArrayList) obj, (j71) obj2);
                break;
            case 6:
                jg.n nVar = (jg.n) this.b;
                nVar.L.dismiss();
                nVar.y = (String) obj;
                nVar.E = (TLRPC.InputDocument) obj2;
                nVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(nVar.e);
                nVar.n.setSticker(nVar.y);
                nVar.f0(true);
                l71 l71Var = nVar.a;
                if (l71Var != null && (j71Var = l71Var.g3) != null) {
                    j71Var.O(true);
                    break;
                }
                break;
            case 7:
                jg.k0 k0Var = (jg.k0) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                j71 j71Var2 = (j71) obj2;
                j71Var2.F = 1;
                arrayList2.add(t61.l(-5, k0Var.a0));
                TL_account.TL_connectedBot tL_connectedBot = k0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        ic.a.p(R.string.SessionBotConnectedFrom, arrayList2);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList2.add(t61.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList2.add(t61.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList2.add(t61.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList2.add(t61.C(null));
                    }
                    j71Var2.V();
                    ic.a.p(R.string.BusinessBotChats2, arrayList2);
                    int i16 = jg.k0.k0;
                    t61 x9 = t61.x(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    x9.L(k0Var.f0);
                    arrayList2.add(x9);
                    int i17 = jg.k0.l0;
                    t61 x10 = t61.x(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    x10.L(!k0Var.f0);
                    arrayList2.add(x10);
                    j71Var2.U();
                    arrayList2.add(t61.C(null));
                    jg.b0 b0Var = k0Var.Z;
                    if (b0Var != null) {
                        b0Var.a(arrayList2, j71Var2, true);
                    }
                    ic.a.z(R.string.BusinessBotChatsInfo2, arrayList2);
                    break;
                }
                break;
            case 8:
                final jg.t0 t0Var = (jg.t0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                j71 j71Var3 = (j71) obj2;
                LongSparseArray longSparseArray = t0Var.N;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                t61 t61Var = new t61(2);
                t61Var.l = string;
                t61Var.o = string2;
                t61Var.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                t61Var.n = "🤖🏝️";
                t61Var.z = 120;
                arrayList3.add(t61Var);
                if (t0Var.M != null) {
                    j71Var3.V();
                    long j10 = t0Var.M.id;
                    t61 t61Var2 = new t61(13);
                    t61Var2.x = j10;
                    t61Var2.L(true);
                    final int i18 = z13 ? 1 : 0;
                    t61Var2.D = new View.OnClickListener() { // from class: jg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.Z(true);
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
                                    t0Var3.c.g3.O(true);
                                    t0Var3.Z(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        t0Var4.Y(-14, true, new m0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        t0Var5.Y(-17, true, new m0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.Z(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList3.add(t61Var2);
                    j71Var3.U();
                } else {
                    j71Var3.V();
                    arrayList3.add(t61.k(t0Var.e));
                    longSparseArray.clear();
                    boolean z15 = false;
                    for (int i19 = 0; i19 < t0Var.d.d.size(); i19++) {
                        TLObject tLObject = (TLObject) t0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j11 = user.id;
                                String str = t0Var.y;
                                t61 t61Var3 = new t61(13);
                                t61Var3.x = j11;
                                t61Var3.n = str;
                                arrayList3.add(t61Var3);
                                longSparseArray.put(user.id, user);
                                z15 = true;
                            }
                        }
                    }
                    for (int i20 = 0; i20 < t0Var.d.e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) t0Var.d.e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j12 = user2.id;
                                String str2 = t0Var.y;
                                t61 t61Var4 = new t61(13);
                                t61Var4.x = j12;
                                t61Var4.n = str2;
                                arrayList3.add(t61Var4);
                                longSparseArray.put(user2.id, user2);
                                z15 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(t0Var.f.getText().toString()) || t0Var.d.e() || t0Var.x)) {
                        arrayList3.add(t61.k(t0Var.n));
                        z15 = true;
                    }
                    t0Var.h.setVisibility(z15 ? 0 : 8);
                    j71Var3.U();
                }
                arrayList3.add(t61.C(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                j71Var3.V();
                t61 u10 = t61.u(LocaleController.getString(R.string.BusinessBotChats2));
                u10.g = t0Var.M != null;
                arrayList3.add(u10);
                t61 x11 = t61.x(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                x11.L(t0Var.I);
                x11.g = t0Var.M != null;
                arrayList3.add(x11);
                t61 x12 = t61.x(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                x12.L(!t0Var.I);
                x12.g = t0Var.M != null;
                arrayList3.add(x12);
                j71Var3.U();
                arrayList3.add(t61.C(null));
                t0Var.v.a(arrayList3, j71Var3, t0Var.M != null);
                ic.a.z(R.string.BusinessBotChatsInfo2, arrayList3);
                if (t0Var.M != null) {
                    j71Var3.V();
                    ic.a.p(R.string.BusinessBotPermissions, arrayList3);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    t61 o10 = t61.o(-4, string3, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.J;
                    o10.L(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    final int i21 = 1;
                    o10.f = !t0Var.P;
                    o10.D = new View.OnClickListener() { // from class: jg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.Z(true);
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
                                    t0Var3.c.g3.O(true);
                                    t0Var3.Z(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.Y(-14, true, new m0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        t0Var5.Y(-17, true, new m0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.Z(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList3.add(o10);
                    if (t0Var.P) {
                        t61 z16 = t61.z(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        z16.L(true);
                        z16.g = false;
                        z16.i = 1;
                        arrayList3.add(z16);
                        t61 z17 = t61.z(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        z17.L(t0Var.J.reply);
                        z17.i = 1;
                        arrayList3.add(z17);
                        t61 z18 = t61.z(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        z18.L(t0Var.J.read_messages);
                        z18.i = 1;
                        arrayList3.add(z18);
                        t61 z19 = t61.z(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        z19.L(t0Var.J.delete_sent_messages);
                        z19.i = 1;
                        arrayList3.add(z19);
                        t61 z20 = t61.z(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        z20.L(t0Var.J.delete_received_messages);
                        z20.i = 1;
                        arrayList3.add(z20);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.J;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    t61 o11 = t61.o(-10, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.J;
                    o11.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o11.f = !t0Var.Q;
                    final int i22 = 2;
                    o11.D = new View.OnClickListener() { // from class: jg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.Z(true);
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
                                    t0Var3.c.g3.O(true);
                                    t0Var3.Z(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.Y(-14, true, new m0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.Y(-17, true, new m0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.Z(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList3.add(o11);
                    if (t0Var.Q) {
                        t61 z21 = t61.z(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        z21.L(t0Var.J.edit_name);
                        z21.i = 1;
                        arrayList3.add(z21);
                        t61 z22 = t61.z(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        z22.L(t0Var.J.edit_bio);
                        z22.i = 1;
                        arrayList3.add(z22);
                        t61 z23 = t61.z(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        z23.L(t0Var.J.edit_profile_photo);
                        z23.i = 1;
                        arrayList3.add(z23);
                        t61 z24 = t61.z(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        z24.L(t0Var.J.edit_username);
                        z24.i = 1;
                        arrayList3.add(z24);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.J;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    t61 o12 = t61.o(-15, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.J;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z13 = true;
                    }
                    o12.L(z13);
                    o12.f = !t0Var.R;
                    final int i23 = 3;
                    o12.D = new View.OnClickListener() { // from class: jg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.Z(true);
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
                                    t0Var3.c.g3.O(true);
                                    t0Var3.Z(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.Y(-14, true, new m0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.Y(-17, true, new m0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.Z(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList3.add(o12);
                    if (t0Var.R) {
                        t61 z25 = t61.z(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        z25.L(t0Var.J.view_gifts);
                        z25.i = 1;
                        arrayList3.add(z25);
                        t61 z26 = t61.z(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        z26.L(t0Var.J.sell_gifts);
                        z26.i = 1;
                        arrayList3.add(z26);
                        t61 z27 = t61.z(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        z27.L(t0Var.J.change_gift_settings);
                        z27.i = 1;
                        arrayList3.add(z27);
                        t61 z28 = t61.z(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        z28.L(t0Var.J.transfer_and_upgrade_gifts);
                        z28.i = 1;
                        arrayList3.add(z28);
                        t61 z29 = t61.z(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        z29.L(t0Var.J.transfer_stars);
                        z29.i = 1;
                        arrayList3.add(z29);
                    }
                    t61 o13 = t61.o(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    o13.L(t0Var.J.manage_stories);
                    final int i24 = 4;
                    o13.D = new View.OnClickListener() { // from class: jg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.M = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.Z(true);
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
                                    t0Var3.c.g3.O(true);
                                    t0Var3.Z(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.Y(-14, true, new m0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.Z(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.Y(-17, true, new m0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.Z(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.J.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.Z(true);
                                    break;
                            }
                        }
                    };
                    arrayList3.add(o13);
                    j71Var3.U();
                    arrayList3.add(t61.B(-4, null));
                    arrayList3.add(t61.B(-5, null));
                    arrayList3.add(t61.B(-6, null));
                    arrayList3.add(t61.B(-7, null));
                    break;
                }
                break;
            case 9:
                jg.v0.V((jg.v0) this.b, (ArrayList) obj, (j71) obj2);
                break;
            case 10:
                jg.d1 d1Var = (jg.d1) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i25 = R.raw.biz_map;
                t61 t61Var5 = new t61(2);
                t61Var5.l = string6;
                t61Var5.o = string7;
                t61Var5.k = i25;
                arrayList4.add(t61Var5);
                arrayList4.add(t61.k(d1Var.d));
                arrayList4.add(t61.C(null));
                t61 i26 = t61.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i26.L(d1Var.w != null);
                arrayList4.add(i26);
                if (d1Var.w != null) {
                    arrayList4.add(t61.k(d1Var.f));
                }
                arrayList4.add(t61.C(null));
                if (d1Var.v != null && (d1Var.w != null || !TextUtils.isEmpty(d1Var.x))) {
                    z14 = true;
                }
                d1Var.F = z14;
                if (z14) {
                    t61 e = t61.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    z10 = true;
                    e.r = true;
                    arrayList4.add(e);
                    arrayList4.add(t61.C(null));
                } else {
                    z10 = true;
                }
                d1Var.V(z10);
                break;
            case 11:
                jg.h1.W((jg.h1) this.b, (ArrayList) obj);
                break;
            case 12:
                jg.j1 j1Var = (jg.j1) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = j1Var.b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                t61 t61Var6 = new t61(9);
                t61Var6.d = -1;
                t61Var6.l = string8;
                t61Var6.L(j1Var.r);
                arrayList5.add(t61Var6);
                arrayList5.add(t61.C(null));
                if (j1Var.r) {
                    for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                        if (i27 > 0) {
                            arrayList5.add(t61.C(null));
                        }
                        jg.g1 g1Var = (jg.g1) arrayList6.get(i27);
                        if (!j1Var.V()) {
                            int i28 = i27 * 3;
                            arrayList5.add(t61.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), jg.g1.a(g1Var.a), i28));
                            arrayList5.add(t61.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), jg.g1.a(g1Var.b), i28 + 1));
                            t61 e10 = t61.e(i28 + 2, LocaleController.getString(R.string.Remove));
                            e10.r = true;
                            arrayList5.add(e10);
                        }
                    }
                    if (j1Var.W()) {
                        arrayList5.add(t61.C(null));
                        t61 c10 = t61.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c10.q = true;
                        arrayList5.add(c10);
                    }
                    ic.a.z(R.string.BusinessHoursDayInfo, arrayList5);
                    break;
                }
                break;
            case 13:
                jg.f2.W((jg.f2) this.b, (ArrayList) obj, (j71) obj2);
                break;
            case 14:
                ki.a aVar = (ki.a) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                arrayList7.add(t61.E(0, AndroidUtilities.dp(12.0f)));
                arrayList7.add(t61.j(1, aVar.Z));
                arrayList7.add(t61.E(2, AndroidUtilities.dp(12.0f)));
                arrayList7.add(t61.t(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                aVar.c0 = arrayList7.size();
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z30 = aVar.b0;
                t61 y3 = t61.y(151, string9, LocaleController.getString(z30 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
                y3.L(!aVar.Y);
                arrayList7.add(y3);
                t61 y10 = t61.y(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z30 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
                y10.L(aVar.Y);
                arrayList7.add(y10);
                arrayList7.add(t61.B(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 15:
                ((ArrayList) obj).add(t61.j(0, ((ki.b) this.b).X));
                break;
            case 16:
                Utilities.themeQueue.postRunnable(new k2.e0(1, (String[]) this.b, (Utilities.Callback2) obj2));
                break;
            case 17:
                li.w wVar = (li.w) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(t61.j(1, wVar.a0));
                arrayList8.add(t61.j(3, wVar.d0));
                if (wVar.i0 != null) {
                    arrayList8.add(t61.j(2, wVar.b0));
                    break;
                }
                break;
            case 18:
                li.v3.O1((li.v3[]) this.b, (ArrayList) obj, (j71) obj2);
                break;
            case 19:
                li.v3 v3Var = (li.v3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList9 = (ArrayList) obj2;
                ArrayList arrayList10 = v3Var.t3;
                ArrayList arrayList11 = new ArrayList(arrayList9.size());
                int size2 = arrayList9.size();
                int i29 = 0;
                while (i29 < size2) {
                    Object obj3 = arrayList9.get(i29);
                    i29++;
                    Object obj4 = ((t61) obj3).G;
                    if (obj4 instanceof li.a) {
                        arrayList11.add((li.a) obj4);
                    }
                }
                if (arrayList11.size() >= 2) {
                    ArrayList arrayList12 = new ArrayList();
                    int size3 = arrayList11.size();
                    int i30 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i31 = 0;
                    int i32 = 0;
                    while (i32 < size3) {
                        Object obj5 = arrayList11.get(i32);
                        i32++;
                        li.a aVar2 = (li.a) obj5;
                        int indexOf = arrayList10.indexOf(aVar2);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i33 = indexOf + 1;
                            if (li.v3.D3(aVar2) && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                                int V3 = v3Var.V3(indexOf);
                                i33 = V3 >= arrayList10.size() ? arrayList10.size() : V3 + 1;
                            }
                            arrayList12.add(new ArrayList(arrayList10.subList(indexOf, i33)));
                            i30 = Math.min(i30, indexOf);
                            i15 = Math.max(i15, i33);
                            i31 += i33 - indexOf;
                        }
                    }
                    if (i31 == i15 - i30) {
                        ArrayList arrayList13 = new ArrayList(i31);
                        int size4 = arrayList12.size();
                        int i34 = 0;
                        while (i34 < size4) {
                            Object obj6 = arrayList12.get(i34);
                            i34++;
                            arrayList13.addAll((ArrayList) obj6);
                        }
                        for (int i35 = 0; i35 < arrayList13.size(); i35++) {
                            if (arrayList10.get(i30 + i35) != arrayList13.get(i35)) {
                                li.f2 f2Var2 = v3Var.R3;
                                if (f2Var2 != null) {
                                    f2Var2.d();
                                }
                                for (int i36 = 0; i36 < arrayList13.size(); i36++) {
                                    arrayList10.set(i30 + i36, (li.a) arrayList13.get(i36));
                                }
                                li.a aVar3 = v3Var.a4;
                                ArrayList arrayList14 = li.v3.A4;
                                if (aVar3 != null) {
                                    ArrayList arrayList15 = aVar3.k;
                                    int indexOf2 = arrayList10.indexOf(aVar3);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList16 = indexOf2 > 0 ? ((li.a) arrayList10.get(indexOf2 - 1)).k : arrayList14;
                                        int i37 = indexOf2 + 1;
                                        if (i37 < arrayList10.size()) {
                                            arrayList14 = ((li.a) arrayList10.get(i37)).k;
                                        }
                                        if (arrayList16.size() < arrayList14.size()) {
                                            arrayList16 = arrayList14;
                                        }
                                        if (!arrayList15.equals(arrayList16)) {
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList16);
                                            z11 = true;
                                            boolean D2 = v3Var.D2();
                                            i11 = 0;
                                            while (i11 < arrayList10.size()) {
                                                li.a aVar4 = (li.a) arrayList10.get(i11);
                                                if (!aVar4.i && !li.v3.D3(aVar4)) {
                                                    li.a aVar5 = i11 > 0 ? (li.a) arrayList10.get(i11 - 1) : null;
                                                    int max = aVar5 != null ? Math.max(0, aVar5.c) : 0;
                                                    if (li.v3.K3(aVar4.b)) {
                                                        aVar4.c = max;
                                                        if (max > 0) {
                                                            aVar4.d = aVar5.d > 0 ? 1 : 0;
                                                            aVar4.e = false;
                                                            aVar4.f = false;
                                                        }
                                                    } else {
                                                        int i38 = max + 1;
                                                        if (aVar4.c > i38) {
                                                            aVar4.c = i38;
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
                                            v3Var.y4();
                                            v3Var.g2();
                                            if (!z11 || D2) {
                                                v3Var.g3.O(true);
                                                v3Var.D4();
                                            } else {
                                                v3Var.D4();
                                            }
                                            f2Var = v3Var.R3;
                                            if (f2Var == null) {
                                                f2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                boolean D22 = v3Var.D2();
                                i11 = 0;
                                while (i11 < arrayList10.size()) {
                                }
                                v3Var.y4();
                                v3Var.g2();
                                if (z11) {
                                }
                                v3Var.g3.O(true);
                                v3Var.D4();
                                f2Var = v3Var.R3;
                                if (f2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 20:
                final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.web.j jVar = lVar.y;
                ArrayList arrayList18 = lVar.x;
                if (!lVar.b && arrayList18.isEmpty()) {
                    arrayList17.add(t61.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList19 = new ArrayList();
                String string10 = sharedPreferences.getString("queries_json", null);
                if (string10 != null) {
                    try {
                        arrayList = new ArrayList();
                        int i39 = 0;
                        for (JSONArray jSONArray = new JSONArray(string10); i39 < jSONArray.length(); jSONArray = jSONArray) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i39);
                            z12 = true;
                            try {
                                org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                kVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(kVar);
                                i39++;
                            } catch (Exception unused) {
                            }
                        }
                        z12 = true;
                        Collections.sort(arrayList, new bv(16));
                        size = arrayList.size();
                        i12 = 0;
                    } catch (Exception unused2) {
                    }
                    while (i12 < size) {
                        Object obj7 = arrayList.get(i12);
                        i12++;
                        org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj7;
                        if (arrayList19.size() >= 20) {
                            arrayList18.size();
                            arrayList19.size();
                            if (!arrayList18.isEmpty()) {
                                arrayList17.add(t61.k(lVar.v));
                            }
                            i13 = 0;
                            while (i13 < arrayList18.size()) {
                                final String str3 = (String) arrayList18.get(i13);
                                boolean z31 = i13 == 0 ? z12 : false;
                                boolean z32 = i13 == arrayList18.size() + (-1) ? z12 : false;
                                final int i40 = z13 ? 1 : 0;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i40) {
                                            case 0:
                                                org.telegram.ui.q qVar = lVar.M;
                                                if (qVar != null) {
                                                    qVar.run(str3);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.ui.q qVar2 = lVar.M;
                                                if (qVar2 != null) {
                                                    qVar2.run(str3);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i41 = org.telegram.ui.web.e.a;
                                t61 K = t61.K(org.telegram.ui.web.e.class);
                                K.z = z12 ? 1 : 0;
                                K.l = str3;
                                K.D = onClickListener;
                                K.q = z31;
                                K.r = z32;
                                K.G = Boolean.TRUE;
                                K.H = lVar;
                                arrayList17.add(K);
                                i13++;
                                z12 = true;
                            }
                            if (!arrayList19.isEmpty()) {
                                arrayList17.add(t61.s(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new ig.d0(lVar, 16)));
                                int i42 = 0;
                                while (i42 < arrayList19.size()) {
                                    final String str4 = (String) arrayList19.get(i42);
                                    boolean z33 = i42 == 0;
                                    final int i43 = 1;
                                    boolean z34 = i42 == arrayList19.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i43) {
                                                case 0:
                                                    org.telegram.ui.q qVar = lVar.M;
                                                    if (qVar != null) {
                                                        qVar.run(str4);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.q qVar2 = lVar.M;
                                                    if (qVar2 != null) {
                                                        qVar2.run(str4);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i44 = org.telegram.ui.web.e.a;
                                    t61 K2 = t61.K(org.telegram.ui.web.e.class);
                                    K2.z = 0;
                                    K2.l = str4;
                                    K2.D = onClickListener2;
                                    K2.q = z33;
                                    K2.r = z34;
                                    K2.G = Boolean.TRUE;
                                    K2.H = lVar;
                                    arrayList17.add(K2);
                                    i42++;
                                }
                            }
                            if (jVar != null) {
                                ArrayList arrayList20 = jVar.a;
                                if (!arrayList20.isEmpty()) {
                                    arrayList17.add(t61.r(LocaleController.getString(R.string.WebSectionBookmarks)));
                                    for (int i45 = 0; i45 < arrayList20.size(); i45++) {
                                        MessageObject messageObject = (MessageObject) arrayList20.get(i45);
                                        if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                                            int i46 = org.telegram.ui.web.h.a;
                                            t61 K3 = t61.K(org.telegram.ui.web.h.class);
                                            K3.z = 3;
                                            K3.q = true;
                                            K3.H = messageObject;
                                            arrayList17.add(K3);
                                        }
                                    }
                                    if (!jVar.f) {
                                        arrayList17.add(t61.q(arrayList17.size(), 32));
                                        arrayList17.add(t61.q(arrayList17.size(), 32));
                                        arrayList17.add(t61.q(arrayList17.size(), 32));
                                        break;
                                    }
                                }
                            }
                        } else {
                            arrayList19.add(kVar2.a);
                        }
                    }
                    arrayList18.size();
                    arrayList19.size();
                    if (!arrayList18.isEmpty()) {
                    }
                    i13 = 0;
                    while (i13 < arrayList18.size()) {
                    }
                    if (!arrayList19.isEmpty()) {
                    }
                    if (jVar != null) {
                    }
                }
                z12 = true;
                arrayList18.size();
                arrayList19.size();
                if (!arrayList18.isEmpty()) {
                }
                i13 = 0;
                while (i13 < arrayList18.size()) {
                }
                if (!arrayList19.isEmpty()) {
                }
                if (jVar != null) {
                }
                break;
            case 21:
                q5 q5Var = (q5) this.b;
                q5Var.y0 = ((Integer) obj).intValue();
                q5Var.z0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(q5Var, i14), 60L);
                break;
            case 22:
                a(obj, obj2);
                break;
            case 23:
                ArrayList arrayList21 = (ArrayList) obj;
                i91 i91Var = ((vh.g) this.b).Y;
                if (i91Var != null) {
                    arrayList21.add(t61.D(AndroidUtilities.dp(12.0f)));
                    arrayList21.add(t61.h(0, 0, i91Var));
                    break;
                }
                break;
            case 24:
                ((li.s2) this.b).run((TL_stats.TL_statsPollStats) obj);
                break;
            case 25:
                b(obj, obj2);
                break;
            case 26:
                ((ArrayList) obj).add(((zh.e) this.b).X);
                break;
            case 27:
                ArrayList arrayList22 = (ArrayList) obj;
                arrayList22.add(((zh.m) this.b).Y);
                arrayList22.add(t61.D(AndroidUtilities.dp(16.0f)));
                break;
            case 28:
                c(obj, obj2);
                break;
            default:
                ((ArrayList) obj).add(t61.j(-1, ((zh.c0) this.b).Z));
                break;
        }
    }
}
