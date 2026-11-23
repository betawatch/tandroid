package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import hi.i9;
import hi.ib;
import hi.k9;
import hi.nb;
import hi.xb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.gb;
import org.telegram.ui.io;
import org.telegram.ui.ka;
import org.telegram.ui.kl0;
import org.telegram.ui.la;
import org.telegram.ui.lb;
import org.telegram.ui.mm;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.vb;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s1(f9 f9Var, TLObject tLObject, TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = 1;
        this.d = f9Var;
        this.b = tLObject;
        this.e = tL_inputStorePaymentGiftPremium;
        this.c = tL_error;
        this.f = tL_payments_canPurchaseStore;
    }

    private final void a() {
        la laVar = (la) this.d;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.b;
        TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
        laVar.e = 0;
        String str2 = laVar.f;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            org.telegram.ui.Cells.c2 c2Var = laVar.H;
            if (c2Var != null) {
                c2Var.setText(gd.a0("UsernameAvailable", null, 2131743420, str));
                org.telegram.ui.Cells.c2 c2Var2 = laVar.H;
                int i7 = org.telegram.ui.ActionBar.n6.w6;
                c2Var2.setTag(Integer.valueOf(i7));
                org.telegram.ui.ActionBar.u6.U(laVar.H, i7, null);
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
                laVar.H.setText(gd.N0(2131743407, null));
                org.telegram.ui.Cells.c2 c2Var3 = laVar.H;
                int i10 = org.telegram.ui.ActionBar.n6.p7;
                c2Var3.setTag(Integer.valueOf(i10));
                org.telegram.ui.ActionBar.u6.U(laVar.H, i10, null);
            } else if (tL_error == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                laVar.H.setText(gd.N0(2131743411, null));
                org.telegram.ui.Cells.c2 c2Var4 = laVar.H;
                int i11 = org.telegram.ui.ActionBar.n6.p7;
                c2Var4.setTag(Integer.valueOf(i11));
                org.telegram.ui.ActionBar.u6.U(laVar.H, i11, null);
            } else {
                if (checkusername.username.length() == 4) {
                    laVar.H.setText(gd.N0(2131743406, null));
                } else {
                    laVar.H.setText(gd.N0(2131743410, null));
                }
                org.telegram.ui.Cells.c2 c2Var5 = laVar.H;
                int i12 = org.telegram.ui.ActionBar.n6.F6;
                c2Var5.setTag(Integer.valueOf(i12));
                org.telegram.ui.ActionBar.u6.U(laVar.H, i12, null);
            }
            ka kaVar2 = laVar.G;
            if (kaVar2 != null) {
                ka.a(kaVar2);
            }
        }
    }

    private final void b() {
        int i7;
        qc qcVar = (qc) this.d;
        boolean[] zArr = (boolean[]) this.b;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
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
                kc.b0(qcVar).Q(R.raw.error, 36, gd.a0(null, null, 2131743631, tL_error.text)).j();
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
                org.telegram.messenger.f3.n(null, qcVar.d ? 2131749305 : 2131752447, kc.b0(qcVar.m0), R.raw.contact_check, 36);
                qcVar.m0 = null;
            }
            qcVar.Q.setLoading(false);
        }
    }

    private final void c() {
        ad adVar = (ad) this.d;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            adVar.W.setText(gd.a0("LinkAvailable", null, 2131748731, str));
            org.telegram.ui.Cells.c2 c2Var = adVar.W;
            int i7 = org.telegram.ui.ActionBar.n6.w6;
            c2Var.setTag(Integer.valueOf(i7));
            org.telegram.ui.ActionBar.u6.U(adVar.W, i7, null);
            adVar.b0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            adVar.W.setText(gd.N0(2131743407, null));
            org.telegram.ui.ActionBar.u6.U(adVar.W, org.telegram.ui.ActionBar.n6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(gd.N0(2131743406, null));
            } else {
                adVar.W.setText(gd.N0(2131743410, null));
            }
            org.telegram.ui.ActionBar.u6.U(adVar.W, org.telegram.ui.ActionBar.n6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.u6.U(adVar.W, org.telegram.ui.ActionBar.n6.p7, null);
            adVar.W.setText(gd.N0(2131748719, null));
        } else {
            org.telegram.ui.ActionBar.u6.U(adVar.W, org.telegram.ui.ActionBar.n6.p7, null);
            adVar.l0 = false;
            adVar.l0();
        }
        adVar.b0 = false;
    }

    private final void d() {
        bn bnVar = (bn) this.d;
        boolean[] zArr = (boolean[]) this.b;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f;
        ImageView imageView2 = (ImageView) this.c;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        oi.h hVar = new oi.h(jArr, zArr2, imageView, imageView2, 12);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = bnVar.v5.e1();
        tL_messages_rateTranscribedAudio.peer = bnVar.getMessagesController().o1(bnVar.v5.k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = bnVar.v5.k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        bnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new z9(bnVar, hVar, jArr, 4));
        org.telegram.messenger.g0.h3(hVar, 150L);
    }

    private final void f() {
        mm mmVar = (mm) this.d;
        TLRPC.Message message = (TLRPC.Message) this.b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.e;
        fj fjVar = (fj) this.f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.c;
        bn bnVar = mmVar.a;
        if (message.suggested_post.schedule_date != 0) {
            bnVar.getMessagesController().v(fjVar.k.id, 0, org.telegram.messenger.n5.o(fjVar.k.peer_id), null, false);
        } else {
            t1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.Q(bnVar.getParentActivity(), 0L, new oi.f0(17, mmVar, fjVar), bnVar.getResourceProvider(), 1).b;
            w2Var.show();
            w2Var.setOnDismissListener(q5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a7  */
    /* JADX WARN: Type inference failed for: r14v7, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v21, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Integer] */
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
        fi.z3 z3Var;
        fi.e9 e9Var;
        int i12 = 17;
        int i13 = 2;
        kl0 kl0Var = null;
        r14 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        kl0 kl0Var2 = null;
        r14 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        kl0 kl0Var3 = null;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.d;
                TLObject tLObject = (TLObject) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = f2Var.c;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    fc Q = new kc(m2Var, f2Var.J0).Q(R.raw.contact_check, 36, gd.N0(2131746662, null));
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
                    tr.a0(f2Var.a).j2(userFull, false);
                }
                if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                    org.telegram.messenger.f3.n(null, 2131743632, new kc(m2Var, f2Var.J0), R.raw.error, 36);
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f2Var.getContext(), f2Var.J0);
                    alertDialog$Builder.a.S = gd.N0(2131746658, null);
                    alertDialog$Builder.a.U = gd.N0(2131746659, null);
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                }
                f2Var.j2.O(true);
                return;
            case 1:
                f9 f9Var = (f9) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i16 = f9Var.U1;
                org.telegram.ui.ActionBar.g2 g2Var = f9Var.s1;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.b5.c0(i16, tL_error2, g2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                    Activity parentActivity = g2Var.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i16);
                    wf.b bVar = new wf.b(i12, false);
                    bVar.R(f9Var.a2.h);
                    i17.l(parentActivity, a10, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.q()));
                    return;
                }
            case 2:
                di.o0 o0Var = (di.o0) this.d;
                vf.b bVar2 = (vf.b) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
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
                        kc.b0(T).g0(tL_error3, false);
                        return;
                    }
                    fc I = kc.b0(T).I(R.raw.forward, gd.N0(2131749682, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749683, o0Var.o1, org.telegram.messenger.n5.t(o0Var.p1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
            case 3:
                di.y8 y8Var = (di.y8) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                h8 h8Var = (h8) this.e;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    h8Var.a(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject3 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                    paymentForm.invoice.recurring = true;
                    mp.u1(y8Var.a).f4(paymentForm.users, false);
                    kl0Var = new kl0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    kl0Var = new kl0((TLRPC.PaymentReceipt) tLObject3);
                }
                if (kl0Var == null) {
                    h8Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                kl0Var.a1 = new di.v6(h8Var, 1);
                org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q2)) {
                    Q2.presentFragment(kl0Var);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                Q2.showAsSheet(kl0Var, e2Var);
                return;
            case 4:
                di.y8 y8Var2 = (di.y8) this.d;
                boolean[] zArr = (boolean[]) this.b;
                String str2 = (String) this.e;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f;
                p10 p10Var = (p10) this.c;
                zArr[0] = true;
                y8Var2.X(str2, chatInvite, new b(p10Var, i12));
                return;
            case 5:
                tr trVar = (tr) this.d;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = (ArrayList) this.f;
                a1.c cVar2 = (a1.c) this.c;
                try {
                    try {
                        ?? r62 = 0;
                        ?? queryFinalized = trVar.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i18 = 0;
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
                                    i18 = (int) queryFinalized.longValue(1);
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
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj = arrayList3.get(i19);
                            i19++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                cVar = cVar2;
                                arrayList = arrayList3;
                                try {
                                    long o4 = org.telegram.messenger.n5.o(peer);
                                    if (o4 > 0) {
                                        arrayList6.add(Long.valueOf(o4));
                                    } else if (o4 < 0) {
                                        arrayList7.add(Long.valueOf(-o4));
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i7 = i18;
                                    z10 = true;
                                    sQLiteCursor = queryFinalized;
                                    org.telegram.messenger.a8.g(e, z10);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    i10 = i7;
                                    org.telegram.messenger.g0.g3(new s4(cVar, arrayList, i10, j3, arrayList5, arrayList4));
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
                        i10 = i18;
                    } catch (Exception e12) {
                        e = e12;
                        cVar = cVar2;
                        arrayList = arrayList3;
                        j3 = 0;
                        z10 = true;
                        i7 = 0;
                    }
                    org.telegram.messenger.g0.g3(new s4(cVar, arrayList, i10, j3, arrayList5, arrayList4));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 6:
                di.y8 y8Var3 = (di.y8) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                p10 p10Var2 = (p10) this.e;
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error5 != null) {
                    p10Var2.a(Boolean.FALSE, tL_error5.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm2.invoice.recurring = true;
                    mp.u1(y8Var3.a).f4(paymentForm2.users, false);
                    kl0Var3 = new kl0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    kl0Var3 = new kl0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (kl0Var3 == null) {
                    p10Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                kl0Var3.a1 = new a1.c(p10Var2, 29);
                org.telegram.ui.ActionBar.g2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q3)) {
                    Q3.presentFragment(kl0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                e2Var2.a = true;
                Q3.showAsSheet(kl0Var3, e2Var2);
                return;
            case 7:
                List list = (List) this.d;
                p10 p10Var3 = (p10) this.b;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.e;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.f;
                Activity activity = (Activity) this.c;
                if (list.isEmpty()) {
                    org.telegram.messenger.a8.b("StarsController.buy queryProductDetails done: no products");
                    org.telegram.messenger.g0.g3(new di.t6(p10Var3, 1));
                    return;
                }
                f5.m mVar = (f5.m) list.get(0);
                f5.i a11 = mVar.a();
                if (a11 == null) {
                    org.telegram.messenger.a8.b("StarsController.buy queryProductDetails done: no details");
                    org.telegram.messenger.g0.g3(new di.t6(p10Var3, 2));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a11.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                org.telegram.messenger.r1.i().d(mVar.c, new u8(p10Var3, 1));
                org.telegram.messenger.r1.i().h = new di.t6(p10Var3, 3);
                org.telegram.messenger.a8.b("StarsController.buy launchBillingFlow");
                org.telegram.messenger.r1 i20 = org.telegram.messenger.r1.i();
                org.telegram.messenger.c a12 = org.telegram.messenger.c.a(i10.t0);
                wf.b bVar3 = new wf.b(i12, false);
                bVar3.R((f5.m) list.get(0));
                i20.l(activity, a12, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar3.q()));
                return;
            case 8:
                di.y8 y8Var4 = (di.y8) this.d;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject5 = (TLObject) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                w10 w10Var = (w10) this.c;
                int i21 = y8Var4.a;
                t1Var2.dismiss();
                if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                    mp.u1(i21).f4(tL_payments_savedStarGifts.users, false);
                    mp.u1(i21).Z3(tL_payments_savedStarGifts.chats, false);
                    for (int i22 = 0; i22 < tL_payments_savedStarGifts.gifts.size(); i22++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i22);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        }
                    }
                }
                w10Var.a(savedStarGift);
                return;
            case 9:
                di.y8 y8Var5 = (di.y8) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.e;
                TLObject tLObject6 = (TLObject) this.b;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error6 != null) {
                    f0Var.a(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject6;
                    paymentForm3.invoice.recurring = true;
                    mp.u1(y8Var5.a).f4(paymentForm3.users, false);
                    kl0Var2 = new kl0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    kl0Var2 = new kl0((TLRPC.PaymentReceipt) tLObject6);
                }
                if (kl0Var2 == null) {
                    f0Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                kl0Var2.a1 = new di.v6(f0Var, 0);
                org.telegram.ui.ActionBar.g2 Q4 = LaunchActivity.Q();
                if (Q4 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q4)) {
                    Q4.presentFragment(kl0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2();
                e2Var3.a = true;
                Q4.showAsSheet(kl0Var2, e2Var3);
                return;
            case 10:
                fi.p pVar = (fi.p) this.d;
                fi.q qVar = (fi.q) this.b;
                Long l10 = (Long) this.e;
                nb nbVar = (nb) this.f;
                Runnable runnable = (Runnable) this.c;
                if (pVar == null) {
                    pVar = qVar.e(l10.longValue());
                }
                nbVar.X(ib.c(pVar));
                runnable.run();
                return;
            case 11:
                fi.z3 z3Var2 = (fi.z3) this.d;
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                i9 i9Var = (i9) this.f;
                org.telegram.ui.ActionBar.i6 i6Var = z3Var2.l0;
                fi.c3 c3Var = z3Var2.M0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error7 == null || "STORY_NOT_MODIFIED".equals(tL_error7.text)) {
                    storyItem.parsedPrivacy = i9Var;
                    ArrayList arrayList8 = i9Var.b;
                    int i23 = i9Var.a;
                    ArrayList arrayList9 = i9Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList10 = new ArrayList<>();
                    int i24 = 0;
                    while (i24 < arrayList8.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList8.get(i24);
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
                                int i25 = 0;
                                while (i25 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i25 = com.google.android.gms.internal.vision.e2.g(i25, 1, tL_inputPrivacyValueDisallowUsers.users.get(i25).user_id, tL_privacyValueDisallowUsers.users);
                                    i24 = i24;
                                    arrayList8 = arrayList8;
                                }
                                arrayList2 = arrayList8;
                                i11 = i24;
                                arrayList10.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList2 = arrayList8;
                                i11 = i24;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i26 = 0; i26 < tL_inputPrivacyValueAllowUsers.users.size(); i26 = com.google.android.gms.internal.vision.e2.g(i26, 1, tL_inputPrivacyValueAllowUsers.users.get(i26).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    i14 = 1;
                                    arrayList10.add(tL_privacyValueAllowUsers);
                                    i24 = i11 + 1;
                                    arrayList8 = arrayList2;
                                }
                            }
                            i14 = 1;
                            i24 = i11 + 1;
                            arrayList8 = arrayList2;
                        }
                        arrayList2 = arrayList8;
                        i11 = i24;
                        i24 = i11 + 1;
                        arrayList8 = arrayList2;
                    }
                    storyItem.privacy = arrayList10;
                    storyItem.close_friends = i23 == i14;
                    storyItem.contacts = i23 == 2;
                    storyItem.selected_contacts = i23 == 3;
                    mp.u1(z3Var2.m2).R1().s0(storyItem.dialogId, storyItem, true);
                    z3Var2.M3 = true;
                    if (i23 == 4) {
                        new kc(c3Var, i6Var).Q(R.raw.contact_check, 36, gd.O0("StorySharedToEveryone")).j();
                    } else if (i23 == 1) {
                        new kc(c3Var, i6Var).Q(R.raw.contact_check, 36, gd.O0("StorySharedToCloseFriends")).j();
                    } else if (i23 == 2) {
                        if (arrayList9.isEmpty()) {
                            new kc(c3Var, i6Var).Q(R.raw.contact_check, 36, gd.O0("StorySharedToAllContacts")).j();
                        } else {
                            new kc(c3Var, i6Var).Q(R.raw.contact_check, 36, gd.G(arrayList9.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i23 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList9);
                        Iterator it = i9Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        kc kcVar = new kc(c3Var, i6Var);
                        z11 = false;
                        kcVar.Q(R.raw.contact_check, 36, gd.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                        z3Var2.d1(z11);
                        return;
                    }
                } else {
                    org.telegram.messenger.f3.n(null, 2131743632, new kc(c3Var, i6Var), R.raw.error, 36);
                }
                z11 = false;
                z3Var2.d1(z11);
                return;
            case 12:
                fi.r3 r3Var = (fi.r3) this.d;
                Activity activity2 = (Activity) this.b;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                fi.f9 f9Var2 = (fi.f9) this.f;
                fi.w3 w3Var = (fi.w3) this.c;
                nb D = nb.D(activity2, r3Var.x.m2);
                fi.y3 y3Var = r3Var.x.w2;
                long j11 = (y3Var == null || (e9Var = (fi.e9) y3Var.c) == null) ? 0L : e9Var.currentPosition;
                hi.x7 n10 = hi.x7.n(r3Var.x.y1.h(), r3Var.x.y1.a);
                fi.z3 z3Var3 = r3Var.x;
                n10.e = z3Var3.l1;
                TL_stories.StoryItem storyItem3 = z3Var3.y1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < document.attributes.size()) {
                            if (document.attributes.get(i27) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i27);
                            } else {
                                i27++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j10;
                        hi.x7 g10 = n10.g();
                        g10.b0 = true;
                        z3Var = r3Var.x;
                        TL_stories.StoryItem storyItem4 = z3Var.y1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new j(r3Var, storyItem4, storyItem2, 7);
                        if (z3Var.G0()) {
                            fi.z3 z3Var4 = r3Var.x;
                            g10.J0 = z3Var4.l1;
                            g10.L0 = mp.l5(z3Var4.y1.a.media);
                            fi.h6 h6Var = f9Var2.O0;
                            if (h6Var instanceof fi.a6) {
                                g10.K0 = ((fi.a6) h6Var).E;
                            }
                        }
                        D.R(ib.d(f9Var2), g10, j11);
                        D.R = new fi.l3(r3Var, i13);
                        D.S = new fi.n3(r3Var, w3Var, i15);
                        return;
                    }
                }
                j10 = 0;
                n10.e0 = j10;
                hi.x7 g102 = n10.g();
                g102.b0 = true;
                z3Var = r3Var.x;
                TL_stories.StoryItem storyItem42 = z3Var.y1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new j(r3Var, storyItem42, storyItem2, 7);
                if (z3Var.G0()) {
                }
                D.R(ib.d(f9Var2), g102, j11);
                D.R = new fi.l3(r3Var, i13);
                D.S = new fi.n3(r3Var, w3Var, i15);
                return;
            case 13:
                fi.k4 k4Var = (fi.k4) this.d;
                TLRPC.User user = (TLRPC.User) this.b;
                String str3 = (String) this.e;
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.c;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(user);
                fi.b5 b5Var = k4Var.b;
                org.telegram.messenger.i5.r(b5Var.w).i(arrayList11, false);
                new kc(b5Var, b5Var.s).Q(R.raw.ic_ban, 36, gd.a0(null, null, 2131751454, str3)).j();
                m6Var.a(true, b5Var.d(storyView) ? 1.0f : 0.5f);
                return;
            case 14:
                hi.f9 f9Var3 = (hi.f9) this.d;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.e;
                TLObject tLObject7 = (TLObject) this.b;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.c;
                k9 k9Var = f9Var3.a0;
                t1Var3.dismiss();
                if (!(tLObject7 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error8 != null) {
                        org.telegram.ui.ActionBar.m2 m2Var2 = k9Var.c;
                        int i28 = k9.Y1;
                        new kc(m2Var2, k9Var.J0).g0(tL_error8, true);
                        return;
                    }
                    return;
                }
                gr[] grVarArr = new gr[1];
                Context context = f9Var3.getContext();
                int i29 = k9.Y1;
                gr grVar = new gr(context, k9Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject7, k9Var.G1 ? null : new ai.s1(21, f9Var3, grVarArr), new fi.b());
                grVarArr[0] = grVar;
                grVar.show();
                return;
            case 15:
                xb.a((xb) this.d, (ViewGroup) this.b, (org.telegram.ui.ActionBar.i6) this.e, (ba) this.f, (View) this.c);
                return;
            case 16:
                jg.a2 a2Var = (jg.a2) this.d;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.e;
                TLObject tLObject8 = (TLObject) this.b;
                ArrayList arrayList12 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                a2Var.getClass();
                String str4 = tL_messages_getStickers.emoticon;
                jg.c2 c2Var = a2Var.a;
                if (str4.equals(c2Var.S)) {
                    c2Var.P = 0;
                    if (tLObject8 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                        int size2 = arrayList12.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i15 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList12.add(document2);
                            }
                            i15++;
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
            case 17:
                kg.w1 w1Var = (kg.w1) this.d;
                ArrayList arrayList13 = (ArrayList) this.b;
                ArrayList arrayList14 = (ArrayList) this.e;
                kg.v1 v1Var = (kg.v1) this.f;
                fj fjVar = (fj) this.c;
                int i30 = w1Var.a;
                mp.u1(i30).f4(arrayList13, true);
                mp.u1(i30).Z3(arrayList14, true);
                v1Var.e = fjVar;
                if (fjVar != null) {
                    fjVar.l(v1Var.a, v1Var.b);
                }
                w1Var.l();
                ks.f(i30).k(ks.F1, new Object[0]);
                return;
            case 18:
                kg.w1 w1Var2 = (kg.w1) this.d;
                TLObject tLObject9 = (TLObject) this.b;
                ArrayList<Integer> arrayList15 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                if (!(tLObject9 instanceof TLRPC.TL_messages_messages)) {
                    org.telegram.messenger.a8.d("received " + tLObject9 + " " + tL_error9 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList16 = ((TLRPC.TL_messages_messages) tLObject9).messages;
                arrayList15.clear();
                int size4 = arrayList16.size();
                int i31 = 0;
                while (i31 < size4) {
                    TLRPC.Message message = arrayList16.get(i31);
                    i31++;
                    arrayList15.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList15;
                while (i15 < arrayList15.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    i15++;
                }
                ConnectionsManager.getInstance(w1Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 19:
                kg.w1 w1Var3 = (kg.w1) this.d;
                ArrayList arrayList17 = (ArrayList) this.b;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.c;
                w1Var3.e = false;
                int i32 = w1Var3.a;
                mp.u1(i32).f4(arrayList17, true);
                mp.u1(i32).Z3(arrayList18, true);
                ArrayList arrayList20 = w1Var3.b;
                arrayList20.clear();
                arrayList20.addAll(arrayList19);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    w1Var3.i(null, false);
                }
                ks.f(i32).k(ks.F1, new Object[0]);
                return;
            case 20:
                ((CameraController) this.d).lambda$open$10((CameraSession) this.b, (Runnable) this.e, (SurfaceTexture) this.f, (Runnable) this.c);
                return;
            case 21:
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) this.d;
                ei.b bVar4 = (ei.b) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str5 = (String) this.f;
                String str6 = (String) this.c;
                t7Var.getClass();
                bVar4.e.a = false;
                tL_documentAttributeAudio.title = str5;
                tL_documentAttributeAudio.performer = str6;
                k71 k71Var = t7Var.n;
                for (int i33 = 0; i33 < k71Var.getViewPages().length; i33++) {
                    ek0 c10 = t7Var.c(k71Var.getViewPages()[i33]);
                    if (c10 != null && ((org.telegram.ui.f7) c10.getAdapter()).d == 3) {
                        org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) c10.getAdapter();
                        int i34 = 0;
                        while (true) {
                            if (i34 >= f7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.m7) f7Var.e.get(i34)).d == bVar4) {
                                f7Var.g(i34);
                            } else {
                                i34++;
                            }
                        }
                    }
                }
                return;
            case 22:
                a();
                return;
            case 23:
                gb gbVar = (gb) this.d;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.b;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr2 = (boolean[]) this.f;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.c;
                lb lbVar = gbVar.a.n;
                lbVar.B0 = false;
                lbVar.z0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                t1Var4.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    lb.F0(lbVar, tL_messages_exportedChatInvite, lbVar.A0);
                    return;
                } else {
                    org.telegram.messenger.f3.n(null, 2131748720, kc.b0(lbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                bn.w0((bn) this.d, (View) this.b, (boolean[]) this.e, (org.telegram.ui.ActionBar.g1) this.f, (View) this.c);
                return;
            case 28:
                f();
                return;
            default:
                io ioVar = (io) this.d;
                String str7 = (String) this.e;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.c;
                TLObject tLObject10 = (TLObject) this.b;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
                ioVar.i0 = 0;
                String str8 = ioVar.j0;
                if (str8 == null || !str8.equals(str7)) {
                    return;
                }
                if (tL_error10 == null && (tLObject10 instanceof TLRPC.TL_boolTrue)) {
                    ioVar.h.setText(gd.a0("LinkAvailable", null, 2131748731, str7));
                    ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.w6);
                    ioVar.l0 = true;
                    return;
                }
                if (tL_error10 != null && "USERNAME_INVALID".equals(tL_error10.text) && tL_channels_checkUsername.username.length() == 4) {
                    ioVar.h.setText(gd.N0(2131743407, null));
                    org.telegram.ui.ActionBar.u6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.n6.p7, null);
                } else if (tL_error10 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error10.text)) {
                    if (tL_channels_checkUsername.username.length() == 4) {
                        ioVar.h.setText(gd.N0(2131743406, null));
                    } else {
                        ioVar.h.setText(gd.N0(2131743410, null));
                    }
                    org.telegram.ui.ActionBar.u6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.n6.F6, null);
                } else if (tL_error10 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error10.text)) {
                    ioVar.h.setText(gd.N0(2131748719, null));
                    ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.n6.p7);
                } else {
                    ioVar.d0 = false;
                    ioVar.f0();
                }
                ioVar.l0 = false;
                return;
        }
    }

    public /* synthetic */ s1(di.y8 y8Var, TLRPC.TL_error tL_error, p10 p10Var, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i7) {
        this.a = i7;
        this.d = y8Var;
        this.c = tL_error;
        this.e = p10Var;
        this.b = tLObject;
        this.f = tL_inputInvoiceStars;
    }

    public /* synthetic */ s1(fi.z3 z3Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, i9 i9Var) {
        this.a = 11;
        this.d = z3Var;
        this.b = runnable;
        this.c = tL_error;
        this.e = storyItem;
        this.f = i9Var;
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = obj5;
    }

    public /* synthetic */ s1(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = tLObject;
        this.f = obj3;
        this.c = obj4;
    }

    public /* synthetic */ s1(org.telegram.ui.ActionBar.g2 g2Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, int i7) {
        this.a = i7;
        this.d = g2Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = tLObject2;
    }
}
