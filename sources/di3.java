// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class di3 extends bz1 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ byte z0 = 4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(ui9 ui9Var, Context context, vnb vnbVar) {
        super(R.drawable.send_plane_24, vnbVar, context, true);
        this.A0 = ui9Var;
    }

    @Override // bz1
    public final boolean b() {
        switch (this.z0) {
            case 0:
            case 1:
                return false;
            case 2:
                return ((yg9) this.A0).h0();
            default:
                return super.b();
        }
    }

    @Override // bz1
    public final boolean d() {
        byte b = this.z0;
        Object obj = this.A0;
        switch (b) {
            case 2:
                if (((yg9) obj).M0 || this.w > 0) {
                    break;
                }
                break;
            case 3:
                if (((ui9) obj).a0 || this.w > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // bz1
    public final int getFillColor() {
        byte b = this.z0;
        Object obj = this.A0;
        switch (b) {
            case 1:
                int i = aob.qg;
                Drawable[] drawableArr = PhotoViewer.d9;
                return ((PhotoViewer) obj).y0(i);
            case 4:
                return aob.v0(aob.S5, ((kea) obj).J0);
            default:
                return super.getFillColor();
        }
    }

    @Override // bz1
    public final boolean j() {
        switch (this.z0) {
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
        switch (this.z0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ob6.G(((uj3) this.A0).K2.size(), "AccDescrShareInChats", new Object[0]));
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
    public di3(yg9 yg9Var, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context, true);
        this.A0 = yg9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(kea keaVar, Context context, vnb vnbVar) {
        super(R.drawable.send_plane_24, vnbVar, context, false);
        this.A0 = keaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(uj3 uj3Var, Context context, vnb vnbVar) {
        super(R.drawable.send_plane_24, vnbVar, context, false);
        this.A0 = uj3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(PhotoViewer photoViewer, Context context, vnb vnbVar) {
        super(R.drawable.send_plane_24, vnbVar, context, false);
        this.A0 = photoViewer;
    }
}
