package c1;

import w0.i;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ i c;

    public /* synthetic */ a(f fVar, i iVar, int i7) {
        this.a = i7;
        this.b = fVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f().a(this.c);
                break;
            case 1:
                this.b.f().a(this.c);
                break;
            default:
                this.b.f().a(this.c);
                break;
        }
    }
}
