package eg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
import qh.wa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a4 extends j {
    public final j1 n0;
    public boolean o0;
    public int p0;
    public int q0;
    public final wa r0;

    public a4(Context context, PointF pointF, int i10, wa waVar, float f10, int i11) {
        super(context, pointF);
        j1 j1Var = new j1(context, f10);
        this.n0 = j1Var;
        j1Var.setMaxWidth(i11);
        j1Var.e(0, this.p0);
        this.r0 = waVar;
        String str = waVar.c;
        String a2 = waVar.a();
        j1Var.d(i10, str);
        j1Var.setText(a2);
        m();
        addView(j1Var, c6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // eg.j
    public final i a() {
        return new f1(this, getContext());
    }

    public int getColor() {
        return this.p0;
    }

    @Override // eg.j
    public float getMaxScale() {
        return 1.5f;
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
        return this.n0.G;
    }

    @Override // eg.j
    public float getStickyPaddingLeft() {
        return this.n0.F;
    }

    @Override // eg.j
    public float getStickyPaddingRight() {
        return this.n0.F;
    }

    @Override // eg.j
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

    @Override // eg.j
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
