// default package

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o5c extends w64 {
    public final /* synthetic */ byte X;
    public final Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5c() {
        super(100, false);
        this.X = (byte) 2;
        this.Y = new via();
    }

    @Override // w64
    public final via B1(int i) {
        switch (this.X) {
            case 2:
                via viaVar = (via) this.Y;
                viaVar.b = 100.0f;
                viaVar.a = 100.0f;
                return viaVar;
            default:
                return super.B1(i);
        }
    }

    @Override // r35, d49
    public final void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        switch (this.X) {
            case 2:
                super.S(wg2Var, p49Var, view, u4Var);
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                qx4 qx4Var = collectionItemInfo != null ? new qx4(collectionItemInfo) : null;
                if (qx4Var != null) {
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) qx4Var.a;
                    if (collectionItemInfo2.isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        break;
                    }
                }
                break;
            default:
                super.S(wg2Var, p49Var, view, u4Var);
                break;
        }
    }

    @Override // t26
    public final int V0(p49 p49Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (!((q5c) obj).i3) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!((q5c) obj).i3) {
                    break;
                } else {
                    break;
                }
        }
        return super.V0(p49Var);
    }

    @Override // t26
    public final void y0(p49 p49Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.y0(p49Var, iArr);
                iArr[1] = Math.max(iArr[1], rfa.a(1) << 1);
                break;
            default:
                super.y0(p49Var, iArr);
                break;
        }
    }

    @Override // d49
    public final int z() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5c(q5c q5cVar, int i, byte b) {
        super(i, false);
        this.X = b;
        this.Y = q5cVar;
    }
}
