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
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ah;
import org.telegram.ui.an0;
import org.telegram.ui.bg1;
import org.telegram.ui.dn;
import org.telegram.ui.eh;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.io0;
import org.telegram.ui.km;
import org.telegram.ui.km0;
import org.telegram.ui.mm0;
import org.telegram.ui.oj0;
import org.telegram.ui.qn;
import org.telegram.ui.re0;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.y60;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x9(ci.l3 l3Var, View view, ah.i1 i1Var, boolean z10, boolean z11) {
        this.a = 1;
        this.c = l3Var;
        this.d = view;
        this.e = i1Var;
        this.b = z10;
    }

    private final void a() {
        byte[] bArr;
        int i10;
        int i11;
        mm0 mm0Var = (mm0) this.c;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
        boolean z10 = this.b;
        byte[] bArr2 = (byte[]) this.e;
        an0 an0Var = mm0Var.e;
        an0Var.d1 = passwordsettings.email;
        if (z10) {
            an0Var.e1 = an0Var.P0;
        }
        byte[] bArr3 = an0Var.c1;
        byte[] bArr4 = an0Var.e1;
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
        if (an0.Y0(bArr, Long.valueOf(an0Var.b1)) && bArr2.length != 0 && an0Var.b1 != 0) {
            if (an0Var.c != 0) {
                mm0Var.a();
                return;
            }
            TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
            i11 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(getallsecurevalues, new km0(mm0Var, 0));
            return;
        }
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
            UserConfig.getInstance(i10).resetSavedPassword();
            an0Var.N0 = 0;
            an0Var.R1();
            return;
        }
        TL_account.authorizationForm authorizationform = an0Var.y;
        if (authorizationform != null) {
            authorizationform.values.clear();
            an0Var.y.errors.clear();
        }
        byte[] bArr7 = an0Var.c1;
        if (bArr7 == null || bArr7.length == 0) {
            Utilities.globalQueue.postRunnable(new re0(mm0Var, mm0Var.b, mm0Var.d, 14));
        } else {
            mm0Var.b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        String[] split;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        jc jcVar;
        byte[] bArr;
        byte[] bArr2;
        int i13 = 16;
        int i14 = 4;
        int i15 = 3;
        int i16 = 13;
        int i17 = 6;
        r9 = null;
        String str = null;
        boolean z10 = true;
        int i18 = 0;
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z11 = this.b;
                ArrayList arrayList = y9Var.l;
                int i19 = y9Var.a;
                if (iArr[0] != y9Var.m) {
                    return;
                }
                y9Var.i = false;
                y9Var.m = -1;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                    if (z11) {
                        arrayList.clear();
                    }
                    arrayList.addAll(tL_payments_savedStarGifts.gifts);
                    y9Var.k = tL_payments_savedStarGifts.next_offset;
                    y9Var.n = tL_payments_savedStarGifts.count;
                    y9Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                    y9Var.j = arrayList.size() > y9Var.n || y9Var.k == null;
                } else {
                    y9Var.j = true;
                }
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(y9Var.b), y9Var);
                return;
            case 1:
                ci.l3 l3Var = (ci.l3) this.c;
                View view = (View) this.d;
                ah.i1 i1Var = (ah.i1) this.e;
                boolean z12 = this.b;
                ci.p4 p4Var = l3Var.a;
                org.telegram.ui.Components.f5.a0(p4Var.C2, 1, p4Var.B1, new ci.k3(l3Var, z12, i1Var, view));
                return;
            case 2:
                ei.t1 t1Var = (ei.t1) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                String str2 = (String) this.d;
                boolean z13 = this.b;
                ei.v1 v1Var = t1Var.s;
                if (t1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ei.n2 n2Var = v1Var.r;
                        ArrayList arrayList2 = v1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
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
            case 3:
                ei.a8 a8Var = (ei.a8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z14 = this.b;
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
            case 4:
                hg.h0 h0Var = (hg.h0) this.c;
                boolean z15 = this.b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.d;
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
                h0Var.P();
                return;
            case 5:
                Context context = (Context) this.c;
                boolean z16 = this.b;
                i2.h0 h0Var2 = (i2.h0) this.d;
                j2.j jVar = (j2.j) this.e;
                j2.h o10 = j2.h.o(context);
                if (o10 == null) {
                    e2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z16) {
                    j2.e eVar = h0Var2.s;
                    eVar.getClass();
                    eVar.f.a(o10);
                }
                LogSessionId q6 = o10.q();
                synchronized (jVar) {
                    j2.i iVar = jVar.b;
                    iVar.getClass();
                    iVar.f(q6);
                }
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                boolean z17 = this.b;
                ki.t3 t3Var = (ki.t3) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                ki.j4.k(o2Var, z17, new ah.h0(24, t3Var, trim));
                return;
            case 7:
                m4.f0 f0Var = (m4.f0) this.c;
                boolean z18 = this.b;
                m4.v vVar = (m4.v) this.d;
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
            case 8:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 9:
                String[] strArr = (String[]) this.c;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.d;
                boolean z19 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    org.telegram.ui.ActionBar.k6.g0 = org.telegram.ui.ActionBar.k6.tl.get(org.telegram.ui.ActionBar.k6.g5, -1);
                    int i20 = 21;
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (j6Var.c != null) {
                                new File(j6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        j6Var.c = null;
                        org.telegram.ui.ActionBar.k6.h0 = null;
                    } else {
                        org.telegram.ui.ActionBar.k6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(org.telegram.ui.ActionBar.k6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = j6Var.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(j6Var.c).delete();
                            }
                        } catch (Exception unused3) {
                        }
                        j6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(org.telegram.ui.ActionBar.k6.h0);
                            j6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i21 = 0; i21 < split.length; i21++) {
                                    if ("blur".equals(split[i21])) {
                                        j6Var.h = true;
                                    } else if ("motion".equals(split[i21])) {
                                        j6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            j6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    j6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        j6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        j6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        j6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    j6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused5) {
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z19 && org.telegram.ui.ActionBar.k6.M == null) {
                        org.telegram.ui.ActionBar.k6.K = j6Var;
                        if (org.telegram.ui.ActionBar.k6.I != org.telegram.ui.ActionBar.k6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            org.telegram.ui.ActionBar.k6.T = 2000;
                            org.telegram.ui.ActionBar.k6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ah.j(i20), 2100L);
                        }
                    }
                    org.telegram.ui.ActionBar.k6.I = j6Var;
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (org.telegram.ui.ActionBar.k6.M == null && !org.telegram.ui.ActionBar.k6.Q) {
                    MessagesController.getInstance(j6Var.E).saveTheme(j6Var, j6Var.k(false), z19, false);
                }
                pVar.run();
                return;
            case 10:
                sn.m0((sn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                return;
            case 11:
                sn snVar = (sn) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) this.e;
                boolean z20 = this.b;
                if (i6Var == null) {
                    UndoView undoView = snVar.K3;
                    org.telegram.ui.ActionBar.k6.H1(j6Var2, false, -1, undoView != null ? undoView.getUndoButton() : null);
                    return;
                }
                snVar.getClass();
                org.telegram.ui.ActionBar.i6 k10 = j6Var2.k(false);
                int i22 = i6Var.a;
                UndoView undoView2 = snVar.K3;
                org.telegram.ui.ActionBar.k6.H1(j6Var2, false, i22, undoView2 != null ? undoView2.getUndoButton() : null);
                if (z20) {
                    org.telegram.ui.ActionBar.k6.k0(j6Var2, k10, true);
                    return;
                }
                return;
            case 12:
                dn dnVar = (dn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z21 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i23 = R.string.SuggestedMessageAcceptInfo;
                sn snVar2 = dnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, snVar2.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ag.a m10 = ag.a.m(message.suggested_post.price);
                int i24 = m10.a == ag.b.b ? snVar2.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : snVar2.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z21) {
                    m10 = ag.a.i((m10.b / 1000) * i24, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z21) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), gi.l.H0(i24))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z21) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), h1.p(message.suggested_post.schedule_date), gi.l.H0(i24))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), h1.p(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i25 = R.string.SuggestedMessageAcceptInfo3;
                i12 = ((org.telegram.ui.ActionBar.o2) snVar2).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i25, Long.valueOf(MessagesController.getInstance(i12).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[1];
                org.telegram.ui.v5 v5Var = new org.telegram.ui.v5(qcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                org.telegram.ui.ActionBar.c2 v02 = org.telegram.ui.Components.f5.v0(snVar2, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new t0(dnVar, message, c2VarArr, messageObject, v5Var, 26));
                c2VarArr[0] = v02;
                v02.setOnDismissListener(v5Var);
                if (z21 && m10.a == ag.b.a) {
                    org.telegram.ui.Components.kb a2 = org.telegram.ui.Components.lb.a(snVar2.getParentActivity());
                    g6Var = ((org.telegram.ui.ActionBar.o2) snVar2).resourceProvider;
                    org.telegram.ui.Components.qc G = new org.telegram.ui.Components.xc(a2, g6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    qcVarArr[0] = G;
                    return;
                }
                return;
            case 13:
                qn qnVar = (qn) this.c;
                qnVar.r((org.telegram.ui.ActionBar.f4) this.d, (TLRPC.WallPaper) this.e, this.b);
                qnVar.o(qnVar.h);
                km kmVar = qnVar.F.j1;
                if (kmVar == null || (jcVar = kmVar.L) == null) {
                    return;
                }
                jcVar.invalidate();
                return;
            case 14:
                yo yoVar = (yo) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z22 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    yoVar.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = yoVar.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z22) {
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
                r90 r90Var = yoVar.H;
                if (r90Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yoVar.m0;
                    r90Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    yoVar.H.c(yoVar.m0, yoVar.a0);
                    return;
                }
                return;
            case 15:
                gp gpVar = (gp) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z23 = this.b;
                e90 e90Var = (e90) this.e;
                chat.join_to_send = z23;
                int i26 = 17;
                gpVar.x.d.getMessagesController().toggleChatJoinToSend(chat.id, z23, new y7(gpVar, z23, chat, i26), new eh(i26, gpVar, e90Var));
                return;
            case 16:
                gp gpVar2 = (gp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z24 = this.b;
                d90 d90Var = (d90) this.e;
                chat2.join_request = z24;
                gpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat2.id, z24, new fp(gpVar2, i18), new eh(i13, gpVar2, d90Var));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i16, mkVar, new ArrayList()));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                    str = translitString;
                }
                int i27 = (str != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i27];
                strArr2[0] = lowerCase;
                if (str != null) {
                    strArr2[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z26) {
                    for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                        hk hkVar = (hk) arrayList3.get(i28);
                        File file = hkVar.f;
                        if (file != null && !file.isDirectory()) {
                            int i29 = 0;
                            while (true) {
                                if (i29 < i27) {
                                    String str5 = strArr2[i29];
                                    String str6 = hkVar.b;
                                    if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                        arrayList4.add(hkVar);
                                    } else {
                                        i29++;
                                    }
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ee(i16, mkVar, arrayList4));
                return;
            case 19:
                b90.u((b90) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                return;
            case 20:
                iy0 iy0Var = (iy0) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z27 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.d;
                ty0 ty0Var = iy0Var.a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z27) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        ty0Var.S = tL_messages_stickerSet;
                        ty0Var.v0();
                        ty0Var.D0();
                    }
                }
                c2Var.dismiss();
                return;
            case 21:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.d;
                boolean z28 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                if (h3Var != null && !h3Var.isDismissed()) {
                    h3Var.setFocusable(true);
                    editTextBoldCursor2.requestFocus();
                    if (z28) {
                        AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor2, i15));
                        return;
                    }
                    return;
                }
                if (c2Var2 == null || !c2Var2.isShowing()) {
                    return;
                }
                c2Var2.l(true);
                editTextBoldCursor2.requestFocus();
                if (z28) {
                    AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor2, i14));
                    return;
                }
                return;
            case 22:
                u50 u50Var = (u50) this.c;
                TLObject tLObject5 = (TLObject) this.e;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.d;
                boolean z29 = this.b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        u50Var.u1(null, tL_chatInviteExported3.link, true, z29);
                        return;
                    }
                }
                return;
            case 23:
                y60 y60Var = (y60) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z30 = this.b;
                if (tL_error2 == null) {
                    y60Var.f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z30) {
                        if (y60Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(y60Var.getParentActivity());
                        alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlertNewLink);
                        alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                        y60Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                y60Var.e = false;
                y60Var.a.l();
                return;
            case 24:
                mm0 mm0Var = (mm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z31 = this.b;
                an0 an0Var = mm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    an0Var.J = password;
                    TwoStepVerificationActivity.m0(password);
                    an0Var.A1(z31);
                    return;
                }
                return;
            case 25:
                mm0 mm0Var2 = (mm0) this.c;
                TLObject tLObject8 = (TLObject) this.e;
                String str7 = (String) this.d;
                boolean z32 = this.b;
                an0 an0Var2 = mm0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    an0Var2.c1 = tL_secureSecretSettings.secure_secret;
                    an0Var2.b1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        an0Var2.e1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr3 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            an0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr3;
                            AndroidUtilities.runOnUIThread(new x9(mm0Var2, passwordsettings, z32, bArr2, 26));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            AndroidUtilities.runOnUIThread(new oj0(mm0Var2, i17));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = an0Var2.J.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        an0Var2.e1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr4;
                    } else {
                        bArr = new byte[0];
                    }
                    an0Var2.c1 = null;
                    an0Var2.b1 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new x9(mm0Var2, passwordsettings, z32, bArr2, 26));
                return;
            case 26:
                a();
                return;
            case 27:
                io0 io0Var = (io0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                boolean z33 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    io0Var.a0 = password2;
                    TwoStepVerificationActivity.m0(password2);
                    io0Var.A0(z33);
                    return;
                }
                return;
            case 28:
                bg1.c0((bg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                return;
            default:
                qg.s0 s0Var = (qg.s0) this.c;
                a5.a aVar = (a5.a) this.d;
                a5.a aVar2 = (a5.a) this.e;
                boolean z34 = this.b;
                s0Var.f.f(new qg.q0(s0Var, aVar, i18));
                s0Var.f.f(new qg.q0(s0Var, aVar2, i18));
                s0Var.E = z34;
                return;
        }
    }

    public /* synthetic */ x9(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ x9(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ x9(Object obj, TLObject tLObject, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.b = z10;
    }

    public /* synthetic */ x9(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ x9(iy0 iy0Var, TLObject tLObject, boolean z10, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = 20;
        this.c = iy0Var;
        this.e = tLObject;
        this.b = z10;
        this.d = c2Var;
    }

    public /* synthetic */ x9(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 17;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
