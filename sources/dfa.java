// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class dfa extends hea {
    public final HashSet k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final ArrayList n3;
    public TextPaint o3;
    public StaticLayout p3;
    public float q3;
    public float r3;
    public i7c s3;
    public int t3;
    public final ArrayList u3;

    public dfa(Context context) {
        super(context, null);
        this.k3 = new HashSet();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.u3 = new ArrayList();
    }

    public abstract boolean A1();

    public boolean B1() {
        return true;
    }

    public boolean C1() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0114, code lost:
    
        if (getAnimateToColumnsCount() > getColumnsCount()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        if (getAnimateToColumnsCount() >= getColumnsCount()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ba A[SYNTHETIC] */
    @Override // o39, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        float f5;
        int i6;
        float f6;
        float f7;
        boolean z;
        int i7;
        Float valueOf = Float.valueOf(1.0f);
        w29 movingAdapter = getMovingAdapter();
        w29 supportingAdapter = getSupportingAdapter();
        if (!C1() || getAdapter() != movingAdapter) {
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                int Q = nfa.Q(childAt);
                float floatValue = (Q == 0 || getMessageAlphaEnter() == null || getMessageAlphaEnter().get(Q, null) == null) ? 1.0f : getMessageAlphaEnter().get(Q, valueOf).floatValue();
                if (childAt instanceof iba) {
                    ((iba) childAt).setEnterAnimationAlpha(floatValue);
                } else if (childAt instanceof eba) {
                    ((eba) childAt).setEnterAnimationAlpha(floatValue);
                }
            }
            super.dispatchDraw(canvas);
            return;
        }
        float measuredHeight = getMeasuredHeight();
        boolean A1 = A1();
        HashSet hashSet = this.k3;
        ArrayList arrayList = this.m3;
        ArrayList arrayList2 = this.n3;
        ArrayList arrayList3 = this.l3;
        ArrayList arrayList4 = this.u3;
        if (A1) {
            int i9 = -1;
            int i10 = -1;
            f2 = 1.0f;
            int i11 = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                int R = RecyclerView.R(getChildAt(i12));
                if (R >= 0 && (R > i10 || i10 == -1)) {
                    i10 = R;
                }
                if (R >= 0 && (R < i11 || i11 == -1)) {
                    i11 = R;
                }
            }
            i2 = -1;
            int i13 = 0;
            while (true) {
                f = measuredHeight;
                if (i13 >= getSupportingListView().getChildCount()) {
                    break;
                }
                hea supportingListView = getSupportingListView();
                View childAt2 = getSupportingListView().getChildAt(i13);
                supportingListView.getClass();
                int R2 = RecyclerView.R(childAt2);
                int i14 = i11;
                if (R2 >= 0 && (R2 > i9 || i9 == -1)) {
                    i9 = R2;
                }
                if (R2 >= 0 && (R2 < i2 || i2 == -1)) {
                    i2 = R2;
                }
                i13++;
                i11 = i14;
                measuredHeight = f;
            }
            i3 = i11;
            if (i3 < 0 || i2 < 0 || getPinchCenterPosition() < 0) {
                i7 = 0;
                i4 = 0;
            } else {
                int i15 = i9;
                int ceil = (int) Math.ceil(movingAdapter.b() / getColumnsCount());
                int i16 = i10;
                int ceil2 = (int) Math.ceil(movingAdapter.b() / getAnimateToColumnsCount());
                int pinchCenterPosition = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i2 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i3 / getColumnsCount()));
                i4 = (i3 / getColumnsCount()) - pinchCenterPosition < 0 ? pinchCenterPosition : pinchCenterPosition;
                if ((i2 / getAnimateToColumnsCount()) + i4 < 0) {
                }
                if (((i15 / getColumnsCount()) + i4 >= ceil && getAnimateToColumnsCount() > getColumnsCount()) || ((i16 / getAnimateToColumnsCount()) - i4 >= ceil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                    i4 = 0;
                }
                i7 = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
            }
            arrayList4.clear();
            hashSet.clear();
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            this.t3 = 0;
            for (int i17 = 0; i17 < getSupportingListView().getChildCount(); i17++) {
                View childAt3 = getSupportingListView().getChildAt(i17);
                if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                    if (childAt3 instanceof qfa) {
                        arrayList4.add((qfa) childAt3);
                    } else if (childAt3 instanceof TextView) {
                        this.t3++;
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            v29 fastScroll = getFastScroll();
            if (fastScroll != null && fastScroll.getTag() != null) {
                float H = movingAdapter.H(this);
                float H2 = supportingAdapter.H(getSupportingListView());
                float f8 = movingAdapter.E(this) ? 1.0f : 0.0f;
                float f9 = supportingAdapter.E(getSupportingListView()) ? 1.0f : 0.0f;
                fastScroll.setProgress((getChangeColumnsProgress() * H2) + ((1.0f - getChangeColumnsProgress()) * H));
                fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f9) + ((1.0f - getChangeColumnsProgress()) * f8));
            }
            i = i7;
        } else {
            f = measuredHeight;
            f2 = 1.0f;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i18 = 0;
        while (i18 < getChildCount()) {
            View childAt4 = getChildAt(i18);
            if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                if (childAt4 instanceof qfa) {
                    qfa qfaVar = (qfa) getChildAt(i18);
                    qfaVar.w = null;
                    qfaVar.T = 0.0f;
                    qfaVar.U = 0.0f;
                    qfaVar.setTranslationX(0.0f);
                    qfaVar.setTranslationY(0.0f);
                    qfaVar.j(!A1(), 1.0f);
                }
            } else if (childAt4 instanceof qfa) {
                qfa qfaVar2 = (qfa) getChildAt(i18);
                z1(qfaVar2);
                k27 messageObject = qfaVar2.getMessageObject();
                if (messageObject == null || getMessageAlphaEnter() == null) {
                    f6 = 2.0f;
                } else {
                    f6 = 2.0f;
                    if (getMessageAlphaEnter().get(messageObject.e1(), null) != null) {
                        f7 = getMessageAlphaEnter().get(messageObject.e1(), valueOf).floatValue();
                        boolean A12 = A1();
                        if (qfaVar2.x != f7) {
                            qfaVar2.x = f7;
                            if (!A12) {
                                qfaVar2.invalidate();
                            }
                        }
                        if (A1()) {
                            int a = (((q35) qfaVar2.getLayoutParams()).a() % getColumnsCount()) + i;
                            int animateToColumnsCount = (getAnimateToColumnsCount() * (((((q35) qfaVar2.getLayoutParams()).a() - i3) / getColumnsCount()) + i4)) + a + this.t3;
                            if (a >= 0 && a < getAnimateToColumnsCount() && animateToColumnsCount >= 0 && animateToColumnsCount < arrayList4.size()) {
                                float R1 = gl.R1(f2, (((qfa) arrayList4.get(animateToColumnsCount)).getMeasuredWidth() - gl.N(f6)) / (qfaVar2.getMeasuredWidth() - gl.N(f6)), getChangeColumnsProgress());
                                float left = qfaVar2.getLeft();
                                float top = qfaVar2.getTop();
                                float left2 = ((qfa) arrayList4.get(animateToColumnsCount)).getLeft();
                                float top2 = ((qfa) arrayList4.get(animateToColumnsCount)).getTop();
                                qfaVar2.setPivotX(0.0f);
                                qfaVar2.setPivotY(0.0f);
                                qfaVar2.j(!A1(), R1);
                                qfaVar2.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                                qfaVar2.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                                qfa qfaVar3 = (qfa) arrayList4.get(animateToColumnsCount);
                                float changeColumnsProgress = getChangeColumnsProgress();
                                int animateToColumnsCount2 = getAnimateToColumnsCount();
                                qfaVar2.w = qfaVar3;
                                qfaVar2.T = changeColumnsProgress;
                                qfaVar2.U = animateToColumnsCount2;
                                hashSet.add((qfa) arrayList4.get(animateToColumnsCount));
                                arrayList2.add(qfaVar2);
                                canvas.save();
                                canvas.translate(qfaVar2.getX(), qfaVar2.getY());
                                qfaVar2.draw(canvas);
                                canvas.restore();
                                if (qfaVar2.getY() < f) {
                                    f = qfaVar2.getY();
                                }
                                z = true;
                                if (!z) {
                                    if (A1()) {
                                        arrayList.add(qfaVar2);
                                    }
                                    qfaVar2.w = null;
                                    qfaVar2.T = 0.0f;
                                    qfaVar2.U = 0.0f;
                                    qfaVar2.setTranslationX(0.0f);
                                    qfaVar2.setTranslationY(0.0f);
                                    qfaVar2.j(!A1(), 1.0f);
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                }
                f7 = f2;
                boolean A122 = A1();
                if (qfaVar2.x != f7) {
                }
                if (A1()) {
                }
                z = false;
                if (!z) {
                }
            }
            i18++;
            f2 = 1.0f;
        }
        float f10 = 1.25f;
        float f11 = 255.0f;
        if (A1() && !arrayList3.isEmpty()) {
            float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
            float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - gl.N(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - gl.N(2.0f))));
            float measuredWidth = getMeasuredWidth() / getColumnsCount();
            float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
            float ceil3 = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - gl.N(2.0f)) * changeColumnsProgress3) + gl.N(2.0f));
            if (B1()) {
                ceil3 *= 1.25f;
            }
            float f12 = ceil3;
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                qfa qfaVar4 = (qfa) arrayList3.get(i19);
                if (hashSet.contains(qfaVar4)) {
                    f5 = changeColumnsProgress3;
                    i6 = i19;
                    f4 = f10;
                } else {
                    qfaVar4.w = null;
                    qfaVar4.T = 0.0f;
                    qfaVar4.U = 0.0f;
                    int a2 = ((q35) qfaVar4.getLayoutParams()).a() % getAnimateToColumnsCount();
                    int i20 = a2 - i;
                    int a3 = ((((q35) qfaVar4.getLayoutParams()).a() - i2) / getAnimateToColumnsCount()) - i4;
                    canvas.save();
                    f4 = f10;
                    canvas.translate((getChangeColumnsProgress() * a2 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i20 * measuredWidth), (a3 * f12) + f);
                    qfaVar4.j(!A1(), changeColumnsProgress3);
                    if (i20 < getColumnsCount()) {
                        f5 = changeColumnsProgress3;
                        i6 = i19;
                        canvas.saveLayerAlpha(0.0f, 0.0f, qfaVar4.getMeasuredWidth() * changeColumnsProgress2, qfaVar4.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                        qfaVar4.draw(canvas);
                        canvas.restore();
                    } else {
                        f5 = changeColumnsProgress3;
                        i6 = i19;
                        qfaVar4.draw(canvas);
                    }
                    canvas.restore();
                }
                i19 = i6 + 1;
                f10 = f4;
                changeColumnsProgress3 = f5;
            }
        }
        float f13 = f10;
        super.dispatchDraw(canvas);
        if (A1()) {
            float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
            float changeColumnsProgress5 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - gl.N(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - gl.N(2.0f))));
            float ceil4 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - gl.N(2.0f)) * changeColumnsProgress5) + gl.N(2.0f));
            if (B1()) {
                ceil4 *= f13;
            }
            float f14 = ceil4;
            float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
            float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
            int i21 = 0;
            while (i21 < arrayList.size()) {
                qfa qfaVar5 = (qfa) arrayList.get(i21);
                int a4 = ((q35) qfaVar5.getLayoutParams()).a() % getColumnsCount();
                int a5 = ((((q35) qfaVar5.getLayoutParams()).a() - i3) / getColumnsCount()) + i4;
                int i22 = a4 + i;
                canvas.save();
                qfaVar5.j(!A1(), changeColumnsProgress5);
                canvas.translate((getChangeColumnsProgress() * i22 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * a4 * measuredWidth3), (a5 * f14) + f);
                if (i22 < getAnimateToColumnsCount()) {
                    i5 = i21;
                    f3 = f11;
                    canvas.saveLayerAlpha(0.0f, 0.0f, qfaVar5.getMeasuredWidth() * changeColumnsProgress4, qfaVar5.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f11), 31);
                    qfaVar5.draw(canvas);
                    canvas.restore();
                } else {
                    i5 = i21;
                    f3 = f11;
                    qfaVar5.draw(canvas);
                }
                canvas.restore();
                i21 = i5 + 1;
                f11 = f3;
            }
            float f15 = f11;
            if (arrayList2.isEmpty()) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * f15), 31);
            for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                qfa qfaVar6 = (qfa) arrayList2.get(i23);
                if (qfaVar6.w != null) {
                    canvas.save();
                    canvas.translate(qfaVar6.getX(), qfaVar6.getY());
                    qfaVar6.w.j(false, ((qfaVar6.getMeasuredWidth() - gl.L(2.0f)) * qfaVar6.y) / (qfaVar6.w.getMeasuredWidth() - gl.L(2.0f)));
                    qfaVar6.w.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        w29 movingAdapter = getMovingAdapter();
        if (C1() && getAdapter() == movingAdapter && A1() && (view instanceof qfa)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
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

    public w29 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public w29 getSupportingAdapter() {
        return null;
    }

    public hea getSupportingListView() {
        return null;
    }

    public void z1(qfa qfaVar) {
    }

    public dfa(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.k3 = new HashSet();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.u3 = new ArrayList();
    }
}
