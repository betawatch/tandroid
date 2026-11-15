package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public w3(qm0 qm0Var, qm0 qm0Var2, qm0 qm0Var3) {
        this.a = 1;
        this.b = qm0Var;
        this.c = qm0Var2;
        this.d = qm0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.c;
                rect2.set(i13, i14, i15, i16);
                i4 i4Var = (i4) this.d;
                g4 g4Var = i4Var.b;
                if (g4Var.f() && !rect.equals(rect2)) {
                    i4Var.h = true;
                    if (g4Var.f()) {
                        i4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((qm0) this.b).setProgress(org.telegram.ui.h5.n1);
                ((qm0) this.c).setProgress(org.telegram.ui.h5.o1);
                ((qm0) this.d).setProgress(org.telegram.ui.h5.p1);
                break;
        }
    }

    public w3(i4 i4Var) {
        this.a = 0;
        this.d = i4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
