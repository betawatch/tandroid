package jg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.o6;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.t5;
import org.telegram.ui.wo0;
import vh.n5;
import w7.b6;
import w7.w7;
import x7.ga;
import x7.m7;
import x7.o7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout implements us {
    public static final /* synthetic */ int r0 = 0;
    public volatile boolean D;
    public s2 E;
    public float F;
    public boolean G;
    public s2[] H;
    public volatile Bitmap I;
    public int J;
    public Bitmap K;
    public boolean L;
    public final TextView M;
    public ValueAnimator N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public h01 S;
    public int T;
    public int U;
    public boolean V;
    public t2 W;
    public int a;
    public final p6 a0;
    public final t5 b;
    public j2 b0;
    public final t5 c;
    public String c0;
    public final Paint d;
    public vh.m0 d0;
    public final Paint e;
    public final Matrix e0;
    public final Paint f;
    public float f0;
    public float g0;
    public final Paint h;
    public final d2 h0;
    public boolean i0;
    public final Matrix j0;
    public Path k0;
    public Path l0;
    public final RectF m0;
    public final PathMeasure n;
    public float n0;
    public float o0;
    public final ArrayList p0;
    public final Rect q0;
    public final Path r;
    public final Path s;
    public final Path w;
    public final Path x;
    public volatile boolean y;

    public v2(ContextThemeWrapper contextThemeWrapper, p6 p6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        gr grVar = gr.h;
        this.b = new t5(0.0f, (View) null, 0L, 420L, grVar);
        this.c = new t5(0.0f, (View) null, 0L, 420L, grVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.n = new PathMeasure();
        this.r = new Path();
        this.s = new Path();
        this.w = new Path();
        this.x = new Path();
        this.F = 2.0f;
        this.e0 = new Matrix();
        this.j0 = new Matrix();
        this.m0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Rect();
        this.a0 = p6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.i0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(zs.W1);
        TextView textView = new TextView(contextThemeWrapper);
        this.M = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, b6.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(20.0f)));
        float L = org.telegram.messenger.i0.L(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(L, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.i0.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        d2 d2Var = new d2(contextThemeWrapper);
        this.h0 = d2Var;
        d2Var.setAlpha(0.0f);
        d2Var.setTranslationX(-org.telegram.messenger.i0.L(18.0f));
        d2Var.b(0.33f, 10.0f);
        d2Var.setBrushWeight(this.F);
        d2Var.setValueOverride(new za.c(this, 26));
        d2Var.setTranslationX(-org.telegram.messenger.i0.L(18.0f));
        d2Var.setAlpha(0.0f);
        addView(d2Var, b6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(s2 s2Var, int i10, int i11) {
        Bitmap bitmap;
        r2 r2Var;
        boolean z10;
        float f7;
        int i12;
        Bitmap b10 = s2Var.b();
        Path path = s2Var.l;
        int width = b10.getWidth();
        int height = s2Var.b().getHeight();
        int i13 = 2;
        float max = Math.max(width, height) / (tz.o() == 2 ? 512.0f : 384.0f);
        if ((s2Var.c / 90) % 2 != 0) {
            width = s2Var.b().getHeight();
            height = s2Var.b().getWidth();
        }
        float f10 = width;
        float f11 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f10 / max), (int) (f11 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (s2Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(s2Var.c, s2Var.b().getWidth() / 2.0f, s2Var.d.getHeight() / 2.0f);
            if ((s2Var.c / 90) % 2 != 0) {
                float height2 = (s2Var.b().getHeight() - s2Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f10, rectF.height() / f11);
            canvas.drawBitmap(s2Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(s2Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f12 = i10;
        float f13 = i11;
        float min = Math.min(f12 / createBitmap.getWidth(), f13 / createBitmap.getHeight());
        r2 r2Var2 = null;
        r2 r2Var3 = null;
        int i14 = 0;
        while (i14 < height3) {
            int i15 = i13;
            int width2 = i14 / createBitmap.getWidth();
            int width3 = i14 - (createBitmap.getWidth() * width2);
            int i16 = iArr[i14];
            boolean z11 = i16 != 0;
            if (i16 == 0) {
                int i17 = i14 - 1;
                boolean z12 = i17 >= 0;
                f7 = f10;
                int i18 = i14 + 1;
                boolean z13 = i18 < height3;
                if (!z12 || iArr[i17] == 0) {
                    i12 = i18;
                } else {
                    i12 = i18;
                    r2Var3 = new r2(min, width3, width2);
                }
                if (r2Var2 == null && z13 && iArr[i12] != 0) {
                    r2Var2 = new r2(min, width3, width2);
                }
            } else {
                f7 = f10;
            }
            boolean z14 = width3 == createBitmap.getWidth() + (-1);
            boolean z15 = width3 == 0;
            if (z14) {
                r2 r2Var4 = z11 ? new r2(min, width3, width2) : r2Var3;
                if (r2Var2 != null) {
                    arrayList.add(r2Var2);
                }
                if (r2Var4 != null) {
                    arrayList2.add(r2Var4);
                }
                r2Var2 = null;
                r2Var3 = null;
            }
            if (z15 && z11) {
                r2Var2 = new r2(min, width3, width2);
            }
            i14++;
            i13 = i15;
            f10 = f7;
        }
        float f14 = f10;
        int i19 = i13;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i20 = 0;
        r2 r2Var5 = null;
        r2 r2Var6 = null;
        while (i20 < height3) {
            float f15 = f11;
            int height4 = i20 / createBitmap.getHeight();
            r2 r2Var7 = r2Var5;
            int height5 = i20 - (createBitmap.getHeight() * height4);
            boolean z16 = iArr[(createBitmap.getWidth() * height5) + height4] != 0;
            if (z16) {
                bitmap = createBitmap;
            } else {
                int width4 = (createBitmap.getWidth() * (height5 - 1)) + height4;
                bitmap = createBitmap;
                int width5 = (createBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z17 = width4 >= 0;
                boolean z18 = width5 < height3;
                if (z17 && iArr[width4] != 0) {
                    r2Var6 = new r2(min, height4, height5);
                }
                if (r2Var7 == null && z18 && iArr[width5] != 0) {
                    r2Var = new r2(min, height4, height5);
                    int i21 = height3;
                    z10 = height5 != bitmap.getHeight() + (-1);
                    boolean z19 = height5 != 0;
                    if (z10) {
                        if (z16) {
                            r2Var6 = new r2(min, height4, height5);
                        }
                        if (r2Var != null) {
                            arrayList3.add(r2Var);
                        }
                        if (r2Var6 != null) {
                            arrayList4.add(r2Var6);
                        }
                        r2Var = null;
                        r2Var6 = null;
                    }
                    r2Var5 = (z19 || !z16) ? r2Var : new r2(min, height4, height5);
                    i20++;
                    f11 = f15;
                    createBitmap = bitmap;
                    height3 = i21;
                }
            }
            r2Var = r2Var7;
            int i212 = height3;
            if (height5 != bitmap.getHeight() + (-1)) {
            }
            if (height5 != 0) {
            }
            if (z10) {
            }
            if (z19) {
            }
            i20++;
            f11 = f15;
            createBitmap = bitmap;
            height3 = i212;
        }
        float f16 = f11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Collections.reverse(arrayList2);
        Collections.reverse(arrayList3);
        linkedHashSet2.addAll(arrayList);
        linkedHashSet2.addAll(arrayList2);
        linkedHashSet.addAll(arrayList4);
        linkedHashSet.addAll(arrayList3);
        List k10 = k(new ArrayList(linkedHashSet));
        List k11 = k(new ArrayList(linkedHashSet2));
        Path path2 = new Path();
        int i22 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) k11;
            if (i22 >= arrayList5.size()) {
                break;
            }
            r2 r2Var8 = (r2) arrayList5.get(i22);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) r2Var8).x, ((Point) r2Var8).y);
            } else {
                path2.lineTo(((Point) r2Var8).x, ((Point) r2Var8).y);
            }
            i22 += 2;
        }
        Path path3 = new Path();
        int i23 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) k10;
            if (i23 >= arrayList6.size()) {
                break;
            }
            r2 r2Var9 = (r2) arrayList6.get(i23);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) r2Var9).x, ((Point) r2Var9).y);
            } else {
                path3.lineTo(((Point) r2Var9).x, ((Point) r2Var9).y);
            }
            i23 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f12 / f14, f13 / f16);
        float f17 = f14 * min2;
        s2Var.j = f17;
        float f18 = min2 * f16;
        s2Var.k = f18;
        path.offset((-f17) / 2.0f, (-f18) / 2.0f);
        Paint paint = s2Var.r;
        Paint paint2 = s2Var.q;
        Paint paint3 = s2Var.p;
        Paint paint4 = s2Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / org.telegram.messenger.i0.L(2.0f));
        s2Var.n = ceil;
        s2Var.o = new float[ceil * 2];
        float[] fArr = new float[i19];
        int i24 = 0;
        while (true) {
            int i25 = s2Var.n;
            if (i24 >= i25) {
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint3.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint3.setStrokeCap(cap);
                paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(10.0f)));
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(10.0f)));
                paint.setStyle(style);
                paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
                paint.setColor(-1);
                paint.setStrokeCap(cap);
                float L = org.telegram.messenger.i0.L(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(L, blur));
                paint4.setStyle(style);
                paint4.setColor(t6.r1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(org.telegram.messenger.i0.L(20.0f));
                paint4.setColor(t6.r1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.i0.L(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i24 / i25) * length) % length, fArr, null);
            float[] fArr2 = s2Var.o;
            int i26 = i24 * 2;
            fArr2[i26] = fArr[0];
            fArr2[i26 + 1] = fArr[1];
            i24++;
        }
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((r2) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            r2 r2Var = (r2) arrayList.get(i10 - 1);
            r2 r2Var2 = (r2) arrayList.get(i10);
            i10++;
            r2 r2Var3 = (r2) arrayList.get(i10);
            int i11 = ((Point) r2Var2).x;
            int i12 = ((Point) r2Var).x;
            int i13 = ((Point) r2Var3).y;
            int i14 = ((Point) r2Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) r2Var3).x - i12) * (((Point) r2Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(r2Var2);
            }
        }
        arrayList2.add((r2) i0.a.g(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final t2 t2Var = this.W;
        if (t2Var == null) {
            return;
        }
        final int i10 = d20.s0;
        final int i11 = 1;
        t2Var.o = true;
        if (t2Var.m != null) {
            h();
            t2Var.m.a(t2Var.b, t2Var.e.document);
            org.telegram.messenger.i0.h3(new ag.f3(6), 250L);
            return;
        }
        final int i12 = 0;
        if (t2Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = ui.a0(t2Var.k, t2Var.c).document;
            tL_stickers_replaceSticker.new_sticker = t2Var.e;
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: jg.l2
                public final /* synthetic */ v2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final v2 v2Var = this.b;
                            final int i14 = i10;
                            final t2 t2Var2 = t2Var;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var2 = v2Var;
                                            final t2 t2Var3 = t2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i15 = i14;
                                                z10 = true;
                                                ui.b0(i15).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i15).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i15).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                vh.m0 m0Var = v2Var2.d0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i16 = 1;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i17 = i16;
                                                        t2 t2Var4 = t2Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        v2 v2Var3 = v2Var2;
                                                        switch (i17) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var4.f.document;
                                                                String str = t2Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject3, document, str, bool);
                                                                v2Var3.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject3, t2Var4.f.document, t2Var4.l, Boolean.TRUE);
                                                                v2Var3.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var4.f.document;
                                                                String str2 = t2Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject3, document2, str2, bool2);
                                                                v2Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var2.n(tL_error);
                                                v2Var2.h();
                                                z10 = false;
                                            }
                                            q20 q20Var = t2Var3.n;
                                            if (q20Var != null) {
                                                q20Var.a(Boolean.valueOf(z10));
                                                t2Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var3 = v2Var;
                                            final t2 t2Var4 = t2Var2;
                                            if (z14) {
                                                int i17 = i14;
                                                z11 = true;
                                                ui.b0(i17).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i17).f2(null, tLObject3, 2, null, false, false);
                                                vh.m0 m0Var2 = v2Var3.d0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        t2 t2Var42 = t2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        v2 v2Var32 = v2Var3;
                                                        switch (i172) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var42.f.document;
                                                                String str = t2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var32.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var42.f.document, t2Var42.l, Boolean.TRUE);
                                                                v2Var32.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var42.f.document;
                                                                String str2 = t2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                v2Var3.n(tL_error);
                                                v2Var3.h();
                                                z11 = false;
                                            }
                                            q20 q20Var2 = t2Var4.n;
                                            if (q20Var2 != null) {
                                                q20Var2.a(Boolean.valueOf(z11));
                                                t2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var4 = v2Var;
                                            final t2 t2Var5 = t2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                z12 = true;
                                                ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                vh.m0 m0Var3 = v2Var4.d0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        t2 t2Var42 = t2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        v2 v2Var32 = v2Var4;
                                                        switch (i172) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var42.f.document;
                                                                String str = t2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var32.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var42.f.document, t2Var42.l, Boolean.TRUE);
                                                                v2Var32.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var42.f.document;
                                                                String str2 = t2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var4.n(tL_error);
                                                v2Var4.h();
                                                z12 = false;
                                            }
                                            q20 q20Var3 = t2Var5.n;
                                            if (q20Var3 != null) {
                                                q20Var3.a(Boolean.valueOf(z12));
                                                t2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final v2 v2Var2 = this.b;
                            final int i16 = i10;
                            final t2 t2Var3 = t2Var;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var22 = v2Var2;
                                            final t2 t2Var32 = t2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                z10 = true;
                                                ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                vh.m0 m0Var = v2Var22.d0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        t2 t2Var42 = t2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        v2 v2Var32 = v2Var22;
                                                        switch (i172) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var42.f.document;
                                                                String str = t2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var32.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var42.f.document, t2Var42.l, Boolean.TRUE);
                                                                v2Var32.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var42.f.document;
                                                                String str2 = t2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var22.n(tL_error);
                                                v2Var22.h();
                                                z10 = false;
                                            }
                                            q20 q20Var = t2Var32.n;
                                            if (q20Var != null) {
                                                q20Var.a(Boolean.valueOf(z10));
                                                t2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var3 = v2Var2;
                                            final t2 t2Var4 = t2Var3;
                                            if (z14) {
                                                int i17 = i16;
                                                z11 = true;
                                                ui.b0(i17).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i17).f2(null, tLObject3, 2, null, false, false);
                                                vh.m0 m0Var2 = v2Var3.d0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        t2 t2Var42 = t2Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        v2 v2Var32 = v2Var3;
                                                        switch (i172) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var42.f.document;
                                                                String str = t2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var32.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var42.f.document, t2Var42.l, Boolean.TRUE);
                                                                v2Var32.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var42.f.document;
                                                                String str2 = t2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                v2Var3.n(tL_error);
                                                v2Var3.h();
                                                z11 = false;
                                            }
                                            q20 q20Var2 = t2Var4.n;
                                            if (q20Var2 != null) {
                                                q20Var2.a(Boolean.valueOf(z11));
                                                t2Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var4 = v2Var2;
                                            final t2 t2Var5 = t2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                z12 = true;
                                                ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                vh.m0 m0Var3 = v2Var4.d0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        t2 t2Var42 = t2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        v2 v2Var32 = v2Var4;
                                                        switch (i172) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var42.f.document;
                                                                String str = t2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var32.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var42.f.document, t2Var42.l, Boolean.TRUE);
                                                                v2Var32.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var42.f.document;
                                                                String str2 = t2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var4.n(tL_error);
                                                v2Var4.h();
                                                z12 = false;
                                            }
                                            q20 q20Var3 = t2Var5.n;
                                            if (q20Var3 != null) {
                                                q20Var3.a(Boolean.valueOf(z12));
                                                t2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final v2 v2Var3 = this.b;
                            final int i18 = i10;
                            final t2 t2Var4 = t2Var;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var22 = v2Var3;
                                            final t2 t2Var32 = t2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                z10 = true;
                                                ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                vh.m0 m0Var = v2Var22.d0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        t2 t2Var42 = t2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        v2 v2Var32 = v2Var22;
                                                        switch (i172) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var42.f.document;
                                                                String str = t2Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var32.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var42.f.document, t2Var42.l, Boolean.TRUE);
                                                                v2Var32.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var42.f.document;
                                                                String str2 = t2Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var22.n(tL_error);
                                                v2Var22.h();
                                                z10 = false;
                                            }
                                            q20 q20Var = t2Var32.n;
                                            if (q20Var != null) {
                                                q20Var.a(Boolean.valueOf(z10));
                                                t2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var32 = v2Var3;
                                            final t2 t2Var42 = t2Var4;
                                            if (z14) {
                                                int i172 = i18;
                                                z11 = true;
                                                ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                vh.m0 m0Var2 = v2Var32.d0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        t2 t2Var422 = t2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        v2 v2Var322 = v2Var32;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                v2Var32.n(tL_error);
                                                v2Var32.h();
                                                z11 = false;
                                            }
                                            q20 q20Var2 = t2Var42.n;
                                            if (q20Var2 != null) {
                                                q20Var2.a(Boolean.valueOf(z11));
                                                t2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var4 = v2Var3;
                                            final t2 t2Var5 = t2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                z12 = true;
                                                ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                vh.m0 m0Var3 = v2Var4.d0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        t2 t2Var422 = t2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        v2 v2Var322 = v2Var4;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var4.n(tL_error);
                                                v2Var4.h();
                                                z12 = false;
                                            }
                                            q20 q20Var3 = t2Var5.n;
                                            if (q20Var3 != null) {
                                                q20Var3.a(Boolean.valueOf(z12));
                                                t2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (t2Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = t2Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(t2Var.e);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: jg.l2
                public final /* synthetic */ v2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i13 = 0;
                            final v2 v2Var = this.b;
                            final int i14 = i10;
                            final t2 t2Var2 = t2Var;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var22 = v2Var;
                                            final t2 t2Var32 = t2Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i14;
                                                z10 = true;
                                                ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                vh.m0 m0Var = v2Var22.d0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        t2 t2Var422 = t2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        v2 v2Var322 = v2Var22;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var22.n(tL_error);
                                                v2Var22.h();
                                                z10 = false;
                                            }
                                            q20 q20Var = t2Var32.n;
                                            if (q20Var != null) {
                                                q20Var.a(Boolean.valueOf(z10));
                                                t2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var32 = v2Var;
                                            final t2 t2Var42 = t2Var2;
                                            if (z14) {
                                                int i172 = i14;
                                                z11 = true;
                                                ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                vh.m0 m0Var2 = v2Var32.d0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        t2 t2Var422 = t2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        v2 v2Var322 = v2Var32;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                v2Var32.n(tL_error);
                                                v2Var32.h();
                                                z11 = false;
                                            }
                                            q20 q20Var2 = t2Var42.n;
                                            if (q20Var2 != null) {
                                                q20Var2.a(Boolean.valueOf(z11));
                                                t2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var4 = v2Var;
                                            final t2 t2Var5 = t2Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                z12 = true;
                                                ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                vh.m0 m0Var3 = v2Var4.d0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        t2 t2Var422 = t2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        v2 v2Var322 = v2Var4;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var4.n(tL_error);
                                                v2Var4.h();
                                                z12 = false;
                                            }
                                            q20 q20Var3 = t2Var5.n;
                                            if (q20Var3 != null) {
                                                q20Var3.a(Boolean.valueOf(z12));
                                                t2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final v2 v2Var2 = this.b;
                            final int i16 = i10;
                            final t2 t2Var3 = t2Var;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var22 = v2Var2;
                                            final t2 t2Var32 = t2Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                z10 = true;
                                                ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                vh.m0 m0Var = v2Var22.d0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        t2 t2Var422 = t2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        v2 v2Var322 = v2Var22;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var22.n(tL_error);
                                                v2Var22.h();
                                                z10 = false;
                                            }
                                            q20 q20Var = t2Var32.n;
                                            if (q20Var != null) {
                                                q20Var.a(Boolean.valueOf(z10));
                                                t2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var32 = v2Var2;
                                            final t2 t2Var42 = t2Var3;
                                            if (z14) {
                                                int i172 = i16;
                                                z11 = true;
                                                ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                vh.m0 m0Var2 = v2Var32.d0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        t2 t2Var422 = t2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        v2 v2Var322 = v2Var32;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                v2Var32.n(tL_error);
                                                v2Var32.h();
                                                z11 = false;
                                            }
                                            q20 q20Var2 = t2Var42.n;
                                            if (q20Var2 != null) {
                                                q20Var2.a(Boolean.valueOf(z11));
                                                t2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var4 = v2Var2;
                                            final t2 t2Var5 = t2Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                z12 = true;
                                                ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                vh.m0 m0Var3 = v2Var4.d0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        t2 t2Var422 = t2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        v2 v2Var322 = v2Var4;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var4.n(tL_error);
                                                v2Var4.h();
                                                z12 = false;
                                            }
                                            q20 q20Var3 = t2Var5.n;
                                            if (q20Var3 != null) {
                                                q20Var3.a(Boolean.valueOf(z12));
                                                t2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final v2 v2Var3 = this.b;
                            final int i18 = i10;
                            final t2 t2Var4 = t2Var;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var22 = v2Var3;
                                            final t2 t2Var32 = t2Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                z10 = true;
                                                ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                    ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                }
                                                vh.m0 m0Var = v2Var22.d0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        t2 t2Var422 = t2Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        v2 v2Var322 = v2Var22;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var22.n(tL_error);
                                                v2Var22.h();
                                                z10 = false;
                                            }
                                            q20 q20Var = t2Var32.n;
                                            if (q20Var != null) {
                                                q20Var.a(Boolean.valueOf(z10));
                                                t2Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var32 = v2Var3;
                                            final t2 t2Var42 = t2Var4;
                                            if (z14) {
                                                int i172 = i18;
                                                z11 = true;
                                                ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                vh.m0 m0Var2 = v2Var32.d0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        t2 t2Var422 = t2Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        v2 v2Var322 = v2Var32;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                            } else {
                                                v2Var32.n(tL_error);
                                                v2Var32.h();
                                                z11 = false;
                                            }
                                            q20 q20Var2 = t2Var42.n;
                                            if (q20Var2 != null) {
                                                q20Var2.a(Boolean.valueOf(z11));
                                                t2Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final v2 v2Var4 = v2Var3;
                                            final t2 t2Var5 = t2Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                z12 = true;
                                                ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                    ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                }
                                                vh.m0 m0Var3 = v2Var4.d0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        t2 t2Var422 = t2Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        v2 v2Var322 = v2Var4;
                                                        switch (i1722) {
                                                            case 0:
                                                                zs f7 = zs.f(d20.s0);
                                                                TLRPC.Document document = t2Var422.f.document;
                                                                String str = t2Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                v2Var322.h();
                                                                break;
                                                            case 1:
                                                                zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                v2Var322.h();
                                                                break;
                                                            default:
                                                                zs f10 = zs.f(d20.s0);
                                                                TLRPC.Document document2 = t2Var422.f.document;
                                                                String str2 = t2Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                v2Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                            } else {
                                                v2Var4.n(tL_error);
                                                v2Var4.h();
                                                z12 = false;
                                            }
                                            q20 q20Var3 = t2Var5.n;
                                            if (q20Var3 != null) {
                                                q20Var3.a(Boolean.valueOf(z12));
                                                t2Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (t2Var.h) {
            h();
            zs.f(i10).m(zs.s3, Boolean.FALSE);
            org.telegram.messenger.i0.h3(new gg.c(t2Var, 16), 350L);
            q20 q20Var = t2Var.n;
            if (q20Var != null) {
                q20Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        if (t2Var.i == 0) {
            if (t2Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ui.Z(t2Var.j);
                tL_stickers_addStickerToSet.sticker = t2Var.e;
                final int i13 = 2;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: jg.l2
                    public final /* synthetic */ v2 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i132 = 0;
                                final v2 v2Var = this.b;
                                final int i14 = i10;
                                final t2 t2Var2 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i132) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var;
                                                final t2 t2Var32 = t2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i14;
                                                    z10 = true;
                                                    ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                        ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var2 = t2Var32.n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z10));
                                                    t2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var;
                                                final t2 t2Var42 = t2Var2;
                                                if (z14) {
                                                    int i172 = i14;
                                                    z11 = true;
                                                    ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var22 = t2Var42.n;
                                                if (q20Var22 != null) {
                                                    q20Var22.a(Boolean.valueOf(z11));
                                                    t2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var;
                                                final t2 t2Var5 = t2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i14;
                                                    z12 = true;
                                                    ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i15 = 1;
                                final v2 v2Var2 = this.b;
                                final int i16 = i10;
                                final t2 t2Var3 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i15) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var2;
                                                final t2 t2Var32 = t2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i16;
                                                    z10 = true;
                                                    ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                        ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var2 = t2Var32.n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z10));
                                                    t2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var2;
                                                final t2 t2Var42 = t2Var3;
                                                if (z14) {
                                                    int i172 = i16;
                                                    z11 = true;
                                                    ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var22 = t2Var42.n;
                                                if (q20Var22 != null) {
                                                    q20Var22.a(Boolean.valueOf(z11));
                                                    t2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var2;
                                                final t2 t2Var5 = t2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i16;
                                                    z12 = true;
                                                    ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i17 = 2;
                                final v2 v2Var3 = this.b;
                                final int i18 = i10;
                                final t2 t2Var4 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: jg.m2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i17) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var3;
                                                final t2 t2Var32 = t2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i18;
                                                    z10 = true;
                                                    ui.b0(i152).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i152).B0(tL_messages_stickerSet.set.id, true)) {
                                                        ui.b0(i152).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var2 = t2Var32.n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z10));
                                                    t2Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var3;
                                                final t2 t2Var42 = t2Var4;
                                                if (z14) {
                                                    int i172 = i18;
                                                    z11 = true;
                                                    ui.b0(i172).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i172).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var22 = t2Var42.n;
                                                if (q20Var22 != null) {
                                                    q20Var22.a(Boolean.valueOf(z11));
                                                    t2Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var3;
                                                final t2 t2Var5 = t2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i18;
                                                    z12 = true;
                                                    ui.b0(i19).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i19).B0(tL_messages_stickerSet2.set.id, true)) {
                                                        ui.b0(i19).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.n2
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1722) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.s0);
                                                                    TLRPC.Document document = t2Var422.f.document;
                                                                    String str = t2Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(zs.s3, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    break;
                                                                case 1:
                                                                    zs.f(d20.s0).m(zs.s3, Boolean.FALSE, tLObject32, t2Var422.f.document, t2Var422.l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    break;
                                                                default:
                                                                    zs f10 = zs.f(d20.s0);
                                                                    TLRPC.Document document2 = t2Var422.f.document;
                                                                    String str2 = t2Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(zs.s3, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        qz.C(i10).v0(t2Var.f.document, null, t2Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        vh.m0 m0Var = this.d0;
        if (m0Var != null) {
            m0Var.setProgress(1.0f);
        }
        org.telegram.messenger.i0.h3(new ag.d3(this, i10, 8), 450L);
        q20 q20Var2 = t2Var.n;
        if (q20Var2 != null) {
            q20Var2.a(Boolean.TRUE);
            t2Var.n = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        this.I = null;
        if (this.H != null) {
            int i10 = 0;
            while (true) {
                s2[] s2VarArr = this.H;
                if (i10 >= s2VarArr.length) {
                    break;
                }
                s2 s2Var = s2VarArr[i10];
                if (s2Var != null) {
                    s2Var.l.reset();
                    Bitmap bitmap = s2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        s2Var.e = null;
                    }
                    Bitmap bitmap2 = s2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        s2Var.d = null;
                    }
                    Bitmap bitmap3 = s2Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        s2Var.g = null;
                    }
                    Bitmap bitmap4 = s2Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        s2Var.f = null;
                    }
                }
                i10++;
            }
            this.H = null;
        }
        this.D = false;
        this.y = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        t2 t2Var = this.W;
        if (t2Var != null) {
            if (!t2Var.o) {
                t2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(int i10, int i11, Bitmap bitmap, boolean z10) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap == null || bitmap.isRecycled() || sourceBitmap == null) {
            return null;
        }
        Paint paint = new Paint(3);
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(createBitmap);
        if (z10) {
            canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
            canvas.drawBitmap(bitmap, i10, i11, paint);
        } else {
            canvas.drawBitmap(bitmap, i10, i11, paint);
        }
        Utilities.stackBlurBitmap(createBitmap, 5);
        Bitmap createBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint(3);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        createBitmap.recycle();
        return createBitmap2;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t2 t2Var;
        if (i10 == zs.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            t2 t2Var2 = this.W;
            if (t2Var2 == null || !str.equalsIgnoreCase(t2Var2.b)) {
                return;
            }
            t2 t2Var3 = this.W;
            t2Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = t2Var3.g;
            if (t2Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = t2Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(d20.s0).sendRequest(tL_messages_uploadMedia, new ag.k0(3, this, t2Var3), 2);
            return;
        }
        if (i10 == zs.W1) {
            String str2 = (String) objArr[0];
            t2 t2Var4 = this.W;
            if (t2Var4 == null || !str2.equalsIgnoreCase(t2Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                t2 t2Var5 = this.W;
                t2Var5.u = Utilities.i(longValue / longValue2, 1.0f, t2Var5.u);
                vh.m0 m0Var = this.d0;
                if (m0Var != null) {
                    m0Var.setProgress(this.W.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == zs.V1) {
            String str3 = (String) objArr[0];
            t2 t2Var6 = this.W;
            if (t2Var6 == null || !str3.equalsIgnoreCase(t2Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i10 == zs.a2) {
            t2 t2Var7 = this.W;
            if (t2Var7 != null && objArr[0] == t2Var7.r) {
                b8.G(d20.s0).i0(false, 67108864, this.W.b, true);
                return;
            }
            return;
        }
        if (i10 != zs.b2) {
            if (i10 == zs.c2 && (t2Var = this.W) != null && objArr[0] == t2Var.r) {
                h();
                return;
            }
            return;
        }
        t2 t2Var8 = this.W;
        if (t2Var8 != null && objArr[0] == t2Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f7 = (Float) objArr[4];
            float floatValue = f7.floatValue();
            this.W.r.p0.Y = true;
            b8.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f7);
            t2 t2Var9 = this.W;
            t2Var9.t = Math.max(t2Var9.t, floatValue);
            vh.m0 m0Var2 = this.d0;
            if (m0Var2 != null) {
                m0Var2.setProgress(this.W.b());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.w, this.e);
        canvas.drawPath(this.x, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6.getAction() != 1) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        this.n0 = motionEvent.getX();
        float y3 = motionEvent.getY();
        this.o0 = y3;
        if (this.H != null && this.N != null) {
            s2 j10 = j(this.n0, y3);
            int i10 = 0;
            while (true) {
                s2[] s2VarArr = this.H;
                if (i10 >= s2VarArr.length) {
                    break;
                }
                if (s2VarArr[i10] == j10 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                z10 = false;
                if (z10 && !this.H[i10].b) {
                    org.telegram.messenger.i0.b4(this);
                }
                this.H[i10].b = z10;
                i10++;
            }
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        s2 s2Var = this.E;
        if (s2Var != null) {
            this.K = bitmap;
            if (s2Var.f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                s2 s2Var2 = this.E;
                if (s2Var2.c == 0) {
                    canvas.drawBitmap(s2Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                s2 s2Var3 = this.E;
                matrix.postRotate(s2Var3.c, s2Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                if ((this.E.c / 90) % 2 != 0) {
                    float height = (r4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                canvas.drawBitmap(this.E.a(), matrix, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(gr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        t5 t5Var = this.c;
        t5Var.a = viewGroup;
        boolean z12 = this.i0;
        if (z12 || t5Var.c > 0.0f) {
            float d = viewGroup == null ? 1.0f : t5Var.d(z12 && !z11);
            s2[] s2VarArr = this.H;
            if (s2VarArr != null) {
                for (s2 s2Var : s2VarArr) {
                    if (s2Var != null && s2Var == this.E) {
                        if (this.F > 0.0f) {
                            if (s2Var.t.k0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(s2Var.t.k0);
                            if (s2Var.t.I != null) {
                                Paint paint = z10 ? s2Var.q : s2Var.p;
                                paint.setAlpha((int) (d * 255.0f));
                                paint.setStrokeWidth(org.telegram.messenger.i0.L(r4));
                                canvas.drawPath(s2Var.l, paint);
                                if (s2Var.t.k0 != null && z10) {
                                    canvas.clipPath(s2Var.l);
                                    paint.setStrokeWidth(org.telegram.messenger.i0.L(r4 * 2.0f));
                                    canvas.drawPath(s2Var.t.k0, paint);
                                }
                            }
                            canvas.restore();
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.P;
    }

    public float getSegmentBorderImageWidth() {
        return this.O;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        s2 s2Var;
        if (!this.L || (s2Var = this.E) == null) {
            return null;
        }
        return s2Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public h01 getThanosEffect() {
        if (!h01.c()) {
            return null;
        }
        if (this.S == null) {
            h01 h01Var = new h01(getContext(), new k2(this, 1));
            this.S = h01Var;
            addView(h01Var, b6.c(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        vh.m0 m0Var = this.d0;
        if (m0Var != null) {
            m0Var.a();
            this.d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final s2 j(float f7, float f10) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            s2[] s2VarArr = this.H;
            if (i10 >= s2VarArr.length) {
                return null;
            }
            s2 s2Var = s2VarArr[i10];
            if (s2Var != null) {
                if ((s2Var.c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = org.telegram.messenger.i0.P;
                RectF rectF2 = this.H[i10].i;
                float f11 = width;
                float f12 = rectF2.left / f11;
                float f13 = this.f0;
                float f14 = height;
                float f15 = rectF2.top / f14;
                float f16 = this.g0;
                rectF.set(f12 * f13, f15 * f16, (rectF2.right / f11) * f13, (rectF2.bottom / f14) * f16);
                this.e0.mapRect(rectF);
                if (rectF.contains(f7, f10)) {
                    return s2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        s2[] s2VarArr = this.H;
        if (s2VarArr != null) {
            for (s2 s2Var : s2VarArr) {
                if (s2Var != null && (bitmap = s2Var.e) != null) {
                    bitmap.recycle();
                    s2Var.e = null;
                    Bitmap bitmap2 = s2Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        s2Var.g = null;
                    }
                    c(s2Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, wo0 wo0Var) {
        pb.c cVar;
        int i13 = i11 <= 0 ? org.telegram.messenger.i0.q.x : i11;
        int i14 = i12 <= 0 ? org.telegram.messenger.i0.q.y : i12;
        this.T = i13;
        this.U = i14;
        if (this.D || this.y || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.I = bitmap;
        this.J = i10;
        this.c0 = null;
        o2 o2Var = new o2(this, i10, wo0Var, 0);
        this.y = true;
        ea.b bVar = new ea.b();
        bVar.b = true;
        bVar.c = true;
        zzd a2 = w7.a(new tb.d(bVar));
        if (o6.h(getContext()).f()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.I;
            u2 u2Var = new u2();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            u2Var.e = min;
            u2Var.d = min;
            u2Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(u2Var.a).drawRect(0.0f, 0.0f, u2Var.d, u2Var.e, t6.Dm);
            u2Var.b = (bitmap2.getWidth() - u2Var.d) / 2;
            u2Var.c = (bitmap2.getHeight() - u2Var.e) / 2;
            arrayList.add(u2Var);
            o2Var.a(arrayList);
            return;
        }
        ob.a a10 = ob.a.a(bitmap, i10);
        a2.g(a10).addOnSuccessListener(new ig.c0(o2Var, 14)).addOnFailureListener(new q2(this, bitmap, i10, wo0Var, o2Var, 0));
        if (this.c0 == null) {
            rb.a aVar = rb.a.b;
            n6.l.h(aVar, "options cannot be null");
            synchronized (pb.c.class) {
                cVar = (pb.c) jb.g.c().a(pb.c.class);
            }
            qa.b bVar2 = (qa.b) cVar.a.get(rb.a.class);
            n6.l.g(bVar2);
            sb.c cVar2 = (sb.c) bVar2.get();
            cVar2.getClass();
            ga gaVar = cVar2.c;
            j2.f fVar = new j2.f();
            fVar.c = m7.b;
            jb.m.a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a(fVar, 1), o7.c, gaVar.b(), 7));
            new ImageLabelerImpl((jb.e) cVar2.a.R0(aVar), (Executor) cVar2.b.a.get(), new k6.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new ig.c0(this, 15)).addOnFailureListener(new j2.e(24));
        }
        ArrayList arrayList2 = ui.b0(this.a).n;
        for (int i15 = 0; i15 < Math.min(arrayList2.size(), 9); i15++) {
            k6.g(((TLRPC.TL_availableReaction) arrayList2.get(i15)).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new cc((FrameLayout) getParent(), this.a0).t(tL_error.text, null).j();
    }

    public final void o() {
        Path path = this.k0;
        if (path == null) {
            this.k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.l0 == null) {
            this.l0 = new Path();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.k0.addPath(this.l0, this.j0);
        this.k0.computeBounds(this.m0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.a).c(this, zs.U1);
        zs.f(this.a).c(this, zs.W1);
        zs.f(this.a).c(this, zs.V1);
        zs.f(this.a).c(this, zs.c2);
        zs.f(this.a).c(this, zs.a2);
        zs.f(this.a).c(this, zs.b2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        if (i10 >= 0) {
            zs.f(i10).n(this, zs.U1);
            zs.f(this.a).n(this, zs.W1);
            zs.f(this.a).n(this, zs.V1);
            zs.f(this.a).n(this, zs.c2);
            zs.f(this.a).n(this, zs.a2);
            zs.f(this.a).n(this, zs.b2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(10.0f);
        float f7 = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f7;
        float measuredHeight = getMeasuredHeight() - f7;
        float f10 = measuredWidth / 8.0f;
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = measuredWidth + L;
        rectF.set(L, L, f11, f11);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.p0;
            arrayList.clear();
            if (this.i0) {
                Rect rect = this.q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.i0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final x20 x20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final q20 q20Var, final j20 j20Var) {
        org.telegram.messenger.i0.h3(new Runnable() { // from class: jg.p2
            @Override // java.lang.Runnable
            public final void run() {
                t2 t2Var;
                v2 v2Var = v2.this;
                q20 q20Var2 = q20Var;
                int i10 = 0;
                boolean z11 = q20Var2 == null || (t2Var = v2Var.W) == null || !t2Var.o;
                if (z11) {
                    t2 t2Var2 = v2Var.W;
                    if (t2Var2 != null) {
                        t2Var2.a();
                    }
                    t2 t2Var3 = new t2();
                    t2Var3.p = new ArrayList();
                    t2Var3.q = new ArrayList();
                    t2Var3.t = 0.0f;
                    t2Var3.u = 0.0f;
                    v2Var.W = t2Var3;
                }
                t2 t2Var4 = v2Var.W;
                t2Var4.c = str2;
                String str4 = str;
                t2Var4.b = str4;
                t2Var4.a = str4;
                t2Var4.d = charSequence;
                t2Var4.h = z10;
                t2Var4.i = j10;
                t2Var4.j = stickerSet;
                t2Var4.k = document;
                x20 x20Var2 = x20Var;
                t2Var4.s = x20Var2;
                t2Var4.l = str3;
                t2Var4.n = q20Var2;
                t2Var4.m = j20Var;
                ArrayList arrayList = t2Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    t2Var4.p.add(new File(t2Var4.b));
                }
                if (!TextUtils.isEmpty(t2Var4.a) && !TextUtils.equals(t2Var4.a, t2Var4.b)) {
                    arrayList.add(new File(t2Var4.a));
                }
                if (!TextUtils.isEmpty(t2Var4.l)) {
                    arrayList.add(new File(t2Var4.l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        t2 t2Var5 = v2Var.W;
                        t2Var5.e = ui.a0(document3, t2Var5.c);
                        v2Var.W.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = v2Var.W.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        v2Var.a();
                    } else if (x20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        t2 t2Var6 = v2Var.W;
                        String absolutePath = n5.w(d20.s0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        t2Var6.b = absolutePath;
                        v2Var.W.r = new jj(d20.s0, tL_message, null, false, false);
                        v2Var.W.r.p0 = x20Var2;
                        MediaController.B().h0(v2Var.W.r, false, false, false);
                    } else {
                        b8.G(v2Var.a).i0(false, 67108864, str4, true);
                    }
                } else {
                    v2Var.a();
                }
                if (q20Var2 == null) {
                    if (v2Var.d0 == null) {
                        v2Var.d0 = new vh.m0(v2Var.getContext(), cd.L0(2131746934, null));
                    }
                    v2Var.d0.setOnCancelListener(new k2(v2Var, i10));
                    if (v2Var.d0.getParent() == null) {
                        v2Var.addView(v2Var.d0, b6.e(-1, -1, 17));
                    }
                    vh.m0 m0Var = v2Var.d0;
                    m0Var.E = true;
                    m0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.a;
        if (i11 != i10) {
            int i12 = zs.b2;
            int i13 = zs.a2;
            int i14 = zs.c2;
            int i15 = zs.V1;
            int i16 = zs.W1;
            int i17 = zs.U1;
            if (i11 >= 0 && isAttachedToWindow()) {
                zs.f(this.a).n(this, i17);
                zs.f(this.a).n(this, i16);
                zs.f(this.a).n(this, i15);
                zs.f(this.a).n(this, i14);
                zs.f(this.a).n(this, i13);
                zs.f(this.a).n(this, i12);
            }
            this.a = i10;
            if (i10 < 0 || !isAttachedToWindow()) {
                return;
            }
            zs.f(this.a).c(this, i17);
            zs.f(this.a).c(this, i16);
            zs.f(this.a).c(this, i15);
            zs.f(this.a).c(this, i14);
            zs.f(this.a).c(this, i13);
            zs.f(this.a).c(this, i12);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.i0 == z10) {
            return;
        }
        this.i0 = z10;
        this.h0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : org.telegram.messenger.i0.L(-18.0f)).setInterpolator(gr.h).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.p0;
            arrayList.clear();
            if (this.i0) {
                Rect rect = this.q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.i0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f7) {
        this.F = f7;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(j2 j2Var) {
        this.b0 = j2Var;
    }
}
