package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm b;

    public /* synthetic */ pl(hm hmVar, int i3) {
        this.a = i3;
        this.b = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm wmVar = this.b.a;
                wmVar.u5 = null;
                wmVar.v5 = null;
                break;
            case 1:
                hm hmVar = this.b;
                hmVar.getClass();
                wm wmVar2 = hmVar.a;
                new vg.v0((org.telegram.ui.ActionBar.d2) wmVar2, 8, true).show();
                wmVar2.getMessagesController().E3();
                break;
            case 2:
                hm hmVar2 = this.b;
                hmVar2.getClass();
                wm wmVar3 = hmVar2.a;
                new vg.v0((org.telegram.ui.ActionBar.d2) wmVar3, 8, true).show();
                wmVar3.getMessagesController().E3();
                break;
            case 3:
                hm hmVar3 = this.b;
                hmVar3.getClass();
                wm wmVar4 = hmVar3.a;
                new vg.v0((org.telegram.ui.ActionBar.d2) wmVar4, 8, true).show();
                wmVar4.getMessagesController().E3();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                wm wmVar5 = this.b.a;
                wmVar5.u5 = null;
                wmVar5.v5 = null;
                break;
            case 6:
                this.b.a.a0.G0();
                break;
            case 7:
                this.b.a.a0.G0();
                break;
            case 8:
                wm wmVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.U0 = true;
                wmVar6.presentFragment(themeActivity);
                break;
            default:
                wm wmVar7 = this.b.a;
                wmVar7.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar7, 39, false));
                break;
        }
    }
}
