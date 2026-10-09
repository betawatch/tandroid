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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e31;
import org.telegram.ui.g60;
import org.telegram.ui.ih1;
import org.telegram.ui.ip;
import org.telegram.ui.kh;
import org.telegram.ui.l70;
import org.telegram.ui.ln;
import org.telegram.ui.nn0;
import org.telegram.ui.of0;
import org.telegram.ui.pp;
import org.telegram.ui.qp;
import org.telegram.ui.sg;
import org.telegram.ui.sm;
import org.telegram.ui.tk0;
import org.telegram.ui.vo0;
import org.telegram.ui.xm0;
import org.telegram.ui.xn;
import org.telegram.ui.zm0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t4(v4 v4Var, View view, zg.n0 n0Var, boolean z10, boolean z11) {
        this.a = 0;
        this.c = v4Var;
        this.d = view;
        this.e = n0Var;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        byte[] bArr2;
        zm0 zm0Var = (zm0) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        nn0 nn0Var = zm0Var.e;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            nn0Var.c1 = tL_secureSecretSettings.secure_secret;
            nn0Var.b1 = tL_secureSecretSettings.secure_secret_id;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                nn0Var.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str), bArr);
            } else {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                    nn0Var.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    AndroidUtilities.runOnUIThread(new t4(zm0Var, passwordsettings, this.b, bArr2, 26));
                }
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                    AndroidUtilities.runOnUIThread(new tk0(zm0Var, 5));
                    return;
                }
                bArr = new byte[0];
            }
        } else {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = nn0Var.J.new_secure_algo;
            if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                nn0Var.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                bArr = bArr3;
            } else {
                bArr = new byte[0];
            }
            nn0Var.c1 = null;
            nn0Var.b1 = 0L;
        }
        bArr2 = bArr;
        AndroidUtilities.runOnUIThread(new t4(zm0Var, passwordsettings, this.b, bArr2, 26));
    }

    private final void b() {
        byte[] bArr;
        int i10;
        int i11;
        zm0 zm0Var = (zm0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        nn0 nn0Var = zm0Var.e;
        nn0Var.d1 = passwordsettings.email;
        if (z10) {
            nn0Var.e1 = nn0Var.P0;
        }
        byte[] bArr3 = nn0Var.c1;
        byte[] bArr4 = nn0Var.e1;
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
        if (nn0.Y0(bArr, Long.valueOf(nn0Var.b1)) && bArr2.length != 0 && nn0Var.b1 != 0) {
            if (nn0Var.c != 0) {
                zm0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new xm0(zm0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            nn0Var.N0 = 0;
            nn0Var.Q1();
            return;
        }
        TL_account.authorizationForm authorizationform = nn0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            nn0Var.y.errors.clear();
        }
        byte[] bArr7 = nn0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new of0(zm0Var, zm0Var.b, zm0Var.d, 12));
        } else {
            zm0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        File file;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        ci.bb bbVar;
        int i13 = 21;
        int i14 = 3;
        int i15 = 16;
        int i16 = 18;
        int i17 = 4;
        boolean z10 = true;
        int i18 = 0;
        switch (this.a) {
            case 0:
                v4 v4Var = (v4) this.c;
                View view = (View) this.d;
                zg.n0 n0Var = (zg.n0) this.e;
                boolean z11 = this.b;
                f6 f6Var = v4Var.a;
                org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new u4(v4Var, z11, n0Var, view));
                return;
            case 1:
                ci.v1 v1Var = (ci.v1) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str = (String) this.e;
                boolean z12 = this.b;
                ci.y1 y1Var = v1Var.s;
                if (v1Var.r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci.r2 r2Var = y1Var.r;
                        ArrayList arrayList = y1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.f3) r2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str, messages_botresults);
                        v1Var.h = messages_botresults.next_offset;
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        v1Var.l();
                    }
                    y1Var.d.c(false);
                    v1Var.r = false;
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
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    if (z13) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(l8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                gg.h0 h0Var = (gg.h0) this.c;
                boolean z14 = this.b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                gg.e0 e0Var = (gg.e0) this.e;
                if (z14) {
                    return;
                }
                h0Var.c = e0Var;
                v3Var.setRightText(h0Var.H(e0Var));
                v3Var.setRightTextMargin(6);
                h0Var.I.clear();
                h0Var.d = true;
                h0Var.l();
                h0Var.Q();
                return;
            case 4:
                Context context = (Context) this.c;
                boolean z15 = this.b;
                i2.f0 f0Var = (i2.f0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o(context);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z15) {
                    j2.f fVar = f0Var.s;
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
                ii.l4.k(n2Var, z16, new ah.b(i16, u3Var, trim));
                return;
            case 6:
                ki.t0 t0Var = (ki.t0) this.c;
                ki.u uVar = (ki.u) this.d;
                boolean z17 = this.b;
                ki.p0 p0Var = (ki.p0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    uVar.g();
                    File file2 = uVar.a;
                    long e11 = w7.j.e(file2) / 1000;
                    t0Var.m.b("active output finalized: size=" + file2.length() + ", durationMs=" + e11 + ", elapsedMs=" + ki.t0.f(nanoTime));
                    t0Var.g();
                    long j3 = t0Var.o;
                    boolean z18 = e11 > j3;
                    if (z17 && !z18) {
                        try {
                            t0Var.k.execute(new ki.g0(t0Var, p0Var, uVar.a, e11, true));
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            t0Var = t0Var;
                            t0Var.i.post(new ki.d0(t0Var, e, 2));
                            return;
                        }
                    }
                    File file3 = uVar.a;
                    try {
                        file = file3;
                        try {
                            t0Var.s(file, 0L, Math.min(j3, e11), z17, z18 ? 1 : 2);
                            w7.j.c(file);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            w7.j.c(file);
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
                m4.b0 b0Var = (m4.b0) this.c;
                boolean z19 = this.b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.b1 b1Var = b0Var.g;
                if (z19) {
                    m4.h1 h1Var = new m4.h1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = b1Var.b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.b0.B).n;
                        } else if (b0Var.h(rVar)) {
                            v7.j8.b(new m4.l1(0));
                            i11 = 0;
                        } else {
                            v7.j8.b(new m4.l1(-100));
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, h1Var);
                        }
                    } catch (DeadObjectException unused) {
                        b1Var.b.M(rVar);
                        v7.j8.b(new m4.l1(-100));
                    } catch (RemoteException e14) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e14);
                        v7.j8.b(new m4.l1(-1));
                    }
                }
                runnable2.run();
                b1Var.b.n(rVar);
                return;
            case 8:
                androidx.activity.n nVar = (androidx.activity.n) this.c;
                m4.s sVar = (m4.s) this.d;
                boolean z20 = this.b;
                m4.r rVar2 = (m4.r) this.e;
                m4.b0 b0Var2 = ((m4.l0) nVar.d).g;
                m4.f1 f1Var = b0Var2.t;
                w7.s.b(f1Var, sVar);
                int d = f1Var.d();
                if (d == 1) {
                    if (f1Var.m0(2)) {
                        f1Var.b();
                    }
                } else if (d == 4 && f1Var.m0(4)) {
                    f1Var.H();
                }
                if (z20 && f1Var.m0(1)) {
                    f1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i19 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i19, true);
                }
                if (z20) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                b0Var2.p(rVar2);
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
                    org.telegram.ui.ActionBar.i6.g0 = org.telegram.ui.ActionBar.i6.tl.get(org.telegram.ui.ActionBar.i6.g5, -1);
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
                                for (int i20 = 0; i20 < split.length; i20++) {
                                    if ("blur".equals(split[i20])) {
                                        h6Var.h = true;
                                    } else if ("motion".equals(split[i20])) {
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
                            AndroidUtilities.runOnUIThread(new f(16), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.i6.I = h6Var;
                    org.telegram.ui.ActionBar.i6.o1(false, false);
                } catch (Exception e15) {
                    FileLog.e(e15);
                }
                if (org.telegram.ui.ActionBar.i6.M == null && !org.telegram.ui.ActionBar.i6.Q) {
                    MessagesController.getInstance(h6Var.E).saveTheme(h6Var, h6Var.k(false), z21, false);
                }
                qVar2.run();
                return;
            case 11:
                zn.v0((zn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 12:
                ln lnVar = (ln) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z22 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                zn znVar = lnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, znVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                int i22 = m10.a == zf.b.b ? znVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : znVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z22) {
                    m10 = zf.a.i((m10.b / 1000) * i22, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z22) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.H0(i22))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z22) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.c0.q(message.suggested_post.schedule_date), ei.l.H0(i22))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.c0.q(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i23 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.tc[] tcVarArr = new org.telegram.ui.Components.tc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(tcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 u02 = org.telegram.ui.Components.g5.u0(znVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new n3(lnVar, message, b2VarArr, messageObject, r5Var, 18));
                b2VarArr[0] = u02;
                u02.setOnDismissListener(r5Var);
                if (z22 && m10.a == zf.b.a) {
                    org.telegram.ui.Components.nb a2 = org.telegram.ui.Components.ob.a(znVar.getParentActivity());
                    e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                    org.telegram.ui.Components.tc G = new ad(a2, e6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    tcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                xn xnVar = (xn) this.c;
                xnVar.j((org.telegram.ui.ActionBar.c4) this.d, (TLRPC.WallPaper) this.e, this.b);
                xnVar.g(xnVar.n);
                sm smVar = xnVar.V.X0;
                if (smVar == null || (bbVar = smVar.L) == null) {
                    return;
                }
                bbVar.invalidate();
                return;
            case 14:
                ip ipVar = (ip) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    ipVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ipVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z23) {
                        if (ipVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        ipVar.showDialog(alertDialog$Builder.a);
                    }
                }
                x90 x90Var = ipVar.G;
                if (x90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ipVar.l0;
                    x90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    ipVar.G.c(ipVar.l0, ipVar.Z);
                    return;
                }
                return;
            case 15:
                qp qpVar = (qp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z24 = this.b;
                l90 l90Var = (l90) this.e;
                chat.join_to_send = z24;
                qpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z24, new ci.x0(qpVar, z24, chat, i15), new sg(22, qpVar, l90Var));
                return;
            case 16:
                qp qpVar2 = (qp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z25 = this.b;
                k90 k90Var = (k90) this.e;
                chat2.join_request = z25;
                qpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z25, new pp(qpVar2, i18), new sg(i13, qpVar2, k90Var));
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
                rk rkVar = (rk) this.c;
                String str3 = (String) this.d;
                boolean z27 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                rkVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea(i16, rkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    r11 = translitString;
                }
                int i24 = (r11 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i24];
                strArr2[0] = lowerCase;
                if (r11 != null) {
                    strArr2[1] = r11;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z27) {
                    for (int i25 = 0; i25 < arrayList2.size(); i25++) {
                        mk mkVar = (mk) arrayList2.get(i25);
                        File file4 = mkVar.f;
                        if (file4 != null && !file4.isDirectory()) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < i24) {
                                    String str4 = strArr2[i26];
                                    String str5 = mkVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(mkVar);
                                    } else {
                                        i26++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ea(i16, rkVar, arrayList3));
                return;
            case 19:
                i90.v((i90) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                my0 my0Var = (my0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z28 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                xy0 xy0Var = my0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z28) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        xy0Var.S = tL_messages_stickerSet;
                        xy0Var.u0();
                        xy0Var.C0();
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
                        AndroidUtilities.runOnUIThread(new kh(i14, editTextBoldCursor2));
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
                    AndroidUtilities.runOnUIThread(new kh(i17, editTextBoldCursor2));
                    return;
                }
                return;
            case 22:
                g60 g60Var = (g60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z30 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        g60Var.v1(null, tL_chatInviteExported3.link, true, z30);
                        return;
                    }
                }
                return;
            case 23:
                l70 l70Var = (l70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z31 = this.b;
                if (tL_error2 == null) {
                    l70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z31) {
                        if (l70Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l70Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        l70Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                l70Var.e = false;
                l70Var.a.l();
                return;
            case 24:
                zm0 zm0Var = (zm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z32 = this.b;
                nn0 nn0Var = zm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    nn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    nn0Var.A1(z32);
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
                vo0 vo0Var = (vo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z33 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject7;
                    vo0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    vo0Var.A0(z33);
                    return;
                }
                return;
            case 28:
                e31.V((e31) this.c, this.b, (org.telegram.ui.ActionBar.c4) this.d, (org.telegram.ui.ActionBar.c5) this.e);
                return;
            default:
                ih1.c0((ih1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
        }
    }

    public /* synthetic */ t4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ t4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ t4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ t4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 17;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
