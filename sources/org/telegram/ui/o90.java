package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
