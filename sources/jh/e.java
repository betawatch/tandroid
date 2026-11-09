package jh;

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
import c8.j9;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.cj;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF H = new RectF();
    public final c D;
    public ViewTreeObserver E;
    public boolean F;
    public TextPaint G;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public long d;
    public int e;
    public ViewGroup f;
    public ViewGroup h;
    public long n;
    public c r;
    public long s;
    public final ArrayList w;
    public final LongSparseArray x;
    public final LongSparseArray y;

    public e(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.w = new ArrayList();
        this.x = new LongSparseArray();
        this.y = new LongSparseArray();
        this.D = new c(this, 1);
        this.a = iz.g1;
    }

    public final void a() {
        c cVar = this.r;
        if (cVar != null) {
            g0.r(cVar);
            this.r = null;
        }
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = qp.s1(this.e).j1(this.d);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
        arrayList.clear();
    }

    public final void b(int i7, long j3, ViewGroup viewGroup, cj cjVar) {
        this.d = j3;
        this.e = i7;
        this.f = viewGroup;
        this.h = cjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String str;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z9;
        long j3;
        String str2;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        boolean z10;
        RectF rectF;
        ij messageObject;
        int i7;
        RectF rectF2;
        long j10;
        if (this.f == null || this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.s;
        long j12 = 0;
        long j13 = j11 == 0 ? 0L : uptimeMillis - j11;
        this.s = uptimeMillis;
        LongSparseArray longSparseArray4 = this.y;
        int size = longSparseArray4.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((RectF) longSparseArray4.valueAt(i10)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.h.getChildCount();
        int i11 = 0;
        while (true) {
            str = "ViewMetrics";
            longSparseArray = this.x;
            if (i11 >= childCount) {
                break;
            }
            View childAt = this.h.getChildAt(i11);
            long j14 = j12;
            ViewGroup viewGroup = this.f;
            RectF rectF3 = H;
            if (k.c(childAt, viewGroup, rectF3)) {
                if (childAt instanceof q1) {
                    messageObject = ((q1) childAt).getMessageObject();
                } else if (childAt instanceof t0) {
                    messageObject = ((t0) childAt).getMessageObject();
                }
                if (messageObject != null) {
                    long B0 = ij.B0(messageObject.k);
                    i7 = i11;
                    if (B0 == this.d) {
                        int e12 = messageObject.e1();
                        long c12 = messageObject.c1();
                        if (B0 != j14 && e12 > 0) {
                            long j15 = e12;
                            d dVar = (d) longSparseArray.get(j15);
                            if (dVar == null) {
                                rectF2 = rectF3;
                                j10 = c12;
                                dVar = new d(e12, j10);
                                longSparseArray.put(j15, dVar);
                                if (r2.a) {
                                    Log.d("ViewMetrics", e12 + " " + j10 + " in screen");
                                }
                            } else {
                                rectF2 = rectF3;
                                j10 = c12;
                            }
                            RectF rectF4 = dVar.c;
                            rectF4.set(rectF2);
                            if (j10 != j14) {
                                RectF rectF5 = (RectF) longSparseArray4.get(j10);
                                if (rectF5 == null) {
                                    rectF5 = new RectF();
                                    longSparseArray4.put(j10, rectF5);
                                }
                                rectF5.union(rectF4);
                            }
                            dVar.e = uptimeMillis;
                        }
                    }
                    i11 = i7 + 1;
                    j12 = j14;
                }
            }
            i7 = i11;
            i11 = i7 + 1;
            j12 = j14;
        }
        long j16 = j12;
        for (int size2 = longSparseArray4.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray4.valueAt(size2)).isEmpty()) {
                longSparseArray4.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar2 = (d) longSparseArray.valueAt(i12);
            long j17 = dVar2.b;
            if (j17 != j16 && (rectF = (RectF) longSparseArray4.get(j17)) != null) {
                dVar2.c.set(rectF);
            }
        }
        int size4 = longSparseArray.size() - 1;
        while (true) {
            arrayList = this.w;
            if (size4 < 0) {
                break;
            }
            d dVar3 = (d) longSparseArray.valueAt(size4);
            int i13 = dVar3.a;
            LongSparseArray longSparseArray5 = longSparseArray4;
            long j18 = dVar3.b;
            RectF rectF6 = dVar3.c;
            long j19 = j13;
            long j20 = i13;
            RectF rectF7 = j18 != j16 ? (RectF) longSparseArray5.get(j18) : null;
            long j21 = dVar3.e;
            RectF rectF8 = this.c;
            if (j21 == uptimeMillis || rectF7 != null) {
                if (RectF.intersects(rectF8, rectF7 != null ? rectF7 : rectF6)) {
                    z9 = true;
                    if (z9) {
                        j3 = uptimeMillis;
                        str2 = str;
                        longSparseArray2 = longSparseArray;
                    } else {
                        String str3 = str;
                        longSparseArray2 = longSparseArray;
                        if (dVar3.f != j16) {
                            dVar3.g += j19;
                            if (uptimeMillis - this.n < 15000) {
                                dVar3.h += j19;
                            }
                        }
                        dVar3.f = uptimeMillis;
                        float height = rectF6.height();
                        j3 = uptimeMillis;
                        float f10 = rectF8.top - rectF6.top;
                        float f11 = height - (rectF6.bottom - rectF8.bottom);
                        dVar3.l = Math.min(dVar3.l, j9.a(f10, 0.0f, height));
                        dVar3.m = Math.max(dVar3.m, j9.a(f11, 0.0f, height));
                        dVar3.k = Math.max(dVar3.k, rectF8.height());
                        dVar3.j = Math.max(dVar3.j, height);
                        if (dVar3.i || dVar3.g <= 300) {
                            str2 = str3;
                        } else {
                            if (r2.a) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(j20);
                                sb2.append(" ");
                                sb2.append(j18);
                                str2 = str3;
                                rf.b.p(sb2, " in viewport", str2);
                            } else {
                                str2 = str3;
                            }
                            dVar3.i = true;
                        }
                    }
                    if (!z9 || dVar3.g <= j16 || j3 - 300 <= dVar3.f) {
                        longSparseArray3 = longSparseArray2;
                        z10 = dVar3.i;
                        if (!z10 && dVar3.g > 300000) {
                            arrayList.add(dVar3.a());
                            longSparseArray3.removeAt(size4);
                            if (r2.a) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(j20);
                                sb3.append(" ");
                                sb3.append(j18);
                                rf.b.p(sb3, " out of time", str2);
                            }
                        } else if (!z10 && dVar3.e != j3 && (j18 == j16 || rectF7 == null)) {
                            longSparseArray3.removeAt(size4);
                            if (!r2.a) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(j20);
                                sb4.append(" ");
                                sb4.append(j18);
                                rf.b.p(sb4, " out of screen", str2);
                            }
                        }
                    } else {
                        if (dVar3.i) {
                            arrayList.add(dVar3.a());
                        }
                        longSparseArray3 = longSparseArray2;
                        longSparseArray3.removeAt(size4);
                        if (r2.a) {
                            Log.d(str2, j20 + " " + j18 + " out of viewport: " + dVar3.g);
                        }
                    }
                    size4--;
                    longSparseArray = longSparseArray3;
                    str = str2;
                    j13 = j19;
                    longSparseArray4 = longSparseArray5;
                    uptimeMillis = j3;
                }
            }
            z9 = false;
            if (z9) {
            }
            if (z9) {
            }
            longSparseArray3 = longSparseArray2;
            z10 = dVar3.i;
            if (!z10) {
            }
            if (!z10) {
                longSparseArray3.removeAt(size4);
                if (!r2.a) {
                }
            }
            size4--;
            longSparseArray = longSparseArray3;
            str = str2;
            j13 = j19;
            longSparseArray4 = longSparseArray5;
            uptimeMillis = j3;
        }
        if (!arrayList.isEmpty() && this.r == null) {
            c cVar = new c(this, 0);
            this.r = cVar;
            g0.i3(cVar, 5000L);
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
        this.E = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.E.addOnGlobalLayoutListener(this);
        this.E.addOnScrollChangedListener(this);
        g0.i3(this.D, 400L);
        if (r2.a) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.E.removeOnPreDrawListener(this);
            this.E.removeOnGlobalLayoutListener(this);
            this.E.removeOnScrollChangedListener(this);
        }
        this.E = null;
        this.s = 0L;
        g0.r(this.D);
        if (r2.a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            if (this.G == null) {
                TextPaint textPaint = new TextPaint(1);
                this.G = textPaint;
                textPaint.setColor(-16776961);
                this.G.setTextSize(g0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = l6.Fm;
            RectF rectF = this.c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.x;
            int size = longSparseArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) longSparseArray.valueAt(i7);
                RectF rectF2 = dVar.c;
                canvas.drawRect(rectF2, l6.Gm);
                canvas.save();
                canvas.translate(rectF2.left, j9.a(j9.a(rectF2.centerY() - g0.L(20.0f), rectF.top - g0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - g0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), g0.L(40.0f), l6.Em);
                canvas.translate(g0.L(10.0f), g0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.g, 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, (float) g0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = dVar.k;
                sb2.append(f10 == 0.0f ? 1000 : Math.round((dVar.j / f10) * 1000.0f));
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, g0.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + dVar.b(), 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.F = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.F) {
            return true;
        }
        c();
        this.F = false;
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.F = true;
    }
}
