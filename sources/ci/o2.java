package ci;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.pr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.rw;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xw;
import org.telegram.ui.ad;
import org.telegram.ui.ee;
import org.telegram.ui.fe;
import org.telegram.ui.nw;
import org.telegram.ui.uf;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
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
    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        boolean z10;
        ?? r15;
        int i3 = this.a;
        int i10 = 1;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i11 = 0;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                org.telegram.ui.Components.hc[] hcVarArr = (org.telegram.ui.Components.hc[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    new p1(l6Var.getContext(), l6Var.J0, l6Var.a, starGift.title, arrayList, false).show();
                    z10 = false;
                } else {
                    z10 = false;
                    l6Var.p2(hcVarArr[0], bd.a0(null, null, 2131750054, ii.k.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[z10 ? 1 : 0] = z10;
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ai.w1((org.telegram.ui.kb) obj6, (TLRPC.ChannelParticipant) obj, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj2, (org.telegram.ui.ta) obj3, 12));
                break;
            case 2:
                final wm wmVar = (wm) obj6;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj5;
                String str = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull b22 = user != null ? wmVar.getMessagesController().b2(user.id) : null;
                f60 I = f60.I(wmVar, q1Var);
                nk0 nk0Var = new nk0(wmVar.getParentActivity(), wmVar.ya);
                I.p = new ee(nk0Var, i10);
                org.telegram.ui.z zVar = new org.telegram.ui.z(wmVar, user, str, 2);
                f60 J = I.J();
                J.c(R.drawable.ic_ab_back, bd.M0(2131753756, null), new xp0(I, 27), false);
                J.k();
                J.c(R.drawable.msg_addbot, bd.M0(2131751718, null), new org.telegram.ui.p1(wmVar, I, str), false);
                J.c(R.drawable.menu_contact_existing, bd.M0(2131754375, null), new xp0(zVar, 28), false);
                if (tL_contact == null && (user == null || !wmVar.getContactsController().g0.containsKey(Long.valueOf(user.id)))) {
                    I.c(R.drawable.msg_contact_add, bd.M0(2131754377, null), new ai.y3(I, J, 5), false);
                    I.k();
                }
                if (user == null) {
                    I.c(R.drawable.menu_invit_telegram, bd.M0(2131749115, null), new fe(wmVar, str, 10), false);
                    I.c(R.drawable.msg_calls_regular, bd.M0(2131743532, null), new fe(wmVar, str, 11), false);
                    I.c(R.drawable.msg_copy, bd.M0(2131751760, null), new fe(wmVar, str, 12), false);
                    I.k();
                    I.p(13, -1, bd.M0(2131747841, null));
                } else {
                    final int i12 = 0;
                    I.c(R.drawable.msg_discussion, bd.M0(2131745611, null), new uf(wmVar, user, i12), false);
                    if (!l10.B(user)) {
                        I.c(R.drawable.msg_calls, bd.M0(2131743531, null), new Runnable() { // from class: org.telegram.ui.sf
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (i12) {
                                    case 0:
                                        wm wmVar2 = wmVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            wmVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z11 = true;
                                                boolean z13 = z11;
                                                org.telegram.ui.Components.voip.n1.m(user, false, z13, wmVar2.getParentActivity(), userFull, wmVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z132 = z11;
                                        org.telegram.ui.Components.voip.n1.m(user, false, z132, wmVar2.getParentActivity(), userFull, wmVar2.getAccountInstance());
                                    default:
                                        wm wmVar3 = wmVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            wmVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z12 = true;
                                                boolean z14 = z12;
                                                org.telegram.ui.Components.voip.n1.m(user, true, z14, wmVar3.getParentActivity(), userFull2, wmVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z12 = false;
                                        boolean z142 = z12;
                                        org.telegram.ui.Components.voip.n1.m(user, true, z142, wmVar3.getParentActivity(), userFull2, wmVar3.getAccountInstance());
                                }
                            }
                        }, false);
                        final int i13 = 1;
                        I.c(R.drawable.msg_videocall, bd.M0(2131743618, null), new Runnable() { // from class: org.telegram.ui.sf
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                switch (i13) {
                                    case 0:
                                        wm wmVar2 = wmVar;
                                        TLRPC.UserFull userFull = b22;
                                        if (userFull != null) {
                                            wmVar2.getClass();
                                            if (userFull.video_calls_available) {
                                                z11 = true;
                                                boolean z132 = z11;
                                                org.telegram.ui.Components.voip.n1.m(user, false, z132, wmVar2.getParentActivity(), userFull, wmVar2.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z11 = false;
                                        boolean z1322 = z11;
                                        org.telegram.ui.Components.voip.n1.m(user, false, z1322, wmVar2.getParentActivity(), userFull, wmVar2.getAccountInstance());
                                    default:
                                        wm wmVar3 = wmVar;
                                        TLRPC.UserFull userFull2 = b22;
                                        if (userFull2 != null) {
                                            wmVar3.getClass();
                                            if (userFull2.video_calls_available) {
                                                z12 = true;
                                                boolean z142 = z12;
                                                org.telegram.ui.Components.voip.n1.m(user, true, z142, wmVar3.getParentActivity(), userFull2, wmVar3.getAccountInstance());
                                                break;
                                            }
                                        }
                                        z12 = false;
                                        boolean z1422 = z12;
                                        org.telegram.ui.Components.voip.n1.m(user, true, z1422, wmVar3.getParentActivity(), userFull2, wmVar3.getAccountInstance());
                                }
                            }
                        }, false);
                    }
                    I.c(R.drawable.msg_calls_regular, bd.M0(2131743532, null), new fe(wmVar, str, 8), false);
                    I.c(R.drawable.msg_copy, bd.M0(2131751760, null), new fe(wmVar, str, 9), false);
                    I.k();
                    I.n(user, bd.M0(2131743556, null), new org.telegram.ui.p1(wmVar, nk0Var, user, 17));
                }
                nk0Var.e(I);
                if (characterStyle instanceof x31) {
                    String url = ((x31) characterStyle).getURL();
                    String trim = (url != null ? url : "").trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        StringBuilder sb2 = new StringBuilder();
                        r15 = 0;
                        sb2.append(trim.substring(0, hs.i3));
                        sb2.append("…");
                        trim = sb2.toString();
                    } else {
                        r15 = 0;
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, r15, spannableString.length(), 33);
                    nk0Var.f(q1Var, characterStyle, spannableString, r15);
                } else {
                    nk0Var.f(q1Var, characterStyle, null, false);
                }
                wmVar.showDialog(nk0Var);
                break;
            case 3:
                wm wmVar2 = (wm) obj6;
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj5;
                String str2 = (String) obj4;
                vi viVar = (vi) obj3;
                Long l10 = (Long) obj;
                int i14 = wmVar2.g4;
                Object obj7 = this.e;
                if (i14 == 1) {
                    org.telegram.ui.Components.t4.L(wmVar2.getParentActivity(), wmVar2.k6, new a1.d(wmVar2, tL_document, str2, obj7, 6), wmVar2.ya);
                } else {
                    wmVar2.getSendMessagesHelper().v0(tL_document, str2, wmVar2.k6, wmVar2.E5, wmVar2.m4, null, wmVar2.C5, viVar, true, 0, 0, false, obj7, wmVar2.W8(), l10.longValue(), wmVar2.h9(), wmVar2.x5);
                    tL_document = tL_document;
                }
                wmVar2.B9(false);
                wmVar2.a0.l(tL_document);
                wmVar2.a0.setFieldText("");
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                ex exVar = ((dx) obj6).a;
                String str3 = exVar.w;
                ArrayList arrayList5 = exVar.r;
                ArrayList arrayList6 = exVar.h;
                ArrayList arrayList7 = exVar.s;
                ey eyVar = exVar.G;
                if (((String) obj5).equals(str3)) {
                    gv gvVar = eyVar.W;
                    rw rwVar = eyVar.Q;
                    gvVar.e(false);
                    exVar.E = true;
                    u4.h0 adapter = rwVar.getAdapter();
                    ex exVar2 = eyVar.T;
                    if (adapter != exVar2) {
                        rwVar.setAdapter(exVar2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(exVar.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj8 = arrayList3.get(i15);
                        i15++;
                        xw xwVar = (xw) obj8;
                        if (longSparseIntArray.indexOfKey(xwVar.c.id) < 0) {
                            longSparseIntArray.append(xwVar.c.id, 1);
                            arrayList7.add(xwVar);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i11 < size2) {
                        Object obj9 = arrayList4.get(i11);
                        i11++;
                        xw xwVar2 = (xw) obj9;
                        if (longSparseIntArray.indexOfKey(xwVar2.c.id) < 0) {
                            longSparseIntArray.append(xwVar2.c.id, 1);
                            arrayList7.add(xwVar2);
                        }
                    }
                    exVar.f();
                    break;
                }
                break;
            case 5:
                uw uwVar = (uw) obj6;
                Long l11 = (Long) obj4;
                ((org.telegram.ui.ActionBar.s1) obj5).dismiss();
                uwVar.getMessagesController().T2(l11, null, 32);
                nw nwVar = uwVar.D2;
                uwVar.removeSelfFromStack();
                ((ad) obj2).removeSelfFromStack();
                ((org.telegram.ui.ActionBar.d2) obj3).finishFragment();
                if (nwVar != null) {
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(pr.a(-l11.longValue(), 0L));
                    nwVar.y(uwVar, arrayList8, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) obj3;
                String str4 = (String) obj;
                ((org.telegram.ui.Wallet.s2) obj6).d = false;
                ((gi.d) obj5).setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.fc.c0(str4, x2Var.F, e6Var);
                }
                e7Var.run();
                break;
        }
    }
}
