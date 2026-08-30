package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u2 extends FrameLayout implements x0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] R = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean B;
    public boolean C;
    public float D;
    public t2 E;
    public final r2 F;
    public final TextureView G;
    public final j0.a H;
    public final org.telegram.ui.Components.voip.g I;
    public float J;
    public final p2 K;
    public final n2 L;
    public p M;
    public final da.a N;
    public final TLRPC.Document O;
    public int P;
    public long Q;
    public final SvgHelper.SvgDrawable a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public ef.e r;
    public final int s;
    public final int v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u2(Context context, SvgHelper.SvgDrawable svgDrawable, int i10, int i11, f6 f6Var) {
        super(context);
        boolean[] zArr;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i10;
        this.v = i11;
        this.a = svgDrawable;
        paint.setColor(-16777216);
        paint2.setColor(i0.a.d(0.5f, j6.v0(j6.Mj, f6Var), -16777216));
        imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo();
        String l02 = PremiumPreviewFragment.l0(i11);
        if (premiumPromo != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= premiumPromo.video_sections.size()) {
                    i12 = -1;
                    break;
                } else if (premiumPromo.video_sections.get(i12).equals(l02)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                TLRPC.Document document = premiumPromo.videos.get(i12);
                s2 s2Var = null;
                for (int i13 = 0; i13 < document.thumbs.size(); i13++) {
                    if (document.thumbs.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                        this.H = new j0.a(getResources(), ImageLoader.getStrippedPhotoBitmap(document.thumbs.get(i13).bytes, "b"));
                        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                        hVar.m = 4.0f;
                        hVar.g = 3.5f;
                        hVar.l = true;
                        SvgHelper.SvgDrawable svgDrawable2 = this.a;
                        hVar.o = this;
                        this.I = new org.telegram.ui.Components.voip.g(hVar, svgDrawable2);
                        s2Var = new s2(this, this.H, this.I);
                        s2Var.w = true;
                    }
                }
                this.h = FileLoader.getAttachFileName(document);
                zArr = null;
                this.n.setImage(null, null, s2Var, null, premiumPromo, 1);
                FileLoader.getInstance(this.s).loadFile(document, premiumPromo, 3, 0);
                this.O = document;
                Utilities.globalQueue.postRunnable(new a1.e(26, this, document));
                if (i11 != 1) {
                    da.a aVar = new da.a(2);
                    aVar.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    aVar.d = r92;
                    aVar.e = new Rect();
                    aVar.h = new Paint();
                    this.N = aVar;
                    aVar.b = AndroidUtilities.dp(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(aVar.b);
                    textPaint.setColor(i0.a.k(j6.w0(zArr, j6.Zj, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i14 = 0;
                    while (i14 < 16) {
                        int i15 = i14 < 10 ? i14 + 48 : i14 + 55;
                        int i16 = aVar.b;
                        r92[i14] = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i14]).drawText(Character.toString((char) i15), r13 >> 1, aVar.b, textPaint);
                        i14++;
                    }
                } else if (i11 == 6 || i11 == 9 || i11 == 3 || i11 == 7 || i11 == 11 || i11 == 4 || i11 == 24 || i11 == 43) {
                    p2 p2Var = new p2(40);
                    this.K = p2Var;
                    p2Var.o = 3.0f;
                    p2Var.N = i11;
                    if (i11 == 3 || i11 == 24 || i11 == 43) {
                        p2Var.r = 14;
                        p2Var.s = 18;
                        p2Var.t = 18;
                    } else {
                        p2Var.r = 14;
                        p2Var.s = 16;
                        p2Var.t = 15;
                    }
                    if (i11 == 43) {
                        p2Var.G = true;
                    }
                    p2Var.w = 0.98f;
                    p2Var.v = 0.98f;
                    p2Var.u = 0.98f;
                    p2Var.o = 4.0f;
                    p2Var.O = f6Var;
                    p2Var.P = j6.Zj;
                    p2Var.c();
                } else if (i11 == 2) {
                    n2 n2Var = new n2();
                    this.L = n2Var;
                    ArrayList arrayList = n2Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i17 = 0; i17 < n2Var.g; i17++) {
                            arrayList.add(new m2(n2Var));
                        }
                    }
                    int k10 = i0.a.k(j6.w0(zArr, j6.Zj, false), 80);
                    if (n2Var.i != k10) {
                        n2Var.i = k10;
                        n2Var.c.setColor(k10);
                    }
                } else if (i11 == 13) {
                    p pVar = new p();
                    this.M = pVar;
                    ArrayList arrayList2 = pVar.e;
                    if (arrayList2.isEmpty()) {
                        for (int i18 = 0; i18 < pVar.c; i18++) {
                            arrayList2.add(new o(pVar));
                        }
                    }
                } else {
                    p2 p2Var2 = new p2(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
                    this.K = p2Var2;
                    p2Var2.O = f6Var;
                    p2Var2.P = j6.Zj;
                    p2Var2.r = 4;
                    p2Var2.w = 0.98f;
                    p2Var2.v = 0.98f;
                    p2Var2.u = 0.98f;
                    p2Var2.G = true;
                    p2Var2.o = 4.0f;
                    p2Var2.H = true;
                    p2Var2.I = true;
                    p2Var2.K = true;
                    p2Var2.M = false;
                    p2Var2.c();
                }
                if (i11 != 1 || i11 == 3 || i11 == 11) {
                    this.d = true;
                }
                r2 r2Var = new r2(this, context);
                this.F = r2Var;
                r2Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.G = textureView;
                r2Var.addView(textureView);
                setWillNotDraw(false);
                addView(r2Var);
            }
        }
        zArr = null;
        if (i11 != 1) {
        }
        if (i11 != 1) {
        }
        this.d = true;
        r2 r2Var2 = new r2(this, context);
        this.F = r2Var2;
        r2Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.G = textureView2;
        r2Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(r2Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    ef.e eVar = this.r;
                    if (eVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                    }
                    ef.e eVar2 = new ef.e(this, 6);
                    this.r = eVar2;
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f = 0.671f;
                }
            }
            if (this.B) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.s;
        if ((this.e != null || SharedConfig.streamMedia) && this.E == null) {
            this.F.a(this.f, 0);
            t2 t2Var = new t2(this, 0);
            this.E = t2Var;
            TextureView textureView = this.G;
            t2Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i10);
                    sb.append("&id=");
                    sb.append(this.O.id);
                    sb.append("&hash=");
                    sb.append(this.O.access_hash);
                    sb.append("&dc=");
                    sb.append(this.O.dc_id);
                    sb.append("&size=");
                    sb.append(this.O.size);
                    sb.append("&mime=");
                    sb.append(URLEncoder.encode(this.O.mime_type, "UTF-8"));
                    sb.append("&rid=");
                    sb.append(FileLoader.getInstance(i10).getFileReference(MediaDataController.getInstance(i10).getPremiumPromo()));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.O), "UTF-8"));
                    sb.append("&reference=");
                    byte[] bArr = this.O.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb.append(Utilities.bytesToHex(bArr));
                    uri = Uri.parse("tg://" + this.h + sb.toString());
                } catch (Exception unused) {
                    uri = null;
                }
            } else {
                uri = Uri.fromFile(this.e);
            }
            if (uri == null) {
                return;
            }
            this.E.preparePlayer(uri, false, 1.0f);
            if (!this.C) {
                this.n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.E.seekTo(this.Q + 60);
            this.E.play();
        }
    }

    public final void c() {
        boolean z4 = this.w && this.x;
        if (this.y != z4) {
            this.y = z4;
            ImageReceiver imageReceiver = this.n;
            if (z4) {
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.e = (File) objArr[1];
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r10.length != (r8 + 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if (r2[0].length == (r4 + 1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04cb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        da.a aVar;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean z4;
        j0.a aVar2;
        org.telegram.ui.Components.voip.g gVar;
        da.a aVar3 = this.N;
        n2 n2Var = this.L;
        int i14 = 0;
        p2 p2Var = this.K;
        if (p2Var != null || n2Var != null || this.M != null || aVar3 != null) {
            if (this.D < 0.5f) {
                float pow = (float) Math.pow(1.0f - r9, 2.0d);
                canvas.save();
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (aVar3 != null) {
                    Rect rect = (Rect) aVar3.e;
                    int width = rect.width() / aVar3.b;
                    int height = rect.height() / aVar3.b;
                    if (width == 0 || height == 0) {
                        f10 = 0.9f;
                        f11 = 2.0f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) aVar3.f;
                        int i15 = 4;
                        if (arrayListArr != null) {
                            f10 = 0.9f;
                        } else {
                            f10 = 0.9f;
                        }
                        aVar3.f = new ArrayList[width + 1];
                        for (int i16 = 0; i16 <= width; i16++) {
                            ((ArrayList[]) aVar3.f)[i16] = new ArrayList();
                            w0 w0Var = new w0();
                            w0Var.a = yh.g(Utilities.fastRandom, height);
                            w0Var.c = currentTimeMillis;
                            w0Var.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) aVar3.f)[i16].add(w0Var);
                        }
                        f11 = 2.0f;
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) aVar3.g;
                        int i17 = 16;
                        if (h1VarArr != null) {
                            f13 = 0.2f;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            f13 = 0.2f;
                        }
                        aVar3.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        int i18 = 0;
                        while (i18 <= width) {
                            ((com.google.android.gms.internal.play_billing.h1[][]) aVar3.g)[i18] = new com.google.android.gms.internal.play_billing.h1[height + 1];
                            int i19 = 0;
                            while (i19 <= height) {
                                com.google.android.gms.internal.play_billing.h1[][] h1VarArr2 = (com.google.android.gms.internal.play_billing.h1[][]) aVar3.g;
                                com.google.android.gms.internal.play_billing.h1[] h1VarArr3 = h1VarArr2[i18];
                                com.google.android.gms.internal.play_billing.h1 h1Var = new com.google.android.gms.internal.play_billing.h1();
                                h1Var.d = aVar3;
                                h1VarArr3[i19] = h1Var;
                                com.google.android.gms.internal.play_billing.h1 h1Var2 = h1VarArr2[i18][i19];
                                h1Var2.getClass();
                                h1Var2.a = yh.g(Utilities.fastRandom, i17);
                                h1Var2.b = yh.g(Utilities.fastRandom, i17);
                                h1Var2.c = yh.g(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                i19++;
                                i17 = 16;
                            }
                            i18++;
                            i17 = 16;
                        }
                        float f14 = 1.0f;
                        int i20 = 0;
                        while (i20 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) aVar3.f)[i20];
                            int i21 = 0;
                            while (i21 < arrayList2.size()) {
                                w0 w0Var2 = (w0) arrayList2.get(i21);
                                if (currentTimeMillis - w0Var2.c > 50) {
                                    int i22 = w0Var2.a + 1;
                                    w0Var2.a = i22;
                                    w0Var2.c = currentTimeMillis;
                                    if (i22 - w0Var2.b >= height) {
                                        if (arrayList2.size() == 1) {
                                            w0Var2.a = i14;
                                            w0Var2.c = currentTimeMillis;
                                            w0Var2.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        } else {
                                            arrayList2.remove(w0Var2);
                                            i21--;
                                        }
                                    }
                                    if (w0Var2.a > w0Var2.b && i21 == arrayList2.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(i15)) == 0) {
                                        w0 w0Var3 = new w0();
                                        w0Var3.a = i14;
                                        w0Var3.c = currentTimeMillis;
                                        w0Var3.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        arrayList2.add(w0Var3);
                                    }
                                }
                                int min = Math.min(w0Var2.a, height + 1);
                                int max = Math.max(i14, w0Var2.a - w0Var2.b);
                                while (max < min) {
                                    int i23 = aVar3.b;
                                    float f15 = i23 * i20;
                                    float f16 = i23 * max;
                                    if (((RectF) aVar3.c).contains(f15, f16)) {
                                        i10 = i20;
                                        aVar = aVar3;
                                        i11 = height;
                                        i12 = max;
                                        arrayList = arrayList2;
                                        i13 = width;
                                    } else {
                                        i10 = i20;
                                        i11 = height;
                                        float clamp = Utilities.clamp(((f14 - ((w0Var2.a - max) / (w0Var2.b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) aVar3.g)[i10][max];
                                        da.a aVar4 = (da.a) h1Var3.d;
                                        i12 = max;
                                        arrayList = arrayList2;
                                        long j10 = h1Var3.c - currentTimeMillis;
                                        aVar = aVar3;
                                        if (j10 < 150) {
                                            float clamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                            Paint paint = (Paint) aVar4.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) aVar4.d;
                                            i13 = width;
                                            paint.setAlpha((int) y3.y(1.0f, clamp2, clamp, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f15, f16, paint);
                                            paint.setAlpha((int) (clamp * clamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f15, f16, paint);
                                            paint.setAlpha(255);
                                            if (clamp2 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = yh.g(Utilities.fastRandom, 16);
                                                h1Var3.c = yh.g(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                            }
                                        } else {
                                            i13 = width;
                                            ((Paint) aVar4.h).setAlpha((int) (clamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) aVar4.d)[h1Var3.a], f15, f16, (Paint) aVar4.h);
                                        }
                                        max = i12 + 1;
                                        i20 = i10;
                                        height = i11;
                                        arrayList2 = arrayList;
                                        aVar3 = aVar;
                                        width = i13;
                                        f14 = 1.0f;
                                    }
                                    max = i12 + 1;
                                    i20 = i10;
                                    height = i11;
                                    arrayList2 = arrayList;
                                    aVar3 = aVar;
                                    width = i13;
                                    f14 = 1.0f;
                                }
                                i21++;
                                aVar3 = aVar3;
                                i14 = 0;
                                i15 = 4;
                                f14 = 1.0f;
                            }
                            i20++;
                            aVar3 = aVar3;
                            i14 = 0;
                            i15 = 4;
                            f14 = 1.0f;
                        }
                    }
                } else {
                    f10 = 0.9f;
                    f11 = 2.0f;
                    if (p2Var != null) {
                        p2Var.d(canvas);
                    } else if (n2Var != null) {
                        if (this.E != null) {
                            float clamp3 = Utilities.clamp(r3.getCurrentPosition() / this.E.getDuration(), 1.0f, 0.0f);
                            float f17 = 1.0f / 9;
                            int i24 = (int) (clamp3 / f17);
                            int i25 = i24 + 1;
                            float d = e2.c.d(i24, f17, clamp3, f17);
                            float[] fArr = R;
                            f12 = i25 < 10 ? (fArr[i25] * d) + ((1.0f - d) * fArr[i24]) : fArr[i24];
                        } else {
                            f12 = 0.2f;
                        }
                        n2Var.f = (((1.0f - Utilities.clamp(this.D / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f12;
                        ArrayList arrayList3 = n2Var.e;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                            m2 m2Var = (m2) arrayList3.get(i26);
                            n2 n2Var2 = m2Var.g;
                            float[] fArr2 = n2Var2.d;
                            int i27 = i26 * 4;
                            float f18 = m2Var.a;
                            fArr2[i27] = f18;
                            fArr2[i27 + 1] = m2Var.b;
                            fArr2[i27 + 2] = (AndroidUtilities.dp(30.0f) * m2Var.c) + f18;
                            fArr2[i27 + 3] = (AndroidUtilities.dp(30.0f) * m2Var.d) + m2Var.b;
                            float dp = AndroidUtilities.dp(4.0f);
                            float f19 = n2Var2.j;
                            float f20 = (f19 / 660.0f) * dp * n2Var2.f;
                            float f21 = (m2Var.c * f20) + m2Var.a;
                            m2Var.a = f21;
                            float f22 = (m2Var.d * f20) + m2Var.b;
                            m2Var.b = f22;
                            float f23 = m2Var.f;
                            if (f23 != 1.0f) {
                                float f24 = (f19 / 200.0f) + f23;
                                m2Var.f = f24;
                                if (f24 > 1.0f) {
                                    m2Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > m2Var.e || !n2Var.b.contains(f21, f22)) {
                                m2Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(n2Var.d, n2Var.c);
                    } else {
                        p pVar = this.M;
                        if (pVar != null) {
                            ArrayList arrayList4 = pVar.e;
                            System.currentTimeMillis();
                            for (int i28 = 0; i28 < arrayList4.size(); i28++) {
                                o oVar = (o) arrayList4.get(i28);
                                p pVar2 = oVar.m;
                                Paint paint2 = (Paint) pVar2.i;
                                float f25 = oVar.l;
                                if (f25 != 1.0f) {
                                    float f26 = (pVar2.b / oVar.j) + f25;
                                    oVar.l = f26;
                                    if (f26 > 1.0f) {
                                        oVar.l = 1.0f;
                                    }
                                }
                                if (oVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(oVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float y10 = e2.c.y(pow2, 0.4f, 0.7f, oVar.k / pVar2.a);
                                    canvas.translate(oVar.b - (oVar.h / 2.0f), oVar.c - (oVar.i / 2.0f));
                                    canvas.scale(y10, y10, oVar.h / 2.0f, oVar.i / 2.0f);
                                    paint2.setAlpha((int) (oVar.d * pow2));
                                    canvas.drawBitmap(oVar.f, 0.0f, 0.0f, paint2);
                                    canvas.restore();
                                }
                                if (oVar.l >= 1.0f) {
                                    oVar.a(i28, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / f11;
                float f27 = 0.0671f * min2;
                this.J = f27;
                z4 = this.d;
                if (z4) {
                    AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.J);
                } else {
                    AndroidUtilities.rectTmp.set(measuredWidth, -f27, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.drawRoundRect(rectF, this.J + AndroidUtilities.dp(3.0f), this.J + AndroidUtilities.dp(3.0f), this.c);
                rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                float f28 = this.J;
                Paint paint3 = this.b;
                canvas.drawRoundRect(rectF, f28, f28, paint3);
                if (z4) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float dp2 = this.J - AndroidUtilities.dp(3.0f);
                this.J = dp2;
                aVar2 = this.H;
                if (aVar2 != null) {
                    Paint paint4 = aVar2.d;
                    if (aVar2.g != dp2) {
                        if (dp2 > 0.05f) {
                            paint4.setShader(aVar2.e);
                        } else {
                            paint4.setShader(null);
                        }
                        aVar2.g = dp2;
                        aVar2.invalidateSelf();
                    }
                }
                gVar = this.I;
                if (gVar != null) {
                    gVar.a = this.J;
                }
                ImageReceiver imageReceiver = this.n;
                if (z4) {
                    int i29 = (int) this.J;
                    imageReceiver.setRoundRadius(i29, i29, 0, 0);
                } else {
                    int i30 = (int) this.J;
                    imageReceiver.setRoundRadius(0, 0, i30, i30);
                }
                if (!this.C) {
                    imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.draw(canvas);
                }
                super.dispatchDraw(canvas);
                if (z4) {
                    canvas.drawCircle(imageReceiver.getCenterX(), imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), paint3);
                    return;
                }
                return;
            }
        }
        f10 = 0.9f;
        f11 = 2.0f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f10);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / f11;
        float f272 = 0.0671f * min22;
        this.J = f272;
        z4 = this.d;
        if (z4) {
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, this.J + AndroidUtilities.dp(3.0f), this.J + AndroidUtilities.dp(3.0f), this.c);
        rectF2.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f282 = this.J;
        Paint paint32 = this.b;
        canvas.drawRoundRect(rectF2, f282, f282, paint32);
        if (z4) {
        }
        float dp22 = this.J - AndroidUtilities.dp(3.0f);
        this.J = dp22;
        aVar2 = this.H;
        if (aVar2 != null) {
        }
        gVar = this.I;
        if (gVar != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z4) {
        }
        if (!this.C) {
        }
        super.dispatchDraw(canvas);
        if (z4) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        c();
        if (!this.C) {
            a();
        }
        NotificationCenter.getInstance(this.s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
        c();
        NotificationCenter.getInstance(this.s).removeObserver(this, NotificationCenter.fileLoaded);
        p pVar = this.M;
        if (pVar != null) {
            HashMap hashMap = (HashMap) pVar.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.M = null;
        }
        t2 t2Var = this.E;
        if (t2Var != null) {
            this.Q = t2Var.getCurrentPosition();
            this.E.release(new cg.n0(5));
            this.E = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.J, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.J);
        }
        if (this.P != measuredWidth) {
            this.P = measuredWidth;
            da.a aVar = this.N;
            if (aVar != null) {
                RectF rectF = (RectF) aVar.c;
                ((Rect) aVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            p2 p2Var = this.K;
            if (p2Var != null) {
                RectF rectF2 = p2Var.c;
                RectF rectF3 = p2Var.a;
                int i14 = this.v;
                if (i14 == 6 || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 43 || i14 == 11 || i14 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    p2Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                p2Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            n2 n2Var = this.L;
            if (n2Var != null) {
                RectF rectF5 = n2Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                n2Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = n2Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((m2) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            p pVar = this.M;
            if (pVar != null) {
                ((RectF) pVar.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.M.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.M.g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.M.e;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((o) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.J = 0.0671f * min;
        r2 r2Var = this.F;
        r2Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = r2Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        r2Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) r2Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) r2Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override // eg.x0
    public void setOffset(float f10) {
        boolean z4;
        boolean z10 = this.d;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z10) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.D = Math.abs(measuredWidth);
            z4 = measuredWidth < 1.0f;
            if (measuredWidth < 0.1f) {
                r2 = true;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z10) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z4 = measuredWidth2 > -1.0f;
            r2 = measuredWidth2 > -0.1f;
            this.D = Math.abs(measuredWidth2);
        }
        if (z4 != this.w) {
            this.w = z4;
            c();
        }
        if (r2 != this.B) {
            this.B = r2;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.setAllowStartAnimation(r2);
            if (this.B) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            t2 t2Var = this.E;
            if (t2Var != null) {
                this.Q = t2Var.getCurrentPosition();
                this.E.release(new cg.n0(5));
                this.E = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
