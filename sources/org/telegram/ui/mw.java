package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ mw(yy yyVar, int i10) {
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
                    yyVar2.a4(false);
                }
                if (!yyVar2.L || !yyVar2.V3().G()) {
                    yyVar2.v4(true, true);
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
                yyVar3.q3();
                yyVar3.j3();
                yyVar3.r3();
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
                this.b.K3();
                break;
            case 5:
                this.b.S4();
                break;
            case 6:
                yy.x0(this.b);
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
                UndoView W3 = yyVar5.W3();
                if (W3 != null) {
                    W3.l(0L, 15, null, new uv(yyVar5, 27));
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
                yyVar6.S4();
                break;
            case 12:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            default:
                this.b.Y4();
                break;
        }
    }
}
