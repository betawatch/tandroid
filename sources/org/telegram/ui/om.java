package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn b;

    public /* synthetic */ om(dn dnVar, int i10) {
        this.a = i10;
        this.b = dnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b.a;
                snVar.p5 = null;
                snVar.q5 = null;
                break;
            case 1:
                dn dnVar = this.b;
                dnVar.getClass();
                sn snVar2 = dnVar.a;
                new sg.y0((org.telegram.ui.ActionBar.o2) snVar2, 8, true).show();
                snVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                dn dnVar2 = this.b;
                dnVar2.getClass();
                sn snVar3 = dnVar2.a;
                new sg.y0((org.telegram.ui.ActionBar.o2) snVar3, 8, true).show();
                snVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                dn dnVar3 = this.b;
                dnVar3.getClass();
                sn snVar4 = dnVar3.a;
                new sg.y0((org.telegram.ui.ActionBar.o2) snVar4, 8, true).show();
                snVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                sn snVar5 = this.b.a;
                snVar5.p5 = null;
                snVar5.q5 = null;
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
                snVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar7, 39, false));
                break;
        }
    }
}
