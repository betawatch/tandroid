package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ dw(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oy oyVar = this.b;
                if (oyVar.O0 != 10) {
                    oyVar.c4(false);
                }
                if (!oyVar.I || !oyVar.X3().G()) {
                    oyVar.x4(true, true);
                    break;
                } else {
                    oyVar.B0.h();
                    break;
                }
            case 1:
                oy oyVar2 = this.b;
                ug.f fVar = oyVar2.v1;
                if (fVar != null) {
                    fVar.d();
                }
                oyVar2.s3();
                oyVar2.m3();
                oyVar2.t3();
                org.telegram.ui.Components.qp0 qp0Var = oyVar2.z1;
                if (qp0Var != null) {
                    qp0Var.setTranslationY(-oyVar2.v.c());
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
                oy.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                oy oyVar3 = this.b;
                ph.f3 f3Var = oyVar3.n0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                oyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.b0[0].d.l();
                break;
            case 9:
                oy oyVar4 = this.b;
                UndoView Y3 = oyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new mv(oyVar4, 25));
                    break;
                }
                break;
            case 10:
                oy oyVar5 = this.b;
                oyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                oyVar5.U4();
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
