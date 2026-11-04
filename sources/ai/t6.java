package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ci.d8;
import ci.e9;
import ei.q9;
import ei.r9;
import gi.f7;
import gi.fb;
import gi.o8;
import gi.qa;
import gi.r8;
import gi.t8;
import gi.va;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.x9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.dl0;
import org.telegram.ui.g7;
import org.telegram.ui.hm;
import org.telegram.ui.ip;
import org.telegram.ui.ja;
import org.telegram.ui.ka;
import org.telegram.ui.kb;
import org.telegram.ui.ln;
import org.telegram.ui.n7;
import org.telegram.ui.pc;
import org.telegram.ui.u7;
import org.telegram.ui.ub;
import org.telegram.ui.wm;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t6(e9 e9Var, TLRPC.TL_error tL_error, n10 n10Var, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i3) {
        this.a = i3;
        this.c = e9Var;
        this.b = tL_error;
        this.e = n10Var;
        this.d = tLObject;
        this.f = tL_inputInvoiceStars;
    }

    private final void a() {
        ad adVar = (ad) this.c;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        adVar.Y = 0;
        String str2 = adVar.Z;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            adVar.W.setText(bd.a0("LinkAvailable", null, 2131748932, str));
            org.telegram.ui.Cells.b2 b2Var = adVar.W;
            int i3 = org.telegram.ui.ActionBar.k6.w6;
            b2Var.setTag(Integer.valueOf(i3));
            org.telegram.ui.ActionBar.r6.V(adVar.W, i3, null);
            adVar.b0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            adVar.W.setText(bd.M0(2131743664, null));
            org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                adVar.W.setText(bd.M0(2131743663, null));
            } else {
                adVar.W.setText(bd.M0(2131743667, null));
            }
            org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.p7, null);
            adVar.W.setText(bd.M0(2131748920, null));
        } else {
            org.telegram.ui.ActionBar.r6.V(adVar.W, org.telegram.ui.ActionBar.k6.p7, null);
            adVar.l0 = false;
            adVar.l0();
        }
        adVar.b0 = false;
    }

    private final void b() {
        wm wmVar = (wm) this.c;
        boolean[] zArr = (boolean[]) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        ImageView imageView = (ImageView) this.b;
        ImageView imageView2 = (ImageView) this.f;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        long[] jArr = {-1};
        o4.b1 b1Var = new o4.b1(jArr, zArr2, imageView, imageView2, 12);
        TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
        tL_messages_rateTranscribedAudio.msg_id = wmVar.u5.f1();
        tL_messages_rateTranscribedAudio.peer = wmVar.getMessagesController().m1(wmVar.u5.k.peer_id);
        tL_messages_rateTranscribedAudio.transcription_id = wmVar.u5.k.voiceTranscriptionId;
        tL_messages_rateTranscribedAudio.good = zArr2[0];
        wmVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new y9(wmVar, b1Var, jArr, 4));
        org.telegram.messenger.g0.i3(b1Var, 150L);
    }

    private final void c() {
        hm hmVar = (hm) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.e;
        zi ziVar = (zi) this.b;
        org.telegram.ui.s5 s5Var = (org.telegram.ui.s5) this.f;
        wm wmVar = hmVar.a;
        if (message.suggested_post.schedule_date != 0) {
            wmVar.getMessagesController().v(ziVar.k.id, 0, org.telegram.messenger.m5.o(ziVar.k.peer_id), null, false);
        } else {
            s1VarArr[0].setOnDismissListener(null);
            org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(wmVar.getParentActivity(), 0L, new mi.d4(25, hmVar, ziVar), wmVar.getResourceProvider(), 1).b;
            t2Var.show();
            t2Var.setOnDismissListener(s5Var);
        }
    }

    private final void e() {
        bo boVar = (bo) this.c;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.f;
        boVar.i0 = 0;
        String str2 = boVar.j0;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            boVar.h.setText(bd.a0("LinkAvailable", null, 2131748932, str));
            boVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.w6);
            boVar.l0 = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            boVar.h.setText(bd.M0(2131743664, null));
            org.telegram.ui.ActionBar.r6.V(boVar.h.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                boVar.h.setText(bd.M0(2131743663, null));
            } else {
                boVar.h.setText(bd.M0(2131743667, null));
            }
            org.telegram.ui.ActionBar.r6.V(boVar.h.getTextView(), org.telegram.ui.ActionBar.k6.F6, null);
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            boVar.h.setText(bd.M0(2131748920, null));
            boVar.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
        } else {
            boVar.d0 = false;
            boVar.f0();
        }
        boVar.l0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0a7d  */
    /* JADX WARN: Type inference failed for: r13v9, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.NativeByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Integer] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        dl0 dl0Var;
        long j10;
        boolean z10;
        SQLiteCursor sQLiteCursor;
        int i3;
        long j11;
        int i10;
        dl0 dl0Var2;
        TL_stars.SavedStarGift savedStarGift;
        dl0 dl0Var3;
        boolean z11;
        ArrayList arrayList;
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        long j12;
        ei.j4 j4Var;
        q9 q9Var;
        int i13;
        int i14 = 17;
        int i15 = 4;
        SQLiteCursor sQLiteCursor2 = null;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
                d7 d7Var = (d7) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i18 = d7Var.R1;
                org.telegram.ui.ActionBar.d2 d2Var = d7Var.p1;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    if (tL_error != null) {
                        org.telegram.ui.Components.t4.e0(i18, tL_error, d2Var, tL_payments_canPurchaseStore, new Object[0]);
                        return;
                    }
                    return;
                } else {
                    org.telegram.messenger.r1 i19 = org.telegram.messenger.r1.i();
                    Activity parentActivity = d2Var.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i18);
                    tf.b bVar = new tf.b();
                    bVar.B(d7Var.X1.h);
                    i19.l(parentActivity, a10, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.k()));
                    return;
                }
            case 1:
                ci.t0 t0Var = (ci.t0) this.c;
                sf.b bVar2 = (sf.b) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
                TLRPC.Updates updates = (TLRPC.Updates) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                ci.s1 s1Var2 = t0Var.k2;
                if (s1Var2 != null) {
                    s1Var2.run();
                }
                bVar2.c(false);
                s1Var.dismiss();
                t0Var.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (updates == null) {
                        fc.a0(T).f0(tL_error2, false);
                        return;
                    }
                    ac I = fc.a0(T).I(R.raw.forward, bd.M0(2131749708, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749709, t0Var.T1, org.telegram.messenger.m5.t(t0Var.U1))));
                    I.t = true;
                    I.j();
                    return;
                }
                return;
            case 2:
                e9 e9Var = (e9) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                d6 d6Var = (d6) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error3 != null) {
                    d6Var.a(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                    paymentForm.invoice.recurring = true;
                    hp.s1(e9Var.a).Y3(paymentForm.users, false);
                    dl0Var = new dl0(paymentForm, tL_inputInvoiceStars, null);
                } else {
                    dl0Var = tLObject2 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject2) : null;
                }
                if (dl0Var == null) {
                    d6Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                dl0Var.a1 = new a1.c(d6Var, 19);
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q)) {
                    Q.presentFragment(dl0Var);
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                Q.showAsSheet(dl0Var, b2Var);
                return;
            case 3:
                e9 e9Var2 = (e9) this.c;
                boolean[] zArr = (boolean[]) this.d;
                String str = (String) this.e;
                TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.b;
                n10 n10Var = (n10) this.f;
                zArr[0] = true;
                e9Var2.Y(str, chatInvite, new c(n10Var, i14));
                return;
            case 4:
                qr qrVar = (qr) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.b;
                a1.c cVar = (a1.c) this.f;
                try {
                    try {
                        ?? r62 = 0;
                        ?? queryFinalized = qrVar.b.queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i20 = 0;
                        j11 = 0;
                        while (queryFinalized.next()) {
                            try {
                                ?? byteBufferValue = queryFinalized.byteBufferValue(r62);
                                if (byteBufferValue != 0) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r62), r62);
                                    if (TLdeserialize != null) {
                                        arrayList2.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i20 = (int) queryFinalized.longValue(1);
                                    j11 = queryFinalized.longValue(2);
                                }
                                r62 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                i3 = i20;
                                j10 = j11;
                                z10 = true;
                                sQLiteCursor = queryFinalized;
                                a8.g(e, z10);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j11 = j10;
                                i10 = i3;
                                org.telegram.messenger.g0.h3(new d8(cVar, arrayList2, i10, j11, arrayList4, arrayList3));
                                return;
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj = arrayList2.get(i21);
                            i21++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj).released_by;
                            if (peer != null) {
                                long o10 = org.telegram.messenger.m5.o(peer);
                                if (o10 > 0) {
                                    arrayList5.add(Long.valueOf(o10));
                                } else if (o10 < 0) {
                                    arrayList6.add(Long.valueOf(-o10));
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            qrVar.Q(TextUtils.join(",", arrayList6), arrayList3);
                        }
                        if (!arrayList5.isEmpty()) {
                            qrVar.n0(arrayList5, arrayList4, false);
                        }
                        queryFinalized.dispose();
                        i10 = i20;
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = 0;
                    z10 = true;
                    sQLiteCursor = null;
                    i3 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
                org.telegram.messenger.g0.h3(new d8(cVar, arrayList2, i10, j11, arrayList4, arrayList3));
                return;
            case 5:
                e9 e9Var3 = (e9) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                n10 n10Var2 = (n10) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error4 != null) {
                    n10Var2.a(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject3 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject3;
                    paymentForm2.invoice.recurring = true;
                    hp.s1(e9Var3.a).Y3(paymentForm2.users, false);
                    dl0Var2 = new dl0(paymentForm2, tL_inputInvoiceStars2, null);
                } else {
                    dl0Var2 = tLObject3 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject3) : null;
                }
                if (dl0Var2 == null) {
                    n10Var2.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                dl0Var2.a1 = new a1.c(n10Var2, i14);
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (Q2 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q2)) {
                    Q2.presentFragment(dl0Var2);
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2();
                b2Var2.a = true;
                Q2.showAsSheet(dl0Var2, b2Var2);
                return;
            case 6:
                List list = (List) this.c;
                n10 n10Var3 = (n10) this.d;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.e;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) this.b;
                Activity activity = (Activity) this.f;
                if (list.isEmpty()) {
                    a8.b("StarsController.buy queryProductDetails done: no products");
                    org.telegram.messenger.g0.h3(new ci.z6(n10Var3, 1));
                    return;
                }
                e5.l lVar = (e5.l) list.get(0);
                e5.h a11 = lVar.a();
                if (a11 == null) {
                    a8.b("StarsController.buy queryProductDetails done: no details");
                    org.telegram.messenger.g0.h3(new ci.z6(n10Var3, 2));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a11.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                org.telegram.messenger.r1.i().d(lVar.c, new q6(n10Var3, 1));
                org.telegram.messenger.r1.i().h = new ci.z6(n10Var3, 3);
                a8.b("StarsController.buy launchBillingFlow");
                org.telegram.messenger.r1 i22 = org.telegram.messenger.r1.i();
                org.telegram.messenger.c a12 = org.telegram.messenger.c.a(h10.t0);
                tf.b bVar3 = new tf.b();
                bVar3.B((e5.l) list.get(0));
                i22.l(activity, a12, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar3.k()));
                return;
            case 7:
                e9 e9Var4 = (e9) this.c;
                org.telegram.ui.ActionBar.s1 s1Var3 = (org.telegram.ui.ActionBar.s1) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.b;
                u10 u10Var = (u10) this.f;
                int i23 = e9Var4.a;
                s1Var3.dismiss();
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    hp.s1(i23).Y3(tL_payments_savedStarGifts.users, false);
                    hp.s1(i23).S3(tL_payments_savedStarGifts.chats, false);
                    for (int i24 = 0; i24 < tL_payments_savedStarGifts.gifts.size(); i24++) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i24);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                            u10Var.a(savedStarGift);
                            return;
                        }
                    }
                }
                savedStarGift = null;
                u10Var.a(savedStarGift);
                return;
            case 8:
                e9 e9Var5 = (e9) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                org.telegram.ui.Wallet.s1 s1Var4 = (org.telegram.ui.Wallet.s1) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error5 != null) {
                    s1Var4.a(Boolean.FALSE, tL_error5.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject5;
                    paymentForm3.invoice.recurring = true;
                    hp.s1(e9Var5.a).Y3(paymentForm3.users, false);
                    dl0Var3 = new dl0(paymentForm3, tL_inputInvoiceStars3, null);
                } else {
                    dl0Var3 = tLObject5 instanceof TLRPC.PaymentReceipt ? new dl0((TLRPC.PaymentReceipt) tLObject5) : null;
                }
                if (dl0Var3 == null) {
                    s1Var4.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                    return;
                }
                dl0Var3.a1 = new a1.c(s1Var4, 18);
                org.telegram.ui.ActionBar.d2 Q3 = LaunchActivity.Q();
                if (Q3 == null) {
                    return;
                }
                if (!org.telegram.messenger.g0.u1(Q3)) {
                    Q3.presentFragment(dl0Var3);
                    return;
                }
                org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2();
                b2Var3.a = true;
                Q3.showAsSheet(dl0Var3, b2Var3);
                return;
            case 9:
                ei.q qVar = (ei.q) this.c;
                ei.r rVar = (ei.r) this.d;
                Long l10 = (Long) this.e;
                va vaVar = (va) this.b;
                Runnable runnable = (Runnable) this.f;
                if (qVar == null) {
                    qVar = rVar.e(l10.longValue());
                }
                vaVar.X(qa.c(qVar));
                runnable.run();
                return;
            case 10:
                ei.j4 j4Var2 = (ei.j4) this.c;
                Runnable runnable2 = (Runnable) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                r8 r8Var = (r8) this.f;
                org.telegram.ui.ActionBar.e6 e6Var = j4Var2.l0;
                ei.m3 m3Var = j4Var2.M0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error6 == null || "STORY_NOT_MODIFIED".equals(tL_error6.text)) {
                    storyItem.parsedPrivacy = r8Var;
                    ArrayList arrayList7 = r8Var.b;
                    int i25 = r8Var.a;
                    ArrayList arrayList8 = r8Var.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList9 = new ArrayList<>();
                    while (i17 < arrayList7.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList7.get(i17);
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
                                int i26 = 0;
                                while (i26 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i26 = a1.g.h(i26, 1, tL_inputPrivacyValueDisallowUsers.users.get(i26).user_id, tL_privacyValueDisallowUsers.users);
                                    i17 = i17;
                                    arrayList7 = arrayList7;
                                }
                                arrayList = arrayList7;
                                i11 = i17;
                                arrayList9.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList7;
                                i11 = i17;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i27 = 0; i27 < tL_inputPrivacyValueAllowUsers.users.size(); i27 = a1.g.h(i27, 1, tL_inputPrivacyValueAllowUsers.users.get(i27).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    i12 = 1;
                                    arrayList9.add(tL_privacyValueAllowUsers);
                                    i17 = i11 + 1;
                                    i16 = i12;
                                    arrayList7 = arrayList;
                                }
                            }
                            i12 = 1;
                            i17 = i11 + 1;
                            i16 = i12;
                            arrayList7 = arrayList;
                        }
                        arrayList = arrayList7;
                        i12 = i16;
                        i11 = i17;
                        i17 = i11 + 1;
                        i16 = i12;
                        arrayList7 = arrayList;
                    }
                    int i28 = i16;
                    storyItem.privacy = arrayList9;
                    storyItem.close_friends = i25 == i28;
                    storyItem.contacts = i25 == 2;
                    storyItem.selected_contacts = i25 == 3;
                    hp.s1(j4Var2.m2).P1().s0(storyItem.dialogId, storyItem, true);
                    j4Var2.M3 = true;
                    if (i25 == 4) {
                        new fc(m3Var, e6Var).Q(R.raw.contact_check, 36, bd.N0("StorySharedToEveryone")).j();
                    } else if (i25 == 1) {
                        new fc(m3Var, e6Var).Q(R.raw.contact_check, 36, bd.N0("StorySharedToCloseFriends")).j();
                    } else if (i25 == 2) {
                        if (arrayList8.isEmpty()) {
                            new fc(m3Var, e6Var).Q(R.raw.contact_check, 36, bd.N0("StorySharedToAllContacts")).j();
                        } else {
                            new fc(m3Var, e6Var).Q(R.raw.contact_check, 36, bd.G(arrayList8.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i25 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList8);
                        Iterator it = r8Var.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z11 = false;
                        new fc(m3Var, e6Var).Q(R.raw.contact_check, 36, bd.G(hashSet.size(), "StorySharedToContacts", new Object[0])).j();
                    }
                    z11 = false;
                } else {
                    org.telegram.messenger.k5.o(null, 2131743889, new fc(m3Var, e6Var), R.raw.error, 36);
                    z11 = false;
                }
                j4Var2.d1(z11);
                return;
            case 11:
                ei.b4 b4Var = (ei.b4) this.c;
                Activity activity2 = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                r9 r9Var = (r9) this.b;
                ei.g4 g4Var = (ei.g4) this.f;
                va D = va.D(activity2, b4Var.x.m2);
                ei.i4 i4Var = b4Var.x.w2;
                long j13 = (i4Var == null || (q9Var = (q9) i4Var.c) == null) ? 0L : q9Var.currentPosition;
                f7 n4 = f7.n(b4Var.x.y1.h(), b4Var.x.y1.a);
                ei.j4 j4Var3 = b4Var.x;
                n4.e = j4Var3.l1;
                TL_stories.StoryItem storyItem3 = j4Var3.y1.a;
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
                        j12 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n4.e0 = j12;
                        f7 g7 = n4.g();
                        g7.b0 = true;
                        j4Var = b4Var.x;
                        TL_stories.StoryItem storyItem4 = j4Var.y1.a;
                        g7.c0 = storyItem4.media.document;
                        g7.d0 = new m(b4Var, storyItem4, storyItem2, i15);
                        if (j4Var.G0()) {
                            ei.j4 j4Var4 = b4Var.x;
                            g7.J0 = j4Var4.l1;
                            g7.L0 = hp.Z4(j4Var4.y1.a.media);
                            ei.r6 r6Var = r9Var.P0;
                            if (r6Var instanceof ei.k6) {
                                g7.K0 = ((ei.k6) r6Var).E;
                            }
                        }
                        D.R(qa.d(r9Var), g7, j13);
                        D.R = new ei.v3(b4Var, 2);
                        D.S = new ei.x3(b4Var, g4Var, i17);
                        return;
                    }
                }
                j12 = 0;
                n4.e0 = j12;
                f7 g72 = n4.g();
                g72.b0 = true;
                j4Var = b4Var.x;
                TL_stories.StoryItem storyItem42 = j4Var.y1.a;
                g72.c0 = storyItem42.media.document;
                g72.d0 = new m(b4Var, storyItem42, storyItem2, i15);
                if (j4Var.G0()) {
                }
                D.R(qa.d(r9Var), g72, j13);
                D.R = new ei.v3(b4Var, 2);
                D.S = new ei.x3(b4Var, g4Var, i17);
                return;
            case 12:
                ei.u4 u4Var = (ei.u4) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) this.b;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.f;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ei.k5 k5Var = u4Var.b;
                org.telegram.messenger.g5.r(k5Var.w).i(arrayList10, false);
                new fc(k5Var, k5Var.s).Q(R.raw.ic_ban, 36, bd.a0(null, null, 2131751467, str2)).j();
                l6Var.a(true, k5Var.d(storyView) ? 1.0f : 0.5f);
                return;
            case 13:
                o8 o8Var = (o8) this.c;
                org.telegram.ui.ActionBar.s1 s1Var5 = (org.telegram.ui.ActionBar.s1) this.e;
                TLObject tLObject6 = (TLObject) this.d;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.b;
                t8 t8Var = o8Var.a0;
                s1Var5.dismiss();
                if (!(tLObject6 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    if (tL_error7 != null) {
                        org.telegram.ui.ActionBar.j2 j2Var = t8Var.c;
                        int i30 = t8.V1;
                        new fc(j2Var, t8Var.J0).f0(tL_error7, true);
                        return;
                    }
                    return;
                }
                tq[] tqVarArr = new tq[1];
                Context context = o8Var.getContext();
                int i31 = t8.V1;
                tq tqVar = new tq(context, t8Var.a, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject6, t8Var.D1 ? null : new o1(i14, o8Var, tqVarArr), new ei.b());
                tqVarArr[0] = tqVar;
                tqVar.show();
                return;
            case 14:
                fb.a((fb) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.e6) this.e, (x9) this.b, (View) this.f);
                return;
            case 15:
                kg.w1 w1Var = (kg.w1) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.e;
                TLObject tLObject7 = (TLObject) this.d;
                ArrayList arrayList11 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f;
                w1Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                kg.y1 y1Var = w1Var.a;
                if (str3.equals(y1Var.S)) {
                    y1Var.P = 0;
                    if (tLObject7 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject7;
                        int size2 = arrayList11.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        while (i17 < size3) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList11.add(document2);
                            }
                            i17++;
                        }
                        if (size2 != arrayList11.size()) {
                            y1Var.J.put(arrayList11, y1Var.S);
                            if (size2 == 0) {
                                y1Var.K.add(arrayList11);
                            }
                            y1Var.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                lg.u1 u1Var = (lg.u1) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                lg.t1 t1Var = (lg.t1) this.b;
                zi ziVar = (zi) this.f;
                int i32 = u1Var.a;
                hp.s1(i32).Y3(arrayList12, true);
                hp.s1(i32).S3(arrayList13, true);
                t1Var.e = ziVar;
                if (ziVar != null) {
                    ziVar.l(t1Var.a, t1Var.b);
                }
                u1Var.l();
                hs.f(i32).k(hs.F1, new Object[0]);
                return;
            case 17:
                lg.u1 u1Var2 = (lg.u1) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                ArrayList<Integer> arrayList14 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.b;
                if (!(tLObject8 instanceof TLRPC.TL_messages_messages)) {
                    a8.d("received " + tLObject8 + " " + tL_error8 + " on getQuickReplyMessages when trying to send quick reply");
                    return;
                }
                ArrayList<TLRPC.Message> arrayList15 = ((TLRPC.TL_messages_messages) tLObject8).messages;
                arrayList14.clear();
                int size4 = arrayList15.size();
                int i33 = 0;
                while (i33 < size4) {
                    TLRPC.Message message = arrayList15.get(i33);
                    i33++;
                    arrayList14.add(Integer.valueOf(message.id));
                }
                tL_messages_sendQuickReplyMessages.id = arrayList14;
                while (i17 < arrayList14.size()) {
                    tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    i17++;
                }
                ConnectionsManager.getInstance(u1Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                return;
            case 18:
                lg.u1 u1Var3 = (lg.u1) this.c;
                ArrayList arrayList16 = (ArrayList) this.d;
                ArrayList arrayList17 = (ArrayList) this.e;
                ArrayList arrayList18 = (ArrayList) this.b;
                Runnable runnable3 = (Runnable) this.f;
                u1Var3.e = false;
                int i34 = u1Var3.a;
                hp.s1(i34).Y3(arrayList16, true);
                hp.s1(i34).S3(arrayList17, true);
                ArrayList arrayList19 = u1Var3.b;
                arrayList19.clear();
                arrayList19.addAll(arrayList18);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    u1Var3.i(null, false);
                }
                hs.f(i34).k(hs.F1, new Object[0]);
                return;
            case 19:
                ((o4.g) this.d).run().b(new z3((ui.f) this.c, (AtomicBoolean) this.e, (o4.h) this.b, (AtomicBoolean) this.f, 26), l9.r.a);
                return;
            case 20:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.e, (SurfaceTexture) this.b, (Runnable) this.f);
                return;
            case 21:
                u7 u7Var = (u7) this.c;
                di.b bVar4 = (di.b) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.b;
                String str5 = (String) this.f;
                u7Var.getClass();
                bVar4.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                n61 n61Var = u7Var.n;
                for (int i35 = 0; i35 < n61Var.getViewPages().length; i35++) {
                    tj0 c2 = u7Var.c(n61Var.getViewPages()[i35]);
                    if (c2 != null && ((g7) c2.getAdapter()).d == 3) {
                        g7 g7Var = (g7) c2.getAdapter();
                        int i36 = 0;
                        while (true) {
                            if (i36 >= g7Var.e.size()) {
                                break;
                            } else if (((n7) g7Var.e.get(i36)).d == bVar4) {
                                g7Var.g(i36);
                            } else {
                                i36++;
                            }
                        }
                    }
                }
                return;
            case 22:
                ka kaVar = (ka) this.c;
                String str6 = (String) this.e;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                TLObject tLObject9 = (TLObject) this.d;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.f;
                kaVar.e = 0;
                String str7 = kaVar.f;
                if (str7 == null || !str7.equals(str6)) {
                    return;
                }
                if (tL_error9 == null && (tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.Cells.b2 b2Var4 = kaVar.H;
                    if (b2Var4 != null) {
                        b2Var4.setText(bd.a0("UsernameAvailable", null, 2131743677, str6));
                        org.telegram.ui.Cells.b2 b2Var5 = kaVar.H;
                        int i37 = org.telegram.ui.ActionBar.k6.w6;
                        b2Var5.setTag(Integer.valueOf(i37));
                        org.telegram.ui.ActionBar.r6.V(kaVar.H, i37, null);
                        ja jaVar = kaVar.G;
                        if (jaVar != null) {
                            ja.a(jaVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (kaVar.H != null) {
                    if (tL_error9 != null && "USERNAME_INVALID".equals(tL_error9.text) && checkusername.username.length() == 4) {
                        kaVar.H.setText(bd.M0(2131743664, null));
                        org.telegram.ui.Cells.b2 b2Var6 = kaVar.H;
                        int i38 = org.telegram.ui.ActionBar.k6.p7;
                        b2Var6.setTag(Integer.valueOf(i38));
                        org.telegram.ui.ActionBar.r6.V(kaVar.H, i38, null);
                    } else if (tL_error9 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error9.text)) {
                        kaVar.H.setText(bd.M0(2131743668, null));
                        org.telegram.ui.Cells.b2 b2Var7 = kaVar.H;
                        int i39 = org.telegram.ui.ActionBar.k6.p7;
                        b2Var7.setTag(Integer.valueOf(i39));
                        org.telegram.ui.ActionBar.r6.V(kaVar.H, i39, null);
                    } else {
                        if (checkusername.username.length() == 4) {
                            kaVar.H.setText(bd.M0(2131743663, null));
                        } else {
                            kaVar.H.setText(bd.M0(2131743667, null));
                        }
                        org.telegram.ui.Cells.b2 b2Var8 = kaVar.H;
                        int i40 = org.telegram.ui.ActionBar.k6.F6;
                        b2Var8.setTag(Integer.valueOf(i40));
                        org.telegram.ui.ActionBar.r6.V(kaVar.H, i40, null);
                    }
                    ja jaVar2 = kaVar.G;
                    if (jaVar2 != null) {
                        ja.a(jaVar2);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                org.telegram.ui.fb fbVar = (org.telegram.ui.fb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.ActionBar.s1 s1Var6 = (org.telegram.ui.ActionBar.s1) this.f;
                kb kbVar = fbVar.a.n;
                kbVar.B0 = false;
                kbVar.z0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr2[0]) {
                    return;
                }
                s1Var6.dismiss();
                if (tL_messages_exportedChatInvite != null) {
                    kb.F0(kbVar, tL_messages_exportedChatInvite, kbVar.A0);
                    return;
                } else {
                    org.telegram.messenger.k5.o(null, 2131748921, fc.a0(kbVar), R.raw.linkbroken, 36);
                    return;
                }
            case 24:
                pc pcVar = (pc) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                int[] iArr = (int[]) this.e;
                int[] iArr2 = (int[]) this.f;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.b;
                if (zArr3[0] || (i13 = iArr[0]) >= iArr2[0]) {
                    return;
                }
                if (tL_error10 != null) {
                    zArr3[0] = true;
                    if ("BOOSTS_REQUIRED".equals(tL_error10.text)) {
                        pcVar.getMessagesController().G0().b(pcVar.a, pcVar.c, new ub(pcVar, i16));
                        return;
                    } else {
                        pcVar.Q.setLoading(false);
                        fc.a0(pcVar).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error10.text)).j();
                        return;
                    }
                }
                int i41 = i13 + 1;
                iArr[0] = i41;
                if (i41 == iArr2[0]) {
                    pcVar.finishFragment();
                    org.telegram.ui.ActionBar.d2 d2Var2 = pcVar.m0;
                    if (d2Var2 != null) {
                        if (d2Var2 instanceof ln) {
                            ((ln) d2Var2).t0();
                        }
                        org.telegram.messenger.k5.o(null, pcVar.d ? 2131749506 : 2131752459, fc.a0(pcVar.m0), R.raw.contact_check, 36);
                        pcVar.m0 = null;
                    }
                    pcVar.Q.setLoading(false);
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                e();
                return;
            default:
                ip.d0((ip) this.c, (TLRPC.TL_error) this.b, (TLRPC.InputCheckPasswordSRP) this.d, (TwoStepVerificationActivity) this.e, (TLRPC.TL_channels_editCreator) this.f);
                return;
        }
    }

    public /* synthetic */ t6(ei.j4 j4Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, r8 r8Var) {
        this.a = 10;
        this.c = j4Var;
        this.d = runnable;
        this.b = tL_error;
        this.e = storyItem;
        this.f = r8Var;
    }

    public /* synthetic */ t6(o8 o8Var, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.a = 13;
        this.c = o8Var;
        this.e = s1Var;
        this.d = tLObject;
        this.f = getgroupcallstreamrtmpurl;
        this.b = tL_error;
    }

    public /* synthetic */ t6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.f = obj5;
    }

    public /* synthetic */ t6(Object obj, Object obj2, Object obj3, Object obj4, TLRPC.TL_error tL_error, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = tL_error;
    }

    public /* synthetic */ t6(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ t6(org.telegram.ui.ActionBar.d2 d2Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, int i3) {
        this.a = i3;
        this.c = d2Var;
        this.e = str;
        this.b = tL_error;
        this.d = tLObject;
        this.f = tLObject2;
    }

    public /* synthetic */ t6(ip ipVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 29;
        this.c = ipVar;
        this.b = tL_error;
        this.d = inputCheckPasswordSRP;
        this.e = twoStepVerificationActivity;
        this.f = tL_channels_editCreator;
    }
}
