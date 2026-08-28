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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gm extends ViewGroup {
    public fm A;
    public em B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final PointF G;
    public boolean H;
    public final m.i3 I;
    public final cm J;
    public int K;
    public final /* synthetic */ hm L;
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
    public gm(hm hmVar, Context context) {
        super(context);
        this.L = hmVar;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = AndroidUtilities.dp(16.0f);
        this.r = AndroidUtilities.dp(64.0f);
        this.s = 0;
        this.x = null;
        this.y = 0L;
        this.A = null;
        this.B = null;
        this.C = 0.0f;
        this.G = new PointF();
        this.H = false;
        this.I = new m.i3(this, 14);
        this.J = new cm(this);
        this.K = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, hmVar.n, true);
        this.a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.L.L.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ArrayList arrayList2 = ((fm) arrayList.get(i9)).k.g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i11);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
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
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
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
        hm hmVar = this.L;
        em emVar = hmVar.F;
        PointF pointF = this.G;
        if (emVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (hmVar.G) {
            RectF f10 = emVar.f(emVar.e());
            RectF f11 = hmVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, this.D, this.C / this.F);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + hmVar.F.a.a + f11.top, this.E, this.C / this.F);
            return pointF;
        }
        RectF f12 = emVar.f(emVar.e());
        RectF f13 = hmVar.F.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, hmVar.y - ((hmVar.C - 0.5f) * hmVar.D), this.C);
        pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + hmVar.F.a.a + f13.top, (hmVar.A - ((hmVar.B - 0.5f) * hmVar.E)) + hmVar.I, this.C);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i9 = 0;
        while (true) {
            arrayList = this.b;
            if (i9 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((fm) arrayList.get(i9)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                em emVar = (em) arrayList2.get(i10);
                dh.k kVar = emVar.s;
                if (kVar != null) {
                    kVar.b(emVar.O.z);
                    emVar.s = null;
                }
            }
            i9++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i11 = size - 1;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.h.get(i12);
            num.getClass();
            arrayList3.add((MediaController.PhotoEntry) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                fm fmVar = new fm(this);
                fm.a(fmVar, new am(this.L, arrayList3), false);
                arrayList.add(fmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.n;
        int computeVerticalScrollOffset = this.L.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.w = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            float b10 = ((fm) arrayList.get(i9)).b() + f10;
            float f11 = this.v;
            zArr[i9] = (f10 >= f11 && f10 <= this.w) || (b10 >= f11 && b10 <= this.w) || (f10 <= f11 && b10 >= this.w);
            i9++;
            f10 = b10;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i9 = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i9 = (int) (((fm) arrayList.get(i10)).b() + i9);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i9;
    }

    public final void f(fm fmVar, MediaController.PhotoEntry photoEntry, int i9) {
        ArrayList arrayList = fmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i9), photoEntry);
        if (fmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) fmVar.k.g.get(10);
            fmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(fmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                fm fmVar2 = i10 == arrayList2.size() ? null : (fm) arrayList2.get(i10);
                if (fmVar2 == null) {
                    fm fmVar3 = new fm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    fm.a(fmVar3, new am(this.L, arrayList3), true);
                    invalidate();
                } else {
                    f(fmVar2, photoEntry2, 0);
                }
            }
        }
        fm.a(fmVar, fmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            fm fmVar = (fm) arrayList.get(i10);
            float b10 = fmVar.b();
            fmVar.a = f10;
            fmVar.b = i9;
            f10 += b10;
            i9 += fmVar.k.g.size();
        }
    }

    public final void h() {
        hm hmVar = this.L;
        ValueAnimator valueAnimator = hmVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.C;
        this.F = f10;
        this.D = b10.x;
        this.E = b10.y;
        hmVar.G = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        hmVar.H = ofFloat;
        ofFloat.addUpdateListener(new bm(this, 1));
        hmVar.H.addListener(new org.telegram.ui.xp(this, 16));
        hmVar.H.setDuration(200L);
        hmVar.H.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        kl klVar = chatAttachAlertPhotoLayout.A;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.o1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.p1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.x0(false);
            chatAttachAlertPhotoLayout.v0();
            int childCount = klVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = ylVar.f;
                    boolean z12 = ylVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.I0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (kiVar.M0 != 0 || kiVar.D) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(R);
                    if (a02 != null) {
                        t5Var.d(a02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, R == ylVar.h() - 1, kiVar.e0);
                        if ((kiVar.b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(a02.imageId)), hashMap2.containsKey(Integer.valueOf(a02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(a02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.L.b.V1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int b10 = org.telegram.messenger.l0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != b10) {
            this.s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            fm fmVar = (fm) arrayList.get(i9);
            if (fmVar.k.g.size() < 10 && i9 < arrayList.size() - 1) {
                int size2 = 10 - fmVar.k.g.size();
                fm fmVar2 = (fm) arrayList.get(i9 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, fmVar2.k.g.size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((MediaController.PhotoEntry) fmVar2.k.g.remove(0));
                }
                fmVar.k.g.addAll(arrayList2);
                fm.a(fmVar, fmVar.k, true);
                fm.a(fmVar2, fmVar2.k, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        em emVar;
        float f11 = this.n;
        hm hmVar = this.L;
        int computeVerticalScrollOffset = hmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - hmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - hmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            fm fmVar = (fm) arrayList2.get(i12);
            float b10 = fmVar.b();
            fmVar.a = f12;
            fmVar.b = i13;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.w) && (f12 > f13 || f14 < this.w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i9 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f12 += f10;
                    i13 = fmVar.k.g.size() + i11;
                    i12 = i10 + 1;
                    size = i9;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = fmVar.h;
            int i14 = fmVar.l;
            org.telegram.ui.ActionBar.d5 d5Var = fmVar.x;
            gm gmVar = fmVar.z;
            arrayList = arrayList2;
            float interpolation = fmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - fmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(fmVar.f, fmVar.d, interpolation);
            int width = gmVar.getWidth();
            hm hmVar2 = gmVar.L;
            float previewScale = width * lerp * hmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = hmVar2.getPreviewScale() * AndroidUtilities.lerp(fmVar.g, fmVar.e, interpolation) * max;
            if (d5Var != null) {
                fmVar.p = 0.0f;
                float width2 = gmVar.getWidth();
                float f15 = i14;
                fmVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                fmVar.o = (Math.max(f15, previewScale) + gmVar.getWidth()) / 2.0f;
                fmVar.q = Math.max(i14 * 2, previewScale2);
                fmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) fmVar.n, (int) fmVar.p, (int) fmVar.o, (int) fmVar.q);
                d5Var.setAlpha((int) ((fmVar.d <= 0.0f ? 1.0f - interpolation : fmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                d5Var.d(canvas, fmVar.y, null);
                fmVar.p += f15;
                fmVar.n += f15;
                fmVar.q -= f15;
                fmVar.o -= f15;
            }
            fmVar.r = fmVar.o - fmVar.n;
            fmVar.s = fmVar.q - fmVar.p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                em emVar2 = (em) arrayList3.get(i15);
                if (emVar2 != null && (((emVar = hmVar2.F) == null || emVar.b != emVar2.b) && emVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = fmVar.w;
            RectF rectF = fmVar.t;
            long j10 = fmVar.i;
            if (j10 <= 0) {
                i9 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (fmVar.u == null || fmVar.v != j10) {
                    fmVar.v = j10;
                    fmVar.u = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + fmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = fmVar.n;
                float f17 = fmVar.r;
                float A = e2.c.A(f17, dp, 2.0f, f16);
                i9 = size;
                float f18 = fmVar.p;
                i10 = i12;
                float f19 = fmVar.s;
                i11 = i13;
                rectF.set(A, e2.c.A(f19, dp2, 2.0f, f18), j3.r0.c(f17, dp, 2.0f, f16), j3.r0.c(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f10 = b10;
                fmVar.u.c(AndroidUtilities.dp(14.0f) + (((fmVar.r / 2.0f) + fmVar.n) - (dp / 2.0f)), fmVar.p + (fmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f12 += f10;
            i13 = fmVar.k.g.size() + i11;
            i12 = i10 + 1;
            size = i9;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.V(f12, w0Var.getMeasuredHeight());
        if (w0Var.I()) {
            w0Var.y(canvas, true);
            w0Var.A(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (hmVar.F != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (hmVar.F.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        this.a.measure(i9, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = org.telegram.messenger.l0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.s), TLObject.FLAG_30));
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
        fm fmVar;
        em emVar;
        float f10;
        fm fmVar2;
        em emVar2;
        int action;
        boolean z10;
        em emVar3;
        int i9;
        org.telegram.ui.qn qnVar;
        em emVar4;
        am amVar;
        ArrayList arrayList;
        em emVar5;
        em emVar6;
        ValueAnimator valueAnimator;
        am amVar2;
        int i10;
        int i11;
        int i12;
        float f11;
        hm hmVar = this.L;
        ki kiVar = hmVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i13 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i13 >= size) {
                fmVar = null;
                break;
            }
            fmVar = (fm) arrayList2.get(i13);
            float b10 = fmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i13++;
        }
        if (fmVar != null) {
            ArrayList arrayList3 = fmVar.h;
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                emVar = (em) arrayList3.get(i14);
                if (emVar != null && emVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        emVar = null;
        em emVar7 = hmVar.F;
        if (emVar7 != null) {
            RectF f13 = emVar7.f(emVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i15 = 0;
            fmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i15 < size) {
                fm fmVar3 = (fm) arrayList2.get(i15);
                float b12 = fmVar3.b() + f16;
                int i16 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            fmVar2 = fmVar3;
                        }
                    }
                }
                i15++;
                f16 = b12;
                size = i16;
            }
            if (fmVar2 != null) {
                ArrayList arrayList4 = fmVar2.h;
                int size3 = arrayList4.size();
                int i17 = 0;
                emVar2 = null;
                float f19 = 0.0f;
                while (i17 < size3) {
                    em emVar8 = (em) arrayList4.get(i17);
                    ArrayList arrayList5 = arrayList4;
                    if (emVar8 == null || emVar8 == hmVar.F) {
                        i10 = size3;
                    } else {
                        i10 = size3;
                        if (fmVar2.k.g.contains(emVar8.b)) {
                            RectF d = emVar8.d();
                            int i18 = emVar8.i;
                            if ((i18 & 4) > 0) {
                                i12 = i18;
                                f11 = 0.0f;
                                d.top = 0.0f;
                            } else {
                                i12 = i18;
                                f11 = 0.0f;
                            }
                            if ((i12 & 1) > 0) {
                                d.left = f11;
                            }
                            if ((i12 & 2) > 0) {
                                d.right = getWidth();
                            }
                            if ((emVar8.i & 8) > 0) {
                                d.bottom = fmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i11 = i17;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    emVar2 = emVar8;
                                }
                                i17 = i11 + 1;
                                arrayList4 = arrayList5;
                                size3 = i10;
                            }
                        }
                    }
                    i11 = i17;
                    i17 = i11 + 1;
                    arrayList4 = arrayList5;
                    size3 = i10;
                }
                action = motionEvent.getAction();
                m.i3 i3Var = this.I;
                if (action != 0 && hmVar.F == null && !hmVar.r.G1 && (((valueAnimator = hmVar.H) == null || !valueAnimator.isRunning()) && fmVar != null && emVar != null && (amVar2 = fmVar.k) != null && amVar2.g.contains(emVar.b))) {
                    this.A = fmVar;
                    this.B = emVar;
                    hmVar.y = x10;
                    hmVar.A = y10;
                    hmVar.F = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new e5.w(this, elapsedRealtime, this.B, 23), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && hmVar.F != null && !hmVar.G) {
                    hmVar.y = x10;
                    hmVar.A = y10;
                    if (!this.H) {
                        this.H = true;
                        postDelayed(i3Var, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (emVar5 = hmVar.F) == null) {
                    if (action == 1 || hmVar.F != null || (emVar3 = this.B) == null || this.A == null) {
                        z10 = false;
                        if (action != 1 || action == 3) {
                            this.y = 0L;
                            removeCallbacks(i3Var);
                            this.H = false;
                            if (!z10) {
                                h();
                                return true;
                            }
                        }
                        return z10;
                    }
                    if (emVar3.e && emVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        emVar3.m = x11;
                        emVar3.n = y11;
                        RectF d9 = emVar3.d();
                        emVar3.o = (float) Math.sqrt(Math.pow(d9.height(), 2.0d) + Math.pow(d9.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) g7.n.a(emVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(gr.j);
                        duration.addUpdateListener(new e6(emVar3, 11));
                        duration.addListener(new dm(emVar3));
                        duration.start();
                    } else {
                        RectF d10 = emVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d10.right - AndroidUtilities.dp(36.4f);
                        float f20 = this.A.p + d10.top;
                        rectF2.set(dp, f20, d10.right, AndroidUtilities.dp(36.4f) + f20);
                        if (!rectF2.contains(x10, y10 - this.B.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i19 = 0; i19 < size4; i19++) {
                                fm fmVar4 = (fm) arrayList2.get(i19);
                                if (fmVar4 != null && (amVar = fmVar4.k) != null && (arrayList = amVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.B.b);
                            int i20 = kiVar.M0;
                            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
                            if (i20 != 0) {
                                i9 = 1;
                            } else if (o2Var instanceof org.telegram.ui.qn) {
                                qnVar = (org.telegram.ui.qn) o2Var;
                                i9 = 0;
                                if (o2Var == null) {
                                    o2Var = LaunchActivity.R();
                                }
                                if (!kiVar.V1.j()) {
                                    AndroidUtilities.hideKeyboard(o2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(kiVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, o2Var, hmVar.a);
                                PhotoViewer.t1().L2(kiVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i21 = kiVar.O1;
                                boolean z11 = kiVar.P1;
                                t12.h = i21;
                                t12.n = z11;
                                this.J.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i9, false, this.J, qnVar);
                                hmVar.L.getClass();
                                if (ChatAttachAlertPhotoLayout.S()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = kiVar.m1().getText();
                                    t13.l7 = true;
                                    t13.m7 = text;
                                    emVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.B = emVar4;
                                    this.y = 0L;
                                    hmVar.F = emVar4;
                                    this.C = 0.0f;
                                }
                            } else {
                                i9 = 4;
                            }
                            qnVar = null;
                            if (o2Var == null) {
                            }
                            if (!kiVar.V1.j()) {
                            }
                            PhotoViewer.t1().K2(null, o2Var, hmVar.a);
                            PhotoViewer.t1().L2(kiVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i212 = kiVar.O1;
                            boolean z112 = kiVar.P1;
                            t122.h = i212;
                            t122.n = z112;
                            this.J.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i9, false, this.J, qnVar);
                            hmVar.L.getClass();
                            if (ChatAttachAlertPhotoLayout.S()) {
                            }
                        } else if (hmVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.B.b;
                            int indexOf2 = this.A.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.L;
                                if (chatAttachAlertPhotoLayout != null) {
                                    ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                    int size5 = arrayList7.size();
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= size5) {
                                            break;
                                        }
                                        if (((Map.Entry) arrayList7.get(i22)).getValue() == photoEntry) {
                                            this.c.put(photoEntry, ((Map.Entry) arrayList7.get(i22)).getKey());
                                            break;
                                        }
                                        i22++;
                                    }
                                }
                                fm fmVar5 = this.A;
                                fmVar5.k.g.remove(indexOf2);
                                fm.a(fmVar5, fmVar5.k, true);
                                j();
                                i(hmVar.L, false);
                                int i23 = this.K + 1;
                                this.K = i23;
                                hmVar.w.k(0L, 82, photoEntry, null, null, new c3.d(this, fmVar5, photoEntry, indexOf2, 16));
                                postDelayed(new qd(this, i23, 1), 4000L);
                            }
                            ValueAnimator valueAnimator2 = hmVar.H;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        emVar4 = null;
                        this.B = emVar4;
                        this.y = 0L;
                        hmVar.F = emVar4;
                        this.C = 0.0f;
                    }
                } else {
                    if (fmVar == null || emVar == null || emVar == emVar5) {
                        if (fmVar2 == null || emVar2 == null || emVar2 == emVar5 || emVar2.b == emVar5.b) {
                            fmVar = null;
                            emVar = null;
                        } else {
                            fmVar = fmVar2;
                            emVar = emVar2;
                        }
                    }
                    if (fmVar != null) {
                        ArrayList arrayList8 = fmVar.h;
                        if (emVar != null && emVar != emVar5) {
                            int indexOf3 = emVar5.a.k.g.indexOf(emVar5.b);
                            int indexOf4 = fmVar.k.g.indexOf(emVar.b);
                            if (indexOf3 >= 0) {
                                hmVar.F.a.k.g.remove(indexOf3);
                                fm fmVar6 = hmVar.F.a;
                                fm.a(fmVar6, fmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(fmVar) > arrayList2.indexOf(hmVar.F.a)) {
                                    indexOf4++;
                                }
                                f(fmVar, hmVar.F.b, indexOf4);
                                if (hmVar.F.a != fmVar) {
                                    int size6 = arrayList8.size();
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= size6) {
                                            emVar6 = null;
                                            break;
                                        }
                                        emVar6 = (em) arrayList8.get(i24);
                                        if (emVar6.b == hmVar.F.b) {
                                            break;
                                        }
                                        i24++;
                                    }
                                    if (emVar6 != null) {
                                        g();
                                        em emVar9 = hmVar.F;
                                        RectF rectF3 = emVar6.g;
                                        fm fmVar7 = emVar6.O;
                                        float f21 = emVar9.j;
                                        RectF rectF4 = emVar9.g;
                                        emVar6.j = AndroidUtilities.lerp(f21, emVar9.k, emVar9.e());
                                        if (emVar6.f == null) {
                                            emVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = emVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, emVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = emVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, emVar9.e(), emVar6.f);
                                            emVar6.f.set(rectF5.centerX() - (((emVar6.f.width() / f10) * emVar9.a.r) / fmVar7.r), rectF5.centerY() - (((emVar6.f.height() / f10) * emVar9.a.s) / fmVar7.s), (((emVar6.f.width() / f10) * emVar9.a.r) / fmVar7.r) + rectF5.centerX(), (((emVar6.f.height() / f10) * emVar9.a.s) / fmVar7.s) + rectF5.centerY());
                                        } else {
                                            emVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * emVar9.a.r) / fmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * emVar9.a.s) / fmVar7.s), (((rectF4.width() / f10) * emVar9.a.r) / fmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * emVar9.a.s) / fmVar7.s) + rectF5.centerY());
                                        }
                                        emVar6.j = AndroidUtilities.lerp(emVar6.j, emVar6.k, emVar6.e());
                                        emVar6.h = SystemClock.elapsedRealtime();
                                        hmVar.F = emVar6;
                                        emVar6.a = fmVar;
                                        emVar6.j = 1.0f;
                                        emVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                hmVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(hmVar.L, false);
                        }
                    }
                    h();
                }
                z10 = true;
                if (action != 1) {
                }
                this.y = 0L;
                removeCallbacks(i3Var);
                this.H = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f10 = 2.0f;
            fmVar2 = null;
        }
        emVar2 = null;
        action = motionEvent.getAction();
        m.i3 i3Var2 = this.I;
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
        removeCallbacks(i3Var2);
        this.H = false;
        if (!z10) {
        }
        return z10;
    }
}
