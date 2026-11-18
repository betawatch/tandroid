package hi;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e7 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ni.a aVar = (ni.a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(l41.E(0, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(l41.j(1, aVar.V1));
        arrayList.add(l41.E(2, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(l41.t(3, gd.M0(2131751936, null)));
        aVar.Y1 = arrayList.size();
        String M0 = gd.M0(2131751935, null);
        boolean z10 = aVar.X1;
        l41 y10 = l41.y(ks.h2, M0, gd.M0(z10 ? 2131751934 : 2131751933, null));
        y10.L(true ^ aVar.U1);
        arrayList.add(y10);
        l41 y11 = l41.y(ks.g2, gd.M0(2131751939, null), gd.M0(z10 ? 2131751938 : 2131751937, null));
        y11.L(aVar.U1);
        arrayList.add(y11);
        arrayList.add(l41.B(6, gd.M0(2131751940, null)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0499, code lost:
    
        if (r3.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document") == false) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        long j3;
        long j10;
        TL_stars.StarsAmount starsAmount;
        String str;
        boolean z10;
        z41 z41Var;
        String str2;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        String str3;
        String str4;
        String str5;
        String str6;
        String upperCase;
        Object[] objArr;
        int i11;
        oi.e2 e2Var;
        String str7 = "";
        int i12 = 27;
        int i13 = 9;
        int i14 = -1;
        boolean z14 = false;
        int i15 = 0;
        z14 = false;
        boolean z15 = true;
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.b;
                ArrayList arrayList = (ArrayList) obj;
                if (l7Var.d2 || l7Var.c2 != null) {
                    TLRPC.WebPage webPage = l7Var.c2;
                    f7 f7Var = new f7(l7Var, 0);
                    int i16 = j7.b;
                    l41 K = l41.K(j7.class);
                    K.H = webPage;
                    K.E = f7Var;
                    arrayList.add(K);
                }
                arrayList.add(l41.k(l7Var.U1));
                arrayList.add(l41.B(1, null));
                l41 i17 = l41.i(2, gd.M0(2131744402, null));
                i17.L(l7Var.i2);
                arrayList.add(i17);
                if (l7Var.i2) {
                    arrayList.add(l41.k(l7Var.V1));
                }
                arrayList.add(l41.B(3, null));
                arrayList.add(l41.k(l7Var.W1));
                break;
            case 1:
                ta taVar = (ta) this.b;
                Float f10 = (Float) obj2;
                long duration = taVar.Y0.getDuration() < 100 ? taVar.L1.h0 : taVar.Y0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                d7 d7Var = taVar.L1;
                float f11 = d7Var.a0;
                float f12 = d7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j11 = (long) (f13 * f14);
                ha haVar = taVar.Y0;
                long j12 = (long) ((f12 * f14) + j11);
                taVar.N1 = j12;
                haVar.m(j12);
                v9 v9Var = taVar.w1;
                if (v9Var != null) {
                    v9Var.setCoverTime(taVar.N1);
                }
                d7 d7Var2 = taVar.L1;
                if (d7Var2 != null && d7Var2.g) {
                    d7Var2.j = true;
                    break;
                }
                break;
            case 2:
                ((wa) this.b).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 3:
                bi.q4 q4Var = (bi.q4) this.b;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null || !tL_starsRevenueStatus.withdrawal_enabled) {
                    j3 = 0;
                    j10 = 0;
                } else {
                    j3 = starsAmount.amount;
                    j10 = 0;
                }
                q4Var.a(Long.valueOf(Math.max(j10, j3)), tL_error);
                break;
            case 4:
                ((ii.t) this.b).E0((ArrayList) obj, (z41) obj2);
                break;
            case 5:
                ii.s sVar = (ii.s) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(l41.k(sVar.U1));
                arrayList2.add(l41.k(sVar.V1));
                break;
            case 6:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                km0 km0Var = (km0) ((jg.h0) this.b);
                cx cxVar = km0Var.J0;
                org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                y60 J = y60.J(cxVar, (org.telegram.ui.Cells.g6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                    str = null;
                } else {
                    y60 K2 = J.K();
                    K2.c(R.drawable.ic_ab_back, gd.M0(2131753754, null), new gb0(J, 23), false);
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
                    String M0 = gd.M0(2131745013, null);
                    bi.v5 v5Var = new bi.v5(J, K2, i13);
                    z10 = false;
                    J.c(R.drawable.msg_channel, M0, v5Var, false);
                }
                J.c(R.drawable.msg_info, gd.M0(2131754943, str), new n20(km0Var, cxVar, km0Var.K0, J, 5), z10);
                J.c(R.drawable.msg_block2, gd.M0(2131746039, str), new n20(km0Var, cxVar, tL_sponsoredPeer, J, 6), z10);
                J.k();
                J.c(R.drawable.msg_cancel, gd.M0(2131746125, str), new org.telegram.ui.Components.k7(km0Var, cxVar, J, 23), z10);
                J.W(gd.a0 ? 3 : 5);
                J.b0 = true;
                J.t = z10;
                J.a0();
                break;
            case 7:
                kg.c.Z((kg.c) this.b, (ArrayList) obj, (z41) obj2);
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
                bi.d6 d6Var = nVar.a;
                if (d6Var != null && (z41Var = d6Var.g3) != null) {
                    z41Var.O(true);
                    break;
                }
                break;
            case 9:
                kg.l0 l0Var = (kg.l0) this.b;
                ArrayList arrayList3 = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                z41Var2.G = 1;
                arrayList3.add(l41.l(-5, l0Var.W1));
                TL_account.TL_connectedBot tL_connectedBot = l0Var.T1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str2 = null;
                        i5.c.s(2131745364, null, arrayList3);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(l41.f(gd.M0(2131745361, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i7 = 2;
                            arrayList3.add(l41.f(gd.M0(2131745360, null), tL_connectedBot.location, 2));
                        } else {
                            i7 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i7)) {
                            arrayList3.add(l41.f(gd.M0(2131745362, null), gd.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(l41.C(null));
                    } else {
                        str2 = null;
                    }
                    z41Var2.V();
                    arrayList3.add(l41.u(gd.M0(2131752808, str2)));
                    int i18 = kg.l0.g2;
                    l41 x10 = l41.x(-1, gd.M0(2131752770, str2));
                    x10.L(l0Var.b2);
                    arrayList3.add(x10);
                    int i19 = kg.l0.h2;
                    l41 x11 = l41.x(-2, gd.M0(2131752765, str2));
                    x11.L(!l0Var.b2);
                    arrayList3.add(x11);
                    z41Var2.U();
                    arrayList3.add(l41.C(str2));
                    kg.a0 a0Var = l0Var.V1;
                    if (a0Var != null) {
                        a0Var.a(arrayList3, z41Var2, true);
                    }
                    arrayList3.add(l41.C(gd.M0(2131752807, str2)));
                    break;
                }
                break;
            case 10:
                final kg.t0 t0Var = (kg.t0) this.b;
                ArrayList arrayList4 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                LongSparseArray longSparseArray = t0Var.O;
                String M02 = gd.M0(2131752772, null);
                String M03 = gd.M0(2131752771, null);
                l41 l41Var = new l41(2);
                l41Var.m = M02;
                l41Var.p = M03;
                l41Var.n = "tg_superplaceholders_android_2";
                l41Var.o = "🤖🏝️";
                l41Var.A = 120;
                arrayList4.add(l41Var);
                if (t0Var.N != null) {
                    z41Var3.V();
                    long j13 = t0Var.N.id;
                    l41 l41Var2 = new l41(13);
                    l41Var2.y = j13;
                    l41Var2.L(true);
                    final int i20 = z14 ? 1 : 0;
                    l41Var2.E = new View.OnClickListener() { // from class: kg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.N = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.d0(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = t0Var3.K;
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
                                    t0Var3.d0(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var4.K;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        t0Var4.c0(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var5.K;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        t0Var5.c0(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.K.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(l41Var2);
                    z41Var3.U();
                    z11 = true;
                } else {
                    z41Var3.V();
                    arrayList4.add(l41.k(t0Var.e));
                    longSparseArray.clear();
                    int i21 = 0;
                    boolean z16 = false;
                    while (i21 < t0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) t0Var.d.d.get(i21);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                boolean z17 = z15;
                                i10 = i21;
                                long j14 = user.id;
                                String str8 = t0Var.E;
                                z13 = z17;
                                l41 l41Var3 = new l41(13);
                                l41Var3.y = j14;
                                l41Var3.o = str8;
                                arrayList4.add(l41Var3);
                                longSparseArray.put(user.id, user);
                                z16 = z13;
                                i21 = i10 + 1;
                                z15 = z13;
                            }
                        }
                        z13 = z15;
                        i10 = i21;
                        i21 = i10 + 1;
                        z15 = z13;
                    }
                    z11 = z15;
                    for (int i22 = 0; i22 < t0Var.d.e.size(); i22++) {
                        TLObject tLObject2 = (TLObject) t0Var.d.e.get(i22);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j15 = user2.id;
                                String str9 = t0Var.E;
                                l41 l41Var4 = new l41(13);
                                l41Var4.y = j15;
                                l41Var4.o = str9;
                                arrayList4.add(l41Var4);
                                longSparseArray.put(user2.id, user2);
                                z16 = z11;
                            }
                        }
                    }
                    if (longSparseArray.size() > 0 || !(!TextUtils.isEmpty(t0Var.f.getText().toString()) || t0Var.d.e() || t0Var.y)) {
                        z12 = z16;
                    } else {
                        arrayList4.add(l41.k(t0Var.n));
                        z12 = z11;
                    }
                    t0Var.h.setVisibility(z12 ? 0 : 8);
                    z41Var3.U();
                }
                arrayList4.add(l41.C(gd.M0(2131752804, null)));
                z41Var3.V();
                l41 u10 = l41.u(gd.M0(2131752808, null));
                u10.g = t0Var.N != null ? z11 : false;
                arrayList4.add(u10);
                l41 x12 = l41.x(-1, gd.M0(2131752770, null));
                x12.L(t0Var.J);
                x12.g = t0Var.N != null ? z11 : false;
                arrayList4.add(x12);
                l41 x13 = l41.x(-2, gd.M0(2131752765, null));
                x13.L(!t0Var.J);
                x13.g = t0Var.N != null ? z11 : false;
                arrayList4.add(x13);
                z41Var3.U();
                arrayList4.add(l41.C(null));
                t0Var.w.a(arrayList4, z41Var3, t0Var.N != null ? z11 : false);
                arrayList4.add(l41.C(gd.M0(2131752807, null)));
                if (t0Var.N != null) {
                    z41Var3.V();
                    arrayList4.add(l41.u(gd.M0(2131752797, null)));
                    String M04 = gd.M0(2131752784, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = t0Var.K;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    l41 o4 = l41.o(-4, M04, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.K;
                    o4.L((tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) ? z11 : false);
                    o4.f = !t0Var.Q;
                    boolean z18 = z11;
                    final int i23 = z18 ? 1 : 0;
                    o4.E = new View.OnClickListener() { // from class: kg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.N = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.d0(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var3.K;
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
                                    t0Var3.d0(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.c0(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var5.K;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        t0Var5.c0(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.K.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o4);
                    if (t0Var.Q) {
                        str3 = null;
                        l41 z19 = l41.z(-5, gd.M0(2131752786, null));
                        z19.L(z18);
                        z19.g = false;
                        z19.i = z18 ? 1 : 0;
                        arrayList4.add(z19);
                        l41 z20 = l41.z(-6, gd.M0(2131752785, null));
                        z20.L(t0Var.K.reply);
                        z20.i = z18 ? 1 : 0;
                        arrayList4.add(z20);
                        l41 z21 = l41.z(-7, gd.M0(2131752787, null));
                        z21.L(t0Var.K.read_messages);
                        z21.i = z18 ? 1 : 0;
                        arrayList4.add(z21);
                        l41 z22 = l41.z(-8, gd.M0(2131752788, null));
                        z22.L(t0Var.K.delete_sent_messages);
                        z22.i = z18 ? 1 : 0;
                        arrayList4.add(z22);
                        l41 z23 = l41.z(-9, gd.M0(2131752789, null));
                        z23.L(t0Var.K.delete_received_messages);
                        z23.i = z18 ? 1 : 0;
                        arrayList4.add(z23);
                    } else {
                        str3 = null;
                    }
                    String M05 = gd.M0(2131752780, str3);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.K;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    l41 o10 = l41.o(-10, M05, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.K;
                    o10.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o10.f = !t0Var.R;
                    final int i24 = 2;
                    o10.E = new View.OnClickListener() { // from class: kg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.N = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.d0(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var3.K;
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
                                    t0Var3.d0(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.c0(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.c0(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.K.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o10);
                    if (t0Var.R) {
                        str4 = null;
                        l41 z24 = l41.z(-11, gd.M0(2131752782, null));
                        z24.L(t0Var.K.edit_name);
                        z24.i = 1;
                        arrayList4.add(z24);
                        l41 z25 = l41.z(-12, gd.M0(2131752783, null));
                        z25.L(t0Var.K.edit_bio);
                        z25.i = 1;
                        arrayList4.add(z25);
                        l41 z26 = l41.z(-13, gd.M0(2131752781, null));
                        z26.L(t0Var.K.edit_profile_photo);
                        z26.i = 1;
                        arrayList4.add(z26);
                        l41 z27 = l41.z(-14, gd.M0(2131752779, null));
                        z27.L(t0Var.K.edit_username);
                        z27.i = 1;
                        arrayList4.add(z27);
                    } else {
                        str4 = null;
                    }
                    String M06 = gd.M0(2131752796, str4);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.K;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    l41 o11 = l41.o(-15, M06, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.K;
                    o11.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o11.f = !t0Var.S;
                    final int i25 = 3;
                    o11.E = new View.OnClickListener() { // from class: kg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.N = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.d0(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var3.K;
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
                                    t0Var3.d0(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.c0(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.c0(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.K.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o11);
                    if (t0Var.S) {
                        str5 = null;
                        l41 z28 = l41.z(-16, gd.M0(2131752791, null));
                        z28.L(t0Var.K.view_gifts);
                        z28.i = 1;
                        arrayList4.add(z28);
                        l41 z29 = l41.z(-17, gd.M0(2131752795, null));
                        z29.L(t0Var.K.sell_gifts);
                        z29.i = 1;
                        arrayList4.add(z29);
                        l41 z30 = l41.z(-18, gd.M0(2131752794, null));
                        z30.L(t0Var.K.change_gift_settings);
                        z30.i = 1;
                        arrayList4.add(z30);
                        l41 z31 = l41.z(-19, gd.M0(2131752793, null));
                        z31.L(t0Var.K.transfer_and_upgrade_gifts);
                        z31.i = 1;
                        arrayList4.add(z31);
                        l41 z32 = l41.z(-20, gd.M0(2131752792, null));
                        z32.L(t0Var.K.transfer_stars);
                        z32.i = 1;
                        arrayList4.add(z32);
                    } else {
                        str5 = null;
                    }
                    l41 o12 = l41.o(-21, gd.M0(2131752778, str5), "");
                    o12.L(t0Var.K.manage_stories);
                    final int i26 = 4;
                    o12.E = new View.OnClickListener() { // from class: kg.p0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    t0 t0Var2 = t0Var;
                                    t0Var2.N = null;
                                    t0Var2.c.g3.O(true);
                                    t0Var2.d0(true);
                                    break;
                                case 1:
                                    t0 t0Var3 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = t0Var3.K;
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
                                    t0Var3.d0(true);
                                    break;
                                case 2:
                                    t0 t0Var4 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = t0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        t0Var4.c0(-14, true, new n0(t0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        t0Var4.c.g3.O(true);
                                        t0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t0 t0Var5 = t0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = t0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        t0Var5.c0(-17, true, new n0(t0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        t0Var5.c.g3.O(true);
                                        t0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t0 t0Var6 = t0Var;
                                    t0Var6.K.manage_stories = !r0.manage_stories;
                                    t0Var6.c.g3.O(true);
                                    t0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o12);
                    z41Var3.U();
                    arrayList4.add(l41.B(-4, str5));
                    arrayList4.add(l41.B(-5, str5));
                    arrayList4.add(l41.B(-6, str5));
                    arrayList4.add(l41.B(-7, str5));
                    break;
                }
                break;
            case 11:
                kg.v0.Z((kg.v0) this.b, (ArrayList) obj, (z41) obj2);
                break;
            case 12:
                kg.d1 d1Var = (kg.d1) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                String M07 = gd.M0(2131752687, null);
                String M08 = gd.M0(2131752681, null);
                l41 l41Var5 = new l41(2);
                l41Var5.m = M07;
                l41Var5.p = M08;
                l41Var5.k = R.raw.biz_map;
                arrayList5.add(l41Var5);
                arrayList5.add(l41.k(d1Var.d));
                arrayList5.add(l41.C(null));
                l41 i27 = l41.i(1, gd.M0(2131752680, null));
                i27.L(d1Var.x != null);
                arrayList5.add(i27);
                if (d1Var.x != null) {
                    arrayList5.add(l41.k(d1Var.f));
                }
                arrayList5.add(l41.C(null));
                if (d1Var.w != null && (d1Var.x != null || !TextUtils.isEmpty(d1Var.y))) {
                    z14 = true;
                }
                d1Var.G = z14;
                if (z14) {
                    l41 e10 = l41.e(2, gd.M0(2131752685, null));
                    e10.s = true;
                    arrayList5.add(e10);
                    arrayList5.add(l41.C(null));
                }
                d1Var.Z(true);
                break;
            case 13:
                kg.f1.a0((kg.f1) this.b, (ArrayList) obj);
                break;
            case 14:
                kg.h1 h1Var = (kg.h1) this.b;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = h1Var.b;
                String str10 = null;
                String M09 = gd.M0(2131752741, null);
                l41 l41Var6 = new l41(9);
                l41Var6.d = -1;
                l41Var6.m = M09;
                l41Var6.L(h1Var.r);
                arrayList6.add(l41Var6);
                arrayList6.add(l41.C(null));
                if (h1Var.r) {
                    while (i15 < arrayList7.size()) {
                        if (i15 > 0) {
                            arrayList6.add(l41.C(str10));
                        }
                        kg.e1 e1Var = (kg.e1) arrayList7.get(i15);
                        if (h1Var.Z()) {
                            str6 = null;
                        } else {
                            int i28 = i15 * 3;
                            str6 = null;
                            arrayList6.add(l41.f(gd.M0(2131752740, null), kg.e1.a(e1Var.a), i28));
                            arrayList6.add(l41.f(gd.M0(2131752746, null), kg.e1.a(e1Var.b), i28 + 1));
                            l41 e11 = l41.e(i28 + 2, gd.M0(2131746126, null));
                            e11.s = true;
                            arrayList6.add(e11);
                        }
                        i15++;
                        str10 = str6;
                    }
                    String str11 = str10;
                    if (h1Var.a0()) {
                        arrayList6.add(l41.C(str11));
                        l41 c10 = l41.c(-2, R.drawable.menu_premium_clock_add, gd.M0(2131752747, str11));
                        c10.r = true;
                        arrayList6.add(c10);
                    }
                    arrayList6.add(l41.C(gd.M0(2131752742, str11)));
                    break;
                }
                break;
            case 15:
                kg.y1.a0((kg.y1) this.b, (ArrayList) obj, (z41) obj2);
                break;
            case 16:
                ((ki.k) this.b).H0((ArrayList) obj, (z41) obj2);
                break;
            case 17:
                ki.r.Z((ki.r) this.b, (ArrayList) obj);
                break;
            case 18:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
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
                        switch (str12.hashCode()) {
                            case -2008589971:
                                if (str12.equals("application/epub+zip")) {
                                    i13 = 0;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1719571662:
                                if (str12.equals("application/vnd.oasis.opendocument.text")) {
                                    i13 = 1;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1664118616:
                                if (str12.equals("video/3gpp")) {
                                    i13 = 2;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1578389996:
                                if (str12.equals("application/vnd.ms-fontobject")) {
                                    i13 = 3;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1348237359:
                                if (str12.equals("application/x-cdf")) {
                                    i13 = 4;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1348236892:
                                if (str12.equals("application/x-csh")) {
                                    i13 = 5;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1079884372:
                                if (str12.equals("video/x-msvideo")) {
                                    i13 = 6;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1073633483:
                                if (str12.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    i13 = 7;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1071817359:
                                if (str12.equals("application/vnd.ms-powerpoint")) {
                                    i13 = 8;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -1050893613:
                                break;
                            case -1007601745:
                                if (str12.equals("audio/x-midi")) {
                                    i13 = 10;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -958424608:
                                if (str12.equals("text/calendar")) {
                                    i13 = 11;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -816908365:
                                if (str12.equals("application/x-httpd-php")) {
                                    i13 = 12;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -648684635:
                                if (str12.equals("audio/3gpp2")) {
                                    i13 = 13;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -433129473:
                                if (str12.equals("application/vnd.apple.installer+xml")) {
                                    i13 = 14;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -366307023:
                                if (str12.equals("application/vnd.ms-excel")) {
                                    i13 = 15;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -48069494:
                                if (str12.equals("video/3gpp2")) {
                                    i13 = 16;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -43923783:
                                if (str12.equals("application/gzip")) {
                                    i13 = 17;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case -43491031:
                                if (str12.equals("application/x-sh")) {
                                    i13 = 18;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 187091926:
                                if (str12.equals("audio/ogg")) {
                                    i13 = 19;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 817335912:
                                if (str12.equals("text/plain")) {
                                    i13 = 20;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 859118878:
                                if (str12.equals("application/x-abiword")) {
                                    i13 = 21;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 886992732:
                                if (str12.equals("application/ld+json")) {
                                    i13 = 22;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 904647503:
                                if (str12.equals("application/msword")) {
                                    i13 = 23;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1154306387:
                                if (str12.equals("application/x-bzip")) {
                                    i13 = 24;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1154455342:
                                if (str12.equals("application/x-gzip")) {
                                    i13 = 25;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1178484637:
                                if (str12.equals("application/octet-stream")) {
                                    i13 = 26;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1423759679:
                                if (str12.equals("application/x-bzip2")) {
                                    i13 = 27;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1436962847:
                                if (str12.equals("application/vnd.oasis.opendocument.presentation")) {
                                    i13 = 28;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1454024983:
                                if (str12.equals("application/x-7z-compressed")) {
                                    i13 = 29;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1455492626:
                                if (str12.equals("application/x-freearc")) {
                                    i13 = 30;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1503095341:
                                if (str12.equals("audio/3gpp")) {
                                    i13 = 31;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1504831518:
                                if (str12.equals("audio/mpeg")) {
                                    i13 = 32;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1509238306:
                                if (str12.equals("application/vnd.rar")) {
                                    i13 = 33;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1578362927:
                                if (str12.equals("image/vnd.microsoft.icon")) {
                                    i13 = 34;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1643664935:
                                if (str12.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    i13 = 35;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1672200517:
                                if (str12.equals("application/vnd.amazon.ebook")) {
                                    i13 = 36;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 1993842850:
                                if (str12.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    i13 = 37;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 2049276534:
                                if (str12.equals("application/java-archive")) {
                                    i13 = 38;
                                    break;
                                }
                                i13 = -1;
                                break;
                            case 2132236175:
                                if (str12.equals("text/javascript")) {
                                    i13 = 39;
                                    break;
                                }
                                i13 = -1;
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                        switch (i13) {
                            case 0:
                                str7 = "epub";
                                break;
                            case 1:
                                str7 = "odt";
                                break;
                            case 2:
                            case ks.U /* 31 */:
                                str7 = "3gp";
                                break;
                            case 3:
                                str7 = "eot";
                                break;
                            case 4:
                                str7 = "cda";
                                break;
                            case 5:
                                str7 = "csh";
                                break;
                            case 6:
                                str7 = "avi";
                                break;
                            case 7:
                                str7 = "pptx";
                                break;
                            case 8:
                                str7 = "ppt";
                                break;
                            case 9:
                                str7 = "docx";
                                break;
                            case 10:
                                str7 = "midi";
                                break;
                            case 11:
                                str7 = "ics";
                                break;
                            case 12:
                                str7 = "php";
                                break;
                            case 13:
                            case 16:
                                str7 = "3g2";
                                break;
                            case 14:
                                str7 = "mpkg";
                                break;
                            case 15:
                                str7 = "xls";
                                break;
                            case 17:
                            case 25:
                                str7 = "gz";
                                break;
                            case 18:
                                str7 = "sh";
                                break;
                            case 19:
                                str7 = "opus";
                                break;
                            case 20:
                                str7 = "txt";
                                break;
                            case 21:
                                str7 = "abw";
                                break;
                            case 22:
                                str7 = "jsonld";
                                break;
                            case 23:
                                str7 = "doc";
                                break;
                            case 24:
                                str7 = "bz";
                                break;
                            case 26:
                                str7 = "bin";
                                break;
                            case 27:
                                str7 = "bz2";
                                break;
                            case 28:
                                str7 = "odp";
                                break;
                            case 29:
                                str7 = "7z";
                                break;
                            case ks.T /* 30 */:
                                str7 = "arc";
                                break;
                            case 32:
                                str7 = "mp3";
                                break;
                            case 33:
                                str7 = "rar";
                                break;
                            case 34:
                                str7 = "ico";
                                break;
                            case 35:
                                str7 = "ods";
                                break;
                            case 36:
                                str7 = "azw";
                                break;
                            case 37:
                                str7 = "xlsx";
                                break;
                            case 38:
                                str7 = "jar";
                                break;
                            case 39:
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
                    sb5.append(gd.M0(2131753973, null));
                }
                n6Var.setText(sb5);
                break;
            case 19:
                ki.h1 h1Var2 = (ki.h1) this.b;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(l41.j(-1, h1Var2.W1));
                arrayList8.add(l41.C(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752969, h1Var2.U1))));
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
                ((ki.i3) this.b).I0((ArrayList) obj, (z41) obj2);
                break;
            case 22:
                ((ki.e4) this.b).Z((ArrayList) obj, (z41) obj2);
                break;
            case 23:
                ((li.s) this.b).w.c((ArrayList) obj);
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                ((ArrayList) obj).add(l41.j(0, ((ni.c) this.b).T1));
                break;
            case 26:
                Utilities.i.c(new kg.h0(i12, (String[]) this.b, (q10) obj2));
                break;
            case 27:
                oi.u uVar = (oi.u) this.b;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(l41.j(1, uVar.W1));
                arrayList9.add(l41.j(3, uVar.Z1));
                if (uVar.e2 != null) {
                    arrayList9.add(l41.j(2, uVar.X1));
                    break;
                }
                break;
            case 28:
                oi.s3.L1((oi.s3[]) this.b, (ArrayList) obj, (z41) obj2);
                break;
            default:
                oi.s3 s3Var = (oi.s3) this.b;
                ((Integer) obj).getClass();
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = s3Var.t3;
                ArrayList arrayList12 = new ArrayList(arrayList10.size());
                int size = arrayList10.size();
                int i29 = 0;
                while (i29 < size) {
                    Object obj3 = arrayList10.get(i29);
                    i29++;
                    Object obj4 = ((l41) obj3).H;
                    if (obj4 instanceof oi.a) {
                        arrayList12.add((oi.a) obj4);
                    }
                }
                if (arrayList12.size() >= 2) {
                    ArrayList arrayList13 = new ArrayList();
                    int size2 = arrayList12.size();
                    int i30 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i31 = 0;
                    int i32 = 0;
                    while (i32 < size2) {
                        Object obj5 = arrayList12.get(i32);
                        i32++;
                        oi.a aVar = (oi.a) obj5;
                        int indexOf = arrayList11.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i33 = indexOf + 1;
                            if (oi.s3.A3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int S3 = s3Var.S3(indexOf);
                                i33 = S3 >= arrayList11.size() ? arrayList11.size() : S3 + 1;
                            }
                            arrayList13.add(new ArrayList(arrayList11.subList(indexOf, i33)));
                            i30 = Math.min(i30, indexOf);
                            i14 = Math.max(i14, i33);
                            i31 += i33 - indexOf;
                        }
                    }
                    if (i31 == i14 - i30) {
                        ArrayList arrayList14 = new ArrayList(i31);
                        int size3 = arrayList13.size();
                        int i34 = 0;
                        while (i34 < size3) {
                            Object obj6 = arrayList13.get(i34);
                            i34++;
                            arrayList14.addAll((ArrayList) obj6);
                        }
                        for (int i35 = 0; i35 < arrayList14.size(); i35++) {
                            if (arrayList11.get(i30 + i35) != arrayList14.get(i35)) {
                                oi.e2 e2Var2 = s3Var.R3;
                                if (e2Var2 != null) {
                                    e2Var2.d();
                                }
                                for (int i36 = 0; i36 < arrayList14.size(); i36++) {
                                    arrayList11.set(i30 + i36, (oi.a) arrayList14.get(i36));
                                }
                                oi.a aVar2 = s3Var.a4;
                                ArrayList arrayList15 = oi.s3.A4;
                                if (aVar2 != null) {
                                    ArrayList arrayList16 = aVar2.k;
                                    int indexOf2 = arrayList11.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList17 = indexOf2 > 0 ? ((oi.a) arrayList11.get(indexOf2 - 1)).k : arrayList15;
                                        int i37 = indexOf2 + 1;
                                        if (i37 < arrayList11.size()) {
                                            arrayList15 = ((oi.a) arrayList11.get(i37)).k;
                                        }
                                        if (arrayList17.size() < arrayList15.size()) {
                                            arrayList17 = arrayList15;
                                        }
                                        if (!arrayList16.equals(arrayList17)) {
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList17);
                                            objArr = true;
                                            boolean A2 = s3Var.A2();
                                            i11 = 0;
                                            while (i11 < arrayList11.size()) {
                                                oi.a aVar3 = (oi.a) arrayList11.get(i11);
                                                if (!aVar3.i && !oi.s3.A3(aVar3)) {
                                                    oi.a aVar4 = i11 > 0 ? (oi.a) arrayList11.get(i11 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (oi.s3.H3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i38 = max + 1;
                                                        if (aVar3.c > i38) {
                                                            aVar3.c = i38;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i11++;
                                            }
                                            s3Var.v4();
                                            s3Var.d2();
                                            if (!objArr == true || A2) {
                                                s3Var.g3.O(true);
                                                s3Var.A4();
                                            } else {
                                                s3Var.A4();
                                            }
                                            e2Var = s3Var.R3;
                                            if (e2Var == null) {
                                                e2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean A22 = s3Var.A2();
                                i11 = 0;
                                while (i11 < arrayList11.size()) {
                                }
                                s3Var.v4();
                                s3Var.d2();
                                if (objArr == true) {
                                }
                                s3Var.g3.O(true);
                                s3Var.A4();
                                e2Var = s3Var.R3;
                                if (e2Var == null) {
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
