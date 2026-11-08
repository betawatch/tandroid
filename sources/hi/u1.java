package hi;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import fi.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.m6;
import org.telegram.ui.o41;
import org.telegram.ui.un0;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        vh.g gVar = (vh.g) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = gVar.S1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
        int L2 = org.telegram.messenger.g0.L(88.0f) + gVar.d2;
        arrayList.add(x31.E(0, L2));
        int i7 = L - L2;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            for (TLRPC.TL_help_country tL_help_country : (List) gVar.R1.get((String) obj3)) {
                if (TextUtils.isEmpty(gVar.U1) || wg.w0.g1(tL_help_country, org.telegram.messenger.g0.O3(gVar.U1).toLowerCase())) {
                    i7 -= org.telegram.messenger.g0.L(44.0f);
                    boolean containsKey = gVar.b2.containsKey(tL_help_country.iso2);
                    int i11 = vh.f.b;
                    x31 K = x31.K(vh.f.class);
                    K.l = tL_help_country.iso2;
                    K.G = tL_help_country;
                    K.e = containsKey;
                    arrayList.add(K);
                }
            }
        }
        arrayList.add(x31.E(1, Math.max(0, i7)));
    }

    private final void c(Object obj, Object obj2) {
        zh.d dVar = (zh.d) this.b;
        ArrayList arrayList = (ArrayList) obj;
        List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = dVar.P1;
        if (list == null) {
            return;
        }
        for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
            s9 s9Var = dVar.Q1;
            wg.z0 z0Var = new wg.z0(6, dVar, tL_StarGiftAuctionAcquiredGift);
            int i7 = zh.b.b;
            x31 K = x31.K(zh.b.class);
            K.G = tL_StarGiftAuctionAcquiredGift;
            K.H = s9Var;
            K.D = z0Var;
            arrayList.add(K);
        }
        arrayList.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
    }

    private final void d(Object obj, Object obj2) {
        ((ArrayList) obj).add(((zh.f) this.b).P1);
    }

    private final void e(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(((zh.l) this.b).Q1);
        arrayList.add(x31.D(org.telegram.messenger.g0.L(16.0f)));
    }

    private final void f(Object obj, Object obj2) {
        ((ArrayList) obj).add(x31.j(-1, ((zh.u) this.b).R1));
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        boolean z9;
        l41 l41Var;
        String str2;
        int i7;
        String str3;
        String str4;
        String str5;
        boolean z10;
        String str6;
        boolean z11;
        int i10;
        li.f2 f2Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z12;
        int size;
        int i11;
        ArrayList arrayList3;
        int i12;
        int i13 = 6;
        int i14 = 20;
        int i15 = -1;
        switch (this.a) {
            case 0:
                a3 a3Var = (a3) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    a3Var.getClass();
                    break;
                } else {
                    q4 q4Var = a3Var.w0;
                    if (q4Var != null) {
                        q4Var.a(tL_webViewResultUrl);
                        a3Var.s();
                        break;
                    }
                }
                break;
            case 1:
                ((q3) this.b).I0((ArrayList) obj, (l41) obj2);
                break;
            case 2:
                ((p4) this.b).Z((ArrayList) obj, (l41) obj2);
                break;
            case 3:
                ((ii.s) this.b).w.c((ArrayList) obj);
                break;
            case 4:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                yl0 yl0Var = (yl0) ((jg.h0) this.b);
                ww wwVar = yl0Var.I0;
                org.telegram.messenger.g0.v1(wwVar.getParentActivity().getCurrentFocus());
                k60 I = k60.I(wwVar, (g6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    str = null;
                    z9 = false;
                } else {
                    k60 J = I.J();
                    J.c(R.drawable.ic_ab_back, id.M0(2131753756, null), new ob0(I, i14), false);
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
                    str = null;
                    z9 = false;
                    I.c(R.drawable.msg_channel, id.M0(2131745251, null), new h2(I, J, 8), false);
                }
                I.c(R.drawable.msg_info, id.M0(2131754943, str), new m6(yl0Var, wwVar, yl0Var.J0, I, 28), z9);
                I.c(R.drawable.msg_block2, id.M0(2131746237, str), new m6(yl0Var, wwVar, tL_sponsoredPeer, I, 29), z9);
                I.k();
                I.c(R.drawable.msg_cancel, id.M0(2131746321, str), new ng(yl0Var, wwVar, I, 18), z9);
                I.V(id.a0 ? 3 : 5);
                I.Y = true;
                I.t = z9;
                I.Z();
                break;
            case 5:
                kg.c.Z((kg.c) this.b, (ArrayList) obj, (l41) obj2);
                break;
            case 6:
                kg.m mVar = (kg.m) this.b;
                mVar.L.dismiss();
                mVar.D = (String) obj;
                mVar.E = (TLRPC.InputDocument) obj2;
                mVar.x = false;
                org.telegram.messenger.g0.r(mVar.e);
                mVar.n.setSticker(mVar.D);
                mVar.j0(true);
                fi.w3 w3Var = mVar.a;
                if (w3Var != null && (l41Var = w3Var.f3) != null) {
                    l41Var.O(true);
                    break;
                }
                break;
            case 7:
                kg.i0 i0Var = (kg.i0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                l41 l41Var2 = (l41) obj2;
                l41Var2.F = 1;
                arrayList4.add(x31.l(-5, i0Var.S1));
                TL_account.TL_connectedBot tL_connectedBot = i0Var.P1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str2 = null;
                        arrayList4.add(x31.u(id.M0(2131745562, null)));
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(x31.f(id.M0(2131745559, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i7 = 2;
                            arrayList4.add(x31.f(id.M0(2131745558, null), tL_connectedBot.location, 2));
                        } else {
                            i7 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i7)) {
                            arrayList4.add(x31.f(id.M0(2131745560, null), id.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(x31.C(null));
                    } else {
                        str2 = null;
                    }
                    l41Var2.V();
                    arrayList4.add(x31.u(id.M0(2131752819, str2)));
                    int i16 = kg.i0.c2;
                    x31 x10 = x31.x(-1, id.M0(2131752781, str2));
                    x10.L(i0Var.X1);
                    arrayList4.add(x10);
                    int i17 = kg.i0.d2;
                    x31 x11 = x31.x(-2, id.M0(2131752776, str2));
                    x11.L(!i0Var.X1);
                    arrayList4.add(x11);
                    l41Var2.U();
                    arrayList4.add(x31.C(str2));
                    kg.a0 a0Var = i0Var.R1;
                    if (a0Var != null) {
                        a0Var.a(arrayList4, l41Var2, true);
                    }
                    arrayList4.add(x31.C(id.M0(2131752818, str2)));
                    break;
                }
                break;
            case 8:
                final kg.q0 q0Var = (kg.q0) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                l41 l41Var3 = (l41) obj2;
                LongSparseArray longSparseArray = q0Var.N;
                String M0 = id.M0(2131752783, null);
                String M02 = id.M0(2131752782, null);
                x31 x31Var = new x31(2);
                x31Var.l = M0;
                x31Var.o = M02;
                x31Var.m = "tg_superplaceholders_android_2";
                x31Var.n = "🤖🏝️";
                x31Var.z = 120;
                arrayList5.add(x31Var);
                if (q0Var.M != null) {
                    l41Var3.V();
                    long j3 = q0Var.M.id;
                    x31 x31Var2 = new x31(13);
                    x31Var2.x = j3;
                    x31Var2.L(true);
                    final int i18 = 0;
                    x31Var2.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i18) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.M = null;
                                    q0Var2.c.f3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = q0Var3.J;
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
                                    q0Var3.c.f3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        q0Var4.c.f3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        q0Var5.c.f3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.J.manage_stories = !r0.manage_stories;
                                    q0Var6.c.f3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(x31Var2);
                    l41Var3.U();
                } else {
                    l41Var3.V();
                    arrayList5.add(x31.k(q0Var.e));
                    longSparseArray.clear();
                    boolean z13 = false;
                    for (int i19 = 0; i19 < q0Var.d.d.size(); i19++) {
                        TLObject tLObject = (TLObject) q0Var.d.d.get(i19);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j10 = user.id;
                                String str7 = q0Var.D;
                                x31 x31Var3 = new x31(13);
                                x31Var3.x = j10;
                                x31Var3.n = str7;
                                arrayList5.add(x31Var3);
                                longSparseArray.put(user.id, user);
                                z13 = true;
                            }
                        }
                    }
                    for (int i20 = 0; i20 < q0Var.d.e.size(); i20++) {
                        TLObject tLObject2 = (TLObject) q0Var.d.e.get(i20);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j11 = user2.id;
                                String str8 = q0Var.D;
                                x31 x31Var4 = new x31(13);
                                x31Var4.x = j11;
                                x31Var4.n = str8;
                                arrayList5.add(x31Var4);
                                longSparseArray.put(user2.id, user2);
                                z13 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(q0Var.f.getText().toString()) || q0Var.d.e() || q0Var.y)) {
                        arrayList5.add(x31.k(q0Var.n));
                        z13 = true;
                    }
                    q0Var.h.setVisibility(z13 ? 0 : 8);
                    l41Var3.U();
                }
                arrayList5.add(x31.C(id.M0(2131752815, null)));
                l41Var3.V();
                x31 u10 = x31.u(id.M0(2131752819, null));
                u10.g = q0Var.M != null;
                arrayList5.add(u10);
                x31 x12 = x31.x(-1, id.M0(2131752781, null));
                x12.L(q0Var.I);
                x12.g = q0Var.M != null;
                arrayList5.add(x12);
                x31 x13 = x31.x(-2, id.M0(2131752776, null));
                x13.L(!q0Var.I);
                x13.g = q0Var.M != null;
                arrayList5.add(x13);
                l41Var3.U();
                arrayList5.add(x31.C(null));
                q0Var.w.a(arrayList5, l41Var3, q0Var.M != null);
                arrayList5.add(x31.C(id.M0(2131752818, null)));
                if (q0Var.M != null) {
                    l41Var3.V();
                    arrayList5.add(x31.u(id.M0(2131752808, null)));
                    String M03 = id.M0(2131752795, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = q0Var.J;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    x31 o4 = x31.o(-4, M03, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var.J;
                    o4.L(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    final int i21 = 1;
                    o4.f = !q0Var.P;
                    o4.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.M = null;
                                    q0Var2.c.f3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var3.J;
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
                                    q0Var3.c.f3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.f3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        q0Var5.c.f3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.J.manage_stories = !r0.manage_stories;
                                    q0Var6.c.f3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o4);
                    if (q0Var.P) {
                        str3 = null;
                        x31 z14 = x31.z(-5, id.M0(2131752797, null));
                        z14.L(true);
                        z14.g = false;
                        z14.i = 1;
                        arrayList5.add(z14);
                        x31 z15 = x31.z(-6, id.M0(2131752796, null));
                        z15.L(q0Var.J.reply);
                        z15.i = 1;
                        arrayList5.add(z15);
                        x31 z16 = x31.z(-7, id.M0(2131752798, null));
                        z16.L(q0Var.J.read_messages);
                        z16.i = 1;
                        arrayList5.add(z16);
                        x31 z17 = x31.z(-8, id.M0(2131752799, null));
                        z17.L(q0Var.J.delete_sent_messages);
                        z17.i = 1;
                        arrayList5.add(z17);
                        x31 z18 = x31.z(-9, id.M0(2131752800, null));
                        z18.L(q0Var.J.delete_received_messages);
                        z18.i = 1;
                        arrayList5.add(z18);
                    } else {
                        str3 = null;
                    }
                    String M04 = id.M0(2131752791, str3);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var.J;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    x31 o10 = x31.o(-10, M04, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = q0Var.J;
                    o10.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o10.f = !q0Var.Q;
                    final int i22 = 2;
                    o10.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.M = null;
                                    q0Var2.c.f3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var3.J;
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
                                    q0Var3.c.f3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.f3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = q0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        q0Var5.c.f3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.J.manage_stories = !r0.manage_stories;
                                    q0Var6.c.f3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o10);
                    if (q0Var.Q) {
                        str4 = null;
                        x31 z19 = x31.z(-11, id.M0(2131752793, null));
                        z19.L(q0Var.J.edit_name);
                        z19.i = 1;
                        arrayList5.add(z19);
                        x31 z20 = x31.z(-12, id.M0(2131752794, null));
                        z20.L(q0Var.J.edit_bio);
                        z20.i = 1;
                        arrayList5.add(z20);
                        x31 z21 = x31.z(-13, id.M0(2131752792, null));
                        z21.L(q0Var.J.edit_profile_photo);
                        z21.i = 1;
                        arrayList5.add(z21);
                        x31 z22 = x31.z(-14, id.M0(2131752790, null));
                        z22.L(q0Var.J.edit_username);
                        z22.i = 1;
                        arrayList5.add(z22);
                    } else {
                        str4 = null;
                    }
                    String M05 = id.M0(2131752807, str4);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = q0Var.J;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    x31 o11 = x31.o(-15, M05, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = q0Var.J;
                    o11.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o11.f = !q0Var.R;
                    final int i23 = 3;
                    o11.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.M = null;
                                    q0Var2.c.f3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var3.J;
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
                                    q0Var3.c.f3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.f3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = q0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        q0Var5.c.f3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.J.manage_stories = !r0.manage_stories;
                                    q0Var6.c.f3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o11);
                    if (q0Var.R) {
                        str5 = null;
                        x31 z23 = x31.z(-16, id.M0(2131752802, null));
                        z23.L(q0Var.J.view_gifts);
                        z23.i = 1;
                        arrayList5.add(z23);
                        x31 z24 = x31.z(-17, id.M0(2131752806, null));
                        z24.L(q0Var.J.sell_gifts);
                        z24.i = 1;
                        arrayList5.add(z24);
                        x31 z25 = x31.z(-18, id.M0(2131752805, null));
                        z25.L(q0Var.J.change_gift_settings);
                        z25.i = 1;
                        arrayList5.add(z25);
                        x31 z26 = x31.z(-19, id.M0(2131752804, null));
                        z26.L(q0Var.J.transfer_and_upgrade_gifts);
                        z26.i = 1;
                        arrayList5.add(z26);
                        x31 z27 = x31.z(-20, id.M0(2131752803, null));
                        z27.L(q0Var.J.transfer_stars);
                        z27.i = 1;
                        arrayList5.add(z27);
                    } else {
                        str5 = null;
                    }
                    x31 o12 = x31.o(-21, id.M0(2131752789, str5), "");
                    o12.L(q0Var.J.manage_stories);
                    final int i24 = 4;
                    o12.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.M = null;
                                    q0Var2.c.f3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var3.J;
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
                                    q0Var3.c.f3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.f3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = q0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        q0Var5.c.f3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.J.manage_stories = !r0.manage_stories;
                                    q0Var6.c.f3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o12);
                    l41Var3.U();
                    arrayList5.add(x31.B(-4, null));
                    arrayList5.add(x31.B(-5, null));
                    arrayList5.add(x31.B(-6, null));
                    arrayList5.add(x31.B(-7, null));
                    break;
                }
                break;
            case 9:
                kg.s0.Z((kg.s0) this.b, (ArrayList) obj, (l41) obj2);
                break;
            case 10:
                kg.a1 a1Var = (kg.a1) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                String M06 = id.M0(2131752698, null);
                String M07 = id.M0(2131752692, null);
                x31 x31Var5 = new x31(2);
                x31Var5.l = M06;
                x31Var5.o = M07;
                x31Var5.k = R.raw.biz_map;
                arrayList6.add(x31Var5);
                arrayList6.add(x31.k(a1Var.d));
                arrayList6.add(x31.C(null));
                x31 i25 = x31.i(1, id.M0(2131752691, null));
                i25.L(a1Var.x != null);
                arrayList6.add(i25);
                if (a1Var.x != null) {
                    arrayList6.add(x31.k(a1Var.f));
                }
                arrayList6.add(x31.C(null));
                boolean z28 = (a1Var.w == null || (a1Var.x == null && TextUtils.isEmpty(a1Var.y))) ? false : true;
                a1Var.F = z28;
                if (z28) {
                    x31 e10 = x31.e(2, id.M0(2131752696, null));
                    z10 = true;
                    e10.r = true;
                    arrayList6.add(e10);
                    arrayList6.add(x31.C(null));
                } else {
                    z10 = true;
                }
                a1Var.Z(z10);
                break;
            case 11:
                kg.c1.a0((kg.c1) this.b, (ArrayList) obj);
                break;
            case 12:
                kg.e1 e1Var = (kg.e1) this.b;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = e1Var.b;
                String str9 = null;
                String M08 = id.M0(2131752752, null);
                x31 x31Var6 = new x31(9);
                x31Var6.d = -1;
                x31Var6.l = M08;
                x31Var6.L(e1Var.r);
                arrayList7.add(x31Var6);
                arrayList7.add(x31.C(null));
                if (e1Var.r) {
                    int i26 = 0;
                    while (i26 < arrayList8.size()) {
                        if (i26 > 0) {
                            arrayList7.add(x31.C(str9));
                        }
                        kg.b1 b1Var = (kg.b1) arrayList8.get(i26);
                        if (e1Var.Z()) {
                            str6 = null;
                        } else {
                            int i27 = i26 * 3;
                            str6 = null;
                            arrayList7.add(x31.f(id.M0(2131752751, null), kg.b1.a(b1Var.a), i27));
                            arrayList7.add(x31.f(id.M0(2131752757, null), kg.b1.a(b1Var.b), i27 + 1));
                            x31 e11 = x31.e(i27 + 2, id.M0(2131746322, null));
                            e11.r = true;
                            arrayList7.add(e11);
                        }
                        i26++;
                        str9 = str6;
                    }
                    String str10 = str9;
                    if (e1Var.a0()) {
                        arrayList7.add(x31.C(str10));
                        x31 c10 = x31.c(-2, R.drawable.menu_premium_clock_add, id.M0(2131752758, str10));
                        c10.q = true;
                        arrayList7.add(c10);
                    }
                    arrayList7.add(x31.C(id.M0(2131752753, str10)));
                    break;
                }
                break;
            case 13:
                kg.w1.a0((kg.w1) this.b, (ArrayList) obj, (l41) obj2);
                break;
            case 14:
                ki.a aVar = (ki.a) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(x31.E(0, org.telegram.messenger.g0.L(12.0f)));
                arrayList9.add(x31.j(1, aVar.R1));
                arrayList9.add(x31.E(2, org.telegram.messenger.g0.L(12.0f)));
                arrayList9.add(x31.t(3, id.M0(2131751947, null)));
                aVar.U1 = arrayList9.size();
                String M09 = id.M0(2131751946, null);
                boolean z29 = aVar.T1;
                x31 y10 = x31.y(qs.h2, M09, id.M0(z29 ? 2131751945 : 2131751944, null));
                y10.L(!aVar.Q1);
                arrayList9.add(y10);
                x31 y11 = x31.y(qs.g2, id.M0(2131751950, null), id.M0(z29 ? 2131751949 : 2131751948, null));
                y11.L(aVar.Q1);
                arrayList9.add(y11);
                arrayList9.add(x31.B(6, id.M0(2131751951, null)));
                break;
            case 15:
                ((ArrayList) obj).add(x31.j(0, ((ki.b) this.b).P1));
                break;
            case 16:
                Utilities.i.c(new ha.b(25, (String[]) this.b, (v10) obj2));
                break;
            case 17:
                li.v vVar = (li.v) this.b;
                ArrayList arrayList10 = (ArrayList) obj;
                arrayList10.add(x31.j(1, vVar.S1));
                arrayList10.add(x31.j(3, vVar.V1));
                if (vVar.a2 != null) {
                    arrayList10.add(x31.j(2, vVar.T1));
                    break;
                }
                break;
            case 18:
                li.t3.L1((li.t3[]) this.b, (ArrayList) obj, (l41) obj2);
                break;
            case 19:
                li.t3 t3Var = (li.t3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = t3Var.s3;
                ArrayList arrayList13 = new ArrayList(arrayList11.size());
                int size2 = arrayList11.size();
                int i28 = 0;
                while (i28 < size2) {
                    Object obj3 = arrayList11.get(i28);
                    i28++;
                    Object obj4 = ((x31) obj3).G;
                    if (obj4 instanceof li.a) {
                        arrayList13.add((li.a) obj4);
                    }
                }
                if (arrayList13.size() >= 2) {
                    ArrayList arrayList14 = new ArrayList();
                    int size3 = arrayList13.size();
                    int i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i30 = 0;
                    int i31 = 0;
                    while (i31 < size3) {
                        Object obj5 = arrayList13.get(i31);
                        i31++;
                        li.a aVar2 = (li.a) obj5;
                        int indexOf = arrayList12.indexOf(aVar2);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i32 = indexOf + 1;
                            if (li.t3.A3(aVar2) && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                                int S3 = t3Var.S3(indexOf);
                                i32 = S3 >= arrayList12.size() ? arrayList12.size() : S3 + 1;
                            }
                            arrayList14.add(new ArrayList(arrayList12.subList(indexOf, i32)));
                            i29 = Math.min(i29, indexOf);
                            i15 = Math.max(i15, i32);
                            i30 += i32 - indexOf;
                        }
                    }
                    if (i30 == i15 - i29) {
                        ArrayList arrayList15 = new ArrayList(i30);
                        int size4 = arrayList14.size();
                        int i33 = 0;
                        while (i33 < size4) {
                            Object obj6 = arrayList14.get(i33);
                            i33++;
                            arrayList15.addAll((ArrayList) obj6);
                        }
                        for (int i34 = 0; i34 < arrayList15.size(); i34++) {
                            if (arrayList12.get(i29 + i34) != arrayList15.get(i34)) {
                                li.f2 f2Var2 = t3Var.Q3;
                                if (f2Var2 != null) {
                                    f2Var2.d();
                                }
                                for (int i35 = 0; i35 < arrayList15.size(); i35++) {
                                    arrayList12.set(i29 + i35, (li.a) arrayList15.get(i35));
                                }
                                li.a aVar3 = t3Var.Z3;
                                ArrayList arrayList16 = li.t3.z4;
                                if (aVar3 != null) {
                                    ArrayList arrayList17 = aVar3.k;
                                    int indexOf2 = arrayList12.indexOf(aVar3);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList18 = indexOf2 > 0 ? ((li.a) arrayList12.get(indexOf2 - 1)).k : arrayList16;
                                        int i36 = indexOf2 + 1;
                                        if (i36 < arrayList12.size()) {
                                            arrayList16 = ((li.a) arrayList12.get(i36)).k;
                                        }
                                        if (arrayList18.size() < arrayList16.size()) {
                                            arrayList18 = arrayList16;
                                        }
                                        if (!arrayList17.equals(arrayList18)) {
                                            arrayList17.clear();
                                            arrayList17.addAll(arrayList18);
                                            z11 = true;
                                            boolean A2 = t3Var.A2();
                                            i10 = 0;
                                            while (i10 < arrayList12.size()) {
                                                li.a aVar4 = (li.a) arrayList12.get(i10);
                                                if (!aVar4.i && !li.t3.A3(aVar4)) {
                                                    li.a aVar5 = i10 > 0 ? (li.a) arrayList12.get(i10 - 1) : null;
                                                    int max = aVar5 != null ? Math.max(0, aVar5.c) : 0;
                                                    if (li.t3.H3(aVar4.b)) {
                                                        aVar4.c = max;
                                                        if (max > 0) {
                                                            aVar4.d = aVar5.d > 0 ? 1 : 0;
                                                            aVar4.e = false;
                                                            aVar4.f = false;
                                                        }
                                                    } else {
                                                        int i37 = max + 1;
                                                        if (aVar4.c > i37) {
                                                            aVar4.c = i37;
                                                        }
                                                    }
                                                    if (aVar4.c <= 0) {
                                                        aVar4.c = 0;
                                                        aVar4.d = 0;
                                                        aVar4.e = false;
                                                        aVar4.f = false;
                                                    }
                                                }
                                                i10++;
                                            }
                                            t3Var.v4();
                                            t3Var.d2();
                                            if (!z11 || A2) {
                                                t3Var.f3.O(true);
                                                t3Var.A4();
                                            } else {
                                                t3Var.A4();
                                            }
                                            f2Var = t3Var.Q3;
                                            if (f2Var == null) {
                                                f2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                boolean A22 = t3Var.A2();
                                i10 = 0;
                                while (i10 < arrayList12.size()) {
                                }
                                t3Var.v4();
                                t3Var.d2();
                                if (z11) {
                                }
                                t3Var.f3.O(true);
                                t3Var.A4();
                                f2Var = t3Var.Q3;
                                if (f2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 20:
                final org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) this.b;
                ArrayList arrayList19 = (ArrayList) obj;
                org.telegram.ui.web.h hVar = jVar.D;
                ArrayList arrayList20 = jVar.y;
                if (!jVar.b && arrayList20.isEmpty()) {
                    arrayList19.add(x31.k(jVar.d));
                }
                SharedPreferences sharedPreferences = jVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList21 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        int i38 = 0;
                        while (i38 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i38);
                            z12 = true;
                            arrayList2 = arrayList19;
                            try {
                                org.telegram.ui.web.i iVar = new org.telegram.ui.web.i(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                iVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(iVar);
                                i38++;
                                arrayList19 = arrayList2;
                            } catch (Exception unused) {
                            }
                        }
                        arrayList2 = arrayList19;
                        z12 = true;
                        Collections.sort(arrayList, new un0(9));
                        size = arrayList.size();
                        i11 = 0;
                    } catch (Exception unused2) {
                    }
                    while (i11 < size) {
                        Object obj7 = arrayList.get(i11);
                        i11++;
                        org.telegram.ui.web.i iVar2 = (org.telegram.ui.web.i) obj7;
                        if (arrayList21.size() >= 20) {
                            arrayList20.size();
                            arrayList21.size();
                            if (arrayList20.isEmpty()) {
                                arrayList3 = arrayList2;
                            } else {
                                arrayList3 = arrayList2;
                                arrayList3.add(x31.k(jVar.w));
                            }
                            i12 = 0;
                            while (i12 < arrayList20.size()) {
                                final String str11 = (String) arrayList20.get(i12);
                                boolean z30 = i12 == 0 ? z12 : false;
                                boolean z31 = i12 == arrayList20.size() + (-1) ? z12 : false;
                                final int i39 = 0;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i39) {
                                            case 0:
                                                org.telegram.ui.q qVar = jVar.M;
                                                if (qVar != null) {
                                                    qVar.a(str11);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.ui.q qVar2 = jVar.M;
                                                if (qVar2 != null) {
                                                    qVar2.a(str11);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i40 = org.telegram.ui.web.c.b;
                                x31 K = x31.K(org.telegram.ui.web.c.class);
                                K.z = z12 ? 1 : 0;
                                K.l = str11;
                                K.D = onClickListener;
                                K.q = z30;
                                K.r = z31;
                                K.G = Boolean.TRUE;
                                K.H = jVar;
                                arrayList3.add(K);
                                i12++;
                                z12 = true;
                            }
                            if (!arrayList21.isEmpty()) {
                                arrayList3.add(x31.s(id.M0(2131742915, null), id.M0(2131742919, null), new ii.g(jVar, i14)));
                                int i41 = 0;
                                while (i41 < arrayList21.size()) {
                                    final String str12 = (String) arrayList21.get(i41);
                                    boolean z32 = i41 == 0;
                                    final int i42 = 1;
                                    boolean z33 = i41 == arrayList21.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i42) {
                                                case 0:
                                                    org.telegram.ui.q qVar = jVar.M;
                                                    if (qVar != null) {
                                                        qVar.a(str12);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.q qVar2 = jVar.M;
                                                    if (qVar2 != null) {
                                                        qVar2.a(str12);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i43 = org.telegram.ui.web.c.b;
                                    x31 K2 = x31.K(org.telegram.ui.web.c.class);
                                    K2.z = 0;
                                    K2.l = str12;
                                    K2.D = onClickListener2;
                                    K2.q = z32;
                                    K2.r = z33;
                                    K2.G = Boolean.TRUE;
                                    K2.H = jVar;
                                    arrayList3.add(K2);
                                    i41++;
                                }
                            }
                            if (hVar != null) {
                                ArrayList arrayList22 = hVar.a;
                                if (!arrayList22.isEmpty()) {
                                    arrayList3.add(x31.r(id.M0(2131742916, null)));
                                    for (int i44 = 0; i44 < arrayList22.size(); i44++) {
                                        ij ijVar = (ij) arrayList22.get(i44);
                                        if (!TextUtils.isEmpty(org.telegram.ui.web.j.a(ijVar))) {
                                            int i45 = org.telegram.ui.web.f.b;
                                            x31 K3 = x31.K(org.telegram.ui.web.f.class);
                                            K3.z = 3;
                                            K3.q = true;
                                            K3.H = ijVar;
                                            arrayList3.add(K3);
                                        }
                                    }
                                    if (!hVar.f) {
                                        arrayList3.add(x31.q(arrayList3.size(), 32));
                                        arrayList3.add(x31.q(arrayList3.size(), 32));
                                        arrayList3.add(x31.q(arrayList3.size(), 32));
                                        break;
                                    }
                                }
                            }
                        } else {
                            arrayList21.add(iVar2.a);
                        }
                    }
                    arrayList20.size();
                    arrayList21.size();
                    if (arrayList20.isEmpty()) {
                    }
                    i12 = 0;
                    while (i12 < arrayList20.size()) {
                    }
                    if (!arrayList21.isEmpty()) {
                    }
                    if (hVar != null) {
                    }
                }
                arrayList2 = arrayList19;
                z12 = true;
                arrayList20.size();
                arrayList21.size();
                if (arrayList20.isEmpty()) {
                }
                i12 = 0;
                while (i12 < arrayList20.size()) {
                }
                if (!arrayList21.isEmpty()) {
                }
                if (hVar != null) {
                }
                break;
            case 21:
                e5 e5Var = (e5) this.b;
                e5Var.y0 = ((Integer) obj).intValue();
                e5Var.z0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.i3(new sg.t0(e5Var, i13), 60L);
                break;
            case 22:
                b(obj, obj2);
                break;
            case 23:
                ArrayList arrayList23 = (ArrayList) obj;
                o41 o41Var = ((vh.h) this.b).Q1;
                if (o41Var != null) {
                    arrayList23.add(x31.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList23.add(x31.h(0, 0, o41Var));
                    break;
                }
                break;
            case 24:
                ((org.telegram.messenger.voip.k) this.b).a((TL_stats.TL_statsPollStats) obj);
                break;
            case 25:
                c(obj, obj2);
                break;
            case 26:
                d(obj, obj2);
                break;
            case 27:
                e(obj, obj2);
                break;
            case 28:
                f(obj, obj2);
                break;
            default:
                ((ArrayList) obj).add(x31.j(-1, ((zh.b0) this.b).R1));
                break;
        }
    }
}
