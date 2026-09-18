package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai1(int i10, org.telegram.ui.ActionBar.d5 d5Var) {
        this.a = 5;
        this.b = i10;
        this.c = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 2;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                si1 si1Var = (si1) obj;
                si1Var.F.setSignalBarCount(i12);
                if (i12 > 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = si1Var.v;
                    if (c3Var.V != 2) {
                        c3Var.V = 2;
                        c3Var.c();
                        ValueAnimator valueAnimator = c3Var.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            c3Var.O.cancel();
                        }
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 0);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 0));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    si1Var.F.c(false);
                    break;
                } else {
                    org.telegram.ui.Components.voip.c3 c3Var2 = si1Var.v;
                    if (c3Var2.V != 3) {
                        c3Var2.V = 3;
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.H, 255);
                        c3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 2));
                        c3Var2.O.setDuration(500L);
                        c3Var2.O.start();
                    }
                    si1Var.F.c(true);
                    break;
                }
            case 1:
                qg.j jVar = (qg.j) obj;
                jVar.L = i12;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(org.telegram.ui.Components.qr.f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, i11));
                jVar.P.start();
                break;
            case 2:
                au0 au0Var = (au0) obj;
                pg.s1 s1Var = au0Var.K1;
                au0Var.s0(s1Var, null);
                pg.u0.e(i12).j(s1Var.c);
                break;
            case 3:
                qg.m2 m2Var = (qg.m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
                break;
            case 4:
                org.telegram.ui.Components.l90 l90Var = ((tg.r0) obj).e;
                try {
                    if (l90Var.getLayout().getLineForOffset(i12) == 0) {
                        l90Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 5:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            case 7:
                ConnectionsManager.getInstance(((yh.t5) obj).a).cancelRequest(i12, true);
                break;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i12 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i12 - 100);
                    AndroidUtilities.runOnUIThread(new ai1(fVar, max, 8), max);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ai1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
