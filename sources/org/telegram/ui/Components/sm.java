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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class sm extends ViewGroup {
    public rm E;
    public qm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final om N;
    public int O;
    public final /* synthetic */ tm P;
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
    public sm(tm tmVar, Context context) {
        super(context);
        this.P = tmVar;
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
        this.M = new org.telegram.ui.Cells.t6(this, 8);
        this.N = new om(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, tmVar.n, true);
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
            ArrayList arrayList2 = ((rm) arrayList.get(i10)).k.g;
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
        tm tmVar = this.P;
        qm qmVar = tmVar.J;
        PointF pointF = this.K;
        if (qmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (tmVar.K) {
            RectF f7 = qmVar.f(qmVar.e());
            RectF f10 = tmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + tmVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = qmVar.f(qmVar.e());
        RectF f12 = tmVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, tmVar.y - ((tmVar.G - 0.5f) * tmVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + tmVar.J.a.a + f12.top, (tmVar.E - ((tmVar.F - 0.5f) * tmVar.I)) + tmVar.M, this.G);
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
            ArrayList arrayList2 = ((rm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                qm qmVar = (qm) arrayList2.get(i11);
                vh.f fVar = qmVar.s;
                if (fVar != null) {
                    fVar.b(qmVar.O.z);
                    qmVar.s = null;
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
                rm rmVar = new rm(this);
                rm.a(rmVar, new mm(this.P, arrayList3), false);
                arrayList.add(rmVar);
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
            float b10 = ((rm) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((rm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(rm rmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = rmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (rmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) rmVar.k.g.get(10);
            rmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(rmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                rm rmVar2 = i11 == arrayList2.size() ? null : (rm) arrayList2.get(i11);
                if (rmVar2 == null) {
                    rm rmVar3 = new rm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    rm.a(rmVar3, new mm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(rmVar2, photoEntry2, 0);
                }
            }
        }
        rm.a(rmVar, rmVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            rm rmVar = (rm) arrayList.get(i11);
            float b10 = rmVar.b();
            rmVar.a = f7;
            rmVar.b = i10;
            f7 += b10;
            i10 += rmVar.k.g.size();
        }
    }

    public final void h() {
        tm tmVar = this.P;
        ValueAnimator valueAnimator = tmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        tmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        tmVar.L = ofFloat;
        ofFloat.addUpdateListener(new nm(this, 1));
        tmVar.L.addListener(new r8(this, 10));
        tmVar.L.setDuration(200L);
        tmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        km kmVar = chatAttachAlertPhotoLayout.G;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        wl wlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = wlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = kmVar.f;
                    boolean z12 = kmVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (xiVar.Q0 != 0 || xiVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == kmVar.h() - 1, xiVar.i0);
                        if ((xiVar.f0 instanceof org.telegram.ui.yn) && xiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.b.S1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int b10 = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != b10) {
            this.s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            rm rmVar = (rm) arrayList.get(i10);
            if (rmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - rmVar.k.g.size();
                rm rmVar2 = (rm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, rmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) rmVar2.k.g.remove(0));
                }
                rmVar.k.g.addAll(arrayList2);
                rm.a(rmVar, rmVar.k, true);
                rm.a(rmVar2, rmVar2.k, true);
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
        qm qmVar;
        float f10 = this.n;
        tm tmVar = this.P;
        int computeVerticalScrollOffset = tmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - tmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - tmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f10);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f11 = f10;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            rm rmVar = (rm) arrayList2.get(i13);
            float b10 = rmVar.b();
            rmVar.a = f11;
            rmVar.b = i14;
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
                    i14 = rmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = rmVar.h;
            int i15 = rmVar.l;
            org.telegram.ui.ActionBar.e5 e5Var = rmVar.x;
            sm smVar = rmVar.z;
            arrayList = arrayList2;
            float interpolation = rmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - rmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(rmVar.f, rmVar.d, interpolation);
            int width = smVar.getWidth();
            tm tmVar2 = smVar.P;
            float previewScale = width * lerp * tmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = tmVar2.getPreviewScale() * AndroidUtilities.lerp(rmVar.g, rmVar.e, interpolation) * max;
            if (e5Var != null) {
                rmVar.p = 0.0f;
                float width2 = smVar.getWidth();
                float f14 = i15;
                rmVar.n = (width2 - Math.max(f14, previewScale)) / 2.0f;
                rmVar.o = (Math.max(f14, previewScale) + smVar.getWidth()) / 2.0f;
                rmVar.q = Math.max(i15 * 2, previewScale2);
                rmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                e5Var.setBounds((int) rmVar.n, (int) rmVar.p, (int) rmVar.o, (int) rmVar.q);
                e5Var.setAlpha((int) ((rmVar.d <= 0.0f ? 1.0f - interpolation : rmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                e5Var.d(canvas, rmVar.y, null);
                rmVar.p += f14;
                rmVar.n += f14;
                rmVar.q -= f14;
                rmVar.o -= f14;
            }
            rmVar.r = rmVar.o - rmVar.n;
            rmVar.s = rmVar.q - rmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                qm qmVar2 = (qm) arrayList3.get(i16);
                if (qmVar2 != null && (((qmVar = tmVar2.J) == null || qmVar.b != qmVar2.b) && qmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = rmVar.w;
            RectF rectF = rmVar.t;
            long j3 = rmVar.i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (rmVar.u == null || rmVar.v != j3) {
                    rmVar.v = j3;
                    rmVar.u = new e11(yh.x7.d1(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + rmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f15 = rmVar.n;
                float f16 = rmVar.r;
                float A = com.google.android.gms.internal.vision.e2.A(f16, dp, 2.0f, f15);
                i10 = size;
                float f17 = rmVar.p;
                i11 = i13;
                float f18 = rmVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f18, dp2, 2.0f, f17), org.telegram.messenger.f0.a(f16, dp, 2.0f, f15), org.telegram.messenger.f0.a(f18, dp2, 2.0f, f17));
                paint.setColor(1610612736);
                float f19 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f19, f19, paint);
                f7 = b10;
                rmVar.u.c(AndroidUtilities.dp(14.0f) + (((rmVar.r / 2.0f) + rmVar.n) - (dp / 2.0f)), rmVar.p + (rmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f11 += f7;
            i14 = rmVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.U(f11, w0Var.getMeasuredHeight());
        if (w0Var.H()) {
            w0Var.y(canvas, true);
            w0Var.A(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (tmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (tmVar.J.c(canvas, true)) {
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
            this.s = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
        rm rmVar;
        qm qmVar;
        float f7;
        rm rmVar2;
        qm qmVar2;
        int action;
        boolean z10;
        qm qmVar3;
        int i10;
        org.telegram.ui.yn ynVar;
        qm qmVar4;
        mm mmVar;
        ArrayList arrayList;
        qm qmVar5;
        qm qmVar6;
        ValueAnimator valueAnimator;
        mm mmVar2;
        int i11;
        int i12;
        int i13;
        float f10;
        tm tmVar = this.P;
        xi xiVar = tmVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i14 >= size) {
                rmVar = null;
                break;
            }
            rmVar = (rm) arrayList2.get(i14);
            float b10 = rmVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i14++;
        }
        if (rmVar != null) {
            ArrayList arrayList3 = rmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                qmVar = (qm) arrayList3.get(i15);
                if (qmVar != null && qmVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        qmVar = null;
        qm qmVar7 = tmVar.J;
        if (qmVar7 != null) {
            RectF f12 = qmVar7.f(qmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i16 = 0;
            rmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i16 < size) {
                rm rmVar3 = (rm) arrayList2.get(i16);
                float b12 = rmVar3.b() + f15;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            rmVar2 = rmVar3;
                        }
                    }
                }
                i16++;
                f15 = b12;
                size = i17;
            }
            if (rmVar2 != null) {
                ArrayList arrayList4 = rmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                qmVar2 = null;
                float f18 = 0.0f;
                while (i18 < size3) {
                    qm qmVar8 = (qm) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (qmVar8 == null || qmVar8 == tmVar.J) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (rmVar2.k.g.contains(qmVar8.b)) {
                            RectF d = qmVar8.d();
                            int i19 = qmVar8.i;
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
                            if ((qmVar8.i & 8) > 0) {
                                d.bottom = rmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    qmVar2 = qmVar8;
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
                org.telegram.ui.Cells.t6 t6Var = this.M;
                if (action != 0 && tmVar.J == null && !tmVar.r.K1 && (((valueAnimator = tmVar.L) == null || !valueAnimator.isRunning()) && rmVar != null && qmVar != null && (mmVar2 = rmVar.k) != null && mmVar2.g.contains(qmVar.b))) {
                    this.E = rmVar;
                    this.F = qmVar;
                    tmVar.y = x10;
                    tmVar.E = y3;
                    tmVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new a3.h0(this, elapsedRealtime, this.F, 19), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && tmVar.J != null && !tmVar.K) {
                    tmVar.y = x10;
                    tmVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(t6Var, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (qmVar5 = tmVar.J) == null) {
                    if (action == 1 || tmVar.J != null || (qmVar3 = this.F) == null || this.E == null) {
                        z10 = false;
                        if (action != 1 || action == 3) {
                            this.y = 0L;
                            removeCallbacks(t6Var);
                            this.L = false;
                            if (!z10) {
                                h();
                                return true;
                            }
                        }
                        return z10;
                    }
                    if (qmVar3.e && qmVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        qmVar3.m = x11;
                        qmVar3.n = y10;
                        RectF d10 = qmVar3.d();
                        qmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.q.a(qmVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(tr.j);
                        duration.addUpdateListener(new k6(qmVar3, 11));
                        duration.addListener(new pm(qmVar3));
                        duration.start();
                    } else {
                        RectF d11 = qmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f19 = this.E.p + d11.top;
                        rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                        if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                rm rmVar4 = (rm) arrayList2.get(i20);
                                if (rmVar4 != null && (mmVar = rmVar4.k) != null && (arrayList = mmVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.F.b);
                            int i21 = xiVar.Q0;
                            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (n2Var instanceof org.telegram.ui.yn) {
                                ynVar = (org.telegram.ui.yn) n2Var;
                                i10 = 0;
                                if (n2Var == null) {
                                    n2Var = LaunchActivity.R();
                                }
                                if (!xiVar.Z1.a0()) {
                                    AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(xiVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, n2Var, tmVar.a);
                                PhotoViewer.t1().L2(xiVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = xiVar.S1;
                                boolean z11 = xiVar.T1;
                                t12.h = i22;
                                t12.n = z11;
                                this.N.a = arrayList6;
                                PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i10, false, this.N, ynVar);
                                tmVar.P.getClass();
                                if (ChatAttachAlertPhotoLayout.R()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = xiVar.k1().getText();
                                    t13.p7 = true;
                                    t13.q7 = text;
                                    qmVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.F = qmVar4;
                                    this.y = 0L;
                                    tmVar.J = qmVar4;
                                    this.G = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            ynVar = null;
                            if (n2Var == null) {
                            }
                            if (!xiVar.Z1.a0()) {
                            }
                            PhotoViewer.t1().K2(null, n2Var, tmVar.a);
                            PhotoViewer.t1().L2(xiVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = xiVar.S1;
                            boolean z112 = xiVar.T1;
                            t122.h = i222;
                            t122.n = z112;
                            this.N.a = arrayList6;
                            PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i10, false, this.N, ynVar);
                            tmVar.P.getClass();
                            if (ChatAttachAlertPhotoLayout.R()) {
                            }
                        } else if (tmVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.F.b;
                            int indexOf2 = this.E.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tmVar.P;
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
                                rm rmVar5 = this.E;
                                rmVar5.k.g.remove(indexOf2);
                                rm.a(rmVar5, rmVar5.k, true);
                                j();
                                i(tmVar.P, false);
                                int i24 = this.O + 1;
                                this.O = i24;
                                tmVar.w.k(0L, 82, photoEntry, null, null, new ai.c9(this, rmVar5, photoEntry, indexOf2, 16));
                                postDelayed(new ld(this, i24, 2), 4000L);
                            }
                            ValueAnimator valueAnimator2 = tmVar.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        qmVar4 = null;
                        this.F = qmVar4;
                        this.y = 0L;
                        tmVar.J = qmVar4;
                        this.G = 0.0f;
                    }
                } else {
                    if (rmVar == null || qmVar == null || qmVar == qmVar5) {
                        if (rmVar2 == null || qmVar2 == null || qmVar2 == qmVar5 || qmVar2.b == qmVar5.b) {
                            rmVar = null;
                            qmVar = null;
                        } else {
                            rmVar = rmVar2;
                            qmVar = qmVar2;
                        }
                    }
                    if (rmVar != null) {
                        ArrayList arrayList8 = rmVar.h;
                        if (qmVar != null && qmVar != qmVar5) {
                            int indexOf3 = qmVar5.a.k.g.indexOf(qmVar5.b);
                            int indexOf4 = rmVar.k.g.indexOf(qmVar.b);
                            if (indexOf3 >= 0) {
                                tmVar.J.a.k.g.remove(indexOf3);
                                rm rmVar6 = tmVar.J.a;
                                rm.a(rmVar6, rmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(rmVar) > arrayList2.indexOf(tmVar.J.a)) {
                                    indexOf4++;
                                }
                                f(rmVar, tmVar.J.b, indexOf4);
                                if (tmVar.J.a != rmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            qmVar6 = null;
                                            break;
                                        }
                                        qmVar6 = (qm) arrayList8.get(i25);
                                        if (qmVar6.b == tmVar.J.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (qmVar6 != null) {
                                        g();
                                        qm qmVar9 = tmVar.J;
                                        RectF rectF3 = qmVar6.g;
                                        rm rmVar7 = qmVar6.O;
                                        float f20 = qmVar9.j;
                                        RectF rectF4 = qmVar9.g;
                                        qmVar6.j = AndroidUtilities.lerp(f20, qmVar9.k, qmVar9.e());
                                        if (qmVar6.f == null) {
                                            qmVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = qmVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, qmVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = qmVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, qmVar9.e(), qmVar6.f);
                                            qmVar6.f.set(rectF5.centerX() - (((qmVar6.f.width() / f7) * qmVar9.a.r) / rmVar7.r), rectF5.centerY() - (((qmVar6.f.height() / f7) * qmVar9.a.s) / rmVar7.s), (((qmVar6.f.width() / f7) * qmVar9.a.r) / rmVar7.r) + rectF5.centerX(), (((qmVar6.f.height() / f7) * qmVar9.a.s) / rmVar7.s) + rectF5.centerY());
                                        } else {
                                            qmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * qmVar9.a.r) / rmVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * qmVar9.a.s) / rmVar7.s), (((rectF4.width() / f7) * qmVar9.a.r) / rmVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * qmVar9.a.s) / rmVar7.s) + rectF5.centerY());
                                        }
                                        qmVar6.j = AndroidUtilities.lerp(qmVar6.j, qmVar6.k, qmVar6.e());
                                        qmVar6.h = SystemClock.elapsedRealtime();
                                        tmVar.J = qmVar6;
                                        qmVar6.a = rmVar;
                                        qmVar6.j = 1.0f;
                                        qmVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                tmVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(tmVar.P, false);
                        }
                    }
                    h();
                }
                z10 = true;
                if (action != 1) {
                }
                this.y = 0L;
                removeCallbacks(t6Var);
                this.L = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f7 = 2.0f;
            rmVar2 = null;
        }
        qmVar2 = null;
        action = motionEvent.getAction();
        org.telegram.ui.Cells.t6 t6Var2 = this.M;
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
        removeCallbacks(t6Var2);
        this.L = false;
        if (!z10) {
        }
        return z10;
    }
}
