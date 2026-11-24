// default package

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class acc extends FrameLayout implements qr7, gk7 {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public ok2 I;
    public final ybc J;
    public final TextureView K;
    public final bm9 L;
    public final vd1 M;
    public float N;
    public final bra O;
    public final ela P;
    public yd5 Q;
    public final ha R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final kcb a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public kbc r;
    public final int s;
    public final byte w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public acc(Context context, kcb kcbVar, int i, int i2, wjb wjbVar) {
        super(context);
        boolean z;
        byte b = 1;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.d = false;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        this.s = i;
        this.w = i2;
        this.a = kcbVar;
        paint.setColor(-16777216);
        paint2.setColor(bm2.f(0.5f, bkb.v0(bkb.Ck, wjbVar), -16777216));
        imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo = hq6.d0(i).E;
        String o0 = PremiumPreviewFragment.o0(i2);
        byte b2 = 24;
        if (tL_help_premiumPromo != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= tL_help_premiumPromo.video_sections.size()) {
                    i3 = -1;
                    break;
                } else if (tL_help_premiumPromo.video_sections.get(i3).equals(o0)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 >= 0) {
                TLRPC.Document document = tL_help_premiumPromo.videos.get(i3);
                zbc zbcVar = null;
                for (int i4 = 0; i4 < document.thumbs.size(); i4++) {
                    if (document.thumbs.get(i4) instanceof TLRPC.TL_photoStrippedSize) {
                        this.L = new bm9(getResources(), fl5.B("b", document.thumbs.get(i4).bytes));
                        wd1 wd1Var = new wd1();
                        wd1Var.m = 4.0f;
                        wd1Var.g = 3.5f;
                        wd1Var.l = true;
                        kcb kcbVar2 = this.a;
                        wd1Var.o = this;
                        this.M = new vd1(wd1Var, kcbVar2);
                        zbcVar = new zbc(this, this.L, this.M);
                        zbcVar.x = true;
                    }
                }
                this.h = ba4.r(null, document);
                z = 3;
                this.n.d0(null, null, zbcVar, null, tL_help_premiumPromo, 1);
                ba4.G(this.s).X(document, tL_help_premiumPromo, 3, 0);
                this.S = document;
                Utilities.e.c(new l3c(this, document, b2));
                if (i2 != 1) {
                    ha haVar = new ha(b);
                    haVar.c = new RectF();
                    ?? r6 = new Bitmap[16];
                    haVar.d = r6;
                    haVar.e = new Rect();
                    haVar.h = new Paint();
                    this.R = haVar;
                    haVar.b = gl.L(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(gl.n1("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(haVar.b);
                    textPaint.setColor(bm2.o(bkb.w0(null, bkb.Pk, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i5 = 0;
                    while (i5 < 16) {
                        int i6 = i5 < 10 ? i5 + 48 : i5 + 55;
                        int i7 = haVar.b;
                        r6[i5] = Bitmap.createBitmap(i7, i7, Bitmap.Config.ARGB_8888);
                        new Canvas(r6[i5]).drawText(Character.toString((char) i6), r13 >> 1, haVar.b, textPaint);
                        i5++;
                    }
                } else if (i2 == 6 || i2 == 9 || i2 == z || i2 == 7 || i2 == 11 || i2 == 4 || i2 == 24 || i2 == 43) {
                    bra braVar = new bra(40);
                    this.O = braVar;
                    braVar.o = 3.0f;
                    braVar.N = i2;
                    if (i2 == z || i2 == 24 || i2 == 43) {
                        braVar.r = (byte) 14;
                        braVar.s = (byte) 18;
                        braVar.t = (byte) 18;
                    } else {
                        braVar.r = (byte) 14;
                        braVar.s = (byte) 16;
                        braVar.t = (byte) 15;
                    }
                    if (i2 == 43) {
                        braVar.G = true;
                    }
                    braVar.w = 0.98f;
                    braVar.v = 0.98f;
                    braVar.u = 0.98f;
                    braVar.o = 4.0f;
                    braVar.O = wjbVar;
                    braVar.P = bkb.Pk;
                    braVar.c();
                } else if (i2 == 2) {
                    ela elaVar = new ela();
                    this.P = elaVar;
                    ArrayList arrayList = elaVar.e;
                    if (arrayList.isEmpty()) {
                        for (int i8 = 0; i8 < 200; i8++) {
                            arrayList.add(new dla(elaVar));
                        }
                    }
                    int o = bm2.o(bkb.w0(null, bkb.Pk, false), 80);
                    if (elaVar.g != o) {
                        elaVar.g = o;
                        elaVar.c.setColor(o);
                    }
                } else if (i2 == 13) {
                    yd5 yd5Var = new yd5();
                    this.Q = yd5Var;
                    ArrayList arrayList2 = yd5Var.g;
                    if (arrayList2.isEmpty()) {
                        for (int i9 = 0; i9 < 25; i9++) {
                            arrayList2.add(new xd5(yd5Var));
                        }
                    }
                } else {
                    bra braVar2 = new bra(gba.o() == 2 ? 800 : gba.o() == 1 ? 400 : 100);
                    this.O = braVar2;
                    braVar2.O = wjbVar;
                    braVar2.P = bkb.Pk;
                    braVar2.r = (byte) 4;
                    braVar2.w = 0.98f;
                    braVar2.v = 0.98f;
                    braVar2.u = 0.98f;
                    braVar2.G = true;
                    braVar2.o = 4.0f;
                    braVar2.H = true;
                    braVar2.J = true;
                    braVar2.L = false;
                    braVar2.c();
                }
                if (i2 != 1 || i2 == z || i2 == 11) {
                    this.d = true;
                }
                ybc ybcVar = new ybc(this, context);
                this.J = ybcVar;
                ybcVar.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.K = textureView;
                ybcVar.addView(textureView);
                setWillNotDraw(false);
                addView(ybcVar);
            }
        }
        z = 3;
        if (i2 != 1) {
        }
        if (i2 != 1) {
        }
        this.d = true;
        ybc ybcVar2 = new ybc(this, context);
        this.J = ybcVar2;
        ybcVar2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.K = textureView2;
        ybcVar2.addView(textureView2);
        setWillNotDraw(false);
        addView(ybcVar2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || gba.x0) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((kk7.e().p & 512) != 0) {
                    kbc kbcVar = this.r;
                    if (kbcVar != null) {
                        gl.r(kbcVar);
                    }
                    kbc kbcVar2 = new kbc(this, (byte) 2);
                    this.r = kbcVar2;
                    gl.d3(kbcVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f = 0.671f;
                }
            }
            if (this.F) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        TLRPC.Document document = this.S;
        int i = this.s;
        if ((this.e != null || gba.x0) && this.I == null) {
            this.J.a(this.f, 0);
            ok2 ok2Var = new ok2(this, (byte) 1);
            this.I = ok2Var;
            TextureView textureView = this.K;
            ok2Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb = new StringBuilder("?account=");
                    sb.append(i);
                    sb.append("&id=");
                    sb.append(document.id);
                    sb.append("&hash=");
                    sb.append(document.access_hash);
                    sb.append("&dc=");
                    sb.append(document.dc_id);
                    sb.append("&size=");
                    sb.append(document.size);
                    sb.append("&mime=");
                    sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                    sb.append("&rid=");
                    sb.append(ba4.G(i).F(hq6.d0(i).E));
                    sb.append("&name=");
                    sb.append(URLEncoder.encode(ba4.B(document), "UTF-8"));
                    sb.append("&reference=");
                    byte[] bArr = document.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb.append(Utilities.f(bArr));
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
            this.I.preparePlayer(uri, false, 1.0f);
            if (!this.G) {
                this.n.x0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z = this.x && this.y;
        if (this.E != z) {
            this.E = z;
            ImageReceiver imageReceiver = this.n;
            if (z) {
                imageReceiver.I();
            } else {
                imageReceiver.K();
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            this.e = (File) objArr[1];
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x006c, code lost:
    
        if (r5.length != (r3 + 1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
    
        if (r5[0].length == (r2 + 1)) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        long j;
        long j2;
        int i2;
        int min;
        int max;
        int i3;
        int i4;
        ha haVar;
        int i5;
        boolean z;
        RectF rectF;
        float L;
        bm9 bm9Var;
        vd1 vd1Var;
        ha haVar2 = this.R;
        ela elaVar = this.P;
        int i6 = 1;
        int i7 = 0;
        bra braVar = this.O;
        if (braVar != null || elaVar != null || this.Q != null || haVar2 != null) {
            float f5 = 0.5f;
            if (this.H < 0.5f) {
                float f6 = 1.0f;
                f = 0.9f;
                double d = 2.0d;
                float pow = (float) Math.pow(1.0f - r11, 2.0d);
                canvas.save();
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (haVar2 != null) {
                    Rect rect = (Rect) haVar2.e;
                    int width = rect.width() / haVar2.b;
                    int height = rect.height() / haVar2.b;
                    if (width != 0 && height != 0) {
                        float f7 = 150.0f;
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) haVar2.f;
                        int i8 = 4;
                        if (arrayListArr != null) {
                            f4 = 0.2f;
                        } else {
                            f4 = 0.2f;
                        }
                        haVar2.f = new ArrayList[width + 1];
                        for (int i9 = 0; i9 <= width; i9++) {
                            ((ArrayList[]) haVar2.f)[i9] = new ArrayList();
                            lj6 lj6Var = new lj6();
                            yyc yycVar = Utilities.c;
                            lj6Var.a = Math.abs(((int) yycVar.nextLong()) % height);
                            lj6Var.c = currentTimeMillis;
                            lj6Var.b = Math.abs(((int) yycVar.nextLong()) % 6) + 4;
                            ((ArrayList[]) haVar2.f)[i9].add(lj6Var);
                        }
                        kj6[][] kj6VarArr = (kj6[][]) haVar2.g;
                        if (kj6VarArr != null) {
                            j = 150;
                            if (kj6VarArr.length == width + 1) {
                            }
                        } else {
                            j = 150;
                        }
                        haVar2.g = new kj6[width + 1][];
                        int i10 = 0;
                        while (i10 <= width) {
                            ((kj6[][]) haVar2.g)[i10] = new kj6[height + 1];
                            int i11 = 0;
                            while (i11 <= height) {
                                kj6[][] kj6VarArr2 = (kj6[][]) haVar2.g;
                                kj6[] kj6VarArr3 = kj6VarArr2[i10];
                                float f8 = f7;
                                kj6 kj6Var = new kj6();
                                kj6Var.d = haVar2;
                                kj6VarArr3[i11] = kj6Var;
                                kj6 kj6Var2 = kj6VarArr2[i10][i11];
                                kj6Var2.getClass();
                                yyc yycVar2 = Utilities.c;
                                kj6Var2.b = Math.abs(((int) yycVar2.nextLong()) % 16);
                                kj6Var2.c = Math.abs(((int) yycVar2.nextLong()) % 16);
                                kj6Var2.a = Math.abs(((int) yycVar2.nextLong()) % kk7.W4) + currentTimeMillis + j;
                                i11++;
                                f6 = f6;
                                f7 = f8;
                            }
                            i10++;
                            f7 = f7;
                        }
                        float f9 = f7;
                        float f10 = f6;
                        int i12 = 0;
                        while (i12 <= width) {
                            ArrayList arrayList = ((ArrayList[]) haVar2.f)[i12];
                            int i13 = i7;
                            while (i13 < arrayList.size()) {
                                lj6 lj6Var2 = (lj6) arrayList.get(i13);
                                int i14 = i8;
                                if (currentTimeMillis - lj6Var2.c > 50) {
                                    int i15 = lj6Var2.a + i6;
                                    lj6Var2.a = i15;
                                    lj6Var2.c = currentTimeMillis;
                                    if (i15 - lj6Var2.b >= height) {
                                        if (arrayList.size() == i6) {
                                            lj6Var2.a = 0;
                                            lj6Var2.c = currentTimeMillis;
                                            lj6Var2.b = Math.abs(((int) Utilities.c.nextLong()) % 6) + 4;
                                        } else {
                                            arrayList.remove(lj6Var2);
                                            i13--;
                                        }
                                    }
                                    if (lj6Var2.a > lj6Var2.b && i13 == arrayList.size() - i6) {
                                        yyc yycVar3 = Utilities.c;
                                        if (Math.abs(yycVar3.nextInt(i14)) == 0) {
                                            i2 = i6;
                                            lj6 lj6Var3 = new lj6();
                                            lj6Var3.a = 0;
                                            lj6Var3.c = currentTimeMillis;
                                            j2 = currentTimeMillis;
                                            lj6Var3.b = Math.abs(((int) yycVar3.nextLong()) % 6) + i14;
                                            arrayList.add(lj6Var3);
                                        } else {
                                            i2 = i6;
                                            j2 = currentTimeMillis;
                                        }
                                        min = Math.min(lj6Var2.a, height + 1);
                                        max = Math.max(0, lj6Var2.a - lj6Var2.b);
                                        while (max < min) {
                                            int i16 = haVar2.b;
                                            float f11 = i16 * i12;
                                            float f12 = i16 * max;
                                            if (((RectF) haVar2.c).contains(f11, f12)) {
                                                i3 = height;
                                                i4 = width;
                                                haVar = haVar2;
                                                i5 = i12;
                                            } else {
                                                float i17 = Utilities.i(((f10 - ((lj6Var2.a - max) / (lj6Var2.b - 1))) * 0.8f) + f4, f10, 0.0f);
                                                kj6 kj6Var3 = ((kj6[][]) haVar2.g)[i12][max];
                                                ha haVar3 = (ha) kj6Var3.d;
                                                i3 = height;
                                                i4 = width;
                                                long j3 = kj6Var3.a - j2;
                                                haVar = haVar2;
                                                if (j3 < j) {
                                                    float i18 = Utilities.i(1.0f - (j3 / f9), 1.0f, 0.0f);
                                                    Paint paint = (Paint) haVar3.h;
                                                    Bitmap[] bitmapArr = (Bitmap[]) haVar3.d;
                                                    i5 = i12;
                                                    paint.setAlpha((int) tb4.z(1.0f, i18, i17, 255.0f));
                                                    canvas.drawBitmap(bitmapArr[kj6Var3.b], f11, f12, paint);
                                                    paint.setAlpha((int) (i17 * i18 * 255.0f));
                                                    canvas.drawBitmap(bitmapArr[kj6Var3.c], f11, f12, paint);
                                                    paint.setAlpha(kk7.d4);
                                                    if (i18 >= 1.0f) {
                                                        kj6Var3.b = kj6Var3.c;
                                                        kj6Var3.c = Math.abs(((int) Utilities.c.nextLong()) % 16);
                                                        kj6Var3.a = j2 + Math.abs(((int) r2.nextLong()) % kk7.W4) + j;
                                                    }
                                                } else {
                                                    i5 = i12;
                                                    ((Paint) haVar3.h).setAlpha((int) (i17 * 255.0f));
                                                    canvas.drawBitmap(((Bitmap[]) haVar3.d)[kj6Var3.b], f11, f12, (Paint) haVar3.h);
                                                }
                                            }
                                            max++;
                                            width = i4;
                                            height = i3;
                                            haVar2 = haVar;
                                            i12 = i5;
                                            f10 = 1.0f;
                                        }
                                        i13++;
                                        i6 = i2;
                                        currentTimeMillis = j2;
                                        i8 = 4;
                                        f10 = 1.0f;
                                    }
                                }
                                j2 = currentTimeMillis;
                                i2 = i6;
                                min = Math.min(lj6Var2.a, height + 1);
                                max = Math.max(0, lj6Var2.a - lj6Var2.b);
                                while (max < min) {
                                }
                                i13++;
                                i6 = i2;
                                currentTimeMillis = j2;
                                i8 = 4;
                                f10 = 1.0f;
                            }
                            i12++;
                            i7 = 0;
                            i8 = 4;
                            f10 = 1.0f;
                        }
                    }
                    i = i6;
                } else {
                    i = 1;
                    float f13 = 2.0f;
                    if (braVar != null) {
                        braVar.d(canvas);
                    } else if (elaVar != null) {
                        Paint paint2 = elaVar.c;
                        if (this.I != null) {
                            float i19 = Utilities.i(r3.getCurrentPosition() / this.I.getDuration(), 1.0f, 0.0f);
                            int i20 = (int) (i19 / 0.11111111f);
                            int i21 = i20 + 1;
                            float b = b00.b(i20, 0.11111111f, i19, 0.11111111f);
                            float[] fArr = V;
                            f3 = i21 < 10 ? (fArr[i21] * b) + ((1.0f - b) * fArr[i20]) : fArr[i20];
                        } else {
                            f3 = 0.2f;
                        }
                        elaVar.f = (((1.0f - Utilities.i(this.H / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f3;
                        ArrayList arrayList2 = elaVar.e;
                        int o = bm2.o(bkb.w0(null, bkb.Pk, false), 80);
                        if (elaVar.g != o) {
                            elaVar.g = o;
                            paint2.setColor(o);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                            dla dlaVar = (dla) arrayList2.get(i22);
                            ela elaVar2 = dlaVar.g;
                            float[] fArr2 = elaVar2.d;
                            int i23 = i22 << 2;
                            float f14 = dlaVar.a;
                            fArr2[i23] = f14;
                            fArr2[i23 + 1] = dlaVar.b;
                            fArr2[i23 + 2] = (gl.L(30.0f) * dlaVar.c) + f14;
                            fArr2[i23 + 3] = (gl.L(30.0f) * dlaVar.d) + dlaVar.b;
                            float L2 = gl.L(4.0f);
                            float f15 = elaVar2.h;
                            float f16 = (f15 / 660.0f) * L2 * elaVar2.f;
                            float f17 = (dlaVar.c * f16) + dlaVar.a;
                            dlaVar.a = f17;
                            float f18 = (dlaVar.d * f16) + dlaVar.b;
                            dlaVar.b = f18;
                            float f19 = dlaVar.f;
                            if (f19 != 1.0f) {
                                float f20 = (f15 / 200.0f) + f19;
                                dlaVar.f = f20;
                                if (f20 > 1.0f) {
                                    dlaVar.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > dlaVar.e || !elaVar.b.contains(f17, f18)) {
                                dlaVar.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(elaVar.d, paint2);
                    } else {
                        yd5 yd5Var = this.Q;
                        if (yd5Var != null) {
                            ArrayList arrayList3 = yd5Var.g;
                            System.currentTimeMillis();
                            int i24 = 0;
                            while (i24 < arrayList3.size()) {
                                xd5 xd5Var = (xd5) arrayList3.get(i24);
                                yd5 yd5Var2 = xd5Var.m;
                                Paint paint3 = yd5Var2.f;
                                float f21 = xd5Var.l;
                                if (f21 != 1.0f) {
                                    f2 = f5;
                                    float f22 = (yd5Var2.h / xd5Var.j) + f21;
                                    xd5Var.l = f22;
                                    if (f22 > 1.0f) {
                                        xd5Var.l = 1.0f;
                                    }
                                } else {
                                    f2 = f5;
                                }
                                if (xd5Var.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(xd5Var.l - f2, d)) * 4.0f);
                                    float z2 = yjb.z(pow2, 0.4f, 0.7f, xd5Var.k / yd5Var2.b);
                                    float f23 = f13;
                                    de9.n(xd5Var.i, f23, xd5Var.c, xd5Var.b - (xd5Var.h / f13), canvas);
                                    canvas.scale(z2, z2, xd5Var.h / f23, xd5Var.i / f23);
                                    paint3.setAlpha((int) (xd5Var.d * pow2));
                                    canvas.drawBitmap(xd5Var.f, 0.0f, 0.0f, paint3);
                                    canvas.restore();
                                }
                                if (xd5Var.l >= 1.0f) {
                                    xd5Var.a(i24, false);
                                }
                                i24++;
                                f5 = f2;
                                d = 2.0d;
                                f13 = 2.0f;
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / 2.0f;
                float f24 = 0.0671f * min2;
                this.N = f24;
                z = this.d;
                if (z) {
                    rectF = gl.P;
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.N);
                } else {
                    rectF = gl.P;
                    rectF.set(measuredWidth, -f24, getMeasuredWidth() - measuredWidth, min2);
                }
                rectF.inset(-gl.L(3.0f), -gl.L(3.0f));
                rectF.inset(-gl.L(3.0f), -gl.L(3.0f));
                canvas.drawRoundRect(rectF, this.N + gl.L(3.0f), this.N + gl.L(3.0f), this.c);
                rectF.inset(gl.L(3.0f), gl.L(3.0f));
                float f25 = this.N;
                Paint paint4 = this.b;
                canvas.drawRoundRect(rectF, f25, f25, paint4);
                if (z) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                L = this.N - gl.L(3.0f);
                this.N = L;
                bm9Var = this.L;
                if (bm9Var != null && bm9Var.f != L) {
                    if (L <= 0.05f) {
                        i = 0;
                    }
                    Paint paint5 = bm9Var.c;
                    if (i == 0) {
                        paint5.setShader(bm9Var.d);
                    } else {
                        paint5.setShader(null);
                    }
                    bm9Var.f = L;
                    bm9Var.invalidateSelf();
                }
                vd1Var = this.M;
                if (vd1Var != null) {
                    vd1Var.b = this.N;
                }
                float f26 = this.N;
                ImageReceiver imageReceiver = this.n;
                if (z) {
                    int i25 = (int) f26;
                    imageReceiver.r0(i25, i25, 0, 0);
                } else {
                    int i26 = (int) f26;
                    imageReceiver.r0(0, 0, i26, i26);
                }
                if (!this.G) {
                    imageReceiver.i0(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.h(canvas, null);
                }
                super.dispatchDraw(canvas);
                if (z) {
                    canvas.drawCircle(imageReceiver.r(), imageReceiver.M0 + gl.L(12.0f), gl.L(6.0f), paint4);
                    return;
                }
                return;
            }
        }
        i = 1;
        f = 0.9f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / 2.0f;
        float f242 = 0.0671f * min22;
        this.N = f242;
        z = this.d;
        if (z) {
        }
        rectF.inset(-gl.L(3.0f), -gl.L(3.0f));
        rectF.inset(-gl.L(3.0f), -gl.L(3.0f));
        canvas.drawRoundRect(rectF, this.N + gl.L(3.0f), this.N + gl.L(3.0f), this.c);
        rectF.inset(gl.L(3.0f), gl.L(3.0f));
        float f252 = this.N;
        Paint paint42 = this.b;
        canvas.drawRoundRect(rectF, f252, f252, paint42);
        if (z) {
        }
        L = this.N - gl.L(3.0f);
        this.N = L;
        bm9Var = this.L;
        if (bm9Var != null) {
            if (L <= 0.05f) {
            }
            Paint paint52 = bm9Var.c;
            if (i == 0) {
            }
            bm9Var.f = L;
            bm9Var.invalidateSelf();
        }
        vd1Var = this.M;
        if (vd1Var != null) {
        }
        float f262 = this.N;
        ImageReceiver imageReceiver2 = this.n;
        if (z) {
        }
        if (!this.G) {
        }
        super.dispatchDraw(canvas);
        if (z) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
        if (!this.G) {
            a();
        }
        kk7.f(this.s).b(this, kk7.X1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        kk7.f(this.s).n(this, kk7.X1);
        yd5 yd5Var = this.Q;
        if (yd5Var != null) {
            HashMap hashMap = yd5Var.c;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        ok2 ok2Var = this.I;
        if (ok2Var != null) {
            this.U = ok2Var.getCurrentPosition();
            this.I.release(new jc((byte) 10));
            this.I = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF;
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            rectF = gl.P;
            rectF.set(measuredWidth2, -this.N, getMeasuredWidth() - measuredWidth2, min);
        } else {
            rectF = gl.P;
            rectF.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.N);
        }
        if (this.T != measuredWidth) {
            this.T = measuredWidth;
            ha haVar = this.R;
            if (haVar != null) {
                RectF rectF2 = (RectF) haVar.c;
                ((Rect) haVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF2.set(rectF);
                rectF2.inset(gl.L(16.0f), gl.L(16.0f));
            }
            bra braVar = this.O;
            if (braVar != null) {
                RectF rectF3 = braVar.c;
                RectF rectF4 = braVar.a;
                byte b = this.w;
                if (b == 6 || b == 9 || b == 3 || b == 7 || b == 24 || b == 43 || b == 11 || b == 4) {
                    rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF4.inset(gl.L(30.0f), gl.L(30.0f));
                } else {
                    float width = (int) (rectF.width() * 0.4f);
                    rectF4.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    braVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                braVar.f();
                rectF3.set(rectF);
                rectF3.inset(gl.L(10.0f), gl.L(10.0f));
            }
            ela elaVar = this.P;
            if (elaVar != null) {
                RectF rectF5 = elaVar.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                elaVar.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(gl.L(100.0f), gl.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = elaVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((dla) arrayList.get(i5)).a(currentTimeMillis, true);
                }
            }
            yd5 yd5Var = this.Q;
            if (yd5Var != null) {
                yd5Var.d.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.e.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.Q.d.inset(gl.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.g;
                System.currentTimeMillis();
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    ((xd5) arrayList2.get(i6)).a(i6, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f = size;
        float f2 = (f - (0.671f * min)) / 2.0f;
        this.N = 0.0671f * min;
        ybc ybcVar = this.J;
        ybcVar.invalidateOutline();
        if (this.d) {
            rectF = gl.P;
            rectF.set(f2, 0.0f, f - f2, min);
        } else {
            RectF rectF2 = gl.P;
            float f3 = size2;
            rectF2.set(f2, f3 - min, f - f2, f3);
            rectF = rectF2;
        }
        ybcVar.getLayoutParams().width = (int) rectF.width();
        ybcVar.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) ybcVar.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) ybcVar.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i, i2);
    }

    @Override // qr7
    public void setOffset(float f) {
        boolean z;
        boolean z2 = this.d;
        float f2 = -f;
        if (f < 0.0f) {
            float measuredWidth = f2 / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z2) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.H = Math.abs(measuredWidth);
            z = measuredWidth < 1.0f;
            if (measuredWidth >= 0.1f) {
                r4 = false;
            }
        } else {
            float measuredWidth2 = f2 / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z2) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z = measuredWidth2 > -1.0f;
            r4 = measuredWidth2 > -0.1f;
            this.H = Math.abs(measuredWidth2);
        }
        if (z != this.x) {
            this.x = z;
            c();
        }
        if (r4 != this.F) {
            this.F = r4;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.u0 = r4;
            if (r4) {
                imageReceiver.w0(false);
                b();
                return;
            }
            ok2 ok2Var = this.I;
            if (ok2Var != null) {
                this.U = ok2Var.getCurrentPosition();
                this.I.release(new jc((byte) 10));
                this.I = null;
            }
            imageReceiver.x0();
        }
    }
}
