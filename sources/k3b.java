// default package

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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k3b extends FrameLayout implements fn7 {
    public volatile boolean E;
    public h3b F;
    public float G;
    public boolean H;
    public h3b[] I;
    public volatile Bitmap J;
    public int K;
    public Bitmap L;
    public boolean M;
    public final TextView N;
    public ValueAnimator O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public hnb T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public i3b a0;
    public final mm b;
    public final vnb b0;
    public final mm c;
    public v2b c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public eq3 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final gx7 i0;
    public boolean j0;
    public final Matrix k0;
    public Path l0;
    public Path m0;
    public final PathMeasure n;
    public final RectF n0;
    public float o0;
    public float p0;
    public final ArrayList q0;
    public final Path r;
    public final Rect r0;
    public final Path s;
    public final Path w;
    public final Path x;
    public volatile boolean y;

    public k3b(ContextThemeWrapper contextThemeWrapper, vnb vnbVar) {
        super(contextThemeWrapper);
        this.a = -1;
        k43 k43Var = k43.h;
        this.b = new mm(0.0f, (View) null, 0L, 420L, k43Var);
        this.c = new mm(0.0f, (View) null, 0L, 420L, k43Var);
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
        this.G = 2.0f;
        this.f0 = new Matrix();
        this.k0 = new Matrix();
        this.n0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Rect();
        this.b0 = vnbVar;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{hl.L(5.0f), hl.L(10.0f)}, 0.5f));
        paint.setShadowLayer(hl.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(jn7.V1);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, tre.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(hl.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(hl.L(20.0f)));
        float L = hl.L(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(L, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(hl.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(hl.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(hl.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        gx7 gx7Var = new gx7(contextThemeWrapper);
        this.i0 = gx7Var;
        gx7Var.setAlpha(0.0f);
        gx7Var.setTranslationX(-hl.L(18.0f));
        gx7Var.b(0.33f, 10.0f);
        gx7Var.setBrushWeight(this.G);
        gx7Var.setValueOverride(new pq8(this, (byte) 18));
        gx7Var.setTranslationX(-hl.L(18.0f));
        gx7Var.setAlpha(0.0f);
        addView(gx7Var, tre.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(h3b h3bVar, int i, int i2) {
        Bitmap bitmap;
        g3b g3bVar;
        boolean z;
        float f;
        int i3;
        Bitmap b = h3bVar.b();
        Path path = h3bVar.l;
        int width = b.getWidth();
        int height = h3bVar.b().getHeight();
        float max = Math.max(width, height) / (xea.o() == 2 ? 512.0f : 384.0f);
        if ((h3bVar.c / 90) % 2 != 0) {
            width = h3bVar.b().getHeight();
            height = h3bVar.b().getWidth();
        }
        float f2 = width;
        float f3 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f2 / max), (int) (f3 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (h3bVar.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(h3bVar.c, h3bVar.b().getWidth() / 2.0f, h3bVar.d.getHeight() / 2.0f);
            if ((h3bVar.c / 90) % 2 != 0) {
                float height2 = (h3bVar.b().getHeight() - h3bVar.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f2, rectF.height() / f3);
            canvas.drawBitmap(h3bVar.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(h3bVar.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f4 = i;
        float f5 = i2;
        float min = Math.min(f4 / createBitmap.getWidth(), f5 / createBitmap.getHeight());
        g3b g3bVar2 = null;
        g3b g3bVar3 = null;
        int i4 = 0;
        while (i4 < height3) {
            int width2 = i4 / createBitmap.getWidth();
            int width3 = i4 - (createBitmap.getWidth() * width2);
            int i5 = iArr[i4];
            boolean z2 = i5 != 0;
            if (i5 == 0) {
                int i6 = i4 - 1;
                boolean z3 = i6 >= 0;
                f = f2;
                int i7 = i4 + 1;
                boolean z4 = i7 < height3;
                if (!z3 || iArr[i6] == 0) {
                    i3 = i7;
                } else {
                    i3 = i7;
                    g3bVar3 = new g3b(min, width3, width2);
                }
                if (g3bVar2 == null && z4 && iArr[i3] != 0) {
                    g3bVar2 = new g3b(min, width3, width2);
                }
            } else {
                f = f2;
            }
            boolean z5 = width3 == createBitmap.getWidth() + (-1);
            boolean z6 = width3 == 0;
            if (z5) {
                g3b g3bVar4 = z2 ? new g3b(min, width3, width2) : g3bVar3;
                if (g3bVar2 != null) {
                    arrayList.add(g3bVar2);
                }
                if (g3bVar4 != null) {
                    arrayList2.add(g3bVar4);
                }
                g3bVar2 = null;
                g3bVar3 = null;
            }
            if (z6 && z2) {
                g3bVar2 = new g3b(min, width3, width2);
            }
            i4++;
            f2 = f;
        }
        float f6 = f2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i8 = 0;
        g3b g3bVar5 = null;
        g3b g3bVar6 = null;
        while (i8 < height3) {
            float f7 = f3;
            int height4 = i8 / createBitmap.getHeight();
            g3b g3bVar7 = g3bVar5;
            int height5 = i8 - (createBitmap.getHeight() * height4);
            boolean z7 = iArr[(createBitmap.getWidth() * height5) + height4] != 0;
            if (z7) {
                bitmap = createBitmap;
            } else {
                int width4 = (createBitmap.getWidth() * (height5 - 1)) + height4;
                bitmap = createBitmap;
                int width5 = (createBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z8 = width4 >= 0;
                boolean z9 = width5 < height3;
                if (z8 && iArr[width4] != 0) {
                    g3bVar6 = new g3b(min, height4, height5);
                }
                if (g3bVar7 == null && z9 && iArr[width5] != 0) {
                    g3bVar = new g3b(min, height4, height5);
                    int i9 = height3;
                    z = height5 != bitmap.getHeight() + (-1);
                    boolean z10 = height5 != 0;
                    if (z) {
                        if (z7) {
                            g3bVar6 = new g3b(min, height4, height5);
                        }
                        if (g3bVar != null) {
                            arrayList3.add(g3bVar);
                        }
                        if (g3bVar6 != null) {
                            arrayList4.add(g3bVar6);
                        }
                        g3bVar = null;
                        g3bVar6 = null;
                    }
                    g3bVar5 = (z10 || !z7) ? g3bVar : new g3b(min, height4, height5);
                    i8++;
                    f3 = f7;
                    createBitmap = bitmap;
                    height3 = i9;
                }
            }
            g3bVar = g3bVar7;
            int i92 = height3;
            if (height5 != bitmap.getHeight() + (-1)) {
            }
            if (height5 != 0) {
            }
            if (z) {
            }
            if (z10) {
            }
            i8++;
            f3 = f7;
            createBitmap = bitmap;
            height3 = i92;
        }
        float f8 = f3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Collections.reverse(arrayList2);
        Collections.reverse(arrayList3);
        linkedHashSet2.addAll(arrayList);
        linkedHashSet2.addAll(arrayList2);
        linkedHashSet.addAll(arrayList4);
        linkedHashSet.addAll(arrayList3);
        List j = j(new ArrayList(linkedHashSet));
        List j2 = j(new ArrayList(linkedHashSet2));
        Path path2 = new Path();
        int i10 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) j2;
            if (i10 >= arrayList5.size()) {
                break;
            }
            g3b g3bVar8 = (g3b) arrayList5.get(i10);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) g3bVar8).x, ((Point) g3bVar8).y);
            } else {
                path2.lineTo(((Point) g3bVar8).x, ((Point) g3bVar8).y);
            }
            i10 += 2;
        }
        Path path3 = new Path();
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) j;
            if (i11 >= arrayList6.size()) {
                break;
            }
            g3b g3bVar9 = (g3b) arrayList6.get(i11);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) g3bVar9).x, ((Point) g3bVar9).y);
            } else {
                path3.lineTo(((Point) g3bVar9).x, ((Point) g3bVar9).y);
            }
            i11 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f4 / f6, f5 / f8);
        float f9 = f6 * min2;
        h3bVar.j = f9;
        float f10 = min2 * f8;
        h3bVar.k = f10;
        path.offset((-f9) / 2.0f, (-f10) / 2.0f);
        Paint paint = h3bVar.r;
        Paint paint2 = h3bVar.q;
        Paint paint3 = h3bVar.p;
        Paint paint4 = h3bVar.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / hl.L(2.0f));
        h3bVar.n = ceil;
        h3bVar.o = new float[ceil << 1];
        float[] fArr = new float[2];
        int i12 = 0;
        while (true) {
            int i13 = h3bVar.n;
            if (i12 >= i13) {
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint3.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint3.setStrokeCap(cap);
                paint3.setPathEffect(new CornerPathEffect(hl.L(10.0f)));
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(hl.L(10.0f)));
                paint.setStyle(style);
                paint.setStrokeWidth(hl.L(4.0f));
                paint.setColor(-1);
                paint.setStrokeCap(cap);
                float L = hl.L(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(L, blur));
                paint4.setStyle(style);
                paint4.setColor(aob.p1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(hl.L(20.0f));
                paint4.setColor(aob.p1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(hl.L(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i12 / i13) * length) % length, fArr, null);
            float[] fArr2 = h3bVar.o;
            int i14 = i12 << 1;
            fArr2[i14] = fArr[0];
            fArr2[i14 + 1] = fArr[1];
            i12++;
        }
    }

    public static List j(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((g3b) arrayList.get(0));
        int i = 1;
        while (i < arrayList.size() - 1) {
            g3b g3bVar = (g3b) arrayList.get(i - 1);
            g3b g3bVar2 = (g3b) arrayList.get(i);
            i++;
            g3b g3bVar3 = (g3b) arrayList.get(i);
            int i2 = ((Point) g3bVar2).x;
            int i3 = ((Point) g3bVar).x;
            int i4 = ((Point) g3bVar3).y;
            int i5 = ((Point) g3bVar).y;
            if (Math.abs((((i4 - i5) * (i2 - i3)) - ((((Point) g3bVar3).x - i3) * (((Point) g3bVar2).y - i5))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(g3bVar2);
            }
        }
        arrayList2.add((g3b) c00.g(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final i3b i3bVar = this.a0;
        if (i3bVar != null) {
            final int i = yac.t0;
            final byte b = 1;
            i3bVar.o = true;
            if (i3bVar.m != null) {
                h();
                i3bVar.m.a(i3bVar.b, i3bVar.e.document);
                hl.d3(new osa((byte) 3), 250L);
                return;
            }
            final byte b2 = 0;
            if (i3bVar.k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = ls6.c0(i3bVar.k, i3bVar.c).document;
                tL_stickers_replaceSticker.new_sticker = i3bVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: c3b
                    public final /* synthetic */ k3b b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b2) {
                            case 0:
                                final byte b3 = 0;
                                final k3b k3bVar = this.b;
                                final int i2 = i;
                                final i3b i3bVar2 = i3bVar;
                                hl.c3(new Runnable() { // from class: d3b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b3;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar3 = i3bVar2;
                                        int i3 = i2;
                                        final k3b k3bVar2 = k3bVar;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        final byte b5 = 1;
                                        switch (b4) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i3).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i3).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar2.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b6 = b5;
                                                            i3b i3bVar4 = i3bVar3;
                                                            TLObject tLObject3 = tLObject2;
                                                            k3b k3bVar3 = k3bVar2;
                                                            switch (b6) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject3, document, str, bool);
                                                                    k3bVar3.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject3, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject3, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar2.m(tL_error2);
                                                    k3bVar2.h();
                                                }
                                                rx1 rx1Var = i3bVar3.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar3.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i3).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i3).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar2.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    final byte b6 = z ? (byte) 1 : (byte) 0;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b6;
                                                            i3b i3bVar4 = i3bVar3;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar3 = k3bVar2;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z3 = true;
                                                } else {
                                                    k3bVar2.m(tL_error2);
                                                    k3bVar2.h();
                                                }
                                                rx1 rx1Var2 = i3bVar3.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z3));
                                                    i3bVar3.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i3).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i3).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i3).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar2.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    final byte b7 = 2;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b7;
                                                            i3b i3bVar4 = i3bVar3;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar3 = k3bVar2;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z2 = true;
                                                } else {
                                                    k3bVar2.m(tL_error2);
                                                    k3bVar2.h();
                                                }
                                                rx1 rx1Var3 = i3bVar3.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z2));
                                                    i3bVar3.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final byte b4 = 1;
                                final k3b k3bVar2 = this.b;
                                final int i3 = i;
                                final i3b i3bVar3 = i3bVar;
                                hl.c3(new Runnable() { // from class: d3b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar3;
                                        int i32 = i3;
                                        final k3b k3bVar22 = k3bVar2;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        final byte b5 = 1;
                                        switch (b42) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b5;
                                                            i3b i3bVar4 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar3 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    final byte b6 = z ? (byte) 1 : (byte) 0;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b6;
                                                            i3b i3bVar4 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar3 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z3 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z3));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    final byte b7 = 2;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b7;
                                                            i3b i3bVar4 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar3 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z2 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z2));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b5 = 2;
                                final k3b k3bVar3 = this.b;
                                final int i4 = i;
                                final i3b i3bVar4 = i3bVar;
                                hl.c3(new Runnable() { // from class: d3b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b5;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar4;
                                        int i32 = i4;
                                        final k3b k3bVar22 = k3bVar3;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        final byte b52 = 1;
                                        switch (b42) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b52;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    final byte b6 = z ? (byte) 1 : (byte) 0;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b6;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z3 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z3));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    final byte b7 = 2;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b7;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z2 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z2));
                                                    i3bVar32.n = null;
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
            if (i3bVar.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = i3bVar.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(i3bVar.e);
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: c3b
                    public final /* synthetic */ k3b b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (b) {
                            case 0:
                                final byte b3 = 0;
                                final k3b k3bVar = this.b;
                                final int i2 = i;
                                final i3b i3bVar2 = i3bVar;
                                hl.c3(new Runnable() { // from class: d3b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b3;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar2;
                                        int i32 = i2;
                                        final k3b k3bVar22 = k3bVar;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        final byte b52 = 1;
                                        switch (b42) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b52;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    final byte b6 = z ? (byte) 1 : (byte) 0;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b6;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z3 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z3));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    final byte b7 = 2;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b7;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z2 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z2));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final byte b4 = 1;
                                final k3b k3bVar2 = this.b;
                                final int i3 = i;
                                final i3b i3bVar3 = i3bVar;
                                hl.c3(new Runnable() { // from class: d3b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b4;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar3;
                                        int i32 = i3;
                                        final k3b k3bVar22 = k3bVar2;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        final byte b52 = 1;
                                        switch (b42) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b52;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    final byte b6 = z ? (byte) 1 : (byte) 0;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b6;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z3 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z3));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    final byte b7 = 2;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b7;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z2 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z2));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final byte b5 = 2;
                                final k3b k3bVar3 = this.b;
                                final int i4 = i;
                                final i3b i3bVar4 = i3bVar;
                                hl.c3(new Runnable() { // from class: d3b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b42 = b5;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar4;
                                        int i32 = i4;
                                        final k3b k3bVar22 = k3bVar3;
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        final byte b52 = 1;
                                        switch (b42) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b52;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    final byte b6 = z ? (byte) 1 : (byte) 0;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b6;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z3 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z3));
                                                    i3bVar32.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    final byte b7 = 2;
                                                    hl.d3(new Runnable() { // from class: e3b
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            byte b62 = b7;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b62) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    break;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    break;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z2 = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z2));
                                                    i3bVar32.n = null;
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
            byte b3 = 19;
            if (i3bVar.h) {
                h();
                jn7.f(i).m(jn7.u3, Boolean.FALSE);
                hl.d3(new uoa(i3bVar, b3), 350L);
                rx1 rx1Var = i3bVar.n;
                if (rx1Var != null) {
                    rx1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            }
            if (i3bVar.i == 0) {
                if (i3bVar.j != null) {
                    TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                    tL_stickers_addStickerToSet.stickerset = ls6.b0(i3bVar.j);
                    tL_stickers_addStickerToSet.sticker = i3bVar.e;
                    final byte b4 = 2;
                    ConnectionsManager.getInstance(i).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: c3b
                        public final /* synthetic */ k3b b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (b4) {
                                case 0:
                                    final byte b32 = 0;
                                    final k3b k3bVar = this.b;
                                    final int i2 = i;
                                    final i3b i3bVar2 = i3bVar;
                                    hl.c3(new Runnable() { // from class: d3b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b42 = b32;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            final i3b i3bVar32 = i3bVar2;
                                            int i32 = i2;
                                            final k3b k3bVar22 = k3bVar;
                                            boolean z = false;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            final byte b52 = 1;
                                            switch (b42) {
                                                case 0:
                                                    final TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                        ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                        if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                            ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                        }
                                                        eq3 eq3Var = k3bVar22.e0;
                                                        if (eq3Var != null) {
                                                            eq3Var.setProgress(1.0f);
                                                        }
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b52;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject2;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 450L);
                                                        z = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var2 = i3bVar32.n;
                                                    if (rx1Var2 != null) {
                                                        rx1Var2.a(Boolean.valueOf(z));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    final TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                        ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                        ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                        eq3 eq3Var2 = k3bVar22.e0;
                                                        if (eq3Var2 != null) {
                                                            eq3Var2.setProgress(1.0f);
                                                        }
                                                        final byte b6 = z ? (byte) 1 : (byte) 0;
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b6;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject3;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 250L);
                                                        z3 = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var22 = i3bVar32.n;
                                                    if (rx1Var22 != null) {
                                                        rx1Var22.a(Boolean.valueOf(z3));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    final TLObject tLObject4 = tLObject;
                                                    if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                        ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                        if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                            ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                        }
                                                        eq3 eq3Var3 = k3bVar22.e0;
                                                        if (eq3Var3 != null) {
                                                            eq3Var3.setProgress(1.0f);
                                                        }
                                                        final byte b7 = 2;
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b7;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject4;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 450L);
                                                        z2 = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var3 = i3bVar32.n;
                                                    if (rx1Var3 != null) {
                                                        rx1Var3.a(Boolean.valueOf(z2));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                case 1:
                                    final byte b42 = 1;
                                    final k3b k3bVar2 = this.b;
                                    final int i3 = i;
                                    final i3b i3bVar3 = i3bVar;
                                    hl.c3(new Runnable() { // from class: d3b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b422 = b42;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            final i3b i3bVar32 = i3bVar3;
                                            int i32 = i3;
                                            final k3b k3bVar22 = k3bVar2;
                                            boolean z = false;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            final byte b52 = 1;
                                            switch (b422) {
                                                case 0:
                                                    final TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                        ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                        if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                            ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                        }
                                                        eq3 eq3Var = k3bVar22.e0;
                                                        if (eq3Var != null) {
                                                            eq3Var.setProgress(1.0f);
                                                        }
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b52;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject2;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 450L);
                                                        z = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var2 = i3bVar32.n;
                                                    if (rx1Var2 != null) {
                                                        rx1Var2.a(Boolean.valueOf(z));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    final TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                        ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                        ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                        eq3 eq3Var2 = k3bVar22.e0;
                                                        if (eq3Var2 != null) {
                                                            eq3Var2.setProgress(1.0f);
                                                        }
                                                        final byte b6 = z ? (byte) 1 : (byte) 0;
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b6;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject3;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 250L);
                                                        z3 = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var22 = i3bVar32.n;
                                                    if (rx1Var22 != null) {
                                                        rx1Var22.a(Boolean.valueOf(z3));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    final TLObject tLObject4 = tLObject;
                                                    if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                        ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                        if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                            ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                        }
                                                        eq3 eq3Var3 = k3bVar22.e0;
                                                        if (eq3Var3 != null) {
                                                            eq3Var3.setProgress(1.0f);
                                                        }
                                                        final byte b7 = 2;
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b7;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject4;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 450L);
                                                        z2 = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var3 = i3bVar32.n;
                                                    if (rx1Var3 != null) {
                                                        rx1Var3.a(Boolean.valueOf(z2));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final byte b5 = 2;
                                    final k3b k3bVar3 = this.b;
                                    final int i4 = i;
                                    final i3b i3bVar4 = i3bVar;
                                    hl.c3(new Runnable() { // from class: d3b
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b422 = b5;
                                            TLRPC.TL_error tL_error2 = tL_error;
                                            final i3b i3bVar32 = i3bVar4;
                                            int i32 = i4;
                                            final k3b k3bVar22 = k3bVar3;
                                            boolean z = false;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            final byte b52 = 1;
                                            switch (b422) {
                                                case 0:
                                                    final TLObject tLObject2 = tLObject;
                                                    if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                        ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                        if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                            ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                        }
                                                        eq3 eq3Var = k3bVar22.e0;
                                                        if (eq3Var != null) {
                                                            eq3Var.setProgress(1.0f);
                                                        }
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b52;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject2;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 450L);
                                                        z = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var2 = i3bVar32.n;
                                                    if (rx1Var2 != null) {
                                                        rx1Var2.a(Boolean.valueOf(z));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    final TLObject tLObject3 = tLObject;
                                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                        ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                        ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                        eq3 eq3Var2 = k3bVar22.e0;
                                                        if (eq3Var2 != null) {
                                                            eq3Var2.setProgress(1.0f);
                                                        }
                                                        final byte b6 = z ? (byte) 1 : (byte) 0;
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b6;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject3;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 250L);
                                                        z3 = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var22 = i3bVar32.n;
                                                    if (rx1Var22 != null) {
                                                        rx1Var22.a(Boolean.valueOf(z3));
                                                        i3bVar32.n = null;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    final TLObject tLObject4 = tLObject;
                                                    if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                        ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                        if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                            ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                        }
                                                        eq3 eq3Var3 = k3bVar22.e0;
                                                        if (eq3Var3 != null) {
                                                            eq3Var3.setProgress(1.0f);
                                                        }
                                                        final byte b7 = 2;
                                                        hl.d3(new Runnable() { // from class: e3b
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                byte b62 = b7;
                                                                i3b i3bVar42 = i3bVar32;
                                                                TLObject tLObject32 = tLObject4;
                                                                k3b k3bVar32 = k3bVar22;
                                                                switch (b62) {
                                                                    case 0:
                                                                        jn7 f = jn7.f(yac.t0);
                                                                        TLRPC.Document document = i3bVar42.f.document;
                                                                        String str = i3bVar42.l;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        f.m(jn7.u3, bool, tLObject32, document, str, bool);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    case 1:
                                                                        jn7.f(yac.t0).m(jn7.u3, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                        k3bVar32.h();
                                                                        break;
                                                                    default:
                                                                        jn7 f2 = jn7.f(yac.t0);
                                                                        TLRPC.Document document2 = i3bVar42.f.document;
                                                                        String str2 = i3bVar42.l;
                                                                        Boolean bool2 = Boolean.FALSE;
                                                                        f2.m(jn7.u3, bool2, tLObject32, document2, str2, bool2);
                                                                        k3bVar32.h();
                                                                        break;
                                                                }
                                                            }
                                                        }, 450L);
                                                        z2 = true;
                                                    } else {
                                                        k3bVar22.m(tL_error2);
                                                        k3bVar22.h();
                                                    }
                                                    rx1 rx1Var3 = i3bVar32.n;
                                                    if (rx1Var3 != null) {
                                                        rx1Var3.a(Boolean.valueOf(z2));
                                                        i3bVar32.n = null;
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
            r7a.B(i).t0(i3bVar.f.document, null, i3bVar.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
            eq3 eq3Var = this.e0;
            if (eq3Var != null) {
                eq3Var.setProgress(1.0f);
            }
            hl.d3(new me7(this, i, b3), 450L);
            rx1 rx1Var2 = i3bVar.n;
            if (rx1Var2 != null) {
                rx1Var2.a(Boolean.TRUE);
                i3bVar.n = null;
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        this.J = null;
        if (this.I != null) {
            int i = 0;
            while (true) {
                h3b[] h3bVarArr = this.I;
                if (i >= h3bVarArr.length) {
                    break;
                }
                h3b h3bVar = h3bVarArr[i];
                if (h3bVar != null) {
                    h3bVar.l.reset();
                    Bitmap bitmap = h3bVar.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        h3bVar.e = null;
                    }
                    Bitmap bitmap2 = h3bVar.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        h3bVar.d = null;
                    }
                    Bitmap bitmap3 = h3bVar.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        h3bVar.g = null;
                    }
                    Bitmap bitmap4 = h3bVar.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        h3bVar.f = null;
                    }
                }
                i++;
            }
            this.I = null;
        }
        this.E = false;
        this.y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        i3b i3bVar = this.a0;
        if (i3bVar != null) {
            if (!i3bVar.o) {
                i3bVar.a();
            }
            this.a0 = null;
        }
        h();
        this.W = false;
    }

    public final Bitmap d(int i, int i2, Bitmap bitmap, boolean z) {
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
        if (z) {
            canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
            canvas.drawBitmap(bitmap, i, i2, paint);
        } else {
            canvas.drawBitmap(bitmap, i, i2, paint);
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

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        i3b i3bVar;
        if (i == jn7.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            i3b i3bVar2 = this.a0;
            if (i3bVar2 == null || !str.equalsIgnoreCase(i3bVar2.b)) {
                return;
            }
            i3b i3bVar3 = this.a0;
            i3bVar3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = i3bVar3.g;
            if (i3bVar3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = i3bVar3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(yac.t0).sendRequest(tL_messages_uploadMedia, new isa(this, i3bVar3, (byte) 5), 2);
            return;
        }
        if (i == jn7.W1) {
            String str2 = (String) objArr[0];
            i3b i3bVar4 = this.a0;
            if (i3bVar4 == null || !str2.equalsIgnoreCase(i3bVar4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                i3b i3bVar5 = this.a0;
                i3bVar5.u = Utilities.i(longValue / longValue2, 1.0f, i3bVar5.u);
                eq3 eq3Var = this.e0;
                if (eq3Var != null) {
                    eq3Var.setProgress(this.a0.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.V1) {
            String str3 = (String) objArr[0];
            i3b i3bVar6 = this.a0;
            if (i3bVar6 == null || !str3.equalsIgnoreCase(i3bVar6.b)) {
                return;
            }
            h();
            return;
        }
        if (i == jn7.a2) {
            i3b i3bVar7 = this.a0;
            if (i3bVar7 == null || objArr[0] != i3bVar7.r) {
                return;
            }
            xb4.G(yac.t0).h0(false, 67108864, this.a0.b, true);
            return;
        }
        if (i != jn7.b2) {
            if (i == jn7.c2 && (i3bVar = this.a0) != null && objArr[0] == i3bVar.r) {
                h();
                return;
            }
            return;
        }
        i3b i3bVar8 = this.a0;
        if (i3bVar8 == null || objArr[0] != i3bVar8.r) {
            return;
        }
        String str4 = (String) objArr[1];
        long longValue3 = ((Long) objArr[2]).longValue();
        long longValue4 = ((Long) objArr[3]).longValue();
        Float f = (Float) objArr[4];
        float floatValue = f.floatValue();
        this.a0.r.r0.X = true;
        xb4.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f);
        i3b i3bVar9 = this.a0;
        i3bVar9.t = Math.max(i3bVar9.t, floatValue);
        eq3 eq3Var2 = this.e0;
        if (eq3Var2 != null) {
            eq3Var2.setProgress(this.a0.b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.w, this.e);
        canvas.drawPath(this.x, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6.getAction() == 1) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.o0 = motionEvent.getX();
        float y = motionEvent.getY();
        this.p0 = y;
        if (this.I != null && this.O != null) {
            h3b i = i(this.o0, y);
            int i2 = 0;
            while (true) {
                h3b[] h3bVarArr = this.I;
                if (i2 >= h3bVarArr.length) {
                    break;
                }
                if (h3bVarArr[i2] == i && motionEvent.getAction() != 3) {
                    z = true;
                }
                z = false;
                if (z && !this.I[i2].b) {
                    hl.W3(this);
                }
                this.I[i2].b = z;
                i2++;
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
        h3b h3bVar = this.F;
        if (h3bVar != null) {
            this.L = bitmap;
            if (h3bVar.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                h3b h3bVar2 = this.F;
                if (h3bVar2.c == 0) {
                    canvas.drawBitmap(h3bVar2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                h3b h3bVar3 = this.F;
                matrix.postRotate(h3bVar3.c, h3bVar3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                if ((this.F.c / 90) % 2 != 0) {
                    float height = (r4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                canvas.drawBitmap(this.F.a(), matrix, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(k43.h).start();
    }

    public final void g(Canvas canvas, boolean z, ViewGroup viewGroup, boolean z2) {
        mm mmVar = this.c;
        mmVar.a = viewGroup;
        boolean z3 = this.j0;
        if (z3 || mmVar.c > 0.0f) {
            float d = viewGroup == null ? 1.0f : mmVar.d(z3 && !z2);
            h3b[] h3bVarArr = this.I;
            if (h3bVarArr != null) {
                for (h3b h3bVar : h3bVarArr) {
                    if (h3bVar != null && h3bVar == this.F) {
                        if (this.G > 0.0f) {
                            if (h3bVar.t.l0 != null) {
                                canvas.save();
                                canvas.clipPath(h3bVar.t.l0);
                                if (h3bVar.t.J != null) {
                                    Paint paint = z ? h3bVar.q : h3bVar.p;
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(hl.L(r4));
                                    canvas.drawPath(h3bVar.l, paint);
                                    if (h3bVar.t.l0 != null && z) {
                                        canvas.clipPath(h3bVar.l);
                                        paint.setStrokeWidth(hl.L(r4 * 2.0f));
                                        canvas.drawPath(h3bVar.t.l0, paint);
                                    }
                                }
                                canvas.restore();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.Q;
    }

    public float getSegmentBorderImageWidth() {
        return this.P;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        h3b h3bVar;
        if (!this.M || (h3bVar = this.F) == null) {
            return null;
        }
        return h3bVar.a();
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public hnb getThanosEffect() {
        if (!hnb.c()) {
            return null;
        }
        if (this.T == null) {
            hnb hnbVar = new hnb(getContext(), new b3b(this, (byte) 0));
            this.T = hnbVar;
            addView(hnbVar, tre.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        eq3 eq3Var = this.e0;
        if (eq3Var != null) {
            eq3Var.a();
            this.e0 = null;
        }
    }

    public final h3b i(float f, float f2) {
        int width;
        int height;
        if (this.J == null) {
            return null;
        }
        int i = 0;
        while (true) {
            h3b[] h3bVarArr = this.I;
            if (i >= h3bVarArr.length) {
                return null;
            }
            h3b h3bVar = h3bVarArr[i];
            if (h3bVar != null) {
                int i2 = (h3bVar.c / 90) % 2;
                Bitmap bitmap = this.J;
                if (i2 != 0) {
                    width = bitmap.getHeight();
                    height = this.J.getWidth();
                } else {
                    width = bitmap.getWidth();
                    height = this.J.getHeight();
                }
                RectF rectF = hl.P;
                RectF rectF2 = this.I[i].i;
                float f3 = width;
                float f4 = rectF2.left / f3;
                float f5 = this.g0;
                float f6 = height;
                float f7 = rectF2.top / f6;
                float f8 = this.h0;
                rectF.set(f4 * f5, f7 * f8, (rectF2.right / f3) * f5, (rectF2.bottom / f6) * f8);
                this.f0.mapRect(rectF);
                if (rectF.contains(f, f2)) {
                    return h3bVar;
                }
            }
            i++;
        }
    }

    public final void k() {
        Bitmap bitmap;
        h3b[] h3bVarArr = this.I;
        if (h3bVarArr != null) {
            for (h3b h3bVar : h3bVarArr) {
                if (h3bVar != null && (bitmap = h3bVar.e) != null) {
                    bitmap.recycle();
                    h3bVar.e = null;
                    Bitmap bitmap2 = h3bVar.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        h3bVar.g = null;
                    }
                    c(h3bVar, this.U, this.V);
                }
            }
        }
    }

    public final void l(Bitmap bitmap, int i, int i2, int i3, ea8 ea8Var) {
        ri7 ri7Var;
        int i4 = i2 <= 0 ? hl.q.x : i2;
        int i5 = i3 <= 0 ? hl.q.y : i3;
        this.U = i4;
        this.V = i5;
        if (this.E || this.y || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.J = bitmap;
        this.K = i;
        this.d0 = null;
        i61 i61Var = new i61((Object) this, i, (Object) ea8Var, (byte) 5);
        this.y = true;
        k00 k00Var = new k00();
        k00Var.b = true;
        k00Var.c = true;
        bsd a = mze.a(new deb(k00Var));
        if (c34.m(getContext()).h()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.J;
            j3b j3bVar = new j3b();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            j3bVar.e = min;
            j3bVar.d = min;
            j3bVar.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(j3bVar.a).drawRect(0.0f, 0.0f, j3bVar.d, j3bVar.e, aob.Hm);
            j3bVar.b = (bitmap2.getWidth() - j3bVar.d) / 2;
            j3bVar.c = (bitmap2.getHeight() - j3bVar.e) / 2;
            arrayList.add(j3bVar);
            i61Var.a(arrayList);
            return;
        }
        jq5 a2 = jq5.a(i, bitmap);
        a.c(a2).addOnSuccessListener(new hja(i61Var, (byte) 12)).addOnFailureListener(new eg(this, bitmap, i, ea8Var, i61Var));
        if (this.d0 == null) {
            lm5 lm5Var = lm5.b;
            xve.i(lm5Var, "options cannot be null");
            synchronized (ri7.class) {
                ri7Var = (ri7) jg7.c().a(ri7.class);
            }
            vw8 vw8Var = (vw8) ri7Var.a.get(lm5.class);
            xve.h(vw8Var);
            asd asdVar = (asd) vw8Var.get();
            asdVar.getClass();
            q8f q8fVar = asdVar.c;
            fp fpVar = new fp();
            fpVar.c = kxe.b;
            xnb.c(1, new dd1(q8fVar, new rx(fpVar, 1), vxe.c, q8fVar.b(), (byte) 3));
            new km5((qi6) asdVar.a.c(lm5Var), (Executor) asdVar.b.a.get(), new a94("vision.ica", 1L)).c(a2).addOnSuccessListener(new hja(this, (byte) 13)).addOnFailureListener(new bya((byte) 1));
        }
        ArrayList arrayList2 = ls6.d0(this.a).n;
        for (int i6 = 0; i6 < Math.min(arrayList2.size(), 9); i6++) {
            pv3.g(((TLRPC.TL_availableReaction) arrayList2.get(i6)).reaction);
        }
    }

    public final void m(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new d31((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
    }

    public final void n() {
        Path path = this.l0;
        if (path == null) {
            this.l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.l0.addPath(this.m0, this.k0);
        this.l0.computeBounds(this.n0, true);
    }

    public final void o(final String str, final oec oecVar, final String str2, final CharSequence charSequence, final boolean z, final long j, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final rx1 rx1Var, final c cVar) {
        hl.d3(new Runnable() { // from class: f3b
            @Override // java.lang.Runnable
            public final void run() {
                i3b i3bVar;
                k3b k3bVar = k3b.this;
                rx1 rx1Var2 = rx1Var;
                byte b = 1;
                boolean z2 = rx1Var2 == null || (i3bVar = k3bVar.a0) == null || !i3bVar.o;
                if (z2) {
                    i3b i3bVar2 = k3bVar.a0;
                    if (i3bVar2 != null) {
                        i3bVar2.a();
                    }
                    i3b i3bVar3 = new i3b();
                    i3bVar3.p = new ArrayList();
                    i3bVar3.q = new ArrayList();
                    i3bVar3.t = 0.0f;
                    i3bVar3.u = 0.0f;
                    k3bVar.a0 = i3bVar3;
                }
                i3b i3bVar4 = k3bVar.a0;
                i3bVar4.c = str2;
                String str4 = str;
                i3bVar4.b = str4;
                i3bVar4.a = str4;
                i3bVar4.d = charSequence;
                i3bVar4.h = z;
                i3bVar4.i = j;
                i3bVar4.j = stickerSet;
                i3bVar4.k = document;
                oec oecVar2 = oecVar;
                i3bVar4.s = oecVar2;
                i3bVar4.l = str3;
                i3bVar4.n = rx1Var2;
                i3bVar4.m = cVar;
                ArrayList arrayList = i3bVar4.q;
                if (!TextUtils.isEmpty(str4)) {
                    i3bVar4.p.add(new File(i3bVar4.b));
                }
                if (!TextUtils.isEmpty(i3bVar4.a) && !TextUtils.equals(i3bVar4.a, i3bVar4.b)) {
                    arrayList.add(new File(i3bVar4.a));
                }
                if (!TextUtils.isEmpty(i3bVar4.l)) {
                    arrayList.add(new File(i3bVar4.l));
                }
                if (z2) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        i3b i3bVar5 = k3bVar.a0;
                        i3bVar5.e = ls6.c0(document3, i3bVar5.c);
                        k3bVar.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = k3bVar.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        k3bVar.a();
                    } else if (oecVar2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        i3b i3bVar6 = k3bVar.a0;
                        String absolutePath = c8b.w(yac.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        i3bVar6.b = absolutePath;
                        k3bVar.a0.r = new r47(yac.t0, tL_message, null, false, false);
                        k3bVar.a0.r.r0 = oecVar2;
                        MediaController.z().j0(k3bVar.a0.r, false, false, false);
                    } else {
                        xb4.G(k3bVar.a).h0(false, 67108864, str4, true);
                    }
                } else {
                    k3bVar.a();
                }
                if (rx1Var2 == null) {
                    eq3 eq3Var = k3bVar.e0;
                    if (eq3Var == null) {
                        eq3Var = new eq3(k3bVar.getContext(), ob6.M0(2131746648, null));
                        k3bVar.e0 = eq3Var;
                    }
                    eq3Var.setOnCancelListener(new b3b(k3bVar, b));
                    if (k3bVar.e0.getParent() == null) {
                        k3bVar.addView(k3bVar.e0, tre.e(-1, -1, 17));
                    }
                    eq3 eq3Var2 = k3bVar.e0;
                    eq3Var2.F = true;
                    eq3Var2.invalidate();
                }
            }
        }, 300L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.U1);
        jn7.f(this.a).b(this, jn7.W1);
        jn7.f(this.a).b(this, jn7.V1);
        jn7.f(this.a).b(this, jn7.c2);
        jn7.f(this.a).b(this, jn7.a2);
        jn7.f(this.a).b(this, jn7.b2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        if (i >= 0) {
            jn7.f(i).n(this, jn7.U1);
            jn7.f(this.a).n(this, jn7.W1);
            jn7.f(this.a).n(this, jn7.V1);
            jn7.f(this.a).n(this, jn7.c2);
            jn7.f(this.a).n(this, jn7.a2);
            jn7.f(this.a).n(this, jn7.b2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = hl.L(10.0f);
        float f = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        float f2 = measuredWidth / 8.0f;
        RectF rectF = hl.P;
        float f3 = measuredWidth + L;
        rectF.set(L, L, f3, f3);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f2, f2, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.x;
        path4.rewind();
        rectF.inset(hl.L(-1.0f), hl.L(-1.0f));
        path4.addRoundRect(rectF, f2, f2, direction);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + hl.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.q0;
            arrayList.clear();
            if (this.j0) {
                Rect rect = this.r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, hl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setCurrentAccount(int i) {
        int i2 = this.a;
        if (i2 != i) {
            int i3 = jn7.b2;
            int i4 = jn7.a2;
            int i5 = jn7.c2;
            int i6 = jn7.V1;
            int i7 = jn7.W1;
            int i8 = jn7.U1;
            if (i2 >= 0 && isAttachedToWindow()) {
                jn7.f(this.a).n(this, i8);
                jn7.f(this.a).n(this, i7);
                jn7.f(this.a).n(this, i6);
                jn7.f(this.a).n(this, i5);
                jn7.f(this.a).n(this, i4);
                jn7.f(this.a).n(this, i3);
            }
            this.a = i;
            if (i < 0 || !isAttachedToWindow()) {
                return;
            }
            jn7.f(this.a).b(this, i8);
            jn7.f(this.a).b(this, i7);
            jn7.f(this.a).b(this, i6);
            jn7.f(this.a).b(this, i5);
            jn7.f(this.a).b(this, i4);
            jn7.f(this.a).b(this, i3);
        }
    }

    public void setOutlineVisible(boolean z) {
        if (this.j0 != z) {
            this.j0 = z;
            this.i0.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : hl.L(-18.0f)).setInterpolator(k43.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.q0;
                arrayList.clear();
                if (this.j0) {
                    Rect rect = this.r0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, hl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f) {
        this.G = f;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(v2b v2bVar) {
        this.c0 = v2bVar;
    }
}
