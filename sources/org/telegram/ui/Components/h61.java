package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h61 extends pz {
    public final /* synthetic */ int X = 1;
    public final Object Y;

    public h61() {
        super(100, false);
        this.Y = new kv0();
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
    public kv0 D1(int i10) {
        switch (this.X) {
            case 1:
                kv0 kv0Var = (kv0) this.Y;
                kv0Var.b = 100.0f;
                kv0Var.a = 100.0f;
                return kv0Var;
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
                if (!((i61) this.Y).X2) {
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
    public h61(i61 i61Var, int i10) {
        super(i10, false);
        this.Y = i61Var;
    }
}
