package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ ew(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                if (pyVar.O0 != 10) {
                    pyVar.c4(false);
                }
                if (!pyVar.I || !pyVar.X3().G()) {
                    pyVar.x4(true, true);
                    break;
                } else {
                    pyVar.B0.h();
                    break;
                }
            case 1:
                py pyVar2 = this.b;
                vg.f fVar = pyVar2.v1;
                if (fVar != null) {
                    fVar.d();
                }
                pyVar2.s3();
                pyVar2.m3();
                pyVar2.t3();
                org.telegram.ui.Components.rp0 rp0Var = pyVar2.z1;
                if (rp0Var != null) {
                    rp0Var.setTranslationY(-pyVar2.v.c());
                    break;
                }
                break;
            case 2:
                this.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 3:
                this.b.M3();
                break;
            case 4:
                this.b.U4();
                break;
            case 5:
                py.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                py pyVar3 = this.b;
                qh.f3 f3Var = pyVar3.n0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                pyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.b0[0].d.l();
                break;
            case 9:
                py pyVar4 = this.b;
                UndoView Y3 = pyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new nv(pyVar4, 25));
                    break;
                }
                break;
            case 10:
                py pyVar5 = this.b;
                pyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                pyVar5.U4();
                break;
            case 11:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            default:
                this.b.a5();
                break;
        }
    }
}
