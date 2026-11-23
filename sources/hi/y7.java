package hi;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xz;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ni.a aVar = (ni.a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(n41.E(0, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(n41.j(1, aVar.V1));
        arrayList.add(n41.E(2, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(n41.t(3, gd.N0(2131751935, null)));
        aVar.Y1 = arrayList.size();
        String N0 = gd.N0(2131751934, null);
        boolean z10 = aVar.X1;
        n41 y10 = n41.y(ks.h2, N0, gd.N0(z10 ? 2131751933 : 2131751932, null));
        y10.L(true ^ aVar.U1);
        arrayList.add(y10);
        n41 y11 = n41.y(ks.g2, gd.N0(2131751938, null), gd.N0(z10 ? 2131751937 : 2131751936, null));
        y11.L(aVar.U1);
        arrayList.add(y11);
        arrayList.add(n41.B(6, gd.N0(2131751939, null)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        long j3;
        long j10;
        TL_stars.StarsAmount starsAmount;
        String str;
        boolean z10;
        b51 b51Var;
        String str2;
        int i7;
        String str3;
        int i10;
        String str4;
        int i11;
        String str5;
        String str6;
        String str7;
        String str8;
        String upperCase;
        char c10;
        Object[] objArr;
        int i12;
        oi.g2 g2Var;
        String str9 = "";
        int i13 = 9;
        int i14 = -1;
        boolean z11 = false;
        int i15 = 0;
        z11 = false;
        int i16 = 1;
        switch (this.a) {
            case 0:
                f8 f8Var = (f8) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (f8Var.d2 || f8Var.c2 != null) {
                    TLRPC.WebPage webPage = f8Var.c2;
                    z7 z7Var = new z7(f8Var, 0);
                    int i17 = d8.b;
                    n41 K = n41.K(d8.class);
                    K.H = webPage;
                    K.E = z7Var;
                    arrayList.add(K);
                }
                arrayList.add(n41.k(f8Var.U1));
                arrayList.add(n41.B(1, null));
                n41 i18 = n41.i(2, gd.N0(2131744393, null));
                i18.L(f8Var.i2);
                arrayList.add(i18);
                if (f8Var.i2) {
                    arrayList.add(n41.k(f8Var.V1));
                }
                arrayList.add(n41.B(3, null));
                arrayList.add(n41.k(f8Var.W1));
                break;
            case 1:
                nb nbVar = (nb) this.b;
                Float f10 = (Float) obj2;
                long duration = nbVar.Y0.getDuration() < 100 ? nbVar.L1.h0 : nbVar.Y0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                x7 x7Var = nbVar.L1;
                float f11 = x7Var.a0;
                float f12 = x7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j11 = (long) (f13 * f14);
                bb bbVar = nbVar.Y0;
                long j12 = (long) ((f12 * f14) + j11);
                nbVar.N1 = j12;
                bbVar.m(j12);
                pa paVar = nbVar.w1;
                if (paVar != null) {
                    paVar.setCoverTime(nbVar.N1);
                }
                x7 x7Var2 = nbVar.L1;
                if (x7Var2 != null && x7Var2.g) {
                    x7Var2.j = true;
                    break;
                }
                break;
            case 2:
                ((qb) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 3:
                bi.x4 x4Var = (bi.x4) this.b;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null || !tL_starsRevenueStatus.withdrawal_enabled) {
                    j3 = 0;
                    j10 = 0;
                } else {
                    j3 = starsAmount.amount;
                    j10 = 0;
                }
                x4Var.a(Long.valueOf(Math.max(j10, j3)), tL_error);
                break;
            case 4:
                ((ii.t) this.b).E0((ArrayList) obj, (b51) obj2);
                break;
            case 5:
                ii.s sVar = (ii.s) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(n41.k(sVar.U1));
                arrayList2.add(n41.k(sVar.V1));
                break;
            case 6:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                mm0 mm0Var = (mm0) ((jg.h0) this.b);
                bx bxVar = mm0Var.J0;
                org.telegram.messenger.g0.v1(bxVar.getParentActivity().getCurrentFocus());
                x60 J = x60.J(bxVar, (org.telegram.ui.Cells.g6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                    str = null;
                } else {
                    x60 K2 = J.K();
                    K2.c(R.drawable.ic_ab_back, gd.N0(2131753753, null), new eb0(J, 23), false);
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
                    J.c(R.drawable.msg_channel, gd.N0(2131745007, null), new bi.a6(J, K2, i13), false);
                }
                J.c(R.drawable.msg_info, gd.N0(2131754943, str), new xz(mm0Var, bxVar, (Object) mm0Var.K0, J, 6), z10);
                J.c(R.drawable.msg_block2, gd.N0(2131746038, str), new xz(mm0Var, bxVar, (Object) tL_sponsoredPeer, J, 7), z10);
                J.k();
                J.c(R.drawable.msg_cancel, gd.N0(2131746124, str), new org.telegram.ui.Cells.fa(mm0Var, bxVar, J, 25), z10);
                J.W(gd.a0 ? 3 : 5);
                J.b0 = true;
                J.t = z10;
                J.a0();
                break;
            case 7:
                kg.c.Z((kg.c) this.b, (ArrayList) obj, (b51) obj2);
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
                bi.i6 i6Var = nVar.a;
                if (i6Var != null && (b51Var = i6Var.g3) != null) {
                    b51Var.O(true);
                    break;
                }
                break;
            case 9:
                kg.k0 k0Var = (kg.k0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                b51 b51Var2 = (b51) obj2;
                b51Var2.G = 1;
                arrayList3.add(n41.l(-5, k0Var.W1));
                TL_account.TL_connectedBot tL_connectedBot = k0Var.T1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str2 = null;
                        i5.c.s(2131745363, null, arrayList3);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(n41.f(gd.N0(2131745360, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i7 = 2;
                            arrayList3.add(n41.f(gd.N0(2131745359, null), tL_connectedBot.location, 2));
                        } else {
                            i7 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i7)) {
                            arrayList3.add(n41.f(gd.N0(2131745361, null), gd.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(n41.C(null));
                    } else {
                        str2 = null;
                    }
                    b51Var2.V();
                    arrayList3.add(n41.u(gd.N0(2131752807, str2)));
                    int i19 = kg.k0.g2;
                    n41 x10 = n41.x(-1, gd.N0(2131752769, str2));
                    x10.L(k0Var.b2);
                    arrayList3.add(x10);
                    int i20 = kg.k0.h2;
                    n41 x11 = n41.x(-2, gd.N0(2131752764, str2));
                    x11.L(!k0Var.b2);
                    arrayList3.add(x11);
                    b51Var2.U();
                    arrayList3.add(n41.C(str2));
                    kg.b0 b0Var = k0Var.V1;
                    if (b0Var != null) {
                        b0Var.a(arrayList3, b51Var2, true);
                    }
                    arrayList3.add(n41.C(gd.N0(2131752806, str2)));
                    break;
                }
                break;
            case 10:
                final kg.s0 s0Var = (kg.s0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                LongSparseArray longSparseArray = s0Var.O;
                String N0 = gd.N0(2131752771, null);
                String N02 = gd.N0(2131752770, null);
                n41 n41Var = new n41(2);
                n41Var.m = N0;
                n41Var.p = N02;
                n41Var.n = "tg_superplaceholders_android_2";
                n41Var.o = "🤖🏝️";
                n41Var.A = 120;
                arrayList4.add(n41Var);
                if (s0Var.N != null) {
                    b51Var3.V();
                    long j13 = s0Var.N.id;
                    n41 n41Var2 = new n41(13);
                    n41Var2.y = j13;
                    n41Var2.L(true);
                    final int i21 = z11 ? 1 : 0;
                    n41Var2.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
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
                    arrayList4.add(n41Var2);
                    b51Var3.U();
                    str3 = "";
                    i10 = 1;
                } else {
                    b51Var3.V();
                    arrayList4.add(n41.k(s0Var.e));
                    longSparseArray.clear();
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < s0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) s0Var.d.d.get(i22);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str4 = str9;
                                long j14 = user.id;
                                String str10 = s0Var.E;
                                i11 = i16;
                                n41 n41Var3 = new n41(13);
                                n41Var3.y = j14;
                                n41Var3.o = str10;
                                arrayList4.add(n41Var3);
                                longSparseArray.put(user.id, user);
                                i23 = i11;
                                i22++;
                                str9 = str4;
                                i16 = i11;
                            }
                        }
                        str4 = str9;
                        i11 = i16;
                        i22++;
                        str9 = str4;
                        i16 = i11;
                    }
                    str3 = str9;
                    i10 = i16;
                    for (int i24 = 0; i24 < s0Var.d.e.size(); i24++) {
                        TLObject tLObject2 = (TLObject) s0Var.d.e.get(i24);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j15 = user2.id;
                                String str11 = s0Var.E;
                                n41 n41Var4 = new n41(13);
                                n41Var4.y = j15;
                                n41Var4.o = str11;
                                arrayList4.add(n41Var4);
                                longSparseArray.put(user2.id, user2);
                                i23 = i10;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(s0Var.f.getText().toString()) || s0Var.d.e() || s0Var.y)) {
                        arrayList4.add(n41.k(s0Var.n));
                        i23 = i10;
                    }
                    s0Var.h.setVisibility(i23 != 0 ? 0 : 8);
                    b51Var3.U();
                }
                arrayList4.add(n41.C(gd.N0(2131752803, null)));
                b51Var3.V();
                n41 u10 = n41.u(gd.N0(2131752807, null));
                u10.g = s0Var.N != null ? i10 : 0;
                arrayList4.add(u10);
                n41 x12 = n41.x(-1, gd.N0(2131752769, null));
                x12.L(s0Var.J);
                x12.g = s0Var.N != null ? i10 : 0;
                arrayList4.add(x12);
                n41 x13 = n41.x(-2, gd.N0(2131752764, null));
                x13.L(!s0Var.J);
                x13.g = s0Var.N != null ? i10 : 0;
                arrayList4.add(x13);
                b51Var3.U();
                arrayList4.add(n41.C(null));
                s0Var.w.a(arrayList4, b51Var3, s0Var.N != null ? i10 : 0);
                arrayList4.add(n41.C(gd.N0(2131752806, null)));
                if (s0Var.N != null) {
                    b51Var3.V();
                    arrayList4.add(n41.u(gd.N0(2131752796, null)));
                    String N03 = gd.N0(2131752783, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = s0Var.K;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    n41 o4 = n41.o(-4, N03, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var.K;
                    o4.L((tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) ? i10 : 0);
                    o4.f = !s0Var.Q;
                    boolean z12 = i10;
                    final int i25 = z12 ? 1 : 0;
                    o4.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
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
                        str5 = null;
                        n41 z13 = n41.z(-5, gd.N0(2131752785, null));
                        z13.L(z12);
                        z13.g = false;
                        z13.i = z12 ? 1 : 0;
                        arrayList4.add(z13);
                        n41 z14 = n41.z(-6, gd.N0(2131752784, null));
                        z14.L(s0Var.K.reply);
                        z14.i = z12 ? 1 : 0;
                        arrayList4.add(z14);
                        n41 z15 = n41.z(-7, gd.N0(2131752786, null));
                        z15.L(s0Var.K.read_messages);
                        z15.i = z12 ? 1 : 0;
                        arrayList4.add(z15);
                        n41 z16 = n41.z(-8, gd.N0(2131752787, null));
                        z16.L(s0Var.K.delete_sent_messages);
                        z16.i = z12 ? 1 : 0;
                        arrayList4.add(z16);
                        n41 z17 = n41.z(-9, gd.N0(2131752788, null));
                        z17.L(s0Var.K.delete_received_messages);
                        z17.i = z12 ? 1 : 0;
                        arrayList4.add(z17);
                    } else {
                        str5 = null;
                    }
                    String N04 = gd.N0(2131752779, str5);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var.K;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    n41 o10 = n41.o(-10, N04, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = s0Var.K;
                    o10.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o10.f = !s0Var.R;
                    final int i26 = 2;
                    o10.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
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
                        str6 = null;
                        n41 z18 = n41.z(-11, gd.N0(2131752781, null));
                        z18.L(s0Var.K.edit_name);
                        z18.i = 1;
                        arrayList4.add(z18);
                        n41 z19 = n41.z(-12, gd.N0(2131752782, null));
                        z19.L(s0Var.K.edit_bio);
                        z19.i = 1;
                        arrayList4.add(z19);
                        n41 z20 = n41.z(-13, gd.N0(2131752780, null));
                        z20.L(s0Var.K.edit_profile_photo);
                        z20.i = 1;
                        arrayList4.add(z20);
                        n41 z21 = n41.z(-14, gd.N0(2131752778, null));
                        z21.L(s0Var.K.edit_username);
                        z21.i = 1;
                        arrayList4.add(z21);
                    } else {
                        str6 = null;
                    }
                    String N05 = gd.N0(2131752795, str6);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = s0Var.K;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    n41 o11 = n41.o(-15, N05, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = s0Var.K;
                    o11.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o11.f = !s0Var.S;
                    final int i27 = 3;
                    o11.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
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
                        str7 = null;
                        n41 z22 = n41.z(-16, gd.N0(2131752790, null));
                        z22.L(s0Var.K.view_gifts);
                        z22.i = 1;
                        arrayList4.add(z22);
                        n41 z23 = n41.z(-17, gd.N0(2131752794, null));
                        z23.L(s0Var.K.sell_gifts);
                        z23.i = 1;
                        arrayList4.add(z23);
                        n41 z24 = n41.z(-18, gd.N0(2131752793, null));
                        z24.L(s0Var.K.change_gift_settings);
                        z24.i = 1;
                        arrayList4.add(z24);
                        n41 z25 = n41.z(-19, gd.N0(2131752792, null));
                        z25.L(s0Var.K.transfer_and_upgrade_gifts);
                        z25.i = 1;
                        arrayList4.add(z25);
                        n41 z26 = n41.z(-20, gd.N0(2131752791, null));
                        z26.L(s0Var.K.transfer_stars);
                        z26.i = 1;
                        arrayList4.add(z26);
                    } else {
                        str7 = null;
                    }
                    n41 o12 = n41.o(-21, gd.N0(2131752777, str7), str3);
                    o12.L(s0Var.K.manage_stories);
                    final int i28 = 4;
                    o12.E = new View.OnClickListener() { // from class: kg.o0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i28) {
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
                    b51Var3.U();
                    arrayList4.add(n41.B(-4, str7));
                    arrayList4.add(n41.B(-5, str7));
                    arrayList4.add(n41.B(-6, str7));
                    arrayList4.add(n41.B(-7, str7));
                    break;
                }
                break;
            case 11:
                kg.u0.Z((kg.u0) this.b, (ArrayList) obj, (b51) obj2);
                break;
            case 12:
                kg.c1 c1Var = (kg.c1) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                String N06 = gd.N0(2131752686, null);
                String N07 = gd.N0(2131752680, null);
                n41 n41Var5 = new n41(2);
                n41Var5.m = N06;
                n41Var5.p = N07;
                n41Var5.k = R.raw.biz_map;
                arrayList5.add(n41Var5);
                arrayList5.add(n41.k(c1Var.d));
                arrayList5.add(n41.C(null));
                n41 i29 = n41.i(1, gd.N0(2131752679, null));
                i29.L(c1Var.x != null);
                arrayList5.add(i29);
                if (c1Var.x != null) {
                    arrayList5.add(n41.k(c1Var.f));
                }
                arrayList5.add(n41.C(null));
                if (c1Var.w != null && (c1Var.x != null || !TextUtils.isEmpty(c1Var.y))) {
                    z11 = true;
                }
                c1Var.G = z11;
                if (z11) {
                    n41 e10 = n41.e(2, gd.N0(2131752684, null));
                    e10.s = true;
                    arrayList5.add(e10);
                    arrayList5.add(n41.C(null));
                }
                c1Var.Z(true);
                break;
            case 13:
                kg.e1.a0((kg.e1) this.b, (ArrayList) obj);
                break;
            case 14:
                kg.h1 h1Var = (kg.h1) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = h1Var.b;
                String str12 = null;
                String N08 = gd.N0(2131752740, null);
                n41 n41Var6 = new n41(9);
                n41Var6.d = -1;
                n41Var6.m = N08;
                n41Var6.L(h1Var.r);
                arrayList6.add(n41Var6);
                arrayList6.add(n41.C(null));
                if (h1Var.r) {
                    while (i15 < arrayList7.size()) {
                        if (i15 > 0) {
                            arrayList6.add(n41.C(str12));
                        }
                        kg.d1 d1Var = (kg.d1) arrayList7.get(i15);
                        if (h1Var.Z()) {
                            str8 = null;
                        } else {
                            int i30 = i15 * 3;
                            str8 = null;
                            arrayList6.add(n41.f(gd.N0(2131752739, null), kg.d1.a(d1Var.a), i30));
                            arrayList6.add(n41.f(gd.N0(2131752745, null), kg.d1.a(d1Var.b), i30 + 1));
                            n41 e11 = n41.e(i30 + 2, gd.N0(2131746125, null));
                            e11.s = true;
                            arrayList6.add(e11);
                        }
                        i15++;
                        str12 = str8;
                    }
                    String str13 = str12;
                    if (h1Var.a0()) {
                        arrayList6.add(n41.C(str13));
                        n41 c11 = n41.c(-2, R.drawable.menu_premium_clock_add, gd.N0(2131752746, str13));
                        c11.r = true;
                        arrayList6.add(c11);
                    }
                    arrayList6.add(n41.C(gd.N0(2131752741, str13)));
                    break;
                }
                break;
            case 15:
                kg.y1.a0((kg.y1) this.b, (ArrayList) obj, (b51) obj2);
                break;
            case 16:
                ((ki.j) this.b).H0((ArrayList) obj, (b51) obj2);
                break;
            case 17:
                ki.q.Z((ki.q) this.b, (ArrayList) obj);
                break;
            case 18:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
                String str14 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb5 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb5.append("~");
                    sb5.append(org.telegram.messenger.g0.i0(l10.longValue(), false, false));
                }
                if (str14 == null) {
                    upperCase = null;
                } else {
                    if (!str14.isEmpty()) {
                        switch (str14.hashCode()) {
                            case -2008589971:
                                if (str14.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str14.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str14.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str14.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str14.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str14.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str14.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str14.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str14.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str14.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str14.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str14.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str14.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str14.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str14.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str14.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str14.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str14.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str14.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str14.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str14.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str14.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str14.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str14.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str14.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str14.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str14.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str14.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str14.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str14.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str14.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str14.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                if (str14.equals("audio/mpeg")) {
                                    c10 = ' ';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1509238306:
                                if (str14.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str14.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str14.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str14.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str14.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str14.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str14.equals("text/javascript")) {
                                    c10 = '\'';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                str9 = "epub";
                                break;
                            case 1:
                                str9 = "odt";
                                break;
                            case 2:
                            case ks.U /* 31 */:
                                str9 = "3gp";
                                break;
                            case 3:
                                str9 = "eot";
                                break;
                            case 4:
                                str9 = "cda";
                                break;
                            case 5:
                                str9 = "csh";
                                break;
                            case 6:
                                str9 = "avi";
                                break;
                            case 7:
                                str9 = "pptx";
                                break;
                            case '\b':
                                str9 = "ppt";
                                break;
                            case '\t':
                                str9 = "docx";
                                break;
                            case '\n':
                                str9 = "midi";
                                break;
                            case 11:
                                str9 = "ics";
                                break;
                            case '\f':
                                str9 = "php";
                                break;
                            case '\r':
                            case 16:
                                str9 = "3g2";
                                break;
                            case 14:
                                str9 = "mpkg";
                                break;
                            case 15:
                                str9 = "xls";
                                break;
                            case 17:
                            case 25:
                                str9 = "gz";
                                break;
                            case 18:
                                str9 = "sh";
                                break;
                            case 19:
                                str9 = "opus";
                                break;
                            case 20:
                                str9 = "txt";
                                break;
                            case 21:
                                str9 = "abw";
                                break;
                            case 22:
                                str9 = "jsonld";
                                break;
                            case 23:
                                str9 = "doc";
                                break;
                            case 24:
                                str9 = "bz";
                                break;
                            case 26:
                                str9 = "bin";
                                break;
                            case 27:
                                str9 = "bz2";
                                break;
                            case 28:
                                str9 = "odp";
                                break;
                            case 29:
                                str9 = "7z";
                                break;
                            case ks.T /* 30 */:
                                str9 = "arc";
                                break;
                            case ' ':
                                str9 = "mp3";
                                break;
                            case '!':
                                str9 = "rar";
                                break;
                            case '\"':
                                str9 = "ico";
                                break;
                            case '#':
                                str9 = "ods";
                                break;
                            case '$':
                                str9 = "azw";
                                break;
                            case '%':
                                str9 = "xlsx";
                                break;
                            case '&':
                                str9 = "jar";
                                break;
                            case '\'':
                                str9 = "js";
                                break;
                            default:
                                if (str14.contains("/")) {
                                    str14 = str14.substring(str14.indexOf("/") + 1);
                                }
                                if (str14.contains("-")) {
                                    str14 = str14.substring(str14.indexOf("-") + 1);
                                }
                                if (str14.contains("+")) {
                                    str14 = str14.substring(0, str14.indexOf("+"));
                                }
                                str9 = str14.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str9.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb5.length() > 0) {
                        sb5.append(" ");
                    }
                    sb5.append(upperCase.toUpperCase());
                }
                if (sb5.length() <= 0) {
                    sb5.append(gd.N0(2131753972, null));
                }
                n6Var.setText(sb5);
                break;
            case 19:
                ki.g1 g1Var = (ki.g1) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(n41.j(-1, g1Var.W1));
                arrayList8.add(n41.C(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752968, g1Var.U1))));
                break;
            case 20:
                ki.t2 t2Var = (ki.t2) this.b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    t2Var.getClass();
                    break;
                } else {
                    ki.f4 f4Var = t2Var.x0;
                    if (f4Var != null) {
                        f4Var.a(tL_webViewResultUrl);
                        t2Var.s();
                        break;
                    }
                }
                break;
            case 21:
                ((ki.i3) this.b).I0((ArrayList) obj, (b51) obj2);
                break;
            case 22:
                ((ki.e4) this.b).Z((ArrayList) obj, (b51) obj2);
                break;
            case 23:
                ((li.r) this.b).w.c((ArrayList) obj);
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                ((ArrayList) obj).add(n41.j(0, ((ni.b) this.b).T1));
                break;
            case 26:
                Utilities.i.c(new n2.c0(i16, (String[]) this.b, (p10) obj2));
                break;
            case 27:
                oi.v vVar = (oi.v) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(n41.j(1, vVar.W1));
                arrayList9.add(n41.j(3, vVar.Z1));
                if (vVar.e2 != null) {
                    arrayList9.add(n41.j(2, vVar.X1));
                    break;
                }
                break;
            case 28:
                oi.t3.L1((oi.t3[]) this.b, (ArrayList) obj, (b51) obj2);
                break;
            default:
                oi.t3 t3Var = (oi.t3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = t3Var.t3;
                ArrayList arrayList12 = new ArrayList(arrayList10.size());
                int size = arrayList10.size();
                int i31 = 0;
                while (i31 < size) {
                    Object obj3 = arrayList10.get(i31);
                    i31++;
                    Object obj4 = ((n41) obj3).H;
                    if (obj4 instanceof oi.a) {
                        arrayList12.add((oi.a) obj4);
                    }
                }
                if (arrayList12.size() >= 2) {
                    ArrayList arrayList13 = new ArrayList();
                    int size2 = arrayList12.size();
                    int i32 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i33 = 0;
                    int i34 = 0;
                    while (i34 < size2) {
                        Object obj5 = arrayList12.get(i34);
                        i34++;
                        oi.a aVar = (oi.a) obj5;
                        int indexOf = arrayList11.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i35 = indexOf + 1;
                            if (oi.t3.A3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int S3 = t3Var.S3(indexOf);
                                i35 = S3 >= arrayList11.size() ? arrayList11.size() : S3 + 1;
                            }
                            arrayList13.add(new ArrayList(arrayList11.subList(indexOf, i35)));
                            i32 = Math.min(i32, indexOf);
                            i14 = Math.max(i14, i35);
                            i33 += i35 - indexOf;
                        }
                    }
                    if (i33 == i14 - i32) {
                        ArrayList arrayList14 = new ArrayList(i33);
                        int size3 = arrayList13.size();
                        int i36 = 0;
                        while (i36 < size3) {
                            Object obj6 = arrayList13.get(i36);
                            i36++;
                            arrayList14.addAll((ArrayList) obj6);
                        }
                        for (int i37 = 0; i37 < arrayList14.size(); i37++) {
                            if (arrayList11.get(i32 + i37) != arrayList14.get(i37)) {
                                oi.g2 g2Var2 = t3Var.R3;
                                if (g2Var2 != null) {
                                    g2Var2.d();
                                }
                                for (int i38 = 0; i38 < arrayList14.size(); i38++) {
                                    arrayList11.set(i32 + i38, (oi.a) arrayList14.get(i38));
                                }
                                oi.a aVar2 = t3Var.a4;
                                ArrayList arrayList15 = oi.t3.A4;
                                if (aVar2 != null) {
                                    ArrayList arrayList16 = aVar2.k;
                                    int indexOf2 = arrayList11.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList17 = indexOf2 > 0 ? ((oi.a) arrayList11.get(indexOf2 - 1)).k : arrayList15;
                                        int i39 = indexOf2 + 1;
                                        if (i39 < arrayList11.size()) {
                                            arrayList15 = ((oi.a) arrayList11.get(i39)).k;
                                        }
                                        if (arrayList17.size() < arrayList15.size()) {
                                            arrayList17 = arrayList15;
                                        }
                                        if (!arrayList16.equals(arrayList17)) {
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList17);
                                            objArr = true;
                                            boolean A2 = t3Var.A2();
                                            i12 = 0;
                                            while (i12 < arrayList11.size()) {
                                                oi.a aVar3 = (oi.a) arrayList11.get(i12);
                                                if (!aVar3.i && !oi.t3.A3(aVar3)) {
                                                    oi.a aVar4 = i12 > 0 ? (oi.a) arrayList11.get(i12 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (oi.t3.H3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i40 = max + 1;
                                                        if (aVar3.c > i40) {
                                                            aVar3.c = i40;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i12++;
                                            }
                                            t3Var.v4();
                                            t3Var.d2();
                                            if (!objArr == true || A2) {
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
                                objArr = false;
                                boolean A22 = t3Var.A2();
                                i12 = 0;
                                while (i12 < arrayList11.size()) {
                                }
                                t3Var.v4();
                                t3Var.d2();
                                if (objArr == true) {
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
