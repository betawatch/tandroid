package cg;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import lh.l7;
import lh.r5;
import nh.d3;
import nh.d4;
import nh.e3;
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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e4;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e60;
import org.telegram.ui.eh;
import org.telegram.ui.fn0;
import org.telegram.ui.fp;
import org.telegram.ui.gl0;
import org.telegram.ui.i70;
import org.telegram.ui.jf0;
import org.telegram.ui.ln;
import org.telegram.ui.lo0;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.op;
import org.telegram.ui.pm0;
import org.telegram.ui.rm;
import org.telegram.ui.rm0;
import org.telegram.ui.u21;
import org.telegram.ui.wg1;
import org.telegram.ui.x5;
import org.telegram.ui.xn;
import org.telegram.ui.zn;
import ph.t6;
import vh.p3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] split;
        int i10;
        f6 f6Var;
        eg.h0 h0Var;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i11;
        int i12;
        int i13;
        int i14 = 3;
        int i15 = 13;
        int i16 = 4;
        r12 = null;
        byte[] bArr4 = null;
        r12 = null;
        String str = null;
        int i17 = 1;
        int i18 = 0;
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                b4.e0 e0Var = (b4.e0) this.d;
                b4.e0 e0Var2 = (b4.e0) this.e;
                boolean z4 = this.b;
                int i19 = 0;
                d1Var.f.f(new a1(d1Var, e0Var, i19));
                d1Var.f.f(new a1(d1Var, e0Var2, i19));
                d1Var.E = z4;
                break;
            case 1:
                qc qcVar = (qc) this.c;
                boolean z10 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                f6 f6Var2 = (f6) this.e;
                int i20 = R.raw.star_premium_2;
                ic M = qcVar.M(z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z10 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), j6.Gi, 0, new gg.i(chat), f6Var2), i20);
                M.j = 5000;
                M.j();
                break;
            case 2:
                l7 l7Var = (l7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z11 = this.b;
                ArrayList arrayList = l7Var.l;
                int i21 = l7Var.a;
                if (iArr[0] == l7Var.m) {
                    l7Var.i = false;
                    l7Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i21).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i21).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l7Var.k = tL_payments_savedStarGifts.next_offset;
                        l7Var.n = tL_payments_savedStarGifts.count;
                        l7Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        l7Var.j = arrayList.size() > l7Var.n || l7Var.k == null;
                    } else {
                        l7Var.j = true;
                    }
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.b), l7Var);
                    break;
                }
                break;
            case 3:
                e3 e3Var = (e3) this.c;
                View view = (View) this.d;
                mg.q0 q0Var = (mg.q0) this.e;
                boolean z12 = this.b;
                d4 d4Var = e3Var.a;
                z4.a0(d4Var.z2, 1, d4Var.y1, new d3(e3Var, z12, q0Var, view));
                break;
            case 4:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                break;
            case 5:
                String[] strArr = (String[]) this.c;
                i6 i6Var = (i6) this.d;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    j6.g0 = j6.ql.get(j6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (i6Var.c != null) {
                                new File(i6Var.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        i6Var.c = null;
                        j6.h0 = null;
                    } else {
                        j6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(j6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str2 = i6Var.c;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(i6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        i6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(j6.h0);
                            i6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i22 = 0; i22 < split.length; i22++) {
                                    if ("blur".equals(split[i22])) {
                                        i6Var.h = true;
                                    } else if ("motion".equals(split[i22])) {
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
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    i6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z13 && j6.M == null) {
                        j6.K = i6Var;
                        if (j6.I != j6.J) {
                            i17 = 0;
                        }
                        if (i17 != 0) {
                            j6.T = 2000;
                            j6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new n0(19), 2100L);
                        }
                    }
                    j6.I = i6Var;
                    j6.n1(false, false);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (j6.M == null && !j6.Q) {
                    MessagesController.getInstance(i6Var.B).saveTheme(i6Var, i6Var.k(false), z13, false);
                }
                pVar.run();
                break;
            case 6:
                zn.U((zn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                break;
            case 7:
                ln lnVar = (ln) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z14 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i23 = R.string.SuggestedMessageAcceptInfo;
                zn znVar = lnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, znVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                lf.a m9 = lf.a.m(message.suggested_post.price);
                int i24 = m9.a == lf.b.b ? znVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : znVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z14) {
                    m9 = lf.a.i((m9.b / 1000) * i24, m9.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z14) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m9.f(), rh.j.G0(i24))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m9.f())));
                    }
                } else if (z14) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m9.f(), lh.s0.o(message.suggested_post.schedule_date), rh.j.G0(i24))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m9.f(), lh.s0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i25 = R.string.SuggestedMessageAcceptInfo3;
                i10 = ((p2) znVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i25, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                ic[] icVarArr = new ic[1];
                x5 x5Var = new x5(icVarArr, i16);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                org.telegram.ui.ActionBar.d2 v02 = z4.v0(znVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new gg.j0(lnVar, message, d2VarArr, messageObject, x5Var, 24));
                d2VarArr[0] = v02;
                v02.setOnDismissListener(x5Var);
                if (z14 && m9.a == lf.b.a) {
                    bb a2 = cb.a(znVar.getParentActivity());
                    f6Var = ((p2) znVar).resourceProvider;
                    ic G = new qc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    icVarArr[0] = G;
                    break;
                }
                break;
            case 8:
                xn xnVar = (xn) this.c;
                xnVar.j((e4) this.d, (TLRPC.WallPaper) this.e, this.b);
                xnVar.g(xnVar.n);
                rm rmVar = xnVar.S.U0;
                if (rmVar != null && (h0Var = rmVar.I) != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 9:
                fp fpVar = (fp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    fpVar.i0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = fpVar.V;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z15) {
                        if (fpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fpVar.getParentActivity());
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            fpVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                }
                x80 x80Var = fpVar.D;
                if (x80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fpVar.i0;
                    x80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    fpVar.D.c(fpVar.i0, fpVar.W);
                    break;
                }
                break;
            case 10:
                op opVar = (op) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z16 = this.b;
                l80 l80Var = (l80) this.e;
                chat2.join_to_send = z16;
                opVar.x.d.getMessagesController().toggleChatJoinToSend(chat2.id, z16, new r5(opVar, z16, chat2, 11), new np(i17, opVar, l80Var));
                break;
            case 11:
                op opVar2 = (op) this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z17 = this.b;
                k80 k80Var = (k80) this.e;
                chat3.join_request = z17;
                opVar2.x.d.getMessagesController().toggleChatJoinRequest(chat3.id, z17, new mp(opVar2, i18), new np(i18, opVar2, k80Var));
                break;
            case 12:
                boolean z18 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z18 && ChatObject.isChannel(chat4)) {
                    View d = alertDialog$Builder2.a.d(-1);
                    if (d instanceof TextView) {
                        TextView textView = (TextView) d;
                        if (zArr[0]) {
                            textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat4) ? R.string.ChannelDelete : R.string.DeleteMega));
                            break;
                        } else if (chat4.monoforum) {
                            textView.setText(LocaleController.getString(R.string.LeaveConversationMenu));
                            break;
                        } else if (chat4.megagroup) {
                            textView.setText(LocaleController.getString(R.string.LeaveMega));
                            break;
                        } else {
                            textView.setText(LocaleController.getString(R.string.LeaveChannel));
                            break;
                        }
                    }
                }
                break;
            case 13:
                gk gkVar = (gk) this.c;
                String str3 = (String) this.d;
                boolean z19 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                gkVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i26 = 26;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new np(i26, gkVar, new ArrayList()));
                    break;
                } else {
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
                    ArrayList arrayList3 = new ArrayList();
                    if (!z19) {
                        for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                            ak akVar = (ak) arrayList2.get(i28);
                            File file = akVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i29 = 0;
                                while (true) {
                                    if (i29 < i27) {
                                        String str4 = strArr2[i29];
                                        String str5 = akVar.b;
                                        if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                            arrayList3.add(akVar);
                                        } else {
                                            i29++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new np(i26, gkVar, arrayList3));
                    break;
                }
                break;
            case 14:
                i80.t((i80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 15:
                lx0 lx0Var = (lx0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z20 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                xx0 xx0Var = lx0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z20) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject3, 0, null, false, false);
                    } else {
                        xx0Var.P = tL_messages_stickerSet;
                        xx0Var.t0();
                        xx0Var.B0();
                    }
                }
                d2Var.dismiss();
                break;
            case 16:
                g3 g3Var = (g3) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z21 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                if (g3Var != null && !g3Var.isDismissed()) {
                    g3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        AndroidUtilities.runOnUIThread(new eh(i14, editTextBoldCursor));
                        break;
                    }
                } else if (d2Var2 != null && d2Var2.isShowing()) {
                    d2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        AndroidUtilities.runOnUIThread(new eh(i16, editTextBoldCursor));
                        break;
                    }
                }
                break;
            case 17:
                e60 e60Var = (e60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z22 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        break;
                    } else {
                        e60Var.u1(null, tL_chatInviteExported3.link, true, z22);
                        break;
                    }
                }
                break;
            case 18:
                i70 i70Var = (i70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error2 == null) {
                    i70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z23) {
                        if (i70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i70Var.getParentActivity());
                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            i70Var.showDialog(alertDialog$Builder3.a);
                        }
                    }
                }
                i70Var.e = false;
                i70Var.a.l();
                break;
            case 19:
                rm0 rm0Var = (rm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z24 = this.b;
                fn0 fn0Var = rm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    fn0Var.G = password;
                    TwoStepVerificationActivity.m0(password);
                    fn0Var.B1(z24);
                    break;
                }
                break;
            case 20:
                rm0 rm0Var2 = (rm0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z25 = this.b;
                fn0 fn0Var2 = rm0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject7;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    fn0Var2.Z0 = tL_secureSecretSettings.secure_secret;
                    fn0Var2.Y0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        fn0Var2.b1 = Utilities.computeSHA512(bArr3, AndroidUtilities.getStringBytes(str6), bArr3);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        fn0Var2.b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr5;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new gl0(rm0Var2, i16));
                        break;
                    } else {
                        bArr3 = new byte[0];
                    }
                    bArr2 = bArr3;
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = fn0Var2.G.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr6 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        fn0Var2.b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr6;
                    } else {
                        bArr = new byte[0];
                    }
                    fn0Var2.Z0 = null;
                    fn0Var2.Y0 = 0L;
                    bArr2 = bArr;
                }
                AndroidUtilities.runOnUIThread(new u0(rm0Var2, passwordsettings, z25, bArr2, 21));
                break;
            case 21:
                rm0 rm0Var3 = (rm0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z26 = this.b;
                byte[] bArr7 = (byte[]) this.e;
                fn0 fn0Var3 = rm0Var3.e;
                fn0Var3.a1 = passwordsettings2.email;
                if (z26) {
                    fn0Var3.b1 = fn0Var3.M0;
                }
                byte[] bArr8 = fn0Var3.Z0;
                byte[] bArr9 = fn0Var3.b1;
                if (bArr8 != null && bArr8.length == 32) {
                    byte[] bArr10 = new byte[32];
                    System.arraycopy(bArr9, 0, bArr10, 0, 32);
                    byte[] bArr11 = new byte[16];
                    System.arraycopy(bArr9, 32, bArr11, 0, 16);
                    byte[] bArr12 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr12, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr12, bArr10, bArr11, 0, 32, 0, 0);
                    bArr4 = bArr12;
                }
                if (fn0.Z0(bArr4, Long.valueOf(fn0Var3.Y0)) && bArr7.length != 0 && fn0Var3.Y0 != 0) {
                    if (fn0Var3.c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i12 = ((p2) fn0Var3).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(getallsecurevalues, new pm0(rm0Var3, i18));
                        break;
                    } else {
                        rm0Var3.a();
                        break;
                    }
                } else if (z26) {
                    i11 = ((p2) fn0Var3).currentAccount;
                    UserConfig.getInstance(i11).resetSavedPassword();
                    fn0Var3.K0 = 0;
                    fn0Var3.R1();
                    break;
                } else {
                    TL_account.authorizationForm authorizationform = fn0Var3.y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        fn0Var3.y.errors.clear();
                    }
                    byte[] bArr13 = fn0Var3.Z0;
                    if (bArr13 != null && bArr13.length != 0) {
                        rm0Var3.b();
                        break;
                    } else {
                        Utilities.globalQueue.postRunnable(new jf0(rm0Var3, rm0Var3.b, rm0Var3.d, 12));
                        break;
                    }
                }
                break;
            case 22:
                lo0 lo0Var = (lo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z27 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    lo0Var.X = password2;
                    TwoStepVerificationActivity.m0(password2);
                    lo0Var.A0(z27);
                    break;
                }
                break;
            case 23:
                u21.W((u21) this.c, this.b, (e4) this.d, (d5) this.e);
                break;
            case 24:
                wg1.c0((wg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 25:
                ph.f1 f1Var = (ph.f1) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z28 = this.b;
                ph.h1 h1Var = f1Var.s;
                if (f1Var.r) {
                    if (tLObject9 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject9;
                        ph.y1 y1Var = h1Var.r;
                        ArrayList arrayList4 = h1Var.n;
                        i13 = ((g3) y1Var).currentAccount;
                        MessagesStorage.getInstance(i13).saveBotCache(str7, messages_botresults);
                        f1Var.h = messages_botresults.next_offset;
                        if (z28) {
                            arrayList4.clear();
                        }
                        arrayList4.size();
                        arrayList4.addAll(messages_botresults.results);
                        f1Var.l();
                    }
                    h1Var.d.c(false);
                    f1Var.r = false;
                    break;
                }
                break;
            case 26:
                t6 t6Var = (t6) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z29 = this.b;
                Runnable runnable = (Runnable) this.e;
                t6Var.getClass();
                try {
                    bitmap.compress(z29 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(t6Var.Z0));
                } catch (Exception e6) {
                    FileLog.e((Throwable) e6, false);
                    if (z29) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(t6Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 27:
                tf.z zVar = (tf.z) this.c;
                boolean z30 = this.b;
                t3 t3Var = (t3) this.d;
                tf.w wVar = (tf.w) this.e;
                if (!z30) {
                    zVar.c = wVar;
                    t3Var.setRightText(zVar.H(wVar));
                    t3Var.setRightTextMargin(6);
                    zVar.F.clear();
                    zVar.d = true;
                    zVar.l();
                    zVar.Q();
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                p2 p2Var = (p2) this.d;
                boolean z31 = this.b;
                p3 p3Var = (p3) this.e;
                String trim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    vh.e4.k(p2Var, z31, new org.telegram.ui.web.m(i15, p3Var, trim));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u0(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
        this.e = obj3;
    }

    public /* synthetic */ u0(Object obj, boolean z4, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ u0(e3 e3Var, View view, mg.q0 q0Var, boolean z4, boolean z10) {
        this.a = 3;
        this.c = e3Var;
        this.d = view;
        this.e = q0Var;
        this.b = z4;
    }

    public /* synthetic */ u0(boolean z4, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 12;
        this.b = z4;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
