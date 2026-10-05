package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.h60;
import org.telegram.ui.hh;
import org.telegram.ui.hp;
import org.telegram.ui.kn;
import org.telegram.ui.kn0;
import org.telegram.ui.m70;
import org.telegram.ui.nf0;
import org.telegram.ui.nl0;
import org.telegram.ui.oh;
import org.telegram.ui.op;
import org.telegram.ui.pp;
import org.telegram.ui.qm;
import org.telegram.ui.so0;
import org.telegram.ui.um0;
import org.telegram.ui.wm0;
import org.telegram.ui.wn;
import org.telegram.ui.y21;
import org.telegram.ui.yn;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s4(u4 u4Var, View view, zg.m0 m0Var, boolean z10, boolean z11) {
        this.a = 0;
        this.c = u4Var;
        this.d = view;
        this.e = m0Var;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        wm0 wm0Var = (wm0) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        kn0 kn0Var = wm0Var.e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            kn0Var.c1 = tL_secureSecretSettings.secure_secret;
            kn0Var.b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                kn0Var.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                    kn0Var.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    AndroidUtilities.runOnUIThread(new s4(wm0Var, passwordsettings, this.b, bArr2, 26));
                }
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                    AndroidUtilities.runOnUIThread(new nl0(wm0Var, 4));
                    return;
                }
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = kn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                kn0Var.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            kn0Var.c1 = null;
            kn0Var.b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new s4(wm0Var, passwordsettings, this.b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        int i10;
        int i11;
        wm0 wm0Var = (wm0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        kn0 kn0Var = wm0Var.e;
        kn0Var.d1 = passwordsettings.email;
        if (z10) {
            kn0Var.e1 = kn0Var.P0;
        }
        byte[] bArr3 = kn0Var.c1;
        byte[] bArr4 = kn0Var.e1;
        if (bArr3 == null || bArr3.length != 32) {
            bArr = null;
        } else {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, 32);
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 32, bArr6, 0, 16);
            bArr = new byte[32];
            System.arraycopy(bArr3, 0, bArr, 0, 32);
            Utilities.aesCbcEncryptionByteArraySafe(bArr, bArr5, bArr6, 0, 32, 0, 0);
        }
        if (kn0.Z0(bArr, Long.valueOf(kn0Var.b1)) && bArr2.length != 0 && kn0Var.b1 != 0) {
            if (kn0Var.c != 0) {
                wm0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new um0(wm0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            kn0Var.N0 = 0;
            kn0Var.R1();
            return;
        }
        TL_account.authorizationForm authorizationform = kn0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            kn0Var.y.errors.clear();
        }
        byte[] bArr7 = kn0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new nf0(wm0Var, wm0Var.b, wm0Var.d, 12));
        } else {
            wm0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        File file;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        ci.ab abVar;
        int i13 = 18;
        int i14 = 3;
        int i15 = 16;
        int i16 = 4;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                u4 u4Var = (u4) this.c;
                View view = (View) this.d;
                zg.m0 m0Var = (zg.m0) this.e;
                boolean z11 = this.b;
                e6 e6Var = u4Var.a;
                org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(u4Var, z11, m0Var, view));
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str = (String) this.e;
                boolean z12 = this.b;
                ci.z1 z1Var = w1Var.s;
                if (w1Var.r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.s2 s2Var = z1Var.r;
                        ArrayList arrayList = z1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.f3) s2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str, messages_botresults);
                        w1Var.h = messages_botresults.next_offset;
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        w1Var.l();
                    }
                    z1Var.d.c(false);
                    w1Var.r = false;
                    return;
                }
                return;
            case 2:
                ci.k8 k8Var = (ci.k8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                Runnable runnable = (Runnable) this.e;
                k8Var.getClass();
                try {
                    bitmap.compress(z13 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(k8Var.Z0));
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    if (z13) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(k8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.i0 i0Var = (gg.i0) this.c;
                boolean z14 = this.b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.f0 f0Var = (gg.f0) this.e;
                if (z14) {
                    return;
                }
                i0Var.c = f0Var;
                v3Var.setRightText(i0Var.H(f0Var));
                v3Var.setRightTextMargin(6);
                i0Var.I.clear();
                i0Var.d = true;
                i0Var.l();
                i0Var.Q();
                return;
            case 4:
                Context context = (Context) this.c;
                boolean z15 = this.b;
                i2.f0 f0Var2 = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o(context);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z15) {
                    j2.f fVar = f0Var2.s;
                    fVar.getClass();
                    fVar.f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z16 = this.b;
                ii.u3 u3Var = (ii.u3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ii.k4.k(n2Var, z16, new ah.b(i13, u3Var, trim));
                return;
            case 6:
                ki.s0 s0Var = (ki.s0) this.c;
                ki.t tVar = (ki.t) this.d;
                boolean z17 = this.b;
                ki.o0 o0Var = (ki.o0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    tVar.g();
                    File file2 = tVar.a;
                    long e11 = w7.k.e(file2) / 1000;
                    s0Var.m.b("active output finalized: size=" + file2.length() + ", durationMs=" + e11 + ", elapsedMs=" + ki.s0.f(nanoTime));
                    s0Var.g();
                    long j3 = s0Var.o;
                    boolean z18 = e11 > j3;
                    if (z17 && !z18) {
                        try {
                            s0Var.k.execute(new ki.f0(s0Var, o0Var, tVar.a, e11, true));
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            s0Var = s0Var;
                            s0Var.i.post(new ki.c0(s0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = tVar.a;
                    try {
                        file = file3;
                        try {
                            s0Var.s(file, 0L, Math.min(j3, e11), z17, z18 ? 1 : 2);
                            w7.k.c(file);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.k.c(file);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file = file3;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            case 7:
                m4.a0 a0Var = (m4.a0) this.c;
                boolean z19 = this.b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.a1 a1Var = a0Var.g;
                if (z19) {
                    m4.g1 g1Var = new m4.g1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = a1Var.b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.a0.B).n;
                        } else if (a0Var.h(rVar)) {
                            v7.l8.b(new m4.k1(0));
                            i11 = 0;
                        } else {
                            v7.l8.b(new m4.k1(-100));
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, g1Var);
                        }
                    } catch (DeadObjectException unused) {
                        a1Var.b.M(rVar);
                        v7.l8.b(new m4.k1(-100));
                    } catch (RemoteException e14) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e14);
                        v7.l8.b(new m4.k1(-1));
                    }
                }
                runnable2.run();
                a1Var.b.n(rVar);
                return;
            case 8:
                androidx.activity.n nVar = (androidx.activity.n) this.c;
                m4.s sVar = (m4.s) this.d;
                boolean z20 = this.b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.k0) nVar.d).g;
                m4.e1 e1Var = a0Var2.t;
                w7.u.b(e1Var, sVar);
                int d = e1Var.d();
                if (d == 1) {
                    if (e1Var.m0(2)) {
                        e1Var.b();
                    }
                } else if (d == 4 && e1Var.m0(4)) {
                    e1Var.H();
                }
                if (z20 && e1Var.m0(1)) {
                    e1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z20) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                a0Var2.p(rVar2);
                return;
            case 9:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 10:
                String[] strArr = (String[]) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                boolean z21 = this.b;
                org.telegram.ui.ActionBar.q qVar2 = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.i6.g0 = org.telegram.ui.ActionBar.i6.ql.get(org.telegram.ui.ActionBar.i6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (h6Var.c != null) {
                                new File(h6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        h6Var.c = null;
                        org.telegram.ui.ActionBar.i6.h0 = null;
                    } else {
                        org.telegram.ui.ActionBar.i6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.i6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str2 = h6Var.c;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(h6Var.c).delete();
                            }
                        } catch (Exception unused3) {
                        }
                        h6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(org.telegram.ui.ActionBar.i6.h0);
                            h6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i19 = 0; i19 < split.length; i19++) {
                                    if ("blur".equals(split[i19])) {
                                        h6Var.h = true;
                                    } else if ("motion".equals(split[i19])) {
                                        h6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            h6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    h6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        h6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        h6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        h6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    h6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th4) {
                            FileLog.e(th4);
                        }
                    }
                    if (!z21 && org.telegram.ui.ActionBar.i6.M == null) {
                        org.telegram.ui.ActionBar.i6.K = h6Var;
                        if (org.telegram.ui.ActionBar.i6.I != org.telegram.ui.ActionBar.i6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.i6.T = 2000;
                            org.telegram.ui.ActionBar.i6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(i15), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.i6.I = h6Var;
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                if (org.telegram.ui.ActionBar.i6.M == null && !org.telegram.ui.ActionBar.i6.Q) {
                    MessagesController.getInstance(h6Var.E).saveTheme(h6Var, h6Var.k(false), z21, false);
                }
                qVar2.run();
                return;
            case 11:
                yn.S((yn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 12:
                kn knVar = (kn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                yn ynVar = knVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, ynVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                int i21 = m10.a == zf.b.b ? ynVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : ynVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z22) {
                    m10 = zf.a.i((m10.b / 1000) * i21, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z22) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.m.L0(i21))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z22) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.f0.o(message.suggested_post.schedule_date), ei.m.L0(i21))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.f0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i22 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.rc[] rcVarArr = new org.telegram.ui.Components.rc[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(rcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.e5.v0(ynVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new m3(knVar, message, b2VarArr, messageObject, s5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(s5Var);
                if (z22 && m10.a == zf.b.a) {
                    org.telegram.ui.Components.lb a2 = org.telegram.ui.Components.mb.a(ynVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.n2) ynVar).resourceProvider;
                    org.telegram.ui.Components.rc G = new yc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    rcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                wn wnVar = (wn) this.c;
                wnVar.j((org.telegram.ui.ActionBar.c4) this.d, (TLRPC.WallPaper) this.e, this.b);
                wnVar.g(wnVar.n);
                qm qmVar = wnVar.V.V0;
                if (qmVar == null || (abVar = qmVar.L) == null) {
                    return;
                }
                abVar.invalidate();
                return;
            case 14:
                hp hpVar = (hp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    hpVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = hpVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (hpVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        hpVar.showDialog(alertDialog$Builder.a);
                    }
                }
                j90 j90Var = hpVar.H;
                if (j90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hpVar.m0;
                    j90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    hpVar.H.c(hpVar.m0, hpVar.a0);
                    return;
                }
                return;
            case 15:
                pp ppVar = (pp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.b;
                x80 x80Var = (x80) this.e;
                chat.join_to_send = z24;
                ppVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z24, new ci.y0(ppVar, z24, chat, i15), new oh(i13, ppVar, x80Var));
                return;
            case 16:
                pp ppVar2 = (pp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.b;
                w80 w80Var = (w80) this.e;
                chat2.join_request = z25;
                ppVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z25, new op(ppVar2, i17), new oh(17, ppVar2, w80Var));
                return;
            case 17:
                boolean z26 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z26 && ChatObject.isChannel(chat3)) {
                    View d10 = alertDialog$Builder2.a.d(-1);
                    if (d10 instanceof TextView) {
                        TextView textView = (TextView) d10;
                        if (zArr[0]) {
                            textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat3) ? R.string.ChannelDelete : R.string.DeleteMega));
                            return;
                        }
                        if (chat3.monoforum) {
                            textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                            return;
                        } else if (chat3.megagroup) {
                            textView.setText(LocaleController.getString(R.string.LeaveMega));
                            return;
                        } else {
                            textView.setText(LocaleController.getString(R.string.LeaveChannel));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                qk qkVar = (qk) this.c;
                String str3 = (String) this.d;
                boolean z27 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                qkVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i23 = 12;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new be(i23, qkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    r10 = translitString;
                }
                int i24 = (r10 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i24];
                strArr2[0] = lowerCase;
                if (r10 != null) {
                    strArr2[1] = r10;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z27) {
                    for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                        lk lkVar = (lk) arrayList2.get(i25);
                        File file4 = lkVar.f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < i24) {
                                    String str4 = strArr2[i26];
                                    String str5 = lkVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(lkVar);
                                    } else {
                                        i26++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new be(i23, qkVar, arrayList3));
                return;
            case 19:
                u80.t((u80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                gy0 gy0Var = (gy0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z28 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                ry0 ry0Var = gy0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        ry0Var.S = tL_messages_stickerSet;
                        ry0Var.t0();
                        ry0Var.B0();
                    }
                }
                b2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z29 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new hh(i14, editTextBoldCursor2));
                        return;
                    }
                    return;
                }
                if (b2Var2 == null || !b2Var2.isShowing()) {
                    return;
                }
                b2Var2.k(true);
                editTextBoldCursor2.requestFocus();
                if (z29) {
                    AndroidUtilities.runOnUIThread(new hh(i16, editTextBoldCursor2));
                    return;
                }
                return;
            case 22:
                h60 h60Var = (h60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z30 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        h60Var.u1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 23:
                m70 m70Var = (m70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z31 = this.b;
                if (tL_error2 == null) {
                    m70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z31) {
                        if (m70Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        m70Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                m70Var.e = false;
                m70Var.a.l();
                return;
            case 24:
                wm0 wm0Var = (wm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.b;
                kn0 kn0Var = wm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    kn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    kn0Var.B1(z32);
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
                so0 so0Var = (so0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    so0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    so0Var.A0(z33);
                    return;
                }
                return;
            case 28:
                y21.U((y21) this.c, this.b, (org.telegram.ui.ActionBar.c4) this.d, (org.telegram.ui.ActionBar.b5) this.e);
                return;
            default:
                zg1.c0((zg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
        }
    }

    public /* synthetic */ s4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ s4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ s4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ s4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 17;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
