package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                hh.g gVar = uyVar.y1;
                if (gVar != null) {
                    gVar.d();
                }
                uyVar.B3();
                uyVar.C3();
                ii.z1 z1Var = uyVar.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-uyVar.v.c());
                    break;
                }
                break;
            case 1:
                this.b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 2:
                this.b.V3();
                break;
            case 3:
                this.b.d5();
                break;
            case 4:
                MessagesController.getInstance(this.b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            case 5:
                uy.G0(this.b);
                break;
            case 6:
                this.b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                uy uyVar2 = this.b;
                ci.e4 e4Var = uyVar2.q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                uyVar2.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.b.e0[0].d.l();
                break;
            case 9:
                uy uyVar3 = this.b;
                UndoView h42 = uyVar3.h4();
                if (h42 != null) {
                    h42.l(0L, 15, null, new pv(uyVar3, 24));
                    break;
                }
                break;
            case 10:
                uy uyVar4 = this.b;
                uyVar4.e0[0].a.requestLayout();
                mx mxVar = uyVar4.F3;
                yf1 yf1Var = (mxVar == null || !(mxVar.getFragment() instanceof yf1)) ? null : (yf1) uyVar4.F3.getFragment();
                if (yf1Var != null) {
                    yf1Var.B0();
                }
                uyVar4.P3(false);
                uyVar4.b5();
                dy dyVar = uyVar4.C0;
                if (dyVar != null) {
                    dyVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.j5();
                break;
        }
    }
}
