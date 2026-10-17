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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ch;
import org.telegram.ui.ek0;
import org.telegram.ui.en;
import org.telegram.ui.fo0;
import org.telegram.ui.fp;
import org.telegram.ui.gh;
import org.telegram.ui.gp;
import org.telegram.ui.im0;
import org.telegram.ui.km0;
import org.telegram.ui.lm;
import org.telegram.ui.qn;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.w60;
import org.telegram.ui.xe0;
import org.telegram.ui.xf1;
import org.telegram.ui.xm0;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y3(ci.m3 m3Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.a = 2;
        this.d = m3Var;
        this.b = view;
        this.e = i1Var;
        this.c = z10;
    }

    private final void a() {
        byte[] bArr;
        int i10;
        int i11;
        km0 km0Var = (km0) this.d;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.b;
        boolean z10 = this.c;
        byte[] bArr2 = (byte[]) this.e;
        xm0 xm0Var = km0Var.e;
        xm0Var.d1 = passwordsettings.email;
        if (z10) {
            xm0Var.e1 = xm0Var.P0;
        }
        byte[] bArr3 = xm0Var.c1;
        byte[] bArr4 = xm0Var.e1;
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
        if (xm0.Y0(bArr, Long.valueOf(xm0Var.b1)) && bArr2.length != 0 && xm0Var.b1 != 0) {
            if (xm0Var.c != 0) {
                km0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new im0(km0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            xm0Var.N0 = 0;
            xm0Var.Q1();
            return;
        }
        TL_account.authorizationForm authorizationform = xm0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            xm0Var.y.errors.clear();
        }
        byte[] bArr7 = xm0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new xe0(km0Var, km0Var.b, km0Var.d, 13));
        } else {
            km0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        hc hcVar;
        byte[] bArr;
        int i13 = 16;
        int i14 = 4;
        int i15 = 3;
        int i16 = 13;
        r9 = null;
        String str = null;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                k7.k0((k7) this.d, (TLObject) this.b, (TwoStepVerificationActivity) this.e, this.c);
                return;
            case 1:
                x9 x9Var = (x9) this.d;
                int[] iArr = (int[]) this.e;
                TLObject tLObject = (TLObject) this.b;
                boolean z11 = this.c;
                ArrayList arrayList = x9Var.l;
                int i18 = x9Var.a;
                if (iArr[0] != x9Var.m) {
                    return;
                }
                x9Var.i = false;
                x9Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                    if (z11) {
                        arrayList.clear();
                    }
                    arrayList.addAll(tL_payments_savedStarGifts.gifts);
                    x9Var.k = tL_payments_savedStarGifts.next_offset;
                    x9Var.n = tL_payments_savedStarGifts.count;
                    x9Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    x9Var.j = arrayList.size() > x9Var.n || x9Var.k == null;
                } else {
                    x9Var.j = true;
                }
                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(x9Var.b), x9Var);
                return;
            case 2:
                ci.m3 m3Var = (ci.m3) this.d;
                View view = (View) this.b;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z12 = this.c;
                ci.q4 q4Var = m3Var.a;
                org.telegram.ui.Components.f5.Z(q4Var.C2, 1, q4Var.B1, new ci.l3(m3Var, z12, i1Var, view));
                return;
            case 3:
                ei.t1 t1Var = (ei.t1) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                String str2 = (String) this.e;
                boolean z13 = this.c;
                ei.v1 v1Var = t1Var.s;
                if (t1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ei.n2 n2Var = v1Var.r;
                        ArrayList arrayList2 = v1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        t1Var.h = messages_botresults.next_offset;
                        if (z13) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        t1Var.l();
                    }
                    v1Var.d.c(false);
                    t1Var.r = false;
                    return;
                }
                return;
            case 4:
                ei.a8 a8Var = (ei.a8) this.d;
                Bitmap bitmap = (Bitmap) this.b;
                boolean z14 = this.c;
                Runnable runnable = (Runnable) this.e;
                a8Var.getClass();
                try {
                    bitmap.compress(z14 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(a8Var.Z0));
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(a8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 5:
                hg.h0 h0Var = (hg.h0) this.d;
                boolean z15 = this.c;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.b;
                hg.e0 e0Var = (hg.e0) this.e;
                if (z15) {
                    return;
                }
                h0Var.c = e0Var;
                u3Var.setRightText(h0Var.H(e0Var));
                u3Var.setRightTextMargin(6);
                h0Var.I.clear();
                h0Var.d = true;
                h0Var.l();
                h0Var.Q();
                return;
            case 6:
                Context context = (Context) this.d;
                boolean z16 = this.c;
                i2.g0 g0Var = (i2.g0) this.b;
                j2.k kVar = (j2.k) this.e;
                j2.i o10 = j2.i.o(context);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.f fVar = g0Var.s;
                    fVar.getClass();
                    fVar.f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.b;
                boolean z17 = this.c;
                ki.t3 t3Var = (ki.t3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ki.j4.k(n2Var2, z17, new ah.h0(23, t3Var, trim));
                return;
            case 8:
                m4.f0 f0Var = (m4.f0) this.d;
                boolean z18 = this.c;
                m4.v vVar = (m4.v) this.b;
                Runnable runnable2 = (Runnable) this.e;
                m4.i1 i1Var2 = f0Var.g;
                if (z18) {
                    m4.o1 o1Var = new m4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.u t10 = i1Var2.b.t(vVar);
                        if (t10 != null) {
                            i11 = t10.b(m4.f0.B).n;
                        } else if (f0Var.h(vVar)) {
                            v7.q8.b(new m4.s1(0));
                            i11 = 0;
                        } else {
                            v7.q8.b(new m4.s1(-100));
                        }
                        m4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.e(i11, o1Var);
                        }
                    } catch (DeadObjectException unused) {
                        i1Var2.b.E(vVar);
                        v7.q8.b(new m4.s1(-100));
                    } catch (RemoteException e10) {
                        e2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        v7.q8.b(new m4.s1(-1));
                    }
                }
                runnable2.run();
                i1Var2.b.m(vVar);
                return;
            case 9:
                ((CameraController) this.d).lambda$initCamera$3(this.c, (Exception) this.b, (Runnable) this.e);
                return;
            case 10:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.b;
                boolean z19 = this.c;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.h6.g0 = org.telegram.ui.ActionBar.h6.tl.get(org.telegram.ui.ActionBar.h6.g5, -1);
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
                            String str3 = g6Var.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
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
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z19 && org.telegram.ui.ActionBar.h6.M == null) {
                        org.telegram.ui.ActionBar.h6.K = g6Var;
                        if (org.telegram.ui.ActionBar.h6.I != org.telegram.ui.ActionBar.h6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.h6.T = 2000;
                            org.telegram.ui.ActionBar.h6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(21), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.h6.I = g6Var;
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z19, false);
                }
                pVar.run();
                return;
            case 11:
                sn.v0((sn) this.d, (String) this.b, (MessageObject) this.e, this.c);
                return;
            case 12:
                en enVar = (en) this.d;
                TLRPC.Message message = (TLRPC.Message) this.b;
                boolean z20 = this.c;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i20 = R.string.SuggestedMessageAcceptInfo;
                sn snVar = enVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, snVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                int i21 = m10.a == ag.c.b ? snVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : snVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z20) {
                    m10 = ag.a.i((m10.b / 1000) * i21, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), gi.l.H0(i21))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z20) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), h1.p(message.suggested_post.schedule_date), gi.l.H0(i21))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), h1.p(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i22 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.w5 w5Var = new org.telegram.ui.w5(qcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 u02 = org.telegram.ui.Components.f5.u0(snVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new t0(enVar, message, b2VarArr, messageObject, w5Var, 26));
                b2VarArr[0] = u02;
                u02.setOnDismissListener(w5Var);
                if (z20 && m10.a == ag.c.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(snVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.xc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                qn qnVar = (qn) this.d;
                qnVar.l((org.telegram.ui.ActionBar.c4) this.b, (TLRPC.WallPaper) this.e, this.c);
                qnVar.h(qnVar.n);
                lm lmVar = qnVar.V.X0;
                if (lmVar == null || (hcVar = lmVar.L) == null) {
                    return;
                }
                hcVar.invalidate();
                return;
            case 14:
                yo yoVar = (yo) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject3 = (TLObject) this.b;
                boolean z21 = this.c;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    yoVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = yoVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z21) {
                        if (yoVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        yoVar.showDialog(alertDialog$Builder.a);
                    }
                }
                q90 q90Var = yoVar.G;
                if (q90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yoVar.l0;
                    q90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    yoVar.G.c(yoVar.l0, yoVar.Z);
                    return;
                }
                return;
            case 15:
                gp gpVar = (gp) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                boolean z22 = this.c;
                d90 d90Var = (d90) this.e;
                chat.join_to_send = z22;
                gpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z22, new x7(gpVar, z22, chat, 18), new gh(17, gpVar, d90Var));
                return;
            case 16:
                gp gpVar2 = (gp) this.d;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.b;
                boolean z23 = this.c;
                c90 c90Var = (c90) this.e;
                chat2.join_request = z23;
                gpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z23, new fp(gpVar2, i17), new gh(i13, gpVar2, c90Var));
                return;
            case 17:
                boolean z24 = this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.b;
                boolean[] zArr = (boolean[]) this.e;
                if (z24 && ChatObject.isChannel(chat3)) {
                    View d = alertDialog$Builder2.a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
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
                mk mkVar = (mk) this.d;
                String str4 = (String) this.b;
                boolean z25 = this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                mkVar.getClass();
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i16, mkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                int i23 = (str != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i23];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z25) {
                    for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                        hk hkVar = (hk) arrayList3.get(i24);
                        File file = hkVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < i23) {
                                    String str5 = strArr2[i25];
                                    String str6 = hkVar.b;
                                    if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                        arrayList4.add(hkVar);
                                    } else {
                                        i25++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i16, mkVar, arrayList4));
                return;
            case 19:
                a90.v((a90) this.d, (TLRPC.TL_error) this.b, this.c, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                dy0 dy0Var = (dy0) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                boolean z26 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                oy0 oy0Var = dy0Var.a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z26) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        oy0Var.S = tL_messages_stickerSet;
                        oy0Var.u0();
                        oy0Var.C0();
                    }
                }
                b2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.b;
                boolean z27 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z27) {
                        AndroidUtilities.runOnUIThread(new ch(i15, editTextBoldCursor2));
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
                    AndroidUtilities.runOnUIThread(new ch(i14, editTextBoldCursor2));
                    return;
                }
                return;
            case 22:
                s50 s50Var = (s50) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z28 = this.c;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        s50Var.v1(null, tL_chatInviteExported3.link, true, z28);
                        return;
                    }
                }
                return;
            case 23:
                w60 w60Var = (w60) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.b;
                boolean z29 = this.c;
                if (tL_error2 == null) {
                    w60Var.f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z29) {
                        if (w60Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(w60Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        w60Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                w60Var.e = false;
                w60Var.a.l();
                return;
            case 24:
                km0 km0Var = (km0) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                TLObject tLObject7 = (TLObject) this.b;
                boolean z30 = this.c;
                xm0 xm0Var = km0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    xm0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    xm0Var.A1(z30);
                    return;
                }
                return;
            case 25:
                km0 km0Var2 = (km0) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                String str7 = (String) this.e;
                boolean z31 = this.c;
                xm0 xm0Var2 = km0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    xm0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    xm0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        xm0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        xm0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new ek0(km0Var2, 5));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = xm0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        xm0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    xm0Var2.c1 = null;
                    xm0Var2.b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new y3(km0Var2, passwordsettings, z31, bArr, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                fo0 fo0Var = (fo0) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject9 = (TLObject) this.b;
                boolean z32 = this.c;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    fo0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    fo0Var.A0(z32);
                    return;
                }
                return;
            case 28:
                xf1.c0((xf1) this.d, (TLRPC.TL_error) this.e, (TLObject) this.b, this.c);
                return;
            default:
                qg.s0 s0Var = (qg.s0) this.d;
                a5.a aVar = (a5.a) this.b;
                a5.a aVar2 = (a5.a) this.e;
                boolean z33 = this.c;
                s0Var.f.f(new qg.q0(s0Var, aVar, i17));
                s0Var.f.f(new qg.q0(s0Var, aVar2, i17));
                s0Var.E = z33;
                return;
        }
    }

    public /* synthetic */ y3(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = z10;
    }

    public /* synthetic */ y3(Object obj, Object obj2, TLObject tLObject, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = tLObject;
        this.c = z10;
    }

    public /* synthetic */ y3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = z10;
        this.e = obj3;
    }

    public /* synthetic */ y3(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ y3(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 17;
        this.c = z10;
        this.d = chat;
        this.b = alertDialog$Builder;
        this.e = zArr;
    }
}
