// default package

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o9c extends q74 {
    public final /* synthetic */ byte X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9c() {
        super(100, false);
        this.X = (byte) 2;
        this.Y = new qma();
    }

    @Override // q74
    public final qma B1(int i) {
        switch (this.X) {
            case 2:
                qma qmaVar = (qma) this.Y;
                qmaVar.b = 100.0f;
                qmaVar.a = 100.0f;
                return qmaVar;
            default:
                return super.B1(i);
        }
    }

    @Override // u55, q79
    public final void S(oh2 oh2Var, c89 c89Var, View view, v4 v4Var) {
        switch (this.X) {
            case 2:
                super.S(oh2Var, c89Var, view, v4Var);
                AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                wz4 wz4Var = collectionItemInfo != null ? new wz4(collectionItemInfo) : null;
                if (wz4Var != null) {
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) wz4Var.a;
                    if (collectionItemInfo2.isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.S(oh2Var, c89Var, view, v4Var);
                break;
        }
    }

    @Override // x46
    public final int V0(c89 c89Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (!((q9c) obj).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((q9c) obj).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.V0(c89Var);
    }

    @Override // x46
    public final void y0(c89 c89Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.y0(c89Var, iArr);
                iArr[1] = Math.max(iArr[1], kja.a(1) << 1);
                break;
            default:
                super.y0(c89Var, iArr);
                break;
        }
    }

    @Override // q79
    public final int z() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9c(q9c q9cVar, int i, byte b) {
        super(i, false);
        this.X = b;
        this.Y = q9cVar;
    }
}
