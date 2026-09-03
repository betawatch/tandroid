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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mm extends ViewGroup {
    public lm B;
    public km C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final im K;
    public int L;
    public final /* synthetic */ nm M;
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
    public mm(nm nmVar, Context context) {
        super(context);
        this.M = nmVar;
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
        this.K = new im(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, nmVar.n, true);
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
            ArrayList arrayList2 = ((lm) arrayList.get(i10)).k.g;
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
        nm nmVar = this.M;
        km kmVar = nmVar.G;
        PointF pointF = this.H;
        if (kmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (nmVar.H) {
            RectF f10 = kmVar.f(kmVar.e());
            RectF f11 = nmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + nmVar.G.a.a + f11.top, this.F, this.D / this.G);
            return pointF;
        }
        RectF f12 = kmVar.f(kmVar.e());
        RectF f13 = nmVar.G.f(1.0f);
        pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, nmVar.y - ((nmVar.D - 0.5f) * nmVar.E), this.D);
        pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + nmVar.G.a.a + f13.top, (nmVar.B - ((nmVar.C - 0.5f) * nmVar.F)) + nmVar.J, this.D);
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
            ArrayList arrayList2 = ((lm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                km kmVar = (km) arrayList2.get(i11);
                ih.j jVar = kmVar.s;
                if (jVar != null) {
                    jVar.b(kmVar.O.z);
                    kmVar.s = null;
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
                lm lmVar = new lm(this);
                lm.a(lmVar, new gm(this.M, arrayList3), false);
                arrayList.add(lmVar);
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
            float b10 = ((lm) arrayList.get(i10)).b() + f10;
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
            i10 = (int) (((lm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(9999, TLObject.FLAG_31));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(lm lmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = lmVar.k.g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (lmVar.k.g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) lmVar.k.g.get(10);
            lmVar.k.g.remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(lmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                lm lmVar2 = i11 == arrayList2.size() ? null : (lm) arrayList2.get(i11);
                if (lmVar2 == null) {
                    lm lmVar3 = new lm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    lm.a(lmVar3, new gm(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(lmVar2, photoEntry2, 0);
                }
            }
        }
        lm.a(lmVar, lmVar.k, true);
    }

    public final void g() {
        float f10 = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            lm lmVar = (lm) arrayList.get(i11);
            float b10 = lmVar.b();
            lmVar.a = f10;
            lmVar.b = i10;
            f10 += b10;
            i10 += lmVar.k.g.size();
        }
    }

    public final void h() {
        nm nmVar = this.M;
        ValueAnimator valueAnimator = nmVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        nmVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        nmVar.I = ofFloat;
        ofFloat.addUpdateListener(new hm(this, 1));
        nmVar.I.addListener(new a9(this, 9));
        nmVar.I.setDuration(200L);
        nmVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        dm dmVar = chatAttachAlertPhotoLayout.D;
        li liVar = chatAttachAlertPhotoLayout.b;
        ol olVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.q1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z4) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = olVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z10 = dmVar.f;
                    boolean z11 = dmVar.d;
                    if (z10 && R > chatAttachAlertPhotoLayout.J0) {
                        R--;
                    }
                    if (z11 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (liVar.N0 != 0 || liVar.E) {
                        s5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        s5Var.d(b02, hashMap2.size() > 1, z11 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0, R == dmVar.h() - 1, liVar.f0);
                        if ((liVar.c0 instanceof org.telegram.ui.zn) && liVar.Q1) {
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
        int c3 = kf.k0.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
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
            lm lmVar = (lm) arrayList.get(i10);
            if (lmVar.k.g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - lmVar.k.g.size();
                lm lmVar2 = (lm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, lmVar2.k.g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) lmVar2.k.g.remove(0));
                }
                lmVar.k.g.addAll(arrayList2);
                lm.a(lmVar, lmVar.k, true);
                lm.a(lmVar2, lmVar2.k, true);
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
        km kmVar;
        float f11 = this.n;
        nm nmVar = this.M;
        int computeVerticalScrollOffset = nmVar.r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - nmVar.getListTopPadding());
        this.w = (r2.getMeasuredHeight() - nmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            lm lmVar = (lm) arrayList2.get(i13);
            float b10 = lmVar.b();
            lmVar.a = f12;
            lmVar.b = i14;
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
                    i14 = lmVar.k.g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = lmVar.h;
            int i15 = lmVar.l;
            org.telegram.ui.ActionBar.g5 g5Var = lmVar.x;
            mm mmVar = lmVar.z;
            arrayList = arrayList2;
            float interpolation = lmVar.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - lmVar.c) / 200.0f));
            boolean z4 = interpolation < 1.0f;
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(lmVar.f, lmVar.d, interpolation);
            int width = mmVar.getWidth();
            nm nmVar2 = mmVar.M;
            float previewScale = width * lerp * nmVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = nmVar2.getPreviewScale() * AndroidUtilities.lerp(lmVar.g, lmVar.e, interpolation) * max;
            if (g5Var != null) {
                lmVar.p = 0.0f;
                float width2 = mmVar.getWidth();
                float f15 = i15;
                lmVar.n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                lmVar.o = (Math.max(f15, previewScale) + mmVar.getWidth()) / 2.0f;
                lmVar.q = Math.max(i15 * 2, previewScale2);
                lmVar.x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                g5Var.setBounds((int) lmVar.n, (int) lmVar.p, (int) lmVar.o, (int) lmVar.q);
                g5Var.setAlpha((int) ((lmVar.d <= 0.0f ? 1.0f - interpolation : lmVar.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                g5Var.d(canvas, lmVar.y, null);
                lmVar.p += f15;
                lmVar.n += f15;
                lmVar.q -= f15;
                lmVar.o -= f15;
            }
            lmVar.r = lmVar.o - lmVar.n;
            lmVar.s = lmVar.q - lmVar.p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                km kmVar2 = (km) arrayList3.get(i16);
                if (kmVar2 != null && (((kmVar = nmVar2.G) == null || kmVar.b != kmVar2.b) && kmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = lmVar.w;
            RectF rectF = lmVar.t;
            long j10 = lmVar.i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (lmVar.u == null || lmVar.v != j10) {
                    lmVar.v = j10;
                    lmVar.u = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + lmVar.u.c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = lmVar.n;
                float f17 = lmVar.r;
                float x10 = e2.c.x(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = lmVar.p;
                i11 = i13;
                float f19 = lmVar.s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f19, dp2, 2.0f, f18), kf.k0.b(f17, dp, 2.0f, f16), kf.k0.b(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f10 = b10;
                lmVar.u.c(AndroidUtilities.dp(14.0f) + (((lmVar.r / 2.0f) + lmVar.n) - (dp / 2.0f)), lmVar.p + (lmVar.s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f12 += f10;
            i14 = lmVar.k.g.size() + i12;
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
        if (nmVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (nmVar.G.c(canvas, true)) {
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
            this.s = kf.k0.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05dd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lm lmVar;
        km kmVar;
        float f10;
        lm lmVar2;
        km kmVar2;
        int action;
        boolean z4;
        km kmVar3;
        int i10;
        org.telegram.ui.zn znVar;
        km kmVar4;
        gm gmVar;
        ArrayList arrayList;
        km kmVar5;
        km kmVar6;
        ValueAnimator valueAnimator;
        gm gmVar2;
        int i11;
        int i12;
        int i13;
        float f11;
        nm nmVar = this.M;
        li liVar = nmVar.b;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i14 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i14 >= size) {
                lmVar = null;
                break;
            }
            lmVar = (lm) arrayList2.get(i14);
            float b10 = lmVar.b();
            if (y10 >= f12 && y10 <= f12 + b10) {
                break;
            }
            f12 += b10;
            i14++;
        }
        if (lmVar != null) {
            ArrayList arrayList3 = lmVar.h;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                kmVar = (km) arrayList3.get(i15);
                if (kmVar != null && kmVar.d().contains(x10, y10 - f12)) {
                    break;
                }
            }
        }
        kmVar = null;
        km kmVar7 = nmVar.G;
        if (kmVar7 != null) {
            RectF f13 = kmVar7.f(kmVar7.e());
            PointF b11 = b();
            RectF rectF = new RectF();
            float f14 = b11.x;
            float f15 = b11.y;
            f10 = 2.0f;
            rectF.set(f14 - (f13.width() / 2.0f), f15 - (f13.height() / 2.0f), (f13.width() / 2.0f) + f14, (f13.height() / 2.0f) + f15);
            int i16 = 0;
            lmVar2 = null;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i16 < size) {
                lm lmVar3 = (lm) arrayList2.get(i16);
                float b12 = lmVar3.b() + f16;
                int i17 = size;
                if (b12 >= rectF.top) {
                    float f18 = rectF.bottom;
                    if (f18 >= f16) {
                        float min = Math.min(b12, f18) - Math.max(f16, rectF.top);
                        if (min > f17) {
                            f17 = min;
                            lmVar2 = lmVar3;
                        }
                    }
                }
                i16++;
                f16 = b12;
                size = i17;
            }
            if (lmVar2 != null) {
                ArrayList arrayList4 = lmVar2.h;
                int size3 = arrayList4.size();
                int i18 = 0;
                kmVar2 = null;
                float f19 = 0.0f;
                while (i18 < size3) {
                    km kmVar8 = (km) arrayList4.get(i18);
                    ArrayList arrayList5 = arrayList4;
                    if (kmVar8 == null || kmVar8 == nmVar.G) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (lmVar2.k.g.contains(kmVar8.b)) {
                            RectF d = kmVar8.d();
                            int i19 = kmVar8.i;
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
                            if ((kmVar8.i & 8) > 0) {
                                d.bottom = lmVar2.s;
                            }
                            if (RectF.intersects(rectF, d)) {
                                i12 = i18;
                                float min2 = ((Math.min(d.bottom, rectF.bottom) - Math.max(d.top, rectF.top)) * (Math.min(d.right, rectF.right) - Math.max(d.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f19) {
                                    f19 = min2;
                                    kmVar2 = kmVar8;
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
                if (action != 0 && nmVar.G == null && !nmVar.r.H1 && (((valueAnimator = nmVar.I) == null || !valueAnimator.isRunning()) && lmVar != null && kmVar != null && (gmVar2 = lmVar.k) != null && gmVar2.g.contains(kmVar.b))) {
                    this.B = lmVar;
                    this.C = kmVar;
                    nmVar.y = x10;
                    nmVar.B = y10;
                    nmVar.G = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.y = elapsedRealtime;
                    AndroidUtilities.runOnUIThread(new i5.v(this, elapsedRealtime, this.C, 21), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                } else if (action != 2 && nmVar.G != null && !nmVar.H) {
                    nmVar.y = x10;
                    nmVar.B = y10;
                    if (!this.I) {
                        this.I = true;
                        postDelayed(bVar, 16L);
                    }
                    invalidate();
                } else if (action == 1 || (kmVar5 = nmVar.G) == null) {
                    if (action == 1 || nmVar.G != null || (kmVar3 = this.C) == null || this.B == null) {
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
                    if (kmVar3.e && kmVar3.l == 0.0f) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        kmVar3.m = x11;
                        kmVar3.n = y11;
                        RectF d10 = kmVar3.d();
                        kmVar3.o = (float) Math.sqrt(Math.pow(d10.height(), 2.0d) + Math.pow(d10.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) k7.n.a(kmVar3.o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(mr.j);
                        duration.addUpdateListener(new f6(kmVar3, 11));
                        duration.addListener(new jm(kmVar3));
                        duration.start();
                    } else {
                        RectF d11 = kmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float dp = d11.right - AndroidUtilities.dp(36.4f);
                        float f20 = this.B.p + d11.top;
                        rectF2.set(dp, f20, d11.right, AndroidUtilities.dp(36.4f) + f20);
                        if (!rectF2.contains(x10, y10 - this.C.a.a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i20 = 0; i20 < size4; i20++) {
                                lm lmVar4 = (lm) arrayList2.get(i20);
                                if (lmVar4 != null && (gmVar = lmVar4.k) != null && (arrayList = gmVar.g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int indexOf = arrayList6.indexOf(this.C.b);
                            int i21 = liVar.N0;
                            org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                            if (i21 != 0) {
                                i10 = 1;
                            } else if (p2Var instanceof org.telegram.ui.zn) {
                                znVar = (org.telegram.ui.zn) p2Var;
                                i10 = 0;
                                if (p2Var == null) {
                                    p2Var = LaunchActivity.R();
                                }
                                if (!liVar.W1.h0()) {
                                    AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(liVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, p2Var, nmVar.a);
                                PhotoViewer.t1().L2(liVar);
                                PhotoViewer t12 = PhotoViewer.t1();
                                int i22 = liVar.P1;
                                boolean z10 = liVar.Q1;
                                t12.h = i22;
                                t12.n = z10;
                                this.K.a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.K, znVar);
                                nmVar.M.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer t13 = PhotoViewer.t1();
                                    Editable text = liVar.m1().getText();
                                    t13.m7 = true;
                                    t13.n7 = text;
                                    kmVar4 = null;
                                    t13.A2(null, text, false, false);
                                    t13.t3(null);
                                    this.C = kmVar4;
                                    this.y = 0L;
                                    nmVar.G = kmVar4;
                                    this.D = 0.0f;
                                }
                            } else {
                                i10 = 4;
                            }
                            znVar = null;
                            if (p2Var == null) {
                            }
                            if (!liVar.W1.h0()) {
                            }
                            PhotoViewer.t1().K2(null, p2Var, nmVar.a);
                            PhotoViewer.t1().L2(liVar);
                            PhotoViewer t122 = PhotoViewer.t1();
                            int i222 = liVar.P1;
                            boolean z102 = liVar.Q1;
                            t122.h = i222;
                            t122.n = z102;
                            this.K.a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), indexOf, i10, false, this.K, znVar);
                            nmVar.M.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                            }
                        } else if (nmVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.C.b;
                            int indexOf2 = this.B.k.g.indexOf(photoEntry);
                            if (indexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.M;
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
                                lm lmVar5 = this.B;
                                lmVar5.k.g.remove(indexOf2);
                                lm.a(lmVar5, lmVar5.k, true);
                                j();
                                i(nmVar.M, false);
                                int i24 = this.L + 1;
                                this.L = i24;
                                nmVar.w.k(0L, 82, photoEntry, null, null, new cg.v1(this, lmVar5, photoEntry, indexOf2, 15));
                                postDelayed(new ah.b(this, i24, 29), 4000L);
                            }
                            ValueAnimator valueAnimator2 = nmVar.I;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        kmVar4 = null;
                        this.C = kmVar4;
                        this.y = 0L;
                        nmVar.G = kmVar4;
                        this.D = 0.0f;
                    }
                } else {
                    if (lmVar == null || kmVar == null || kmVar == kmVar5) {
                        if (lmVar2 == null || kmVar2 == null || kmVar2 == kmVar5 || kmVar2.b == kmVar5.b) {
                            lmVar = null;
                            kmVar = null;
                        } else {
                            lmVar = lmVar2;
                            kmVar = kmVar2;
                        }
                    }
                    if (lmVar != null) {
                        ArrayList arrayList8 = lmVar.h;
                        if (kmVar != null && kmVar != kmVar5) {
                            int indexOf3 = kmVar5.a.k.g.indexOf(kmVar5.b);
                            int indexOf4 = lmVar.k.g.indexOf(kmVar.b);
                            if (indexOf3 >= 0) {
                                nmVar.G.a.k.g.remove(indexOf3);
                                lm lmVar6 = nmVar.G.a;
                                lm.a(lmVar6, lmVar6.k, true);
                            }
                            if (indexOf4 >= 0) {
                                if (arrayList2.indexOf(lmVar) > arrayList2.indexOf(nmVar.G.a)) {
                                    indexOf4++;
                                }
                                f(lmVar, nmVar.G.b, indexOf4);
                                if (nmVar.G.a != lmVar) {
                                    int size6 = arrayList8.size();
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= size6) {
                                            kmVar6 = null;
                                            break;
                                        }
                                        kmVar6 = (km) arrayList8.get(i25);
                                        if (kmVar6.b == nmVar.G.b) {
                                            break;
                                        }
                                        i25++;
                                    }
                                    if (kmVar6 != null) {
                                        g();
                                        km kmVar9 = nmVar.G;
                                        RectF rectF3 = kmVar6.g;
                                        lm lmVar7 = kmVar6.O;
                                        float f21 = kmVar9.j;
                                        RectF rectF4 = kmVar9.g;
                                        kmVar6.j = AndroidUtilities.lerp(f21, kmVar9.k, kmVar9.e());
                                        if (kmVar6.f == null) {
                                            kmVar6.f = new RectF();
                                        }
                                        RectF rectF5 = new RectF();
                                        RectF rectF6 = kmVar6.f;
                                        if (rectF6 == null) {
                                            rectF5.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF6, rectF3, kmVar6.e(), rectF5);
                                        }
                                        RectF rectF7 = kmVar9.f;
                                        if (rectF7 != null) {
                                            AndroidUtilities.lerp(rectF7, rectF4, kmVar9.e(), kmVar6.f);
                                            kmVar6.f.set(rectF5.centerX() - (((kmVar6.f.width() / f10) * kmVar9.a.r) / lmVar7.r), rectF5.centerY() - (((kmVar6.f.height() / f10) * kmVar9.a.s) / lmVar7.s), (((kmVar6.f.width() / f10) * kmVar9.a.r) / lmVar7.r) + rectF5.centerX(), (((kmVar6.f.height() / f10) * kmVar9.a.s) / lmVar7.s) + rectF5.centerY());
                                        } else {
                                            kmVar6.f.set(rectF5.centerX() - (((rectF4.width() / f10) * kmVar9.a.r) / lmVar7.r), rectF5.centerY() - (((rectF4.height() / f10) * kmVar9.a.s) / lmVar7.s), (((rectF4.width() / f10) * kmVar9.a.r) / lmVar7.r) + rectF5.centerX(), (((rectF4.height() / f10) * kmVar9.a.s) / lmVar7.s) + rectF5.centerY());
                                        }
                                        kmVar6.j = AndroidUtilities.lerp(kmVar6.j, kmVar6.k, kmVar6.e());
                                        kmVar6.h = SystemClock.elapsedRealtime();
                                        nmVar.G = kmVar6;
                                        kmVar6.a = lmVar;
                                        kmVar6.j = 1.0f;
                                        kmVar6.k = 1.0f;
                                        g();
                                    }
                                }
                            }
                            try {
                                nmVar.performHapticFeedback(7, 2);
                            } catch (Exception unused) {
                            }
                            j();
                            i(nmVar.M, false);
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
            lmVar2 = null;
        }
        kmVar2 = null;
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
