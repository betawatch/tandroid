package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                tc tcVar = (tc) this.b;
                Float f7 = (Float) obj;
                rb rbVar = tcVar.p;
                if (rbVar != null) {
                    if (!tcVar.e.top) {
                        rbVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                wi wiVar = ((yi) this.b).c2;
                if (wiVar != null) {
                    wiVar.a1(obj);
                    break;
                }
                break;
        }
    }
}
