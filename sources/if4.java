// default package

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class if4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ if4(c cVar, WalletEngine2.ImportedWalletProof importedWalletProof, Exception exc, jac jacVar) {
        this.a = (byte) 10;
        this.b = importedWalletProof;
        this.c = exc;
        this.d = jacVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v51, types: [j$.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v28, types: [qp3] */
    /* JADX WARN: Type inference failed for: r5v32 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int[] iArr;
        File file;
        int i2;
        ivc ivcVar;
        int i3;
        byte b = 22;
        byte b2 = 3;
        byte b3 = 2;
        Bitmap bitmap = null;
        r8 = null;
        r8 = null;
        r8 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        Pair pair = null;
        bitmap = null;
        int i4 = 0;
        r9 = false;
        boolean z = false;
        r9 = false;
        r9 = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                kf4 kf4Var = (kf4) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                hf4 hf4Var = (hf4) this.d;
                if (tL_error != null) {
                    c41.b0(kf4Var.a).t(jb6.M0(2131743566, null), null).j();
                    gm.r(hf4Var);
                    break;
                }
                break;
            case 1:
                uf4 uf4Var = (uf4) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                xf4 xf4Var = uf4Var.K;
                int[] iArr3 = xf4Var.U0;
                GLES20.glBindFramebuffer(36160, iArr3 != null ? iArr3[!xf4Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, xf4Var.g(!uf4Var.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i5 = uf4Var.V;
                if (i5 != 0 && (i = uf4Var.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i5 * i) << 2);
                    GLES20.glReadPixels(0, 0, uf4Var.V, uf4Var.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(uf4Var.V, uf4Var.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                break;
            case 2:
                lh4 lh4Var = (lh4) this.b;
                he heVar = (he) this.c;
                ub7 ub7Var = (ub7) this.d;
                FiltersSetupActivity filtersSetupActivity = lh4Var.e;
                if (heVar != null) {
                    try {
                        heVar.dismiss();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                filtersSetupActivity.getMessagesController().m4(ub7Var);
                cf7 messagesStorage = filtersSetupActivity.getMessagesStorage();
                messagesStorage.a.c(new q87(messagesStorage, ub7Var, b));
                break;
            case 3:
                ln4 ln4Var = (ln4) this.b;
                d dVar = (d) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ln4Var.u2 = -1;
                u31 I = c41.b0(dVar).I(R.raw.ic_delete, jb6.a0(null, null, 2131750595, ln4Var.X1), jb6.G(arrayList.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                ln4Var.v2 = true;
                ln4Var.dismiss();
                ln4Var.r1.getMessagesController().h2(ln4Var.T1);
                break;
            case 4:
                ln4 ln4Var2 = (ln4) this.b;
                ln4Var2.u2 = ln4Var2.r1.getConnectionsManager().sendRequest((TLObject) this.c, new cx3(ln4Var2, (Pair) this.d, (byte) 5));
                break;
            case 5:
                pt4 pt4Var = (pt4) this.b;
                Object obj = this.c;
                String str = (String) this.d;
                float f = pt4Var.L;
                if (obj != null) {
                    int min = (int) Math.min(gm.q.x / 3.0f, gm.L(330.0f));
                    if (obj instanceof jo6) {
                        jo6 jo6Var = (jo6) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        pt4Var.c(jo6Var, options);
                        g6b.B(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c = pt4Var.c(jo6Var, options);
                        if (c != null && c.getHeight() / c.getWidth() < f) {
                            if (jo6Var.T == 0 && jo6Var.U == 0 && !c.isRecycled()) {
                                iArr2 = lge.b(c, true);
                                jo6Var.T = iArr2[0];
                                jo6Var.U = iArr2[1];
                            } else {
                                int i6 = jo6Var.T;
                                if (i6 != 0 && (i2 = jo6Var.U) != 0) {
                                    iArr2 = new int[]{i6, i2};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c;
                    } else if (!(obj instanceof g6b) || (file = ((g6b) obj).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        g6b.B(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                gm.c3(new if4((Object) pt4Var, (Object) str, (Object) pair, (byte) 6));
                break;
            case 6:
                pt4 pt4Var2 = (pt4) this.b;
                String str2 = (String) this.c;
                Pair pair2 = (Pair) this.d;
                Bitmap bitmap2 = (Bitmap) pair2.first;
                int[] iArr4 = (int[]) pair2.second;
                if (bitmap2 != null) {
                    if (str2 != null) {
                        pt4.g0.put(str2, bitmap2);
                        HashMap hashMap = pt4.f0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (TextUtils.equals(str2, pt4Var2.S)) {
                        pt4Var2.a = bitmap2;
                        ?? r0 = pt4Var2.d;
                        if (iArr4 == null) {
                            r0.setShader(null);
                            pt4Var2.e = null;
                        } else {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr4, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            pt4Var2.e = linearGradient;
                            r0.setShader(linearGradient);
                        }
                        pt4Var2.h();
                        pt4Var2.invalidate();
                        break;
                    } else {
                        pt4.d(str2);
                        break;
                    }
                }
                break;
            case 7:
                st4 st4Var = (st4) this.b;
                TLObject tLObject = (TLObject) this.c;
                oc7 oc7Var = (oc7) this.d;
                st4Var.r = true;
                st4Var.d = false;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    oc7Var.d4(tL_contacts_resolvedPeer.users, false);
                    oc7Var.X3(tL_contacts_resolvedPeer.chats, false);
                    cf7.Y(st4Var.x.a).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    st4Var.E();
                    break;
                }
                break;
            case 8:
                yw4 yw4Var = (yw4) this.b;
                String str3 = (String) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (TextUtils.equals(yw4Var.k2, str3)) {
                    yw4Var.l2 = -1;
                    yw4Var.f2.clear();
                    yw4Var.g2.clear();
                    if (tLObject2 instanceof TLRPC.TL_contacts_found) {
                        TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject2;
                        oc7 r1 = oc7.r1(yw4Var.a);
                        r1.d4(tL_contacts_found.users, false);
                        r1.X3(tL_contacts_found.chats, false);
                        HashSet hashSet = new HashSet();
                        yw4Var.Y0(tL_contacts_found.my_results, hashSet);
                        yw4Var.Y0(tL_contacts_found.results, hashSet);
                    }
                    yw4Var.i2.O(true);
                    break;
                }
                break;
            case 9:
                c cVar = (c) this.b;
                String str4 = (String) this.c;
                r25 r25Var = (r25) this.d;
                if (cVar.Q.get(str4) == r25Var) {
                    r25Var.e = true;
                    ArrayList arrayList2 = r25Var.f;
                    cVar.v0(r25Var);
                    int size = arrayList2.size();
                    while (i4 < size) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((qac) obj2).a(r25Var);
                    }
                    arrayList2.clear();
                    cVar.S();
                    break;
                }
                break;
            case 10:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) this.b;
                Exception exc = (Exception) this.c;
                jac jacVar = (jac) this.d;
                if (importedWalletProof == null) {
                    StringBuilder sb = new StringBuilder("failed to prove: ");
                    String str5 = "PROOF_ERROR";
                    sb.append((exc == null || exc.getMessage() == null) ? "PROOF_ERROR" : exc.getMessage());
                    c.n(sb.toString(), exc);
                    if (exc != null && exc.getMessage() != null) {
                        str5 = exc.getMessage();
                    }
                    jacVar.a(null, str5);
                    break;
                } else {
                    c.O("proof done");
                    jacVar.a(importedWalletProof, null);
                    break;
                }
                break;
            case 11:
                r45 r45Var = (r45) this.b;
                sk3 sk3Var = (sk3) this.c;
                String str6 = (String) this.d;
                r45Var.f = false;
                sk3Var.a(str6);
                break;
            case 12:
                ((lf2) this.b).a((TL_wallet.inputTonConnectOauthSession) this.c, (String) this.d);
                break;
            case 13:
                lj3 lj3Var = (lj3) this.b;
                s45 s45Var = (s45) this.c;
                b61 b61Var = (b61) this.d;
                if (!lj3Var.canScrollVertically(1)) {
                    s45Var.p = true;
                }
                if (s45Var.p && !s45Var.m && !s45Var.n) {
                    z2 = true;
                }
                b61Var.setEnabled(z2);
                break;
            case 14:
                w45 w45Var = (w45) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                qac qacVar = (qac) this.d;
                w45Var.getClass();
                h72 h72Var = new h72(qacVar, b3);
                if (tonconnectsession != null && tonconnectsession.dapp_client_id != null && tonconnectsession.client_id != null && tonconnectsession.nonce != null) {
                    if (w45Var.c.add(Long.valueOf(tonconnectsession.id))) {
                        iu iuVar = new iu(w45Var, tonconnectsession, h72Var, b);
                        if (tonconnectsession.closed) {
                            iuVar.a(null);
                            break;
                        } else {
                            w45Var.b.x0(new if4((Object) w45Var, (Object) iuVar, (Object) tonconnectsession, (byte) 15));
                            break;
                        }
                    } else {
                        h72Var.a("A TON Connect operation is already in progress");
                        break;
                    }
                } else {
                    h72Var.a("Missing TON Connect session data");
                    break;
                }
            case 15:
                w45 w45Var2 = (w45) this.b;
                iu iuVar2 = (iu) this.c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                c cVar2 = w45Var2.b;
                String x = cVar2.x();
                byte[] D = cVar2.D();
                byte[] bArr = D != null ? (byte[]) D.clone() : null;
                if (x != null && bArr != null) {
                    cVar2.E(true, false, false, new sm1(w45Var2, iuVar2, tonconnectsession2, x, bArr, (byte) 5));
                    break;
                } else {
                    iuVar2.a("Wallet is not ready");
                    break;
                }
            case 16:
                w45 w45Var3 = (w45) this.b;
                r45 r45Var2 = (r45) this.c;
                f45 f45Var = (f45) this.d;
                w45Var3.getClass();
                sk3 sk3Var2 = new sk3(f45Var, (byte) 14);
                TL_wallet.tonConnectSession tonconnectsession3 = r45Var2.e;
                if (!tonconnectsession3.closed && !tonconnectsession3.closing && tonconnectsession3.manifest_error == null && tonconnectsession3.manifest != null) {
                    if (r45Var2.f) {
                        sk3Var2.a("A TON Connect operation is already in progress");
                        break;
                    } else {
                        r45Var2.f = true;
                        w45Var3.b.x0(new xo1(w45Var3, r45Var2, sk3Var2, tonconnectsession3, (byte) 27));
                        break;
                    }
                } else {
                    sk3Var2.a("The dApp manifest is unavailable or the session is closed");
                    break;
                }
            case 17:
                qu quVar = (qu) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h55 h55Var = (h55) this.d;
                k55.a.remove(quVar);
                if (!zArr[0]) {
                    zArr[0] = true;
                    c41.c0(jb6.M0(2131742622, null));
                    h55Var.a();
                    break;
                }
                break;
            case 18:
                j55 j55Var = (j55) this.b;
                b61 b61Var2 = (b61) this.c;
                b61 b61Var3 = (b61) this.d;
                boolean a = j55Var.a();
                b61Var2.setEnabled((a || j55Var.d) ? false : true);
                if (!a && !j55Var.d) {
                    z = true;
                }
                b61Var3.setEnabled(z);
                break;
            case 19:
                n55 n55Var = (n55) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                if (tL_error2 != null) {
                    n55Var.a.b(false);
                    c41.e0(tL_error2);
                    break;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    n55Var.a.b(false);
                    mlb.y(null, 2131743566, c41.b0(n55Var), null);
                    break;
                } else {
                    n55Var.finishFragment();
                    break;
                }
            case 20:
                jb5 jb5Var = (jb5) this.b;
                ha5 ha5Var = (ha5) this.c;
                ha5 ha5Var2 = (ha5) this.d;
                ValueAnimator valueAnimator = jb5Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ha5Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new hb5(jb5Var, ha5Var, b2)).setDuration(100L).start();
                if (ha5Var2 != null) {
                    ha5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new fa5(ha5Var2, b2)).start();
                    break;
                }
                break;
            case 21:
                mc5 mc5Var = (mc5) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                oc5 oc5Var = mc5Var.J;
                bu9 bu9Var = mc5Var.f;
                if (mc5Var.n) {
                    mc5Var.h = null;
                    mc5Var.d = arrayList3;
                    mc5Var.e = arrayList4;
                    bu9Var.f(arrayList3, null);
                    oc5Var.u0(mc5Var.I);
                    mc5Var.f();
                    if (mc5Var.n && !bu9Var.e() && mc5Var.b() == 0) {
                        oc5Var.s.e(false, true);
                        break;
                    }
                }
                break;
            case 22:
                cn0 cn0Var = (cn0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                String str7 = (String) this.d;
                ArrayList arrayList6 = new ArrayList();
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    m11 m11Var = (m11) arrayList5.get(i7);
                    if (cn0.n(m11Var.c, str7) || ((ivcVar = m11Var.d) != null && (cn0.n(ivcVar.c, str7) || cn0.n(m11Var.d.d, str7)))) {
                        arrayList6.add(m11Var);
                    }
                }
                gm.c3(new fd5(cn0Var, arrayList6, b2));
                break;
            case 23:
                pm5 pm5Var = (pm5) this.b;
                String str8 = (String) this.c;
                lb4 lb4Var = (lb4) this.d;
                fn5 fn5Var = pm5Var.b;
                HashMap hashMap2 = fn5Var.h;
                ?? r4 = fn5Var.i;
                tm5 tm5Var = (tm5) hashMap2.remove(str8);
                if (tm5Var != null) {
                    ArrayList arrayList7 = tm5Var.v;
                    fn5Var.g.remove(str8);
                    ArrayList arrayList8 = new ArrayList();
                    for (int i8 = 0; i8 < arrayList7.size(); i8++) {
                        String str9 = (String) tm5Var.x.get(i8);
                        String str10 = (String) tm5Var.y.get(i8);
                        int intValue = ((Integer) tm5Var.z.get(i8)).intValue();
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList7.get(i8);
                        int intValue2 = ((Integer) tm5Var.w.get(i8)).intValue();
                        tm5 tm5Var2 = (tm5) r4.get(str9);
                        if (tm5Var2 == null) {
                            tm5Var2 = new tm5(fn5Var);
                            tm5Var2.a = tm5Var.a;
                            tm5Var2.h = tm5Var.h;
                            tm5Var2.o = tm5Var.o;
                            tm5Var2.p = lb4Var.e();
                            tm5Var2.j = tm5Var.j;
                            tm5Var2.c = tm5Var.c;
                            tm5Var2.d = str9;
                            tm5Var2.i = tm5Var.i;
                            tm5Var2.m = intValue;
                            tm5Var2.g = tm5Var.g;
                            tm5Var2.r = tm5Var.r;
                            tm5Var2.u = new um5(fn5Var, tm5Var2);
                            tm5Var2.f = str10;
                            tm5Var2.l = tm5Var.l;
                            tm5Var2.n = tm5Var.n;
                            r4.put(str9, tm5Var2);
                            fn5Var.j.add(fn5.j(str9));
                            arrayList8.add(tm5Var2.u);
                        }
                        tm5Var2.a(imageReceiver, str9, str10, intValue, intValue2);
                    }
                    for (int i9 = 0; i9 < arrayList8.size(); i9++) {
                        um5 um5Var = (um5) arrayList8.get(i9);
                        tm5 tm5Var3 = um5Var.c;
                        if (tm5Var3.m == 1) {
                            fn5Var.q.c(um5Var);
                        } else {
                            ix2 ix2Var = fn5Var.p;
                            boolean z3 = tm5Var3.a;
                            if (!z3) {
                                ix2Var.getClass();
                                um5Var = new qp3(z3 ? 1 : 0, um5Var);
                            }
                            ((pp3) ix2Var.b).execute(um5Var);
                        }
                    }
                    break;
                }
                break;
            case 24:
                ((um5) this.b).c.c((Drawable) this.c, (String) this.d);
                break;
            case 25:
                vr5 vr5Var = (vr5) this.b;
                TLRPC.TL_langPackString tL_langPackString = (TLRPC.TL_langPackString) this.c;
                String str11 = (String) this.d;
                if (!vr5Var.N) {
                    vr5Var.f.setText(tL_langPackString.value);
                    oc7.d1().edit().putString("language_showed2", str11.toLowerCase()).apply();
                    break;
                }
                break;
            case 26:
                bs5 bs5Var = (bs5) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                if (bs5Var.h) {
                    bs5Var.d = arrayList9;
                    bs5Var.e = arrayList10;
                    bs5Var.f();
                    bs5Var.n.r.e(false, true);
                    break;
                }
                break;
            case 27:
                xs5 xs5Var = (xs5) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                d dVar2 = (d) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                dVar2.presentFragment(new ProfileActivity(bundle, null));
                xs5Var.f2 = true;
                break;
            case 28:
                rs5 rs5Var = (rs5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                ss5 ss5Var = rs5Var.a;
                if (tL_error3 == null) {
                    boolean z4 = tLObject4 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                    xs5 xs5Var2 = ss5Var.c;
                    if (z4) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject4;
                        TLRPC.ChatFull chatFull = xs5Var2.n1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (xs5Var2.d2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            break;
                        }
                    } else {
                        TLRPC.ChatFull chatFull2 = xs5Var2.n1;
                        if (chatFull2 != null) {
                            int i10 = chatFull2.invitesCount - 1;
                            chatFull2.invitesCount = i10;
                            if (i10 < 0) {
                                chatFull2.invitesCount = 0;
                            }
                            cf7.Y(xs5Var2.a).t1(xs5Var2.n1.invitesCount, xs5Var2.a2);
                        }
                        kg1 kg1Var = xs5Var2.d2;
                        if (kg1Var != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xs5Var2.l1;
                            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                            vg1 vg1Var = kg1Var.a;
                            ArrayList arrayList11 = vg1Var.p0;
                            int size2 = arrayList11.size();
                            tL_chatInviteExported2.revoked = true;
                            TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                            tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                            tL_channelAdminLogEvent.user_id = z8c.h(vg1Var.getAccountInstance().a).n;
                            i3 = ((d) vg1Var).currentAccount;
                            if (new k47(i3, tL_channelAdminLogEvent, vg1Var.o0, vg1Var.n0, vg1Var.f, vg1Var.U, true).U >= 0) {
                                vg1Var.O0();
                                int size3 = arrayList11.size() - size2;
                                if (size3 > 0) {
                                    vg1Var.D0.N = true;
                                    sg1 sg1Var = vg1Var.F;
                                    sg1Var.p(sg1Var.h, size3);
                                    vg1Var.Y0();
                                }
                                vg1Var.z0.remove(tL_chatInviteExported2.link);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                it5 it5Var = (it5) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                if (tL_error4 == null) {
                    it5Var.t2 = (TLRPC.TL_chatInviteExported) tLObject5;
                    TLRPC.ChatFull M0 = oc7.r1(it5Var.a).M0(it5Var.p2);
                    if (M0 != null) {
                        M0.exported_invite = it5Var.t2;
                    }
                    if (it5Var.t2.link != null) {
                        ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", it5Var.t2.link));
                        c41.j(it5Var.k2).j();
                        it5Var.dismiss();
                    }
                }
                it5Var.s2 = false;
                break;
        }
    }

    public /* synthetic */ if4(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
