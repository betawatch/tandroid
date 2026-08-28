package bg;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import gh.n7;
import gh.u5;
import ih.i4;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kh.a8;
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
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zj;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.cn;
import org.telegram.ui.co0;
import org.telegram.ui.cp;
import org.telegram.ui.dp;
import org.telegram.ui.ei1;
import org.telegram.ui.hm0;
import org.telegram.ui.im;
import org.telegram.ui.jm0;
import org.telegram.ui.o50;
import org.telegram.ui.on;
import org.telegram.ui.qn;
import org.telegram.ui.r5;
import org.telegram.ui.rd;
import org.telegram.ui.t60;
import org.telegram.ui.vo;
import org.telegram.ui.wm0;
import org.telegram.ui.wq;
import org.telegram.ui.ye0;
import org.telegram.ui.yg;
import org.telegram.ui.z11;
import org.telegram.ui.zk0;
import qh.a4;
import qh.l3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(ih.f3 f3Var, View view, hg.r0 r0Var, boolean z10, boolean z11) {
        this.a = 2;
        this.c = f3Var;
        this.d = view;
        this.e = r0Var;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        String[] split;
        int i10;
        b6 b6Var;
        fh.l2 l2Var;
        byte[] bArr;
        byte[] bArr2;
        int i11;
        int i12;
        int i13 = 13;
        int i14 = 3;
        int i15 = 4;
        int i16 = 21;
        r13 = null;
        byte[] bArr3 = null;
        r13 = null;
        String str = null;
        boolean z10 = true;
        int i17 = 0;
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.c;
                boolean z11 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                b6 b6Var2 = (b6) this.e;
                int i18 = R.raw.star_premium_2;
                gc M = ocVar.M(z11 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z11 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), f6.Gi, 0, new l(chat), b6Var2), i18);
                M.j = 5000;
                M.j();
                break;
            case 1:
                n7 n7Var = (n7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z12 = this.b;
                ArrayList arrayList = n7Var.l;
                int i19 = n7Var.a;
                if (iArr[0] == n7Var.m) {
                    n7Var.i = false;
                    n7Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        n7Var.k = tL_payments_savedStarGifts.next_offset;
                        n7Var.n = tL_payments_savedStarGifts.count;
                        n7Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        n7Var.j = arrayList.size() > n7Var.n || n7Var.k == null;
                    } else {
                        n7Var.j = true;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n7Var.b), n7Var);
                    break;
                }
                break;
            case 2:
                ih.f3 f3Var = (ih.f3) this.c;
                View view = (View) this.d;
                hg.r0 r0Var = (hg.r0) this.e;
                boolean z13 = this.b;
                i4 i4Var = f3Var.a;
                y4.a0(i4Var.y2, 1, i4Var.x1, new ih.e3(f3Var, z13, r0Var, view));
                break;
            case 3:
                kh.u1 u1Var = (kh.u1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.b;
                kh.w1 w1Var = u1Var.s;
                if (u1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        kh.n2 n2Var = w1Var.r;
                        ArrayList arrayList2 = w1Var.n;
                        i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                        MessagesStorage.getInstance(i9).saveBotCache(str2, messages_botresults);
                        u1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        u1Var.l();
                    }
                    w1Var.d.c(false);
                    u1Var.r = false;
                    break;
                }
                break;
            case 4:
                a8 a8Var = (a8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.b;
                Runnable runnable = (Runnable) this.e;
                a8Var.getClass();
                try {
                    bitmap.compress(z15 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(a8Var.Z0));
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(a8Var.Z0));
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 5:
                of.f0 f0Var = (of.f0) this.c;
                boolean z16 = this.b;
                v3 v3Var = (v3) this.d;
                of.c0 c0Var = (of.c0) this.e;
                if (!z16) {
                    f0Var.c = c0Var;
                    v3Var.setRightText(f0Var.H(c0Var));
                    v3Var.setRightTextMargin(6);
                    f0Var.E.clear();
                    f0Var.d = true;
                    f0Var.l();
                    f0Var.Q();
                    break;
                }
                break;
            case 6:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                break;
            case 7:
                String[] strArr = (String[]) this.c;
                e6 e6Var = (e6) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    f6.g0 = f6.ql.get(f6.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (e6Var.c != null) {
                                new File(e6Var.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        e6Var.c = null;
                        f6.h0 = null;
                    } else {
                        f6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(f6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = e6Var.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(e6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        e6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(f6.h0);
                            e6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i20 = 0; i20 < split.length; i20++) {
                                    if ("blur".equals(split[i20])) {
                                        e6Var.h = true;
                                    } else if ("motion".equals(split[i20])) {
                                        e6Var.n = true;
                                    }
                                }
                            }
                            Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).getClass();
                            e6Var.x = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    e6Var.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                        e6Var.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                        e6Var.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                        e6Var.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    e6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    if (!z17 && f6.M == null) {
                        f6.K = e6Var;
                        if (f6.I != f6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            f6.T = 2000;
                            f6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new d2(i16), 2100L);
                        }
                    }
                    f6.I = e6Var;
                    f6.n1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (f6.M == null && !f6.Q) {
                    MessagesController.getInstance(e6Var.A).saveTheme(e6Var, e6Var.k(false), z17, false);
                }
                pVar.run();
                break;
            case 8:
                qn.T((qn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                break;
            case 9:
                cn cnVar = (cn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z18 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i21 = R.string.SuggestedMessageAcceptInfo;
                qn qnVar = cnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i21, qnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                gf.a m10 = gf.a.m(message.suggested_post.price);
                int i22 = m10.a == gf.b.b ? qnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : qnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z18) {
                    m10 = gf.a.i((m10.b / 1000) * i22, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z18) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), mh.l.F0(i22))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z18) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), gh.t0.o(message.suggested_post.schedule_date), mh.l.F0(i22))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), gh.t0.o(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i23 = R.string.SuggestedMessageAcceptInfo3;
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i23, Long.valueOf(MessagesController.getInstance(i10).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                gc[] gcVarArr = new gc[1];
                r5 r5Var = new r5(gcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                org.telegram.ui.ActionBar.c2 v02 = y4.v0(qnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new o0(cnVar, message, c2VarArr, messageObject, r5Var, 27));
                c2VarArr[0] = v02;
                v02.setOnDismissListener(r5Var);
                if (z18 && m10.a == gf.b.a) {
                    bb a2 = cb.a(qnVar.getParentActivity());
                    b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                    gc G = new oc(a2, b6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    gcVarArr[0] = G;
                    break;
                }
                break;
            case 10:
                on onVar = (on) this.c;
                onVar.j((b4) this.d, (TLRPC.WallPaper) this.e, this.b);
                onVar.g(onVar.n);
                im imVar = onVar.R.T0;
                if (imVar != null && (l2Var = imVar.H) != null) {
                    l2Var.invalidate();
                    break;
                }
                break;
            case 11:
                vo voVar = (vo) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    voVar.h0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = voVar.U;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z19) {
                        if (voVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            voVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                }
                e80 e80Var = voVar.C;
                if (e80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = voVar.h0;
                    e80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    voVar.C.c(voVar.h0, voVar.V);
                    break;
                }
                break;
            case 12:
                dp dpVar = (dp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z20 = this.b;
                s70 s70Var = (s70) this.e;
                chat2.join_to_send = z20;
                dpVar.x.d.getMessagesController().toggleChatJoinToSend(chat2.id, z20, new u5(dpVar, z20, chat2, i13), new rd(26, dpVar, s70Var));
                break;
            case 13:
                dp dpVar2 = (dp) this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z21 = this.b;
                r70 r70Var = (r70) this.e;
                chat3.join_request = z21;
                dpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat3.id, z21, new cp(dpVar2, i17), new rd(25, dpVar2, r70Var));
                break;
            case 14:
                boolean z22 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.c;
                boolean[] zArr = (boolean[]) this.e;
                if (z22 && ChatObject.isChannel(chat4)) {
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
            case 15:
                ek ekVar = (ek) this.c;
                String str4 = (String) this.d;
                boolean z23 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                ekVar.getClass();
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new wq(i16, ekVar, new ArrayList()));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                    }
                    int i24 = (str != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i24];
                    strArr2[0] = lowerCase;
                    if (str != null) {
                        strArr2[1] = str;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!z23) {
                        for (int i25 = 0; i25 < arrayList3.size(); i25++) {
                            zj zjVar = (zj) arrayList3.get(i25);
                            File file = zjVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i26 = 0;
                                while (true) {
                                    if (i26 < i24) {
                                        String str5 = strArr2[i26];
                                        String str6 = zjVar.b;
                                        if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                            arrayList4.add(zjVar);
                                        } else {
                                            i26++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new wq(i16, ekVar, arrayList4));
                    break;
                }
                break;
            case 16:
                p70.t((p70) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 17:
                rw0 rw0Var = (rw0) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                boolean z24 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                cx0 cx0Var = rw0Var.a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z24) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        cx0Var.O = tL_messages_stickerSet;
                        cx0Var.s0();
                        cx0Var.A0();
                    }
                }
                c2Var.dismiss();
                break;
            case 18:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z25 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                if (f3Var2 != null && !f3Var2.isDismissed()) {
                    f3Var2.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z25) {
                        AndroidUtilities.runOnUIThread(new yg(i14, editTextBoldCursor));
                        break;
                    }
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z25) {
                        AndroidUtilities.runOnUIThread(new yg(i15, editTextBoldCursor));
                        break;
                    }
                }
                break;
            case 19:
                o50 o50Var = (o50) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z26 = this.b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        break;
                    } else {
                        o50Var.u1(null, tL_chatInviteExported3.link, true, z26);
                        break;
                    }
                }
                break;
            case 20:
                t60 t60Var = (t60) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z27 = this.b;
                if (tL_error2 == null) {
                    t60Var.f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z27) {
                        if (t60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(t60Var.getParentActivity());
                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            t60Var.showDialog(alertDialog$Builder3.a);
                        }
                    }
                }
                t60Var.e = false;
                t60Var.a.l();
                break;
            case 21:
                jm0 jm0Var = (jm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z28 = this.b;
                wm0 wm0Var = jm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    wm0Var.F = password;
                    TwoStepVerificationActivity.l0(password);
                    wm0Var.B1(z28);
                    break;
                }
                break;
            case 22:
                jm0 jm0Var2 = (jm0) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z29 = this.b;
                wm0 wm0Var2 = jm0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    wm0Var2.Y0 = tL_secureSecretSettings.secure_secret;
                    wm0Var2.X0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        wm0Var2.a1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        wm0Var2.a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        AndroidUtilities.runOnUIThread(new d(jm0Var2, passwordsettings, z29, bArr2, 23));
                        break;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new zk0(jm0Var2, i15));
                        break;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = wm0Var2.F.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        wm0Var2.a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    wm0Var2.Y0 = null;
                    wm0Var2.X0 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new d(jm0Var2, passwordsettings, z29, bArr2, 23));
            case 23:
                jm0 jm0Var3 = (jm0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z30 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                wm0 wm0Var3 = jm0Var3.e;
                wm0Var3.Z0 = passwordsettings2.email;
                if (z30) {
                    wm0Var3.a1 = wm0Var3.L0;
                }
                byte[] bArr7 = wm0Var3.Y0;
                byte[] bArr8 = wm0Var3.a1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (wm0.Z0(bArr3, Long.valueOf(wm0Var3.X0)) && bArr6.length != 0 && wm0Var3.X0 != 0) {
                    if (wm0Var3.c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i12 = ((org.telegram.ui.ActionBar.o2) wm0Var3).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(getallsecurevalues, new hm0(jm0Var3, i17));
                        break;
                    } else {
                        jm0Var3.a();
                        break;
                    }
                } else if (z30) {
                    i11 = ((org.telegram.ui.ActionBar.o2) wm0Var3).currentAccount;
                    UserConfig.getInstance(i11).resetSavedPassword();
                    wm0Var3.J0 = 0;
                    wm0Var3.R1();
                    break;
                } else {
                    TL_account.authorizationForm authorizationform = wm0Var3.y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        wm0Var3.y.errors.clear();
                    }
                    byte[] bArr12 = wm0Var3.Y0;
                    if (bArr12 != null && bArr12.length != 0) {
                        jm0Var3.b();
                        break;
                    } else {
                        Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.b, jm0Var3.d, 12));
                        break;
                    }
                }
                break;
            case 24:
                co0 co0Var = (co0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                boolean z31 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    co0Var.W = password2;
                    TwoStepVerificationActivity.l0(password2);
                    co0Var.z0(z31);
                    break;
                }
                break;
            case 25:
                z11.V((z11) this.c, this.b, (b4) this.d, (a5) this.e);
                break;
            case 26:
                ag1.b0((ag1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 27:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                boolean z32 = this.b;
                l3 l3Var = (l3) this.e;
                String trim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    a4.k(o2Var, z32, new ei1(9, l3Var, trim));
                    break;
                }
                break;
            default:
                xf.q0 q0Var = (xf.q0) this.c;
                a6.a aVar = (a6.a) this.d;
                a6.a aVar2 = (a6.a) this.e;
                boolean z33 = this.b;
                q0Var.f.f(new xf.n0(q0Var, aVar, i17));
                q0Var.f.f(new xf.n0(q0Var, aVar2, i17));
                q0Var.E = z33;
                break;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ d(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ d(Object obj, boolean z10, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ d(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 14;
        this.b = z10;
        this.d = chat;
        this.c = alertDialog$Builder;
        this.e = zArr;
    }
}
