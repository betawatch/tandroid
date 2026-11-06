package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class o41 extends jy {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o41(q41 q41Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = q41Var;
    }

    @Override // v4.n0
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.jy
    public mt0 D1(int i7) {
        switch (this.X) {
            case 2:
                mt0 mt0Var = (mt0) this.Y;
                mt0Var.b = 100.0f;
                mt0Var.a = 100.0f;
                return mt0Var;
            default:
                return super.D1(i7);
        }
    }

    @Override // v4.s, v4.n0
    public void U(v4.v0 v0Var, v4.a1 a1Var, View view, s0.d dVar) {
        switch (this.X) {
            case 2:
                super.U(v0Var, a1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                d9.o oVar = collectionItemInfo != null ? new d9.o(collectionItemInfo) : null;
                if (oVar != null) {
                    Object obj = oVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(v0Var, a1Var, view, dVar);
                break;
        }
    }

    @Override // v4.b0
    public int W0(v4.a1 a1Var) {
        switch (this.X) {
            case 0:
                if (!((q41) this.Y).h3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((q41) this.Y).h3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(a1Var);
    }

    @Override // v4.b0
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41() {
        super(100, false);
        this.X = 2;
        this.Y = new mt0();
    }
}
