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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class km extends ViewGroup {
    public jm A;
    public im B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final PointF G;
    public boolean H;
    public final lh.m7 I;
    public final gm J;
    public int K;
    public final /* synthetic */ lm L;
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
    public km(lm lmVar, Context context) {
        super(context);
        this.L = lmVar;
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
        this.I = new lh.m7(this, 17);
        this.J = new gm(this);
        this.K = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, lmVar.n, true);
        this.a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.L.L.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((jm) arrayList.get(i10)).k.g;
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
        lm lmVar = this.L;
        im imVar = lmVar.F;
        PointF pointF = this.G;
        if (imVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (lmVar.G) {
            RectF f9 = imVar.f(imVar.e());
            RectF f10 = lmVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f9.width() / 2.0f) + f10.left, this.D, this.C / this.F);
            pointF.y = AndroidUtilities.lerp((f9.height() / 2.0f) + lmVar.F.a.a + f10.top, this.E, this.C / this.F);
            return pointF;
        }
        RectF f11 = imVar.f(imVar.e());
        RectF f12 = lmVar.F.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, lmVar.y - ((lmVar.C - 0.5f) * lmVar.D), this.C);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + lmVar.F.a.a + f12.top, (lmVar.A - ((lmVar.B - 0.5f) * lmVar.E)) + lmVar.I, this.C);
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
            ArrayList arrayList2 = ((jm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                im imVar = (im) arrayList2.get(i11);
                gh.j jVar = imVar.s;
                if (jVar != null) {
                    jVar.b(imVar.O.z);
                    imVar.s = null;
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
                jm jmVar = new jm(this);
                jm.a(jmVar, new em(this.L, arrayList3), false);
                arrayList.add(jmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f9 = this.n;
        int computeVerticalScrollOffset = this.L.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.w = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((jm) arrayList.get(i10)).b() + f9;
            float f10 = this.v;
            zArr[i10] = (f9 >= f10 && f9 <= this.w) || (b10 >= f10 && b10 <= this.w) || (f9 <= f10 && b10 >= this.w);
            i10++;
            f9 = b10;
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
            i10 = (int) (((jm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(jm jmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = jmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (jmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) jmVar.k.g.get(10);
            jmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(jmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                jm jmVar2 = i11 == arrayList2.size() ? null : (jm) arrayList2.get(i11);
                if (jmVar2 == null) {
                    jm jmVar3 = new jm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    jm.a(jmVar3, new em(this.L, arrayList3), true);
                    invalidate();
                } else {
                    f(jmVar2, photoEntry2, 0);
                }
            }
        }
        jm.a(jmVar, jmVar.k, true);
    }

    public final void g() {
        float f9 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jm jmVar = (jm) arrayList.get(i11);
            float b10 = jmVar.b();
            jmVar.a = f9;
            jmVar.b = i10;
            f9 += b10;
            i10 += jmVar.k.g.size();
        }
    }

    public final void h() {
        lm lmVar = this.L;
        ValueAnimator valueAnimator = lmVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f9 = this.C;
        this.F = f9;
        this.D = b10.x;
        this.E = b10.y;
        lmVar.G = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
        lmVar.H = ofFloat;
        ofFloat.addUpdateListener(new fm(this, 1));
        lmVar.H.addListener(new org.telegram.ui.bm(this, 18));
        lmVar.H.setDuration(200L);
        lmVar.H.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        cm cmVar = chatAttachAlertPhotoLayout.C;
        ni niVar = chatAttachAlertPhotoLayout.b;
        ol olVar = chatAttachAlertPhotoLayout.A;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.o1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.p1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = olVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = cmVar.f;
                    boolean z12 = cmVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.I0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                        R--;
                    }
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    if (niVar.M0 != 0 || niVar.D) {
                        r5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        r5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, R == cmVar.h() - 1, niVar.e0);
                        if ((niVar.b0 instanceof org.telegram.ui.tn) && niVar.P1) {
                            r5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            r5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
        int d = j7.l1.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
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
            jm jmVar = (jm) arrayList.get(i10);
            if (jmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - jmVar.k.g.size();
                jm jmVar2 = (jm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, jmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) jmVar2.k.g.remove(0));
                }
                jmVar.k.g.addAll(arrayList2);
                jm.a(jmVar, jmVar.k, true);
                jm.a(jmVar2, jmVar2.k, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        im imVar;
        float f10 = this.n;
        lm lmVar = this.L;
        int computeVerticalScrollOffset = lmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - lmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - lmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f10);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f11 = f10;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            jm jmVar = (jm) arrayList2.get(i13);
            float b10 = jmVar.b();
            jmVar.a = f11;
            jmVar.b = i14;
            float f12 = this.v;
            if (f11 < f12 || f11 > this.w) {
                float f13 = f11 + b10;
                if ((f13 < f12 || f13 > this.w) && (f11 > f12 || f13 < this.w)) {
                    f9 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f9);
                    f11 += f9;
                    i14 = jmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = jmVar.h;
            int i15 = jmVar.l;
            org.telegram.ui.ActionBar.d5 d5Var = jmVar.x;
            km kmVar = jmVar.z;
            arrayList = arrayList2;
            float interpolation = jmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - jmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(jmVar.f, jmVar.d, interpolation);
            int width = kmVar.getWidth();
            lm lmVar2 = kmVar.L;
            float previewScale = width * lerp * lmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = lmVar2.getPreviewScale() * AndroidUtilities.lerp(jmVar.g, jmVar.e, interpolation) * max;
            if (d5Var != null) {
                jmVar.p = 0.0f;
                float width2 = kmVar.getWidth();
                float f14 = i15;
                jmVar.n = (width2 - Math.max(f14, previewScale)) / 2.0f;
                jmVar.o = (Math.max(f14, previewScale) + kmVar.getWidth()) / 2.0f;
                jmVar.q = Math.max(i15 * 2, previewScale2);
                jmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) jmVar.n, (int) jmVar.p, (int) jmVar.o, (int) jmVar.q);
                d5Var.setAlpha((int) ((jmVar.d <= 0.0f ? 1.0f - interpolation : jmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                d5Var.d(canvas, jmVar.y, null);
                jmVar.p += f14;
                jmVar.n += f14;
                jmVar.q -= f14;
                jmVar.o -= f14;
            }
            jmVar.r = jmVar.o - jmVar.n;
            jmVar.s = jmVar.q - jmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                im imVar2 = (im) arrayList3.get(i16);
                if (imVar2 != null && (((imVar = lmVar2.F) == null || imVar.b != imVar2.b) && imVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = jmVar.w;
            RectF rectF = jmVar.t;
            long j10 = jmVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f9 = b10;
            } else {
                if (jmVar.u == null || jmVar.v != j10) {
                    jmVar.v = j10;
                    jmVar.u = new zz0(jh.ia.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + jmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f15 = jmVar.n;
                float f16 = jmVar.r;
                float A = com.google.android.recaptcha.internal.a.A(f16, dp, 2.0f, f15);
                i10 = size;
                float f17 = jmVar.p;
                i11 = i13;
                float f18 = jmVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f18, dp2, 2.0f, f17), j7.l1.c(f16, dp, 2.0f, f15), j7.l1.c(f18, dp2, 2.0f, f17));
                paint.setColor(1610612736);
                float f19 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f19, f19, paint);
                f9 = b10;
                jmVar.u.c(AndroidUtilities.dp(14.0f) + (((jmVar.r / 2.0f) + jmVar.n) - (dp / 2.0f)), jmVar.p + (jmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f9);
            f11 += f9;
            i14 = jmVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.W(f11, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (lmVar.F != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (lmVar.F.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        if (this.s <= 0) {
            this.s = j7.l1.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
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
        jm jmVar;
        im imVar;
        float f9;
        jm jmVar2;
        im imVar2;
        int action;
        int i10;
        boolean z10;
        im imVar3;
        int i11;
        org.telegram.ui.tn tnVar;
        im imVar4;
        em emVar;
        ArrayList arrayList;
        im imVar5;
        im imVar6;
        ValueAnimator valueAnimator;
        em emVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        lm lmVar = this.L;
        ni niVar = lmVar.b;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                jmVar = null;
                break;
            }
            jmVar = (jm) arrayList2.get(i15);
            float b10 = jmVar.b();
            if (y8 >= f11 && y8 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (jmVar != null) {
            ArrayList arrayList3 = jmVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                imVar = (im) arrayList3.get(i16);
                if (imVar != null && imVar.d().contains(x4, y8 - f11)) {
                    break;
                }
            }
        }
        imVar = null;
        im imVar7 = lmVar.F;
        if (imVar7 != null) {
            RectF f12 = imVar7.f(imVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f9 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            jmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                jm jmVar3 = (jm) arrayList2.get(i17);
                float b12 = jmVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            jmVar2 = jmVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (jmVar2 != null) {
                ArrayList arrayList4 = jmVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                imVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    im imVar8 = (im) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (imVar8 == null || imVar8 == lmVar.F) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (jmVar2.k.g.contains(imVar8.b)) {
                            RectF d = imVar8.d();
                            int i20 = imVar8.i;
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
                            if ((imVar8.i & 8) > 0) {
                                d.bottom = jmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    imVar2 = imVar8;
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
                lh.m7 m7Var = this.I;
                if (action == 0 || lmVar.F != null || lmVar.r.G1 || (((valueAnimator = lmVar.H) != null && valueAnimator.isRunning()) || jmVar == null || imVar == null || (emVar2 = jmVar.k) == null || !emVar2.g.contains(imVar.b))) {
                    i10 = 1;
                    if (action == 2 || lmVar.F == null || lmVar.G) {
                        if (action == 1 || (imVar5 = lmVar.F) == null) {
                            if (action == 1 || lmVar.F != null || (imVar3 = this.B) == null || this.A == null) {
                                z10 = false;
                                i10 = 1;
                                if (action == i10 && action != 3) {
                                    return z10;
                                }
                                this.y = 0L;
                                removeCallbacks(m7Var);
                                this.H = false;
                                if (!z10) {
                                    return z10;
                                }
                                h();
                                return true;
                            }
                            if (imVar3.e && imVar3.l == 0.0f) {
                                float x10 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                imVar3.m = x10;
                                imVar3.n = y10;
                                RectF d10 = imVar3.d();
                                imVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) i7.w.a(imVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(jr.j);
                                duration.addUpdateListener(new j6(imVar3, 11));
                                duration.addListener(new hm(imVar3));
                                duration.start();
                            } else {
                                RectF d11 = imVar3.d();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                float dp = d11.right - AndroidUtilities.dp(36.4f);
                                float f19 = this.A.p + d11.top;
                                rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                                if (!rectF2.contains(x4, y8 - this.B.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        jm jmVar4 = (jm) arrayList2.get(i21);
                                        if (jmVar4 != null && (emVar = jmVar4.k) != null && (arrayList = emVar.g) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.B.b);
                                    int i22 = niVar.M0;
                                    org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
                                    if (i22 != 0) {
                                        i11 = 1;
                                    } else if (o2Var instanceof org.telegram.ui.tn) {
                                        tnVar = (org.telegram.ui.tn) o2Var;
                                        i11 = 0;
                                        if (o2Var == null) {
                                            o2Var = LaunchActivity.R();
                                        }
                                        if (!niVar.V1.a0()) {
                                            AndroidUtilities.hideKeyboard(o2Var.getFragmentView().findFocus());
                                            AndroidUtilities.hideKeyboard(niVar.getContainer().findFocus());
                                        }
                                        PhotoViewer.t1().K2(null, o2Var, lmVar.a);
                                        PhotoViewer.t1().L2(niVar);
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i23 = niVar.O1;
                                        boolean z11 = niVar.P1;
                                        t12.h = i23;
                                        t12.n = z11;
                                        this.J.a = arrayList6;
                                        PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i11, false, this.J, tnVar);
                                        lmVar.L.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                            PhotoViewer t13 = PhotoViewer.t1();
                                            Editable text = niVar.m1().getText();
                                            t13.l7 = true;
                                            t13.m7 = text;
                                            imVar4 = null;
                                            t13.A2(null, text, false, false);
                                            t13.t3(null);
                                            this.B = imVar4;
                                            this.y = 0L;
                                            lmVar.F = imVar4;
                                            this.C = 0.0f;
                                        }
                                    } else {
                                        i11 = 4;
                                    }
                                    tnVar = null;
                                    if (o2Var == null) {
                                    }
                                    if (!niVar.V1.a0()) {
                                    }
                                    PhotoViewer.t1().K2(null, o2Var, lmVar.a);
                                    PhotoViewer.t1().L2(niVar);
                                    PhotoViewer t122 = PhotoViewer.t1();
                                    int i232 = niVar.O1;
                                    boolean z112 = niVar.P1;
                                    t122.h = i232;
                                    t122.n = z112;
                                    this.J.a = arrayList6;
                                    PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i11, false, this.J, tnVar);
                                    lmVar.L.getClass();
                                    if (ChatAttachAlertPhotoLayout.T()) {
                                    }
                                } else if (lmVar.getSelectedItemsCount() > 1) {
                                    MediaController.PhotoEntry photoEntry = this.B.b;
                                    int indexOf2 = this.A.k.g.indexOf(photoEntry);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = lmVar.L;
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
                                        jm jmVar5 = this.A;
                                        jmVar5.k.g.remove(indexOf2);
                                        jm.a(jmVar5, jmVar5.k, true);
                                        j();
                                        i(lmVar.L, false);
                                        int i25 = this.K + 1;
                                        this.K = i25;
                                        lmVar.w.k(0L, 82, photoEntry, null, null, new ag.z1(this, jmVar5, photoEntry, indexOf2, 15));
                                        postDelayed(new i8(this, i25, 3), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = lmVar.H;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                imVar4 = null;
                                this.B = imVar4;
                                this.y = 0L;
                                lmVar.F = imVar4;
                                this.C = 0.0f;
                            }
                        } else {
                            if (jmVar == null || imVar == null || imVar == imVar5) {
                                if (jmVar2 == null || imVar2 == null || imVar2 == imVar5 || imVar2.b == imVar5.b) {
                                    jmVar = null;
                                    imVar = null;
                                } else {
                                    jmVar = jmVar2;
                                    imVar = imVar2;
                                }
                            }
                            if (jmVar != null) {
                                ArrayList arrayList8 = jmVar.h;
                                if (imVar != null && imVar != imVar5) {
                                    int indexOf3 = imVar5.a.k.g.indexOf(imVar5.b);
                                    int indexOf4 = jmVar.k.g.indexOf(imVar.b);
                                    if (indexOf3 >= 0) {
                                        lmVar.F.a.k.g.remove(indexOf3);
                                        jm jmVar6 = lmVar.F.a;
                                        jm.a(jmVar6, jmVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(jmVar) > arrayList2.indexOf(lmVar.F.a)) {
                                            indexOf4++;
                                        }
                                        f(jmVar, lmVar.F.b, indexOf4);
                                        if (lmVar.F.a != jmVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    imVar6 = null;
                                                    break;
                                                }
                                                imVar6 = (im) arrayList8.get(i26);
                                                if (imVar6.b == lmVar.F.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (imVar6 != null) {
                                                g();
                                                im imVar9 = lmVar.F;
                                                RectF rectF3 = imVar6.g;
                                                jm jmVar7 = imVar6.O;
                                                float f20 = imVar9.j;
                                                RectF rectF4 = imVar9.g;
                                                imVar6.j = AndroidUtilities.lerp(f20, imVar9.k, imVar9.e());
                                                if (imVar6.f == null) {
                                                    imVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = imVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF6, rectF3, imVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = imVar9.f;
                                                if (rectF7 != null) {
                                                    AndroidUtilities.lerp(rectF7, rectF4, imVar9.e(), imVar6.f);
                                                    imVar6.f.set(rectF5.centerX() - (((imVar6.f.width() / f9) * imVar9.a.r) / jmVar7.r), rectF5.centerY() - (((imVar6.f.height() / f9) * imVar9.a.s) / jmVar7.s), (((imVar6.f.width() / f9) * imVar9.a.r) / jmVar7.r) + rectF5.centerX(), (((imVar6.f.height() / f9) * imVar9.a.s) / jmVar7.s) + rectF5.centerY());
                                                } else {
                                                    imVar6.f.set(rectF5.centerX() - (((rectF4.width() / f9) * imVar9.a.r) / jmVar7.r), rectF5.centerY() - (((rectF4.height() / f9) * imVar9.a.s) / jmVar7.s), (((rectF4.width() / f9) * imVar9.a.r) / jmVar7.r) + rectF5.centerX(), (((rectF4.height() / f9) * imVar9.a.s) / jmVar7.s) + rectF5.centerY());
                                                }
                                                imVar6.j = AndroidUtilities.lerp(imVar6.j, imVar6.k, imVar6.e());
                                                imVar6.h = SystemClock.elapsedRealtime();
                                                lmVar.F = imVar6;
                                                imVar6.a = jmVar;
                                                imVar6.j = 1.0f;
                                                imVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        lmVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(lmVar.L, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        if (action == i10) {
                        }
                        this.y = 0L;
                        removeCallbacks(m7Var);
                        this.H = false;
                        if (!z10) {
                        }
                    } else {
                        lmVar.y = x4;
                        lmVar.A = y8;
                        if (!this.H) {
                            this.H = true;
                            postDelayed(m7Var, 16L);
                        }
                        invalidate();
                    }
                } else {
                    this.A = jmVar;
                    this.B = imVar;
                    lmVar.y = x4;
                    lmVar.A = y8;
                    lmVar.F = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    i10 = 1;
                    AndroidUtilities.runOnUIThread(new g5.v(this, elapsedRealtime, this.B, 22), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                if (action == i10) {
                }
                this.y = 0L;
                removeCallbacks(m7Var);
                this.H = false;
                if (!z10) {
                }
            }
        } else {
            f9 = 2.0f;
            jmVar2 = null;
        }
        imVar2 = null;
        action = motionEvent.getAction();
        lh.m7 m7Var2 = this.I;
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
        removeCallbacks(m7Var2);
        this.H = false;
        if (!z10) {
        }
    }
}
