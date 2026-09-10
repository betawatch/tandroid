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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an0;
import org.telegram.ui.bo;
import org.telegram.ui.eo;
import org.telegram.ui.j60;
import org.telegram.ui.k31;
import org.telegram.ui.kh;
import org.telegram.ui.m70;
import org.telegram.ui.mh1;
import org.telegram.ui.mp;
import org.telegram.ui.on0;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.qh;
import org.telegram.ui.ql0;
import org.telegram.ui.tp;
import org.telegram.ui.up;
import org.telegram.ui.vm;
import org.telegram.ui.wo0;
import org.telegram.ui.ym0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g2(int i10, Object obj, Object obj2, Object obj3, boolean z10, boolean z11) {
        this.a = i10;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        int i10;
        int i11;
        an0 an0Var = (an0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        on0 on0Var = an0Var.e;
        on0Var.d1 = passwordsettings.email;
        if (z10) {
            on0Var.e1 = on0Var.P0;
        }
        byte[] bArr3 = on0Var.c1;
        byte[] bArr4 = on0Var.e1;
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
        if (on0.Z0(bArr, Long.valueOf(on0Var.b1)) && bArr2.length != 0 && on0Var.b1 != 0) {
            if (on0Var.c != 0) {
                an0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new ym0(an0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.p2) on0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            on0Var.N0 = 0;
            on0Var.R1();
            return;
        }
        TL_account.authorizationForm authorizationform = on0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            on0Var.y.errors.clear();
        }
        byte[] bArr7 = on0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new pf0(an0Var, an0Var.b, an0Var.d, 12));
        } else {
            an0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        nc ncVar;
        byte[] bArr;
        int i13 = 14;
        int i14 = 16;
        int i15 = 3;
        int i16 = 4;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str = (String) this.e;
                boolean z11 = this.b;
                k2 k2Var = h2Var.s;
                if (h2Var.r) {
                    if (tLObject instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        f3 f3Var = k2Var.r;
                        ArrayList arrayList = k2Var.n;
                        i10 = ((org.telegram.ui.ActionBar.h3) f3Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str, messages_botresults);
                        h2Var.h = messages_botresults.next_offset;
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        h2Var.l();
                    }
                    k2Var.d.c(false);
                    h2Var.r = false;
                    return;
                }
                return;
            case 1:
                r9 r9Var = (r9) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z12 = this.b;
                Runnable runnable = (Runnable) this.e;
                r9Var.getClass();
                try {
                    bitmap.compress(z12 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(r9Var.Z0));
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z12) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(r9Var.Z0));
                        } catch (Exception e7) {
                            FileLog.e((Throwable) e7, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 2:
                fg.h0 h0Var = (fg.h0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
                fg.e0 e0Var = (fg.e0) this.e;
                if (z13) {
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
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                boolean z14 = this.b;
                hi.w3 w3Var = (hi.w3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                hi.m4.k(p2Var, z14, new cb(i13, w3Var, trim));
                return;
            case 4:
                Context context = (Context) this.c;
                boolean z15 = this.b;
                i2.e0 e0Var2 = (i2.e0) this.d;
                j2.k kVar = (j2.k) this.e;
                j2.i o9 = j2.i.o(context);
                if (o9 == null) {
                    e2.a.n("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z15) {
                    j2.e eVar = e0Var2.s;
                    eVar.getClass();
                    eVar.f.a(o9);
                }
                LogSessionId q6 = o9.q();
                synchronized (kVar) {
                    j2.j jVar = kVar.b;
                    jVar.getClass();
                    jVar.f(q6);
                }
                return;
            case 5:
                m4.b0 b0Var = (m4.b0) this.c;
                boolean z16 = this.b;
                m4.r rVar = (m4.r) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.h1 h1Var = b0Var.g;
                if (z16) {
                    m4.n1 n1Var = new m4.n1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.v w10 = h1Var.b.w(rVar);
                        if (w10 != null) {
                            i11 = w10.b(m4.b0.B).n;
                        } else if (b0Var.h(rVar)) {
                            v7.o8.b(new m4.r1(0));
                            i11 = 0;
                        } else {
                            v7.o8.b(new m4.r1(-100));
                        }
                        m4.q qVar = rVar.d;
                        if (qVar != null) {
                            qVar.d(i11, n1Var);
                        }
                    } catch (DeadObjectException unused) {
                        h1Var.b.K(rVar);
                        v7.o8.b(new m4.r1(-100));
                    } catch (RemoteException e10) {
                        e2.a.o("MediaSessionImpl", "Exception in " + rVar, e10);
                        v7.o8.b(new m4.r1(-1));
                    }
                }
                runnable2.run();
                h1Var.b.n(rVar);
                return;
            case 6:
                androidx.activity.o oVar = (androidx.activity.o) this.c;
                m4.s sVar = (m4.s) this.d;
                boolean z17 = this.b;
                m4.r rVar2 = (m4.r) this.e;
                m4.b0 b0Var2 = ((m4.l0) oVar.d).g;
                m4.l1 l1Var = b0Var2.t;
                w7.u.b(l1Var, sVar);
                int d = l1Var.d();
                if (d == 1) {
                    if (l1Var.m0(2)) {
                        l1Var.b();
                    }
                } else if (d == 4 && l1Var.m0(4)) {
                    l1Var.H();
                }
                if (z17 && l1Var.m0(1)) {
                    l1Var.i();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i18 : new int[]{31, 2}) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(i18, true);
                }
                if (z17) {
                    e2.d.g(!false);
                    sparseBooleanArray.append(1, true);
                }
                e2.d.g(!false);
                b0Var2.p(rVar2);
                return;
            case 7:
                og.v0 v0Var = (og.v0) this.c;
                a5.a aVar = (a5.a) this.d;
                a5.a aVar2 = (a5.a) this.e;
                boolean z18 = this.b;
                int i19 = 0;
                v0Var.f.f(new og.s0(v0Var, aVar, i19));
                v0Var.f.f(new og.s0(v0Var, aVar2, i19));
                v0Var.E = z18;
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
                                for (int i20 = 0; i20 < split.length; i20++) {
                                    if ("blur".equals(split[i20])) {
                                        i6Var.h = true;
                                    } else if ("motion".equals(split[i20])) {
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
                            AndroidUtilities.runOnUIThread(new f0(11), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.j6.I = i6Var;
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.j6.M == null && !org.telegram.ui.ActionBar.j6.Q) {
                    MessagesController.getInstance(i6Var.E).saveTheme(i6Var, i6Var.k(false), z19, false);
                }
                qVar2.run();
                return;
            case 10:
                eo.U((eo) this.c, (String) this.e, (MessageObject) this.d, this.b);
                return;
            case 11:
                pn pnVar = (pn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z20 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                eo eoVar = pnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, eoVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                yf.a m10 = yf.a.m(message.suggested_post.price);
                int i22 = m10.a == yf.b.b ? eoVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : eoVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z20) {
                    m10 = yf.a.i((m10.b / 1000) * i22, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z20) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), di.m.G0(i22))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z20) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), xh.e0.o(message.suggested_post.schedule_date), di.m.G0(i22))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), xh.e0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i23 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.pc[] pcVarArr = new org.telegram.ui.Components.pc[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(pcVarArr, 4);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                org.telegram.ui.ActionBar.d2 v02 = org.telegram.ui.Components.d5.v0(eoVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new ya(pnVar, message, d2VarArr, messageObject, s5Var, 14));
                d2VarArr[0] = v02;
                v02.setOnDismissListener(s5Var);
                if (z20 && m10.a == yf.b.a) {
                    org.telegram.ui.Components.jb a2 = org.telegram.ui.Components.kb.a(eoVar.getParentActivity());
                    f6Var = ((org.telegram.ui.ActionBar.p2) eoVar).resourceProvider;
                    org.telegram.ui.Components.pc G = new org.telegram.ui.Components.wc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    pcVarArr[0] = G;
                    return;
                }
                return;
            case 12:
                bo boVar = (bo) this.c;
                boVar.j((org.telegram.ui.ActionBar.f4) this.d, (TLRPC.WallPaper) this.e, this.b);
                boVar.g(boVar.n);
                vm vmVar = boVar.V.X0;
                if (vmVar == null || (ncVar = vmVar.L) == null) {
                    return;
                }
                ncVar.invalidate();
                return;
            case 13:
                mp mpVar = (mp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                boolean z21 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    mpVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = mpVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z21) {
                        if (mpVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        mpVar.showDialog(alertDialog$Builder.a);
                    }
                }
                f90 f90Var = mpVar.G;
                if (f90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mpVar.l0;
                    f90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    mpVar.G.c(mpVar.l0, mpVar.Z);
                    return;
                }
                return;
            case 14:
                up upVar = (up) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z22 = this.b;
                t80 t80Var = (t80) this.e;
                chat.join_to_send = z22;
                upVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z22, new c1(upVar, z22, chat, 15), new qh(17, upVar, t80Var));
                return;
            case 15:
                up upVar2 = (up) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z23 = this.b;
                s80 s80Var = (s80) this.e;
                chat2.join_request = z23;
                upVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z23, new tp(upVar2, i17), new qh(i14, upVar2, s80Var));
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
                sk skVar = (sk) this.c;
                String str3 = (String) this.e;
                boolean z25 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                skVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i24 = 12;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i24, skVar, new ArrayList()));
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
                        nk nkVar = (nk) arrayList2.get(i26);
                        File file = nkVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < i25) {
                                    String str4 = strArr2[i27];
                                    String str5 = nkVar.b;
                                    if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                        arrayList3.add(nkVar);
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i24, skVar, arrayList3));
                return;
            case 18:
                q80.t((q80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 19:
                wx0 wx0Var = (wx0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z26 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                hy0 hy0Var = wx0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z26) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        hy0Var.S = tL_messages_stickerSet;
                        hy0Var.t0();
                        hy0Var.B0();
                    }
                }
                d2Var.dismiss();
                return;
            case 20:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z27 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                if (h3Var != null && !h3Var.isDismissed()) {
                    h3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z27) {
                        AndroidUtilities.runOnUIThread(new kh(i15, editTextBoldCursor2));
                        return;
                    }
                    return;
                }
                if (d2Var2 == null || !d2Var2.isShowing()) {
                    return;
                }
                d2Var2.k(true);
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
                m70 m70Var = (m70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                boolean z29 = this.b;
                if (tL_error2 == null) {
                    m70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z29) {
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
            case 23:
                an0 an0Var = (an0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z30 = this.b;
                on0 on0Var = an0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    on0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    on0Var.B1(z30);
                    return;
                }
                return;
            case 24:
                an0 an0Var2 = (an0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z31 = this.b;
                on0 on0Var2 = an0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject7;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    on0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    on0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        on0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str6), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr2 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        on0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr = bArr2;
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new ql0(an0Var2, i16));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = on0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        on0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr3;
                    } else {
                        bArr = new byte[0];
                    }
                    on0Var2.c1 = null;
                    on0Var2.b1 = 0L;
                }
                AndroidUtilities.runOnUIThread(new g2(an0Var2, passwordsettings, z31, bArr, 25));
                return;
            case 25:
                a();
                return;
            case 26:
                wo0 wo0Var = (wo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject8 = (TLObject) this.d;
                boolean z32 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    wo0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    wo0Var.A0(z32);
                    return;
                }
                return;
            case 27:
                k31.W((k31) this.c, this.b, (org.telegram.ui.ActionBar.f4) this.d, (org.telegram.ui.ActionBar.e5) this.e);
                return;
            case 28:
                mh1.c0((mh1) this.c, (TLRPC.TL_error) this.e, (TLObject) this.d, this.b);
                return;
            default:
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.c;
                boolean z33 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.e;
                int i28 = R.raw.star_premium_2;
                org.telegram.ui.Components.pc M = wcVar.M(z33 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z33 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), org.telegram.ui.ActionBar.j6.Gi, 0, new sg.c(chat4), f6Var2), i28);
                M.j = 5000;
                M.j();
                return;
        }
    }

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ g2(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ g2(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ g2(sk skVar, String str, boolean z10, ArrayList arrayList) {
        this.a = 17;
        this.c = skVar;
        this.e = str;
        this.b = z10;
        this.d = arrayList;
    }

    public /* synthetic */ g2(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 16;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
