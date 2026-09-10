package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.db1;
import org.telegram.ui.fb1;
import org.telegram.ui.qa1;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                vl0 vl0Var = j61Var.d;
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
                    for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                        childAt = vl0Var.getChildAt(i11);
                        int R = RecyclerView.R(childAt);
                        if (R != -1 && R == i10) {
                            if (childAt instanceof db1) {
                                return null;
                            }
                            return (db1) childAt;
                        }
                    }
                }
                childAt = null;
                if (childAt instanceof db1) {
                }
                break;
            default:
                fb1 fb1Var = (fb1) this.b;
                ra1 ra1Var = (ra1) this.c;
                int childCount = fb1Var.S.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = fb1Var.S.getChildAt(i12);
                    if (childAt2 instanceof qa1) {
                        qa1 qa1Var = (qa1) childAt2;
                        if (qa1Var.r == ra1Var) {
                            return qa1Var;
                        }
                    }
                }
                fb1Var.S.setItemAnimator(null);
                fb1Var.y0.f();
                return null;
        }
    }
}
