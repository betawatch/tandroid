package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
