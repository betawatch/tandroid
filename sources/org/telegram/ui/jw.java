package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ jw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                if (uyVar.R0 != 10) {
                    uyVar.c4(false);
                }
                if (!uyVar.L || !uyVar.X3().G()) {
                    uyVar.x4(true, true);
                    break;
                } else {
                    uyVar.E0.h();
                    break;
                }
            case 1:
                uy uyVar2 = this.b;
                hh.g gVar = uyVar2.y1;
                if (gVar != null) {
                    gVar.d();
                }
                uyVar2.s3();
                uyVar2.m3();
                uyVar2.t3();
                ii.y1 y1Var = uyVar2.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-uyVar2.v.c());
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
                uy.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                uy uyVar3 = this.b;
                ci.f4 f4Var = uyVar3.q0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                uyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.e0[0].d.l();
                break;
            case 9:
                uy uyVar4 = this.b;
                UndoView Y3 = uyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new qv(uyVar4, 25));
                    break;
                }
                break;
            case 10:
                uy uyVar5 = this.b;
                uyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                uyVar5.U4();
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
