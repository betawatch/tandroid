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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dm extends ViewGroup {
    public cm A;
    public bm B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final PointF G;
    public boolean H;
    public final m.i3 I;
    public final zl J;
    public int K;
    public final /* synthetic */ em L;
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
    public dm(em emVar, Context context) {
        super(context);
        this.L = emVar;
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
        this.J = new zl(this);
        this.K = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, emVar.n, true);
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
            ArrayList arrayList2 = ((cm) arrayList.get(i10)).k.g;
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
        em emVar = this.L;
        bm bmVar = emVar.F;
        PointF pointF = this.G;
        if (bmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (emVar.G) {
            RectF f10 = bmVar.f(bmVar.e());
            RectF f11 = emVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, this.D, this.C / this.F);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + emVar.F.a.a + f11.top, this.E, this.C / this.F);
            return pointF;
        }
        RectF f12 = bmVar.f(bmVar.e());
        RectF f13 = emVar.F.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, emVar.y - ((emVar.C - 0.5f) * emVar.D), this.C);
        pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + emVar.F.a.a + f13.top, (emVar.A - ((emVar.B - 0.5f) * emVar.E)) + emVar.I, this.C);
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
            ArrayList arrayList2 = ((cm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                bm bmVar = (bm) arrayList2.get(i11);
                eh.j jVar = bmVar.s;
                if (jVar != null) {
                    jVar.b(bmVar.O.z);
                    bmVar.s = null;
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
                cm cmVar = new cm(this);
                cm.a(cmVar, new wl(this.L, arrayList3), false);
                arrayList.add(cmVar);
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
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((cm) arrayList.get(i10)).b() + f10;
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
            i10 = (int) (((cm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(cm cmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = cmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (cmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) cmVar.k.g.get(10);
            cmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(cmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                cm cmVar2 = i11 == arrayList2.size() ? null : (cm) arrayList2.get(i11);
                if (cmVar2 == null) {
                    cm cmVar3 = new cm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    cm.a(cmVar3, new wl(this.L, arrayList3), true);
                    invalidate();
                } else {
                    f(cmVar2, photoEntry2, 0);
                }
            }
        }
        cm.a(cmVar, cmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            cm cmVar = (cm) arrayList.get(i11);
            float b10 = cmVar.b();
            cmVar.a = f10;
            cmVar.b = i10;
            f10 += b10;
            i10 += cmVar.k.g.size();
        }
    }

    public final void h() {
        em emVar = this.L;
        ValueAnimator valueAnimator = emVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.C;
        this.F = f10;
        this.D = b10.x;
        this.E = b10.y;
        emVar.G = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        emVar.H = ofFloat;
        ofFloat.addUpdateListener(new yl(this, 1));
        emVar.H.addListener(new org.telegram.ui.am(this, 18));
        emVar.H.setDuration(200L);
        emVar.H.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        gi giVar = chatAttachAlertPhotoLayout.b;
        gl glVar = chatAttachAlertPhotoLayout.A;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.o1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.p1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = glVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = glVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z11 = ulVar.f;
                    boolean z12 = ulVar.d;
                    if (z11 && R > chatAttachAlertPhotoLayout.I0) {
                        R--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (giVar.M0 != 0 || giVar.D) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        q5Var.d(b02, hashMap2.size() > 1, z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, R == ulVar.h() - 1, giVar.e0);
                        if ((giVar.b0 instanceof org.telegram.ui.rn) && giVar.P1) {
                            q5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            q5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
        int d = i0.a.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
            cm cmVar = (cm) arrayList.get(i10);
            if (cmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - cmVar.k.g.size();
                cm cmVar2 = (cm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, cmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) cmVar2.k.g.remove(0));
                }
                cmVar.k.g.addAll(arrayList2);
                cm.a(cmVar, cmVar.k, true);
                cm.a(cmVar2, cmVar2.k, true);
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
        bm bmVar;
        float f11 = this.n;
        em emVar = this.L;
        int computeVerticalScrollOffset = emVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - emVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - emVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            cm cmVar = (cm) arrayList2.get(i13);
            float b10 = cmVar.b();
            cmVar.a = f12;
            cmVar.b = i14;
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
                    i14 = cmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = cmVar.h;
            int i15 = cmVar.l;
            org.telegram.ui.ActionBar.d5 d5Var = cmVar.x;
            dm dmVar = cmVar.z;
            arrayList = arrayList2;
            float interpolation = cmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - cmVar.c) / 200.0f));
            boolean z10 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(cmVar.f, cmVar.d, interpolation);
            int width = dmVar.getWidth();
            em emVar2 = dmVar.L;
            float previewScale = width * lerp * emVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = emVar2.getPreviewScale() * AndroidUtilities.lerp(cmVar.g, cmVar.e, interpolation) * max;
            if (d5Var != null) {
                cmVar.p = 0.0f;
                float width2 = dmVar.getWidth();
                float f15 = i15;
                cmVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                cmVar.o = (Math.max(f15, previewScale) + dmVar.getWidth()) / 2.0f;
                cmVar.q = Math.max(i15 * 2, previewScale2);
                cmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) cmVar.n, (int) cmVar.p, (int) cmVar.o, (int) cmVar.q);
                d5Var.setAlpha((int) ((cmVar.d <= 0.0f ? 1.0f - interpolation : cmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                d5Var.d(canvas, cmVar.y, null);
                cmVar.p += f15;
                cmVar.n += f15;
                cmVar.q -= f15;
                cmVar.o -= f15;
            }
            cmVar.r = cmVar.o - cmVar.n;
            cmVar.s = cmVar.q - cmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                bm bmVar2 = (bm) arrayList3.get(i16);
                if (bmVar2 != null && (((bmVar = emVar2.F) == null || bmVar.b != bmVar2.b) && bmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = cmVar.w;
            RectF rectF = cmVar.t;
            long j10 = cmVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (cmVar.u == null || cmVar.v != j10) {
                    cmVar.v = j10;
                    cmVar.u = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + cmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = cmVar.n;
                float f17 = cmVar.r;
                float A = com.google.android.recaptcha.internal.a.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = cmVar.p;
                i11 = i13;
                float f19 = cmVar.s;
                i12 = i14;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f19, dp2, 2.0f, f18), i0.a.c(f17, dp, 2.0f, f16), i0.a.c(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f10 = b10;
                cmVar.u.c(AndroidUtilities.dp(14.0f) + (((cmVar.r / 2.0f) + cmVar.n) - (dp / 2.0f)), cmVar.p + (cmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f12 += f10;
            i14 = cmVar.k.g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.W(f12, v0Var.getMeasuredHeight());
        if (v0Var.J()) {
            v0Var.z(canvas, true);
            v0Var.C(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (emVar.F != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (emVar.F.c(canvas, true)) {
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
            this.s = i0.a.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
        cm cmVar;
        bm bmVar;
        float f10;
        cm cmVar2;
        bm bmVar2;
        int action;
        boolean z10;
        bm bmVar3;
        int i10;
        org.telegram.ui.rn rnVar;
        bm bmVar4;
        wl wlVar;
        ArrayList arrayList;
        bm bmVar5;
        bm bmVar6;
        ValueAnimator valueAnimator;
        wl wlVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        em emVar = this.L;
        gi giVar = emVar.b;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                cmVar = null;
                break;
            }
            cmVar = (cm) arrayList2.get(i14);
            float b10 = cmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (cmVar != null) {
            ArrayList arrayList3 = cmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                bmVar = (bm) arrayList3.get(i15);
                if (bmVar != null && bmVar.d().contains(x8, y10 - f12)) {
                    break;
                }
            }
        }
        bmVar = null;
        bm bmVar7 = emVar.F;
        if (bmVar7 != null) {
            RectF f13 = bmVar7.f(bmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            cmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                cm cmVar3 = (cm) arrayList2.get(i16);
                float b12 = cmVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            cmVar2 = cmVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (cmVar2 != null) {
                ArrayList arrayList4 = cmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                bmVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    bm bmVar8 = (bm) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (bmVar8 == null || bmVar8 == emVar.F) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (cmVar2.k.g.contains(bmVar8.b)) {
                            RectF d = bmVar8.d();
                            int i19 = bmVar8.i;
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
                            if ((bmVar8.i & 8) > 0) {
                                d.bottom = cmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    bmVar2 = bmVar8;
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
                m.i3 i3Var = this.I;
                if (action != 0 && emVar.F == null && !emVar.r.G1 && (((valueAnimator = emVar.H) == null || !valueAnimator.isRunning()) && cmVar != null && bmVar != null && (wlVar2 = cmVar.k) != null && wlVar2.g.contains(bmVar.b))) {
                    this.A = cmVar;
                    this.B = bmVar;
                    emVar.y = x8;
                    emVar.A = y10;
                    emVar.F = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new e5.u(this, elapsedRealtime, this.B, 23), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && emVar.F != null && !emVar.G) {
                    emVar.y = x8;
                    emVar.A = y10;
                    if (!this.H) {
                        this.H = true;
                        postDelayed(i3Var, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (bmVar5 = emVar.F) == null) {
                    if (action == 1 || emVar.F != null || (bmVar3 = this.B) == null || this.A == null) {
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
                    if (bmVar3.e && bmVar3.l == 0.0f) {
                        float x10 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        bmVar3.m = x10;
                        bmVar3.n = y11;
                        RectF d10 = bmVar3.d();
                        bmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) h7.n.a(bmVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(er.j);
                        duration.addUpdateListener(new e6(bmVar3, 11));
                        duration.addListener(new am(bmVar3));
                        duration.start();
                    } else {
                        RectF d11 = bmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f20 = this.A.p + d11.top;
                        rectF2.set(dp, f20, d11.right, AndroidUtilities.dp(36.4f) + f20);
                        if (!rectF2.contains(x8, y10 - this.B.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                cm cmVar4 = (cm) arrayList2.get(i20);
                                if (cmVar4 != null && (wlVar = cmVar4.k) != null && (arrayList = wlVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.B.b);
                            int i21 = giVar.M0;
                            org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (n2Var instanceof org.telegram.ui.rn) {
                                rnVar = (org.telegram.ui.rn) n2Var;
                                i10 = 0;
                                if (n2Var == null) {
                                    n2Var = LaunchActivity.R();
                                }
                                if (!giVar.V1.s()) {
                                    AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(giVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, n2Var, emVar.a);
                                PhotoViewer.t1().L2(giVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = giVar.O1;
                                boolean z11 = giVar.P1;
                                t12.h = i22;
                                t12.n = z11;
                                this.J.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.J, rnVar);
                                emVar.L.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = giVar.m1().getText();
                                    t13.l7 = true;
                                    t13.m7 = text;
                                    bmVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.B = bmVar4;
                                    this.y = 0L;
                                    emVar.F = bmVar4;
                                    this.C = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            rnVar = null;
                            if (n2Var == null) {
                            }
                            if (!giVar.V1.s()) {
                            }
                            PhotoViewer.t1().K2(null, n2Var, emVar.a);
                            PhotoViewer.t1().L2(giVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = giVar.O1;
                            boolean z112 = giVar.P1;
                            t122.h = i222;
                            t122.n = z112;
                            this.J.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.J, rnVar);
                            emVar.L.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (emVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.B.b;
                            int indexOf2 = this.A.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.L;
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
                                cm cmVar5 = this.A;
                                cmVar5.k.g.remove(indexOf2);
                                cm.a(cmVar5, cmVar5.k, true);
                                j();
                                i(emVar.L, false);
                                int i24 = this.K + 1;
                                this.K = i24;
                                emVar.w.k(0L, 82, photoEntry, null, null, new ag.k0(this, cmVar5, photoEntry, indexOf2, 15));
                                postDelayed(new xl(this, i24, 0), 4000L);
                            }
                            ValueAnimator valueAnimator2 = emVar.H;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        bmVar4 = null;
                        this.B = bmVar4;
                        this.y = 0L;
                        emVar.F = bmVar4;
                        this.C = 0.0f;
                    }
                } else {
                    if (cmVar == null || bmVar == null || bmVar == bmVar5) {
                        if (cmVar2 == null || bmVar2 == null || bmVar2 == bmVar5 || bmVar2.b == bmVar5.b) {
                            cmVar = null;
                            bmVar = null;
                        } else {
                            cmVar = cmVar2;
                            bmVar = bmVar2;
                        }
                    }
                    if (cmVar != null) {
                        ArrayList arrayList8 = cmVar.h;
                        if (bmVar != null && bmVar != bmVar5) {
                            int indexOf3 = bmVar5.a.k.g.indexOf(bmVar5.b);
                            int indexOf4 = cmVar.k.g.indexOf(bmVar.b);
                            if (indexOf3 >= 0) {
                                emVar.F.a.k.g.remove(indexOf3);
                                cm cmVar6 = emVar.F.a;
                                cm.a(cmVar6, cmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(cmVar) > arrayList2.indexOf(emVar.F.a)) {
                                    indexOf4++;
                                }
                                f(cmVar, emVar.F.b, indexOf4);
                                if (emVar.F.a != cmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            bmVar6 = null;
                                            break;
                                        }
                                        bmVar6 = (bm) arrayList8.get(i25);
                                        if (bmVar6.b == emVar.F.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (bmVar6 != null) {
                                        g();
                                        bm bmVar9 = emVar.F;
                                        RectF rectF3 = bmVar6.g;
                                        cm cmVar7 = bmVar6.O;
                                        float f21 = bmVar9.j;
                                        RectF rectF4 = bmVar9.g;
                                        bmVar6.j = AndroidUtilities.lerp(f21, bmVar9.k, bmVar9.e());
                                        if (bmVar6.f == null) {
                                            bmVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = bmVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, bmVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = bmVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, bmVar9.e(), bmVar6.f);
                                            bmVar6.f.set(rectF5.centerX() - (((bmVar6.f.width() / f10) * bmVar9.a.r) / cmVar7.r), rectF5.centerY() - (((bmVar6.f.height() / f10) * bmVar9.a.s) / cmVar7.s), (((bmVar6.f.width() / f10) * bmVar9.a.r) / cmVar7.r) + rectF5.centerX(), (((bmVar6.f.height() / f10) * bmVar9.a.s) / cmVar7.s) + rectF5.centerY());
                                        } else {
                                            bmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * bmVar9.a.r) / cmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * bmVar9.a.s) / cmVar7.s), (((rectF4.width() / f10) * bmVar9.a.r) / cmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * bmVar9.a.s) / cmVar7.s) + rectF5.centerY());
                                        }
                                        bmVar6.j = AndroidUtilities.lerp(bmVar6.j, bmVar6.k, bmVar6.e());
                                        bmVar6.h = SystemClock.elapsedRealtime();
                                        emVar.F = bmVar6;
                                        bmVar6.a = cmVar;
                                        bmVar6.j = 1.0f;
                                        bmVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                emVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(emVar.L, false);
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
            cmVar2 = null;
        }
        bmVar2 = null;
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
