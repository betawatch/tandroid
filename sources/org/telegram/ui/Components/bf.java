package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bf implements r1.d {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ tt0 c;

    public bf(float f10, tt0 tt0Var) {
        this.b = f10;
        this.c = tt0Var;
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
