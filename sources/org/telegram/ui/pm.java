package org.telegram.ui;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ en b;

    public /* synthetic */ pm(en enVar, int i10) {
        this.a = i10;
        this.b = enVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b.a;
                snVar.d5 = null;
                snVar.e5 = null;
                break;
            case 1:
                en enVar = this.b;
                enVar.getClass();
                sn snVar2 = enVar.a;
                new sg.x0((org.telegram.ui.ActionBar.n2) snVar2, 8, true).show();
                snVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                en enVar2 = this.b;
                enVar2.getClass();
                sn snVar3 = enVar2.a;
                new sg.x0((org.telegram.ui.ActionBar.n2) snVar3, 8, true).show();
                snVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                en enVar3 = this.b;
                enVar3.getClass();
                sn snVar4 = enVar3.a;
                new sg.x0((org.telegram.ui.ActionBar.n2) snVar4, 8, true).show();
                snVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                sn snVar5 = this.b.a;
                snVar5.d5 = null;
                snVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.F0();
                break;
            case 7:
                this.b.a.Y.F0();
                break;
            case 8:
                sn snVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                snVar6.presentFragment(themeActivity);
                break;
            default:
                sn snVar7 = this.b.a;
                snVar7.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar7, 39, false));
                break;
        }
    }
}
