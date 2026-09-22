package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wv0;
import s4.z0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class i extends nz {
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

    @Override // org.telegram.ui.Components.nz
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
                he.b bVar = collectionItemInfo != null ? new he.b(collectionItemInfo) : null;
                if (bVar != null) {
                    Object obj = bVar.a;
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
                if (!((u61) this.Y).a3) {
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
                iArr[1] = Math.max(iArr[1], v7.a(1) * 2);
                break;
            default:
                super.z0(z0Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u61 u61Var, int i10) {
        super(i10, false);
        this.Y = u61Var;
    }
}
