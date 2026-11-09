package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cn;
import org.telegram.ui.io;
import org.telegram.ui.jl0;
import org.telegram.ui.mp;
import org.telegram.ui.nm;
import org.telegram.ui.pq;
import org.telegram.ui.qq;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            bdVar.V.setText(org.telegram.messenger.id.a0("LinkAvailable", null, 2131748924, str));
            org.telegram.ui.Cells.b2 b2Var = bdVar.V;
            int i7 = org.telegram.ui.ActionBar.l6.w6;
            b2Var.setTag(Integer.valueOf(i7));
            org.telegram.ui.ActionBar.s6.U(bdVar.V, i7, null);
            bdVar.a0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            bdVar.V.setText(org.telegram.messenger.id.M0(2131743654, null));
            org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                bdVar.V.setText(org.telegram.messenger.id.M0(2131743653, null));
            } else {
                bdVar.V.setText(org.telegram.messenger.id.M0(2131743657, null));
            }
            org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.p7, null);
            bdVar.V.setText(org.telegram.messenger.id.M0(2131748912, null));
        } else {
            org.telegram.ui.ActionBar.s6.U(bdVar.V, org.telegram.ui.ActionBar.l6.p7, null);
            bdVar.k0 = false;
            bdVar.l0();
        }
        bdVar.a0 = false;
    }

    private final void b() {
        cn cnVar = (cn) this.c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.f;
        ImageView imageView2 = (ImageView) this.b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        org.telegram.ui.m6 m6Var = new org.telegram.ui.m6((Object) jArr, zArr2, (Object) imageView, (Object) imageView2, 6);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = cnVar.t5.e1();
        tL_messages_rateTranscribedAudio.peer = cnVar.getMessagesController().m1(cnVar.t5.k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = cnVar.t5.k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        cnVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.z9(cnVar, m6Var, jArr, 4));
        org.telegram.messenger.g0.i3(m6Var, 150L);
    }

    private final void c() {
        nm nmVar = (nm) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.e;
        ij ijVar = (ij) this.f;
        org.telegram.ui.q5 q5Var = (org.telegram.ui.q5) this.b;
        cn cnVar = nmVar.a;
        if (message.suggested_post.schedule_date != 0) {
            cnVar.getMessagesController().v(ijVar.k.id, 0, org.telegram.messenger.m5.o(ijVar.k.peer_id), null, false);
        } else {
            u1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(cnVar.getParentActivity(), 0L, new ni.c(15, nmVar, ijVar), cnVar.getResourceProvider(), 1).b;
            v2Var.show();
            v2Var.setOnDismissListener(q5Var);
        }
    }

    private final void d() {
        io ioVar = (io) this.c;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        ioVar.h0 = 0;
        String str2 = ioVar.i0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            ioVar.h.setText(org.telegram.messenger.id.a0("LinkAvailable", null, 2131748924, str));
            ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.w6);
            ioVar.k0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            ioVar.h.setText(org.telegram.messenger.id.M0(2131743654, null));
            org.telegram.ui.ActionBar.s6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.l6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                ioVar.h.setText(org.telegram.messenger.id.M0(2131743653, null));
            } else {
                ioVar.h.setText(org.telegram.messenger.id.M0(2131743657, null));
            }
            org.telegram.ui.ActionBar.s6.U(ioVar.h.getTextView(), org.telegram.ui.ActionBar.l6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            ioVar.h.setText(org.telegram.messenger.id.M0(2131748912, null));
            ioVar.h.setTextColorByKey(org.telegram.ui.ActionBar.l6.p7);
        } else {
            ioVar.c0 = false;
            ioVar.f0();
        }
        ioVar.k0 = false;
    }

    private final void f() {
        mp.d0((mp) this.c, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05a5  */
    /* JADX WARN: Type inference failed for: r12v7, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Integer] */
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
        di.j4 j4Var;
        di.p9 p9Var;
        int i11;
        int i12 = 2;
        jl0 jl0Var = null;
        r12 = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        jl0 jl0Var2 = null;
        r12 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        jl0 jl0Var3 = null;
        SQLiteCursor sQLiteCursor = null;
        int i13 = 1;
        int i14 = 0;
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
                    org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(T).I(R.raw.forward, org.telegram.messenger.id.M0(2131749700, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749701, a1Var.S1, org.telegram.messenger.m5.t(a1Var.T1))));
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
                    jl0Var = new jl0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    jl0Var = new jl0((TLRPC.PaymentReceipt) tLObject);
                }
                if (jl0Var == null) {
                    mcVar.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                jl0Var.Z0 = new a1.c(mcVar, 18);
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q)) {
                    Q.presentFragment(jl0Var);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                Q.showAsSheet(jl0Var, d2Var);
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
                        int i15 = 0;
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
                                    i15 = (int) queryFinalized.longValue(1);
                                    j10 = queryFinalized.longValue(2);
                                }
                                r62 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                i7 = i15;
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
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj = arrayList2.get(i16);
                            i16++;
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
                        i10 = i15;
                    } catch (Exception e11) {
                        e = e11;
                        j3 = 0;
                        z9 = true;
                        i7 = 0;
                    }
                    org.telegram.messenger.g0.h3(new d9(cVar, arrayList2, i10, j10, arrayList4, arrayList3));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
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
                    jl0Var3 = new jl0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    jl0Var3 = new jl0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (jl0Var3 == null) {
                    v10Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                jl0Var3.Z0 = new a1.c(v10Var2, 16);
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q2)) {
                    Q2.presentFragment(jl0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2();
                d2Var2.a = true;
                Q2.showAsSheet(jl0Var3, d2Var2);
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
                org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                org.telegram.messenger.c a11 = org.telegram.messenger.c.a(p10.s0);
                q4.q qVar = new q4.q(20, false);
                qVar.g((f5.l) list.get(0));
                i17.l(activity, a11, tL_inputStorePaymentStarsTopup, Collections.singletonList(qVar.a()));
                return;
            case 6:
                ea eaVar4 = (ea) this.c;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                c20 c20Var = (c20) this.b;
                int i18 = eaVar4.a;
                u1Var2.dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    qp.s1(i18).Y3(tL_payments_savedStarGifts.users, false);
                    qp.s1(i18).S3(tL_payments_savedStarGifts.chats, false);
                    for (int i19 = 0; i19 < tL_payments_savedStarGifts.gifts.size(); i19++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i19);
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
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    t1Var.a(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm3.invoice.recurring = true;
                    qp.s1(eaVar5.a).Y3(paymentForm3.users, false);
                    jl0Var2 = new jl0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    jl0Var2 = new jl0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (jl0Var2 == null) {
                    t1Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                jl0Var2.Z0 = new a1.c(t1Var, 17);
                org.telegram.ui.ActionBar.f2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q3)) {
                    Q3.presentFragment(jl0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2();
                d2Var3.a = true;
                Q3.showAsSheet(jl0Var2, d2Var3);
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
                di.j4 j4Var2 = (di.j4) this.c;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                fi.q8 q8Var = (fi.q8) this.f;
                org.telegram.ui.ActionBar.g6 g6Var = j4Var2.k0;
                di.j3 j3Var = j4Var2.L0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error5 == null || "STORY_NOT_MODIFIED".equals(tL_error5.text)) {
                    storyItem.parsedPrivacy = q8Var;
                    ArrayList arrayList7 = q8Var.b;
                    int i20 = q8Var.a;
                    ArrayList arrayList8 = q8Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    int i21 = 0;
                    while (i21 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i21);
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
                                int i22 = 0;
                                while (i22 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i22 = com.google.android.recaptcha.internal.a.g(i22, 1, tL_inputPrivacyValueDisallowUsers.users.get(i22).user_id, tL_privacyValueDisallowUsers.users);
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    int i23 = 0;
                                    for (TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule; i23 < tL_inputPrivacyValueAllowUsers.users.size(); tL_inputPrivacyValueAllowUsers = tL_inputPrivacyValueAllowUsers) {
                                        i23 = com.google.android.recaptcha.internal.a.g(i23, 1, tL_inputPrivacyValueAllowUsers.users.get(i23).user_id, tL_privacyValueAllowUsers.users);
                                    }
                                    i13 = 1;
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i21++;
                                    arrayList7 = arrayList;
                                }
                            }
                            i13 = 1;
                            i21++;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i21++;
                        arrayList7 = arrayList;
                    }
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i20 == i13;
                    storyItem.contacts = i20 == 2;
                    storyItem.selected_contacts = i20 == 3;
                    qp.s1(j4Var2.l2).P1().s0(storyItem.dialogId, storyItem, true);
                    j4Var2.L3 = true;
                    if (i20 == 4) {
                        new org.telegram.ui.Components.hc(j3Var, g6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.id.N0("StorySharedToEveryone")).j();
                    } else if (i20 == 1) {
                        new org.telegram.ui.Components.hc(j3Var, g6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.id.N0("StorySharedToCloseFriends")).j();
                    } else if (i20 == 2) {
                        if (arrayList8.isEmpty()) {
                            new org.telegram.ui.Components.hc(j3Var, g6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.id.N0("StorySharedToAllContacts")).j();
                        } else {
                            new org.telegram.ui.Components.hc(j3Var, g6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.id.G(arrayList8.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i20 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = q8Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new org.telegram.ui.Components.hc(j3Var, g6Var).Q(R.raw.contact_check, 36, org.telegram.messenger.id.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                        j4Var2.d1(z10);
                        return;
                    }
                } else {
                    org.telegram.messenger.k5.o(null, 2131743879, new org.telegram.ui.Components.hc(j3Var, g6Var), R.raw.error, 36);
                }
                z10 = false;
                j4Var2.d1(z10);
                return;
            case 10:
                di.a4 a4Var = (di.a4) this.c;
                Activity activity2 = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                di.q9 q9Var = (di.q9) this.f;
                di.g4 g4Var = (di.g4) this.b;
                fi.va D = fi.va.D(activity2, a4Var.x.l2);
                di.i4 i4Var = a4Var.x.v2;
                long j12 = (i4Var == null || (p9Var = (di.p9) i4Var.c) == null) ? 0L : p9Var.currentPosition;
                fi.e7 n10 = fi.e7.n(a4Var.x.x1.h(), a4Var.x.x1.a);
                di.j4 j4Var3 = a4Var.x;
                n10.e = j4Var3.k1;
                TL_stories.StoryItem storyItem3 = j4Var3.x1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i24 = 0;
                    while (true) {
                        if (i24 < document.attributes.size()) {
                            if (document.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i24);
                            } else {
                                i24++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j11 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j11;
                        fi.e7 g10 = n10.g();
                        g10.b0 = true;
                        j4Var = a4Var.x;
                        TL_stories.StoryItem storyItem4 = j4Var.x1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new v3(a4Var, storyItem4, storyItem2, i12);
                        if (j4Var.G0()) {
                            di.j4 j4Var4 = a4Var.x;
                            g10.J0 = j4Var4.k1;
                            g10.L0 = qp.Z4(j4Var4.x1.a.media);
                            di.r6 r6Var = q9Var.N0;
                            if (r6Var instanceof di.k6) {
                                g10.K0 = ((di.k6) r6Var).E;
                            }
                        }
                        D.R(fi.qa.d(q9Var), g10, j12);
                        D.Q = new di.s3(a4Var, i12);
                        D.R = new di.w3(a4Var, g4Var, i14);
                        return;
                    }
                }
                j11 = 0;
                n10.e0 = j11;
                fi.e7 g102 = n10.g();
                g102.b0 = true;
                j4Var = a4Var.x;
                TL_stories.StoryItem storyItem42 = j4Var.x1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new v3(a4Var, storyItem42, storyItem2, i12);
                if (j4Var.G0()) {
                }
                D.R(fi.qa.d(q9Var), g102, j12);
                D.Q = new di.s3(a4Var, i12);
                D.R = new di.w3(a4Var, g4Var, i14);
                return;
            case 11:
                di.v4 v4Var = (di.v4) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                di.l5 l5Var = v4Var.b;
                org.telegram.messenger.g5.r(l5Var.w).i(arrayList10, false);
                new org.telegram.ui.Components.hc(l5Var, l5Var.s).Q(R.raw.ic_ban, 36, org.telegram.messenger.id.a0(null, null, 2131751466, str2)).j();
                m6Var.a(true, l5Var.d(storyView) ? 1.0f : 0.5f);
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
                        int i25 = fi.s8.U1;
                        new org.telegram.ui.Components.hc(l2Var, s8Var.I0).f0(tL_error6, true);
                        return;
                    }
                    return;
                }
                tq[] tqVarArr = new tq[1];
                Context context = n8Var.getContext();
                int i26 = fi.s8.U1;
                tq tqVar = new tq(context, s8Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject5, s8Var.C1 ? null : new ai.f1(13, n8Var, tqVarArr), new di.b());
                tqVarArr[0] = tqVar;
                tqVar.show();
                return;
            case 13:
                fi.fb.a((fi.fb) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.g6) this.e, (org.telegram.ui.Components.y9) this.f, (View) this.b);
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
                        while (i14 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i14);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i14++;
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
                kg.t1 t1Var2 = (kg.t1) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                kg.s1 s1Var = (kg.s1) this.f;
                ij ijVar = (ij) this.b;
                int i27 = t1Var2.a;
                qp.s1(i27).Y3(arrayList12, true);
                qp.s1(i27).S3(arrayList13, true);
                s1Var.e = ijVar;
                if (ijVar != null) {
                    ijVar.l(s1Var.a, s1Var.b);
                }
                t1Var2.l();
                qs.f(i27).k(qs.F1, new Object[0]);
                return;
            case 16:
                kg.t1 t1Var3 = (kg.t1) this.c;
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
                int i28 = 0;
                while (i28 < size4) {
                    TLRPC.Message message = arrayList15.get(i28);
                    i28++;
                    arrayList14.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList14;
                while (i14 < arrayList14.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    i14++;
                }
                ConnectionsManager.getInstance(t1Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 17:
                kg.t1 t1Var4 = (kg.t1) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                ArrayList arrayList17 = (ArrayList) this.e;
                ArrayList arrayList18 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                t1Var4.e = false;
                int i29 = t1Var4.a;
                qp.s1(i29).Y3(arrayList16, true);
                qp.s1(i29).S3(arrayList17, true);
                ArrayList arrayList19 = t1Var4.b;
                arrayList19.clear();
                arrayList19.addAll(arrayList18);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    t1Var4.i(null, false);
                }
                qs.f(i29).k(qs.F1, new Object[0]);
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
                w61 w61Var = t7Var.n;
                for (int i30 = 0; i30 < w61Var.getViewPages().length; i30++) {
                    qj0 c10 = t7Var.c(w61Var.getViewPages()[i30]);
                    if (c10 != null && ((org.telegram.ui.f7) c10.getAdapter()).d == 3) {
                        org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) c10.getAdapter();
                        int i31 = 0;
                        while (true) {
                            if (i31 >= f7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.m7) f7Var.e.get(i31)).d == bVar2) {
                                f7Var.g(i31);
                            } else {
                                i31++;
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
                        b2Var2.setText(org.telegram.messenger.id.a0("UsernameAvailable", null, 2131743667, str6));
                        org.telegram.ui.Cells.b2 b2Var3 = laVar.G;
                        int i32 = org.telegram.ui.ActionBar.l6.w6;
                        b2Var3.setTag(Integer.valueOf(i32));
                        org.telegram.ui.ActionBar.s6.U(laVar.G, i32, null);
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
                        laVar.G.setText(org.telegram.messenger.id.M0(2131743654, null));
                        org.telegram.ui.Cells.b2 b2Var4 = laVar.G;
                        int i33 = org.telegram.ui.ActionBar.l6.p7;
                        b2Var4.setTag(Integer.valueOf(i33));
                        org.telegram.ui.ActionBar.s6.U(laVar.G, i33, null);
                    } else if (tL_error8 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                        laVar.G.setText(org.telegram.messenger.id.M0(2131743658, null));
                        org.telegram.ui.Cells.b2 b2Var5 = laVar.G;
                        int i34 = org.telegram.ui.ActionBar.l6.p7;
                        b2Var5.setTag(Integer.valueOf(i34));
                        org.telegram.ui.ActionBar.s6.U(laVar.G, i34, null);
                    } else {
                        if (checkusername.username.length() == 4) {
                            laVar.G.setText(org.telegram.messenger.id.M0(2131743653, null));
                        } else {
                            laVar.G.setText(org.telegram.messenger.id.M0(2131743657, null));
                        }
                        org.telegram.ui.Cells.b2 b2Var6 = laVar.G;
                        int i35 = org.telegram.ui.ActionBar.l6.F6;
                        b2Var6.setTag(Integer.valueOf(i35));
                        org.telegram.ui.ActionBar.s6.U(laVar.G, i35, null);
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
                    org.telegram.messenger.k5.o(null, 2131748913, org.telegram.ui.Components.hc.a0(mbVar), R.raw.linkbroken, 36);
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
                        rcVar.getMessagesController().G0().b(rcVar.a, rcVar.c, new org.telegram.ui.wb(rcVar, i13));
                        return;
                    } else {
                        rcVar.P.setLoading(false);
                        org.telegram.ui.Components.hc.a0(rcVar).Q(R.raw.error, 36, org.telegram.messenger.id.a0(null, null, 2131743878, tL_error9.text)).j();
                        return;
                    }
                }
                int i36 = i11 + 1;
                iArr[0] = i36;
                if (i36 == iArr2[0]) {
                    rcVar.finishFragment();
                    org.telegram.ui.ActionBar.f2 f2Var = rcVar.l0;
                    if (f2Var != null) {
                        if (f2Var instanceof rn) {
                            ((rn) f2Var).t0();
                        }
                        org.telegram.messenger.k5.o(null, rcVar.d ? 2131749498 : 2131752459, org.telegram.ui.Components.hc.a0(rcVar.l0), R.raw.contact_check, 36);
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
                b();
                return;
            case 25:
                cn.w0((cn) this.c, (View) this.d, (boolean[]) this.e, (org.telegram.ui.ActionBar.g1) this.f, (View) this.b);
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
                pq pqVar = (pq) this.c;
                ArrayList arrayList20 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                ArrayList arrayList21 = (ArrayList) this.f;
                ArrayList arrayList22 = (ArrayList) this.b;
                jg.z1 z1Var2 = pqVar.h;
                qq qqVar = pqVar.D;
                if (qqVar.n1) {
                    pqVar.s = false;
                    pqVar.d = arrayList20;
                    pqVar.e = hVar;
                    pqVar.f = arrayList21;
                    z1Var2.f(arrayList20, null);
                    if (!org.telegram.messenger.t3.T(qqVar.n)) {
                        ArrayList arrayList23 = z1Var2.g;
                        arrayList23.clear();
                        arrayList23.addAll(arrayList22);
                    }
                    int i37 = pqVar.r;
                    pqVar.f();
                    if (pqVar.r > i37) {
                        qqVar.D0(i37);
                    }
                    if (z1Var2.e() || pqVar.r != 0) {
                        return;
                    }
                    qqVar.b.e(false, true);
                    return;
                }
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
