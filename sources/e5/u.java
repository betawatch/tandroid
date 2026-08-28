package e5;

import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import d5.f0;
import fh.f1;
import fh.f2;
import fh.y1;
import fh.y3;
import gh.a0;
import gh.jb;
import gh.k5;
import gh.n7;
import gh.p5;
import gh.pa;
import gh.s7;
import gh.u7;
import gh.v1;
import gh.v7;
import h3.d0;
import h3.h0;
import h3.j0;
import h3.k0;
import h3.p2;
import h3.r2;
import h3.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        oc a02;
        int i9;
        int i10;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.TL_messageReactions tL_messageReactions2;
        long j10;
        boolean z10;
        int i11 = 8;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                we.b bVar = (we.b) this.b;
                z zVar = (z) this.c;
                h0 h0Var = (h0) bVar.c;
                int i15 = f0.a;
                k0 k0Var = h0Var.a;
                k0Var.g0 = zVar;
                k0Var.l.e(25, new d0(zVar));
                break;
            case 1:
                we.b bVar2 = (we.b) this.b;
                String str = (String) this.c;
                h0 h0Var2 = (h0) bVar2.c;
                int i16 = f0.a;
                i3.f fVar = h0Var2.a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1019, new i3.d(k10, str, 23));
                break;
            case 2:
                we.b bVar3 = (we.b) this.b;
                Exception exc = (Exception) this.c;
                h0 h0Var3 = (h0) bVar3.c;
                int i17 = f0.a;
                i3.f fVar2 = h0Var3.a.r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1030, new i3.d(k11, exc, 29));
                break;
            case 3:
                eh.x xVar = (eh.x) this.b;
                g5 g5Var = (g5) this.c;
                int i18 = xVar.k;
                o2 o2Var = xVar.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                xVar.r = importer;
                LongSparseArray longSparseArray = xVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    o2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z11 = point.x > point.y;
                    if (user.photo != null && !z11) {
                        if (xVar.s == null) {
                            eh.w wVar = new eh.w(xVar, o2Var.getParentActivity(), (wk0) g5Var.getParent(), o2Var.getResourceProvider(), xVar.a);
                            xVar.s = wVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = xVar.r;
                            o9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = wVar.e;
                            ah0 ah0Var = wVar.h;
                            wVar.r = tL_chatInviteImporter;
                            wVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            ah0Var.setParentAvatarImage(avatarImageView);
                            ah0Var.M(tL_chatInviteImporter.user_id, true);
                            ah0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            wVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            wVar.y.requestLayout();
                            xVar.s.setOnDismissListener(new eh.l(xVar, i14));
                            xVar.s.show();
                            break;
                        }
                    } else {
                        xVar.b = true;
                        o2Var.dismissCurrentDialog();
                        Bundle bundle = new Bundle();
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("removeFragmentOnChatOpen", false);
                        o2Var.presentFragment(profileActivity);
                        break;
                    }
                }
                break;
            case 4:
                fh.c cVar = (fh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar.getClass();
                onClickListener.onClick(cVar);
                break;
            case 5:
                ((y1) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 6:
                f2 f2Var = (f2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                f2Var.getClass();
                if (!savedStarGift.unsaved) {
                    f2Var.B.setVisibility(8);
                    break;
                }
                break;
            case 7:
                vq0 vq0Var = (vq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                vq0Var.h(tL_starGiftCollection.title, new f1(i12, vq0Var, tL_starGiftCollection));
                break;
            case 8:
                y3 y3Var = (y3) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                oc.a0(y3Var.a.a).k(false).j();
                break;
            case 9:
                gh.z zVar2 = (gh.z) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i19 = zVar2.a;
                ArrayList arrayList2 = zVar2.e;
                zVar2.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (zVar2.c <= 0) {
                        arrayList2.clear();
                    }
                    zVar2.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    zVar2.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= zVar2.c;
                } else {
                    zVar2.h = true;
                    zVar2.d = true;
                }
                zVar2.g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(zVar2.b));
                break;
            case 10:
                a0 a0Var = (a0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i20 = a0Var.a;
                ArrayList arrayList3 = a0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (a0Var.c <= 0) {
                        arrayList3.clear();
                    }
                    a0Var.c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    a0Var.j = suggestedstarrefbots.next_offset;
                    a0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList3.size() >= a0Var.c;
                } else {
                    a0Var.i = true;
                    a0Var.d = true;
                }
                a0Var.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(a0Var.b));
                break;
            case 11:
                k5.U0((k5) this.b, (Long) this.c);
                break;
            case 12:
                k5 k5Var = (k5) this.b;
                if (((v7) this.c).e) {
                    k5Var.f0.setLoading(false);
                    k5Var.w1();
                    break;
                } else {
                    gc Q = k5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 13:
                ((k5) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 14:
                MessagesController.getInstance(((k5) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 15:
                k5 k5Var2 = (k5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                k5Var2.getClass();
                zArr[0] = true;
                k5Var2.f0.setLoading(false);
                k5Var2.w1();
                break;
            case 16:
                k5 k5Var3 = (k5) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                k5Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                break;
            case 17:
                k5 k5Var4 = (k5) this.b;
                oc.a0((qn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(k5Var4.T))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new v1(k5Var4, i11)).k(true);
                break;
            case 18:
                ((k5) this.b).n2((CharSequence) this.c);
                break;
            case 19:
                k5.H0((k5) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                break;
            case 20:
                c2 c2Var = (c2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                c2Var.dismiss();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = oc.a0(U);
                        i9 = R.raw.error;
                        i10 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = oc.a0(U);
                        i9 = R.raw.fire_on;
                        i10 = R.string.UniqueGiftNotFoundBurned;
                    }
                    l0.p(i10, a02, i9, 36);
                    break;
                }
                break;
            case 21:
                p5 p5Var = (p5) this.b;
                qn qnVar = (qn) this.c;
                org.telegram.ui.Cells.a0 a0Var2 = p5Var.b;
                if (a0Var2 != null) {
                    try {
                        a0Var2.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    p5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var3 = p5Var.b;
                    if (a0Var3 instanceof t1) {
                        messageObject = ((t1) a0Var3).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        }
                    } else if ((a0Var3 instanceof w0) && (messageObject = ((w0) a0Var3).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    u7 u7Var = v7.y(messageObject.currentAccount, false).B;
                    if (u7Var != null) {
                        u7Var.b();
                    }
                    TLRPC.ChatFull chatFull = qnVar.V7;
                    MessageObject messageObject2 = messageObject;
                    jb jbVar = new jb(p5Var.getContext(), qnVar.getCurrentAccount(), qnVar.a(), qnVar, messageObject2, arrayList4, chatFull == null || chatFull.paid_reactions_available, false, 0L, qnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var4 = p5Var.b;
                    jbVar.P = qnVar;
                    jbVar.Q = a0Var4;
                    jbVar.show();
                    break;
                }
                break;
            case 22:
                TLObject tLObject3 = (TLObject) this.b;
                bg.i iVar = (bg.i) this.c;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    iVar.run((TL_stars.StarGifts) tLObject3);
                    break;
                } else {
                    iVar.run(null);
                    break;
                }
            case 23:
                boolean[] zArr2 = (boolean[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                if (!zArr2[0]) {
                    callback2.run("cancelled", 0L);
                    zArr2[0] = true;
                    break;
                }
                break;
            case 24:
                n7 n7Var = (n7) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList5 = n7Var.l;
                int i21 = n7Var.a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i21).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i21).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(0);
                        int i22 = 0;
                        while (i22 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i22)).pinned_to_top) {
                            i22++;
                        }
                        arrayList5.add(i22, savedStarGift2);
                        NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n7Var.b), n7Var);
                        break;
                    }
                }
                break;
            case 25:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 26:
                new oc(((f3[]) this.b)[0].topBulletinContainer, (b6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            case 27:
                jb jbVar2 = (jb) this.b;
                u7 u7Var2 = (u7) this.c;
                jbVar2.N = true;
                jbVar2.o(new s7(u7Var2, i12));
                AndroidUtilities.runOnUIThread(new pa(jbVar2, i13), 240L);
                break;
            case 28:
                ((d5.d0) this.b).d((Typeface) this.c);
                break;
            default:
                k0 k0Var2 = (k0) this.b;
                te.f fVar3 = (te.f) this.c;
                int i23 = k0Var2.H - fVar3.c;
                k0Var2.H = i23;
                if (fVar3.d) {
                    k0Var2.I = fVar3.e;
                    k0Var2.J = true;
                }
                if (fVar3.f) {
                    k0Var2.K = fVar3.g;
                }
                if (i23 == 0) {
                    r2 r2Var = ((w1) fVar3.h).a;
                    if (!k0Var2.i0.a.p() && r2Var.p()) {
                        k0Var2.j0 = -1;
                        k0Var2.k0 = 0L;
                    }
                    if (!r2Var.p()) {
                        List asList = Arrays.asList(((h3.f2) r2Var).r);
                        d5.a.i(asList.size() == k0Var2.o.size());
                        for (int i24 = 0; i24 < asList.size(); i24++) {
                            ((j0) k0Var2.o.get(i24)).b = (r2) asList.get(i24);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (k0Var2.J) {
                        if (((w1) fVar3.h).b.equals(k0Var2.i0.b) && ((w1) fVar3.h).d == k0Var2.i0.r) {
                            i13 = 0;
                        }
                        if (i13 != 0) {
                            if (r2Var.p() || ((w1) fVar3.h).b.a()) {
                                j11 = ((w1) fVar3.h).d;
                            } else {
                                w1 w1Var = (w1) fVar3.h;
                                j4.d0 d0Var = w1Var.b;
                                long j12 = w1Var.d;
                                Object obj = d0Var.a;
                                p2 p2Var = k0Var2.n;
                                r2Var.g(obj, p2Var);
                                j11 = j12 + p2Var.e;
                            }
                        }
                        j10 = j11;
                        z10 = i13;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = 0;
                    }
                    k0Var2.J = false;
                    k0Var2.o0((w1) fVar3.h, 1, k0Var2.K, false, z10, k0Var2.I, j10, -1, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u(v7 v7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.a = 23;
        this.b = zArr;
        this.c = callback2;
    }
}
