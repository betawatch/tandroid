package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                gc gcVar = (gc) this.b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.p;
                if (fbVar != null) {
                    if (!gcVar.e.top) {
                        fbVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                qi qiVar = ((si) this.b).X3;
                if (qiVar != null) {
                    qiVar.R0(obj);
                    break;
                }
                break;
        }
    }
}
