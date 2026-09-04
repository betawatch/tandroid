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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pm extends ViewGroup {
    public om E;
    public nm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.l7 M;
    public final lm N;
    public int O;
    public final /* synthetic */ qm P;
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
    public pm(qm qmVar, Context context) {
        super(context);
        this.P = qmVar;
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
        this.M = new org.telegram.ui.Cells.l7(this, 7);
        this.N = new lm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, qmVar.n, true);
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
            ArrayList arrayList2 = ((om) arrayList.get(i10)).k.g;
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
        qm qmVar = this.P;
        nm nmVar = qmVar.J;
        PointF pointF = this.K;
        if (nmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (qmVar.K) {
            RectF f7 = nmVar.f(nmVar.e());
            RectF f10 = qmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + qmVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = nmVar.f(nmVar.e());
        RectF f12 = qmVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, qmVar.y - ((qmVar.G - 0.5f) * qmVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + qmVar.J.a.a + f12.top, (qmVar.E - ((qmVar.F - 0.5f) * qmVar.I)) + qmVar.M, this.G);
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
            ArrayList arrayList2 = ((om) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                nm nmVar = (nm) arrayList2.get(i11);
                wh.g gVar = nmVar.s;
                if (gVar != null) {
                    gVar.b(nmVar.O.z);
                    nmVar.s = null;
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
                om omVar = new om(this);
                om.a(omVar, new jm(this.P, arrayList3), false);
                arrayList.add(omVar);
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
            float b10 = ((om) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((om) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(om omVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = omVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (omVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) omVar.k.g.get(10);
            omVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(omVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                om omVar2 = i11 == arrayList2.size() ? null : (om) arrayList2.get(i11);
                if (omVar2 == null) {
                    om omVar3 = new om(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    om.a(omVar3, new jm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(omVar2, photoEntry2, 0);
                }
            }
        }
        om.a(omVar, omVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList.get(i11);
            float b10 = omVar.b();
            omVar.a = f7;
            omVar.b = i10;
            f7 += b10;
            i10 += omVar.k.g.size();
        }
    }

    public final void h() {
        qm qmVar = this.P;
        ValueAnimator valueAnimator = qmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        qmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        qmVar.L = ofFloat;
        ofFloat.addUpdateListener(new km(this, 1));
        qmVar.L.addListener(new j6(this, 13));
        qmVar.L.setDuration(200L);
        qmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        hm hmVar = chatAttachAlertPhotoLayout.G;
        vi viVar = chatAttachAlertPhotoLayout.b;
        tl tlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = tlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = hmVar.f;
                    boolean z12 = hmVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (viVar.Q0 != 0 || viVar.H) {
                        s5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        s5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == hmVar.h() - 1, viVar.i0);
                        if ((viVar.f0 instanceof org.telegram.ui.co) && viVar.T1) {
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
        int f7 = i2.g.f(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != f7) {
            this.s = f7;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            om omVar = (om) arrayList.get(i10);
            if (omVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - omVar.k.g.size();
                om omVar2 = (om) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, omVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) omVar2.k.g.remove(0));
                }
                omVar.k.g.addAll(arrayList2);
                om.a(omVar, omVar.k, true);
                om.a(omVar2, omVar2.k, true);
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
        nm nmVar;
        float f10 = this.n;
        qm qmVar = this.P;
        int computeVerticalScrollOffset = qmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - qmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f10);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f11 = f10;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            om omVar = (om) arrayList2.get(i13);
            float b10 = omVar.b();
            omVar.a = f11;
            omVar.b = i14;
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
                    i14 = omVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = omVar.h;
            int i15 = omVar.l;
            org.telegram.ui.ActionBar.f5 f5Var = omVar.x;
            pm pmVar = omVar.z;
            arrayList = arrayList2;
            float interpolation = omVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - omVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(omVar.f, omVar.d, interpolation);
            int width = pmVar.getWidth();
            qm qmVar2 = pmVar.P;
            float previewScale = width * lerp * qmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = qmVar2.getPreviewScale() * AndroidUtilities.lerp(omVar.g, omVar.e, interpolation) * max;
            if (f5Var != null) {
                omVar.p = 0.0f;
                float width2 = pmVar.getWidth();
                float f14 = i15;
                omVar.n = (width2 - Math.max(f14, previewScale)) / 2.0f;
                omVar.o = (Math.max(f14, previewScale) + pmVar.getWidth()) / 2.0f;
                omVar.q = Math.max(i15 * 2, previewScale2);
                omVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                f5Var.setBounds((int) omVar.n, (int) omVar.p, (int) omVar.o, (int) omVar.q);
                f5Var.setAlpha((int) ((omVar.d <= 0.0f ? 1.0f - interpolation : omVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                f5Var.d(canvas, omVar.y, null);
                omVar.p += f14;
                omVar.n += f14;
                omVar.q -= f14;
                omVar.o -= f14;
            }
            omVar.r = omVar.o - omVar.n;
            omVar.s = omVar.q - omVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                nm nmVar2 = (nm) arrayList3.get(i16);
                if (nmVar2 != null && (((nmVar = qmVar2.J) == null || nmVar.b != nmVar2.b) && nmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = omVar.w;
            RectF rectF = omVar.t;
            long j3 = omVar.i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (omVar.u == null || omVar.v != j3) {
                    omVar.v = j3;
                    omVar.u = new f01(zh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + omVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f15 = omVar.n;
                float f16 = omVar.r;
                float A = com.google.android.gms.internal.vision.e2.A(f16, dp, 2.0f, f15);
                i10 = size;
                float f17 = omVar.p;
                i11 = i13;
                float f18 = omVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f18, dp2, 2.0f, f17), org.telegram.messenger.w1.a(f16, dp, 2.0f, f15), org.telegram.messenger.w1.a(f18, dp2, 2.0f, f17));
                paint.setColor(1610612736);
                float f19 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f19, f19, paint);
                f7 = b10;
                omVar.u.c(AndroidUtilities.dp(14.0f) + (((omVar.r / 2.0f) + omVar.n) - (dp / 2.0f)), omVar.p + (omVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f11 += f7;
            i14 = omVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.W(f11, w0Var.getMeasuredHeight());
        if (w0Var.J()) {
            w0Var.y(canvas, true);
            w0Var.B(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (qmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (qmVar.J.c(canvas, true)) {
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
            this.s = i2.g.f(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        om omVar;
        nm nmVar;
        float f7;
        om omVar2;
        nm nmVar2;
        int action;
        int i10;
        boolean z10;
        nm nmVar3;
        int i11;
        org.telegram.ui.co coVar;
        nm nmVar4;
        jm jmVar;
        ArrayList arrayList;
        nm nmVar5;
        nm nmVar6;
        ValueAnimator valueAnimator;
        jm jmVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        qm qmVar = this.P;
        vi viVar = qmVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                omVar = null;
                break;
            }
            omVar = (om) arrayList2.get(i15);
            float b10 = omVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (omVar != null) {
            ArrayList arrayList3 = omVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                nmVar = (nm) arrayList3.get(i16);
                if (nmVar != null && nmVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        nmVar = null;
        nm nmVar7 = qmVar.J;
        if (nmVar7 != null) {
            RectF f12 = nmVar7.f(nmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            omVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                om omVar3 = (om) arrayList2.get(i17);
                float b12 = omVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            omVar2 = omVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (omVar2 != null) {
                ArrayList arrayList4 = omVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                nmVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    nm nmVar8 = (nm) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (nmVar8 == null || nmVar8 == qmVar.J) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (omVar2.k.g.contains(nmVar8.b)) {
                            RectF d = nmVar8.d();
                            int i20 = nmVar8.i;
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
                            if ((nmVar8.i & 8) > 0) {
                                d.bottom = omVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    nmVar2 = nmVar8;
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
                org.telegram.ui.Cells.l7 l7Var = this.M;
                if (action == 0 || qmVar.J != null || qmVar.r.K1 || (((valueAnimator = qmVar.L) != null && valueAnimator.isRunning()) || omVar == null || nmVar == null || (jmVar2 = omVar.k) == null || !jmVar2.g.contains(nmVar.b))) {
                    i10 = 1;
                    if (action == 2 || qmVar.J == null || qmVar.K) {
                        if (action == 1 || (nmVar5 = qmVar.J) == null) {
                            if (action == 1 || qmVar.J != null || (nmVar3 = this.F) == null || this.E == null) {
                                z10 = false;
                                i10 = 1;
                                if (action == i10 && action != 3) {
                                    return z10;
                                }
                                this.y = 0L;
                                removeCallbacks(l7Var);
                                this.L = false;
                                if (!z10) {
                                    return z10;
                                }
                                h();
                                return true;
                            }
                            if (nmVar3.e && nmVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                nmVar3.m = x11;
                                nmVar3.n = y10;
                                RectF d10 = nmVar3.d();
                                nmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.p.a(nmVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(pr.j);
                                duration.addUpdateListener(new l6(nmVar3, 11));
                                duration.addListener(new mm(nmVar3));
                                duration.start();
                            } else {
                                RectF d11 = nmVar3.d();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                float dp = d11.right - AndroidUtilities.dp(36.4f);
                                float f19 = this.E.p + d11.top;
                                rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                                if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        om omVar4 = (om) arrayList2.get(i21);
                                        if (omVar4 != null && (jmVar = omVar4.k) != null && (arrayList = jmVar.g) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = viVar.Q0;
                                    org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                                    if (i22 != 0) {
                                        i11 = 1;
                                    } else if (n2Var instanceof org.telegram.ui.co) {
                                        coVar = (org.telegram.ui.co) n2Var;
                                        i11 = 0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.R();
                                        }
                                        if (!viVar.Z1.q()) {
                                            AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
                                            AndroidUtilities.hideKeyboard(viVar.getContainer().findFocus());
                                        }
                                        PhotoViewer.t1().K2(null, n2Var, qmVar.a);
                                        PhotoViewer.t1().L2(viVar);
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i23 = viVar.S1;
                                        boolean z11 = viVar.T1;
                                        t12.h = i23;
                                        t12.n = z11;
                                        this.N.a = arrayList6;
                                        PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i11, false, this.N, coVar);
                                        qmVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                            PhotoViewer t13 = PhotoViewer.t1();
                                            Editable text = viVar.m1().getText();
                                            t13.p7 = true;
                                            t13.q7 = text;
                                            nmVar4 = null;
                                            t13.A2(null, text, false, false);
                                            t13.t3(null);
                                            this.F = nmVar4;
                                            this.y = 0L;
                                            qmVar.J = nmVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i11 = 4;
                                    }
                                    coVar = null;
                                    if (n2Var == null) {
                                    }
                                    if (!viVar.Z1.q()) {
                                    }
                                    PhotoViewer.t1().K2(null, n2Var, qmVar.a);
                                    PhotoViewer.t1().L2(viVar);
                                    PhotoViewer t122 = PhotoViewer.t1();
                                    int i232 = viVar.S1;
                                    boolean z112 = viVar.T1;
                                    t122.h = i232;
                                    t122.n = z112;
                                    this.N.a = arrayList6;
                                    PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i11, false, this.N, coVar);
                                    qmVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.T()) {
                                    }
                                } else if (qmVar.getSelectedItemsCount() > 1) {
                                    MediaController.PhotoEntry photoEntry = this.F.b;
                                    int indexOf2 = this.E.k.g.indexOf(photoEntry);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qmVar.P;
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
                                        om omVar5 = this.E;
                                        omVar5.k.g.remove(indexOf2);
                                        om.a(omVar5, omVar5.k, true);
                                        j();
                                        i(qmVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        qmVar.w.k(0L, 82, photoEntry, null, null, new bi.k8(this, omVar5, photoEntry, indexOf2, 16));
                                        postDelayed(new m8(this, i25, 3), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = qmVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                nmVar4 = null;
                                this.F = nmVar4;
                                this.y = 0L;
                                qmVar.J = nmVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (omVar == null || nmVar == null || nmVar == nmVar5) {
                                if (omVar2 == null || nmVar2 == null || nmVar2 == nmVar5 || nmVar2.b == nmVar5.b) {
                                    omVar = null;
                                    nmVar = null;
                                } else {
                                    omVar = omVar2;
                                    nmVar = nmVar2;
                                }
                            }
                            if (omVar != null) {
                                ArrayList arrayList8 = omVar.h;
                                if (nmVar != null && nmVar != nmVar5) {
                                    int indexOf3 = nmVar5.a.k.g.indexOf(nmVar5.b);
                                    int indexOf4 = omVar.k.g.indexOf(nmVar.b);
                                    if (indexOf3 >= 0) {
                                        qmVar.J.a.k.g.remove(indexOf3);
                                        om omVar6 = qmVar.J.a;
                                        om.a(omVar6, omVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(omVar) > arrayList2.indexOf(qmVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(omVar, qmVar.J.b, indexOf4);
                                        if (qmVar.J.a != omVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    nmVar6 = null;
                                                    break;
                                                }
                                                nmVar6 = (nm) arrayList8.get(i26);
                                                if (nmVar6.b == qmVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (nmVar6 != null) {
                                                g();
                                                nm nmVar9 = qmVar.J;
                                                RectF rectF3 = nmVar6.g;
                                                om omVar7 = nmVar6.O;
                                                float f20 = nmVar9.j;
                                                RectF rectF4 = nmVar9.g;
                                                nmVar6.j = AndroidUtilities.lerp(f20, nmVar9.k, nmVar9.e());
                                                if (nmVar6.f == null) {
                                                    nmVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = nmVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF6, rectF3, nmVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = nmVar9.f;
                                                if (rectF7 != null) {
                                                    AndroidUtilities.lerp(rectF7, rectF4, nmVar9.e(), nmVar6.f);
                                                    nmVar6.f.set(rectF5.centerX() - (((nmVar6.f.width() / f7) * nmVar9.a.r) / omVar7.r), rectF5.centerY() - (((nmVar6.f.height() / f7) * nmVar9.a.s) / omVar7.s), (((nmVar6.f.width() / f7) * nmVar9.a.r) / omVar7.r) + rectF5.centerX(), (((nmVar6.f.height() / f7) * nmVar9.a.s) / omVar7.s) + rectF5.centerY());
                                                } else {
                                                    nmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * nmVar9.a.r) / omVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * nmVar9.a.s) / omVar7.s), (((rectF4.width() / f7) * nmVar9.a.r) / omVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * nmVar9.a.s) / omVar7.s) + rectF5.centerY());
                                                }
                                                nmVar6.j = AndroidUtilities.lerp(nmVar6.j, nmVar6.k, nmVar6.e());
                                                nmVar6.h = SystemClock.elapsedRealtime();
                                                qmVar.J = nmVar6;
                                                nmVar6.a = omVar;
                                                nmVar6.j = 1.0f;
                                                nmVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        qmVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(qmVar.P, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        if (action == i10) {
                        }
                        this.y = 0L;
                        removeCallbacks(l7Var);
                        this.L = false;
                        if (!z10) {
                        }
                    } else {
                        qmVar.y = x10;
                        qmVar.E = y3;
                        if (!this.L) {
                            this.L = true;
                            postDelayed(l7Var, 16L);
                        }
                        invalidate();
                    }
                } else {
                    this.E = omVar;
                    this.F = nmVar;
                    qmVar.y = x10;
                    qmVar.E = y3;
                    qmVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    i10 = 1;
                    AndroidUtilities.runOnUIThread(new a3.g0(this, elapsedRealtime, this.F, 20), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                if (action == i10) {
                }
                this.y = 0L;
                removeCallbacks(l7Var);
                this.L = false;
                if (!z10) {
                }
            }
        } else {
            f7 = 2.0f;
            omVar2 = null;
        }
        nmVar2 = null;
        action = motionEvent.getAction();
        org.telegram.ui.Cells.l7 l7Var2 = this.M;
        if (action == 0) {
        }
        i10 = 1;
        if (action == 2) {
        }
        if (action == 1) {
        }
        if (action == 1) {
        }
        z10 = false;
        i10 = 1;
        if (action == i10) {
        }
        this.y = 0L;
        removeCallbacks(l7Var2);
        this.L = false;
        if (!z10) {
        }
    }
}
