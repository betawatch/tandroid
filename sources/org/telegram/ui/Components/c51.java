package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c51 extends uy {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c51(e51 e51Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = e51Var;
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

    @Override // org.telegram.ui.Components.uy
    public vt0 D1(int i7) {
        switch (this.X) {
            case 2:
                vt0 vt0Var = (vt0) this.Y;
                vt0Var.b = 100.0f;
                vt0Var.a = 100.0f;
                return vt0Var;
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
                of ofVar = collectionItemInfo != null ? new of(collectionItemInfo, 15) : null;
                if (ofVar != null) {
                    Object obj = ofVar.b;
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
                if (!((e51) this.Y).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((e51) this.Y).i3) {
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
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
                break;
            default:
                super.z0(c1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51() {
        super(100, false);
        this.X = 2;
        this.Y = new vt0();
    }
}
