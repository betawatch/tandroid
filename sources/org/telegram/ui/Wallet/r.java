package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.tf0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                k0 v = k0.v(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                z zVar = new z(notificationCenter, (tf0) obj, v);
                notificationCenter.addObserver(zVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(zVar, 10000L);
                if (v.e == null && v.w < 0) {
                    v.U();
                }
                v.S();
                zVar.a();
                break;
            case 1:
                c6 c6Var = (c6) obj;
                if (c6Var.r && !c6Var.x && i11 == c6Var.k0) {
                    c6Var.postDelayed(c6Var.l0, 500L);
                    break;
                }
                break;
            case 2:
                a7 a7Var = (a7) obj;
                ArrayList arrayList = a7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) a7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((h9) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        a7Var.Y();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 3:
                s8 s8Var = (s8) obj;
                if (!s8Var.n && i11 == s8Var.I) {
                    s8Var.K = false;
                    s8Var.a.W2.N(true);
                    break;
                }
                break;
            case 4:
                qg.j jVar = (qg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                int i13 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(hs.f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, i13));
                jVar.P.start();
                break;
            case 5:
                bu0 bu0Var = (bu0) obj;
                pg.s1 s1Var = bu0Var.K1;
                bu0Var.t0(s1Var, null);
                pg.u0.e(i11).j(s1Var.c);
                break;
            case 6:
                qg.o2 o2Var = (qg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                break;
            case 7:
                ea0 ea0Var = ((tg.r0) obj).e;
                try {
                    if (ea0Var.getLayout().getLineForOffset(i11) == 0) {
                        ea0Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 8:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 9:
                of.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            case 10:
                ConnectionsManager.getInstance(((yh.m5) obj).a).cancelRequest(i11, true);
                break;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(i11 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused3) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new r(fVar, max, 11), max);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
