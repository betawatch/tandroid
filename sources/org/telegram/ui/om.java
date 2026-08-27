package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                rn rnVar = this.b.a;
                rnVar.Z4 = null;
                rnVar.a5 = null;
                break;
            case 1:
                dn dnVar = this.b;
                dnVar.getClass();
                rn rnVar2 = dnVar.a;
                new ag.g2((org.telegram.ui.ActionBar.n2) rnVar2, 8, true).show();
                rnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                dn dnVar2 = this.b;
                dnVar2.getClass();
                rn rnVar3 = dnVar2.a;
                new ag.g2((org.telegram.ui.ActionBar.n2) rnVar3, 8, true).show();
                rnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                dn dnVar3 = this.b;
                dnVar3.getClass();
                rn rnVar4 = dnVar3.a;
                new ag.g2((org.telegram.ui.ActionBar.n2) rnVar4, 8, true).show();
                rnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                rn rnVar5 = this.b.a;
                rnVar5.Z4 = null;
                rnVar5.a5 = null;
                break;
            case 6:
                this.b.a.U.H0();
                break;
            case 7:
                this.b.a.U.H0();
                break;
            case 8:
                rn rnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                rnVar6.presentFragment(themeActivity);
                break;
            default:
                rn rnVar7 = this.b.a;
                rnVar7.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar7, 39, false));
                break;
        }
    }
}
