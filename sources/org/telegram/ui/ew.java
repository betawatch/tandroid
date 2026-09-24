package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ ew(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                if (qyVar.R0 != 10) {
                    qyVar.c4(false);
                }
                if (!qyVar.L || !qyVar.X3().G()) {
                    qyVar.x4(true, true);
                    break;
                } else {
                    qyVar.E0.h();
                    break;
                }
            case 1:
                qy qyVar2 = this.b;
                hh.g gVar = qyVar2.y1;
                if (gVar != null) {
                    gVar.d();
                }
                qyVar2.s3();
                qyVar2.m3();
                qyVar2.t3();
                ii.z1 z1Var = qyVar2.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-qyVar2.v.c());
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
                qy.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                qy qyVar3 = this.b;
                ci.e4 e4Var = qyVar3.q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                qyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.e0[0].d.l();
                break;
            case 9:
                qy qyVar4 = this.b;
                UndoView Y3 = qyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new lv(qyVar4, 25));
                    break;
                }
                break;
            case 10:
                qy qyVar5 = this.b;
                qyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                qyVar5.U4();
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
