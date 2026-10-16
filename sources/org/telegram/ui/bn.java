package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ bn(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo foVar = this.b.a;
                foVar.d5 = null;
                foVar.e5 = null;
                break;
            case 1:
                qn qnVar = this.b;
                qnVar.getClass();
                fo foVar2 = qnVar.a;
                new sg.y0((org.telegram.ui.ActionBar.m2) foVar2, 8, true).show();
                foVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                fo foVar3 = qnVar2.a;
                new sg.y0((org.telegram.ui.ActionBar.m2) foVar3, 8, true).show();
                foVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                fo foVar4 = qnVar3.a;
                new sg.y0((org.telegram.ui.ActionBar.m2) foVar4, 8, true).show();
                foVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                fo foVar5 = this.b.a;
                foVar5.d5 = null;
                foVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.F0();
                break;
            case 7:
                this.b.a.Y.F0();
                break;
            case 8:
                fo foVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                foVar6.presentFragment(themeActivity);
                break;
            default:
                fo foVar7 = this.b.a;
                foVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar7, 39, false));
                break;
        }
    }
}
