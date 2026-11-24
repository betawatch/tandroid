// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class az1 extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF I = new RectF();
    public final yy1 E;
    public ViewTreeObserver F;
    public boolean G;
    public TextPaint H;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public long d;
    public int e;
    public ViewGroup f;
    public jq1 h;
    public long n;
    public yy1 r;
    public long s;
    public final ArrayList w;
    public final LongSparseArray x;
    public final LongSparseArray y;

    public az1(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.w = new ArrayList();
        this.x = new LongSparseArray();
        this.y = new LongSparseArray();
        this.E = new yy1(this, (byte) 1);
        this.a = gba.c1;
    }

    public final void a() {
        yy1 yy1Var = this.r;
        if (yy1Var != null) {
            gl.r(yy1Var);
            this.r = null;
        }
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = na7.q1(this.e).h1(this.d);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new np0((byte) 0));
        arrayList.clear();
    }

    public final void b(int i, long j, ViewGroup viewGroup, jq1 jq1Var) {
        this.d = j;
        this.e = i;
        this.f = viewGroup;
        this.h = jq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String str;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z;
        long j;
        String str2;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        RectF rectF;
        int i;
        k27 messageObject;
        RectF rectF2;
        long j2;
        if (this.f == null || this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.s;
        long j4 = 0;
        long j5 = j3 == 0 ? 0L : uptimeMillis - j3;
        this.s = uptimeMillis;
        LongSparseArray longSparseArray4 = this.y;
        int size = longSparseArray4.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((RectF) longSparseArray4.valueAt(i2)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.h.getChildCount();
        int i3 = 0;
        while (true) {
            str = "ViewMetrics";
            longSparseArray = this.x;
            if (i3 >= childCount) {
                break;
            }
            View childAt = this.h.getChildAt(i3);
            long j6 = j4;
            ViewGroup viewGroup = this.f;
            RectF rectF3 = I;
            if (zec.c(childAt, viewGroup, rectF3)) {
                if (childAt instanceof gb2) {
                    messageObject = ((gb2) childAt).getMessageObject();
                } else if (childAt instanceof uk1) {
                    messageObject = ((uk1) childAt).getMessageObject();
                }
                if (messageObject != null) {
                    long B0 = k27.B0(messageObject.k);
                    i = i3;
                    if (B0 == this.d) {
                        int e1 = messageObject.e1();
                        long c1 = messageObject.c1();
                        if (B0 != j6 && e1 > 0) {
                            long j7 = e1;
                            zy1 zy1Var = (zy1) longSparseArray.get(j7);
                            if (zy1Var == null) {
                                rectF2 = rectF3;
                                j2 = c1;
                                zy1Var = new zy1(e1, j2);
                                longSparseArray.put(j7, zy1Var);
                                if (w01.a) {
                                    Log.d("ViewMetrics", e1 + " " + j2 + " in screen");
                                }
                            } else {
                                rectF2 = rectF3;
                                j2 = c1;
                            }
                            RectF rectF4 = zy1Var.c;
                            rectF4.set(rectF2);
                            if (j2 != j6) {
                                RectF rectF5 = (RectF) longSparseArray4.get(j2);
                                if (rectF5 == null) {
                                    rectF5 = new RectF();
                                    longSparseArray4.put(j2, rectF5);
                                }
                                rectF5.union(rectF4);
                            }
                            zy1Var.e = uptimeMillis;
                        }
                    }
                    i3 = i + 1;
                    j4 = j6;
                }
            }
            i = i3;
            i3 = i + 1;
            j4 = j6;
        }
        long j8 = j4;
        for (int size2 = longSparseArray4.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray4.valueAt(size2)).isEmpty()) {
                longSparseArray4.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i4 = 0; i4 < size3; i4++) {
            zy1 zy1Var2 = (zy1) longSparseArray.valueAt(i4);
            long j9 = zy1Var2.b;
            if (j9 != j8 && (rectF = (RectF) longSparseArray4.get(j9)) != null) {
                zy1Var2.c.set(rectF);
            }
        }
        int size4 = longSparseArray.size() - 1;
        while (true) {
            arrayList = this.w;
            if (size4 < 0) {
                break;
            }
            zy1 zy1Var3 = (zy1) longSparseArray.valueAt(size4);
            int i5 = zy1Var3.a;
            LongSparseArray longSparseArray5 = longSparseArray4;
            long j10 = zy1Var3.b;
            RectF rectF6 = zy1Var3.c;
            long j11 = j5;
            long j12 = i5;
            RectF rectF7 = j10 != j8 ? (RectF) longSparseArray5.get(j10) : null;
            long j13 = zy1Var3.e;
            RectF rectF8 = this.c;
            if (j13 == uptimeMillis || rectF7 != null) {
                if (RectF.intersects(rectF8, rectF7 != null ? rectF7 : rectF6)) {
                    z = true;
                    if (z) {
                        j = uptimeMillis;
                        str2 = str;
                        longSparseArray2 = longSparseArray;
                    } else {
                        String str3 = str;
                        longSparseArray2 = longSparseArray;
                        if (zy1Var3.f != j8) {
                            zy1Var3.g += j11;
                            if (uptimeMillis - this.n < 15000) {
                                zy1Var3.h += j11;
                            }
                        }
                        zy1Var3.f = uptimeMillis;
                        float height = rectF6.height();
                        j = uptimeMillis;
                        float f = rectF8.top - rectF6.top;
                        float f2 = height - (rectF6.bottom - rectF8.bottom);
                        zy1Var3.l = Math.min(zy1Var3.l, moe.a(f, 0.0f, height));
                        zy1Var3.m = Math.max(zy1Var3.m, moe.a(f2, 0.0f, height));
                        zy1Var3.k = Math.max(zy1Var3.k, rectF8.height());
                        zy1Var3.j = Math.max(zy1Var3.j, height);
                        if (zy1Var3.i || zy1Var3.g <= 300) {
                            str2 = str3;
                        } else {
                            if (w01.a) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(j12);
                                sb.append(" ");
                                sb.append(j10);
                                str2 = str3;
                                ir2.x(sb, " in viewport", str2);
                            } else {
                                str2 = str3;
                            }
                            zy1Var3.i = true;
                        }
                    }
                    if (!z || zy1Var3.g <= j8 || j - 300 <= zy1Var3.f) {
                        longSparseArray3 = longSparseArray2;
                        if (zy1Var3.i) {
                            if (zy1Var3.e != j && (j10 == j8 || rectF7 == null)) {
                                longSparseArray3.removeAt(size4);
                                if (w01.a) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j12);
                                    sb2.append(" ");
                                    sb2.append(j10);
                                    ir2.x(sb2, " out of screen", str2);
                                }
                            }
                        } else if (zy1Var3.g > 300000) {
                            arrayList.add(zy1Var3.a());
                            longSparseArray3.removeAt(size4);
                            if (w01.a) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(j12);
                                sb3.append(" ");
                                sb3.append(j10);
                                ir2.x(sb3, " out of time", str2);
                            }
                        }
                    } else {
                        if (zy1Var3.i) {
                            arrayList.add(zy1Var3.a());
                        }
                        longSparseArray3 = longSparseArray2;
                        longSparseArray3.removeAt(size4);
                        if (w01.a) {
                            Log.d(str2, j12 + " " + j10 + " out of viewport: " + zy1Var3.g);
                        }
                    }
                    size4--;
                    longSparseArray = longSparseArray3;
                    str = str2;
                    j5 = j11;
                    longSparseArray4 = longSparseArray5;
                    uptimeMillis = j;
                }
            }
            z = false;
            if (z) {
            }
            if (z) {
            }
            longSparseArray3 = longSparseArray2;
            if (zy1Var3.i) {
            }
            size4--;
            longSparseArray = longSparseArray3;
            str = str2;
            j5 = j11;
            longSparseArray4 = longSparseArray5;
            uptimeMillis = j;
        }
        if (!arrayList.isEmpty() && this.r == null) {
            yy1 yy1Var = new yy1(this, (byte) 0);
            this.r = yy1Var;
            gl.d3(yy1Var, 5000L);
        }
        if (this.a) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.F.addOnGlobalLayoutListener(this);
        this.F.addOnScrollChangedListener(this);
        gl.d3(this.E, 400L);
        if (w01.a) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.F.removeOnPreDrawListener(this);
            this.F.removeOnGlobalLayoutListener(this);
            this.F.removeOnScrollChangedListener(this);
        }
        this.F = null;
        this.s = 0L;
        gl.r(this.E);
        if (w01.a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            if (this.H == null) {
                TextPaint textPaint = new TextPaint(1);
                this.H = textPaint;
                textPaint.setColor(-16776961);
                this.H.setTextSize(gl.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = bkb.Im;
            RectF rectF = this.c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.x;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                zy1 zy1Var = (zy1) longSparseArray.valueAt(i);
                RectF rectF2 = zy1Var.c;
                canvas.drawRect(rectF2, bkb.Jm);
                canvas.save();
                canvas.translate(rectF2.left, moe.a(moe.a(rectF2.centerY() - gl.L(20.0f), rectF.top - gl.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - gl.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), gl.L(40.0f), bkb.Hm);
                canvas.translate(gl.L(10.0f), gl.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + zy1Var.g, 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, (float) gl.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + zy1Var.h, 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f = zy1Var.k;
                sb.append(f == 0.0f ? 1000 : Math.round((zy1Var.j / f) * 1000.0f));
                canvas.drawText(sb.toString(), 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, gl.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + zy1Var.b(), 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.G = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.G) {
            return true;
        }
        c();
        this.G = false;
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.G = true;
    }
}
