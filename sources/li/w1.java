package li;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class w1 extends cg {
    public final /* synthetic */ int n0 = 0;
    public final /* synthetic */ Object o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y3 y3Var, Context context, h6 h6Var) {
        super(R.drawable.send_plane_24, context, h6Var, true);
        this.o0 = y3Var;
    }

    @Override // org.telegram.ui.Components.cg
    public boolean b() {
        switch (this.n0) {
            case 0:
                return ((b2) this.o0).q0();
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

    @Override // org.telegram.ui.Components.cg
    public final boolean d() {
        switch (this.n0) {
            case 0:
                if (((b2) this.o0).L0 || this.r > 0) {
                }
                break;
            case 1:
                if (((y3) this.o0).W || this.r > 0) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public int getFillColor() {
        int i7 = this.n0;
        Object obj = this.o0;
        switch (i7) {
            case 2:
                return m6.w0(m6.S5, ((mo0) obj).I0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = m6.ng;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override // org.telegram.ui.Components.cg
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
                accessibilityNodeInfo.setText(id.G(((zw) this.o0).J2.size(), "AccDescrShareInChats", new Object[0]));
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
    public w1(b2 b2Var, Context context, int i7, h6 h6Var) {
        super(i7, context, h6Var, true);
        this.o0 = b2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(mo0 mo0Var, Context context, h6 h6Var) {
        super(R.drawable.send_plane_24, context, h6Var, false);
        this.o0 = mo0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(zw zwVar, Context context, h6 h6Var) {
        super(R.drawable.send_plane_24, context, h6Var, false);
        this.o0 = zwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(PhotoViewer photoViewer, Context context, h6 h6Var) {
        super(R.drawable.send_plane_24, context, h6Var, false);
        this.o0 = photoViewer;
    }
}
