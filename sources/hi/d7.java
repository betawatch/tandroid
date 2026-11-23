package hi;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q20;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d7 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ni.a aVar = (ni.a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(o41.E(0, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(o41.j(1, aVar.V1));
        arrayList.add(o41.E(2, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(o41.t(3, hd.N0(2131751935, null)));
        aVar.Y1 = arrayList.size();
        String N0 = hd.N0(2131751934, null);
        boolean z10 = aVar.X1;
        o41 y10 = o41.y(ls.h2, N0, hd.N0(z10 ? 2131751933 : 2131751932, null));
        y10.L(true ^ aVar.U1);
        arrayList.add(y10);
        o41 y11 = o41.y(ls.g2, hd.N0(2131751938, null), hd.N0(z10 ? 2131751937 : 2131751936, null));
        y11.L(aVar.U1);
        arrayList.add(y11);
        arrayList.add(o41.B(6, hd.N0(2131751939, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:492:0x08a1, code lost:
    
        if (r1.y != false) goto L442;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    @Override // org.telegram.messenger.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        long j3;
        long j10;
        TL_stars.StarsAmount starsAmount;
        String str;
        boolean z10;
        c51 c51Var;
        String str2;
        int i7;
        c51 c51Var2;
        String str3;
        String str4;
        String str5;
        String str6;
        String upperCase;
        boolean z11;
        int i10;
        oi.g2 g2Var;
        String str7 = "";
        int i11 = 29;
        int i12 = 9;
        boolean z12 = false;
        int i13 = 0;
        z12 = false;
        final int i14 = 1;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (k7Var.d2 || k7Var.c2 != null) {
                    TLRPC.WebPage webPage = k7Var.c2;
                    e7 e7Var = new e7(k7Var, 0);
                    int i15 = i7.b;
                    o41 K = o41.K(i7.class);
                    K.H = webPage;
                    K.E = e7Var;
                    arrayList.add(K);
                }
                arrayList.add(o41.k(k7Var.U1));
                arrayList.add(o41.B(1, null));
                o41 i16 = o41.i(2, hd.N0(2131744394, null));
                i16.L(k7Var.i2);
                arrayList.add(i16);
                if (k7Var.i2) {
                    arrayList.add(o41.k(k7Var.V1));
                }
                arrayList.add(o41.B(3, null));
                arrayList.add(o41.k(k7Var.W1));
                break;
            case 1:
                sa saVar = (sa) this.b;
                Float f10 = (Float) obj2;
                long duration = saVar.Y0.getDuration() < 100 ? saVar.L1.h0 : saVar.Y0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                c7 c7Var = saVar.L1;
                float f11 = c7Var.a0;
                float f12 = c7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j11 = (long) (f13 * f14);
                ga gaVar = saVar.Y0;
                long j12 = (long) ((f12 * f14) + j11);
                saVar.N1 = j12;
                gaVar.m(j12);
                u9 u9Var = saVar.w1;
                if (u9Var != null) {
                    u9Var.setCoverTime(saVar.N1);
                }
                c7 c7Var2 = saVar.L1;
                if (c7Var2 != null && c7Var2.g) {
                    c7Var2.j = true;
                    break;
                }
                break;
            case 2:
                ((va) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 3:
                bi.u4 u4Var = (bi.u4) this.b;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null || !tL_starsRevenueStatus.withdrawal_enabled) {
                    j3 = 0;
                    j10 = 0;
                } else {
                    j3 = starsAmount.amount;
                    j10 = 0;
                }
                u4Var.a(Long.valueOf(Math.max(j10, j3)), tL_error);
                break;
            case 4:
                ((ii.t) this.b).E0((ArrayList) obj, (c51) obj2);
                break;
            case 5:
                ii.s sVar = (ii.s) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(o41.k(sVar.U1));
                arrayList2.add(o41.k(sVar.V1));
                break;
            case 6:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                nm0 nm0Var = (nm0) ((jg.h0) this.b);
                cx cxVar = nm0Var.J0;
                org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                a70 J = a70.J(cxVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                    str = null;
                } else {
                    a70 K2 = J.K();
                    K2.c(R.drawable.ic_ab_back, hd.N0(2131753753, null), new hb0(J, 23), false);
                    K2.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        K2.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            K2.k();
                        }
                        K2.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    str = null;
                    z10 = false;
                    J.c(R.drawable.msg_channel, hd.N0(2131745005, null), new bi.x5(J, K2, i12), false);
                }
                J.c(R.drawable.msg_info, hd.N0(2131754943, str), new q20(nm0Var, cxVar, nm0Var.K0, J, 5), z10);
                J.c(R.drawable.msg_block2, hd.N0(2131746038, str), new q20(nm0Var, cxVar, tL_sponsoredPeer, J, 6), z10);
                J.k();
                J.c(R.drawable.msg_cancel, hd.N0(2131746124, str), new org.telegram.ui.Components.g(nm0Var, cxVar, J, 24), z10);
                J.W(hd.a0 ? 3 : 5);
                J.b0 = true;
                J.t = z10;
                J.a0();
                break;
            case 7:
                kg.c.Z((kg.c) this.b, (ArrayList) obj, (c51) obj2);
                break;
            case 8:
                kg.n nVar = (kg.n) this.b;
                nVar.M.dismiss();
                nVar.E = (String) obj;
                nVar.F = (TLRPC.InputDocument) obj2;
                nVar.x = false;
                org.telegram.messenger.g0.r(nVar.e);
                nVar.n.setSticker(nVar.E);
                nVar.j0(true);
                bi.f6 f6Var = nVar.a;
                if (f6Var != null && (c51Var = f6Var.g3) != null) {
                    c51Var.O(true);
                    break;
                }
                break;
            case 9:
                kg.k0 k0Var = (kg.k0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                c51 c51Var3 = (c51) obj2;
                c51Var3.G = 1;
                arrayList3.add(o41.l(-5, k0Var.W1));
                TL_account.TL_connectedBot tL_connectedBot = k0Var.T1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str2 = null;
                        i5.c.s(2131745363, null, arrayList3);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(o41.f(hd.N0(2131745360, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i7 = 2;
                            arrayList3.add(o41.f(hd.N0(2131745359, null), tL_connectedBot.location, 2));
                        } else {
                            i7 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i7)) {
                            arrayList3.add(o41.f(hd.N0(2131745361, null), hd.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(o41.C(null));
                    } else {
                        str2 = null;
                    }
                    c51Var3.V();
                    arrayList3.add(o41.u(hd.N0(2131752807, str2)));
                    int i17 = kg.k0.g2;
                    o41 x10 = o41.x(-1, hd.N0(2131752769, str2));
                    x10.L(k0Var.b2);
                    arrayList3.add(x10);
                    int i18 = kg.k0.h2;
                    o41 x11 = o41.x(-2, hd.N0(2131752764, str2));
                    x11.L(!k0Var.b2);
                    arrayList3.add(x11);
                    c51Var3.U();
                    arrayList3.add(o41.C(str2));
                    kg.b0 b0Var = k0Var.V1;
                    if (b0Var != null) {
                        b0Var.a(arrayList3, c51Var3, true);
                    }
                    arrayList3.add(o41.C(hd.N0(2131752806, str2)));
                    break;
                }
                break;
            case 10:
                final kg.s0 s0Var = (kg.s0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                c51 c51Var4 = (c51) obj2;
                LongSparseArray longSparseArray = s0Var.O;
                String N0 = hd.N0(2131752771, null);
                String N02 = hd.N0(2131752770, null);
                o41 o41Var = new o41(2);
                o41Var.m = N0;
                o41Var.p = N02;
                o41Var.n = "tg_superplaceholders_android_2";
                o41Var.o = "🤖🏝️";
                o41Var.A = 120;
                arrayList4.add(o41Var);
                if (s0Var.N != null) {
                    c51Var4.V();
                    c51Var2 = c51Var4;
                    long j13 = s0Var.N.id;
                    o41 o41Var2 = new o41(13);
                    o41Var2.y = j13;
                    o41Var2.L(true);
                    final int i19 = z12 ? 1 : 0;
                    o41Var2.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    s0 s0Var2 = s0Var;
                                    s0Var2.N = null;
                                    s0Var2.c.g3.O(true);
                                    s0Var2.d0(true);
                                    break;
                                case 1:
                                    s0 s0Var3 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = s0Var3.K;
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
                                    s0Var3.c.g3.O(true);
                                    s0Var3.d0(true);
                                    break;
                                case 2:
                                    s0 s0Var4 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var4.K;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        s0Var4.c0(-14, true, new m0(s0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        s0Var4.c.g3.O(true);
                                        s0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    s0 s0Var5 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var5.K;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        s0Var5.c0(-17, true, new m0(s0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        s0Var5.c.g3.O(true);
                                        s0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    s0 s0Var6 = s0Var;
                                    s0Var6.K.manage_stories = !r0.manage_stories;
                                    s0Var6.c.g3.O(true);
                                    s0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o41Var2);
                    c51Var2.U();
                } else {
                    c51Var2 = c51Var4;
                    c51Var2.V();
                    arrayList4.add(o41.k(s0Var.e));
                    longSparseArray.clear();
                    int i20 = 0;
                    boolean z13 = false;
                    while (i20 < s0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) s0Var.d.d.get(i20);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j14 = user.id;
                                String str8 = s0Var.E;
                                o41 o41Var3 = new o41(13);
                                o41Var3.y = j14;
                                o41Var3.o = str8;
                                arrayList4.add(o41Var3);
                                longSparseArray.put(user.id, user);
                                z13 = true;
                            }
                        }
                        i20++;
                        z13 = z13;
                    }
                    int i21 = 0;
                    boolean z14 = z13;
                    while (i21 < s0Var.d.e.size()) {
                        TLObject tLObject2 = (TLObject) s0Var.d.e.get(i21);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j15 = user2.id;
                                String str9 = s0Var.E;
                                o41 o41Var4 = new o41(13);
                                o41Var4.y = j15;
                                o41Var4.o = str9;
                                arrayList4.add(o41Var4);
                                longSparseArray.put(user2.id, user2);
                                z14 = true;
                            }
                        }
                        i21++;
                        z14 = z14;
                    }
                    boolean z15 = z14;
                    if (longSparseArray.size() <= 0) {
                        if (TextUtils.isEmpty(s0Var.f.getText().toString()) && !s0Var.d.e()) {
                            z15 = z14;
                            break;
                        }
                        arrayList4.add(o41.k(s0Var.n));
                        z15 = true;
                    }
                    s0Var.h.setVisibility(z15 ? 0 : 8);
                    c51Var2.U();
                }
                arrayList4.add(o41.C(hd.N0(2131752803, null)));
                c51Var2.V();
                o41 u10 = o41.u(hd.N0(2131752807, null));
                u10.g = s0Var.N != null;
                arrayList4.add(u10);
                o41 x12 = o41.x(-1, hd.N0(2131752769, null));
                x12.L(s0Var.J);
                x12.g = s0Var.N != null;
                arrayList4.add(x12);
                o41 x13 = o41.x(-2, hd.N0(2131752764, null));
                x13.L(!s0Var.J);
                x13.g = s0Var.N != null;
                arrayList4.add(x13);
                c51Var2.U();
                arrayList4.add(o41.C(null));
                c51 c51Var5 = c51Var2;
                s0Var.w.a(arrayList4, c51Var5, s0Var.N != null);
                arrayList4.add(o41.C(hd.N0(2131752806, null)));
                if (s0Var.N != null) {
                    c51Var5.V();
                    arrayList4.add(o41.u(hd.N0(2131752796, null)));
                    String N03 = hd.N0(2131752783, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = s0Var.K;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    o41 o4 = o41.o(-4, N03, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var.K;
                    o4.L(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    o4.f = !s0Var.Q;
                    o4.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    s0 s0Var2 = s0Var;
                                    s0Var2.N = null;
                                    s0Var2.c.g3.O(true);
                                    s0Var2.d0(true);
                                    break;
                                case 1:
                                    s0 s0Var3 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var3.K;
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
                                    s0Var3.c.g3.O(true);
                                    s0Var3.d0(true);
                                    break;
                                case 2:
                                    s0 s0Var4 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = s0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        s0Var4.c0(-14, true, new m0(s0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        s0Var4.c.g3.O(true);
                                        s0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    s0 s0Var5 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = s0Var5.K;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        s0Var5.c0(-17, true, new m0(s0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        s0Var5.c.g3.O(true);
                                        s0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    s0 s0Var6 = s0Var;
                                    s0Var6.K.manage_stories = !r0.manage_stories;
                                    s0Var6.c.g3.O(true);
                                    s0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o4);
                    if (s0Var.Q) {
                        str3 = null;
                        o41 z16 = o41.z(-5, hd.N0(2131752785, null));
                        z16.L(true);
                        z16.g = false;
                        z16.i = 1;
                        arrayList4.add(z16);
                        o41 z17 = o41.z(-6, hd.N0(2131752784, null));
                        z17.L(s0Var.K.reply);
                        z17.i = 1;
                        arrayList4.add(z17);
                        o41 z18 = o41.z(-7, hd.N0(2131752786, null));
                        z18.L(s0Var.K.read_messages);
                        z18.i = 1;
                        arrayList4.add(z18);
                        o41 z19 = o41.z(-8, hd.N0(2131752787, null));
                        z19.L(s0Var.K.delete_sent_messages);
                        z19.i = 1;
                        arrayList4.add(z19);
                        o41 z20 = o41.z(-9, hd.N0(2131752788, null));
                        z20.L(s0Var.K.delete_received_messages);
                        z20.i = 1;
                        arrayList4.add(z20);
                    } else {
                        str3 = null;
                    }
                    String N04 = hd.N0(2131752779, str3);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var.K;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    o41 o10 = o41.o(-10, N04, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = s0Var.K;
                    o10.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o10.f = !s0Var.R;
                    final int i22 = 2;
                    o10.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    s0 s0Var2 = s0Var;
                                    s0Var2.N = null;
                                    s0Var2.c.g3.O(true);
                                    s0Var2.d0(true);
                                    break;
                                case 1:
                                    s0 s0Var3 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = s0Var3.K;
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
                                    s0Var3.c.g3.O(true);
                                    s0Var3.d0(true);
                                    break;
                                case 2:
                                    s0 s0Var4 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = s0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        s0Var4.c0(-14, true, new m0(s0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        s0Var4.c.g3.O(true);
                                        s0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    s0 s0Var5 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = s0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        s0Var5.c0(-17, true, new m0(s0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        s0Var5.c.g3.O(true);
                                        s0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    s0 s0Var6 = s0Var;
                                    s0Var6.K.manage_stories = !r0.manage_stories;
                                    s0Var6.c.g3.O(true);
                                    s0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o10);
                    if (s0Var.R) {
                        str4 = null;
                        o41 z21 = o41.z(-11, hd.N0(2131752781, null));
                        z21.L(s0Var.K.edit_name);
                        z21.i = 1;
                        arrayList4.add(z21);
                        o41 z22 = o41.z(-12, hd.N0(2131752782, null));
                        z22.L(s0Var.K.edit_bio);
                        z22.i = 1;
                        arrayList4.add(z22);
                        o41 z23 = o41.z(-13, hd.N0(2131752780, null));
                        z23.L(s0Var.K.edit_profile_photo);
                        z23.i = 1;
                        arrayList4.add(z23);
                        o41 z24 = o41.z(-14, hd.N0(2131752778, null));
                        z24.L(s0Var.K.edit_username);
                        z24.i = 1;
                        arrayList4.add(z24);
                    } else {
                        str4 = null;
                    }
                    String N05 = hd.N0(2131752795, str4);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = s0Var.K;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    o41 o11 = o41.o(-15, N05, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = s0Var.K;
                    o11.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o11.f = !s0Var.S;
                    final int i23 = 3;
                    o11.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    s0 s0Var2 = s0Var;
                                    s0Var2.N = null;
                                    s0Var2.c.g3.O(true);
                                    s0Var2.d0(true);
                                    break;
                                case 1:
                                    s0 s0Var3 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = s0Var3.K;
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
                                    s0Var3.c.g3.O(true);
                                    s0Var3.d0(true);
                                    break;
                                case 2:
                                    s0 s0Var4 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = s0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        s0Var4.c0(-14, true, new m0(s0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        s0Var4.c.g3.O(true);
                                        s0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    s0 s0Var5 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = s0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        s0Var5.c0(-17, true, new m0(s0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        s0Var5.c.g3.O(true);
                                        s0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    s0 s0Var6 = s0Var;
                                    s0Var6.K.manage_stories = !r0.manage_stories;
                                    s0Var6.c.g3.O(true);
                                    s0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o11);
                    if (s0Var.S) {
                        str5 = null;
                        o41 z25 = o41.z(-16, hd.N0(2131752790, null));
                        z25.L(s0Var.K.view_gifts);
                        z25.i = 1;
                        arrayList4.add(z25);
                        o41 z26 = o41.z(-17, hd.N0(2131752794, null));
                        z26.L(s0Var.K.sell_gifts);
                        z26.i = 1;
                        arrayList4.add(z26);
                        o41 z27 = o41.z(-18, hd.N0(2131752793, null));
                        z27.L(s0Var.K.change_gift_settings);
                        z27.i = 1;
                        arrayList4.add(z27);
                        o41 z28 = o41.z(-19, hd.N0(2131752792, null));
                        z28.L(s0Var.K.transfer_and_upgrade_gifts);
                        z28.i = 1;
                        arrayList4.add(z28);
                        o41 z29 = o41.z(-20, hd.N0(2131752791, null));
                        z29.L(s0Var.K.transfer_stars);
                        z29.i = 1;
                        arrayList4.add(z29);
                    } else {
                        str5 = null;
                    }
                    o41 o12 = o41.o(-21, hd.N0(2131752777, str5), "");
                    o12.L(s0Var.K.manage_stories);
                    final int i24 = 4;
                    o12.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    s0 s0Var2 = s0Var;
                                    s0Var2.N = null;
                                    s0Var2.c.g3.O(true);
                                    s0Var2.d0(true);
                                    break;
                                case 1:
                                    s0 s0Var3 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = s0Var3.K;
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
                                    s0Var3.c.g3.O(true);
                                    s0Var3.d0(true);
                                    break;
                                case 2:
                                    s0 s0Var4 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = s0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        s0Var4.c0(-14, true, new m0(s0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        s0Var4.c.g3.O(true);
                                        s0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    s0 s0Var5 = s0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = s0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        s0Var5.c0(-17, true, new m0(s0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        s0Var5.c.g3.O(true);
                                        s0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    s0 s0Var6 = s0Var;
                                    s0Var6.K.manage_stories = !r0.manage_stories;
                                    s0Var6.c.g3.O(true);
                                    s0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o12);
                    c51Var5.U();
                    arrayList4.add(o41.B(-4, null));
                    arrayList4.add(o41.B(-5, null));
                    arrayList4.add(o41.B(-6, null));
                    arrayList4.add(o41.B(-7, null));
                    break;
                }
                break;
            case 11:
                kg.u0.Z((kg.u0) this.b, (ArrayList) obj, (c51) obj2);
                break;
            case 12:
                kg.c1 c1Var = (kg.c1) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                String N06 = hd.N0(2131752686, null);
                String N07 = hd.N0(2131752680, null);
                o41 o41Var5 = new o41(2);
                o41Var5.m = N06;
                o41Var5.p = N07;
                o41Var5.k = R.raw.biz_map;
                arrayList5.add(o41Var5);
                arrayList5.add(o41.k(c1Var.d));
                arrayList5.add(o41.C(null));
                o41 i25 = o41.i(1, hd.N0(2131752679, null));
                i25.L(c1Var.x != null);
                arrayList5.add(i25);
                if (c1Var.x != null) {
                    arrayList5.add(o41.k(c1Var.f));
                }
                arrayList5.add(o41.C(null));
                if (c1Var.w != null && (c1Var.x != null || !TextUtils.isEmpty(c1Var.y))) {
                    z12 = true;
                }
                c1Var.G = z12;
                if (z12) {
                    o41 e10 = o41.e(2, hd.N0(2131752684, null));
                    e10.s = true;
                    arrayList5.add(e10);
                    arrayList5.add(o41.C(null));
                }
                c1Var.Z(true);
                break;
            case 13:
                kg.e1.a0((kg.e1) this.b, (ArrayList) obj);
                break;
            case 14:
                kg.g1 g1Var = (kg.g1) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = g1Var.b;
                String str10 = null;
                String N08 = hd.N0(2131752740, null);
                o41 o41Var6 = new o41(9);
                o41Var6.d = -1;
                o41Var6.m = N08;
                o41Var6.L(g1Var.r);
                arrayList6.add(o41Var6);
                arrayList6.add(o41.C(null));
                if (g1Var.r) {
                    while (i13 < arrayList7.size()) {
                        if (i13 > 0) {
                            arrayList6.add(o41.C(str10));
                        }
                        kg.d1 d1Var = (kg.d1) arrayList7.get(i13);
                        if (g1Var.Z()) {
                            str6 = null;
                        } else {
                            int i26 = i13 * 3;
                            str6 = null;
                            arrayList6.add(o41.f(hd.N0(2131752739, null), kg.d1.a(d1Var.a), i26));
                            arrayList6.add(o41.f(hd.N0(2131752745, null), kg.d1.a(d1Var.b), i26 + 1));
                            o41 e11 = o41.e(i26 + 2, hd.N0(2131746125, null));
                            e11.s = true;
                            arrayList6.add(e11);
                        }
                        i13++;
                        str10 = str6;
                    }
                    String str11 = str10;
                    if (g1Var.a0()) {
                        arrayList6.add(o41.C(str11));
                        o41 c10 = o41.c(-2, R.drawable.menu_premium_clock_add, hd.N0(2131752746, str11));
                        c10.r = true;
                        arrayList6.add(c10);
                    }
                    arrayList6.add(o41.C(hd.N0(2131752741, str11)));
                    break;
                }
                break;
            case 15:
                kg.y1.a0((kg.y1) this.b, (ArrayList) obj, (c51) obj2);
                break;
            case 16:
                ((ki.j) this.b).H0((ArrayList) obj, (c51) obj2);
                break;
            case 17:
                ki.q.Z((ki.q) this.b, (ArrayList) obj);
                break;
            case 18:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.b;
                String str12 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb5 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb5.append("~");
                    sb5.append(org.telegram.messenger.g0.i0(l10.longValue(), false, false));
                }
                if (str12 == null) {
                    upperCase = null;
                } else {
                    if (!str12.isEmpty()) {
                        switch (str12) {
                            case "application/epub+zip":
                                str7 = "epub";
                                break;
                            case "application/vnd.oasis.opendocument.text":
                                str7 = "odt";
                                break;
                            case "video/3gpp":
                            case "audio/3gpp":
                                str7 = "3gp";
                                break;
                            case "application/vnd.ms-fontobject":
                                str7 = "eot";
                                break;
                            case "application/x-cdf":
                                str7 = "cda";
                                break;
                            case "application/x-csh":
                                str7 = "csh";
                                break;
                            case "video/x-msvideo":
                                str7 = "avi";
                                break;
                            case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
                                str7 = "pptx";
                                break;
                            case "application/vnd.ms-powerpoint":
                                str7 = "ppt";
                                break;
                            case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
                                str7 = "docx";
                                break;
                            case "audio/x-midi":
                                str7 = "midi";
                                break;
                            case "text/calendar":
                                str7 = "ics";
                                break;
                            case "application/x-httpd-php":
                                str7 = "php";
                                break;
                            case "audio/3gpp2":
                            case "video/3gpp2":
                                str7 = "3g2";
                                break;
                            case "application/vnd.apple.installer+xml":
                                str7 = "mpkg";
                                break;
                            case "application/vnd.ms-excel":
                                str7 = "xls";
                                break;
                            case "application/gzip":
                            case "application/x-gzip":
                                str7 = "gz";
                                break;
                            case "application/x-sh":
                                str7 = "sh";
                                break;
                            case "audio/ogg":
                                str7 = "opus";
                                break;
                            case "text/plain":
                                str7 = "txt";
                                break;
                            case "application/x-abiword":
                                str7 = "abw";
                                break;
                            case "application/ld+json":
                                str7 = "jsonld";
                                break;
                            case "application/msword":
                                str7 = "doc";
                                break;
                            case "application/x-bzip":
                                str7 = "bz";
                                break;
                            case "application/octet-stream":
                                str7 = "bin";
                                break;
                            case "application/x-bzip2":
                                str7 = "bz2";
                                break;
                            case "application/vnd.oasis.opendocument.presentation":
                                str7 = "odp";
                                break;
                            case "application/x-7z-compressed":
                                str7 = "7z";
                                break;
                            case "application/x-freearc":
                                str7 = "arc";
                                break;
                            case "audio/mpeg":
                                str7 = "mp3";
                                break;
                            case "application/vnd.rar":
                                str7 = "rar";
                                break;
                            case "image/vnd.microsoft.icon":
                                str7 = "ico";
                                break;
                            case "application/vnd.oasis.opendocument.spreadsheet":
                                str7 = "ods";
                                break;
                            case "application/vnd.amazon.ebook":
                                str7 = "azw";
                                break;
                            case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                                str7 = "xlsx";
                                break;
                            case "application/java-archive":
                                str7 = "jar";
                                break;
                            case "text/javascript":
                                str7 = "js";
                                break;
                            default:
                                if (str12.contains("/")) {
                                    str12 = str12.substring(str12.indexOf("/") + 1);
                                }
                                if (str12.contains("-")) {
                                    str12 = str12.substring(str12.indexOf("-") + 1);
                                }
                                if (str12.contains("+")) {
                                    str12 = str12.substring(0, str12.indexOf("+"));
                                }
                                str7 = str12.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str7.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb5.length() > 0) {
                        sb5.append(" ");
                    }
                    sb5.append(upperCase.toUpperCase());
                }
                if (sb5.length() <= 0) {
                    sb5.append(hd.N0(2131753972, null));
                }
                o6Var.setText(sb5);
                break;
            case 19:
                ki.g1 g1Var2 = (ki.g1) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(o41.j(-1, g1Var2.W1));
                arrayList8.add(o41.C(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752968, g1Var2.U1))));
                break;
            case 20:
                ki.s2 s2Var = (ki.s2) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    s2Var.getClass();
                    break;
                } else {
                    ki.e4 e4Var = s2Var.x0;
                    if (e4Var != null) {
                        e4Var.a(tL_webViewResultUrl);
                        s2Var.s();
                        break;
                    }
                }
                break;
            case 21:
                ((ki.h3) this.b).I0((ArrayList) obj, (c51) obj2);
                break;
            case 22:
                ((ki.d4) this.b).Z((ArrayList) obj, (c51) obj2);
                break;
            case 23:
                ((li.s) this.b).w.c((ArrayList) obj);
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                ((ArrayList) obj).add(o41.j(0, ((ni.b) this.b).T1));
                break;
            case 26:
                Utilities.i.c(new ji.i(i11, (String[]) this.b, (r10) obj2));
                break;
            case 27:
                oi.v vVar = (oi.v) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(o41.j(1, vVar.W1));
                arrayList9.add(o41.j(3, vVar.Z1));
                if (vVar.e2 != null) {
                    arrayList9.add(o41.j(2, vVar.X1));
                    break;
                }
                break;
            case 28:
                oi.t3.L1((oi.t3[]) this.b, (ArrayList) obj, (c51) obj2);
                break;
            default:
                oi.t3 t3Var = (oi.t3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = t3Var.t3;
                ArrayList arrayList12 = new ArrayList(arrayList10.size());
                int size = arrayList10.size();
                int i27 = 0;
                while (i27 < size) {
                    Object obj3 = arrayList10.get(i27);
                    i27++;
                    Object obj4 = ((o41) obj3).H;
                    if (obj4 instanceof oi.a) {
                        arrayList12.add((oi.a) obj4);
                    }
                }
                if (arrayList12.size() >= 2) {
                    ArrayList arrayList13 = new ArrayList();
                    int size2 = arrayList12.size();
                    int i28 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i29 = 0;
                    int i30 = 0;
                    while (i30 < size2) {
                        Object obj5 = arrayList12.get(i30);
                        i30++;
                        oi.a aVar = (oi.a) obj5;
                        int indexOf = arrayList11.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i31 = indexOf + 1;
                            if (oi.t3.A3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int S3 = t3Var.S3(indexOf);
                                i31 = S3 >= arrayList11.size() ? arrayList11.size() : S3 + 1;
                            }
                            arrayList13.add(new ArrayList(arrayList11.subList(indexOf, i31)));
                            i28 = Math.min(i28, indexOf);
                            i29 += i31 - indexOf;
                        }
                    }
                    if (i29 == r6 - i28) {
                        ArrayList arrayList14 = new ArrayList(i29);
                        int size3 = arrayList13.size();
                        int i32 = 0;
                        while (i32 < size3) {
                            Object obj6 = arrayList13.get(i32);
                            i32++;
                            arrayList14.addAll((ArrayList) obj6);
                        }
                        for (int i33 = 0; i33 < arrayList14.size(); i33++) {
                            if (arrayList11.get(i28 + i33) != arrayList14.get(i33)) {
                                oi.g2 g2Var2 = t3Var.R3;
                                if (g2Var2 != null) {
                                    g2Var2.d();
                                }
                                for (int i34 = 0; i34 < arrayList14.size(); i34++) {
                                    arrayList11.set(i28 + i34, (oi.a) arrayList14.get(i34));
                                }
                                oi.a aVar2 = t3Var.a4;
                                ArrayList arrayList15 = oi.t3.A4;
                                if (aVar2 != null) {
                                    ArrayList arrayList16 = aVar2.k;
                                    int indexOf2 = arrayList11.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList17 = indexOf2 > 0 ? ((oi.a) arrayList11.get(indexOf2 - 1)).k : arrayList15;
                                        int i35 = indexOf2 + 1;
                                        if (i35 < arrayList11.size()) {
                                            arrayList15 = ((oi.a) arrayList11.get(i35)).k;
                                        }
                                        if (arrayList17.size() < arrayList15.size()) {
                                            arrayList17 = arrayList15;
                                        }
                                        if (!arrayList16.equals(arrayList17)) {
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList17);
                                            z11 = true;
                                            boolean A2 = t3Var.A2();
                                            i10 = 0;
                                            while (i10 < arrayList11.size()) {
                                                oi.a aVar3 = (oi.a) arrayList11.get(i10);
                                                if (!aVar3.i && !oi.t3.A3(aVar3)) {
                                                    oi.a aVar4 = i10 > 0 ? (oi.a) arrayList11.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (oi.t3.H3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i36 = max + 1;
                                                        if (aVar3.c > i36) {
                                                            aVar3.c = i36;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i10++;
                                            }
                                            t3Var.v4();
                                            t3Var.d2();
                                            if (!z11 || A2) {
                                                t3Var.g3.O(true);
                                                t3Var.A4();
                                            } else {
                                                t3Var.A4();
                                            }
                                            g2Var = t3Var.R3;
                                            if (g2Var == null) {
                                                g2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                boolean A22 = t3Var.A2();
                                i10 = 0;
                                while (i10 < arrayList11.size()) {
                                }
                                t3Var.v4();
                                t3Var.d2();
                                if (z11) {
                                }
                                t3Var.g3.O(true);
                                t3Var.A4();
                                g2Var = t3Var.R3;
                                if (g2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
