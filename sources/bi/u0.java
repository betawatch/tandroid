package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.v61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.go;
import org.telegram.ui.hl0;
import org.telegram.ui.kp;
import org.telegram.ui.lm;
import org.telegram.ui.nq;
import org.telegram.ui.oq;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    private final void a() {
        org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        bdVar.X = 0;
        String str2 = bdVar.Y;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            bdVar.V.setText(org.telegram.messenger.hd.a0("LinkAvailable", null, 2131748923, str));
            org.telegram.ui.Cells.b2 b2Var = bdVar.V;
            int i7 = org.telegram.ui.ActionBar.k6.w6;
            b2Var.setTag(Integer.valueOf(i7));
            org.telegram.ui.ActionBar.r6.V(bdVar.V, i7, null);
            bdVar.a0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            bdVar.V.setText(org.telegram.messenger.hd.M0(2131743655, null));
            org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                bdVar.V.setText(org.telegram.messenger.hd.M0(2131743654, null));
            } else {
                bdVar.V.setText(org.telegram.messenger.hd.M0(2131743658, null));
            }
            org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.p7, null);
            bdVar.V.setText(org.telegram.messenger.hd.M0(2131748911, null));
        } else {
            org.telegram.ui.ActionBar.r6.V(bdVar.V, org.telegram.ui.ActionBar.k6.p7, null);
            bdVar.k0 = false;
            bdVar.l0();
        }
        bdVar.a0 = false;
    }

    private final void b() {
        lm lmVar = (lm) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.e;
        ij ijVar = (ij) this.f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.b;
        an anVar = lmVar.a;
        if (message.suggested_post.schedule_date != 0) {
            anVar.getMessagesController().v(ijVar.k.id, 0, org.telegram.messenger.m5.o(ijVar.k.peer_id), null, false);
        } else {
            u1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(anVar.getParentActivity(), 0L, new ni.c(15, lmVar, ijVar), anVar.getResourceProvider(), 1).b;
            v2Var.show();
            v2Var.setOnDismissListener(q5Var);
        }
    }

    private final void c() {
        go goVar = (go) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        goVar.h0 = 0;
        String str2 = goVar.i0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            goVar.h.setText(org.telegram.messenger.hd.a0("LinkAvailable", null, 2131748923, str));
            goVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.w6);
            goVar.k0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            goVar.h.setText(org.telegram.messenger.hd.M0(2131743655, null));
            org.telegram.ui.ActionBar.r6.V(goVar.h.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                goVar.h.setText(org.telegram.messenger.hd.M0(2131743654, null));
            } else {
                goVar.h.setText(org.telegram.messenger.hd.M0(2131743658, null));
            }
            org.telegram.ui.ActionBar.r6.V(goVar.h.getTextView(), org.telegram.ui.ActionBar.k6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            goVar.h.setText(org.telegram.messenger.hd.M0(2131748911, null));
            goVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
        } else {
            goVar.c0 = false;
            goVar.f0();
        }
        goVar.k0 = false;
    }

    private final void d() {
        kp.d0((kp) this.c, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f);
    }

    private final void f() {
        nq nqVar = (nq) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        a0.h hVar = (a0.h) this.e;
        ArrayList arrayList2 = (ArrayList) this.f;
        ArrayList arrayList3 = (ArrayList) this.b;
        jg.z1 z1Var = nqVar.h;
        oq oqVar = nqVar.D;
        if (oqVar.n1) {
            nqVar.s = false;
            nqVar.d = arrayList;
            nqVar.e = hVar;
            nqVar.f = arrayList2;
            z1Var.f(arrayList, null);
            if (!org.telegram.messenger.t3.T(oqVar.n)) {
                ArrayList arrayList4 = z1Var.g;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
            }
            int i7 = nqVar.r;
            nqVar.f();
            if (nqVar.r > i7) {
                oqVar.D0(i7);
            }
            if (z1Var.e() || nqVar.r != 0) {
                return;
            }
            oqVar.b.e(false, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05cd  */
    /* JADX WARN: Type inference failed for: r12v7, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Integer] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        boolean z9;
        int i7;
        long j10;
        int i10;
        boolean z10;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j11;
        di.i4 i4Var;
        di.o9 o9Var;
        int i11;
        int i12 = 4;
        int i13 = 2;
        hl0 hl0Var = null;
        r12 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        hl0 hl0Var2 = null;
        r12 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        hl0 hl0Var3 = null;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.c;
                vf.b bVar = (vf.b) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                z1 z1Var = a1Var.j2;
                if (z1Var != null) {
                    z1Var.run();
                }
                bVar.c(false);
                u1Var.dismiss();
                a1Var.dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (updates == null) {
                        org.telegram.ui.Components.hc.a0(T).f0(tL_error, false);
                        return;
                    }
                    org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(T).I(R.raw.forward, org.telegram.messenger.hd.M0(2131749699, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749700, a1Var.S1, org.telegram.messenger.m5.t(a1Var.T1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
            case 1:
                ea eaVar = (ea) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                mc mcVar = (mc) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error2 != null) {
                    mcVar.a(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    qp.s1(eaVar.a).Y3(paymentForm.users, false);
                    hl0Var = new hl0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    hl0Var = new hl0((TLRPC.PaymentReceipt) tLObject);
                }
                if (hl0Var == null) {
                    mcVar.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                hl0Var.Z0 = new a1.c(mcVar, 18);
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q)) {
                    Q.presentFragment(hl0Var);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                Q.showAsSheet(hl0Var, d2Var);
                return;
            case 2:
                ea eaVar2 = (ea) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.e;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f;
                v10 v10Var = (v10) this.b;
                zArr[0] = true;
                eaVar2.Y(str, chatInvite, new ai.e(v10Var, 7));
                return;
            case 3:
                yr yrVar = (yr) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                a1.c cVar = (a1.c) this.b;
                try {
                    try {
                        ?? r62 = 0;
                        ?? queryFinalized = yrVar.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i16 = 0;
                        j10 = 0;
                        while (queryFinalized.next()) {
                            try {
                                ?? byteBufferValue = queryFinalized.byteBufferValue(r62);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r62), r62);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i16 = (int) queryFinalized.longValue(1);
                                    j10 = queryFinalized.longValue(2);
                                }
                                r62 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                i7 = i16;
                                j3 = j10;
                                z9 = true;
                                sQLiteCursor = queryFinalized;
                                org.telegram.messenger.a8.g(e, z9);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j10 = j3;
                                i10 = i7;
                                org.telegram.messenger.g0.h3(new d9(cVar, arrayList2, i10, j10, arrayList4, arrayList3));
                                return;
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long o4 = org.telegram.messenger.m5.o(peer);
                                if (o4 > 0) {
                                    arrayList5.add(Long.valueOf(o4));
                                } else if (o4 < 0) {
                                    arrayList6.add(Long.valueOf(-o4));
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            yrVar.Q(TextUtils.join(",", arrayList6), arrayList3);
                        }
                        if (!arrayList5.isEmpty()) {
                            yrVar.n0(arrayList5, arrayList4, false);
                        }
                        queryFinalized.dispose();
                        i10 = i16;
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j3 = 0;
                    z9 = true;
                    i7 = 0;
                }
                org.telegram.messenger.g0.h3(new d9(cVar, arrayList2, i10, j10, arrayList4, arrayList3));
                return;
            case 4:
                ea eaVar3 = (ea) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                v10 v10Var2 = (v10) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    v10Var2.a(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    qp.s1(eaVar3.a).Y3(paymentForm2.users, false);
                    hl0Var3 = new hl0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    hl0Var3 = new hl0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (hl0Var3 == null) {
                    v10Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                hl0Var3.Z0 = new a1.c(v10Var2, 16);
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q2)) {
                    Q2.presentFragment(hl0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2();
                d2Var2.a = true;
                Q2.showAsSheet(hl0Var3, d2Var2);
                return;
            case 5:
                List list = (List) this.c;
                v10 v10Var3 = (v10) this.d;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.e;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.f;
                Activity activity = (Activity) this.b;
                if (list.isEmpty()) {
                    org.telegram.messenger.a8.b("StarsController.buy queryProductDetails done: no products");
                    org.telegram.messenger.g0.h3(new y7(v10Var3, 1));
                    return;
                }
                f5.l lVar = (f5.l) list.get(0);
                f5.h a10 = lVar.a();
                if (a10 == null) {
                    org.telegram.messenger.a8.b("StarsController.buy queryProductDetails done: no details");
                    org.telegram.messenger.g0.h3(new y7(v10Var3, 2));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a10.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                org.telegram.messenger.r1.i().d(lVar.c, new q9(v10Var3, 0));
                org.telegram.messenger.r1.i().h = new y7(v10Var3, 3);
                org.telegram.messenger.a8.b("StarsController.buy launchBillingFlow");
                org.telegram.messenger.r1 i18 = org.telegram.messenger.r1.i();
                org.telegram.messenger.c a11 = org.telegram.messenger.c.a(p10.s0);
                q4.q qVar = new q4.q(20, false);
                qVar.g((f5.l) list.get(0));
                i18.l(activity, a11, tL_inputStorePaymentStarsTopup, Collections.singletonList(qVar.a()));
                return;
            case 6:
                ea eaVar4 = (ea) this.c;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                c20 c20Var = (c20) this.b;
                int i19 = eaVar4.a;
                u1Var2.dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    qp.s1(i19).Y3(tL_payments_savedStarGifts.users, false);
                    qp.s1(i19).S3(tL_payments_savedStarGifts.chats, false);
                    for (int i20 = 0; i20 < tL_payments_savedStarGifts.gifts.size(); i20++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i20);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                c20Var.a(savedStarGift);
                return;
            case 7:
                ea eaVar5 = (ea) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                org.telegram.ui.Wallet.v1 v1Var = (org.telegram.ui.Wallet.v1) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    v1Var.a(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm3.invoice.recurring = true;
                    qp.s1(eaVar5.a).Y3(paymentForm3.users, false);
                    hl0Var2 = new hl0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    hl0Var2 = new hl0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (hl0Var2 == null) {
                    v1Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                hl0Var2.Z0 = new a1.c(v1Var, 17);
                org.telegram.ui.ActionBar.f2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q3)) {
                    Q3.presentFragment(hl0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2();
                d2Var3.a = true;
                Q3.showAsSheet(hl0Var2, d2Var3);
                return;
            case 8:
                di.p pVar = (di.p) this.c;
                di.q qVar2 = (di.q) this.d;
                Long l10 = (Long) this.e;
                fi.va vaVar = (fi.va) this.f;
                Runnable runnable = (Runnable) this.b;
                if (pVar == null) {
                    pVar = qVar2.e(l10.longValue());
                }
                vaVar.X(fi.qa.c(pVar));
                runnable.run();
                return;
            case 9:
                di.i4 i4Var2 = (di.i4) this.c;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                fi.q8 q8Var = (fi.q8) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = i4Var2.k0;
                di.j3 j3Var = i4Var2.L0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error5 == null || "STORY_NOT_MODIFIED".equals(tL_error5.text)) {
                    storyItem.parsedPrivacy = q8Var;
                    ArrayList arrayList7 = q8Var.b;
                    int i21 = q8Var.a;
                    ArrayList arrayList8 = q8Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    int i22 = 0;
                    while (i22 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i22);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList9.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i23 = 0;
                                while (i23 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i23 = com.google.android.recaptcha.internal.a.g(i23, 1, tL_inputPrivacyValueDisallowUsers.users.get(i23).user_id, tL_privacyValueDisallowUsers.users);
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    int i24 = 0;
                                    for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i24 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                        i24 = com.google.android.recaptcha.internal.a.g(i24, 1, tL_inputPrivacyValueAllowUsers.users.get(i24).user_id, tL_privacyValueAllowUsers.users);
                                    }
                                    i14 = 1;
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i22++;
                                    arrayList7 = arrayList;
                                }
                            }
                            i14 = 1;
                            i22++;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i22++;
                        arrayList7 = arrayList;
                    }
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i21 == i14;
                    storyItem.contacts = i21 == 2;
                    storyItem.selected_contacts = i21 == 3;
                    qp.s1(i4Var2.l2).P1().s0(storyItem.dialogId, storyItem, true);
                    i4Var2.L3 = true;
                    if (i21 == 4) {
                        new org.telegram.ui.Components.hc(j3Var, f6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.N0("StorySharedToEveryone")).j();
                    } else if (i21 == 1) {
                        new org.telegram.ui.Components.hc(j3Var, f6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.N0("StorySharedToCloseFriends")).j();
                    } else if (i21 == 2) {
                        if (arrayList8.isEmpty()) {
                            new org.telegram.ui.Components.hc(j3Var, f6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.N0("StorySharedToAllContacts")).j();
                        } else {
                            new org.telegram.ui.Components.hc(j3Var, f6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.G(arrayList8.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i21 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = q8Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new org.telegram.ui.Components.hc(j3Var, f6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                        i4Var2.d1(z10);
                        return;
                    }
                } else {
                    org.telegram.messenger.k5.o(null, 2131743880, new org.telegram.ui.Components.hc(j3Var, f6Var), R.raw.error, 36);
                }
                z10 = false;
                i4Var2.d1(z10);
                return;
            case 10:
                di.z3 z3Var = (di.z3) this.c;
                Activity activity2 = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                di.p9 p9Var = (di.p9) this.f;
                di.f4 f4Var = (di.f4) this.b;
                fi.va D = fi.va.D(activity2, z3Var.x.l2);
                di.h4 h4Var = z3Var.x.v2;
                long j12 = (h4Var == null || (o9Var = (di.o9) h4Var.c) == null) ? 0L : o9Var.currentPosition;
                fi.e7 n10 = fi.e7.n(z3Var.x.x1.h(), z3Var.x.x1.a);
                di.i4 i4Var3 = z3Var.x;
                n10.e = i4Var3.k1;
                TL_stories.StoryItem storyItem3 = i4Var3.x1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 < document.attributes.size()) {
                            if (document.attributes.get(i25) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i25);
                            } else {
                                i25++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        fi.e7 g10 = n10.g();
                        g10.b0 = true;
                        i4Var = z3Var.x;
                        TL_stories.StoryItem storyItem4 = i4Var.x1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new v3(z3Var, storyItem4, storyItem2, i13);
                        if (i4Var.G0()) {
                            di.i4 i4Var4 = z3Var.x;
                            g10.J0 = i4Var4.k1;
                            g10.L0 = qp.Z4(i4Var4.x1.a.media);
                            di.q6 q6Var = p9Var.N0;
                            if (q6Var instanceof di.j6) {
                                g10.K0 = ((di.j6) q6Var).E;
                            }
                        }
                        D.R(fi.qa.d(p9Var), g10, j12);
                        D.Q = new di.s3(z3Var, i13);
                        D.R = new di.v3(z3Var, f4Var, i15);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                fi.e7 g102 = n10.g();
                g102.b0 = true;
                i4Var = z3Var.x;
                TL_stories.StoryItem storyItem42 = i4Var.x1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new v3(z3Var, storyItem42, storyItem2, i13);
                if (i4Var.G0()) {
                }
                D.R(fi.qa.d(p9Var), g102, j12);
                D.Q = new di.s3(z3Var, i13);
                D.R = new di.v3(z3Var, f4Var, i15);
                return;
            case 11:
                di.u4 u4Var = (di.u4) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                di.k5 k5Var = u4Var.b;
                org.telegram.messenger.g5.r(k5Var.w).i(arrayList10, false);
                new org.telegram.ui.Components.hc(k5Var, k5Var.s).Q(R.raw.ic_ban, 36, org.telegram.messenger.hd.a0(null, null, 2131751467, str2)).j();
                m6Var.a(true, k5Var.d(storyView) ? 1.0f : 0.5f);
                return;
            case 12:
                fi.n8 n8Var = (fi.n8) this.c;
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                fi.s8 s8Var = n8Var.W;
                u1Var3.dismiss();
                if (!(tLObject5 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error6 != null) {
                        org.telegram.ui.ActionBar.l2 l2Var = s8Var.c;
                        int i26 = fi.s8.U1;
                        new org.telegram.ui.Components.hc(l2Var, s8Var.I0).f0(tL_error6, true);
                        return;
                    }
                    return;
                }
                tq[] tqVarArr = new tq[1];
                Context context = n8Var.getContext();
                int i27 = fi.s8.U1;
                tq tqVar = new tq(context, s8Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject5, s8Var.C1 ? null : new ai.f1(13, n8Var, tqVarArr), new di.b());
                tqVarArr[0] = tqVar;
                tqVar.show();
                return;
            case 13:
                fi.fb.a((fi.fb) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.Components.y9) this.f, (View) this.b);
                return;
            case 14:
                jg.b2 b2Var = (jg.b2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                b2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                jg.d2 d2Var4 = b2Var.a;
                if (str3.equals(d2Var4.R)) {
                    d2Var4.O = 0;
                    if (tLObject6 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                        int size2 = arrayList11.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i15++;
                        }
                        if (size2 != arrayList11.size()) {
                            d2Var4.I.put(arrayList11, d2Var4.R);
                            if (size2 == 0) {
                                d2Var4.J.add(arrayList11);
                            }
                            d2Var4.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                kg.t1 t1Var = (kg.t1) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                kg.s1 s1Var = (kg.s1) this.f;
                ij ijVar = (ij) this.b;
                int i28 = t1Var.a;
                qp.s1(i28).Y3(arrayList12, true);
                qp.s1(i28).S3(arrayList13, true);
                s1Var.e = ijVar;
                if (ijVar != null) {
                    ijVar.l(s1Var.a, s1Var.b);
                }
                t1Var.l();
                qs.f(i28).k(qs.F1, new Object[0]);
                return;
            case 16:
                kg.t1 t1Var2 = (kg.t1) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList<Integer> arrayList14 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                if (!(tLObject7 instanceof TLRPC.TL_messages_messages)) {
                    org.telegram.messenger.a8.d("received " + tLObject7 + " " + tL_error7 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList15 = ((TLRPC.TL_messages_messages) tLObject7).messages;
                arrayList14.clear();
                int size4 = arrayList15.size();
                int i29 = 0;
                while (i29 < size4) {
                    TLRPC.Message message = arrayList15.get(i29);
                    i29++;
                    arrayList14.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList14;
                while (i15 < arrayList14.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    i15++;
                }
                ConnectionsManager.getInstance(t1Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 17:
                kg.t1 t1Var3 = (kg.t1) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                ArrayList arrayList17 = (ArrayList) this.e;
                ArrayList arrayList18 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                t1Var3.e = false;
                int i30 = t1Var3.a;
                qp.s1(i30).Y3(arrayList16, true);
                qp.s1(i30).S3(arrayList17, true);
                ArrayList arrayList19 = t1Var3.b;
                arrayList19.clear();
                arrayList19.addAll(arrayList18);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    t1Var3.i(null, false);
                }
                qs.f(i30).k(qs.F1, new Object[0]);
                return;
            case 18:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.e, (SurfaceTexture) this.f, (Runnable) this.b);
                return;
            case 19:
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) this.c;
                ci.b bVar2 = (ci.b) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.b;
                t7Var.getClass();
                bVar2.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                v61 v61Var = t7Var.n;
                for (int i31 = 0; i31 < v61Var.getViewPages().length; i31++) {
                    pj0 c10 = t7Var.c(v61Var.getViewPages()[i31]);
                    if (c10 != null && ((org.telegram.ui.f7) c10.getAdapter()).d == 3) {
                        org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) c10.getAdapter();
                        int i32 = 0;
                        while (true) {
                            if (i32 >= f7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.m7) f7Var.e.get(i32)).d == bVar2) {
                                f7Var.g(i32);
                            } else {
                                i32++;
                            }
                        }
                    }
                }
                return;
            case 20:
                org.telegram.ui.la laVar = (org.telegram.ui.la) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                TLObject tLObject8 = (TLObject) this.e;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
                laVar.e = 0;
                String str7 = laVar.f;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error8 == null && (tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.b2 b2Var2 = laVar.G;
                    if (b2Var2 != null) {
                        b2Var2.setText(org.telegram.messenger.hd.a0("UsernameAvailable", null, 2131743668, str6));
                        org.telegram.ui.Cells.b2 b2Var3 = laVar.G;
                        int i33 = org.telegram.ui.ActionBar.k6.w6;
                        b2Var3.setTag(Integer.valueOf(i33));
                        org.telegram.ui.ActionBar.r6.V(laVar.G, i33, null);
                        org.telegram.ui.ka kaVar = laVar.F;
                        if (kaVar != null) {
                            org.telegram.ui.ka.a(kaVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (laVar.G != null) {
                    if (tL_error8 != null && "USERNAME_INVALID".equals(tL_error8.text) && checkusername.username.length() == 4) {
                        laVar.G.setText(org.telegram.messenger.hd.M0(2131743655, null));
                        org.telegram.ui.Cells.b2 b2Var4 = laVar.G;
                        int i34 = org.telegram.ui.ActionBar.k6.p7;
                        b2Var4.setTag(Integer.valueOf(i34));
                        org.telegram.ui.ActionBar.r6.V(laVar.G, i34, null);
                    } else if (tL_error8 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                        laVar.G.setText(org.telegram.messenger.hd.M0(2131743659, null));
                        org.telegram.ui.Cells.b2 b2Var5 = laVar.G;
                        int i35 = org.telegram.ui.ActionBar.k6.p7;
                        b2Var5.setTag(Integer.valueOf(i35));
                        org.telegram.ui.ActionBar.r6.V(laVar.G, i35, null);
                    } else {
                        if (checkusername.username.length() == 4) {
                            laVar.G.setText(org.telegram.messenger.hd.M0(2131743654, null));
                        } else {
                            laVar.G.setText(org.telegram.messenger.hd.M0(2131743658, null));
                        }
                        org.telegram.ui.Cells.b2 b2Var6 = laVar.G;
                        int i36 = org.telegram.ui.ActionBar.k6.F6;
                        b2Var6.setTag(Integer.valueOf(i36));
                        org.telegram.ui.ActionBar.r6.V(laVar.G, i36, null);
                    }
                    org.telegram.ui.ka kaVar2 = laVar.F;
                    if (kaVar2 != null) {
                        org.telegram.ui.ka.a(kaVar2);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.hb hbVar = (org.telegram.ui.hb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.f;
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.u1 u1Var4 = (org.telegram.ui.ActionBar.u1) this.e;
                org.telegram.ui.mb mbVar = hbVar.a.n;
                mbVar.A0 = false;
                mbVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                u1Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    org.telegram.ui.mb.F0(mbVar, tL_messages_exportedChatInvite, mbVar.z0);
                    return;
                } else {
                    org.telegram.messenger.k5.o(null, 2131748912, org.telegram.ui.Components.hc.a0(mbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 22:
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                int[] iArr = (int[]) this.e;
                int[] iArr2 = (int[]) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i11 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error9 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error9.text)) {
                        rcVar.getMessagesController().G0().b(rcVar.a, rcVar.c, new org.telegram.ui.wb(rcVar, i14));
                        return;
                    } else {
                        rcVar.P.setLoading(false);
                        org.telegram.ui.Components.hc.a0(rcVar).Q(R.raw.error, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error9.text)).j();
                        return;
                    }
                }
                int i37 = i11 + 1;
                iArr[0] = i37;
                if (i37 == iArr2[0]) {
                    rcVar.finishFragment();
                    org.telegram.ui.ActionBar.f2 f2Var = rcVar.l0;
                    if (f2Var != null) {
                        if (f2Var instanceof pn) {
                            ((pn) f2Var).t0();
                        }
                        org.telegram.messenger.k5.o(null, rcVar.d ? 2131749497 : 2131752459, org.telegram.ui.Components.hc.a0(rcVar.l0), R.raw.contact_check, 36);
                        rcVar.l0 = null;
                    }
                    rcVar.P.setLoading(false);
                    return;
                }
                return;
            case 23:
                a();
                return;
            case 24:
                an anVar = (an) this.c;
                boolean[] zArr4 = (boolean[]) this.d;
                boolean[] zArr5 = (boolean[]) this.e;
                ImageView imageView = (ImageView) this.f;
                ImageView imageView2 = (ImageView) this.b;
                if (zArr4[0]) {
                    return;
                }
                zArr4[0] = true;
                long[] jArr = {-1};
                org.telegram.ui.m6 m6Var2 = new org.telegram.ui.m6((Object) jArr, zArr5, (Object) imageView, (Object) imageView2, 6);
                TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                tL_messages_rateTranscribedAudio.msg_id = anVar.t5.f1();
                tL_messages_rateTranscribedAudio.peer = anVar.getMessagesController().m1(anVar.t5.k.peer_id);
                tL_messages_rateTranscribedAudio.transcription_id = anVar.t5.k.voiceTranscriptionId;
                tL_messages_rateTranscribedAudio.good = zArr5[0];
                anVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.z9(anVar, m6Var2, jArr, i12));
                org.telegram.messenger.g0.i3(m6Var2, 150L);
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                f();
                return;
            default:
                View view = (View) this.c;
                View view2 = (View) this.d;
                WindowManager windowManager = (WindowManager) this.e;
                View view3 = (View) this.f;
                View view4 = (View) this.b;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView(view3);
                windowManager.removeView(view4);
                return;
        }
    }

    public /* synthetic */ u0(Object obj, Object obj2, TLRPC.TL_error tL_error, TLObject tLObject, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = tL_error;
        this.e = tLObject;
        this.f = obj3;
    }

    public /* synthetic */ u0(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, TLObject tLObject, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = tL_error;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
    }

    public /* synthetic */ u0(Object obj, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLObject tLObject2, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = u1Var;
        this.d = tLObject;
        this.f = tLObject2;
        this.b = obj2;
    }

    public /* synthetic */ u0(org.telegram.ui.hb hbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = 21;
        this.c = hbVar;
        this.d = tL_chatInviteExported;
        this.f = tL_messages_exportedChatInvite;
        this.b = zArr;
        this.e = u1Var;
    }
}
