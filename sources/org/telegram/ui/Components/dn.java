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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dn extends ViewGroup {
    public cn E;
    public bn F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.l7 M;
    public final zm N;
    public int O;
    public final /* synthetic */ en P;
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
    public dn(en enVar, Context context) {
        super(context);
        this.P = enVar;
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
        this.M = new org.telegram.ui.Cells.l7(this, 6);
        this.N = new zm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, enVar.n, true);
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
            ArrayList arrayList2 = ((cn) arrayList.get(i10)).k.g;
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
        en enVar = this.P;
        bn bnVar = enVar.J;
        PointF pointF = this.K;
        if (bnVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (enVar.K) {
            RectF f7 = bnVar.f(bnVar.e());
            RectF f10 = enVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + enVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = bnVar.f(bnVar.e());
        RectF f12 = enVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, enVar.y - ((enVar.G - 0.5f) * enVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + enVar.J.a.a + f12.top, (enVar.E - ((enVar.F - 0.5f) * enVar.I)) + enVar.M, this.G);
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
            ArrayList arrayList2 = ((cn) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                bn bnVar = (bn) arrayList2.get(i11);
                wh.f fVar = bnVar.s;
                if (fVar != null) {
                    fVar.b(bnVar.O.z);
                    bnVar.s = null;
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
                cn cnVar = new cn(this);
                cn.a(cnVar, new xm(this.P, arrayList3), false);
                arrayList.add(cnVar);
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
            float b10 = ((cn) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            zArr[i10] = (f7 >= f10 && f7 <= this.w) || (b10 >= f10 && b10 <= this.w) || (f7 <= f10 && b10 >= this.w);
            i10++;
            f7 = b10;
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
            i10 = (int) (((cn) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(cn cnVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = cnVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (cnVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) cnVar.k.g.get(10);
            cnVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(cnVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                cn cnVar2 = i11 == arrayList2.size() ? null : (cn) arrayList2.get(i11);
                if (cnVar2 == null) {
                    cn cnVar3 = new cn(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    cn.a(cnVar3, new xm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(cnVar2, photoEntry2, 0);
                }
            }
        }
        cn.a(cnVar, cnVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            cn cnVar = (cn) arrayList.get(i11);
            float b10 = cnVar.b();
            cnVar.a = f7;
            cnVar.b = i10;
            f7 += b10;
            i10 += cnVar.k.g.size();
        }
    }

    public final void h() {
        en enVar = this.P;
        ValueAnimator valueAnimator = enVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        enVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        enVar.L = ofFloat;
        ofFloat.addUpdateListener(new ym(this, 1));
        enVar.L.addListener(new l6(this, 13));
        enVar.L.setDuration(200L);
        enVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        um umVar = chatAttachAlertPhotoLayout.G;
        vi viVar = chatAttachAlertPhotoLayout.b;
        gm gmVar = chatAttachAlertPhotoLayout.E;
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
            int childCount = gmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = gmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = umVar.f;
                    boolean z14 = umVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (viVar.T0 != 0 || viVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == umVar.h() - 1, viVar.i0);
                        if ((viVar.f0 instanceof org.telegram.ui.fo) && viVar.W1) {
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
        int b10 = org.telegram.messenger.g0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
            cn cnVar = (cn) arrayList.get(i10);
            if (cnVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - cnVar.k.g.size();
                cn cnVar2 = (cn) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, cnVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) cnVar2.k.g.remove(0));
                }
                cnVar.k.g.addAll(arrayList2);
                cn.a(cnVar, cnVar.k, true);
                cn.a(cnVar2, cnVar2.k, true);
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
        bn bnVar;
        float f11 = this.n;
        en enVar = this.P;
        int computeVerticalScrollOffset = enVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - enVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - enVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            cn cnVar = (cn) arrayList2.get(i13);
            float b10 = cnVar.b();
            cnVar.a = f12;
            cnVar.b = i14;
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
                    i14 = cnVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = cnVar.h;
            int i15 = cnVar.l;
            org.telegram.ui.ActionBar.d5 d5Var = cnVar.x;
            dn dnVar = cnVar.z;
            arrayList = arrayList2;
            float interpolation = cnVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - cnVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(cnVar.f, cnVar.d, interpolation);
            int width = dnVar.getWidth();
            en enVar2 = dnVar.P;
            float previewScale = width * lerp * enVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = enVar2.getPreviewScale() * AndroidUtilities.lerp(cnVar.g, cnVar.e, interpolation) * max;
            if (d5Var != null) {
                f10 = 2.0f;
                cnVar.p = 0.0f;
                float width2 = dnVar.getWidth();
                float f15 = i15;
                cnVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                cnVar.o = (Math.max(f15, previewScale) + dnVar.getWidth()) / 2.0f;
                cnVar.q = Math.max(i15 * 2, previewScale2);
                cnVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) cnVar.n, (int) cnVar.p, (int) cnVar.o, (int) cnVar.q);
                d5Var.setAlpha((int) ((cnVar.d <= 0.0f ? 1.0f - interpolation : cnVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                d5Var.d(canvas, cnVar.y, null);
                cnVar.p += f15;
                cnVar.n += f15;
                cnVar.q -= f15;
                cnVar.o -= f15;
            } else {
                f10 = 2.0f;
            }
            cnVar.r = cnVar.o - cnVar.n;
            cnVar.s = cnVar.q - cnVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                bn bnVar2 = (bn) arrayList3.get(i16);
                if (bnVar2 != null && (((bnVar = enVar2.J) == null || bnVar.b != bnVar2.b) && bnVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = cnVar.w;
            RectF rectF = cnVar.t;
            long j10 = cnVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (cnVar.u == null || cnVar.v != j10) {
                    cnVar.v = j10;
                    cnVar.u = new i11(zh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + cnVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = cnVar.n;
                float f17 = cnVar.r;
                float f18 = f10;
                float z12 = com.google.android.gms.internal.play_billing.k3.z(f17, dp, f18, f16);
                i10 = size;
                float f19 = cnVar.p;
                i11 = i13;
                float f20 = cnVar.s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.play_billing.k3.z(f20, dp2, f18, f19), org.telegram.messenger.g0.a(f17, dp, f18, f16), org.telegram.messenger.g0.a(f20, dp2, f18, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / f18;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                i11 i11Var = cnVar.u;
                float dp3 = AndroidUtilities.dp(14.0f) + (((cnVar.r / f18) + cnVar.n) - (dp / f18));
                float f22 = cnVar.p + (cnVar.s / f18);
                f7 = b10;
                i11Var.c(dp3, f22, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = cnVar.k.g.size() + i12;
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
        if (enVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (enVar.J.c(canvas, true)) {
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
            this.s = org.telegram.messenger.g0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cn cnVar;
        bn bnVar;
        float f7;
        cn cnVar2;
        bn bnVar2;
        int action;
        int i10;
        boolean z10;
        bn bnVar3;
        int i11;
        org.telegram.ui.fo foVar;
        bn bnVar4;
        xm xmVar;
        ArrayList arrayList;
        bn bnVar5;
        bn bnVar6;
        boolean z11;
        ValueAnimator valueAnimator;
        xm xmVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        en enVar = this.P;
        vi viVar = enVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                cnVar = null;
                break;
            }
            cnVar = (cn) arrayList2.get(i15);
            float b10 = cnVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (cnVar != null) {
            ArrayList arrayList3 = cnVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                bnVar = (bn) arrayList3.get(i16);
                if (bnVar != null && bnVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        bnVar = null;
        bn bnVar7 = enVar.J;
        if (bnVar7 != null) {
            RectF f12 = bnVar7.f(bnVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            cnVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                cn cnVar3 = (cn) arrayList2.get(i17);
                float b12 = cnVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            cnVar2 = cnVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (cnVar2 != null) {
                ArrayList arrayList4 = cnVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                bnVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    bn bnVar8 = (bn) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (bnVar8 == null || bnVar8 == enVar.J) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (cnVar2.k.g.contains(bnVar8.b)) {
                            RectF d = bnVar8.d();
                            int i20 = bnVar8.i;
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
                            if ((bnVar8.i & 8) > 0) {
                                d.bottom = cnVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    bnVar2 = bnVar8;
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
                if (action == 0 || enVar.J != null || enVar.r.I1 || (((valueAnimator = enVar.L) != null && valueAnimator.isRunning()) || cnVar == null || bnVar == null || (xmVar2 = cnVar.k) == null || !xmVar2.g.contains(bnVar.b))) {
                    i10 = 1;
                    if (action == 2 || enVar.J == null || enVar.K) {
                        if (action == 1 || (bnVar5 = enVar.J) == null) {
                            if (action == 1 || enVar.J != null || (bnVar3 = this.F) == null || this.E == null) {
                                z10 = false;
                                i10 = 1;
                                z11 = z10;
                                if (action == i10 && action != 3) {
                                    return z11;
                                }
                                this.y = 0L;
                                removeCallbacks(l7Var);
                                this.L = false;
                                if (z11 == 0) {
                                    return z11;
                                }
                                h();
                                return i10;
                            }
                            if (bnVar3.e && bnVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                bnVar3.m = x11;
                                bnVar3.n = y10;
                                RectF d10 = bnVar3.d();
                                bnVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.r.a(bnVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(es.j);
                                duration.addUpdateListener(new n6(bnVar3, 12));
                                duration.addListener(new an(bnVar3));
                                duration.start();
                            } else {
                                RectF d11 = bnVar3.d();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                float dp = d11.right - AndroidUtilities.dp(36.4f);
                                float f19 = this.E.p + d11.top;
                                rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                                if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        cn cnVar4 = (cn) arrayList2.get(i21);
                                        if (cnVar4 != null && (xmVar = cnVar4.k) != null && (arrayList = xmVar.g) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = viVar.T0;
                                    org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                                    if (i22 != 0) {
                                        i11 = 1;
                                    } else if (m2Var instanceof org.telegram.ui.fo) {
                                        foVar = (org.telegram.ui.fo) m2Var;
                                        i11 = 0;
                                        if (m2Var == null) {
                                            m2Var = LaunchActivity.R();
                                        }
                                        if (!viVar.c2.w()) {
                                            AndroidUtilities.hideKeyboard(m2Var.getFragmentView().findFocus());
                                            AndroidUtilities.hideKeyboard(viVar.getContainer().findFocus());
                                        }
                                        PhotoViewer.t1().K2(null, m2Var, enVar.a);
                                        PhotoViewer.t1().L2(viVar);
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i23 = viVar.V1;
                                        boolean z12 = viVar.W1;
                                        t12.h = i23;
                                        t12.n = z12;
                                        this.N.a = arrayList6;
                                        PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i11, false, this.N, foVar);
                                        enVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                            PhotoViewer t13 = PhotoViewer.t1();
                                            Editable text = viVar.o1().getText();
                                            t13.p7 = true;
                                            t13.q7 = text;
                                            bnVar4 = null;
                                            t13.A2(null, text, false, false);
                                            t13.t3(null);
                                            this.F = bnVar4;
                                            this.y = 0L;
                                            enVar.J = bnVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i11 = 4;
                                    }
                                    foVar = null;
                                    if (m2Var == null) {
                                    }
                                    if (!viVar.c2.w()) {
                                    }
                                    PhotoViewer.t1().K2(null, m2Var, enVar.a);
                                    PhotoViewer.t1().L2(viVar);
                                    PhotoViewer t122 = PhotoViewer.t1();
                                    int i232 = viVar.V1;
                                    boolean z122 = viVar.W1;
                                    t122.h = i232;
                                    t122.n = z122;
                                    this.N.a = arrayList6;
                                    PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i11, false, this.N, foVar);
                                    enVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.T()) {
                                    }
                                } else if (enVar.getSelectedItemsCount() > 1) {
                                    MediaController.PhotoEntry photoEntry = this.F.b;
                                    int indexOf2 = this.E.k.g.indexOf(photoEntry);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = enVar.P;
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
                                        cn cnVar5 = this.E;
                                        cnVar5.k.g.remove(indexOf2);
                                        cn.a(cnVar5, cnVar5.k, true);
                                        j();
                                        i(enVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        enVar.w.k(0L, 82, photoEntry, null, null, new bi.n8(this, cnVar5, photoEntry, indexOf2, 16));
                                        postDelayed(new o8(this, i25, 3), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = enVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                bnVar4 = null;
                                this.F = bnVar4;
                                this.y = 0L;
                                enVar.J = bnVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (cnVar == null || bnVar == null || bnVar == bnVar5) {
                                if (cnVar2 == null || bnVar2 == null || bnVar2 == bnVar5 || bnVar2.b == bnVar5.b) {
                                    cnVar = null;
                                    bnVar = null;
                                } else {
                                    cnVar = cnVar2;
                                    bnVar = bnVar2;
                                }
                            }
                            if (cnVar != null) {
                                ArrayList arrayList8 = cnVar.h;
                                if (bnVar != null && bnVar != bnVar5) {
                                    int indexOf3 = bnVar5.a.k.g.indexOf(bnVar5.b);
                                    int indexOf4 = cnVar.k.g.indexOf(bnVar.b);
                                    if (indexOf3 >= 0) {
                                        enVar.J.a.k.g.remove(indexOf3);
                                        cn cnVar6 = enVar.J.a;
                                        cn.a(cnVar6, cnVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(cnVar) > arrayList2.indexOf(enVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(cnVar, enVar.J.b, indexOf4);
                                        if (enVar.J.a != cnVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    bnVar6 = null;
                                                    break;
                                                }
                                                bnVar6 = (bn) arrayList8.get(i26);
                                                if (bnVar6.b == enVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (bnVar6 != null) {
                                                g();
                                                bn bnVar9 = enVar.J;
                                                RectF rectF3 = bnVar6.g;
                                                cn cnVar7 = bnVar6.O;
                                                float f20 = bnVar9.j;
                                                RectF rectF4 = bnVar9.g;
                                                bnVar6.j = AndroidUtilities.lerp(f20, bnVar9.k, bnVar9.e());
                                                if (bnVar6.f == null) {
                                                    bnVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = bnVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF6, rectF3, bnVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = bnVar9.f;
                                                if (rectF7 != null) {
                                                    AndroidUtilities.lerp(rectF7, rectF4, bnVar9.e(), bnVar6.f);
                                                    bnVar6.f.set(rectF5.centerX() - (((bnVar6.f.width() / f7) * bnVar9.a.r) / cnVar7.r), rectF5.centerY() - (((bnVar6.f.height() / f7) * bnVar9.a.s) / cnVar7.s), (((bnVar6.f.width() / f7) * bnVar9.a.r) / cnVar7.r) + rectF5.centerX(), (((bnVar6.f.height() / f7) * bnVar9.a.s) / cnVar7.s) + rectF5.centerY());
                                                } else {
                                                    bnVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * bnVar9.a.r) / cnVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * bnVar9.a.s) / cnVar7.s), (((rectF4.width() / f7) * bnVar9.a.r) / cnVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * bnVar9.a.s) / cnVar7.s) + rectF5.centerY());
                                                }
                                                bnVar6.j = AndroidUtilities.lerp(bnVar6.j, bnVar6.k, bnVar6.e());
                                                bnVar6.h = SystemClock.elapsedRealtime();
                                                enVar.J = bnVar6;
                                                bnVar6.a = cnVar;
                                                bnVar6.j = 1.0f;
                                                bnVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        enVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(enVar.P, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i10 = 1;
                        z11 = z10;
                        if (action == i10) {
                        }
                        this.y = 0L;
                        removeCallbacks(l7Var);
                        this.L = false;
                        if (z11 == 0) {
                        }
                    } else {
                        enVar.y = x10;
                        enVar.E = y3;
                        if (!this.L) {
                            this.L = true;
                            postDelayed(l7Var, 16L);
                        }
                        invalidate();
                    }
                } else {
                    this.E = cnVar;
                    this.F = bnVar;
                    enVar.y = x10;
                    enVar.E = y3;
                    enVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    i10 = 1;
                    AndroidUtilities.runOnUIThread(new a3.i0(this, elapsedRealtime, this.F, 19), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z11 = i10;
                if (action == i10) {
                }
                this.y = 0L;
                removeCallbacks(l7Var);
                this.L = false;
                if (z11 == 0) {
                }
            }
        } else {
            f7 = 2.0f;
            cnVar2 = null;
        }
        bnVar2 = null;
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
        z11 = z10;
        if (action == i10) {
        }
        this.y = 0L;
        removeCallbacks(l7Var2);
        this.L = false;
        if (z11 == 0) {
        }
    }
}
