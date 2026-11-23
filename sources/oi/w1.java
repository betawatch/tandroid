package oi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w1 extends tg {
    public final /* synthetic */ int y0 = 0;
    public final /* synthetic */ Object z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y3 y3Var, Context context, i6 i6Var) {
        super(R.drawable.send_plane_24, context, i6Var, true);
        this.z0 = y3Var;
    }

    @Override // org.telegram.ui.Components.tg
    public boolean b() {
        switch (this.y0) {
            case 0:
                return ((b2) this.z0).q0();
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

    @Override // org.telegram.ui.Components.tg
    public final boolean d() {
        switch (this.y0) {
            case 0:
                if (((b2) this.z0).M0 || this.w > 0) {
                }
                break;
            case 1:
                if (((y3) this.z0).a0 || this.w > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tg
    public int getFillColor() {
        int i7 = this.y0;
        Object obj = this.z0;
        switch (i7) {
            case 2:
                return n6.w0(n6.S5, ((zo0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = n6.qg;
                Drawable[] drawableArr = PhotoViewer.f9;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override // org.telegram.ui.Components.tg
    public boolean j() {
        switch (this.y0) {
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
        switch (this.y0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(gd.G(((bx) this.z0).K2.size(), "AccDescrShareInChats", new Object[0]));
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
    public w1(b2 b2Var, Context context, int i7, i6 i6Var) {
        super(i7, context, i6Var, true);
        this.z0 = b2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(zo0 zo0Var, Context context, i6 i6Var) {
        super(R.drawable.send_plane_24, context, i6Var, false);
        this.z0 = zo0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(bx bxVar, Context context, i6 i6Var) {
        super(R.drawable.send_plane_24, context, i6Var, false);
        this.z0 = bxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(PhotoViewer photoViewer, Context context, i6 i6Var) {
        super(R.drawable.send_plane_24, context, i6Var, false);
        this.z0 = photoViewer;
    }
}
