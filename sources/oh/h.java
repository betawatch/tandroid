package oh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.i1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nz;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h extends nz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public h() {
        super(100, false);
        this.Y = new jv0();
    }

    @Override // f2.v0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.nz
    public jv0 D1(int i10) {
        switch (this.X) {
            case 0:
                jv0 jv0Var = (jv0) this.Y;
                jv0Var.b = 100.0f;
                jv0Var.a = 100.0f;
                return jv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // f2.w, f2.v0
    public void U(bf.f fVar, i1 i1Var, View view, s0.e eVar) {
        switch (this.X) {
            case 0:
                super.U(fVar, i1Var, view, eVar);
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                s0.d dVar = collectionItemInfo != null ? new s0.d(collectionItemInfo) : null;
                if (dVar != null) {
                    Object obj = dVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(fVar, i1Var, view, eVar);
                break;
        }
    }

    @Override // f2.i0
    public int W0(i1 i1Var) {
        switch (this.X) {
            case 1:
                if (!((g61) this.Y).X2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(i1Var);
    }

    @Override // f2.i0
    public void z0(i1 i1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(i1Var, iArr);
                iArr[1] = Math.max(iArr[1], s7.a(1) * 2);
                break;
            default:
                super.z0(i1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g61 g61Var, int i10) {
        super(i10, false);
        this.Y = g61Var;
    }
}
