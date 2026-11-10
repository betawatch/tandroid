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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zl extends ViewGroup {
    public long D;
    public yl E;
    public xl F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final m.f3 M;
    public final wl N;
    public int O;
    public final /* synthetic */ am P;
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
    public zl(am amVar, Context context) {
        super(context);
        this.P = amVar;
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
        this.N = new wl(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, amVar.n, true);
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
            ArrayList arrayList2 = (ArrayList) ((yl) arrayList.get(i7)).k.f;
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
        am amVar = this.P;
        xl xlVar = amVar.J;
        PointF pointF = this.K;
        if (xlVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (amVar.K) {
            RectF f10 = xlVar.f(xlVar.e());
            RectF f11 = amVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, this.H, this.G / this.J);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + amVar.J.a.a + f11.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f12 = xlVar.f(xlVar.e());
        RectF f13 = amVar.J.f(1.0f);
        pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, amVar.D - ((amVar.G - 0.5f) * amVar.H), this.G);
        pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + amVar.J.a.a + f13.top, (amVar.E - ((amVar.F - 0.5f) * amVar.I)) + amVar.M, this.G);
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
            ArrayList arrayList2 = ((yl) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                xl xlVar = (xl) arrayList2.get(i10);
                xh.e eVar = xlVar.s;
                if (eVar != null) {
                    eVar.b(xlVar.O.z);
                    xlVar.s = null;
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
                yl ylVar = new yl(this);
                yl.a(ylVar, new ul(this.P, arrayList3), false);
                arrayList.add(ylVar);
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
            float b10 = ((yl) arrayList.get(i7)).b() + f10;
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
            i7 = (int) (((yl) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return t0Var.getMeasuredHeight() + i7;
    }

    public final void f(yl ylVar, org.telegram.messenger.gf gfVar, int i7) {
        ArrayList arrayList = (ArrayList) ylVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i7), gfVar);
        if (((ArrayList) ylVar.k.f).size() == 11) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) ((ArrayList) ylVar.k.f).get(10);
            ((ArrayList) ylVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(ylVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                yl ylVar2 = i10 == arrayList2.size() ? null : (yl) arrayList2.get(i10);
                if (ylVar2 == null) {
                    yl ylVar3 = new yl(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(gfVar2);
                    yl.a(ylVar3, new ul(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(ylVar2, gfVar2, 0);
                }
            }
        }
        yl.a(ylVar, ylVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList.get(i10);
            float b10 = ylVar.b();
            ylVar.a = f10;
            ylVar.b = i7;
            f10 += b10;
            i7 += ((ArrayList) ylVar.k.f).size();
        }
    }

    public final void h() {
        am amVar = this.P;
        ValueAnimator valueAnimator = amVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.G;
        this.J = f10;
        this.H = b10.x;
        this.I = b10.y;
        amVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        amVar.L = ofFloat;
        ofFloat.addUpdateListener(new vl(this, 1));
        amVar.L.addListener(new y5(this, 14));
        amVar.L.setDuration(200L);
        amVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        boolean z10;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        sl slVar = chatAttachAlertPhotoLayout.G;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        il ilVar = chatAttachAlertPhotoLayout.E;
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
            int childCount = ilVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = ilVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z12 = slVar.f;
                    boolean z13 = slVar.d;
                    if (z12 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z13 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (ciVar.N2 != 0 || ciVar.B1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        q5Var.d(e02, hashMap2.size() > 1, z13 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == slVar.b() - 1, ciVar.c2);
                        if ((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Q3) {
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
        int e10 = jg.g.e(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
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
            yl ylVar = (yl) arrayList.get(i7);
            if (((ArrayList) ylVar.k.f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) ylVar.k.f).size();
                yl ylVar2 = (yl) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) ylVar2.k.f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.gf) ((ArrayList) ylVar2.k.f).remove(0));
                }
                ((ArrayList) ylVar.k.f).addAll(arrayList2);
                yl.a(ylVar, ylVar.k, true);
                yl.a(ylVar2, ylVar2.k, true);
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
        xl xlVar;
        float f12 = this.n;
        am amVar = this.P;
        int computeVerticalScrollOffset = amVar.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - amVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f13 = f12;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            yl ylVar = (yl) arrayList2.get(i12);
            float b10 = ylVar.b();
            ylVar.a = f13;
            ylVar.b = i13;
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
                    i13 = ((ArrayList) ylVar.k.f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = ylVar.h;
            int i14 = ylVar.l;
            org.telegram.ui.ActionBar.u4 u4Var = ylVar.x;
            zl zlVar = ylVar.z;
            arrayList = arrayList2;
            float interpolation = ylVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - ylVar.c) / 200.0f));
            boolean z9 = interpolation < 1.0f;
            Point point = org.telegram.messenger.g0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(ylVar.f, ylVar.d, interpolation);
            int width = zlVar.getWidth();
            am amVar2 = zlVar.P;
            float previewScale = width * T1 * amVar2.getPreviewScale();
            boolean z10 = z9;
            float previewScale2 = amVar2.getPreviewScale() * org.telegram.messenger.g0.T1(ylVar.g, ylVar.e, interpolation) * max;
            if (u4Var != null) {
                f11 = 2.0f;
                ylVar.p = 0.0f;
                float width2 = zlVar.getWidth();
                float f16 = i14;
                ylVar.n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                ylVar.o = (Math.max(f16, previewScale) + zlVar.getWidth()) / 2.0f;
                ylVar.q = Math.max(i14 * 2, previewScale2);
                ylVar.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                u4Var.setBounds((int) ylVar.n, (int) ylVar.p, (int) ylVar.o, (int) ylVar.q);
                u4Var.setAlpha((int) ((ylVar.d <= 0.0f ? 1.0f - interpolation : ylVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                u4Var.d(canvas, ylVar.y, null);
                ylVar.p += f16;
                ylVar.n += f16;
                ylVar.q -= f16;
                ylVar.o -= f16;
            } else {
                f11 = 2.0f;
            }
            ylVar.r = ylVar.o - ylVar.n;
            ylVar.s = ylVar.q - ylVar.p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                xl xlVar2 = (xl) arrayList3.get(i15);
                if (xlVar2 != null && (((xlVar = amVar2.J) == null || xlVar.b != xlVar2.b) && xlVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = ylVar.w;
            RectF rectF = ylVar.t;
            long j3 = ylVar.i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (ylVar.u == null || ylVar.v != j3) {
                    ylVar.v = j3;
                    ylVar.u = new my0(bi.dd.a1(false, org.telegram.messenger.id.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + ylVar.u.c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f17 = ylVar.n;
                float f18 = ylVar.r;
                float f19 = f11;
                float A = com.google.android.recaptcha.internal.a.A(f18, L, f19, f17);
                i7 = size;
                float f20 = ylVar.p;
                i10 = i12;
                float f21 = ylVar.s;
                i11 = i13;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f21, L2, f19, f20), org.telegram.messenger.k5.a(f18, L, f19, f17), org.telegram.messenger.k5.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                my0 my0Var = ylVar.u;
                float L3 = org.telegram.messenger.g0.L(14.0f) + (((ylVar.r / f19) + ylVar.n) - (L / f19));
                float f23 = ylVar.p + (ylVar.s / f19);
                f10 = b10;
                my0Var.c(L3, f23, 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = ((ArrayList) ylVar.k.f).size() + i11;
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
        if (amVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (amVar.J.c(canvas, true)) {
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
            this.s = jg.g.e(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
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
        yl ylVar;
        xl xlVar;
        float f10;
        yl ylVar2;
        xl xlVar2;
        int action;
        boolean z9;
        xl xlVar3;
        int i7;
        org.telegram.ui.cn cnVar;
        xl xlVar4;
        ul ulVar;
        ArrayList arrayList;
        int i10;
        xl xlVar5;
        xl xlVar6;
        ValueAnimator valueAnimator;
        ul ulVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        am amVar = this.P;
        ci ciVar = amVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                ylVar = null;
                break;
            }
            ylVar = (yl) arrayList2.get(i14);
            float b10 = ylVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (ylVar != null) {
            ArrayList arrayList3 = ylVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                xlVar = (xl) arrayList3.get(i15);
                if (xlVar != null && xlVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        xlVar = null;
        xl xlVar7 = amVar.J;
        if (xlVar7 != null) {
            RectF f13 = xlVar7.f(xlVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            ylVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                yl ylVar3 = (yl) arrayList2.get(i16);
                float b12 = ylVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            ylVar2 = ylVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (ylVar2 != null) {
                ArrayList arrayList4 = ylVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                xlVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    xl xlVar8 = (xl) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (xlVar8 == null || xlVar8 == amVar.J) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (((ArrayList) ylVar2.k.f).contains(xlVar8.b)) {
                            RectF d = xlVar8.d();
                            int i19 = xlVar8.i;
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
                            if ((xlVar8.i & 8) > 0) {
                                d.bottom = ylVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    xlVar2 = xlVar8;
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
                if (action == 0 || amVar.J != null || amVar.r.I1 || (((valueAnimator = amVar.L) != null && valueAnimator.isRunning()) || ylVar == null || xlVar == null || (ulVar2 = ylVar.k) == null || !((ArrayList) ulVar2.f).contains(xlVar.b))) {
                    if (action == 2 || amVar.J == null || amVar.K) {
                        if (action == 1 || (xlVar5 = amVar.J) == null) {
                            if (action == 1 || amVar.J != null || (xlVar3 = this.F) == null || this.E == null) {
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
                            if (xlVar3.e && xlVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y11 = motionEvent.getY();
                                xlVar3.m = x11;
                                xlVar3.n = y11;
                                RectF d2 = xlVar3.d();
                                xlVar3.o = (float) Math.sqrt(Math.pow(d2.height(), 2.0d) + Math.pow(d2.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) c8.j9.a(xlVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(wq.j);
                                duration.addUpdateListener(new d6(xlVar3, 12));
                                duration.addListener(new y5(xlVar3, 15));
                                duration.start();
                            } else {
                                RectF d10 = xlVar3.d();
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
                                        yl ylVar4 = (yl) arrayList2.get(i21);
                                        if (ylVar4 != null && (ulVar = ylVar4.k) != null && (arrayList = (ArrayList) ulVar.f) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = ciVar.N2;
                                    org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                                    if (i22 != 0) {
                                        i7 = 1;
                                    } else if (f2Var instanceof org.telegram.ui.cn) {
                                        cnVar = (org.telegram.ui.cn) f2Var;
                                        i7 = 0;
                                        if (f2Var == null) {
                                            f2Var = LaunchActivity.Q();
                                        }
                                        if (!ciVar.W3.f0()) {
                                            org.telegram.messenger.g0.v1(f2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.g0.v1(ciVar.c.findFocus());
                                        }
                                        PhotoViewer.p1().H2(null, f2Var, amVar.a);
                                        PhotoViewer.p1().I2(ciVar);
                                        PhotoViewer p12 = PhotoViewer.p1();
                                        int i23 = ciVar.P3;
                                        boolean z10 = ciVar.Q3;
                                        p12.h = i23;
                                        p12.n = z10;
                                        this.N.a = arrayList6;
                                        PhotoViewer.p1().e2(new ArrayList(arrayList6), indexOf, i7, false, this.N, cnVar);
                                        amVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.V()) {
                                            PhotoViewer p13 = PhotoViewer.p1();
                                            Editable text = ciVar.a1().getText();
                                            p13.o7 = true;
                                            p13.p7 = text;
                                            xlVar4 = null;
                                            p13.x2(null, text, false, false);
                                            p13.q3(null);
                                            this.F = xlVar4;
                                            this.D = 0L;
                                            amVar.J = xlVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    cnVar = null;
                                    if (f2Var == null) {
                                    }
                                    if (!ciVar.W3.f0()) {
                                    }
                                    PhotoViewer.p1().H2(null, f2Var, amVar.a);
                                    PhotoViewer.p1().I2(ciVar);
                                    PhotoViewer p122 = PhotoViewer.p1();
                                    int i232 = ciVar.P3;
                                    boolean z102 = ciVar.Q3;
                                    p122.h = i232;
                                    p122.n = z102;
                                    this.N.a = arrayList6;
                                    PhotoViewer.p1().e2(new ArrayList(arrayList6), indexOf, i7, false, this.N, cnVar);
                                    amVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.V()) {
                                    }
                                } else if (amVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.gf gfVar = this.F.b;
                                    int indexOf2 = ((ArrayList) this.E.k.f).indexOf(gfVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.P;
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
                                        yl ylVar5 = this.E;
                                        ((ArrayList) ylVar5.k.f).remove(indexOf2);
                                        yl.a(ylVar5, ylVar5.k, true);
                                        j();
                                        i(amVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        amVar.x.k(0L, 82, gfVar, null, null, new ai.a1(this, ylVar5, gfVar, indexOf2, 20));
                                        postDelayed(new q2(this, i25, i20), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = amVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                xlVar4 = null;
                                this.F = xlVar4;
                                this.D = 0L;
                                amVar.J = xlVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (ylVar == null || xlVar == null || xlVar == xlVar5) {
                                if (ylVar2 == null || xlVar2 == null || xlVar2 == xlVar5 || xlVar2.b == xlVar5.b) {
                                    ylVar = null;
                                    xlVar = null;
                                } else {
                                    ylVar = ylVar2;
                                    xlVar = xlVar2;
                                }
                            }
                            if (ylVar != null) {
                                ArrayList arrayList8 = ylVar.h;
                                if (xlVar != null && xlVar != xlVar5) {
                                    int indexOf3 = ((ArrayList) xlVar5.a.k.f).indexOf(xlVar5.b);
                                    int indexOf4 = ((ArrayList) ylVar.k.f).indexOf(xlVar.b);
                                    if (indexOf3 >= 0) {
                                        ((ArrayList) amVar.J.a.k.f).remove(indexOf3);
                                        yl ylVar6 = amVar.J.a;
                                        yl.a(ylVar6, ylVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(ylVar) > arrayList2.indexOf(amVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(ylVar, amVar.J.b, indexOf4);
                                        if (amVar.J.a != ylVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    xlVar6 = null;
                                                    break;
                                                }
                                                xlVar6 = (xl) arrayList8.get(i26);
                                                if (xlVar6.b == amVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (xlVar6 != null) {
                                                g();
                                                xl xlVar9 = amVar.J;
                                                RectF rectF3 = xlVar6.g;
                                                yl ylVar7 = xlVar6.O;
                                                float f21 = xlVar9.j;
                                                RectF rectF4 = xlVar9.g;
                                                xlVar6.j = org.telegram.messenger.g0.T1(f21, xlVar9.k, xlVar9.e());
                                                if (xlVar6.f == null) {
                                                    xlVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = xlVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    org.telegram.messenger.g0.Z1(rectF6, rectF3, xlVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = xlVar9.f;
                                                if (rectF7 != null) {
                                                    org.telegram.messenger.g0.Z1(rectF7, rectF4, xlVar9.e(), xlVar6.f);
                                                    xlVar6.f.set(rectF5.centerX() - (((xlVar6.f.width() / f10) * xlVar9.a.r) / ylVar7.r), rectF5.centerY() - (((xlVar6.f.height() / f10) * xlVar9.a.s) / ylVar7.s), (((xlVar6.f.width() / f10) * xlVar9.a.r) / ylVar7.r) + rectF5.centerX(), (((xlVar6.f.height() / f10) * xlVar9.a.s) / ylVar7.s) + rectF5.centerY());
                                                } else {
                                                    xlVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * xlVar9.a.r) / ylVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * xlVar9.a.s) / ylVar7.s), (((rectF4.width() / f10) * xlVar9.a.r) / ylVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * xlVar9.a.s) / ylVar7.s) + rectF5.centerY());
                                                }
                                                xlVar6.j = org.telegram.messenger.g0.T1(xlVar6.j, xlVar6.k, xlVar6.e());
                                                xlVar6.h = SystemClock.elapsedRealtime();
                                                amVar.J = xlVar6;
                                                xlVar6.a = ylVar;
                                                xlVar6.j = 1.0f;
                                                xlVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        amVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(amVar.P, false);
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
                    amVar.D = x10;
                    amVar.E = y10;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(f3Var, 16L);
                    }
                    invalidate();
                } else {
                    this.E = ylVar;
                    this.F = xlVar;
                    amVar.D = x10;
                    amVar.E = y10;
                    amVar.J = null;
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
            ylVar2 = null;
        }
        xlVar2 = null;
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
