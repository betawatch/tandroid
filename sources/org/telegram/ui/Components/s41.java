package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s41 extends oy {
    public final /* synthetic */ int X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s41(u41 u41Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = u41Var;
    }

    @Override // v4.o0
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.Components.oy
    public nt0 D1(int i7) {
        switch (this.X) {
            case 2:
                nt0 nt0Var = (nt0) this.Y;
                nt0Var.b = 100.0f;
                nt0Var.a = 100.0f;
                return nt0Var;
            default:
                return super.D1(i7);
        }
    }

    @Override // v4.s, v4.o0
    public void U(v4.w0 w0Var, v4.b1 b1Var, View view, s0.c cVar) {
        switch (this.X) {
            case 2:
                super.U(w0Var, b1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
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
                super.U(w0Var, b1Var, view, cVar);
                break;
        }
    }

    @Override // v4.b0
    public int W0(v4.b1 b1Var) {
        switch (this.X) {
            case 0:
                if (!((u41) this.Y).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((u41) this.Y).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.W0(b1Var);
    }

    @Override // v4.b0
    public void z0(v4.b1 b1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(b1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.o7.a(1) * 2);
                break;
            default:
                super.z0(b1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41() {
        super(100, false);
        this.X = 2;
        this.Y = new nt0();
    }
}
