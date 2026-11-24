// default package

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fo1 implements h8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fo1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // h8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        View view;
        byte b = this.a;
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((mu1) obj2).u8((Context) obj);
            case 1:
                uxa uxaVar = (uxa) obj2;
                gxa gxaVar = (gxa) obj;
                int childCount = uxaVar.T.getChildCount();
                while (true) {
                    twa twaVar = uxaVar.T;
                    if (i >= childCount) {
                        twaVar.setItemAnimator(null);
                        uxaVar.C0.e();
                        return null;
                    }
                    View childAt = twaVar.getChildAt(i);
                    if (childAt instanceof fxa) {
                        fxa fxaVar = (fxa) childAt;
                        if (fxaVar.r == gxaVar) {
                            return fxaVar;
                        }
                    }
                    i++;
                }
            default:
                l5c l5cVar = (l5c) obj2;
                Object obj3 = ((c4c) obj).H;
                o39 o39Var = l5cVar.d;
                int i2 = 0;
                while (true) {
                    if (i2 < l5cVar.E.size()) {
                        c4c G = l5cVar.G(i2);
                        if (G == null || G.H != obj3) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    while (i < o39Var.getChildCount()) {
                        view = o39Var.getChildAt(i);
                        int R = RecyclerView.R(view);
                        if (R != -1 && R == i2) {
                            if (view instanceof sxa) {
                                return null;
                            }
                            return (sxa) view;
                        }
                        i++;
                    }
                }
                view = null;
                if (view instanceof sxa) {
                }
                break;
        }
    }
}
