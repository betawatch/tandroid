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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ut0 extends ws0 {
    public final HashSet b3;
    public final ArrayList c3;
    public final ArrayList d3;
    public final ArrayList e3;
    public TextPaint f3;
    public StaticLayout g3;
    public float h3;
    public float i3;
    public ih.u9 j3;
    public int k3;
    public final ArrayList l3;

    public ut0(Context context) {
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
    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f12;
        int i14;
        float f13;
        float f14;
        boolean z10;
        int i15;
        Float valueOf = Float.valueOf(1.0f);
        gk0 movingAdapter = getMovingAdapter();
        gk0 supportingAdapter = getSupportingAdapter();
        if (!B1() || getAdapter() != movingAdapter) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt = getChildAt(i16);
                int p6 = eu0.p(childAt);
                if (p6 != 0 && getMessageAlphaEnter() != null) {
                    if (getMessageAlphaEnter().get(p6, null) != null) {
                        f10 = getMessageAlphaEnter().get(p6, valueOf).floatValue();
                        if (!(childAt instanceof org.telegram.ui.Cells.i7)) {
                            ((org.telegram.ui.Cells.i7) childAt).setEnterAnimationAlpha(f10);
                        } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) childAt).setEnterAnimationAlpha(f10);
                        }
                    }
                }
                f10 = 1.0f;
                if (!(childAt instanceof org.telegram.ui.Cells.i7)) {
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
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < getChildCount(); i20++) {
                int R = RecyclerView.R(getChildAt(i20));
                if (R >= 0 && (R > i19 || i19 == -1)) {
                    i19 = R;
                }
                if (R >= 0 && (R < i18 || i18 == -1)) {
                    i18 = R;
                }
            }
            int i21 = 0;
            i10 = -1;
            while (true) {
                f11 = measuredHeight;
                if (i21 >= getSupportingListView().getChildCount()) {
                    break;
                }
                ws0 supportingListView = getSupportingListView();
                View childAt2 = getSupportingListView().getChildAt(i21);
                supportingListView.getClass();
                int R2 = RecyclerView.R(childAt2);
                int i22 = i18;
                if (R2 >= 0 && (R2 > i17 || i17 == -1)) {
                    i17 = R2;
                }
                if (R2 >= 0 && (R2 < i10 || i10 == -1)) {
                    i10 = R2;
                }
                i21++;
                i18 = i22;
                measuredHeight = f11;
            }
            i11 = i18;
            if (i11 < 0 || i10 < 0 || getPinchCenterPosition() < 0) {
                i15 = 0;
                i12 = 0;
            } else {
                int i23 = i17;
                int ceil = (int) Math.ceil(movingAdapter.h() / getColumnsCount());
                int i24 = i19;
                int ceil2 = (int) Math.ceil(movingAdapter.h() / getAnimateToColumnsCount());
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
            this.k3 = 0;
            for (int i25 = 0; i25 < getSupportingListView().getChildCount(); i25++) {
                View childAt3 = getSupportingListView().getChildAt(i25);
                if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                    if (childAt3 instanceof org.telegram.ui.Cells.r7) {
                        arrayList4.add((org.telegram.ui.Cells.r7) childAt3);
                    } else if (childAt3 instanceof TextView) {
                        this.k3++;
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            fk0 fastScroll = getFastScroll();
            if (fastScroll != null && fastScroll.getTag() != null) {
                float H = movingAdapter.H(this);
                float H2 = supportingAdapter.H(getSupportingListView());
                float f15 = movingAdapter.E(this) ? 1.0f : 0.0f;
                float f16 = supportingAdapter.E(getSupportingListView()) ? 1.0f : 0.0f;
                fastScroll.setProgress((getChangeColumnsProgress() * H2) + ((1.0f - getChangeColumnsProgress()) * H));
                fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f16) + ((1.0f - getChangeColumnsProgress()) * f15));
            }
            i9 = i15;
        } else {
            f11 = measuredHeight;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        for (int i26 = 0; i26 < getChildCount(); i26++) {
            View childAt4 = getChildAt(i26);
            if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                if (childAt4 instanceof org.telegram.ui.Cells.r7) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) getChildAt(i26);
                    r7Var.v = null;
                    r7Var.O = 0.0f;
                    r7Var.P = 0;
                    r7Var.setTranslationX(0.0f);
                    r7Var.setTranslationY(0.0f);
                    r7Var.j(1.0f, !z1());
                }
            } else if (childAt4 instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var2 = (org.telegram.ui.Cells.r7) getChildAt(i26);
                y1(r7Var2);
                MessageObject messageObject = r7Var2.getMessageObject();
                if (messageObject == null || getMessageAlphaEnter() == null) {
                    f13 = 2.0f;
                } else {
                    f13 = 2.0f;
                    if (getMessageAlphaEnter().get(messageObject.getId(), null) != null) {
                        f14 = getMessageAlphaEnter().get(messageObject.getId(), valueOf).floatValue();
                        boolean z13 = z1();
                        if (r7Var2.w != f14) {
                            r7Var2.w = f14;
                            if (!z13) {
                                r7Var2.invalidate();
                            }
                        }
                        if (z1()) {
                            int a2 = (((f2.w) r7Var2.getLayoutParams()).a() % getColumnsCount()) + i9;
                            int animateToColumnsCount = (getAnimateToColumnsCount() * (((((f2.w) r7Var2.getLayoutParams()).a() - i11) / getColumnsCount()) + i12)) + a2 + this.k3;
                            if (a2 >= 0 && a2 < getAnimateToColumnsCount() && animateToColumnsCount >= 0 && animateToColumnsCount < arrayList4.size()) {
                                float lerp = AndroidUtilities.lerp(1.0f, (((org.telegram.ui.Cells.r7) arrayList4.get(animateToColumnsCount)).getMeasuredWidth() - AndroidUtilities.dpf2(f13)) / (r7Var2.getMeasuredWidth() - AndroidUtilities.dpf2(f13)), getChangeColumnsProgress());
                                float left = r7Var2.getLeft();
                                float top = r7Var2.getTop();
                                float left2 = ((org.telegram.ui.Cells.r7) arrayList4.get(animateToColumnsCount)).getLeft();
                                float top2 = ((org.telegram.ui.Cells.r7) arrayList4.get(animateToColumnsCount)).getTop();
                                r7Var2.setPivotX(0.0f);
                                r7Var2.setPivotY(0.0f);
                                r7Var2.j(lerp, !z1());
                                r7Var2.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                                r7Var2.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                                org.telegram.ui.Cells.r7 r7Var3 = (org.telegram.ui.Cells.r7) arrayList4.get(animateToColumnsCount);
                                float changeColumnsProgress = getChangeColumnsProgress();
                                int animateToColumnsCount2 = getAnimateToColumnsCount();
                                r7Var2.v = r7Var3;
                                r7Var2.O = changeColumnsProgress;
                                r7Var2.P = animateToColumnsCount2;
                                hashSet.add((org.telegram.ui.Cells.r7) arrayList4.get(animateToColumnsCount));
                                arrayList2.add(r7Var2);
                                canvas.save();
                                canvas.translate(r7Var2.getX(), r7Var2.getY());
                                r7Var2.draw(canvas);
                                canvas.restore();
                                if (r7Var2.getY() < f11) {
                                    f11 = r7Var2.getY();
                                }
                                z10 = true;
                                if (!z10) {
                                    if (z1()) {
                                        arrayList.add(r7Var2);
                                    }
                                    r7Var2.v = null;
                                    r7Var2.O = 0.0f;
                                    r7Var2.P = 0;
                                    r7Var2.setTranslationX(0.0f);
                                    r7Var2.setTranslationY(0.0f);
                                    r7Var2.j(1.0f, !z1());
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                }
                f14 = 1.0f;
                boolean z132 = z1();
                if (r7Var2.w != f14) {
                }
                if (z1()) {
                }
                z10 = false;
                if (!z10) {
                }
            }
        }
        float f17 = 255.0f;
        if (z1() && !arrayList3.isEmpty()) {
            float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
            float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
            float measuredWidth = getMeasuredWidth() / getColumnsCount();
            float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
            float ceil3 = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * changeColumnsProgress3) + AndroidUtilities.dpf2(2.0f));
            if (A1()) {
                ceil3 *= 1.25f;
            }
            float f18 = ceil3;
            int i27 = 0;
            while (i27 < arrayList3.size()) {
                org.telegram.ui.Cells.r7 r7Var4 = (org.telegram.ui.Cells.r7) arrayList3.get(i27);
                if (hashSet.contains(r7Var4)) {
                    f12 = changeColumnsProgress3;
                    i14 = i27;
                } else {
                    r7Var4.v = null;
                    r7Var4.O = 0.0f;
                    r7Var4.P = 0;
                    int a3 = ((f2.w) r7Var4.getLayoutParams()).a() % getAnimateToColumnsCount();
                    int i28 = a3 - i9;
                    int a10 = ((((f2.w) r7Var4.getLayoutParams()).a() - i10) / getAnimateToColumnsCount()) - i12;
                    canvas.save();
                    canvas.translate((getChangeColumnsProgress() * a3 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i28 * measuredWidth), (a10 * f18) + f11);
                    r7Var4.j(changeColumnsProgress3, !z1());
                    if (i28 < getColumnsCount()) {
                        f12 = changeColumnsProgress3;
                        i14 = i27;
                        canvas.saveLayerAlpha(0.0f, 0.0f, r7Var4.getMeasuredWidth() * changeColumnsProgress2, r7Var4.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                        r7Var4.draw(canvas);
                        canvas.restore();
                    } else {
                        f12 = changeColumnsProgress3;
                        i14 = i27;
                        r7Var4.draw(canvas);
                    }
                    canvas.restore();
                }
                i27 = i14 + 1;
                changeColumnsProgress3 = f12;
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
            float f19 = ceil4;
            float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
            float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
            int i29 = 0;
            while (i29 < arrayList.size()) {
                org.telegram.ui.Cells.r7 r7Var5 = (org.telegram.ui.Cells.r7) arrayList.get(i29);
                int a11 = ((f2.w) r7Var5.getLayoutParams()).a() % getColumnsCount();
                int a12 = ((((f2.w) r7Var5.getLayoutParams()).a() - i11) / getColumnsCount()) + i12;
                int i30 = a11 + i9;
                canvas.save();
                r7Var5.j(changeColumnsProgress5, !z1());
                canvas.translate((getChangeColumnsProgress() * i30 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * a11 * measuredWidth3), (a12 * f19) + f11);
                if (i30 < getAnimateToColumnsCount()) {
                    i13 = i29;
                    canvas.saveLayerAlpha(0.0f, 0.0f, r7Var5.getMeasuredWidth() * changeColumnsProgress4, r7Var5.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f17), 31);
                    r7Var5.draw(canvas);
                    canvas.restore();
                } else {
                    i13 = i29;
                    r7Var5.draw(canvas);
                }
                canvas.restore();
                i29 = i13 + 1;
                f17 = 255.0f;
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * 255.0f), 31);
            for (int i31 = 0; i31 < arrayList2.size(); i31++) {
                org.telegram.ui.Cells.r7 r7Var6 = (org.telegram.ui.Cells.r7) arrayList2.get(i31);
                if (r7Var6.v != null) {
                    canvas.save();
                    canvas.translate(r7Var6.getX(), r7Var6.getY());
                    r7Var6.v.j(((r7Var6.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * r7Var6.x) / (r7Var6.v.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
                    r7Var6.v.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gk0 movingAdapter = getMovingAdapter();
        if (B1() && getAdapter() == movingAdapter && z1() && (view instanceof org.telegram.ui.Cells.r7)) {
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

    public gk0 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public gk0 getSupportingAdapter() {
        return null;
    }

    public ws0 getSupportingListView() {
        return null;
    }

    public abstract boolean z1();

    public void y1(org.telegram.ui.Cells.r7 r7Var) {
    }
}
