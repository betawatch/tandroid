// default package

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hu0(rv0 rv0Var, pv0 pv0Var, String str, ot0 ot0Var, String str2) {
        this.a = (byte) 0;
        this.b = rv0Var;
        this.e = pv0Var;
        this.c = str;
        this.f = ot0Var;
        this.d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pcc
    public final void a(Object obj) {
        TLRPC.TL_document tL_document;
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.d;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                rv0 rv0Var = (rv0) obj6;
                pv0 pv0Var = (pv0) obj5;
                String str = (String) obj4;
                ot0 ot0Var = (ot0) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (str3 == null) {
                    rv0Var.u(pv0Var, "secure_storage_failed", rv0.y("req_id", str, "error", "RESTORE_CANCELLED"));
                    break;
                } else {
                    try {
                        ot0Var.j(str3);
                        rv0Var.u(pv0Var, "secure_storage_key_restored", rv0.y("req_id", str, "value", (String) ot0Var.f(str2).first));
                        break;
                    } catch (Exception e) {
                        rv0Var.u(pv0Var, "secure_storage_failed", rv0.y("req_id", str, "error", e.getMessage()));
                        return;
                    }
                }
            case 1:
                hl.c3(new z87((rv0) obj6, (File) obj, (id) obj5, (String) obj4, (String) obj2, (String) obj3));
                break;
            case 2:
                hl.c3(new z87(obj6, obj, obj5, obj4, obj2, obj3, (byte) 6));
                break;
            case 3:
                final zu1 zu1Var = (zu1) obj6;
                wb2 wb2Var = (wb2) obj5;
                String str4 = (String) obj4;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                final TLRPC.User user = (TLRPC.User) obj;
                final TLRPC.UserFull Y1 = user != null ? zu1Var.getMessagesController().Y1(user.id) : null;
                fu5 J = fu5.J(zu1Var, wb2Var);
                mu9 mu9Var = new mu9(zu1Var.getParentActivity(), zu1Var.Ba);
                J.p = new dm1(mu9Var, b2);
                gt gtVar = new gt(zu1Var, user, str4, (byte) 8);
                fu5 K = J.K();
                K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(J, objArr3 == true ? 1 : 0), false);
                K.j();
                K.b(R.drawable.msg_addbot, ob6.M0(2131751682, null), new on1(zu1Var, J, str4, (byte) 2), false);
                K.b(R.drawable.menu_contact_existing, ob6.M0(2131754368, null), new fv0(gtVar, (byte) 27), false);
                byte b3 = 4;
                if (tL_contact == null && (user == null || !zu1Var.getContactsController().g0.containsKey(Long.valueOf(user.id)))) {
                    J.b(R.drawable.msg_contact_add, ob6.M0(2131754370, null), new c10(J, K, b3), false);
                    J.j();
                }
                if (user == null) {
                    J.b(R.drawable.menu_invit_telegram, ob6.M0(2131748861, null), new hl1(zu1Var, str4, (byte) 8), false);
                    J.b(R.drawable.msg_calls_regular, ob6.M0(2131743174, null), new hl1(zu1Var, str4, (byte) 9), false);
                    J.b(R.drawable.msg_copy, ob6.M0(2131751725, null), new hl1(zu1Var, str4, (byte) 10), false);
                    J.j();
                    J.o(13, -1, ob6.M0(2131747560, null));
                } else {
                    J.b(R.drawable.msg_discussion, ob6.M0(2131745329, null), new wn1(zu1Var, user, objArr2 == true ? 1 : 0), false);
                    if (!lbc.D(user)) {
                        String M0 = ob6.M0(2131743173, null);
                        final Object[] objArr4 = objArr == true ? 1 : 0;
                        J.b(R.drawable.msg_calls, M0, new Runnable() { // from class: un1
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = objArr4;
                                zu1 zu1Var2 = zu1Var;
                                switch (b4) {
                                    case 0:
                                        TLRPC.UserFull userFull = Y1;
                                        xkc.m(user, false, userFull != null && userFull.video_calls_available, zu1Var2.getParentActivity(), userFull, zu1Var2.getAccountInstance());
                                        break;
                                    default:
                                        TLRPC.UserFull userFull2 = Y1;
                                        xkc.m(user, true, userFull2 != null && userFull2.video_calls_available, zu1Var2.getParentActivity(), userFull2, zu1Var2.getAccountInstance());
                                        break;
                                }
                            }
                        }, false);
                        final byte b4 = 1;
                        J.b(R.drawable.msg_videocall, ob6.M0(2131743263, null), new Runnable() { // from class: un1
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b42 = b4;
                                zu1 zu1Var2 = zu1Var;
                                switch (b42) {
                                    case 0:
                                        TLRPC.UserFull userFull = Y1;
                                        xkc.m(user, false, userFull != null && userFull.video_calls_available, zu1Var2.getParentActivity(), userFull, zu1Var2.getAccountInstance());
                                        break;
                                    default:
                                        TLRPC.UserFull userFull2 = Y1;
                                        xkc.m(user, true, userFull2 != null && userFull2.video_calls_available, zu1Var2.getParentActivity(), userFull2, zu1Var2.getAccountInstance());
                                        break;
                                }
                            }
                        }, false);
                    }
                    J.b(R.drawable.msg_calls_regular, ob6.M0(2131743174, null), new hl1(zu1Var, str4, (byte) 6), false);
                    J.b(R.drawable.msg_copy, ob6.M0(2131751725, null), new hl1(zu1Var, str4, (byte) 7), false);
                    J.j();
                    J.m(user, ob6.M0(2131743198, null), new on1(zu1Var, mu9Var, user, (byte) 1));
                }
                mu9Var.e(J);
                if (characterStyle instanceof h8c) {
                    String url = ((h8c) characterStyle).getURL();
                    String trim = (url != null ? url : "").trim();
                    if (trim.startsWith("tel:")) {
                        trim = trim.substring(4);
                    }
                    if (trim.length() > 204) {
                        trim = trim.substring(0, jn7.h3).concat("…");
                    }
                    SpannableString spannableString = new SpannableString(trim);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    mu9Var.f(wb2Var, characterStyle, spannableString, false);
                } else {
                    mu9Var.f(wb2Var, characterStyle, null, false);
                }
                zu1Var.showDialog(mu9Var);
                break;
            case 4:
                zu1 zu1Var2 = (zu1) obj6;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) obj5;
                String str5 = (String) obj4;
                n47 n47Var = (n47) obj3;
                Long l = (Long) obj;
                int i2 = zu1Var2.g4;
                Object obj7 = this.d;
                if (i2 == 1) {
                    jj.J(zu1Var2.getParentActivity(), zu1Var2.l6, new pt((Object) zu1Var2, (Object) tL_document2, obj7, str5, (byte) 3), zu1Var2.Ba);
                    tL_document = tL_document2;
                } else {
                    tL_document = tL_document2;
                    zu1Var2.getSendMessagesHelper().t0(tL_document, str5, zu1Var2.l6, zu1Var2.F5, zu1Var2.m4, null, zu1Var2.D5, n47Var, true, 0, 0, false, obj7, zu1Var2.X6(), l.longValue(), zu1Var2.k7(), zu1Var2.y5);
                }
                zu1Var2.E7(false);
                zu1Var2.a0.j(tL_document);
                zu1Var2.a0.setFieldText("");
                break;
            case 5:
                uj3 uj3Var = (uj3) obj6;
                Long l2 = (Long) obj4;
                ((id) obj5).dismiss();
                uj3Var.getMessagesController().c3(l2, null, 32);
                oj3 oj3Var = uj3Var.E2;
                uj3Var.removeSelfFromStack();
                ((gi1) obj2).removeSelfFromStack();
                ((e) obj3).finishFragment();
                if (oj3Var != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(if7.a(-l2.longValue(), 0L));
                    oj3Var.q(uj3Var, arrayList, null, false, uj3Var.L2, uj3Var.M2, uj3Var.N2, null);
                    break;
                }
                break;
            case 6:
                ArrayList arrayList2 = (ArrayList) obj5;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj3;
                o14 o14Var = ((n14) obj6).a;
                String str6 = o14Var.w;
                ArrayList arrayList5 = o14Var.r;
                ArrayList arrayList6 = o14Var.h;
                ArrayList arrayList7 = o14Var.s;
                o24 o24Var = o14Var.G;
                b14 b14Var = o24Var.Q;
                if (((String) obj4).equals(str6)) {
                    o24Var.W.d(false);
                    o14Var.E = true;
                    j79 adapter = b14Var.getAdapter();
                    o14 o14Var2 = o24Var.T;
                    if (adapter != o14Var2) {
                        b14Var.setAdapter(o14Var2);
                    }
                    arrayList6.clear();
                    arrayList6.addAll(o14Var.n);
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    arrayList7.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj8 = arrayList3.get(i3);
                        i3++;
                        h14 h14Var = (h14) obj8;
                        if (longSparseIntArray.indexOfKey(h14Var.c.id) < 0) {
                            longSparseIntArray.append(h14Var.c.id, 1);
                            arrayList7.add(h14Var);
                        }
                    }
                    int size2 = arrayList4.size();
                    while (i < size2) {
                        Object obj9 = arrayList4.get(i);
                        i++;
                        h14 h14Var2 = (h14) obj9;
                        if (longSparseIntArray.indexOfKey(h14Var2.c.id) < 0) {
                            longSparseIntArray.append(h14Var2.c.id, 1);
                            arrayList7.add(h14Var2);
                        }
                    }
                    o14Var.f();
                    break;
                }
                break;
            case 7:
                sk7 sk7Var = (sk7) obj4;
                vnb vnbVar = (vnb) obj2;
                ao1 ao1Var = (ao1) obj3;
                String str7 = (String) obj;
                ((n55) obj6).d = false;
                ((c51) obj5).setLoading(false);
                if (str7 != null) {
                    d31.d0(str7, sk7Var.F, vnbVar);
                }
                ao1Var.run();
                break;
            case 8:
                wua wuaVar = (wua) obj6;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj4;
                y41[] y41VarArr = (y41[]) obj2;
                boolean[] zArr = (boolean[]) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    new gra(wuaVar.getContext(), wuaVar.J0, wuaVar.a, starGift.title, arrayList8, false).show();
                } else {
                    wuaVar.v2(y41VarArr[0], ob6.a0(null, null, 2131750004, cc.J0(starGiftAttribute.getRarityPermille())), false);
                }
                zArr[0] = false;
                break;
            default:
                qsb qsbVar = (qsb) obj4;
                rxc rxcVar = (rxc) obj2;
                pcc pccVar = (pcc) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                qsb.a((psb) obj6);
                if (!((boolean[]) obj5)[0]) {
                    psb d = qsb.d(qsbVar, "parseJSON");
                    try {
                        rxcVar.c = rxcVar.i(rxcVar.a, jSONObject);
                    } catch (Exception e2) {
                        qsb.c(qsbVar, "error: " + e2);
                        cc4.g(e2, true);
                    }
                    qsb.a(d);
                    pccVar.a(rxcVar);
                    TLRPC.TL_webPage tL_webPage = rxcVar.c;
                    if (tL_webPage != null) {
                        rxc.e.put(tL_webPage, rxcVar);
                    }
                    qsb.b(qsbVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hu0(n14 n14Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 6;
        this.b = n14Var;
        this.c = str;
        this.e = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    public /* synthetic */ hu0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
