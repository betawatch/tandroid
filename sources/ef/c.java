package ef;

import ag.i0;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.s;
import eg.c0;
import eg.c1;
import eg.c2;
import eg.u0;
import eg.w2;
import f5.b0;
import f5.d0;
import f5.u;
import fh.k;
import g5.t;
import g5.y;
import hh.v;
import ih.b1;
import ih.n3;
import ih.s1;
import ih.y1;
import j3.e0;
import j3.f2;
import j3.h0;
import j3.j0;
import j3.k0;
import j3.p2;
import j3.r2;
import j3.w1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import jh.h5;
import jh.s7;
import jh.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.x61;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tm;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        File pathToAttach;
        long j10;
        boolean z10;
        int i10 = 2;
        boolean z11 = true;
        int i11 = 0;
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                while (i11 < arrayList.size()) {
                    d dVar = (d) arrayList.get(i11);
                    if (dVar != null && ((TextUtils.isEmpty(dVar.b) || !new File(dVar.b).exists()) && (document = dVar.a) != null && ((pathToAttach = FileLoader.getInstance(eVar.c).getPathToAttach(document)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new c(1, eVar, document));
                    }
                    i11++;
                }
                break;
            case 1:
                e eVar2 = (e) this.b;
                TLRPC.Document document2 = (TLRPC.Document) this.c;
                FileLoader.getInstance(eVar2.c).loadFile(document2, document2, 0, 0);
                break;
            case 2:
                f fVar = (f) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i12 = fVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i12).ringtoneDurationMax)));
                    break;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i12).ringtoneSizeMax / 1024)));
                    break;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    break;
                }
            case 3:
                ((c2) this.b).run((ArrayList) this.c);
                break;
            case 4:
                ((u0) this.b).run((TLRPC.TL_error) this.c);
                break;
            case 5:
                ((tm) this.b).run((ArrayList) this.c);
                break;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new c0(callback, smallGroupsParticipantsCount, 0));
                    break;
                }
                break;
            case 7:
                mc M = tc.a0((tn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                break;
            case 8:
                c1 c1Var = (c1) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                c1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, c1Var.X, Boolean.TRUE, prepaidGiveaway);
                break;
            case 9:
                w2.P((w2) this.b, (TLObject) this.c);
                break;
            case 10:
                ((s) this.c).a(((u) this.b).g());
                break;
            case 11:
                k kVar = (k) this.b;
                kVar.b.add((String) this.c);
                kVar.invalidate();
                break;
            case 12:
                ze.b bVar = (ze.b) this.b;
                y yVar = (y) this.c;
                h0 h0Var = (h0) bVar.b;
                int i13 = d0.a;
                k0 k0Var = h0Var.a;
                k0Var.g0 = yVar;
                k0Var.l.e(25, new e0(yVar));
                break;
            case 13:
                ze.b bVar2 = (ze.b) this.b;
                String str = (String) this.c;
                h0 h0Var2 = (h0) bVar2.b;
                int i14 = d0.a;
                k3.f fVar2 = h0Var2.a.r;
                k3.a k9 = fVar2.k();
                fVar2.l(k9, 1019, new k3.d(k9, str, 9));
                break;
            case 14:
                ze.b bVar3 = (ze.b) this.b;
                Exception exc = (Exception) this.c;
                h0 h0Var3 = (h0) bVar3.b;
                int i15 = d0.a;
                k3.f fVar3 = h0Var3.a.r;
                k3.a k10 = fVar3.k();
                fVar3.l(k10, 1030, new k3.d(k10, exc, 15));
                break;
            case 15:
                ((i0) this.b).run((TLRPC.Chat) this.c);
                break;
            case 16:
                ((b0) this.b).d((Typeface) this.c);
                break;
            case 17:
                v vVar = (v) this.b;
                e5 e5Var = (e5) this.c;
                int i16 = vVar.k;
                o2 o2Var = vVar.g;
                TLRPC.TL_chatInviteImporter importer = e5Var.getImporter();
                vVar.r = importer;
                LongSparseArray longSparseArray = vVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    o2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    boolean z12 = point.x > point.y;
                    if (user.photo != null && !z12) {
                        if (vVar.s == null) {
                            hh.u uVar = new hh.u(vVar, o2Var.getParentActivity(), (jl0) e5Var.getParent(), o2Var.getResourceProvider(), vVar.a);
                            vVar.s = uVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar.r;
                            t9 avatarImageView = e5Var.getAvatarImageView();
                            TextView textView = uVar.e;
                            kh0 kh0Var = uVar.h;
                            uVar.r = tL_chatInviteImporter;
                            uVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i16, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i16, user2, 1);
                            if (MessagesController.getInstance(i16).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i16).loadUserInfo(user2, false, 0);
                            }
                            kh0Var.setParentAvatarImage(avatarImageView);
                            kh0Var.M(tL_chatInviteImporter.user_id, true);
                            kh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                            uVar.y.requestLayout();
                            vVar.s.setOnDismissListener(new cg.d0(vVar, 2));
                            vVar.s.show();
                            break;
                        }
                    } else {
                        vVar.b = true;
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
            case 18:
                ih.c cVar = (ih.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar.getClass();
                onClickListener.onClick(cVar);
                break;
            case 19:
                ((s1) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
            case 20:
                y1 y1Var = (y1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                y1Var.getClass();
                if (!savedStarGift.unsaved) {
                    y1Var.B.setVisibility(8);
                    break;
                }
                break;
            case 21:
                gr0 gr0Var = (gr0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                gr0Var.h(tL_starGiftCollection.title, new b1(i10, gr0Var, tL_starGiftCollection));
                break;
            case 22:
                n3 n3Var = (n3) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                tc.a0(n3Var.a.a).k(false).j();
                break;
            case 23:
                k0 k0Var2 = (k0) this.b;
                we.f fVar4 = (we.f) this.c;
                int i17 = k0Var2.H - fVar4.c;
                k0Var2.H = i17;
                if (fVar4.d) {
                    k0Var2.I = fVar4.e;
                    k0Var2.J = true;
                }
                if (fVar4.f) {
                    k0Var2.K = fVar4.g;
                }
                if (i17 == 0) {
                    r2 r2Var = ((w1) fVar4.h).a;
                    if (!k0Var2.i0.a.p() && r2Var.p()) {
                        k0Var2.j0 = -1;
                        k0Var2.k0 = 0L;
                    }
                    if (!r2Var.p()) {
                        List asList = Arrays.asList(((f2) r2Var).r);
                        f5.a.i(asList.size() == k0Var2.o.size());
                        for (int i18 = 0; i18 < asList.size(); i18++) {
                            ((j0) k0Var2.o.get(i18)).b = (r2) asList.get(i18);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (k0Var2.J) {
                        if (((w1) fVar4.h).b.equals(k0Var2.i0.b) && ((w1) fVar4.h).d == k0Var2.i0.r) {
                            z11 = false;
                        }
                        if (z11) {
                            if (r2Var.p() || ((w1) fVar4.h).b.a()) {
                                j11 = ((w1) fVar4.h).d;
                            } else {
                                w1 w1Var = (w1) fVar4.h;
                                l4.c0 c0Var = w1Var.b;
                                long j12 = w1Var.d;
                                Object obj = c0Var.a;
                                p2 p2Var = k0Var2.n;
                                r2Var.g(obj, p2Var);
                                j11 = j12 + p2Var.e;
                            }
                        }
                        z10 = z11;
                        j10 = j11;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    k0Var2.J = false;
                    k0Var2.o0((w1) fVar4.h, 1, k0Var2.K, false, z10, k0Var2.I, j10, -1, false);
                    break;
                }
                break;
            case 24:
                h0 h0Var4 = (h0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList2 = h0Var4.a.m0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((x61) ((t) obj2)).F.onSurfaceTextureUpdated(surfaceTexture);
                }
                break;
            case 25:
                jh.y yVar2 = (jh.y) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i19 = yVar2.a;
                ArrayList arrayList3 = yVar2.e;
                yVar2.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (yVar2.c <= 0) {
                        arrayList3.clear();
                    }
                    yVar2.c = connectedstarrefbots.count;
                    arrayList3.addAll(connectedstarrefbots.connected_bots);
                    yVar2.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList3.size() >= yVar2.c;
                } else {
                    yVar2.h = true;
                    yVar2.d = true;
                }
                yVar2.g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(yVar2.b));
                break;
            case 26:
                z zVar = (z) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i20 = zVar.a;
                ArrayList arrayList4 = zVar.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (zVar.c <= 0) {
                        arrayList4.clear();
                    }
                    zVar.c = suggestedstarrefbots.count;
                    arrayList4.addAll(suggestedstarrefbots.suggested_bots);
                    zVar.j = suggestedstarrefbots.next_offset;
                    zVar.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList4.size() >= zVar.c;
                } else {
                    zVar.i = true;
                    zVar.d = true;
                }
                zVar.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(zVar.b));
                break;
            case 27:
                h5.U0((h5) this.b, (Long) this.c);
                break;
            case 28:
                h5 h5Var = (h5) this.b;
                if (((s7) this.c).e) {
                    h5Var.f0.setLoading(false);
                    h5Var.w1();
                    break;
                } else {
                    mc Q = h5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                }
            default:
                ((h5) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                break;
        }
    }
}
