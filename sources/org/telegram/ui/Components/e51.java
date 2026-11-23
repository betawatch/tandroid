package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e51 extends ty {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e51(g51 g51Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = g51Var;
    }

    @Override // v4.p0
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.ty
    public xt0 D1(int i7) {
        switch (this.X) {
            case 2:
                xt0 xt0Var = (xt0) this.Y;
                xt0Var.b = 100.0f;
                xt0Var.a = 100.0f;
                return xt0Var;
            default:
                return super.D1(i7);
        }
    }

    @Override // v4.t, v4.p0
    public void U(v4.x0 x0Var, v4.c1 c1Var, View view, s0.c cVar) {
        switch (this.X) {
            case 2:
                super.U(x0Var, c1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
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
                super.U(x0Var, c1Var, view, cVar);
                break;
        }
    }

    @Override // v4.c0
    public int W0(v4.c1 c1Var) {
        switch (this.X) {
            case 0:
                if (!((g51) this.Y).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((g51) this.Y).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(c1Var);
    }

    @Override // v4.c0
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(c1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.p7.a(1) * 2);
                break;
            default:
                super.z0(c1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51() {
        super(100, false);
        this.X = 2;
        this.Y = new xt0();
    }
}
