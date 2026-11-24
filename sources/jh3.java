// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jh3 extends ky1 {
    public final /* synthetic */ byte y0 = 0;
    public final /* synthetic */ Object z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh3(df9 df9Var, Context context, wjb wjbVar) {
        super(R.drawable.send_plane_24, wjbVar, context, true);
        this.z0 = df9Var;
    }

    @Override // ky1
    public final boolean b() {
        switch (this.y0) {
            case 0:
            case 1:
                return false;
            case 2:
                return ((hd9) this.z0).h0();
            default:
                return super.b();
        }
    }

    @Override // ky1
    public final boolean d() {
        byte b = this.y0;
        Object obj = this.z0;
        switch (b) {
            case 2:
                if (((hd9) obj).M0 || this.w > 0) {
                    break;
                }
                break;
            case 3:
                if (((df9) obj).a0 || this.w > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // ky1
    public final int getFillColor() {
        byte b = this.y0;
        Object obj = this.z0;
        switch (b) {
            case 1:
                int i = bkb.pg;
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((PhotoViewer) obj).y0(i);
            case 4:
                return bkb.v0(bkb.R5, ((taa) obj).J0);
            default:
                return super.getFillColor();
        }
    }

    @Override // ky1
    public final boolean j() {
        switch (this.y0) {
            case 0:
            case 1:
            case 4:
                return true;
            case 2:
            case 3:
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.y0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(k96.G(((cj3) this.z0).K2.size(), "AccDescrShareInChats", new Object[0]));
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
    public jh3(hd9 hd9Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context, true);
        this.z0 = hd9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh3(taa taaVar, Context context, wjb wjbVar) {
        super(R.drawable.send_plane_24, wjbVar, context, false);
        this.z0 = taaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh3(cj3 cj3Var, Context context, wjb wjbVar) {
        super(R.drawable.send_plane_24, wjbVar, context, false);
        this.z0 = cj3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh3(PhotoViewer photoViewer, Context context, wjb wjbVar) {
        super(R.drawable.send_plane_24, wjbVar, context, false);
        this.z0 = photoViewer;
    }
}
