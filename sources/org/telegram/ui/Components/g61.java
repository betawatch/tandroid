package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g61 extends pz {
    public final /* synthetic */ int X = 1;
    public final Object Y;

    public g61() {
        super(100, false);
        this.Y = new jv0();
    }

    @Override // f2.w0
    public int A() {
        switch (this.X) {
            case 1:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.pz
    public jv0 D1(int i10) {
        switch (this.X) {
            case 1:
                jv0 jv0Var = (jv0) this.Y;
                jv0Var.b = 100.0f;
                jv0Var.a = 100.0f;
                return jv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // f2.w, f2.w0
    public void U(bf.f fVar, f2.j1 j1Var, View view, s0.d dVar) {
        switch (this.X) {
            case 1:
                super.U(fVar, j1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                a3.c cVar = collectionItemInfo != null ? new a3.c(collectionItemInfo) : null;
                if (cVar != null) {
                    Object obj = cVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(fVar, j1Var, view, dVar);
                break;
        }
    }

    @Override // f2.j0
    public int W0(f2.j1 j1Var) {
        switch (this.X) {
            case 0:
                if (!((h61) this.Y).X2) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(j1Var);
    }

    @Override // f2.j0
    public void z0(f2.j1 j1Var, int[] iArr) {
        switch (this.X) {
            case 1:
                super.z0(j1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.s7.a(1) * 2);
                break;
            default:
                super.z0(j1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(h61 h61Var, int i10) {
        super(i10, false);
        this.Y = h61Var;
    }
}
