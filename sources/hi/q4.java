package hi;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.yf;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ((ArrayList) obj).add(b41.j(0, ((ni.b) this.b).T1));
    }

    private final void c(Object obj, Object obj2) {
        Utilities.i.c(new kg.t1(24, (String[]) this.b, (s10) obj2));
    }

    private final void d(Object obj, Object obj2) {
        oi.u uVar = (oi.u) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(b41.j(1, uVar.W1));
        arrayList.add(b41.j(3, uVar.Z1));
        if (uVar.e2 != null) {
            arrayList.add(b41.j(2, uVar.X1));
        }
    }

    private final void e(Object obj, Object obj2) {
        oi.q3.L1((oi.q3[]) this.b, (ArrayList) obj, (p41) obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0521, code lost:
    
        if (r1.equals("video/3gpp") == false) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        boolean z10;
        p41 p41Var;
        String str2;
        int i7;
        boolean z11;
        boolean z12;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String upperCase;
        Object[] objArr;
        int i10;
        oi.d2 d2Var;
        int i11 = this.a;
        int i12 = 9;
        int i13 = -1;
        char c10 = 2;
        boolean z13 = false;
        int i14 = 0;
        z13 = false;
        boolean z14 = true;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ((ra) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 1:
                l7 l7Var = (l7) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (l7Var.d2 || l7Var.c2 != null) {
                    TLRPC.WebPage webPage = l7Var.c2;
                    e7 e7Var = new e7(l7Var, 0);
                    int i15 = j7.b;
                    b41 K = b41.K(j7.class);
                    K.G = webPage;
                    K.D = e7Var;
                    arrayList.add(K);
                }
                arrayList.add(b41.k(l7Var.U1));
                arrayList.add(b41.B(1, null));
                b41 i16 = b41.i(2, hd.M0(2131744637, null));
                i16.L(l7Var.i2);
                arrayList.add(i16);
                if (l7Var.i2) {
                    arrayList.add(b41.k(l7Var.V1));
                }
                arrayList.add(b41.B(3, null));
                arrayList.add(b41.k(l7Var.W1));
                break;
            case 2:
                sa saVar = (sa) obj3;
                Float f10 = (Float) obj2;
                long duration = saVar.Y0.getDuration() < 100 ? saVar.L1.h0 : saVar.Y0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                d7 d7Var = saVar.L1;
                float f11 = d7Var.a0;
                float f12 = d7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j3 = (long) (f13 * f14);
                ga gaVar = saVar.Y0;
                long j10 = (long) ((f12 * f14) + j3);
                saVar.N1 = j10;
                gaVar.m(j10);
                u9 u9Var = saVar.w1;
                if (u9Var != null) {
                    u9Var.setCoverTime(saVar.N1);
                }
                d7 d7Var2 = saVar.L1;
                if (d7Var2 != null && d7Var2.g) {
                    d7Var2.j = true;
                    break;
                }
                break;
            case 3:
                ((va) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 4:
                ((ii.f) obj3).E0((ArrayList) obj, (p41) obj2);
                break;
            case 5:
                ii.e eVar = (ii.e) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(b41.k(eVar.U1));
                arrayList2.add(b41.k(eVar.V1));
                break;
            case 6:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                cm0 cm0Var = (cm0) ((jg.h0) obj3);
                yw ywVar = cm0Var.J0;
                org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
                m60 I = m60.I(ywVar, (org.telegram.ui.Cells.f6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    str = null;
                    z10 = false;
                } else {
                    m60 J = I.J();
                    J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new wa0(I, 23), false);
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
                    z10 = false;
                    I.c(R.drawable.msg_channel, hd.M0(2131745248, null), new bi.n3(I, J, i12), false);
                }
                I.c(R.drawable.msg_info, hd.M0(2131754943, str), new u80(cm0Var, ywVar, cm0Var.K0, I, 2), z10);
                I.c(R.drawable.msg_block2, hd.M0(2131746234, str), new u80(cm0Var, ywVar, tL_sponsoredPeer, I, 3), z10);
                I.k();
                I.c(R.drawable.msg_cancel, hd.M0(2131746320, str), new yf(cm0Var, ywVar, I, 20), z10);
                I.V(hd.a0 ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 7:
                kg.c.Z((kg.c) obj3, (ArrayList) obj, (p41) obj2);
                break;
            case 8:
                kg.n nVar = (kg.n) obj3;
                nVar.M.dismiss();
                nVar.E = (String) obj;
                nVar.F = (TLRPC.InputDocument) obj2;
                nVar.x = false;
                org.telegram.messenger.g0.r(nVar.e);
                nVar.n.setSticker(nVar.E);
                nVar.j0(true);
                bi.v3 v3Var = nVar.a;
                if (v3Var != null && (p41Var = v3Var.g3) != null) {
                    p41Var.O(true);
                    break;
                }
                break;
            case 9:
                kg.i0 i0Var = (kg.i0) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                p41 p41Var2 = (p41) obj2;
                p41Var2.G = 1;
                arrayList3.add(b41.l(-5, i0Var.W1));
                TL_account.TL_connectedBot tL_connectedBot = i0Var.T1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str2 = null;
                        arrayList3.add(b41.u(hd.M0(2131745559, null)));
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList3.add(b41.f(hd.M0(2131745556, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i7 = 2;
                            arrayList3.add(b41.f(hd.M0(2131745555, null), tL_connectedBot.location, 2));
                        } else {
                            i7 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i7)) {
                            arrayList3.add(b41.f(hd.M0(2131745557, null), hd.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList3.add(b41.C(null));
                    } else {
                        str2 = null;
                    }
                    p41Var2.V();
                    arrayList3.add(b41.u(hd.M0(2131752819, str2)));
                    int i17 = kg.i0.g2;
                    b41 x10 = b41.x(-1, hd.M0(2131752781, str2));
                    x10.L(i0Var.b2);
                    arrayList3.add(x10);
                    int i18 = kg.i0.h2;
                    b41 x11 = b41.x(-2, hd.M0(2131752776, str2));
                    x11.L(!i0Var.b2);
                    arrayList3.add(x11);
                    p41Var2.U();
                    arrayList3.add(b41.C(str2));
                    kg.a0 a0Var = i0Var.V1;
                    if (a0Var != null) {
                        a0Var.a(arrayList3, p41Var2, true);
                    }
                    arrayList3.add(b41.C(hd.M0(2131752818, str2)));
                    break;
                }
                break;
            case 10:
                final kg.q0 q0Var = (kg.q0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                p41 p41Var3 = (p41) obj2;
                LongSparseArray longSparseArray = q0Var.O;
                String M0 = hd.M0(2131752783, null);
                String M02 = hd.M0(2131752782, null);
                b41 b41Var = new b41(2);
                b41Var.l = M0;
                b41Var.o = M02;
                b41Var.m = "tg_superplaceholders_android_2";
                b41Var.n = "🤖🏝️";
                b41Var.z = 120;
                arrayList4.add(b41Var);
                if (q0Var.N != null) {
                    p41Var3.V();
                    long j11 = q0Var.N.id;
                    b41 b41Var2 = new b41(13);
                    b41Var2.x = j11;
                    b41Var2.L(true);
                    final int i19 = z13 ? 1 : 0;
                    b41Var2.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.N = null;
                                    q0Var2.c.g3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = q0Var3.K;
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
                                    q0Var3.c.g3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var4.K;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        q0Var4.c.g3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var5.K;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        q0Var5.c.g3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.K.manage_stories = !r0.manage_stories;
                                    q0Var6.c.g3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(b41Var2);
                    p41Var3.U();
                    z11 = true;
                } else {
                    p41Var3.V();
                    arrayList4.add(b41.k(q0Var.e));
                    longSparseArray.clear();
                    int i20 = 0;
                    boolean z15 = false;
                    while (i20 < q0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) q0Var.d.d.get(i20);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j12 = user.id;
                                String str9 = q0Var.E;
                                z12 = z14;
                                b41 b41Var3 = new b41(13);
                                b41Var3.x = j12;
                                b41Var3.n = str9;
                                arrayList4.add(b41Var3);
                                longSparseArray.put(user.id, user);
                                z15 = z12;
                                i20++;
                                z14 = z12;
                            }
                        }
                        z12 = z14;
                        i20++;
                        z14 = z12;
                    }
                    z11 = z14;
                    for (int i21 = 0; i21 < q0Var.d.e.size(); i21++) {
                        TLObject tLObject2 = (TLObject) q0Var.d.e.get(i21);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.id;
                                String str10 = q0Var.E;
                                b41 b41Var4 = new b41(13);
                                b41Var4.x = j13;
                                b41Var4.n = str10;
                                arrayList4.add(b41Var4);
                                longSparseArray.put(user2.id, user2);
                                z15 = z11;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(q0Var.f.getText().toString()) || q0Var.d.e() || q0Var.y)) {
                        arrayList4.add(b41.k(q0Var.n));
                        z15 = z11;
                    }
                    q0Var.h.setVisibility(z15 ? 0 : 8);
                    p41Var3.U();
                }
                arrayList4.add(b41.C(hd.M0(2131752815, null)));
                p41Var3.V();
                b41 u10 = b41.u(hd.M0(2131752819, null));
                u10.g = q0Var.N != null ? z11 : false;
                arrayList4.add(u10);
                b41 x12 = b41.x(-1, hd.M0(2131752781, null));
                x12.L(q0Var.J);
                x12.g = q0Var.N != null ? z11 : false;
                arrayList4.add(x12);
                b41 x13 = b41.x(-2, hd.M0(2131752776, null));
                x13.L(!q0Var.J);
                x13.g = q0Var.N != null ? z11 : false;
                arrayList4.add(x13);
                p41Var3.U();
                arrayList4.add(b41.C(null));
                q0Var.w.a(arrayList4, p41Var3, q0Var.N != null ? z11 : false);
                arrayList4.add(b41.C(hd.M0(2131752818, null)));
                if (q0Var.N != null) {
                    p41Var3.V();
                    arrayList4.add(b41.u(hd.M0(2131752808, null)));
                    String M03 = hd.M0(2131752795, null);
                    StringBuilder sb2 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = q0Var.K;
                    sb2.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb2.append("/5");
                    b41 o4 = b41.o(-4, M03, sb2.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var.K;
                    o4.L((tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) ? z11 : false);
                    o4.f = !q0Var.Q;
                    boolean z16 = z11;
                    final int i22 = z16 ? 1 : 0;
                    o4.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.N = null;
                                    q0Var2.c.g3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var3.K;
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
                                    q0Var3.c.g3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.g3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var5.K;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        q0Var5.c.g3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.K.manage_stories = !r0.manage_stories;
                                    q0Var6.c.g3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o4);
                    if (q0Var.Q) {
                        str3 = null;
                        b41 z17 = b41.z(-5, hd.M0(2131752797, null));
                        z17.L(z16);
                        z17.g = false;
                        z17.i = z16 ? 1 : 0;
                        arrayList4.add(z17);
                        b41 z18 = b41.z(-6, hd.M0(2131752796, null));
                        z18.L(q0Var.K.reply);
                        z18.i = z16 ? 1 : 0;
                        arrayList4.add(z18);
                        b41 z19 = b41.z(-7, hd.M0(2131752798, null));
                        z19.L(q0Var.K.read_messages);
                        z19.i = z16 ? 1 : 0;
                        arrayList4.add(z19);
                        b41 z20 = b41.z(-8, hd.M0(2131752799, null));
                        z20.L(q0Var.K.delete_sent_messages);
                        z20.i = z16 ? 1 : 0;
                        arrayList4.add(z20);
                        b41 z21 = b41.z(-9, hd.M0(2131752800, null));
                        z21.L(q0Var.K.delete_received_messages);
                        z21.i = z16 ? 1 : 0;
                        arrayList4.add(z21);
                    } else {
                        str3 = null;
                    }
                    String M04 = hd.M0(2131752791, str3);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var.K;
                    sb3.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb3.append("/4");
                    b41 o10 = b41.o(-10, M04, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = q0Var.K;
                    o10.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o10.f = !q0Var.R;
                    final int i23 = 2;
                    o10.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.N = null;
                                    q0Var2.c.g3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var3.K;
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
                                    q0Var3.c.g3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.g3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = q0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        q0Var5.c.g3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.K.manage_stories = !r0.manage_stories;
                                    q0Var6.c.g3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o10);
                    if (q0Var.R) {
                        str4 = null;
                        b41 z22 = b41.z(-11, hd.M0(2131752793, null));
                        z22.L(q0Var.K.edit_name);
                        z22.i = 1;
                        arrayList4.add(z22);
                        b41 z23 = b41.z(-12, hd.M0(2131752794, null));
                        z23.L(q0Var.K.edit_bio);
                        z23.i = 1;
                        arrayList4.add(z23);
                        b41 z24 = b41.z(-13, hd.M0(2131752792, null));
                        z24.L(q0Var.K.edit_profile_photo);
                        z24.i = 1;
                        arrayList4.add(z24);
                        b41 z25 = b41.z(-14, hd.M0(2131752790, null));
                        z25.L(q0Var.K.edit_username);
                        z25.i = 1;
                        arrayList4.add(z25);
                    } else {
                        str4 = null;
                    }
                    String M05 = hd.M0(2131752807, str4);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = q0Var.K;
                    sb4.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb4.append("/5");
                    b41 o11 = b41.o(-15, M05, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = q0Var.K;
                    o11.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o11.f = !q0Var.S;
                    final int i24 = 3;
                    o11.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.N = null;
                                    q0Var2.c.g3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var3.K;
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
                                    q0Var3.c.g3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.g3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = q0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        q0Var5.c.g3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.K.manage_stories = !r0.manage_stories;
                                    q0Var6.c.g3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o11);
                    if (q0Var.S) {
                        str5 = null;
                        b41 z26 = b41.z(-16, hd.M0(2131752802, null));
                        z26.L(q0Var.K.view_gifts);
                        z26.i = 1;
                        arrayList4.add(z26);
                        b41 z27 = b41.z(-17, hd.M0(2131752806, null));
                        z27.L(q0Var.K.sell_gifts);
                        z27.i = 1;
                        arrayList4.add(z27);
                        b41 z28 = b41.z(-18, hd.M0(2131752805, null));
                        z28.L(q0Var.K.change_gift_settings);
                        z28.i = 1;
                        arrayList4.add(z28);
                        b41 z29 = b41.z(-19, hd.M0(2131752804, null));
                        z29.L(q0Var.K.transfer_and_upgrade_gifts);
                        z29.i = 1;
                        arrayList4.add(z29);
                        b41 z30 = b41.z(-20, hd.M0(2131752803, null));
                        z30.L(q0Var.K.transfer_stars);
                        z30.i = 1;
                        arrayList4.add(z30);
                    } else {
                        str5 = null;
                    }
                    b41 o12 = b41.o(-21, hd.M0(2131752789, str5), "");
                    o12.L(q0Var.K.manage_stories);
                    final int i25 = 4;
                    o12.D = new View.OnClickListener() { // from class: kg.m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
                                case 0:
                                    q0 q0Var2 = q0Var;
                                    q0Var2.N = null;
                                    q0Var2.c.g3.O(true);
                                    q0Var2.d0(true);
                                    break;
                                case 1:
                                    q0 q0Var3 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = q0Var3.K;
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
                                    q0Var3.c.g3.O(true);
                                    q0Var3.d0(true);
                                    break;
                                case 2:
                                    q0 q0Var4 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = q0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        q0Var4.c0(-14, true, new k0(q0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        q0Var4.c.g3.O(true);
                                        q0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    q0 q0Var5 = q0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = q0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        q0Var5.c0(-17, true, new k0(q0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        q0Var5.c.g3.O(true);
                                        q0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    q0 q0Var6 = q0Var;
                                    q0Var6.K.manage_stories = !r0.manage_stories;
                                    q0Var6.c.g3.O(true);
                                    q0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList4.add(o12);
                    p41Var3.U();
                    arrayList4.add(b41.B(-4, null));
                    arrayList4.add(b41.B(-5, null));
                    arrayList4.add(b41.B(-6, null));
                    arrayList4.add(b41.B(-7, null));
                    break;
                }
                break;
            case 11:
                kg.s0.Z((kg.s0) obj3, (ArrayList) obj, (p41) obj2);
                break;
            case 12:
                kg.a1 a1Var = (kg.a1) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                String M06 = hd.M0(2131752698, null);
                String M07 = hd.M0(2131752692, null);
                b41 b41Var5 = new b41(2);
                b41Var5.l = M06;
                b41Var5.o = M07;
                b41Var5.k = R.raw.biz_map;
                arrayList5.add(b41Var5);
                arrayList5.add(b41.k(a1Var.d));
                arrayList5.add(b41.C(null));
                b41 i26 = b41.i(1, hd.M0(2131752691, null));
                i26.L(a1Var.x != null);
                arrayList5.add(i26);
                if (a1Var.x != null) {
                    arrayList5.add(b41.k(a1Var.f));
                }
                arrayList5.add(b41.C(null));
                if (a1Var.w != null && (a1Var.x != null || !TextUtils.isEmpty(a1Var.y))) {
                    z13 = true;
                }
                a1Var.G = z13;
                if (z13) {
                    b41 e10 = b41.e(2, hd.M0(2131752696, null));
                    e10.r = true;
                    arrayList5.add(e10);
                    arrayList5.add(b41.C(null));
                }
                a1Var.Z(true);
                break;
            case 13:
                kg.c1.a0((kg.c1) obj3, (ArrayList) obj);
                break;
            case 14:
                kg.e1 e1Var = (kg.e1) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = e1Var.b;
                String str11 = null;
                String M08 = hd.M0(2131752752, null);
                b41 b41Var6 = new b41(9);
                b41Var6.d = -1;
                b41Var6.l = M08;
                b41Var6.L(e1Var.r);
                arrayList6.add(b41Var6);
                arrayList6.add(b41.C(null));
                if (e1Var.r) {
                    while (i14 < arrayList7.size()) {
                        if (i14 > 0) {
                            arrayList6.add(b41.C(str11));
                        }
                        kg.b1 b1Var = (kg.b1) arrayList7.get(i14);
                        if (e1Var.Z()) {
                            str6 = null;
                        } else {
                            int i27 = i14 * 3;
                            str6 = null;
                            arrayList6.add(b41.f(hd.M0(2131752751, null), kg.b1.a(b1Var.a), i27));
                            arrayList6.add(b41.f(hd.M0(2131752757, null), kg.b1.a(b1Var.b), i27 + 1));
                            b41 e11 = b41.e(i27 + 2, hd.M0(2131746321, null));
                            e11.r = true;
                            arrayList6.add(e11);
                        }
                        i14++;
                        str11 = str6;
                    }
                    String str12 = str11;
                    if (e1Var.a0()) {
                        arrayList6.add(b41.C(str12));
                        b41 c11 = b41.c(-2, R.drawable.menu_premium_clock_add, hd.M0(2131752758, str12));
                        c11.q = true;
                        arrayList6.add(c11);
                    }
                    arrayList6.add(b41.C(hd.M0(2131752753, str12)));
                    break;
                }
                break;
            case 15:
                kg.y1.a0((kg.y1) obj3, (ArrayList) obj, (p41) obj2);
                break;
            case 16:
                ((ki.k) obj3).H0((ArrayList) obj, (p41) obj2);
                break;
            case 17:
                ki.s.Z((ki.s) obj3, (ArrayList) obj);
                break;
            case 18:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) obj3;
                String str13 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb5 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb5.append("~");
                    str7 = "";
                    sb5.append(org.telegram.messenger.g0.i0(l10.longValue(), false, false));
                } else {
                    str7 = "";
                }
                if (str13 == null) {
                    upperCase = null;
                } else {
                    if (!str13.isEmpty()) {
                        switch (str13.hashCode()) {
                            case -2008589971:
                                if (str13.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str13.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                break;
                            case -1578389996:
                                if (str13.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str13.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str13.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str13.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str13.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str13.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str13.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str13.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str13.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str13.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str13.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str13.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str13.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str13.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str13.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str13.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str13.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str13.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str13.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str13.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str13.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str13.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str13.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str13.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str13.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str13.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str13.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str13.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str13.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                if (str13.equals("audio/mpeg")) {
                                    c10 = ' ';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1509238306:
                                if (str13.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str13.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str13.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str13.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str13.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str13.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str13.equals("text/javascript")) {
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
                                str8 = "epub";
                                break;
                            case 1:
                                str8 = "odt";
                                break;
                            case 2:
                            case ns.U /* 31 */:
                                str8 = "3gp";
                                break;
                            case 3:
                                str8 = "eot";
                                break;
                            case 4:
                                str8 = "cda";
                                break;
                            case 5:
                                str8 = "csh";
                                break;
                            case 6:
                                str8 = "avi";
                                break;
                            case 7:
                                str8 = "pptx";
                                break;
                            case '\b':
                                str8 = "ppt";
                                break;
                            case '\t':
                                str8 = "docx";
                                break;
                            case '\n':
                                str8 = "midi";
                                break;
                            case 11:
                                str8 = "ics";
                                break;
                            case '\f':
                                str8 = "php";
                                break;
                            case '\r':
                            case 16:
                                str8 = "3g2";
                                break;
                            case 14:
                                str8 = "mpkg";
                                break;
                            case 15:
                                str8 = "xls";
                                break;
                            case 17:
                            case 25:
                                str8 = "gz";
                                break;
                            case 18:
                                str8 = "sh";
                                break;
                            case 19:
                                str8 = "opus";
                                break;
                            case 20:
                                str8 = "txt";
                                break;
                            case 21:
                                str8 = "abw";
                                break;
                            case 22:
                                str8 = "jsonld";
                                break;
                            case 23:
                                str8 = "doc";
                                break;
                            case 24:
                                str8 = "bz";
                                break;
                            case 26:
                                str8 = "bin";
                                break;
                            case 27:
                                str8 = "bz2";
                                break;
                            case 28:
                                str8 = "odp";
                                break;
                            case 29:
                                str8 = "7z";
                                break;
                            case ns.T /* 30 */:
                                str8 = "arc";
                                break;
                            case ' ':
                                str8 = "mp3";
                                break;
                            case '!':
                                str8 = "rar";
                                break;
                            case '\"':
                                str8 = "ico";
                                break;
                            case '#':
                                str8 = "ods";
                                break;
                            case '$':
                                str8 = "azw";
                                break;
                            case '%':
                                str8 = "xlsx";
                                break;
                            case '&':
                                str8 = "jar";
                                break;
                            case '\'':
                                str8 = "js";
                                break;
                            default:
                                if (str13.contains("/")) {
                                    str13 = str13.substring(str13.indexOf("/") + 1);
                                }
                                if (str13.contains("-")) {
                                    str13 = str13.substring(str13.indexOf("-") + 1);
                                }
                                if (str13.contains("+")) {
                                    str13 = str13.substring(0, str13.indexOf("+"));
                                }
                                str8 = str13.toLowerCase();
                                break;
                        }
                    } else {
                        str8 = str7;
                    }
                    upperCase = str8.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb5.length() > 0) {
                        sb5.append(" ");
                    }
                    sb5.append(upperCase.toUpperCase());
                }
                if (sb5.length() <= 0) {
                    sb5.append(hd.M0(2131753975, null));
                }
                h6Var.setText(sb5);
                break;
            case 19:
                ki.j1 j1Var = (ki.j1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                arrayList8.add(b41.j(-1, j1Var.W1));
                arrayList8.add(b41.C(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752980, j1Var.U1))));
                break;
            case 20:
                ki.x2 x2Var = (ki.x2) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    x2Var.getClass();
                    break;
                } else {
                    ki.k4 k4Var = x2Var.x0;
                    if (k4Var != null) {
                        k4Var.a(tL_webViewResultUrl);
                        x2Var.s();
                        break;
                    }
                }
                break;
            case 21:
                ((ki.n3) obj3).I0((ArrayList) obj, (p41) obj2);
                break;
            case 22:
                ((ki.j4) obj3).Z((ArrayList) obj, (p41) obj2);
                break;
            case 23:
                ((li.r) obj3).w.c((ArrayList) obj);
                break;
            case 24:
                ni.a aVar = (ni.a) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(b41.E(0, org.telegram.messenger.g0.L(12.0f)));
                arrayList9.add(b41.j(1, aVar.V1));
                arrayList9.add(b41.E(2, org.telegram.messenger.g0.L(12.0f)));
                arrayList9.add(b41.t(3, hd.M0(2131751947, null)));
                aVar.Y1 = arrayList9.size();
                String M09 = hd.M0(2131751946, null);
                boolean z31 = aVar.X1;
                b41 y10 = b41.y(ns.h2, M09, hd.M0(z31 ? 2131751945 : 2131751944, null));
                y10.L(true ^ aVar.U1);
                arrayList9.add(y10);
                b41 y11 = b41.y(ns.g2, hd.M0(2131751950, null), hd.M0(z31 ? 2131751949 : 2131751948, null));
                y11.L(aVar.U1);
                arrayList9.add(y11);
                arrayList9.add(b41.B(6, hd.M0(2131751951, null)));
                break;
            case 25:
                b(obj, obj2);
                break;
            case 26:
                c(obj, obj2);
                break;
            case 27:
                d(obj, obj2);
                break;
            case 28:
                e(obj, obj2);
                break;
            default:
                oi.q3 q3Var = (oi.q3) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = q3Var.t3;
                ArrayList arrayList12 = new ArrayList(arrayList10.size());
                int size = arrayList10.size();
                int i28 = 0;
                while (i28 < size) {
                    Object obj4 = arrayList10.get(i28);
                    i28++;
                    Object obj5 = ((b41) obj4).G;
                    if (obj5 instanceof oi.a) {
                        arrayList12.add((oi.a) obj5);
                    }
                }
                if (arrayList12.size() >= 2) {
                    ArrayList arrayList13 = new ArrayList();
                    int size2 = arrayList12.size();
                    int i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i30 = 0;
                    int i31 = 0;
                    while (i31 < size2) {
                        Object obj6 = arrayList12.get(i31);
                        i31++;
                        oi.a aVar2 = (oi.a) obj6;
                        int indexOf = arrayList11.indexOf(aVar2);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i32 = indexOf + 1;
                            if (oi.q3.A3(aVar2) && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                                int S3 = q3Var.S3(indexOf);
                                i32 = S3 >= arrayList11.size() ? arrayList11.size() : S3 + 1;
                            }
                            arrayList13.add(new ArrayList(arrayList11.subList(indexOf, i32)));
                            i29 = Math.min(i29, indexOf);
                            i13 = Math.max(i13, i32);
                            i30 += i32 - indexOf;
                        }
                    }
                    if (i30 == i13 - i29) {
                        ArrayList arrayList14 = new ArrayList(i30);
                        int size3 = arrayList13.size();
                        int i33 = 0;
                        while (i33 < size3) {
                            Object obj7 = arrayList13.get(i33);
                            i33++;
                            arrayList14.addAll((ArrayList) obj7);
                        }
                        for (int i34 = 0; i34 < arrayList14.size(); i34++) {
                            if (arrayList11.get(i29 + i34) != arrayList14.get(i34)) {
                                oi.d2 d2Var2 = q3Var.R3;
                                if (d2Var2 != null) {
                                    d2Var2.d();
                                }
                                for (int i35 = 0; i35 < arrayList14.size(); i35++) {
                                    arrayList11.set(i29 + i35, (oi.a) arrayList14.get(i35));
                                }
                                oi.a aVar3 = q3Var.a4;
                                ArrayList arrayList15 = oi.q3.A4;
                                if (aVar3 != null) {
                                    ArrayList arrayList16 = aVar3.k;
                                    int indexOf2 = arrayList11.indexOf(aVar3);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList17 = indexOf2 > 0 ? ((oi.a) arrayList11.get(indexOf2 - 1)).k : arrayList15;
                                        int i36 = indexOf2 + 1;
                                        if (i36 < arrayList11.size()) {
                                            arrayList15 = ((oi.a) arrayList11.get(i36)).k;
                                        }
                                        if (arrayList17.size() < arrayList15.size()) {
                                            arrayList17 = arrayList15;
                                        }
                                        if (!arrayList16.equals(arrayList17)) {
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList17);
                                            objArr = true;
                                            boolean A2 = q3Var.A2();
                                            i10 = 0;
                                            while (i10 < arrayList11.size()) {
                                                oi.a aVar4 = (oi.a) arrayList11.get(i10);
                                                if (!aVar4.i && !oi.q3.A3(aVar4)) {
                                                    oi.a aVar5 = i10 > 0 ? (oi.a) arrayList11.get(i10 - 1) : null;
                                                    int max = aVar5 != null ? Math.max(0, aVar5.c) : 0;
                                                    if (oi.q3.H3(aVar4.b)) {
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
                                            q3Var.v4();
                                            q3Var.d2();
                                            if (!objArr == true || A2) {
                                                q3Var.g3.O(true);
                                                q3Var.A4();
                                            } else {
                                                q3Var.A4();
                                            }
                                            d2Var = q3Var.R3;
                                            if (d2Var == null) {
                                                d2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean A22 = q3Var.A2();
                                i10 = 0;
                                while (i10 < arrayList11.size()) {
                                }
                                q3Var.v4();
                                q3Var.d2();
                                if (objArr == true) {
                                }
                                q3Var.g3.O(true);
                                q3Var.A4();
                                d2Var = q3Var.R3;
                                if (d2Var == null) {
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
