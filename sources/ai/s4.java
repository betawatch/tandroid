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
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zd;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.e31;
import org.telegram.ui.gh1;
import org.telegram.ui.i60;
import org.telegram.ui.ip;
import org.telegram.ui.ln;
import org.telegram.ui.n70;
import org.telegram.ui.oh;
import org.telegram.ui.pn0;
import org.telegram.ui.pp;
import org.telegram.ui.qf0;
import org.telegram.ui.qh;
import org.telegram.ui.qp;
import org.telegram.ui.rm;
import org.telegram.ui.sl0;
import org.telegram.ui.xn;
import org.telegram.ui.xo0;
import org.telegram.ui.zm0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        int i10;
        int i11;
        bn0 bn0Var = (bn0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        pn0 pn0Var = bn0Var.e;
        pn0Var.d1 = passwordsettings.email;
        if (z10) {
            pn0Var.e1 = pn0Var.P0;
        }
        byte[] bArr3 = pn0Var.c1;
        byte[] bArr4 = pn0Var.e1;
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
        if (pn0.Z0(bArr, Long.valueOf(pn0Var.b1)) && bArr2.length != 0 && pn0Var.b1 != 0) {
            if (pn0Var.c != 0) {
                bn0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new zm0(bn0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            pn0Var.N0 = 0;
            pn0Var.R1();
            return;
        }
        TL_account.authorizationForm authorizationform = pn0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            pn0Var.y.errors.clear();
        }
        byte[] bArr7 = pn0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new qf0(bn0Var, bn0Var.b, bn0Var.d, 12));
        } else {
            bn0Var.b();
        }
    }

    private final void b() {
        xo0 xo0Var = (xo0) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            xo0Var.a0 = password;
            TwoStepVerificationActivity.m0(password);
            xo0Var.A0(this.b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        zn znVar;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        ci.eb ebVar;
        byte[] bArr;
        int i13 = 18;
        int i14 = 3;
        int i15 = 16;
        int i16 = 13;
        int i17 = 4;
        int i18 = 2;
        boolean z10 = true;
        int i19 = 0;
        switch (this.a) {
            case 0:
                u4 u4Var = (u4) this.c;
                View view = (View) this.d;
                zg.o0 o0Var = (zg.o0) this.e;
                boolean z11 = this.b;
                f6 f6Var = u4Var.a;
                org.telegram.ui.Components.e5.a0(f6Var.C2, 1, f6Var.B1, new t4(u4Var, z11, o0Var, view));
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
                        ci.t2 t2Var = z1Var.r;
                        ArrayList arrayList = z1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.f3) t2Var).currentAccount;
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
                ci.o8 o8Var = (ci.o8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                Runnable runnable = (Runnable) this.e;
                o8Var.getClass();
                try {
                    bitmap.compress(z13 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(o8Var.Z0));
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z13) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(o8Var.Z0));
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
                i2.e0 e0Var = (i2.e0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o(context);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z15) {
                    j2.f fVar = e0Var.s;
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
                ii.t3 t3Var = (ii.t3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ii.j4.k(n2Var, z16, new ah.b(i13, t3Var, trim));
                return;
            case 6:
                ki.h0 h0Var = (ki.h0) this.c;
                ki.o oVar = (ki.o) this.d;
                boolean z17 = this.b;
                ki.e0 e0Var2 = (ki.e0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    oVar.c();
                    h0Var.l.b("active output finalized: size=" + oVar.a.length() + ", elapsedMs=" + ki.h0.e(nanoTime));
                    h0Var.f();
                    if (z17) {
                        h0Var.b(e0Var2, oVar.a, h0Var.y, true);
                    } else {
                        File file = oVar.a;
                        try {
                            h0Var.q(file, 0L, h0Var.y, false, 2);
                            w7.k.c(file);
                        } catch (Exception e10) {
                            e = e10;
                            h0Var = h0Var;
                            h0Var.h.post(new ki.x(h0Var, e, i18));
                            return;
                        }
                    }
                    return;
                } catch (Exception e11) {
                    e = e11;
                }
            case 7:
                m4.a0 a0Var = (m4.a0) this.c;
                boolean z18 = this.b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.f1 f1Var = a0Var.g;
                if (z18) {
                    m4.l1 l1Var = new m4.l1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = f1Var.b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.a0.B).n;
                        } else if (a0Var.h(rVar)) {
                            v7.l8.b(new m4.p1(0));
                            i11 = 0;
                        } else {
                            v7.l8.b(new m4.p1(-100));
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, l1Var);
                        }
                    } catch (DeadObjectException unused) {
                        f1Var.b.M(rVar);
                        v7.l8.b(new m4.p1(-100));
                    } catch (RemoteException e12) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e12);
                        v7.l8.b(new m4.p1(-1));
                    }
                }
                runnable2.run();
                f1Var.b.n(rVar);
                return;
            case 8:
                androidx.activity.n nVar = (androidx.activity.n) this.c;
                m4.s sVar = (m4.s) this.d;
                boolean z19 = this.b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.k0) nVar.d).g;
                m4.j1 j1Var = a0Var2.t;
                w7.u.b(j1Var, sVar);
                int d = j1Var.d();
                if (d == 1) {
                    if (j1Var.m0(2)) {
                        j1Var.b();
                    }
                } else if (d == 4 && j1Var.m0(4)) {
                    j1Var.H();
                }
                if (z19 && j1Var.m0(1)) {
                    j1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i20 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i20, true);
                }
                if (z19) {
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
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                boolean z20 = this.b;
                org.telegram.ui.ActionBar.q qVar2 = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.j6.g0 = org.telegram.ui.ActionBar.j6.ql.get(org.telegram.ui.ActionBar.j6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (i6Var.c != null) {
                                new File(i6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        i6Var.c = null;
                        org.telegram.ui.ActionBar.j6.h0 = null;
                    } else {
                        org.telegram.ui.ActionBar.j6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.j6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str2 = i6Var.c;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(i6Var.c).delete();
                            }
                        } catch (Exception unused3) {
                        }
                        i6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(org.telegram.ui.ActionBar.j6.h0);
                            i6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i21 = 0; i21 < split.length; i21++) {
                                    if ("blur".equals(split[i21])) {
                                        i6Var.h = true;
                                    } else if ("motion".equals(split[i21])) {
                                        i6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            i6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    i6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        i6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        i6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        i6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    i6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z20 && org.telegram.ui.ActionBar.j6.M == null) {
                        org.telegram.ui.ActionBar.j6.K = i6Var;
                        if (org.telegram.ui.ActionBar.j6.I != org.telegram.ui.ActionBar.j6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.j6.T = 2000;
                            org.telegram.ui.ActionBar.j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new f(i15), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.j6.I = i6Var;
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (org.telegram.ui.ActionBar.j6.M == null && !org.telegram.ui.ActionBar.j6.Q) {
                    MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z20, false);
                }
                qVar2.run();
                return;
            case 11:
                zn.v0((zn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 12:
                ln lnVar = (ln) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i22 = R.string.SuggestedMessageAcceptInfo;
                zn znVar2 = lnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, znVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                int i23 = m10.a == zf.b.b ? znVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : znVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z21) {
                    znVar = znVar2;
                    m10 = zf.a.i((m10.b / 1000) * i23, m10.a);
                } else {
                    znVar = znVar2;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.G0(i23))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.l.G0(i23))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i24 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(qcVarArr, i17);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                zn znVar3 = znVar;
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.e5.v0(znVar3, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new m3(lnVar, message, b2VarArr, messageObject, r5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z21 && m10.a == zf.b.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(znVar3.getParentActivity());
                    e6Var = ((org.telegram.ui.ActionBar.n2) znVar3).resourceProvider;
                    org.telegram.ui.Components.qc G = new xc(a2, e6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                xn xnVar = (xn) this.c;
                xnVar.j((org.telegram.ui.ActionBar.d4) this.d, (TLRPC.WallPaper) this.e, this.b);
                xnVar.g(xnVar.n);
                rm rmVar = xnVar.V.X0;
                if (rmVar == null || (ebVar = rmVar.L) == null) {
                    return;
                }
                ebVar.invalidate();
                return;
            case 14:
                ip ipVar = (ip) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z22 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    ipVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = ipVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
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
                e90 e90Var = ipVar.G;
                if (e90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ipVar.l0;
                    e90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    ipVar.G.c(ipVar.l0, ipVar.Z);
                    return;
                }
                return;
            case 15:
                qp qpVar = (qp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.b;
                s80 s80Var = (s80) this.e;
                chat.join_to_send = z23;
                qpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z23, new ci.y0(qpVar, z23, chat, i15), new qh(i13, qpVar, s80Var));
                return;
            case 16:
                qp qpVar2 = (qp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.b;
                r80 r80Var = (r80) this.e;
                chat2.join_request = z24;
                qpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z24, new pp(qpVar2, i19), new qh(17, qpVar2, r80Var));
                return;
            case 17:
                boolean z25 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z25 && ChatObject.isChannel(chat3)) {
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
                nk nkVar = (nk) this.c;
                String str3 = (String) this.d;
                boolean z26 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                nkVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new zd(i16, nkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    r10 = translitString;
                }
                int i25 = (r10 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i25];
                strArr2[0] = lowerCase;
                if (r10 != null) {
                    strArr2[1] = r10;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z26) {
                    for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                        ik ikVar = (ik) arrayList2.get(i26);
                        File file2 = ikVar.f;
                        if (file2 != null && !file2.isDirectory()) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < i25) {
                                    String str4 = strArr2[i27];
                                    String str5 = ikVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(ikVar);
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new zd(i16, nkVar, arrayList3));
                return;
            case 19:
                p80.t((p80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                wx0 wx0Var = (wx0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z27 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                hy0 hy0Var = wx0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        hy0Var.S = tL_messages_stickerSet;
                        hy0Var.t0();
                        hy0Var.B0();
                    }
                }
                b2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z28 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new oh(i14, editTextBoldCursor2));
                        return;
                    }
                    return;
                }
                if (b2Var2 == null || !b2Var2.isShowing()) {
                    return;
                }
                b2Var2.k(true);
                editTextBoldCursor2.requestFocus();
                if (z28) {
                    AndroidUtilities.runOnUIThread(new oh(i17, editTextBoldCursor2));
                    return;
                }
                return;
            case 22:
                i60 i60Var = (i60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z29 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        i60Var.u1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 23:
                n70 n70Var = (n70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z30 = this.b;
                if (tL_error2 == null) {
                    n70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z30) {
                        if (n70Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        n70Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                n70Var.e = false;
                n70Var.a.l();
                return;
            case 24:
                bn0 bn0Var = (bn0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z31 = this.b;
                pn0 pn0Var = bn0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    pn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    pn0Var.B1(z31);
                    return;
                }
                return;
            case 25:
                bn0 bn0Var2 = (bn0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z32 = this.b;
                pn0 pn0Var2 = bn0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject7;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    pn0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    pn0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        pn0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        pn0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new sl0(bn0Var2, i17));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = pn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        pn0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    pn0Var2.c1 = null;
                    pn0Var2.b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new s4(bn0Var2, passwordsettings, z32, bArr, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                e31.W((e31) this.c, this.b, (org.telegram.ui.ActionBar.d4) this.d, (org.telegram.ui.ActionBar.c5) this.e);
                return;
            default:
                gh1.c0((gh1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
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
