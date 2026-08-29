package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class gu0 extends ht0 {
    public final HashSet b3;
    public final ArrayList c3;
    public final ArrayList d3;
    public final ArrayList e3;
    public TextPaint f3;
    public StaticLayout g3;
    public float h3;
    public float i3;
    public lh.q9 j3;
    public int k3;
    public final ArrayList l3;

    public gu0(Context context) {
        super(context, null);
        this.b3 = new HashSet();
        this.c3 = new ArrayList();
        this.d3 = new ArrayList();
        this.e3 = new ArrayList();
        this.l3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0114, code lost:
    
        if (getAnimateToColumnsCount() > getColumnsCount()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        if (getAnimateToColumnsCount() >= getColumnsCount()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x071e  */
    @Override // org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        float f12;
        float f13;
        boolean z10;
        int i16;
        Float valueOf = Float.valueOf(1.0f);
        tk0 movingAdapter = getMovingAdapter();
        tk0 supportingAdapter = getSupportingAdapter();
        if (!B1() || getAdapter() != movingAdapter) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt = getChildAt(i17);
                int p10 = qu0.p(childAt);
                if (p10 != 0 && getMessageAlphaEnter() != null) {
                    if (getMessageAlphaEnter().get(p10, null) != null) {
                        f9 = getMessageAlphaEnter().get(p10, valueOf).floatValue();
                        if (!(childAt instanceof org.telegram.ui.Cells.g7)) {
                            ((org.telegram.ui.Cells.g7) childAt).setEnterAnimationAlpha(f9);
                        } else if (childAt instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) childAt).setEnterAnimationAlpha(f9);
                        }
                    }
                }
                f9 = 1.0f;
                if (!(childAt instanceof org.telegram.ui.Cells.g7)) {
                }
            }
            super.dispatchDraw(canvas);
            return;
        }
        float measuredHeight = getMeasuredHeight();
        boolean z12 = z1();
        HashSet hashSet = this.b3;
        ArrayList arrayList = this.d3;
        ArrayList arrayList2 = this.e3;
        ArrayList arrayList3 = this.c3;
        ArrayList arrayList4 = this.l3;
        if (z12) {
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                int R = RecyclerView.R(getChildAt(i21));
                if (R >= 0 && (R > i20 || i20 == -1)) {
                    i20 = R;
                }
                if (R >= 0 && (R < i19 || i19 == -1)) {
                    i19 = R;
                }
            }
            int i22 = 0;
            i11 = -1;
            while (true) {
                f10 = measuredHeight;
                if (i22 >= getSupportingListView().getChildCount()) {
                    break;
                }
                ht0 supportingListView = getSupportingListView();
                View childAt2 = getSupportingListView().getChildAt(i22);
                supportingListView.getClass();
                int R2 = RecyclerView.R(childAt2);
                int i23 = i19;
                if (R2 >= 0 && (R2 > i18 || i18 == -1)) {
                    i18 = R2;
                }
                if (R2 >= 0 && (R2 < i11 || i11 == -1)) {
                    i11 = R2;
                }
                i22++;
                i19 = i23;
                measuredHeight = f10;
            }
            i12 = i19;
            if (i12 < 0 || i11 < 0 || getPinchCenterPosition() < 0) {
                i16 = 0;
                i13 = 0;
            } else {
                int i24 = i18;
                int ceil = (int) Math.ceil(movingAdapter.h() / getColumnsCount());
                int i25 = i20;
                int ceil2 = (int) Math.ceil(movingAdapter.h() / getAnimateToColumnsCount());
                int pinchCenterPosition = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i11 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i12 / getColumnsCount()));
                i13 = (i12 / getColumnsCount()) - pinchCenterPosition < 0 ? pinchCenterPosition : pinchCenterPosition;
                if ((i11 / getAnimateToColumnsCount()) + i13 < 0) {
                }
                if (((i24 / getColumnsCount()) + i13 >= ceil && getAnimateToColumnsCount() > getColumnsCount()) || ((i25 / getAnimateToColumnsCount()) - i13 >= ceil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                    i13 = 0;
                }
                i16 = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
            }
            arrayList4.clear();
            hashSet.clear();
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            this.k3 = 0;
            for (int i26 = 0; i26 < getSupportingListView().getChildCount(); i26++) {
                View childAt3 = getSupportingListView().getChildAt(i26);
                if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                    if (childAt3 instanceof org.telegram.ui.Cells.p7) {
                        arrayList4.add((org.telegram.ui.Cells.p7) childAt3);
                    } else if (childAt3 instanceof TextView) {
                        this.k3++;
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            sk0 fastScroll = getFastScroll();
            if (fastScroll != null && fastScroll.getTag() != null) {
                float H = movingAdapter.H(this);
                float H2 = supportingAdapter.H(getSupportingListView());
                float f14 = movingAdapter.E(this) ? 1.0f : 0.0f;
                float f15 = supportingAdapter.E(getSupportingListView()) ? 1.0f : 0.0f;
                fastScroll.setProgress((getChangeColumnsProgress() * H2) + ((1.0f - getChangeColumnsProgress()) * H));
                fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f15) + ((1.0f - getChangeColumnsProgress()) * f14));
            }
            i10 = i16;
        } else {
            f10 = measuredHeight;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        for (int i27 = 0; i27 < getChildCount(); i27++) {
            View childAt4 = getChildAt(i27);
            if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                if (childAt4 instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) getChildAt(i27);
                    p7Var.v = null;
                    p7Var.O = 0.0f;
                    p7Var.P = 0;
                    p7Var.setTranslationX(0.0f);
                    p7Var.setTranslationY(0.0f);
                    p7Var.j(1.0f, !z1());
                }
            } else if (childAt4 instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var2 = (org.telegram.ui.Cells.p7) getChildAt(i27);
                y1(p7Var2);
                MessageObject messageObject = p7Var2.getMessageObject();
                if (messageObject == null || getMessageAlphaEnter() == null) {
                    f12 = 2.0f;
                } else {
                    f12 = 2.0f;
                    if (getMessageAlphaEnter().get(messageObject.getId(), null) != null) {
                        f13 = getMessageAlphaEnter().get(messageObject.getId(), valueOf).floatValue();
                        boolean z13 = z1();
                        if (p7Var2.w != f13) {
                            p7Var2.w = f13;
                            if (!z13) {
                                p7Var2.invalidate();
                            }
                        }
                        if (z1()) {
                            int a2 = (((f2.u) p7Var2.getLayoutParams()).a() % getColumnsCount()) + i10;
                            int animateToColumnsCount = (getAnimateToColumnsCount() * (((((f2.u) p7Var2.getLayoutParams()).a() - i12) / getColumnsCount()) + i13)) + a2 + this.k3;
                            if (a2 >= 0 && a2 < getAnimateToColumnsCount() && animateToColumnsCount >= 0 && animateToColumnsCount < arrayList4.size()) {
                                float lerp = AndroidUtilities.lerp(1.0f, (((org.telegram.ui.Cells.p7) arrayList4.get(animateToColumnsCount)).getMeasuredWidth() - AndroidUtilities.dpf2(f12)) / (p7Var2.getMeasuredWidth() - AndroidUtilities.dpf2(f12)), getChangeColumnsProgress());
                                float left = p7Var2.getLeft();
                                float top = p7Var2.getTop();
                                float left2 = ((org.telegram.ui.Cells.p7) arrayList4.get(animateToColumnsCount)).getLeft();
                                float top2 = ((org.telegram.ui.Cells.p7) arrayList4.get(animateToColumnsCount)).getTop();
                                p7Var2.setPivotX(0.0f);
                                p7Var2.setPivotY(0.0f);
                                p7Var2.j(lerp, !z1());
                                p7Var2.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                                p7Var2.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                                org.telegram.ui.Cells.p7 p7Var3 = (org.telegram.ui.Cells.p7) arrayList4.get(animateToColumnsCount);
                                float changeColumnsProgress = getChangeColumnsProgress();
                                int animateToColumnsCount2 = getAnimateToColumnsCount();
                                p7Var2.v = p7Var3;
                                p7Var2.O = changeColumnsProgress;
                                p7Var2.P = animateToColumnsCount2;
                                hashSet.add((org.telegram.ui.Cells.p7) arrayList4.get(animateToColumnsCount));
                                arrayList2.add(p7Var2);
                                canvas.save();
                                canvas.translate(p7Var2.getX(), p7Var2.getY());
                                p7Var2.draw(canvas);
                                canvas.restore();
                                if (p7Var2.getY() < f10) {
                                    f10 = p7Var2.getY();
                                }
                                z10 = true;
                                if (!z10) {
                                    if (z1()) {
                                        arrayList.add(p7Var2);
                                    }
                                    p7Var2.v = null;
                                    p7Var2.O = 0.0f;
                                    p7Var2.P = 0;
                                    p7Var2.setTranslationX(0.0f);
                                    p7Var2.setTranslationY(0.0f);
                                    p7Var2.j(1.0f, !z1());
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                }
                f13 = 1.0f;
                boolean z132 = z1();
                if (p7Var2.w != f13) {
                }
                if (z1()) {
                }
                z10 = false;
                if (!z10) {
                }
            }
        }
        float f16 = 255.0f;
        if (z1() && !arrayList3.isEmpty()) {
            float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
            float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float measuredWidth = getMeasuredWidth() / getColumnsCount();
            float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
            float ceil3 = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * changeColumnsProgress3) + AndroidUtilities.dpf2(2.0f));
            if (A1()) {
                ceil3 *= 1.25f;
            }
            float f17 = ceil3;
            int i28 = 0;
            while (i28 < arrayList3.size()) {
                org.telegram.ui.Cells.p7 p7Var4 = (org.telegram.ui.Cells.p7) arrayList3.get(i28);
                if (hashSet.contains(p7Var4)) {
                    f11 = changeColumnsProgress3;
                    i15 = i28;
                } else {
                    p7Var4.v = null;
                    p7Var4.O = 0.0f;
                    p7Var4.P = 0;
                    int a10 = ((f2.u) p7Var4.getLayoutParams()).a() % getAnimateToColumnsCount();
                    int i29 = a10 - i10;
                    int a11 = ((((f2.u) p7Var4.getLayoutParams()).a() - i11) / getAnimateToColumnsCount()) - i13;
                    canvas.save();
                    canvas.translate((getChangeColumnsProgress() * a10 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i29 * measuredWidth), (a11 * f17) + f10);
                    p7Var4.j(changeColumnsProgress3, !z1());
                    if (i29 < getColumnsCount()) {
                        f11 = changeColumnsProgress3;
                        i15 = i28;
                        canvas.saveLayerAlpha(0.0f, 0.0f, p7Var4.getMeasuredWidth() * changeColumnsProgress2, p7Var4.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                        p7Var4.draw(canvas);
                        canvas.restore();
                    } else {
                        f11 = changeColumnsProgress3;
                        i15 = i28;
                        p7Var4.draw(canvas);
                    }
                    canvas.restore();
                }
                i28 = i15 + 1;
                changeColumnsProgress3 = f11;
            }
        }
        super.dispatchDraw(canvas);
        if (z1()) {
            float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
            float changeColumnsProgress5 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float ceil4 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * changeColumnsProgress5) + AndroidUtilities.dpf2(2.0f));
            if (A1()) {
                ceil4 *= 1.25f;
            }
            float f18 = ceil4;
            float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
            float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
            int i30 = 0;
            while (i30 < arrayList.size()) {
                org.telegram.ui.Cells.p7 p7Var5 = (org.telegram.ui.Cells.p7) arrayList.get(i30);
                int a12 = ((f2.u) p7Var5.getLayoutParams()).a() % getColumnsCount();
                int a13 = ((((f2.u) p7Var5.getLayoutParams()).a() - i12) / getColumnsCount()) + i13;
                int i31 = a12 + i10;
                canvas.save();
                p7Var5.j(changeColumnsProgress5, !z1());
                canvas.translate((getChangeColumnsProgress() * i31 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * a12 * measuredWidth3), (a13 * f18) + f10);
                if (i31 < getAnimateToColumnsCount()) {
                    i14 = i30;
                    canvas.saveLayerAlpha(0.0f, 0.0f, p7Var5.getMeasuredWidth() * changeColumnsProgress4, p7Var5.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f16), 31);
                    p7Var5.draw(canvas);
                    canvas.restore();
                } else {
                    i14 = i30;
                    p7Var5.draw(canvas);
                }
                canvas.restore();
                i30 = i14 + 1;
                f16 = 255.0f;
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * 255.0f), 31);
            for (int i32 = 0; i32 < arrayList2.size(); i32++) {
                org.telegram.ui.Cells.p7 p7Var6 = (org.telegram.ui.Cells.p7) arrayList2.get(i32);
                if (p7Var6.v != null) {
                    canvas.save();
                    canvas.translate(p7Var6.getX(), p7Var6.getY());
                    p7Var6.v.j(((p7Var6.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * p7Var6.x) / (p7Var6.v.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
                    p7Var6.v.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tk0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.p7)) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getAnimateToColumnsCount() {
        return 3;
    }

    public float getChangeColumnsProgress() {
        return 0.0f;
    }

    public int getColumnsCount() {
        return 3;
    }

    public SparseArray<Float> getMessageAlphaEnter() {
        return null;
    }

    public tk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public tk0 getSupportingAdapter() {
        return null;
    }

    public ht0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.p7 p7Var) {
    }
}
