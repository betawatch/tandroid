package dg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
import ph.za;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c4 extends j {
    public final l1 n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final za r0;

    public c4(Context context, PointF pointF, int i10, za zaVar, float f10, int i11) {
        super(context, pointF);
        l1 l1Var = new l1(context, f10);
        this.n0 = l1Var;
        l1Var.setMaxWidth(i11);
        l1Var.e(0, this.p0);
        this.r0 = zaVar;
        String str = zaVar.c;
        String a2 = zaVar.a();
        l1Var.d(i10, str);
        l1Var.setText(a2);
        m();
        addView(l1Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // dg.j
    public final i a() {
        return new h1(this, getContext());
    }

    public int getColor() {
        return this.p0;
    }

    @Override // dg.j
    public float getMaxScale() {
        return 1.5f;
    }

    @Override // dg.j
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

    @Override // dg.j
    public float getStickyPaddingBottom() {
        return this.n0.G;
    }

    @Override // dg.j
    public float getStickyPaddingLeft() {
        return this.n0.F;
    }

    @Override // dg.j
    public float getStickyPaddingRight() {
        return this.n0.F;
    }

    @Override // dg.j
    public float getStickyPaddingTop() {
        return this.n0.G;
    }

    public int getType() {
        return this.q0;
    }

    public int getTypesCount() {
        return this.n0.getTypesCount() - (!this.o0 ? 1 : 0);
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
        this.o0 = true;
        this.p0 = i10;
    }

    @Override // dg.j
    public void setIsVideo(boolean z4) {
        this.n0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.q0 = i10;
        this.n0.e(i10, this.p0);
    }
}
