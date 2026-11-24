// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ar6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ es6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ ar6(es6 es6Var, ArrayList arrayList, String str, byte b) {
        this.a = b;
        this.b = es6Var;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        ArrayList arrayList = this.c;
        es6 es6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ar6(es6Var, arrayList, str, (byte) 2));
                break;
            case 1:
                es6Var.f(str, arrayList);
                break;
            default:
                es6Var.f(str, arrayList);
                break;
        }
    }
}
