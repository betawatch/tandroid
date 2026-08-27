package kh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.e1;
import f2.l1;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i extends bz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public i() {
        super(100, false);
        this.Y = new tu0();
    }

    @Override // f2.x0
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.bz
    public tu0 D1(int i10) {
        switch (this.X) {
            case 0:
                tu0 tu0Var = (tu0) this.Y;
                tu0Var.b = 100.0f;
                tu0Var.a = 100.0f;
                return tu0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // f2.x, f2.x0
    public void U(e1 e1Var, l1 l1Var, View view, s0.c cVar) {
        switch (this.X) {
            case 0:
                super.U(e1Var, l1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                qd.b bVar = collectionItemInfo != null ? new qd.b(collectionItemInfo) : null;
                if (bVar != null) {
                    Object obj = bVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(e1Var, l1Var, view, cVar);
                break;
        }
    }

    @Override // f2.k0
    public int W0(l1 l1Var) {
        switch (this.X) {
            case 1:
                if (!((k51) this.Y).W2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(l1Var);
    }

    @Override // f2.k0
    public void z0(l1 l1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(l1Var, iArr);
                iArr[1] = Math.max(iArr[1], p7.a(1) * 2);
                break;
            default:
                super.z0(l1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k51 k51Var, int i10) {
        super(i10, false);
        this.Y = k51Var;
    }
}
