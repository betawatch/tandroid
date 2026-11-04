package mi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class x1 extends bg {
    public final /* synthetic */ int o0 = 0;
    public final /* synthetic */ Object p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y3 y3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, true);
        this.p0 = y3Var;
    }

    @Override // org.telegram.ui.Components.bg
    public boolean b() {
        switch (this.o0) {
            case 0:
                return ((c2) this.p0).q0();
            case 1:
            case 2:
            default:
                return super.b();
            case 3:
                return false;
            case 4:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean d() {
        switch (this.o0) {
            case 0:
                if (((c2) this.p0).M0 || this.r > 0) {
                }
                break;
            case 1:
                if (((y3) this.p0).a0 || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bg
    public int getFillColor() {
        int i3 = this.o0;
        Object obj = this.p0;
        switch (i3) {
            case 2:
                return k6.w0(k6.S5, ((oo0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = k6.ng;
                Drawable[] drawableArr = PhotoViewer.V8;
                return ((PhotoViewer) obj).B1(i10);
        }
    }

    @Override // org.telegram.ui.Components.bg
    public boolean j() {
        switch (this.o0) {
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
        switch (this.o0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(bd.G(((uw) this.p0).J2.size(), "AccDescrShareInChats", new Object[0]));
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
    public x1(c2 c2Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var, true);
        this.p0 = c2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(oo0 oo0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.p0 = oo0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(uw uwVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.p0 = uwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(PhotoViewer photoViewer, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.p0 = photoViewer;
    }
}
