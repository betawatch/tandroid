package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class an implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;

    public /* synthetic */ an(pn pnVar, int i10) {
        this.a = i10;
        this.b = pnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo eoVar = this.b.a;
                eoVar.d5 = null;
                eoVar.e5 = null;
                break;
            case 1:
                pn pnVar = this.b;
                pnVar.getClass();
                eo eoVar2 = pnVar.a;
                new qg.a1((org.telegram.ui.ActionBar.p2) eoVar2, 8, true).show();
                eoVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                pn pnVar2 = this.b;
                pnVar2.getClass();
                eo eoVar3 = pnVar2.a;
                new qg.a1((org.telegram.ui.ActionBar.p2) eoVar3, 8, true).show();
                eoVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                pn pnVar3 = this.b;
                pnVar3.getClass();
                eo eoVar4 = pnVar3.a;
                new qg.a1((org.telegram.ui.ActionBar.p2) eoVar4, 8, true).show();
                eoVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                eo eoVar5 = this.b.a;
                eoVar5.d5 = null;
                eoVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.H0();
                break;
            case 7:
                this.b.a.Y.H0();
                break;
            case 8:
                eo eoVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                eoVar6.presentFragment(themeActivity);
                break;
            default:
                eo eoVar7 = this.b.a;
                eoVar7.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar7, 39, false));
                break;
        }
    }
}
