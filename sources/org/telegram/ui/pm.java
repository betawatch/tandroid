package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                un unVar = this.b.a;
                unVar.t5 = null;
                unVar.u5 = null;
                break;
            case 1:
                fn fnVar = this.b;
                fnVar.getClass();
                un unVar2 = fnVar.a;
                new kg.i1((org.telegram.ui.ActionBar.k2) unVar2, 8, true).show();
                unVar2.getMessagesController().B3();
                break;
            case 2:
                fn fnVar2 = this.b;
                fnVar2.getClass();
                un unVar3 = fnVar2.a;
                new kg.i1((org.telegram.ui.ActionBar.k2) unVar3, 8, true).show();
                unVar3.getMessagesController().B3();
                break;
            case 3:
                fn fnVar3 = this.b;
                fnVar3.getClass();
                un unVar4 = fnVar3.a;
                new kg.i1((org.telegram.ui.ActionBar.k2) unVar4, 8, true).show();
                unVar4.getMessagesController().B3();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                un unVar5 = this.b.a;
                unVar5.t5 = null;
                unVar5.u5 = null;
                break;
            case 6:
                this.b.a.Z.F0();
                break;
            case 7:
                this.b.a.Z.F0();
                break;
            case 8:
                un unVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                unVar6.presentFragment(themeActivity);
                break;
            default:
                un unVar7 = this.b.a;
                unVar7.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar7, 39, false));
                break;
        }
    }
}
