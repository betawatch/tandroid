package ci;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.zz;
import s4.y0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class h extends zz {
    public final /* synthetic */ int X = 0;
    public final Object Y;

    public h() {
        super(100, false);
        this.Y = new iw0();
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

    @Override // org.telegram.ui.Components.zz
    public iw0 D1(int i10) {
        switch (this.X) {
            case 0:
                iw0 iw0Var = (iw0) this.Y;
                iw0Var.b = 100.0f;
                iw0Var.a = 100.0f;
                return iw0Var;
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
                if (!((i71) this.Y).Y2) {
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
                iArr[1] = Math.max(iArr[1], u7.a(1) * 2);
                break;
            default:
                super.z0(y0Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i71 i71Var, int i10) {
        super(i10, false);
        this.Y = i71Var;
    }
}
