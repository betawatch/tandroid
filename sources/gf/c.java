package gf;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import cg.h0;
import g5.r;
import gg.b0;
import gg.b1;
import gg.b2;
import gg.t0;
import gg.v2;
import h5.d0;
import h5.u;
import hh.k;
import i5.t;
import i5.y;
import j3.a0;
import j3.c0;
import j3.e0;
import j3.e2;
import j3.f0;
import j3.m2;
import j3.o2;
import j3.u1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kh.a1;
import kh.n3;
import kh.r1;
import kh.x1;
import l3.k0;
import l3.q;
import lh.z;
import o4.v;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        boolean z4;
        int i10 = 2;
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
                return;
            case 1:
                e eVar2 = (e) this.b;
                TLRPC.Document document2 = (TLRPC.Document) this.c;
                FileLoader.getInstance(eVar2.c).loadFile(document2, document2, 0, 0);
                return;
            case 2:
                f fVar = (f) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i12 = fVar.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i12).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i12).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 3:
                ((b2) this.b).run((ArrayList) this.c);
                return;
            case 4:
                ((t0) this.b).run((TLRPC.TL_error) this.c);
                return;
            case 5:
                ((vk) this.b).run((ArrayList) this.c);
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b0(callback, smallGroupsParticipantsCount, 0));
                return;
            case 7:
                ic M = qc.a0((xn) this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)), R.raw.stars_send);
                M.j = 5000;
                M.k(true);
                return;
            case 8:
                b1 b1Var = (b1) this.b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.c;
                b1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b1Var.Y, Boolean.TRUE, prepaidGiveaway);
                return;
            case 9:
                v2.P((v2) this.b, (TLObject) this.c);
                return;
            case 10:
                ((h5.b0) this.b).e((Typeface) this.c);
                return;
            case 11:
                ((r) this.c).a(((u) this.b).f());
                return;
            case 12:
                k kVar = (k) this.b;
                kVar.b.add((String) this.c);
                kVar.invalidate();
                return;
            case 13:
                f7.b bVar = (f7.b) this.b;
                y yVar = (y) this.c;
                c0 c0Var = (c0) bVar.c;
                int i13 = d0.a;
                f0 f0Var = c0Var.a;
                f0Var.d0 = yVar;
                f0Var.l.e(25, new a0(yVar));
                return;
            case 14:
                f7.b bVar2 = (f7.b) this.b;
                String str = (String) this.c;
                c0 c0Var2 = (c0) bVar2.c;
                int i14 = d0.a;
                k3.f fVar2 = c0Var2.a.q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1019, new k3.c(p10, str, 26));
                return;
            case 15:
                f7.b bVar3 = (f7.b) this.b;
                Exception exc = (Exception) this.c;
                c0 c0Var3 = (c0) bVar3.c;
                int i15 = d0.a;
                k3.f fVar3 = c0Var3.a.q;
                k3.a p11 = fVar3.p();
                fVar3.q(p11, 1030, new k3.e(p11, exc, 4));
                return;
            case 16:
                ((h0) this.b).run((TLRPC.Chat) this.c);
                return;
            case 17:
                f0 f0Var2 = (f0) this.b;
                ye.f fVar4 = (ye.f) this.c;
                int i16 = f0Var2.F - fVar4.c;
                f0Var2.F = i16;
                if (fVar4.d) {
                    f0Var2.G = fVar4.e;
                    f0Var2.H = true;
                }
                if (fVar4.f) {
                    f0Var2.I = fVar4.g;
                }
                if (i16 == 0) {
                    o2 o2Var = ((u1) fVar4.h).a;
                    if (!f0Var2.f0.a.p() && o2Var.p()) {
                        f0Var2.g0 = -1;
                        f0Var2.h0 = 0L;
                    }
                    if (!o2Var.p()) {
                        List asList = Arrays.asList(((e2) o2Var).r);
                        h5.a.i(asList.size() == f0Var2.o.size());
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((e0) f0Var2.o.get(i17)).b = (o2) asList.get(i17);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (f0Var2.H) {
                        boolean z10 = (((u1) fVar4.h).b.equals(f0Var2.f0.b) && ((u1) fVar4.h).d == f0Var2.f0.r) ? false : true;
                        if (z10) {
                            if (o2Var.p() || ((u1) fVar4.h).b.a()) {
                                j11 = ((u1) fVar4.h).d;
                            } else {
                                u1 u1Var = (u1) fVar4.h;
                                v vVar = u1Var.b;
                                long j12 = u1Var.d;
                                Object obj = vVar.a;
                                m2 m2Var = f0Var2.n;
                                o2Var.g(obj, m2Var);
                                j11 = j12 + m2Var.e;
                            }
                        }
                        j10 = j11;
                        z4 = z10;
                    } else {
                        j10 = -9223372036854775807L;
                        z4 = false;
                    }
                    f0Var2.H = false;
                    f0Var2.h0((u1) fVar4.h, 1, f0Var2.I, z4, f0Var2.G, j10, -1);
                    return;
                }
                return;
            case 18:
                c0 c0Var4 = (c0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList2 = c0Var4.a.j0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((i71) ((t) obj2)).G.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 19:
                jh.v vVar2 = (jh.v) this.b;
                g5 g5Var = (g5) this.c;
                int i18 = vVar2.k;
                p2 p2Var = vVar2.g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                vVar2.r = importer;
                LongSparseArray longSparseArray = vVar2.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                p2Var.getMessagesController().putUser(user, false);
                Point point = AndroidUtilities.displaySize;
                boolean z11 = point.x > point.y;
                if (user.photo == null || z11) {
                    vVar2.b = true;
                    p2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    p2Var.presentFragment(profileActivity);
                    return;
                }
                if (vVar2.s == null) {
                    jh.u uVar = new jh.u(vVar2, p2Var.getParentActivity(), (sl0) g5Var.getParent(), p2Var.getResourceProvider(), vVar2.a);
                    vVar2.s = uVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar2.r;
                    p9 avatarImageView = g5Var.getAvatarImageView();
                    TextView textView = uVar.e;
                    vh0 vh0Var = uVar.h;
                    uVar.r = tL_chatInviteImporter;
                    uVar.v = avatarImageView;
                    TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                    if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                    }
                    vh0Var.setParentAvatarImage(avatarImageView);
                    vh0Var.M(tL_chatInviteImporter.user_id, true);
                    vh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    uVar.y.requestLayout();
                    vVar2.s.setOnDismissListener(new eg.d0(vVar2, 2));
                    vVar2.s.show();
                    return;
                }
                return;
            case 20:
                kh.c cVar = (kh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar.getClass();
                onClickListener.onClick(cVar);
                return;
            case 21:
                ((r1) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                return;
            case 22:
                x1 x1Var = (x1) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                x1Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                x1Var.C.setVisibility(8);
                return;
            case 23:
                or0 or0Var = (or0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                or0Var.h(tL_starGiftCollection.title, new a1(i10, or0Var, tL_starGiftCollection));
                return;
            case 24:
                n3 n3Var = (n3) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                qc.a0(n3Var.a.a).k(false).j();
                return;
            case 25:
                f7.b bVar4 = (f7.b) this.b;
                String str2 = (String) this.c;
                q qVar = (q) bVar4.c;
                int i19 = d0.a;
                k3.f fVar5 = ((c0) qVar).a.q;
                k3.a p12 = fVar5.p();
                fVar5.q(p12, 1012, new k3.c(p12, str2, 7));
                return;
            case 26:
                AudioTrack audioTrack = (AudioTrack) this.b;
                h5.c cVar2 = (h5.c) this.c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    cVar2.c();
                    synchronized (k0.g0) {
                        try {
                            int i20 = k0.i0 - 1;
                            k0.i0 = i20;
                            if (i20 == 0) {
                                k0.h0.shutdown();
                                k0.h0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    cVar2.c();
                    synchronized (k0.g0) {
                        try {
                            int i21 = k0.i0 - 1;
                            k0.i0 = i21;
                            if (i21 == 0) {
                                k0.h0.shutdown();
                                k0.h0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 27:
                lh.y yVar2 = (lh.y) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i22 = yVar2.a;
                ArrayList arrayList3 = yVar2.e;
                yVar2.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i22).putUsers(connectedstarrefbots.users, false);
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
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(yVar2.b));
                return;
            case 28:
                z zVar = (z) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i23 = zVar.a;
                ArrayList arrayList4 = zVar.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i23).putUsers(suggestedstarrefbots.users, false);
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
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(zVar.b));
                return;
            default:
                lh.g5.U0((lh.g5) this.b, (Long) this.c);
                return;
        }
    }
}
