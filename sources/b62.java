// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b62 extends ViewGroup {
    public long E;
    public a62 F;
    public z52 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final p1 N;
    public final y52 O;
    public int P;
    public final /* synthetic */ c62 Q;
    public final dl1 a;
    public final ArrayList b;
    public final HashMap c;
    public HashMap d;
    public ArrayList e;
    public HashMap f;
    public ArrayList h;
    public final int n;
    public final int r;
    public int s;
    public float w;
    public float x;
    public boolean[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b62(c62 c62Var, Context context) {
        super(context);
        this.Q = c62Var;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = hl.L(16.0f);
        this.r = hl.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new p1(this, (byte) 16);
        this.O = new y52(this);
        this.P = 0;
        setWillNotDraw(false);
        dl1 dl1Var = new dl1(c62Var.n, context, true);
        this.a = dl1Var;
        dl1Var.setCustomText(ob6.M0(2131753953, null));
        addView(dl1Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) ((a62) arrayList.get(i)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    no6 no6Var = (no6) arrayList2.get(i2);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(no6Var)) {
                        Object obj = hashMap.get(no6Var);
                        this.f.put(obj, no6Var);
                        this.h.add(obj);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i3);
                                Object value = entry.getValue();
                                if (value == no6Var) {
                                    Object key = entry.getKey();
                                    this.f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < this.e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.e.get(i4);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof no6) && (str = ((no6) value2).I) != null && no6Var != null && str.equals(no6Var.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i4++;
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
        c62 c62Var = this.Q;
        z52 z52Var = c62Var.K;
        PointF pointF = this.L;
        if (z52Var == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (c62Var.L) {
            RectF e = z52Var.e(z52Var.c());
            RectF e2 = c62Var.K.e(1.0f);
            pointF.x = hl.R1((e.width() / 2.0f) + e2.left, this.I, this.H / this.K);
            pointF.y = hl.R1((e.height() / 2.0f) + c62Var.K.a.a + e2.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF e3 = z52Var.e(z52Var.c());
        RectF e4 = c62Var.K.e(1.0f);
        pointF.x = hl.R1((e3.width() / 2.0f) + e4.left, c62Var.E - ((c62Var.H - 0.5f) * c62Var.I), this.H);
        pointF.y = hl.R1((e3.height() / 2.0f) + c62Var.K.a.a + e4.top, (c62Var.F - ((c62Var.G - 0.5f) * c62Var.J)) + c62Var.N, this.H);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((a62) arrayList.get(i)).h;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                z52 z52Var = (z52) arrayList2.get(i2);
                mpa mpaVar = z52Var.s;
                if (mpaVar != null) {
                    mpaVar.b(z52Var.O.z);
                    z52Var.s = null;
                }
            }
            i++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i3 = size - 1;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) this.h.get(i4);
            num.getClass();
            arrayList3.add((no6) this.d.get(num));
            if (i4 % 10 == 9 || i4 == i3) {
                a62 a62Var = new a62(this);
                a62Var.b(new w52(this.Q, arrayList3), false);
                arrayList.add(a62Var);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f = this.n;
        int computeVerticalScrollOffset = this.Q.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - r3.getListTopPadding());
        this.x = (r4.getMeasuredHeight() - r3.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            float a = ((a62) arrayList.get(i)).a() + f;
            float f2 = this.w;
            zArr[i] = (f >= f2 && f <= this.x) || (a >= f2 && a <= this.x) || (f <= f2 && a >= this.x);
            i++;
            f = a;
        }
        return zArr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final int e() {
        int i = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (int) (((a62) arrayList.get(i2)).a() + i);
        }
        dl1 dl1Var = this.a;
        if (dl1Var.getMeasuredHeight() <= 0) {
            dl1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.q.x, TLObject.FLAG_30), -2147473649);
        }
        return dl1Var.getMeasuredHeight() + i;
    }

    public final void f(a62 a62Var, no6 no6Var, int i) {
        ArrayList arrayList = (ArrayList) a62Var.k.f;
        arrayList.add(Math.min(arrayList.size(), i), no6Var);
        if (((ArrayList) a62Var.k.f).size() == 11) {
            no6 no6Var2 = (no6) ((ArrayList) a62Var.k.f).get(10);
            ((ArrayList) a62Var.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(a62Var);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                a62 a62Var2 = i2 == arrayList2.size() ? null : (a62) arrayList2.get(i2);
                if (a62Var2 == null) {
                    a62 a62Var3 = new a62(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(no6Var2);
                    a62Var3.b(new w52(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(a62Var2, no6Var2, 0);
                }
            }
        }
        a62Var.b(a62Var.k, true);
    }

    public final void g() {
        float f = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a62 a62Var = (a62) arrayList.get(i2);
            float a = a62Var.a();
            a62Var.a = f;
            a62Var.b = i;
            f += a;
            i += ((ArrayList) a62Var.k.f).size();
        }
    }

    public final void h() {
        c62 c62Var = this.Q;
        ValueAnimator valueAnimator = c62Var.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b = b();
        float f = this.H;
        this.K = f;
        this.I = b.x;
        this.J = b.y;
        c62Var.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        c62Var.M = ofFloat;
        ofFloat.addUpdateListener(new x52(this, (byte) 0));
        c62Var.M.addListener(new jb1((Object) this, (byte) 18));
        c62Var.M.setDuration(200L);
        c62Var.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        u52 u52Var = chatAttachAlertPhotoLayout.H;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        i52 i52Var = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = i52Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = i52Var.getChildAt(i);
                if (childAt instanceof d88) {
                    int S = RecyclerView.S(childAt);
                    boolean z2 = u52Var.f;
                    boolean z3 = u52Var.d;
                    if (z2 && S > chatAttachAlertPhotoLayout.N0) {
                        S--;
                    }
                    if (z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        S--;
                    }
                    d88 d88Var = (d88) childAt;
                    if (n12Var.N2 != 0 || n12Var.B1) {
                        d88Var.getCheckBox().setVisibility(8);
                    }
                    no6 c0 = chatAttachAlertPhotoLayout.c0(S);
                    if (c0 != null) {
                        int i2 = c0.C;
                        d88Var.d(c0, hashMap2.size() > 1, z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, S == u52Var.b() - 1, n12Var.c2);
                        if ((n12Var.Z1 instanceof zu1) && n12Var.Q3) {
                            d88Var.b(arrayList2.indexOf(Integer.valueOf(i2)), hashMap2.containsKey(Integer.valueOf(i2)), false);
                        } else {
                            d88Var.b(-1, hashMap2.containsKey(Integer.valueOf(i2)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.Q.b.G1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int d = c00.d(45.0f, hl.q.y - a.getCurrentActionBarHeight(), e());
        if (this.s != d) {
            this.s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a62 a62Var = (a62) arrayList.get(i);
            if (((ArrayList) a62Var.k.f).size() < 10 && i < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) a62Var.k.f).size();
                a62 a62Var2 = (a62) arrayList.get(i + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) a62Var2.k.f).size());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList2.add((no6) ((ArrayList) a62Var2.k.f).remove(0));
                }
                ((ArrayList) a62Var.k.f).addAll(arrayList2);
                a62Var.b(a62Var.k, true);
                a62Var2.b(a62Var2.k, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        float f2;
        z52 z52Var;
        float f3 = this.n;
        c62 c62Var = this.Q;
        int computeVerticalScrollOffset = c62Var.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - c62Var.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - c62Var.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f3);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f4 = f3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            a62 a62Var = (a62) arrayList2.get(i4);
            float a = a62Var.a();
            a62Var.a = f4;
            a62Var.b = i5;
            float f5 = this.w;
            if (f4 < f5 || f4 > this.x) {
                float f6 = f4 + a;
                if ((f6 < f5 || f6 > this.x) && (f4 > f5 || f6 < this.x)) {
                    f = a;
                    arrayList = arrayList2;
                    i = size;
                    i2 = i4;
                    i3 = i5;
                    canvas.translate(0.0f, f);
                    f4 += f;
                    i5 = ((ArrayList) a62Var.k.f).size() + i3;
                    i4 = i2 + 1;
                    size = i;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = a62Var.h;
            int i6 = a62Var.l;
            t37 t37Var = a62Var.x;
            b62 b62Var = a62Var.z;
            arrayList = arrayList2;
            float interpolation = a62Var.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - a62Var.c) / 200.0f));
            boolean z = interpolation < 1.0f;
            Point point = hl.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float R1 = hl.R1(a62Var.f, a62Var.d, interpolation);
            int width = b62Var.getWidth();
            c62 c62Var2 = b62Var.Q;
            float previewScale = width * R1 * c62Var2.getPreviewScale();
            boolean z2 = z;
            float previewScale2 = c62Var2.getPreviewScale() * hl.R1(a62Var.g, a62Var.e, interpolation) * max;
            if (t37Var != null) {
                f2 = 2.0f;
                a62Var.p = 0.0f;
                float width2 = b62Var.getWidth();
                float f7 = i6;
                a62Var.n = (width2 - Math.max(f7, previewScale)) / 2.0f;
                a62Var.o = (Math.max(f7, previewScale) + b62Var.getWidth()) / 2.0f;
                a62Var.q = Math.max(i6 << 1, previewScale2);
                a62Var.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                t37Var.setBounds((int) a62Var.n, (int) a62Var.p, (int) a62Var.o, (int) a62Var.q);
                t37Var.setAlpha((int) ((a62Var.d <= 0.0f ? 1.0f - interpolation : a62Var.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                t37Var.d(canvas, a62Var.y, null);
                a62Var.p += f7;
                a62Var.n += f7;
                a62Var.q -= f7;
                a62Var.o -= f7;
            } else {
                f2 = 2.0f;
            }
            a62Var.r = a62Var.o - a62Var.n;
            a62Var.s = a62Var.q - a62Var.p;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                z52 z52Var2 = (z52) arrayList3.get(i7);
                if (z52Var2 != null && (((z52Var = c62Var2.K) == null || z52Var.b != z52Var2.b) && z52Var2.a(canvas, false))) {
                    z2 = true;
                }
            }
            Paint paint = a62Var.w;
            RectF rectF = a62Var.t;
            long j = a62Var.i;
            if (j <= 0) {
                i = size;
                i2 = i4;
                i3 = i5;
                f = a;
            } else {
                if (a62Var.u == null || a62Var.v != j) {
                    a62Var.v = j;
                    a62Var.u = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, hl.o());
                }
                float L = hl.L(28.0f) + a62Var.u.c;
                float L2 = hl.L(32.0f);
                float f8 = a62Var.n;
                float f9 = a62Var.r;
                float f10 = f2;
                float z3 = bp1.z(f9, L, f10, f8);
                i = size;
                float f11 = a62Var.p;
                i2 = i4;
                float f12 = a62Var.s;
                i3 = i5;
                rectF.set(z3, bp1.z(f12, L2, f10, f11), qd4.e(f9, L, f10, f8), qd4.e(f12, L2, f10, f11));
                paint.setColor(1610612736);
                float f13 = L2 / f10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
                pkb pkbVar = a62Var.u;
                float L3 = hl.L(14.0f) + (((a62Var.r / f10) + a62Var.n) - (L / f10));
                float f14 = a62Var.p + (a62Var.s / f10);
                f = a;
                pkbVar.c(L3, f14, 1.0f, -1, canvas);
            }
            if (z2) {
                invalidate();
            }
            canvas.translate(0.0f, f);
            f4 += f;
            i5 = ((ArrayList) a62Var.k.f).size() + i3;
            i4 = i2 + 1;
            size = i;
            arrayList2 = arrayList;
        }
        dl1 dl1Var = this.a;
        dl1Var.j0(f4, dl1Var.getMeasuredHeight());
        if (dl1Var.S()) {
            dl1Var.I(canvas, true);
            dl1Var.L(canvas, true);
        }
        dl1Var.draw(canvas);
        canvas.restore();
        if (c62Var.K != null) {
            canvas.save();
            PointF b = b();
            canvas.translate(b.x, b.y);
            if (c62Var.K.a(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        dl1 dl1Var = this.a;
        dl1Var.layout(0, 0, dl1Var.getMeasuredWidth(), dl1Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, -2147473649);
        if (this.s <= 0) {
            this.s = c00.d(45.0f, hl.q.y - a.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05e3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a62 a62Var;
        z52 z52Var;
        float f;
        a62 a62Var2;
        z52 z52Var2;
        int action;
        boolean z;
        int i;
        z52 z52Var3;
        int i2;
        zu1 zu1Var;
        z52 z52Var4;
        w52 w52Var;
        ArrayList arrayList;
        z52 z52Var5;
        ValueAnimator valueAnimator;
        w52 w52Var2;
        int i3;
        int i4;
        int i5;
        float f2;
        c62 c62Var = this.Q;
        n12 n12Var = c62Var.b;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i6 = 0;
        float f3 = 0.0f;
        while (true) {
            if (i6 >= size) {
                a62Var = null;
                break;
            }
            a62Var = (a62) arrayList2.get(i6);
            float a = a62Var.a();
            if (y >= f3 && y <= f3 + a) {
                break;
            }
            f3 += a;
            i6++;
        }
        if (a62Var != null) {
            ArrayList arrayList3 = a62Var.h;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                z52Var = (z52) arrayList3.get(i7);
                if (z52Var != null && z52Var.b().contains(x, y - f3)) {
                    break;
                }
            }
        }
        z52Var = null;
        z52 z52Var6 = c62Var.K;
        if (z52Var6 != null) {
            RectF e = z52Var6.e(z52Var6.c());
            PointF b = b();
            RectF rectF = new RectF();
            float f4 = b.x;
            float f5 = b.y;
            f = 2.0f;
            rectF.set(f4 - (e.width() / 2.0f), f5 - (e.height() / 2.0f), (e.width() / 2.0f) + f4, (e.height() / 2.0f) + f5);
            int i8 = 0;
            a62Var2 = null;
            float f6 = 0.0f;
            float f7 = 0.0f;
            while (i8 < size) {
                a62 a62Var3 = (a62) arrayList2.get(i8);
                float a2 = a62Var3.a() + f6;
                int i9 = size;
                if (a2 >= rectF.top) {
                    float f8 = rectF.bottom;
                    if (f8 >= f6) {
                        float min = Math.min(a2, f8) - Math.max(f6, rectF.top);
                        if (min > f7) {
                            f7 = min;
                            a62Var2 = a62Var3;
                        }
                    }
                }
                i8++;
                f6 = a2;
                size = i9;
            }
            if (a62Var2 != null) {
                ArrayList arrayList4 = a62Var2.h;
                int size3 = arrayList4.size();
                int i10 = 0;
                z52Var2 = null;
                float f9 = 0.0f;
                while (i10 < size3) {
                    z52 z52Var7 = (z52) arrayList4.get(i10);
                    ArrayList arrayList5 = arrayList4;
                    if (z52Var7 == null || z52Var7 == c62Var.K) {
                        i3 = size3;
                    } else {
                        i3 = size3;
                        if (((ArrayList) a62Var2.k.f).contains(z52Var7.b)) {
                            RectF b2 = z52Var7.b();
                            int i11 = z52Var7.i;
                            if ((i11 & 4) > 0) {
                                i5 = i11;
                                f2 = 0.0f;
                                b2.top = 0.0f;
                            } else {
                                i5 = i11;
                                f2 = 0.0f;
                            }
                            if ((i5 & 1) > 0) {
                                b2.left = f2;
                            }
                            if ((i5 & 2) > 0) {
                                b2.right = getWidth();
                            }
                            if ((z52Var7.i & 8) > 0) {
                                b2.bottom = a62Var2.s;
                            }
                            if (RectF.intersects(rectF, b2)) {
                                i4 = i10;
                                float min2 = ((Math.min(b2.bottom, rectF.bottom) - Math.max(b2.top, rectF.top)) * (Math.min(b2.right, rectF.right) - Math.max(b2.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f9) {
                                    f9 = min2;
                                    z52Var2 = z52Var7;
                                }
                                i10 = i4 + 1;
                                arrayList4 = arrayList5;
                                size3 = i3;
                            }
                        }
                    }
                    i4 = i10;
                    i10 = i4 + 1;
                    arrayList4 = arrayList5;
                    size3 = i3;
                }
                action = motionEvent.getAction();
                p1 p1Var = this.N;
                if (action == 0 || c62Var.K != null || c62Var.r.J1 || (((valueAnimator = c62Var.M) != null && valueAnimator.isRunning()) || a62Var == null || z52Var == null || (w52Var2 = a62Var.k) == null || !((ArrayList) w52Var2.f).contains(z52Var.b))) {
                    if (action == 2 || c62Var.K == null || c62Var.L) {
                        if (action == 1) {
                            z52 z52Var8 = c62Var.K;
                            if (z52Var8 != null) {
                                if (a62Var == null || z52Var == null || z52Var == z52Var8) {
                                    if (a62Var2 == null || z52Var2 == null || z52Var2 == z52Var8 || z52Var2.b == z52Var8.b) {
                                        a62Var = null;
                                        z52Var = null;
                                    } else {
                                        a62Var = a62Var2;
                                        z52Var = z52Var2;
                                    }
                                }
                                if (a62Var != null) {
                                    ArrayList arrayList6 = a62Var.h;
                                    if (z52Var != null && z52Var != z52Var8) {
                                        int indexOf = ((ArrayList) z52Var8.a.k.f).indexOf(z52Var8.b);
                                        int indexOf2 = ((ArrayList) a62Var.k.f).indexOf(z52Var.b);
                                        if (indexOf >= 0) {
                                            ((ArrayList) c62Var.K.a.k.f).remove(indexOf);
                                            a62 a62Var4 = c62Var.K.a;
                                            a62Var4.b(a62Var4.k, true);
                                        }
                                        if (indexOf2 >= 0) {
                                            if (arrayList2.indexOf(a62Var) > arrayList2.indexOf(c62Var.K.a)) {
                                                indexOf2++;
                                            }
                                            f(a62Var, c62Var.K.b, indexOf2);
                                            if (c62Var.K.a != a62Var) {
                                                int size4 = arrayList6.size();
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= size4) {
                                                        z52Var5 = null;
                                                        break;
                                                    }
                                                    z52Var5 = (z52) arrayList6.get(i12);
                                                    if (z52Var5.b == c62Var.K.b) {
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                                if (z52Var5 != null) {
                                                    g();
                                                    z52 z52Var9 = c62Var.K;
                                                    a62 a62Var5 = z52Var5.O;
                                                    float f10 = z52Var9.j;
                                                    RectF rectF2 = z52Var9.g;
                                                    z52Var5.j = hl.R1(f10, z52Var9.k, z52Var9.c());
                                                    if (z52Var5.f == null) {
                                                        z52Var5.f = new RectF();
                                                    }
                                                    RectF rectF3 = new RectF();
                                                    RectF rectF4 = z52Var5.f;
                                                    RectF rectF5 = z52Var5.g;
                                                    if (rectF4 == null) {
                                                        rectF3.set(rectF5);
                                                    } else {
                                                        hl.X1(rectF4, rectF5, z52Var5.c(), rectF3);
                                                    }
                                                    RectF rectF6 = z52Var9.f;
                                                    if (rectF6 != null) {
                                                        hl.X1(rectF6, rectF2, z52Var9.c(), z52Var5.f);
                                                        z52Var5.f.set(rectF3.centerX() - (((z52Var5.f.width() / f) * z52Var9.a.r) / a62Var5.r), rectF3.centerY() - (((z52Var5.f.height() / f) * z52Var9.a.s) / a62Var5.s), (((z52Var5.f.width() / f) * z52Var9.a.r) / a62Var5.r) + rectF3.centerX(), (((z52Var5.f.height() / f) * z52Var9.a.s) / a62Var5.s) + rectF3.centerY());
                                                    } else {
                                                        z52Var5.f.set(rectF3.centerX() - (((rectF2.width() / f) * z52Var9.a.r) / a62Var5.r), rectF3.centerY() - (((rectF2.height() / f) * z52Var9.a.s) / a62Var5.s), (((rectF2.width() / f) * z52Var9.a.r) / a62Var5.r) + rectF3.centerX(), (((rectF2.height() / f) * z52Var9.a.s) / a62Var5.s) + rectF3.centerY());
                                                    }
                                                    z52Var5.j = hl.R1(z52Var5.j, z52Var5.k, z52Var5.c());
                                                    z52Var5.h = SystemClock.elapsedRealtime();
                                                    c62Var.K = z52Var5;
                                                    z52Var5.a = a62Var;
                                                    z52Var5.j = 1.0f;
                                                    z52Var5.k = 1.0f;
                                                    g();
                                                }
                                            }
                                        }
                                        try {
                                            c62Var.performHapticFeedback(7, 2);
                                        } catch (Exception unused) {
                                        }
                                        j();
                                        i(c62Var.Q, false);
                                    }
                                }
                                h();
                            } else if (z52Var8 == null && (z52Var3 = this.G) != null && this.F != null) {
                                byte b3 = 4;
                                if (z52Var3.e && z52Var3.l == 0.0f) {
                                    float x2 = motionEvent.getX();
                                    float y2 = motionEvent.getY();
                                    z52Var3.m = x2;
                                    z52Var3.n = y2;
                                    RectF b4 = z52Var3.b();
                                    z52Var3.o = (float) Math.sqrt(Math.pow(b4.height(), 2.0d) + Math.pow(b4.width(), 2.0d));
                                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) ete.a(z52Var3.o * 0.3f, 250.0f, 550.0f));
                                    duration.setInterpolator(k43.j);
                                    duration.addUpdateListener(new az1(z52Var3, b3));
                                    duration.addListener(new jb1((Object) z52Var3, (byte) 19));
                                    duration.start();
                                } else {
                                    RectF b5 = z52Var3.b();
                                    RectF rectF7 = hl.P;
                                    float L = b5.right - hl.L(36.4f);
                                    float f11 = this.F.p + b5.top;
                                    rectF7.set(L, f11, b5.right, hl.L(36.4f) + f11);
                                    if (!rectF7.contains(x, y - this.G.a.a)) {
                                        a();
                                        ArrayList arrayList7 = new ArrayList();
                                        int size5 = arrayList2.size();
                                        for (int i13 = 0; i13 < size5; i13++) {
                                            a62 a62Var6 = (a62) arrayList2.get(i13);
                                            if (a62Var6 != null && (w52Var = a62Var6.k) != null && (arrayList = (ArrayList) w52Var.f) != null) {
                                                arrayList7.addAll(arrayList);
                                            }
                                        }
                                        int indexOf3 = arrayList7.indexOf(this.G.b);
                                        byte b6 = n12Var.N2;
                                        e eVar = n12Var.Z1;
                                        if (b6 != 0) {
                                            i2 = 1;
                                        } else if (eVar instanceof zu1) {
                                            zu1Var = (zu1) eVar;
                                            i2 = 0;
                                            if (eVar == null) {
                                                eVar = LaunchActivity.Q();
                                            }
                                            if (!n12Var.W3.o()) {
                                                hl.t1(eVar.getFragmentView().findFocus());
                                                hl.t1(n12Var.c.findFocus());
                                            }
                                            PhotoViewer.q0().T1(null, eVar, c62Var.a);
                                            PhotoViewer.q0().U1(n12Var);
                                            PhotoViewer q0 = PhotoViewer.q0();
                                            int i14 = n12Var.P3;
                                            boolean z2 = n12Var.Q3;
                                            q0.h = i14;
                                            q0.n = z2;
                                            this.O.a = arrayList7;
                                            PhotoViewer.q0().o1(new ArrayList(arrayList7), indexOf3, i2, false, this.O, zu1Var);
                                            c62Var.Q.getClass();
                                            if (ChatAttachAlertPhotoLayout.T()) {
                                                PhotoViewer q02 = PhotoViewer.q0();
                                                Editable text = n12Var.V0().getText();
                                                q02.u7 = true;
                                                q02.v7 = text;
                                                z52Var4 = null;
                                                q02.J1(null, text, false, false);
                                                q02.E2(null);
                                                this.G = z52Var4;
                                                this.E = 0L;
                                                c62Var.K = z52Var4;
                                                this.H = 0.0f;
                                            }
                                        } else {
                                            i2 = 4;
                                        }
                                        zu1Var = null;
                                        if (eVar == null) {
                                        }
                                        if (!n12Var.W3.o()) {
                                        }
                                        PhotoViewer.q0().T1(null, eVar, c62Var.a);
                                        PhotoViewer.q0().U1(n12Var);
                                        PhotoViewer q03 = PhotoViewer.q0();
                                        int i142 = n12Var.P3;
                                        boolean z22 = n12Var.Q3;
                                        q03.h = i142;
                                        q03.n = z22;
                                        this.O.a = arrayList7;
                                        PhotoViewer.q0().o1(new ArrayList(arrayList7), indexOf3, i2, false, this.O, zu1Var);
                                        c62Var.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.T()) {
                                        }
                                    } else if (c62Var.getSelectedItemsCount() > 1) {
                                        no6 no6Var = this.G.b;
                                        int indexOf4 = ((ArrayList) this.F.k.f).indexOf(no6Var);
                                        if (indexOf4 >= 0) {
                                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = c62Var.Q;
                                            if (chatAttachAlertPhotoLayout != null) {
                                                ArrayList arrayList8 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                                int size6 = arrayList8.size();
                                                int i15 = 0;
                                                while (true) {
                                                    if (i15 >= size6) {
                                                        break;
                                                    }
                                                    if (((Map.Entry) arrayList8.get(i15)).getValue() == no6Var) {
                                                        this.c.put(no6Var, ((Map.Entry) arrayList8.get(i15)).getKey());
                                                        break;
                                                    }
                                                    i15++;
                                                }
                                            }
                                            a62 a62Var7 = this.F;
                                            ((ArrayList) a62Var7.k.f).remove(indexOf4);
                                            a62Var7.b(a62Var7.k, true);
                                            j();
                                            i(c62Var.Q, false);
                                            int i16 = this.P + 1;
                                            this.P = i16;
                                            c62Var.x.k(0L, 82, no6Var, null, null, new gp6((Object) this, (Object) a62Var7, (Object) no6Var, indexOf4, (byte) 15));
                                            postDelayed(new zd((Object) this, i16, (byte) 25), 4000L);
                                        }
                                        ValueAnimator valueAnimator2 = c62Var.M;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                    }
                                    z52Var4 = null;
                                    this.G = z52Var4;
                                    this.E = 0L;
                                    c62Var.K = z52Var4;
                                    this.H = 0.0f;
                                }
                            }
                            z = true;
                            i = 1;
                            if (action != i || action == 3) {
                                this.E = 0L;
                                removeCallbacks(p1Var);
                                this.M = false;
                                if (!z) {
                                    h();
                                    return i;
                                }
                            }
                            return z;
                        }
                        z = false;
                        i = 1;
                        if (action != i) {
                        }
                        this.E = 0L;
                        removeCallbacks(p1Var);
                        this.M = false;
                        if (!z) {
                        }
                        return z;
                    }
                    c62Var.E = x;
                    c62Var.F = y;
                    if (!this.M) {
                        this.M = true;
                        postDelayed(p1Var, 16L);
                    }
                    invalidate();
                } else {
                    this.F = a62Var;
                    this.G = z52Var;
                    c62Var.E = x;
                    c62Var.F = y;
                    c62Var.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    hl.d3(new ue2(this, elapsedRealtime, this.G, (byte) 18), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z = true;
                i = 1;
                if (action != i) {
                }
                this.E = 0L;
                removeCallbacks(p1Var);
                this.M = false;
                if (!z) {
                }
                return z;
            }
        } else {
            f = 2.0f;
            a62Var2 = null;
        }
        z52Var2 = null;
        action = motionEvent.getAction();
        p1 p1Var2 = this.N;
        if (action == 0) {
        }
        if (action == 2) {
        }
        if (action == 1) {
        }
        z = false;
        i = 1;
        if (action != i) {
        }
        this.E = 0L;
        removeCallbacks(p1Var2);
        this.M = false;
        if (!z) {
        }
        return z;
    }
}
