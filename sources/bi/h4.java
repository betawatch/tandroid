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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.cn0;
import org.telegram.ui.co;
import org.telegram.ui.en0;
import org.telegram.ui.fo;
import org.telegram.ui.jd;
import org.telegram.ui.l31;
import org.telegram.ui.n60;
import org.telegram.ui.np;
import org.telegram.ui.oh;
import org.telegram.ui.oh1;
import org.telegram.ui.qn;
import org.telegram.ui.s70;
import org.telegram.ui.sn0;
import org.telegram.ui.tf0;
import org.telegram.ui.up;
import org.telegram.ui.vp;
import org.telegram.ui.wp;
import org.telegram.ui.xk0;
import org.telegram.ui.xm;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h4(j4 j4Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.a = 0;
        this.c = j4Var;
        this.d = view;
        this.e = i1Var;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        int i10;
        int i11;
        en0 en0Var = (en0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        sn0 sn0Var = en0Var.e;
        sn0Var.d1 = passwordsettings.email;
        if (z10) {
            sn0Var.e1 = sn0Var.P0;
        }
        byte[] bArr3 = sn0Var.c1;
        byte[] bArr4 = sn0Var.e1;
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
        if (sn0.Y0(bArr, Long.valueOf(sn0Var.b1)) && bArr2.length != 0 && sn0Var.b1 != 0) {
            if (sn0Var.c != 0) {
                en0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new cn0(en0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.m2) sn0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            sn0Var.N0 = 0;
            sn0Var.Q1();
            return;
        }
        TL_account.authorizationForm authorizationform = sn0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            sn0Var.y.errors.clear();
        }
        byte[] bArr7 = sn0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new tf0(en0Var, en0Var.b, en0Var.d, 12));
        } else {
            en0Var.b();
        }
    }

    private final void b() {
        qg.q0 q0Var = (qg.q0) this.c;
        a5.a aVar = (a5.a) this.d;
        a5.a aVar2 = (a5.a) this.e;
        q0Var.f.f(new qg.o0(q0Var, aVar, 0));
        q0Var.f.f(new qg.o0(q0Var, aVar2, 0));
        q0Var.E = this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        di.ab abVar;
        byte[] bArr;
        ri.r0 r0Var;
        File file;
        int i13 = 27;
        int i14 = 4;
        int i15 = 3;
        int i16 = 2;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.c;
                View view = (View) this.d;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z10 = this.b;
                q5 q5Var = j4Var.a;
                org.telegram.ui.Components.g5.Z(q5Var.C2, 1, q5Var.B1, new i4(j4Var, z10, i1Var, view));
                return;
            case 1:
                di.v1 v1Var = (di.v1) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str = (String) this.e;
                boolean z11 = this.b;
                di.y1 y1Var = v1Var.s;
                if (v1Var.r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        di.r2 r2Var = y1Var.r;
                        ArrayList arrayList = y1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.e3) r2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str, messages_botresults);
                        v1Var.h = messages_botresults.next_offset;
                        if (z11) {
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
                di.k8 k8Var = (di.k8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.e;
                k8Var.getClass();
                try {
                    bitmap.compress(z12 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(k8Var.Z0));
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z12) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(k8Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 3:
                hg.h0 h0Var = (hg.h0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.d;
                hg.e0 e0Var = (hg.e0) this.e;
                if (z13) {
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
                boolean z14 = this.b;
                i2.h0 h0Var2 = (i2.h0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o10 = j2.i.o(context);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z14) {
                    j2.f fVar = h0Var2.s;
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
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.d;
                boolean z15 = this.b;
                ji.u3 u3Var = (ji.u3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ji.l4.k(m2Var, z15, new ah.h0(22, u3Var, trim));
                return;
            case 6:
                m4.e0 e0Var2 = (m4.e0) this.c;
                boolean z16 = this.b;
                m4.v vVar = (m4.v) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.i1 i1Var2 = e0Var2.g;
                if (z16) {
                    m4.o1 o1Var = new m4.o1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v q10 = i1Var2.b.q(vVar);
                        if (q10 != null) {
                            i11 = q10.b(m4.e0.B).n;
                        } else if (e0Var2.h(vVar)) {
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
                        i1Var2.b.C(vVar);
                        v7.q8.b(new m4.s1(-100));
                    } catch (RemoteException e10) {
                        e2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
                        v7.q8.b(new m4.s1(-1));
                    }
                }
                runnable2.run();
                i1Var2.b.j(vVar);
                return;
            case 7:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 8:
                String[] strArr = (String[]) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.g6.g0 = org.telegram.ui.ActionBar.g6.tl.get(org.telegram.ui.ActionBar.g6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (f6Var.c != null) {
                                new File(f6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        f6Var.c = null;
                        org.telegram.ui.ActionBar.g6.h0 = null;
                    } else {
                        org.telegram.ui.ActionBar.g6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.g6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str2 = f6Var.c;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(f6Var.c).delete();
                            }
                        } catch (Exception unused3) {
                        }
                        f6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(org.telegram.ui.ActionBar.g6.h0);
                            f6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i17 = 0; i17 < split.length; i17++) {
                                    if ("blur".equals(split[i17])) {
                                        f6Var.h = true;
                                    } else if ("motion".equals(split[i17])) {
                                        f6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            f6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    f6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        f6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        f6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        f6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    f6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z17 && org.telegram.ui.ActionBar.g6.M == null) {
                        org.telegram.ui.ActionBar.g6.K = f6Var;
                        if (org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J) {
                            org.telegram.ui.ActionBar.g6.T = 2000;
                            org.telegram.ui.ActionBar.g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(17), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.g6.I = f6Var;
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.g6.M == null && !org.telegram.ui.ActionBar.g6.Q) {
                    MessagesController.getInstance(f6Var.E).saveTheme(f6Var, f6Var.k(false), z17, false);
                }
                pVar.run();
                return;
            case 9:
                fo.v0((fo) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 10:
                qn qnVar = (qn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z18 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i18 = R.string.SuggestedMessageAcceptInfo;
                fo foVar = qnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i18, foVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                int i19 = m10.a == ag.b.b ? foVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : foVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z18) {
                    m10 = ag.a.i((m10.b / 1000) * i19, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z18) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), fi.l.H0(i19))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z18) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), zh.d0.q(message.suggested_post.schedule_date), fi.l.H0(i19))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), zh.d0.q(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i20 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i20, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                sc[] scVarArr = new sc[1];
                org.telegram.ui.v5 v5Var = new org.telegram.ui.v5(scVarArr, i14);
                org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
                org.telegram.ui.ActionBar.a2 u02 = org.telegram.ui.Components.g5.u0(foVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new c3(qnVar, message, a2VarArr, messageObject, v5Var, 18));
                a2VarArr[0] = u02;
                u02.setOnDismissListener(v5Var);
                if (z18 && m10.a == ag.b.a) {
                    org.telegram.ui.Components.mb a2 = org.telegram.ui.Components.nb.a(foVar.getParentActivity());
                    c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                    sc G = new zc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    scVarArr[0] = G;
                    return;
                }
                return;
            case 11:
                co coVar = (co) this.c;
                coVar.j((org.telegram.ui.ActionBar.b4) this.d, (TLRPC.WallPaper) this.e, this.b);
                coVar.g(coVar.n);
                xm xmVar = coVar.V.X0;
                if (xmVar == null || (abVar = xmVar.L) == null) {
                    return;
                }
                abVar.invalidate();
                return;
            case 12:
                np npVar = (np) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    npVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = npVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z19) {
                        if (npVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        npVar.showDialog(alertDialog$Builder.a);
                    }
                }
                w90 w90Var = npVar.G;
                if (w90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = npVar.l0;
                    w90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    npVar.G.c(npVar.l0, npVar.Z);
                    return;
                }
                return;
            case 13:
                wp wpVar = (wp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z20 = this.b;
                j90 j90Var = (j90) this.e;
                chat.join_to_send = z20;
                wpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z20, new di.x0(wpVar, z20, chat, 15), new jd(28, wpVar, j90Var));
                return;
            case 14:
                wp wpVar2 = (wp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z21 = this.b;
                i90 i90Var = (i90) this.e;
                chat2.join_request = z21;
                wpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z21, new up(wpVar2, 0), new jd(i13, wpVar2, i90Var));
                return;
            case 15:
                boolean z22 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z22 && ChatObject.isChannel(chat3)) {
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
            case 16:
                ok okVar = (ok) this.c;
                String str3 = (String) this.d;
                boolean z23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                okVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i21 = 24;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new vp(i21, okVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    r10 = translitString;
                }
                int i22 = (r10 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i22];
                strArr2[0] = lowerCase;
                if (r10 != null) {
                    strArr2[1] = r10;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z23) {
                    for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                        jk jkVar = (jk) arrayList2.get(i23);
                        File file2 = jkVar.f;
                        if (file2 != null && !file2.isDirectory()) {
                            int i24 = 0;
                            while (true) {
                                if (i24 < i22) {
                                    String str4 = strArr2[i24];
                                    String str5 = jkVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(jkVar);
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new vp(i21, okVar, arrayList3));
                return;
            case 17:
                f90.v((f90) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 18:
                jy0 jy0Var = (jy0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z24 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                uy0 uy0Var = jy0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z24) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        uy0Var.S = tL_messages_stickerSet;
                        uy0Var.u0();
                        uy0Var.C0();
                    }
                }
                a2Var.dismiss();
                return;
            case 19:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z25 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.e;
                if (e3Var != null && !e3Var.isDismissed()) {
                    e3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z25) {
                        AndroidUtilities.runOnUIThread(new oh(i15, editTextBoldCursor2));
                        return;
                    }
                    return;
                }
                if (a2Var2 == null || !a2Var2.isShowing()) {
                    return;
                }
                a2Var2.k(true);
                editTextBoldCursor2.requestFocus();
                if (z25) {
                    AndroidUtilities.runOnUIThread(new oh(i14, editTextBoldCursor2));
                    return;
                }
                return;
            case 20:
                n60 n60Var = (n60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z26 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        n60Var.v1(null, tL_chatInviteExported3.link, true, z26);
                        return;
                    }
                }
                return;
            case 21:
                s70 s70Var = (s70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z27 = this.b;
                if (tL_error2 == null) {
                    s70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z27) {
                        if (s70Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s70Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        s70Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                s70Var.e = false;
                s70Var.a.l();
                return;
            case 22:
                en0 en0Var = (en0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z28 = this.b;
                sn0 sn0Var = en0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    sn0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    sn0Var.A1(z28);
                    return;
                }
                return;
            case 23:
                en0 en0Var2 = (en0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z29 = this.b;
                sn0 sn0Var2 = en0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject7;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    sn0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    sn0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        sn0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        sn0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new xk0(en0Var2, 5));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = sn0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        sn0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    sn0Var2.c1 = null;
                    sn0Var2.b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new h4(en0Var2, passwordsettings, z29, bArr, 24));
                return;
            case 24:
                a();
                return;
            case 25:
                ap0 ap0Var = (ap0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z30 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    ap0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    ap0Var.A0(z30);
                    return;
                }
                return;
            case 26:
                l31.V((l31) this.c, this.b, (org.telegram.ui.ActionBar.b4) this.d, (org.telegram.ui.ActionBar.a5) this.e);
                return;
            case 27:
                oh1.c0((oh1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            case 28:
                b();
                return;
            default:
                ri.r0 r0Var2 = (ri.r0) this.c;
                ri.v vVar2 = (ri.v) this.d;
                boolean z31 = this.b;
                ri.n0 n0Var = (ri.n0) this.e;
                long nanoTime = System.nanoTime();
                try {
                    vVar2.g();
                    File file3 = vVar2.a;
                    long e12 = w7.m7.e(file3) / 1000;
                    ri.n nVar = r0Var2.m;
                    StringBuilder sb2 = new StringBuilder("active output finalized: size=");
                    sb2.append(file3.length());
                    sb2.append(", durationMs=");
                    sb2.append(e12);
                    sb2.append(", elapsedMs=");
                    sb2.append(ri.r0.f(nanoTime));
                    nVar.b(sb2.toString());
                    r0Var2.g();
                    long j10 = r0Var2.o;
                    boolean z32 = e12 > j10;
                    try {
                        if (z31 && !z32) {
                            r0Var2.k.execute(new ri.e0(r0Var2, n0Var, vVar2.a, e12, true));
                            return;
                        }
                        File file4 = vVar2.a;
                        try {
                            try {
                                r0Var2.s(file4, 0L, Math.min(j10, e12), z31, z32 ? 1 : 2);
                                w7.m7.c(file4);
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                file = file4;
                                w7.m7.c(file);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            file = file4;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        r0Var = sb2;
                        r0Var.i.post(new ri.c0(r0Var, e, i16));
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
                    r0Var = r0Var2;
                }
        }
    }

    public /* synthetic */ h4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ h4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ h4(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ h4(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 15;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
