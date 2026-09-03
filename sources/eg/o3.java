package eg;

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
import k7.c6;
import l7.la;
import l7.s7;
import l7.u7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.zq0;
import qh.r6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int o0 = 0;
    public l3 B;
    public float C;
    public boolean D;
    public l3[] E;
    public volatile Bitmap F;
    public int G;
    public Bitmap H;
    public boolean I;
    public final TextView J;
    public ValueAnimator K;
    public float L;
    public float M;
    public float N;
    public float O;
    public a11 P;
    public int Q;
    public int R;
    public boolean S;
    public m3 T;
    public final g6 U;
    public a3 V;
    public String W;
    public int a;
    public qh.m0 a0;
    public final z5 b;
    public final Matrix b0;
    public final z5 c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public final r2 e0;
    public final Paint f;
    public boolean f0;
    public final Matrix g0;
    public final Paint h;
    public Path h0;
    public Path i0;
    public final RectF j0;
    public float k0;
    public float l0;
    public final ArrayList m0;
    public final PathMeasure n;
    public final Rect n0;
    public final Path r;
    public final Path s;
    public final Path v;
    public final Path w;
    public volatile boolean x;
    public volatile boolean y;

    public o3(ContextThemeWrapper contextThemeWrapper, g6 g6Var) {
        super(contextThemeWrapper);
        this.a = -1;
        pr prVar = pr.h;
        this.b = new z5(0.0f, (View) null, 0L, 420L, prVar);
        this.c = new z5(0.0f, (View) null, 0L, 420L, prVar);
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
        this.C = 2.0f;
        this.b0 = new Matrix();
        this.g0 = new Matrix();
        this.j0 = new RectF();
        this.m0 = new ArrayList();
        this.n0 = new Rect();
        this.U = g6Var;
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
        this.J = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, c6.e(-2, -2, 17));
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
        r2 r2Var = new r2(contextThemeWrapper);
        this.e0 = r2Var;
        r2Var.setAlpha(0.0f);
        r2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        r2Var.b(0.33f, 10.0f);
        r2Var.setBrushWeight(this.C);
        r2Var.setValueOverride(new ja.c(this));
        r2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        r2Var.setAlpha(0.0f);
        addView(r2Var, c6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(l3 l3Var, int i10, int i11) {
        Bitmap bitmap;
        k3 k3Var;
        boolean z4;
        float f10;
        int i12;
        Bitmap b10 = l3Var.b();
        Path path = l3Var.l;
        int width = b10.getWidth();
        int height = l3Var.b().getHeight();
        float max = Math.max(width, height) / (SharedConfig.getDevicePerformanceClass() == 2 ? 512.0f : 384.0f);
        if ((l3Var.c / 90) % 2 != 0) {
            width = l3Var.b().getHeight();
            height = l3Var.b().getWidth();
        }
        float f11 = width;
        float f12 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f11 / max), (int) (f12 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (l3Var.c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(l3Var.c, l3Var.b().getWidth() / 2.0f, l3Var.d.getHeight() / 2.0f);
            if ((l3Var.c / 90) % 2 != 0) {
                float height2 = (l3Var.b().getHeight() - l3Var.b().getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f11, rectF.height() / f12);
            canvas.drawBitmap(l3Var.b(), matrix, new Paint(3));
        } else {
            canvas.drawBitmap(l3Var.b(), (Rect) null, rectF, new Paint(3));
        }
        int height3 = createBitmap.getHeight() * createBitmap.getWidth();
        int[] iArr = new int[height3];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f13 = i10;
        float f14 = i11;
        float min = Math.min(f13 / createBitmap.getWidth(), f14 / createBitmap.getHeight());
        k3 k3Var2 = null;
        k3 k3Var3 = null;
        int i13 = 0;
        while (i13 < height3) {
            int width2 = i13 / createBitmap.getWidth();
            int width3 = i13 - (createBitmap.getWidth() * width2);
            int i14 = iArr[i13];
            boolean z10 = i14 != 0;
            if (i14 == 0) {
                int i15 = i13 - 1;
                boolean z11 = i15 >= 0;
                f10 = f11;
                int i16 = i13 + 1;
                boolean z12 = i16 < height3;
                if (!z11 || iArr[i15] == 0) {
                    i12 = i16;
                } else {
                    i12 = i16;
                    k3Var3 = new k3(min, width3, width2);
                }
                if (k3Var2 == null && z12 && iArr[i12] != 0) {
                    k3Var2 = new k3(min, width3, width2);
                }
            } else {
                f10 = f11;
            }
            boolean z13 = width3 == createBitmap.getWidth() + (-1);
            boolean z14 = width3 == 0;
            if (z13) {
                k3 k3Var4 = z10 ? new k3(min, width3, width2) : k3Var3;
                if (k3Var2 != null) {
                    arrayList.add(k3Var2);
                }
                if (k3Var4 != null) {
                    arrayList2.add(k3Var4);
                }
                k3Var2 = null;
                k3Var3 = null;
            }
            if (z14 && z10) {
                k3Var2 = new k3(min, width3, width2);
            }
            i13++;
            f11 = f10;
        }
        float f15 = f11;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        k3 k3Var5 = null;
        k3 k3Var6 = null;
        int i17 = 0;
        while (i17 < height3) {
            float f16 = f12;
            int height4 = i17 / createBitmap.getHeight();
            k3 k3Var7 = k3Var5;
            int height5 = i17 - (createBitmap.getHeight() * height4);
            boolean z15 = iArr[(createBitmap.getWidth() * height5) + height4] != 0;
            if (z15) {
                bitmap = createBitmap;
            } else {
                int width4 = (createBitmap.getWidth() * (height5 - 1)) + height4;
                bitmap = createBitmap;
                int width5 = (createBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z16 = width4 >= 0;
                boolean z17 = width5 < height3;
                if (z16 && iArr[width4] != 0) {
                    k3Var6 = new k3(min, height4, height5);
                }
                if (k3Var7 == null && z17 && iArr[width5] != 0) {
                    k3Var = new k3(min, height4, height5);
                    int i18 = height3;
                    z4 = height5 != bitmap.getHeight() + (-1);
                    boolean z18 = height5 != 0;
                    if (z4) {
                        if (z15) {
                            k3Var6 = new k3(min, height4, height5);
                        }
                        if (k3Var != null) {
                            arrayList3.add(k3Var);
                        }
                        if (k3Var6 != null) {
                            arrayList4.add(k3Var6);
                        }
                        k3Var = null;
                        k3Var6 = null;
                    }
                    k3Var5 = (z18 || !z15) ? k3Var : new k3(min, height4, height5);
                    i17++;
                    f12 = f16;
                    createBitmap = bitmap;
                    height3 = i18;
                }
            }
            k3Var = k3Var7;
            int i182 = height3;
            if (height5 != bitmap.getHeight() + (-1)) {
            }
            if (height5 != 0) {
            }
            if (z4) {
            }
            if (z18) {
            }
            i17++;
            f12 = f16;
            createBitmap = bitmap;
            height3 = i182;
        }
        float f17 = f12;
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
        int i19 = 0;
        while (true) {
            ArrayList arrayList5 = (ArrayList) k11;
            if (i19 >= arrayList5.size()) {
                break;
            }
            k3 k3Var8 = (k3) arrayList5.get(i19);
            if (path2.isEmpty()) {
                path2.moveTo(((Point) k3Var8).x, ((Point) k3Var8).y);
            } else {
                path2.lineTo(((Point) k3Var8).x, ((Point) k3Var8).y);
            }
            i19 += 2;
        }
        Path path3 = new Path();
        int i20 = 0;
        while (true) {
            ArrayList arrayList6 = (ArrayList) k10;
            if (i20 >= arrayList6.size()) {
                break;
            }
            k3 k3Var9 = (k3) arrayList6.get(i20);
            if (path3.isEmpty()) {
                path3.moveTo(((Point) k3Var9).x, ((Point) k3Var9).y);
            } else {
                path3.lineTo(((Point) k3Var9).x, ((Point) k3Var9).y);
            }
            i20 += 2;
        }
        path.reset();
        path.op(path2, path3, Path.Op.INTERSECT);
        float min2 = Math.min(f13 / f15, f14 / f17);
        float f18 = f15 * min2;
        l3Var.j = f18;
        float f19 = min2 * f17;
        l3Var.k = f19;
        path.offset((-f18) / 2.0f, (-f19) / 2.0f);
        Paint paint = l3Var.r;
        Paint paint2 = l3Var.q;
        Paint paint3 = l3Var.p;
        Paint paint4 = l3Var.s;
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        int ceil = (int) Math.ceil(length / AndroidUtilities.dp(2.0f));
        l3Var.n = ceil;
        l3Var.o = new float[ceil * 2];
        float[] fArr = new float[2];
        int i21 = 0;
        while (true) {
            int i22 = l3Var.n;
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
                paint4.setColor(k6.l1(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(AndroidUtilities.dp(20.0f));
                paint4.setColor(k6.l1(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i21 / i22) * length) % length, fArr, null);
            float[] fArr2 = l3Var.o;
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
        arrayList2.add((k3) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            k3 k3Var = (k3) arrayList.get(i10 - 1);
            k3 k3Var2 = (k3) arrayList.get(i10);
            i10++;
            k3 k3Var3 = (k3) arrayList.get(i10);
            int i11 = ((Point) k3Var2).x;
            int i12 = ((Point) k3Var).x;
            int i13 = ((Point) k3Var3).y;
            int i14 = ((Point) k3Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) k3Var3).x - i12) * (((Point) k3Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(k3Var2);
            }
        }
        arrayList2.add((k3) l.d.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final m3 m3Var = this.T;
        if (m3Var == null) {
            return;
        }
        final int i10 = UserConfig.selectedAccount;
        final int i11 = 1;
        m3Var.o = true;
        if (m3Var.m != null) {
            h();
            m3Var.m.run(m3Var.b, m3Var.e.document);
            AndroidUtilities.runOnUIThread(new ag.f(6), 250L);
            return;
        }
        final int i12 = 0;
        if (m3Var.k != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(m3Var.k, m3Var.c).document;
            tL_stickers_replaceSticker.new_sticker = m3Var.e;
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) { // from class: eg.e3
                public final /* synthetic */ o3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 0;
                            final o3 o3Var = this.b;
                            final int i14 = i10;
                            final m3 m3Var2 = m3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z4;
                                    boolean z10;
                                    boolean z11;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var2 = o3Var;
                                            final m3 m3Var3 = m3Var2;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i15 = i14;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                qh.m0 m0Var = o3Var2.a0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i16 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i17 = i16;
                                                        m3 m3Var4 = m3Var3;
                                                        TLObject tLObject3 = tLObject2;
                                                        o3 o3Var3 = o3Var2;
                                                        o3Var3.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var4.f.document;
                                                                String str = m3Var4.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject3, document, str, bool);
                                                                o3Var3.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, m3Var4.f.document, m3Var4.l, Boolean.TRUE);
                                                                o3Var3.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var4.f.document;
                                                                String str2 = m3Var4.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject3, document2, str2, bool2);
                                                                o3Var3.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z4 = true;
                                            } else {
                                                o3Var2.n(tL_error);
                                                o3Var2.h();
                                                z4 = false;
                                            }
                                            Utilities.Callback callback = m3Var3.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z4));
                                                m3Var3.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var3 = o3Var;
                                            final m3 m3Var4 = m3Var2;
                                            if (z13) {
                                                int i17 = i14;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                qh.m0 m0Var2 = o3Var3.a0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        m3 m3Var42 = m3Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        o3 o3Var32 = o3Var3;
                                                        o3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var42.f.document;
                                                                String str = m3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f.document, m3Var42.l, Boolean.TRUE);
                                                                o3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var42.f.document;
                                                                String str2 = m3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z10 = true;
                                            } else {
                                                o3Var3.n(tL_error);
                                                o3Var3.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback2 = m3Var4.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z10));
                                                m3Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var4 = o3Var;
                                            final m3 m3Var5 = m3Var2;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                qh.m0 m0Var3 = o3Var4.a0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        m3 m3Var42 = m3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o3 o3Var32 = o3Var4;
                                                        o3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var42.f.document;
                                                                String str = m3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f.document, m3Var42.l, Boolean.TRUE);
                                                                o3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var42.f.document;
                                                                String str2 = m3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z11 = true;
                                            } else {
                                                o3Var4.n(tL_error);
                                                o3Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback3 = m3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z11));
                                                m3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final o3 o3Var2 = this.b;
                            final int i16 = i10;
                            final m3 m3Var3 = m3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z4;
                                    boolean z10;
                                    boolean z11;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var22 = o3Var2;
                                            final m3 m3Var32 = m3Var3;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                qh.m0 m0Var = o3Var22.a0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        m3 m3Var42 = m3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o3 o3Var32 = o3Var22;
                                                        o3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var42.f.document;
                                                                String str = m3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f.document, m3Var42.l, Boolean.TRUE);
                                                                o3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var42.f.document;
                                                                String str2 = m3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z4 = true;
                                            } else {
                                                o3Var22.n(tL_error);
                                                o3Var22.h();
                                                z4 = false;
                                            }
                                            Utilities.Callback callback = m3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z4));
                                                m3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var3 = o3Var2;
                                            final m3 m3Var4 = m3Var3;
                                            if (z13) {
                                                int i17 = i16;
                                                MediaDataController.getInstance(i17).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i17).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                qh.m0 m0Var2 = o3Var3.a0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i18 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i18;
                                                        m3 m3Var42 = m3Var4;
                                                        TLObject tLObject32 = tLObject3;
                                                        o3 o3Var32 = o3Var3;
                                                        o3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var42.f.document;
                                                                String str = m3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f.document, m3Var42.l, Boolean.TRUE);
                                                                o3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var42.f.document;
                                                                String str2 = m3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z10 = true;
                                            } else {
                                                o3Var3.n(tL_error);
                                                o3Var3.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback2 = m3Var4.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z10));
                                                m3Var4.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var4 = o3Var2;
                                            final m3 m3Var5 = m3Var3;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                qh.m0 m0Var3 = o3Var4.a0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i20;
                                                        m3 m3Var42 = m3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o3 o3Var32 = o3Var4;
                                                        o3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var42.f.document;
                                                                String str = m3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f.document, m3Var42.l, Boolean.TRUE);
                                                                o3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var42.f.document;
                                                                String str2 = m3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z11 = true;
                                            } else {
                                                o3Var4.n(tL_error);
                                                o3Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback3 = m3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z11));
                                                m3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final o3 o3Var3 = this.b;
                            final int i18 = i10;
                            final m3 m3Var4 = m3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z4;
                                    boolean z10;
                                    boolean z11;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var22 = o3Var3;
                                            final m3 m3Var32 = m3Var4;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                qh.m0 m0Var = o3Var22.a0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i172 = i162;
                                                        m3 m3Var42 = m3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o3 o3Var32 = o3Var22;
                                                        o3Var32.getClass();
                                                        switch (i172) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i182 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var42.f.document;
                                                                String str = m3Var42.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i182, bool, tLObject32, document, str, bool);
                                                                o3Var32.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f.document, m3Var42.l, Boolean.TRUE);
                                                                o3Var32.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var42.f.document;
                                                                String str2 = m3Var42.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var32.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z4 = true;
                                            } else {
                                                o3Var22.n(tL_error);
                                                o3Var22.h();
                                                z4 = false;
                                            }
                                            Utilities.Callback callback = m3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z4));
                                                m3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var32 = o3Var3;
                                            final m3 m3Var42 = m3Var4;
                                            if (z13) {
                                                int i172 = i18;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                qh.m0 m0Var2 = o3Var32.a0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m3 m3Var422 = m3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o3 o3Var322 = o3Var32;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z10 = true;
                                            } else {
                                                o3Var32.n(tL_error);
                                                o3Var32.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback2 = m3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z10));
                                                m3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var4 = o3Var3;
                                            final m3 m3Var5 = m3Var4;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                qh.m0 m0Var3 = o3Var4.a0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m3 m3Var422 = m3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o3 o3Var322 = o3Var4;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z11 = true;
                                            } else {
                                                o3Var4.n(tL_error);
                                                o3Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback3 = m3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z11));
                                                m3Var5.n = null;
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
        if (m3Var.d != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = m3Var.d.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(m3Var.e);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) { // from class: eg.e3
                public final /* synthetic */ o3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i13 = 0;
                            final o3 o3Var = this.b;
                            final int i14 = i10;
                            final m3 m3Var2 = m3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z4;
                                    boolean z10;
                                    boolean z11;
                                    switch (i13) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var22 = o3Var;
                                            final m3 m3Var32 = m3Var2;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i14;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                qh.m0 m0Var = o3Var22.a0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        m3 m3Var422 = m3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o3 o3Var322 = o3Var22;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z4 = true;
                                            } else {
                                                o3Var22.n(tL_error);
                                                o3Var22.h();
                                                z4 = false;
                                            }
                                            Utilities.Callback callback = m3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z4));
                                                m3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var32 = o3Var;
                                            final m3 m3Var42 = m3Var2;
                                            if (z13) {
                                                int i172 = i14;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                qh.m0 m0Var2 = o3Var32.a0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m3 m3Var422 = m3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o3 o3Var322 = o3Var32;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z10 = true;
                                            } else {
                                                o3Var32.n(tL_error);
                                                o3Var32.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback2 = m3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z10));
                                                m3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var4 = o3Var;
                                            final m3 m3Var5 = m3Var2;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i14;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                qh.m0 m0Var3 = o3Var4.a0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m3 m3Var422 = m3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o3 o3Var322 = o3Var4;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z11 = true;
                                            } else {
                                                o3Var4.n(tL_error);
                                                o3Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback3 = m3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z11));
                                                m3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final int i15 = 1;
                            final o3 o3Var2 = this.b;
                            final int i16 = i10;
                            final m3 m3Var3 = m3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z4;
                                    boolean z10;
                                    boolean z11;
                                    switch (i15) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var22 = o3Var2;
                                            final m3 m3Var32 = m3Var3;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i16;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                qh.m0 m0Var = o3Var22.a0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        m3 m3Var422 = m3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o3 o3Var322 = o3Var22;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z4 = true;
                                            } else {
                                                o3Var22.n(tL_error);
                                                o3Var22.h();
                                                z4 = false;
                                            }
                                            Utilities.Callback callback = m3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z4));
                                                m3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var32 = o3Var2;
                                            final m3 m3Var42 = m3Var3;
                                            if (z13) {
                                                int i172 = i16;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                qh.m0 m0Var2 = o3Var32.a0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m3 m3Var422 = m3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o3 o3Var322 = o3Var32;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z10 = true;
                                            } else {
                                                o3Var32.n(tL_error);
                                                o3Var32.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback2 = m3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z10));
                                                m3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var4 = o3Var2;
                                            final m3 m3Var5 = m3Var3;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i16;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                qh.m0 m0Var3 = o3Var4.a0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m3 m3Var422 = m3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o3 o3Var322 = o3Var4;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z11 = true;
                                            } else {
                                                o3Var4.n(tL_error);
                                                o3Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback3 = m3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z11));
                                                m3Var5.n = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i17 = 2;
                            final o3 o3Var3 = this.b;
                            final int i18 = i10;
                            final m3 m3Var4 = m3Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z4;
                                    boolean z10;
                                    boolean z11;
                                    switch (i17) {
                                        case 0:
                                            final TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var22 = o3Var3;
                                            final m3 m3Var32 = m3Var4;
                                            if (z12) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i152 = i18;
                                                MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                qh.m0 m0Var = o3Var22.a0;
                                                if (m0Var != null) {
                                                    m0Var.setProgress(1.0f);
                                                }
                                                final int i162 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i162;
                                                        m3 m3Var422 = m3Var32;
                                                        TLObject tLObject32 = tLObject2;
                                                        o3 o3Var322 = o3Var22;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z4 = true;
                                            } else {
                                                o3Var22.n(tL_error);
                                                o3Var22.h();
                                                z4 = false;
                                            }
                                            Utilities.Callback callback = m3Var32.n;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z4));
                                                m3Var32.n = null;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            final TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var32 = o3Var3;
                                            final m3 m3Var42 = m3Var4;
                                            if (z13) {
                                                int i172 = i18;
                                                MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                qh.m0 m0Var2 = o3Var32.a0;
                                                if (m0Var2 != null) {
                                                    m0Var2.setProgress(1.0f);
                                                }
                                                final int i182 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i182;
                                                        m3 m3Var422 = m3Var42;
                                                        TLObject tLObject32 = tLObject3;
                                                        o3 o3Var322 = o3Var32;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z10 = true;
                                            } else {
                                                o3Var32.n(tL_error);
                                                o3Var32.h();
                                                z10 = false;
                                            }
                                            Utilities.Callback callback2 = m3Var42.n;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z10));
                                                m3Var42.n = null;
                                                break;
                                            }
                                            break;
                                        default:
                                            final TLObject tLObject4 = tLObject;
                                            boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final o3 o3Var4 = o3Var3;
                                            final m3 m3Var5 = m3Var4;
                                            if (z14) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i19 = i18;
                                                MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                qh.m0 m0Var3 = o3Var4.a0;
                                                if (m0Var3 != null) {
                                                    m0Var3.setProgress(1.0f);
                                                }
                                                final int i20 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i1722 = i20;
                                                        m3 m3Var422 = m3Var5;
                                                        TLObject tLObject32 = tLObject4;
                                                        o3 o3Var322 = o3Var4;
                                                        o3Var322.getClass();
                                                        switch (i1722) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i1822 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = m3Var422.f.document;
                                                                String str = m3Var422.l;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                o3Var322.h();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                o3Var322.h();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i192 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = m3Var422.f.document;
                                                                String str2 = m3Var422.l;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                o3Var322.h();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z11 = true;
                                            } else {
                                                o3Var4.n(tL_error);
                                                o3Var4.h();
                                                z11 = false;
                                            }
                                            Utilities.Callback callback3 = m3Var5.n;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z11));
                                                m3Var5.n = null;
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
        if (m3Var.h) {
            h();
            NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
            AndroidUtilities.runOnUIThread(new ag.e(m3Var, 26), 350L);
            Utilities.Callback callback = m3Var.n;
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        if (m3Var.i == 0) {
            if (m3Var.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(m3Var.j);
                tL_stickers_addStickerToSet.sticker = m3Var.e;
                final int i13 = 2;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) { // from class: eg.e3
                    public final /* synthetic */ o3 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i132 = 0;
                                final o3 o3Var = this.b;
                                final int i14 = i10;
                                final m3 m3Var2 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (i132) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var;
                                                final m3 m3Var32 = m3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i14;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z4));
                                                    m3Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var;
                                                final m3 m3Var42 = m3Var2;
                                                if (z13) {
                                                    int i172 = i14;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = m3Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    m3Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var;
                                                final m3 m3Var5 = m3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i14;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i15 = 1;
                                final o3 o3Var2 = this.b;
                                final int i16 = i10;
                                final m3 m3Var3 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (i15) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var2;
                                                final m3 m3Var32 = m3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i16;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z4));
                                                    m3Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var2;
                                                final m3 m3Var42 = m3Var3;
                                                if (z13) {
                                                    int i172 = i16;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = m3Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    m3Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var2;
                                                final m3 m3Var5 = m3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i16;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.n = null;
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i17 = 2;
                                final o3 o3Var3 = this.b;
                                final int i18 = i10;
                                final m3 m3Var4 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.f3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (i17) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var3;
                                                final m3 m3Var32 = m3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i152 = i18;
                                                    MediaDataController.getInstance(i152).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i152).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i152).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    final int i162 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i162;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var32.n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z4));
                                                    m3Var32.n = null;
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var3;
                                                final m3 m3Var42 = m3Var4;
                                                if (z13) {
                                                    int i172 = i18;
                                                    MediaDataController.getInstance(i172).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i172).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    final int i182 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i182;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = m3Var42.n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    m3Var42.n = null;
                                                    break;
                                                }
                                                break;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var3;
                                                final m3 m3Var5 = m3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i19 = i18;
                                                    MediaDataController.getInstance(i19).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i19).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i19).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    final int i20 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.g3
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            int i1722 = i20;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1722) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i1822 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f.document;
                                                                    String str = m3Var422.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i1822, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f.document, m3Var422.l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i192 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f.document;
                                                                    String str2 = m3Var422.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i192, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.n = null;
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
        SendMessagesHelper.getInstance(i10).sendSticker(m3Var.f.document, null, m3Var.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        qh.m0 m0Var = this.a0;
        if (m0Var != null) {
            m0Var.setProgress(1.0f);
        }
        AndroidUtilities.runOnUIThread(new af.b(this, i10, 4), 450L);
        Utilities.Callback callback2 = m3Var.n;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
            m3Var.n = null;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.F = null;
        if (this.E != null) {
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = this.E;
                if (i10 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = l3VarArr[i10];
                if (l3Var != null) {
                    l3Var.l.reset();
                    Bitmap bitmap = l3Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        l3Var.e = null;
                    }
                    Bitmap bitmap2 = l3Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        l3Var.d = null;
                    }
                    Bitmap bitmap3 = l3Var.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        l3Var.g = null;
                    }
                    Bitmap bitmap4 = l3Var.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        l3Var.f = null;
                    }
                }
                i10++;
            }
            this.E = null;
        }
        this.y = false;
        this.x = false;
        this.I = false;
        this.J.setAlpha(0.0f);
        this.J.setScaleX(0.3f);
        this.J.setScaleY(0.3f);
        m3 m3Var = this.T;
        if (m3Var != null) {
            if (!m3Var.o) {
                m3Var.a();
            }
            this.T = null;
        }
        h();
        this.S = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z4) {
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
        if (z4) {
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
        m3 m3Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            m3 m3Var2 = this.T;
            if (m3Var2 == null || !str.equalsIgnoreCase(m3Var2.b)) {
                return;
            }
            m3 m3Var3 = this.T;
            m3Var3.g = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = m3Var3.g;
            if (m3Var3.s != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = m3Var3.c;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new b3(0, this, m3Var3), 2);
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            m3 m3Var4 = this.T;
            if (m3Var4 == null || !str2.equalsIgnoreCase(m3Var4.b)) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            long longValue2 = ((Long) objArr[2]).longValue();
            if (longValue2 > 0) {
                m3 m3Var5 = this.T;
                m3Var5.u = Utilities.clamp(longValue / longValue2, 1.0f, m3Var5.u);
                qh.m0 m0Var = this.a0;
                if (m0Var != null) {
                    m0Var.setProgress(this.T.b());
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            m3 m3Var6 = this.T;
            if (m3Var6 == null || !str3.equalsIgnoreCase(m3Var6.b)) {
                return;
            }
            h();
            return;
        }
        if (i10 == NotificationCenter.filePreparingStarted) {
            m3 m3Var7 = this.T;
            if (m3Var7 != null && objArr[0] == m3Var7.r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.T.b, false, true, 67108864);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && (m3Var = this.T) != null && objArr[0] == m3Var.r) {
                h();
                return;
            }
            return;
        }
        m3 m3Var8 = this.T;
        if (m3Var8 != null && objArr[0] == m3Var8.r) {
            String str4 = (String) objArr[1];
            long longValue3 = ((Long) objArr[2]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            float floatValue = f10.floatValue();
            this.T.r.videoEditedInfo.needUpdateProgress = true;
            FileLoader.getInstance(this.a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f10);
            m3 m3Var9 = this.T;
            m3Var9.t = Math.max(m3Var9.t, floatValue);
            qh.m0 m0Var2 = this.a0;
            if (m0Var2 != null) {
                m0Var2.setProgress(this.T.b());
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
        this.k0 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.l0 = y10;
        if (this.E != null && this.K != null) {
            l3 j10 = j(this.k0, y10);
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = this.E;
                if (i10 >= l3VarArr.length) {
                    break;
                }
                boolean z4 = l3VarArr[i10] == j10 && motionEvent.getAction() != 3;
                if (z4 && !this.E[i10].b) {
                    AndroidUtilities.vibrateCursor(this);
                }
                this.E[i10].b = z4;
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
        l3 l3Var = this.B;
        if (l3Var != null) {
            this.H = bitmap;
            if (l3Var.f != null && this.I) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                l3 l3Var2 = this.B;
                if (l3Var2.c == 0) {
                    canvas.drawBitmap(l3Var2.a(), (Rect) null, rect, paint);
                    return createBitmap;
                }
                Matrix matrix = new Matrix();
                l3 l3Var3 = this.B;
                matrix.postRotate(l3Var3.c, l3Var3.a().getWidth() / 2.0f, this.B.a().getHeight() / 2.0f);
                if ((this.B.c / 90) % 2 != 0) {
                    float height = (r4.b().getHeight() - this.B.b().getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                }
                matrix.postScale(bitmap.getWidth() / this.B.a().getHeight(), bitmap.getHeight() / this.B.a().getWidth());
                canvas.drawBitmap(this.B.a(), matrix, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.d(0.0f, false);
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.J;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(pr.h).start();
    }

    public final void g(Canvas canvas, boolean z4, ViewGroup viewGroup, boolean z10) {
        z5 z5Var = this.c;
        z5Var.a = viewGroup;
        boolean z11 = this.f0;
        if (z11 || z5Var.c > 0.0f) {
            float e6 = viewGroup == null ? 1.0f : z5Var.e(z11 && !z10);
            l3[] l3VarArr = this.E;
            if (l3VarArr != null) {
                for (l3 l3Var : l3VarArr) {
                    if (l3Var != null && l3Var == this.B) {
                        if (this.C > 0.0f) {
                            if (l3Var.t.h0 == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(l3Var.t.h0);
                            if (l3Var.t.F != null) {
                                Paint paint = z4 ? l3Var.q : l3Var.p;
                                paint.setAlpha((int) (e6 * 255.0f));
                                paint.setStrokeWidth(AndroidUtilities.dp(r4));
                                canvas.drawPath(l3Var.l, paint);
                                if (l3Var.t.h0 != null && z4) {
                                    canvas.clipPath(l3Var.l);
                                    paint.setStrokeWidth(AndroidUtilities.dp(r4 * 2.0f));
                                    canvas.drawPath(l3Var.t.h0, paint);
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
        return this.M;
    }

    public float getSegmentBorderImageWidth() {
        return this.L;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        l3 l3Var;
        if (!this.I || (l3Var = this.B) == null) {
            return null;
        }
        return l3Var.a();
    }

    public Bitmap getSourceBitmap() {
        return this.F;
    }

    public a11 getThanosEffect() {
        if (!a11.c()) {
            return null;
        }
        if (this.P == null) {
            a11 a11Var = new a11(getContext(), new c3(this, 1));
            this.P = a11Var;
            addView(a11Var, c6.c(-1.0f, -1));
        }
        return this.P;
    }

    public final void h() {
        qh.m0 m0Var = this.a0;
        if (m0Var != null) {
            m0Var.a();
            this.a0 = null;
        }
    }

    public final boolean i() {
        return this.I;
    }

    public final l3 j(float f10, float f11) {
        int width;
        int height;
        if (this.F == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            l3[] l3VarArr = this.E;
            if (i10 >= l3VarArr.length) {
                return null;
            }
            l3 l3Var = l3VarArr[i10];
            if (l3Var != null) {
                if ((l3Var.c / 90) % 2 != 0) {
                    width = this.F.getHeight();
                    height = this.F.getWidth();
                } else {
                    width = this.F.getWidth();
                    height = this.F.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.E[i10].i;
                float f12 = width;
                float f13 = rectF2.left / f12;
                float f14 = this.c0;
                float f15 = height;
                float f16 = rectF2.top / f15;
                float f17 = this.d0;
                rectF.set(f13 * f14, f16 * f17, (rectF2.right / f12) * f14, (rectF2.bottom / f15) * f17);
                this.b0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return l3Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        l3[] l3VarArr = this.E;
        if (l3VarArr != null) {
            for (l3 l3Var : l3VarArr) {
                if (l3Var != null && (bitmap = l3Var.e) != null) {
                    bitmap.recycle();
                    l3Var.e = null;
                    Bitmap bitmap2 = l3Var.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        l3Var.g = null;
                    }
                    c(l3Var, this.Q, this.R);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, zq0 zq0Var) {
        ib.c cVar;
        int i13 = i11 <= 0 ? AndroidUtilities.displaySize.x : i11;
        int i14 = i12 <= 0 ? AndroidUtilities.displaySize.y : i12;
        this.Q = i13;
        this.R = i14;
        if (this.y || this.x || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.F = bitmap;
        this.G = i10;
        this.W = null;
        h3 h3Var = new h3(this, i10, zq0Var, 0);
        this.x = true;
        mb.d dVar = new mb.d();
        dVar.b = true;
        dVar.c = true;
        zzd a2 = k7.r.a(new mb.e(dVar));
        if (EmuDetector.with(getContext()).detect()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.F;
            n3 n3Var = new n3();
            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            n3Var.e = min;
            n3Var.d = min;
            n3Var.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            new Canvas(n3Var.a).drawRect(0.0f, 0.0f, n3Var.d, n3Var.e, k6.Jl);
            n3Var.b = (bitmap2.getWidth() - n3Var.d) / 2;
            n3Var.c = (bitmap2.getHeight() - n3Var.e) / 2;
            arrayList.add(n3Var);
            h3Var.run(arrayList);
            return;
        }
        hb.a a10 = hb.a.a(bitmap, i10);
        a2.g(a10).addOnSuccessListener(new a1.c(h3Var, 22)).addOnFailureListener(new j3(this, bitmap, i10, zq0Var, h3Var, 0));
        if (this.W == null) {
            kb.b bVar = kb.b.b;
            b6.m.i(bVar, "options cannot be null");
            synchronized (ib.c.class) {
                cVar = (ib.c) cb.h.c().a(ib.c.class);
            }
            ba.b bVar2 = (ba.b) cVar.a.get(kb.b.class);
            b6.m.h(bVar2);
            lb.d dVar2 = (lb.d) bVar2.get();
            dVar2.getClass();
            la laVar = dVar2.c;
            a9.a aVar = new a9.a();
            aVar.c = s7.b;
            cb.o.a.execute(new c2.p(laVar, new b4.e0(aVar, 1), u7.c, laVar.b(), false, 6));
            new ImageLabelerImpl((cb.f) dVar2.a.F(bVar), (Executor) dVar2.b.a.get(), new y5.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new a1.c(this, 23)).addOnFailureListener(new androidx.emoji2.text.w(27));
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
        new qc((FrameLayout) getParent(), this.U).t(tL_error.text, null).j();
    }

    public final void o() {
        Path path = this.h0;
        if (path == null) {
            this.h0 = new Path();
        } else {
            path.rewind();
        }
        if (this.i0 == null) {
            this.i0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.i0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.h0.addPath(this.i0, this.g0);
        this.h0.computeBounds(this.j0, true);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(10.0f);
        float f10 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = measuredWidth + dp;
        rectF.set(dp, dp, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.J.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.m0;
            arrayList.clear();
            if (this.f0) {
                Rect rect = this.n0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z4, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: eg.i3
            @Override // java.lang.Runnable
            public final void run() {
                m3 m3Var;
                o3 o3Var = o3.this;
                Utilities.Callback callback3 = callback;
                boolean z10 = callback3 == null || (m3Var = o3Var.T) == null || !m3Var.o;
                if (z10) {
                    m3 m3Var2 = o3Var.T;
                    if (m3Var2 != null) {
                        m3Var2.a();
                    }
                    m3 m3Var3 = new m3();
                    m3Var3.p = new ArrayList();
                    m3Var3.q = new ArrayList();
                    m3Var3.t = 0.0f;
                    m3Var3.u = 0.0f;
                    o3Var.T = m3Var3;
                }
                m3 m3Var4 = o3Var.T;
                m3Var4.c = str2;
                String str4 = str;
                m3Var4.b = str4;
                m3Var4.a = str4;
                m3Var4.d = charSequence;
                m3Var4.h = z4;
                m3Var4.i = j10;
                m3Var4.j = stickerSet;
                m3Var4.k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                m3Var4.s = videoEditedInfo2;
                m3Var4.l = str3;
                m3Var4.n = callback3;
                m3Var4.m = callback2;
                ArrayList arrayList = m3Var4.q;
                if (!TextUtils.isEmpty(str4)) {
                    m3Var4.p.add(new File(m3Var4.b));
                }
                if (!TextUtils.isEmpty(m3Var4.a) && !TextUtils.equals(m3Var4.a, m3Var4.b)) {
                    arrayList.add(new File(m3Var4.a));
                }
                if (!TextUtils.isEmpty(m3Var4.l)) {
                    arrayList.add(new File(m3Var4.l));
                }
                if (z10) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        m3 m3Var5 = o3Var.T;
                        m3Var5.e = MediaDataController.getInputStickerSetItem(document3, m3Var5.c);
                        o3Var.T.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = o3Var.T.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        o3Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        m3 m3Var6 = o3Var.T;
                        String absolutePath = r6.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        m3Var6.b = absolutePath;
                        o3Var.T.r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        o3Var.T.r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(o3Var.T.r, false, false, false);
                    } else {
                        FileLoader.getInstance(o3Var.a).uploadFile(str4, false, true, 67108864);
                    }
                } else {
                    o3Var.a();
                }
                if (callback3 == null) {
                    if (o3Var.a0 == null) {
                        o3Var.a0 = new qh.m0(o3Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    o3Var.a0.setOnCancelListener(new c3(o3Var, 0));
                    if (o3Var.a0.getParent() == null) {
                        o3Var.addView(o3Var.a0, c6.e(-1, -1, 17));
                    }
                    qh.m0 m0Var = o3Var.a0;
                    m0Var.B = true;
                    m0Var.invalidate();
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

    public void setOutlineVisible(boolean z4) {
        if (this.f0 == z4) {
            return;
        }
        this.f0 = z4;
        this.e0.animate().alpha(z4 ? 1.0f : 0.0f).translationX(z4 ? 0.0f : AndroidUtilities.dp(-18.0f)).setInterpolator(pr.h).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.m0;
            arrayList.clear();
            if (this.f0) {
                Rect rect = this.n0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f10) {
        this.C = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(a3 a3Var) {
        this.V = a3Var;
    }
}
