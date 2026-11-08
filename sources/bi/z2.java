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
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.tw;
import org.telegram.ui.Components.zw;
import org.telegram.ui.an;
import org.telegram.ui.ge;
import org.telegram.ui.gq0;
import org.telegram.ui.he;
import org.telegram.ui.qw;
import org.telegram.ui.ww;
import org.telegram.ui.yf;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                    k7Var.p2(jcVarArr[0], org.telegram.messenger.id.a0(null, null, 2131750047, hi.j.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z9 ? 1 : 0] = z9;
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a3((org.telegram.ui.mb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 11));
                break;
            case 2:
                final an anVar = (an) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull b22 = user != null ? anVar.getMessagesController().b2(user.id) : null;
                k60 I = k60.I(anVar, q1Var);
                jk0 jk0Var = new jk0(anVar.getParentActivity(), anVar.xa);
                I.p = new ge(jk0Var, i10);
                org.telegram.ui.y yVar = new org.telegram.ui.y(anVar, user, str, 2);
                k60 J = I.J();
                J.c(R.drawable.ic_ab_back, org.telegram.messenger.id.M0(2131753756, null), new gq0(I, 27), false);
                J.k();
                J.c(R.drawable.msg_addbot, org.telegram.messenger.id.M0(2131751718, null), new org.telegram.ui.o1(anVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, org.telegram.messenger.id.M0(2131754375, null), new gq0(yVar, 28), false);
                int i12 = 4;
                if (tL_contact == null && (user == null || !anVar.getContactsController().f0.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131754377, null), new hi.h2(I, J, i12), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, org.telegram.messenger.id.M0(2131749108, null), new he(anVar, str, 10), false);
                    I.c(R.drawable.msg_calls_regular, org.telegram.messenger.id.M0(2131743525, null), new he(anVar, str, 11), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751760, null), new he(anVar, str, 12), false);
                    I.k();
                    I.p(13, -1, org.telegram.messenger.id.M0(2131747834, null));
                } else {
                    final int i13 = 0;
                    I.c(R.drawable.msg_discussion, org.telegram.messenger.id.M0(2131745604, null), new yf(anVar, user, i13), false);
                    if (!t10.B(user)) {
                        I.c(R.drawable.msg_calls, org.telegram.messenger.id.M0(2131743524, null), new Runnable() { // from class: org.telegram.ui.wf
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i13) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            anVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z10 = true;
                                                boolean z12 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z12, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z122 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z122, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            anVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z13, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z132, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i14 = 1;
                        I.c(R.drawable.msg_videocall, org.telegram.messenger.id.M0(2131743611, null), new Runnable() { // from class: org.telegram.ui.wf
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z10;
                                boolean z11;
                                switch (i14) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            anVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z10 = true;
                                                boolean z122 = z10;
                                                org.telegram.ui.Components.voip.y1.m(user, false, z122, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z10 = false;
                                        boolean z1222 = z10;
                                        org.telegram.ui.Components.voip.y1.m(user, false, z1222, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            anVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.y1.m(user, true, z132, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.y1.m(user, true, z1322, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, org.telegram.messenger.id.M0(2131743525, null), new he(anVar, str, 8), false);
                    I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131751760, null), new he(anVar, str, 9), false);
                    I.k();
                    I.n(user, org.telegram.messenger.id.M0(2131743549, null), new org.telegram.ui.o1(anVar, jk0Var, user, 17));
                }
                jk0Var.e(I);
                if (characterStyle instanceof d41) {
                    String url = ((d41) characterStyle).getURL();
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
                    jk0Var.f(q1Var, characterStyle, spannableString, r10);
                } else {
                    jk0Var.f(q1Var, characterStyle, null, false);
                }
                anVar.showDialog(jk0Var);
                break;
            case 3:
                an anVar2 = (an) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str2 = (String) obj4;
                ej ejVar = (ej) obj3;
                Long l10 = (Long) obj;
                int i15 = anVar2.f4;
                Object obj7 = this.e;
                if (i15 == 1) {
                    org.telegram.ui.Components.v4.J(anVar2.getParentActivity(), anVar2.j6, new a1.d(anVar2, tL_document, str2, obj7, 7), anVar2.xa);
                } else {
                    anVar2.getSendMessagesHelper().v0(tL_document, str2, anVar2.j6, anVar2.D5, anVar2.l4, null, anVar2.B5, ejVar, true, 0, 0, false, obj7, anVar2.W8(), l10.longValue(), anVar2.h9(), anVar2.w5);
                    tL_document = tL_document;
                }
                anVar2.B9(false);
                anVar2.Z.l(tL_document);
                anVar2.Z.setFieldText("");
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
                ww wwVar = (ww) obj6;
                Long l11 = (Long) obj4;
                ((org.telegram.ui.ActionBar.u1) obj5).dismiss();
                wwVar.getMessagesController().T2(l11, null, 32);
                qw qwVar = wwVar.C2;
                wwVar.removeSelfFromStack();
                ((org.telegram.ui.bd) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.f2) obj3).finishFragment();
                if (qwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(xr.a(-l11.longValue(), 0L));
                    qwVar.y(wwVar, arrayList8, null, false, wwVar.J2, wwVar.K2, wwVar.L2, null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                org.telegram.ui.Wallet.f7 f7Var = (org.telegram.ui.Wallet.f7) obj3;
                String str4 = (String) obj;
                ((org.telegram.ui.Wallet.t2) obj6).d = false;
                ((fi.d) obj5).setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.hc.c0(str4, y2Var.E, f6Var);
                }
                f7Var.run();
                break;
        }
    }
}
