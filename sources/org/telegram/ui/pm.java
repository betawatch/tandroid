package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;

    public /* synthetic */ pm(fn fnVar, int i10) {
        this.a = i10;
        this.b = fnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn tnVar = this.b.a;
                tnVar.Z4 = null;
                tnVar.a5 = null;
                break;
            case 1:
                fn fnVar = this.b;
                fnVar.getClass();
                tn tnVar2 = fnVar.a;
                new cg.p1((org.telegram.ui.ActionBar.o2) tnVar2, 8, true).show();
                tnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                fn fnVar2 = this.b;
                fnVar2.getClass();
                tn tnVar3 = fnVar2.a;
                new cg.p1((org.telegram.ui.ActionBar.o2) tnVar3, 8, true).show();
                tnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                fn fnVar3 = this.b;
                fnVar3.getClass();
                tn tnVar4 = fnVar3.a;
                new cg.p1((org.telegram.ui.ActionBar.o2) tnVar4, 8, true).show();
                tnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                tn tnVar5 = this.b.a;
                tnVar5.Z4 = null;
                tnVar5.a5 = null;
                break;
            case 6:
                this.b.a.U.H0();
                break;
            case 7:
                this.b.a.U.H0();
                break;
            case 8:
                tn tnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                tnVar6.presentFragment(themeActivity);
                break;
            default:
                tn tnVar7 = this.b.a;
                tnVar7.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar7, 39, false));
                break;
        }
    }
}
