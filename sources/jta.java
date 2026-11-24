// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jta implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kta b;

    public /* synthetic */ jta(kta ktaVar, byte b) {
        this.a = b;
        this.b = ktaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        kta ktaVar = this.b;
        switch (b) {
            case 0:
                ktaVar.r = false;
                ktaVar.invalidate();
                ktaVar.a();
                ktaVar.c();
                break;
            case 1:
                ktaVar.invalidate();
                break;
            default:
                ktaVar.setMessageCell(null);
                ArrayList arrayList = ktaVar.K;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((p09) obj).x(true);
                }
                arrayList.clear();
                break;
        }
    }
}
