package di;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.yw;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.de;
import org.telegram.ui.ee;
import org.telegram.ui.eg;
import org.telegram.ui.fq0;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
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
    @Override // org.telegram.messenger.z10
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
                c6 c6Var = (c6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.ec[] ecVarArr = (org.telegram.ui.Components.ec[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new i1(c6Var.getContext(), c6Var.J0, c6Var.a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    c6Var.q2(ecVarArr[0], hd.a0(null, null, 2131750046, ki.k.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                break;
            case 1:
                org.telegram.messenger.g0.h3(new bi.p1((org.telegram.ui.lb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ua) obj3, 12));
                break;
            case 2:
                final an anVar = (an) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull b22 = user != null ? anVar.getMessagesController().b2(user.id) : null;
                m60 I = m60.I(anVar, q1Var);
                ok0 ok0Var = new ok0(anVar.getParentActivity(), anVar.Aa);
                I.p = new de(ok0Var, i10);
                org.telegram.ui.x xVar = new org.telegram.ui.x(anVar, user, str, 3);
                m60 J = I.J();
                J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new fq0(I, 27), false);
                J.k();
                J.c(R.drawable.msg_addbot, hd.M0(2131751717, null), new org.telegram.ui.o1(anVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, hd.M0(2131754375, null), new fq0(xVar, 28), false);
                if (tL_contact == null && (user == null || !anVar.getContactsController().g0.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, hd.M0(2131754377, null), new bi.n3(I, J, 5), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, hd.M0(2131749107, null), new ee(anVar, str, 10), false);
                    I.c(R.drawable.msg_calls_regular, hd.M0(2131743522, null), new ee(anVar, str, 11), false);
                    I.c(R.drawable.msg_copy, hd.M0(2131751760, null), new ee(anVar, str, 12), false);
                    I.k();
                    I.p(13, -1, hd.M0(2131747833, null));
                } else {
                    final int i12 = 0;
                    I.c(R.drawable.msg_discussion, hd.M0(2131745601, null), new eg(anVar, user, i12), false);
                    if (!q10.B(user)) {
                        I.c(R.drawable.msg_calls, hd.M0(2131743521, null), new Runnable() { // from class: org.telegram.ui.dg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (i12) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            anVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.c2.m(user, false, z13, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z132, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            anVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z14, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z142, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i13 = 1;
                        I.c(R.drawable.msg_videocall, hd.M0(2131743608, null), new Runnable() { // from class: org.telegram.ui.dg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (i13) {
                                    case 0:
                                        an anVar2 = anVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            anVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.c2.m(user, false, z132, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.c2.m(user, false, z1322, anVar2.getParentActivity(), userFull, anVar2.getAccountInstance());
                                    default:
                                        an anVar3 = anVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            anVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.c2.m(user, true, z142, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.c2.m(user, true, z1422, anVar3.getParentActivity(), userFull2, anVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, hd.M0(2131743522, null), new ee(anVar, str, 8), false);
                    I.c(R.drawable.msg_copy, hd.M0(2131751760, null), new ee(anVar, str, 9), false);
                    I.k();
                    I.n(user, hd.M0(2131743546, null), new org.telegram.ui.o1(anVar, ok0Var, user, 18));
                }
                ok0Var.e(I);
                if (characterStyle instanceof h41) {
                    String url = ((h41) characterStyle).getURL();
                    String trim = (url != null ? url : "").trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r15 = 0;
                        sb2.append(trim.substring(0, ns.i3));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r15 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r15, spannableString.length(), 33);
                    ok0Var.f(q1Var, characterStyle, spannableString, r15);
                } else {
                    ok0Var.f(q1Var, characterStyle, null, false);
                }
                anVar.showDialog(ok0Var);
                break;
            case 3:
                an anVar2 = (an) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str2 = (String) obj4;
                cj cjVar = (cj) obj3;
                Long l10 = (Long) obj;
                int i14 = anVar2.g4;
                Object obj7 = this.e;
                if (i14 == 1) {
                    org.telegram.ui.Components.t4.J(anVar2.getParentActivity(), anVar2.k6, new a1.d(anVar2, tL_document, str2, obj7, 7), anVar2.Aa);
                } else {
                    anVar2.getSendMessagesHelper().v0(tL_document, str2, anVar2.k6, anVar2.E5, anVar2.m4, null, anVar2.C5, cjVar, true, 0, 0, false, obj7, anVar2.Y8(), l10.longValue(), anVar2.j9(), anVar2.x5);
                    tL_document = tL_document;
                }
                anVar2.D9(false);
                anVar2.a0.m(tL_document);
                anVar2.a0.setFieldText("");
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                lx lxVar = ((kx) obj6).a;
                String str3 = lxVar.w;
                ArrayList arrayList5 = lxVar.r;
                ArrayList arrayList6 = lxVar.h;
                ArrayList arrayList7 = lxVar.s;
                ly lyVar = lxVar.G;
                if (((String) obj5).equals(str3)) {
                    nv nvVar = lyVar.W;
                    yw ywVar = lyVar.Q;
                    nvVar.e(false);
                    lxVar.E = true;
                    v4.h0 adapter = ywVar.getAdapter();
                    lx lxVar2 = lyVar.T;
                    if (adapter != lxVar2) {
                        ywVar.setAdapter(lxVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(lxVar.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj8 = arrayList3.get(i15);
                        i15++;
                        ex exVar = (ex) obj8;
                        if (longSparseIntArray.indexOfKey(exVar.c.id) < 0) {
                            longSparseIntArray.append(exVar.c.id, 1);
                            arrayList7.add(exVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        Object obj9 = arrayList4.get(i11);
                        i11++;
                        ex exVar2 = (ex) obj9;
                        if (longSparseIntArray.indexOfKey(exVar2.c.id) < 0) {
                            longSparseIntArray.append(exVar2.c.id, 1);
                            arrayList7.add(exVar2);
                        }
                    }
                    lxVar.f();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) obj6;
                Long l11 = (Long) obj4;
                ((org.telegram.ui.ActionBar.t1) obj5).dismiss();
                ywVar2.getMessagesController().T2(l11, null, 32);
                sw swVar = ywVar2.E2;
                ywVar2.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.e2) obj3).finishFragment();
                if (swVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(ur.a(-l11.longValue(), 0L));
                    swVar.y(ywVar2, arrayList8, null, false, ywVar2.L2, ywVar2.M2, ywVar2.N2, null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) obj3;
                String str4 = (String) obj;
                ((org.telegram.ui.Wallet.r2) obj6).d = false;
                ((hi.d) obj5).setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.cc.c0(str4, w2Var.F, e6Var);
                }
                g7Var.run();
                break;
        }
    }
}
