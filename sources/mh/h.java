package mh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.d1;
import f2.k1;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h extends iz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public h() {
        super(100, false);
        this.Y = new bv0();
    }

    @Override // f2.w0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.iz
    public bv0 D1(int i10) {
        switch (this.X) {
            case 0:
                bv0 bv0Var = (bv0) this.Y;
                bv0Var.b = 100.0f;
                bv0Var.a = 100.0f;
                return bv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // f2.w, f2.w0
    public void U(d1 d1Var, k1 k1Var, View view, s0.c cVar) {
        switch (this.X) {
            case 0:
                super.U(d1Var, k1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                m8.o oVar = collectionItemInfo != null ? new m8.o(collectionItemInfo) : null;
                if (oVar != null) {
                    Object obj = oVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(d1Var, k1Var, view, cVar);
                break;
        }
    }

    @Override // f2.j0
    public int W0(k1 k1Var) {
        switch (this.X) {
            case 1:
                if (!((u51) this.Y).W2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(k1Var);
    }

    @Override // f2.j0
    public void z0(k1 k1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(k1Var, iArr);
                iArr[1] = Math.max(iArr[1], q7.a(1) * 2);
                break;
            default:
                super.z0(k1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u51 u51Var, int i10) {
        super(i10, false);
        this.Y = u51Var;
    }
}
