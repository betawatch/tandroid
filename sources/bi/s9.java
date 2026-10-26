package bi;

import a8.ng;
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
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap;
import org.telegram.ui.dg1;
import org.telegram.ui.fn;
import org.telegram.ui.hh;
import org.telegram.ui.hp;
import org.telegram.ui.in0;
import org.telegram.ui.ip;
import org.telegram.ui.jp;
import org.telegram.ui.lj0;
import org.telegram.ui.mm;
import org.telegram.ui.oe0;
import org.telegram.ui.po0;
import org.telegram.ui.sm0;
import org.telegram.ui.sn;
import org.telegram.ui.um0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.z60;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s9(di.l3 l3Var, View view, bh.x0 x0Var, boolean z10, boolean z11) {
        this.a = 1;
        this.c = l3Var;
        this.d = view;
        this.e = x0Var;
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
            i11 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new sm0(um0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            in0Var.N0 = 0;
            in0Var.S1();
            return;
        }
        TL_account.authorizationForm authorizationform = in0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            in0Var.y.errors.clear();
        }
        byte[] bArr7 = in0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new oe0(um0Var, um0Var.b, um0Var.d, 15));
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
        org.telegram.ui.ActionBar.u6 u6Var;
        cc ccVar;
        byte[] bArr;
        byte[] bArr2;
        int i13 = 27;
        int i14 = 4;
        int i15 = 3;
        int i16 = 23;
        int i17 = 6;
        r9 = null;
        String str = null;
        boolean z10 = true;
        int i18 = 0;
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z11 = this.b;
                ArrayList arrayList = t9Var.l;
                int i19 = t9Var.a;
                if (iArr[0] != t9Var.m) {
                    return;
                }
                t9Var.i = false;
                t9Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                    if (z11) {
                        arrayList.clear();
                    }
                    arrayList.addAll(tL_payments_savedStarGifts.gifts);
                    t9Var.k = tL_payments_savedStarGifts.next_offset;
                    t9Var.n = tL_payments_savedStarGifts.count;
                    t9Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    t9Var.j = arrayList.size() > t9Var.n || t9Var.k == null;
                } else {
                    t9Var.j = true;
                }
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(t9Var.b), t9Var);
                return;
            case 1:
                di.l3 l3Var = (di.l3) this.c;
                View view = (View) this.d;
                bh.x0 x0Var = (bh.x0) this.e;
                boolean z12 = this.b;
                di.q4 q4Var = l3Var.a;
                org.telegram.ui.Components.g5.Z(q4Var.r2, 1, q4Var.q1, new di.k3(l3Var, z12, x0Var, view));
                return;
            case 2:
                fi.s1 s1Var = (fi.s1) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                String str2 = (String) this.d;
                boolean z13 = this.b;
                fi.u1 u1Var = s1Var.s;
                if (s1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        fi.l2 l2Var = u1Var.r;
                        ArrayList arrayList2 = u1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.k3) l2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        s1Var.h = messages_botresults.next_offset;
                        if (z13) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        s1Var.l();
                    }
                    u1Var.d.c(false);
                    s1Var.r = false;
                    return;
                }
                return;
            case 3:
                fi.w7 w7Var = (fi.w7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.b;
                Runnable runnable = (Runnable) this.e;
                w7Var.getClass();
                try {
                    bitmap.compress(z14 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(w7Var.Z0));
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                    if (z14) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(w7Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 4:
                Context context = (Context) this.c;
                boolean z15 = this.b;
                i2.j0 j0Var = (i2.j0) this.d;
                j2.j jVar = (j2.j) this.e;
                j2.h o10 = j2.h.o(context);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z15) {
                    j2.e eVar = j0Var.s;
                    eVar.getClass();
                    eVar.f.a(o10);
                }
                LogSessionId q5 = o10.q();
                synchronized (jVar) {
                    j2.i iVar = jVar.b;
                    iVar.getClass();
                    iVar.f(q5);
                }
                return;
            case 5:
                ig.i0 i0Var = (ig.i0) this.c;
                boolean z16 = this.b;
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) this.d;
                ig.f0 f0Var = (ig.f0) this.e;
                if (z16) {
                    return;
                }
                i0Var.c = f0Var;
                z3Var.setRightText(i0Var.H(f0Var));
                z3Var.setRightTextMargin(6);
                i0Var.I.clear();
                i0Var.d = true;
                i0Var.l();
                i0Var.P();
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.d;
                boolean z17 = this.b;
                li.s3 s3Var = (li.s3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                li.j4.k(r2Var, z17, new ai.f0(26, s3Var, trim));
                return;
            case 7:
                m4.f0 f0Var2 = (m4.f0) this.c;
                boolean z18 = this.b;
                m4.w wVar = (m4.w) this.d;
                Runnable runnable2 = (Runnable) this.e;
                m4.j1 j1Var = f0Var2.g;
                if (z18) {
                    m4.p1 p1Var = new m4.p1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.u p10 = j1Var.b.p(wVar);
                        if (p10 != null) {
                            i11 = p10.b(m4.f0.B).n;
                        } else if (f0Var2.h(wVar)) {
                            a8.qd.b(new m4.t1(0));
                            i11 = 0;
                        } else {
                            a8.qd.b(new m4.t1(-100));
                        }
                        m4.v vVar = wVar.d;
                        if (vVar != null) {
                            vVar.e(i11, p1Var);
                        }
                    } catch (DeadObjectException unused) {
                        j1Var.b.B(wVar);
                        a8.qd.b(new m4.t1(-100));
                    } catch (RemoteException e11) {
                        e2.a.m("MediaSessionImpl", "Exception in " + wVar, e11);
                        a8.qd.b(new m4.t1(-1));
                    }
                }
                runnable2.run();
                j1Var.b.i(wVar);
                return;
            case 8:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.c;
                org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) this.d;
                boolean z19 = this.b;
                org.telegram.ui.ActionBar.q qVar = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    org.telegram.ui.ActionBar.y6.g0 = org.telegram.ui.ActionBar.y6.tl.get(org.telegram.ui.ActionBar.y6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (x6Var.c != null) {
                                new File(x6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        x6Var.c = null;
                        org.telegram.ui.ActionBar.y6.h0 = null;
                    } else {
                        org.telegram.ui.ActionBar.y6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.y6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = x6Var.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(x6Var.c).delete();
                            }
                        } catch (Exception unused3) {
                        }
                        x6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(org.telegram.ui.ActionBar.y6.h0);
                            x6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i20 = 0; i20 < split.length; i20++) {
                                    if ("blur".equals(split[i20])) {
                                        x6Var.h = true;
                                    } else if ("motion".equals(split[i20])) {
                                        x6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            x6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    x6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        x6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        x6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        x6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    x6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z19 && org.telegram.ui.ActionBar.y6.M == null) {
                        org.telegram.ui.ActionBar.y6.K = x6Var;
                        if (org.telegram.ui.ActionBar.y6.I != org.telegram.ui.ActionBar.y6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.y6.T = 2000;
                            org.telegram.ui.ActionBar.y6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ag.c(i16), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.y6.I = x6Var;
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (org.telegram.ui.ActionBar.y6.M == null && !org.telegram.ui.ActionBar.y6.Q) {
                    MessagesController.getInstance(x6Var.E).saveTheme(x6Var, x6Var.k(false), z19, false);
                }
                qVar.run();
                return;
            case 10:
                un.w1((un) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 11:
                un unVar = (un) this.c;
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) this.d;
                org.telegram.ui.ActionBar.x6 x6Var2 = (org.telegram.ui.ActionBar.x6) this.e;
                boolean z20 = this.b;
                if (w6Var == null) {
                    UndoView undoView = unVar.K3;
                    org.telegram.ui.ActionBar.y6.H1(x6Var2, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                unVar.getClass();
                org.telegram.ui.ActionBar.w6 k10 = x6Var2.k(false);
                int i21 = w6Var.a;
                UndoView undoView2 = unVar.K3;
                org.telegram.ui.ActionBar.y6.H1(x6Var2, false, i21, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z20) {
                    org.telegram.ui.ActionBar.y6.k0(x6Var2, k10, true);
                    return;
                }
                return;
            case 12:
                fn fnVar = (fn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i22 = R.string.SuggestedMessageAcceptInfo;
                un unVar2 = fnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i22, unVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                bg.a m10 = bg.a.m(message.suggested_post.price);
                int i23 = m10.a == bg.b.b ? unVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : unVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z21) {
                    m10 = bg.a.i((m10.b / 1000) * i23, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), hi.k.F0(i23))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), g1.o(message.suggested_post.schedule_date), hi.k.F0(i23))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), g1.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i24 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.r2) unVar2).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.u5 u5Var = new org.telegram.ui.u5(qcVarArr, 4);
                org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
                org.telegram.ui.ActionBar.e2 u02 = org.telegram.ui.Components.g5.u0(unVar2, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new u0(fnVar, message, e2VarArr, messageObject, u5Var, 26));
                e2VarArr[0] = u02;
                u02.setOnDismissListener(u5Var);
                if (z21 && m10.a == bg.b.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(unVar2.getParentActivity());
                    u6Var = ((org.telegram.ui.ActionBar.r2) unVar2).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.wc(a2, u6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                sn snVar = (sn) this.c;
                snVar.r((org.telegram.ui.ActionBar.h4) this.d, (TLRPC.WallPaper) this.e, this.b);
                snVar.o(snVar.h);
                mm mmVar = snVar.F.j1;
                if (mmVar == null || (ccVar = mmVar.L) == null) {
                    return;
                }
                ccVar.invalidate();
                return;
            case 14:
                ap apVar = (ap) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z22 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    apVar.l0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = apVar.Y;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
                        if (apVar.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(apVar.getParentActivity());
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        apVar.showDialog(alertDialog$Builder.a);
                    }
                }
                r90 r90Var = apVar.G;
                if (r90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = apVar.l0;
                    r90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    apVar.G.c(apVar.l0, apVar.Z);
                    return;
                }
                return;
            case 15:
                jp jpVar = (jp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.b;
                f90 f90Var = (f90) this.e;
                chat.join_to_send = z23;
                jpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z23, new u7(jpVar, z23, chat, 17), new org.telegram.ui.ed(28, jpVar, f90Var));
                return;
            case 16:
                jp jpVar2 = (jp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.b;
                e90 e90Var = (e90) this.e;
                chat2.join_request = z24;
                jpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z24, new hp(jpVar2, i18), new org.telegram.ui.ed(i13, jpVar2, e90Var));
                return;
            case 17:
                boolean z25 = this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z25 && ChatObject.isChannel(chat3)) {
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
                mk mkVar = (mk) this.c;
                String str4 = (String) this.d;
                boolean z26 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                mkVar.getClass();
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ip(i16, mkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                int i25 = (str != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i25];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z26) {
                    for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                        hk hkVar = (hk) arrayList3.get(i26);
                        File file = hkVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i27 = 0;
                            while (true) {
                                if (i27 < i25) {
                                    String str5 = strArr2[i27];
                                    String str6 = hkVar.b;
                                    if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                        arrayList4.add(hkVar);
                                    } else {
                                        i27++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ip(i16, mkVar, arrayList4));
                return;
            case 19:
                c90.t((c90) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                ry0 ry0Var = (ry0) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z27 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                cz0 cz0Var = ry0Var.a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        cz0Var.S = tL_messages_stickerSet;
                        cz0Var.v0();
                        cz0Var.D0();
                    }
                }
                e2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z28 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.e;
                if (k3Var != null && !k3Var.isDismissed()) {
                    k3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new hh(editTextBoldCursor2, i15));
                        return;
                    }
                    return;
                }
                if (e2Var2 == null || !e2Var2.isShowing()) {
                    return;
                }
                e2Var2.l(true);
                editTextBoldCursor2.requestFocus();
                if (z28) {
                    AndroidUtilities.runOnUIThread(new hh(editTextBoldCursor2, i14));
                    return;
                }
                return;
            case 22:
                v50 v50Var = (v50) this.c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z29 = this.b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        v50Var.u1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 23:
                z60 z60Var = (z60) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z30 = this.b;
                if (tL_error2 == null) {
                    z60Var.f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z30) {
                        if (z60Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(z60Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        z60Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                z60Var.e = false;
                z60Var.a.l();
                return;
            case 24:
                um0 um0Var = (um0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z31 = this.b;
                in0 in0Var = um0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    in0Var.J = password;
                    TwoStepVerificationActivity.n0(password);
                    in0Var.B1(z31);
                    return;
                }
                return;
            case 25:
                um0 um0Var2 = (um0) this.c;
                TLObject tLObject8 = (TLObject) this.e;
                String str7 = (String) this.d;
                boolean z32 = this.b;
                in0 in0Var2 = um0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    in0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    in0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        in0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            in0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr3;
                            AndroidUtilities.runOnUIThread(new s9(um0Var2, passwordsettings, z32, bArr2, 26));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new lj0(um0Var2, i17));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = in0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        in0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr4;
                    } else {
                        bArr = new byte[0];
                    }
                    in0Var2.c1 = null;
                    in0Var2.b1 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new s9(um0Var2, passwordsettings, z32, bArr2, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                po0 po0Var = (po0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                boolean z33 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    po0Var.a0 = password2;
                    TwoStepVerificationActivity.n0(password2);
                    po0Var.B0(z33);
                    return;
                }
                return;
            case 28:
                dg1.d0((dg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            default:
                rg.q0 q0Var = (rg.q0) this.c;
                ng ngVar = (ng) this.d;
                ng ngVar2 = (ng) this.e;
                boolean z34 = this.b;
                q0Var.f.f(new rg.o0(q0Var, ngVar, i18));
                q0Var.f.f(new rg.o0(q0Var, ngVar2, i18));
                q0Var.E = z34;
                return;
        }
    }

    public /* synthetic */ s9(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ s9(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ s9(Object obj, TLObject tLObject, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ s9(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ s9(ry0 ry0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = 20;
        this.c = ry0Var;
        this.e = tLObject;
        this.b = z10;
        this.d = e2Var;
    }

    public /* synthetic */ s9(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 17;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
