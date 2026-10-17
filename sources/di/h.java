package di;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.wz;
import s4.y0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h extends wz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public h() {
        super(100, false);
        this.Y = new dw0();
    }

    @Override // s4.n0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.wz
    public dw0 D1(int i10) {
        switch (this.X) {
            case 0:
                dw0 dw0Var = (dw0) this.Y;
                dw0Var.b = 100.0f;
                dw0Var.a = 100.0f;
                return dw0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // s4.s, s4.n0
    public void U(qf.e eVar, y0 y0Var, View view, s0.c cVar) {
        switch (this.X) {
            case 0:
                super.U(eVar, y0Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                n7.b bVar = collectionItemInfo != null ? new n7.b(collectionItemInfo) : null;
                if (bVar != null) {
                    Object obj = bVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(eVar, y0Var, view, cVar);
                break;
        }
    }

    @Override // s4.b0
    public int W0(y0 y0Var) {
        switch (this.X) {
            case 1:
                if (!((a71) this.Y).Y2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(y0Var);
    }

    @Override // s4.b0
    public void z0(y0 y0Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(y0Var, iArr);
                iArr[1] = Math.max(iArr[1], t7.a(1) * 2);
                break;
            default:
                super.z0(y0Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a71 a71Var, int i10) {
        super(i10, false);
        this.Y = a71Var;
    }
}
