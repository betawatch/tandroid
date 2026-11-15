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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hm extends ViewGroup {
    public long E;
    public gm F;
    public fm G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final zj N;
    public final em O;
    public int P;
    public final /* synthetic */ im Q;
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
    public hm(im imVar, Context context) {
        super(context);
        this.Q = imVar;
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
        this.N = new zj(this, 1);
        this.O = new em(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, imVar.n, true);
        this.a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.hd.M0(2131753960, null));
        addView(t0Var);
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
            ArrayList arrayList2 = (ArrayList) ((gm) arrayList.get(i7)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i10);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(ffVar)) {
                        Object obj = hashMap.get(ffVar);
                        this.f.put(obj, ffVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i11);
                                Object value = entry.getValue();
                                if (value == ffVar) {
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
                                        if ((value2 instanceof org.telegram.messenger.ff) && (str = ((org.telegram.messenger.ff) value2).I) != null && ffVar != null && str.equals(ffVar.I)) {
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
        im imVar = this.Q;
        fm fmVar = imVar.K;
        PointF pointF = this.L;
        if (fmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (imVar.L) {
            RectF f10 = fmVar.f(fmVar.e());
            RectF f11 = imVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + imVar.K.a.a + f11.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF f12 = fmVar.f(fmVar.e());
        RectF f13 = imVar.K.f(1.0f);
        pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, imVar.E - ((imVar.H - 0.5f) * imVar.I), this.H);
        pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + imVar.K.a.a + f13.top, (imVar.F - ((imVar.G - 0.5f) * imVar.J)) + imVar.N, this.H);
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
            ArrayList arrayList2 = ((gm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                fm fmVar = (fm) arrayList2.get(i10);
                xh.e eVar = fmVar.s;
                if (eVar != null) {
                    eVar.b(fmVar.O.z);
                    fmVar.s = null;
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
            arrayList3.add((org.telegram.messenger.ff) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                gm gmVar = new gm(this);
                gm.a(gmVar, new cm(this.Q, arrayList3), false);
                arrayList.add(gmVar);
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
            float b10 = ((gm) arrayList.get(i7)).b() + f10;
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
            i7 = (int) (((gm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return t0Var.getMeasuredHeight() + i7;
    }

    public final void f(gm gmVar, org.telegram.messenger.ff ffVar, int i7) {
        ArrayList arrayList = (ArrayList) gmVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i7), ffVar);
        if (((ArrayList) gmVar.k.f).size() == 11) {
            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) ((ArrayList) gmVar.k.f).get(10);
            ((ArrayList) gmVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(gmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                gm gmVar2 = i10 == arrayList2.size() ? null : (gm) arrayList2.get(i10);
                if (gmVar2 == null) {
                    gm gmVar3 = new gm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(ffVar2);
                    gm.a(gmVar3, new cm(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(gmVar2, ffVar2, 0);
                }
            }
        }
        gm.a(gmVar, gmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            gm gmVar = (gm) arrayList.get(i10);
            float b10 = gmVar.b();
            gmVar.a = f10;
            gmVar.b = i7;
            f10 += b10;
            i7 += ((ArrayList) gmVar.k.f).size();
        }
    }

    public final void h() {
        im imVar = this.Q;
        ValueAnimator valueAnimator = imVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        imVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        imVar.M = ofFloat;
        ofFloat.addUpdateListener(new dm(this, 1));
        imVar.M.addListener(new x5(this, 14));
        imVar.M.setDuration(200L);
        imVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        am amVar = chatAttachAlertPhotoLayout.H;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        ql qlVar = chatAttachAlertPhotoLayout.F;
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
            int childCount = qlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = amVar.f;
                    boolean z14 = amVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (kiVar.O2 != 0 || kiVar.C1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        q5Var.d(e02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, R == amVar.b() - 1, kiVar.d2);
                        if ((kiVar.a2 instanceof org.telegram.ui.an) && kiVar.R3) {
                            z11 = false;
                            q5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z11 = false;
                            q5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
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
            this.Q.b.K1(1);
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
            gm gmVar = (gm) arrayList.get(i7);
            if (((ArrayList) gmVar.k.f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) gmVar.k.f).size();
                gm gmVar2 = (gm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) gmVar2.k.f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ff) ((ArrayList) gmVar2.k.f).remove(0));
                }
                ((ArrayList) gmVar.k.f).addAll(arrayList2);
                gm.a(gmVar, gmVar.k, true);
                gm.a(gmVar2, gmVar2.k, true);
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
        fm fmVar;
        float f12 = this.n;
        im imVar = this.Q;
        int computeVerticalScrollOffset = imVar.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - imVar.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - imVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f13 = f12;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            gm gmVar = (gm) arrayList2.get(i12);
            float b10 = gmVar.b();
            gmVar.a = f13;
            gmVar.b = i13;
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
                    i13 = ((ArrayList) gmVar.k.f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = gmVar.h;
            int i14 = gmVar.l;
            org.telegram.ui.ActionBar.r4 r4Var = gmVar.x;
            hm hmVar = gmVar.z;
            arrayList = arrayList2;
            float interpolation = gmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - gmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = org.telegram.messenger.g0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(gmVar.f, gmVar.d, interpolation);
            int width = hmVar.getWidth();
            im imVar2 = hmVar.Q;
            float previewScale = width * T1 * imVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = imVar2.getPreviewScale() * org.telegram.messenger.g0.T1(gmVar.g, gmVar.e, interpolation) * max;
            if (r4Var != null) {
                f11 = 2.0f;
                gmVar.p = 0.0f;
                float width2 = hmVar.getWidth();
                float f16 = i14;
                gmVar.n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                gmVar.o = (Math.max(f16, previewScale) + hmVar.getWidth()) / 2.0f;
                gmVar.q = Math.max(i14 * 2, previewScale2);
                gmVar.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                r4Var.setBounds((int) gmVar.n, (int) gmVar.p, (int) gmVar.o, (int) gmVar.q);
                r4Var.setAlpha((int) ((gmVar.d <= 0.0f ? 1.0f - interpolation : gmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                r4Var.d(canvas, gmVar.y, null);
                gmVar.p += f16;
                gmVar.n += f16;
                gmVar.q -= f16;
                gmVar.o -= f16;
            } else {
                f11 = 2.0f;
            }
            gmVar.r = gmVar.o - gmVar.n;
            gmVar.s = gmVar.q - gmVar.p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                fm fmVar2 = (fm) arrayList3.get(i15);
                if (fmVar2 != null && (((fmVar = imVar2.K) == null || fmVar.b != fmVar2.b) && fmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = gmVar.w;
            RectF rectF = gmVar.t;
            long j3 = gmVar.i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (gmVar.u == null || gmVar.v != j3) {
                    gmVar.v = j3;
                    gmVar.u = new oy0(di.lb.a1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + gmVar.u.c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f17 = gmVar.n;
                float f18 = gmVar.r;
                float f19 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f18, L, f19, f17);
                i7 = size;
                float f20 = gmVar.p;
                i10 = i12;
                float f21 = gmVar.s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f21, L2, f19, f20), org.telegram.messenger.k5.a(f18, L, f19, f17), org.telegram.messenger.k5.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                oy0 oy0Var = gmVar.u;
                float L3 = org.telegram.messenger.g0.L(14.0f) + (((gmVar.r / f19) + gmVar.n) - (L / f19));
                float f23 = gmVar.p + (gmVar.s / f19);
                f10 = b10;
                oy0Var.c(L3, f23, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = ((ArrayList) gmVar.k.f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.j0(f13, t0Var.getMeasuredHeight());
        if (t0Var.T()) {
            t0Var.H(canvas, true);
            t0Var.K(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (imVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (imVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = i5.c.d(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:118|(1:120)|(4:122|(1:124)|125|(3:127|(1:(2:129|(1:132)(1:131))(2:151|152))|(10:134|(1:136)|137|(1:139)(1:150)|140|(1:142)(1:149)|143|144|145|146)))|153|144|145|146) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gm gmVar;
        fm fmVar;
        float f10;
        gm gmVar2;
        fm fmVar2;
        int action;
        boolean z10;
        fm fmVar3;
        int i7;
        org.telegram.ui.an anVar;
        fm fmVar4;
        cm cmVar;
        ArrayList arrayList;
        int i10;
        fm fmVar5;
        int i11;
        int i12;
        fm fmVar6;
        ValueAnimator valueAnimator;
        cm cmVar2;
        int i13;
        int i14;
        int i15;
        float f11;
        im imVar = this.Q;
        ki kiVar = imVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i16 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i16 >= size) {
                gmVar = null;
                break;
            }
            gmVar = (gm) arrayList2.get(i16);
            float b10 = gmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i16++;
        }
        if (gmVar != null) {
            ArrayList arrayList3 = gmVar.h;
            int size2 = arrayList3.size();
            for (int i17 = 0; i17 < size2; i17++) {
                fmVar = (fm) arrayList3.get(i17);
                if (fmVar != null && fmVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        fmVar = null;
        fm fmVar7 = imVar.K;
        if (fmVar7 != null) {
            RectF f13 = fmVar7.f(fmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i18 = 0;
            gmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i18 < size) {
                gm gmVar3 = (gm) arrayList2.get(i18);
                float b12 = gmVar3.b() + f16;
                int i19 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            gmVar2 = gmVar3;
                        }
                    }
                }
                i18++;
                f16 = b12;
                size = i19;
            }
            if (gmVar2 != null) {
                ArrayList arrayList4 = gmVar2.h;
                int size3 = arrayList4.size();
                int i20 = 0;
                fmVar2 = null;
                float f19 = 0.0f;
                while (i20 < size3) {
                    fm fmVar8 = (fm) arrayList4.get(i20);
                    ArrayList arrayList5 = arrayList4;
                    if (fmVar8 == null || fmVar8 == imVar.K) {
                        i13 = size3;
                    } else {
                        i13 = size3;
                        if (((ArrayList) gmVar2.k.f).contains(fmVar8.b)) {
                            RectF d = fmVar8.d();
                            int i21 = fmVar8.i;
                            if ((i21 & 4) > 0) {
                                i15 = i21;
                                f11 = 0.0f;
                                d.top = 0.0f;
                            } else {
                                i15 = i21;
                                f11 = 0.0f;
                            }
                            if ((i15 & 1) > 0) {
                                d.left = f11;
                            }
                            if ((i15 & 2) > 0) {
                                d.right = getWidth();
                            }
                            if ((fmVar8.i & 8) > 0) {
                                d.bottom = gmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i14 = i20;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    fmVar2 = fmVar8;
                                }
                                i20 = i14 + 1;
                                arrayList4 = arrayList5;
                                size3 = i13;
                            }
                        }
                    }
                    i14 = i20;
                    i20 = i14 + 1;
                    arrayList4 = arrayList5;
                    size3 = i13;
                }
                action = motionEvent.getAction();
                zj zjVar = this.N;
                if (action == 0 || imVar.K != null || imVar.r.J1 || (((valueAnimator = imVar.M) != null && valueAnimator.isRunning()) || gmVar == null || fmVar == null || (cmVar2 = gmVar.k) == null || !((ArrayList) cmVar2.f).contains(fmVar.b))) {
                    if (action == 2 || imVar.K == null || imVar.L) {
                        if (action == 1 || (fmVar5 = imVar.K) == null) {
                            if (action == 1 || imVar.K != null || (fmVar3 = this.G) == null || this.F == null) {
                                z10 = false;
                                i10 = 1;
                                if (action != i10 || action == 3) {
                                    this.E = 0L;
                                    removeCallbacks(zjVar);
                                    this.M = false;
                                    if (!z10) {
                                        h();
                                        return i10;
                                    }
                                }
                                return z10;
                            }
                            if (fmVar3.e && fmVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y11 = motionEvent.getY();
                                fmVar3.m = x11;
                                fmVar3.n = y11;
                                RectF d2 = fmVar3.d();
                                fmVar3.o = (float) Math.sqrt(Math.pow(d2.height(), 2.0d) + Math.pow(d2.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) c8.i9.a(fmVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(er.j);
                                duration.addUpdateListener(new c6(fmVar3, 12));
                                duration.addListener(new x5(fmVar3, 15));
                                duration.start();
                            } else {
                                RectF d10 = fmVar3.d();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float L = d10.right - org.telegram.messenger.g0.L(36.4f);
                                float f20 = this.F.p + d10.top;
                                rectF2.set(L, f20, d10.right, org.telegram.messenger.g0.L(36.4f) + f20);
                                if (!rectF2.contains(x10, y10 - this.G.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i22 = 0; i22 < size4; i22++) {
                                        gm gmVar4 = (gm) arrayList2.get(i22);
                                        if (gmVar4 != null && (cmVar = gmVar4.k) != null && (arrayList = (ArrayList) cmVar.f) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.G.b);
                                    int i23 = kiVar.O2;
                                    org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
                                    if (i23 != 0) {
                                        i7 = 1;
                                    } else if (e2Var instanceof org.telegram.ui.an) {
                                        anVar = (org.telegram.ui.an) e2Var;
                                        i7 = 0;
                                        if (e2Var == null) {
                                            e2Var = LaunchActivity.Q();
                                        }
                                        if (!kiVar.X3.g0()) {
                                            org.telegram.messenger.g0.v1(e2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.g0.v1(kiVar.c.findFocus());
                                        }
                                        PhotoViewer.p1().I2(null, e2Var, imVar.a);
                                        PhotoViewer.p1().J2(kiVar);
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i24 = kiVar.Q3;
                                        boolean z11 = kiVar.R3;
                                        p12.h = i24;
                                        p12.n = z11;
                                        this.O.a = arrayList6;
                                        PhotoViewer.p1().f2(new ArrayList(arrayList6), indexOf, i7, false, this.O, anVar);
                                        imVar.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.W()) {
                                            PhotoViewer p13 = PhotoViewer.p1();
                                            Editable text = kiVar.a1().getText();
                                            p13.p7 = true;
                                            p13.q7 = text;
                                            fmVar4 = null;
                                            p13.y2(null, text, false, false);
                                            p13.r3(null);
                                            this.G = fmVar4;
                                            this.E = 0L;
                                            imVar.K = fmVar4;
                                            this.H = 0.0f;
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    anVar = null;
                                    if (e2Var == null) {
                                    }
                                    if (!kiVar.X3.g0()) {
                                    }
                                    PhotoViewer.p1().I2(null, e2Var, imVar.a);
                                    PhotoViewer.p1().J2(kiVar);
                                    PhotoViewer p122 = PhotoViewer.p1();
                                    int i242 = kiVar.Q3;
                                    boolean z112 = kiVar.R3;
                                    p122.h = i242;
                                    p122.n = z112;
                                    this.O.a = arrayList6;
                                    PhotoViewer.p1().f2(new ArrayList(arrayList6), indexOf, i7, false, this.O, anVar);
                                    imVar.Q.getClass();
                                    if (ChatAttachAlertPhotoLayout.W()) {
                                    }
                                } else if (imVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.ff ffVar = this.G.b;
                                    int indexOf2 = ((ArrayList) this.F.k.f).indexOf(ffVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.Q;
                                        if (chatAttachAlertPhotoLayout != null) {
                                            ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                            int size5 = arrayList7.size();
                                            int i25 = 0;
                                            while (true) {
                                                if (i25 >= size5) {
                                                    break;
                                                }
                                                if (((Map.Entry) arrayList7.get(i25)).getValue() == ffVar) {
                                                    this.c.put(ffVar, ((Map.Entry) arrayList7.get(i25)).getKey());
                                                    break;
                                                }
                                                i25++;
                                            }
                                        }
                                        gm gmVar5 = this.F;
                                        ((ArrayList) gmVar5.k.f).remove(indexOf2);
                                        gm.a(gmVar5, gmVar5.k, true);
                                        j();
                                        i(imVar.Q, false);
                                        int i26 = this.P + 1;
                                        this.P = i26;
                                        imVar.x.k(0L, 82, ffVar, null, null, new ci.p0(this, gmVar5, ffVar, indexOf2, 20));
                                        postDelayed(new a2(this, i26, 7), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = imVar.M;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                fmVar4 = null;
                                this.G = fmVar4;
                                this.E = 0L;
                                imVar.K = fmVar4;
                                this.H = 0.0f;
                            }
                        } else {
                            if (gmVar == null || fmVar == null || fmVar == fmVar5) {
                                if (gmVar2 == null || fmVar2 == null || fmVar2 == fmVar5 || fmVar2.b == fmVar5.b) {
                                    gmVar = null;
                                    fmVar = null;
                                } else {
                                    gmVar = gmVar2;
                                    fmVar = fmVar2;
                                }
                            }
                            if (gmVar != null) {
                                ArrayList arrayList8 = gmVar.h;
                                if (fmVar != null && fmVar != fmVar5) {
                                    int indexOf3 = ((ArrayList) fmVar5.a.k.f).indexOf(fmVar5.b);
                                    int indexOf4 = ((ArrayList) gmVar.k.f).indexOf(fmVar.b);
                                    if (indexOf3 >= 0) {
                                        ((ArrayList) imVar.K.a.k.f).remove(indexOf3);
                                        gm gmVar6 = imVar.K.a;
                                        gm.a(gmVar6, gmVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(gmVar) > arrayList2.indexOf(imVar.K.a)) {
                                            indexOf4++;
                                        }
                                        f(gmVar, imVar.K.b, indexOf4);
                                        if (imVar.K.a != gmVar) {
                                            int size6 = arrayList8.size();
                                            int i27 = 0;
                                            while (true) {
                                                if (i27 >= size6) {
                                                    fmVar6 = null;
                                                    break;
                                                }
                                                fmVar6 = (fm) arrayList8.get(i27);
                                                if (fmVar6.b == imVar.K.b) {
                                                    break;
                                                }
                                                i27++;
                                            }
                                            if (fmVar6 != null) {
                                                g();
                                                fm fmVar9 = imVar.K;
                                                RectF rectF3 = fmVar6.g;
                                                gm gmVar7 = fmVar6.O;
                                                float f21 = fmVar9.j;
                                                RectF rectF4 = fmVar9.g;
                                                fmVar6.j = org.telegram.messenger.g0.T1(f21, fmVar9.k, fmVar9.e());
                                                if (fmVar6.f == null) {
                                                    fmVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = fmVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    org.telegram.messenger.g0.Z1(rectF6, rectF3, fmVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = fmVar9.f;
                                                if (rectF7 != null) {
                                                    org.telegram.messenger.g0.Z1(rectF7, rectF4, fmVar9.e(), fmVar6.f);
                                                    fmVar6.f.set(rectF5.centerX() - (((fmVar6.f.width() / f10) * fmVar9.a.r) / gmVar7.r), rectF5.centerY() - (((fmVar6.f.height() / f10) * fmVar9.a.s) / gmVar7.s), (((fmVar6.f.width() / f10) * fmVar9.a.r) / gmVar7.r) + rectF5.centerX(), (((fmVar6.f.height() / f10) * fmVar9.a.s) / gmVar7.s) + rectF5.centerY());
                                                } else {
                                                    fmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * fmVar9.a.r) / gmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * fmVar9.a.s) / gmVar7.s), (((rectF4.width() / f10) * fmVar9.a.r) / gmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * fmVar9.a.s) / gmVar7.s) + rectF5.centerY());
                                                }
                                                fmVar6.j = org.telegram.messenger.g0.T1(fmVar6.j, fmVar6.k, fmVar6.e());
                                                fmVar6.h = SystemClock.elapsedRealtime();
                                                imVar.K = fmVar6;
                                                fmVar6.a = gmVar;
                                                fmVar6.j = 1.0f;
                                                fmVar6.k = 1.0f;
                                                g();
                                                i12 = 7;
                                                i11 = 2;
                                                imVar.performHapticFeedback(i12, i11);
                                                j();
                                                i(imVar.Q, false);
                                            }
                                        }
                                    }
                                    i11 = 2;
                                    i12 = 7;
                                    imVar.performHapticFeedback(i12, i11);
                                    j();
                                    i(imVar.Q, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        if (action != i10) {
                        }
                        this.E = 0L;
                        removeCallbacks(zjVar);
                        this.M = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    imVar.E = x10;
                    imVar.F = y10;
                    if (!this.M) {
                        this.M = true;
                        postDelayed(zjVar, 16L);
                    }
                    invalidate();
                } else {
                    this.F = gmVar;
                    this.G = fmVar;
                    imVar.E = x10;
                    imVar.F = y10;
                    imVar.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    org.telegram.messenger.g0.i3(new bi.m1(this, elapsedRealtime, this.G, 23), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i10 = 1;
                if (action != i10) {
                }
                this.E = 0L;
                removeCallbacks(zjVar);
                this.M = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f10 = 2.0f;
            gmVar2 = null;
        }
        fmVar2 = null;
        action = motionEvent.getAction();
        zj zjVar2 = this.N;
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
        removeCallbacks(zjVar2);
        this.M = false;
        if (!z10) {
        }
        return z10;
    }
}
