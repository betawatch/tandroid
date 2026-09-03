package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        nh.e1 e1Var;
        ph.ca caVar;
        nh.h9 h9Var;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.b;
                if (((t7) this.c).e) {
                    g5Var.g0.setLoading(false);
                    g5Var.w1();
                    break;
                } else {
                    ic Q = g5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 1:
                ((g5) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 2:
                MessagesController.getInstance(((g5) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 3:
                g5 g5Var2 = (g5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                g5Var2.getClass();
                zArr[0] = true;
                g5Var2.g0.setLoading(false);
                g5Var2.w1();
                break;
            case 4:
                g5 g5Var3 = (g5) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                g5Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 5:
                g5 g5Var4 = (g5) this.b;
                qc.a0((zn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(g5Var4.U))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new t1(g5Var4, 8)).k(true);
                break;
            case 6:
                ((g5) this.b).n2((CharSequence) this.c);
                break;
            case 7:
                g5.I0((g5) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                d2Var.dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = qc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = qc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    kf.k0.v(i11, a02, i10, 36);
                    break;
                }
                break;
            case 9:
                l5 l5Var = (l5) this.b;
                zn znVar = (zn) this.c;
                org.telegram.ui.Cells.a0 a0Var = l5Var.b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = l5Var.b;
                    if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((a0Var2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    s7 s7Var = t7.y(messageObject.currentAccount, false).B;
                    if (s7Var != null) {
                        s7Var.b();
                    }
                    TLRPC.ChatFull chatFull = znVar.W7;
                    MessageObject messageObject2 = messageObject;
                    eb ebVar = new eb(l5Var.getContext(), znVar.getCurrentAccount(), znVar.a(), znVar, messageObject2, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, znVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = l5Var.b;
                    ebVar.Q = znVar;
                    ebVar.R = a0Var3;
                    ebVar.show();
                    break;
                }
                break;
            case 10:
                TLObject tLObject = (TLObject) this.b;
                cg.h0 h0Var = (cg.h0) this.c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    h0Var.run((TL_stars.StarGifts) tLObject);
                    break;
                } else {
                    h0Var.run(null);
                    break;
                }
            case 11:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (!zArr2[0]) {
                    callback2.run("cancelled", 0L);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 12:
                l7 l7Var = (l7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = l7Var.l;
                int i13 = l7Var.a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    MessagesController.getInstance(i13).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i13).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i14 = 0;
                        while (i14 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i14)).pinned_to_top) {
                            i14++;
                        }
                        arrayList3.add(i14, savedStarGift);
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l7Var.b), l7Var);
                        break;
                    }
                }
                break;
            case 13:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 14:
                new qc(((org.telegram.ui.ActionBar.g3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 15:
                eb ebVar2 = (eb) this.b;
                s7 s7Var2 = (s7) this.c;
                ebVar2.O = true;
                ebVar2.o(new q7(s7Var2, 2));
                AndroidUtilities.runOnUIThread(new ka(ebVar2, 1), 240L);
                break;
            case 16:
                mg.s sVar = (mg.s) this.b;
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                for (org.telegram.ui.Components.u5 u5Var2 : (org.telegram.ui.Components.u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u5.class)) {
                    if (u5Var2 == u5Var) {
                        int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(u5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(u5Var2);
                        sVar.n.getText().delete(spanStart, spanEnd);
                        int i15 = spanEnd - spanStart;
                        mg.p pVar = sVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i15;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 17:
                mg.s sVar2 = (mg.s) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (sVar2.N == null || !tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    String str = tL_error2.text;
                    if (str.equals("REACTIONS_TOO_MANY")) {
                        str = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.G, new Object[0]);
                    }
                    qc.a0(sVar2).t(str, null).j();
                    break;
                } else {
                    mg.s0.f(-sVar2.J, sVar2.O, sVar2.N);
                    break;
                }
                break;
            case 18:
                mg.q qVar = (mg.q) this.b;
                org.telegram.ui.Components.u5 u5Var3 = (org.telegram.ui.Components.u5) this.c;
                mg.s sVar3 = qVar.b2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.n.getText());
                for (org.telegram.ui.Components.u5 u5Var4 : (org.telegram.ui.Components.u5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.u5.class)) {
                    if (u5Var4 == u5Var3) {
                        int editTextSelectionEnd2 = sVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(u5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(u5Var4);
                        sVar3.n.getText().delete(spanStart2, spanEnd2);
                        int i16 = spanEnd2 - spanStart2;
                        mg.p pVar2 = sVar3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i16;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        break;
                    }
                }
                break;
            case 19:
                mg.d0 d0Var = (mg.d0) this.b;
                pk0 pk0Var = (pk0) this.c;
                d0Var.l = true;
                d0Var.a.invalidate();
                pk0Var.Y0 = false;
                pk0Var.invalidate();
                d0Var.c(true);
                break;
            case 20:
                mg.f0 f0Var = (mg.f0) this.b;
                mg.b bVar = (mg.b) this.c;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                break;
            case 21:
                mg.r0 r0Var = (mg.r0) this.b;
                mg.o0 o0Var = (mg.o0) this.c;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.a;
                ViewParent viewParent = r0Var.z;
                if (e2.c.s(viewParent)) {
                    ((org.telegram.ui.Cells.n4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                break;
            case 22:
                ((nh.i9) this.b).H(ProfileActivity.m4(((nh.t0) this.c).c));
                break;
            case 23:
                nh.g2 g2Var = (nh.g2) this.b;
                AndroidUtilities.addToClipboard(((nh.o0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(g2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 24:
                nh.g2 g2Var2 = (nh.g2) this.b;
                nh.t0 t0Var = (nh.t0) this.c;
                long j10 = t0Var.c;
                nh.d4 d4Var = g2Var2.f0;
                if (j10 != UserConfig.getInstance(d4Var.z2).getClientUserId() && ((e1Var = g2Var2.e0.x0) == null || j10 != DialogObject.getPeerDialogId(e1Var.i()))) {
                    if (d4Var.L3 != null) {
                        for (int i17 = 0; i17 < d4Var.L3.peers.size(); i17++) {
                            if (j10 != DialogObject.getPeerDialogId(d4Var.L3.peers.get(i17).peer)) {
                            }
                        }
                    }
                    Context context = g2Var2.getContext();
                    long j11 = t0Var.c;
                    nh.a0 a0Var4 = new nh.a0(i12, g2Var2, t0Var);
                    nh.j0 j0Var = new nh.j0();
                    org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, j0Var, false, false);
                    g3Var.fixNavigationBar();
                    LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                    TextView g10 = org.telegram.messenger.y3.g(context, 1, 20.0f);
                    g10.setTextColor(j0Var.x0(org.telegram.ui.ActionBar.j6.j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f10.addView(g10, k7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, j0Var);
                    l4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f10.addView(l4Var, k7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context, j0Var, true);
                    kp checkBoxRound = y1Var.getCheckBoxRound();
                    int i18 = org.telegram.ui.ActionBar.j6.V6;
                    int i19 = org.telegram.ui.ActionBar.j6.g7;
                    int i20 = org.telegram.ui.ActionBar.j6.k7;
                    checkBoxRound.b(i18, i19, i20);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() { // from class: nh.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    y1Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    y1Var.c(!r3.b(), true);
                                    break;
                                default:
                                    y1Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i21 = org.telegram.ui.ActionBar.j6.i6;
                    y1Var.setBackground(org.telegram.ui.ActionBar.j6.f0(j0Var.x0(i21), 2, -1));
                    f10.addView(y1Var, k7.b6.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context, j0Var, true);
                    y1Var2.getCheckBoxRound().b(i18, i19, i20);
                    final int i22 = 1;
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() { // from class: nh.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    y1Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    y1Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    y1Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    y1Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(j0Var.x0(i21), 2, -1));
                    f10.addView(y1Var2, k7.b6.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context, j0Var, true);
                    y1Var3.getCheckBoxRound().b(i18, i19, i20);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i23 = 2;
                    y1Var3.setOnClickListener(new View.OnClickListener() { // from class: nh.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    y1Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    y1Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    y1Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    y1Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(j0Var.x0(i21), 2, -1));
                    f10.addView(y1Var3, k7.b6.n(-1, -2));
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context, j0Var);
                    z8Var.setBackgroundColor(-16777216);
                    z8Var.setFixedSize(12);
                    f10.addView(z8Var, k7.b6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ph.d dVar = new ph.d(context, j0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new nh.c0(y1Var, y1Var2, y1Var3, a0Var4, g3Var, 0));
                    frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, k7.b6.n(-1, -2));
                    g3Var.setCustomView(f10);
                    g3Var.show();
                    break;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = g2Var2.L;
                deletegroupcallmessages.messages.add(Integer.valueOf(t0Var.a));
                ConnectionsManager.getInstance(g2Var2.K).sendRequest(deletegroupcallmessages, null);
                g2Var2.c(t0Var.a);
                break;
            case 25:
                nh.e1 e1Var2 = (nh.e1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                e1Var2.getClass();
                int size = arrayList4.size();
                int i24 = 0;
                while (i24 < size) {
                    Object obj = arrayList4.get(i24);
                    i24++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(e1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 26:
                ((nh.e1) this.b).C.remove((String) this.c);
                break;
            case 27:
                nh.d4 d4Var2 = (nh.d4) this.b;
                ph.f3 f3Var = (ph.f3) this.c;
                d4Var2.removeView(f3Var);
                if (d4Var2.a2 == f3Var) {
                    d4Var2.a2 = null;
                    break;
                }
                break;
            case 28:
                nh.d4 d4Var3 = (nh.d4) this.b;
                ph.da E = ph.da.E((Activity) this.c, d4Var3.z2);
                nh.c4 c4Var = d4Var3.J2;
                long j12 = (c4Var == null || (h9Var = c4Var.b) == null) ? 0L : h9Var.currentPosition;
                File h = d4Var3.L1.h();
                TL_stories.StoryItem storyItem = d4Var3.L1.a;
                ph.t6 t6Var = new ph.t6();
                t6Var.n = true;
                t6Var.t = storyItem.media;
                int i25 = t6Var.a;
                t6Var.q = MessagesController.getInstance(i25).getPeer(storyItem.dialogId);
                t6Var.r = storyItem.id;
                t6Var.s = storyItem.caption;
                t6Var.L = h;
                t6Var.M = false;
                t6Var.k0 = 720;
                t6Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    t6Var.K = false;
                    if (h != null) {
                        t6Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    t6Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i26);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    t6Var.k0 = documentAttribute.w;
                                    t6Var.l0 = documentAttribute.h;
                                    t6Var.i = documentAttribute.duration;
                                } else {
                                    i26++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            t6Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i27 = 0; i27 < storyItem.media.document.thumbs.size(); i27++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i27);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    t6Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i25).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        t6Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                t6Var.A();
                t6Var.e(storyItem);
                ph.w9 d = ph.y9.d(d4Var3.G0);
                RectF rectF = E.E;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i28 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i28).isFrozen()) {
                        org.telegram.ui.c.b(i28);
                    } else {
                        E.r0 = false;
                        E.e = false;
                        E.y2 = false;
                        if (windowManager != null && (caVar = E.n) != null && caVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.H1 = t6Var;
                        ph.f8.a(i28, t6Var);
                        ph.t6 t6Var2 = E.H1;
                        E.L1 = (t6Var2 == null || !t6Var2.K) ? 0 : 1;
                        E.p0.g = false;
                        if (d != null) {
                            E.C = d;
                            E.G = d.a;
                            rectF.set(d.c);
                            E.D = d.b;
                            E.C.e();
                        } else {
                            E.G = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.D = AndroidUtilities.dp(8.0f);
                        }
                        E.r.c();
                        ph.p9 p9Var = E.e0;
                        int i29 = E.G;
                        p9Var.setBackgroundColor((i29 == 1 || i29 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.H = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        ph.t6 t6Var3 = E.H1;
                        if (t6Var3 != null) {
                            E.Z0.setText(t6Var3.C0);
                        }
                        E.L(new ph.g8(E, 7), j12);
                        E.Y0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.s0 = 0L;
                        E.t0 = "";
                    }
                }
                E.N = new nh.w1(d4Var3, 12);
                E.O = new nh.b2(i12, d4Var3, E);
                break;
            default:
                nh.w3 w3Var = (nh.w3) this.b;
                nh.i9 i9Var = (nh.i9) this.c;
                w3Var.getClass();
                ((nh.z8) w3Var.l.N1).h(new eg.o1(i9Var.f, 14, false));
                break;
        }
    }

    public /* synthetic */ n2(t7 t7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 11;
        this.b = zArr;
        this.c = callback2;
    }
}
