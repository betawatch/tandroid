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
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c60;
import org.telegram.ui.ch;
import org.telegram.ui.dn0;
import org.telegram.ui.dp;
import org.telegram.ui.el0;
import org.telegram.ui.g70;
import org.telegram.ui.hf0;
import org.telegram.ui.hp;
import org.telegram.ui.jn;
import org.telegram.ui.jo0;
import org.telegram.ui.lp;
import org.telegram.ui.m21;
import org.telegram.ui.mp;
import org.telegram.ui.nm0;
import org.telegram.ui.og1;
import org.telegram.ui.pm;
import org.telegram.ui.pm0;
import org.telegram.ui.v5;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import ph.u6;
import vh.o3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        char c3;
        String[] split;
        char c10;
        char c11;
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
        int i16 = 27;
        int i17 = 4;
        int i18 = 2;
        r13 = null;
        byte[] bArr4 = null;
        r13 = null;
        String str = null;
        int i19 = 1;
        int i20 = 0;
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                b4.e0 e0Var = (b4.e0) this.d;
                b4.e0 e0Var2 = (b4.e0) this.e;
                boolean z4 = this.b;
                int i21 = 0;
                d1Var.f.f(new a1(d1Var, e0Var, i21));
                d1Var.f.f(new a1(d1Var, e0Var2, i21));
                d1Var.E = z4;
                break;
            case 1:
                qc qcVar = (qc) this.c;
                boolean z10 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                f6 f6Var2 = (f6) this.e;
                int i22 = R.raw.star_premium_2;
                ic M = qcVar.M(z10 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z10 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), j6.Gi, 0, new gg.i(chat), f6Var2), i22);
                M.j = 5000;
                M.j();
                break;
            case 2:
                l7 l7Var = (l7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z11 = this.b;
                ArrayList arrayList = l7Var.l;
                int i23 = l7Var.a;
                if (iArr[0] == l7Var.m) {
                    l7Var.i = false;
                    l7Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i23).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i23).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l7Var.k = tL_payments_savedStarGifts.next_offset;
                        l7Var.n = tL_payments_savedStarGifts.count;
                        l7Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        l7Var.j = arrayList.size() > l7Var.n || l7Var.k == null;
                        c3 = 1;
                    } else {
                        c3 = 1;
                        l7Var.j = true;
                    }
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(i23);
                    int i24 = NotificationCenter.starUserGiftsLoaded;
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(l7Var.b);
                    objArr[c3] = l7Var;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i24, objArr);
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
                                for (int i25 = 0; i25 < split.length; i25++) {
                                    if ("blur".equals(split[i25])) {
                                        i6Var.h = true;
                                    } else if ("motion".equals(split[i25])) {
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
                        if (j6.I == j6.J) {
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
                xn.U((xn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                break;
            case 7:
                jn jnVar = (jn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z14 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i26 = R.string.SuggestedMessageAcceptInfo;
                xn xnVar = jnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i26, xnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                mf.a m9 = mf.a.m(message.suggested_post.price);
                int i27 = m9.a == mf.b.b ? xnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : xnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z14) {
                    c10 = 0;
                    c11 = 1;
                    m9 = mf.a.i((m9.b / 1000) * i27, m9.a);
                } else {
                    c10 = 0;
                    c11 = 1;
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z14) {
                        int i28 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String f10 = m9.f();
                        String G0 = rh.k.G0(i27);
                        Object[] objArr2 = new Object[2];
                        objArr2[c10] = f10;
                        objArr2[c11] = G0;
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i28, objArr2)));
                    } else {
                        int i29 = R.string.SuggestedMessageAcceptInfoAnytimeUser2;
                        Object[] objArr3 = new Object[1];
                        objArr3[c10] = m9.f();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i29, objArr3)));
                    }
                } else if (z14) {
                    int i30 = R.string.SuggestedMessageAcceptInfoAdmin2;
                    String f11 = m9.f();
                    String o10 = lh.s0.o(message.suggested_post.schedule_date);
                    String G02 = rh.k.G0(i27);
                    Object[] objArr4 = new Object[3];
                    objArr4[c10] = f11;
                    objArr4[1] = o10;
                    objArr4[2] = G02;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i30, objArr4)));
                } else {
                    int i31 = R.string.SuggestedMessageAcceptInfoUser2;
                    String f12 = m9.f();
                    String o11 = lh.s0.o(message.suggested_post.schedule_date);
                    Object[] objArr5 = new Object[2];
                    objArr5[c10] = f12;
                    objArr5[1] = o11;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i31, objArr5)));
                }
                spannableStringBuilder.append(' ');
                int i32 = R.string.SuggestedMessageAcceptInfo3;
                i10 = ((p2) xnVar).currentAccount;
                Object[] objArr6 = new Object[1];
                objArr6[c10] = Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i32, objArr6)));
                ic[] icVarArr = new ic[1];
                v5 v5Var = new v5(icVarArr, i17);
                org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
                org.telegram.ui.ActionBar.d2 v02 = z4.v0(xnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new gg.j0(jnVar, message, d2VarArr, messageObject, v5Var, 24));
                d2VarArr[c10] = v02;
                v02.setOnDismissListener(v5Var);
                if (z14 && m9.a == mf.b.a) {
                    bb a2 = cb.a(xnVar.getParentActivity());
                    f6Var = ((p2) xnVar).resourceProvider;
                    ic G = new qc(a2, f6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    icVarArr[c10] = G;
                    break;
                }
                break;
            case 8:
                vn vnVar = (vn) this.c;
                vnVar.j((e4) this.d, (TLRPC.WallPaper) this.e, this.b);
                vnVar.g(vnVar.n);
                pm pmVar = vnVar.S.U0;
                if (pmVar != null && (h0Var = pmVar.I) != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 9:
                dp dpVar = (dp) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject2;
                    dpVar.i0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = dpVar.V;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z15) {
                        if (dpVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dpVar.getParentActivity());
                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            dpVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                }
                x80 x80Var = dpVar.D;
                if (x80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = dpVar.i0;
                    x80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    dpVar.D.c(dpVar.i0, dpVar.W);
                    break;
                }
                break;
            case 10:
                mp mpVar = (mp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z16 = this.b;
                l80 l80Var = (l80) this.e;
                chat2.join_to_send = z16;
                mpVar.x.d.getMessagesController().toggleChatJoinToSend(chat2.id, z16, new r5(mpVar, z16, chat2, 11), new hp(i18, mpVar, l80Var));
                break;
            case 11:
                mp mpVar2 = (mp) this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z17 = this.b;
                k80 k80Var = (k80) this.e;
                chat3.join_request = z17;
                mpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat3.id, z17, new lp(mpVar2, i20), new hp(i19, mpVar2, k80Var));
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
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new hp(i16, gkVar, new ArrayList()));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                    }
                    int i33 = (str != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i33];
                    strArr2[0] = lowerCase;
                    if (str != null) {
                        strArr2[1] = str;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    if (!z19) {
                        for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                            ak akVar = (ak) arrayList2.get(i34);
                            File file = akVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i35 = 0;
                                while (true) {
                                    if (i35 < i33) {
                                        String str4 = strArr2[i35];
                                        String str5 = akVar.b;
                                        if (str5 != null ? str5.toLowerCase().contains(str4) : false) {
                                            arrayList3.add(akVar);
                                        } else {
                                            i35++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new hp(i16, gkVar, arrayList3));
                    break;
                }
                break;
            case 14:
                h80.t((h80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
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
                        AndroidUtilities.runOnUIThread(new ch(i14, editTextBoldCursor));
                        break;
                    }
                } else if (d2Var2 != null && d2Var2.isShowing()) {
                    d2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        AndroidUtilities.runOnUIThread(new ch(i17, editTextBoldCursor));
                        break;
                    }
                }
                break;
            case 17:
                c60 c60Var = (c60) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z22 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        break;
                    } else {
                        c60Var.u1(null, tL_chatInviteExported3.link, true, z22);
                        break;
                    }
                }
                break;
            case 18:
                g70 g70Var = (g70) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error2 == null) {
                    g70Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z23) {
                        if (g70Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g70Var.getParentActivity());
                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            g70Var.showDialog(alertDialog$Builder3.a);
                        }
                    }
                }
                g70Var.e = false;
                g70Var.a.l();
                break;
            case 19:
                pm0 pm0Var = (pm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z24 = this.b;
                dn0 dn0Var = pm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    dn0Var.G = password;
                    TwoStepVerificationActivity.m0(password);
                    dn0Var.B1(z24);
                    break;
                }
                break;
            case 20:
                pm0 pm0Var2 = (pm0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z25 = this.b;
                dn0 dn0Var2 = pm0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject7;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    dn0Var2.Z0 = tL_secureSecretSettings.secure_secret;
                    dn0Var2.Y0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        dn0Var2.b1 = Utilities.computeSHA512(bArr3, AndroidUtilities.getStringBytes(str6), bArr3);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        dn0Var2.b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr5;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new el0(pm0Var2, i17));
                        break;
                    } else {
                        bArr3 = new byte[0];
                    }
                    bArr2 = bArr3;
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = dn0Var2.G.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr6 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        dn0Var2.b1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str6), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr6;
                    } else {
                        bArr = new byte[0];
                    }
                    dn0Var2.Z0 = null;
                    dn0Var2.Y0 = 0L;
                    bArr2 = bArr;
                }
                AndroidUtilities.runOnUIThread(new u0(pm0Var2, passwordsettings, z25, bArr2, 21));
                break;
            case 21:
                pm0 pm0Var3 = (pm0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z26 = this.b;
                byte[] bArr7 = (byte[]) this.e;
                dn0 dn0Var3 = pm0Var3.e;
                dn0Var3.a1 = passwordsettings2.email;
                if (z26) {
                    dn0Var3.b1 = dn0Var3.M0;
                }
                byte[] bArr8 = dn0Var3.Z0;
                byte[] bArr9 = dn0Var3.b1;
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
                if (dn0.Z0(bArr4, Long.valueOf(dn0Var3.Y0)) && bArr7.length != 0 && dn0Var3.Y0 != 0) {
                    if (dn0Var3.c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i12 = ((p2) dn0Var3).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(getallsecurevalues, new nm0(pm0Var3, i20));
                        break;
                    } else {
                        pm0Var3.a();
                        break;
                    }
                } else if (z26) {
                    i11 = ((p2) dn0Var3).currentAccount;
                    UserConfig.getInstance(i11).resetSavedPassword();
                    dn0Var3.K0 = 0;
                    dn0Var3.R1();
                    break;
                } else {
                    TL_account.authorizationForm authorizationform = dn0Var3.y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        dn0Var3.y.errors.clear();
                    }
                    byte[] bArr13 = dn0Var3.Z0;
                    if (bArr13 != null && bArr13.length != 0) {
                        pm0Var3.b();
                        break;
                    } else {
                        Utilities.globalQueue.postRunnable(new hf0(pm0Var3, pm0Var3.b, pm0Var3.d, 12));
                        break;
                    }
                }
                break;
            case 22:
                jo0 jo0Var = (jo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                boolean z27 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject8;
                    jo0Var.X = password2;
                    TwoStepVerificationActivity.m0(password2);
                    jo0Var.A0(z27);
                    break;
                }
                break;
            case 23:
                m21.W((m21) this.c, this.b, (e4) this.d, (d5) this.e);
                break;
            case 24:
                og1.c0((og1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 25:
                ph.g1 g1Var = (ph.g1) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z28 = this.b;
                ph.i1 i1Var = g1Var.s;
                if (g1Var.r) {
                    if (tLObject9 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject9;
                        ph.y1 y1Var = i1Var.r;
                        ArrayList arrayList4 = i1Var.n;
                        i13 = ((g3) y1Var).currentAccount;
                        MessagesStorage.getInstance(i13).saveBotCache(str7, messages_botresults);
                        g1Var.h = messages_botresults.next_offset;
                        if (z28) {
                            arrayList4.clear();
                        }
                        arrayList4.size();
                        arrayList4.addAll(messages_botresults.results);
                        g1Var.l();
                    }
                    i1Var.d.c(false);
                    g1Var.r = false;
                    break;
                }
                break;
            case 26:
                u6 u6Var = (u6) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z29 = this.b;
                Runnable runnable = (Runnable) this.e;
                u6Var.getClass();
                try {
                    bitmap.compress(z29 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(u6Var.Z0));
                } catch (Exception e6) {
                    FileLog.e((Throwable) e6, false);
                    if (z29) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(u6Var.Z0));
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
                u3 u3Var = (u3) this.d;
                tf.w wVar = (tf.w) this.e;
                if (!z30) {
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
                boolean z31 = this.b;
                o3 o3Var = (o3) this.e;
                String trim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    vh.d4.k(p2Var, z31, new org.telegram.ui.web.m(i15, o3Var, trim));
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
