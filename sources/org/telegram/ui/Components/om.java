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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class om extends ViewGroup {
    public long E;
    public nm F;
    public mm G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final gk N;
    public final lm O;
    public int P;
    public final /* synthetic */ pm Q;
    public final org.telegram.ui.Cells.u0 a;
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
    public om(pm pmVar, Context context) {
        super(context);
        this.Q = pmVar;
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
        this.N = new gk(this, 1);
        this.O = new lm(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(context, pmVar.n, true);
        this.a = u0Var;
        u0Var.setCustomText(org.telegram.messenger.gd.M0(2131753958, null));
        addView(u0Var);
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
            ArrayList arrayList2 = (ArrayList) ((nm) arrayList.get(i7)).k.f;
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
        pm pmVar = this.Q;
        mm mmVar = pmVar.K;
        PointF pointF = this.L;
        if (mmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (pmVar.L) {
            RectF f10 = mmVar.f(mmVar.e());
            RectF f11 = pmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + pmVar.K.a.a + f11.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF f12 = mmVar.f(mmVar.e());
        RectF f13 = pmVar.K.f(1.0f);
        pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, pmVar.E - ((pmVar.H - 0.5f) * pmVar.I), this.H);
        pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + pmVar.K.a.a + f13.top, (pmVar.F - ((pmVar.G - 0.5f) * pmVar.J)) + pmVar.N, this.H);
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
            ArrayList arrayList2 = ((nm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                mm mmVar = (mm) arrayList2.get(i10);
                xh.e eVar = mmVar.s;
                if (eVar != null) {
                    eVar.b(mmVar.O.z);
                    mmVar.s = null;
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
                nm nmVar = new nm(this);
                nm.a(nmVar, new jm(this.Q, arrayList3), false);
                arrayList.add(nmVar);
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
            float b10 = ((nm) arrayList.get(i7)).b() + f10;
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
            i7 = (int) (((nm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.u0 u0Var = this.a;
        if (u0Var.getMeasuredHeight() <= 0) {
            u0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return u0Var.getMeasuredHeight() + i7;
    }

    public final void f(nm nmVar, org.telegram.messenger.ef efVar, int i7) {
        ArrayList arrayList = (ArrayList) nmVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i7), efVar);
        if (((ArrayList) nmVar.k.f).size() == 11) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ((ArrayList) nmVar.k.f).get(10);
            ((ArrayList) nmVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(nmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                nm nmVar2 = i10 == arrayList2.size() ? null : (nm) arrayList2.get(i10);
                if (nmVar2 == null) {
                    nm nmVar3 = new nm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(efVar2);
                    nm.a(nmVar3, new jm(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(nmVar2, efVar2, 0);
                }
            }
        }
        nm.a(nmVar, nmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            nm nmVar = (nm) arrayList.get(i10);
            float b10 = nmVar.b();
            nmVar.a = f10;
            nmVar.b = i7;
            f10 += b10;
            i7 += ((ArrayList) nmVar.k.f).size();
        }
    }

    public final void h() {
        pm pmVar = this.Q;
        ValueAnimator valueAnimator = pmVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        pmVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        pmVar.M = ofFloat;
        ofFloat.addUpdateListener(new km(this, 1));
        pmVar.M.addListener(new x(this, 15));
        pmVar.M.setDuration(200L);
        pmVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        si siVar = chatAttachAlertPhotoLayout.b;
        xl xlVar = chatAttachAlertPhotoLayout.F;
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
            int childCount = xlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = xlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = hmVar.f;
                    boolean z14 = hmVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    if (siVar.O2 != 0 || siVar.C1) {
                        r5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        r5Var.d(e02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, R == hmVar.b() - 1, siVar.d2);
                        if ((siVar.a2 instanceof org.telegram.ui.bn) && siVar.R3) {
                            z11 = false;
                            r5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z11 = false;
                            r5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
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
            nm nmVar = (nm) arrayList.get(i7);
            if (((ArrayList) nmVar.k.f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) nmVar.k.f).size();
                nm nmVar2 = (nm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) nmVar2.k.f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ef) ((ArrayList) nmVar2.k.f).remove(0));
                }
                ((ArrayList) nmVar.k.f).addAll(arrayList2);
                nm.a(nmVar, nmVar.k, true);
                nm.a(nmVar2, nmVar2.k, true);
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
        mm mmVar;
        float f12 = this.n;
        pm pmVar = this.Q;
        int computeVerticalScrollOffset = pmVar.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f13 = f12;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            nm nmVar = (nm) arrayList2.get(i12);
            float b10 = nmVar.b();
            nmVar.a = f13;
            nmVar.b = i13;
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
                    i13 = ((ArrayList) nmVar.k.f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = nmVar.h;
            int i14 = nmVar.l;
            org.telegram.ui.ActionBar.v4 v4Var = nmVar.x;
            om omVar = nmVar.z;
            arrayList = arrayList2;
            float interpolation = nmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - nmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = org.telegram.messenger.g0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(nmVar.f, nmVar.d, interpolation);
            int width = omVar.getWidth();
            pm pmVar2 = omVar.Q;
            float previewScale = width * T1 * pmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = pmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(nmVar.g, nmVar.e, interpolation) * max;
            if (v4Var != null) {
                f11 = 2.0f;
                nmVar.p = 0.0f;
                float width2 = omVar.getWidth();
                float f16 = i14;
                nmVar.n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                nmVar.o = (Math.max(f16, previewScale) + omVar.getWidth()) / 2.0f;
                nmVar.q = Math.max(i14 * 2, previewScale2);
                nmVar.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                v4Var.setBounds((int) nmVar.n, (int) nmVar.p, (int) nmVar.o, (int) nmVar.q);
                v4Var.setAlpha((int) ((nmVar.d <= 0.0f ? 1.0f - interpolation : nmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                v4Var.d(canvas, nmVar.y, null);
                nmVar.p += f16;
                nmVar.n += f16;
                nmVar.q -= f16;
                nmVar.o -= f16;
            } else {
                f11 = 2.0f;
            }
            nmVar.r = nmVar.o - nmVar.n;
            nmVar.s = nmVar.q - nmVar.p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                mm mmVar2 = (mm) arrayList3.get(i15);
                if (mmVar2 != null && (((mmVar = pmVar2.K) == null || mmVar.b != mmVar2.b) && mmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = nmVar.w;
            RectF rectF = nmVar.t;
            long j3 = nmVar.i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (nmVar.u == null || nmVar.v != j3) {
                    nmVar.v = j3;
                    nmVar.u = new vy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + nmVar.u.c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f17 = nmVar.n;
                float f18 = nmVar.r;
                float f19 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f18, L, f19, f17);
                i7 = size;
                float f20 = nmVar.p;
                i10 = i12;
                float f21 = nmVar.s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f21, L2, f19, f20), org.telegram.messenger.f3.a(f18, L, f19, f17), org.telegram.messenger.f3.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                vy0 vy0Var = nmVar.u;
                float L3 = org.telegram.messenger.g0.L(14.0f) + (((nmVar.r / f19) + nmVar.n) - (L / f19));
                float f23 = nmVar.p + (nmVar.s / f19);
                f10 = b10;
                vy0Var.c(L3, f23, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = ((ArrayList) nmVar.k.f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.u0 u0Var = this.a;
        u0Var.l0(f13, u0Var.getMeasuredHeight());
        if (u0Var.T()) {
            u0Var.G(canvas, true);
            u0Var.L(canvas, true);
        }
        u0Var.draw(canvas);
        canvas.restore();
        if (pmVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (pmVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.u0 u0Var = this.a;
        u0Var.layout(0, 0, u0Var.getMeasuredWidth(), u0Var.getMeasuredHeight());
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
        nm nmVar;
        mm mmVar;
        float f10;
        nm nmVar2;
        mm mmVar2;
        int action;
        boolean z10;
        mm mmVar3;
        int i7;
        org.telegram.ui.bn bnVar;
        mm mmVar4;
        jm jmVar;
        ArrayList arrayList;
        int i10;
        mm mmVar5;
        mm mmVar6;
        ValueAnimator valueAnimator;
        jm jmVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        pm pmVar = this.Q;
        si siVar = pmVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                nmVar = null;
                break;
            }
            nmVar = (nm) arrayList2.get(i14);
            float b10 = nmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (nmVar != null) {
            ArrayList arrayList3 = nmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                mmVar = (mm) arrayList3.get(i15);
                if (mmVar != null && mmVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        mmVar = null;
        mm mmVar7 = pmVar.K;
        if (mmVar7 != null) {
            RectF f13 = mmVar7.f(mmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            nmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                nm nmVar3 = (nm) arrayList2.get(i16);
                float b12 = nmVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            nmVar2 = nmVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (nmVar2 != null) {
                ArrayList arrayList4 = nmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                mmVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    mm mmVar8 = (mm) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (mmVar8 == null || mmVar8 == pmVar.K) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (((ArrayList) nmVar2.k.f).contains(mmVar8.b)) {
                            RectF d = mmVar8.d();
                            int i19 = mmVar8.i;
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
                            if ((mmVar8.i & 8) > 0) {
                                d.bottom = nmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    mmVar2 = mmVar8;
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
                gk gkVar = this.N;
                if (action == 0 || pmVar.K != null || pmVar.r.J1 || (((valueAnimator = pmVar.M) != null && valueAnimator.isRunning()) || nmVar == null || mmVar == null || (jmVar2 = nmVar.k) == null || !((ArrayList) jmVar2.f).contains(mmVar.b))) {
                    if (action == 2 || pmVar.K == null || pmVar.L) {
                        if (action == 1 || (mmVar5 = pmVar.K) == null) {
                            if (action == 1 || pmVar.K != null || (mmVar3 = this.G) == null || this.F == null) {
                                z10 = false;
                                i10 = 1;
                                if (action != i10 || action == 3) {
                                    this.E = 0L;
                                    removeCallbacks(gkVar);
                                    this.M = false;
                                    if (!z10) {
                                        h();
                                        return i10;
                                    }
                                }
                                return z10;
                            }
                            if (mmVar3.e && mmVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y11 = motionEvent.getY();
                                mmVar3.m = x11;
                                mmVar3.n = y11;
                                RectF d2 = mmVar3.d();
                                mmVar3.o = (float) Math.sqrt(Math.pow(d2.height(), 2.0d) + Math.pow(d2.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) c8.l9.a(mmVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(lr.j);
                                duration.addUpdateListener(new w(mmVar3, 13));
                                duration.addListener(new x(mmVar3, 16));
                                duration.start();
                            } else {
                                RectF d10 = mmVar3.d();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float L = d10.right - org.telegram.messenger.g0.L(36.4f);
                                float f20 = this.F.p + d10.top;
                                rectF2.set(L, f20, d10.right, org.telegram.messenger.g0.L(36.4f) + f20);
                                if (!rectF2.contains(x10, y10 - this.G.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i20 = 0; i20 < size4; i20++) {
                                        nm nmVar4 = (nm) arrayList2.get(i20);
                                        if (nmVar4 != null && (jmVar = nmVar4.k) != null && (arrayList = (ArrayList) jmVar.f) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.G.b);
                                    int i21 = siVar.O2;
                                    org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
                                    if (i21 != 0) {
                                        i7 = 1;
                                    } else if (h2Var instanceof org.telegram.ui.bn) {
                                        bnVar = (org.telegram.ui.bn) h2Var;
                                        i7 = 0;
                                        if (h2Var == null) {
                                            h2Var = LaunchActivity.Q();
                                        }
                                        if (!siVar.X3.g0()) {
                                            org.telegram.messenger.g0.v1(h2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.g0.v1(siVar.c.findFocus());
                                        }
                                        PhotoViewer.p1().I2(null, h2Var, pmVar.a);
                                        PhotoViewer.p1().J2(siVar);
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i22 = siVar.Q3;
                                        boolean z11 = siVar.R3;
                                        p12.h = i22;
                                        p12.n = z11;
                                        this.O.a = arrayList6;
                                        PhotoViewer.p1().f2(new ArrayList(arrayList6), indexOf, i7, false, this.O, bnVar);
                                        pmVar.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.W()) {
                                            PhotoViewer p13 = PhotoViewer.p1();
                                            Editable text = siVar.b1().getText();
                                            p13.p7 = true;
                                            p13.q7 = text;
                                            mmVar4 = null;
                                            p13.y2(null, text, false, false);
                                            p13.r3(null);
                                            this.G = mmVar4;
                                            this.E = 0L;
                                            pmVar.K = mmVar4;
                                            this.H = 0.0f;
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    bnVar = null;
                                    if (h2Var == null) {
                                    }
                                    if (!siVar.X3.g0()) {
                                    }
                                    PhotoViewer.p1().I2(null, h2Var, pmVar.a);
                                    PhotoViewer.p1().J2(siVar);
                                    PhotoViewer p122 = PhotoViewer.p1();
                                    int i222 = siVar.Q3;
                                    boolean z112 = siVar.R3;
                                    p122.h = i222;
                                    p122.n = z112;
                                    this.O.a = arrayList6;
                                    PhotoViewer.p1().f2(new ArrayList(arrayList6), indexOf, i7, false, this.O, bnVar);
                                    pmVar.Q.getClass();
                                    if (ChatAttachAlertPhotoLayout.W()) {
                                    }
                                } else if (pmVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.ef efVar = this.G.b;
                                    int indexOf2 = ((ArrayList) this.F.k.f).indexOf(efVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = pmVar.Q;
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
                                        nm nmVar5 = this.F;
                                        ((ArrayList) nmVar5.k.f).remove(indexOf2);
                                        nm.a(nmVar5, nmVar5.k, true);
                                        j();
                                        i(pmVar.Q, false);
                                        int i24 = this.P + 1;
                                        this.P = i24;
                                        pmVar.x.k(0L, 82, efVar, null, null, new bi.u4(this, nmVar5, efVar, indexOf2, 21));
                                        postDelayed(new org.telegram.ui.ii(this, i24, 10), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = pmVar.M;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                mmVar4 = null;
                                this.G = mmVar4;
                                this.E = 0L;
                                pmVar.K = mmVar4;
                                this.H = 0.0f;
                            }
                        } else {
                            if (nmVar == null || mmVar == null || mmVar == mmVar5) {
                                if (nmVar2 == null || mmVar2 == null || mmVar2 == mmVar5 || mmVar2.b == mmVar5.b) {
                                    nmVar = null;
                                    mmVar = null;
                                } else {
                                    nmVar = nmVar2;
                                    mmVar = mmVar2;
                                }
                            }
                            if (nmVar != null) {
                                ArrayList arrayList8 = nmVar.h;
                                if (mmVar != null && mmVar != mmVar5) {
                                    int indexOf3 = ((ArrayList) mmVar5.a.k.f).indexOf(mmVar5.b);
                                    int indexOf4 = ((ArrayList) nmVar.k.f).indexOf(mmVar.b);
                                    if (indexOf3 >= 0) {
                                        ((ArrayList) pmVar.K.a.k.f).remove(indexOf3);
                                        nm nmVar6 = pmVar.K.a;
                                        nm.a(nmVar6, nmVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(nmVar) > arrayList2.indexOf(pmVar.K.a)) {
                                            indexOf4++;
                                        }
                                        f(nmVar, pmVar.K.b, indexOf4);
                                        if (pmVar.K.a != nmVar) {
                                            int size6 = arrayList8.size();
                                            int i25 = 0;
                                            while (true) {
                                                if (i25 >= size6) {
                                                    mmVar6 = null;
                                                    break;
                                                }
                                                mmVar6 = (mm) arrayList8.get(i25);
                                                if (mmVar6.b == pmVar.K.b) {
                                                    break;
                                                }
                                                i25++;
                                            }
                                            if (mmVar6 != null) {
                                                g();
                                                mm mmVar9 = pmVar.K;
                                                RectF rectF3 = mmVar6.g;
                                                nm nmVar7 = mmVar6.O;
                                                float f21 = mmVar9.j;
                                                RectF rectF4 = mmVar9.g;
                                                mmVar6.j = org.telegram.messenger.g0.T1(f21, mmVar9.k, mmVar9.e());
                                                if (mmVar6.f == null) {
                                                    mmVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = mmVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    org.telegram.messenger.g0.Z1(rectF6, rectF3, mmVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = mmVar9.f;
                                                if (rectF7 != null) {
                                                    org.telegram.messenger.g0.Z1(rectF7, rectF4, mmVar9.e(), mmVar6.f);
                                                    mmVar6.f.set(rectF5.centerX() - (((mmVar6.f.width() / f10) * mmVar9.a.r) / nmVar7.r), rectF5.centerY() - (((mmVar6.f.height() / f10) * mmVar9.a.s) / nmVar7.s), (((mmVar6.f.width() / f10) * mmVar9.a.r) / nmVar7.r) + rectF5.centerX(), (((mmVar6.f.height() / f10) * mmVar9.a.s) / nmVar7.s) + rectF5.centerY());
                                                } else {
                                                    mmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * mmVar9.a.r) / nmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * mmVar9.a.s) / nmVar7.s), (((rectF4.width() / f10) * mmVar9.a.r) / nmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * mmVar9.a.s) / nmVar7.s) + rectF5.centerY());
                                                }
                                                mmVar6.j = org.telegram.messenger.g0.T1(mmVar6.j, mmVar6.k, mmVar6.e());
                                                mmVar6.h = SystemClock.elapsedRealtime();
                                                pmVar.K = mmVar6;
                                                mmVar6.a = nmVar;
                                                mmVar6.j = 1.0f;
                                                mmVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        pmVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(pmVar.Q, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        if (action != i10) {
                        }
                        this.E = 0L;
                        removeCallbacks(gkVar);
                        this.M = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    pmVar.E = x10;
                    pmVar.F = y10;
                    if (!this.M) {
                        this.M = true;
                        postDelayed(gkVar, 16L);
                    }
                    invalidate();
                } else {
                    this.F = nmVar;
                    this.G = mmVar;
                    pmVar.E = x10;
                    pmVar.F = y10;
                    pmVar.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    org.telegram.messenger.g0.h3(new bi.m2(this, elapsedRealtime, this.G, 23), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i10 = 1;
                if (action != i10) {
                }
                this.E = 0L;
                removeCallbacks(gkVar);
                this.M = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f10 = 2.0f;
            nmVar2 = null;
        }
        mmVar2 = null;
        action = motionEvent.getAction();
        gk gkVar2 = this.N;
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
        removeCallbacks(gkVar2);
        this.M = false;
        if (!z10) {
        }
        return z10;
    }
}
