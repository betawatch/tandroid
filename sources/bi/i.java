package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wv0;
import s4.z0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class i extends pz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public i() {
        super(100, false);
        this.Y = new wv0();
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

    @Override // org.telegram.ui.Components.pz
    public wv0 D1(int i10) {
        switch (this.X) {
            case 0:
                wv0 wv0Var = (wv0) this.Y;
                wv0Var.b = 100.0f;
                wv0Var.a = 100.0f;
                return wv0Var;
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
                he.c cVar = collectionItemInfo != null ? new he.c(collectionItemInfo) : null;
                if (cVar != null) {
                    Object obj = cVar.a;
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
