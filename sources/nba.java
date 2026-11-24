// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nba implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ jm7 c;
    public final /* synthetic */ View d;

    public /* synthetic */ nba(jm7 jm7Var, View view, int[] iArr, byte b) {
        this.a = b;
        this.c = jm7Var;
        this.d = view;
        this.b = iArr;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        int[] iArr = this.b;
        View view = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                ((tca) jm7Var).K0((wca) view, iArr, f / 1000.0f);
                break;
            default:
                ((cca) jm7Var).d.K0(view, iArr, f / 1000.0f);
                break;
        }
    }
}
