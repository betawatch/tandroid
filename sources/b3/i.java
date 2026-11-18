package b3;

import a8.la;
import h2.x;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class i {
    public final int a;
    public final long b;

    public /* synthetic */ i(int i7, long j3, boolean z10) {
        this.a = i7;
        this.b = j3;
    }

    public static i b(f3.p pVar, x xVar) {
        pVar.b(0, 8, xVar.a);
        xVar.N(0);
        return new i(xVar.m(), xVar.r(), false);
    }

    public boolean a() {
        int i7 = this.a;
        return i7 == 0 || i7 == 1;
    }

    public i(int i7, long j3) {
        la.f(j3 >= 0);
        this.a = i7;
        this.b = j3;
    }
}
