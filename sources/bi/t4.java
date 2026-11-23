package bi;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.TextUtils;
import org.telegram.messenger.az;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vf;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t4(az azVar, TLRPC.Message message, int i7, int i10, boolean z10) {
        this.e = azVar;
        this.f = message;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document e10;
        int i7 = this.a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        tL_starGiftUnique = null;
        int i10 = this.c;
        Object obj = this.f;
        boolean z10 = this.d;
        int i11 = this.b;
        Object obj2 = this.e;
        int i12 = 1;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    np.u1(i11).f4(tL_payments_uniqueStarGift.users, false);
                    np.u1(i11).Z3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                if (tL_starGiftUnique != null && (!z10 ? !TextUtils.isEmpty(tL_starGiftUnique.owner_address) : !org.telegram.ui.Wallet.u0.c(tL_starGiftUnique.owner_address, org.telegram.ui.Wallet.u0.D(i11).y()))) {
                    if (z10) {
                        org.telegram.ui.Wallet.u0.D(i11).B().i(tL_starGiftUnique);
                    }
                    di.y8.y(i11, false).a0(tL_starGiftUnique);
                    di.y8.y(i11, false).O(k10.i(i11).e());
                    break;
                } else {
                    int i13 = i10 + 1;
                    if (i13 < 8) {
                        org.telegram.messenger.g0.h3(new r4(i11, i13, str, z10), x4.b[i13]);
                        break;
                    }
                }
                break;
            case 1:
                az azVar = (az) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                azVar.getMediaDataController().y0(message.dialog_id);
                azVar.getNotificationCenter().k(21, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                azVar.getNotificationCenter().k(22, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                azVar.d0(i11);
                azVar.i0(i11, z10);
                break;
            case 2:
                bn bnVar = (bn) obj2;
                xi0 xi0Var = (xi0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = bnVar.g9;
                if (g1Var != null && bnVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = bnVar.getParentActivity();
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        bnVar.g9.showAtLocation(bnVar.A0, 51, i11, i10);
                        bnVar.ia(bnVar.g9);
                        if (z10 && xi0Var != null) {
                            xi0Var.r(true);
                        }
                        org.telegram.messenger.g0.h3(new vf(bnVar, i12), 420L);
                        break;
                    }
                }
                break;
            case 3:
                qb qbVar = (qb) obj2;
                ch.p0 p0Var = (ch.p0) obj;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                long j3 = p0Var.g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(k10.t0).r.get(p0Var.f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    e10 = org.telegram.ui.Components.p5.e(k10.t0, j3);
                }
                if (e10 != null && Q != null) {
                    lc.b0(Q).y(qbVar.a.h, e10, z10 ? new jg.q(i11, i10, Q, 10) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) obj;
                if (i11 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i11);
                } else if (i11 == 4 || i11 == 5) {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i11);
                    notificationsSettingsActivity.getNotificationsController().m(i11);
                } else {
                    notificationsSettingsActivity.getNotificationsController().U(i11, !z10 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                j5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.g(i10);
                break;
        }
    }

    public /* synthetic */ t4(TLObject tLObject, int i7, boolean z10, int i10, String str) {
        this.e = tLObject;
        this.b = i7;
        this.d = z10;
        this.c = i10;
        this.f = str;
    }

    public /* synthetic */ t4(bn bnVar, int i7, int i10, boolean z10, xi0 xi0Var) {
        this.e = bnVar;
        this.b = i7;
        this.c = i10;
        this.d = z10;
        this.f = xi0Var;
    }

    public /* synthetic */ t4(qb qbVar, ch.p0 p0Var, boolean z10, int i7, int i10) {
        this.e = qbVar;
        this.f = p0Var;
        this.d = z10;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ t4(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i10) {
        this.e = notificationsSettingsActivity;
        this.b = i7;
        this.d = z10;
        this.f = j5Var;
        this.c = i10;
    }
}
