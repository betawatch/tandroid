package cg;

import ag.l3;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import hh.m7;
import hh.t5;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jh.d3;
import jh.e3;
import jh.e4;
import lh.z7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.za;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ah;
import org.telegram.ui.bf0;
import org.telegram.ui.di1;
import org.telegram.ui.dn;
import org.telegram.ui.do0;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.im0;
import org.telegram.ui.jm;
import org.telegram.ui.km0;
import org.telegram.ui.pn;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.s5;
import org.telegram.ui.s50;
import org.telegram.ui.w60;
import org.telegram.ui.xm0;
import org.telegram.ui.xo;
import org.telegram.ui.y11;
import org.telegram.ui.yq;
import org.telegram.ui.zf1;
import org.telegram.ui.zk0;
import rh.m3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String[] split;
        int i11;
        c6 c6Var;
        ag.s0 s0Var;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i12;
        int i13;
        int i14 = 13;
        int i15 = 3;
        int i16 = 10;
        int i17 = 21;
        int i18 = 4;
        r14 = null;
        byte[] bArr4 = null;
        r14 = null;
        String str = null;
        boolean z10 = true;
        int i19 = 0;
        switch (this.a) {
            case 0:
                mc mcVar = (mc) this.c;
                boolean z11 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                c6 c6Var2 = (c6) this.e;
                int i20 = R.raw.star_premium_2;
                ec M = mcVar.M(z11 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z11 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), g6.Gi, 0, new i(chat), c6Var2), i20);
                M.j = 5000;
                M.j();
                break;
            case 1:
                m7 m7Var = (m7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z12 = this.b;
                ArrayList arrayList = m7Var.l;
                int i21 = m7Var.a;
                if (iArr[0] == m7Var.m) {
                    m7Var.i = false;
                    m7Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i21).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i21).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        m7Var.k = tL_payments_savedStarGifts.next_offset;
                        m7Var.n = tL_payments_savedStarGifts.count;
                        m7Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        m7Var.j = arrayList.size() > m7Var.n || m7Var.k == null;
                    } else {
                        m7Var.j = true;
                    }
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m7Var.b), m7Var);
                    break;
                }
                break;
            case 2:
                e3 e3Var = (e3) this.c;
                View view = (View) this.d;
                ig.q0 q0Var = (ig.q0) this.e;
                boolean z13 = this.b;
                e4 e4Var = e3Var.a;
                y4.a0(e4Var.y2, 1, e4Var.x1, new d3(e3Var, z13, q0Var, view));
                break;
            case 3:
                lh.s1 s1Var = (lh.s1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z14 = this.b;
                lh.u1 u1Var = s1Var.s;
                if (s1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        lh.l2 l2Var = u1Var.r;
                        ArrayList arrayList2 = u1Var.n;
                        i10 = ((org.telegram.ui.ActionBar.e3) l2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        s1Var.h = messages_botresults.next_offset;
                        if (z14) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        s1Var.l();
                    }
                    u1Var.d.c(false);
                    s1Var.r = false;
                    break;
                }
                break;
            case 4:
                z7 z7Var = (z7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z15 = this.b;
                Runnable runnable = (Runnable) this.e;
                z7Var.getClass();
                try {
                    bitmap.compress(z15 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(z7Var.Z0));
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                    if (z15) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(z7Var.Z0));
                        } catch (Exception e10) {
                            FileLog.e((Throwable) e10, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 5:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                break;
            case 6:
                String[] strArr = (String[]) this.c;
                f6 f6Var = (f6) this.d;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) this.e;
                try {
                    g6.g0 = g6.ql.get(g6.g5, -1);
                    int i22 = 20;
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (f6Var.c != null) {
                                new File(f6Var.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        f6Var.c = null;
                        g6.h0 = null;
                    } else {
                        g6.h0 = strArr[0];
                        String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(g6.h0) + ".wp").getAbsolutePath();
                        try {
                            String str3 = f6Var.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(f6Var.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        f6Var.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(g6.h0);
                            f6Var.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i23 = 0; i23 < split.length; i23++) {
                                    if ("blur".equals(split[i23])) {
                                        f6Var.h = true;
                                    } else if ("motion".equals(split[i23])) {
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
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    f6Var.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    if (!z16 && g6.M == null) {
                        g6.K = f6Var;
                        if (g6.I != g6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            g6.T = 2000;
                            g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new l3(i22), 2100L);
                        }
                    }
                    g6.I = f6Var;
                    g6.n1(false, false);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (g6.M == null && !g6.Q) {
                    MessagesController.getInstance(f6Var.A).saveTheme(f6Var, f6Var.k(false), z16, false);
                }
                pVar.run();
                break;
            case 7:
                rn.U((rn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                break;
            case 8:
                dn dnVar = (dn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z17 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i24 = R.string.SuggestedMessageAcceptInfo;
                rn rnVar = dnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, rnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                hf.a m10 = hf.a.m(message.suggested_post.price);
                int i25 = m10.a == hf.b.b ? rnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : rnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z17) {
                    m10 = hf.a.i((m10.b / 1000) * i25, m10.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z17) {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeAdmin2, m10.f(), nh.k.G0(i25))));
                    } else {
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAnytimeUser2, m10.f())));
                    }
                } else if (z17) {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoAdmin2, m10.f(), hh.t0.p(message.suggested_post.schedule_date), nh.k.G0(i25))));
                } else {
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageAcceptInfoUser2, m10.f(), hh.t0.p(message.suggested_post.schedule_date))));
                }
                spannableStringBuilder.append(' ');
                int i26 = R.string.SuggestedMessageAcceptInfo3;
                i11 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i26, Long.valueOf(MessagesController.getInstance(i11).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS)))));
                ec[] ecVarArr = new ec[1];
                s5 s5Var = new s5(ecVarArr, 4);
                org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                org.telegram.ui.ActionBar.b2 v02 = y4.v0(rnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new k0(dnVar, message, b2VarArr, messageObject, s5Var, 26));
                b2VarArr[0] = v02;
                v02.setOnDismissListener(s5Var);
                if (z17 && m10.a == hf.b.a) {
                    za a2 = ab.a(rnVar.getParentActivity());
                    c6Var = ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider;
                    ec G = new mc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    ecVarArr[0] = G;
                    break;
                }
                break;
            case 9:
                pn pnVar = (pn) this.c;
                pnVar.j((b4) this.d, (TLRPC.WallPaper) this.e, this.b);
                pnVar.g(pnVar.n);
                jm jmVar = pnVar.R.T0;
                if (jmVar != null && (s0Var = jmVar.H) != null) {
                    s0Var.invalidate();
                    break;
                }
                break;
            case 10:
                xo xoVar = (xo) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z18 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    xoVar.h0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = xoVar.U;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z18) {
                        if (xoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getParentActivity());
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            xoVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                }
                i80 i80Var = xoVar.C;
                if (i80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xoVar.h0;
                    i80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    xoVar.C.c(xoVar.h0, xoVar.V);
                    break;
                }
                break;
            case 11:
                fp fpVar = (fp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z19 = this.b;
                w70 w70Var = (w70) this.e;
                chat2.join_to_send = z19;
                fpVar.x.d.getMessagesController().toggleChatJoinToSend(chat2.id, z19, new t5(fpVar, z19, chat2, i14), new rd(26, fpVar, w70Var));
                break;
            case 12:
                fp fpVar2 = (fp) this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z20 = this.b;
                v70 v70Var = (v70) this.e;
                chat3.join_request = z20;
                fpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat3.id, z20, new ep(fpVar2, i19), new rd(25, fpVar2, v70Var));
                break;
            case 13:
                boolean z21 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.c;
                boolean[] zArr = (boolean[]) this.e;
                if (z21 && ChatObject.isChannel(chat4)) {
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
            case 14:
                ak akVar = (ak) this.c;
                String str4 = (String) this.d;
                boolean z22 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                akVar.getClass();
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yq(i17, akVar, new ArrayList()));
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
                    ArrayList arrayList4 = new ArrayList();
                    if (!z22) {
                        for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                            vj vjVar = (vj) arrayList3.get(i28);
                            File file = vjVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i29 = 0;
                                while (true) {
                                    if (i29 < i27) {
                                        String str5 = strArr2[i29];
                                        String str6 = vjVar.b;
                                        if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                            arrayList4.add(vjVar);
                                        } else {
                                            i29++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new yq(i17, akVar, arrayList4));
                    break;
                }
            case 15:
                t70.u((t70) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 16:
                tw0 tw0Var = (tw0) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                boolean z23 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                ex0 ex0Var = tw0Var.a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z23) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        ex0Var.O = tL_messages_stickerSet;
                        ex0Var.t0();
                        ex0Var.B0();
                    }
                }
                b2Var.dismiss();
                break;
            case 17:
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z24 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (e3Var2 != null && !e3Var2.isDismissed()) {
                    e3Var2.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new ah(i15, editTextBoldCursor));
                        break;
                    }
                } else if (b2Var2 != null && b2Var2.isShowing()) {
                    b2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z24) {
                        AndroidUtilities.runOnUIThread(new ah(i18, editTextBoldCursor));
                        break;
                    }
                }
                break;
            case 18:
                s50 s50Var = (s50) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z25 = this.b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        break;
                    } else {
                        s50Var.u1(null, tL_chatInviteExported3.link, true, z25);
                        break;
                    }
                }
                break;
            case 19:
                w60 w60Var = (w60) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z26 = this.b;
                if (tL_error2 == null) {
                    w60Var.f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z26) {
                        if (w60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(w60Var.getParentActivity());
                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            w60Var.showDialog(alertDialog$Builder3.a);
                        }
                    }
                }
                w60Var.e = false;
                w60Var.a.l();
                break;
            case 20:
                km0 km0Var = (km0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z27 = this.b;
                xm0 xm0Var = km0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    xm0Var.F = password;
                    TwoStepVerificationActivity.m0(password);
                    xm0Var.B1(z27);
                    break;
                }
                break;
            case 21:
                km0 km0Var2 = (km0) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z28 = this.b;
                xm0 xm0Var2 = km0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    xm0Var2.Y0 = tL_secureSecretSettings.secure_secret;
                    xm0Var2.X0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        xm0Var2.a1 = Utilities.computeSHA512(bArr3, AndroidUtilities.getStringBytes(str7), bArr3);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        xm0Var2.a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr5;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new zk0(km0Var2, i18));
                        break;
                    } else {
                        bArr3 = new byte[0];
                    }
                    bArr2 = bArr3;
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = xm0Var2.F.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr6 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        xm0Var2.a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr6;
                    } else {
                        bArr = new byte[0];
                    }
                    xm0Var2.Y0 = null;
                    xm0Var2.X0 = 0L;
                    bArr2 = bArr;
                }
                AndroidUtilities.runOnUIThread(new c(km0Var2, passwordsettings, z28, bArr2, 22));
                break;
            case 22:
                km0 km0Var3 = (km0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z29 = this.b;
                byte[] bArr7 = (byte[]) this.e;
                xm0 xm0Var3 = km0Var3.e;
                xm0Var3.Z0 = passwordsettings2.email;
                if (z29) {
                    xm0Var3.a1 = xm0Var3.L0;
                }
                byte[] bArr8 = xm0Var3.Y0;
                byte[] bArr9 = xm0Var3.a1;
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
                if (xm0.Z0(bArr4, Long.valueOf(xm0Var3.X0)) && bArr7.length != 0 && xm0Var3.X0 != 0) {
                    if (xm0Var3.c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i13 = ((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount;
                        ConnectionsManager.getInstance(i13).sendRequest(getallsecurevalues, new im0(km0Var3, i19));
                        break;
                    } else {
                        km0Var3.a();
                        break;
                    }
                } else if (z29) {
                    i12 = ((org.telegram.ui.ActionBar.n2) xm0Var3).currentAccount;
                    UserConfig.getInstance(i12).resetSavedPassword();
                    xm0Var3.J0 = 0;
                    xm0Var3.R1();
                    break;
                } else {
                    TL_account.authorizationForm authorizationform = xm0Var3.y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        xm0Var3.y.errors.clear();
                    }
                    byte[] bArr13 = xm0Var3.Y0;
                    if (bArr13 != null && bArr13.length != 0) {
                        km0Var3.b();
                        break;
                    } else {
                        Utilities.globalQueue.postRunnable(new bf0(km0Var3, km0Var3.b, km0Var3.d, 12));
                        break;
                    }
                }
                break;
            case 23:
                do0 do0Var = (do0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                boolean z30 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    do0Var.W = password2;
                    TwoStepVerificationActivity.m0(password2);
                    do0Var.A0(z30);
                    break;
                }
                break;
            case 24:
                y11.W((y11) this.c, this.b, (b4) this.d, (a5) this.e);
                break;
            case 25:
                zf1.c0((zf1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 26:
                pf.z zVar = (pf.z) this.c;
                boolean z31 = this.b;
                s3 s3Var = (s3) this.d;
                pf.w wVar = (pf.w) this.e;
                if (!z31) {
                    zVar.c = wVar;
                    s3Var.setRightText(zVar.H(wVar));
                    s3Var.setRightTextMargin(6);
                    zVar.E.clear();
                    zVar.d = true;
                    zVar.l();
                    zVar.Q();
                    break;
                }
                break;
            case 27:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                boolean z32 = this.b;
                m3 m3Var = (m3) this.e;
                String trim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    rh.b4.k(n2Var, z32, new di1(i16, m3Var, trim));
                    break;
                }
                break;
            default:
                yf.p0 p0Var = (yf.p0) this.c;
                b6.a aVar = (b6.a) this.d;
                b6.a aVar2 = (b6.a) this.e;
                boolean z33 = this.b;
                p0Var.f.f(new yf.n0(p0Var, aVar, i19));
                p0Var.f.f(new yf.n0(p0Var, aVar2, i19));
                p0Var.E = z33;
                break;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ c(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c(e3 e3Var, View view, ig.q0 q0Var, boolean z10, boolean z11) {
        this.a = 2;
        this.c = e3Var;
        this.d = view;
        this.e = q0Var;
        this.b = z10;
    }

    public /* synthetic */ c(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 13;
        this.b = z10;
        this.d = chat;
        this.c = alertDialog$Builder;
        this.e = zArr;
    }
}
