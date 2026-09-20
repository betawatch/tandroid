package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ gb0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xb0 xb0Var = (xb0) this.b;
                xb0Var.n.y(xb0Var.f.U((View) obj));
                break;
            default:
                s61 s61Var = (s61) this.b;
                s61Var.Y2.Q(s61Var.U((View) obj), s61Var.c3);
                break;
        }
    }
}
