package bi;

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
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao;
import org.telegram.ui.bn0;
import org.telegram.ui.co;
import org.telegram.ui.fh;
import org.telegram.ui.g31;
import org.telegram.ui.hh1;
import org.telegram.ui.j60;
import org.telegram.ui.kh;
import org.telegram.ui.lp;
import org.telegram.ui.n70;
import org.telegram.ui.on;
import org.telegram.ui.pf0;
import org.telegram.ui.pn0;
import org.telegram.ui.rl0;
import org.telegram.ui.sp;
import org.telegram.ui.tp;
import org.telegram.ui.um;
import org.telegram.ui.xo0;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e4(g4 g4Var, View view, ah.j1 j1Var, boolean z10, boolean z11) {
        this.a = 0;
        this.c = g4Var;
        this.d = view;
        this.e = j1Var;
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
            Utilities.globalQueue.postRunnable(new pf0(bn0Var, bn0Var.b, bn0Var.d, 12));
        } else {
            bn0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        di.eb ebVar;
        byte[] bArr;
        int i13 = 20;
        int i14 = 3;
        int i15 = 15;
        int i16 = 4;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                View view = (View) this.d;
                ah.j1 j1Var = (ah.j1) this.e;
                boolean z11 = this.b;
                o5 o5Var = g4Var.a;
                org.telegram.ui.Components.e5.a0(o5Var.C2, 1, o5Var.B1, new f4(g4Var, z11, j1Var, view));
                return;
            case 1:
                di.w1 w1Var = (di.w1) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str = (String) this.e;
                boolean z12 = this.b;
                di.z1 z1Var = w1Var.s;
                if (w1Var.r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        di.t2 t2Var = z1Var.r;
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
                di.o8 o8Var = (di.o8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                Runnable runnable = (Runnable) this.e;
                o8Var.getClass();
                try {
                    bitmap.compress(z13 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(o8Var.Z0));
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    if (z13) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(o8Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                hg.i0 i0Var = (hg.i0) this.c;
                boolean z14 = this.b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                hg.f0 f0Var = (hg.f0) this.e;
                if (z14) {
                    return;
                }
                i0Var.c = f0Var;
                u3Var.setRightText(i0Var.H(f0Var));
                u3Var.setRightTextMargin(6);
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
                ji.s3 s3Var = (ji.s3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ji.j4.k(n2Var, z16, new ah.i0(22, s3Var, trim));
                return;
            case 6:
                m4.a0 a0Var = (m4.a0) this.c;
                boolean z17 = this.b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.f1 f1Var = a0Var.g;
                if (z17) {
                    m4.l1 l1Var = new m4.l1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v y3 = f1Var.b.y(rVar);
                        if (y3 != null) {
                            i11 = y3.b(m4.a0.B).n;
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
                        f1Var.b.N(rVar);
                        v7.l8.b(new m4.p1(-100));
                    } catch (RemoteException e11) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e11);
                        v7.l8.b(new m4.p1(-1));
                    }
                }
                runnable2.run();
                f1Var.b.o(rVar);
                return;
            case 7:
                androidx.activity.o oVar = (androidx.activity.o) this.c;
                m4.s sVar = (m4.s) this.d;
                boolean z18 = this.b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.k0) oVar.d).g;
                m4.j1 j1Var2 = a0Var2.t;
                w7.t.b(j1Var2, sVar);
                int d = j1Var2.d();
                if (d == 1) {
                    if (j1Var2.m0(2)) {
                        j1Var2.b();
                    }
                } else if (d == 4 && j1Var2.m0(4)) {
                    j1Var2.H();
                }
                if (z18 && j1Var2.m0(1)) {
                    j1Var2.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z18) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                a0Var2.p(rVar2);
                return;
            case 8:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                boolean z19 = this.b;
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
                                for (int i19 = 0; i19 < split.length; i19++) {
                                    if ("blur".equals(split[i19])) {
                                        i6Var.h = true;
                                    } else if ("motion".equals(split[i19])) {
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
                    if (!z19 && org.telegram.ui.ActionBar.j6.M == null) {
                        org.telegram.ui.ActionBar.j6.K = i6Var;
                        if (org.telegram.ui.ActionBar.j6.I != org.telegram.ui.ActionBar.j6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.j6.T = 2000;
                            org.telegram.ui.ActionBar.j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(17), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.j6.I = i6Var;
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (org.telegram.ui.ActionBar.j6.M == null && !org.telegram.ui.ActionBar.j6.Q) {
                    MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z19, false);
                }
                qVar2.run();
                return;
            case 10:
                co.U((co) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 11:
                on onVar = (on) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z20 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                co coVar = onVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, coVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                int i21 = m10.a == zf.b.b ? coVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : coVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z20) {
                    m10 = zf.a.i((m10.b / 1000) * i21, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), fi.m.G0(i21))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z20) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), zh.e0.o(message.suggested_post.schedule_date), fi.m.G0(i21))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), zh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i22 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                qc[] qcVarArr = new qc[1];
                org.telegram.ui.r5 r5Var = new org.telegram.ui.r5(qcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.e5.v0(coVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new z2(onVar, message, b2VarArr, messageObject, r5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z20 && m10.a == zf.b.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(coVar.getParentActivity());
                    f6Var = ((org.telegram.ui.ActionBar.n2) coVar).resourceProvider;
                    qc G = new yc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                ao aoVar = (ao) this.c;
                aoVar.j((org.telegram.ui.ActionBar.d4) this.d, (TLRPC.WallPaper) this.e, this.b);
                aoVar.g(aoVar.n);
                um umVar = aoVar.V.X0;
                if (umVar == null || (ebVar = umVar.L) == null) {
                    return;
                }
                ebVar.invalidate();
                return;
            case 13:
                lp lpVar = (lp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z21 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    lpVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = lpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z21) {
                        if (lpVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        lpVar.showDialog(alertDialog$Builder.a);
                    }
                }
                w80 w80Var = lpVar.G;
                if (w80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = lpVar.l0;
                    w80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    lpVar.G.c(lpVar.l0, lpVar.Z);
                    return;
                }
                return;
            case 14:
                tp tpVar = (tp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z22 = this.b;
                j80 j80Var = (j80) this.e;
                chat.join_to_send = z22;
                tpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z22, new di.y0(tpVar, z22, chat, i15), new fh(i13, tpVar, j80Var));
                return;
            case 15:
                tp tpVar2 = (tp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z23 = this.b;
                i80 i80Var = (i80) this.e;
                chat2.join_request = z23;
                tpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z23, new sp(tpVar2, i17), new fh(19, tpVar2, i80Var));
                return;
            case 16:
                boolean z24 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z24 && ChatObject.isChannel(chat3)) {
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
            case 17:
                nk nkVar = (nk) this.c;
                String str3 = (String) this.d;
                boolean z25 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                nkVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new uc(i15, nkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    r9 = translitString;
                }
                int i23 = (r9 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i23];
                strArr2[0] = lowerCase;
                if (r9 != null) {
                    strArr2[1] = r9;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z25) {
                    for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                        ik ikVar = (ik) arrayList2.get(i24);
                        File file = ikVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < i23) {
                                    String str4 = strArr2[i25];
                                    String str5 = ikVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(ikVar);
                                    } else {
                                        i25++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new uc(i15, nkVar, arrayList3));
                return;
            case 18:
                g80.t((g80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                jx0 jx0Var = (jx0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z26 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                ux0 ux0Var = jx0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z26) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        ux0Var.S = tL_messages_stickerSet;
                        ux0Var.t0();
                        ux0Var.B0();
                    }
                }
                b2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z27 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z27) {
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
                if (z27) {
                    AndroidUtilities.runOnUIThread(new kh(i16, editTextBoldCursor2));
                    return;
                }
                return;
            case 21:
                j60 j60Var = (j60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z28 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        j60Var.u1(null, tL_chatInviteExported3.link, true, z28);
                        return;
                    }
                }
                return;
            case 22:
                n70 n70Var = (n70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z29 = this.b;
                if (tL_error2 == null) {
                    n70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z29) {
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
            case 23:
                bn0 bn0Var = (bn0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z30 = this.b;
                pn0 pn0Var = bn0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    pn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    pn0Var.B1(z30);
                    return;
                }
                return;
            case 24:
                bn0 bn0Var2 = (bn0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z31 = this.b;
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
                            AndroidUtilities.runOnUIThread(new rl0(bn0Var2, i16));
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
                AndroidUtilities.runOnUIThread(new e4(bn0Var2, passwordsettings, z31, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                xo0 xo0Var = (xo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z32 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    xo0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    xo0Var.A0(z32);
                    return;
                }
                return;
            case 27:
                g31.W((g31) this.c, this.b, (org.telegram.ui.ActionBar.d4) this.d, (org.telegram.ui.ActionBar.c5) this.e);
                return;
            case 28:
                hh1.c0((hh1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            default:
                qg.q0 q0Var = (qg.q0) this.c;
                a5.a aVar = (a5.a) this.d;
                a5.a aVar2 = (a5.a) this.e;
                boolean z33 = this.b;
                q0Var.f.f(new qg.o0(q0Var, aVar, i17));
                q0Var.f.f(new qg.o0(q0Var, aVar2, i17));
                q0Var.E = z33;
                return;
        }
    }

    public /* synthetic */ e4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ e4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ e4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ e4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 16;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
