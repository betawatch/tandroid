package bg;

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
import i7.f6;
import j7.la;
import j7.s7;
import j7.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.tc;
import org.telegram.ui.mq0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int n0 = 0;
    public r3 A;
    public float B;
    public boolean C;
    public r3[] D;
    public volatile Bitmap E;
    public int F;
    public Bitmap G;
    public boolean H;
    public final TextView I;
    public ValueAnimator J;
    public float K;
    public float L;
    public float M;
    public float N;
    public p01 O;
    public int P;
    public int Q;
    public boolean R;
    public s3 S;
    public final c6 T;
    public g3 U;
    public String V;
    public nh.t0 W;
    public int a;
    public final Matrix a0;
    public final d6 b;
    public float b0;
    public final d6 c;
    public float c0;
    public final Paint d;
    public final w2 d0;
    public final Paint e;
    public boolean e0;
    public final Paint f;
    public final Matrix f0;
    public Path g0;
    public final Paint h;
    public Path h0;
    public final RectF i0;
    public float j0;
    public float k0;
    public final ArrayList l0;
    public final Rect m0;
    public final PathMeasure n;
    public final Path r;
    public final Path s;
    public final Path v;
    public final Path w;
    public volatile boolean x;
    public volatile boolean y;

    public u3(ContextThemeWrapper contextThemeWrapper, c6 c6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        jr jrVar = jr.h;
        this.b = new d6(0.0f, (View) null, 0L, 420L, jrVar);
        this.c = new d6(0.0f, (View) null, 0L, 420L, jrVar);
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
        this.v = new Path();
        this.w = new Path();
        this.B = 2.0f;
        this.a0 = new Matrix();
        this.f0 = new Matrix();
        this.i0 = new RectF();
        this.l0 = new ArrayList();
        this.m0 = new Rect();
        this.T = c6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.I = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, f6.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        float dp = AndroidUtilities.dp(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(dp, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        w2 w2Var = new w2(contextThemeWrapper);
        this.d0 = w2Var;
        w2Var.setAlpha(0.0f);
        w2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w2Var.b(0.33f, 10.0f);
        w2Var.setBrushWeight(this.B);
        w2Var.setValueOverride(new m5.i(this, 6));
        w2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w2Var.setAlpha(0.0f);
        addView(w2Var, f6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(r3 r3Var, int i10, int i11) {
        Bitmap bitmap;
        q3 q3Var;
        boolean z10;
        float f9;
        int i12;
        Bitmap b10 = r3Var.b();
        Path path = r3Var.l;
        int width = b10.getWidth();
        int height = r3Var.b().getHeight();
        float max = Math.max(width, height) / (SharedConfig.getDevicePerformanceClass() == 2 ? 512.0f : 384.0f);
        if ((r3Var.c / 90) % 2 != 0) {
            width = r3Var.b().getHeight();
            height = r3Var.b().getWidth();
        }
        float f10 = width;
        float f11 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f10 / max), (int) (f11 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (r3Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(r3Var.c, r3Var.b().getWidth() / 2.0f, r3Var.d.getHeight() / 2.0f);
            if ((r3Var.c / 90) % 2 != 0) {
                float height2 = (r3Var.b().getHeight() - r3Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f10, rectF.height() / f11);
            canvas.drawBitmap(r3Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(r3Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f12 = i10;
        float f13 = i11;
        float min = Math.min(f12 / createBitmap.getWidth(), f13 / createBitmap.getHeight());
        q3 q3Var2 = null;
        q3 q3Var3 = null;
        int i13 = 0;
        while (i13 < height3) {
            int width2 = i13 / createBitmap.getWidth();
            int width3 = i13 - (createBitmap.getWidth() * width2);
            int i14 = iArr[i13];
            boolean z11 = i14 != 0;
            if (i14 == 0) {
                int i15 = i13 - 1;
                boolean z12 = i15 >= 0;
                f9 = f10;
                int i16 = i13 + 1;
                boolean z13 = i16 < height3;
                if (!z12 || iArr[i15] == 0) {
                    i12 = i16;
                } else {
                    i12 = i16;
                    q3Var3 = new q3(min, width3, width2);
                }
                if (q3Var2 == null && z13 && iArr[i12] != 0) {
                    q3Var2 = new q3(min, width3, width2);
                }
            } else {
                f9 = f10;
            }
            boolean z14 = width3 == createBitmap.getWidth() + (-1);
            boolean z15 = width3 == 0;
            if (z14) {
                q3 q3Var4 = z11 ? new q3(min, width3, width2) : q3Var3;
                if (q3Var2 != null) {
                    arrayList.add(q3Var2);
                }
                if (q3Var4 != null) {
                    arrayList2.add(q3Var4);
                }
                q3Var2 = null;
                q3Var3 = null;
            }
            if (z15 && z11) {
                q3Var2 = new q3(min, width3, width2);
            }
            i13++;
            f10 = f9;
        }
        float f14 = f10;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        q3 q3Var5 = null;
        q3 q3Var6 = null;
        int i17 = 0;
        while (i17 < height3) {
            float f15 = f11;
            int height4 = i17 / createBitmap.getHeight();
            q3 q3Var7 = q3Var5;
            int height5 = i17 - (createBitmap.getHeight() * height4);
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
                    q3Var6 = new q3(min, height4, height5);
                }
                if (q3Var7 == null && z18 && iArr[width5] != 0) {
                    q3Var = new q3(min, height4, height5);
                    int i18 = height3;
                    z10 = height5 != bitmap.getHeight() + (-1);
                    boolean z19 = height5 != 0;
                    if (z10) {
                        if (z16) {
                            q3Var6 = new q3(min, height4, height5);
                        }
                        if (q3Var != null) {
                            arrayList3.add(q3Var);
                        }
                        if (q3Var6 != null) {
                            arrayList4.add(q3Var6);
                        }
                        q3Var = null;
                        q3Var6 = null;
                    }
                    q3Var5 = (z19 || !z16) ? q3Var : new q3(min, height4, height5);
                    i17++;
                    f11 = f15;
                    createBitmap = bitmap;
                    height3 = i18;
                }
            }
            q3Var = q3Var7;
            int i182 = height3;
            if (height5 != bitmap.getHeight() + (-1)) {
            }
            if (height5 != 0) {
            }
            if (z10) {
            }
            if (z19) {
            }
            i17++;
            f11 = f15;
            createBitmap = bitmap;
            height3 = i182;
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
        List k9 = k(new ArrayList(linkedHashSet));
        List k10 = k(new ArrayList(linkedHashSet2));
        Path path2 = new Path();
        int i19 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) k10;
            if (i19 >= arrayList5.size()) {
                break;
            }
            q3 q3Var8 = (q3) arrayList5.get(i19);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) q3Var8).x, ((Point) q3Var8).y);
            } else {
                path2.lineTo(((Point) q3Var8).x, ((Point) q3Var8).y);
            }
            i19 += 2;
        }
        Path path3 = new Path();
        int i20 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) k9;
            if (i20 >= arrayList6.size()) {
                break;
            }
            q3 q3Var9 = (q3) arrayList6.get(i20);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) q3Var9).x, ((Point) q3Var9).y);
            } else {
                path3.lineTo(((Point) q3Var9).x, ((Point) q3Var9).y);
            }
            i20 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f12 / f14, f13 / f16);
        float f17 = f14 * min2;
        r3Var.j = f17;
        float f18 = min2 * f16;
        r3Var.k = f18;
        path.offset((-f17) / 2.0f, (-f18) / 2.0f);
        Paint paint = r3Var.r;
        Paint paint2 = r3Var.q;
        Paint paint3 = r3Var.p;
        Paint paint4 = r3Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / AndroidUtilities.dp(2.0f));
        r3Var.n = ceil;
        r3Var.o = new float[ceil * 2];
        float[] fArr = new float[2];
        int i21 = 0;
        while (true) {
            int i22 = r3Var.n;
            if (i21 >= i22) {
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint3.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint3.setStrokeCap(cap);
                paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
                paint.setColor(-1);
                paint.setStrokeCap(cap);
                float dp = AndroidUtilities.dp(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(dp, blur));
                paint4.setStyle(style);
                paint4.setColor(g6.l1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(AndroidUtilities.dp(20.0f));
                paint4.setColor(g6.l1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i21 / i22) * length) % length, fArr, null);
            float[] fArr2 = r3Var.o;
            int i23 = i21 * 2;
            fArr2[i23] = fArr[0];
            fArr2[i23 + 1] = fArr[1];
            i21++;
        }
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((q3) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            q3 q3Var = (q3) arrayList.get(i10 - 1);
            q3 q3Var2 = (q3) arrayList.get(i10);
            i10++;
            q3 q3Var3 = (q3) arrayList.get(i10);
            int i11 = ((Point) q3Var2).x;
            int i12 = ((Point) q3Var).x;
            int i13 = ((Point) q3Var3).y;
            int i14 = ((Point) q3Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) q3Var3).x - i12) * (((Point) q3Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(q3Var2);
            }
        }
        arrayList2.add((q3) j7.l1.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final s3 s3Var = this.S;
        if (s3Var == null) {
            return;
        }
        final int i10 = UserConfig.selectedAccount;
        final int i11 = 1;
        s3Var.o = true;
        if (s3Var.m != null) {
            h();
            s3Var.m.run(s3Var.b, s3Var.e.document);
            AndroidUtilities.runOnUIThread(new ag.o0(3), 250L);
            return;
        }
        final int i12 = 0;
        if (s3Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(s3Var.k, s3Var.c).document;
            tL_stickers_replaceSticker.new_sticker = s3Var.e;
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: bg.k3
                public final /* synthetic */ u3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final u3 u3Var = this.b;
                            final int i14 = i10;
                            final s3 s3Var2 = s3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var2 = u3Var;
                                            final s3 s3Var3 = s3Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i15 = i14;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                nh.t0 t0Var = u3Var2.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i16 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i17 = i16;
                                                        s3 s3Var4 = s3Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        u3 u3Var3 = u3Var2;
                                                        u3Var3.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var4.f.document;
                                                                String str = s3Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject3, document, str, bool);
                                                                u3Var3.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, s3Var4.f.document, s3Var4.l, Boolean.TRUE);
                                                                u3Var3.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var4.f.document;
                                                                String str2 = s3Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject3, document2, str2, bool2);
                                                                u3Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                u3Var2.n(tL_error);
                                                u3Var2.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = s3Var3.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                s3Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var3 = u3Var;
                                            final s3 s3Var4 = s3Var2;
                                            if (z14) {
                                                int i17 = i14;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                nh.t0 t0Var2 = u3Var3.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        s3 s3Var42 = s3Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        u3 u3Var32 = u3Var3;
                                                        u3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var42.f.document;
                                                                String str = s3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                u3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f.document, s3Var42.l, Boolean.TRUE);
                                                                u3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var42.f.document;
                                                                String str2 = s3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                u3Var3.n(tL_error);
                                                u3Var3.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = s3Var4.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                s3Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var4 = u3Var;
                                            final s3 s3Var5 = s3Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                nh.t0 t0Var3 = u3Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        s3 s3Var42 = s3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        u3 u3Var32 = u3Var4;
                                                        u3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var42.f.document;
                                                                String str = s3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                u3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f.document, s3Var42.l, Boolean.TRUE);
                                                                u3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var42.f.document;
                                                                String str2 = s3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                u3Var4.n(tL_error);
                                                u3Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = s3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                s3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final u3 u3Var2 = this.b;
                            final int i16 = i10;
                            final s3 s3Var3 = s3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var22 = u3Var2;
                                            final s3 s3Var32 = s3Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                nh.t0 t0Var = u3Var22.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        s3 s3Var42 = s3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        u3 u3Var32 = u3Var22;
                                                        u3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var42.f.document;
                                                                String str = s3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                u3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f.document, s3Var42.l, Boolean.TRUE);
                                                                u3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var42.f.document;
                                                                String str2 = s3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                u3Var22.n(tL_error);
                                                u3Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = s3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                s3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var3 = u3Var2;
                                            final s3 s3Var4 = s3Var3;
                                            if (z14) {
                                                int i17 = i16;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                nh.t0 t0Var2 = u3Var3.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        s3 s3Var42 = s3Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        u3 u3Var32 = u3Var3;
                                                        u3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var42.f.document;
                                                                String str = s3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                u3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f.document, s3Var42.l, Boolean.TRUE);
                                                                u3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var42.f.document;
                                                                String str2 = s3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                u3Var3.n(tL_error);
                                                u3Var3.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = s3Var4.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                s3Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var4 = u3Var2;
                                            final s3 s3Var5 = s3Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                nh.t0 t0Var3 = u3Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        s3 s3Var42 = s3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        u3 u3Var32 = u3Var4;
                                                        u3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var42.f.document;
                                                                String str = s3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                u3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f.document, s3Var42.l, Boolean.TRUE);
                                                                u3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var42.f.document;
                                                                String str2 = s3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                u3Var4.n(tL_error);
                                                u3Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = s3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                s3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final u3 u3Var3 = this.b;
                            final int i18 = i10;
                            final s3 s3Var4 = s3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var22 = u3Var3;
                                            final s3 s3Var32 = s3Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                nh.t0 t0Var = u3Var22.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        s3 s3Var42 = s3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        u3 u3Var32 = u3Var22;
                                                        u3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var42.f.document;
                                                                String str = s3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                u3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f.document, s3Var42.l, Boolean.TRUE);
                                                                u3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var42.f.document;
                                                                String str2 = s3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                u3Var22.n(tL_error);
                                                u3Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = s3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                s3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var32 = u3Var3;
                                            final s3 s3Var42 = s3Var4;
                                            if (z14) {
                                                int i172 = i18;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                nh.t0 t0Var2 = u3Var32.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        s3 s3Var422 = s3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        u3 u3Var322 = u3Var32;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                u3Var32.n(tL_error);
                                                u3Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = s3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                s3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var4 = u3Var3;
                                            final s3 s3Var5 = s3Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                nh.t0 t0Var3 = u3Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        s3 s3Var422 = s3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        u3 u3Var322 = u3Var4;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                u3Var4.n(tL_error);
                                                u3Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = s3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                s3Var5.n = null;
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
        if (s3Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = s3Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(s3Var.e);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: bg.k3
                public final /* synthetic */ u3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i13 = 0;
                            final u3 u3Var = this.b;
                            final int i14 = i10;
                            final s3 s3Var2 = s3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var22 = u3Var;
                                            final s3 s3Var32 = s3Var2;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i14;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                nh.t0 t0Var = u3Var22.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        s3 s3Var422 = s3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        u3 u3Var322 = u3Var22;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                u3Var22.n(tL_error);
                                                u3Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = s3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                s3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var32 = u3Var;
                                            final s3 s3Var42 = s3Var2;
                                            if (z14) {
                                                int i172 = i14;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                nh.t0 t0Var2 = u3Var32.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        s3 s3Var422 = s3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        u3 u3Var322 = u3Var32;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                u3Var32.n(tL_error);
                                                u3Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = s3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                s3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var4 = u3Var;
                                            final s3 s3Var5 = s3Var2;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                nh.t0 t0Var3 = u3Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        s3 s3Var422 = s3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        u3 u3Var322 = u3Var4;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                u3Var4.n(tL_error);
                                                u3Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = s3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                s3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final u3 u3Var2 = this.b;
                            final int i16 = i10;
                            final s3 s3Var3 = s3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var22 = u3Var2;
                                            final s3 s3Var32 = s3Var3;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                nh.t0 t0Var = u3Var22.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        s3 s3Var422 = s3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        u3 u3Var322 = u3Var22;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                u3Var22.n(tL_error);
                                                u3Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = s3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                s3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var32 = u3Var2;
                                            final s3 s3Var42 = s3Var3;
                                            if (z14) {
                                                int i172 = i16;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                nh.t0 t0Var2 = u3Var32.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        s3 s3Var422 = s3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        u3 u3Var322 = u3Var32;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                u3Var32.n(tL_error);
                                                u3Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = s3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                s3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var4 = u3Var2;
                                            final s3 s3Var5 = s3Var3;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                nh.t0 t0Var3 = u3Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        s3 s3Var422 = s3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        u3 u3Var322 = u3Var4;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                u3Var4.n(tL_error);
                                                u3Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = s3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                s3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final u3 u3Var3 = this.b;
                            final int i18 = i10;
                            final s3 s3Var4 = s3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z10;
                                    boolean z11;
                                    boolean z12;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var22 = u3Var3;
                                            final s3 s3Var32 = s3Var4;
                                            if (z13) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                nh.t0 t0Var = u3Var22.W;
                                                if (t0Var != null) {
                                                    t0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        s3 s3Var422 = s3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        u3 u3Var322 = u3Var22;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z10 = true;
                                            } else {
                                                u3Var22.n(tL_error);
                                                u3Var22.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback = s3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z10));
                                                s3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var32 = u3Var3;
                                            final s3 s3Var42 = s3Var4;
                                            if (z14) {
                                                int i172 = i18;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                nh.t0 t0Var2 = u3Var32.W;
                                                if (t0Var2 != null) {
                                                    t0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        s3 s3Var422 = s3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        u3 u3Var322 = u3Var32;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z11 = true;
                                            } else {
                                                u3Var32.n(tL_error);
                                                u3Var32.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback2 = s3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z11));
                                                s3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final u3 u3Var4 = u3Var3;
                                            final s3 s3Var5 = s3Var4;
                                            if (z15) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                nh.t0 t0Var3 = u3Var4.W;
                                                if (t0Var3 != null) {
                                                    t0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        s3 s3Var422 = s3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        u3 u3Var322 = u3Var4;
                                                        u3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = s3Var422.f.document;
                                                                String str = s3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                u3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                u3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = s3Var422.f.document;
                                                                String str2 = s3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                u3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z12 = true;
                                            } else {
                                                u3Var4.n(tL_error);
                                                u3Var4.h();
                                                z12 = false;
                                            }
                                            Utilities.Callback callback3 = s3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z12));
                                                s3Var5.n = null;
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
        if (s3Var.h) {
            h();
            NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
            AndroidUtilities.runOnUIThread(new a4.g(s3Var, 15), 350L);
            Utilities.Callback callback = s3Var.n;
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        final int i13 = 2;
        if (s3Var.i == 0) {
            if (s3Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(s3Var.j);
                tL_stickers_addStickerToSet.sticker = s3Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: bg.k3
                    public final /* synthetic */ u3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i132 = 0;
                                final u3 u3Var = this.b;
                                final int i14 = i10;
                                final s3 s3Var2 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i132) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var;
                                                final s3 s3Var32 = s3Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i14;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    s3Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var;
                                                final s3 s3Var42 = s3Var2;
                                                if (z14) {
                                                    int i172 = i14;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = s3Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    s3Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var;
                                                final s3 s3Var5 = s3Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i14;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i15 = 1;
                                final u3 u3Var2 = this.b;
                                final int i16 = i10;
                                final s3 s3Var3 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i15) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var2;
                                                final s3 s3Var32 = s3Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i16;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    s3Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var2;
                                                final s3 s3Var42 = s3Var3;
                                                if (z14) {
                                                    int i172 = i16;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = s3Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    s3Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var2;
                                                final s3 s3Var5 = s3Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i16;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i17 = 2;
                                final u3 u3Var3 = this.b;
                                final int i18 = i10;
                                final s3 s3Var4 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.l3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (i17) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var3;
                                                final s3 s3Var32 = s3Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i18;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    s3Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var3;
                                                final s3 s3Var42 = s3Var4;
                                                if (z14) {
                                                    int i172 = i18;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = s3Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    s3Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var3;
                                                final s3 s3Var5 = s3Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i18;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.m3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f.document;
                                                                    String str = s3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f.document, s3Var422.l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f.document;
                                                                    String str2 = s3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.n = null;
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
        SendMessagesHelper.getInstance(i10).sendSticker(s3Var.f.document, null, s3Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        nh.t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.setProgress(1.0f);
        }
        AndroidUtilities.runOnUIThread(new f(this, i10, 2), 450L);
        Utilities.Callback callback2 = s3Var.n;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
            s3Var.n = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        this.E = null;
        if (this.D != null) {
            int i10 = 0;
            while (true) {
                r3[] r3VarArr = this.D;
                if (i10 >= r3VarArr.length) {
                    break;
                }
                r3 r3Var = r3VarArr[i10];
                if (r3Var != null) {
                    r3Var.l.reset();
                    Bitmap bitmap = r3Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        r3Var.e = null;
                    }
                    Bitmap bitmap2 = r3Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        r3Var.d = null;
                    }
                    Bitmap bitmap3 = r3Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        r3Var.g = null;
                    }
                    Bitmap bitmap4 = r3Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        r3Var.f = null;
                    }
                }
                i10++;
            }
            this.D = null;
        }
        this.y = false;
        this.x = false;
        this.H = false;
        this.I.setAlpha(0.0f);
        this.I.setScaleX(0.3f);
        this.I.setScaleY(0.3f);
        s3 s3Var = this.S;
        if (s3Var != null) {
            if (!s3Var.o) {
                s3Var.a();
            }
            this.S = null;
        }
        h();
        this.R = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z10) {
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s3 s3Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            s3 s3Var2 = this.S;
            if (s3Var2 == null || !str.equalsIgnoreCase(s3Var2.b)) {
                return;
            }
            s3 s3Var3 = this.S;
            s3Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = s3Var3.g;
            if (s3Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = s3Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new h3(0, this, s3Var3), 2);
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            s3 s3Var4 = this.S;
            if (s3Var4 == null || !str2.equalsIgnoreCase(s3Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                s3 s3Var5 = this.S;
                s3Var5.u = Utilities.clamp(longValue / longValue2, 1.0f, s3Var5.u);
                nh.t0 t0Var = this.W;
                if (t0Var != null) {
                    t0Var.setProgress(this.S.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            s3 s3Var6 = this.S;
            if (s3Var6 == null || !str3.equalsIgnoreCase(s3Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i10 == NotificationCenter.filePreparingStarted) {
            s3 s3Var7 = this.S;
            if (s3Var7 != null && objArr[0] == s3Var7.r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.S.b, false, true, 67108864);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && (s3Var = this.S) != null && objArr[0] == s3Var.r) {
                h();
                return;
            }
            return;
        }
        s3 s3Var8 = this.S;
        if (s3Var8 != null && objArr[0] == s3Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f9 = (Float) objArr[4];
            float floatValue = f9.floatValue();
            this.S.r.videoEditedInfo.needUpdateProgress = true;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f9);
            s3 s3Var9 = this.S;
            s3Var9.t = Math.max(s3Var9.t, floatValue);
            nh.t0 t0Var2 = this.W;
            if (t0Var2 != null) {
                t0Var2.setProgress(this.S.b());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.e);
        canvas.drawPath(this.w, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r6.getAction() != 1) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.j0 = motionEvent.getX();
        float y8 = motionEvent.getY();
        this.k0 = y8;
        if (this.D != null && this.J != null) {
            r3 j10 = j(this.j0, y8);
            int i10 = 0;
            while (true) {
                r3[] r3VarArr = this.D;
                if (i10 >= r3VarArr.length) {
                    break;
                }
                boolean z10 = r3VarArr[i10] == j10 && motionEvent.getAction() != 3;
                if (z10 && !this.D[i10].b) {
                    AndroidUtilities.vibrateCursor(this);
                }
                this.D[i10].b = z10;
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
        r3 r3Var = this.A;
        if (r3Var != null) {
            this.G = bitmap;
            if (r3Var.f != null && this.H) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                r3 r3Var2 = this.A;
                if (r3Var2.c == 0) {
                    canvas.drawBitmap(r3Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                r3 r3Var3 = this.A;
                matrix.postRotate(r3Var3.c, r3Var3.a().getWidth() / 2.0f, this.A.a().getHeight() / 2.0f);
                if ((this.A.c / 90) % 2 != 0) {
                    float height = (r4.b().getHeight() - this.A.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.A.a().getHeight(), bitmap.getHeight() / this.A.a().getWidth());
                canvas.drawBitmap(this.A.a(), matrix, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.d(0.0f, false);
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.I;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(jr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        d6 d6Var = this.c;
        d6Var.a = viewGroup;
        boolean z12 = this.e0;
        if (z12 || d6Var.c > 0.0f) {
            float e10 = viewGroup == null ? 1.0f : d6Var.e(z12 && !z11);
            r3[] r3VarArr = this.D;
            if (r3VarArr != null) {
                for (r3 r3Var : r3VarArr) {
                    if (r3Var != null && r3Var == this.A) {
                        if (this.B > 0.0f) {
                            if (r3Var.t.g0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(r3Var.t.g0);
                            if (r3Var.t.E != null) {
                                Paint paint = z10 ? r3Var.q : r3Var.p;
                                paint.setAlpha((int) (e10 * 255.0f));
                                paint.setStrokeWidth(AndroidUtilities.dp(r4));
                                canvas.drawPath(r3Var.l, paint);
                                if (r3Var.t.g0 != null && z10) {
                                    canvas.clipPath(r3Var.l);
                                    paint.setStrokeWidth(AndroidUtilities.dp(r4 * 2.0f));
                                    canvas.drawPath(r3Var.t.g0, paint);
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
        return this.L;
    }

    public float getSegmentBorderImageWidth() {
        return this.K;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        r3 r3Var;
        if (!this.H || (r3Var = this.A) == null) {
            return null;
        }
        return r3Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.E;
    }

    public p01 getThanosEffect() {
        if (!p01.c()) {
            return null;
        }
        if (this.O == null) {
            p01 p01Var = new p01(getContext(), new i3(this, 1));
            this.O = p01Var;
            addView(p01Var, f6.c(-1.0f, -1));
        }
        return this.O;
    }

    public final void h() {
        nh.t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.a();
            this.W = null;
        }
    }

    public final boolean i() {
        return this.H;
    }

    public final r3 j(float f9, float f10) {
        int width;
        int height;
        if (this.E == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.D;
            if (i10 >= r3VarArr.length) {
                return null;
            }
            r3 r3Var = r3VarArr[i10];
            if (r3Var != null) {
                if ((r3Var.c / 90) % 2 != 0) {
                    width = this.E.getHeight();
                    height = this.E.getWidth();
                } else {
                    width = this.E.getWidth();
                    height = this.E.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.D[i10].i;
                float f11 = width;
                float f12 = rectF2.left / f11;
                float f13 = this.b0;
                float f14 = height;
                float f15 = rectF2.top / f14;
                float f16 = this.c0;
                rectF.set(f12 * f13, f15 * f16, (rectF2.right / f11) * f13, (rectF2.bottom / f14) * f16);
                this.a0.mapRect(rectF);
                if (rectF.contains(f9, f10)) {
                    return r3Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        r3[] r3VarArr = this.D;
        if (r3VarArr != null) {
            for (r3 r3Var : r3VarArr) {
                if (r3Var != null && (bitmap = r3Var.e) != null) {
                    bitmap.recycle();
                    r3Var.e = null;
                    Bitmap bitmap2 = r3Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        r3Var.g = null;
                    }
                    c(r3Var, this.P, this.Q);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, mq0 mq0Var) {
        gb.c cVar;
        int i13 = i11 <= 0 ? AndroidUtilities.displaySize.x : i11;
        int i14 = i12 <= 0 ? AndroidUtilities.displaySize.y : i12;
        this.P = i13;
        this.Q = i14;
        if (this.y || this.x || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.E = bitmap;
        this.F = i10;
        this.V = null;
        n3 n3Var = new n3(this, i10, mq0Var, 0);
        this.x = true;
        kb.d dVar = new kb.d();
        dVar.b = true;
        dVar.c = true;
        zzd a2 = i7.g.a(new kb.e(dVar));
        if (EmuDetector.with(getContext()).detect()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.E;
            t3 t3Var = new t3();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            t3Var.e = min;
            t3Var.d = min;
            t3Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(t3Var.a).drawRect(0.0f, 0.0f, t3Var.d, t3Var.e, g6.Jl);
            t3Var.b = (bitmap2.getWidth() - t3Var.d) / 2;
            t3Var.c = (bitmap2.getHeight() - t3Var.e) / 2;
            arrayList.add(t3Var);
            n3Var.run(arrayList);
            return;
        }
        fb.a a10 = fb.a.a(bitmap, i10);
        a2.g(a10).addOnSuccessListener(new a1.c(n3Var, 9)).addOnFailureListener(new p3(this, bitmap, i10, mq0Var, n3Var, 0));
        if (this.V == null) {
            ib.b bVar = ib.b.b;
            z5.l.i(bVar, "options cannot be null");
            synchronized (gb.c.class) {
                cVar = (gb.c) ab.h.c().a(gb.c.class);
            }
            z9.b bVar2 = (z9.b) cVar.a.get(ib.b.class);
            z5.l.h(bVar2);
            jb.d dVar2 = (jb.d) bVar2.get();
            dVar2.getClass();
            la laVar = dVar2.c;
            c2 c2Var = new c2();
            c2Var.c = s7.b;
            ab.q.a.execute(new c2.p(laVar, new ag.j2(c2Var, 1), u7.c, laVar.b(), false, 5));
            new ImageLabelerImpl((ab.f) dVar2.a.G(bVar), (Executor) dVar2.b.a.get(), new w5.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new a1.c(this, 10)).addOnFailureListener(new a9.f(16));
        }
        List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.a).getEnabledReactionsList();
        for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
            Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        new tc((FrameLayout) getParent(), this.T).t(tL_error.text, null).j();
    }

    public final void o() {
        Path path = this.g0;
        if (path == null) {
            this.g0 = new Path();
        } else {
            path.rewind();
        }
        if (this.h0 == null) {
            this.h0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.h0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.g0.addPath(this.h0, this.f0);
        this.g0.computeBounds(this.i0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(10.0f);
        float f9 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f9;
        float measuredHeight = getMeasuredHeight() - f9;
        float f10 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = measuredWidth + dp;
        rectF.set(dp, dp, f11, f11);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.I.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.l0;
            arrayList.clear();
            if (this.e0) {
                Rect rect = this.m0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: bg.o3
            @Override // java.lang.Runnable
            public final void run() {
                s3 s3Var;
                u3 u3Var = u3.this;
                Utilities.Callback callback3 = callback;
                boolean z11 = callback3 == null || (s3Var = u3Var.S) == null || !s3Var.o;
                if (z11) {
                    s3 s3Var2 = u3Var.S;
                    if (s3Var2 != null) {
                        s3Var2.a();
                    }
                    s3 s3Var3 = new s3();
                    s3Var3.p = new ArrayList();
                    s3Var3.q = new ArrayList();
                    s3Var3.t = 0.0f;
                    s3Var3.u = 0.0f;
                    u3Var.S = s3Var3;
                }
                s3 s3Var4 = u3Var.S;
                s3Var4.c = str2;
                String str4 = str;
                s3Var4.b = str4;
                s3Var4.a = str4;
                s3Var4.d = charSequence;
                s3Var4.h = z10;
                s3Var4.i = j10;
                s3Var4.j = stickerSet;
                s3Var4.k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                s3Var4.s = videoEditedInfo2;
                s3Var4.l = str3;
                s3Var4.n = callback3;
                s3Var4.m = callback2;
                ArrayList arrayList = s3Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    s3Var4.p.add(new File(s3Var4.b));
                }
                if (!TextUtils.isEmpty(s3Var4.a) && !TextUtils.equals(s3Var4.a, s3Var4.b)) {
                    arrayList.add(new File(s3Var4.a));
                }
                if (!TextUtils.isEmpty(s3Var4.l)) {
                    arrayList.add(new File(s3Var4.l));
                }
                if (z11) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        s3 s3Var5 = u3Var.S;
                        s3Var5.e = MediaDataController.getInputStickerSetItem(document3, s3Var5.c);
                        u3Var.S.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = u3Var.S.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        u3Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        s3 s3Var6 = u3Var.S;
                        String absolutePath = o7.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        s3Var6.b = absolutePath;
                        u3Var.S.r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        u3Var.S.r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(u3Var.S.r, false, false, false);
                    } else {
                        FileLoader.getInstance(u3Var.a).uploadFile(str4, false, true, 67108864);
                    }
                } else {
                    u3Var.a();
                }
                if (callback3 == null) {
                    if (u3Var.W == null) {
                        u3Var.W = new nh.t0(u3Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    u3Var.W.setOnCancelListener(new i3(u3Var, 0));
                    if (u3Var.W.getParent() == null) {
                        u3Var.addView(u3Var.W, f6.e(-1, -1, 17));
                    }
                    nh.t0 t0Var = u3Var.W;
                    t0Var.A = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.a = i10;
            if (i10 < 0 || !isAttachedToWindow()) {
                return;
            }
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    public void setOutlineVisible(boolean z10) {
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        this.d0.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(-18.0f)).setInterpolator(jr.h).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.l0;
            arrayList.clear();
            if (this.e0) {
                Rect rect = this.m0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f9) {
        this.B = f9;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(g3 g3Var) {
        this.U = g3Var;
    }
}
