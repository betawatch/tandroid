package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class jf implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ qv0 c;

    public jf(float f7, qv0 qv0Var) {
        this.b = f7;
        this.c = qv0Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        if (this.a || f7 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
