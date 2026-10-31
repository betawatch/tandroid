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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class im extends ViewGroup {
    public long D;
    public hm E;
    public gm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final mg.c2 M;
    public final fm N;
    public int O;
    public final /* synthetic */ jm P;
    public final org.telegram.ui.Cells.s0 a;
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
    public im(jm jmVar, Context context) {
        super(context);
        this.P = jmVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = org.telegram.messenger.i0.L(16.0f);
        this.r = org.telegram.messenger.i0.L(64.0f);
        this.s = 0;
        this.y = null;
        this.D = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new mg.c2(this, 26);
        this.N = new fm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, jmVar.n, true);
        this.a = s0Var;
        s0Var.setCustomText(org.telegram.messenger.cd.L0(2131753960, null));
        addView(s0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) ((hm) arrayList.get(i10)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i11);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(efVar)) {
                        Object obj = hashMap.get(efVar);
                        this.f.put(obj, efVar);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == efVar) {
                                    Object key = entry.getKey();
                                    this.f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ef) && (str = ((org.telegram.messenger.ef) value2).I) != null && efVar != null && str.equals(efVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i13++;
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
        jm jmVar = this.P;
        gm gmVar = jmVar.J;
        PointF pointF = this.K;
        if (gmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (jmVar.K) {
            RectF f7 = gmVar.f(gmVar.e());
            RectF f10 = jmVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.i0.T1((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = org.telegram.messenger.i0.T1((f7.height() / 2.0f) + jmVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = gmVar.f(gmVar.e());
        RectF f12 = jmVar.J.f(1.0f);
        pointF.x = org.telegram.messenger.i0.T1((f11.width() / 2.0f) + f12.left, jmVar.D - ((jmVar.G - 0.5f) * jmVar.H), this.G);
        pointF.y = org.telegram.messenger.i0.T1((f11.height() / 2.0f) + jmVar.J.a.a + f12.top, (jmVar.E - ((jmVar.F - 0.5f) * jmVar.I)) + jmVar.M, this.G);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((hm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                gm gmVar = (gm) arrayList2.get(i11);
                nh.h hVar = gmVar.s;
                if (hVar != null) {
                    hVar.b(gmVar.O.z);
                    gmVar.s = null;
                }
            }
            i10++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i12 = size - 1;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) this.h.get(i13);
            num.getClass();
            arrayList3.add((org.telegram.messenger.ef) this.d.get(num));
            if (i13 % 10 == 9 || i13 == i12) {
                hm hmVar = new hm(this);
                hm.a(hmVar, new dm(this.P, arrayList3), false);
                arrayList.add(hmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.n;
        int computeVerticalScrollOffset = this.P.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.x = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((hm) arrayList.get(i10)).b() + f7;
            float f10 = this.w;
            zArr[i10] = (f7 >= f10 && f7 <= this.x) || (b10 >= f10 && b10 <= this.x) || (f7 <= f10 && b10 >= this.x);
            i10++;
            f7 = b10;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i10 = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((hm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.s0 s0Var = this.a;
        if (s0Var.getMeasuredHeight() <= 0) {
            s0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return s0Var.getMeasuredHeight() + i10;
    }

    public final void f(hm hmVar, org.telegram.messenger.ef efVar, int i10) {
        ArrayList arrayList = (ArrayList) hmVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i10), efVar);
        if (((ArrayList) hmVar.k.f).size() == 11) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ((ArrayList) hmVar.k.f).get(10);
            ((ArrayList) hmVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(hmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                hm hmVar2 = i11 == arrayList2.size() ? null : (hm) arrayList2.get(i11);
                if (hmVar2 == null) {
                    hm hmVar3 = new hm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(efVar2);
                    hm.a(hmVar3, new dm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(hmVar2, efVar2, 0);
                }
            }
        }
        hm.a(hmVar, hmVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            hm hmVar = (hm) arrayList.get(i11);
            float b10 = hmVar.b();
            hmVar.a = f7;
            hmVar.b = i10;
            f7 += b10;
            i10 += ((ArrayList) hmVar.k.f).size();
        }
    }

    public final void h() {
        jm jmVar = this.P;
        ValueAnimator valueAnimator = jmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        jmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        jmVar.L = ofFloat;
        ofFloat.addUpdateListener(new em(this, 1));
        jmVar.L.addListener(new w5(this, 14));
        jmVar.L.setDuration(200L);
        jmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        bm bmVar = chatAttachAlertPhotoLayout.G;
        bi biVar = chatAttachAlertPhotoLayout.b;
        pl plVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z12 = false;
            chatAttachAlertPhotoLayout.z0(false);
            chatAttachAlertPhotoLayout.x0();
            int childCount = plVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = bmVar.f;
                    boolean z14 = bmVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    if (biVar.K2 != 0 || biVar.y1) {
                        v5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(R);
                    if (c02 != null) {
                        int i11 = c02.C;
                        v5Var.d(c02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == bmVar.b() - 1, biVar.Z1);
                        if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
                            z11 = false;
                            v5Var.b(arrayList2.indexOf(Integer.valueOf(i11)), hashMap2.containsKey(Integer.valueOf(i11)), false);
                        } else {
                            z11 = false;
                            v5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i11)), false);
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = z12;
                }
                i10++;
                z12 = z11;
            }
        }
        if (size != this.h.size()) {
            this.P.b.J1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int d = i0.a.d(45.0f, org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        if (this.s != d) {
            this.s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            hm hmVar = (hm) arrayList.get(i10);
            if (((ArrayList) hmVar.k.f).size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) hmVar.k.f).size();
                hm hmVar2 = (hm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) hmVar2.k.f).size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((org.telegram.messenger.ef) ((ArrayList) hmVar2.k.f).remove(0));
                }
                ((ArrayList) hmVar.k.f).addAll(arrayList2);
                hm.a(hmVar, hmVar.k, true);
                hm.a(hmVar2, hmVar2.k, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        float f10;
        gm gmVar;
        float f11 = this.n;
        jm jmVar = this.P;
        int computeVerticalScrollOffset = jmVar.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - jmVar.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - jmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            hm hmVar = (hm) arrayList2.get(i13);
            float b10 = hmVar.b();
            hmVar.a = f12;
            hmVar.b = i14;
            float f13 = this.w;
            if (f12 < f13 || f12 > this.x) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.x) && (f12 > f13 || f14 < this.x)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = ((ArrayList) hmVar.k.f).size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = hmVar.h;
            int i15 = hmVar.l;
            org.telegram.ui.ActionBar.c5 c5Var = hmVar.x;
            im imVar = hmVar.z;
            arrayList = arrayList2;
            float interpolation = hmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - hmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = org.telegram.messenger.i0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.i0.T1(hmVar.f, hmVar.d, interpolation);
            int width = imVar.getWidth();
            jm jmVar2 = imVar.P;
            float previewScale = width * T1 * jmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = jmVar2.getPreviewScale() * org.telegram.messenger.i0.T1(hmVar.g, hmVar.e, interpolation) * max;
            if (c5Var != null) {
                f10 = 2.0f;
                hmVar.p = 0.0f;
                float width2 = imVar.getWidth();
                float f15 = i15;
                hmVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                hmVar.o = (Math.max(f15, previewScale) + imVar.getWidth()) / 2.0f;
                hmVar.q = Math.max(i15 * 2, previewScale2);
                hmVar.x.q(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                c5Var.setBounds((int) hmVar.n, (int) hmVar.p, (int) hmVar.o, (int) hmVar.q);
                c5Var.setAlpha((int) ((hmVar.d <= 0.0f ? 1.0f - interpolation : hmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                c5Var.e(canvas, hmVar.y, null);
                hmVar.p += f15;
                hmVar.n += f15;
                hmVar.q -= f15;
                hmVar.o -= f15;
            } else {
                f10 = 2.0f;
            }
            hmVar.r = hmVar.o - hmVar.n;
            hmVar.s = hmVar.q - hmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                gm gmVar2 = (gm) arrayList3.get(i16);
                if (gmVar2 != null && (((gmVar = jmVar2.J) == null || gmVar.b != gmVar2.b) && gmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = hmVar.w;
            RectF rectF = hmVar.t;
            long j10 = hmVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (hmVar.u == null || hmVar.v != j10) {
                    hmVar.v = j10;
                    hmVar.u = new qz0(rh.h8.Z0(false, org.telegram.messenger.cd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                }
                float L = org.telegram.messenger.i0.L(28.0f) + hmVar.u.c;
                float L2 = org.telegram.messenger.i0.L(32.0f);
                float f16 = hmVar.n;
                float f17 = hmVar.r;
                float f18 = f10;
                float B = c3.i0.B(f17, L, f18, f16);
                i10 = size;
                float f19 = hmVar.p;
                i11 = i13;
                float f20 = hmVar.s;
                i12 = i14;
                rectF.set(B, c3.i0.B(f20, L2, f18, f19), org.telegram.messenger.m5.a(f17, L, f18, f16), org.telegram.messenger.m5.a(f20, L2, f18, f19));
                paint.setColor(1610612736);
                float f21 = L2 / f18;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                qz0 qz0Var = hmVar.u;
                float L3 = org.telegram.messenger.i0.L(14.0f) + (((hmVar.r / f18) + hmVar.n) - (L / f18));
                float f22 = hmVar.p + (hmVar.s / f18);
                f7 = b10;
                qz0Var.c(L3, f22, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = ((ArrayList) hmVar.k.f).size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.s0 s0Var = this.a;
        s0Var.g0(f12, s0Var.getMeasuredHeight());
        if (s0Var.R()) {
            s0Var.H(canvas, true);
            s0Var.J(canvas, true);
        }
        s0Var.draw(canvas);
        canvas.restore();
        if (jmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (jmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.s0 s0Var = this.a;
        s0Var.layout(0, 0, s0Var.getMeasuredWidth(), s0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = i0.a.d(45.0f, org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.s), TLObject.FLAG_30));
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
        hm hmVar;
        gm gmVar;
        float f7;
        hm hmVar2;
        gm gmVar2;
        int action;
        boolean z10;
        gm gmVar3;
        int i10;
        org.telegram.ui.un unVar;
        gm gmVar4;
        dm dmVar;
        ArrayList arrayList;
        int i11;
        gm gmVar5;
        gm gmVar6;
        ValueAnimator valueAnimator;
        dm dmVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        jm jmVar = this.P;
        bi biVar = jmVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                hmVar = null;
                break;
            }
            hmVar = (hm) arrayList2.get(i15);
            float b10 = hmVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (hmVar != null) {
            ArrayList arrayList3 = hmVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                gmVar = (gm) arrayList3.get(i16);
                if (gmVar != null && gmVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        gmVar = null;
        gm gmVar7 = jmVar.J;
        if (gmVar7 != null) {
            RectF f12 = gmVar7.f(gmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            hmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                hm hmVar3 = (hm) arrayList2.get(i17);
                float b12 = hmVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            hmVar2 = hmVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (hmVar2 != null) {
                ArrayList arrayList4 = hmVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                gmVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    gm gmVar8 = (gm) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (gmVar8 == null || gmVar8 == jmVar.J) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (((ArrayList) hmVar2.k.f).contains(gmVar8.b)) {
                            RectF d = gmVar8.d();
                            int i20 = gmVar8.i;
                            if ((i20 & 4) > 0) {
                                i14 = i20;
                                f10 = 0.0f;
                                d.top = 0.0f;
                            } else {
                                i14 = i20;
                                f10 = 0.0f;
                            }
                            if ((i14 & 1) > 0) {
                                d.left = f10;
                            }
                            if ((i14 & 2) > 0) {
                                d.right = getWidth();
                            }
                            if ((gmVar8.i & 8) > 0) {
                                d.bottom = hmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    gmVar2 = gmVar8;
                                }
                                i19 = i13 + 1;
                                arrayList4 = arrayList5;
                                size3 = i12;
                            }
                        }
                    }
                    i13 = i19;
                    i19 = i13 + 1;
                    arrayList4 = arrayList5;
                    size3 = i12;
                }
                action = motionEvent.getAction();
                mg.c2 c2Var = this.M;
                if (action == 0 || jmVar.J != null || jmVar.r.I1 || (((valueAnimator = jmVar.L) != null && valueAnimator.isRunning()) || hmVar == null || gmVar == null || (dmVar2 = hmVar.k) == null || !((ArrayList) dmVar2.f).contains(gmVar.b))) {
                    if (action == 2 || jmVar.J == null || jmVar.K) {
                        if (action == 1 || (gmVar5 = jmVar.J) == null) {
                            if (action == 1 || jmVar.J != null || (gmVar3 = this.F) == null || this.E == null) {
                                z10 = false;
                                i11 = 1;
                                if (action != i11 || action == 3) {
                                    this.D = 0L;
                                    removeCallbacks(c2Var);
                                    this.L = false;
                                    if (!z10) {
                                        h();
                                        return i11;
                                    }
                                }
                                return z10;
                            }
                            if (gmVar3.e && gmVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                gmVar3.m = x11;
                                gmVar3.n = y10;
                                RectF d10 = gmVar3.d();
                                gmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.u.a(gmVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(gr.j);
                                duration.addUpdateListener(new a6(gmVar3, 12));
                                duration.addListener(new w5(gmVar3, 15));
                                duration.start();
                            } else {
                                RectF d11 = gmVar3.d();
                                RectF rectF2 = org.telegram.messenger.i0.P;
                                float L = d11.right - org.telegram.messenger.i0.L(36.4f);
                                float f19 = this.E.p + d11.top;
                                rectF2.set(L, f19, d11.right, org.telegram.messenger.i0.L(36.4f) + f19);
                                if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        hm hmVar4 = (hm) arrayList2.get(i21);
                                        if (hmVar4 != null && (dmVar = hmVar4.k) != null && (arrayList = (ArrayList) dmVar.f) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = biVar.K2;
                                    org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                                    if (i22 != 0) {
                                        i10 = 1;
                                    } else if (k2Var instanceof org.telegram.ui.un) {
                                        unVar = (org.telegram.ui.un) k2Var;
                                        i10 = 0;
                                        if (k2Var == null) {
                                            k2Var = LaunchActivity.Q();
                                        }
                                        if (!biVar.T3.D()) {
                                            org.telegram.messenger.i0.v1(k2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.i0.v1(biVar.c.findFocus());
                                        }
                                        PhotoViewer.v1().N2(null, k2Var, jmVar.a);
                                        PhotoViewer.v1().O2(biVar);
                                        PhotoViewer v12 = PhotoViewer.v1();
                                        int i23 = biVar.M3;
                                        boolean z11 = biVar.N3;
                                        v12.h = i23;
                                        v12.n = z11;
                                        this.N.a = arrayList6;
                                        PhotoViewer.v1().j2(new ArrayList(arrayList6), indexOf, i10, false, this.N, unVar);
                                        jmVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.U()) {
                                            PhotoViewer v13 = PhotoViewer.v1();
                                            Editable text = biVar.Z0().getText();
                                            v13.p7 = true;
                                            v13.q7 = text;
                                            gmVar4 = null;
                                            v13.D2(null, text, false, false);
                                            v13.w3(null);
                                            this.F = gmVar4;
                                            this.D = 0L;
                                            jmVar.J = gmVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i10 = 4;
                                    }
                                    unVar = null;
                                    if (k2Var == null) {
                                    }
                                    if (!biVar.T3.D()) {
                                    }
                                    PhotoViewer.v1().N2(null, k2Var, jmVar.a);
                                    PhotoViewer.v1().O2(biVar);
                                    PhotoViewer v122 = PhotoViewer.v1();
                                    int i232 = biVar.M3;
                                    boolean z112 = biVar.N3;
                                    v122.h = i232;
                                    v122.n = z112;
                                    this.N.a = arrayList6;
                                    PhotoViewer.v1().j2(new ArrayList(arrayList6), indexOf, i10, false, this.N, unVar);
                                    jmVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.U()) {
                                    }
                                } else if (jmVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.ef efVar = this.F.b;
                                    int indexOf2 = ((ArrayList) this.E.k.f).indexOf(efVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.P;
                                        if (chatAttachAlertPhotoLayout != null) {
                                            ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                            int size5 = arrayList7.size();
                                            int i24 = 0;
                                            while (true) {
                                                if (i24 >= size5) {
                                                    break;
                                                }
                                                if (((Map.Entry) arrayList7.get(i24)).getValue() == efVar) {
                                                    this.c.put(efVar, ((Map.Entry) arrayList7.get(i24)).getKey());
                                                    break;
                                                }
                                                i24++;
                                            }
                                        }
                                        hm hmVar5 = this.E;
                                        ((ArrayList) hmVar5.k.f).remove(indexOf2);
                                        hm.a(hmVar5, hmVar5.k, true);
                                        j();
                                        i(jmVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        jmVar.x.k(0L, 82, efVar, null, null, new ag.g3(this, hmVar5, efVar, indexOf2, 15));
                                        postDelayed(new ag.d3(this, i25, 29), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = jmVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                gmVar4 = null;
                                this.F = gmVar4;
                                this.D = 0L;
                                jmVar.J = gmVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (hmVar == null || gmVar == null || gmVar == gmVar5) {
                                if (hmVar2 == null || gmVar2 == null || gmVar2 == gmVar5 || gmVar2.b == gmVar5.b) {
                                    hmVar = null;
                                    gmVar = null;
                                } else {
                                    hmVar = hmVar2;
                                    gmVar = gmVar2;
                                }
                            }
                            if (hmVar != null) {
                                ArrayList arrayList8 = hmVar.h;
                                if (gmVar != null && gmVar != gmVar5) {
                                    int indexOf3 = ((ArrayList) gmVar5.a.k.f).indexOf(gmVar5.b);
                                    int indexOf4 = ((ArrayList) hmVar.k.f).indexOf(gmVar.b);
                                    if (indexOf3 >= 0) {
                                        ((ArrayList) jmVar.J.a.k.f).remove(indexOf3);
                                        hm hmVar6 = jmVar.J.a;
                                        hm.a(hmVar6, hmVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(hmVar) > arrayList2.indexOf(jmVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(hmVar, jmVar.J.b, indexOf4);
                                        if (jmVar.J.a != hmVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    gmVar6 = null;
                                                    break;
                                                }
                                                gmVar6 = (gm) arrayList8.get(i26);
                                                if (gmVar6.b == jmVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (gmVar6 != null) {
                                                g();
                                                gm gmVar9 = jmVar.J;
                                                RectF rectF3 = gmVar6.g;
                                                hm hmVar7 = gmVar6.O;
                                                float f20 = gmVar9.j;
                                                RectF rectF4 = gmVar9.g;
                                                gmVar6.j = org.telegram.messenger.i0.T1(f20, gmVar9.k, gmVar9.e());
                                                if (gmVar6.f == null) {
                                                    gmVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = gmVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    org.telegram.messenger.i0.Z1(rectF6, rectF3, gmVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = gmVar9.f;
                                                if (rectF7 != null) {
                                                    org.telegram.messenger.i0.Z1(rectF7, rectF4, gmVar9.e(), gmVar6.f);
                                                    gmVar6.f.set(rectF5.centerX() - (((gmVar6.f.width() / f7) * gmVar9.a.r) / hmVar7.r), rectF5.centerY() - (((gmVar6.f.height() / f7) * gmVar9.a.s) / hmVar7.s), (((gmVar6.f.width() / f7) * gmVar9.a.r) / hmVar7.r) + rectF5.centerX(), (((gmVar6.f.height() / f7) * gmVar9.a.s) / hmVar7.s) + rectF5.centerY());
                                                } else {
                                                    gmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * gmVar9.a.r) / hmVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * gmVar9.a.s) / hmVar7.s), (((rectF4.width() / f7) * gmVar9.a.r) / hmVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * gmVar9.a.s) / hmVar7.s) + rectF5.centerY());
                                                }
                                                gmVar6.j = org.telegram.messenger.i0.T1(gmVar6.j, gmVar6.k, gmVar6.e());
                                                gmVar6.h = SystemClock.elapsedRealtime();
                                                jmVar.J = gmVar6;
                                                gmVar6.a = hmVar;
                                                gmVar6.j = 1.0f;
                                                gmVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        jmVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(jmVar.P, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i11 = 1;
                        if (action != i11) {
                        }
                        this.D = 0L;
                        removeCallbacks(c2Var);
                        this.L = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    jmVar.D = x10;
                    jmVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(c2Var, 16L);
                    }
                    invalidate();
                } else {
                    this.E = hmVar;
                    this.F = gmVar;
                    jmVar.D = x10;
                    jmVar.E = y3;
                    jmVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.D = elapsedRealtime;
                    org.telegram.messenger.i0.h3(new a3.i0(this, elapsedRealtime, this.F, 13), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i11 = 1;
                if (action != i11) {
                }
                this.D = 0L;
                removeCallbacks(c2Var);
                this.L = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f7 = 2.0f;
            hmVar2 = null;
        }
        gmVar2 = null;
        action = motionEvent.getAction();
        mg.c2 c2Var2 = this.M;
        if (action == 0) {
        }
        if (action == 2) {
        }
        if (action == 1) {
        }
        if (action == 1) {
        }
        z10 = false;
        i11 = 1;
        if (action != i11) {
        }
        this.D = 0L;
        removeCallbacks(c2Var2);
        this.L = false;
        if (!z10) {
        }
        return z10;
    }
}
