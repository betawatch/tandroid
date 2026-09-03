package dg;

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
import mh.l7;
import mh.r5;
import oh.e3;
import oh.f3;
import oh.f4;
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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.z4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ch;
import org.telegram.ui.d60;
import org.telegram.ui.ep;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.h70;
import org.telegram.ui.if0;
import org.telegram.ui.jn;
import org.telegram.ui.lo0;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.pm;
import org.telegram.ui.pm0;
import org.telegram.ui.rm0;
import org.telegram.ui.u21;
import org.telegram.ui.v5;
import org.telegram.ui.vg1;
import org.telegram.ui.vn;
import org.telegram.ui.xc;
import org.telegram.ui.xn;
import qh.r6;
import wh.d4;
import wh.o3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
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
        g6 g6Var;
        fg.h0 h0Var;
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
        boolean z4 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.c;
                b4.e0 e0Var = (b4.e0) this.d;
                b4.e0 e0Var2 = (b4.e0) this.e;
                boolean z10 = this.b;
                int i18 = 0;
                c1Var.f.f(new z0(c1Var, e0Var, i18));
                c1Var.f.f(new z0(c1Var, e0Var2, i18));
                c1Var.E = z10;
                break;
            case 1:
                qc qcVar = (qc) this.c;
                boolean z11 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                g6 g6Var2 = (g6) this.e;
                int i19 = R.raw.star_premium_2;
                ic M = qcVar.M(z11 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z11 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), k6.Gi, 0, new hg.i(chat), g6Var2), i19);
                M.j = 5000;
                M.j();
                break;
            case 2:
                l7 l7Var = (l7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z12 = this.b;
                ArrayList arrayList = l7Var.l;
                int i20 = l7Var.a;
                if (iArr[0] == l7Var.m) {
                    l7Var.i = false;
                    l7Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i20).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i20).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z12) {
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
                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.b), l7Var);
                    break;
                }
                break;
            case 3:
                f3 f3Var = (f3) this.c;
                View view = (View) this.d;
                ng.q0 q0Var = (ng.q0) this.e;
                boolean z13 = this.b;
                f4 f4Var = f3Var.a;
                z4.a0(f4Var.z2, 1, f4Var.y1, new e3(f3Var, z13, q0Var, view));
                break;
            case 4:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                break;
            case 5:
                String[] strArr = (String[]) this.c;
                j6 j6Var = (j6) this.d;
                boolean z14 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    k6.g0 = k6.ql.get(k6.g5, -1);
                    int i21 = 21;
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (j6Var.c != null) {
                                new File(j6Var.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        j6Var.c = null;
                        k6.h0 = null;
                    } else {
                        k6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(k6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str2 = j6Var.c;
                            if (str2 != null && !str2.equals(absolutePath)) {
                                new File(j6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        j6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(k6.h0);
                            j6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i22 = 0; i22 < split.length; i22++) {
                                    if ("blur".equals(split[i22])) {
                                        j6Var.h = true;
                                    } else if ("motion".equals(split[i22])) {
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
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    j6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z14 && k6.M == null) {
                        k6.K = j6Var;
                        if (k6.I != k6.J) {
                            z4 = false;
                        }
                        if (z4) {
                            k6.T = 2000;
                            k6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new ag.f(i21), 2100L);
                        }
                    }
                    k6.I = j6Var;
                    k6.n1(false, false);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (k6.M == null && !k6.Q) {
                    MessagesController.getInstance(j6Var.B).saveTheme(j6Var, j6Var.k(false), z14, false);
                }
                pVar.run();
                break;
            case 6:
                xn.U((xn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                break;
            case 7:
                jn jnVar = (jn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z15 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i23 = R.string.SuggestedMessageAcceptInfo;
                xn xnVar = jnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, xnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                mf.a m9 = mf.a.m(message.suggested_post.price);
                int i24 = m9.a == mf.b.b ? xnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : xnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z15) {
                    m9 = mf.a.i((m9.b / 1000) * i24, m9.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z15) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m9.f(), sh.j.G0(i24))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m9.f())));
                    }
                } else if (z15) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m9.f(), mh.r0.o(message.suggested_post.schedule_date), sh.j.G0(i24))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m9.f(), mh.r0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i25 = R.string.SuggestedMessageAcceptInfo3;
                i10 = ((p2) xnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i25, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                ic[] icVarArr = new ic[1];
                v5 v5Var = new v5(icVarArr, i16);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                org.telegram.ui.ActionBar.d2 v02 = z4.v0(xnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new hg.j0(jnVar, message, d2VarArr, messageObject, v5Var, 24));
                d2VarArr[0] = v02;
                v02.setOnDismissListener(v5Var);
                if (z15 && m9.a == mf.b.a) {
                    bb a2 = cb.a(xnVar.getParentActivity());
                    g6Var = ((p2) xnVar).resourceProvider;
                    ic G = new qc(a2, g6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    icVarArr[0] = G;
                    break;
                }
                break;
            case 8:
                vn vnVar = (vn) this.c;
                vnVar.j((org.telegram.ui.ActionBar.f4) this.d, (TLRPC.WallPaper) this.e, this.b);
                vnVar.g(vnVar.n);
                pm pmVar = vnVar.S.U0;
                if (pmVar != null && (h0Var = pmVar.I) != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 9:
                ep epVar = (ep) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z16 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    epVar.i0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = epVar.V;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z16) {
                        if (epVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(epVar.getParentActivity());
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            epVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                }
                y80 y80Var = epVar.D;
                if (y80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = epVar.i0;
                    y80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    epVar.D.c(epVar.i0, epVar.W);
                    break;
                }
                break;
            case 10:
                np npVar = (np) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z17 = this.b;
                m80 m80Var = (m80) this.e;
                chat2.join_to_send = z17;
                npVar.x.d.getMessagesController().toggleChatJoinToSend(chat2.id, z17, new r5(npVar, z17, chat2, 11), new mp(i17, npVar, m80Var));
                break;
            case 11:
                np npVar2 = (np) this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z18 = this.b;
                l80 l80Var = (l80) this.e;
                chat3.join_request = z18;
                npVar2.x.d.getMessagesController().toggleChatJoinRequest(chat3.id, z18, new lp(npVar2, i17), new xc(29, npVar2, l80Var));
                break;
            case 12:
                boolean z19 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z19 && ChatObject.isChannel(chat4)) {
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
                ik ikVar = (ik) this.c;
                String str3 = (String) this.d;
                boolean z20 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ikVar.getClass();
                String lowerCase = str3.trim().toLowerCase();
                int i26 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new mp(i26, ikVar, new ArrayList()));
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
                    if (!z20) {
                        for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                            ck ckVar = (ck) arrayList2.get(i28);
                            File file = ckVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i29 = 0;
                                while (true) {
                                    if (i29 < i27) {
                                        String str4 = strArr2[i29];
                                        String str5 = ckVar.b;
                                        if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                            arrayList3.add(ckVar);
                                        } else {
                                            i29++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new mp(i26, ikVar, arrayList3));
                    break;
                }
                break;
            case 14:
                j80.t((j80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 15:
                lx0 lx0Var = (lx0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z21 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                xx0 xx0Var = lx0Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z21) {
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
                h3 h3Var = (h3) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z22 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                if (h3Var != null && !h3Var.isDismissed()) {
                    h3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z22) {
                        AndroidUtilities.runOnUIThread(new ch(i14, editTextBoldCursor));
                        break;
                    }
                } else if (d2Var2 != null && d2Var2.isShowing()) {
                    d2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z22) {
                        AndroidUtilities.runOnUIThread(new ch(i16, editTextBoldCursor));
                        break;
                    }
                }
                break;
            case 17:
                d60 d60Var = (d60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z23 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        break;
                    } else {
                        d60Var.u1(null, tL_chatInviteExported3.link, true, z23);
                        break;
                    }
                }
                break;
            case 18:
                h70 h70Var = (h70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z24 = this.b;
                if (tL_error2 == null) {
                    h70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z24) {
                        if (h70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h70Var.getParentActivity());
                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            h70Var.showDialog(alertDialog$Builder3.a);
                        }
                    }
                }
                h70Var.e = false;
                h70Var.a.l();
                break;
            case 19:
                rm0 rm0Var = (rm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z25 = this.b;
                fn0 fn0Var = rm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    fn0Var.G = password;
                    TwoStepVerificationActivity.m0(password);
                    fn0Var.B1(z25);
                    break;
                }
                break;
            case 20:
                rm0 rm0Var2 = (rm0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z26 = this.b;
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
                AndroidUtilities.runOnUIThread(new t0(rm0Var2, passwordsettings, z26, bArr2, 21));
                break;
            case 21:
                rm0 rm0Var3 = (rm0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z27 = this.b;
                byte[] bArr7 = (byte[]) this.e;
                fn0 fn0Var3 = rm0Var3.e;
                fn0Var3.a1 = passwordsettings2.email;
                if (z27) {
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
                        ConnectionsManager.getInstance(i12).sendRequest(getallsecurevalues, new pm0(rm0Var3, i17));
                        break;
                    } else {
                        rm0Var3.a();
                        break;
                    }
                } else if (z27) {
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
                        Utilities.globalQueue.postRunnable(new if0(rm0Var3, rm0Var3.b, rm0Var3.d, 12));
                        break;
                    }
                }
                break;
            case 22:
                lo0 lo0Var = (lo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z28 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    lo0Var.X = password2;
                    TwoStepVerificationActivity.m0(password2);
                    lo0Var.A0(z28);
                    break;
                }
                break;
            case 23:
                u21.W((u21) this.c, this.b, (org.telegram.ui.ActionBar.f4) this.d, (e5) this.e);
                break;
            case 24:
                vg1.c0((vg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 25:
                qh.f1 f1Var = (qh.f1) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z29 = this.b;
                qh.h1 h1Var = f1Var.s;
                if (f1Var.r) {
                    if (tLObject9 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject9;
                        qh.x1 x1Var = h1Var.r;
                        ArrayList arrayList4 = h1Var.n;
                        i13 = ((h3) x1Var).currentAccount;
                        MessagesStorage.getInstance(i13).saveBotCache(str7, messages_botresults);
                        f1Var.h = messages_botresults.next_offset;
                        if (z29) {
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
                r6 r6Var = (r6) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z30 = this.b;
                Runnable runnable = (Runnable) this.e;
                r6Var.getClass();
                try {
                    bitmap.compress(z30 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(r6Var.Z0));
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                    if (z30) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(r6Var.Z0));
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 27:
                uf.z zVar = (uf.z) this.c;
                boolean z31 = this.b;
                u3 u3Var = (u3) this.d;
                uf.w wVar = (uf.w) this.e;
                if (!z31) {
                    zVar.c = wVar;
                    u3Var.setRightText(zVar.H(wVar));
                    u3Var.setRightTextMargin(6);
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
                boolean z32 = this.b;
                o3 o3Var = (o3) this.e;
                String trim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    d4.k(p2Var, z32, new org.telegram.ui.web.m(i15, o3Var, trim));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t0(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
        this.e = obj3;
    }

    public /* synthetic */ t0(Object obj, boolean z4, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ t0(f3 f3Var, View view, ng.q0 q0Var, boolean z4, boolean z10) {
        this.a = 3;
        this.c = f3Var;
        this.d = view;
        this.e = q0Var;
        this.b = z4;
    }

    public /* synthetic */ t0(boolean z4, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 12;
        this.b = z4;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
