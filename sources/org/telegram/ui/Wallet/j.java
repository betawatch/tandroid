package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b80;
import org.telegram.ui.it0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence text;
        int i10 = this.a;
        Object obj = this.c;
        final int i11 = this.b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                HashSet hashSet = m0Var.E;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    m0Var.Q();
                    break;
                }
                break;
            case 1:
                m0 w9 = m0.w(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                b0 b0Var = new b0(notificationCenter, (b80) obj, w9);
                notificationCenter.addObserver(b0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(b0Var, 10000L);
                if (w9.e == null && w9.A < 0) {
                    w9.W();
                }
                w9.U();
                b0Var.a();
                break;
            case 2:
                p6 p6Var = (p6) obj;
                if (p6Var.r && !p6Var.x && i11 == p6Var.k0) {
                    p6Var.postDelayed(p6Var.l0, 500L);
                    break;
                }
                break;
            case 3:
                z7 z7Var = (z7) obj;
                ArrayList arrayList = z7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) z7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((ia) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        z7Var.Y();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 4:
                t9 t9Var = (t9) obj;
                if (!t9Var.n && i11 == t9Var.I) {
                    t9Var.K = false;
                    t9Var.a.W2.N(true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pf.a
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        b2VarArr[0].show();
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
                duration.setInterpolator(bs.f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, i13));
                jVar.P.start();
                break;
            case 7:
                it0 it0Var = (it0) obj;
                qg.s1 s1Var = it0Var.K1;
                it0Var.t0(s1Var, null);
                qg.u0.e(i11).j(s1Var.c);
                break;
            case 8:
                rg.m2 m2Var = (rg.m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
                break;
            case 9:
                x90 x90Var = ((ug.p0) obj).e;
                try {
                    if (x90Var.getLayout().getLineForOffset(i11) == 0) {
                        x90Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
