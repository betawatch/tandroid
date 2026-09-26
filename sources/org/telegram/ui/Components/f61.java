package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.da1;
import org.telegram.ui.ea1;
import org.telegram.ui.qa1;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f61 implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f61(int i10, Object obj, Object obj2) {
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
                j61 j61Var = (j61) this.b;
                Object obj = ((v51) this.c).G;
                wl0 wl0Var = j61Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 < j61Var.x.size()) {
                        v51 G = j61Var.G(i10);
                        if (G == null || G.G != obj) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 != -1) {
                    for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                        childAt = wl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof qa1) {
                                return null;
                            }
                            return (qa1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof qa1) {
                }
                break;
            default:
                sa1 sa1Var = (sa1) this.b;
                ea1 ea1Var = (ea1) this.c;
                int childCount = sa1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = sa1Var.S.getChildAt(i12);
                    if (childAt2 instanceof da1) {
                        da1 da1Var = (da1) childAt2;
                        if (da1Var.r == ea1Var) {
                            return da1Var;
                        }
                    }
                }
                sa1Var.S.setItemAnimator(null);
                sa1Var.y0.f();
                return null;
        }
    }
}
