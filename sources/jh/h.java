package jh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.g1;
import f2.n1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h extends zy {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public h() {
        super(100, false);
        this.Y = new qu0();
    }

    @Override // f2.z0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.zy
    public qu0 D1(int i9) {
        switch (this.X) {
            case 0:
                qu0 qu0Var = (qu0) this.Y;
                qu0Var.b = 100.0f;
                qu0Var.a = 100.0f;
                return qu0Var;
            default:
                return super.D1(i9);
        }
    }

    @Override // f2.y, f2.z0
    public void U(g1 g1Var, n1 n1Var, View view, s0.d dVar) {
        switch (this.X) {
            case 0:
                super.U(g1Var, n1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                k8.o oVar = collectionItemInfo != null ? new k8.o(collectionItemInfo) : null;
                if (oVar != null) {
                    Object obj = oVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(g1Var, n1Var, view, dVar);
                break;
        }
    }

    @Override // f2.m0
    public int W0(n1 n1Var) {
        switch (this.X) {
            case 1:
                if (!((i51) this.Y).W2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(n1Var);
    }

    @Override // f2.m0
    public void z0(n1 n1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(n1Var, iArr);
                iArr[1] = Math.max(iArr[1], s7.a(1) * 2);
                break;
            default:
                super.z0(n1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i51 i51Var, int i9) {
        super(i9, false);
        this.Y = i51Var;
    }
}
