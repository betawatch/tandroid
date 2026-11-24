// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class c7b extends ogc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ a8b c;

    public /* synthetic */ c7b(a8b a8bVar, Context context, byte b) {
        this.a = b;
        this.c = a8bVar;
        this.b = context;
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                ((v7b) view).b(i2);
                break;
            default:
                ((v7b) view).b(i2);
                break;
        }
    }

    @Override // ogc
    public final View d(int i) {
        byte b = this.a;
        Context context = this.b;
        a8b a8bVar = this.c;
        switch (b) {
        }
        return new v7b(a8bVar, context);
    }

    @Override // ogc
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // ogc
    public final int h(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                return this.c.G1;
            default:
                return 5;
        }
    }
}
