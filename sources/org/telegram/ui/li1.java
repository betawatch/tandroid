package org.telegram.ui;

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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class li1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ li1(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i10 = this.a;
        int i11 = 2;
        final int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                dj1 dj1Var = (dj1) obj;
                dj1Var.F.setSignalBarCount(i12);
                if (i12 <= 1) {
                    org.telegram.ui.Components.voip.b3 b3Var = dj1Var.v;
                    if (b3Var.V != 3) {
                        b3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(b3Var.H, 255);
                        b3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var, 2));
                        b3Var.O.setDuration(500L);
                        b3Var.O.start();
                    }
                    dj1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.b3 b3Var2 = dj1Var.v;
                    if (b3Var2.V != 2) {
                        b3Var2.V = 2;
                        b3Var2.c();
                        ValueAnimator valueAnimator = b3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            b3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(b3Var2.H, 0);
                        b3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var2, 0));
                        b3Var2.O.setDuration(500L);
                        b3Var2.O.start();
                    }
                    dj1Var.F.c(false);
                    break;
                }
            case 1:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj;
                HashSet hashSet = j0Var.A;
                hashSet.remove(Integer.valueOf(i12));
                if (hashSet.isEmpty()) {
                    j0Var.P();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i12);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                org.telegram.ui.Wallet.y yVar = new org.telegram.ui.Wallet.y(notificationCenter, (wc0) obj, v);
                notificationCenter.addObserver(yVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(yVar, 10000L);
                if (v.e == null && v.w < 0) {
                    v.U();
                }
                v.S();
                yVar.a();
                break;
            case 3:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (b6Var.r && !b6Var.x && i12 == b6Var.k0) {
                    b6Var.postDelayed(b6Var.l0, 500L);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) obj;
                ArrayList arrayList = z6Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) z6Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i13 = 0; i12 < arrayList.size() && i13 < split.length; i13++) {
                            ((org.telegram.ui.Wallet.h9) arrayList.get(i12)).setText(split[i13]);
                            i12++;
                        }
                        z6Var.Y();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) obj;
                if (!r8Var.n && i12 == r8Var.I) {
                    r8Var.K = false;
                    r8Var.a.W2.N(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    try {
                        a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pf.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        a2VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 7:
                rg.j jVar = (rg.j) obj;
                jVar.L = i12;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
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
                duration.setInterpolator(org.telegram.ui.Components.es.f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, i11));
                jVar.P.start();
                break;
            case 8:
                hu0 hu0Var = (hu0) obj;
                qg.q1 q1Var = hu0Var.K1;
                hu0Var.t0(q1Var, null);
                qg.s0.e(i12).j(q1Var.c);
                break;
            case 9:
                rg.p2 p2Var = (rg.p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                break;
            case 10:
                org.telegram.ui.Components.da0 da0Var = ((ug.r0) obj).e;
                try {
                    if (da0Var.getLayout().getLineForOffset(i12) == 0) {
                        da0Var.getEditableText().insert(i12, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 11:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                ((org.telegram.ui.ActionBar.b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 12:
                pf.d.s(((zh.g) obj).getParentActivity(), LocaleController.getString(i12));
                break;
            default:
                ConnectionsManager.getInstance(((zh.n5) obj).a).cancelRequest(i12, true);
                break;
        }
    }

    public /* synthetic */ li1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
