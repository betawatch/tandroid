package kf;

import c8.f1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i7, String str, String str2) {
        this.g = i7;
        this.h = str;
        this.i = str2;
    }

    @Override // kf.p
    public final void a(f1 f1Var) {
        switch (this.g) {
            case 0:
                f1Var.i(this);
                break;
            default:
                f1Var.s(this);
                break;
        }
    }

    @Override // kf.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}
