// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hz8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ pcc c;
    public final /* synthetic */ e d;

    public /* synthetic */ hz8(String str, pcc pccVar, e eVar) {
        this.b = str;
        this.c = pccVar;
        this.d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e eVar = this.d;
        pcc pccVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                jz8.p(eVar, 0, new hz8(str, pccVar, eVar));
                break;
            default:
                if (str == null) {
                    d31.b0(eVar).N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                    break;
                } else {
                    pccVar.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ hz8(e eVar, String str, pcc pccVar) {
        this.d = eVar;
        this.b = str;
        this.c = pccVar;
    }
}
