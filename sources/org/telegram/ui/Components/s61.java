package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ea1;
import org.telegram.ui.fa1;
import org.telegram.ui.ra1;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s61 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s61(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback0Return
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View childAt;
        switch (this.a) {
            case 0:
                w61 w61Var = (w61) this.b;
                Object obj = ((h61) this.c).G;
                zl0 zl0Var = w61Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < w61Var.x.size()) {
                        h61 G = w61Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                        childAt = zl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof ra1) {
                                return null;
                            }
                            return (ra1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof ra1) {
                }
                break;
            default:
                ta1 ta1Var = (ta1) this.b;
                fa1 fa1Var = (fa1) this.c;
                int childCount = ta1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = ta1Var.S.getChildAt(i12);
                    if (childAt2 instanceof ea1) {
                        ea1 ea1Var = (ea1) childAt2;
                        if (ea1Var.r == fa1Var) {
                            return ea1Var;
                        }
                    }
                }
                ta1Var.S.setItemAnimator(null);
                ta1Var.B0.f();
                return null;
        }
    }
}
