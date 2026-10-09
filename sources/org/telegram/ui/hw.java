package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ hw(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                dy dyVar = tyVar.C0;
                if (dyVar != null && dyVar.y0) {
                    dyVar.Q(false);
                    break;
                } else {
                    tyVar.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(tyVar.X.r);
                    tyVar.X.r.clearFocus();
                    tyVar.Y.b(false);
                    break;
                }
            case 1:
                ty tyVar2 = this.b;
                if (tyVar2.R0 != 10) {
                    tyVar2.Z3(false);
                }
                if (!tyVar2.L || !tyVar2.U3().G()) {
                    tyVar2.u4(true, true);
                    break;
                } else {
                    tyVar2.E0.h();
                    break;
                }
            case 2:
                ty tyVar3 = this.b;
                hh.f fVar = tyVar3.y1;
                if (fVar != null) {
                    fVar.d();
                }
                tyVar3.p3();
                tyVar3.j3();
                tyVar3.q3();
                ii.z1 z1Var = tyVar3.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-tyVar3.v.d());
                    break;
                }
                break;
            case 3:
                this.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 4:
                this.b.J3();
                break;
            case 5:
                this.b.R4();
                break;
            case 6:
                ty.C0(this.b);
                break;
            case 7:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 8:
                ty tyVar4 = this.b;
                ci.d4 d4Var = tyVar4.q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                tyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 9:
                this.b.e0[0].d.l();
                break;
            case 10:
                ty tyVar5 = this.b;
                UndoView V3 = tyVar5.V3();
                if (V3 != null) {
                    V3.l(0L, 15, null, new ov(tyVar5, 26));
                    break;
                }
                break;
            case 11:
                ty tyVar6 = this.b;
                tyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                tyVar6.R4();
                break;
            case 12:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            default:
                this.b.X4();
                break;
        }
    }
}
