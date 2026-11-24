// default package

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h32 extends a22 {
    public fv n;
    public int r;
    public as0 s;
    public kz0 w;
    public byte x;
    public gu2 y;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int i3;
        int L;
        fv fvVar = this.n;
        kz0 kz0Var = this.w;
        if (gm.O1()) {
            this.x = (byte) 4;
        } else {
            Point point = gm.q;
            if (point.x > point.y) {
                this.x = (byte) 4;
            } else {
                this.x = (byte) 3;
            }
        }
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        int L2 = ((i - gm.L(12.0f)) - gm.L(10.0f)) / this.x;
        if (this.r != L2) {
            this.r = L2;
            kz0Var.f();
        }
        this.s.x1(Math.max(1, ((this.x - 1) * gm.L(5.0f)) + (L2 * this.x)));
        ((ArrayList) kz0Var.e).size();
        a.getCurrentActionBarHeight();
        if (!gm.O1()) {
            Point point2 = gm.q;
            if (point2.x > point2.y) {
                i3 = (int) (i2 / 3.5f);
                L = i3 - gm.L(52.0f);
                if (L < 0) {
                    L = 0;
                }
                if (fvVar.getPaddingTop() == L) {
                    fvVar.setPadding(gm.L(6.0f), L, gm.L(6.0f), gm.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        L = i3 - gm.L(52.0f);
        if (L < 0) {
        }
        if (fvVar.getPaddingTop() == L) {
        }
    }

    @Override // a22
    public final void H(a22 a22Var) {
        i22 i22Var = this.b;
        try {
            i22Var.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        i22Var.U2.setTitle(jb6.M0(2131745397, null));
        this.s.g1(0, 0);
    }

    @Override // a22
    public final void J() {
        this.n.z0(0);
    }

    @Override // a22
    public int getCurrentItemTop() {
        fv fvVar = this.n;
        if (fvVar.getChildCount() <= 0) {
            fvVar.setTopGlowOffset(fvVar.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = childAt.getTop();
        int L = gm.L(7.0f);
        if (top < gm.L(7.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        fvVar.setTopGlowOffset(top);
        return top;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.n.getPaddingTop();
    }

    @Override // a22
    public final int j() {
        return 1;
    }

    public void setDelegate(gu2 gu2Var) {
        this.y = gu2Var;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
        invalidate();
    }
}
