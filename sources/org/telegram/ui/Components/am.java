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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class am extends ViewGroup {
    public long D;
    public zl E;
    public yl F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final m.f3 M;
    public final xl N;
    public int O;
    public final /* synthetic */ bm P;
    public final org.telegram.ui.Cells.t0 a;
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
    public am(bm bmVar, Context context) {
        super(context);
        this.P = bmVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = org.telegram.messenger.g0.L(16.0f);
        this.r = org.telegram.messenger.g0.L(64.0f);
        this.s = 0;
        this.y = null;
        this.D = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new m.f3(this, 28);
        this.N = new xl(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, bmVar.n, true);
        this.a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.id.M0(2131753960, null));
        addView(t0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((zl) arrayList.get(i7)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i10);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(gfVar)) {
                        Object obj = hashMap.get(gfVar);
                        this.f.put(obj, gfVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i11);
                                Object value = entry.getValue();
                                if (value == gfVar) {
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
                                        if ((value2 instanceof org.telegram.messenger.gf) && (str = ((org.telegram.messenger.gf) value2).I) != null && gfVar != null && str.equals(gfVar.I)) {
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
        bm bmVar = this.P;
        yl ylVar = bmVar.J;
        PointF pointF = this.K;
        if (ylVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (bmVar.K) {
            RectF f10 = ylVar.f(ylVar.e());
            RectF f11 = bmVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, this.H, this.G / this.J);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + bmVar.J.a.a + f11.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f12 = ylVar.f(ylVar.e());
        RectF f13 = bmVar.J.f(1.0f);
        pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, bmVar.D - ((bmVar.G - 0.5f) * bmVar.H), this.G);
        pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + bmVar.J.a.a + f13.top, (bmVar.E - ((bmVar.F - 0.5f) * bmVar.I)) + bmVar.M, this.G);
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
            ArrayList arrayList2 = ((zl) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                yl ylVar = (yl) arrayList2.get(i10);
                xh.e eVar = ylVar.s;
                if (eVar != null) {
                    eVar.b(ylVar.O.z);
                    ylVar.s = null;
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
            arrayList3.add((org.telegram.messenger.gf) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                zl zlVar = new zl(this);
                zl.a(zlVar, new vl(this.P, arrayList3), false);
                arrayList.add(zlVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.n;
        int computeVerticalScrollOffset = this.P.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.x = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((zl) arrayList.get(i7)).b() + f10;
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
            i7 = (int) (((zl) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return t0Var.getMeasuredHeight() + i7;
    }

    public final void f(zl zlVar, org.telegram.messenger.gf gfVar, int i7) {
        ArrayList arrayList = (ArrayList) zlVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i7), gfVar);
        if (((ArrayList) zlVar.k.f).size() == 11) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) ((ArrayList) zlVar.k.f).get(10);
            ((ArrayList) zlVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(zlVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                zl zlVar2 = i10 == arrayList2.size() ? null : (zl) arrayList2.get(i10);
                if (zlVar2 == null) {
                    zl zlVar3 = new zl(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(gfVar2);
                    zl.a(zlVar3, new vl(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(zlVar2, gfVar2, 0);
                }
            }
        }
        zl.a(zlVar, zlVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zl zlVar = (zl) arrayList.get(i10);
            float b10 = zlVar.b();
            zlVar.a = f10;
            zlVar.b = i7;
            f10 += b10;
            i7 += ((ArrayList) zlVar.k.f).size();
        }
    }

    public final void h() {
        bm bmVar = this.P;
        ValueAnimator valueAnimator = bmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.G;
        this.J = f10;
        this.H = b10.x;
        this.I = b10.y;
        bmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        bmVar.L = ofFloat;
        ofFloat.addUpdateListener(new wl(this, 1));
        bmVar.L.addListener(new z5(this, 14));
        bmVar.L.setDuration(200L);
        bmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        boolean z10;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        tl tlVar = chatAttachAlertPhotoLayout.G;
        di diVar = chatAttachAlertPhotoLayout.b;
        jl jlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z9) {
            boolean z11 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = jlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = jlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z12 = tlVar.f;
                    boolean z13 = tlVar.d;
                    if (z12 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z13 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (diVar.K2 != 0 || diVar.y1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        q5Var.d(e02, hashMap2.size() > 1, z13 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == tlVar.b() - 1, diVar.Z1);
                        if ((diVar.W1 instanceof org.telegram.ui.cn) && diVar.N3) {
                            z10 = false;
                            q5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z10 = false;
                            q5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = z11;
                }
                i7++;
                z11 = z10;
            }
        }
        if (size != this.h.size()) {
            this.P.b.K1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int e10 = jg.g.e(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != e10) {
            this.s = e10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            zl zlVar = (zl) arrayList.get(i7);
            if (((ArrayList) zlVar.k.f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) zlVar.k.f).size();
                zl zlVar2 = (zl) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) zlVar2.k.f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.gf) ((ArrayList) zlVar2.k.f).remove(0));
                }
                ((ArrayList) zlVar.k.f).addAll(arrayList2);
                zl.a(zlVar, zlVar.k, true);
                zl.a(zlVar2, zlVar2.k, true);
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
        yl ylVar;
        float f12 = this.n;
        bm bmVar = this.P;
        int computeVerticalScrollOffset = bmVar.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - bmVar.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - bmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f13 = f12;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            zl zlVar = (zl) arrayList2.get(i12);
            float b10 = zlVar.b();
            zlVar.a = f13;
            zlVar.b = i13;
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
                    i13 = ((ArrayList) zlVar.k.f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = zlVar.h;
            int i14 = zlVar.l;
            org.telegram.ui.ActionBar.t4 t4Var = zlVar.x;
            am amVar = zlVar.z;
            arrayList = arrayList2;
            float interpolation = zlVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - zlVar.c) / 200.0f));
            boolean z9 = interpolation < 1.0f;
            Point point = org.telegram.messenger.g0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(zlVar.f, zlVar.d, interpolation);
            int width = amVar.getWidth();
            bm bmVar2 = amVar.P;
            float previewScale = width * T1 * bmVar2.getPreviewScale();
            boolean z10 = z9;
            float previewScale2 = bmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(zlVar.g, zlVar.e, interpolation) * max;
            if (t4Var != null) {
                f11 = 2.0f;
                zlVar.p = 0.0f;
                float width2 = amVar.getWidth();
                float f16 = i14;
                zlVar.n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                zlVar.o = (Math.max(f16, previewScale) + amVar.getWidth()) / 2.0f;
                zlVar.q = Math.max(i14 * 2, previewScale2);
                zlVar.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                t4Var.setBounds((int) zlVar.n, (int) zlVar.p, (int) zlVar.o, (int) zlVar.q);
                t4Var.setAlpha((int) ((zlVar.d <= 0.0f ? 1.0f - interpolation : zlVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                t4Var.d(canvas, zlVar.y, null);
                zlVar.p += f16;
                zlVar.n += f16;
                zlVar.q -= f16;
                zlVar.o -= f16;
            } else {
                f11 = 2.0f;
            }
            zlVar.r = zlVar.o - zlVar.n;
            zlVar.s = zlVar.q - zlVar.p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                yl ylVar2 = (yl) arrayList3.get(i15);
                if (ylVar2 != null && (((ylVar = bmVar2.J) == null || ylVar.b != ylVar2.b) && ylVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = zlVar.w;
            RectF rectF = zlVar.t;
            long j3 = zlVar.i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (zlVar.u == null || zlVar.v != j3) {
                    zlVar.v = j3;
                    zlVar.u = new ny0(bi.dd.a1(false, org.telegram.messenger.id.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + zlVar.u.c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f17 = zlVar.n;
                float f18 = zlVar.r;
                float f19 = f11;
                float A = com.google.android.recaptcha.internal.a.A(f18, L, f19, f17);
                i7 = size;
                float f20 = zlVar.p;
                i10 = i12;
                float f21 = zlVar.s;
                i11 = i13;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f21, L2, f19, f20), org.telegram.messenger.k5.a(f18, L, f19, f17), org.telegram.messenger.k5.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                ny0 ny0Var = zlVar.u;
                float L3 = org.telegram.messenger.g0.L(14.0f) + (((zlVar.r / f19) + zlVar.n) - (L / f19));
                float f23 = zlVar.p + (zlVar.s / f19);
                f10 = b10;
                ny0Var.c(L3, f23, 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = ((ArrayList) zlVar.k.f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.i0(f13, t0Var.getMeasuredHeight());
        if (t0Var.Q()) {
            t0Var.E(canvas, true);
            t0Var.H(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (bmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (bmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = jg.g.e(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zl zlVar;
        yl ylVar;
        float f10;
        zl zlVar2;
        yl ylVar2;
        int action;
        boolean z9;
        yl ylVar3;
        int i7;
        org.telegram.ui.cn cnVar;
        yl ylVar4;
        vl vlVar;
        ArrayList arrayList;
        int i10;
        yl ylVar5;
        yl ylVar6;
        ValueAnimator valueAnimator;
        vl vlVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        bm bmVar = this.P;
        di diVar = bmVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                zlVar = null;
                break;
            }
            zlVar = (zl) arrayList2.get(i14);
            float b10 = zlVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (zlVar != null) {
            ArrayList arrayList3 = zlVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                ylVar = (yl) arrayList3.get(i15);
                if (ylVar != null && ylVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        ylVar = null;
        yl ylVar7 = bmVar.J;
        if (ylVar7 != null) {
            RectF f13 = ylVar7.f(ylVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            zlVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                zl zlVar3 = (zl) arrayList2.get(i16);
                float b12 = zlVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            zlVar2 = zlVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (zlVar2 != null) {
                ArrayList arrayList4 = zlVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                ylVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    yl ylVar8 = (yl) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (ylVar8 == null || ylVar8 == bmVar.J) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (((ArrayList) zlVar2.k.f).contains(ylVar8.b)) {
                            RectF d = ylVar8.d();
                            int i19 = ylVar8.i;
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
                            if ((ylVar8.i & 8) > 0) {
                                d.bottom = zlVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    ylVar2 = ylVar8;
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
                m.f3 f3Var = this.M;
                if (action == 0 || bmVar.J != null || bmVar.r.I1 || (((valueAnimator = bmVar.L) != null && valueAnimator.isRunning()) || zlVar == null || ylVar == null || (vlVar2 = zlVar.k) == null || !((ArrayList) vlVar2.f).contains(ylVar.b))) {
                    if (action == 2 || bmVar.J == null || bmVar.K) {
                        if (action == 1 || (ylVar5 = bmVar.J) == null) {
                            if (action == 1 || bmVar.J != null || (ylVar3 = this.F) == null || this.E == null) {
                                z9 = false;
                                i10 = 1;
                                if (action != i10 || action == 3) {
                                    this.D = 0L;
                                    removeCallbacks(f3Var);
                                    this.L = false;
                                    if (!z9) {
                                        h();
                                        return i10;
                                    }
                                }
                                return z9;
                            }
                            if (ylVar3.e && ylVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y11 = motionEvent.getY();
                                ylVar3.m = x11;
                                ylVar3.n = y11;
                                RectF d2 = ylVar3.d();
                                ylVar3.o = (float) Math.sqrt(Math.pow(d2.height(), 2.0d) + Math.pow(d2.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) c8.j9.a(ylVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(xq.j);
                                duration.addUpdateListener(new e6(ylVar3, 12));
                                duration.addListener(new z5(ylVar3, 15));
                                duration.start();
                            } else {
                                RectF d10 = ylVar3.d();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float L = d10.right - org.telegram.messenger.g0.L(36.4f);
                                float f20 = this.E.p + d10.top;
                                rectF2.set(L, f20, d10.right, org.telegram.messenger.g0.L(36.4f) + f20);
                                boolean contains = rectF2.contains(x10, y10 - this.F.a.a);
                                int i20 = 4;
                                if (!contains) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        zl zlVar4 = (zl) arrayList2.get(i21);
                                        if (zlVar4 != null && (vlVar = zlVar4.k) != null && (arrayList = (ArrayList) vlVar.f) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = diVar.K2;
                                    org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
                                    if (i22 != 0) {
                                        i7 = 1;
                                    } else if (f2Var instanceof org.telegram.ui.cn) {
                                        cnVar = (org.telegram.ui.cn) f2Var;
                                        i7 = 0;
                                        if (f2Var == null) {
                                            f2Var = LaunchActivity.Q();
                                        }
                                        if (!diVar.T3.f0()) {
                                            org.telegram.messenger.g0.v1(f2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.g0.v1(diVar.c.findFocus());
                                        }
                                        PhotoViewer.p1().H2(null, f2Var, bmVar.a);
                                        PhotoViewer.p1().I2(diVar);
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i23 = diVar.M3;
                                        boolean z10 = diVar.N3;
                                        p12.h = i23;
                                        p12.n = z10;
                                        this.N.a = arrayList6;
                                        PhotoViewer.p1().e2(new ArrayList(arrayList6), indexOf, i7, false, this.N, cnVar);
                                        bmVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.V()) {
                                            PhotoViewer p13 = PhotoViewer.p1();
                                            Editable text = diVar.a1().getText();
                                            p13.o7 = true;
                                            p13.p7 = text;
                                            ylVar4 = null;
                                            p13.x2(null, text, false, false);
                                            p13.q3(null);
                                            this.F = ylVar4;
                                            this.D = 0L;
                                            bmVar.J = ylVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    cnVar = null;
                                    if (f2Var == null) {
                                    }
                                    if (!diVar.T3.f0()) {
                                    }
                                    PhotoViewer.p1().H2(null, f2Var, bmVar.a);
                                    PhotoViewer.p1().I2(diVar);
                                    PhotoViewer p122 = PhotoViewer.p1();
                                    int i232 = diVar.M3;
                                    boolean z102 = diVar.N3;
                                    p122.h = i232;
                                    p122.n = z102;
                                    this.N.a = arrayList6;
                                    PhotoViewer.p1().e2(new ArrayList(arrayList6), indexOf, i7, false, this.N, cnVar);
                                    bmVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.V()) {
                                    }
                                } else if (bmVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.gf gfVar = this.F.b;
                                    int indexOf2 = ((ArrayList) this.E.k.f).indexOf(gfVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.P;
                                        if (chatAttachAlertPhotoLayout != null) {
                                            ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                            int size5 = arrayList7.size();
                                            int i24 = 0;
                                            while (true) {
                                                if (i24 >= size5) {
                                                    break;
                                                }
                                                if (((Map.Entry) arrayList7.get(i24)).getValue() == gfVar) {
                                                    this.c.put(gfVar, ((Map.Entry) arrayList7.get(i24)).getKey());
                                                    break;
                                                }
                                                i24++;
                                            }
                                        }
                                        zl zlVar5 = this.E;
                                        ((ArrayList) zlVar5.k.f).remove(indexOf2);
                                        zl.a(zlVar5, zlVar5.k, true);
                                        j();
                                        i(bmVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        bmVar.x.k(0L, 82, gfVar, null, null, new ai.a1(this, zlVar5, gfVar, indexOf2, 20));
                                        postDelayed(new r2(this, i25, i20), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = bmVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                ylVar4 = null;
                                this.F = ylVar4;
                                this.D = 0L;
                                bmVar.J = ylVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (zlVar == null || ylVar == null || ylVar == ylVar5) {
                                if (zlVar2 == null || ylVar2 == null || ylVar2 == ylVar5 || ylVar2.b == ylVar5.b) {
                                    zlVar = null;
                                    ylVar = null;
                                } else {
                                    zlVar = zlVar2;
                                    ylVar = ylVar2;
                                }
                            }
                            if (zlVar != null) {
                                ArrayList arrayList8 = zlVar.h;
                                if (ylVar != null && ylVar != ylVar5) {
                                    int indexOf3 = ((ArrayList) ylVar5.a.k.f).indexOf(ylVar5.b);
                                    int indexOf4 = ((ArrayList) zlVar.k.f).indexOf(ylVar.b);
                                    if (indexOf3 >= 0) {
                                        ((ArrayList) bmVar.J.a.k.f).remove(indexOf3);
                                        zl zlVar6 = bmVar.J.a;
                                        zl.a(zlVar6, zlVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(zlVar) > arrayList2.indexOf(bmVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(zlVar, bmVar.J.b, indexOf4);
                                        if (bmVar.J.a != zlVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    ylVar6 = null;
                                                    break;
                                                }
                                                ylVar6 = (yl) arrayList8.get(i26);
                                                if (ylVar6.b == bmVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (ylVar6 != null) {
                                                g();
                                                yl ylVar9 = bmVar.J;
                                                RectF rectF3 = ylVar6.g;
                                                zl zlVar7 = ylVar6.O;
                                                float f21 = ylVar9.j;
                                                RectF rectF4 = ylVar9.g;
                                                ylVar6.j = org.telegram.messenger.g0.T1(f21, ylVar9.k, ylVar9.e());
                                                if (ylVar6.f == null) {
                                                    ylVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = ylVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    org.telegram.messenger.g0.Z1(rectF6, rectF3, ylVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = ylVar9.f;
                                                if (rectF7 != null) {
                                                    org.telegram.messenger.g0.Z1(rectF7, rectF4, ylVar9.e(), ylVar6.f);
                                                    ylVar6.f.set(rectF5.centerX() - (((ylVar6.f.width() / f10) * ylVar9.a.r) / zlVar7.r), rectF5.centerY() - (((ylVar6.f.height() / f10) * ylVar9.a.s) / zlVar7.s), (((ylVar6.f.width() / f10) * ylVar9.a.r) / zlVar7.r) + rectF5.centerX(), (((ylVar6.f.height() / f10) * ylVar9.a.s) / zlVar7.s) + rectF5.centerY());
                                                } else {
                                                    ylVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * ylVar9.a.r) / zlVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * ylVar9.a.s) / zlVar7.s), (((rectF4.width() / f10) * ylVar9.a.r) / zlVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * ylVar9.a.s) / zlVar7.s) + rectF5.centerY());
                                                }
                                                ylVar6.j = org.telegram.messenger.g0.T1(ylVar6.j, ylVar6.k, ylVar6.e());
                                                ylVar6.h = SystemClock.elapsedRealtime();
                                                bmVar.J = ylVar6;
                                                ylVar6.a = zlVar;
                                                ylVar6.j = 1.0f;
                                                ylVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        bmVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(bmVar.P, false);
                                }
                            }
                            h();
                        }
                        z9 = true;
                        i10 = 1;
                        if (action != i10) {
                        }
                        this.D = 0L;
                        removeCallbacks(f3Var);
                        this.L = false;
                        if (!z9) {
                        }
                        return z9;
                    }
                    bmVar.D = x10;
                    bmVar.E = y10;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(f3Var, 16L);
                    }
                    invalidate();
                } else {
                    this.E = zlVar;
                    this.F = ylVar;
                    bmVar.D = x10;
                    bmVar.E = y10;
                    bmVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.D = elapsedRealtime;
                    org.telegram.messenger.g0.i3(new bi.d3(this, elapsedRealtime, this.F, 22), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z9 = true;
                i10 = 1;
                if (action != i10) {
                }
                this.D = 0L;
                removeCallbacks(f3Var);
                this.L = false;
                if (!z9) {
                }
                return z9;
            }
        } else {
            f10 = 2.0f;
            zlVar2 = null;
        }
        ylVar2 = null;
        action = motionEvent.getAction();
        m.f3 f3Var2 = this.M;
        if (action == 0) {
        }
        if (action == 2) {
        }
        if (action == 1) {
        }
        if (action == 1) {
        }
        z9 = false;
        i10 = 1;
        if (action != i10) {
        }
        this.D = 0L;
        removeCallbacks(f3Var2);
        this.L = false;
        if (!z9) {
        }
        return z9;
    }
}
