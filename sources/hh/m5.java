package hh;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.media.AudioTrack;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lh.nb;
import lh.rb;
import lh.sb;
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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        jh.d1 d1Var;
        rb rbVar;
        jh.h9 h9Var;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        r9 = null;
        String str = null;
        arrayList = null;
        arrayList = null;
        arrayList = null;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                rn rnVar = (rn) this.c;
                org.telegram.ui.Cells.a0 a0Var = o5Var.b;
                if (a0Var == null) {
                    return;
                }
                try {
                    a0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                o5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                org.telegram.ui.Cells.a0 a0Var2 = o5Var.b;
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
                t7 t7Var = u7.y(messageObject.currentAccount, false).B;
                if (t7Var != null) {
                    t7Var.b();
                }
                TLRPC.ChatFull chatFull = rnVar.V7;
                MessageObject messageObject2 = messageObject;
                jb jbVar = new jb(o5Var.getContext(), rnVar.getCurrentAccount(), rnVar.a(), rnVar, messageObject2, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, rnVar.getResourceProvider());
                messageObject2.getId();
                org.telegram.ui.Cells.a0 a0Var3 = o5Var.b;
                jbVar.P = rnVar;
                jbVar.Q = a0Var3;
                jbVar.show();
                return;
            case 1:
                TLObject tLObject = (TLObject) this.b;
                ag.n0 n0Var = (ag.n0) this.c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    n0Var.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    n0Var.run(null);
                    return;
                }
            case 2:
                boolean[] zArr = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (zArr[0]) {
                    return;
                }
                callback2.run("cancelled", 0L);
                zArr[0] = true;
                return;
            case 3:
                m7 m7Var = (m7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = m7Var.l;
                int i11 = m7Var.a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    MessagesController.getInstance(i11).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i11).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i12 = 0;
                        while (i12 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i12)).pinned_to_top) {
                            i12++;
                        }
                        arrayList3.add(i12, savedStarGift);
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m7Var.b), m7Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 5:
                new mc(((org.telegram.ui.ActionBar.e3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 6:
                jb jbVar2 = (jb) this.b;
                t7 t7Var2 = (t7) this.c;
                jbVar2.N = true;
                jbVar2.p(new r7(t7Var2, 2));
                AndroidUtilities.runOnUIThread(new pa(jbVar2, 1), 240L);
                return;
            case 7:
                ig.s sVar = (ig.s) this.b;
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                for (org.telegram.ui.Components.t5 t5Var2 : (org.telegram.ui.Components.t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.t5.class)) {
                    if (t5Var2 == t5Var) {
                        int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(t5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(t5Var2);
                        sVar.n.getText().delete(spanStart, spanEnd);
                        int i13 = spanEnd - spanStart;
                        ig.p pVar = sVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i13;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 8:
                ig.s sVar2 = (ig.s) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (sVar2.M != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    ig.s0.f(-sVar2.I, sVar2.N, sVar2.M);
                    return;
                }
                String str2 = tL_error.text;
                if (str2.equals("REACTIONS_TOO_MANY")) {
                    str2 = LocaleController.formatPluralString("ReactionMaxCountError", sVar2.F, new Object[0]);
                }
                mc.a0(sVar2).t(str2, null).j();
                return;
            case 9:
                ig.q qVar = (ig.q) this.b;
                org.telegram.ui.Components.t5 t5Var3 = (org.telegram.ui.Components.t5) this.c;
                ig.s sVar3 = qVar.a2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sVar3.n.getText());
                for (org.telegram.ui.Components.t5 t5Var4 : (org.telegram.ui.Components.t5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.t5.class)) {
                    if (t5Var4 == t5Var3) {
                        int editTextSelectionEnd2 = sVar3.n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(t5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(t5Var4);
                        sVar3.n.getText().delete(spanStart2, spanEnd2);
                        int i14 = spanEnd2 - spanStart2;
                        ig.p pVar2 = sVar3.n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i14;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 10:
                ig.d0 d0Var = (ig.d0) this.b;
                wj0 wj0Var = (wj0) this.c;
                d0Var.l = true;
                d0Var.a.invalidate();
                wj0Var.X0 = false;
                wj0Var.invalidate();
                d0Var.c(true);
                return;
            case 11:
                ig.f0 f0Var = (ig.f0) this.b;
                ig.b bVar = (ig.b) this.c;
                f0Var.getText().delete(f0Var.getText().getSpanStart(bVar), f0Var.getText().getSpanEnd(bVar));
                f0Var.setCursorVisible(true);
                f0Var.setLongClickable(true);
                return;
            case 12:
                ig.r0 r0Var = (ig.r0) this.b;
                ig.o0 o0Var = (ig.o0) this.c;
                r0Var.getClass();
                TLRPC.ReactionCount reactionCount = o0Var.a;
                org.telegram.ui.Cells.a0 a0Var4 = r0Var.z;
                if (com.google.android.recaptcha.internal.a.u(a0Var4)) {
                    ((org.telegram.ui.Cells.l4) a0Var4).f(reactionCount, true, 0.0f, 0.0f);
                }
                o0Var.Y.c(false);
                r0Var.S = null;
                r0Var.T = false;
                r0Var.U = null;
                return;
            case 13:
                j3.n nVar = (j3.n) this.b;
                String str3 = (String) this.c;
                j3.o oVar = nVar.b;
                int i15 = d5.g0.a;
                i3.f fVar = ((h3.h0) oVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1012, new h3.q2(k10, str3, 28));
                return;
            case 14:
                AudioTrack audioTrack = (AudioTrack) this.b;
                d5.c cVar = (d5.c) this.c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar.c();
                    synchronized (j3.j0.d0) {
                        try {
                            int i16 = j3.j0.f0 - 1;
                            j3.j0.f0 = i16;
                            if (i16 == 0) {
                                j3.j0.e0.shutdown();
                                j3.j0.e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    cVar.c();
                    synchronized (j3.j0.d0) {
                        try {
                            int i17 = j3.j0.f0 - 1;
                            j3.j0.f0 = i17;
                            if (i17 == 0) {
                                j3.j0.e0.shutdown();
                                j3.j0.e0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 15:
                j4.r0 r0Var2 = (j4.r0) this.b;
                m3.t tVar = (m3.t) this.c;
                r0Var2.J = r0Var2.C == null ? tVar : new m3.o(-9223372036854775807L);
                r0Var2.K = tVar.i();
                boolean z10 = !r0Var2.Q && tVar.i() == -9223372036854775807L;
                r0Var2.L = z10;
                r0Var2.M = z10 ? 7 : 1;
                r0Var2.h.t(r0Var2.K, tVar.e(), r0Var2.L);
                if (r0Var2.G) {
                    return;
                }
                r0Var2.k();
                return;
            case 16:
                ((jh.i9) this.b).H(ProfileActivity.m4(((jh.s0) this.c).c));
                return;
            case 17:
                jh.g2 g2Var = (jh.g2) this.b;
                AndroidUtilities.addToClipboard(((jh.n0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(g2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 18:
                jh.g2 g2Var2 = (jh.g2) this.b;
                jh.s0 s0Var = (jh.s0) this.c;
                long j10 = s0Var.c;
                jh.e4 e4Var = g2Var2.e0;
                if (j10 != UserConfig.getInstance(e4Var.y2).getClientUserId() && ((d1Var = g2Var2.d0.w0) == null || j10 != DialogObject.getPeerDialogId(d1Var.i()))) {
                    if (e4Var.K3 != null) {
                        for (int i18 = 0; i18 < e4Var.K3.peers.size(); i18++) {
                            if (j10 != DialogObject.getPeerDialogId(e4Var.K3.peers.get(i18).peer)) {
                            }
                        }
                    }
                    Context context = g2Var2.getContext();
                    long j11 = s0Var.c;
                    jh.z zVar = new jh.z(i10, g2Var2, s0Var);
                    jh.i0 i0Var = new jh.i0();
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, i0Var, false, false);
                    e3Var.fixNavigationBar();
                    LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
                    TextView h = org.telegram.messenger.y1.h(context, 1, 20.0f);
                    h.setTextColor(i0Var.N0(org.telegram.ui.ActionBar.g6.j5));
                    h.setTypeface(AndroidUtilities.bold());
                    h.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    g10.addView(h, h7.z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, i0Var);
                    j4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    g10.addView(j4Var, h7.z5.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context, i0Var, true);
                    bp checkBoxRound = y1Var.getCheckBoxRound();
                    int i19 = org.telegram.ui.ActionBar.g6.V6;
                    int i20 = org.telegram.ui.ActionBar.g6.g7;
                    int i21 = org.telegram.ui.ActionBar.g6.k7;
                    checkBoxRound.b(i19, i20, i21);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() { // from class: jh.a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
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
                    int i22 = org.telegram.ui.ActionBar.g6.i6;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var.N0(i22), 2, -1));
                    g10.addView(y1Var, h7.z5.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context, i0Var, true);
                    y1Var2.getCheckBoxRound().b(i19, i20, i21);
                    final int i23 = 1;
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() { // from class: jh.a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
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
                    y1Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var.N0(i22), 2, -1));
                    g10.addView(y1Var2, h7.z5.n(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context, i0Var, true);
                    y1Var3.getCheckBoxRound().b(i19, i20, i21);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i24 = 2;
                    y1Var3.setOnClickListener(new View.OnClickListener() { // from class: jh.a0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
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
                    y1Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(i0Var.N0(i22), 2, -1));
                    g10.addView(y1Var3, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, i0Var);
                    x8Var.setBackgroundColor(-16777216);
                    x8Var.setFixedSize(12);
                    g10.addView(x8Var, h7.z5.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    lh.d dVar = new lh.d(context, i0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new jh.b0(y1Var, y1Var2, y1Var3, zVar, e3Var, 0));
                    frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    g10.addView(frameLayout, h7.z5.n(-1, -2));
                    e3Var.setCustomView(g10);
                    e3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = g2Var2.K;
                deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.a));
                ConnectionsManager.getInstance(g2Var2.J).sendRequest(deletegroupcallmessages, null);
                g2Var2.c(s0Var.a);
                return;
            case 19:
                jh.d1 d1Var2 = (jh.d1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                d1Var2.getClass();
                int size = arrayList4.size();
                int i25 = 0;
                while (i25 < size) {
                    Object obj = arrayList4.get(i25);
                    i25++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(d1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 20:
                ((jh.d1) this.b).B.remove((String) this.c);
                return;
            case 21:
                jh.e4 e4Var2 = (jh.e4) this.b;
                lh.w3 w3Var = (lh.w3) this.c;
                e4Var2.removeView(w3Var);
                if (e4Var2.Z1 == w3Var) {
                    e4Var2.Z1 = null;
                    return;
                }
                return;
            case 22:
                jh.e4 e4Var3 = (jh.e4) this.b;
                sb E = sb.E((Activity) this.c, e4Var3.y2);
                jh.d4 d4Var = e4Var3.I2;
                long j12 = (d4Var == null || (h9Var = d4Var.b) == null) ? 0L : h9Var.currentPosition;
                File h10 = e4Var3.K1.h();
                TL_stories.StoryItem storyItem = e4Var3.K1.a;
                lh.z7 z7Var = new lh.z7();
                z7Var.n = true;
                z7Var.t = storyItem.media;
                int i26 = z7Var.a;
                z7Var.q = MessagesController.getInstance(i26).getPeer(storyItem.dialogId);
                z7Var.r = storyItem.id;
                z7Var.s = storyItem.caption;
                z7Var.L = h10;
                z7Var.M = false;
                z7Var.k0 = 720;
                z7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    z7Var.K = false;
                    if (h10 != null) {
                        z7Var.h(h10.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    z7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i27 = 0;
                        while (true) {
                            if (i27 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i27);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    z7Var.k0 = documentAttribute.w;
                                    z7Var.l0 = documentAttribute.h;
                                    z7Var.i = documentAttribute.duration;
                                } else {
                                    i27++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str4 = storyItem.firstFramePath;
                        if (str4 != null) {
                            z7Var.N = str4;
                        } else if (document2.thumbs != null) {
                            for (int i28 = 0; i28 < storyItem.media.document.thumbs.size(); i28++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i28);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    z7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i26).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        z7Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                z7Var.A();
                z7Var.e(storyItem);
                lh.lb d = nb.d(e4Var3.F0);
                RectF rectF = E.D;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i29 = E.c;
                if (!E.d) {
                    if (MessagesController.getInstance(i29).isFrozen()) {
                        org.telegram.ui.b.b(i29);
                    } else {
                        E.q0 = false;
                        E.e = false;
                        E.x2 = false;
                        if (windowManager != null && (rbVar = E.n) != null && rbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.G1 = z7Var;
                        lh.r9.a(i29, z7Var);
                        lh.z7 z7Var2 = E.G1;
                        E.K1 = (z7Var2 == null || !z7Var2.K) ? 0 : 1;
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
                        lh.fb fbVar = E.d0;
                        int i30 = E.F;
                        fbVar.setBackgroundColor((i30 == 1 || i30 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.G = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        lh.z7 z7Var3 = E.G1;
                        if (z7Var3 != null) {
                            E.Y0.setText(z7Var3.C0);
                        }
                        E.L(new lh.s9(E, 7), j12);
                        E.X0.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.r0 = 0L;
                        E.s0 = "";
                    }
                }
                E.M = new jh.v1(e4Var3, 12);
                E.N = new jh.b2(i10, e4Var3, E);
                return;
            case 23:
                jh.x3 x3Var = (jh.x3) this.b;
                jh.i9 i9Var = (jh.i9) this.c;
                x3Var.getClass();
                ((jh.z8) x3Var.l.M1).h(new ag.g2(i9Var.f, 14, false));
                return;
            case 24:
                jh.n4 n4Var = (jh.n4) this.b;
                String str5 = (String) this.c;
                n4Var.h = null;
                jh.c5 c5Var = n4Var.n;
                c5Var.M = false;
                c5Var.K.c = str5.toLowerCase();
                jh.c5.b(c5Var);
                return;
            case 25:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error2 == null));
                    return;
                }
                return;
            case 26:
                jh.d6 d6Var = (jh.d6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                jh.g6 g6Var = d6Var.q;
                int i31 = d6Var.c;
                ArrayList arrayList5 = d6Var.i;
                d6Var.I = 0;
                if (tLObject3 instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject3;
                    MessagesController.getInstance(i31).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i31).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList6 = tL_foundStories.stories;
                    int size2 = arrayList6.size();
                    int i32 = 0;
                    while (i32 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList6.get(i32);
                        i32++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList5.size();
                        MessageObject messageObject3 = new MessageObject(i31, tL_foundStory2.storyItem);
                        messageObject3.generateThumbs(false);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(Integer.valueOf(arrayList5.size()));
                        d6Var.F.add(arrayList7);
                        arrayList5.add(messageObject3);
                    }
                    d6Var.J = Math.max(arrayList5.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        d6Var.J = arrayList5.size();
                    }
                    if (arrayList5.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    d6Var.H = str;
                    d6Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(g6Var);
                    AndroidUtilities.runOnUIThread(g6Var);
                    return;
                }
                return;
            case 27:
                jh.f6 f6Var = (jh.f6) this.b;
                List list = (List) this.c;
                ArrayList arrayList8 = f6Var.h;
                arrayList8.clear();
                arrayList8.addAll(list);
                f6Var.d = true;
                f6Var.e = false;
                f6Var.d();
                NotificationCenter.getInstance(f6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f6Var.b), f6Var);
                return;
            case 28:
                jh.f6 f6Var2 = (jh.f6) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList9 = f6Var2.g;
                ArrayList arrayList10 = f6Var2.h;
                if (!(tLObject4 instanceof TL_stories.TL_albums)) {
                    if (tLObject4 instanceof TL_stories.TL_albumsNotModified) {
                        arrayList10.clear();
                        arrayList10.addAll(arrayList9);
                        f6Var2.f = true;
                        f6Var2.e = false;
                        NotificationCenter.getInstance(f6Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(f6Var2.b), f6Var2);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject4;
                ArrayList arrayList11 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList12 = tL_albums.albums;
                int size3 = arrayList12.size();
                int i33 = 0;
                while (i33 < size3) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList12.get(i33);
                    i33++;
                    arrayList11.add(jh.k6.a(tL_storyAlbum));
                }
                arrayList10.clear();
                arrayList10.addAll(arrayList11);
                arrayList9.clear();
                arrayList9.addAll(arrayList11);
                f6Var2.f = true;
                f6Var2.e = false;
                f6Var2.f(true);
                return;
            default:
                jh.j6 j6Var = (jh.j6) this.b;
                Utilities.Callback callback3 = (Utilities.Callback) this.c;
                j6Var.getClass();
                callback3.run(j6Var);
                return;
        }
    }

    public /* synthetic */ m5(u7 u7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 2;
        this.b = zArr;
        this.c = callback2;
    }
}
