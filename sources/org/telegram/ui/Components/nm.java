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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nm extends ViewGroup {
    public mm B;
    public lm C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final jm K;
    public int L;
    public final /* synthetic */ om M;
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
    public nm(om omVar, Context context) {
        super(context);
        this.M = omVar;
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
        this.K = new jm(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, omVar.n, true);
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
            ArrayList arrayList2 = ((mm) arrayList.get(i10)).k.g;
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
        om omVar = this.M;
        lm lmVar = omVar.G;
        PointF pointF = this.H;
        if (lmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (omVar.H) {
            RectF f10 = lmVar.f(lmVar.e());
            RectF f11 = omVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + omVar.G.a.a + f11.top, this.F, this.D / this.G);
            return pointF;
        }
        RectF f12 = lmVar.f(lmVar.e());
        RectF f13 = omVar.G.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, omVar.y - ((omVar.D - 0.5f) * omVar.E), this.D);
        pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + omVar.G.a.a + f13.top, (omVar.B - ((omVar.C - 0.5f) * omVar.F)) + omVar.J, this.D);
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
            ArrayList arrayList2 = ((mm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                lm lmVar = (lm) arrayList2.get(i11);
                ih.j jVar = lmVar.s;
                if (jVar != null) {
                    jVar.b(lmVar.O.z);
                    lmVar.s = null;
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
                mm mmVar = new mm(this);
                mm.a(mmVar, new gm(this.M, arrayList3), false);
                arrayList.add(mmVar);
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
            float b10 = ((mm) arrayList.get(i10)).b() + f10;
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
            i10 = (int) (((mm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(mm mmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = mmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (mmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) mmVar.k.g.get(10);
            mmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(mmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                mm mmVar2 = i11 == arrayList2.size() ? null : (mm) arrayList2.get(i11);
                if (mmVar2 == null) {
                    mm mmVar3 = new mm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    mm.a(mmVar3, new gm(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(mmVar2, photoEntry2, 0);
                }
            }
        }
        mm.a(mmVar, mmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            mm mmVar = (mm) arrayList.get(i11);
            float b10 = mmVar.b();
            mmVar.a = f10;
            mmVar.b = i10;
            f10 += b10;
            i10 += mmVar.k.g.size();
        }
    }

    public final void h() {
        om omVar = this.M;
        ValueAnimator valueAnimator = omVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        omVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        omVar.I = ofFloat;
        ofFloat.addUpdateListener(new im(this, 1));
        omVar.I.addListener(new a9(this, 9));
        omVar.I.setDuration(200L);
        omVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        em emVar = chatAttachAlertPhotoLayout.D;
        li liVar = chatAttachAlertPhotoLayout.b;
        pl plVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.q1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z4) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = plVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z10 = emVar.f;
                    boolean z11 = emVar.d;
                    if (z10 && R > chatAttachAlertPhotoLayout.J0) {
                        R--;
                    }
                    if (z11 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (liVar.N0 != 0 || liVar.E) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        t5Var.d(b02, hashMap2.size() > 1, z11 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0, R == emVar.h() - 1, liVar.f0);
                        if ((liVar.c0 instanceof org.telegram.ui.xn) && liVar.Q1) {
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
        int c3 = kh.a2.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
            mm mmVar = (mm) arrayList.get(i10);
            if (mmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - mmVar.k.g.size();
                mm mmVar2 = (mm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, mmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) mmVar2.k.g.remove(0));
                }
                mmVar.k.g.addAll(arrayList2);
                mm.a(mmVar, mmVar.k, true);
                mm.a(mmVar2, mmVar2.k, true);
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
        lm lmVar;
        float f11 = this.n;
        om omVar = this.M;
        int computeVerticalScrollOffset = omVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - omVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - omVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            mm mmVar = (mm) arrayList2.get(i13);
            float b10 = mmVar.b();
            mmVar.a = f12;
            mmVar.b = i14;
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
                    i14 = mmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = mmVar.h;
            int i15 = mmVar.l;
            org.telegram.ui.ActionBar.g5 g5Var = mmVar.x;
            nm nmVar = mmVar.z;
            arrayList = arrayList2;
            float interpolation = mmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - mmVar.c) / 200.0f));
            boolean z4 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(mmVar.f, mmVar.d, interpolation);
            int width = nmVar.getWidth();
            om omVar2 = nmVar.M;
            float previewScale = width * lerp * omVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = omVar2.getPreviewScale() * AndroidUtilities.lerp(mmVar.g, mmVar.e, interpolation) * max;
            if (g5Var != null) {
                mmVar.p = 0.0f;
                float width2 = nmVar.getWidth();
                float f15 = i15;
                mmVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                mmVar.o = (Math.max(f15, previewScale) + nmVar.getWidth()) / 2.0f;
                mmVar.q = Math.max(i15 * 2, previewScale2);
                mmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                g5Var.setBounds((int) mmVar.n, (int) mmVar.p, (int) mmVar.o, (int) mmVar.q);
                g5Var.setAlpha((int) ((mmVar.d <= 0.0f ? 1.0f - interpolation : mmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                g5Var.d(canvas, mmVar.y, null);
                mmVar.p += f15;
                mmVar.n += f15;
                mmVar.q -= f15;
                mmVar.o -= f15;
            }
            mmVar.r = mmVar.o - mmVar.n;
            mmVar.s = mmVar.q - mmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                lm lmVar2 = (lm) arrayList3.get(i16);
                if (lmVar2 != null && (((lmVar = omVar2.G) == null || lmVar.b != lmVar2.b) && lmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = mmVar.w;
            RectF rectF = mmVar.t;
            long j10 = mmVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (mmVar.u == null || mmVar.v != j10) {
                    mmVar.v = j10;
                    mmVar.u = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + mmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = mmVar.n;
                float f17 = mmVar.r;
                float x10 = e2.c.x(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = mmVar.p;
                i11 = i13;
                float f19 = mmVar.s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f19, dp2, 2.0f, f18), kh.a2.b(f17, dp, 2.0f, f16), kh.a2.b(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f10 = b10;
                mmVar.u.c(AndroidUtilities.dp(14.0f) + (((mmVar.r / 2.0f) + mmVar.n) - (dp / 2.0f)), mmVar.p + (mmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f12 += f10;
            i14 = mmVar.k.g.size() + i12;
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
        if (omVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (omVar.G.c(canvas, true)) {
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
            this.s = kh.a2.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
        mm mmVar;
        lm lmVar;
        float f10;
        mm mmVar2;
        lm lmVar2;
        int action;
        boolean z4;
        lm lmVar3;
        int i10;
        org.telegram.ui.xn xnVar;
        lm lmVar4;
        gm gmVar;
        ArrayList arrayList;
        lm lmVar5;
        lm lmVar6;
        ValueAnimator valueAnimator;
        gm gmVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        om omVar = this.M;
        li liVar = omVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                mmVar = null;
                break;
            }
            mmVar = (mm) arrayList2.get(i14);
            float b10 = mmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (mmVar != null) {
            ArrayList arrayList3 = mmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                lmVar = (lm) arrayList3.get(i15);
                if (lmVar != null && lmVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        lmVar = null;
        lm lmVar7 = omVar.G;
        if (lmVar7 != null) {
            RectF f13 = lmVar7.f(lmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            mmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                mm mmVar3 = (mm) arrayList2.get(i16);
                float b12 = mmVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            mmVar2 = mmVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (mmVar2 != null) {
                ArrayList arrayList4 = mmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                lmVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    lm lmVar8 = (lm) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (lmVar8 == null || lmVar8 == omVar.G) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (mmVar2.k.g.contains(lmVar8.b)) {
                            RectF d = lmVar8.d();
                            int i19 = lmVar8.i;
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
                            if ((lmVar8.i & 8) > 0) {
                                d.bottom = mmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    lmVar2 = lmVar8;
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
                if (action != 0 && omVar.G == null && !omVar.r.H1 && (((valueAnimator = omVar.I) == null || !valueAnimator.isRunning()) && mmVar != null && lmVar != null && (gmVar2 = mmVar.k) != null && gmVar2.g.contains(lmVar.b))) {
                    this.B = mmVar;
                    this.C = lmVar;
                    omVar.y = x10;
                    omVar.B = y10;
                    omVar.G = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new i5.v(this, elapsedRealtime, this.C, 21), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && omVar.G != null && !omVar.H) {
                    omVar.y = x10;
                    omVar.B = y10;
                    if (!this.I) {
                        this.I = true;
                        postDelayed(bVar, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (lmVar5 = omVar.G) == null) {
                    if (action == 1 || omVar.G != null || (lmVar3 = this.C) == null || this.B == null) {
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
                    if (lmVar3.e && lmVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        lmVar3.m = x11;
                        lmVar3.n = y11;
                        RectF d10 = lmVar3.d();
                        lmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) k7.n.a(lmVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(nr.j);
                        duration.addUpdateListener(new f6(lmVar3, 11));
                        duration.addListener(new km(lmVar3));
                        duration.start();
                    } else {
                        RectF d11 = lmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f20 = this.B.p + d11.top;
                        rectF2.set(dp, f20, d11.right, AndroidUtilities.dp(36.4f) + f20);
                        if (!rectF2.contains(x10, y10 - this.C.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                mm mmVar4 = (mm) arrayList2.get(i20);
                                if (mmVar4 != null && (gmVar = mmVar4.k) != null && (arrayList = gmVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.C.b);
                            int i21 = liVar.N0;
                            org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (p2Var instanceof org.telegram.ui.xn) {
                                xnVar = (org.telegram.ui.xn) p2Var;
                                i10 = 0;
                                if (p2Var == null) {
                                    p2Var = LaunchActivity.R();
                                }
                                if (!liVar.W1.k()) {
                                    AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(liVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, p2Var, omVar.a);
                                PhotoViewer.t1().L2(liVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = liVar.P1;
                                boolean z10 = liVar.Q1;
                                t12.h = i22;
                                t12.n = z10;
                                this.K.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.K, xnVar);
                                omVar.M.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = liVar.m1().getText();
                                    t13.m7 = true;
                                    t13.n7 = text;
                                    lmVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.C = lmVar4;
                                    this.y = 0L;
                                    omVar.G = lmVar4;
                                    this.D = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            xnVar = null;
                            if (p2Var == null) {
                            }
                            if (!liVar.W1.k()) {
                            }
                            PhotoViewer.t1().K2(null, p2Var, omVar.a);
                            PhotoViewer.t1().L2(liVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = liVar.P1;
                            boolean z102 = liVar.Q1;
                            t122.h = i222;
                            t122.n = z102;
                            this.K.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.K, xnVar);
                            omVar.M.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (omVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.C.b;
                            int indexOf2 = this.B.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = omVar.M;
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
                                mm mmVar5 = this.B;
                                mmVar5.k.g.remove(indexOf2);
                                mm.a(mmVar5, mmVar5.k, true);
                                j();
                                i(omVar.M, false);
                                int i24 = this.L + 1;
                                this.L = i24;
                                omVar.w.k(0L, 82, photoEntry, null, null, new cg.v1(this, mmVar5, photoEntry, indexOf2, 15));
                                postDelayed(new hm(this, i24, 0), 4000L);
                            }
                            ValueAnimator valueAnimator2 = omVar.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        lmVar4 = null;
                        this.C = lmVar4;
                        this.y = 0L;
                        omVar.G = lmVar4;
                        this.D = 0.0f;
                    }
                } else {
                    if (mmVar == null || lmVar == null || lmVar == lmVar5) {
                        if (mmVar2 == null || lmVar2 == null || lmVar2 == lmVar5 || lmVar2.b == lmVar5.b) {
                            mmVar = null;
                            lmVar = null;
                        } else {
                            mmVar = mmVar2;
                            lmVar = lmVar2;
                        }
                    }
                    if (mmVar != null) {
                        ArrayList arrayList8 = mmVar.h;
                        if (lmVar != null && lmVar != lmVar5) {
                            int indexOf3 = lmVar5.a.k.g.indexOf(lmVar5.b);
                            int indexOf4 = mmVar.k.g.indexOf(lmVar.b);
                            if (indexOf3 >= 0) {
                                omVar.G.a.k.g.remove(indexOf3);
                                mm mmVar6 = omVar.G.a;
                                mm.a(mmVar6, mmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(mmVar) > arrayList2.indexOf(omVar.G.a)) {
                                    indexOf4++;
                                }
                                f(mmVar, omVar.G.b, indexOf4);
                                if (omVar.G.a != mmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            lmVar6 = null;
                                            break;
                                        }
                                        lmVar6 = (lm) arrayList8.get(i25);
                                        if (lmVar6.b == omVar.G.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (lmVar6 != null) {
                                        g();
                                        lm lmVar9 = omVar.G;
                                        RectF rectF3 = lmVar6.g;
                                        mm mmVar7 = lmVar6.O;
                                        float f21 = lmVar9.j;
                                        RectF rectF4 = lmVar9.g;
                                        lmVar6.j = AndroidUtilities.lerp(f21, lmVar9.k, lmVar9.e());
                                        if (lmVar6.f == null) {
                                            lmVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = lmVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, lmVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = lmVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, lmVar9.e(), lmVar6.f);
                                            lmVar6.f.set(rectF5.centerX() - (((lmVar6.f.width() / f10) * lmVar9.a.r) / mmVar7.r), rectF5.centerY() - (((lmVar6.f.height() / f10) * lmVar9.a.s) / mmVar7.s), (((lmVar6.f.width() / f10) * lmVar9.a.r) / mmVar7.r) + rectF5.centerX(), (((lmVar6.f.height() / f10) * lmVar9.a.s) / mmVar7.s) + rectF5.centerY());
                                        } else {
                                            lmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * lmVar9.a.r) / mmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * lmVar9.a.s) / mmVar7.s), (((rectF4.width() / f10) * lmVar9.a.r) / mmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * lmVar9.a.s) / mmVar7.s) + rectF5.centerY());
                                        }
                                        lmVar6.j = AndroidUtilities.lerp(lmVar6.j, lmVar6.k, lmVar6.e());
                                        lmVar6.h = SystemClock.elapsedRealtime();
                                        omVar.G = lmVar6;
                                        lmVar6.a = mmVar;
                                        lmVar6.j = 1.0f;
                                        lmVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                omVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(omVar.M, false);
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
            mmVar2 = null;
        }
        lmVar2 = null;
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
