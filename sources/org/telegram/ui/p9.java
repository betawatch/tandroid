package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                w9 w9Var = (w9) this.b;
                o1.k kVar = w9Var.y;
                if (kVar != null) {
                    kVar.c();
                    w9Var.y = null;
                    break;
                }
                break;
            case 1:
                ao0 ao0Var = (ao0) this.b;
                if (hVar == ao0Var.c) {
                    ao0Var.c = null;
                    break;
                }
                break;
            default:
                ((ut0) this.b).D();
                break;
        }
    }
}
