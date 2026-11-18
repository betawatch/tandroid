package bi;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.TextUtils;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p4(zy zyVar, TLRPC.Message message, int i7, int i10, boolean z10) {
        this.e = zyVar;
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
                    mp.u1(i11).f4(tL_payments_uniqueStarGift.users, false);
                    mp.u1(i11).Z3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                if (tL_starGiftUnique != null && (!z10 ? !TextUtils.isEmpty(tL_starGiftUnique.owner_address) : !org.telegram.ui.Wallet.u0.c(tL_starGiftUnique.owner_address, org.telegram.ui.Wallet.u0.D(i11).y()))) {
                    if (z10) {
                        org.telegram.ui.Wallet.u0.D(i11).B().i(tL_starGiftUnique);
                    }
                    di.x8.y(i11, false).a0(tL_starGiftUnique);
                    di.x8.y(i11, false).O(j10.i(i11).e());
                    break;
                } else {
                    int i13 = i10 + 1;
                    if (i13 < 8) {
                        org.telegram.messenger.g0.h3(new n4(i11, i13, str, z10), v4.b[i13]);
                        break;
                    }
                }
                break;
            case 1:
                zy zyVar = (zy) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                zyVar.getMediaDataController().y0(message.dialog_id);
                zyVar.getNotificationCenter().k(21, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                zyVar.getNotificationCenter().k(22, Integer.valueOf(i11), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), Boolean.valueOf(z10));
                zyVar.d0(i11);
                zyVar.i0(i11, z10);
                break;
            case 2:
                bn bnVar = (bn) obj2;
                vi0 vi0Var = (vi0) obj;
                org.telegram.ui.ActionBar.h1 h1Var = bnVar.g9;
                if (h1Var != null && bnVar.fragmentView != null && !h1Var.isShowing()) {
                    Activity parentActivity = bnVar.getParentActivity();
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        bnVar.g9.showAtLocation(bnVar.A0, 51, i11, i10);
                        bnVar.ia(bnVar.g9);
                        if (z10 && vi0Var != null) {
                            vi0Var.r(true);
                        }
                        org.telegram.messenger.g0.h3(new vf(bnVar, i12), 420L);
                        break;
                    }
                }
                break;
            case 3:
                qb qbVar = (qb) obj2;
                ch.p0 p0Var = (ch.p0) obj;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                long j3 = p0Var.g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.t0).r.get(p0Var.f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    }
                } else {
                    e10 = org.telegram.ui.Components.o5.e(j10.t0, j3);
                }
                if (e10 != null && Q != null) {
                    lc.b0(Q).y(qbVar.a.h, e10, z10 ? new jg.q(i11, i10, Q, 10) : null).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) obj;
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
                i5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.c.g(i10);
                break;
        }
    }

    public /* synthetic */ p4(TLObject tLObject, int i7, boolean z10, int i10, String str) {
        this.e = tLObject;
        this.b = i7;
        this.d = z10;
        this.c = i10;
        this.f = str;
    }

    public /* synthetic */ p4(bn bnVar, int i7, int i10, boolean z10, vi0 vi0Var) {
        this.e = bnVar;
        this.b = i7;
        this.c = i10;
        this.d = z10;
        this.f = vi0Var;
    }

    public /* synthetic */ p4(qb qbVar, ch.p0 p0Var, boolean z10, int i7, int i10) {
        this.e = qbVar;
        this.f = p0Var;
        this.d = z10;
        this.b = i7;
        this.c = i10;
    }

    public /* synthetic */ p4(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i10) {
        this.e = notificationsSettingsActivity;
        this.b = i7;
        this.d = z10;
        this.f = i5Var;
        this.c = i10;
    }
}
