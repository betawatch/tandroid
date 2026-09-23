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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f60;
import org.telegram.ui.gp;
import org.telegram.ui.hh;
import org.telegram.ui.in0;
import org.telegram.ui.jl0;
import org.telegram.ui.jn;
import org.telegram.ui.k70;
import org.telegram.ui.kf0;
import org.telegram.ui.np;
import org.telegram.ui.op;
import org.telegram.ui.qm;
import org.telegram.ui.qo0;
import org.telegram.ui.rh;
import org.telegram.ui.sm0;
import org.telegram.ui.um0;
import org.telegram.ui.vn;
import org.telegram.ui.x21;
import org.telegram.ui.xn;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s4(u4 u4Var, View view, zg.p0 p0Var, boolean z10, boolean z11) {
        this.a = 0;
        this.c = u4Var;
        this.d = view;
        this.e = p0Var;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        int i10;
        int i11;
        um0 um0Var = (um0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        in0 in0Var = um0Var.e;
        in0Var.d1 = passwordsettings.email;
        if (z10) {
            in0Var.e1 = in0Var.P0;
        }
        byte[] bArr3 = in0Var.c1;
        byte[] bArr4 = in0Var.e1;
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
        if (in0.Z0(bArr, Long.valueOf(in0Var.b1)) && bArr2.length != 0 && in0Var.b1 != 0) {
            if (in0Var.c != 0) {
                um0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.n2) in0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new sm0(um0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.n2) in0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            in0Var.N0 = 0;
            in0Var.R1();
            return;
        }
        TL_account.authorizationForm authorizationform = in0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            in0Var.y.errors.clear();
        }
        byte[] bArr7 = in0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new kf0(um0Var, um0Var.b, um0Var.d, 12));
        } else {
            um0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var;
        ci.bb bbVar;
        byte[] bArr;
        int i13 = 14;
        int i14 = 13;
        int i15 = 3;
        int i16 = 4;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                u4 u4Var = (u4) this.c;
                View view = (View) this.d;
                zg.p0 p0Var = (zg.p0) this.e;
                boolean z11 = this.b;
                e6 e6Var = u4Var.a;
                org.telegram.ui.Components.e5.a0(e6Var.C2, 1, e6Var.B1, new t4(u4Var, z11, p0Var, view));
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
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z16 = this.b;
                ii.u3 u3Var = (ii.u3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ii.k4.k(n2Var, z16, new ah.b(18, u3Var, trim));
                return;
            case 6:
                m4.a0 a0Var = (m4.a0) this.c;
                boolean z17 = this.b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.b1 b1Var = a0Var.g;
                if (z17) {
                    m4.h1 h1Var = new m4.h1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v x10 = b1Var.b.x(rVar);
                        if (x10 != null) {
                            i11 = x10.b(m4.a0.B).n;
                        } else if (a0Var.h(rVar)) {
                            v7.l8.b(new m4.l1(0));
                            i11 = 0;
                        } else {
                            v7.l8.b(new m4.l1(-100));
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, h1Var);
                        }
                    } catch (DeadObjectException unused) {
                        b1Var.b.M(rVar);
                        v7.l8.b(new m4.l1(-100));
                    } catch (RemoteException e10) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e10);
                        v7.l8.b(new m4.l1(-1));
                    }
                }
                runnable2.run();
                b1Var.b.n(rVar);
                return;
            case 7:
                androidx.activity.n nVar = (androidx.activity.n) this.c;
                m4.s sVar = (m4.s) this.d;
                boolean z18 = this.b;
                m4.r rVar2 = (m4.r) this.e;
                m4.a0 a0Var2 = ((m4.l0) nVar.d).g;
                m4.f1 f1Var = a0Var2.t;
                w7.t.b(f1Var, sVar);
                int d = f1Var.d();
                if (d == 1) {
                    if (f1Var.m0(2)) {
                        f1Var.b();
                    }
                } else if (d == 4 && f1Var.m0(4)) {
                    f1Var.H();
                }
                if (z18 && f1Var.m0(1)) {
                    f1Var.i();
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
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                boolean z19 = this.b;
                org.telegram.ui.ActionBar.q qVar2 = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.h6.g0 = org.telegram.ui.ActionBar.h6.ql.get(org.telegram.ui.ActionBar.h6.g5, -1);
                    int i19 = 16;
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
                                for (int i20 = 0; i20 < split.length; i20++) {
                                    if ("blur".equals(split[i20])) {
                                        g6Var.h = true;
                                    } else if ("motion".equals(split[i20])) {
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
                            AndroidUtilities.runOnUIThread(new f(i19), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.h6.I = g6Var;
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.h6.M == null && !org.telegram.ui.ActionBar.h6.Q) {
                    MessagesController.getInstance(g6Var.E).saveTheme(g6Var, g6Var.k(false), z19, false);
                }
                qVar2.run();
                return;
            case 10:
                xn.U((xn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 11:
                jn jnVar = (jn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z20 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                xn xnVar = jnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, xnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                zf.a m10 = zf.a.m(message.suggested_post.price);
                int i22 = m10.a == zf.b.b ? xnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : xnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z20) {
                    m10 = zf.a.i((m10.b / 1000) * i22, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), ei.l.G0(i22))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z20) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), yh.e0.o(message.suggested_post.schedule_date), ei.l.G0(i22))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), yh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i23 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(qcVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 v02 = org.telegram.ui.Components.e5.v0(xnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new m3(jnVar, message, b2VarArr, messageObject, s5Var, 18));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(s5Var);
                if (z20 && m10.a == zf.b.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(xnVar.getParentActivity());
                    d6Var = ((org.telegram.ui.ActionBar.n2) xnVar).resourceProvider;
                    org.telegram.ui.Components.qc G = new xc(a2, d6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                vn vnVar = (vn) this.c;
                vnVar.j((org.telegram.ui.ActionBar.c4) this.d, (TLRPC.WallPaper) this.e, this.b);
                vnVar.g(vnVar.n);
                qm qmVar = vnVar.V.X0;
                if (qmVar == null || (bbVar = qmVar.L) == null) {
                    return;
                }
                bbVar.invalidate();
                return;
            case 13:
                gp gpVar = (gp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z21 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    gpVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = gpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z21) {
                        if (gpVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gpVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        gpVar.showDialog(alertDialog$Builder.a);
                    }
                }
                w80 w80Var = gpVar.G;
                if (w80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = gpVar.l0;
                    w80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    gpVar.G.c(gpVar.l0, gpVar.Z);
                    return;
                }
                return;
            case 14:
                op opVar = (op) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z22 = this.b;
                k80 k80Var = (k80) this.e;
                chat.join_to_send = z22;
                opVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z22, new ci.y0(opVar, z22, chat, 15), new rh(i13, opVar, k80Var));
                return;
            case 15:
                op opVar2 = (op) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z23 = this.b;
                j80 j80Var = (j80) this.e;
                chat2.join_request = z23;
                opVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z23, new np(opVar2, i17), new rh(i14, opVar2, j80Var));
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
                ok okVar = (ok) this.c;
                String str3 = (String) this.d;
                boolean z25 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                okVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i24 = 9;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ph(i24, okVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    r9 = translitString;
                }
                int i25 = (r9 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i25];
                strArr2[0] = lowerCase;
                if (r9 != null) {
                    strArr2[1] = r9;
                }
                ArrayList arrayList3 = new ArrayList();
                if (!z25) {
                    for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                        jk jkVar = (jk) arrayList2.get(i26);
                        File file = jkVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < i25) {
                                    String str4 = strArr2[i27];
                                    String str5 = jkVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(jkVar);
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ph(i24, okVar, arrayList3));
                return;
            case 18:
                h80.t((h80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
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
                        AndroidUtilities.runOnUIThread(new hh(i15, editTextBoldCursor2));
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
                    AndroidUtilities.runOnUIThread(new hh(i16, editTextBoldCursor2));
                    return;
                }
                return;
            case 21:
                f60 f60Var = (f60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z28 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        f60Var.u1(null, tL_chatInviteExported3.link, true, z28);
                        return;
                    }
                }
                return;
            case 22:
                k70 k70Var = (k70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z29 = this.b;
                if (tL_error2 == null) {
                    k70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z29) {
                        if (k70Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k70Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        k70Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                k70Var.e = false;
                k70Var.a.l();
                return;
            case 23:
                um0 um0Var = (um0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z30 = this.b;
                in0 in0Var = um0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    in0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    in0Var.B1(z30);
                    return;
                }
                return;
            case 24:
                um0 um0Var2 = (um0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z31 = this.b;
                in0 in0Var2 = um0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject7;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    in0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    in0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        in0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        in0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new jl0(um0Var2, i16));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = in0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        in0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    in0Var2.c1 = null;
                    in0Var2.b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new s4(um0Var2, passwordsettings, z31, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                qo0 qo0Var = (qo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z32 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    qo0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    qo0Var.A0(z32);
                    return;
                }
                return;
            case 27:
                x21.W((x21) this.c, this.b, (org.telegram.ui.ActionBar.c4) this.d, (org.telegram.ui.ActionBar.b5) this.e);
                return;
            case 28:
                zg1.c0((zg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            default:
                pg.r0 r0Var = (pg.r0) this.c;
                a5.a aVar = (a5.a) this.d;
                a5.a aVar2 = (a5.a) this.e;
                boolean z33 = this.b;
                r0Var.f.f(new pg.p0(r0Var, aVar, i17));
                r0Var.f.f(new pg.p0(r0Var, aVar2, i17));
                r0Var.E = z33;
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
        this.a = 16;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
