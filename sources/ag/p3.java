package ag;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p3 extends FrameLayout implements l1, NotificationCenter.NotificationCenterDelegate {
    public static final float[] Q = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean A;
    public boolean B;
    public float C;
    public o3 D;
    public final m3 E;
    public final TextureView F;
    public final j0.a G;
    public final org.telegram.ui.Components.voip.g H;
    public float I;
    public final j3 J;
    public final h3 K;
    public r L;
    public final aa.a M;
    public final TLRPC.Document N;
    public int O;
    public long P;
    public final SvgHelper.SvgDrawable a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public af.e r;
    public final int s;
    public final int v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p3(Context context, SvgHelper.SvgDrawable svgDrawable, int i10, int i11, c6 c6Var) {
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
        paint2.setColor(i0.b.d(0.5f, g6.v0(g6.Mj, c6Var), -16777216));
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
                n3 n3Var = null;
                for (int i13 = 0; i13 < document.thumbs.size(); i13++) {
                    if (document.thumbs.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                        this.G = new j0.a(getResources(), ImageLoader.getStrippedPhotoBitmap(document.thumbs.get(i13).bytes, "b"));
                        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                        hVar.m = 4.0f;
                        hVar.g = 3.5f;
                        hVar.l = true;
                        SvgHelper.SvgDrawable svgDrawable2 = this.a;
                        hVar.o = this;
                        this.H = new org.telegram.ui.Components.voip.g(hVar, svgDrawable2);
                        n3Var = new n3(this, this.G, this.H);
                        n3Var.w = true;
                    }
                }
                this.h = FileLoader.getAttachFileName(document);
                zArr = null;
                this.n.setImage(null, null, n3Var, null, premiumPromo, 1);
                FileLoader.getInstance(this.s).loadFile(document, premiumPromo, 3, 0);
                this.N = document;
                Utilities.globalQueue.postRunnable(new a1.e(6, this, document));
                if (i11 != 1) {
                    aa.a aVar = new aa.a(2);
                    aVar.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    aVar.d = r92;
                    aVar.e = new Rect();
                    aVar.h = new Paint();
                    this.M = aVar;
                    aVar.b = AndroidUtilities.dp(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(aVar.b);
                    textPaint.setColor(i0.b.k(g6.w0(zArr, g6.Zj, false), 30));
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
                    j3 j3Var = new j3(40);
                    this.J = j3Var;
                    j3Var.o = 3.0f;
                    j3Var.N = i11;
                    if (i11 == 3 || i11 == 24 || i11 == 43) {
                        j3Var.r = 14;
                        j3Var.s = 18;
                        j3Var.t = 18;
                    } else {
                        j3Var.r = 14;
                        j3Var.s = 16;
                        j3Var.t = 15;
                    }
                    if (i11 == 43) {
                        j3Var.G = true;
                    }
                    j3Var.w = 0.98f;
                    j3Var.v = 0.98f;
                    j3Var.u = 0.98f;
                    j3Var.o = 4.0f;
                    j3Var.O = c6Var;
                    j3Var.P = g6.Zj;
                    j3Var.c();
                } else if (i11 == 2) {
                    h3 h3Var = new h3();
                    this.K = h3Var;
                    ArrayList arrayList = h3Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i17 = 0; i17 < h3Var.g; i17++) {
                            arrayList.add(new g3(h3Var));
                        }
                    }
                    int k10 = i0.b.k(g6.w0(zArr, g6.Zj, false), 80);
                    if (h3Var.i != k10) {
                        h3Var.i = k10;
                        h3Var.c.setColor(k10);
                    }
                } else if (i11 == 13) {
                    r rVar = new r();
                    this.L = rVar;
                    ArrayList arrayList2 = rVar.e;
                    if (arrayList2.isEmpty()) {
                        for (int i18 = 0; i18 < rVar.c; i18++) {
                            arrayList2.add(new q(rVar));
                        }
                    }
                } else {
                    j3 j3Var2 = new j3(SharedConfig.getDevicePerformanceClass() == 2 ? 800 : SharedConfig.getDevicePerformanceClass() == 1 ? 400 : 100);
                    this.J = j3Var2;
                    j3Var2.O = c6Var;
                    j3Var2.P = g6.Zj;
                    j3Var2.r = 4;
                    j3Var2.w = 0.98f;
                    j3Var2.v = 0.98f;
                    j3Var2.u = 0.98f;
                    j3Var2.G = true;
                    j3Var2.o = 4.0f;
                    j3Var2.H = true;
                    j3Var2.I = true;
                    j3Var2.K = true;
                    j3Var2.M = false;
                    j3Var2.c();
                }
                if (i11 != 1 || i11 == 3 || i11 == 11) {
                    this.d = true;
                }
                m3 m3Var = new m3(this, context);
                this.E = m3Var;
                m3Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.F = textureView;
                m3Var.addView(textureView);
                setWillNotDraw(false);
                addView(m3Var);
            }
        }
        zArr = null;
        if (i11 != 1) {
        }
        if (i11 != 1) {
        }
        this.d = true;
        m3 m3Var2 = new m3(this, context);
        this.E = m3Var2;
        m3Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.F = textureView2;
        m3Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(m3Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    af.e eVar = this.r;
                    if (eVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                    }
                    af.e eVar2 = new af.e(this, 6);
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
            if (this.A) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.s;
        if ((this.e != null || SharedConfig.streamMedia) && this.D == null) {
            this.E.a(this.f, 0);
            o3 o3Var = new o3(this, 0);
            this.D = o3Var;
            TextureView textureView = this.F;
            o3Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
                    sb2.append("&id=");
                    sb2.append(this.N.id);
                    sb2.append("&hash=");
                    sb2.append(this.N.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.N.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.N.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.N.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(FileLoader.getInstance(i10).getFileReference(MediaDataController.getInstance(i10).getPremiumPromo()));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.N), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.N.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.bytesToHex(bArr));
                    uri = Uri.parse("tg://" + this.h + sb2.toString());
                } catch (Exception unused) {
                    uri = null;
                }
            } else {
                uri = Uri.fromFile(this.e);
            }
            if (uri == null) {
                return;
            }
            this.D.preparePlayer(uri, false, 1.0f);
            if (!this.B) {
                this.n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.D.seekTo(this.P + 60);
            this.D.play();
        }
    }

    public final void c() {
        boolean z10 = this.w && this.x;
        if (this.y != z10) {
            this.y = z10;
            ImageReceiver imageReceiver = this.n;
            if (z10) {
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
    
        if (r2[0].length == (r5 + 1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04d4  */
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
        aa.a aVar;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        boolean z10;
        j0.a aVar2;
        org.telegram.ui.Components.voip.g gVar;
        aa.a aVar3 = this.M;
        h3 h3Var = this.K;
        int i14 = 0;
        j3 j3Var = this.J;
        if (j3Var != null || h3Var != null || this.L != null || aVar3 != null) {
            if (this.C < 0.5f) {
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
                            k1 k1Var = new k1();
                            k1Var.a = pa.f(Utilities.fastRandom, height);
                            k1Var.c = currentTimeMillis;
                            k1Var.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + 4;
                            ((ArrayList[]) aVar3.f)[i16].add(k1Var);
                        }
                        f11 = 2.0f;
                        j1[][] j1VarArr = (j1[][]) aVar3.g;
                        int i17 = 16;
                        if (j1VarArr != null) {
                            f13 = 0.2f;
                            if (j1VarArr.length == width + 1) {
                            }
                        } else {
                            f13 = 0.2f;
                        }
                        aVar3.g = new j1[width + 1][];
                        int i18 = 0;
                        while (i18 <= width) {
                            ((j1[][]) aVar3.g)[i18] = new j1[height + 1];
                            int i19 = 0;
                            while (i19 <= height) {
                                j1[][] j1VarArr2 = (j1[][]) aVar3.g;
                                j1[] j1VarArr3 = j1VarArr2[i18];
                                j1 j1Var = new j1();
                                j1Var.d = aVar3;
                                j1VarArr3[i19] = j1Var;
                                j1 j1Var2 = j1VarArr2[i18][i19];
                                j1Var2.getClass();
                                j1Var2.a = pa.f(Utilities.fastRandom, i17);
                                j1Var2.c = pa.f(Utilities.fastRandom, i17);
                                j1Var2.b = pa.f(Utilities.fastRandom, 300) + currentTimeMillis + 150;
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
                                k1 k1Var2 = (k1) arrayList2.get(i21);
                                if (currentTimeMillis - k1Var2.c > 50) {
                                    int i22 = k1Var2.a + 1;
                                    k1Var2.a = i22;
                                    k1Var2.c = currentTimeMillis;
                                    if (i22 - k1Var2.b >= height) {
                                        if (arrayList2.size() == 1) {
                                            k1Var2.a = i14;
                                            k1Var2.c = currentTimeMillis;
                                            k1Var2.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        } else {
                                            arrayList2.remove(k1Var2);
                                            i21--;
                                        }
                                    }
                                    if (k1Var2.a > k1Var2.b && i21 == arrayList2.size() - 1 && Math.abs(Utilities.fastRandom.nextInt(i15)) == 0) {
                                        k1 k1Var3 = new k1();
                                        k1Var3.a = i14;
                                        k1Var3.c = currentTimeMillis;
                                        k1Var3.b = Math.abs(Utilities.fastRandom.nextInt() % 6) + i15;
                                        arrayList2.add(k1Var3);
                                    }
                                }
                                int min = Math.min(k1Var2.a, height + 1);
                                int max = Math.max(i14, k1Var2.a - k1Var2.b);
                                while (max < min) {
                                    int i23 = aVar3.b;
                                    float f15 = i23 * i20;
                                    float f16 = i23 * max;
                                    if (((RectF) aVar3.c).contains(f15, f16)) {
                                        i10 = i20;
                                        aVar = aVar3;
                                        i11 = max;
                                        i12 = height;
                                        arrayList = arrayList2;
                                        i13 = width;
                                    } else {
                                        i10 = i20;
                                        i11 = max;
                                        float clamp = Utilities.clamp(((f14 - ((k1Var2.a - max) / (k1Var2.b - 1))) * 0.8f) + f13, 1.0f, 0.0f);
                                        j1 j1Var3 = ((j1[][]) aVar3.g)[i10][i11];
                                        aa.a aVar4 = (aa.a) j1Var3.d;
                                        i12 = height;
                                        arrayList = arrayList2;
                                        long j10 = j1Var3.b - currentTimeMillis;
                                        aVar = aVar3;
                                        if (j10 < 150) {
                                            float clamp2 = Utilities.clamp(1.0f - (j10 / 150.0f), 1.0f, 0.0f);
                                            Paint paint = (Paint) aVar4.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) aVar4.d;
                                            i13 = width;
                                            paint.setAlpha((int) org.telegram.messenger.y1.z(1.0f, clamp2, clamp, 255.0f));
                                            canvas.drawBitmap(bitmapArr[j1Var3.a], f15, f16, paint);
                                            paint.setAlpha((int) (clamp * clamp2 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[j1Var3.c], f15, f16, paint);
                                            paint.setAlpha(255);
                                            if (clamp2 >= 1.0f) {
                                                j1Var3.a = j1Var3.c;
                                                j1Var3.c = pa.f(Utilities.fastRandom, 16);
                                                j1Var3.b = pa.f(Utilities.fastRandom, 300) + currentTimeMillis + 150;
                                            }
                                        } else {
                                            i13 = width;
                                            ((Paint) aVar4.h).setAlpha((int) (clamp * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) aVar4.d)[j1Var3.a], f15, f16, (Paint) aVar4.h);
                                        }
                                        max = i11 + 1;
                                        i20 = i10;
                                        height = i12;
                                        arrayList2 = arrayList;
                                        aVar3 = aVar;
                                        width = i13;
                                        f14 = 1.0f;
                                    }
                                    max = i11 + 1;
                                    i20 = i10;
                                    height = i12;
                                    arrayList2 = arrayList;
                                    aVar3 = aVar;
                                    width = i13;
                                    f14 = 1.0f;
                                }
                                i21++;
                                height = height;
                                aVar3 = aVar3;
                                i14 = 0;
                                i15 = 4;
                                f14 = 1.0f;
                            }
                            i20++;
                            height = height;
                            aVar3 = aVar3;
                            i14 = 0;
                            i15 = 4;
                            f14 = 1.0f;
                        }
                    }
                } else {
                    f10 = 0.9f;
                    f11 = 2.0f;
                    if (j3Var != null) {
                        j3Var.d(canvas);
                    } else if (h3Var != null) {
                        if (this.D != null) {
                            float clamp3 = Utilities.clamp(r3.getCurrentPosition() / this.D.getDuration(), 1.0f, 0.0f);
                            float f17 = 1.0f / 9;
                            int i24 = (int) (clamp3 / f17);
                            int i25 = i24 + 1;
                            float w10 = com.google.android.recaptcha.internal.a.w(i24, f17, clamp3, f17);
                            float[] fArr = Q;
                            f12 = i25 < 10 ? (fArr[i25] * w10) + ((1.0f - w10) * fArr[i24]) : fArr[i24];
                        } else {
                            f12 = 0.2f;
                        }
                        h3Var.f = (((1.0f - Utilities.clamp(this.C / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f12;
                        ArrayList arrayList3 = h3Var.e;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                            g3 g3Var = (g3) arrayList3.get(i26);
                            h3 h3Var2 = g3Var.g;
                            float[] fArr2 = h3Var2.d;
                            int i27 = i26 * 4;
                            float f18 = g3Var.a;
                            fArr2[i27] = f18;
                            fArr2[i27 + 1] = g3Var.b;
                            fArr2[i27 + 2] = (AndroidUtilities.dp(30.0f) * g3Var.c) + f18;
                            fArr2[i27 + 3] = (AndroidUtilities.dp(30.0f) * g3Var.d) + g3Var.b;
                            float dp = AndroidUtilities.dp(4.0f);
                            float f19 = h3Var2.j;
                            float f20 = (f19 / 660.0f) * dp * h3Var2.f;
                            float f21 = (g3Var.c * f20) + g3Var.a;
                            g3Var.a = f21;
                            float f22 = (g3Var.d * f20) + g3Var.b;
                            g3Var.b = f22;
                            float f23 = g3Var.f;
                            if (f23 != 1.0f) {
                                float f24 = (f19 / 200.0f) + f23;
                                g3Var.f = f24;
                                if (f24 > 1.0f) {
                                    g3Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > g3Var.e || !h3Var.b.contains(f21, f22)) {
                                g3Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(h3Var.d, h3Var.c);
                    } else {
                        r rVar = this.L;
                        if (rVar != null) {
                            ArrayList arrayList4 = rVar.e;
                            System.currentTimeMillis();
                            for (int i28 = 0; i28 < arrayList4.size(); i28++) {
                                q qVar = (q) arrayList4.get(i28);
                                r rVar2 = qVar.m;
                                Paint paint2 = (Paint) rVar2.i;
                                float f25 = qVar.l;
                                if (f25 != 1.0f) {
                                    float f26 = (rVar2.b / qVar.j) + f25;
                                    qVar.l = f26;
                                    if (f26 > 1.0f) {
                                        qVar.l = 1.0f;
                                    }
                                }
                                if (qVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(qVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float B = com.google.android.recaptcha.internal.a.B(pow2, 0.4f, 0.7f, qVar.k / rVar2.a);
                                    canvas.translate(qVar.b - (qVar.h / 2.0f), qVar.c - (qVar.i / 2.0f));
                                    canvas.scale(B, B, qVar.h / 2.0f, qVar.i / 2.0f);
                                    paint2.setAlpha((int) (qVar.d * pow2));
                                    canvas.drawBitmap(qVar.f, 0.0f, 0.0f, paint2);
                                    canvas.restore();
                                }
                                if (qVar.l >= 1.0f) {
                                    qVar.a(i28, false);
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
                this.I = f27;
                z10 = this.d;
                if (z10) {
                    AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.I);
                } else {
                    AndroidUtilities.rectTmp.set(measuredWidth, -f27, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.drawRoundRect(rectF, this.I + AndroidUtilities.dp(3.0f), this.I + AndroidUtilities.dp(3.0f), this.c);
                rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                float f28 = this.I;
                Paint paint3 = this.b;
                canvas.drawRoundRect(rectF, f28, f28, paint3);
                if (z10) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float dp2 = this.I - AndroidUtilities.dp(3.0f);
                this.I = dp2;
                aVar2 = this.G;
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
                gVar = this.H;
                if (gVar != null) {
                    gVar.a = this.I;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i29 = (int) this.I;
                    imageReceiver.setRoundRadius(i29, i29, 0, 0);
                } else {
                    int i30 = (int) this.I;
                    imageReceiver.setRoundRadius(0, 0, i30, i30);
                }
                if (!this.B) {
                    imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.draw(canvas);
                }
                super.dispatchDraw(canvas);
                if (z10) {
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
        this.I = f272;
        z10 = this.d;
        if (z10) {
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF2.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF2, this.I + AndroidUtilities.dp(3.0f), this.I + AndroidUtilities.dp(3.0f), this.c);
        rectF2.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f282 = this.I;
        Paint paint32 = this.b;
        canvas.drawRoundRect(rectF2, f282, f282, paint32);
        if (z10) {
        }
        float dp22 = this.I - AndroidUtilities.dp(3.0f);
        this.I = dp22;
        aVar2 = this.G;
        if (aVar2 != null) {
        }
        gVar = this.H;
        if (gVar != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z10) {
        }
        if (!this.B) {
        }
        super.dispatchDraw(canvas);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        c();
        if (!this.B) {
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
        r rVar = this.L;
        if (rVar != null) {
            HashMap hashMap = (HashMap) rVar.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.L = null;
        }
        o3 o3Var = this.D;
        if (o3Var != null) {
            this.P = o3Var.getCurrentPosition();
            this.D.release(new l3(0));
            this.D = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.I, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.I);
        }
        if (this.O != measuredWidth) {
            this.O = measuredWidth;
            aa.a aVar = this.M;
            if (aVar != null) {
                RectF rectF = (RectF) aVar.c;
                ((Rect) aVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            j3 j3Var = this.J;
            if (j3Var != null) {
                RectF rectF2 = j3Var.c;
                RectF rectF3 = j3Var.a;
                int i14 = this.v;
                if (i14 == 6 || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 43 || i14 == 11 || i14 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    j3Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                j3Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            h3 h3Var = this.K;
            if (h3Var != null) {
                RectF rectF5 = h3Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                h3Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = h3Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((g3) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            r rVar = this.L;
            if (rVar != null) {
                ((RectF) rVar.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.L.e;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((q) arrayList2.get(i16)).a(i16, true);
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
        this.I = 0.0671f * min;
        m3 m3Var = this.E;
        m3Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = m3Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        m3Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) m3Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) m3Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override // ag.l1
    public void setOffset(float f10) {
        boolean z10;
        boolean z11 = this.d;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.C = Math.abs(measuredWidth);
            z10 = measuredWidth < 1.0f;
            if (measuredWidth < 0.1f) {
                r2 = true;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z10 = measuredWidth2 > -1.0f;
            r2 = measuredWidth2 > -0.1f;
            this.C = Math.abs(measuredWidth2);
        }
        if (z10 != this.w) {
            this.w = z10;
            c();
        }
        if (r2 != this.A) {
            this.A = r2;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.setAllowStartAnimation(r2);
            if (this.A) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            o3 o3Var = this.D;
            if (o3Var != null) {
                this.P = o3Var.getCurrentPosition();
                this.D.release(new l3(0));
                this.D = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
