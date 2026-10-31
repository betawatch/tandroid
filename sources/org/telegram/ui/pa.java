package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        ?? r15;
        int i10 = this.a;
        int i11 = 1;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i12 = 0;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new v8(obj6, obj, obj5, obj4, obj2, obj3, 1));
                break;
            case 1:
                final un unVar = (un) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull a2 = user != null ? unVar.getMessagesController().a2(user.id) : null;
                org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(unVar, q1Var);
                org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(unVar.getParentActivity(), unVar.xa);
                I.p = new se(nl0Var, i11);
                w wVar = new w(unVar, user, str, 2);
                org.telegram.ui.Components.z60 J = I.J();
                J.c(R.drawable.ic_ab_back, org.telegram.messenger.cd.L0(2131753756, null), new rr0(I, 27), false);
                J.k();
                J.c(R.drawable.msg_addbot, org.telegram.messenger.cd.L0(2131751718, null), new p1(unVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, org.telegram.messenger.cd.L0(2131754375, null), new rr0(wVar, 28), false);
                if (tL_contact == null && (user == null || !unVar.getContactsController().f0.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, org.telegram.messenger.cd.L0(2131754377, null), new bi.k(I, J, 3), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, org.telegram.messenger.cd.L0(2131749117, null), new te(unVar, str, 8), false);
                    I.c(R.drawable.msg_calls_regular, org.telegram.messenger.cd.L0(2131743548, null), new te(unVar, str, 9), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751760, null), new te(unVar, str, 10), false);
                    I.k();
                    I.p(13, -1, org.telegram.messenger.cd.L0(2131747849, null));
                } else {
                    final int i13 = 0;
                    I.c(R.drawable.msg_discussion, org.telegram.messenger.cd.L0(2131745618, null), new ig(unVar, user, i13), false);
                    if (!org.telegram.messenger.h20.B(user)) {
                        I.c(R.drawable.msg_calls, org.telegram.messenger.cd.L0(2131743547, null), new Runnable() { // from class: org.telegram.ui.hg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i13) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.UserFull userFull = a2;
                                        if (userFull != null) {
                                            unVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.m1.m(user, false, z12, unVar2.getParentActivity(), userFull, unVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.m1.m(user, false, z122, unVar2.getParentActivity(), userFull, unVar2.getAccountInstance());
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.UserFull userFull2 = a2;
                                        if (userFull2 != null) {
                                            unVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.m1.m(user, true, z13, unVar3.getParentActivity(), userFull2, unVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.m1.m(user, true, z132, unVar3.getParentActivity(), userFull2, unVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i14 = 1;
                        I.c(R.drawable.msg_videocall, org.telegram.messenger.cd.L0(2131743634, null), new Runnable() { // from class: org.telegram.ui.hg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i14) {
                                    case 0:
                                        un unVar2 = unVar;
                                        TLRPC.UserFull userFull = a2;
                                        if (userFull != null) {
                                            unVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.m1.m(user, false, z122, unVar2.getParentActivity(), userFull, unVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.m1.m(user, false, z1222, unVar2.getParentActivity(), userFull, unVar2.getAccountInstance());
                                    default:
                                        un unVar3 = unVar;
                                        TLRPC.UserFull userFull2 = a2;
                                        if (userFull2 != null) {
                                            unVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.m1.m(user, true, z132, unVar3.getParentActivity(), userFull2, unVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.m1.m(user, true, z1322, unVar3.getParentActivity(), userFull2, unVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, org.telegram.messenger.cd.L0(2131743548, null), new te(unVar, str, 6), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131751760, null), new te(unVar, str, 7), false);
                    I.k();
                    I.n(user, org.telegram.messenger.cd.L0(2131743572, null), new p1(unVar, nl0Var, user, 17));
                }
                nl0Var.e(I);
                if (characterStyle instanceof org.telegram.ui.Components.g51) {
                    String url = ((org.telegram.ui.Components.g51) characterStyle).getURL();
                    String trim = (url != null ? url : "").trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r15 = 0;
                        sb2.append(trim.substring(0, org.telegram.messenger.zs.i3));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r15 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r15, spannableString.length(), 33);
                    nl0Var.f(q1Var, characterStyle, spannableString, r15);
                } else {
                    nl0Var.f(q1Var, characterStyle, null, false);
                }
                unVar.showDialog(nl0Var);
                break;
            case 2:
                un unVar2 = (un) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str2 = (String) obj4;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj3;
                Long l4 = (Long) obj;
                int i15 = unVar2.f4;
                Object obj7 = this.e;
                if (i15 == 1) {
                    org.telegram.ui.Components.s4.L(unVar2.getParentActivity(), unVar2.j6, new a1.d(unVar2, tL_document, str2, obj7, 3), unVar2.xa);
                } else {
                    unVar2.getSendMessagesHelper().v0(tL_document, str2, unVar2.j6, unVar2.D5, unVar2.l4, null, unVar2.B5, fjVar, true, 0, 0, false, obj7, unVar2.P8(), l4.longValue(), unVar2.a9(), unVar2.w5);
                    tL_document = tL_document;
                }
                unVar2.r9(false);
                unVar2.Z.k(tL_document);
                unVar2.Z.setFieldText("");
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                org.telegram.ui.Components.ux uxVar = ((org.telegram.ui.Components.tx) obj6).a;
                String str3 = uxVar.w;
                ArrayList arrayList4 = uxVar.r;
                ArrayList arrayList5 = uxVar.h;
                ArrayList arrayList6 = uxVar.s;
                org.telegram.ui.Components.vy vyVar = uxVar.F;
                if (((String) obj3).equals(str3)) {
                    org.telegram.ui.Components.tv tvVar = vyVar.V;
                    org.telegram.ui.Components.hx hxVar = vyVar.P;
                    tvVar.e(false);
                    uxVar.D = true;
                    s4.g0 adapter = hxVar.getAdapter();
                    org.telegram.ui.Components.ux uxVar2 = vyVar.S;
                    if (adapter != uxVar2) {
                        hxVar.setAdapter(uxVar2);
                    }
                    arrayList5.clear();
                    arrayList5.addAll(uxVar.n);
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    arrayList6.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj8 = arrayList2.get(i16);
                        i16++;
                        org.telegram.ui.Components.nx nxVar = (org.telegram.ui.Components.nx) obj8;
                        if (longSparseIntArray.indexOfKey(nxVar.c.id) < 0) {
                            longSparseIntArray.append(nxVar.c.id, 1);
                            arrayList6.add(nxVar);
                        }
                    }
                    int size2 = arrayList3.size();
                    while (i12 < size2) {
                        Object obj9 = arrayList3.get(i12);
                        i12++;
                        org.telegram.ui.Components.nx nxVar2 = (org.telegram.ui.Components.nx) obj9;
                        if (longSparseIntArray.indexOfKey(nxVar2.c.id) < 0) {
                            longSparseIntArray.append(nxVar2.c.id, 1);
                            arrayList6.add(nxVar2);
                        }
                    }
                    uxVar.f();
                    break;
                }
                break;
            case 4:
                ay ayVar = (ay) obj6;
                Long l10 = (Long) obj4;
                ((org.telegram.ui.ActionBar.x1) obj5).dismiss();
                ayVar.getMessagesController().R2(l10, null, 32);
                ux uxVar3 = ayVar.C2;
                ayVar.removeSelfFromStack();
                ((kd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.k2) obj3).finishFragment();
                if (uxVar3 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(org.telegram.messenger.gs.a(-l10.longValue(), 0L));
                    uxVar3.y(ayVar, arrayList7, null, false, ayVar.J2, ayVar.K2, ayVar.L2, null);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) obj3;
                String str4 = (String) obj;
                ((org.telegram.ui.Wallet.t2) obj6).d = false;
                ((vh.d) obj5).setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.cc.c0(str4, y2Var.E, p6Var);
                }
                k7Var.run();
                break;
            default:
                rh.e4 e4Var = (rh.e4) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    new rh.t0(e4Var.getContext(), e4Var.I0, e4Var.a, starGift.title, arrayList8, false).show();
                } else {
                    e4Var.p2(ecVarArr[0], org.telegram.messenger.cd.a0(null, null, 2131750055, xh.i.I0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[0] = false;
                break;
        }
    }

    public /* synthetic */ pa(org.telegram.ui.Components.tx txVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 3;
        this.b = txVar;
        this.f = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
    }
}
