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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l52 extends ViewGroup {
    public long E;
    public k52 F;
    public j52 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final o1 N;
    public final i52 O;
    public int P;
    public final /* synthetic */ m52 Q;
    public final uk1 a;
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
    public l52(m52 m52Var, Context context) {
        super(context);
        this.Q = m52Var;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = gl.L(16.0f);
        this.r = gl.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new o1(this, (byte) 16);
        this.O = new i52(this);
        this.P = 0;
        setWillNotDraw(false);
        uk1 uk1Var = new uk1(m52Var.n, context, true);
        this.a = uk1Var;
        uk1Var.setCustomText(k96.M0(2131753957, null));
        addView(uk1Var);
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
            ArrayList arrayList2 = (ArrayList) ((k52) arrayList.get(i)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jm6 jm6Var = (jm6) arrayList2.get(i2);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(jm6Var)) {
                        Object obj = hashMap.get(jm6Var);
                        this.f.put(obj, jm6Var);
                        this.h.add(obj);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i3);
                                Object value = entry.getValue();
                                if (value == jm6Var) {
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
                                        if ((value2 instanceof jm6) && (str = ((jm6) value2).I) != null && jm6Var != null && str.equals(jm6Var.I)) {
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
        m52 m52Var = this.Q;
        j52 j52Var = m52Var.K;
        PointF pointF = this.L;
        if (j52Var == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (m52Var.L) {
            RectF e = j52Var.e(j52Var.c());
            RectF e2 = m52Var.K.e(1.0f);
            pointF.x = gl.R1((e.width() / 2.0f) + e2.left, this.I, this.H / this.K);
            pointF.y = gl.R1((e.height() / 2.0f) + m52Var.K.a.a + e2.top, this.J, this.H / this.K);
            return pointF;
        }
        RectF e3 = j52Var.e(j52Var.c());
        RectF e4 = m52Var.K.e(1.0f);
        pointF.x = gl.R1((e3.width() / 2.0f) + e4.left, m52Var.E - ((m52Var.H - 0.5f) * m52Var.I), this.H);
        pointF.y = gl.R1((e3.height() / 2.0f) + m52Var.K.a.a + e4.top, (m52Var.F - ((m52Var.G - 0.5f) * m52Var.J)) + m52Var.N, this.H);
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
            ArrayList arrayList2 = ((k52) arrayList.get(i)).h;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                j52 j52Var = (j52) arrayList2.get(i2);
                pla plaVar = j52Var.s;
                if (plaVar != null) {
                    plaVar.b(j52Var.O.z);
                    j52Var.s = null;
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
            arrayList3.add((jm6) this.d.get(num));
            if (i4 % 10 == 9 || i4 == i3) {
                k52 k52Var = new k52(this);
                k52Var.b(new g52(this.Q, arrayList3), false);
                arrayList.add(k52Var);
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
            float a = ((k52) arrayList.get(i)).a() + f;
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
            i = (int) (((k52) arrayList.get(i2)).a() + i);
        }
        uk1 uk1Var = this.a;
        if (uk1Var.getMeasuredHeight() <= 0) {
            uk1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.q.x, TLObject.FLAG_30), -2147473649);
        }
        return uk1Var.getMeasuredHeight() + i;
    }

    public final void f(k52 k52Var, jm6 jm6Var, int i) {
        ArrayList arrayList = (ArrayList) k52Var.k.f;
        arrayList.add(Math.min(arrayList.size(), i), jm6Var);
        if (((ArrayList) k52Var.k.f).size() == 11) {
            jm6 jm6Var2 = (jm6) ((ArrayList) k52Var.k.f).get(10);
            ((ArrayList) k52Var.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(k52Var);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                k52 k52Var2 = i2 == arrayList2.size() ? null : (k52) arrayList2.get(i2);
                if (k52Var2 == null) {
                    k52 k52Var3 = new k52(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jm6Var2);
                    k52Var3.b(new g52(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(k52Var2, jm6Var2, 0);
                }
            }
        }
        k52Var.b(k52Var.k, true);
    }

    public final void g() {
        float f = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k52 k52Var = (k52) arrayList.get(i2);
            float a = k52Var.a();
            k52Var.a = f;
            k52Var.b = i;
            f += a;
            i += ((ArrayList) k52Var.k.f).size();
        }
    }

    public final void h() {
        m52 m52Var = this.Q;
        ValueAnimator valueAnimator = m52Var.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b = b();
        float f = this.H;
        this.K = f;
        this.I = b.x;
        this.J = b.y;
        m52Var.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        m52Var.M = ofFloat;
        ofFloat.addUpdateListener(new h52(this, (byte) 1));
        m52Var.M.addListener(new bb1((Object) this, (byte) 18));
        m52Var.M.setDuration(200L);
        m52Var.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        e52 e52Var = chatAttachAlertPhotoLayout.H;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        s42 s42Var = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = s42Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    int R = RecyclerView.R(childAt);
                    boolean z2 = e52Var.f;
                    boolean z3 = e52Var.d;
                    if (z2 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    o48 o48Var = (o48) childAt;
                    if (x02Var.N2 != 0 || x02Var.B1) {
                        o48Var.getCheckBox().setVisibility(8);
                    }
                    jm6 d0 = chatAttachAlertPhotoLayout.d0(R);
                    if (d0 != null) {
                        int i2 = d0.C;
                        o48Var.d(d0, hashMap2.size() > 1, z3 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0, R == e52Var.b() - 1, x02Var.c2);
                        if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
                            o48Var.b(arrayList2.indexOf(Integer.valueOf(i2)), hashMap2.containsKey(Integer.valueOf(i2)), false);
                        } else {
                            o48Var.b(-1, hashMap2.containsKey(Integer.valueOf(i2)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.Q.b.F1(1);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int c = b00.c(45.0f, gl.q.y - a.getCurrentActionBarHeight(), e());
        if (this.s != c) {
            this.s = c;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k52 k52Var = (k52) arrayList.get(i);
            if (((ArrayList) k52Var.k.f).size() < 10 && i < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) k52Var.k.f).size();
                k52 k52Var2 = (k52) arrayList.get(i + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) k52Var2.k.f).size());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList2.add((jm6) ((ArrayList) k52Var2.k.f).remove(0));
                }
                ((ArrayList) k52Var.k.f).addAll(arrayList2);
                k52Var.b(k52Var.k, true);
                k52Var2.b(k52Var2.k, true);
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
        j52 j52Var;
        float f3 = this.n;
        m52 m52Var = this.Q;
        int computeVerticalScrollOffset = m52Var.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - m52Var.getListTopPadding());
        this.x = (r2.getMeasuredHeight() - m52Var.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f3);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f4 = f3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            k52 k52Var = (k52) arrayList2.get(i4);
            float a = k52Var.a();
            k52Var.a = f4;
            k52Var.b = i5;
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
                    i5 = ((ArrayList) k52Var.k.f).size() + i3;
                    i4 = i2 + 1;
                    size = i;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = k52Var.h;
            int i6 = k52Var.l;
            m17 m17Var = k52Var.x;
            l52 l52Var = k52Var.z;
            arrayList = arrayList2;
            float interpolation = k52Var.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - k52Var.c) / 200.0f));
            boolean z = interpolation < 1.0f;
            Point point = gl.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float R1 = gl.R1(k52Var.f, k52Var.d, interpolation);
            int width = l52Var.getWidth();
            m52 m52Var2 = l52Var.Q;
            float previewScale = width * R1 * m52Var2.getPreviewScale();
            boolean z2 = z;
            float previewScale2 = m52Var2.getPreviewScale() * gl.R1(k52Var.g, k52Var.e, interpolation) * max;
            if (m17Var != null) {
                f2 = 2.0f;
                k52Var.p = 0.0f;
                float width2 = l52Var.getWidth();
                float f7 = i6;
                k52Var.n = (width2 - Math.max(f7, previewScale)) / 2.0f;
                k52Var.o = (Math.max(f7, previewScale) + l52Var.getWidth()) / 2.0f;
                k52Var.q = Math.max(i6 << 1, previewScale2);
                k52Var.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                m17Var.setBounds((int) k52Var.n, (int) k52Var.p, (int) k52Var.o, (int) k52Var.q);
                m17Var.setAlpha((int) ((k52Var.d <= 0.0f ? 1.0f - interpolation : k52Var.f <= 0.0f ? interpolation : 1.0f) * 255.0f));
                m17Var.d(canvas, k52Var.y, null);
                k52Var.p += f7;
                k52Var.n += f7;
                k52Var.q -= f7;
                k52Var.o -= f7;
            } else {
                f2 = 2.0f;
            }
            k52Var.r = k52Var.o - k52Var.n;
            k52Var.s = k52Var.q - k52Var.p;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                j52 j52Var2 = (j52) arrayList3.get(i7);
                if (j52Var2 != null && (((j52Var = m52Var2.K) == null || j52Var.b != j52Var2.b) && j52Var2.a(canvas, false))) {
                    z2 = true;
                }
            }
            Paint paint = k52Var.w;
            RectF rectF = k52Var.t;
            long j = k52Var.i;
            if (j <= 0) {
                i = size;
                i2 = i4;
                i3 = i5;
                f = a;
            } else {
                if (k52Var.u == null || k52Var.v != j) {
                    k52Var.v = j;
                    k52Var.u = new tgb(jva.a1(false, k96.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, gl.o());
                }
                float L = gl.L(28.0f) + k52Var.u.c;
                float L2 = gl.L(32.0f);
                float f8 = k52Var.n;
                float f9 = k52Var.r;
                float f10 = f2;
                float z3 = oo1.z(f9, L, f10, f8);
                i = size;
                float f11 = k52Var.p;
                i2 = i4;
                float f12 = k52Var.s;
                i3 = i5;
                rectF.set(z3, oo1.z(f12, L2, f10, f11), tb4.e(f9, L, f10, f8), tb4.e(f12, L2, f10, f11));
                paint.setColor(1610612736);
                float f13 = L2 / f10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
                tgb tgbVar = k52Var.u;
                float L3 = gl.L(14.0f) + (((k52Var.r / f10) + k52Var.n) - (L / f10));
                float f14 = k52Var.p + (k52Var.s / f10);
                f = a;
                tgbVar.c(L3, f14, 1.0f, -1, canvas);
            }
            if (z2) {
                invalidate();
            }
            canvas.translate(0.0f, f);
            f4 += f;
            i5 = ((ArrayList) k52Var.k.f).size() + i3;
            i4 = i2 + 1;
            size = i;
            arrayList2 = arrayList;
        }
        uk1 uk1Var = this.a;
        uk1Var.k0(f4, uk1Var.getMeasuredHeight());
        if (uk1Var.T()) {
            uk1Var.J(canvas, true);
            uk1Var.M(canvas, true);
        }
        uk1Var.draw(canvas);
        canvas.restore();
        if (m52Var.K != null) {
            canvas.save();
            PointF b = b();
            canvas.translate(b.x, b.y);
            if (m52Var.K.a(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uk1 uk1Var = this.a;
        uk1Var.layout(0, 0, uk1Var.getMeasuredWidth(), uk1Var.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, -2147473649);
        if (this.s <= 0) {
            this.s = b00.c(45.0f, gl.q.y - a.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.s), TLObject.FLAG_30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k52 k52Var;
        j52 j52Var;
        float f;
        k52 k52Var2;
        j52 j52Var2;
        int action;
        int i;
        boolean z;
        j52 j52Var3;
        int i2;
        mu1 mu1Var;
        j52 j52Var4;
        g52 g52Var;
        ArrayList arrayList;
        j52 j52Var5;
        boolean z2;
        ValueAnimator valueAnimator;
        g52 g52Var2;
        int i3;
        int i4;
        int i5;
        float f2;
        m52 m52Var = this.Q;
        x02 x02Var = m52Var.b;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i6 = 0;
        float f3 = 0.0f;
        while (true) {
            if (i6 >= size) {
                k52Var = null;
                break;
            }
            k52Var = (k52) arrayList2.get(i6);
            float a = k52Var.a();
            if (y >= f3 && y <= f3 + a) {
                break;
            }
            f3 += a;
            i6++;
        }
        if (k52Var != null) {
            ArrayList arrayList3 = k52Var.h;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                j52Var = (j52) arrayList3.get(i7);
                if (j52Var != null && j52Var.b().contains(x, y - f3)) {
                    break;
                }
            }
        }
        j52Var = null;
        j52 j52Var6 = m52Var.K;
        if (j52Var6 != null) {
            RectF e = j52Var6.e(j52Var6.c());
            PointF b = b();
            RectF rectF = new RectF();
            float f4 = b.x;
            float f5 = b.y;
            f = 2.0f;
            rectF.set(f4 - (e.width() / 2.0f), f5 - (e.height() / 2.0f), (e.width() / 2.0f) + f4, (e.height() / 2.0f) + f5);
            int i8 = 0;
            k52Var2 = null;
            float f6 = 0.0f;
            float f7 = 0.0f;
            while (i8 < size) {
                k52 k52Var3 = (k52) arrayList2.get(i8);
                float a2 = k52Var3.a() + f6;
                int i9 = size;
                if (a2 >= rectF.top) {
                    float f8 = rectF.bottom;
                    if (f8 >= f6) {
                        float min = Math.min(a2, f8) - Math.max(f6, rectF.top);
                        if (min > f7) {
                            f7 = min;
                            k52Var2 = k52Var3;
                        }
                    }
                }
                i8++;
                f6 = a2;
                size = i9;
            }
            if (k52Var2 != null) {
                ArrayList arrayList4 = k52Var2.h;
                int size3 = arrayList4.size();
                int i10 = 0;
                j52Var2 = null;
                float f9 = 0.0f;
                while (i10 < size3) {
                    j52 j52Var7 = (j52) arrayList4.get(i10);
                    ArrayList arrayList5 = arrayList4;
                    if (j52Var7 == null || j52Var7 == m52Var.K) {
                        i3 = size3;
                    } else {
                        i3 = size3;
                        if (((ArrayList) k52Var2.k.f).contains(j52Var7.b)) {
                            RectF b2 = j52Var7.b();
                            int i11 = j52Var7.i;
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
                            if ((j52Var7.i & 8) > 0) {
                                b2.bottom = k52Var2.s;
                            }
                            if (RectF.intersects(rectF, b2)) {
                                i4 = i10;
                                float min2 = ((Math.min(b2.bottom, rectF.bottom) - Math.max(b2.top, rectF.top)) * (Math.min(b2.right, rectF.right) - Math.max(b2.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (min2 > 0.15f && min2 > f9) {
                                    f9 = min2;
                                    j52Var2 = j52Var7;
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
                o1 o1Var = this.N;
                if (action == 0 || m52Var.K != null || m52Var.r.J1 || (((valueAnimator = m52Var.M) != null && valueAnimator.isRunning()) || k52Var == null || j52Var == null || (g52Var2 = k52Var.k) == null || !((ArrayList) g52Var2.f).contains(j52Var.b))) {
                    i = 1;
                    if (action == 2 || m52Var.K == null || m52Var.L) {
                        if (action == 1) {
                            j52 j52Var8 = m52Var.K;
                            if (j52Var8 != null) {
                                if (k52Var == null || j52Var == null || j52Var == j52Var8) {
                                    if (k52Var2 == null || j52Var2 == null || j52Var2 == j52Var8 || j52Var2.b == j52Var8.b) {
                                        k52Var = null;
                                        j52Var = null;
                                    } else {
                                        k52Var = k52Var2;
                                        j52Var = j52Var2;
                                    }
                                }
                                if (k52Var != null) {
                                    ArrayList arrayList6 = k52Var.h;
                                    if (j52Var != null && j52Var != j52Var8) {
                                        int indexOf = ((ArrayList) j52Var8.a.k.f).indexOf(j52Var8.b);
                                        int indexOf2 = ((ArrayList) k52Var.k.f).indexOf(j52Var.b);
                                        if (indexOf >= 0) {
                                            ((ArrayList) m52Var.K.a.k.f).remove(indexOf);
                                            k52 k52Var4 = m52Var.K.a;
                                            k52Var4.b(k52Var4.k, true);
                                        }
                                        if (indexOf2 >= 0) {
                                            if (arrayList2.indexOf(k52Var) > arrayList2.indexOf(m52Var.K.a)) {
                                                indexOf2++;
                                            }
                                            f(k52Var, m52Var.K.b, indexOf2);
                                            if (m52Var.K.a != k52Var) {
                                                int size4 = arrayList6.size();
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 >= size4) {
                                                        j52Var5 = null;
                                                        break;
                                                    }
                                                    j52Var5 = (j52) arrayList6.get(i12);
                                                    if (j52Var5.b == m52Var.K.b) {
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                                if (j52Var5 != null) {
                                                    g();
                                                    j52 j52Var9 = m52Var.K;
                                                    k52 k52Var5 = j52Var5.O;
                                                    float f10 = j52Var9.j;
                                                    RectF rectF2 = j52Var9.g;
                                                    j52Var5.j = gl.R1(f10, j52Var9.k, j52Var9.c());
                                                    if (j52Var5.f == null) {
                                                        j52Var5.f = new RectF();
                                                    }
                                                    RectF rectF3 = new RectF();
                                                    RectF rectF4 = j52Var5.f;
                                                    RectF rectF5 = j52Var5.g;
                                                    if (rectF4 == null) {
                                                        rectF3.set(rectF5);
                                                    } else {
                                                        gl.X1(rectF4, rectF5, j52Var5.c(), rectF3);
                                                    }
                                                    RectF rectF6 = j52Var9.f;
                                                    if (rectF6 != null) {
                                                        gl.X1(rectF6, rectF2, j52Var9.c(), j52Var5.f);
                                                        j52Var5.f.set(rectF3.centerX() - (((j52Var5.f.width() / f) * j52Var9.a.r) / k52Var5.r), rectF3.centerY() - (((j52Var5.f.height() / f) * j52Var9.a.s) / k52Var5.s), (((j52Var5.f.width() / f) * j52Var9.a.r) / k52Var5.r) + rectF3.centerX(), (((j52Var5.f.height() / f) * j52Var9.a.s) / k52Var5.s) + rectF3.centerY());
                                                    } else {
                                                        j52Var5.f.set(rectF3.centerX() - (((rectF2.width() / f) * j52Var9.a.r) / k52Var5.r), rectF3.centerY() - (((rectF2.height() / f) * j52Var9.a.s) / k52Var5.s), (((rectF2.width() / f) * j52Var9.a.r) / k52Var5.r) + rectF3.centerX(), (((rectF2.height() / f) * j52Var9.a.s) / k52Var5.s) + rectF3.centerY());
                                                    }
                                                    j52Var5.j = gl.R1(j52Var5.j, j52Var5.k, j52Var5.c());
                                                    j52Var5.h = SystemClock.elapsedRealtime();
                                                    m52Var.K = j52Var5;
                                                    j52Var5.a = k52Var;
                                                    j52Var5.j = 1.0f;
                                                    j52Var5.k = 1.0f;
                                                    g();
                                                }
                                            }
                                        }
                                        try {
                                            m52Var.performHapticFeedback(7, 2);
                                        } catch (Exception unused) {
                                        }
                                        j();
                                        i(m52Var.Q, false);
                                    }
                                }
                                h();
                            } else if (j52Var8 == null && (j52Var3 = this.G) != null && this.F != null) {
                                if (j52Var3.e && j52Var3.l == 0.0f) {
                                    float x2 = motionEvent.getX();
                                    float y2 = motionEvent.getY();
                                    j52Var3.m = x2;
                                    j52Var3.n = y2;
                                    RectF b3 = j52Var3.b();
                                    j52Var3.o = (float) Math.sqrt(Math.pow(b3.height(), 2.0d) + Math.pow(b3.width(), 2.0d));
                                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) moe.a(j52Var3.o * 0.3f, 250.0f, 550.0f));
                                    duration.setInterpolator(s33.j);
                                    duration.addUpdateListener(new uz1(j52Var3, (byte) 3));
                                    duration.addListener(new bb1((Object) j52Var3, (byte) 19));
                                    duration.start();
                                } else {
                                    RectF b4 = j52Var3.b();
                                    RectF rectF7 = gl.P;
                                    float L = b4.right - gl.L(36.4f);
                                    float f11 = this.F.p + b4.top;
                                    rectF7.set(L, f11, b4.right, gl.L(36.4f) + f11);
                                    if (!rectF7.contains(x, y - this.G.a.a)) {
                                        a();
                                        ArrayList arrayList7 = new ArrayList();
                                        int size5 = arrayList2.size();
                                        for (int i13 = 0; i13 < size5; i13++) {
                                            k52 k52Var6 = (k52) arrayList2.get(i13);
                                            if (k52Var6 != null && (g52Var = k52Var6.k) != null && (arrayList = (ArrayList) g52Var.f) != null) {
                                                arrayList7.addAll(arrayList);
                                            }
                                        }
                                        int indexOf3 = arrayList7.indexOf(this.G.b);
                                        byte b5 = x02Var.N2;
                                        d dVar = x02Var.Z1;
                                        if (b5 != 0) {
                                            i2 = 1;
                                        } else if (dVar instanceof mu1) {
                                            mu1Var = (mu1) dVar;
                                            i2 = 0;
                                            if (dVar == null) {
                                                dVar = LaunchActivity.Q();
                                            }
                                            if (!x02Var.W3.f0()) {
                                                gl.t1(dVar.getFragmentView().findFocus());
                                                gl.t1(x02Var.c.findFocus());
                                            }
                                            PhotoViewer.r0().S1(null, dVar, m52Var.a);
                                            PhotoViewer.r0().T1(x02Var);
                                            PhotoViewer r0 = PhotoViewer.r0();
                                            int i14 = x02Var.P3;
                                            boolean z3 = x02Var.Q3;
                                            r0.h = i14;
                                            r0.n = z3;
                                            this.O.a = arrayList7;
                                            PhotoViewer.r0().n1(new ArrayList(arrayList7), indexOf3, i2, false, this.O, mu1Var);
                                            m52Var.Q.getClass();
                                            if (ChatAttachAlertPhotoLayout.U()) {
                                                PhotoViewer r02 = PhotoViewer.r0();
                                                Editable text = x02Var.U0().getText();
                                                r02.v7 = true;
                                                r02.w7 = text;
                                                j52Var4 = null;
                                                r02.I1(null, text, false, false);
                                                r02.D2(null);
                                                this.G = j52Var4;
                                                this.E = 0L;
                                                m52Var.K = j52Var4;
                                                this.H = 0.0f;
                                            }
                                        } else {
                                            i2 = 4;
                                        }
                                        mu1Var = null;
                                        if (dVar == null) {
                                        }
                                        if (!x02Var.W3.f0()) {
                                        }
                                        PhotoViewer.r0().S1(null, dVar, m52Var.a);
                                        PhotoViewer.r0().T1(x02Var);
                                        PhotoViewer r03 = PhotoViewer.r0();
                                        int i142 = x02Var.P3;
                                        boolean z32 = x02Var.Q3;
                                        r03.h = i142;
                                        r03.n = z32;
                                        this.O.a = arrayList7;
                                        PhotoViewer.r0().n1(new ArrayList(arrayList7), indexOf3, i2, false, this.O, mu1Var);
                                        m52Var.Q.getClass();
                                        if (ChatAttachAlertPhotoLayout.U()) {
                                        }
                                    } else if (m52Var.getSelectedItemsCount() > 1) {
                                        jm6 jm6Var = this.G.b;
                                        int indexOf4 = ((ArrayList) this.F.k.f).indexOf(jm6Var);
                                        if (indexOf4 >= 0) {
                                            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = m52Var.Q;
                                            if (chatAttachAlertPhotoLayout != null) {
                                                ArrayList arrayList8 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                                int size6 = arrayList8.size();
                                                int i15 = 0;
                                                while (true) {
                                                    if (i15 >= size6) {
                                                        break;
                                                    }
                                                    if (((Map.Entry) arrayList8.get(i15)).getValue() == jm6Var) {
                                                        this.c.put(jm6Var, ((Map.Entry) arrayList8.get(i15)).getKey());
                                                        break;
                                                    }
                                                    i15++;
                                                }
                                            }
                                            k52 k52Var7 = this.F;
                                            ((ArrayList) k52Var7.k.f).remove(indexOf4);
                                            k52Var7.b(k52Var7.k, true);
                                            j();
                                            i(m52Var.Q, false);
                                            int i16 = this.P + 1;
                                            this.P = i16;
                                            m52Var.x.k(0L, 82, jm6Var, null, null, new tn6((Object) this, (Object) k52Var7, (Object) jm6Var, indexOf4, (byte) 15));
                                            postDelayed(new eg((Object) this, i16, (byte) 24), 4000L);
                                        }
                                        ValueAnimator valueAnimator2 = m52Var.M;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                    }
                                    j52Var4 = null;
                                    this.G = j52Var4;
                                    this.E = 0L;
                                    m52Var.K = j52Var4;
                                    this.H = 0.0f;
                                }
                            }
                            z = true;
                            i = 1;
                            z2 = z;
                            if (action == i && action != 3) {
                                return z2;
                            }
                            this.E = 0L;
                            removeCallbacks(o1Var);
                            this.M = false;
                            if (z2 == 0) {
                                return z2;
                            }
                            h();
                            return i;
                        }
                        z = false;
                        i = 1;
                        z2 = z;
                        if (action == i) {
                        }
                        this.E = 0L;
                        removeCallbacks(o1Var);
                        this.M = false;
                        if (z2 == 0) {
                        }
                    } else {
                        m52Var.E = x;
                        m52Var.F = y;
                        if (!this.M) {
                            this.M = true;
                            postDelayed(o1Var, 16L);
                        }
                        invalidate();
                    }
                } else {
                    this.F = k52Var;
                    this.G = j52Var;
                    m52Var.E = x;
                    m52Var.F = y;
                    m52Var.K = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.E = elapsedRealtime;
                    i = 1;
                    gl.e3(new de2(this, elapsedRealtime, this.G, (byte) 18), ViewConfiguration.getLongPressTimeout());
                    invalidate();
                }
                z2 = i;
                if (action == i) {
                }
                this.E = 0L;
                removeCallbacks(o1Var);
                this.M = false;
                if (z2 == 0) {
                }
            }
        } else {
            f = 2.0f;
            k52Var2 = null;
        }
        j52Var2 = null;
        action = motionEvent.getAction();
        o1 o1Var2 = this.N;
        if (action == 0) {
        }
        i = 1;
        if (action == 2) {
        }
        if (action == 1) {
        }
        z = false;
        i = 1;
        z2 = z;
        if (action == i) {
        }
        this.E = 0L;
        removeCallbacks(o1Var2);
        this.M = false;
        if (z2 == 0) {
        }
    }
}
