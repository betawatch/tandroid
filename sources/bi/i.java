package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mw0;
import s4.a1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i extends d00 {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public i() {
        super(100, false);
        this.Y = new mw0();
    }

    @Override // s4.p0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.d00
    public mw0 D1(int i10) {
        switch (this.X) {
            case 0:
                mw0 mw0Var = (mw0) this.Y;
                mw0Var.b = 100.0f;
                mw0Var.a = 100.0f;
                return mw0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // s4.s, s4.p0
    public void U(pf.e eVar, a1 a1Var, View view, s0.d dVar) {
        switch (this.X) {
            case 0:
                super.U(eVar, a1Var, view, dVar);
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
                super.U(eVar, a1Var, view, dVar);
                break;
        }
    }

    @Override // s4.d0
    public int W0(a1 a1Var) {
        switch (this.X) {
            case 1:
                if (!((k71) this.Y).Y2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(a1Var);
    }

    @Override // s4.d0
    public void z0(a1 a1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], u7.a(1) * 2);
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k71 k71Var, int i10) {
        super(i10, false);
        this.Y = k71Var;
    }
}
