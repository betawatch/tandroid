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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class ns0 extends rr0 {
    public final HashSet j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public TextPaint n3;
    public StaticLayout o3;
    public float p3;
    public float q3;
    public di.x9 r3;
    public int s3;
    public final ArrayList t3;

    public ns0(Context context) {
        super(context, null);
        this.j3 = new HashSet();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.t3 = new ArrayList();
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
    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        float f13;
        float f14;
        float f15;
        int i14;
        float f16;
        float f17;
        boolean z9;
        int i15;
        Float valueOf = Float.valueOf(1.0f);
        vi0 movingAdapter = getMovingAdapter();
        vi0 supportingAdapter = getSupportingAdapter();
        if (!C1() || getAdapter() != movingAdapter) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt = getChildAt(i16);
                int o4 = xs0.o(childAt);
                if (o4 != 0 && getMessageAlphaEnter() != null) {
                    if (getMessageAlphaEnter().get(o4, null) != null) {
                        f10 = getMessageAlphaEnter().get(o4, valueOf).floatValue();
                        if (!(childAt instanceof org.telegram.ui.Cells.h7)) {
                            ((org.telegram.ui.Cells.h7) childAt).setEnterAnimationAlpha(f10);
                        } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) childAt).setEnterAnimationAlpha(f10);
                        }
                    }
                }
                f10 = 1.0f;
                if (!(childAt instanceof org.telegram.ui.Cells.h7)) {
                }
            }
            super.dispatchDraw(canvas);
            return;
        }
        float measuredHeight = getMeasuredHeight();
        boolean A1 = A1();
        HashSet hashSet = this.j3;
        ArrayList arrayList = this.l3;
        ArrayList arrayList2 = this.m3;
        ArrayList arrayList3 = this.k3;
        ArrayList arrayList4 = this.t3;
        if (A1) {
            int i17 = -1;
            int i18 = -1;
            f12 = 1.0f;
            int i19 = -1;
            for (int i20 = 0; i20 < getChildCount(); i20++) {
                int R = RecyclerView.R(getChildAt(i20));
                if (R >= 0 && (R > i18 || i18 == -1)) {
                    i18 = R;
                }
                if (R >= 0 && (R < i19 || i19 == -1)) {
                    i19 = R;
                }
            }
            i10 = -1;
            int i21 = 0;
            while (true) {
                f11 = measuredHeight;
                if (i21 >= getSupportingListView().getChildCount()) {
                    break;
                }
                rr0 supportingListView = getSupportingListView();
                View childAt2 = getSupportingListView().getChildAt(i21);
                supportingListView.getClass();
                int R2 = RecyclerView.R(childAt2);
                int i22 = i19;
                if (R2 >= 0 && (R2 > i17 || i17 == -1)) {
                    i17 = R2;
                }
                if (R2 >= 0 && (R2 < i10 || i10 == -1)) {
                    i10 = R2;
                }
                i21++;
                i19 = i22;
                measuredHeight = f11;
            }
            i11 = i19;
            if (i11 < 0 || i10 < 0 || getPinchCenterPosition() < 0) {
                i15 = 0;
                i12 = 0;
            } else {
                int i23 = i17;
                int ceil = (int) Math.ceil(movingAdapter.b() / getColumnsCount());
                int i24 = i18;
                int ceil2 = (int) Math.ceil(movingAdapter.b() / getAnimateToColumnsCount());
                int pinchCenterPosition = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i10 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i11 / getColumnsCount()));
                i12 = (i11 / getColumnsCount()) - pinchCenterPosition < 0 ? pinchCenterPosition : pinchCenterPosition;
                if ((i10 / getAnimateToColumnsCount()) + i12 < 0) {
                }
                if (((i23 / getColumnsCount()) + i12 >= ceil && getAnimateToColumnsCount() > getColumnsCount()) || ((i24 / getAnimateToColumnsCount()) - i12 >= ceil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                    i12 = 0;
                }
                i15 = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
            }
            arrayList4.clear();
            hashSet.clear();
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            this.s3 = 0;
            for (int i25 = 0; i25 < getSupportingListView().getChildCount(); i25++) {
                View childAt3 = getSupportingListView().getChildAt(i25);
                if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                    if (childAt3 instanceof org.telegram.ui.Cells.o7) {
                        arrayList4.add((org.telegram.ui.Cells.o7) childAt3);
                    } else if (childAt3 instanceof TextView) {
                        this.s3++;
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            ui0 fastScroll = getFastScroll();
            if (fastScroll != null && fastScroll.getTag() != null) {
                float H = movingAdapter.H(this);
                float H2 = supportingAdapter.H(getSupportingListView());
                float f18 = movingAdapter.E(this) ? 1.0f : 0.0f;
                float f19 = supportingAdapter.E(getSupportingListView()) ? 1.0f : 0.0f;
                fastScroll.setProgress((getChangeColumnsProgress() * H2) + ((1.0f - getChangeColumnsProgress()) * H));
                fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f19) + ((1.0f - getChangeColumnsProgress()) * f18));
            }
            i7 = i15;
        } else {
            f11 = measuredHeight;
            f12 = 1.0f;
            i7 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i26 = 0;
        while (i26 < getChildCount()) {
            View childAt4 = getChildAt(i26);
            if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                if (childAt4 instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) getChildAt(i26);
                    o7Var.w = null;
                    o7Var.S = 0.0f;
                    o7Var.T = 0;
                    o7Var.setTranslationX(0.0f);
                    o7Var.setTranslationY(0.0f);
                    o7Var.j(!A1(), 1.0f);
                }
            } else if (childAt4 instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) getChildAt(i26);
                z1(o7Var2);
                org.telegram.messenger.ij messageObject = o7Var2.getMessageObject();
                if (messageObject == null || getMessageAlphaEnter() == null) {
                    f16 = 2.0f;
                } else {
                    f16 = 2.0f;
                    if (getMessageAlphaEnter().get(messageObject.f1(), null) != null) {
                        f17 = getMessageAlphaEnter().get(messageObject.f1(), valueOf).floatValue();
                        boolean A12 = A1();
                        if (o7Var2.x != f17) {
                            o7Var2.x = f17;
                            if (!A12) {
                                o7Var2.invalidate();
                            }
                        }
                        if (A1()) {
                            int a10 = (((v4.r) o7Var2.getLayoutParams()).a() % getColumnsCount()) + i7;
                            int animateToColumnsCount = (getAnimateToColumnsCount() * (((((v4.r) o7Var2.getLayoutParams()).a() - i11) / getColumnsCount()) + i12)) + a10 + this.s3;
                            if (a10 >= 0 && a10 < getAnimateToColumnsCount() && animateToColumnsCount >= 0 && animateToColumnsCount < arrayList4.size()) {
                                float T1 = org.telegram.messenger.g0.T1(f12, (((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount)).getMeasuredWidth() - org.telegram.messenger.g0.N(f16)) / (o7Var2.getMeasuredWidth() - org.telegram.messenger.g0.N(f16)), getChangeColumnsProgress());
                                float left = o7Var2.getLeft();
                                float top = o7Var2.getTop();
                                float left2 = ((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount)).getLeft();
                                float top2 = ((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount)).getTop();
                                o7Var2.setPivotX(0.0f);
                                o7Var2.setPivotY(0.0f);
                                o7Var2.j(!A1(), T1);
                                o7Var2.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                                o7Var2.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                                org.telegram.ui.Cells.o7 o7Var3 = (org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount);
                                float changeColumnsProgress = getChangeColumnsProgress();
                                int animateToColumnsCount2 = getAnimateToColumnsCount();
                                o7Var2.w = o7Var3;
                                o7Var2.S = changeColumnsProgress;
                                o7Var2.T = animateToColumnsCount2;
                                hashSet.add((org.telegram.ui.Cells.o7) arrayList4.get(animateToColumnsCount));
                                arrayList2.add(o7Var2);
                                canvas.save();
                                canvas.translate(o7Var2.getX(), o7Var2.getY());
                                o7Var2.draw(canvas);
                                canvas.restore();
                                if (o7Var2.getY() < f11) {
                                    f11 = o7Var2.getY();
                                }
                                z9 = true;
                                if (!z9) {
                                    if (A1()) {
                                        arrayList.add(o7Var2);
                                    }
                                    o7Var2.w = null;
                                    o7Var2.S = 0.0f;
                                    o7Var2.T = 0;
                                    o7Var2.setTranslationX(0.0f);
                                    o7Var2.setTranslationY(0.0f);
                                    o7Var2.j(!A1(), 1.0f);
                                }
                            }
                        }
                        z9 = false;
                        if (!z9) {
                        }
                    }
                }
                f17 = f12;
                boolean A122 = A1();
                if (o7Var2.x != f17) {
                }
                if (A1()) {
                }
                z9 = false;
                if (!z9) {
                }
            }
            i26++;
            f12 = 1.0f;
        }
        float f20 = 1.25f;
        float f21 = 255.0f;
        if (A1() && !arrayList3.isEmpty()) {
            float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
            float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - org.telegram.messenger.g0.N(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - org.telegram.messenger.g0.N(2.0f))));
            float measuredWidth = getMeasuredWidth() / getColumnsCount();
            float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
            float ceil3 = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - org.telegram.messenger.g0.N(2.0f)) * changeColumnsProgress3) + org.telegram.messenger.g0.N(2.0f));
            if (B1()) {
                ceil3 *= 1.25f;
            }
            float f22 = ceil3;
            int i27 = 0;
            while (i27 < arrayList3.size()) {
                org.telegram.ui.Cells.o7 o7Var4 = (org.telegram.ui.Cells.o7) arrayList3.get(i27);
                if (hashSet.contains(o7Var4)) {
                    f15 = changeColumnsProgress3;
                    i14 = i27;
                    f14 = f20;
                } else {
                    o7Var4.w = null;
                    o7Var4.S = 0.0f;
                    o7Var4.T = 0;
                    int a11 = ((v4.r) o7Var4.getLayoutParams()).a() % getAnimateToColumnsCount();
                    int i28 = a11 - i7;
                    int a12 = ((((v4.r) o7Var4.getLayoutParams()).a() - i10) / getAnimateToColumnsCount()) - i12;
                    canvas.save();
                    f14 = f20;
                    canvas.translate((getChangeColumnsProgress() * a11 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i28 * measuredWidth), (a12 * f22) + f11);
                    o7Var4.j(!A1(), changeColumnsProgress3);
                    if (i28 < getColumnsCount()) {
                        f15 = changeColumnsProgress3;
                        i14 = i27;
                        canvas.saveLayerAlpha(0.0f, 0.0f, o7Var4.getMeasuredWidth() * changeColumnsProgress2, o7Var4.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                        o7Var4.draw(canvas);
                        canvas.restore();
                    } else {
                        f15 = changeColumnsProgress3;
                        i14 = i27;
                        o7Var4.draw(canvas);
                    }
                    canvas.restore();
                }
                i27 = i14 + 1;
                f20 = f14;
                changeColumnsProgress3 = f15;
            }
        }
        float f23 = f20;
        super.dispatchDraw(canvas);
        if (A1()) {
            float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
            float changeColumnsProgress5 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - org.telegram.messenger.g0.N(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - org.telegram.messenger.g0.N(2.0f))));
            float ceil4 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - org.telegram.messenger.g0.N(2.0f)) * changeColumnsProgress5) + org.telegram.messenger.g0.N(2.0f));
            if (B1()) {
                ceil4 *= f23;
            }
            float f24 = ceil4;
            float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
            float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
            int i29 = 0;
            while (i29 < arrayList.size()) {
                org.telegram.ui.Cells.o7 o7Var5 = (org.telegram.ui.Cells.o7) arrayList.get(i29);
                int a13 = ((v4.r) o7Var5.getLayoutParams()).a() % getColumnsCount();
                int a14 = ((((v4.r) o7Var5.getLayoutParams()).a() - i11) / getColumnsCount()) + i12;
                int i30 = a13 + i7;
                canvas.save();
                o7Var5.j(!A1(), changeColumnsProgress5);
                canvas.translate((getChangeColumnsProgress() * i30 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * a13 * measuredWidth3), (a14 * f24) + f11);
                if (i30 < getAnimateToColumnsCount()) {
                    i13 = i29;
                    f13 = f21;
                    canvas.saveLayerAlpha(0.0f, 0.0f, o7Var5.getMeasuredWidth() * changeColumnsProgress4, o7Var5.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f21), 31);
                    o7Var5.draw(canvas);
                    canvas.restore();
                } else {
                    i13 = i29;
                    f13 = f21;
                    o7Var5.draw(canvas);
                }
                canvas.restore();
                i29 = i13 + 1;
                f21 = f13;
            }
            float f25 = f21;
            if (arrayList2.isEmpty()) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * f25), 31);
            for (int i31 = 0; i31 < arrayList2.size(); i31++) {
                org.telegram.ui.Cells.o7 o7Var6 = (org.telegram.ui.Cells.o7) arrayList2.get(i31);
                if (o7Var6.w != null) {
                    canvas.save();
                    canvas.translate(o7Var6.getX(), o7Var6.getY());
                    o7Var6.w.j(false, ((o7Var6.getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f)) * o7Var6.y) / (o7Var6.w.getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f)));
                    o7Var6.w.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        vi0 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof org.telegram.ui.Cells.o7)) {
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

    public vi0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public vi0 getSupportingAdapter() {
        return null;
    }

    public rr0 getSupportingListView() {
        return null;
    }

    public void z1(org.telegram.ui.Cells.o7 o7Var) {
    }
}
