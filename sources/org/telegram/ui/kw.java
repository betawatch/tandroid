package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ kw(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                if (wyVar.R0 != 10) {
                    wyVar.c4(false);
                }
                if (!wyVar.L || !wyVar.X3().G()) {
                    wyVar.x4(true, true);
                    break;
                } else {
                    wyVar.E0.h();
                    break;
                }
            case 1:
                wy wyVar2 = this.b;
                gh.g gVar = wyVar2.y1;
                if (gVar != null) {
                    gVar.d();
                }
                wyVar2.s3();
                wyVar2.m3();
                wyVar2.t3();
                hi.b2 b2Var = wyVar2.C1;
                if (b2Var != null) {
                    b2Var.setTranslationY(-wyVar2.v.c());
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
                wy.F0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                wy wyVar3 = this.b;
                bi.x4 x4Var = wyVar3.q0;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                wyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.e0[0].d.l();
                break;
            case 9:
                wy wyVar4 = this.b;
                UndoView Y3 = wyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new rv(wyVar4, 25));
                    break;
                }
                break;
            case 10:
                wy wyVar5 = this.b;
                wyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                wyVar5.U4();
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
