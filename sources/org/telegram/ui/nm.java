package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ nm(cn cnVar, int i10) {
        this.a = i10;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b.a;
                qnVar.d5 = null;
                qnVar.e5 = null;
                break;
            case 1:
                cn cnVar = this.b;
                cnVar.getClass();
                qn qnVar2 = cnVar.a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar2, 8, true).show();
                qnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                cn cnVar2 = this.b;
                cnVar2.getClass();
                qn qnVar3 = cnVar2.a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar3, 8, true).show();
                qnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                cn cnVar3 = this.b;
                cnVar3.getClass();
                qn qnVar4 = cnVar3.a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar4, 8, true).show();
                qnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                qn qnVar5 = this.b.a;
                qnVar5.d5 = null;
                qnVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.F0();
                break;
            case 7:
                this.b.a.Y.F0();
                break;
            case 8:
                qn qnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                qnVar6.presentFragment(themeActivity);
                break;
            default:
                qn qnVar7 = this.b.a;
                qnVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar7, 39, false));
                break;
        }
    }
}
