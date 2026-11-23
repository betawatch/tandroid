package di;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.sr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.fe;
import org.telegram.ui.ge;
import org.telegram.ui.gg;
import org.telegram.ui.hq0;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        boolean z10;
        ?? r15;
        int i7 = this.a;
        int i10 = 1;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i11 = 0;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.mc[] mcVarArr = (org.telegram.ui.Components.mc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new h1(f6Var.getContext(), f6Var.J0, f6Var.a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    f6Var.C2(mcVarArr[0], gd.a0(null, null, 2131750029, ki.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                break;
            case 1:
                org.telegram.messenger.g0.g3(new bi.n2((org.telegram.ui.lb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 12));
                break;
            case 2:
                final bn bnVar = (bn) obj6;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj5;
                String str = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull d2 = user != null ? bnVar.getMessagesController().d2(user.id) : null;
                x60 J = x60.J(bnVar, r1Var);
                yk0 yk0Var = new yk0(bnVar.getParentActivity(), bnVar.Ba);
                J.p = new fe(yk0Var, i10);
                org.telegram.ui.x xVar = new org.telegram.ui.x(bnVar, user, str, 3);
                x60 K = J.K();
                K.c(R.drawable.ic_ab_back, gd.N0(2131753753, null), new hq0(J, 27), false);
                K.k();
                K.c(R.drawable.msg_addbot, gd.N0(2131751705, null), new org.telegram.ui.o1(bnVar, J, str), false);
                K.c(R.drawable.menu_contact_existing, gd.N0(2131754372, null), new hq0(xVar, 28), false);
                if (tL_contact == null && (user == null || !bnVar.getContactsController().g0.containsKey(Long.valueOf(user.id)))) {
                    J.c(R.drawable.msg_contact_add, gd.N0(2131754374, null), new bi.a6(J, K, 5), false);
                    J.k();
                }
                if (user == null) {
                    J.c(R.drawable.menu_invit_telegram, gd.N0(2131748914, null), new ge(bnVar, str, 10), false);
                    J.c(R.drawable.msg_calls_regular, gd.N0(2131743272, null), new ge(bnVar, str, 11), false);
                    J.c(R.drawable.msg_copy, gd.N0(2131751748, null), new ge(bnVar, str, 12), false);
                    J.k();
                    J.p(13, -1, gd.N0(2131747639, null));
                } else {
                    final int i12 = 0;
                    J.c(R.drawable.msg_discussion, gd.N0(2131745405, null), new gg(bnVar, user, i12), false);
                    if (!n10.C(user)) {
                        J.c(R.drawable.msg_calls, gd.N0(2131743271, null), new Runnable() { // from class: org.telegram.ui.fg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (i12) {
                                    case 0:
                                        bn bnVar2 = bnVar;
                                        TLRPC.UserFull userFull = d2;
                                        if (userFull != null) {
                                            bnVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.c2.m(user, false, z13, bnVar2.getParentActivity(), userFull, bnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z132, bnVar2.getParentActivity(), userFull, bnVar2.getAccountInstance());
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.UserFull userFull2 = d2;
                                        if (userFull2 != null) {
                                            bnVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z14, bnVar3.getParentActivity(), userFull2, bnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z142, bnVar3.getParentActivity(), userFull2, bnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i13 = 1;
                        J.c(R.drawable.msg_videocall, gd.N0(2131743361, null), new Runnable() { // from class: org.telegram.ui.fg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (i13) {
                                    case 0:
                                        bn bnVar2 = bnVar;
                                        TLRPC.UserFull userFull = d2;
                                        if (userFull != null) {
                                            bnVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.c2.m(user, false, z132, bnVar2.getParentActivity(), userFull, bnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z1322, bnVar2.getParentActivity(), userFull, bnVar2.getAccountInstance());
                                    default:
                                        bn bnVar3 = bnVar;
                                        TLRPC.UserFull userFull2 = d2;
                                        if (userFull2 != null) {
                                            bnVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z142, bnVar3.getParentActivity(), userFull2, bnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z1422, bnVar3.getParentActivity(), userFull2, bnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    J.c(R.drawable.msg_calls_regular, gd.N0(2131743272, null), new ge(bnVar, str, 8), false);
                    J.c(R.drawable.msg_copy, gd.N0(2131751748, null), new ge(bnVar, str, 9), false);
                    J.k();
                    J.n(user, gd.N0(2131743296, null), new org.telegram.ui.o1(bnVar, yk0Var, user, 18));
                }
                yk0Var.e(J);
                if (characterStyle instanceof t41) {
                    String url = ((t41) characterStyle).getURL();
                    String trim = (url != null ? url : "").trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r15 = 0;
                        sb2.append(trim.substring(0, ks.i3));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r15 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r15, spannableString.length(), 33);
                    yk0Var.f(r1Var, characterStyle, spannableString, r15);
                } else {
                    yk0Var.f(r1Var, characterStyle, null, false);
                }
                bnVar.showDialog(yk0Var);
                break;
            case 3:
                bn bnVar2 = (bn) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str2 = (String) obj4;
                bj bjVar = (bj) obj3;
                Long l10 = (Long) obj;
                int i14 = bnVar2.g4;
                Object obj7 = this.e;
                if (i14 == 1) {
                    org.telegram.ui.Components.b5.J(bnVar2.getParentActivity(), bnVar2.l6, new a1.d(bnVar2, tL_document, str2, obj7, 7), bnVar2.Ba);
                } else {
                    bnVar2.getSendMessagesHelper().v0(tL_document, str2, bnVar2.l6, bnVar2.F5, bnVar2.m4, null, bnVar2.D5, bjVar, true, 0, 0, false, obj7, bnVar2.Y8(), l10.longValue(), bnVar2.j9(), bnVar2.y5);
                    tL_document = tL_document;
                }
                bnVar2.D9(false);
                bnVar2.a0.n(tL_document);
                bnVar2.a0.setFieldText("");
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                px pxVar = ((ox) obj6).a;
                String str3 = pxVar.w;
                ArrayList arrayList5 = pxVar.r;
                ArrayList arrayList6 = pxVar.h;
                ArrayList arrayList7 = pxVar.s;
                qy qyVar = pxVar.G;
                if (((String) obj5).equals(str3)) {
                    sv svVar = qyVar.W;
                    dx dxVar = qyVar.Q;
                    svVar.e(false);
                    pxVar.E = true;
                    v4.i0 adapter = dxVar.getAdapter();
                    px pxVar2 = qyVar.T;
                    if (adapter != pxVar2) {
                        dxVar.setAdapter(pxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(pxVar.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj8 = arrayList3.get(i15);
                        i15++;
                        jx jxVar = (jx) obj8;
                        if (longSparseIntArray.indexOfKey(jxVar.c.id) < 0) {
                            longSparseIntArray.append(jxVar.c.id, 1);
                            arrayList7.add(jxVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        Object obj9 = arrayList4.get(i11);
                        i11++;
                        jx jxVar2 = (jx) obj9;
                        if (longSparseIntArray.indexOfKey(jxVar2.c.id) < 0) {
                            longSparseIntArray.append(jxVar2.c.id, 1);
                            arrayList7.add(jxVar2);
                        }
                    }
                    pxVar.f();
                    break;
                }
                break;
            case 5:
                bx bxVar = (bx) obj6;
                Long l11 = (Long) obj4;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                bxVar.getMessagesController().Z2(l11, null, 32);
                vw vwVar = bxVar.E2;
                bxVar.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.g2) obj3).finishFragment();
                if (vwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(sr.a(-l11.longValue(), 0L));
                    vwVar.z(bxVar, arrayList8, null, false, bxVar.L2, bxVar.M2, bxVar.N2, null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) obj3;
                String str4 = (String) obj;
                ((org.telegram.ui.Wallet.z2) obj6).d = false;
                ((hi.e) obj5).setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.kc.d0(str4, e3Var.F, i6Var);
                }
                w7Var.run();
                break;
        }
    }
}
