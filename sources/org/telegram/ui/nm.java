package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ nm(cn cnVar, int i9) {
        this.a = i9;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b.a;
                qnVar.Z4 = null;
                qnVar.a5 = null;
                break;
            case 1:
                cn cnVar = this.b;
                cnVar.getClass();
                qn qnVar2 = cnVar.a;
                new zf.x0((org.telegram.ui.ActionBar.o2) qnVar2, 8, true).show();
                qnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                cn cnVar2 = this.b;
                cnVar2.getClass();
                qn qnVar3 = cnVar2.a;
                new zf.x0((org.telegram.ui.ActionBar.o2) qnVar3, 8, true).show();
                qnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                cn cnVar3 = this.b;
                cnVar3.getClass();
                qn qnVar4 = cnVar3.a;
                new zf.x0((org.telegram.ui.ActionBar.o2) qnVar4, 8, true).show();
                qnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                qn qnVar5 = this.b.a;
                qnVar5.Z4 = null;
                qnVar5.a5 = null;
                break;
            case 6:
                this.b.a.U.G0();
                break;
            case 7:
                this.b.a.U.G0();
                break;
            case 8:
                qn qnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                qnVar6.presentFragment(themeActivity);
                break;
            default:
                qn qnVar7 = this.b.a;
                qnVar7.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar7, 39, false));
                break;
        }
    }
}
