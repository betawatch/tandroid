package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vv0;
import s4.z0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class i extends nz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public i() {
        super(100, false);
        this.Y = new vv0();
    }

    @Override // s4.o0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.nz
    public vv0 D1(int i10) {
        switch (this.X) {
            case 0:
                vv0 vv0Var = (vv0) this.Y;
                vv0Var.b = 100.0f;
                vv0Var.a = 100.0f;
                return vv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // s4.s, s4.o0
    public void U(of.e eVar, z0 z0Var, View view, s0.c cVar) {
        switch (this.X) {
            case 0:
                super.U(eVar, z0Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                he.c cVar2 = collectionItemInfo != null ? new he.c(collectionItemInfo) : null;
                if (cVar2 != null) {
                    Object obj = cVar2.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(eVar, z0Var, view, cVar);
                break;
        }
    }

    @Override // s4.c0
    public int W0(z0 z0Var) {
        switch (this.X) {
            case 1:
                if (!((t61) this.Y).a3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(z0Var);
    }

    @Override // s4.c0
    public void z0(z0 z0Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(z0Var, iArr);
                iArr[1] = Math.max(iArr[1], u7.a(1) * 2);
                break;
            default:
                super.z0(z0Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t61 t61Var, int i10) {
        super(i10, false);
        this.Y = t61Var;
    }
}
