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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class qm extends ViewGroup {
    public pm E;
    public om F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final mm N;
    public int O;
    public final /* synthetic */ rm P;
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
    public qm(rm rmVar, Context context) {
        super(context);
        this.P = rmVar;
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
        this.N = new mm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, rmVar.n, true);
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
            ArrayList arrayList2 = ((pm) arrayList.get(i10)).k.g;
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
        rm rmVar = this.P;
        om omVar = rmVar.J;
        PointF pointF = this.K;
        if (omVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (rmVar.K) {
            RectF f7 = omVar.f(omVar.e());
            RectF f10 = rmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + rmVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = omVar.f(omVar.e());
        RectF f12 = rmVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, rmVar.y - ((rmVar.G - 0.5f) * rmVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + rmVar.J.a.a + f12.top, (rmVar.E - ((rmVar.F - 0.5f) * rmVar.I)) + rmVar.M, this.G);
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
            ArrayList arrayList2 = ((pm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                om omVar = (om) arrayList2.get(i11);
                vh.f fVar = omVar.s;
                if (fVar != null) {
                    fVar.b(omVar.O.z);
                    omVar.s = null;
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
                pm pmVar = new pm(this);
                pm.a(pmVar, new km(this.P, arrayList3), false);
                arrayList.add(pmVar);
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
            float b10 = ((pm) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((pm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(pm pmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = pmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (pmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) pmVar.k.g.get(10);
            pmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(pmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                pm pmVar2 = i11 == arrayList2.size() ? null : (pm) arrayList2.get(i11);
                if (pmVar2 == null) {
                    pm pmVar3 = new pm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    pm.a(pmVar3, new km(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(pmVar2, photoEntry2, 0);
                }
            }
        }
        pm.a(pmVar, pmVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            pm pmVar = (pm) arrayList.get(i11);
            float b10 = pmVar.b();
            pmVar.a = f7;
            pmVar.b = i10;
            f7 += b10;
            i10 += pmVar.k.g.size();
        }
    }

    public final void h() {
        rm rmVar = this.P;
        ValueAnimator valueAnimator = rmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        rmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        rmVar.L = ofFloat;
        ofFloat.addUpdateListener(new lm(this, 1));
        rmVar.L.addListener(new r8(this, 10));
        rmVar.L.setDuration(200L);
        rmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        im imVar = chatAttachAlertPhotoLayout.G;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        ul ulVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = ulVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ulVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = imVar.f;
                    boolean z12 = imVar.d;
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
                        t5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == imVar.h() - 1, wiVar.i0);
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
            pm pmVar = (pm) arrayList.get(i10);
            if (pmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - pmVar.k.g.size();
                pm pmVar2 = (pm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, pmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) pmVar2.k.g.remove(0));
                }
                pmVar.k.g.addAll(arrayList2);
                pm.a(pmVar, pmVar.k, true);
                pm.a(pmVar2, pmVar2.k, true);
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
        om omVar;
        float f10 = this.n;
        rm rmVar = this.P;
        int computeVerticalScrollOffset = rmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f10);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f11 = f10;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            pm pmVar = (pm) arrayList2.get(i13);
            float b10 = pmVar.b();
            pmVar.a = f11;
            pmVar.b = i14;
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
                    i14 = pmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = pmVar.h;
            int i15 = pmVar.l;
            org.telegram.ui.ActionBar.d5 d5Var = pmVar.x;
            qm qmVar = pmVar.z;
            arrayList = arrayList2;
            float interpolation = pmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - pmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(pmVar.f, pmVar.d, interpolation);
            int width = qmVar.getWidth();
            rm rmVar2 = qmVar.P;
            float previewScale = width * lerp * rmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = rmVar2.getPreviewScale() * AndroidUtilities.lerp(pmVar.g, pmVar.e, interpolation) * max;
            if (d5Var != null) {
                pmVar.p = 0.0f;
                float width2 = qmVar.getWidth();
                float f14 = i15;
                pmVar.n = (width2 - Math.max(f14, previewScale)) / 2.0f;
                pmVar.o = (Math.max(f14, previewScale) + qmVar.getWidth()) / 2.0f;
                pmVar.q = Math.max(i15 * 2, previewScale2);
                pmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) pmVar.n, (int) pmVar.p, (int) pmVar.o, (int) pmVar.q);
                d5Var.setAlpha((int) ((pmVar.d <= 0.0f ? 1.0f - interpolation : pmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                d5Var.d(canvas, pmVar.y, null);
                pmVar.p += f14;
                pmVar.n += f14;
                pmVar.q -= f14;
                pmVar.o -= f14;
            }
            pmVar.r = pmVar.o - pmVar.n;
            pmVar.s = pmVar.q - pmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                om omVar2 = (om) arrayList3.get(i16);
                if (omVar2 != null && (((omVar = rmVar2.J) == null || omVar.b != omVar2.b) && omVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = pmVar.w;
            RectF rectF = pmVar.t;
            long j3 = pmVar.i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (pmVar.u == null || pmVar.v != j3) {
                    pmVar.v = j3;
                    pmVar.u = new t01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + pmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f15 = pmVar.n;
                float f16 = pmVar.r;
                float A = com.google.android.gms.internal.vision.e2.A(f16, dp, 2.0f, f15);
                i10 = size;
                float f17 = pmVar.p;
                i11 = i13;
                float f18 = pmVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f18, dp2, 2.0f, f17), org.telegram.messenger.f0.a(f16, dp, 2.0f, f15), org.telegram.messenger.f0.a(f18, dp2, 2.0f, f17));
                paint.setColor(1610612736);
                float f19 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f19, f19, paint);
                f7 = b10;
                pmVar.u.c(AndroidUtilities.dp(14.0f) + (((pmVar.r / 2.0f) + pmVar.n) - (dp / 2.0f)), pmVar.p + (pmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f11 += f7;
            i14 = pmVar.k.g.size() + i12;
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
        if (rmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (rmVar.J.c(canvas, true)) {
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
        pm pmVar;
        om omVar;
        float f7;
        pm pmVar2;
        om omVar2;
        int action;
        boolean z10;
        om omVar3;
        int i10;
        org.telegram.ui.wn wnVar;
        om omVar4;
        km kmVar;
        ArrayList arrayList;
        om omVar5;
        om omVar6;
        ValueAnimator valueAnimator;
        km kmVar2;
        int i11;
        int i12;
        int i13;
        float f10;
        rm rmVar = this.P;
        wi wiVar = rmVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i14 >= size) {
                pmVar = null;
                break;
            }
            pmVar = (pm) arrayList2.get(i14);
            float b10 = pmVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i14++;
        }
        if (pmVar != null) {
            ArrayList arrayList3 = pmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                omVar = (om) arrayList3.get(i15);
                if (omVar != null && omVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        omVar = null;
        om omVar7 = rmVar.J;
        if (omVar7 != null) {
            RectF f12 = omVar7.f(omVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i16 = 0;
            pmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i16 < size) {
                pm pmVar3 = (pm) arrayList2.get(i16);
                float b12 = pmVar3.b() + f15;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            pmVar2 = pmVar3;
                        }
                    }
                }
                i16++;
                f15 = b12;
                size = i17;
            }
            if (pmVar2 != null) {
                ArrayList arrayList4 = pmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                omVar2 = null;
                float f18 = 0.0f;
                while (i18 < size3) {
                    om omVar8 = (om) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (omVar8 == null || omVar8 == rmVar.J) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (pmVar2.k.g.contains(omVar8.b)) {
                            RectF d = omVar8.d();
                            int i19 = omVar8.i;
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
                            if ((omVar8.i & 8) > 0) {
                                d.bottom = pmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    omVar2 = omVar8;
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
                if (action != 0 && rmVar.J == null && !rmVar.r.K1 && (((valueAnimator = rmVar.L) == null || !valueAnimator.isRunning()) && pmVar != null && omVar != null && (kmVar2 = pmVar.k) != null && kmVar2.g.contains(omVar.b))) {
                    this.E = pmVar;
                    this.F = omVar;
                    rmVar.y = x10;
                    rmVar.E = y3;
                    rmVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new a3.h0(this, elapsedRealtime, this.F, 20), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && rmVar.J != null && !rmVar.K) {
                    rmVar.y = x10;
                    rmVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(t6Var, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (omVar5 = rmVar.J) == null) {
                    if (action == 1 || rmVar.J != null || (omVar3 = this.F) == null || this.E == null) {
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
                    if (omVar3.e && omVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        omVar3.m = x11;
                        omVar3.n = y10;
                        RectF d10 = omVar3.d();
                        omVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.q.a(omVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(rr.j);
                        duration.addUpdateListener(new k6(omVar3, 11));
                        duration.addListener(new nm(omVar3));
                        duration.start();
                    } else {
                        RectF d11 = omVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f19 = this.E.p + d11.top;
                        rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                        if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                pm pmVar4 = (pm) arrayList2.get(i20);
                                if (pmVar4 != null && (kmVar = pmVar4.k) != null && (arrayList = kmVar.g) != null) {
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
                                PhotoViewer.t1().J2(null, m2Var, rmVar.a);
                                PhotoViewer.t1().K2(wiVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = wiVar.S1;
                                boolean z11 = wiVar.T1;
                                t12.h = i22;
                                t12.n = z11;
                                this.N.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.N, wnVar);
                                rmVar.P.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = wiVar.m1().getText();
                                    t13.p7 = true;
                                    t13.q7 = text;
                                    omVar4 = null;
                                    t13.z2(null, text, false, false);
                                    t13.s3(null);
                                    this.F = omVar4;
                                    this.y = 0L;
                                    rmVar.J = omVar4;
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
                            PhotoViewer.t1().J2(null, m2Var, rmVar.a);
                            PhotoViewer.t1().K2(wiVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = wiVar.S1;
                            boolean z112 = wiVar.T1;
                            t122.h = i222;
                            t122.n = z112;
                            this.N.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.N, wnVar);
                            rmVar.P.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (rmVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.F.b;
                            int indexOf2 = this.E.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rmVar.P;
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
                                pm pmVar5 = this.E;
                                pmVar5.k.g.remove(indexOf2);
                                pm.a(pmVar5, pmVar5.k, true);
                                j();
                                i(rmVar.P, false);
                                int i24 = this.O + 1;
                                this.O = i24;
                                rmVar.w.k(0L, 82, photoEntry, null, null, new ai.c9(this, pmVar5, photoEntry, indexOf2, 16));
                                postDelayed(new ld(this, i24, 2), 4000L);
                            }
                            ValueAnimator valueAnimator2 = rmVar.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        omVar4 = null;
                        this.F = omVar4;
                        this.y = 0L;
                        rmVar.J = omVar4;
                        this.G = 0.0f;
                    }
                } else {
                    if (pmVar == null || omVar == null || omVar == omVar5) {
                        if (pmVar2 == null || omVar2 == null || omVar2 == omVar5 || omVar2.b == omVar5.b) {
                            pmVar = null;
                            omVar = null;
                        } else {
                            pmVar = pmVar2;
                            omVar = omVar2;
                        }
                    }
                    if (pmVar != null) {
                        ArrayList arrayList8 = pmVar.h;
                        if (omVar != null && omVar != omVar5) {
                            int indexOf3 = omVar5.a.k.g.indexOf(omVar5.b);
                            int indexOf4 = pmVar.k.g.indexOf(omVar.b);
                            if (indexOf3 >= 0) {
                                rmVar.J.a.k.g.remove(indexOf3);
                                pm pmVar6 = rmVar.J.a;
                                pm.a(pmVar6, pmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(pmVar) > arrayList2.indexOf(rmVar.J.a)) {
                                    indexOf4++;
                                }
                                f(pmVar, rmVar.J.b, indexOf4);
                                if (rmVar.J.a != pmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            omVar6 = null;
                                            break;
                                        }
                                        omVar6 = (om) arrayList8.get(i25);
                                        if (omVar6.b == rmVar.J.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (omVar6 != null) {
                                        g();
                                        om omVar9 = rmVar.J;
                                        RectF rectF3 = omVar6.g;
                                        pm pmVar7 = omVar6.O;
                                        float f20 = omVar9.j;
                                        RectF rectF4 = omVar9.g;
                                        omVar6.j = AndroidUtilities.lerp(f20, omVar9.k, omVar9.e());
                                        if (omVar6.f == null) {
                                            omVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = omVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, omVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = omVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, omVar9.e(), omVar6.f);
                                            omVar6.f.set(rectF5.centerX() - (((omVar6.f.width() / f7) * omVar9.a.r) / pmVar7.r), rectF5.centerY() - (((omVar6.f.height() / f7) * omVar9.a.s) / pmVar7.s), (((omVar6.f.width() / f7) * omVar9.a.r) / pmVar7.r) + rectF5.centerX(), (((omVar6.f.height() / f7) * omVar9.a.s) / pmVar7.s) + rectF5.centerY());
                                        } else {
                                            omVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * omVar9.a.r) / pmVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * omVar9.a.s) / pmVar7.s), (((rectF4.width() / f7) * omVar9.a.r) / pmVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * omVar9.a.s) / pmVar7.s) + rectF5.centerY());
                                        }
                                        omVar6.j = AndroidUtilities.lerp(omVar6.j, omVar6.k, omVar6.e());
                                        omVar6.h = SystemClock.elapsedRealtime();
                                        rmVar.J = omVar6;
                                        omVar6.a = pmVar;
                                        omVar6.j = 1.0f;
                                        omVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                rmVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(rmVar.P, false);
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
            pmVar2 = null;
        }
        omVar2 = null;
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
