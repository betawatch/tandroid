package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t51 extends yy {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t51(v51 v51Var, int i10, int i11) {
        super(i10, false);
        this.X = i11;
        this.Y = v51Var;
    }

    @Override // s4.n0
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.yy
    public qu0 D1(int i10) {
        switch (this.X) {
            case 2:
                qu0 qu0Var = (qu0) this.Y;
                qu0Var.b = 100.0f;
                qu0Var.a = 100.0f;
                return qu0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override // s4.r, s4.n0
    public void U(hf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        switch (this.X) {
            case 2:
                super.U(eVar, z0Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                a9.r rVar = collectionItemInfo != null ? new a9.r(collectionItemInfo) : null;
                if (rVar != null) {
                    Object obj = rVar.a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.U(eVar, z0Var, view, cVar);
                break;
        }
    }

    @Override // s4.a0
    public int W0(s4.z0 z0Var) {
        switch (this.X) {
            case 0:
                if (!((v51) this.Y).h3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((v51) this.Y).h3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(z0Var);
    }

    @Override // s4.a0
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(z0Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
                break;
            default:
                super.z0(z0Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51() {
        super(100, false);
        this.X = 2;
        this.Y = new qu0();
    }
}
