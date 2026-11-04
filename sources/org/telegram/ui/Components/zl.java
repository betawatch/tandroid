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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zl extends ViewGroup {
    public long E;
    public yl F;
    public xl G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final mi.b0 N;
    public final wl O;
    public int P;
    public final /* synthetic */ am Q;
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
        this.Q = amVar;
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
        this.N = new mi.b0(this, 27);
        this.O = new wl(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, amVar.n, true);
        this.a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.bd.M0(2131753960, null));
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
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList2 = (ArrayList) ((yl) arrayList.get(i3)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList2.get(i10);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(yeVar)) {
                        Object obj = hashMap.get(yeVar);
                        this.f.put(obj, yeVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i11);
                                Object value = entry.getValue();
                                if (value == yeVar) {
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
                                        if ((value2 instanceof org.telegram.messenger.ye) && (str = ((org.telegram.messenger.ye) value2).I) != null && yeVar != null && str.equals(yeVar.I)) {
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
        am amVar = this.Q;
        xl xlVar = amVar.K;
        PointF pointF = this.L;
        if (xlVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (amVar.L) {
            RectF f10 = xlVar.f(xlVar.e());
            RectF f11 = amVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + amVar.K.a.a + f11.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF f12 = xlVar.f(xlVar.e());
        RectF f13 = amVar.K.f(1.0f);
        pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, amVar.E - ((amVar.H - 0.5f) * amVar.I), this.H);
        pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + amVar.K.a.a + f13.top, (amVar.F - ((amVar.G - 0.5f) * amVar.J)) + amVar.N, this.H);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((yl) arrayList.get(i3)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                xl xlVar = (xl) arrayList2.get(i10);
                yh.e eVar = xlVar.s;
                if (eVar != null) {
                    eVar.b(xlVar.O.z);
                    xlVar.s = null;
                }
            }
            i3++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i11 = size - 1;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.h.get(i12);
            num.getClass();
            arrayList3.add((org.telegram.messenger.ye) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                yl ylVar = new yl(this);
                yl.a(ylVar, new ul(this.Q, arrayList3), false);
                arrayList.add(ylVar);
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
        int i3 = 0;
        while (i3 < size) {
            float b10 = ((yl) arrayList.get(i3)).b() + f10;
            float f11 = this.w;
            zArr[i3] = (f10 >= f11 && f10 <= this.x) || (b10 >= f11 && b10 <= this.x) || (f10 <= f11 && b10 >= this.x);
            i3++;
            f10 = b10;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i3 = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i3 = (int) (((yl) arrayList.get(i10)).b() + i3);
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return t0Var.getMeasuredHeight() + i3;
    }

    public final void f(yl ylVar, org.telegram.messenger.ye yeVar, int i3) {
        ArrayList arrayList = (ArrayList) ylVar.k.f;
        arrayList.add(Math.min(arrayList.size(), i3), yeVar);
        if (((ArrayList) ylVar.k.f).size() == 11) {
            org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) ((ArrayList) ylVar.k.f).get(10);
            ((ArrayList) ylVar.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(ylVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                yl ylVar2 = i10 == arrayList2.size() ? null : (yl) arrayList2.get(i10);
                if (ylVar2 == null) {
                    yl ylVar3 = new yl(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(yeVar2);
                    yl.a(ylVar3, new ul(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(ylVar2, yeVar2, 0);
                }
            }
        }
        yl.a(ylVar, ylVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList.get(i10);
            float b10 = ylVar.b();
            ylVar.a = f10;
            ylVar.b = i3;
            f10 += b10;
            i3 += ((ArrayList) ylVar.k.f).size();
        }
    }

    public final void h() {
        am amVar = this.Q;
        ValueAnimator valueAnimator = amVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        amVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        amVar.M = ofFloat;
        ofFloat.addUpdateListener(new vl(this, 1));
        amVar.M.addListener(new x5(this, 14));
        amVar.M.setDuration(200L);
        amVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        sl slVar = chatAttachAlertPhotoLayout.H;
        bi biVar = chatAttachAlertPhotoLayout.b;
        il ilVar = chatAttachAlertPhotoLayout.F;
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
            int childCount = ilVar.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = slVar.f;
                    boolean z14 = slVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (biVar.L2 != 0 || biVar.z1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        q5Var.d(e02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, R == slVar.b() - 1, biVar.a2);
                        if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
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
                i3++;
                z12 = z11;
            }
        }
        if (size != this.h.size()) {
            this.Q.b.K1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int d = k2.p1.d(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != d) {
            this.s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            yl ylVar = (yl) arrayList.get(i3);
            if (((ArrayList) ylVar.k.f).size() < 10 && i3 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) ylVar.k.f).size();
                yl ylVar2 = (yl) arrayList.get(i3 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) ylVar2.k.f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ye) ((ArrayList) ylVar2.k.f).remove(0));
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
        int i3;
        int i10;
        int i11;
        float f11;
        xl xlVar;
        float f12 = this.n;
        am amVar = this.Q;
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
                    i3 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i13 = ((ArrayList) ylVar.k.f).size() + i11;
                    i12 = i10 + 1;
                    size = i3;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = ylVar.h;
            int i14 = ylVar.l;
            org.telegram.ui.ActionBar.t4 t4Var = ylVar.x;
            zl zlVar = ylVar.z;
            arrayList = arrayList2;
            float interpolation = ylVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - ylVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = org.telegram.messenger.g0.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(ylVar.f, ylVar.d, interpolation);
            int width = zlVar.getWidth();
            am amVar2 = zlVar.Q;
            float previewScale = width * T1 * amVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = amVar2.getPreviewScale() * org.telegram.messenger.g0.T1(ylVar.g, ylVar.e, interpolation) * max;
            if (t4Var != null) {
                f11 = 2.0f;
                ylVar.p = 0.0f;
                float width2 = zlVar.getWidth();
                float f16 = i14;
                ylVar.n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                ylVar.o = (Math.max(f16, previewScale) + zlVar.getWidth()) / 2.0f;
                ylVar.q = Math.max(i14 * 2, previewScale2);
                ylVar.x.q(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                t4Var.setBounds((int) ylVar.n, (int) ylVar.p, (int) ylVar.o, (int) ylVar.q);
                t4Var.setAlpha((int) ((ylVar.d <= 0.0f ? 1.0f - interpolation : ylVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                t4Var.e(canvas, ylVar.y, null);
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
                if (xlVar2 != null && (((xlVar = amVar2.K) == null || xlVar.b != xlVar2.b) && xlVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = ylVar.w;
            RectF rectF = ylVar.t;
            long j10 = ylVar.i;
            if (j10 <= 0) {
                i3 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (ylVar.u == null || ylVar.v != j10) {
                    ylVar.v = j10;
                    ylVar.u = new ly0(ci.wb.a1(false, org.telegram.messenger.bd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + ylVar.u.c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f17 = ylVar.n;
                float f18 = ylVar.r;
                float f19 = f11;
                float z12 = com.google.android.recaptcha.internal.a.z(f18, L, f19, f17);
                i3 = size;
                float f20 = ylVar.p;
                i10 = i12;
                float f21 = ylVar.s;
                i11 = i13;
                rectF.set(z12, com.google.android.recaptcha.internal.a.z(f21, L2, f19, f20), org.telegram.messenger.k5.a(f18, L, f19, f17), org.telegram.messenger.k5.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                ly0 ly0Var = ylVar.u;
                float L3 = org.telegram.messenger.g0.L(14.0f) + (((ylVar.r / f19) + ylVar.n) - (L / f19));
                float f23 = ylVar.p + (ylVar.s / f19);
                f10 = b10;
                ly0Var.c(L3, f23, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = ((ArrayList) ylVar.k.f).size() + i11;
            i12 = i10 + 1;
            size = i3;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.h0(f13, t0Var.getMeasuredHeight());
        if (t0Var.Q()) {
            t0Var.G(canvas, true);
            t0Var.I(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (amVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (amVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        this.a.measure(i3, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = k2.p1.d(45.0f, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.s), TLObject.FLAG_30));
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
        boolean z10;
        xl xlVar3;
        int i3;
        org.telegram.ui.wm wmVar;
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
        am amVar = this.Q;
        bi biVar = amVar.b;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
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
            if (y9 >= f12 && y9 <= f12 + b10) {
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
                if (xlVar != null && xlVar.d().contains(x10, y9 - f12)) {
                    break;
                }
            }
        }
        xlVar = null;
        xl xlVar7 = amVar.K;
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
                    if (xlVar8 == null || xlVar8 == amVar.K) {
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
                mi.b0 b0Var = this.N;
                if (action == 0 || amVar.K != null || amVar.r.J1 || (((valueAnimator = amVar.M) != null && valueAnimator.isRunning()) || ylVar == null || xlVar == null || (ulVar2 = ylVar.k) == null || !((ArrayList) ulVar2.f).contains(xlVar.b))) {
                    if (action == 2 || amVar.K == null || amVar.L) {
                        if (action == 1 || (xlVar5 = amVar.K) == null) {
                            if (action == 1 || amVar.K != null || (xlVar3 = this.G) == null || this.F == null) {
                                z10 = false;
                                i10 = 1;
                                if (action != i10 || action == 3) {
                                    this.E = 0L;
                                    removeCallbacks(b0Var);
                                    this.M = false;
                                    if (!z10) {
                                        h();
                                        return i10;
                                    }
                                }
                                return z10;
                            }
                            if (xlVar3.e && xlVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                xlVar3.m = x11;
                                xlVar3.n = y10;
                                RectF d10 = xlVar3.d();
                                xlVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) b8.be.a(xlVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(xq.j);
                                duration.addUpdateListener(new c6(xlVar3, 12));
                                duration.addListener(new x5(xlVar3, 15));
                                duration.start();
                            } else {
                                RectF d11 = xlVar3.d();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                float L = d11.right - org.telegram.messenger.g0.L(36.4f);
                                float f20 = this.F.p + d11.top;
                                rectF2.set(L, f20, d11.right, org.telegram.messenger.g0.L(36.4f) + f20);
                                boolean contains = rectF2.contains(x10, y9 - this.G.a.a);
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
                                    int indexOf = arrayList6.indexOf(this.G.b);
                                    int i22 = biVar.L2;
                                    org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                                    if (i22 != 0) {
                                        i3 = 1;
                                    } else if (d2Var instanceof org.telegram.ui.wm) {
                                        wmVar = (org.telegram.ui.wm) d2Var;
                                        i3 = 0;
                                        if (d2Var == null) {
                                            d2Var = LaunchActivity.Q();
                                        }
                                        if (!biVar.U3.g0()) {
                                            org.telegram.messenger.g0.v1(d2Var.getFragmentView().findFocus());
                                            org.telegram.messenger.g0.v1(biVar.c.findFocus());
                                        }
                                        PhotoViewer.v1().N2(null, d2Var, amVar.a);
                                        PhotoViewer.v1().O2(biVar);
                                        PhotoViewer v12 = PhotoViewer.v1();
                                        int i23 = biVar.N3;
                                        boolean z11 = biVar.O3;
                                        v12.h = i23;
                                        v12.n = z11;
                                        this.O.a = arrayList6;
                                        PhotoViewer.v1().j2(new ArrayList(arrayList6), indexOf, i3, false, this.O, wmVar);
                                        amVar.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.V()) {
                                            PhotoViewer v13 = PhotoViewer.v1();
                                            Editable text = biVar.a1().getText();
                                            v13.q7 = true;
                                            v13.r7 = text;
                                            xlVar4 = null;
                                            v13.D2(null, text, false, false);
                                            v13.w3(null);
                                            this.G = xlVar4;
                                            this.E = 0L;
                                            amVar.K = xlVar4;
                                            this.H = 0.0f;
                                        }
                                    } else {
                                        i3 = 4;
                                    }
                                    wmVar = null;
                                    if (d2Var == null) {
                                    }
                                    if (!biVar.U3.g0()) {
                                    }
                                    PhotoViewer.v1().N2(null, d2Var, amVar.a);
                                    PhotoViewer.v1().O2(biVar);
                                    PhotoViewer v122 = PhotoViewer.v1();
                                    int i232 = biVar.N3;
                                    boolean z112 = biVar.O3;
                                    v122.h = i232;
                                    v122.n = z112;
                                    this.O.a = arrayList6;
                                    PhotoViewer.v1().j2(new ArrayList(arrayList6), indexOf, i3, false, this.O, wmVar);
                                    amVar.Q.getClass();
                                    if (ChatAttachAlertPhotoLayout.V()) {
                                    }
                                } else if (amVar.getSelectedItemsCount() > 1) {
                                    org.telegram.messenger.ye yeVar = this.G.b;
                                    int indexOf2 = ((ArrayList) this.F.k.f).indexOf(yeVar);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.Q;
                                        if (chatAttachAlertPhotoLayout != null) {
                                            ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                            int size5 = arrayList7.size();
                                            int i24 = 0;
                                            while (true) {
                                                if (i24 >= size5) {
                                                    break;
                                                }
                                                if (((Map.Entry) arrayList7.get(i24)).getValue() == yeVar) {
                                                    this.c.put(yeVar, ((Map.Entry) arrayList7.get(i24)).getKey());
                                                    break;
                                                }
                                                i24++;
                                            }
                                        }
                                        yl ylVar5 = this.F;
                                        ((ArrayList) ylVar5.k.f).remove(indexOf2);
                                        yl.a(ylVar5, ylVar5.k, true);
                                        j();
                                        i(amVar.Q, false);
                                        int i25 = this.P + 1;
                                        this.P = i25;
                                        amVar.x.k(0L, 82, yeVar, null, null, new bi.q0(this, ylVar5, yeVar, indexOf2, 21));
                                        postDelayed(new o2(this, i25, i20), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = amVar.M;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                xlVar4 = null;
                                this.G = xlVar4;
                                this.E = 0L;
                                amVar.K = xlVar4;
                                this.H = 0.0f;
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
                                        ((ArrayList) amVar.K.a.k.f).remove(indexOf3);
                                        yl ylVar6 = amVar.K.a;
                                        yl.a(ylVar6, ylVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(ylVar) > arrayList2.indexOf(amVar.K.a)) {
                                            indexOf4++;
                                        }
                                        f(ylVar, amVar.K.b, indexOf4);
                                        if (amVar.K.a != ylVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    xlVar6 = null;
                                                    break;
                                                }
                                                xlVar6 = (xl) arrayList8.get(i26);
                                                if (xlVar6.b == amVar.K.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (xlVar6 != null) {
                                                g();
                                                xl xlVar9 = amVar.K;
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
                                                amVar.K = xlVar6;
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
                                    i(amVar.Q, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        if (action != i10) {
                        }
                        this.E = 0L;
                        removeCallbacks(b0Var);
                        this.M = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    amVar.E = x10;
                    amVar.F = y9;
                    if (!this.M) {
                        this.M = true;
                        postDelayed(b0Var, 16L);
                    }
                    invalidate();
                } else {
                    this.F = ylVar;
                    this.G = xlVar;
                    amVar.E = x10;
                    amVar.F = y9;
                    amVar.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    org.telegram.messenger.g0.i3(new ai.r1(this, elapsedRealtime, this.G, 23), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i10 = 1;
                if (action != i10) {
                }
                this.E = 0L;
                removeCallbacks(b0Var);
                this.M = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f10 = 2.0f;
            ylVar2 = null;
        }
        xlVar2 = null;
        action = motionEvent.getAction();
        mi.b0 b0Var2 = this.N;
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
        removeCallbacks(b0Var2);
        this.M = false;
        if (!z10) {
        }
        return z10;
    }
}
