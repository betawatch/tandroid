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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pm extends ViewGroup {
    public om B;
    public nm C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final lm K;
    public int L;
    public final /* synthetic */ qm M;
    public final org.telegram.ui.Cells.v0 a;
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
        this.M = qmVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = AndroidUtilities.dp(16.0f);
        this.r = AndroidUtilities.dp(64.0f);
        this.s = 0;
        this.x = null;
        this.y = 0L;
        this.B = null;
        this.C = null;
        this.D = 0.0f;
        this.H = new PointF();
        this.I = false;
        this.J = new m2.b(this, 16);
        this.K = new lm(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, qmVar.n, true);
        this.a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.M.M.getSelectedPhotos();
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
        qm qmVar = this.M;
        nm nmVar = qmVar.G;
        PointF pointF = this.H;
        if (nmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (qmVar.H) {
            RectF f10 = nmVar.f(nmVar.e());
            RectF f11 = qmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + qmVar.G.a.a + f11.top, this.F, this.D / this.G);
            return pointF;
        }
        RectF f12 = nmVar.f(nmVar.e());
        RectF f13 = qmVar.G.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, qmVar.y - ((qmVar.D - 0.5f) * qmVar.E), this.D);
        pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + qmVar.G.a.a + f13.top, (qmVar.B - ((qmVar.C - 0.5f) * qmVar.F)) + qmVar.J, this.D);
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
                jh.j jVar = nmVar.s;
                if (jVar != null) {
                    jVar.b(nmVar.O.z);
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
                om.a(omVar, new im(this.M, arrayList3), false);
                arrayList.add(omVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.n;
        int computeVerticalScrollOffset = this.M.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.w = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((om) arrayList.get(i10)).b() + f10;
            float f11 = this.v;
            zArr[i10] = (f10 >= f11 && f10 <= this.w) || (b10 >= f11 && b10 <= this.w) || (f10 <= f11 && b10 >= this.w);
            i10++;
            f10 = b10;
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
            i10 = (int) (((om) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i10;
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
                    om.a(omVar3, new im(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(omVar2, photoEntry2, 0);
                }
            }
        }
        om.a(omVar, omVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList.get(i11);
            float b10 = omVar.b();
            omVar.a = f10;
            omVar.b = i10;
            f10 += b10;
            i10 += omVar.k.g.size();
        }
    }

    public final void h() {
        qm qmVar = this.M;
        ValueAnimator valueAnimator = qmVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        qmVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        qmVar.I = ofFloat;
        ofFloat.addUpdateListener(new km(this, 1));
        qmVar.I.addListener(new a9(this, 9));
        qmVar.I.setDuration(200L);
        qmVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        mi miVar = chatAttachAlertPhotoLayout.b;
        ql qlVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.q1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z4) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = qlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z10 = fmVar.f;
                    boolean z11 = fmVar.d;
                    if (z10 && R > chatAttachAlertPhotoLayout.J0) {
                        R--;
                    }
                    if (z11 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (miVar.N0 != 0 || miVar.E) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z11 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0, R == fmVar.h() - 1, miVar.f0);
                        if ((miVar.c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.M.b.V1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int c3 = l.d.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != c3) {
            this.s = c3;
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
        float f10;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        nm nmVar;
        float f11 = this.n;
        qm qmVar = this.M;
        int computeVerticalScrollOffset = qmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - qmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            om omVar = (om) arrayList2.get(i13);
            float b10 = omVar.b();
            omVar.a = f12;
            omVar.b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.w) && (f12 > f13 || f14 < this.w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f10);
                    f12 += f10;
                    i14 = omVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = omVar.h;
            int i15 = omVar.l;
            org.telegram.ui.ActionBar.h5 h5Var = omVar.x;
            pm pmVar = omVar.z;
            arrayList = arrayList2;
            float interpolation = omVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - omVar.c) / 200.0f));
            boolean z4 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(omVar.f, omVar.d, interpolation);
            int width = pmVar.getWidth();
            qm qmVar2 = pmVar.M;
            float previewScale = width * lerp * qmVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = qmVar2.getPreviewScale() * AndroidUtilities.lerp(omVar.g, omVar.e, interpolation) * max;
            if (h5Var != null) {
                omVar.p = 0.0f;
                float width2 = pmVar.getWidth();
                float f15 = i15;
                omVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                omVar.o = (Math.max(f15, previewScale) + pmVar.getWidth()) / 2.0f;
                omVar.q = Math.max(i15 * 2, previewScale2);
                omVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                h5Var.setBounds((int) omVar.n, (int) omVar.p, (int) omVar.o, (int) omVar.q);
                h5Var.setAlpha((int) ((omVar.d <= 0.0f ? 1.0f - interpolation : omVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                h5Var.d(canvas, omVar.y, null);
                omVar.p += f15;
                omVar.n += f15;
                omVar.q -= f15;
                omVar.o -= f15;
            }
            omVar.r = omVar.o - omVar.n;
            omVar.s = omVar.q - omVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                nm nmVar2 = (nm) arrayList3.get(i16);
                if (nmVar2 != null && (((nmVar = qmVar2.G) == null || nmVar.b != nmVar2.b) && nmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = omVar.w;
            RectF rectF = omVar.t;
            long j10 = omVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (omVar.u == null || omVar.v != j10) {
                    omVar.v = j10;
                    omVar.u = new l01(mh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + omVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = omVar.n;
                float f17 = omVar.r;
                float x10 = e2.c.x(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = omVar.p;
                i11 = i13;
                float f19 = omVar.s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f19, dp2, 2.0f, f18), l.d.b(f17, dp, 2.0f, f16), l.d.b(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f10 = b10;
                omVar.u.c(AndroidUtilities.dp(14.0f) + (((omVar.r / 2.0f) + omVar.n) - (dp / 2.0f)), omVar.p + (omVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f12 += f10;
            i14 = omVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.W(f12, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (qmVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (qmVar.G.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = l.d.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
        om omVar;
        nm nmVar;
        float f10;
        om omVar2;
        nm nmVar2;
        int action;
        boolean z4;
        nm nmVar3;
        int i10;
        org.telegram.ui.xn xnVar;
        nm nmVar4;
        im imVar;
        ArrayList arrayList;
        nm nmVar5;
        nm nmVar6;
        ValueAnimator valueAnimator;
        im imVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        qm qmVar = this.M;
        mi miVar = qmVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                omVar = null;
                break;
            }
            omVar = (om) arrayList2.get(i14);
            float b10 = omVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (omVar != null) {
            ArrayList arrayList3 = omVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                nmVar = (nm) arrayList3.get(i15);
                if (nmVar != null && nmVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        nmVar = null;
        nm nmVar7 = qmVar.G;
        if (nmVar7 != null) {
            RectF f13 = nmVar7.f(nmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            omVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                om omVar3 = (om) arrayList2.get(i16);
                float b12 = omVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            omVar2 = omVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (omVar2 != null) {
                ArrayList arrayList4 = omVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                nmVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    nm nmVar8 = (nm) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (nmVar8 == null || nmVar8 == qmVar.G) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (omVar2.k.g.contains(nmVar8.b)) {
                            RectF d = nmVar8.d();
                            int i19 = nmVar8.i;
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
                            if ((nmVar8.i & 8) > 0) {
                                d.bottom = omVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    nmVar2 = nmVar8;
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
                m2.b bVar = this.J;
                if (action != 0 && qmVar.G == null && !qmVar.r.H1 && (((valueAnimator = qmVar.I) == null || !valueAnimator.isRunning()) && omVar != null && nmVar != null && (imVar2 = omVar.k) != null && imVar2.g.contains(nmVar.b))) {
                    this.B = omVar;
                    this.C = nmVar;
                    qmVar.y = x10;
                    qmVar.B = y10;
                    qmVar.G = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new i5.v(this, elapsedRealtime, this.C, 21), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && qmVar.G != null && !qmVar.H) {
                    qmVar.y = x10;
                    qmVar.B = y10;
                    if (!this.I) {
                        this.I = true;
                        postDelayed(bVar, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (nmVar5 = qmVar.G) == null) {
                    if (action == 1 || qmVar.G != null || (nmVar3 = this.C) == null || this.B == null) {
                        z4 = false;
                        if (action != 1 || action == 3) {
                            this.y = 0L;
                            removeCallbacks(bVar);
                            this.I = false;
                            if (!z4) {
                                h();
                                return true;
                            }
                        }
                        return z4;
                    }
                    if (nmVar3.e && nmVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        nmVar3.m = x11;
                        nmVar3.n = y11;
                        RectF d10 = nmVar3.d();
                        nmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) k7.o.a(nmVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(pr.j);
                        duration.addUpdateListener(new f6(nmVar3, 11));
                        duration.addListener(new mm(nmVar3));
                        duration.start();
                    } else {
                        RectF d11 = nmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f20 = this.B.p + d11.top;
                        rectF2.set(dp, f20, d11.right, AndroidUtilities.dp(36.4f) + f20);
                        if (!rectF2.contains(x10, y10 - this.C.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                om omVar4 = (om) arrayList2.get(i20);
                                if (omVar4 != null && (imVar = omVar4.k) != null && (arrayList = imVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.C.b);
                            int i21 = miVar.N0;
                            org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (p2Var instanceof org.telegram.ui.xn) {
                                xnVar = (org.telegram.ui.xn) p2Var;
                                i10 = 0;
                                if (p2Var == null) {
                                    p2Var = LaunchActivity.R();
                                }
                                if (!miVar.W1.h0()) {
                                    AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(miVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, p2Var, qmVar.a);
                                PhotoViewer.t1().L2(miVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = miVar.P1;
                                boolean z10 = miVar.Q1;
                                t12.h = i22;
                                t12.n = z10;
                                this.K.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.K, xnVar);
                                qmVar.M.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = miVar.m1().getText();
                                    t13.m7 = true;
                                    t13.n7 = text;
                                    nmVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.C = nmVar4;
                                    this.y = 0L;
                                    qmVar.G = nmVar4;
                                    this.D = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            xnVar = null;
                            if (p2Var == null) {
                            }
                            if (!miVar.W1.h0()) {
                            }
                            PhotoViewer.t1().K2(null, p2Var, qmVar.a);
                            PhotoViewer.t1().L2(miVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = miVar.P1;
                            boolean z102 = miVar.Q1;
                            t122.h = i222;
                            t122.n = z102;
                            this.K.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.K, xnVar);
                            qmVar.M.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (qmVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.C.b;
                            int indexOf2 = this.B.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qmVar.M;
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
                                om omVar5 = this.B;
                                omVar5.k.g.remove(indexOf2);
                                om.a(omVar5, omVar5.k, true);
                                j();
                                i(qmVar.M, false);
                                int i24 = this.L + 1;
                                this.L = i24;
                                qmVar.w.k(0L, 82, photoEntry, null, null, new dg.u1(this, omVar5, photoEntry, indexOf2, 15));
                                postDelayed(new jm(this, i24, 0), 4000L);
                            }
                            ValueAnimator valueAnimator2 = qmVar.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        nmVar4 = null;
                        this.C = nmVar4;
                        this.y = 0L;
                        qmVar.G = nmVar4;
                        this.D = 0.0f;
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
                                qmVar.G.a.k.g.remove(indexOf3);
                                om omVar6 = qmVar.G.a;
                                om.a(omVar6, omVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(omVar) > arrayList2.indexOf(qmVar.G.a)) {
                                    indexOf4++;
                                }
                                f(omVar, qmVar.G.b, indexOf4);
                                if (qmVar.G.a != omVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            nmVar6 = null;
                                            break;
                                        }
                                        nmVar6 = (nm) arrayList8.get(i25);
                                        if (nmVar6.b == qmVar.G.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (nmVar6 != null) {
                                        g();
                                        nm nmVar9 = qmVar.G;
                                        RectF rectF3 = nmVar6.g;
                                        om omVar7 = nmVar6.O;
                                        float f21 = nmVar9.j;
                                        RectF rectF4 = nmVar9.g;
                                        nmVar6.j = AndroidUtilities.lerp(f21, nmVar9.k, nmVar9.e());
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
                                            nmVar6.f.set(rectF5.centerX() - (((nmVar6.f.width() / f10) * nmVar9.a.r) / omVar7.r), rectF5.centerY() - (((nmVar6.f.height() / f10) * nmVar9.a.s) / omVar7.s), (((nmVar6.f.width() / f10) * nmVar9.a.r) / omVar7.r) + rectF5.centerX(), (((nmVar6.f.height() / f10) * nmVar9.a.s) / omVar7.s) + rectF5.centerY());
                                        } else {
                                            nmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * nmVar9.a.r) / omVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * nmVar9.a.s) / omVar7.s), (((rectF4.width() / f10) * nmVar9.a.r) / omVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * nmVar9.a.s) / omVar7.s) + rectF5.centerY());
                                        }
                                        nmVar6.j = AndroidUtilities.lerp(nmVar6.j, nmVar6.k, nmVar6.e());
                                        nmVar6.h = SystemClock.elapsedRealtime();
                                        qmVar.G = nmVar6;
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
                            i(qmVar.M, false);
                        }
                    }
                    h();
                }
                z4 = true;
                if (action != 1) {
                }
                this.y = 0L;
                removeCallbacks(bVar);
                this.I = false;
                if (!z4) {
                }
                return z4;
            }
        } else {
            f10 = 2.0f;
            omVar2 = null;
        }
        nmVar2 = null;
        action = motionEvent.getAction();
        m2.b bVar2 = this.J;
        if (action != 0) {
        }
        if (action != 2) {
        }
        if (action == 1) {
        }
        if (action == 1) {
        }
        z4 = false;
        if (action != 1) {
        }
        this.y = 0L;
        removeCallbacks(bVar2);
        this.I = false;
        if (!z4) {
        }
        return z4;
    }
}
