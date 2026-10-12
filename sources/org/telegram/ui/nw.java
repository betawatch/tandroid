package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ nw(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                iy iyVar = yyVar.C0;
                if (iyVar != null && iyVar.y0) {
                    iyVar.Q(false);
                    break;
                } else {
                    yyVar.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(yyVar.X.r);
                    yyVar.X.r.clearFocus();
                    yyVar.Y.b(false);
                    break;
                }
            case 1:
                yy yyVar2 = this.b;
                if (yyVar2.R0 != 10) {
                    yyVar2.Z3(false);
                }
                if (!yyVar2.L || !yyVar2.U3().G()) {
                    yyVar2.u4(true, true);
                    break;
                } else {
                    yyVar2.E0.h();
                    break;
                }
            case 2:
                yy yyVar3 = this.b;
                ih.f fVar = yyVar3.y1;
                if (fVar != null) {
                    fVar.d();
                }
                yyVar3.p3();
                yyVar3.j3();
                yyVar3.q3();
                ji.y1 y1Var = yyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-yyVar3.v.d());
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
                yy.C0(this.b);
                break;
            case 7:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 8:
                yy yyVar4 = this.b;
                di.d4 d4Var = yyVar4.q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                yyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 9:
                this.b.e0[0].d.l();
                break;
            case 10:
                yy yyVar5 = this.b;
                UndoView V3 = yyVar5.V3();
                if (V3 != null) {
                    V3.l(0L, 15, null, new uv(yyVar5, 26));
                    break;
                }
                break;
            case 11:
                yy yyVar6 = this.b;
                yyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                yyVar6.R4();
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
