package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.media.AudioManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions2;
        di.h1 h1Var;
        fi.rb rbVar;
        di.x9 x9Var;
        final int i12 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                e2Var.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        b02 = org.telegram.ui.Components.wc.b0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        b02 = org.telegram.ui.Components.wc.b0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    org.telegram.messenger.t.q(i11, b02, i10, 36);
                    return;
                }
                return;
            case 1:
                h7.P0((h7) this.b, (Long) this.c);
                return;
            case 2:
                h7 h7Var = (h7) this.b;
                if (((ca) this.c).e) {
                    h7Var.k0.setLoading(false);
                    h7Var.Q1();
                    return;
                } else {
                    org.telegram.ui.Components.qc R = h7Var.getBulletinFactory().R(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    R.u = true;
                    R.j();
                    return;
                }
            case 3:
                MessagesController.getInstance(((h7) this.b).currentAccount).lambda$processUpdates$379((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 4:
                ((h7) this.b).getBulletinFactory().g0((TLRPC.TL_error) this.c, false);
                return;
            case 5:
                h7 h7Var2 = (h7) this.b;
                org.telegram.ui.Components.wc.b0((un) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(h7Var2.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new a2(h7Var2, 8)).k(true);
                return;
            case 6:
                h7 h7Var3 = (h7) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h7Var3.getClass();
                zArr[0] = true;
                h7Var3.k0.setLoading(false);
                h7Var3.Q1();
                return;
            case 7:
                h7 h7Var4 = (h7) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                h7Var4.getBulletinFactory().R(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 8:
                ((h7) this.b).Q2((CharSequence) this.c);
                return;
            case 9:
                m7 m7Var = (m7) this.b;
                un unVar = (un) this.c;
                org.telegram.ui.Cells.z zVar = m7Var.b;
                if (zVar == null) {
                    return;
                }
                try {
                    zVar.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                m7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                org.telegram.ui.Cells.z zVar2 = m7Var.b;
                if (zVar2 instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) zVar2).getPrimaryMessageObject();
                    if (messageObject == null) {
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                    arrayList = null;
                } else {
                    if (!(zVar2 instanceof org.telegram.ui.Cells.v0) || (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) == null) {
                        return;
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                        arrayList = tL_messageReactions.top_reactors;
                    }
                    arrayList = null;
                }
                MessageObject messageObject2 = messageObject;
                ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                aa aaVar = ca.y(messageObject2.currentAccount, false).B;
                if (aaVar != null) {
                    aaVar.b();
                }
                TLRPC.ChatFull chatFull = unVar.l8;
                be beVar = new be(m7Var.getContext(), unVar.getCurrentAccount(), unVar.a(), unVar, messageObject2, arrayList2, chatFull == null || chatFull.paid_reactions_available, false, 0L, unVar.getResourceProvider());
                messageObject2.getId();
                org.telegram.ui.Cells.z zVar3 = m7Var.b;
                beVar.V = unVar;
                beVar.W = zVar3;
                beVar.show();
                return;
            case 10:
                TLObject tLObject = (TLObject) this.b;
                ai.i iVar = (ai.i) this.c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    iVar.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    iVar.run(null);
                    return;
                }
            case 11:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (zArr2[0]) {
                    return;
                }
                callback2.run("cancelled", 0L);
                zArr2[0] = true;
                return;
            case 12:
                t9 t9Var = (t9) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = t9Var.l;
                int i13 = t9Var.a;
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
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(t9Var.b), t9Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((MessagesController) this.b).lambda$processUpdates$379((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 14:
                new org.telegram.ui.Components.wc(((org.telegram.ui.ActionBar.k3[]) this.b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.u6) this.c).R(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 15:
                be beVar2 = (be) this.b;
                aa aaVar2 = (aa) this.c;
                beVar2.T = true;
                beVar2.o(new y9(aaVar2, 2));
                AndroidUtilities.runOnUIThread(new ed(beVar2, 1), 240L);
                return;
            case 16:
                ((c1.e) this.b).e().onError(((kotlin.jvm.internal.p) this.c).a);
                return;
            case 17:
                ((c1.e) this.b).e().onError((w0.h) this.c);
                return;
            case 18:
                ((c1.e) this.b).e().onResult((v0.o) this.c);
                return;
            case 19:
                Context context = (Context) this.b;
                e2.i iVar2 = (e2.i) this.c;
                c2.j.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                iVar2.e();
                return;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                a4.l lVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 21:
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(lVar2.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 22:
                d1.e eVar = (d1.e) this.b;
                v0.f fVar = (v0.f) this.c;
                v0.i iVar3 = eVar.f;
                if (iVar3 != null) {
                    iVar3.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 23:
                ((di.y9) this.b).H(ProfileActivity.t4(((di.v0) this.c).c));
                return;
            case 24:
                di.m2 m2Var = (di.m2) this.b;
                AndroidUtilities.addToClipboard(((di.q0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(m2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 25:
                di.m2 m2Var2 = (di.m2) this.b;
                di.v0 v0Var = (di.v0) this.c;
                long j10 = v0Var.c;
                di.q4 q4Var = m2Var2.i0;
                if (j10 != UserConfig.getInstance(q4Var.r2).getClientUserId() && ((h1Var = m2Var2.h0.A0) == null || j10 != DialogObject.getPeerDialogId(h1Var.i()))) {
                    if (q4Var.D3 != null) {
                        for (int i15 = 0; i15 < q4Var.D3.peers.size(); i15++) {
                            if (j10 != DialogObject.getPeerDialogId(q4Var.D3.peers.get(i15).peer)) {
                            }
                        }
                    }
                    Context context2 = m2Var2.getContext();
                    long j11 = v0Var.c;
                    di.c0 c0Var = new di.c0(i12, m2Var2, v0Var);
                    di.l0 l0Var = new di.l0();
                    org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context2, (org.telegram.ui.ActionBar.u6) l0Var, false);
                    k3Var.fixNavigationBar();
                    LinearLayout d = vh.d(context2, 1);
                    TextView g7 = org.telegram.messenger.t.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.j5, l0Var);
                    g7.setTypeface(AndroidUtilities.bold());
                    g7.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    d.addView(g7, gb1.o(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context2, l0Var);
                    q4Var2.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    d.addView(q4Var2, gb1.o(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context2, l0Var, true);
                    zp checkBoxRound = y1Var.getCheckBoxRound();
                    int i16 = org.telegram.ui.ActionBar.y6.V6;
                    int i17 = org.telegram.ui.ActionBar.y6.g7;
                    int i18 = org.telegram.ui.ActionBar.y6.k7;
                    checkBoxRound.b(i16, i17, i18);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() { // from class: di.d0
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
                    int i19 = org.telegram.ui.ActionBar.y6.i6;
                    org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(l0Var.g(i19), 2, -1);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
                    y1Var.setBackground(g02);
                    org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, l0Var);
                    d.addView(y1Var, gb1.r(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context2, l0Var, true);
                    y1Var2.getCheckBoxRound().b(i16, i17, i18);
                    final int i20 = 1;
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j11)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() { // from class: di.d0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
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
                    org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(l0Var.g(i19), 2, -1);
                    org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i19);
                    y1Var2.setBackground(g03);
                    org.telegram.ui.ActionBar.f7.k(y1Var2, g03, null, N2, l0Var);
                    d.addView(y1Var2, gb1.r(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context2, l0Var, true);
                    y1Var3.getCheckBoxRound().b(i16, i17, i18);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j11)), null, false, false, false);
                    final int i21 = 2;
                    y1Var3.setOnClickListener(new View.OnClickListener() { // from class: di.d0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
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
                    org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(l0Var.g(i19), 2, -1);
                    org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i19);
                    y1Var3.setBackground(g04);
                    org.telegram.ui.ActionBar.f7.k(y1Var3, g04, null, N3, l0Var);
                    d.addView(y1Var3, gb1.r(-1, -2));
                    org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context2, l0Var);
                    i9Var.setBackgroundColor(-16777216);
                    i9Var.setFixedSize(12);
                    d.addView(i9Var, gb1.r(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    fi.d dVar = new fi.d(context2, l0Var, true);
                    dVar.i(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new di.e0(y1Var, y1Var2, y1Var3, c0Var, k3Var, 0));
                    frameLayout.addView(dVar, gb1.h(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    d.addView(frameLayout, gb1.r(-1, -2));
                    k3Var.setCustomView(d);
                    k3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = m2Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(v0Var.a));
                ConnectionsManager.getInstance(m2Var2.N).sendRequest(deletegroupcallmessages, null);
                m2Var2.c(v0Var.a);
                return;
            case 26:
                di.h1 h1Var2 = (di.h1) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                h1Var2.getClass();
                int size = arrayList4.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj = arrayList4.get(i22);
                    i22++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(h1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 27:
                ((di.h1) this.b).F.remove((String) this.c);
                return;
            case 28:
                di.q4 q4Var3 = (di.q4) this.b;
                fi.v3 v3Var = (fi.v3) this.c;
                q4Var3.removeView(v3Var);
                if (q4Var3.S1 == v3Var) {
                    q4Var3.S1 = null;
                    return;
                }
                return;
            default:
                di.q4 q4Var4 = (di.q4) this.b;
                fi.sb D = fi.sb.D((Activity) this.c, q4Var4.r2);
                di.p4 p4Var = q4Var4.B2;
                long j12 = (p4Var == null || (x9Var = (di.x9) p4Var.c) == null) ? 0L : x9Var.currentPosition;
                File h = q4Var4.D1.h();
                TL_stories.StoryItem storyItem = q4Var4.D1.a;
                fi.w7 w7Var = new fi.w7();
                w7Var.n = true;
                w7Var.t = storyItem.media;
                int i23 = w7Var.a;
                w7Var.q = MessagesController.getInstance(i23).getPeer(storyItem.dialogId);
                w7Var.r = storyItem.id;
                w7Var.s = storyItem.caption;
                w7Var.L = h;
                w7Var.M = false;
                w7Var.k0 = 720;
                w7Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    w7Var.K = false;
                    if (h != null) {
                        w7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    w7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i24 = 0;
                        while (true) {
                            if (i24 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i24);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    w7Var.k0 = documentAttribute.w;
                                    w7Var.l0 = documentAttribute.h;
                                    w7Var.i = documentAttribute.duration;
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str = storyItem.firstFramePath;
                        if (str != null) {
                            w7Var.N = str;
                        } else if (document2.thumbs != null) {
                            for (int i25 = 0; i25 < storyItem.media.document.thumbs.size(); i25++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i25);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    w7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i23).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        w7Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                w7Var.A();
                w7Var.e(storyItem);
                fi.lb d10 = fi.nb.d(q4Var4.y0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f;
                int i26 = D.c;
                if (!D.d) {
                    if (MessagesController.getInstance(i26).isFrozen()) {
                        org.telegram.ui.b.b(i26);
                    } else {
                        D.u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (rbVar = D.n) != null && rbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.n, layoutParams);
                            windowManager.addView(D.n, layoutParams);
                            D.f0();
                        }
                        D.K1 = w7Var;
                        fi.o9.a(i26, w7Var);
                        fi.w7 w7Var2 = D.K1;
                        D.O1 = (w7Var2 == null || !w7Var2.K) ? 0 : 1;
                        D.s0.g = false;
                        if (d10 != null) {
                            D.F = d10;
                            D.J = d10.a;
                            rectF.set(d10.c);
                            D.G = d10.b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                        }
                        D.r.c();
                        fi.eb ebVar = D.h0;
                        int i27 = D.J;
                        ebVar.setBackgroundColor((i27 == 1 || i27 == 0) ? 0 : -14737633);
                        D.r.setTranslationX(0.0f);
                        D.r.setTranslationY(0.0f);
                        D.r.b(0.0f);
                        D.r.setScaleX(1.0f);
                        D.r.setScaleY(1.0f);
                        D.K = 0.0f;
                        AndroidUtilities.lockOrientation(D.b, 1);
                        fi.w7 w7Var3 = D.K1;
                        if (w7Var3 != null) {
                            D.c1.setText(w7Var3.C0);
                        }
                        D.K(new fi.p9(D, 7), j12);
                        D.b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.v0 = 0L;
                        D.w0 = "";
                    }
                }
                D.Q = new di.c2(q4Var4, 12);
                D.R = new di.h2(i12, q4Var4, D);
                return;
        }
    }

    public /* synthetic */ f2(ca caVar, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 11;
        this.b = zArr;
        this.c = callback2;
    }
}
