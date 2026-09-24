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
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d60;
import org.telegram.ui.dh;
import org.telegram.ui.fp;
import org.telegram.ui.gn0;
import org.telegram.ui.i70;
import org.telegram.ui.il0;
import org.telegram.ui.in;
import org.telegram.ui.jf0;
import org.telegram.ui.mh;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.oo0;
import org.telegram.ui.pm;
import org.telegram.ui.qm0;
import org.telegram.ui.sm0;
import org.telegram.ui.un;
import org.telegram.ui.w21;
import org.telegram.ui.wn;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s4(u4 u4Var, View view, zg.o0 o0Var, boolean z10, boolean z11) {
        this.a = 0;
        this.c = u4Var;
        this.d = view;
        this.e = o0Var;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        sm0 sm0Var = (sm0) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        gn0 gn0Var = sm0Var.e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            gn0Var.c1 = tL_secureSecretSettings.secure_secret;
            gn0Var.b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                gn0Var.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                    gn0Var.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    AndroidUtilities.runOnUIThread(new s4(sm0Var, passwordsettings, this.b, bArr2, 26));
                }
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                    AndroidUtilities.runOnUIThread(new il0(sm0Var, 4));
                    return;
                }
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = gn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                gn0Var.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            gn0Var.c1 = null;
            gn0Var.b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new s4(sm0Var, passwordsettings, this.b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        int i10;
        int i11;
        sm0 sm0Var = (sm0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        gn0 gn0Var = sm0Var.e;
        gn0Var.d1 = passwordsettings.email;
        if (z10) {
            gn0Var.e1 = gn0Var.P0;
        }
        byte[] bArr3 = gn0Var.c1;
        byte[] bArr4 = gn0Var.e1;
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
        if (gn0.Z0(bArr, Long.valueOf(gn0Var.b1)) && bArr2.length != 0 && gn0Var.b1 != 0) {
            if (gn0Var.c != 0) {
                sm0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new qm0(sm0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            gn0Var.N0 = 0;
            gn0Var.R1();
            return;
        }
        TL_account.authorizationForm authorizationform = gn0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            gn0Var.y.errors.clear();
        }
        byte[] bArr7 = gn0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new jf0(sm0Var, sm0Var.b, sm0Var.d, 12));
        } else {
            sm0Var.b();
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
        ci.bb bbVar;
        int i13 = 20;
        int i14 = 3;
        int i15 = 16;
        int i16 = 4;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                u4 u4Var = (u4) this.c;
                View view = (View) this.d;
                zg.o0 o0Var = (zg.o0) this.e;
                boolean z11 = this.b;
                e6 e6Var = u4Var.a;
                org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(u4Var, z11, o0Var, view));
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
                        i10 = ((org.telegram.ui.ActionBar.e3) s2Var).currentAccount;
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
                ci.l8 l8Var = (ci.l8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                Runnable runnable = (Runnable) this.e;
                l8Var.getClass();
                try {
                    bitmap.compress(z13 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(l8Var.Z0));
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z13) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(l8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
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
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z16 = this.b;
                ii.u3 u3Var = (ii.u3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ii.k4.k(m2Var, z16, new ah.b(18, u3Var, trim));
                return;
            case 6:
                ki.r0 r0Var = (ki.r0) this.c;
                ki.t tVar = (ki.t) this.d;
                boolean z17 = this.b;
                ki.n0 n0Var = (ki.n0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    tVar.f();
                    File file2 = tVar.a;
                    long e10 = w7.k.e(file2) / 1000;
                    r0Var.l.b("active output finalized: size=" + file2.length() + ", durationMs=" + e10 + ", elapsedMs=" + ki.r0.e(nanoTime));
                    r0Var.f();
                    long j3 = r0Var.n;
                    boolean z18 = e10 > j3;
                    if (z17 && !z18) {
                        try {
                            r0Var.j.execute(new ki.f0(r0Var, n0Var, tVar.a, e10, true));
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            r0Var = r0Var;
                            r0Var.h.post(new ki.c0(r0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = tVar.a;
                    try {
                        file = file3;
                        try {
                            r0Var.r(file, 0L, Math.min(j3, e10), z17, z18 ? 1 : 2);
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
                } catch (Exception e12) {
                    e = e12;
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
                            v7.m8.b(new m4.k1(0));
                            i11 = 0;
                        } else {
                            v7.m8.b(new m4.k1(-100));
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, g1Var);
                        }
                    } catch (DeadObjectException unused) {
                        a1Var.b.M(rVar);
                        v7.m8.b(new m4.k1(-100));
                    } catch (RemoteException e13) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e13);
                        v7.m8.b(new m4.k1(-1));
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
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z21 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.h6.g0 = org.telegram.ui.ActionBar.h6.ql.get(org.telegram.ui.ActionBar.h6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (g6Var.c != null) {
                                new File(g6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        g6Var.c = null;
                        org.telegram.ui.ActionBar.h6.h0 = null;
                    } else {
                        org.telegram.ui.ActionBar.h6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.h6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str2 = g6Var.c;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(g6Var.c).delete();
                            }
                        } catch (Exception unused3) {
                        }
                        g6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(org.telegram.ui.ActionBar.h6.h0);
                            g6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i19 = 0; i19 < split.length; i19++) {
                                    if ("blur".equals(split[i19])) {
                                        g6Var.h = true;
                                    } else if ("motion".equals(split[i19])) {
                                        g6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            g6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    g6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        g6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        g6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        g6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    g6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th4) {
                            FileLog.e(th4);
                        }
                    }
                    if (!z21 && org.telegram.ui.ActionBar.h6.M == null) {
                        org.telegram.ui.ActionBar.h6.K = g6Var;
                        if (org.telegram.ui.ActionBar.h6.I != org.telegram.ui.ActionBar.h6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.h6.T = 2000;
                            org.telegram.ui.ActionBar.h6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(i15), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.h6.I = g6Var;
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z21, false);
                }
                pVar.run();
                return;
            case 11:
                wn.u0((wn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 12:
                in inVar = (in) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                wn wnVar = inVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, wnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                int i21 = m10.a == zf.b.b ? wnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : wnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z22) {
                    m10 = zf.a.i((m10.b / 1000) * i21, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z22) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.G0(i21))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z22) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.l.G0(i21))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i22 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(qcVarArr, 4);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                org.telegram.ui.ActionBar.a2 v02 = org.telegram.ui.Components.e5.v0(wnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new m3(inVar, message, a2VarArr, messageObject, r5Var, 18));
                a2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z22 && m10.a == zf.b.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(wnVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                    org.telegram.ui.Components.qc G = new yc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                un unVar = (un) this.c;
                unVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.e, this.b);
                unVar.g(unVar.n);
                pm pmVar = unVar.V.X0;
                if (pmVar == null || (bbVar = pmVar.L) == null) {
                    return;
                }
                bbVar.invalidate();
                return;
            case 14:
                fp fpVar = (fp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    fpVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = fpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (fpVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        fpVar.showDialog(alertDialog$Builder.a);
                    }
                }
                g90 g90Var = fpVar.G;
                if (g90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fpVar.l0;
                    g90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    fpVar.G.c(fpVar.l0, fpVar.Z);
                    return;
                }
                return;
            case 15:
                np npVar = (np) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.b;
                u80 u80Var = (u80) this.e;
                chat.join_to_send = z24;
                npVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z24, new ci.y0(npVar, z24, chat, i15), new dh(i13, npVar, u80Var));
                return;
            case 16:
                np npVar2 = (np) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.b;
                t80 t80Var = (t80) this.e;
                chat2.join_request = z25;
                npVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z25, new mp(npVar2, i17), new dh(19, npVar2, t80Var));
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
                ok okVar = (ok) this.c;
                String str3 = (String) this.d;
                boolean z27 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                okVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i23 = 15;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new uc(i23, okVar, new ArrayList()));
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
                        jk jkVar = (jk) arrayList2.get(i25);
                        File file4 = jkVar.f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < i24) {
                                    String str4 = strArr2[i26];
                                    String str5 = jkVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(jkVar);
                                    } else {
                                        i26++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new uc(i23, okVar, arrayList3));
                return;
            case 19:
                r80.t((r80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                ux0 ux0Var = (ux0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z28 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                fy0 fy0Var = ux0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        fy0Var.S = tL_messages_stickerSet;
                        fy0Var.t0();
                        fy0Var.B0();
                    }
                }
                a2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z29 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.e;
                if (e3Var != null && !e3Var.isDismissed()) {
                    e3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z29) {
                        AndroidUtilities.runOnUIThread(new mh(i14, editTextBoldCursor2));
                        return;
                    }
                    return;
                }
                if (a2Var2 == null || !a2Var2.isShowing()) {
                    return;
                }
                a2Var2.k(true);
                editTextBoldCursor2.requestFocus();
                if (z29) {
                    AndroidUtilities.runOnUIThread(new mh(i16, editTextBoldCursor2));
                    return;
                }
                return;
            case 22:
                d60 d60Var = (d60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z30 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        d60Var.u1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 23:
                i70 i70Var = (i70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z31 = this.b;
                if (tL_error2 == null) {
                    i70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z31) {
                        if (i70Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i70Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        i70Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                i70Var.e = false;
                i70Var.a.l();
                return;
            case 24:
                sm0 sm0Var = (sm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.b;
                gn0 gn0Var = sm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    gn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    gn0Var.B1(z32);
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
                oo0 oo0Var = (oo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    oo0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    oo0Var.A0(z33);
                    return;
                }
                return;
            case 28:
                w21.W((w21) this.c, this.b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.e);
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
