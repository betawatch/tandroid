// default package

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hga extends q74 {
    public final qma X;
    public final /* synthetic */ gga Y;
    public final /* synthetic */ eja Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hga(eja ejaVar, gga ggaVar) {
        super(100, false);
        this.Z = ejaVar;
        this.Y = ggaVar;
        this.X = new qma();
    }

    @Override // q74
    public final qma B1(int i) {
        int i2;
        int i3;
        j79 adapter = this.Y.h.getAdapter();
        eja ejaVar = this.Z;
        tia[] tiaVarArr = ejaVar.w1;
        TLRPC.Document F0 = (adapter != ejaVar.R || tiaVarArr[5].a.isEmpty()) ? null : ((r47) tiaVarArr[5].a.get(i)).F0();
        qma qmaVar = this.X;
        qmaVar.b = 100.0f;
        qmaVar.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w = xb4.w(F0.thumbs, 90, false, null, false);
            if (w != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
                qmaVar.a = i2;
                qmaVar.b = i3;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qmaVar.a = documentAttribute.w;
                    qmaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qmaVar;
    }

    @Override // u55, q79
    public final void S(oh2 oh2Var, c89 c89Var, View view, v4 v4Var) {
        super.S(oh2Var, c89Var, view, v4Var);
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        wz4 wz4Var = collectionItemInfo != null ? new wz4(collectionItemInfo) : null;
        if (wz4Var != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) wz4Var.a;
            if (collectionItemInfo2.isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
            }
        }
    }

    @Override // x46
    public final void y0(c89 c89Var, int[] iArr) {
        super.y0(c89Var, iArr);
        gga ggaVar = this.Y;
        int i = ggaVar.F;
        if (i == 0 || eja.j0(i)) {
            iArr[1] = Math.max(iArr[1], kja.a(1) << 1);
        } else if (ggaVar.F == 1) {
            iArr[1] = Math.max(iArr[1], hl.L(56.0f) << 1);
        }
    }

    @Override // q79
    public final int z() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return A();
    }
}
