package oi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.po0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class u1 extends jg {
    public final /* synthetic */ int w0 = 1;
    public final /* synthetic */ Object x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v3 v3Var, Context context, e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, true);
        this.x0 = v3Var;
    }

    @Override // org.telegram.ui.Components.jg
    public boolean b() {
        switch (this.w0) {
            case 0:
                return ((z1) this.x0).q0();
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

    @Override // org.telegram.ui.Components.jg
    public final boolean d() {
        switch (this.w0) {
            case 0:
                if (((z1) this.x0).M0 || this.w > 0) {
                }
                break;
            case 1:
                if (((v3) this.x0).a0 || this.w > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.jg
    public int getFillColor() {
        int i7 = this.w0;
        Object obj = this.x0;
        switch (i7) {
            case 2:
                return j6.w0(j6.S5, ((po0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = j6.qg;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override // org.telegram.ui.Components.jg
    public boolean j() {
        switch (this.w0) {
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
        switch (this.w0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(hd.G(((yw) this.x0).K2.size(), "AccDescrShareInChats", new Object[0]));
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
    public u1(z1 z1Var, Context context, int i7, e6 e6Var) {
        super(i7, context, e6Var, true);
        this.x0 = z1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(po0 po0Var, Context context, e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.x0 = po0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yw ywVar, Context context, e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.x0 = ywVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(PhotoViewer photoViewer, Context context, e6 e6Var) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.x0 = photoViewer;
    }
}
