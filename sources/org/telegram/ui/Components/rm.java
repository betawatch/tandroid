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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rm extends ViewGroup {
    public qm E;
    public pm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final nm N;
    public int O;
    public final /* synthetic */ sm P;
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
    public rm(sm smVar, Context context) {
        super(context);
        this.P = smVar;
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
        this.N = new nm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, smVar.n, true);
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
            ArrayList arrayList2 = ((qm) arrayList.get(i10)).k.g;
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
        sm smVar = this.P;
        pm pmVar = smVar.J;
        PointF pointF = this.K;
        if (pmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (smVar.K) {
            RectF f7 = pmVar.f(pmVar.e());
            RectF f10 = smVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + smVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = pmVar.f(pmVar.e());
        RectF f12 = smVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, smVar.y - ((smVar.G - 0.5f) * smVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + smVar.J.a.a + f12.top, (smVar.E - ((smVar.F - 0.5f) * smVar.I)) + smVar.M, this.G);
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
            ArrayList arrayList2 = ((qm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                pm pmVar = (pm) arrayList2.get(i11);
                vh.f fVar = pmVar.s;
                if (fVar != null) {
                    fVar.b(pmVar.O.z);
                    pmVar.s = null;
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
                qm qmVar = new qm(this);
                qm.a(qmVar, new lm(this.P, arrayList3), false);
                arrayList.add(qmVar);
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
            float b10 = ((qm) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((qm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(qm qmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = qmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (qmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) qmVar.k.g.get(10);
            qmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(qmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                qm qmVar2 = i11 == arrayList2.size() ? null : (qm) arrayList2.get(i11);
                if (qmVar2 == null) {
                    qm qmVar3 = new qm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    qm.a(qmVar3, new lm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(qmVar2, photoEntry2, 0);
                }
            }
        }
        qm.a(qmVar, qmVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            qm qmVar = (qm) arrayList.get(i11);
            float b10 = qmVar.b();
            qmVar.a = f7;
            qmVar.b = i10;
            f7 += b10;
            i10 += qmVar.k.g.size();
        }
    }

    public final void h() {
        sm smVar = this.P;
        ValueAnimator valueAnimator = smVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        smVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        smVar.L = ofFloat;
        ofFloat.addUpdateListener(new mm(this, 1));
        smVar.L.addListener(new r8(this, 10));
        smVar.L.setDuration(200L);
        smVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        jm jmVar = chatAttachAlertPhotoLayout.G;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        vl vlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = vlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = vlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = jmVar.f;
                    boolean z12 = jmVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (wiVar.Q0 != 0 || wiVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == jmVar.h() - 1, wiVar.i0);
                        if ((wiVar.f0 instanceof org.telegram.ui.wn) && wiVar.T1) {
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
            qm qmVar = (qm) arrayList.get(i10);
            if (qmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - qmVar.k.g.size();
                qm qmVar2 = (qm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, qmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) qmVar2.k.g.remove(0));
                }
                qmVar.k.g.addAll(arrayList2);
                qm.a(qmVar, qmVar.k, true);
                qm.a(qmVar2, qmVar2.k, true);
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
        pm pmVar;
        float f10 = this.n;
        sm smVar = this.P;
        int computeVerticalScrollOffset = smVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - smVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - smVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f10);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f11 = f10;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            qm qmVar = (qm) arrayList2.get(i13);
            float b10 = qmVar.b();
            qmVar.a = f11;
            qmVar.b = i14;
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
                    i14 = qmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = qmVar.h;
            int i15 = qmVar.l;
            org.telegram.ui.ActionBar.d5 d5Var = qmVar.x;
            rm rmVar = qmVar.z;
            arrayList = arrayList2;
            float interpolation = qmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - qmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(qmVar.f, qmVar.d, interpolation);
            int width = rmVar.getWidth();
            sm smVar2 = rmVar.P;
            float previewScale = width * lerp * smVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = smVar2.getPreviewScale() * AndroidUtilities.lerp(qmVar.g, qmVar.e, interpolation) * max;
            if (d5Var != null) {
                qmVar.p = 0.0f;
                float width2 = rmVar.getWidth();
                float f14 = i15;
                qmVar.n = (width2 - Math.max(f14, previewScale)) / 2.0f;
                qmVar.o = (Math.max(f14, previewScale) + rmVar.getWidth()) / 2.0f;
                qmVar.q = Math.max(i15 * 2, previewScale2);
                qmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) qmVar.n, (int) qmVar.p, (int) qmVar.o, (int) qmVar.q);
                d5Var.setAlpha((int) ((qmVar.d <= 0.0f ? 1.0f - interpolation : qmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                d5Var.d(canvas, qmVar.y, null);
                qmVar.p += f14;
                qmVar.n += f14;
                qmVar.q -= f14;
                qmVar.o -= f14;
            }
            qmVar.r = qmVar.o - qmVar.n;
            qmVar.s = qmVar.q - qmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                pm pmVar2 = (pm) arrayList3.get(i16);
                if (pmVar2 != null && (((pmVar = smVar2.J) == null || pmVar.b != pmVar2.b) && pmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = qmVar.w;
            RectF rectF = qmVar.t;
            long j3 = qmVar.i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (qmVar.u == null || qmVar.v != j3) {
                    qmVar.v = j3;
                    qmVar.u = new v01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + qmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f15 = qmVar.n;
                float f16 = qmVar.r;
                float A = com.google.android.gms.internal.vision.e2.A(f16, dp, 2.0f, f15);
                i10 = size;
                float f17 = qmVar.p;
                i11 = i13;
                float f18 = qmVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f18, dp2, 2.0f, f17), org.telegram.messenger.f0.a(f16, dp, 2.0f, f15), org.telegram.messenger.f0.a(f18, dp2, 2.0f, f17));
                paint.setColor(1610612736);
                float f19 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f19, f19, paint);
                f7 = b10;
                qmVar.u.c(AndroidUtilities.dp(14.0f) + (((qmVar.r / 2.0f) + qmVar.n) - (dp / 2.0f)), qmVar.p + (qmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f11 += f7;
            i14 = qmVar.k.g.size() + i12;
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
        if (smVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (smVar.J.c(canvas, true)) {
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
        qm qmVar;
        pm pmVar;
        float f7;
        qm qmVar2;
        pm pmVar2;
        int action;
        boolean z10;
        pm pmVar3;
        int i10;
        org.telegram.ui.wn wnVar;
        pm pmVar4;
        lm lmVar;
        ArrayList arrayList;
        pm pmVar5;
        pm pmVar6;
        ValueAnimator valueAnimator;
        lm lmVar2;
        int i11;
        int i12;
        int i13;
        float f10;
        sm smVar = this.P;
        wi wiVar = smVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i14 >= size) {
                qmVar = null;
                break;
            }
            qmVar = (qm) arrayList2.get(i14);
            float b10 = qmVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i14++;
        }
        if (qmVar != null) {
            ArrayList arrayList3 = qmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                pmVar = (pm) arrayList3.get(i15);
                if (pmVar != null && pmVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        pmVar = null;
        pm pmVar7 = smVar.J;
        if (pmVar7 != null) {
            RectF f12 = pmVar7.f(pmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i16 = 0;
            qmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i16 < size) {
                qm qmVar3 = (qm) arrayList2.get(i16);
                float b12 = qmVar3.b() + f15;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            qmVar2 = qmVar3;
                        }
                    }
                }
                i16++;
                f15 = b12;
                size = i17;
            }
            if (qmVar2 != null) {
                ArrayList arrayList4 = qmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                pmVar2 = null;
                float f18 = 0.0f;
                while (i18 < size3) {
                    pm pmVar8 = (pm) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (pmVar8 == null || pmVar8 == smVar.J) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (qmVar2.k.g.contains(pmVar8.b)) {
                            RectF d = pmVar8.d();
                            int i19 = pmVar8.i;
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
                            if ((pmVar8.i & 8) > 0) {
                                d.bottom = qmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    pmVar2 = pmVar8;
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
                if (action != 0 && smVar.J == null && !smVar.r.K1 && (((valueAnimator = smVar.L) == null || !valueAnimator.isRunning()) && qmVar != null && pmVar != null && (lmVar2 = qmVar.k) != null && lmVar2.g.contains(pmVar.b))) {
                    this.E = qmVar;
                    this.F = pmVar;
                    smVar.y = x10;
                    smVar.E = y3;
                    smVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new a3.h0(this, elapsedRealtime, this.F, 20), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && smVar.J != null && !smVar.K) {
                    smVar.y = x10;
                    smVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(t6Var, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (pmVar5 = smVar.J) == null) {
                    if (action == 1 || smVar.J != null || (pmVar3 = this.F) == null || this.E == null) {
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
                    if (pmVar3.e && pmVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        pmVar3.m = x11;
                        pmVar3.n = y10;
                        RectF d10 = pmVar3.d();
                        pmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.q.a(pmVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(sr.j);
                        duration.addUpdateListener(new k6(pmVar3, 11));
                        duration.addListener(new om(pmVar3));
                        duration.start();
                    } else {
                        RectF d11 = pmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f19 = this.E.p + d11.top;
                        rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                        if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                qm qmVar4 = (qm) arrayList2.get(i20);
                                if (qmVar4 != null && (lmVar = qmVar4.k) != null && (arrayList = lmVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.F.b);
                            int i21 = wiVar.Q0;
                            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (m2Var instanceof org.telegram.ui.wn) {
                                wnVar = (org.telegram.ui.wn) m2Var;
                                i10 = 0;
                                if (m2Var == null) {
                                    m2Var = LaunchActivity.R();
                                }
                                if (!wiVar.Z1.c0()) {
                                    AndroidUtilities.hideKeyboard(m2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(wiVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().J2(null, m2Var, smVar.a);
                                PhotoViewer.t1().K2(wiVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = wiVar.S1;
                                boolean z11 = wiVar.T1;
                                t12.h = i22;
                                t12.n = z11;
                                this.N.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.N, wnVar);
                                smVar.P.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = wiVar.m1().getText();
                                    t13.p7 = true;
                                    t13.q7 = text;
                                    pmVar4 = null;
                                    t13.z2(null, text, false, false);
                                    t13.s3(null);
                                    this.F = pmVar4;
                                    this.y = 0L;
                                    smVar.J = pmVar4;
                                    this.G = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            wnVar = null;
                            if (m2Var == null) {
                            }
                            if (!wiVar.Z1.c0()) {
                            }
                            PhotoViewer.t1().J2(null, m2Var, smVar.a);
                            PhotoViewer.t1().K2(wiVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = wiVar.S1;
                            boolean z112 = wiVar.T1;
                            t122.h = i222;
                            t122.n = z112;
                            this.N.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.N, wnVar);
                            smVar.P.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (smVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.F.b;
                            int indexOf2 = this.E.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = smVar.P;
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
                                qm qmVar5 = this.E;
                                qmVar5.k.g.remove(indexOf2);
                                qm.a(qmVar5, qmVar5.k, true);
                                j();
                                i(smVar.P, false);
                                int i24 = this.O + 1;
                                this.O = i24;
                                smVar.w.k(0L, 82, photoEntry, null, null, new ai.c9(this, qmVar5, photoEntry, indexOf2, 16));
                                postDelayed(new ld(this, i24, 2), 4000L);
                            }
                            ValueAnimator valueAnimator2 = smVar.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        pmVar4 = null;
                        this.F = pmVar4;
                        this.y = 0L;
                        smVar.J = pmVar4;
                        this.G = 0.0f;
                    }
                } else {
                    if (qmVar == null || pmVar == null || pmVar == pmVar5) {
                        if (qmVar2 == null || pmVar2 == null || pmVar2 == pmVar5 || pmVar2.b == pmVar5.b) {
                            qmVar = null;
                            pmVar = null;
                        } else {
                            qmVar = qmVar2;
                            pmVar = pmVar2;
                        }
                    }
                    if (qmVar != null) {
                        ArrayList arrayList8 = qmVar.h;
                        if (pmVar != null && pmVar != pmVar5) {
                            int indexOf3 = pmVar5.a.k.g.indexOf(pmVar5.b);
                            int indexOf4 = qmVar.k.g.indexOf(pmVar.b);
                            if (indexOf3 >= 0) {
                                smVar.J.a.k.g.remove(indexOf3);
                                qm qmVar6 = smVar.J.a;
                                qm.a(qmVar6, qmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(qmVar) > arrayList2.indexOf(smVar.J.a)) {
                                    indexOf4++;
                                }
                                f(qmVar, smVar.J.b, indexOf4);
                                if (smVar.J.a != qmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            pmVar6 = null;
                                            break;
                                        }
                                        pmVar6 = (pm) arrayList8.get(i25);
                                        if (pmVar6.b == smVar.J.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (pmVar6 != null) {
                                        g();
                                        pm pmVar9 = smVar.J;
                                        RectF rectF3 = pmVar6.g;
                                        qm qmVar7 = pmVar6.O;
                                        float f20 = pmVar9.j;
                                        RectF rectF4 = pmVar9.g;
                                        pmVar6.j = AndroidUtilities.lerp(f20, pmVar9.k, pmVar9.e());
                                        if (pmVar6.f == null) {
                                            pmVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = pmVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, pmVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = pmVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, pmVar9.e(), pmVar6.f);
                                            pmVar6.f.set(rectF5.centerX() - (((pmVar6.f.width() / f7) * pmVar9.a.r) / qmVar7.r), rectF5.centerY() - (((pmVar6.f.height() / f7) * pmVar9.a.s) / qmVar7.s), (((pmVar6.f.width() / f7) * pmVar9.a.r) / qmVar7.r) + rectF5.centerX(), (((pmVar6.f.height() / f7) * pmVar9.a.s) / qmVar7.s) + rectF5.centerY());
                                        } else {
                                            pmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * pmVar9.a.r) / qmVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * pmVar9.a.s) / qmVar7.s), (((rectF4.width() / f7) * pmVar9.a.r) / qmVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * pmVar9.a.s) / qmVar7.s) + rectF5.centerY());
                                        }
                                        pmVar6.j = AndroidUtilities.lerp(pmVar6.j, pmVar6.k, pmVar6.e());
                                        pmVar6.h = SystemClock.elapsedRealtime();
                                        smVar.J = pmVar6;
                                        pmVar6.a = qmVar;
                                        pmVar6.j = 1.0f;
                                        pmVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                smVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(smVar.P, false);
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
            qmVar2 = null;
        }
        pmVar2 = null;
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
