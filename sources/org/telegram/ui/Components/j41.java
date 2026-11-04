package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j41 extends hy {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j41(l41 l41Var, int i3, int i10) {
        super(i3, false);
        this.X = i10;
        this.Y = l41Var;
    }

    @Override // u4.o0
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.hy
    public lt0 D1(int i3) {
        switch (this.X) {
            case 2:
                lt0 lt0Var = (lt0) this.Y;
                lt0Var.b = 100.0f;
                lt0Var.a = 100.0f;
                return lt0Var;
            default:
                return super.D1(i3);
        }
    }

    @Override // u4.s, u4.o0
    public void U(tf.e eVar, u4.a1 a1Var, View view, s0.d dVar) {
        switch (this.X) {
            case 2:
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

    @Override // u4.b0
    public int W0(u4.a1 a1Var) {
        switch (this.X) {
            case 0:
                if (!((l41) this.Y).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((l41) this.Y).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(a1Var);
    }

    @Override // u4.b0
    public void z0(u4.a1 a1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41() {
        super(100, false);
        this.X = 2;
        this.Y = new lt0();
    }
}
