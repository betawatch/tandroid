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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class an extends ViewGroup {
    public zm E;
    public ym F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.k7 M;
    public final wm N;
    public int O;
    public final /* synthetic */ bn P;
    public final org.telegram.ui.Cells.x0 a;
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
    public an(bn bnVar, Context context) {
        super(context);
        this.P = bnVar;
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
        this.M = new org.telegram.ui.Cells.k7(this, 6);
        this.N = new wm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context, bnVar.n, true);
        this.a = x0Var;
        x0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(x0Var);
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
            ArrayList arrayList2 = ((zm) arrayList.get(i10)).k.g;
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
        bn bnVar = this.P;
        ym ymVar = bnVar.J;
        PointF pointF = this.K;
        if (ymVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (bnVar.K) {
            RectF f7 = ymVar.f(ymVar.e());
            RectF f10 = bnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + bnVar.J.a.a + f10.top, this.I, this.G / this.J);
            return pointF;
        }
        RectF f11 = ymVar.f(ymVar.e());
        RectF f12 = bnVar.J.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, bnVar.y - ((bnVar.G - 0.5f) * bnVar.H), this.G);
        pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + bnVar.J.a.a + f12.top, (bnVar.E - ((bnVar.F - 0.5f) * bnVar.I)) + bnVar.M, this.G);
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
            ArrayList arrayList2 = ((zm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ym ymVar = (ym) arrayList2.get(i11);
                wh.f fVar = ymVar.s;
                if (fVar != null) {
                    fVar.b(ymVar.O.z);
                    ymVar.s = null;
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
                zm zmVar = new zm(this);
                zm.a(zmVar, new um(this.P, arrayList3), false);
                arrayList.add(zmVar);
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
            float b10 = ((zm) arrayList.get(i10)).b() + f7;
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
            i10 = (int) (((zm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.x0 x0Var = this.a;
        if (x0Var.getMeasuredHeight() <= 0) {
            x0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return x0Var.getMeasuredHeight() + i10;
    }

    public final void f(zm zmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = zmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (zmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) zmVar.k.g.get(10);
            zmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(zmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                zm zmVar2 = i11 == arrayList2.size() ? null : (zm) arrayList2.get(i11);
                if (zmVar2 == null) {
                    zm zmVar3 = new zm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    zm.a(zmVar3, new um(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(zmVar2, photoEntry2, 0);
                }
            }
        }
        zm.a(zmVar, zmVar.k, true);
    }

    public final void g() {
        float f7 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            zm zmVar = (zm) arrayList.get(i11);
            float b10 = zmVar.b();
            zmVar.a = f7;
            zmVar.b = i10;
            f7 += b10;
            i10 += zmVar.k.g.size();
        }
    }

    public final void h() {
        bn bnVar = this.P;
        ValueAnimator valueAnimator = bnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        bnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        bnVar.L = ofFloat;
        ofFloat.addUpdateListener(new vm(this, 1));
        bnVar.L.addListener(new org.telegram.ui.pq(this, 15));
        bnVar.L.setDuration(200L);
        bnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        sm smVar = chatAttachAlertPhotoLayout.G;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        em emVar = chatAttachAlertPhotoLayout.E;
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
            int childCount = emVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = emVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = smVar.f;
                    boolean z14 = smVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (tiVar.T0 != 0 || tiVar.H) {
                        s5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        s5Var.d(b02, hashMap2.size() > 1, z14 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0, R == smVar.h() - 1, tiVar.i0);
                        if ((tiVar.f0 instanceof org.telegram.ui.sn) && tiVar.W1) {
                            z11 = false;
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            z11 = false;
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
            zm zmVar = (zm) arrayList.get(i10);
            if (zmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - zmVar.k.g.size();
                zm zmVar2 = (zm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, zmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) zmVar2.k.g.remove(0));
                }
                zmVar.k.g.addAll(arrayList2);
                zm.a(zmVar, zmVar.k, true);
                zm.a(zmVar2, zmVar2.k, true);
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
        ym ymVar;
        float f11 = this.n;
        bn bnVar = this.P;
        int computeVerticalScrollOffset = bnVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - bnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            zm zmVar = (zm) arrayList2.get(i13);
            float b10 = zmVar.b();
            zmVar.a = f12;
            zmVar.b = i14;
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
                    i14 = zmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = zmVar.h;
            int i15 = zmVar.l;
            org.telegram.ui.ActionBar.f5 f5Var = zmVar.x;
            an anVar = zmVar.z;
            arrayList = arrayList2;
            float interpolation = zmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - zmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(zmVar.f, zmVar.d, interpolation);
            int width = anVar.getWidth();
            bn bnVar2 = anVar.P;
            float previewScale = width * lerp * bnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = bnVar2.getPreviewScale() * AndroidUtilities.lerp(zmVar.g, zmVar.e, interpolation) * max;
            if (f5Var != null) {
                f10 = 2.0f;
                zmVar.p = 0.0f;
                float width2 = anVar.getWidth();
                float f15 = i15;
                zmVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                zmVar.o = (Math.max(f15, previewScale) + anVar.getWidth()) / 2.0f;
                zmVar.q = Math.max(i15 * 2, previewScale2);
                zmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                f5Var.setBounds((int) zmVar.n, (int) zmVar.p, (int) zmVar.o, (int) zmVar.q);
                f5Var.setAlpha((int) ((zmVar.d <= 0.0f ? 1.0f - interpolation : zmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                f5Var.d(canvas, zmVar.y, null);
                zmVar.p += f15;
                zmVar.n += f15;
                zmVar.q -= f15;
                zmVar.o -= f15;
            } else {
                f10 = 2.0f;
            }
            zmVar.r = zmVar.o - zmVar.n;
            zmVar.s = zmVar.q - zmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                ym ymVar2 = (ym) arrayList3.get(i16);
                if (ymVar2 != null && (((ymVar = bnVar2.J) == null || ymVar.b != ymVar2.b) && ymVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = zmVar.w;
            RectF rectF = zmVar.t;
            long j10 = zmVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (zmVar.u == null || zmVar.v != j10) {
                    zmVar.v = j10;
                    zmVar.u = new d11(ai.ld.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + zmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = zmVar.n;
                float f17 = zmVar.r;
                float f18 = f10;
                float z12 = com.google.android.gms.internal.cast.a6.z(f17, dp, f18, f16);
                i10 = size;
                float f19 = zmVar.p;
                i11 = i13;
                float f20 = zmVar.s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.cast.a6.z(f20, dp2, f18, f19), org.telegram.messenger.q.a(f17, dp, f18, f16), org.telegram.messenger.q.a(f20, dp2, f18, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / f18;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                d11 d11Var = zmVar.u;
                float dp3 = AndroidUtilities.dp(14.0f) + (((zmVar.r / f18) + zmVar.n) - (dp / f18));
                float f22 = zmVar.p + (zmVar.s / f18);
                f7 = b10;
                d11Var.c(dp3, f22, 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = zmVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.x0 x0Var = this.a;
        x0Var.a0(f12, x0Var.getMeasuredHeight());
        if (x0Var.K()) {
            x0Var.A(canvas, true);
            x0Var.C(canvas, true);
        }
        x0Var.draw(canvas);
        canvas.restore();
        if (bnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (bnVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.x0 x0Var = this.a;
        x0Var.layout(0, 0, x0Var.getMeasuredWidth(), x0Var.getMeasuredHeight());
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
        zm zmVar;
        ym ymVar;
        float f7;
        zm zmVar2;
        ym ymVar2;
        int action;
        boolean z10;
        ym ymVar3;
        int i10;
        org.telegram.ui.sn snVar;
        ym ymVar4;
        um umVar;
        ArrayList arrayList;
        int i11;
        ym ymVar5;
        ym ymVar6;
        ValueAnimator valueAnimator;
        um umVar2;
        int i12;
        int i13;
        int i14;
        float f10;
        bn bnVar = this.P;
        ti tiVar = bnVar.b;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i15 = 0;
        float f11 = 0.0f;
        while (true) {
            if (i15 >= size) {
                zmVar = null;
                break;
            }
            zmVar = (zm) arrayList2.get(i15);
            float b10 = zmVar.b();
            if (y3 >= f11 && y3 <= f11 + b10) {
                break;
            }
            f11 += b10;
            i15++;
        }
        if (zmVar != null) {
            ArrayList arrayList3 = zmVar.h;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                ymVar = (ym) arrayList3.get(i16);
                if (ymVar != null && ymVar.d().contains(x10, y3 - f11)) {
                    break;
                }
            }
        }
        ymVar = null;
        ym ymVar7 = bnVar.J;
        if (ymVar7 != null) {
            RectF f12 = ymVar7.f(ymVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f13 = b11.x;
            float f14 = b11.y;
            f7 = 2.0f;
            rectF.set(f13 - (f12.width() / 2.0f), f14 - (f12.height() / 2.0f), (f12.width() / 2.0f) + f13, (f12.height() / 2.0f) + f14);
            int i17 = 0;
            zmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i17 < size) {
                zm zmVar3 = (zm) arrayList2.get(i17);
                float b12 = zmVar3.b() + f15;
                int i18 = size;
                if (b12 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float min = Math.min(b12, f17) - Math.max(f15, rectF.top);
                        if (min > f16) {
                            f16 = min;
                            zmVar2 = zmVar3;
                        }
                    }
                }
                i17++;
                f15 = b12;
                size = i18;
            }
            if (zmVar2 != null) {
                ArrayList arrayList4 = zmVar2.h;
                int size3 = arrayList4.size();
                int i19 = 0;
                ymVar2 = null;
                float f18 = 0.0f;
                while (i19 < size3) {
                    ym ymVar8 = (ym) arrayList4.get(i19);
                    ArrayList arrayList5 = arrayList4;
                    if (ymVar8 == null || ymVar8 == bnVar.J) {
                        i12 = size3;
                    } else {
                        i12 = size3;
                        if (zmVar2.k.g.contains(ymVar8.b)) {
                            RectF d = ymVar8.d();
                            int i20 = ymVar8.i;
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
                            if ((ymVar8.i & 8) > 0) {
                                d.bottom = zmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i13 = i19;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f18) {
                                    f18 = min2;
                                    ymVar2 = ymVar8;
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
                org.telegram.ui.Cells.k7 k7Var = this.M;
                if (action == 0 || bnVar.J != null || bnVar.r.I1 || (((valueAnimator = bnVar.L) != null && valueAnimator.isRunning()) || zmVar == null || ymVar == null || (umVar2 = zmVar.k) == null || !umVar2.g.contains(ymVar.b))) {
                    if (action == 2 || bnVar.J == null || bnVar.K) {
                        if (action == 1 || (ymVar5 = bnVar.J) == null) {
                            if (action == 1 || bnVar.J != null || (ymVar3 = this.F) == null || this.E == null) {
                                z10 = false;
                                i11 = 1;
                                if (action != i11 || action == 3) {
                                    this.y = 0L;
                                    removeCallbacks(k7Var);
                                    this.L = false;
                                    if (!z10) {
                                        h();
                                        return i11;
                                    }
                                }
                                return z10;
                            }
                            if (ymVar3.e && ymVar3.l == 0.0f) {
                                float x11 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                ymVar3.m = x11;
                                ymVar3.n = y10;
                                RectF d10 = ymVar3.d();
                                ymVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) w7.r.a(ymVar3.o * 0.3f, 250.0f, 550.0f));
                                duration.setInterpolator(bs.j);
                                duration.addUpdateListener(new l6(ymVar3, 12));
                                duration.addListener(new xm(ymVar3));
                                duration.start();
                            } else {
                                RectF d11 = ymVar3.d();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                float dp = d11.right - AndroidUtilities.dp(36.4f);
                                float f19 = this.E.p + d11.top;
                                rectF2.set(dp, f19, d11.right, AndroidUtilities.dp(36.4f) + f19);
                                if (!rectF2.contains(x10, y3 - this.F.a.a)) {
                                    a();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size4 = arrayList2.size();
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        zm zmVar4 = (zm) arrayList2.get(i21);
                                        if (zmVar4 != null && (umVar = zmVar4.k) != null && (arrayList = umVar.g) != null) {
                                            arrayList6.addAll(arrayList);
                                        }
                                    }
                                    int indexOf = arrayList6.indexOf(this.F.b);
                                    int i22 = tiVar.T0;
                                    org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
                                    if (i22 != 0) {
                                        i10 = 1;
                                    } else if (n2Var instanceof org.telegram.ui.sn) {
                                        snVar = (org.telegram.ui.sn) n2Var;
                                        i10 = 0;
                                        if (n2Var == null) {
                                            n2Var = LaunchActivity.R();
                                        }
                                        if (!tiVar.c2.v()) {
                                            AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
                                            AndroidUtilities.hideKeyboard(tiVar.getContainer().findFocus());
                                        }
                                        PhotoViewer.t1().K2(null, n2Var, bnVar.a);
                                        PhotoViewer.t1().L2(tiVar);
                                        PhotoViewer t12 = PhotoViewer.t1();
                                        int i23 = tiVar.V1;
                                        boolean z11 = tiVar.W1;
                                        t12.h = i23;
                                        t12.n = z11;
                                        this.N.a = arrayList6;
                                        PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i10, false, this.N, snVar);
                                        bnVar.P.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                            PhotoViewer t13 = PhotoViewer.t1();
                                            Editable text = tiVar.o1().getText();
                                            t13.p7 = true;
                                            t13.q7 = text;
                                            ymVar4 = null;
                                            t13.A2(null, text, false, false);
                                            t13.t3(null);
                                            this.F = ymVar4;
                                            this.y = 0L;
                                            bnVar.J = ymVar4;
                                            this.G = 0.0f;
                                        }
                                    } else {
                                        i10 = 4;
                                    }
                                    snVar = null;
                                    if (n2Var == null) {
                                    }
                                    if (!tiVar.c2.v()) {
                                    }
                                    PhotoViewer.t1().K2(null, n2Var, bnVar.a);
                                    PhotoViewer.t1().L2(tiVar);
                                    PhotoViewer t122 = PhotoViewer.t1();
                                    int i232 = tiVar.V1;
                                    boolean z112 = tiVar.W1;
                                    t122.h = i232;
                                    t122.n = z112;
                                    this.N.a = arrayList6;
                                    PhotoViewer.t1().g2(new ArrayList(arrayList6), indexOf, i10, false, this.N, snVar);
                                    bnVar.P.getClass();
                                    if (ChatAttachAlertPhotoLayout.T()) {
                                    }
                                } else if (bnVar.getSelectedItemsCount() > 1) {
                                    MediaController.PhotoEntry photoEntry = this.F.b;
                                    int indexOf2 = this.E.k.g.indexOf(photoEntry);
                                    if (indexOf2 >= 0) {
                                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bnVar.P;
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
                                        zm zmVar5 = this.E;
                                        zmVar5.k.g.remove(indexOf2);
                                        zm.a(zmVar5, zmVar5.k, true);
                                        j();
                                        i(bnVar.P, false);
                                        int i25 = this.O + 1;
                                        this.O = i25;
                                        bnVar.w.k(0L, 82, photoEntry, null, null, new ai.bb(this, zmVar5, photoEntry, indexOf2, 17));
                                        postDelayed(new e2(this, i25, 5), 4000L);
                                    }
                                    ValueAnimator valueAnimator2 = bnVar.L;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                }
                                ymVar4 = null;
                                this.F = ymVar4;
                                this.y = 0L;
                                bnVar.J = ymVar4;
                                this.G = 0.0f;
                            }
                        } else {
                            if (zmVar == null || ymVar == null || ymVar == ymVar5) {
                                if (zmVar2 == null || ymVar2 == null || ymVar2 == ymVar5 || ymVar2.b == ymVar5.b) {
                                    zmVar = null;
                                    ymVar = null;
                                } else {
                                    zmVar = zmVar2;
                                    ymVar = ymVar2;
                                }
                            }
                            if (zmVar != null) {
                                ArrayList arrayList8 = zmVar.h;
                                if (ymVar != null && ymVar != ymVar5) {
                                    int indexOf3 = ymVar5.a.k.g.indexOf(ymVar5.b);
                                    int indexOf4 = zmVar.k.g.indexOf(ymVar.b);
                                    if (indexOf3 >= 0) {
                                        bnVar.J.a.k.g.remove(indexOf3);
                                        zm zmVar6 = bnVar.J.a;
                                        zm.a(zmVar6, zmVar6.k, true);
                                    }
                                    if (indexOf4 >= 0) {
                                        if (arrayList2.indexOf(zmVar) > arrayList2.indexOf(bnVar.J.a)) {
                                            indexOf4++;
                                        }
                                        f(zmVar, bnVar.J.b, indexOf4);
                                        if (bnVar.J.a != zmVar) {
                                            int size6 = arrayList8.size();
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size6) {
                                                    ymVar6 = null;
                                                    break;
                                                }
                                                ymVar6 = (ym) arrayList8.get(i26);
                                                if (ymVar6.b == bnVar.J.b) {
                                                    break;
                                                }
                                                i26++;
                                            }
                                            if (ymVar6 != null) {
                                                g();
                                                ym ymVar9 = bnVar.J;
                                                RectF rectF3 = ymVar6.g;
                                                zm zmVar7 = ymVar6.O;
                                                float f20 = ymVar9.j;
                                                RectF rectF4 = ymVar9.g;
                                                ymVar6.j = AndroidUtilities.lerp(f20, ymVar9.k, ymVar9.e());
                                                if (ymVar6.f == null) {
                                                    ymVar6.f = new RectF();
                                                }
                                                RectF rectF5 = new RectF();
                                                RectF rectF6 = ymVar6.f;
                                                if (rectF6 == null) {
                                                    rectF5.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF6, rectF3, ymVar6.e(), rectF5);
                                                }
                                                RectF rectF7 = ymVar9.f;
                                                if (rectF7 != null) {
                                                    AndroidUtilities.lerp(rectF7, rectF4, ymVar9.e(), ymVar6.f);
                                                    ymVar6.f.set(rectF5.centerX() - (((ymVar6.f.width() / f7) * ymVar9.a.r) / zmVar7.r), rectF5.centerY() - (((ymVar6.f.height() / f7) * ymVar9.a.s) / zmVar7.s), (((ymVar6.f.width() / f7) * ymVar9.a.r) / zmVar7.r) + rectF5.centerX(), (((ymVar6.f.height() / f7) * ymVar9.a.s) / zmVar7.s) + rectF5.centerY());
                                                } else {
                                                    ymVar6.f.set(rectF5.centerX() - (((rectF4.width() / f7) * ymVar9.a.r) / zmVar7.r), rectF5.centerY() - (((rectF4.height() / f7) * ymVar9.a.s) / zmVar7.s), (((rectF4.width() / f7) * ymVar9.a.r) / zmVar7.r) + rectF5.centerX(), (((rectF4.height() / f7) * ymVar9.a.s) / zmVar7.s) + rectF5.centerY());
                                                }
                                                ymVar6.j = AndroidUtilities.lerp(ymVar6.j, ymVar6.k, ymVar6.e());
                                                ymVar6.h = SystemClock.elapsedRealtime();
                                                bnVar.J = ymVar6;
                                                ymVar6.a = zmVar;
                                                ymVar6.j = 1.0f;
                                                ymVar6.k = 1.0f;
                                                g();
                                            }
                                        }
                                    }
                                    try {
                                        bnVar.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    j();
                                    i(bnVar.P, false);
                                }
                            }
                            h();
                        }
                        z10 = true;
                        i11 = 1;
                        if (action != i11) {
                        }
                        this.y = 0L;
                        removeCallbacks(k7Var);
                        this.L = false;
                        if (!z10) {
                        }
                        return z10;
                    }
                    bnVar.y = x10;
                    bnVar.E = y3;
                    if (!this.L) {
                        this.L = true;
                        postDelayed(k7Var, 16L);
                    }
                    invalidate();
                } else {
                    this.E = zmVar;
                    this.F = ymVar;
                    bnVar.y = x10;
                    bnVar.E = y3;
                    bnVar.J = null;
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
                removeCallbacks(k7Var);
                this.L = false;
                if (!z10) {
                }
                return z10;
            }
        } else {
            f7 = 2.0f;
            zmVar2 = null;
        }
        ymVar2 = null;
        action = motionEvent.getAction();
        org.telegram.ui.Cells.k7 k7Var2 = this.M;
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
        removeCallbacks(k7Var2);
        this.L = false;
        if (!z10) {
        }
        return z10;
    }
}
