package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.qz;
import s4.z0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class i extends qz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public i() {
        super(100, false);
        this.Y = new gw0();
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

    @Override // org.telegram.ui.Components.qz
    public gw0 D1(int i10) {
        switch (this.X) {
            case 0:
                gw0 gw0Var = (gw0) this.Y;
                gw0Var.b = 100.0f;
                gw0Var.a = 100.0f;
                return gw0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // s4.s, s4.o0
    public void U(of.e eVar, z0 z0Var, View view, s0.d dVar) {
        switch (this.X) {
            case 0:
                super.U(eVar, z0Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                e.a aVar = collectionItemInfo != null ? new e.a(collectionItemInfo) : null;
                if (aVar != null) {
                    Object obj = aVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(eVar, z0Var, view, dVar);
                break;
        }
    }

    @Override // s4.c0
    public int W0(z0 z0Var) {
        switch (this.X) {
            case 1:
                if (!((e71) this.Y).h3) {
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
    public i(e71 e71Var, int i10) {
        super(i10, false);
        this.Y = e71Var;
    }
}
