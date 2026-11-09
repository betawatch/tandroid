package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class re implements r1.d {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ kt0 c;

    public re(float f10, kt0 kt0Var) {
        this.b = f10;
        this.c = kt0Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        if (this.a || f10 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
