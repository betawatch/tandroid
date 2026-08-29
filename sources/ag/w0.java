package ag;

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
import jh.k7;
import jh.r5;
import lh.c3;
import lh.d3;
import lh.d4;
import nh.o7;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.z2;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a21;
import org.telegram.ui.bo0;
import org.telegram.ui.cg1;
import org.telegram.ui.fi1;
import org.telegram.ui.fm0;
import org.telegram.ui.fn;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.hm0;
import org.telegram.ui.km;
import org.telegram.ui.r50;
import org.telegram.ui.rn;
import org.telegram.ui.s5;
import org.telegram.ui.tn;
import org.telegram.ui.v60;
import org.telegram.ui.vf;
import org.telegram.ui.vk0;
import org.telegram.ui.vm0;
import org.telegram.ui.xe0;
import org.telegram.ui.xg;
import org.telegram.ui.yo;
import th.m3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
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
        char c3;
        kf.a aVar;
        int i11;
        c6 c6Var;
        cg.h0 h0Var;
        byte[] bArr;
        byte[] bArr2;
        int i12;
        int i13;
        int i14 = 23;
        int i15 = 13;
        int i16 = 3;
        int i17 = 12;
        int i18 = 4;
        r14 = null;
        byte[] bArr3 = null;
        r14 = null;
        String str = null;
        boolean z10 = true;
        int i19 = 0;
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.c;
                j2 j2Var = (j2) this.d;
                j2 j2Var2 = (j2) this.e;
                boolean z11 = this.b;
                int i20 = 0;
                f1Var.f.f(new c1(f1Var, j2Var, i20));
                f1Var.f.f(new c1(f1Var, j2Var2, i20));
                f1Var.E = z11;
                break;
            case 1:
                tc tcVar = (tc) this.c;
                boolean z12 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                c6 c6Var2 = (c6) this.e;
                int i21 = R.raw.star_premium_2;
                mc M = tcVar.M(z12 ? LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated) : LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated), AndroidUtilities.replaceSingleTag(z12 ? LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckStatistic : R.string.BoostingCheckStatisticGroup) : LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingCheckGiftsStatistic : R.string.BoostingCheckGiftsStatisticGroup), g6.Gi, 0, new eg.i(chat), c6Var2), i21);
                M.j = 5000;
                M.j();
                break;
            case 2:
                k7 k7Var = (k7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.b;
                ArrayList arrayList = k7Var.l;
                int i22 = k7Var.a;
                if (iArr[0] == k7Var.m) {
                    k7Var.i = false;
                    k7Var.m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i22).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i22).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z13) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        k7Var.k = tL_payments_savedStarGifts.next_offset;
                        k7Var.n = tL_payments_savedStarGifts.count;
                        k7Var.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        k7Var.j = arrayList.size() > k7Var.n || k7Var.k == null;
                    } else {
                        k7Var.j = true;
                    }
                    NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k7Var.b), k7Var);
                    break;
                }
                break;
            case 3:
                d3 d3Var = (d3) this.c;
                View view = (View) this.d;
                kg.q0 q0Var = (kg.q0) this.e;
                boolean z14 = this.b;
                d4 d4Var = d3Var.a;
                c5.a0(d4Var.y2, 1, d4Var.x1, new c3(d3Var, z14, q0Var, view));
                break;
            case 4:
                nh.r1 r1Var = (nh.r1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str2 = (String) this.e;
                boolean z15 = this.b;
                nh.t1 t1Var = r1Var.s;
                if (r1Var.r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        nh.k2 k2Var = t1Var.r;
                        ArrayList arrayList2 = t1Var.n;
                        i10 = ((f3) k2Var).currentAccount;
                        MessagesStorage.getInstance(i10).saveBotCache(str2, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z15) {
                            arrayList2.clear();
                        }
                        arrayList2.size();
                        arrayList2.addAll(messages_botresults.results);
                        r1Var.l();
                    }
                    t1Var.d.c(false);
                    r1Var.r = false;
                    break;
                }
                break;
            case 5:
                o7 o7Var = (o7) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z16 = this.b;
                Runnable runnable = (Runnable) this.e;
                o7Var.getClass();
                try {
                    bitmap.compress(z16 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(o7Var.Z0));
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                    if (z16) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(o7Var.Z0));
                        } catch (Exception e11) {
                            FileLog.e((Throwable) e11, false);
                        }
                    }
                }
                bitmap.recycle();
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 6:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                break;
            case 7:
                String[] strArr = (String[]) this.c;
                f6 f6Var = (f6) this.d;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.q qVar = (org.telegram.ui.ActionBar.q) this.e;
                try {
                    g6.g0 = g6.ql.get(g6.g5, -1);
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
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (!z17 && g6.M == null) {
                        g6.K = f6Var;
                        if (g6.I != g6.J) {
                            z10 = false;
                        }
                        if (z10) {
                            g6.T = 2000;
                            g6.U = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new o0(i14), 2100L);
                        }
                    }
                    g6.I = f6Var;
                    g6.n1(false, false);
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (g6.M == null && !g6.Q) {
                    MessagesController.getInstance(f6Var.A).saveTheme(f6Var, f6Var.k(false), z17, false);
                }
                qVar.run();
                break;
            case 8:
                tn.U((tn) this.c, (String) this.d, (MessageObject) this.e, this.b);
                break;
            case 9:
                fn fnVar = (fn) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z18 = this.b;
                MessageObject messageObject = (MessageObject) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i24 = R.string.SuggestedMessageAcceptInfo;
                tn tnVar = fnVar.a;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i24, tnVar.getMessagesController().getPeerName(DialogObject.getPeerDialogId(message.from_id)))));
                spannableStringBuilder.append((CharSequence) "\n\n");
                kf.a m10 = kf.a.m(message.suggested_post.price);
                int i25 = m10.a == kf.b.b ? tnVar.getMessagesController().config.tonSuggestedPostCommissionPermille.get() : tnVar.getMessagesController().config.starsSuggestedPostCommissionPermille.get();
                if (z18) {
                    c3 = 0;
                    m10 = kf.a.i((m10.b / 1000) * i25, m10.a);
                } else {
                    c3 = 0;
                }
                kf.a aVar2 = m10;
                if (message.suggested_post.schedule_date == 0) {
                    if (z18) {
                        int i26 = R.string.SuggestedMessageAcceptInfoAnytimeAdmin2;
                        String f9 = aVar2.f();
                        String G0 = ph.j.G0(i25);
                        Object[] objArr = new Object[2];
                        objArr[c3] = f9;
                        objArr[1] = G0;
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i26, objArr)));
                    } else {
                        int i27 = R.string.SuggestedMessageAcceptInfoAnytimeUser2;
                        Object[] objArr2 = new Object[1];
                        objArr2[c3] = aVar2.f();
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i27, objArr2)));
                    }
                    aVar = aVar2;
                } else if (z18) {
                    int i28 = R.string.SuggestedMessageAcceptInfoAdmin2;
                    String f10 = aVar2.f();
                    aVar = aVar2;
                    String o10 = jh.s0.o(message.suggested_post.schedule_date);
                    String G02 = ph.j.G0(i25);
                    Object[] objArr3 = new Object[3];
                    objArr3[c3] = f10;
                    objArr3[1] = o10;
                    objArr3[2] = G02;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i28, objArr3)));
                } else {
                    aVar = aVar2;
                    int i29 = R.string.SuggestedMessageAcceptInfoUser2;
                    String f11 = aVar.f();
                    String o11 = jh.s0.o(message.suggested_post.schedule_date);
                    Object[] objArr4 = new Object[2];
                    objArr4[c3] = f11;
                    objArr4[1] = o11;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i29, objArr4)));
                }
                spannableStringBuilder.append(' ');
                int i30 = R.string.SuggestedMessageAcceptInfo3;
                i11 = ((o2) tnVar).currentAccount;
                Object[] objArr5 = new Object[1];
                objArr5[c3] = Long.valueOf(MessagesController.getInstance(i11).config.starsSuggestedPostAgeMin.get(TimeUnit.HOURS));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i30, objArr5)));
                mc[] mcVarArr = new mc[1];
                s5 s5Var = new s5(mcVarArr, 4);
                org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
                org.telegram.ui.ActionBar.c2 v02 = c5.v0(tnVar, LocaleController.getString(R.string.SuggestedPostAcceptTitle), spannableStringBuilder, LocaleController.getString(message.suggested_post.schedule_date == 0 ? R.string.Next : R.string.SuggestedPostPublish), false, new eg.k0(fnVar, message, c2VarArr, messageObject, s5Var, 26));
                c2VarArr[c3] = v02;
                v02.setOnDismissListener(s5Var);
                if (z18 && aVar.a == kf.b.a) {
                    gb a2 = hb.a(tnVar.getParentActivity());
                    c6Var = ((o2) tnVar).resourceProvider;
                    mc G = new tc(a2, c6Var).G(R.raw.info, 10, LocaleController.getString(R.string.SuggestedMessageAcceptStarsDisclaimer));
                    G.j = 60000;
                    G.k(true);
                    mcVarArr[c3] = G;
                    break;
                }
                break;
            case 10:
                rn rnVar = (rn) this.c;
                rnVar.j((b4) this.d, (TLRPC.WallPaper) this.e, this.b);
                rnVar.g(rnVar.n);
                km kmVar = rnVar.R.T0;
                if (kmVar != null && (h0Var = kmVar.H) != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 11:
                yo yoVar = (yo) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                boolean z19 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject3;
                    yoVar.h0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = yoVar.U;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z19) {
                        if (yoVar.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                            yoVar.showDialog(alertDialog$Builder.a);
                        }
                    }
                }
                r80 r80Var = yoVar.C;
                if (r80Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = yoVar.h0;
                    r80Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    yoVar.C.c(yoVar.h0, yoVar.V);
                    break;
                }
                break;
            case 12:
                gp gpVar = (gp) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                boolean z20 = this.b;
                f80 f80Var = (f80) this.e;
                chat2.join_to_send = z20;
                gpVar.x.d.getMessagesController().toggleChatJoinToSend(chat2.id, z20, new r5(gpVar, z20, chat2, i15), new vf(i14, gpVar, f80Var));
                break;
            case 13:
                gp gpVar2 = (gp) this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                boolean z21 = this.b;
                e80 e80Var = (e80) this.e;
                chat3.join_request = z21;
                gpVar2.x.d.getMessagesController().toggleChatJoinRequest(chat3.id, z21, new fp(gpVar2, i19), new vf(22, gpVar2, e80Var));
                break;
            case 14:
                boolean z22 = this.b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
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
                ik ikVar = (ik) this.c;
                String str4 = (String) this.d;
                boolean z23 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                ikVar.getClass();
                String lowerCase = str4.trim().toLowerCase();
                int i31 = 18;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new z2(i31, ikVar, new ArrayList()));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                    }
                    int i32 = (str != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i32];
                    strArr2[0] = lowerCase;
                    if (str != null) {
                        strArr2[1] = str;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    if (!z23) {
                        for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                            ck ckVar = (ck) arrayList3.get(i33);
                            File file = ckVar.f;
                            if (file != null && !file.isDirectory()) {
                                int i34 = 0;
                                while (true) {
                                    if (i34 < i32) {
                                        String str5 = strArr2[i34];
                                        String str6 = ckVar.b;
                                        if (str6 != null ? str6.toLowerCase().contains(str5) : false) {
                                            arrayList4.add(ckVar);
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new z2(i31, ikVar, arrayList4));
                    break;
                }
                break;
            case 16:
                c80.t((c80) this.c, (TLRPC.TL_error) this.d, this.b, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 17:
                cx0 cx0Var = (cx0) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                boolean z24 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                nx0 nx0Var = cx0Var.a;
                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject4;
                    MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                    if (z24) {
                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject4, 0, null, false, false);
                    } else {
                        nx0Var.O = tL_messages_stickerSet;
                        nx0Var.t0();
                        nx0Var.B0();
                    }
                }
                c2Var.dismiss();
                break;
            case 18:
                f3 f3Var = (f3) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z25 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                if (f3Var != null && !f3Var.isDismissed()) {
                    f3Var.setFocusable(true);
                    editTextBoldCursor.requestFocus();
                    if (z25) {
                        AndroidUtilities.runOnUIThread(new xg(i16, editTextBoldCursor));
                        break;
                    }
                } else if (c2Var2 != null && c2Var2.isShowing()) {
                    c2Var2.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z25) {
                        AndroidUtilities.runOnUIThread(new xg(i18, editTextBoldCursor));
                        break;
                    }
                }
                break;
            case 19:
                r50 r50Var = (r50) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z26 = this.b;
                if (tLObject5 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        break;
                    } else {
                        r50Var.u1(null, tL_chatInviteExported3.link, true, z26);
                        break;
                    }
                }
                break;
            case 20:
                v60 v60Var = (v60) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                boolean z27 = this.b;
                if (tL_error2 == null) {
                    v60Var.f = (TLRPC.TL_chatInviteExported) tLObject6;
                    if (z27) {
                        if (v60Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(v60Var.getParentActivity());
                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.RevokeAlertNewLink);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.OK), null);
                            v60Var.showDialog(alertDialog$Builder3.a);
                        }
                    }
                }
                v60Var.e = false;
                v60Var.a.l();
                break;
            case 21:
                hm0 hm0Var = (hm0) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                boolean z28 = this.b;
                vm0 vm0Var = hm0Var.e;
                if (tL_error3 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    vm0Var.F = password;
                    TwoStepVerificationActivity.m0(password);
                    vm0Var.B1(z28);
                    break;
                }
                break;
            case 22:
                hm0 hm0Var2 = (hm0) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z29 = this.b;
                vm0 vm0Var2 = hm0Var2.e;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject8;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                if (tL_secureSecretSettings != null) {
                    vm0Var2.Y0 = tL_secureSecretSettings.secure_secret;
                    vm0Var2.X0 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        vm0Var2.a1 = Utilities.computeSHA512(bArr, AndroidUtilities.getStringBytes(str7), bArr);
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                        byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                        vm0Var2.a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                        bArr2 = bArr4;
                        AndroidUtilities.runOnUIThread(new w0(hm0Var2, passwordsettings, z29, bArr2, 23));
                        break;
                    } else if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                        AndroidUtilities.runOnUIThread(new vk0(hm0Var2, i18));
                        break;
                    } else {
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = vm0Var2.F.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        vm0Var2.a1 = Utilities.computePBKDF2(AndroidUtilities.getStringBytes(str7), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    vm0Var2.Y0 = null;
                    vm0Var2.X0 = 0L;
                }
                bArr2 = bArr;
                AndroidUtilities.runOnUIThread(new w0(hm0Var2, passwordsettings, z29, bArr2, 23));
            case 23:
                hm0 hm0Var3 = (hm0) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z30 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                vm0 vm0Var3 = hm0Var3.e;
                vm0Var3.Z0 = passwordsettings2.email;
                if (z30) {
                    vm0Var3.a1 = vm0Var3.L0;
                }
                byte[] bArr7 = vm0Var3.Y0;
                byte[] bArr8 = vm0Var3.a1;
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
                if (vm0.Z0(bArr3, Long.valueOf(vm0Var3.X0)) && bArr6.length != 0 && vm0Var3.X0 != 0) {
                    if (vm0Var3.c == 0) {
                        TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                        i13 = ((o2) vm0Var3).currentAccount;
                        ConnectionsManager.getInstance(i13).sendRequest(getallsecurevalues, new fm0(hm0Var3, i19));
                        break;
                    } else {
                        hm0Var3.a();
                        break;
                    }
                } else if (z30) {
                    i12 = ((o2) vm0Var3).currentAccount;
                    UserConfig.getInstance(i12).resetSavedPassword();
                    vm0Var3.J0 = 0;
                    vm0Var3.R1();
                    break;
                } else {
                    TL_account.authorizationForm authorizationform = vm0Var3.y;
                    if (authorizationform != null) {
                        authorizationform.values.clear();
                        vm0Var3.y.errors.clear();
                    }
                    byte[] bArr12 = vm0Var3.Y0;
                    if (bArr12 != null && bArr12.length != 0) {
                        hm0Var3.b();
                        break;
                    } else {
                        Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.b, hm0Var3.d, i17));
                        break;
                    }
                }
                break;
            case 24:
                bo0 bo0Var = (bo0) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                boolean z31 = this.b;
                if (tL_error4 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject9;
                    bo0Var.W = password2;
                    TwoStepVerificationActivity.m0(password2);
                    bo0Var.A0(z31);
                    break;
                }
                break;
            case 25:
                a21.W((a21) this.c, this.b, (b4) this.d, (a5) this.e);
                break;
            case 26:
                cg1.c0((cg1) this.c, (TLRPC.TL_error) this.d, (TLObject) this.e, this.b);
                break;
            case 27:
                rf.a0 a0Var = (rf.a0) this.c;
                boolean z32 = this.b;
                s3 s3Var = (s3) this.d;
                rf.x xVar = (rf.x) this.e;
                if (!z32) {
                    a0Var.c = xVar;
                    s3Var.setRightText(a0Var.H(xVar));
                    s3Var.setRightTextMargin(6);
                    a0Var.E.clear();
                    a0Var.d = true;
                    a0Var.l();
                    a0Var.Q();
                    break;
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                o2 o2Var = (o2) this.d;
                boolean z33 = this.b;
                m3 m3Var = (m3) this.e;
                String trim = editTextBoldCursor2.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    th.b4.k(o2Var, z33, new fi1(i17, m3Var, trim));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w0(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ w0(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ w0(d3 d3Var, View view, kg.q0 q0Var, boolean z10, boolean z11) {
        this.a = 3;
        this.c = d3Var;
        this.d = view;
        this.e = q0Var;
        this.b = z10;
    }

    public /* synthetic */ w0(boolean z10, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = 14;
        this.b = z10;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
