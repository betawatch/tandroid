package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s90 b;

    public /* synthetic */ o90(s90 s90Var, int i7) {
        this.a = i7;
        this.b = s90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
