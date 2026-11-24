// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fa4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg b;

    public /* synthetic */ fa4(yg ygVar, byte b) {
        this.a = b;
        this.b = ygVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yg ygVar = this.b;
        switch (b) {
            case 0:
                ((na4) ygVar.c).a(ygVar.b, -4, (ArrayList) ygVar.d);
                break;
            case 1:
                ((na4) ygVar.c).a(ygVar.b, -3, (ArrayList) ygVar.d);
                break;
            default:
                ((na4) ygVar.c).a(ygVar.b, -4, (ArrayList) ygVar.d);
                break;
        }
    }
}
