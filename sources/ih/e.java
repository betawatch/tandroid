package ih;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.nj;
import w7.r;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class e extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF H = new RectF();
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
    public final ArrayList v;
    public final LongSparseArray w;
    public final LongSparseArray x;
    public final c y;

    public e(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.v = new ArrayList();
        this.w = new LongSparseArray();
        this.x = new LongSparseArray();
        this.y = new c(this, 1);
        this.a = SharedConfig.debugViewMetrics;
    }

    public final void a() {
        c cVar = this.r;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.r = null;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.e).getInputPeer(this.d);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new b(0));
        arrayList.clear();
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, nj njVar) {
        this.d = j10;
        this.e = i10;
        this.f = viewGroup;
        this.h = njVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
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
        MessageObject messageObject;
        int i10;
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
        LongSparseArray longSparseArray4 = this.x;
        int size = longSparseArray4.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((RectF) longSparseArray4.valueAt(i11)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.h.getChildCount();
        int i12 = 0;
        while (true) {
            str = "ViewMetrics";
            longSparseArray = this.w;
            if (i12 >= childCount) {
                break;
            }
            View childAt = this.h.getChildAt(i12);
            long j15 = j13;
            ViewGroup viewGroup = this.f;
            RectF rectF3 = H;
            if (k.c(childAt, viewGroup, rectF3)) {
                if (childAt instanceof t1) {
                    messageObject = ((t1) childAt).getMessageObject();
                } else if (childAt instanceof v0) {
                    messageObject = ((v0) childAt).getMessageObject();
                }
                if (messageObject != null) {
                    long dialogId = messageObject.getDialogId();
                    i10 = i12;
                    if (dialogId == this.d) {
                        int id2 = messageObject.getId();
                        long groupId = messageObject.getGroupId();
                        if (dialogId != j15 && id2 > 0) {
                            long j16 = id2;
                            d dVar = (d) longSparseArray.get(j16);
                            if (dVar == null) {
                                rectF2 = rectF3;
                                j11 = groupId;
                                dVar = new d(id2, j11);
                                longSparseArray.put(j16, dVar);
                                if (BuildVars.LOGS_ENABLED) {
                                    Log.d("ViewMetrics", id2 + " " + j11 + " in screen");
                                }
                            } else {
                                rectF2 = rectF3;
                                j11 = groupId;
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
                    i12 = i10 + 1;
                    j13 = j15;
                }
            }
            i10 = i12;
            i12 = i10 + 1;
            j13 = j15;
        }
        long j17 = j13;
        for (int size2 = longSparseArray4.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray4.valueAt(size2)).isEmpty()) {
                longSparseArray4.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i13 = 0; i13 < size3; i13++) {
            d dVar2 = (d) longSparseArray.valueAt(i13);
            long j18 = dVar2.b;
            if (j18 != j17 && (rectF = (RectF) longSparseArray4.get(j18)) != null) {
                dVar2.c.set(rectF);
            }
        }
        int size4 = longSparseArray.size() - 1;
        while (true) {
            arrayList = this.v;
            if (size4 < 0) {
                break;
            }
            d dVar3 = (d) longSparseArray.valueAt(size4);
            int i14 = dVar3.a;
            LongSparseArray longSparseArray5 = longSparseArray4;
            long j19 = dVar3.b;
            RectF rectF6 = dVar3.c;
            long j20 = j14;
            long j21 = i14;
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
                        float f7 = rectF8.top - rectF6.top;
                        float f10 = height - (rectF6.bottom - rectF8.bottom);
                        dVar3.l = Math.min(dVar3.l, r.a(f7, 0.0f, height));
                        dVar3.m = Math.max(dVar3.m, r.a(f10, 0.0f, height));
                        dVar3.k = Math.max(dVar3.k, rectF8.height());
                        dVar3.j = Math.max(dVar3.j, height);
                        if (dVar3.i || dVar3.g <= 300) {
                            str2 = str3;
                            z11 = true;
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
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
                            if (BuildVars.LOGS_ENABLED) {
                                Log.d(str2, j21 + " " + j19 + " out of time");
                            }
                        } else if (!z12 && dVar3.e != j10 && (j19 == j17 || rectF7 == null)) {
                            longSparseArray3.removeAt(size4);
                            if (!BuildVars.LOGS_ENABLED) {
                                Log.d(str2, j21 + " " + j19 + " out of screen");
                            }
                        }
                    } else {
                        if (dVar3.i) {
                            arrayList.add(dVar3.a());
                        }
                        longSparseArray3 = longSparseArray2;
                        longSparseArray3.removeAt(size4);
                        if (BuildVars.LOGS_ENABLED) {
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
                if (!BuildVars.LOGS_ENABLED) {
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
            AndroidUtilities.runOnUIThread(cVar, 5000L);
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
        AndroidUtilities.runOnUIThread(this.y, 400L);
        if (BuildVars.LOGS_ENABLED) {
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
        AndroidUtilities.cancelRunOnUIThread(this.y);
        if (BuildVars.LOGS_ENABLED) {
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
                this.G.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = k6.Pl;
            RectF rectF = this.c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) longSparseArray.valueAt(i10);
                RectF rectF2 = dVar.c;
                canvas.drawRect(rectF2, k6.Ql);
                canvas.save();
                canvas.translate(rectF2.left, r.a(r.a(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), k6.Ol);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + dVar.g, 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + dVar.h, 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f7 = dVar.k;
                sb2.append(f7 == 0.0f ? MediaDataController.MAX_STYLE_RUNS_COUNT : Math.round((dVar.j / f7) * 1000.0f));
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, AndroidUtilities.dp(16.0f));
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
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
