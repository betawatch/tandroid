package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ int c;

    public /* synthetic */ bm(an anVar, int i7, int i10) {
        this.a = i10;
        this.b = anVar;
        this.c = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (sh.d) obj);
                break;
            default:
                an anVar = this.b;
                anVar.getClass();
                anVar.j0(this.c, new th.e((String) obj));
                break;
        }
    }
}
