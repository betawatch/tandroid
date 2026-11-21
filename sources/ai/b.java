package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bi.d9;
import bi.f8;
import bi.p4;
import bi.s8;
import di.v6;
import di.y8;
import fi.a6;
import fi.b5;
import fi.c3;
import fi.e9;
import fi.f9;
import fi.k4;
import fi.l3;
import fi.n3;
import fi.r3;
import fi.w3;
import fi.y3;
import fi.z3;
import hi.c7;
import hi.cb;
import hi.k8;
import hi.n8;
import hi.na;
import hi.p8;
import hi.sa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.e7;
import org.telegram.ui.gb;
import org.telegram.ui.ka;
import org.telegram.ui.l7;
import org.telegram.ui.la;
import org.telegram.ui.lb;
import org.telegram.ui.ml0;
import org.telegram.ui.mm;
import org.telegram.ui.q5;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.s7;
import org.telegram.ui.vb;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(y8 y8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, q10 q10Var) {
        this.a = 5;
        this.c = y8Var;
        this.b = zArr;
        this.d = str;
        this.e = chatInvite;
        this.f = q10Var;
    }

    private final void a() {
        la laVar = (la) this.b;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
        laVar.e = 0;
        String str2 = laVar.f;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            org.telegram.ui.Cells.c2 c2Var = laVar.H;
            if (c2Var != null) {
                c2Var.setText(gd.a0("UsernameAvailable", null, 2131743424, str));
                org.telegram.ui.Cells.c2 c2Var2 = laVar.H;
                int i7 = m6.w6;
                c2Var2.setTag(Integer.valueOf(i7));
                t6.U(laVar.H, i7, null);
                ka kaVar = laVar.G;
                if (kaVar != null) {
                    ka.a(kaVar);
                    return;
                }
                return;
            }
            return;
        }
        if (laVar.H != null) {
            if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && checkusername.username.length() == 4) {
                laVar.H.setText(gd.N0(2131743411, null));
                org.telegram.ui.Cells.c2 c2Var3 = laVar.H;
                int i10 = m6.p7;
                c2Var3.setTag(Integer.valueOf(i10));
                t6.U(laVar.H, i10, null);
            } else if (tL_error == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                laVar.H.setText(gd.N0(2131743415, null));
                org.telegram.ui.Cells.c2 c2Var4 = laVar.H;
                int i11 = m6.p7;
                c2Var4.setTag(Integer.valueOf(i11));
                t6.U(laVar.H, i11, null);
            } else {
                if (checkusername.username.length() == 4) {
                    laVar.H.setText(gd.N0(2131743410, null));
                } else {
                    laVar.H.setText(gd.N0(2131743414, null));
                }
                org.telegram.ui.Cells.c2 c2Var5 = laVar.H;
                int i12 = m6.F6;
                c2Var5.setTag(Integer.valueOf(i12));
                t6.U(laVar.H, i12, null);
            }
            ka kaVar2 = laVar.G;
            if (kaVar2 != null) {
                ka.a(kaVar2);
            }
        }
    }

    private final void b() {
        int i7;
        qc qcVar = (qc) this.c;
        boolean[] zArr = (boolean[]) this.b;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        if (zArr[0] || (i7 = iArr[0]) >= iArr2[0]) {
            return;
        }
        int i10 = 1;
        if (tL_error != null) {
            zArr[0] = true;
            if ("BOOSTS_REQUIRED".equals(tL_error.text)) {
                qcVar.getMessagesController().I0().b(qcVar.a, qcVar.c, new vb(qcVar, i10));
                return;
            } else {
                qcVar.Q.setLoading(false);
                lc.b0(qcVar).Q(R.raw.error, 36, gd.a0(null, null, 2131743635, tL_error.text)).j();
                return;
            }
        }
        int i11 = i7 + 1;
        iArr[0] = i11;
        if (i11 == iArr2[0]) {
            qcVar.finishFragment();
            org.telegram.ui.ActionBar.g2 g2Var = qcVar.m0;
            if (g2Var != null) {
                if (g2Var instanceof rn) {
                    ((rn) g2Var).t0();
                }
                f3.n(null, qcVar.d ? 2131749305 : 2131752447, lc.b0(qcVar.m0), R.raw.contact_check, 36);
                qcVar.m0 = null;
            }
            qcVar.Q.setLoading(false);
        }
    }

    private final void c() {
        ad adVar = (ad) this.b;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            adVar.W.setText(gd.a0("LinkAvailable", null, 2131748731, str));
            org.telegram.ui.Cells.c2 c2Var = adVar.W;
            int i7 = m6.w6;
            c2Var.setTag(Integer.valueOf(i7));
            t6.U(adVar.W, i7, null);
            adVar.b0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            adVar.W.setText(gd.N0(2131743411, null));
            t6.U(adVar.W, m6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(gd.N0(2131743410, null));
            } else {
                adVar.W.setText(gd.N0(2131743414, null));
            }
            t6.U(adVar.W, m6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            t6.U(adVar.W, m6.p7, null);
            adVar.W.setText(gd.N0(2131748719, null));
        } else {
            t6.U(adVar.W, m6.p7, null);
            adVar.l0 = false;
            adVar.l0();
        }
        adVar.b0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0494  */
    /* JADX WARN: Type inference failed for: r14v7, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v23, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Integer] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        a1.c cVar;
        ArrayList arrayList;
        long j3;
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        ArrayList arrayList2;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j10;
        z3 z3Var;
        e9 e9Var;
        int i12 = 4;
        int i13 = 17;
        int i14 = 2;
        ml0 ml0Var = null;
        r14 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        ml0 ml0Var2 = null;
        r14 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        ml0 ml0Var3 = null;
        SQLiteCursor sQLiteCursor = null;
        int i15 = 1;
        int i16 = 0;
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                int[] iArr = (int[]) this.e;
                boolean[] zArr3 = (boolean[]) this.d;
                a1.e eVar = (a1.e) this.f;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (zArr2[0]) {
                    return;
                }
                int i17 = iArr[0] - 1;
                iArr[0] = i17;
                if (i17 > 0) {
                    return;
                }
                boolean z12 = zArr3[0];
                d.c = z12 ? 1 : -1;
                Log.d("Dictation", "support probe: ".concat(z12 ? "ok" : "no service supports any language → no dictation"));
                eVar.run();
                return;
            case 1:
                bi.e2 e2Var = (bi.e2) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                org.telegram.ui.ActionBar.m2 m2Var = e2Var.c;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gc Q = new lc(m2Var, e2Var.J0).Q(R.raw.contact_check, 36, gd.N0(2131746662, null));
                    Q.j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    if (tL_birthday == null) {
                        userFull.flags2 &= -33;
                    } else {
                        userFull.flags2 |= 32;
                    }
                    userFull.birthday = tL_birthday;
                    tr.a0(e2Var.a).j2(userFull, false);
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                    f3.n(null, 2131743636, new lc(m2Var, e2Var.J0), R.raw.error, 36);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e2Var.getContext(), e2Var.J0);
                    alertDialog$Builder.a.S = gd.N0(2131746658, null);
                    alertDialog$Builder.a.U = gd.N0(2131746659, null);
                    f3.m(null, 2131747637, alertDialog$Builder, null);
                }
                e2Var.j2.O(true);
                return;
            case 2:
                d9 d9Var = (d9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i18 = d9Var.U1;
                org.telegram.ui.ActionBar.g2 g2Var = d9Var.s1;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error2 != null) {
                        c5.c0(i18, tL_error2, g2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    Activity parentActivity = g2Var.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i18);
                    wf.b bVar = new wf.b(i13, false);
                    bVar.R(d9Var.a2.h);
                    i19.l(parentActivity, a10, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.q()));
                    return;
                }
            case 3:
                di.o0 o0Var = (di.o0) this.b;
                vf.b bVar2 = (vf.b) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                di.k1 k1Var = o0Var.E1;
                if (k1Var != null) {
                    k1Var.run();
                }
                bVar2.c(false);
                t1Var.dismiss();
                o0Var.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (updates == null) {
                        lc.b0(T).g0(tL_error3, false);
                        return;
                    }
                    gc I = lc.b0(T).I(R.raw.forward, gd.N0(2131749682, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749683, o0Var.o1, n5.t(o0Var.p1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
            case 4:
                y8 y8Var = (y8) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                f8 f8Var = (f8) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    f8Var.a(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject3 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                    paymentForm.invoice.recurring = true;
                    mp.u1(y8Var.a).f4(paymentForm.users, false);
                    ml0Var = new ml0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    ml0Var = new ml0((TLRPC.PaymentReceipt) tLObject3);
                }
                if (ml0Var == null) {
                    f8Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                ml0Var.a1 = new v6(f8Var, 1);
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q2)) {
                    Q2.presentFragment(ml0Var);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                e2Var2.a = true;
                Q2.showAsSheet(ml0Var, e2Var2);
                return;
            case 5:
                y8 y8Var2 = (y8) this.c;
                boolean[] zArr4 = (boolean[]) this.b;
                String str2 = (String) this.d;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.e;
                q10 q10Var = (q10) this.f;
                zArr4[0] = true;
                y8Var2.X(str2, chatInvite, new bi.b(q10Var, i13));
                return;
            case 6:
                tr trVar = (tr) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                a1.c cVar2 = (a1.c) this.f;
                try {
                    try {
                        ?? r62 = 0;
                        ?? queryFinalized = trVar.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i20 = 0;
                        j3 = 0;
                        while (queryFinalized.next()) {
                            try {
                                ?? byteBufferValue = queryFinalized.byteBufferValue(r62);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r62), r62);
                                    if (TLdeserialize != null) {
                                        arrayList3.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i20 = (int) queryFinalized.longValue(1);
                                    j3 = queryFinalized.longValue(2);
                                }
                                r62 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                cVar = cVar2;
                                arrayList = arrayList3;
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        int size = arrayList3.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList3.get(i21);
                            i21++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                cVar = cVar2;
                                arrayList = arrayList3;
                                try {
                                    long o4 = n5.o(peer);
                                    if (o4 > 0) {
                                        arrayList6.add(Long.valueOf(o4));
                                    } else if (o4 < 0) {
                                        arrayList7.add(Long.valueOf(-o4));
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i7 = i20;
                                    z10 = true;
                                    sQLiteCursor = queryFinalized;
                                    a8.g(e, z10);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i10 = i7;
                                    org.telegram.messenger.g0.g3(new p4(cVar, arrayList, i10, j3, arrayList5, arrayList4));
                                    return;
                                }
                            } else {
                                cVar = cVar2;
                                arrayList = arrayList3;
                            }
                            arrayList3 = arrayList;
                            cVar2 = cVar;
                        }
                        cVar = cVar2;
                        arrayList = arrayList3;
                        if (!arrayList7.isEmpty()) {
                            trVar.Q(TextUtils.join(",", arrayList7), arrayList4);
                        }
                        if (!arrayList6.isEmpty()) {
                            trVar.n0(arrayList6, arrayList5, false);
                        }
                        queryFinalized.dispose();
                        i10 = i20;
                    } catch (Exception e12) {
                        e = e12;
                        cVar = cVar2;
                        arrayList = arrayList3;
                        j3 = 0;
                        z10 = true;
                        i7 = 0;
                    }
                    org.telegram.messenger.g0.g3(new p4(cVar, arrayList, i10, j3, arrayList5, arrayList4));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 7:
                y8 y8Var3 = (y8) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                q10 q10Var2 = (q10) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error5 != null) {
                    q10Var2.a(Boolean.FALSE, tL_error5.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm2.invoice.recurring = true;
                    mp.u1(y8Var3.a).f4(paymentForm2.users, false);
                    ml0Var3 = new ml0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    ml0Var3 = new ml0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (ml0Var3 == null) {
                    q10Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                ml0Var3.a1 = new a1.c(q10Var2, 29);
                org.telegram.ui.ActionBar.g2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q3)) {
                    Q3.presentFragment(ml0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2();
                e2Var3.a = true;
                Q3.showAsSheet(ml0Var3, e2Var3);
                return;
            case 8:
                List list = (List) this.b;
                q10 q10Var3 = (q10) this.c;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.d;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.e;
                Activity activity = (Activity) this.f;
                if (list.isEmpty()) {
                    a8.b("StarsController.buy queryProductDetails done: no products");
                    org.telegram.messenger.g0.g3(new di.t6(q10Var3, 1));
                    return;
                }
                f5.m mVar = (f5.m) list.get(0);
                f5.i a11 = mVar.a();
                if (a11 == null) {
                    a8.b("StarsController.buy queryProductDetails done: no details");
                    org.telegram.messenger.g0.g3(new di.t6(q10Var3, 2));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a11.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                org.telegram.messenger.r1.i().d(mVar.c, new s8(q10Var3, 1));
                org.telegram.messenger.r1.i().h = new di.t6(q10Var3, 3);
                a8.b("StarsController.buy launchBillingFlow");
                org.telegram.messenger.r1 i22 = org.telegram.messenger.r1.i();
                org.telegram.messenger.c a12 = org.telegram.messenger.c.a(j10.t0);
                wf.b bVar3 = new wf.b(i13, false);
                bVar3.R((f5.m) list.get(0));
                i22.l(activity, a12, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar3.q()));
                return;
            case 9:
                y8 y8Var4 = (y8) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                x10 x10Var = (x10) this.f;
                int i23 = y8Var4.a;
                t1Var2.dismiss();
                if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                    mp.u1(i23).f4(tL_payments_savedStarGifts.users, false);
                    mp.u1(i23).Z3(tL_payments_savedStarGifts.chats, false);
                    for (int i24 = 0; i24 < tL_payments_savedStarGifts.gifts.size(); i24++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i24);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                x10Var.a(savedStarGift);
                return;
            case 10:
                y8 y8Var5 = (y8) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error6 != null) {
                    e0Var.a(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject6;
                    paymentForm3.invoice.recurring = true;
                    mp.u1(y8Var5.a).f4(paymentForm3.users, false);
                    ml0Var2 = new ml0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    ml0Var2 = new ml0((TLRPC.PaymentReceipt) tLObject6);
                }
                if (ml0Var2 == null) {
                    e0Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                ml0Var2.a1 = new v6(e0Var, 0);
                org.telegram.ui.ActionBar.g2 Q4 = LaunchActivity.Q();
                if (Q4 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q4)) {
                    Q4.presentFragment(ml0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var4 = new org.telegram.ui.ActionBar.e2();
                e2Var4.a = true;
                Q4.showAsSheet(ml0Var2, e2Var4);
                return;
            case 11:
                fi.p pVar = (fi.p) this.b;
                fi.q qVar = (fi.q) this.c;
                Long l10 = (Long) this.d;
                sa saVar = (sa) this.e;
                Runnable runnable = (Runnable) this.f;
                if (pVar == null) {
                    pVar = qVar.e(l10.longValue());
                }
                saVar.X(na.c(pVar));
                runnable.run();
                return;
            case 12:
                z3 z3Var2 = (z3) this.b;
                Runnable runnable2 = (Runnable) this.c;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                n8 n8Var = (n8) this.f;
                h6 h6Var = z3Var2.l0;
                c3 c3Var = z3Var2.M0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error7 == null || "STORY_NOT_MODIFIED".equals(tL_error7.text)) {
                    storyItem.parsedPrivacy = n8Var;
                    ArrayList arrayList8 = n8Var.b;
                    int i25 = n8Var.a;
                    ArrayList arrayList9 = n8Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList10 = new ArrayList<>();
                    int i26 = 0;
                    while (i26 < arrayList8.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList8.get(i26);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList10.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList10.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList10.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i27 = 0;
                                while (i27 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i27 = com.google.android.gms.internal.vision.e2.g(i27, 1, tL_inputPrivacyValueDisallowUsers.users.get(i27).user_id, tL_privacyValueDisallowUsers.users);
                                    i26 = i26;
                                    arrayList8 = arrayList8;
                                }
                                arrayList2 = arrayList8;
                                i11 = i26;
                                arrayList10.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList2 = arrayList8;
                                i11 = i26;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i28 = 0; i28 < tL_inputPrivacyValueAllowUsers.users.size(); i28 = com.google.android.gms.internal.vision.e2.g(i28, 1, tL_inputPrivacyValueAllowUsers.users.get(i28).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    i15 = 1;
                                    arrayList10.add(tL_privacyValueAllowUsers);
                                    i26 = i11 + 1;
                                    arrayList8 = arrayList2;
                                }
                            }
                            i15 = 1;
                            i26 = i11 + 1;
                            arrayList8 = arrayList2;
                        }
                        arrayList2 = arrayList8;
                        i11 = i26;
                        i26 = i11 + 1;
                        arrayList8 = arrayList2;
                    }
                    storyItem.privacy = arrayList10;
                    storyItem.close_friends = i25 == i15;
                    storyItem.contacts = i25 == 2;
                    storyItem.selected_contacts = i25 == 3;
                    mp.u1(z3Var2.m2).R1().s0(storyItem.dialogId, storyItem, true);
                    z3Var2.M3 = true;
                    if (i25 == 4) {
                        new lc(c3Var, h6Var).Q(R.raw.contact_check, 36, gd.O0("StorySharedToEveryone")).j();
                    } else if (i25 == 1) {
                        new lc(c3Var, h6Var).Q(R.raw.contact_check, 36, gd.O0("StorySharedToCloseFriends")).j();
                    } else if (i25 == 2) {
                        if (arrayList9.isEmpty()) {
                            new lc(c3Var, h6Var).Q(R.raw.contact_check, 36, gd.O0("StorySharedToAllContacts")).j();
                        } else {
                            new lc(c3Var, h6Var).Q(R.raw.contact_check, 36, gd.G(arrayList9.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i25 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList9);
                        Iterator it = n8Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        lc lcVar = new lc(c3Var, h6Var);
                        z11 = false;
                        lcVar.Q(R.raw.contact_check, 36, gd.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                        z3Var2.d1(z11);
                        return;
                    }
                } else {
                    f3.n(null, 2131743636, new lc(c3Var, h6Var), R.raw.error, 36);
                }
                z11 = false;
                z3Var2.d1(z11);
                return;
            case 13:
                r3 r3Var = (r3) this.b;
                Activity activity2 = (Activity) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                f9 f9Var = (f9) this.e;
                w3 w3Var = (w3) this.f;
                sa D = sa.D(activity2, r3Var.x.m2);
                y3 y3Var = r3Var.x.w2;
                long j11 = (y3Var == null || (e9Var = (e9) y3Var.c) == null) ? 0L : e9Var.currentPosition;
                c7 n10 = c7.n(r3Var.x.y1.h(), r3Var.x.y1.a);
                z3 z3Var3 = r3Var.x;
                n10.e = z3Var3.l1;
                TL_stories.StoryItem storyItem3 = z3Var3.y1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i29 = 0;
                    while (true) {
                        if (i29 < document.attributes.size()) {
                            if (document.attributes.get(i29) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i29);
                            } else {
                                i29++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j10;
                        c7 g10 = n10.g();
                        g10.b0 = true;
                        z3Var = r3Var.x;
                        TL_stories.StoryItem storyItem4 = z3Var.y1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new bi.j(r3Var, storyItem4, storyItem2, 7);
                        if (z3Var.G0()) {
                            z3 z3Var4 = r3Var.x;
                            g10.J0 = z3Var4.l1;
                            g10.L0 = mp.l5(z3Var4.y1.a.media);
                            fi.h6 h6Var2 = f9Var.O0;
                            if (h6Var2 instanceof a6) {
                                g10.K0 = ((a6) h6Var2).E;
                            }
                        }
                        D.R(na.d(f9Var), g10, j11);
                        D.R = new l3(r3Var, i14);
                        D.S = new n3(r3Var, w3Var, i16);
                        return;
                    }
                }
                j10 = 0;
                n10.e0 = j10;
                c7 g102 = n10.g();
                g102.b0 = true;
                z3Var = r3Var.x;
                TL_stories.StoryItem storyItem42 = z3Var.y1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new bi.j(r3Var, storyItem42, storyItem2, 7);
                if (z3Var.G0()) {
                }
                D.R(na.d(f9Var), g102, j11);
                D.R = new l3(r3Var, i14);
                D.S = new n3(r3Var, w3Var, i16);
                return;
            case 14:
                k4 k4Var = (k4) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str3 = (String) this.d;
                n6 n6Var = (n6) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(user);
                b5 b5Var = k4Var.b;
                i5.r(b5Var.w).i(arrayList11, false);
                new lc(b5Var, b5Var.s).Q(R.raw.ic_ban, 36, gd.a0(null, null, 2131751454, str3)).j();
                n6Var.a(true, b5Var.d(storyView) ? 1.0f : 0.5f);
                return;
            case 15:
                k8 k8Var = (k8) this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                p8 p8Var = k8Var.a0;
                t1Var3.dismiss();
                if (!(tLObject7 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error8 != null) {
                        org.telegram.ui.ActionBar.m2 m2Var2 = p8Var.c;
                        int i30 = p8.Y1;
                        new lc(m2Var2, p8Var.J0).g0(tL_error8, true);
                        return;
                    }
                    return;
                }
                jr[] jrVarArr = new jr[1];
                Context context = k8Var.getContext();
                int i31 = p8.Y1;
                jr jrVar = new jr(context, p8Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject7, p8Var.G1 ? null : new x1(20, k8Var, jrVarArr), new fi.b());
                jrVarArr[0] = jrVar;
                jrVar.show();
                return;
            case 16:
                cb.a((cb) this.b, (ViewGroup) this.c, (h6) this.d, (ca) this.e, (View) this.f);
                return;
            case 17:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                LongSparseArray longSparseArray = (LongSparseArray) this.f;
                a2Var.getClass();
                String str4 = tL_messages_getStickers.emoticon;
                jg.c2 c2Var = a2Var.a;
                if (str4.equals(c2Var.S)) {
                    c2Var.P = 0;
                    if (tLObject8 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                        int size2 = arrayList12.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i16 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i16);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList12.add(document2);
                            }
                            i16++;
                        }
                        if (size2 != arrayList12.size()) {
                            c2Var.J.put(arrayList12, c2Var.S);
                            if (size2 == 0) {
                                c2Var.K.add(arrayList12);
                            }
                            c2Var.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
                kg.v1 v1Var = (kg.v1) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                kg.u1 u1Var = (kg.u1) this.e;
                fj fjVar = (fj) this.f;
                int i32 = v1Var.a;
                mp.u1(i32).f4(arrayList13, true);
                mp.u1(i32).Z3(arrayList14, true);
                u1Var.e = fjVar;
                if (fjVar != null) {
                    fjVar.l(u1Var.a, u1Var.b);
                }
                v1Var.l();
                ks.f(i32).k(ks.F1, new Object[0]);
                return;
            case 19:
                kg.v1 v1Var2 = (kg.v1) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                ArrayList<Integer> arrayList15 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f;
                if (!(tLObject9 instanceof TLRPC.TL_messages_messages)) {
                    a8.d("received " + tLObject9 + " " + tL_error9 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList16 = ((TLRPC.TL_messages_messages) tLObject9).messages;
                arrayList15.clear();
                int size4 = arrayList16.size();
                int i33 = 0;
                while (i33 < size4) {
                    TLRPC.Message message = arrayList16.get(i33);
                    i33++;
                    arrayList15.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList15;
                while (i16 < arrayList15.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    i16++;
                }
                ConnectionsManager.getInstance(v1Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 20:
                kg.v1 v1Var3 = (kg.v1) this.b;
                ArrayList arrayList17 = (ArrayList) this.c;
                ArrayList arrayList18 = (ArrayList) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                Runnable runnable3 = (Runnable) this.f;
                v1Var3.e = false;
                int i34 = v1Var3.a;
                mp.u1(i34).f4(arrayList17, true);
                mp.u1(i34).Z3(arrayList18, true);
                ArrayList arrayList20 = v1Var3.b;
                arrayList20.clear();
                arrayList20.addAll(arrayList19);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    v1Var3.i(null, false);
                }
                ks.f(i34).k(ks.F1, new Object[0]);
                return;
            case 21:
                ((CameraController) this.b).lambda$open$10((CameraSession) this.c, (Runnable) this.d, (SurfaceTexture) this.e, (Runnable) this.f);
                return;
            case 22:
                s7 s7Var = (s7) this.b;
                ei.b bVar4 = (ei.b) this.c;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f;
                s7Var.getClass();
                bVar4.e.a = false;
                tL_documentAttributeAudio.title = str5;
                tL_documentAttributeAudio.performer = str6;
                j71 j71Var = s7Var.n;
                for (int i35 = 0; i35 < j71Var.getViewPages().length; i35++) {
                    ek0 c10 = s7Var.c(j71Var.getViewPages()[i35]);
                    if (c10 != null && ((e7) c10.getAdapter()).d == 3) {
                        e7 e7Var = (e7) c10.getAdapter();
                        int i36 = 0;
                        while (true) {
                            if (i36 >= e7Var.e.size()) {
                                break;
                            } else if (((l7) e7Var.e.get(i36)).d == bVar4) {
                                e7Var.g(i36);
                            } else {
                                i36++;
                            }
                        }
                    }
                }
                return;
            case 23:
                a();
                return;
            case 24:
                gb gbVar = (gb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr5 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.f;
                lb lbVar = gbVar.a.n;
                lbVar.B0 = false;
                lbVar.z0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr5[0]) {
                    return;
                }
                t1Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    lb.F0(lbVar, tL_messages_exportedChatInvite, lbVar.A0);
                    return;
                } else {
                    f3.n(null, 2131748720, lc.b0(lbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                bn bnVar = (bn) this.d;
                boolean[] zArr6 = (boolean[]) this.b;
                boolean[] zArr7 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.e;
                ImageView imageView2 = (ImageView) this.f;
                if (zArr6[0]) {
                    return;
                }
                zArr6[0] = true;
                long[] jArr = {-1};
                org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(jArr, zArr7, imageView, imageView2, 11);
                TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                tL_messages_rateTranscribedAudio.msg_id = bnVar.v5.e1();
                tL_messages_rateTranscribedAudio.peer = bnVar.getMessagesController().o1(bnVar.v5.k.peer_id);
                tL_messages_rateTranscribedAudio.transcription_id = bnVar.v5.k.voiceTranscriptionId;
                tL_messages_rateTranscribedAudio.good = zArr7[0];
                bnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new z9(bnVar, iVar, jArr, i12));
                org.telegram.messenger.g0.h3(iVar, 150L);
                return;
            case 28:
                bn.w0((bn) this.c, (View) this.d, (boolean[]) this.b, (org.telegram.ui.ActionBar.g1) this.e, (View) this.f);
                return;
            default:
                mm mmVar = (mm) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                fj fjVar2 = (fj) this.e;
                q5 q5Var = (q5) this.f;
                bn bnVar2 = mmVar.a;
                if (message2.suggested_post.schedule_date != 0) {
                    bnVar2.getMessagesController().v(fjVar2.k.id, 0, n5.o(fjVar2.k.peer_id), null, false);
                    return;
                }
                t1VarArr[0].setOnDismissListener(null);
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) c5.Q(bnVar2.getParentActivity(), 0L, new oi.f0(i13, mmVar, fjVar2), bnVar2.getResourceProvider(), 1).b;
                w2Var.show();
                w2Var.setOnDismissListener(q5Var);
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ b(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = 24;
        this.c = gbVar;
        this.d = tL_chatInviteExported;
        this.e = tL_messages_exportedChatInvite;
        this.b = zArr;
        this.f = t1Var;
    }

    public /* synthetic */ b(qc qcVar, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        this.a = 25;
        this.c = qcVar;
        this.b = zArr;
        this.e = iArr;
        this.d = iArr2;
        this.f = tL_error;
    }

    public /* synthetic */ b(bn bnVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        this.a = 28;
        this.c = bnVar;
        this.d = view;
        this.b = zArr;
        this.e = g1Var;
        this.f = view2;
    }

    public /* synthetic */ b(bn bnVar, boolean[] zArr, boolean[] zArr2, ImageView imageView, ImageView imageView2) {
        this.a = 27;
        this.d = bnVar;
        this.b = zArr;
        this.c = zArr2;
        this.e = imageView;
        this.f = imageView2;
    }

    public /* synthetic */ b(boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, a1.e eVar) {
        this.a = 0;
        this.b = zArr;
        this.c = zArr2;
        this.e = iArr;
        this.d = zArr3;
        this.f = eVar;
    }
}
