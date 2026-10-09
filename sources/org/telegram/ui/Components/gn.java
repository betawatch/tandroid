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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gn extends ViewGroup {
    public fn E;
    public en F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final cn N;
    public int O;
    public final /* synthetic */ hn P;
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
    public gn(hn hnVar, Context context) {
        super(context);
        this.P = hnVar;
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
        this.M = new org.telegram.ui.Cells.t6(this, 7);
        this.N = new cn(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, hnVar.n, true);
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
            ArrayList arrayList2 = ((fn) arrayList.get(i10)).k.g;
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
        hn hnVar = this.P;
        en enVar = hnVar.J;
        PointF pointF = this.K;
        if (enVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (hnVar.K) {
            RectF f7 = enVar.f(enVar.e());
            RectF f10 = hnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + hnVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = enVar.f(enVar.e());
        RectF f12 = hnVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, hnVar.y - ((hnVar.G - 0.5f) * hnVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + hnVar.J.a.a + f12.top, (hnVar.E - ((hnVar.F - 0.5f) * hnVar.I)) + hnVar.M, this.G);
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
            ArrayList arrayList2 = ((fn) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                en enVar = (en) arrayList2.get(i11);
                vh.f fVar = enVar.s;
                if (fVar != null) {
                    fVar.b(enVar.O.z);
                    enVar.s = null;
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
                fn fnVar = new fn(this);
                fn.a(fnVar, new an(this.P, arrayList3), false);
                arrayList.add(fnVar);
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
            float b10 = ((fn) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((fn) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(fn fnVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = fnVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (fnVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) fnVar.k.g.get(10);
            fnVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(fnVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                fn fnVar2 = i11 == arrayList2.size() ? null : (fn) arrayList2.get(i11);
                if (fnVar2 == null) {
                    fn fnVar3 = new fn(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    fn.a(fnVar3, new an(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(fnVar2, photoEntry2, 0);
                }
            }
        }
        fn.a(fnVar, fnVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            fn fnVar = (fn) arrayList.get(i11);
            float b10 = fnVar.b();
            fnVar.a = f7;
            fnVar.b = i10;
            f7 += b10;
            i10 += fnVar.k.g.size();
        }
    }

    public final void h() {
        hn hnVar = this.P;
        ValueAnimator valueAnimator = hnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        hnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        hnVar.L = ofFloat;
        ofFloat.addUpdateListener(new bn(this, 1));
        hnVar.L.addListener(new t8(this, 10));
        hnVar.L.setDuration(200L);
        hnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        ym ymVar = chatAttachAlertPhotoLayout.G;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        km kmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z12 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = kmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = kmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = ymVar.f;
                    boolean z14 = ymVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (yiVar.T0 != 0 || yiVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == ymVar.h() - 1, yiVar.i0);
                        if ((yiVar.f0 instanceof org.telegram.ui.zn) && yiVar.W1) {
                            z11 = false;
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            z11 = false;
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
            this.P.b.Z1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int b10 = org.telegram.messenger.q.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
            fn fnVar = (fn) arrayList.get(i10);
            if (fnVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - fnVar.k.g.size();
                fn fnVar2 = (fn) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, fnVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) fnVar2.k.g.remove(0));
                }
                fnVar.k.g.addAll(arrayList2);
                fn.a(fnVar, fnVar.k, true);
                fn.a(fnVar2, fnVar2.k, true);
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
        en enVar;
        float f11 = this.n;
        hn hnVar = this.P;
        int computeVerticalScrollOffset = hnVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - hnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            fn fnVar = (fn) arrayList2.get(i13);
            float b10 = fnVar.b();
            fnVar.a = f12;
            fnVar.b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.w) && (f12 > f13 || f14 < this.w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = fnVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = fnVar.h;
            int i15 = fnVar.l;
            org.telegram.ui.ActionBar.f5 f5Var = fnVar.x;
            gn gnVar = fnVar.z;
            arrayList = arrayList2;
            float interpolation = fnVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - fnVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(fnVar.f, fnVar.d, interpolation);
            int width = gnVar.getWidth();
            hn hnVar2 = gnVar.P;
            float previewScale = width * lerp * hnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = hnVar2.getPreviewScale() * AndroidUtilities.lerp(fnVar.g, fnVar.e, interpolation) * max;
            if (f5Var != null) {
                f10 = 2.0f;
                fnVar.p = 0.0f;
                float width2 = gnVar.getWidth();
                float f15 = i15;
                fnVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                fnVar.o = (Math.max(f15, previewScale) + gnVar.getWidth()) / 2.0f;
                fnVar.q = Math.max(i15 * 2, previewScale2);
                fnVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                f5Var.setBounds((int) fnVar.n, (int) fnVar.p, (int) fnVar.o, (int) fnVar.q);
                f5Var.setAlpha((int) ((fnVar.d <= 0.0f ? 1.0f - interpolation : fnVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                f5Var.d(canvas, fnVar.y, null);
                fnVar.p += f15;
                fnVar.n += f15;
                fnVar.q -= f15;
                fnVar.o -= f15;
            } else {
                f10 = 2.0f;
            }
            fnVar.r = fnVar.o - fnVar.n;
            fnVar.s = fnVar.q - fnVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                en enVar2 = (en) arrayList3.get(i16);
                if (enVar2 != null && (((enVar = hnVar2.J) == null || enVar.b != enVar2.b) && enVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = fnVar.w;
            RectF rectF = fnVar.t;
            long j3 = fnVar.i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (fnVar.u == null || fnVar.v != j3) {
                    fnVar.v = j3;
                    fnVar.u = new l11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + fnVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = fnVar.n;
                float f17 = fnVar.r;
                float f18 = f10;
                float z12 = com.google.android.gms.internal.vision.e2.z(f17, dp, f18, f16);
                i10 = size;
                float f19 = fnVar.p;
                i11 = i13;
                float f20 = fnVar.s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.vision.e2.z(f20, dp2, f18, f19), org.telegram.messenger.q.a(f17, dp, f18, f16), org.telegram.messenger.q.a(f20, dp2, f18, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / f18;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                l11 l11Var = fnVar.u;
                float dp3 = AndroidUtilities.dp(14.0f) + (((fnVar.r / f18) + fnVar.n) - (dp / f18));
                float f22 = fnVar.p + (fnVar.s / f18);
                f7 = b10;
                l11Var.c(dp3, f22, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = fnVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.a0(f12, w0Var.getMeasuredHeight());
        if (w0Var.K()) {
            w0Var.B(canvas, true);
            w0Var.D(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (hnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (hnVar.J.c(canvas, true)) {
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
            this.s = org.telegram.messenger.q.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fn fnVar;
        en enVar;
        float f7;
        fn fnVar2;
        en enVar2;
        int action;
        boolean z10;
        en enVar3;
        int i10;
        org.telegram.ui.zn znVar;
        en enVar4;
        an anVar;
        ArrayList arrayList;
        int i11;
        en enVar5;
        en enVar6;
        ValueAnimator valueAnimator;
        an anVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        hn hnVar = this.P;
        yi yiVar = hnVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                fnVar = null;
                break;
            }
            fnVar = (fn) arrayList2.get(i15);
            float b10 = fnVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (fnVar != null) {
            ArrayList arrayList3 = fnVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                enVar = (en) arrayList3.get(i16);
                if (enVar != null && enVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        enVar = null;
        en enVar7 = hnVar.J;
        if (enVar7 != null) {
            RectF f12 = enVar7.f(enVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            fnVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                fn fnVar3 = (fn) arrayList2.get(i17);
                float b12 = fnVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            fnVar2 = fnVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (fnVar2 != null) {
                ArrayList arrayList4 = fnVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                enVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    en enVar8 = (en) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (enVar8 == null || enVar8 == hnVar.J) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (fnVar2.k.g.contains(enVar8.b)) {
                            RectF d = enVar8.d();
                            int i20 = enVar8.i;
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
                            if ((enVar8.i & 8) > 0) {
                                d.bottom = fnVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    enVar2 = enVar8;
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
                org.telegram.ui.Cells.t6 t6Var = this.M;
                if (action == 0 || hnVar.J != null || hnVar.r.I1 || (((valueAnimator = hnVar.L) != null && valueAnimator.isRunning()) || fnVar == null || enVar == null || (anVar2 = fnVar.k) == null || !anVar2.g.contains(enVar.b))) {
                    if (action == 2 || hnVar.J == null || hnVar.K) {
                        if (action == 1 || (enVar5 = hnVar.J) == null) {
                            if (action == 1 || hnVar.J != null || (enVar3 = this.F) == null || this.E == null) {
                                z10 = false;
                                i11 = 1;
                                if (action != i11 || action == 3) {
                                    this.y = 0L;
                                    removeCallbacks(t6Var);
                                    this.L = false;
                                    if (!z10) {
                                        h();
                                        return i11;
                                    }
                                }
                                return z10;
                            }
                            if (enVar3.e && enVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                enVar3.m = x11;
                                enVar3.n = y10;
                                RectF d10 = enVar3.d();
                                enVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.o.a(enVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(hs.j);
                                duration.addUpdateListener(new m6(enVar3, 12));
                                duration.addListener(new dn(enVar3));
                                duration.start();
                            } else {
                                RectF d11 = enVar3.d();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                float dp = d11.right - AndroidUtilities.dp(36.4f);
                                float f19 = this.E.p + d11.top;
                                rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                                if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        fn fnVar4 = (fn) arrayList2.get(i21);
                                        if (fnVar4 != null && (anVar = fnVar4.k) != null && (arrayList = anVar.g) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = yiVar.T0;
                                    org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
                                    if (i22 != 0) {
                                        i10 = 1;
                                    } else if (n2Var instanceof org.telegram.ui.zn) {
                                        znVar = (org.telegram.ui.zn) n2Var;
                                        i10 = 0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.R();
                                        }
                                        if (!yiVar.c2.i0()) {
                                            AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
                                            AndroidUtilities.hideKeyboard(yiVar.getContainer().findFocus());
                                        }
                                        PhotoViewer.t1().K2(null, n2Var, hnVar.a);
                                        PhotoViewer.t1().L2(yiVar);
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i23 = yiVar.V1;
                                        boolean z11 = yiVar.W1;
                                        t12.h = i23;
                                        t12.n = z11;
                                        this.N.a = arrayList6;
                                        PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i10, false, this.N, znVar);
                                        hnVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                            PhotoViewer t13 = PhotoViewer.t1();
                                            Editable text = yiVar.o1().getText();
                                            t13.p7 = true;
                                            t13.q7 = text;
                                            enVar4 = null;
                                            t13.A2(null, text, false, false);
                                            t13.t3(null);
                                            this.F = enVar4;
                                            this.y = 0L;
                                            hnVar.J = enVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i10 = 4;
                                    }
                                    znVar = null;
                                    if (n2Var == null) {
                                    }
                                    if (!yiVar.c2.i0()) {
                                    }
                                    PhotoViewer.t1().K2(null, n2Var, hnVar.a);
                                    PhotoViewer.t1().L2(yiVar);
                                    PhotoViewer t122 = PhotoViewer.t1();
                                    int i232 = yiVar.V1;
                                    boolean z112 = yiVar.W1;
                                    t122.h = i232;
                                    t122.n = z112;
                                    this.N.a = arrayList6;
                                    PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i10, false, this.N, znVar);
                                    hnVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.T()) {
                                    }
                                } else if (hnVar.getSelectedItemsCount() > 1) {
                                    MediaController.PhotoEntry photoEntry = this.F.b;
                                    int indexOf2 = this.E.k.g.indexOf(photoEntry);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hnVar.P;
                                        if (chatAttachAlertPhotoLayout != null) {
                                            ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                            int size5 = arrayList7.size();
                                            int i24 = 0;
                                            while (true) {
                                                if (i24 >= size5) {
                                                    break;
                                                }
                                                if (((Map.Entry) arrayList7.get(i24)).getValue() == photoEntry) {
                                                    this.c.put(photoEntry, ((Map.Entry) arrayList7.get(i24)).getKey());
                                                    break;
                                                }
                                                i24++;
                                            }
                                        }
                                        fn fnVar5 = this.E;
                                        fnVar5.k.g.remove(indexOf2);
                                        fn.a(fnVar5, fnVar5.k, true);
                                        j();
                                        i(hnVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        hnVar.w.k(0L, 82, photoEntry, null, null, new ai.d9(this, fnVar5, photoEntry, indexOf2, 16));
                                        postDelayed(new nd(this, i25, 2), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = hnVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                enVar4 = null;
                                this.F = enVar4;
                                this.y = 0L;
                                hnVar.J = enVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (fnVar == null || enVar == null || enVar == enVar5) {
                                if (fnVar2 == null || enVar2 == null || enVar2 == enVar5 || enVar2.b == enVar5.b) {
                                    fnVar = null;
                                    enVar = null;
                                } else {
                                    fnVar = fnVar2;
                                    enVar = enVar2;
                                }
                            }
                            if (fnVar != null) {
                                ArrayList arrayList8 = fnVar.h;
                                if (enVar != null && enVar != enVar5) {
                                    int indexOf3 = enVar5.a.k.g.indexOf(enVar5.b);
                                    int indexOf4 = fnVar.k.g.indexOf(enVar.b);
                                    if (indexOf3 >= 0) {
                                        hnVar.J.a.k.g.remove(indexOf3);
                                        fn fnVar6 = hnVar.J.a;
                                        fn.a(fnVar6, fnVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(fnVar) > arrayList2.indexOf(hnVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(fnVar, hnVar.J.b, indexOf4);
                                        if (hnVar.J.a != fnVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    enVar6 = null;
                                                    break;
                                                }
                                                enVar6 = (en) arrayList8.get(i26);
                                                if (enVar6.b == hnVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (enVar6 != null) {
                                                g();
                                                en enVar9 = hnVar.J;
                                                RectF rectF3 = enVar6.g;
                                                fn fnVar7 = enVar6.O;
                                                float f20 = enVar9.j;
                                                RectF rectF4 = enVar9.g;
                                                enVar6.j = AndroidUtilities.lerp(f20, enVar9.k, enVar9.e());
                                                if (enVar6.f == null) {
                                                    enVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = enVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF6, rectF3, enVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = enVar9.f;
                                                if (rectF7 != null) {
                                                    AndroidUtilities.lerp(rectF7, rectF4, enVar9.e(), enVar6.f);
                                                    enVar6.f.set(rectF5.centerX() - (((enVar6.f.width() / f7) * enVar9.a.r) / fnVar7.r), rectF5.centerY() - (((enVar6.f.height() / f7) * enVar9.a.s) / fnVar7.s), (((enVar6.f.width() / f7) * enVar9.a.r) / fnVar7.r) + rectF5.centerX(), (((enVar6.f.height() / f7) * enVar9.a.s) / fnVar7.s) + rectF5.centerY());
                                                } else {
                                                    enVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * enVar9.a.r) / fnVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * enVar9.a.s) / fnVar7.s), (((rectF4.width() / f7) * enVar9.a.r) / fnVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * enVar9.a.s) / fnVar7.s) + rectF5.centerY());
                                                }
                                                enVar6.j = AndroidUtilities.lerp(enVar6.j, enVar6.k, enVar6.e());
                                                enVar6.h = SystemClock.elapsedRealtime();
                                                hnVar.J = enVar6;
                                                enVar6.a = fnVar;
                                                enVar6.j = 1.0f;
                                                enVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        hnVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(hnVar.P, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i11 = 1;
                        if (action != i11) {
                        }
                        this.y = 0L;
                        removeCallbacks(t6Var);
                        this.L = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    hnVar.y = x10;
                    hnVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(t6Var, 16L);
                    }
                    invalidate();
                } else {
                    this.E = fnVar;
                    this.F = enVar;
                    hnVar.y = x10;
                    hnVar.E = y3;
                    hnVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new a3.h0(this, elapsedRealtime, this.F, 20), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i11 = 1;
                if (action != i11) {
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
            fnVar2 = null;
        }
        enVar2 = null;
        action = motionEvent.getAction();
        org.telegram.ui.Cells.t6 t6Var2 = this.M;
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
        this.y = 0L;
        removeCallbacks(t6Var2);
        this.L = false;
        if (!z10) {
        }
        return z10;
    }
}
