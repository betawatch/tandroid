package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ a00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.a = i7;
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
                filtersSetupActivity2.a.e1(new zr(filtersSetupActivity2, 12), 700, true);
                break;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) filtersSetupActivity3, 9, true));
                break;
            default:
                this.b.getMessagesController().c3(true, null);
                break;
        }
    }
}
