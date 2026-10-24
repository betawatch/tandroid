package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ j10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.a = i10;
        this.b = filtersSetupActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.b;
                filtersSetupActivity2.a.f1(new xt(filtersSetupActivity2, 9), 700, true);
                break;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) filtersSetupActivity3, 9, true));
                break;
            default:
                this.b.getMessagesController().loadRemoteFilters(true);
                break;
        }
    }
}
