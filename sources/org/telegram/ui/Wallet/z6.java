package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.ze0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                a7 a7Var = (a7) obj3;
                k0 k0Var = (k0) obj2;
                String str = (String) obj;
                a7Var.d.setLoading(false);
                if (str != null) {
                    zc.a0(a7Var).e0(str, false);
                    break;
                } else {
                    a7Var.finishFragment();
                    k0Var.I();
                    break;
                }
            case 1:
                l7 l7Var = (l7) obj3;
                l lVar = (l) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    zc.a0(l7Var).e0(str2, false);
                    break;
                } else {
                    lVar.run();
                    break;
                }
            case 2:
                l7 l7Var2 = (l7) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    zc.a0(l7Var2).e0(str3, false);
                    break;
                } else {
                    l7Var2.finishFragment();
                    if (m2Var instanceof a5) {
                        AndroidUtilities.runOnUIThread(new n(m2Var, 11), 300L);
                        break;
                    }
                }
                break;
            case 3:
                ((l7) obj3).a.W2.N(true);
                ((Utilities.Callback) obj2).run((String) obj);
                break;
            case 4:
                s8 s8Var = (s8) obj3;
                String str4 = (String) obj;
                ((Utilities.Callback) obj2).run(str4);
                if (str4 == null && !s8Var.n) {
                    if (s8Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.m2 m2Var2 : s8Var.getParentLayout().getFragmentStack()) {
                            if (m2Var2 instanceof a5) {
                                a5 a5Var = (a5) m2Var2;
                                a5Var.f0 = 0;
                                di.h1 h1Var = a5Var.n0;
                                if (h1Var != null) {
                                    h1Var.setPosition(0);
                                }
                            }
                        }
                    }
                    s8Var.finishFragment();
                    break;
                }
                break;
            case 5:
                c9.Y((c9) obj3, (TL_wallet.tonConnectSession) obj2, (Utilities.Callback) obj);
                break;
            case 6:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj3;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                z1Var.getClass();
                ((org.telegram.ui.web.h1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = z1Var.e;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(d1Var);
                    break;
                } else {
                    pf.d.r(z1Var.getParentActivity(), d1Var.c);
                    break;
                }
            case 7:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj3;
                i2Var.getClass();
                AndroidUtilities.runOnUIThread(new ze0(i2Var, (org.telegram.ui.web.h2) obj2, (Bitmap) obj, 26));
                break;
            case 8:
                yh.p1 p1Var = (yh.p1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
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
            case 9:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((zh.f5) obj3)) {
                    fVar.run();
                    break;
                }
                break;
            case 10:
                ns0 ns0Var = (ns0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                zh.e5 e5Var = ns0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                e5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i13 = e5Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i13).getInputPeer(e5Var.b);
                updatestargiftcollection.collection_id = i12;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                ns0Var.f(true);
                break;
            case 11:
                yh.x4 x4Var = (yh.x4) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                long j10 = x4Var.Z;
                Runnable runnable = x4Var.g0;
                if (runnable != null) {
                    runnable.run();
                }
                x4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.o4(i11, user), 250L);
                MessagesController.getInstance(x4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 12:
                zh.r3 r3Var = (zh.r3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                zh.o3 o3Var = r3Var.f0;
                fi.k[] kVarArr = r3Var.t0;
                di.d dVar = r3Var.k0;
                if (stargiftupgradepreview != null) {
                    o3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    r3Var.s2(1, false, null);
                    o3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    r3Var.v0.setVisibility(8);
                    r3Var.u0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new zh.t0(r3Var, 4));
                    r3Var.show();
                    break;
                }
                break;
            case 13:
                zh.r3.n0((zh.r3) obj3, (org.telegram.ui.ActionBar.a2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 14:
                zh.s2 s2Var = (zh.s2) obj3;
                s2Var.getClass();
                ((zh.q2) obj2).a((TL_stars.StarGift) obj, true);
                s2Var.d(true);
                break;
            case 15:
                zh.x2 x2Var = (zh.x2) obj3;
                ag.b bVar = (ag.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                pf.c cVar = x2Var.n;
                if (cVar != null && bVar == x2Var.q) {
                    cVar.c(false);
                }
                x2Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    x2Var.o.put(bVar, new zh.v2(bVar, tL_payments_paymentFormStarGift));
                    x2Var.a(true);
                    break;
                }
                break;
            default:
                ((Utilities.Callback2) obj3).run((ag.a) obj, new zf.c((zh.h0[]) obj2, 16));
                break;
        }
    }
}
