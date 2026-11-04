package kh;

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
import b8.be;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.r2;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.wi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF I = new RectF();
    public final c E;
    public ViewTreeObserver F;
    public boolean G;
    public TextPaint H;
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
        this.E = new c(this, 1);
        this.a = az.g1;
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
        tL_messages_reportReadMetrics.peer = hp.s1(this.e).j1(this.d);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
        arrayList.clear();
    }

    public final void b(int i3, long j10, ViewGroup viewGroup, wi wiVar) {
        this.d = j10;
        this.e = i3;
        this.f = viewGroup;
        this.h = wiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        String str;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z10;
        long j10;
        String str2;
        LongSparseArray longSparseArray2;
        boolean z11;
        LongSparseArray longSparseArray3;
        boolean z12;
        RectF rectF;
        zi messageObject;
        int i3;
        RectF rectF2;
        long j11;
        if (this.f == null || this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j12 = this.s;
        long j13 = 0;
        long j14 = j12 == 0 ? 0L : uptimeMillis - j12;
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
            long j15 = j13;
            ViewGroup viewGroup = this.f;
            RectF rectF3 = I;
            if (k.c(childAt, viewGroup, rectF3)) {
                if (childAt instanceof q1) {
                    messageObject = ((q1) childAt).getMessageObject();
                } else if (childAt instanceof t0) {
                    messageObject = ((t0) childAt).getMessageObject();
                }
                if (messageObject != null) {
                    long B0 = zi.B0(messageObject.k);
                    i3 = i11;
                    if (B0 == this.d) {
                        int f12 = messageObject.f1();
                        long d12 = messageObject.d1();
                        if (B0 != j15 && f12 > 0) {
                            long j16 = f12;
                            d dVar = (d) longSparseArray.get(j16);
                            if (dVar == null) {
                                rectF2 = rectF3;
                                j11 = d12;
                                dVar = new d(f12, j11);
                                longSparseArray.put(j16, dVar);
                                if (r2.a) {
                                    Log.d("ViewMetrics", f12 + " " + j11 + " in screen");
                                }
                            } else {
                                rectF2 = rectF3;
                                j11 = d12;
                            }
                            RectF rectF4 = dVar.c;
                            rectF4.set(rectF2);
                            if (j11 != j15) {
                                RectF rectF5 = (RectF) longSparseArray4.get(j11);
                                if (rectF5 == null) {
                                    rectF5 = new RectF();
                                    longSparseArray4.put(j11, rectF5);
                                }
                                rectF5.union(rectF4);
                            }
                            dVar.e = uptimeMillis;
                        }
                    }
                    i11 = i3 + 1;
                    j13 = j15;
                }
            }
            i3 = i11;
            i11 = i3 + 1;
            j13 = j15;
        }
        long j17 = j13;
        for (int size2 = longSparseArray4.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray4.valueAt(size2)).isEmpty()) {
                longSparseArray4.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar2 = (d) longSparseArray.valueAt(i12);
            long j18 = dVar2.b;
            if (j18 != j17 && (rectF = (RectF) longSparseArray4.get(j18)) != null) {
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
            long j19 = dVar3.b;
            RectF rectF6 = dVar3.c;
            long j20 = j14;
            long j21 = i13;
            RectF rectF7 = j19 != j17 ? (RectF) longSparseArray5.get(j19) : null;
            long j22 = dVar3.e;
            RectF rectF8 = this.c;
            if (j22 == uptimeMillis || rectF7 != null) {
                if (RectF.intersects(rectF8, rectF7 != null ? rectF7 : rectF6)) {
                    z10 = true;
                    if (z10) {
                        j10 = uptimeMillis;
                        str2 = str;
                        longSparseArray2 = longSparseArray;
                        z11 = true;
                    } else {
                        String str3 = str;
                        longSparseArray2 = longSparseArray;
                        if (dVar3.f != j17) {
                            dVar3.g += j20;
                            if (uptimeMillis - this.n < 15000) {
                                dVar3.h += j20;
                            }
                        }
                        dVar3.f = uptimeMillis;
                        float height = rectF6.height();
                        j10 = uptimeMillis;
                        float f10 = rectF8.top - rectF6.top;
                        float f11 = height - (rectF6.bottom - rectF8.bottom);
                        dVar3.l = Math.min(dVar3.l, be.a(f10, 0.0f, height));
                        dVar3.m = Math.max(dVar3.m, be.a(f11, 0.0f, height));
                        dVar3.k = Math.max(dVar3.k, rectF8.height());
                        dVar3.j = Math.max(dVar3.j, height);
                        if (dVar3.i || dVar3.g <= 300) {
                            str2 = str3;
                            z11 = true;
                        } else {
                            if (r2.a) {
                                str2 = str3;
                                Log.d(str2, j21 + " " + j19 + " in viewport");
                            } else {
                                str2 = str3;
                            }
                            z11 = true;
                            dVar3.i = true;
                        }
                    }
                    if (!z10 || dVar3.g <= j17 || j10 - 300 <= dVar3.f) {
                        longSparseArray3 = longSparseArray2;
                        z12 = dVar3.i;
                        if (!z12 && dVar3.g > 300000) {
                            arrayList.add(dVar3.a());
                            longSparseArray3.removeAt(size4);
                            if (r2.a) {
                                Log.d(str2, j21 + " " + j19 + " out of time");
                            }
                        } else if (!z12 && dVar3.e != j10 && (j19 == j17 || rectF7 == null)) {
                            longSparseArray3.removeAt(size4);
                            if (!r2.a) {
                                Log.d(str2, j21 + " " + j19 + " out of screen");
                            }
                        }
                    } else {
                        if (dVar3.i) {
                            arrayList.add(dVar3.a());
                        }
                        longSparseArray3 = longSparseArray2;
                        longSparseArray3.removeAt(size4);
                        if (r2.a) {
                            Log.d(str2, j21 + " " + j19 + " out of viewport: " + dVar3.g);
                        }
                    }
                    size4--;
                    str = str2;
                    longSparseArray = longSparseArray3;
                    j14 = j20;
                    longSparseArray4 = longSparseArray5;
                    uptimeMillis = j10;
                }
            }
            z10 = false;
            if (z10) {
            }
            if (z10) {
            }
            longSparseArray3 = longSparseArray2;
            z12 = dVar3.i;
            if (!z12) {
            }
            if (!z12) {
                longSparseArray3.removeAt(size4);
                if (!r2.a) {
                }
            }
            size4--;
            str = str2;
            longSparseArray = longSparseArray3;
            j14 = j20;
            longSparseArray4 = longSparseArray5;
            uptimeMillis = j10;
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
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.F.addOnGlobalLayoutListener(this);
        this.F.addOnScrollChangedListener(this);
        g0.i3(this.E, 400L);
        if (r2.a) {
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
        g0.r(this.E);
        if (r2.a) {
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
                this.H.setTextSize(g0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = k6.Fm;
            RectF rectF = this.c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.x;
            int size = longSparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = (d) longSparseArray.valueAt(i3);
                RectF rectF2 = dVar.c;
                canvas.drawRect(rectF2, k6.Gm);
                canvas.save();
                canvas.translate(rectF2.left, be.a(be.a(rectF2.centerY() - g0.L(20.0f), rectF.top - g0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - g0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), g0.L(40.0f), k6.Em);
                canvas.translate(g0.L(10.0f), g0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.g, 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, (float) g0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.H);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = dVar.k;
                sb2.append(f10 == 0.0f ? 1000 : Math.round((dVar.j / f10) * 1000.0f));
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.H);
                canvas.translate(0.0f, g0.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + dVar.b(), 0.0f, 0.0f, this.H);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
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
