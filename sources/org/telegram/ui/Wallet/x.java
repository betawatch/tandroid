package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.eh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.b;
                c8 c8Var = (c8) this.c;
                String str = (String) obj;
                if (str != null) {
                    h0Var.close();
                    m0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    c8Var.run(null, str);
                    break;
                } else {
                    m0.F("prepare disable backup: done!");
                    c8Var.run(h0Var, null);
                    break;
                }
            case 1:
                ((f2) this.b).h = false;
                ((eh) this.c).run(null, (String) obj);
                break;
            case 2:
                ((j0) this.b).close();
                ((p) this.c).run((String) obj);
                break;
            case 3:
                ((j0) this.b).close();
                ((p) this.c).run((String) obj);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new h((a2) this.b, (l) this.c, (String) obj, 7));
                break;
            case 5:
                ((j0) this.b).close();
                ((x) this.c).run((String) obj);
                break;
            case 6:
                l5 l5Var = (l5) this.b;
                m0 m0Var = (m0) this.c;
                String str2 = (String) obj;
                l5Var.D0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    z7 z7Var = new z7();
                    z7Var.s = m0Var.x();
                    l5Var.presentFragment(z7Var);
                    break;
                } else if (str2 != null) {
                    xc.a0(l5Var).e0(str2, false);
                    break;
                } else {
                    l5Var.presentFragment(new t9());
                    break;
                }
            case 7:
                z7 z7Var2 = (z7) this.b;
                m0 m0Var2 = (m0) this.c;
                String str3 = (String) obj;
                z7Var2.d.setLoading(false);
                if (str3 != null) {
                    xc.a0(z7Var2).e0(str3, false);
                    break;
                } else {
                    z7Var2.finishFragment();
                    m0Var2.J();
                    break;
                }
            case 8:
                k8 k8Var = (k8) this.b;
                h hVar = (h) this.c;
                String str4 = (String) obj;
                if (str4 != null) {
                    xc.a0(k8Var).e0(str4, false);
                    break;
                } else {
                    hVar.run();
                    break;
                }
            case 9:
                k8 k8Var2 = (k8) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                String str5 = (String) obj;
                if (str5 != null) {
                    xc.a0(k8Var2).e0(str5, false);
                    break;
                } else {
                    k8Var2.finishFragment();
                    if (n2Var instanceof l5) {
                        AndroidUtilities.runOnUIThread(new v2(1, n2Var), 300L);
                        break;
                    }
                }
                break;
            case 10:
                ((k8) this.b).a.W2.N(true);
                ((Utilities.Callback) this.c).run((String) obj);
                break;
            case 11:
                t9 t9Var = (t9) this.b;
                String str6 = (String) obj;
                ((Utilities.Callback) this.c).run(str6);
                if (str6 == null && !t9Var.n) {
                    if (t9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.n2 n2Var2 : t9Var.getParentLayout().getFragmentStack()) {
                            if (n2Var2 instanceof l5) {
                                ((l5) n2Var2).I0();
                            }
                        }
                    }
                    t9Var.finishFragment();
                    break;
                }
                break;
            case 12:
                da.Y((da) this.b, (TL_wallet.tonConnectSession) this.c, (Utilities.Callback) obj);
                break;
            case 13:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.b;
                org.telegram.ui.web.f1[] f1VarArr = (org.telegram.ui.web.f1[]) this.c;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                x1Var.getClass();
                f1VarArr[0].finishFragment();
                Utilities.Callback callback = x1Var.e;
                if (callback != null) {
                    x1Var.finishFragment();
                    callback.run(b1Var);
                    break;
                } else {
                    pf.d.r(x1Var.getParentActivity(), b1Var.c);
                    break;
                }
            case 14:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.b;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new ay0(h2Var, (org.telegram.ui.web.g2) this.c, (Bitmap) obj, 11));
                break;
            case 15:
                yh.p1 p1Var = (yh.p1) this.b;
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
            case 16:
                ai.x9 x9Var = (ai.x9) this.b;
                ai.z zVar = (ai.z) this.c;
                if (((Object[]) obj)[1] == x9Var) {
                    zVar.run();
                    break;
                }
                break;
            case 17:
                is0 is0Var = (is0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                String str7 = (String) obj;
                ai.v9 v9Var = is0Var.e;
                int i10 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i11 = v9Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(v9Var.b);
                updatestargiftcollection.collection_id = i10;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                is0Var.f(true);
                break;
            default:
                yh.y4 y4Var = (yh.y4) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                long j10 = y4Var.Z;
                Runnable runnable = y4Var.g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.p4(0, user), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
        }
    }

    public /* synthetic */ x(m0 m0Var, h0 h0Var, c8 c8Var) {
        this.a = 0;
        this.b = h0Var;
        this.c = c8Var;
    }
}
