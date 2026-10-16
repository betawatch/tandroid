package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gu0;
import org.telegram.ui.se0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i10 = this.a;
        final int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj;
                HashSet hashSet = k0Var.A;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    k0Var.P();
                    break;
                }
                break;
            case 1:
                k0 v = k0.v(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                z zVar = new z(notificationCenter, (se0) obj, v);
                notificationCenter.addObserver(zVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(zVar, 10000L);
                if (v.e == null && v.w < 0) {
                    v.U();
                }
                v.S();
                zVar.a();
                break;
            case 2:
                c6 c6Var = (c6) obj;
                if (c6Var.r && !c6Var.x && i11 == c6Var.k0) {
                    c6Var.postDelayed(c6Var.l0, 500L);
                    break;
                }
                break;
            case 3:
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
            case 4:
                s8 s8Var = (s8) obj;
                if (!s8Var.n && i11 == s8Var.I) {
                    s8Var.K = false;
                    s8Var.a.W2.N(true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    try {
                        a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pf.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        a2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 6:
                rg.j jVar = (rg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                int i13 = 2;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
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
                duration.setInterpolator(es.f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, i13));
                jVar.P.start();
                break;
            case 7:
                gu0 gu0Var = (gu0) obj;
                qg.q1 q1Var = gu0Var.K1;
                gu0Var.t0(q1Var, null);
                qg.s0.e(i11).j(q1Var.c);
                break;
            case 8:
                rg.p2 p2Var = (rg.p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                break;
            case 9:
                da0 da0Var = ((ug.r0) obj).e;
                try {
                    if (da0Var.getLayout().getLineForOffset(i11) == 0) {
                        da0Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 10:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 11:
                pf.d.r(((zh.g) obj).getParentActivity(), LocaleController.getString(i11));
                break;
            default:
                ConnectionsManager.getInstance(((zh.n5) obj).a).cancelRequest(i11, true);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
