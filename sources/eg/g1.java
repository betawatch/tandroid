package eg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g1 extends j {
    public final e1 n0;
    public int o0;
    public int p0;
    public boolean q0;
    public d1 r0;

    public g1(Context context, PointF pointF, int i10, d1 d1Var, float f10, int i11) {
        super(context, pointF);
        e1 e1Var = new e1(context, f10);
        this.n0 = e1Var;
        e1Var.setMaxWidth(i11);
        this.r0 = d1Var;
        e1Var.b(i10, d1Var, false);
        m();
        this.p0 = 3;
        e1Var.c(3, this.o0);
        addView(e1Var, c6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // eg.j
    public final i a() {
        return new f1(this, getContext());
    }

    public int getColor() {
        return this.o0;
    }

    @Override // eg.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.p0 + 1;
        return i10 == 4 ? !this.q0 ? 1 : 0 : i10;
    }

    @Override // eg.j
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new sk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new sk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override // eg.j
    public float getStickyPaddingBottom() {
        return this.n0.h;
    }

    @Override // eg.j
    public float getStickyPaddingLeft() {
        return this.n0.f;
    }

    @Override // eg.j
    public float getStickyPaddingRight() {
        return this.n0.f;
    }

    @Override // eg.j
    public float getStickyPaddingTop() {
        return this.n0.h;
    }

    public int getType() {
        return this.p0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.q0 = true;
        this.o0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.p0 = i10;
        this.n0.c(i10, this.o0);
    }
}
