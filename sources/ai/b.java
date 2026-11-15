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
import bi.i6;
import bi.u6;
import bi.v5;
import di.u7;
import di.u8;
import di.z6;
import fi.a4;
import fi.b4;
import fi.c5;
import fi.c6;
import fi.e3;
import fi.h9;
import fi.i9;
import fi.k6;
import fi.m4;
import fi.n3;
import fi.p3;
import fi.t3;
import fi.y3;
import hi.cb;
import hi.d7;
import hi.l8;
import hi.na;
import hi.o8;
import hi.q8;
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
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.f7;
import org.telegram.ui.gb;
import org.telegram.ui.ho;
import org.telegram.ui.ka;
import org.telegram.ui.kl0;
import org.telegram.ui.la;
import org.telegram.ui.lb;
import org.telegram.ui.lm;
import org.telegram.ui.m7;
import org.telegram.ui.q5;
import org.telegram.ui.qc;
import org.telegram.ui.qn;
import org.telegram.ui.t7;
import org.telegram.ui.vb;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(u8 u8Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, s10 s10Var) {
        this.a = 4;
        this.c = u8Var;
        this.b = zArr;
        this.d = str;
        this.e = chatInvite;
        this.f = s10Var;
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
            org.telegram.ui.Cells.b2 b2Var = laVar.H;
            if (b2Var != null) {
                b2Var.setText(hd.a0("UsernameAvailable", null, 2131743667, str));
                org.telegram.ui.Cells.b2 b2Var2 = laVar.H;
                int i7 = j6.w6;
                b2Var2.setTag(Integer.valueOf(i7));
                q6.U(laVar.H, i7, null);
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
                laVar.H.setText(hd.M0(2131743654, null));
                org.telegram.ui.Cells.b2 b2Var3 = laVar.H;
                int i10 = j6.p7;
                b2Var3.setTag(Integer.valueOf(i10));
                q6.U(laVar.H, i10, null);
            } else if (tL_error == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
                laVar.H.setText(hd.M0(2131743658, null));
                org.telegram.ui.Cells.b2 b2Var4 = laVar.H;
                int i11 = j6.p7;
                b2Var4.setTag(Integer.valueOf(i11));
                q6.U(laVar.H, i11, null);
            } else {
                if (checkusername.username.length() == 4) {
                    laVar.H.setText(hd.M0(2131743653, null));
                } else {
                    laVar.H.setText(hd.M0(2131743657, null));
                }
                org.telegram.ui.Cells.b2 b2Var5 = laVar.H;
                int i12 = j6.F6;
                b2Var5.setTag(Integer.valueOf(i12));
                q6.U(laVar.H, i12, null);
            }
            ka kaVar2 = laVar.G;
            if (kaVar2 != null) {
                ka.a(kaVar2);
            }
        }
    }

    private final void b() {
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
            adVar.W.setText(hd.a0("LinkAvailable", null, 2131748924, str));
            org.telegram.ui.Cells.b2 b2Var = adVar.W;
            int i7 = j6.w6;
            b2Var.setTag(Integer.valueOf(i7));
            q6.U(adVar.W, i7, null);
            adVar.b0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            adVar.W.setText(hd.M0(2131743654, null));
            q6.U(adVar.W, j6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(hd.M0(2131743653, null));
            } else {
                adVar.W.setText(hd.M0(2131743657, null));
            }
            q6.U(adVar.W, j6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            q6.U(adVar.W, j6.p7, null);
            adVar.W.setText(hd.M0(2131748912, null));
        } else {
            q6.U(adVar.W, j6.p7, null);
            adVar.l0 = false;
            adVar.l0();
        }
        adVar.b0 = false;
    }

    private final void c() {
        an anVar = (an) this.d;
        boolean[] zArr = (boolean[]) this.b;
        boolean[] zArr2 = (boolean[]) this.c;
        ImageView imageView = (ImageView) this.e;
        ImageView imageView2 = (ImageView) this.f;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        l5 l5Var = new l5(jArr, zArr2, imageView, imageView2, 8);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = anVar.u5.e1();
        tL_messages_rateTranscribedAudio.peer = anVar.getMessagesController().m1(anVar.u5.k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = anVar.u5.k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        anVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new z9(anVar, l5Var, jArr, 4));
        org.telegram.messenger.g0.i3(l5Var, 150L);
    }

    private final void d() {
        an.w0((an) this.c, (View) this.d, (boolean[]) this.b, (org.telegram.ui.ActionBar.g1) this.e, (View) this.f);
    }

    private final void f() {
        lm lmVar = (lm) this.b;
        TLRPC.Message message = (TLRPC.Message) this.c;
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        gj gjVar = (gj) this.e;
        q5 q5Var = (q5) this.f;
        an anVar = lmVar.a;
        if (message.suggested_post.schedule_date != 0) {
            anVar.getMessagesController().v(gjVar.k.id, 0, m5.o(gjVar.k.peer_id), null, false);
        } else {
            t1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) t4.Q(anVar.getParentActivity(), 0L, new m2.d(19, lmVar, gjVar), anVar.getResourceProvider(), 1).b;
            u2Var.show();
            u2Var.setOnDismissListener(q5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a3e  */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kl0 kl0Var;
        SQLiteCursor sQLiteCursor;
        a1.c cVar;
        ArrayList arrayList;
        long j3;
        boolean z10;
        int i7;
        SQLiteCursor sQLiteCursor2;
        int i10;
        kl0 kl0Var2;
        TL_stars.SavedStarGift savedStarGift;
        kl0 kl0Var3;
        boolean z11;
        ArrayList arrayList2;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        long j10;
        b4 b4Var;
        h9 h9Var;
        int i12;
        int i13 = 17;
        int i14 = 18;
        int i15 = 4;
        int i16 = 1;
        int i17 = 0;
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
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 > 0) {
                    return;
                }
                boolean z12 = zArr3[0];
                d.c = z12 ? 1 : -1;
                Log.d("Dictation", "support probe: ".concat(z12 ? "ok" : "no service supports any language → no dictation"));
                eVar.run();
                return;
            case 1:
                u6 u6Var = (u6) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i19 = u6Var.U1;
                org.telegram.ui.ActionBar.e2 e2Var = u6Var.s1;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        t4.c0(i19, tL_error, e2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    org.telegram.messenger.r1 i20 = org.telegram.messenger.r1.i();
                    Activity parentActivity = e2Var.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i19);
                    wf.b bVar = new wf.b(i13, false);
                    bVar.R(u6Var.a2.h);
                    i20.l(parentActivity, a10, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.p()));
                    return;
                }
            case 2:
                di.p0 p0Var = (di.p0) this.b;
                vf.b bVar2 = (vf.b) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f;
                di.l1 l1Var = p0Var.n2;
                if (l1Var != null) {
                    l1Var.run();
                }
                bVar2.c(false);
                t1Var.dismiss();
                p0Var.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (updates == null) {
                        cc.a0(T).f0(tL_error2, false);
                        return;
                    }
                    xb I = cc.a0(T).I(R.raw.forward, hd.M0(2131749700, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749701, p0Var.W1, m5.t(p0Var.X1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
            case 3:
                u8 u8Var = (u8) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                v5 v5Var = (v5) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    v5Var.a(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                    paymentForm.invoice.recurring = true;
                    np.s1(u8Var.a).Y3(paymentForm.users, false);
                    kl0Var = new kl0(paymentForm, tL_inputInvoiceStars, null);
                } else {
                    kl0Var = tLObject2 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject2) : null;
                }
                if (kl0Var == null) {
                    v5Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                kl0Var.a1 = new z6(v5Var, 0);
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q)) {
                    Q.presentFragment(kl0Var);
                    return;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                Q.showAsSheet(kl0Var, c2Var);
                return;
            case 4:
                u8 u8Var2 = (u8) this.c;
                boolean[] zArr4 = (boolean[]) this.b;
                String str = (String) this.d;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.e;
                s10 s10Var = (s10) this.f;
                zArr4[0] = true;
                u8Var2.Y(str, chatInvite, new bi.b(s10Var, i14));
                return;
            case 5:
                vr vrVar = (vr) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                a1.c cVar2 = (a1.c) this.f;
                try {
                    ?? r72 = 0;
                    sQLiteCursor2 = vrVar.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                    int i21 = 0;
                    j3 = 0;
                    while (sQLiteCursor2.next()) {
                        try {
                            try {
                                try {
                                    NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r72);
                                    if (byteBufferValue != 0) {
                                        TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r72), r72);
                                        if (TLdeserialize != null) {
                                            arrayList3.add(TLdeserialize);
                                        }
                                        byteBufferValue.reuse();
                                        i21 = (int) sQLiteCursor2.longValue(1);
                                        j3 = sQLiteCursor2.longValue(2);
                                    }
                                    r72 = 0;
                                } catch (Exception e10) {
                                    e = e10;
                                    i7 = i21;
                                    cVar = cVar2;
                                    arrayList = arrayList3;
                                    z10 = true;
                                    sQLiteCursor2 = sQLiteCursor2;
                                    a8.g(e, z10);
                                    if (sQLiteCursor2 != 0) {
                                    }
                                    i10 = i7;
                                    org.telegram.messenger.g0.h3(new u7(cVar, arrayList, i10, j3, arrayList5, arrayList4));
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursor2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cVar = cVar2;
                            arrayList = arrayList3;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    int size = arrayList3.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj = arrayList3.get(i22);
                        i22++;
                        TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                        if (peer != null) {
                            cVar = cVar2;
                            arrayList = arrayList3;
                            try {
                                long o4 = m5.o(peer);
                                if (o4 > 0) {
                                    arrayList6.add(Long.valueOf(o4));
                                } else if (o4 < 0) {
                                    arrayList7.add(Long.valueOf(-o4));
                                }
                            } catch (Exception e12) {
                                e = e12;
                                i7 = i21;
                                z10 = true;
                                sQLiteCursor2 = sQLiteCursor2;
                                a8.g(e, z10);
                                if (sQLiteCursor2 != 0) {
                                    sQLiteCursor2.dispose();
                                }
                                i10 = i7;
                                org.telegram.messenger.g0.h3(new u7(cVar, arrayList, i10, j3, arrayList5, arrayList4));
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
                        vrVar.Q(TextUtils.join(",", arrayList7), arrayList4);
                    }
                    if (!arrayList6.isEmpty()) {
                        vrVar.n0(arrayList6, arrayList5, false);
                    }
                    sQLiteCursor2.dispose();
                    i10 = i21;
                } catch (Exception e13) {
                    e = e13;
                    cVar = cVar2;
                    arrayList = arrayList3;
                    j3 = 0;
                    z10 = true;
                    i7 = 0;
                    sQLiteCursor2 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                org.telegram.messenger.g0.h3(new u7(cVar, arrayList, i10, j3, arrayList5, arrayList4));
                return;
            case 6:
                u8 u8Var3 = (u8) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                s10 s10Var2 = (s10) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    s10Var2.a(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject3 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                    paymentForm2.invoice.recurring = true;
                    np.s1(u8Var3.a).Y3(paymentForm2.users, false);
                    kl0Var2 = new kl0(paymentForm2, tL_inputInvoiceStars2, null);
                } else {
                    kl0Var2 = tLObject3 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject3) : null;
                }
                if (kl0Var2 == null) {
                    s10Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                kl0Var2.a1 = new a1.c(s10Var2, 28);
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q2)) {
                    Q2.presentFragment(kl0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2();
                c2Var2.a = true;
                Q2.showAsSheet(kl0Var2, c2Var2);
                return;
            case 7:
                List list = (List) this.b;
                s10 s10Var3 = (s10) this.c;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.d;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.e;
                Activity activity = (Activity) this.f;
                if (list.isEmpty()) {
                    a8.b("StarsController.buy queryProductDetails done: no products");
                    org.telegram.messenger.g0.h3(new di.q6(s10Var3, 1));
                    return;
                }
                f5.m mVar = (f5.m) list.get(0);
                f5.i a11 = mVar.a();
                if (a11 == null) {
                    a8.b("StarsController.buy queryProductDetails done: no details");
                    org.telegram.messenger.g0.h3(new di.q6(s10Var3, 2));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a11.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                org.telegram.messenger.r1.i().d(mVar.c, new i6(s10Var3, 1));
                org.telegram.messenger.r1.i().h = new di.q6(s10Var3, 3);
                a8.b("StarsController.buy launchBillingFlow");
                org.telegram.messenger.r1 i23 = org.telegram.messenger.r1.i();
                org.telegram.messenger.c a12 = org.telegram.messenger.c.a(m10.t0);
                wf.b bVar3 = new wf.b(i13, false);
                bVar3.R((f5.m) list.get(0));
                i23.l(activity, a12, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar3.p()));
                return;
            case 8:
                u8 u8Var4 = (u8) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                z10 z10Var = (z10) this.f;
                int i24 = u8Var4.a;
                t1Var2.dismiss();
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    np.s1(i24).Y3(tL_payments_savedStarGifts.users, false);
                    np.s1(i24).S3(tL_payments_savedStarGifts.chats, false);
                    for (int i25 = 0; i25 < tL_payments_savedStarGifts.gifts.size(); i25++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i25);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                            z10Var.a(savedStarGift);
                            return;
                        }
                    }
                }
                savedStarGift = null;
                z10Var.a(savedStarGift);
                return;
            case 9:
                u8 u8Var5 = (u8) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                org.telegram.ui.Wallet.t1 t1Var3 = (org.telegram.ui.Wallet.t1) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error5 != null) {
                    t1Var3.a(Boolean.FALSE, tL_error5.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject5;
                    paymentForm3.invoice.recurring = true;
                    np.s1(u8Var5.a).Y3(paymentForm3.users, false);
                    kl0Var3 = new kl0(paymentForm3, tL_inputInvoiceStars3, null);
                } else {
                    kl0Var3 = tLObject5 instanceof TLRPC.PaymentReceipt ? new kl0((TLRPC.PaymentReceipt) tLObject5) : null;
                }
                if (kl0Var3 == null) {
                    t1Var3.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                kl0Var3.a1 = new a1.c(t1Var3, 29);
                org.telegram.ui.ActionBar.e2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q3)) {
                    Q3.presentFragment(kl0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2();
                c2Var3.a = true;
                Q3.showAsSheet(kl0Var3, c2Var3);
                return;
            case 10:
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
            case 11:
                b4 b4Var2 = (b4) this.b;
                Runnable runnable2 = (Runnable) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                o8 o8Var = (o8) this.f;
                e6 e6Var = b4Var2.l0;
                e3 e3Var = b4Var2.M0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error6 == null || "STORY_NOT_MODIFIED".equals(tL_error6.text)) {
                    storyItem.parsedPrivacy = o8Var;
                    ArrayList arrayList8 = o8Var.b;
                    int i26 = o8Var.a;
                    ArrayList arrayList9 = o8Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList10 = new ArrayList<>();
                    while (i17 < arrayList8.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList8.get(i17);
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
                                    arrayList8 = arrayList8;
                                    i17 = i17;
                                }
                                arrayList2 = arrayList8;
                                i11 = i17;
                                arrayList10.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList2 = arrayList8;
                                i11 = i17;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i28 = 0; i28 < tL_inputPrivacyValueAllowUsers.users.size(); i28 = com.google.android.gms.internal.vision.e2.g(i28, 1, tL_inputPrivacyValueAllowUsers.users.get(i28).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    i16 = 1;
                                    arrayList10.add(tL_privacyValueAllowUsers);
                                    i17 = i11 + 1;
                                    arrayList8 = arrayList2;
                                }
                            }
                            i16 = 1;
                            i17 = i11 + 1;
                            arrayList8 = arrayList2;
                        }
                        arrayList2 = arrayList8;
                        i11 = i17;
                        i17 = i11 + 1;
                        arrayList8 = arrayList2;
                    }
                    storyItem.privacy = arrayList10;
                    storyItem.close_friends = i26 == i16;
                    storyItem.contacts = i26 == 2;
                    storyItem.selected_contacts = i26 == 3;
                    np.s1(b4Var2.m2).P1().s0(storyItem.dialogId, storyItem, true);
                    b4Var2.M3 = true;
                    if (i26 == 4) {
                        new cc(e3Var, e6Var).Q(R.raw.contact_check, 36, hd.N0("StorySharedToEveryone")).j();
                    } else if (i26 == 1) {
                        new cc(e3Var, e6Var).Q(R.raw.contact_check, 36, hd.N0("StorySharedToCloseFriends")).j();
                    } else if (i26 == 2) {
                        if (arrayList9.isEmpty()) {
                            new cc(e3Var, e6Var).Q(R.raw.contact_check, 36, hd.N0("StorySharedToAllContacts")).j();
                        } else {
                            new cc(e3Var, e6Var).Q(R.raw.contact_check, 36, hd.G(arrayList9.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i26 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList9);
                        Iterator it = o8Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z11 = false;
                        new cc(e3Var, e6Var).Q(R.raw.contact_check, 36, hd.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                    }
                    z11 = false;
                } else {
                    k5.n(null, 2131743879, new cc(e3Var, e6Var), R.raw.error, 36);
                    z11 = false;
                }
                b4Var2.d1(z11);
                return;
            case 12:
                t3 t3Var = (t3) this.b;
                Activity activity2 = (Activity) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var = (i9) this.e;
                y3 y3Var = (y3) this.f;
                sa D = sa.D(activity2, t3Var.x.m2);
                a4 a4Var = t3Var.x.w2;
                long j11 = (a4Var == null || (h9Var = (h9) a4Var.c) == null) ? 0L : h9Var.currentPosition;
                d7 n10 = d7.n(t3Var.x.y1.h(), t3Var.x.y1.a);
                b4 b4Var3 = t3Var.x;
                n10.e = b4Var3.l1;
                TL_stories.StoryItem storyItem3 = b4Var3.y1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i29 = 0;
                    while (true) {
                        if (i29 >= document.attributes.size()) {
                            tL_documentAttributeVideo = null;
                        } else if (document.attributes.get(i29) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i29);
                        } else {
                            i29++;
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j10;
                        d7 g10 = n10.g();
                        g10.b0 = true;
                        b4Var = t3Var.x;
                        TL_stories.StoryItem storyItem4 = b4Var.y1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new bi.j(t3Var, storyItem4, storyItem2, i15);
                        if (b4Var.G0()) {
                            b4 b4Var4 = t3Var.x;
                            g10.J0 = b4Var4.l1;
                            g10.L0 = np.a5(b4Var4.y1.a.media);
                            k6 k6Var = i9Var.O0;
                            if (k6Var instanceof c6) {
                                g10.K0 = ((c6) k6Var).E;
                            }
                        }
                        D.R(na.d(i9Var), g10, j11);
                        D.R = new n3(t3Var, 2);
                        D.S = new p3(t3Var, y3Var, i17);
                        return;
                    }
                }
                j10 = 0;
                n10.e0 = j10;
                d7 g102 = n10.g();
                g102.b0 = true;
                b4Var = t3Var.x;
                TL_stories.StoryItem storyItem42 = b4Var.y1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new bi.j(t3Var, storyItem42, storyItem2, i15);
                if (b4Var.G0()) {
                }
                D.R(na.d(i9Var), g102, j11);
                D.R = new n3(t3Var, 2);
                D.S = new p3(t3Var, y3Var, i17);
                return;
            case 13:
                m4 m4Var = (m4) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str2 = (String) this.d;
                l6 l6Var = (l6) this.e;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(user);
                c5 c5Var = m4Var.b;
                g5.r(c5Var.w).i(arrayList11, false);
                new cc(c5Var, c5Var.s).Q(R.raw.ic_ban, 36, hd.a0(null, null, 2131751466, str2)).j();
                l6Var.a(true, c5Var.d(storyView) ? 1.0f : 0.5f);
                return;
            case 14:
                l8 l8Var = (l8) this.b;
                org.telegram.ui.ActionBar.t1 t1Var4 = (org.telegram.ui.ActionBar.t1) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f;
                q8 q8Var = l8Var.a0;
                t1Var4.dismiss();
                if (!(tLObject6 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error7 != null) {
                        org.telegram.ui.ActionBar.k2 k2Var = q8Var.c;
                        int i30 = q8.Y1;
                        new cc(k2Var, q8Var.J0).f0(tL_error7, true);
                        return;
                    }
                    return;
                }
                ar[] arVarArr = new ar[1];
                Context context = l8Var.getContext();
                int i31 = q8.Y1;
                ar arVar = new ar(context, q8Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject6, q8Var.G1 ? null : new v1(i14, l8Var, arVarArr), new fi.b());
                arVarArr[0] = arVar;
                arVar.show();
                return;
            case 15:
                cb.a((cb) this.b, (ViewGroup) this.c, (e6) this.d, (u9) this.e, (View) this.f);
                return;
            case 16:
                jg.a2 a2Var = (jg.a2) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList arrayList12 = (ArrayList) this.e;
                LongSparseArray longSparseArray = (LongSparseArray) this.f;
                a2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                jg.c2 c2Var4 = a2Var.a;
                if (str3.equals(c2Var4.S)) {
                    c2Var4.P = 0;
                    if (tLObject7 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject7;
                        int size2 = arrayList12.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i17 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList12.add(document2);
                            }
                            i17++;
                        }
                        if (size2 != arrayList12.size()) {
                            c2Var4.J.put(arrayList12, c2Var4.S);
                            if (size2 == 0) {
                                c2Var4.K.add(arrayList12);
                            }
                            c2Var4.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                kg.v1 v1Var = (kg.v1) this.b;
                ArrayList arrayList13 = (ArrayList) this.c;
                ArrayList arrayList14 = (ArrayList) this.d;
                kg.u1 u1Var = (kg.u1) this.e;
                gj gjVar = (gj) this.f;
                int i32 = v1Var.a;
                np.s1(i32).Y3(arrayList13, true);
                np.s1(i32).S3(arrayList14, true);
                u1Var.e = gjVar;
                if (gjVar != null) {
                    gjVar.l(u1Var.a, u1Var.b);
                }
                v1Var.l();
                ns.f(i32).k(ns.F1, new Object[0]);
                return;
            case 18:
                kg.v1 v1Var2 = (kg.v1) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                ArrayList<Integer> arrayList15 = (ArrayList) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                if (!(tLObject8 instanceof TLRPC.TL_messages_messages)) {
                    a8.d("received " + tLObject8 + " " + tL_error8 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList16 = ((TLRPC.TL_messages_messages) tLObject8).messages;
                arrayList15.clear();
                int size4 = arrayList16.size();
                int i33 = 0;
                while (i33 < size4) {
                    TLRPC.Message message = arrayList16.get(i33);
                    i33++;
                    arrayList15.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList15;
                while (i17 < arrayList15.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    i17++;
                }
                ConnectionsManager.getInstance(v1Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 19:
                kg.v1 v1Var3 = (kg.v1) this.b;
                ArrayList arrayList17 = (ArrayList) this.c;
                ArrayList arrayList18 = (ArrayList) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                Runnable runnable3 = (Runnable) this.f;
                v1Var3.e = false;
                int i34 = v1Var3.a;
                np.s1(i34).Y3(arrayList17, true);
                np.s1(i34).S3(arrayList18, true);
                ArrayList arrayList20 = v1Var3.b;
                arrayList20.clear();
                arrayList20.addAll(arrayList19);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    v1Var3.i(null, false);
                }
                ns.f(i34).k(ns.F1, new Object[0]);
                return;
            case 20:
                ((CameraController) this.b).lambda$open$10((CameraSession) this.c, (Runnable) this.d, (SurfaceTexture) this.e, (Runnable) this.f);
                return;
            case 21:
                t7 t7Var = (t7) this.b;
                ei.b bVar4 = (ei.b) this.c;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                t7Var.getClass();
                bVar4.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                w61 w61Var = t7Var.n;
                for (int i35 = 0; i35 < w61Var.getViewPages().length; i35++) {
                    uj0 c10 = t7Var.c(w61Var.getViewPages()[i35]);
                    if (c10 != null && ((f7) c10.getAdapter()).d == 3) {
                        f7 f7Var = (f7) c10.getAdapter();
                        int i36 = 0;
                        while (true) {
                            if (i36 >= f7Var.e.size()) {
                                break;
                            } else if (((m7) f7Var.e.get(i36)).d == bVar4) {
                                f7Var.g(i36);
                            } else {
                                i36++;
                            }
                        }
                    }
                }
                return;
            case 22:
                a();
                return;
            case 23:
                gb gbVar = (gb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr5 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.t1 t1Var5 = (org.telegram.ui.ActionBar.t1) this.f;
                lb lbVar = gbVar.a.n;
                lbVar.B0 = false;
                lbVar.z0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr5[0]) {
                    return;
                }
                t1Var5.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    lb.F0(lbVar, tL_messages_exportedChatInvite, lbVar.A0);
                    return;
                } else {
                    k5.n(null, 2131748913, cc.a0(lbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 24:
                qc qcVar = (qc) this.c;
                boolean[] zArr6 = (boolean[]) this.b;
                int[] iArr2 = (int[]) this.e;
                int[] iArr3 = (int[]) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f;
                if (zArr6[0] || (i12 = iArr2[0]) >= iArr3[0]) {
                    return;
                }
                if (tL_error9 != null) {
                    zArr6[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error9.text)) {
                        qcVar.getMessagesController().G0().b(qcVar.a, qcVar.c, new vb(qcVar, i16));
                        return;
                    } else {
                        qcVar.Q.setLoading(false);
                        cc.a0(qcVar).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error9.text)).j();
                        return;
                    }
                }
                int i37 = i12 + 1;
                iArr2[0] = i37;
                if (i37 == iArr3[0]) {
                    qcVar.finishFragment();
                    org.telegram.ui.ActionBar.e2 e2Var2 = qcVar.m0;
                    if (e2Var2 != null) {
                        if (e2Var2 instanceof qn) {
                            ((qn) e2Var2).t0();
                        }
                        k5.n(null, qcVar.d ? 2131749498 : 2131752459, cc.a0(qcVar.m0), R.raw.contact_check, 36);
                        qcVar.m0 = null;
                    }
                    qcVar.Q.setLoading(false);
                    return;
                }
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
                ho hoVar = (ho) this.b;
                String str6 = (String) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
                hoVar.i0 = 0;
                String str7 = hoVar.j0;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error10 == null && (tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    hoVar.h.setText(hd.a0("LinkAvailable", null, 2131748924, str6));
                    hoVar.h.setTextColorByKey(j6.w6);
                    hoVar.l0 = true;
                    return;
                }
                if (tL_error10 != null && "USERNAME_INVALID".equals(tL_error10.text) && tL_channels_checkUsername.username.length() == 4) {
                    hoVar.h.setText(hd.M0(2131743654, null));
                    q6.U(hoVar.h.getTextView(), j6.p7, null);
                } else if (tL_error10 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error10.text)) {
                    if (tL_channels_checkUsername.username.length() == 4) {
                        hoVar.h.setText(hd.M0(2131743653, null));
                    } else {
                        hoVar.h.setText(hd.M0(2131743657, null));
                    }
                    q6.U(hoVar.h.getTextView(), j6.F6, null);
                } else if (tL_error10 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error10.text)) {
                    hoVar.h.setText(hd.M0(2131748912, null));
                    hoVar.h.setTextColorByKey(j6.p7);
                } else {
                    hoVar.d0 = false;
                    hoVar.f0();
                }
                hoVar.l0 = false;
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
        this.a = 23;
        this.c = gbVar;
        this.d = tL_chatInviteExported;
        this.e = tL_messages_exportedChatInvite;
        this.b = zArr;
        this.f = t1Var;
    }

    public /* synthetic */ b(qc qcVar, boolean[] zArr, int[] iArr, int[] iArr2, TLRPC.TL_error tL_error) {
        this.a = 24;
        this.c = qcVar;
        this.b = zArr;
        this.e = iArr;
        this.d = iArr2;
        this.f = tL_error;
    }

    public /* synthetic */ b(an anVar, View view, boolean[] zArr, org.telegram.ui.ActionBar.g1 g1Var, View view2) {
        this.a = 27;
        this.c = anVar;
        this.d = view;
        this.b = zArr;
        this.e = g1Var;
        this.f = view2;
    }

    public /* synthetic */ b(an anVar, boolean[] zArr, boolean[] zArr2, ImageView imageView, ImageView imageView2) {
        this.a = 26;
        this.d = anVar;
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
