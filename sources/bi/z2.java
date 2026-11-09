package bi;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ej;
import org.telegram.messenger.qs;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.tw;
import org.telegram.ui.Components.zw;
import org.telegram.ui.cn;
import org.telegram.ui.ge;
import org.telegram.ui.he;
import org.telegram.ui.hg;
import org.telegram.ui.iq0;
import org.telegram.ui.sw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        boolean z9;
        ?? r10;
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
                k7 k7Var = (k7) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.jc[] jcVarArr = (org.telegram.ui.Components.jc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new w1(k7Var.getContext(), k7Var.I0, k7Var.a, starGift.title, arrayList, false).show();
                    z9 = false;
                } else {
                    z9 = false;
                    k7Var.p2(jcVarArr[0], org.telegram.messenger.id.a0(null, null, 2131750046, hi.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z9 ? 1 : 0] = z9;
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a3((org.telegram.ui.mb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 11));
                break;
            case 2:
                final cn cnVar = (cn) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull b22 = user != null ? cnVar.getMessagesController().b2(user.id) : null;
                l60 I = l60.I(cnVar, q1Var);
                kk0 kk0Var = new kk0(cnVar.getParentActivity(), cnVar.za);
                I.p = new ge(kk0Var, i10);
                org.telegram.ui.y yVar = new org.telegram.ui.y(cnVar, user, str, 3);
                l60 J = I.J();
                J.c(R.drawable.ic_ab_back, org.telegram.messenger.id.M0(2131753756, null), new iq0(I, 27), false);
                J.k();
                J.c(R.drawable.msg_addbot, org.telegram.messenger.id.M0(2131751717, null), new org.telegram.ui.o1(cnVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, org.telegram.messenger.id.M0(2131754375, null), new iq0(yVar, 28), false);
                int i12 = 4;
                if (tL_contact == null && (user == null || !cnVar.getContactsController().f0.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131754377, null), new hi.h2(I, J, i12), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, org.telegram.messenger.id.M0(2131749107, null), new he(cnVar, str, 10), false);
                    I.c(R.drawable.msg_calls_regular, org.telegram.messenger.id.M0(2131743522, null), new he(cnVar, str, 11), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751760, null), new he(cnVar, str, 12), false);
                    I.k();
                    I.p(13, -1, org.telegram.messenger.id.M0(2131747833, null));
                } else {
                    final int i13 = 0;
                    I.c(R.drawable.msg_discussion, org.telegram.messenger.id.M0(2131745601, null), new hg(cnVar, user, i13), false);
                    if (!t10.B(user)) {
                        I.c(R.drawable.msg_calls, org.telegram.messenger.id.M0(2131743521, null), new Runnable() { // from class: org.telegram.ui.gg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i13) {
                                    case 0:
                                        cn cnVar2 = cnVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            cnVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z12, cnVar2.getParentActivity(), userFull, cnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z122, cnVar2.getParentActivity(), userFull, cnVar2.getAccountInstance());
                                    default:
                                        cn cnVar3 = cnVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            cnVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z13, cnVar3.getParentActivity(), userFull2, cnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z132, cnVar3.getParentActivity(), userFull2, cnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i14 = 1;
                        I.c(R.drawable.msg_videocall, org.telegram.messenger.id.M0(2131743608, null), new Runnable() { // from class: org.telegram.ui.gg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i14) {
                                    case 0:
                                        cn cnVar2 = cnVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            cnVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z122, cnVar2.getParentActivity(), userFull, cnVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z1222, cnVar2.getParentActivity(), userFull, cnVar2.getAccountInstance());
                                    default:
                                        cn cnVar3 = cnVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            cnVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z132, cnVar3.getParentActivity(), userFull2, cnVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z1322, cnVar3.getParentActivity(), userFull2, cnVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, org.telegram.messenger.id.M0(2131743522, null), new he(cnVar, str, 8), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751760, null), new he(cnVar, str, 9), false);
                    I.k();
                    I.n(user, org.telegram.messenger.id.M0(2131743546, null), new org.telegram.ui.o1(cnVar, kk0Var, user, 18));
                }
                kk0Var.e(I);
                if (characterStyle instanceof e41) {
                    String url = ((e41) characterStyle).getURL();
                    String trim = (url != null ? url : "").trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r10 = 0;
                        sb2.append(trim.substring(0, qs.i3));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r10 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r10, spannableString.length(), 33);
                    kk0Var.f(q1Var, characterStyle, spannableString, r10);
                } else {
                    kk0Var.f(q1Var, characterStyle, null, false);
                }
                cnVar.showDialog(kk0Var);
                break;
            case 3:
                cn cnVar2 = (cn) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str2 = (String) obj4;
                ej ejVar = (ej) obj3;
                Long l10 = (Long) obj;
                int i15 = cnVar2.f4;
                Object obj7 = this.e;
                if (i15 == 1) {
                    org.telegram.ui.Components.v4.J(cnVar2.getParentActivity(), cnVar2.j6, new a1.d(cnVar2, tL_document, str2, obj7, 7), cnVar2.za);
                } else {
                    cnVar2.getSendMessagesHelper().v0(tL_document, str2, cnVar2.j6, cnVar2.D5, cnVar2.l4, null, cnVar2.B5, ejVar, true, 0, 0, false, obj7, cnVar2.X8(), l10.longValue(), cnVar2.i9(), cnVar2.w5);
                    tL_document = tL_document;
                }
                cnVar2.C9(false);
                cnVar2.Z.l(tL_document);
                cnVar2.Z.setFieldText("");
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                hx hxVar = ((gx) obj6).a;
                String str3 = hxVar.w;
                ArrayList arrayList5 = hxVar.r;
                ArrayList arrayList6 = hxVar.h;
                ArrayList arrayList7 = hxVar.s;
                hy hyVar = hxVar.F;
                if (((String) obj5).equals(str3)) {
                    iv ivVar = hyVar.V;
                    tw twVar = hyVar.P;
                    ivVar.e(false);
                    hxVar.D = true;
                    v4.g0 adapter = twVar.getAdapter();
                    hx hxVar2 = hyVar.S;
                    if (adapter != hxVar2) {
                        twVar.setAdapter(hxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(hxVar.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj8 = arrayList3.get(i16);
                        i16++;
                        zw zwVar = (zw) obj8;
                        if (longSparseIntArray.indexOfKey(zwVar.c.id) < 0) {
                            longSparseIntArray.append(zwVar.c.id, 1);
                            arrayList7.add(zwVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        Object obj9 = arrayList4.get(i11);
                        i11++;
                        zw zwVar2 = (zw) obj9;
                        if (longSparseIntArray.indexOfKey(zwVar2.c.id) < 0) {
                            longSparseIntArray.append(zwVar2.c.id, 1);
                            arrayList7.add(zwVar2);
                        }
                    }
                    hxVar.f();
                    break;
                }
                break;
            case 5:
                yw ywVar = (yw) obj6;
                Long l11 = (Long) obj4;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                ywVar.getMessagesController().T2(l11, null, 32);
                sw swVar = ywVar.D2;
                ywVar.removeSelfFromStack();
                ((org.telegram.ui.bd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.f2) obj3).finishFragment();
                if (swVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(xr.a(-l11.longValue(), 0L));
                    swVar.y(ywVar, arrayList8, null, false, ywVar.K2, ywVar.L2, ywVar.M2, null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj4;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) obj3;
                String str4 = (String) obj;
                ((org.telegram.ui.Wallet.s2) obj6).d = false;
                ((fi.d) obj5).setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.hc.c0(str4, x2Var.E, g6Var);
                }
                e7Var.run();
                break;
        }
    }
}
