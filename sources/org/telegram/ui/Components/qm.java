package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class qm extends ViewGroup {
    public long E;
    public pm F;
    public om G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final ik N;
    public final nm O;
    public int P;
    public final /* synthetic */ rm Q;
    public final org.telegram.ui.Cells.v0 a;
    public final ArrayList b;
    public final HashMap c;
    public HashMap d;
    public ArrayList e;
    public HashMap f;
    public ArrayList h;
    public final int n;
    public final int r;
    public int s;
    public float w;
    public float x;
    public boolean[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(rm rmVar, Context context) {
        super(context);
        this.Q = rmVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = org.telegram.messenger.g0.L(16.0f);
        this.r = org.telegram.messenger.g0.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new ik(this, 1);
        this.O = new nm(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, rmVar.n, true);
        this.a = v0Var;
        v0Var.setCustomText(org.telegram.messenger.gd.N0(2131753957, null));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((pm) arrayList.get(i7)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i10);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(efVar)) {
                        Object obj = hashMap.get(efVar);
                        this.f.put(obj, efVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i11);
                                Object value = entry.getValue();
                                if (value == efVar) {
                                    Object key = entry.getKey();
                                    this.f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ef) && (str = ((org.telegram.messenger.ef) value2).I) != null && efVar != null && str.equals(efVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final PointF b() {
        rm rmVar = this.Q;
        om omVar = rmVar.K;
        PointF pointF = this.L;
        if (omVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (rmVar.L) {
            RectF f10 = omVar.f(omVar.e());
            RectF f11 = rmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + rmVar.K.a.a + f11.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF f12 = omVar.f(omVar.e());
        RectF f13 = rmVar.K.f(1.0f);
        pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, rmVar.E - ((rmVar.H - 0.5f) * rmVar.I), this.H);
        pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + rmVar.K.a.a + f13.top, (rmVar.F - ((rmVar.G - 0.5f) * rmVar.J)) + rmVar.N, this.H);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((pm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                om omVar = (om) arrayList2.get(i10);
                xh.e eVar = omVar.s;
                if (eVar != null) {
                    eVar.b(omVar.O.z);
                    omVar.s = null;
                }
            }
            i7++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i11 = size - 1;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.h.get(i12);
            num.getClass();
            arrayList3.add((org.telegram.messenger.ef) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                pm pmVar = new pm(this);
                pm.a(pmVar, new lm(this.Q, arrayList3), false);
                arrayList.add(pmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.n;
        int computeVerticalScrollOffset = this.Q.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.x = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((pm) arrayList.get(i7)).b() + f10;
            float f11 = this.w;
            zArr[i7] = (f10 >= f11 && f10 <= this.x) || (b10 >= f11 && b10 <= this.x) || (f10 <= f11 && b10 >= this.x);
            i7++;
            f10 = b10;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final int e() {
        int i7 = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((pm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i7;
    }

    public final void f(pm pmVar, org.telegram.messenger.ef efVar, int i7) {
        ArrayList arrayList = (ArrayList) pmVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i7), efVar);
        if (((ArrayList) pmVar.k.f).size() == 11) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ((ArrayList) pmVar.k.f).get(10);
            ((ArrayList) pmVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(pmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                pm pmVar2 = i10 == arrayList2.size() ? null : (pm) arrayList2.get(i10);
                if (pmVar2 == null) {
                    pm pmVar3 = new pm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(efVar2);
                    pm.a(pmVar3, new lm(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(pmVar2, efVar2, 0);
                }
            }
        }
        pm.a(pmVar, pmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            pm pmVar = (pm) arrayList.get(i10);
            float b10 = pmVar.b();
            pmVar.a = f10;
            pmVar.b = i7;
            f10 += b10;
            i7 += ((ArrayList) pmVar.k.f).size();
        }
    }

    public final void h() {
        rm rmVar = this.Q;
        ValueAnimator valueAnimator = rmVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        rmVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        rmVar.M = ofFloat;
        ofFloat.addUpdateListener(new mm(this, 1));
        rmVar.M.addListener(new y(this, 15));
        rmVar.M.setDuration(200L);
        rmVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        jm jmVar = chatAttachAlertPhotoLayout.H;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        zl zlVar = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z12 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = zlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = zlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = jmVar.f;
                    boolean z14 = jmVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (uiVar.O2 != 0 || uiVar.C1) {
                        s5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        s5Var.d(e02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, R == jmVar.b() - 1, uiVar.d2);
                        if ((uiVar.a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                            z11 = false;
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z11 = false;
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = z12;
                }
                i7++;
                z12 = z11;
            }
        }
        if (size != this.h.size()) {
            this.Q.b.L1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int d = i5.c.d(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != d) {
            this.s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            pm pmVar = (pm) arrayList.get(i7);
            if (((ArrayList) pmVar.k.f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) pmVar.k.f).size();
                pm pmVar2 = (pm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) pmVar2.k.f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ef) ((ArrayList) pmVar2.k.f).remove(0));
                }
                ((ArrayList) pmVar.k.f).addAll(arrayList2);
                pm.a(pmVar, pmVar.k, true);
                pm.a(pmVar2, pmVar2.k, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        float f11;
        om omVar;
        float f12 = this.n;
        rm rmVar = this.Q;
        int computeVerticalScrollOffset = rmVar.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f13 = f12;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            pm pmVar = (pm) arrayList2.get(i12);
            float b10 = pmVar.b();
            pmVar.a = f13;
            pmVar.b = i13;
            float f14 = this.w;
            if (f13 < f14 || f13 > this.x) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.x) && (f13 > f14 || f15 < this.x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i13 = ((ArrayList) pmVar.k.f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = pmVar.h;
            int i14 = pmVar.l;
            org.telegram.ui.ActionBar.u4 u4Var = pmVar.x;
            qm qmVar = pmVar.z;
            arrayList = arrayList2;
            float interpolation = pmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - pmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = org.telegram.messenger.g0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(pmVar.f, pmVar.d, interpolation);
            int width = qmVar.getWidth();
            rm rmVar2 = qmVar.Q;
            float previewScale = width * T1 * rmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = rmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(pmVar.g, pmVar.e, interpolation) * max;
            if (u4Var != null) {
                f11 = 2.0f;
                pmVar.p = 0.0f;
                float width2 = qmVar.getWidth();
                float f16 = i14;
                pmVar.n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                pmVar.o = (Math.max(f16, previewScale) + qmVar.getWidth()) / 2.0f;
                pmVar.q = Math.max(i14 * 2, previewScale2);
                pmVar.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                u4Var.setBounds((int) pmVar.n, (int) pmVar.p, (int) pmVar.o, (int) pmVar.q);
                u4Var.setAlpha((int) ((pmVar.d <= 0.0f ? 1.0f - interpolation : pmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                u4Var.d(canvas, pmVar.y, null);
                pmVar.p += f16;
                pmVar.n += f16;
                pmVar.q -= f16;
                pmVar.o -= f16;
            } else {
                f11 = 2.0f;
            }
            pmVar.r = pmVar.o - pmVar.n;
            pmVar.s = pmVar.q - pmVar.p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                om omVar2 = (om) arrayList3.get(i15);
                if (omVar2 != null && (((omVar = rmVar2.K) == null || omVar.b != omVar2.b) && omVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = pmVar.w;
            RectF rectF = pmVar.t;
            long j3 = pmVar.i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (pmVar.u == null || pmVar.v != j3) {
                    pmVar.v = j3;
                    pmVar.u = new xy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + pmVar.u.c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f17 = pmVar.n;
                float f18 = pmVar.r;
                float f19 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f18, L, f19, f17);
                i7 = size;
                float f20 = pmVar.p;
                i10 = i12;
                float f21 = pmVar.s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f21, L2, f19, f20), org.telegram.messenger.f3.a(f18, L, f19, f17), org.telegram.messenger.f3.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                xy0 xy0Var = pmVar.u;
                float L3 = org.telegram.messenger.g0.L(14.0f) + (((pmVar.r / f19) + pmVar.n) - (L / f19));
                float f23 = pmVar.p + (pmVar.s / f19);
                f10 = b10;
                xy0Var.c(L3, f23, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = ((ArrayList) pmVar.k.f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.k0(f13, v0Var.getMeasuredHeight());
        if (v0Var.R()) {
            v0Var.F(canvas, true);
            v0Var.J(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (rmVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (rmVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = i5.c.d(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pm pmVar;
        om omVar;
        float f10;
        pm pmVar2;
        om omVar2;
        int action;
        boolean z10;
        om omVar3;
        int i7;
        org.telegram.ui.bn bnVar;
        om omVar4;
        lm lmVar;
        ArrayList arrayList;
        int i10;
        om omVar5;
        om omVar6;
        ValueAnimator valueAnimator;
        lm lmVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        rm rmVar = this.Q;
        ui uiVar = rmVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                pmVar = null;
                break;
            }
            pmVar = (pm) arrayList2.get(i14);
            float b10 = pmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (pmVar != null) {
            ArrayList arrayList3 = pmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                omVar = (om) arrayList3.get(i15);
                if (omVar != null && omVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        omVar = null;
        om omVar7 = rmVar.K;
        if (omVar7 != null) {
            RectF f13 = omVar7.f(omVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            pmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                pm pmVar3 = (pm) arrayList2.get(i16);
                float b12 = pmVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            pmVar2 = pmVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (pmVar2 != null) {
                ArrayList arrayList4 = pmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                omVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    om omVar8 = (om) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (omVar8 == null || omVar8 == rmVar.K) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (((ArrayList) pmVar2.k.f).contains(omVar8.b)) {
                            RectF d = omVar8.d();
                            int i19 = omVar8.i;
                            if ((i19 & 4) > 0) {
                                i13 = i19;
                                f11 = 0.0f;
                                d.top = 0.0f;
                            } else {
                                i13 = i19;
                                f11 = 0.0f;
                            }
                            if ((i13 & 1) > 0) {
                                d.left = f11;
                            }
                            if ((i13 & 2) > 0) {
                                d.right = getWidth();
                            }
                            if ((omVar8.i & 8) > 0) {
                                d.bottom = pmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    omVar2 = omVar8;
                                }
                                i18 = i12 + 1;
                                arrayList4 = arrayList5;
                                size3 = i11;
                            }
                        }
                    }
                    i12 = i18;
                    i18 = i12 + 1;
                    arrayList4 = arrayList5;
                    size3 = i11;
                }
                action = motionEvent.getAction();
                ik ikVar = this.N;
                if (action == 0 || rmVar.K != null || rmVar.r.J1 || (((valueAnimator = rmVar.M) != null && valueAnimator.isRunning()) || pmVar == null || omVar == null || (lmVar2 = pmVar.k) == null || !((ArrayList) lmVar2.f).contains(omVar.b))) {
                    if (action == 2 || rmVar.K == null || rmVar.L) {
                        if (action == 1 || (omVar5 = rmVar.K) == null) {
                            if (action == 1 || rmVar.K != null || (omVar3 = this.G) == null || this.F == null) {
                                z10 = false;
                                i10 = 1;
                                if (action != i10 || action == 3) {
                                    this.E = 0L;
                                    removeCallbacks(ikVar);
                                    this.M = false;
                                    if (!z10) {
                                        h();
                                        return i10;
                                    }
                                }
                                return z10;
                            }
                            if (omVar3.e && omVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y11 = motionEvent.getY();
                                omVar3.m = x11;
                                omVar3.n = y11;
                                RectF d2 = omVar3.d();
                                omVar3.o = (float) Math.sqrt(Math.pow(d2.height(), 2.0d) + Math.pow(d2.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) c8.l9.a(omVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(nr.j);
                                duration.addUpdateListener(new x(omVar3, 13));
                                duration.addListener(new y(omVar3, 16));
                                duration.start();
                            } else {
                                RectF d10 = omVar3.d();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float L = d10.right - org.telegram.messenger.g0.L(36.4f);
                                float f20 = this.F.p + d10.top;
                                rectF2.set(L, f20, d10.right, org.telegram.messenger.g0.L(36.4f) + f20);
                                if (!rectF2.contains(x10, y10 - this.G.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i20 = 0; i20 < size4; i20++) {
                                        pm pmVar4 = (pm) arrayList2.get(i20);
                                        if (pmVar4 != null && (lmVar = pmVar4.k) != null && (arrayList = (ArrayList) lmVar.f) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.G.b);
                                    int i21 = uiVar.O2;
                                    org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
                                    if (i21 != 0) {
                                        i7 = 1;
                                    } else if (g2Var instanceof org.telegram.ui.bn) {
                                        bnVar = (org.telegram.ui.bn) g2Var;
                                        i7 = 0;
                                        if (g2Var == null) {
                                            g2Var = LaunchActivity.Q();
                                        }
                                        if (!uiVar.X3.g0()) {
                                            org.telegram.messenger.g0.v1(g2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.g0.v1(uiVar.c.findFocus());
                                        }
                                        PhotoViewer.p1().I2(null, g2Var, rmVar.a);
                                        PhotoViewer.p1().J2(uiVar);
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i22 = uiVar.Q3;
                                        boolean z11 = uiVar.R3;
                                        p12.h = i22;
                                        p12.n = z11;
                                        this.O.a = arrayList6;
                                        PhotoViewer.p1().f2(new ArrayList(arrayList6), indexOf, i7, false, this.O, bnVar);
                                        rmVar.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.W()) {
                                            PhotoViewer p13 = PhotoViewer.p1();
                                            Editable text = uiVar.b1().getText();
                                            p13.p7 = true;
                                            p13.q7 = text;
                                            omVar4 = null;
                                            p13.y2(null, text, false, false);
                                            p13.r3(null);
                                            this.G = omVar4;
                                            this.E = 0L;
                                            rmVar.K = omVar4;
                                            this.H = 0.0f;
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    bnVar = null;
                                    if (g2Var == null) {
                                    }
                                    if (!uiVar.X3.g0()) {
                                    }
                                    PhotoViewer.p1().I2(null, g2Var, rmVar.a);
                                    PhotoViewer.p1().J2(uiVar);
                                    PhotoViewer p122 = PhotoViewer.p1();
                                    int i222 = uiVar.Q3;
                                    boolean z112 = uiVar.R3;
                                    p122.h = i222;
                                    p122.n = z112;
                                    this.O.a = arrayList6;
                                    PhotoViewer.p1().f2(new ArrayList(arrayList6), indexOf, i7, false, this.O, bnVar);
                                    rmVar.Q.getClass();
                                    if (ChatAttachAlertPhotoLayout.W()) {
                                    }
                                } else if (rmVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.ef efVar = this.G.b;
                                    int indexOf2 = ((ArrayList) this.F.k.f).indexOf(efVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rmVar.Q;
                                        if (chatAttachAlertPhotoLayout != null) {
                                            ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                            int size5 = arrayList7.size();
                                            int i23 = 0;
                                            while (true) {
                                                if (i23 >= size5) {
                                                    break;
                                                }
                                                if (((Map.Entry) arrayList7.get(i23)).getValue() == efVar) {
                                                    this.c.put(efVar, ((Map.Entry) arrayList7.get(i23)).getKey());
                                                    break;
                                                }
                                                i23++;
                                            }
                                        }
                                        pm pmVar5 = this.F;
                                        ((ArrayList) pmVar5.k.f).remove(indexOf2);
                                        pm.a(pmVar5, pmVar5.k, true);
                                        j();
                                        i(rmVar.Q, false);
                                        int i24 = this.P + 1;
                                        this.P = i24;
                                        rmVar.x.k(0L, 82, efVar, null, null, new bi.x4(this, pmVar5, efVar, indexOf2, 21));
                                        postDelayed(new org.telegram.ui.ii(this, i24, 10), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = rmVar.M;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                omVar4 = null;
                                this.G = omVar4;
                                this.E = 0L;
                                rmVar.K = omVar4;
                                this.H = 0.0f;
                            }
                        } else {
                            if (pmVar == null || omVar == null || omVar == omVar5) {
                                if (pmVar2 == null || omVar2 == null || omVar2 == omVar5 || omVar2.b == omVar5.b) {
                                    pmVar = null;
                                    omVar = null;
                                } else {
                                    pmVar = pmVar2;
                                    omVar = omVar2;
                                }
                            }
                            if (pmVar != null) {
                                ArrayList arrayList8 = pmVar.h;
                                if (omVar != null && omVar != omVar5) {
                                    int indexOf3 = ((ArrayList) omVar5.a.k.f).indexOf(omVar5.b);
                                    int indexOf4 = ((ArrayList) pmVar.k.f).indexOf(omVar.b);
                                    if (indexOf3 >= 0) {
                                        ((ArrayList) rmVar.K.a.k.f).remove(indexOf3);
                                        pm pmVar6 = rmVar.K.a;
                                        pm.a(pmVar6, pmVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(pmVar) > arrayList2.indexOf(rmVar.K.a)) {
                                            indexOf4++;
                                        }
                                        f(pmVar, rmVar.K.b, indexOf4);
                                        if (rmVar.K.a != pmVar) {
                                            int size6 = arrayList8.size();
                                            int i25 = 0;
                                            while (true) {
                                                if (i25 >= size6) {
                                                    omVar6 = null;
                                                    break;
                                                }
                                                omVar6 = (om) arrayList8.get(i25);
                                                if (omVar6.b == rmVar.K.b) {
                                                    break;
                                                }
                                                i25++;
                                            }
                                            if (omVar6 != null) {
                                                g();
                                                om omVar9 = rmVar.K;
                                                RectF rectF3 = omVar6.g;
                                                pm pmVar7 = omVar6.O;
                                                float f21 = omVar9.j;
                                                RectF rectF4 = omVar9.g;
                                                omVar6.j = org.telegram.messenger.g0.T1(f21, omVar9.k, omVar9.e());
                                                if (omVar6.f == null) {
                                                    omVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = omVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    org.telegram.messenger.g0.Z1(rectF6, rectF3, omVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = omVar9.f;
                                                if (rectF7 != null) {
                                                    org.telegram.messenger.g0.Z1(rectF7, rectF4, omVar9.e(), omVar6.f);
                                                    omVar6.f.set(rectF5.centerX() - (((omVar6.f.width() / f10) * omVar9.a.r) / pmVar7.r), rectF5.centerY() - (((omVar6.f.height() / f10) * omVar9.a.s) / pmVar7.s), (((omVar6.f.width() / f10) * omVar9.a.r) / pmVar7.r) + rectF5.centerX(), (((omVar6.f.height() / f10) * omVar9.a.s) / pmVar7.s) + rectF5.centerY());
                                                } else {
                                                    omVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * omVar9.a.r) / pmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * omVar9.a.s) / pmVar7.s), (((rectF4.width() / f10) * omVar9.a.r) / pmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * omVar9.a.s) / pmVar7.s) + rectF5.centerY());
                                                }
                                                omVar6.j = org.telegram.messenger.g0.T1(omVar6.j, omVar6.k, omVar6.e());
                                                omVar6.h = SystemClock.elapsedRealtime();
                                                rmVar.K = omVar6;
                                                omVar6.a = pmVar;
                                                omVar6.j = 1.0f;
                                                omVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        rmVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(rmVar.Q, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        if (action != i10) {
                        }
                        this.E = 0L;
                        removeCallbacks(ikVar);
                        this.M = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    rmVar.E = x10;
                    rmVar.F = y10;
                    if (!this.M) {
                        this.M = true;
                        postDelayed(ikVar, 16L);
                    }
                    invalidate();
                } else {
                    this.F = pmVar;
                    this.G = omVar;
                    rmVar.E = x10;
                    rmVar.F = y10;
                    rmVar.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    org.telegram.messenger.g0.h3(new bi.q2(this, elapsedRealtime, this.G, 23), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i10 = 1;
                if (action != i10) {
                }
                this.E = 0L;
                removeCallbacks(ikVar);
                this.M = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f10 = 2.0f;
            pmVar2 = null;
        }
        omVar2 = null;
        action = motionEvent.getAction();
        ik ikVar2 = this.N;
        if (action == 0) {
        }
        if (action == 2) {
        }
        if (action == 1) {
        }
        if (action == 1) {
        }
        z10 = false;
        i10 = 1;
        if (action != i10) {
        }
        this.E = 0L;
        removeCallbacks(ikVar2);
        this.M = false;
        if (!z10) {
        }
        return z10;
    }
}
