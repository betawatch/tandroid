package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ fw(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                if (ryVar.R0 != 10) {
                    ryVar.c4(false);
                }
                if (!ryVar.L || !ryVar.X3().G()) {
                    ryVar.x4(true, true);
                    break;
                } else {
                    ryVar.E0.h();
                    break;
                }
            case 1:
                ry ryVar2 = this.b;
                hh.g gVar = ryVar2.y1;
                if (gVar != null) {
                    gVar.d();
                }
                ryVar2.s3();
                ryVar2.m3();
                ryVar2.t3();
                ii.z1 z1Var = ryVar2.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-ryVar2.v.c());
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
                ry.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                ry ryVar3 = this.b;
                ci.e4 e4Var = ryVar3.q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ryVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.e0[0].d.l();
                break;
            case 9:
                ry ryVar4 = this.b;
                UndoView Y3 = ryVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new mv(ryVar4, 25));
                    break;
                }
                break;
            case 10:
                ry ryVar5 = this.b;
                ryVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                ryVar5.U4();
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
