package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.media.AudioTrack;
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
import nh.gb;
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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        lh.d1 d1Var;
        nh.fb fbVar;
        lh.h9 h9Var;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(((h5) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 1:
                h5 h5Var = (h5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h5Var.getClass();
                zArr[0] = true;
                h5Var.f0.setLoading(false);
                h5Var.w1();
                return;
            case 2:
                h5 h5Var2 = (h5) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                h5Var2.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 3:
                h5 h5Var3 = (h5) this.b;
                tc.a0((tn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(h5Var3.T))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new t1(h5Var3, 8)).k(true);
                return;
            case 4:
                ((h5) this.b).n2((CharSequence) this.c);
                return;
            case 5:
                h5.I0((h5) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 6:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                c2Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = tc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = tc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    j7.l1.v(i11, a02, i10, 36);
                    return;
                }
                return;
            case 7:
                m5 m5Var = (m5) this.b;
                tn tnVar = (tn) this.c;
                org.telegram.ui.Cells.a0 a0Var = m5Var.b;
                if (a0Var == null) {
                    return;
                }
                try {
                    a0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                m5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                org.telegram.ui.Cells.a0 a0Var2 = m5Var.b;
                if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) a0Var2).getPrimaryMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                } else {
                    if (!(a0Var2 instanceof org.telegram.ui.Cells.v0) || (messageObject = ((org.telegram.ui.Cells.v0) a0Var2).getMessageObject()) == null) {
                        return;
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                        arrayList = tL_messageReactions.top_reactors;
                    }
                }
                ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                r7 r7Var = s7.y(messageObject.currentAccount, false).B;
                if (r7Var != null) {
                    r7Var.b();
                }
                TLRPC.ChatFull chatFull = tnVar.V7;
                MessageObject messageObject2 = messageObject;
                db dbVar = new db(m5Var.getContext(), tnVar.getCurrentAccount(), tnVar.a(), tnVar, messageObject2, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, tnVar.getResourceProvider());
                messageObject2.getId();
                org.telegram.ui.Cells.a0 a0Var3 = m5Var.b;
                dbVar.P = tnVar;
                dbVar.Q = a0Var3;
                dbVar.show();
                return;
            case 8:
                TLObject tLObject = (TLObject) this.c;
                ag.i0 i0Var = (ag.i0) this.b;
                if (tLObject instanceof TL_stars.StarGifts) {
                    i0Var.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    i0Var.run(null);
                    return;
                }
            case 9:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (zArr2[0]) {
                    return;
                }
                callback2.run("cancelled", 0L);
                zArr2[0] = true;
                return;
            case 10:
                k7 k7Var = (k7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = k7Var.l;
                int i13 = k7Var.a;
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
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k7Var.b), k7Var);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 12:
                new tc(((org.telegram.ui.ActionBar.f3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 13:
                db dbVar2 = (db) this.b;
                r7 r7Var2 = (r7) this.c;
                dbVar2.N = true;
                dbVar2.o(new p7(r7Var2, 2));
                AndroidUtilities.runOnUIThread(new ja(dbVar2, 1), 240L);
                return;
            case 14:
                kg.s sVar = (kg.s) this.b;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        sVar.n.getText().delete(spanStart, spanEnd);
                        int i15 = spanEnd - spanStart;
                        kg.p pVar = sVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i15;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 15:
                kg.s sVar2 = (kg.s) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (sVar2.M != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    kg.s0.f(-sVar2.I, sVar2.N, sVar2.M);
                    return;
                }
                String str = tL_error2.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.F, new Object[0]);
                }
                tc.a0(sVar2).t(str, null).j();
                return;
            case 16:
                kg.q qVar = (kg.q) this.b;
                org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) this.c;
                kg.s sVar3 = qVar.a2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.n.getText());
                for (org.telegram.ui.Components.y5 y5Var4 : (org.telegram.ui.Components.y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var4 == y5Var3) {
                        int editTextSelectionEnd2 = sVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(y5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(y5Var4);
                        sVar3.n.getText().delete(spanStart2, spanEnd2);
                        int i16 = spanEnd2 - spanStart2;
                        kg.p pVar2 = sVar3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i16;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 17:
                kg.d0 d0Var = (kg.d0) this.b;
                fk0 fk0Var = (fk0) this.c;
                d0Var.l = true;
                d0Var.a.invalidate();
                fk0Var.X0 = false;
                fk0Var.invalidate();
                d0Var.c(true);
                return;
            case 18:
                kg.f0 f0Var = (kg.f0) this.b;
                kg.b bVar = (kg.b) this.c;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                return;
            case 19:
                kg.r0 r0Var = (kg.r0) this.b;
                kg.o0 o0Var = (kg.o0) this.c;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.a;
                ViewParent viewParent = r0Var.z;
                if (com.google.android.recaptcha.internal.a.u(viewParent)) {
                    ((org.telegram.ui.Cells.m4) viewParent).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                return;
            case 20:
                l3.n nVar = (l3.n) this.b;
                String str2 = (String) this.c;
                l3.o oVar = nVar.b;
                int i17 = f5.d0.a;
                k3.f fVar = ((j3.h0) oVar).a.r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1012, new d3(k9, str2, 21));
                return;
            case 21:
                AudioTrack audioTrack = (AudioTrack) this.b;
                f5.c cVar = (f5.c) this.c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (l3.k0.d0) {
                        try {
                            int i18 = l3.k0.f0 - 1;
                            l3.k0.f0 = i18;
                            if (i18 == 0) {
                                l3.k0.e0.shutdown();
                                l3.k0.e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    cVar.c();
                    synchronized (l3.k0.d0) {
                        try {
                            int i19 = l3.k0.f0 - 1;
                            l3.k0.f0 = i19;
                            if (i19 == 0) {
                                l3.k0.e0.shutdown();
                                l3.k0.e0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 22:
                l4.r0 r0Var2 = (l4.r0) this.b;
                o3.t tVar = (o3.t) this.c;
                r0Var2.K = r0Var2.D == null ? tVar : new o3.o(-9223372036854775807L);
                r0Var2.L = tVar.h();
                boolean z10 = !r0Var2.R && tVar.h() == -9223372036854775807L;
                r0Var2.M = z10;
                r0Var2.N = z10 ? 7 : 1;
                r0Var2.h.t(r0Var2.L, tVar.c(), r0Var2.M);
                if (r0Var2.H) {
                    return;
                }
                r0Var2.l();
                return;
            case 23:
                ((lh.i9) this.b).H(ProfileActivity.m4(((lh.s0) this.c).c));
                return;
            case 24:
                lh.f2 f2Var = (lh.f2) this.b;
                AndroidUtilities.addToClipboard(((lh.n0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(f2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 25:
                lh.f2 f2Var2 = (lh.f2) this.b;
                lh.s0 s0Var = (lh.s0) this.c;
                long j10 = s0Var.c;
                lh.d4 d4Var = f2Var2.e0;
                if (j10 != UserConfig.getInstance(d4Var.y2).getClientUserId() && ((d1Var = f2Var2.d0.w0) == null || j10 != DialogObject.getPeerDialogId(d1Var.i()))) {
                    if (d4Var.K3 != null) {
                        for (int i20 = 0; i20 < d4Var.K3.peers.size(); i20++) {
                            if (j10 != DialogObject.getPeerDialogId(d4Var.K3.peers.get(i20).peer)) {
                            }
                        }
                    }
                    Context context = f2Var2.getContext();
                    long j11 = s0Var.c;
                    lh.z zVar = new lh.z(i12, f2Var2, s0Var);
                    lh.i0 i0Var2 = new lh.i0();
                    org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, i0Var2, false, false);
                    f3Var.fixNavigationBar();
                    LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                    TextView h = org.telegram.messenger.x3.h(context, 1, 20.0f);
                    h.setTextColor(i0Var2.C0(org.telegram.ui.ActionBar.g6.j5));
                    h.setTypeface(AndroidUtilities.bold());
                    h.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    g10.addView(h, i7.f6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, i0Var2);
                    k4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    g10.addView(k4Var, i7.f6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context, i0Var2, true);
                    hp checkBoxRound = y1Var.getCheckBoxRound();
                    int i21 = org.telegram.ui.ActionBar.g6.V6;
                    int i22 = org.telegram.ui.ActionBar.g6.g7;
                    int i23 = org.telegram.ui.ActionBar.g6.k7;
                    checkBoxRound.b(i21, i22, i23);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() { // from class: lh.a0
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
                    int i24 = org.telegram.ui.ActionBar.g6.i6;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var2.C0(i24), 2, -1));
                    g10.addView(y1Var, i7.f6.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context, i0Var2, true);
                    y1Var2.getCheckBoxRound().b(i21, i22, i23);
                    final int i25 = 1;
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() { // from class: lh.a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
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
                    y1Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var2.C0(i24), 2, -1));
                    g10.addView(y1Var2, i7.f6.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context, i0Var2, true);
                    y1Var3.getCheckBoxRound().b(i21, i22, i23);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i26 = 2;
                    y1Var3.setOnClickListener(new View.OnClickListener() { // from class: lh.a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
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
                    y1Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var2.C0(i24), 2, -1));
                    g10.addView(y1Var3, i7.f6.n(-1, -2));
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, i0Var2);
                    y8Var.setBackgroundColor(-16777216);
                    y8Var.setFixedSize(12);
                    g10.addView(y8Var, i7.f6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    nh.d dVar = new nh.d(context, i0Var2, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new lh.b0(y1Var, y1Var2, y1Var3, zVar, f3Var, 0));
                    frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, i7.f6.n(-1, -2));
                    f3Var.setCustomView(g10);
                    f3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = f2Var2.K;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.a));
                ConnectionsManager.getInstance(f2Var2.J).sendRequest(deletegroupcallmessages, null);
                f2Var2.c(s0Var.a);
                return;
            case 26:
                lh.d1 d1Var2 = (lh.d1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                d1Var2.getClass();
                int size = arrayList4.size();
                int i27 = 0;
                while (i27 < size) {
                    Object obj = arrayList4.get(i27);
                    i27++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(d1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 27:
                ((lh.d1) this.b).B.remove((String) this.c);
                return;
            case 28:
                lh.d4 d4Var2 = (lh.d4) this.b;
                nh.t3 t3Var = (nh.t3) this.c;
                d4Var2.removeView(t3Var);
                if (d4Var2.Z1 == t3Var) {
                    d4Var2.Z1 = null;
                    return;
                }
                return;
            default:
                lh.d4 d4Var3 = (lh.d4) this.b;
                gb E = gb.E((Activity) this.c, d4Var3.y2);
                lh.c4 c4Var = d4Var3.I2;
                long j12 = (c4Var == null || (h9Var = c4Var.b) == null) ? 0L : h9Var.currentPosition;
                File h10 = d4Var3.K1.h();
                TL_stories.StoryItem storyItem = d4Var3.K1.a;
                nh.o7 o7Var = new nh.o7();
                o7Var.n = true;
                o7Var.t = storyItem.media;
                int i28 = o7Var.a;
                o7Var.q = MessagesController.getInstance(i28).getPeer(storyItem.dialogId);
                o7Var.r = storyItem.id;
                o7Var.s = storyItem.caption;
                o7Var.L = h10;
                o7Var.M = false;
                o7Var.k0 = 720;
                o7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    o7Var.K = false;
                    if (h10 != null) {
                        o7Var.h(h10.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    o7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i29);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    o7Var.k0 = documentAttribute.w;
                                    o7Var.l0 = documentAttribute.h;
                                    o7Var.i = documentAttribute.duration;
                                } else {
                                    i29++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str3 = storyItem.firstFramePath;
                        if (str3 != null) {
                            o7Var.N = str3;
                        } else if (document2.thumbs != null) {
                            for (int i30 = 0; i30 < storyItem.media.document.thumbs.size(); i30++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i30);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    o7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i28).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        o7Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                o7Var.A();
                o7Var.e(storyItem);
                nh.za d = nh.bb.d(d4Var3.F0);
                RectF rectF = E.D;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i31 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i31).isFrozen()) {
                        org.telegram.ui.c.b(i31);
                    } else {
                        E.q0 = false;
                        E.e = false;
                        E.x2 = false;
                        if (windowManager != null && (fbVar = E.n) != null && fbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.G1 = o7Var;
                        nh.f9.a(i31, o7Var);
                        nh.o7 o7Var2 = E.G1;
                        E.K1 = (o7Var2 == null || !o7Var2.K) ? 0 : 1;
                        E.o0.g = false;
                        if (d != null) {
                            E.B = d;
                            E.F = d.a;
                            rectF.set(d.c);
                            E.C = d.b;
                            E.B.e();
                        } else {
                            E.F = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.C = AndroidUtilities.dp(8.0f);
                        }
                        E.r.c();
                        nh.ta taVar = E.d0;
                        int i32 = E.F;
                        taVar.setBackgroundColor((i32 == 1 || i32 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.G = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        nh.o7 o7Var3 = E.G1;
                        if (o7Var3 != null) {
                            E.Y0.setText(o7Var3.C0);
                        }
                        E.L(new nh.g9(E, 7), j12);
                        E.X0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.r0 = 0L;
                        E.s0 = "";
                    }
                }
                E.M = new lh.v1(d4Var3, 12);
                E.N = new lh.a2(i12, d4Var3, E);
                return;
        }
    }

    public /* synthetic */ w2(s7 s7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 9;
        this.b = zArr;
        this.c = callback2;
    }

    public /* synthetic */ w2(TLObject tLObject, ag.i0 i0Var) {
        this.a = 8;
        this.c = tLObject;
        this.b = i0Var;
    }
}
