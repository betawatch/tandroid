// default package

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o7c extends f84 {
    public final /* synthetic */ byte X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7c() {
        super(100, false);
        this.X = (byte) 2;
        this.Y = new xka();
    }

    @Override // f84
    public final xka B1(int i) {
        switch (this.X) {
            case 2:
                xka xkaVar = (xka) this.Y;
                xkaVar.b = 100.0f;
                xkaVar.a = 100.0f;
                return xkaVar;
            default:
                return super.B1(i);
        }
    }

    @Override // q55, f69
    public final void S(ki2 ki2Var, r69 r69Var, View view, u4 u4Var) {
        switch (this.X) {
            case 2:
                super.S(ki2Var, r69Var, view, u4Var);
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                sz4 sz4Var = collectionItemInfo != null ? new sz4(collectionItemInfo) : null;
                if (sz4Var != null) {
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) sz4Var.a;
                    if (collectionItemInfo2.isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.S(ki2Var, r69Var, view, u4Var);
                break;
        }
    }

    @Override // u46
    public final int V0(r69 r69Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (!((q7c) obj).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((q7c) obj).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.V0(r69Var);
    }

    @Override // u46
    public final void y0(r69 r69Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.y0(r69Var, iArr);
                iArr[1] = Math.max(iArr[1], tha.a(1) << 1);
                break;
            default:
                super.y0(r69Var, iArr);
                break;
        }
    }

    @Override // f69
    public final int z() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7c(q7c q7cVar, int i, byte b) {
        super(i, false);
        this.X = b;
        this.Y = q7cVar;
    }
}
