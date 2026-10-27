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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bn extends ViewGroup {
    public an E;
    public zm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final m.g3 M;
    public final xm N;
    public int O;
    public final /* synthetic */ cn P;
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
    public bn(cn cnVar, Context context) {
        super(context);
        this.P = cnVar;
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
        this.M = new m.g3(this, 12);
        this.N = new xm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, cnVar.n, true);
        this.a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
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
            ArrayList arrayList2 = ((an) arrayList.get(i10)).k.g;
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
        cn cnVar = this.P;
        zm zmVar = cnVar.J;
        PointF pointF = this.K;
        if (zmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (cnVar.K) {
            RectF f7 = zmVar.f(zmVar.e());
            RectF f10 = cnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + cnVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = zmVar.f(zmVar.e());
        RectF f12 = cnVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, cnVar.y - ((cnVar.G - 0.5f) * cnVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + cnVar.J.a.a + f12.top, (cnVar.E - ((cnVar.F - 0.5f) * cnVar.I)) + cnVar.M, this.G);
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
            ArrayList arrayList2 = ((an) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                zm zmVar = (zm) arrayList2.get(i11);
                xh.f fVar = zmVar.s;
                if (fVar != null) {
                    fVar.b(zmVar.O.z);
                    zmVar.s = null;
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
                an anVar = new an(this);
                an.a(anVar, new vm(this.P, arrayList3), false);
                arrayList.add(anVar);
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
            float b10 = ((an) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((an) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(an anVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = anVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (anVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) anVar.k.g.get(10);
            anVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(anVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                an anVar2 = i11 == arrayList2.size() ? null : (an) arrayList2.get(i11);
                if (anVar2 == null) {
                    an anVar3 = new an(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    an.a(anVar3, new vm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(anVar2, photoEntry2, 0);
                }
            }
        }
        an.a(anVar, anVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            an anVar = (an) arrayList.get(i11);
            float b10 = anVar.b();
            anVar.a = f7;
            anVar.b = i10;
            f7 += b10;
            i10 += anVar.k.g.size();
        }
    }

    public final void h() {
        cn cnVar = this.P;
        ValueAnimator valueAnimator = cnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        cnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        cnVar.L = ofFloat;
        ofFloat.addUpdateListener(new wm(this, 1));
        cnVar.L.addListener(new org.telegram.ui.sp(this, 16));
        cnVar.L.setDuration(200L);
        cnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        tm tmVar = chatAttachAlertPhotoLayout.G;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        fm fmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z12 = false;
            chatAttachAlertPhotoLayout.z0(false);
            chatAttachAlertPhotoLayout.x0();
            int childCount = fmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = tmVar.f;
                    boolean z14 = tmVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    if (tiVar.T0 != 0 || tiVar.H) {
                        x5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry c02 = chatAttachAlertPhotoLayout.c0(R);
                    if (c02 != null) {
                        x5Var.d(c02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == tmVar.h() - 1, tiVar.i0);
                        if ((tiVar.f0 instanceof org.telegram.ui.wn) && tiVar.W1) {
                            z11 = false;
                            x5Var.b(arrayList2.indexOf(Integer.valueOf(c02.imageId)), hashMap2.containsKey(Integer.valueOf(c02.imageId)), false);
                        } else {
                            z11 = false;
                            x5Var.b(-1, hashMap2.containsKey(Integer.valueOf(c02.imageId)), false);
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
            this.P.b.d2(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int c10 = org.telegram.messenger.t.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.s != c10) {
            this.s = c10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            an anVar = (an) arrayList.get(i10);
            if (anVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - anVar.k.g.size();
                an anVar2 = (an) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, anVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) anVar2.k.g.remove(0));
                }
                anVar.k.g.addAll(arrayList2);
                an.a(anVar, anVar.k, true);
                an.a(anVar2, anVar2.k, true);
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
        zm zmVar;
        float f11 = this.n;
        cn cnVar = this.P;
        int computeVerticalScrollOffset = cnVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - cnVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - cnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            an anVar = (an) arrayList2.get(i13);
            float b10 = anVar.b();
            anVar.a = f12;
            anVar.b = i14;
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
                    i14 = anVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = anVar.h;
            int i15 = anVar.l;
            org.telegram.ui.ActionBar.l5 l5Var = anVar.x;
            bn bnVar = anVar.z;
            arrayList = arrayList2;
            float interpolation = anVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - anVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(anVar.f, anVar.d, interpolation);
            int width = bnVar.getWidth();
            cn cnVar2 = bnVar.P;
            float previewScale = width * lerp * cnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = cnVar2.getPreviewScale() * AndroidUtilities.lerp(anVar.g, anVar.e, interpolation) * max;
            if (l5Var != null) {
                f10 = 2.0f;
                anVar.p = 0.0f;
                float width2 = bnVar.getWidth();
                float f15 = i15;
                anVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                anVar.o = (Math.max(f15, previewScale) + bnVar.getWidth()) / 2.0f;
                anVar.q = Math.max(i15 * 2, previewScale2);
                anVar.x.n(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                l5Var.setBounds((int) anVar.n, (int) anVar.p, (int) anVar.o, (int) anVar.q);
                l5Var.setAlpha((int) ((anVar.d <= 0.0f ? 1.0f - interpolation : anVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                l5Var.d(canvas, anVar.y, null);
                anVar.p += f15;
                anVar.n += f15;
                anVar.q -= f15;
                anVar.o -= f15;
            } else {
                f10 = 2.0f;
            }
            anVar.r = anVar.o - anVar.n;
            anVar.s = anVar.q - anVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                zm zmVar2 = (zm) arrayList3.get(i16);
                if (zmVar2 != null && (((zmVar = cnVar2.J) == null || zmVar.b != zmVar2.b) && zmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = anVar.w;
            RectF rectF = anVar.t;
            long j10 = anVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (anVar.u == null || anVar.v != j10) {
                    anVar.v = j10;
                    anVar.u = new r11(bi.dd.W0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + anVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = anVar.n;
                float f17 = anVar.r;
                float f18 = f10;
                float B = c3.h0.B(f17, dp, f18, f16);
                i10 = size;
                float f19 = anVar.p;
                i11 = i13;
                float f20 = anVar.s;
                i12 = i14;
                rectF.set(B, c3.h0.B(f20, dp2, f18, f19), org.telegram.messenger.t.b(f17, dp, f18, f16), org.telegram.messenger.t.b(f20, dp2, f18, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / f18;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                r11 r11Var = anVar.u;
                float dp3 = AndroidUtilities.dp(14.0f) + (((anVar.r / f18) + anVar.n) - (dp / f18));
                float f22 = anVar.p + (anVar.s / f18);
                f7 = b10;
                r11Var.c(dp3, f22, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = anVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.Y(f12, v0Var.getMeasuredHeight());
        if (v0Var.J()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (cnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (cnVar.J.c(canvas, true)) {
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
            this.s = org.telegram.messenger.t.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
        an anVar;
        zm zmVar;
        float f7;
        an anVar2;
        zm zmVar2;
        int action;
        boolean z10;
        zm zmVar3;
        int i10;
        org.telegram.ui.wn wnVar;
        zm zmVar4;
        vm vmVar;
        ArrayList arrayList;
        int i11;
        zm zmVar5;
        zm zmVar6;
        ValueAnimator valueAnimator;
        vm vmVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        cn cnVar = this.P;
        ti tiVar = cnVar.b;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                anVar = null;
                break;
            }
            anVar = (an) arrayList2.get(i15);
            float b10 = anVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (anVar != null) {
            ArrayList arrayList3 = anVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                zmVar = (zm) arrayList3.get(i16);
                if (zmVar != null && zmVar.d().contains(x9, y3 - f11)) {
                    break;
                }
            }
        }
        zmVar = null;
        zm zmVar7 = cnVar.J;
        if (zmVar7 != null) {
            RectF f12 = zmVar7.f(zmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            anVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                an anVar3 = (an) arrayList2.get(i17);
                float b12 = anVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            anVar2 = anVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (anVar2 != null) {
                ArrayList arrayList4 = anVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                zmVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    zm zmVar8 = (zm) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (zmVar8 == null || zmVar8 == cnVar.J) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (anVar2.k.g.contains(zmVar8.b)) {
                            RectF d = zmVar8.d();
                            int i20 = zmVar8.i;
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
                            if ((zmVar8.i & 8) > 0) {
                                d.bottom = anVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    zmVar2 = zmVar8;
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
                m.g3 g3Var = this.M;
                if (action == 0 || cnVar.J != null || cnVar.r.I1 || (((valueAnimator = cnVar.L) != null && valueAnimator.isRunning()) || anVar == null || zmVar == null || (vmVar2 = anVar.k) == null || !vmVar2.g.contains(zmVar.b))) {
                    if (action == 2 || cnVar.J == null || cnVar.K) {
                        if (action == 1 || (zmVar5 = cnVar.J) == null) {
                            if (action == 1 || cnVar.J != null || (zmVar3 = this.F) == null || this.E == null) {
                                z10 = false;
                                i11 = 1;
                                if (action != i11 || action == 3) {
                                    this.y = 0L;
                                    removeCallbacks(g3Var);
                                    this.L = false;
                                    if (!z10) {
                                        h();
                                        return i11;
                                    }
                                }
                                return z10;
                            }
                            if (zmVar3.e && zmVar3.l == 0.0f) {
                                float x10 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                zmVar3.m = x10;
                                zmVar3.n = y10;
                                RectF d10 = zmVar3.d();
                                zmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) a8.ee.a(zmVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(ds.j);
                                duration.addUpdateListener(new n6(zmVar3, 13));
                                duration.addListener(new ym(zmVar3));
                                duration.start();
                            } else {
                                RectF d11 = zmVar3.d();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                float dp = d11.right - AndroidUtilities.dp(36.4f);
                                float f19 = this.E.p + d11.top;
                                rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                                if (!rectF2.contains(x9, y3 - this.F.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        an anVar4 = (an) arrayList2.get(i21);
                                        if (anVar4 != null && (vmVar = anVar4.k) != null && (arrayList = vmVar.g) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = tiVar.T0;
                                    org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
                                    if (i22 != 0) {
                                        i10 = 1;
                                    } else if (r2Var instanceof org.telegram.ui.wn) {
                                        wnVar = (org.telegram.ui.wn) r2Var;
                                        i10 = 0;
                                        if (r2Var == null) {
                                            r2Var = LaunchActivity.R();
                                        }
                                        if (!tiVar.c2.E()) {
                                            AndroidUtilities.hideKeyboard(r2Var.getFragmentView().findFocus());
                                            AndroidUtilities.hideKeyboard(tiVar.getContainer().findFocus());
                                        }
                                        PhotoViewer.v1().N2(null, r2Var, cnVar.a);
                                        PhotoViewer.v1().O2(tiVar);
                                        PhotoViewer v12 = PhotoViewer.v1();
                                        int i23 = tiVar.V1;
                                        boolean z11 = tiVar.W1;
                                        v12.h = i23;
                                        v12.n = z11;
                                        this.N.a = arrayList6;
                                        PhotoViewer.v1().j2(new ArrayList(arrayList6), indexOf, i10, false, this.N, wnVar);
                                        cnVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.U()) {
                                            PhotoViewer v13 = PhotoViewer.v1();
                                            Editable text = tiVar.s1().getText();
                                            v13.p7 = true;
                                            v13.q7 = text;
                                            zmVar4 = null;
                                            v13.D2(null, text, false, false);
                                            v13.w3(null);
                                            this.F = zmVar4;
                                            this.y = 0L;
                                            cnVar.J = zmVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i10 = 4;
                                    }
                                    wnVar = null;
                                    if (r2Var == null) {
                                    }
                                    if (!tiVar.c2.E()) {
                                    }
                                    PhotoViewer.v1().N2(null, r2Var, cnVar.a);
                                    PhotoViewer.v1().O2(tiVar);
                                    PhotoViewer v122 = PhotoViewer.v1();
                                    int i232 = tiVar.V1;
                                    boolean z112 = tiVar.W1;
                                    v122.h = i232;
                                    v122.n = z112;
                                    this.N.a = arrayList6;
                                    PhotoViewer.v1().j2(new ArrayList(arrayList6), indexOf, i10, false, this.N, wnVar);
                                    cnVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.U()) {
                                    }
                                } else if (cnVar.getSelectedItemsCount() > 1) {
                                    MediaController.PhotoEntry photoEntry = this.F.b;
                                    int indexOf2 = this.E.k.g.indexOf(photoEntry);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cnVar.P;
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
                                        an anVar5 = this.E;
                                        anVar5.k.g.remove(indexOf2);
                                        an.a(anVar5, anVar5.k, true);
                                        j();
                                        i(cnVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        cnVar.w.k(0L, 82, photoEntry, null, null, new ai.h1(this, anVar5, photoEntry, indexOf2, 20));
                                        postDelayed(new h2(this, i25, 5), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = cnVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                zmVar4 = null;
                                this.F = zmVar4;
                                this.y = 0L;
                                cnVar.J = zmVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (anVar == null || zmVar == null || zmVar == zmVar5) {
                                if (anVar2 == null || zmVar2 == null || zmVar2 == zmVar5 || zmVar2.b == zmVar5.b) {
                                    anVar = null;
                                    zmVar = null;
                                } else {
                                    anVar = anVar2;
                                    zmVar = zmVar2;
                                }
                            }
                            if (anVar != null) {
                                ArrayList arrayList8 = anVar.h;
                                if (zmVar != null && zmVar != zmVar5) {
                                    int indexOf3 = zmVar5.a.k.g.indexOf(zmVar5.b);
                                    int indexOf4 = anVar.k.g.indexOf(zmVar.b);
                                    if (indexOf3 >= 0) {
                                        cnVar.J.a.k.g.remove(indexOf3);
                                        an anVar6 = cnVar.J.a;
                                        an.a(anVar6, anVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(anVar) > arrayList2.indexOf(cnVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(anVar, cnVar.J.b, indexOf4);
                                        if (cnVar.J.a != anVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    zmVar6 = null;
                                                    break;
                                                }
                                                zmVar6 = (zm) arrayList8.get(i26);
                                                if (zmVar6.b == cnVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (zmVar6 != null) {
                                                g();
                                                zm zmVar9 = cnVar.J;
                                                RectF rectF3 = zmVar6.g;
                                                an anVar7 = zmVar6.O;
                                                float f20 = zmVar9.j;
                                                RectF rectF4 = zmVar9.g;
                                                zmVar6.j = AndroidUtilities.lerp(f20, zmVar9.k, zmVar9.e());
                                                if (zmVar6.f == null) {
                                                    zmVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = zmVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF6, rectF3, zmVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = zmVar9.f;
                                                if (rectF7 != null) {
                                                    AndroidUtilities.lerp(rectF7, rectF4, zmVar9.e(), zmVar6.f);
                                                    zmVar6.f.set(rectF5.centerX() - (((zmVar6.f.width() / f7) * zmVar9.a.r) / anVar7.r), rectF5.centerY() - (((zmVar6.f.height() / f7) * zmVar9.a.s) / anVar7.s), (((zmVar6.f.width() / f7) * zmVar9.a.r) / anVar7.r) + rectF5.centerX(), (((zmVar6.f.height() / f7) * zmVar9.a.s) / anVar7.s) + rectF5.centerY());
                                                } else {
                                                    zmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * zmVar9.a.r) / anVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * zmVar9.a.s) / anVar7.s), (((rectF4.width() / f7) * zmVar9.a.r) / anVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * zmVar9.a.s) / anVar7.s) + rectF5.centerY());
                                                }
                                                zmVar6.j = AndroidUtilities.lerp(zmVar6.j, zmVar6.k, zmVar6.e());
                                                zmVar6.h = SystemClock.elapsedRealtime();
                                                cnVar.J = zmVar6;
                                                zmVar6.a = anVar;
                                                zmVar6.j = 1.0f;
                                                zmVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        cnVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(cnVar.P, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i11 = 1;
                        if (action != i11) {
                        }
                        this.y = 0L;
                        removeCallbacks(g3Var);
                        this.L = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    cnVar.y = x9;
                    cnVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(g3Var, 16L);
                    }
                    invalidate();
                } else {
                    this.E = anVar;
                    this.F = zmVar;
                    cnVar.y = x9;
                    cnVar.E = y3;
                    cnVar.J = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new a3.i0(this, elapsedRealtime, this.F, 22), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z10 = true;
                i11 = 1;
                if (action != i11) {
                }
                this.y = 0L;
                removeCallbacks(g3Var);
                this.L = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f7 = 2.0f;
            anVar2 = null;
        }
        zmVar2 = null;
        action = motionEvent.getAction();
        m.g3 g3Var2 = this.M;
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
        removeCallbacks(g3Var2);
        this.L = false;
        if (!z10) {
        }
        return z10;
    }
}
