package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f51 extends wy {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f51(h51 h51Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = h51Var;
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

    @Override // org.telegram.ui.Components.wy
    public yt0 D1(int i7) {
        switch (this.X) {
            case 2:
                yt0 yt0Var = (yt0) this.Y;
                yt0Var.b = 100.0f;
                yt0Var.a = 100.0f;
                return yt0Var;
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
                qf qfVar = collectionItemInfo != null ? new qf(collectionItemInfo, 15) : null;
                if (qfVar != null) {
                    Object obj = qfVar.b;
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
                if (!((h51) this.Y).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((h51) this.Y).i3) {
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
    public f51() {
        super(100, false);
        this.X = 2;
        this.Y = new yt0();
    }
}
