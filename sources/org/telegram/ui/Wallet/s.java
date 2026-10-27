package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((i0) this.b).close();
                ((x7) this.c).run((String) obj);
                break;
            case 1:
                l0 l0Var = (l0) this.b;
                l0Var.q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.c);
                break;
            case 2:
                g0 g0Var = (g0) this.b;
                z7 z7Var = (z7) this.c;
                String str = (String) obj;
                if (str != null) {
                    g0Var.close();
                    l0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    z7Var.run(null, str);
                    break;
                } else {
                    l0.H("prepare disable backup: done!");
                    z7Var.run(g0Var, null);
                    break;
                }
            case 3:
                ((e2) this.b).h = false;
                ((kh) this.c).run(null, (String) obj);
                break;
            case 4:
                ((i0) this.b).close();
                ((o) this.c).run((String) obj);
                break;
            case 5:
                ((i0) this.b).close();
                ((o) this.c).run((String) obj);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new h((z1) this.b, (k) this.c, (String) obj, 7));
                break;
            case 7:
                ((i0) this.b).close();
                ((s) this.c).run((String) obj);
                break;
            case 8:
                m5 m5Var = (m5) this.b;
                l0 l0Var2 = (l0) this.c;
                String str2 = (String) obj;
                m5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    w7 w7Var = new w7();
                    w7Var.s = l0Var2.y();
                    m5Var.presentFragment(w7Var);
                    break;
                } else if (str2 != null) {
                    wc.b0(m5Var).f0(str2, false);
                    break;
                } else {
                    m5Var.presentFragment(new r9());
                    break;
                }
            case 9:
                w7 w7Var2 = (w7) this.b;
                l0 l0Var3 = (l0) this.c;
                String str3 = (String) obj;
                w7Var2.d.setLoading(false);
                if (str3 != null) {
                    wc.b0(w7Var2).f0(str3, false);
                    break;
                } else {
                    w7Var2.finishFragment();
                    l0Var3.L();
                    break;
                }
            case 10:
                h8 h8Var = (h8) this.b;
                h hVar = (h) this.c;
                String str4 = (String) obj;
                if (str4 != null) {
                    wc.b0(h8Var).f0(str4, false);
                    break;
                } else {
                    hVar.run();
                    break;
                }
            case 11:
                h8 h8Var2 = (h8) this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                String str5 = (String) obj;
                if (str5 != null) {
                    wc.b0(h8Var2).f0(str5, false);
                    break;
                } else {
                    h8Var2.finishFragment();
                    if (r2Var instanceof m5) {
                        AndroidUtilities.runOnUIThread(new t2(2, r2Var), 300L);
                        break;
                    }
                }
                break;
            case 12:
                ((h8) this.b).a.g3.O(true);
                ((Utilities.Callback) this.c).run((String) obj);
                break;
            case 13:
                r9 r9Var = (r9) this.b;
                String str6 = (String) obj;
                ((Utilities.Callback) this.c).run(str6);
                if (str6 == null && !r9Var.r) {
                    if (r9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.r2 r2Var2 : r9Var.getParentLayout().getFragmentStack()) {
                            if (r2Var2 instanceof m5) {
                                ((m5) r2Var2).K0();
                            }
                        }
                    }
                    r9Var.finishFragment();
                    break;
                }
                break;
            case 14:
                ca.Z((ca) this.b, (TL_wallet.tonConnectSession) this.c, (Utilities.Callback) obj);
                break;
            case 15:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                org.telegram.ui.web.f1[] f1VarArr = (org.telegram.ui.web.f1[]) this.c;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                y1Var.getClass();
                f1VarArr[0].finishFragment();
                Utilities.Callback callback = y1Var.f;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(b1Var);
                    break;
                } else {
                    qf.d.r(y1Var.getParentActivity(), b1Var.c);
                    break;
                }
            case 16:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.b;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new oy0(h2Var, (org.telegram.ui.web.g2) this.c, (Bitmap) obj, 11));
                break;
            case 17:
                zh.p1 p1Var = (zh.p1) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                Boolean bool = (Boolean) obj;
                p1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    p1Var.skipDismissAnimation();
                }
                p1Var.dismiss();
                break;
            case 18:
                bi.t9 t9Var = (bi.t9) this.b;
                bi.a0 a0Var = (bi.a0) this.c;
                if (((Object[]) obj)[1] == t9Var) {
                    a0Var.run();
                    break;
                }
                break;
            case 19:
                ws0 ws0Var = (ws0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                String str7 = (String) obj;
                bi.q9 q9Var = ws0Var.e;
                int i10 = tL_starGiftCollection.collection_id;
                q9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i11 = q9Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(q9Var.b);
                updatestargiftcollection.collection_id = i10;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                ws0Var.f(true);
                break;
            default:
                zh.y4 y4Var = (zh.y4) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                long j10 = y4Var.Z;
                Runnable runnable = y4Var.g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new zh.p4(0, user), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
        }
    }

    public /* synthetic */ s(l0 l0Var, g0 g0Var, z7 z7Var) {
        this.a = 2;
        this.b = g0Var;
        this.c = z7Var;
    }
}
