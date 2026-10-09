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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class rv0 extends tu0 {
    public final HashSet d3;
    public final ArrayList e3;
    public final ArrayList f3;
    public final ArrayList g3;
    public TextPaint h3;
    public StaticLayout i3;
    public float j3;
    public float k3;
    public ai.sc l3;
    public int m3;
    public final ArrayList n3;

    public rv0(Context context) {
        super(context, null);
        this.d3 = new HashSet();
        this.e3 = new ArrayList();
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.n3 = new ArrayList();
    }

    public abstract boolean A1();

    public abstract boolean B1();

    public boolean C1() {
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
    /* JADX WARN: Removed duplicated region for block: B:109:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0709  */
    @Override // org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f12;
        float f13;
        float f14;
        int i15;
        float f15;
        float f16;
        boolean z10;
        int i16;
        Float valueOf = Float.valueOf(1.0f);
        yl0 movingAdapter = getMovingAdapter();
        yl0 supportingAdapter = getSupportingAdapter();
        if (!C1() || getAdapter() != movingAdapter) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt = getChildAt(i17);
                int p5 = bw0.p(childAt);
                if (p5 != 0 && getMessageAlphaEnter() != null) {
                    if (getMessageAlphaEnter().get(p5, null) != null) {
                        f7 = getMessageAlphaEnter().get(p5, valueOf).floatValue();
                        if (!(childAt instanceof org.telegram.ui.Cells.k7)) {
                            ((org.telegram.ui.Cells.k7) childAt).setEnterAnimationAlpha(f7);
                        } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                            ((org.telegram.ui.Cells.j7) childAt).setEnterAnimationAlpha(f7);
                        }
                    }
                }
                f7 = 1.0f;
                if (!(childAt instanceof org.telegram.ui.Cells.k7)) {
                }
            }
            super.dispatchDraw(canvas);
            return;
        }
        float measuredHeight = getMeasuredHeight();
        boolean A1 = A1();
        HashSet hashSet = this.d3;
        ArrayList arrayList = this.f3;
        ArrayList arrayList2 = this.g3;
        ArrayList arrayList3 = this.e3;
        ArrayList arrayList4 = this.n3;
        if (A1) {
            int i18 = -1;
            int i19 = -1;
            f11 = 1.0f;
            int i20 = -1;
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                int R = RecyclerView.R(getChildAt(i21));
                if (R >= 0 && (R > i19 || i19 == -1)) {
                    i19 = R;
                }
                if (R >= 0 && (R < i20 || i20 == -1)) {
                    i20 = R;
                }
            }
            i11 = -1;
            int i22 = 0;
            while (true) {
                f10 = measuredHeight;
                if (i22 >= getSupportingListView().getChildCount()) {
                    break;
                }
                tu0 supportingListView = getSupportingListView();
                View childAt2 = getSupportingListView().getChildAt(i22);
                supportingListView.getClass();
                int R2 = RecyclerView.R(childAt2);
                int i23 = i20;
                if (R2 >= 0 && (R2 > i18 || i18 == -1)) {
                    i18 = R2;
                }
                if (R2 >= 0 && (R2 < i11 || i11 == -1)) {
                    i11 = R2;
                }
                i22++;
                i20 = i23;
                measuredHeight = f10;
            }
            i12 = i20;
            if (i12 < 0 || i11 < 0 || getPinchCenterPosition() < 0) {
                i16 = 0;
                i13 = 0;
            } else {
                int i24 = i18;
                int ceil = (int) Math.ceil(movingAdapter.h() / getColumnsCount());
                int i25 = i19;
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
            this.m3 = 0;
            for (int i26 = 0; i26 < getSupportingListView().getChildCount(); i26++) {
                View childAt3 = getSupportingListView().getChildAt(i26);
                if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                    if (childAt3 instanceof org.telegram.ui.Cells.t7) {
                        arrayList4.add((org.telegram.ui.Cells.t7) childAt3);
                    } else if (childAt3 instanceof TextView) {
                        this.m3++;
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            xl0 fastScroll = getFastScroll();
            if (fastScroll != null && fastScroll.getTag() != null) {
                float H = movingAdapter.H(this);
                float H2 = supportingAdapter.H(getSupportingListView());
                float f17 = movingAdapter.E(this) ? 1.0f : 0.0f;
                float f18 = supportingAdapter.E(getSupportingListView()) ? 1.0f : 0.0f;
                fastScroll.setProgress((getChangeColumnsProgress() * H2) + ((1.0f - getChangeColumnsProgress()) * H));
                fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f18) + ((1.0f - getChangeColumnsProgress()) * f17));
            }
            i10 = i16;
        } else {
            f10 = measuredHeight;
            f11 = 1.0f;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i27 = 0;
        while (i27 < getChildCount()) {
            View childAt4 = getChildAt(i27);
            if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                if (childAt4 instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) getChildAt(i27);
                    t7Var.v = null;
                    t7Var.S = 0.0f;
                    t7Var.T = 0;
                    t7Var.setTranslationX(0.0f);
                    t7Var.setTranslationY(0.0f);
                    t7Var.j(1.0f, !A1());
                }
            } else if (childAt4 instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var2 = (org.telegram.ui.Cells.t7) getChildAt(i27);
                z1(t7Var2);
                MessageObject messageObject = t7Var2.getMessageObject();
                if (messageObject == null || getMessageAlphaEnter() == null) {
                    f15 = 2.0f;
                } else {
                    f15 = 2.0f;
                    if (getMessageAlphaEnter().get(messageObject.getId(), null) != null) {
                        f16 = getMessageAlphaEnter().get(messageObject.getId(), valueOf).floatValue();
                        boolean A12 = A1();
                        if (t7Var2.w != f16) {
                            t7Var2.w = f16;
                            if (!A12) {
                                t7Var2.invalidate();
                            }
                        }
                        if (A1()) {
                            int a2 = (((s4.r) t7Var2.getLayoutParams()).a() % getColumnsCount()) + i10;
                            int animateToColumnsCount = (getAnimateToColumnsCount() * (((((s4.r) t7Var2.getLayoutParams()).a() - i12) / getColumnsCount()) + i13)) + a2 + this.m3;
                            if (a2 >= 0 && a2 < getAnimateToColumnsCount() && animateToColumnsCount >= 0 && animateToColumnsCount < arrayList4.size()) {
                                float lerp = AndroidUtilities.lerp(f11, (((org.telegram.ui.Cells.t7) arrayList4.get(animateToColumnsCount)).getMeasuredWidth() - AndroidUtilities.dpf2(f15)) / (t7Var2.getMeasuredWidth() - AndroidUtilities.dpf2(f15)), getChangeColumnsProgress());
                                float left = t7Var2.getLeft();
                                float top = t7Var2.getTop();
                                float left2 = ((org.telegram.ui.Cells.t7) arrayList4.get(animateToColumnsCount)).getLeft();
                                float top2 = ((org.telegram.ui.Cells.t7) arrayList4.get(animateToColumnsCount)).getTop();
                                t7Var2.setPivotX(0.0f);
                                t7Var2.setPivotY(0.0f);
                                t7Var2.j(lerp, !A1());
                                t7Var2.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                                t7Var2.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                                org.telegram.ui.Cells.t7 t7Var3 = (org.telegram.ui.Cells.t7) arrayList4.get(animateToColumnsCount);
                                float changeColumnsProgress = getChangeColumnsProgress();
                                int animateToColumnsCount2 = getAnimateToColumnsCount();
                                t7Var2.v = t7Var3;
                                t7Var2.S = changeColumnsProgress;
                                t7Var2.T = animateToColumnsCount2;
                                hashSet.add((org.telegram.ui.Cells.t7) arrayList4.get(animateToColumnsCount));
                                arrayList2.add(t7Var2);
                                canvas.save();
                                canvas.translate(t7Var2.getX(), t7Var2.getY());
                                t7Var2.draw(canvas);
                                canvas.restore();
                                if (t7Var2.getY() < f10) {
                                    f10 = t7Var2.getY();
                                }
                                z10 = true;
                                if (!z10) {
                                    if (A1()) {
                                        arrayList.add(t7Var2);
                                    }
                                    t7Var2.v = null;
                                    t7Var2.S = 0.0f;
                                    t7Var2.T = 0;
                                    t7Var2.setTranslationX(0.0f);
                                    t7Var2.setTranslationY(0.0f);
                                    t7Var2.j(1.0f, !A1());
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                }
                f16 = f11;
                boolean A122 = A1();
                if (t7Var2.w != f16) {
                }
                if (A1()) {
                }
                z10 = false;
                if (!z10) {
                }
            }
            i27++;
            f11 = 1.0f;
        }
        float f19 = 1.25f;
        float f20 = 255.0f;
        if (A1() && !arrayList3.isEmpty()) {
            float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
            float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float measuredWidth = getMeasuredWidth() / getColumnsCount();
            float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
            float ceil3 = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * changeColumnsProgress3) + AndroidUtilities.dpf2(2.0f));
            if (B1()) {
                ceil3 *= 1.25f;
            }
            float f21 = ceil3;
            int i28 = 0;
            while (i28 < arrayList3.size()) {
                org.telegram.ui.Cells.t7 t7Var4 = (org.telegram.ui.Cells.t7) arrayList3.get(i28);
                if (hashSet.contains(t7Var4)) {
                    f14 = changeColumnsProgress3;
                    i15 = i28;
                    f13 = f19;
                } else {
                    t7Var4.v = null;
                    t7Var4.S = 0.0f;
                    t7Var4.T = 0;
                    int a10 = ((s4.r) t7Var4.getLayoutParams()).a() % getAnimateToColumnsCount();
                    int i29 = a10 - i10;
                    int a11 = ((((s4.r) t7Var4.getLayoutParams()).a() - i11) / getAnimateToColumnsCount()) - i13;
                    canvas.save();
                    f13 = f19;
                    canvas.translate((getChangeColumnsProgress() * a10 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i29 * measuredWidth), (a11 * f21) + f10);
                    t7Var4.j(changeColumnsProgress3, !A1());
                    if (i29 < getColumnsCount()) {
                        f14 = changeColumnsProgress3;
                        i15 = i28;
                        canvas.saveLayerAlpha(0.0f, 0.0f, t7Var4.getMeasuredWidth() * changeColumnsProgress2, t7Var4.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                        t7Var4.draw(canvas);
                        canvas.restore();
                    } else {
                        f14 = changeColumnsProgress3;
                        i15 = i28;
                        t7Var4.draw(canvas);
                    }
                    canvas.restore();
                }
                i28 = i15 + 1;
                f19 = f13;
                changeColumnsProgress3 = f14;
            }
        }
        float f22 = f19;
        super.dispatchDraw(canvas);
        if (A1()) {
            float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
            float changeColumnsProgress5 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float ceil4 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * changeColumnsProgress5) + AndroidUtilities.dpf2(2.0f));
            if (B1()) {
                ceil4 *= f22;
            }
            float f23 = ceil4;
            float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
            float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
            int i30 = 0;
            while (i30 < arrayList.size()) {
                org.telegram.ui.Cells.t7 t7Var5 = (org.telegram.ui.Cells.t7) arrayList.get(i30);
                int a12 = ((s4.r) t7Var5.getLayoutParams()).a() % getColumnsCount();
                int a13 = ((((s4.r) t7Var5.getLayoutParams()).a() - i12) / getColumnsCount()) + i13;
                int i31 = a12 + i10;
                canvas.save();
                t7Var5.j(changeColumnsProgress5, !A1());
                canvas.translate((getChangeColumnsProgress() * i31 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * a12 * measuredWidth3), (a13 * f23) + f10);
                if (i31 < getAnimateToColumnsCount()) {
                    i14 = i30;
                    f12 = f20;
                    canvas.saveLayerAlpha(0.0f, 0.0f, t7Var5.getMeasuredWidth() * changeColumnsProgress4, t7Var5.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f20), 31);
                    t7Var5.draw(canvas);
                    canvas.restore();
                } else {
                    i14 = i30;
                    f12 = f20;
                    t7Var5.draw(canvas);
                }
                canvas.restore();
                i30 = i14 + 1;
                f20 = f12;
            }
            float f24 = f20;
            if (arrayList2.isEmpty()) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * f24), 31);
            for (int i32 = 0; i32 < arrayList2.size(); i32++) {
                org.telegram.ui.Cells.t7 t7Var6 = (org.telegram.ui.Cells.t7) arrayList2.get(i32);
                if (t7Var6.v != null) {
                    canvas.save();
                    canvas.translate(t7Var6.getX(), t7Var6.getY());
                    t7Var6.v.j(((t7Var6.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * t7Var6.x) / (t7Var6.v.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
                    t7Var6.v.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        yl0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.t7)) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
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

    public yl0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public yl0 getSupportingAdapter() {
        return null;
    }

    public tu0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.t7 t7Var) {
    }
}
