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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wm extends ViewGroup {
    public vm E;
    public um F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.l9 M;
    public final sm N;
    public int O;
    public final /* synthetic */ xm P;
    public final org.telegram.ui.Cells.w0 a;
    public final ArrayList b;
    public final HashMap c;
    public HashMap d;
    public ArrayList e;
    public HashMap f;
    public ArrayList h;
    public final int n;
    public final int r;
    public int s;
    public float v;
    public float w;
    public boolean[] x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(xm xmVar, Context context) {
        super(context);
        this.P = xmVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = AndroidUtilities.dp(16.0f);
        this.r = AndroidUtilities.dp(64.0f);
        this.s = 0;
        this.x = null;
        this.y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.l9(this, 5);
        this.N = new sm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, xmVar.n, true);
        this.a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
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
            ArrayList arrayList2 = ((vm) arrayList.get(i10)).k.g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
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
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
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
        xm xmVar = this.P;
        um umVar = xmVar.J;
        PointF pointF = this.K;
        if (umVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (xmVar.K) {
            RectF f7 = umVar.f(umVar.e());
            RectF f10 = xmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + xmVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = umVar.f(umVar.e());
        RectF f12 = xmVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, xmVar.y - ((xmVar.G - 0.5f) * xmVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + xmVar.J.a.a + f12.top, (xmVar.E - ((xmVar.F - 0.5f) * xmVar.I)) + xmVar.M, this.G);
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
            ArrayList arrayList2 = ((vm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                um umVar = (um) arrayList2.get(i11);
                uh.g gVar = umVar.s;
                if (gVar != null) {
                    gVar.b(umVar.O.z);
                    umVar.s = null;
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
            arrayList3.add((MediaController.PhotoEntry) this.d.get(num));
            if (i13 % 10 == 9 || i13 == i12) {
                vm vmVar = new vm(this);
                vm.a(vmVar, new pm(this.P, arrayList3), false);
                arrayList.add(vmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.n;
        int computeVerticalScrollOffset = this.P.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.w = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((vm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            zArr[i10] = (f7 >= f10 && f7 <= this.w) || (b10 >= f10 && b10 <= this.w) || (f7 <= f10 && b10 >= this.w);
            i10++;
            f7 = b10;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final int e() {
        int i10 = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((vm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(vm vmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = vmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (vmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) vmVar.k.g.get(10);
            vmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(vmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                vm vmVar2 = i11 == arrayList2.size() ? null : (vm) arrayList2.get(i11);
                if (vmVar2 == null) {
                    vm vmVar3 = new vm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    vm.a(vmVar3, new pm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(vmVar2, photoEntry2, 0);
                }
            }
        }
        vm.a(vmVar, vmVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            vm vmVar = (vm) arrayList.get(i11);
            float b10 = vmVar.b();
            vmVar.a = f7;
            vmVar.b = i10;
            f7 += b10;
            i10 += vmVar.k.g.size();
        }
    }

    public final void h() {
        xm xmVar = this.P;
        ValueAnimator valueAnimator = xmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        xmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        xmVar.L = ofFloat;
        ofFloat.addUpdateListener(new qm(this, 1));
        xmVar.L.addListener(new rm(this, 0));
        xmVar.L.setDuration(200L);
        xmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        nm nmVar = chatAttachAlertPhotoLayout.G;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        yl ylVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = ylVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ylVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = nmVar.f;
                    boolean z12 = nmVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (yiVar.Q0 != 0 || yiVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == nmVar.h() - 1, yiVar.i0);
                        if ((yiVar.f0 instanceof org.telegram.ui.eo) && yiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.b.V1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int g10 = hc.b.g(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        if (this.s != g10) {
            this.s = g10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            vm vmVar = (vm) arrayList.get(i10);
            if (vmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - vmVar.k.g.size();
                vm vmVar2 = (vm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, vmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) vmVar2.k.g.remove(0));
                }
                vmVar.k.g.addAll(arrayList2);
                vm.a(vmVar, vmVar.k, true);
                vm.a(vmVar2, vmVar2.k, true);
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
        um umVar;
        float f10 = this.n;
        xm xmVar = this.P;
        int computeVerticalScrollOffset = xmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - xmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - xmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f10);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f11 = f10;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            vm vmVar = (vm) arrayList2.get(i13);
            float b10 = vmVar.b();
            vmVar.a = f11;
            vmVar.b = i14;
            float f12 = this.v;
            if (f11 < f12 || f11 > this.w) {
                float f13 = f11 + b10;
                if ((f13 < f12 || f13 > this.w) && (f11 > f12 || f13 < this.w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f11 += f7;
                    i14 = vmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = vmVar.h;
            int i15 = vmVar.l;
            org.telegram.ui.ActionBar.h5 h5Var = vmVar.x;
            wm wmVar = vmVar.z;
            arrayList = arrayList2;
            float interpolation = vmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - vmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(vmVar.f, vmVar.d, interpolation);
            int width = wmVar.getWidth();
            xm xmVar2 = wmVar.P;
            float previewScale = width * lerp * xmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = xmVar2.getPreviewScale() * AndroidUtilities.lerp(vmVar.g, vmVar.e, interpolation) * max;
            if (h5Var != null) {
                vmVar.p = 0.0f;
                float width2 = wmVar.getWidth();
                float f14 = i15;
                vmVar.n = (width2 - Math.max(f14, previewScale)) / 2.0f;
                vmVar.o = (Math.max(f14, previewScale) + wmVar.getWidth()) / 2.0f;
                vmVar.q = Math.max(i15 * 2, previewScale2);
                vmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                h5Var.setBounds((int) vmVar.n, (int) vmVar.p, (int) vmVar.o, (int) vmVar.q);
                h5Var.setAlpha((int) ((vmVar.d <= 0.0f ? 1.0f - interpolation : vmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                h5Var.d(canvas, vmVar.y, null);
                vmVar.p += f14;
                vmVar.n += f14;
                vmVar.q -= f14;
                vmVar.o -= f14;
            }
            vmVar.r = vmVar.o - vmVar.n;
            vmVar.s = vmVar.q - vmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                um umVar2 = (um) arrayList3.get(i16);
                if (umVar2 != null && (((umVar = xmVar2.J) == null || umVar.b != umVar2.b) && umVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = vmVar.w;
            RectF rectF = vmVar.t;
            long j3 = vmVar.i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (vmVar.u == null || vmVar.v != j3) {
                    vmVar.v = j3;
                    vmVar.u = new t01(xh.z7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + vmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f15 = vmVar.n;
                float f16 = vmVar.r;
                float A = com.google.android.gms.internal.vision.e2.A(f16, dp, 2.0f, f15);
                i10 = size;
                float f17 = vmVar.p;
                i11 = i13;
                float f18 = vmVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f18, dp2, 2.0f, f17), org.telegram.messenger.a2.a(f16, dp, 2.0f, f15), org.telegram.messenger.a2.a(f18, dp2, 2.0f, f17));
                paint.setColor(1610612736);
                float f19 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f19, f19, paint);
                f7 = b10;
                vmVar.u.c(AndroidUtilities.dp(14.0f) + (((vmVar.r / 2.0f) + vmVar.n) - (dp / 2.0f)), vmVar.p + (vmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f11 += f7;
            i14 = vmVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.W(f11, w0Var.getMeasuredHeight());
        if (w0Var.J()) {
            w0Var.y(canvas, true);
            w0Var.A(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (xmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (xmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = hc.b.g(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vm vmVar;
        um umVar;
        float f7;
        vm vmVar2;
        um umVar2;
        int action;
        boolean z10;
        um umVar3;
        int i10;
        org.telegram.ui.eo eoVar;
        um umVar4;
        pm pmVar;
        ArrayList arrayList;
        um umVar5;
        um umVar6;
        ValueAnimator valueAnimator;
        pm pmVar2;
        int i11;
        int i12;
        int i13;
        float f10;
        xm xmVar = this.P;
        yi yiVar = xmVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i14 >= size) {
                vmVar = null;
                break;
            }
            vmVar = (vm) arrayList2.get(i14);
            float b10 = vmVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i14++;
        }
        if (vmVar != null) {
            ArrayList arrayList3 = vmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                umVar = (um) arrayList3.get(i15);
                if (umVar != null && umVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        umVar = null;
        um umVar7 = xmVar.J;
        if (umVar7 != null) {
            RectF f12 = umVar7.f(umVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i16 = 0;
            vmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i16 < size) {
                vm vmVar3 = (vm) arrayList2.get(i16);
                float b12 = vmVar3.b() + f15;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            vmVar2 = vmVar3;
                        }
                    }
                }
                i16++;
                f15 = b12;
                size = i17;
            }
            if (vmVar2 != null) {
                ArrayList arrayList4 = vmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                umVar2 = null;
                float f18 = 0.0f;
                while (i18 < size3) {
                    um umVar8 = (um) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (umVar8 == null || umVar8 == xmVar.J) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (vmVar2.k.g.contains(umVar8.b)) {
                            RectF d = umVar8.d();
                            int i19 = umVar8.i;
                            if ((i19 & 4) > 0) {
                                i13 = i19;
                                f10 = 0.0f;
                                d.top = 0.0f;
                            } else {
                                i13 = i19;
                                f10 = 0.0f;
                            }
                            if ((i13 & 1) > 0) {
                                d.left = f10;
                            }
                            if ((i13 & 2) > 0) {
                                d.right = getWidth();
                            }
                            if ((umVar8.i & 8) > 0) {
                                d.bottom = vmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    umVar2 = umVar8;
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
                org.telegram.ui.Cells.l9 l9Var = this.M;
                if (action != 0 && xmVar.J == null && !xmVar.r.K1 && (((valueAnimator = xmVar.L) == null || !valueAnimator.isRunning()) && vmVar != null && umVar != null && (pmVar2 = vmVar.k) != null && pmVar2.g.contains(umVar.b))) {
                    this.E = vmVar;
                    this.F = umVar;
                    xmVar.y = x10;
                    xmVar.E = y3;
                    xmVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new a3.h0(this, elapsedRealtime, this.F, 14), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && xmVar.J != null && !xmVar.K) {
                    xmVar.y = x10;
                    xmVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(l9Var, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (umVar5 = xmVar.J) == null) {
                    if (action == 1 || xmVar.J != null || (umVar3 = this.F) == null || this.E == null) {
                        z10 = false;
                        if (action != 1 || action == 3) {
                            this.y = 0L;
                            removeCallbacks(l9Var);
                            this.L = false;
                            if (!z10) {
                                h();
                                return true;
                            }
                        }
                        return z10;
                    }
                    if (umVar3.e && umVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        umVar3.m = x11;
                        umVar3.n = y10;
                        RectF d10 = umVar3.d();
                        umVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.q.a(umVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(wr.j);
                        duration.addUpdateListener(new j6(umVar3, 11));
                        duration.addListener(new tm(umVar3));
                        duration.start();
                    } else {
                        RectF d11 = umVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f19 = this.E.p + d11.top;
                        rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                        if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                vm vmVar4 = (vm) arrayList2.get(i20);
                                if (vmVar4 != null && (pmVar = vmVar4.k) != null && (arrayList = pmVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.F.b);
                            int i21 = yiVar.Q0;
                            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (p2Var instanceof org.telegram.ui.eo) {
                                eoVar = (org.telegram.ui.eo) p2Var;
                                i10 = 0;
                                if (p2Var == null) {
                                    p2Var = LaunchActivity.R();
                                }
                                if (!yiVar.Z1.e0()) {
                                    AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(yiVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, p2Var, xmVar.a);
                                PhotoViewer.t1().L2(yiVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = yiVar.S1;
                                boolean z11 = yiVar.T1;
                                t12.h = i22;
                                t12.n = z11;
                                this.N.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.N, eoVar);
                                xmVar.P.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = yiVar.m1().getText();
                                    t13.p7 = true;
                                    t13.q7 = text;
                                    umVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.F = umVar4;
                                    this.y = 0L;
                                    xmVar.J = umVar4;
                                    this.G = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            eoVar = null;
                            if (p2Var == null) {
                            }
                            if (!yiVar.Z1.e0()) {
                            }
                            PhotoViewer.t1().K2(null, p2Var, xmVar.a);
                            PhotoViewer.t1().L2(yiVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = yiVar.S1;
                            boolean z112 = yiVar.T1;
                            t122.h = i222;
                            t122.n = z112;
                            this.N.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.N, eoVar);
                            xmVar.P.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (xmVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.F.b;
                            int indexOf2 = this.E.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xmVar.P;
                                if (chatAttachAlertPhotoLayout != null) {
                                    ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                    int size5 = arrayList7.size();
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= size5) {
                                            break;
                                        }
                                        if (((Map.Entry) arrayList7.get(i23)).getValue() == photoEntry) {
                                            this.c.put(photoEntry, ((Map.Entry) arrayList7.get(i23)).getKey());
                                            break;
                                        }
                                        i23++;
                                    }
                                }
                                vm vmVar5 = this.E;
                                vmVar5.k.g.remove(indexOf2);
                                vm.a(vmVar5, vmVar5.k, true);
                                j();
                                i(xmVar.P, false);
                                int i24 = this.O + 1;
                                this.O = i24;
                                xmVar.w.k(0L, 82, photoEntry, null, null, new di.q(this, vmVar5, photoEntry, indexOf2, 16));
                                postDelayed(new zd(this, i24, 1), 4000L);
                            }
                            ValueAnimator valueAnimator2 = xmVar.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        umVar4 = null;
                        this.F = umVar4;
                        this.y = 0L;
                        xmVar.J = umVar4;
                        this.G = 0.0f;
                    }
                } else {
                    if (vmVar == null || umVar == null || umVar == umVar5) {
                        if (vmVar2 == null || umVar2 == null || umVar2 == umVar5 || umVar2.b == umVar5.b) {
                            vmVar = null;
                            umVar = null;
                        } else {
                            vmVar = vmVar2;
                            umVar = umVar2;
                        }
                    }
                    if (vmVar != null) {
                        ArrayList arrayList8 = vmVar.h;
                        if (umVar != null && umVar != umVar5) {
                            int indexOf3 = umVar5.a.k.g.indexOf(umVar5.b);
                            int indexOf4 = vmVar.k.g.indexOf(umVar.b);
                            if (indexOf3 >= 0) {
                                xmVar.J.a.k.g.remove(indexOf3);
                                vm vmVar6 = xmVar.J.a;
                                vm.a(vmVar6, vmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(vmVar) > arrayList2.indexOf(xmVar.J.a)) {
                                    indexOf4++;
                                }
                                f(vmVar, xmVar.J.b, indexOf4);
                                if (xmVar.J.a != vmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            umVar6 = null;
                                            break;
                                        }
                                        umVar6 = (um) arrayList8.get(i25);
                                        if (umVar6.b == xmVar.J.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (umVar6 != null) {
                                        g();
                                        um umVar9 = xmVar.J;
                                        RectF rectF3 = umVar6.g;
                                        vm vmVar7 = umVar6.O;
                                        float f20 = umVar9.j;
                                        RectF rectF4 = umVar9.g;
                                        umVar6.j = AndroidUtilities.lerp(f20, umVar9.k, umVar9.e());
                                        if (umVar6.f == null) {
                                            umVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = umVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, umVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = umVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, umVar9.e(), umVar6.f);
                                            umVar6.f.set(rectF5.centerX() - (((umVar6.f.width() / f7) * umVar9.a.r) / vmVar7.r), rectF5.centerY() - (((umVar6.f.height() / f7) * umVar9.a.s) / vmVar7.s), (((umVar6.f.width() / f7) * umVar9.a.r) / vmVar7.r) + rectF5.centerX(), (((umVar6.f.height() / f7) * umVar9.a.s) / vmVar7.s) + rectF5.centerY());
                                        } else {
                                            umVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * umVar9.a.r) / vmVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * umVar9.a.s) / vmVar7.s), (((rectF4.width() / f7) * umVar9.a.r) / vmVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * umVar9.a.s) / vmVar7.s) + rectF5.centerY());
                                        }
                                        umVar6.j = AndroidUtilities.lerp(umVar6.j, umVar6.k, umVar6.e());
                                        umVar6.h = SystemClock.elapsedRealtime();
                                        xmVar.J = umVar6;
                                        umVar6.a = vmVar;
                                        umVar6.j = 1.0f;
                                        umVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                xmVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(xmVar.P, false);
                        }
                    }
                    h();
                }
                z10 = true;
                if (action != 1) {
                }
                this.y = 0L;
                removeCallbacks(l9Var);
                this.L = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f7 = 2.0f;
            vmVar2 = null;
        }
        umVar2 = null;
        action = motionEvent.getAction();
        org.telegram.ui.Cells.l9 l9Var2 = this.M;
        if (action != 0) {
        }
        if (action != 2) {
        }
        if (action == 1) {
        }
        if (action == 1) {
        }
        z10 = false;
        if (action != 1) {
        }
        this.y = 0L;
        removeCallbacks(l9Var2);
        this.L = false;
        if (!z10) {
        }
        return z10;
    }
}
