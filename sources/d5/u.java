package d5;

import ag.j0;
import ag.n0;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import gh.b2;
import gh.d1;
import gh.t3;
import gh.v1;
import h3.f2;
import h3.h0;
import h3.k0;
import h3.p2;
import h3.s2;
import h3.w1;
import hh.i5;
import hh.u7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        boolean z10;
        mc a02;
        int i10;
        int i11;
        int i12 = 2;
        int i13 = 8;
        boolean z11 = true;
        int i14 = 0;
        switch (this.a) {
            case 0:
                ((com.google.android.exoplayer2.upstream.s) this.c).a(((x) this.b).g());
                return;
            case 1:
                dh.k kVar = (dh.k) this.b;
                kVar.b.add((String) this.c);
                kVar.invalidate();
                return;
            case 2:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 3:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 4:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                v0.i iVar = dVar.f;
                if (iVar != null) {
                    iVar.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.j.h("callback");
                    throw null;
                }
            case 5:
                xe.b bVar = (xe.b) this.b;
                e5.x xVar = (e5.x) this.c;
                h0 h0Var = (h0) bVar.c;
                int i15 = g0.a;
                k0 k0Var = h0Var.a;
                k0Var.g0 = xVar;
                k0Var.l.e(25, new h3.e0(xVar));
                return;
            case 6:
                xe.b bVar2 = (xe.b) this.b;
                String str = (String) this.c;
                h0 h0Var2 = (h0) bVar2.c;
                int i16 = g0.a;
                i3.f fVar = h0Var2.a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1019, new i3.d(k10, str, 16));
                return;
            case 7:
                xe.b bVar3 = (xe.b) this.b;
                Exception exc = (Exception) this.c;
                h0 h0Var3 = (h0) bVar3.c;
                int i17 = g0.a;
                i3.f fVar2 = h0Var3.a.r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1030, new i3.d(k11, exc, 22));
                return;
            case 8:
                ((n0) this.b).run((TLRPC.Chat) this.c);
                return;
            case 9:
                fh.v vVar = (fh.v) this.b;
                d5 d5Var = (d5) this.c;
                int i18 = vVar.k;
                n2 n2Var = vVar.g;
                TLRPC.TL_chatInviteImporter importer = d5Var.getImporter();
                vVar.r = importer;
                LongSparseArray longSparseArray = vVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user == null) {
                    return;
                }
                n2Var.getMessagesController().putUser(user, false);
                Point point = AndroidUtilities.displaySize;
                boolean z12 = point.x > point.y;
                if (user.photo == null || z12) {
                    vVar.b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                if (vVar.s == null) {
                    fh.u uVar = new fh.u(vVar, n2Var.getParentActivity(), (zk0) d5Var.getParent(), n2Var.getResourceProvider(), vVar.a);
                    vVar.s = uVar;
                    TLRPC.TL_chatInviteImporter tL_chatInviteImporter = vVar.r;
                    n9 avatarImageView = d5Var.getAvatarImageView();
                    TextView textView = uVar.e;
                    ch0 ch0Var = uVar.h;
                    uVar.r = tL_chatInviteImporter;
                    uVar.v = avatarImageView;
                    TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                    ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                    ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                    if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                        MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                    }
                    ch0Var.setParentAvatarImage(avatarImageView);
                    ch0Var.M(tL_chatInviteImporter.user_id, true);
                    ch0Var.H(null, forUserOrChat, forUserOrChat2, true);
                    uVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                    textView.setText(tL_chatInviteImporter.about);
                    textView.setVisibility(TextUtils.isEmpty(tL_chatInviteImporter.about) ? 8 : 0);
                    uVar.y.requestLayout();
                    vVar.s.setOnDismissListener(new j0(vVar, 2));
                    vVar.s.show();
                    return;
                }
                return;
            case 10:
                gh.c cVar2 = (gh.c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                cVar2.getClass();
                onClickListener.onClick(cVar2);
                return;
            case 11:
                ((v1) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                return;
            case 12:
                b2 b2Var = (b2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                b2Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                b2Var.B.setVisibility(8);
                return;
            case 13:
                wq0 wq0Var = (wq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                wq0Var.h(tL_starGiftCollection.title, new d1(i12, wq0Var, tL_starGiftCollection));
                return;
            case 14:
                t3 t3Var = (t3) this.b;
                AndroidUtilities.addToClipboard((String) this.c);
                mc.a0(t3Var.a.a).k(false).j();
                return;
            case 15:
                ((e0) this.b).d((Typeface) this.c);
                return;
            case 16:
                k0 k0Var2 = (k0) this.b;
                ue.f fVar3 = (ue.f) this.c;
                int i19 = k0Var2.H - fVar3.c;
                k0Var2.H = i19;
                if (fVar3.d) {
                    k0Var2.I = fVar3.e;
                    k0Var2.J = true;
                }
                if (fVar3.f) {
                    k0Var2.K = fVar3.g;
                }
                if (i19 == 0) {
                    s2 s2Var = ((w1) fVar3.h).a;
                    if (!k0Var2.i0.a.p() && s2Var.p()) {
                        k0Var2.j0 = -1;
                        k0Var2.k0 = 0L;
                    }
                    if (!s2Var.p()) {
                        List asList = Arrays.asList(((f2) s2Var).r);
                        a.i(asList.size() == k0Var2.o.size());
                        for (int i20 = 0; i20 < asList.size(); i20++) {
                            ((h3.j0) k0Var2.o.get(i20)).b = (s2) asList.get(i20);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (k0Var2.J) {
                        if (((w1) fVar3.h).b.equals(k0Var2.i0.b) && ((w1) fVar3.h).d == k0Var2.i0.r) {
                            z11 = false;
                        }
                        if (z11) {
                            if (s2Var.p() || ((w1) fVar3.h).b.a()) {
                                j11 = ((w1) fVar3.h).d;
                            } else {
                                w1 w1Var = (w1) fVar3.h;
                                j4.c0 c0Var = w1Var.b;
                                long j12 = w1Var.d;
                                Object obj = c0Var.a;
                                p2 p2Var = k0Var2.n;
                                s2Var.g(obj, p2Var);
                                j11 = j12 + p2Var.e;
                            }
                        }
                        j10 = j11;
                        z10 = z11;
                    } else {
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    k0Var2.J = false;
                    k0Var2.o0((w1) fVar3.h, 1, k0Var2.K, false, z10, k0Var2.I, j10, -1, false);
                    return;
                }
                return;
            case 17:
                h0 h0Var4 = (h0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList = h0Var4.a.m0;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((m61) ((e5.s) obj2)).F.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 18:
                hh.z zVar = (hh.z) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i21 = zVar.a;
                ArrayList arrayList2 = zVar.e;
                zVar.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i21).putUsers(connectedstarrefbots.users, false);
                    if (zVar.c <= 0) {
                        arrayList2.clear();
                    }
                    zVar.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    zVar.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= zVar.c;
                } else {
                    zVar.h = true;
                    zVar.d = true;
                }
                zVar.g = false;
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(zVar.b));
                return;
            case 19:
                hh.a0 a0Var = (hh.a0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i22 = a0Var.a;
                ArrayList arrayList3 = a0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i22).putUsers(suggestedstarrefbots.users, false);
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
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(a0Var.b));
                return;
            case 20:
                i5.U0((i5) this.b, (Long) this.c);
                return;
            case 21:
                i5 i5Var = (i5) this.b;
                if (((u7) this.c).e) {
                    i5Var.f0.setLoading(false);
                    i5Var.w1();
                    return;
                } else {
                    ec Q = i5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    return;
                }
            case 22:
                ((i5) this.b).getBulletinFactory().d0((TLRPC.TL_error) this.c, false);
                return;
            case 23:
                MessagesController.getInstance(((i5) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 24:
                i5 i5Var2 = (i5) this.b;
                boolean[] zArr = (boolean[]) this.c;
                i5Var2.getClass();
                zArr[0] = true;
                i5Var2.f0.setLoading(false);
                i5Var2.w1();
                return;
            case 25:
                i5 i5Var3 = (i5) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                i5Var3.getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 26:
                i5 i5Var4 = (i5) this.b;
                mc.a0((rn) this.c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(i5Var4.T))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new hh.v1(i5Var4, i13)).k(true);
                return;
            case 27:
                ((i5) this.b).n2((CharSequence) this.c);
                return;
            case 28:
                i5.I0((i5) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                b2Var2.dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = mc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    } else {
                        a02 = mc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    }
                    y1.q(i11, a02, i10, 36);
                    return;
                }
                return;
        }
    }
}
