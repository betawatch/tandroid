package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.zf;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f2 extends zf {
    public final /* synthetic */ int n0 = 1;
    public final /* synthetic */ Object o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i4 i4Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(R.drawable.send_plane_24, context, p6Var, true);
        this.o0 = i4Var;
    }

    @Override // org.telegram.ui.Components.zf
    public boolean d() {
        switch (this.n0) {
            case 0:
                return ((k2) this.o0).p0();
            case 1:
            case 2:
            default:
                return super.d();
            case 3:
                return false;
            case 4:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean f() {
        switch (this.n0) {
            case 0:
                if (((k2) this.o0).L0 || this.r > 0) {
                }
                break;
            case 1:
                if (((i4) this.o0).W || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.zf
    public int getFillColor() {
        int i10 = this.n0;
        Object obj = this.o0;
        switch (i10) {
            case 2:
                return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.S5, ((op0) obj).I0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = org.telegram.ui.ActionBar.t6.ng;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).B1(i11);
        }
    }

    @Override // org.telegram.ui.Components.zf
    public boolean j() {
        switch (this.n0) {
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.n0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(cd.G(((ay) this.o0).I2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, true);
        this.o0 = k2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(op0 op0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(R.drawable.send_plane_24, context, p6Var, false);
        this.o0 = op0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(ay ayVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(R.drawable.send_plane_24, context, p6Var, false);
        this.o0 = ayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(PhotoViewer photoViewer, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(R.drawable.send_plane_24, context, p6Var, false);
        this.o0 = photoViewer;
    }
}
