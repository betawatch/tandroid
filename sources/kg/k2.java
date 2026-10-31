package kg;

import ag.f3;
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
import org.telegram.messenger.b8;
import org.telegram.messenger.c00;
import org.telegram.messenger.hc;
import org.telegram.messenger.m5;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k2 extends FrameLayout implements t0, us {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean D;
    public boolean E;
    public boolean F;
    public float G;
    public j2 H;
    public final h2 I;
    public final TextureView J;
    public final j0.a K;
    public final fq L;
    public float M;
    public final f2 N;
    public final d2 O;
    public o P;
    public final s0 Q;
    public final TLRPC.Document R;
    public int S;
    public long T;
    public final c00 a;
    public final Paint b;
    public final Paint c;
    public final boolean d;
    public File e;
    public float f;
    public final String h;
    public final ImageReceiver n;
    public gg.c r;
    public final int s;
    public final int w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.graphics.Bitmap[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k2(Context context, c00 c00Var, int i10, int i11, p6 p6Var) {
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
        this.w = i11;
        this.a = c00Var;
        paint.setColor(-16777216);
        paint2.setColor(i0.b.f(0.5f, t6.w0(t6.Ak, p6Var), -16777216));
        imageReceiver.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ui.b0(i10).D;
        String p02 = PremiumPreviewFragment.p0(i11);
        if (tL_help_premiumPromo != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= tL_help_premiumPromo.video_sections.size()) {
                    i12 = -1;
                    break;
                } else if (tL_help_premiumPromo.video_sections.get(i12).equals(p02)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                TLRPC.Document document = tL_help_premiumPromo.videos.get(i12);
                i2 i2Var = null;
                for (int i13 = 0; i13 < document.thumbs.size(); i13++) {
                    if (document.thumbs.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                        this.K = new j0.a(getResources(), hc.F("b", document.thumbs.get(i13).bytes));
                        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                        gVar.m = 4.0f;
                        gVar.g = 3.5f;
                        gVar.l = true;
                        c00 c00Var2 = this.a;
                        gVar.o = this;
                        this.L = new fq(gVar, c00Var2);
                        i2Var = new i2(this, this.K, this.L);
                        i2Var.x = true;
                    }
                }
                this.h = b8.r(null, document);
                zArr = null;
                this.n.q0(null, null, i2Var, null, tL_help_premiumPromo, 1);
                b8.G(this.s).X(document, tL_help_premiumPromo, 3, 0);
                this.R = document;
                Utilities.e.c(new k2.u(6, this, document));
                if (i11 != 1) {
                    s0 s0Var = new s0(0);
                    s0Var.c = new RectF();
                    ?? r92 = new Bitmap[16];
                    s0Var.d = r92;
                    s0Var.e = new Rect();
                    s0Var.h = new Paint();
                    this.Q = s0Var;
                    s0Var.b = org.telegram.messenger.i0.L(16.0f);
                    TextPaint textPaint = new TextPaint(65);
                    textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
                    textPaint.setTextSize(s0Var.b);
                    textPaint.setColor(i0.b.o(t6.x0(zArr, t6.Nk, false), 30));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i14 = 0;
                    while (i14 < 16) {
                        int i15 = i14 < 10 ? i14 + 48 : i14 + 55;
                        int i16 = s0Var.b;
                        r92[i14] = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
                        new Canvas(r92[i14]).drawText(Character.toString((char) i15), r13 >> 1, s0Var.b, textPaint);
                        i14++;
                    }
                } else if (i11 == 6 || i11 == 9 || i11 == 3 || i11 == 7 || i11 == 11 || i11 == 4 || i11 == 24 || i11 == 43) {
                    f2 f2Var = new f2(40);
                    this.N = f2Var;
                    f2Var.o = 3.0f;
                    f2Var.O = i11;
                    if (i11 == 3 || i11 == 24 || i11 == 43) {
                        f2Var.r = 14;
                        f2Var.s = 18;
                        f2Var.t = 18;
                    } else {
                        f2Var.r = 14;
                        f2Var.s = 16;
                        f2Var.t = 15;
                    }
                    if (i11 == 43) {
                        f2Var.G = true;
                    }
                    f2Var.w = 0.98f;
                    f2Var.v = 0.98f;
                    f2Var.u = 0.98f;
                    f2Var.o = 4.0f;
                    f2Var.P = p6Var;
                    f2Var.Q = t6.Nk;
                    f2Var.c();
                } else if (i11 == 2) {
                    d2 d2Var = new d2();
                    this.O = d2Var;
                    ArrayList arrayList = d2Var.e;
                    if (arrayList.isEmpty()) {
                        for (int i17 = 0; i17 < d2Var.g; i17++) {
                            arrayList.add(new c2(d2Var));
                        }
                    }
                    int o10 = i0.b.o(t6.x0(zArr, t6.Nk, false), 80);
                    if (d2Var.i != o10) {
                        d2Var.i = o10;
                        d2Var.c.setColor(o10);
                    }
                } else if (i11 == 13) {
                    o oVar = new o();
                    this.P = oVar;
                    ArrayList arrayList2 = oVar.e;
                    if (arrayList2.isEmpty()) {
                        for (int i18 = 0; i18 < oVar.c; i18++) {
                            arrayList2.add(new n(oVar));
                        }
                    }
                } else {
                    f2 f2Var2 = new f2(tz.o() == 2 ? 800 : tz.o() == 1 ? 400 : 100);
                    this.N = f2Var2;
                    f2Var2.P = p6Var;
                    f2Var2.Q = t6.Nk;
                    f2Var2.r = 4;
                    f2Var2.w = 0.98f;
                    f2Var2.v = 0.98f;
                    f2Var2.u = 0.98f;
                    f2Var2.G = true;
                    f2Var2.o = 4.0f;
                    f2Var2.H = true;
                    f2Var2.I = true;
                    f2Var2.K = true;
                    f2Var2.M = false;
                    f2Var2.c();
                }
                if (i11 != 1 || i11 == 3 || i11 == 11) {
                    this.d = true;
                }
                h2 h2Var = new h2(this, context);
                this.I = h2Var;
                h2Var.setResizeMode(0);
                TextureView textureView = new TextureView(context);
                this.J = textureView;
                h2Var.addView(textureView);
                setWillNotDraw(false);
                addView(h2Var);
            }
        }
        zArr = null;
        if (i11 != 1) {
        }
        if (i11 != 1) {
        }
        this.d = true;
        h2 h2Var2 = new h2(this, context);
        this.I = h2Var2;
        h2Var2.setResizeMode(0);
        TextureView textureView2 = new TextureView(context);
        this.J = textureView2;
        h2Var2.addView(textureView2);
        setWillNotDraw(false);
        addView(h2Var2);
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || tz.B0) {
            File file2 = this.e;
            if (file2 == null || !file2.exists()) {
                this.f = 0.671f;
            } else {
                if ((zs.e().p & 512) != 0) {
                    gg.c cVar = this.r;
                    if (cVar != null) {
                        org.telegram.messenger.i0.r(cVar);
                    }
                    gg.c cVar2 = new gg.c(this, 27);
                    this.r = cVar2;
                    org.telegram.messenger.i0.h3(cVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.w0.b, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f = 0.671f;
                }
            }
            if (this.E) {
                b();
            }
        }
        this.r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.s;
        if ((this.e != null || tz.B0) && this.H == null) {
            this.I.a(this.f, 0);
            j2 j2Var = new j2(this, 0);
            this.H = j2Var;
            TextureView textureView = this.J;
            j2Var.with(textureView);
            File file = this.e;
            if (file == null || !file.exists()) {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
                    sb2.append("&id=");
                    sb2.append(this.R.id);
                    sb2.append("&hash=");
                    sb2.append(this.R.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.R.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.R.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.R.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(b8.G(i10).F(ui.b0(i10).D));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(b8.B(this.R), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.R.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.f(bArr));
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
            this.H.preparePlayer(uri, false, 1.0f);
            if (!this.F) {
                this.n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.H.seekTo(this.T + 60);
            this.H.play();
        }
    }

    public final void c() {
        boolean z10 = this.x && this.y;
        if (this.D != z10) {
            this.D = z10;
            ImageReceiver imageReceiver = this.n;
            if (z10) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
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
    
        if (r9.length != (r5 + 1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        if (r2[0].length == (r4 + 1)) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04fb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        long j10;
        float f13;
        int i10;
        int i11;
        s0 s0Var;
        int i12;
        int i13;
        ArrayList arrayList;
        int i14;
        int i15;
        long j11;
        boolean z10;
        j0.a aVar;
        fq fqVar;
        s0 s0Var2 = this.Q;
        d2 d2Var = this.O;
        float f14 = 2.0f;
        int i16 = 0;
        f2 f2Var = this.N;
        if (f2Var != null || d2Var != null || this.P != null || s0Var2 != null) {
            if (this.G < 0.5f) {
                float f15 = 1.0f;
                float pow = (float) Math.pow(1.0f - r10, 2.0d);
                canvas.save();
                f7 = 0.9f;
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (s0Var2 != null) {
                    Rect rect = (Rect) s0Var2.e;
                    int width = rect.width() / s0Var2.b;
                    int height = rect.height() / s0Var2.b;
                    if (width == 0 || height == 0) {
                        f10 = 2.0f;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList[] arrayListArr = (ArrayList[]) s0Var2.f;
                        int i17 = 4;
                        if (arrayListArr != null) {
                            f12 = 150.0f;
                        } else {
                            f12 = 150.0f;
                        }
                        s0Var2.f = new ArrayList[width + 1];
                        int i18 = 0;
                        while (i18 <= width) {
                            ((ArrayList[]) s0Var2.f)[i18] = new ArrayList();
                            r0 r0Var = new r0();
                            d5.a aVar2 = Utilities.c;
                            r0Var.a = Math.abs(((int) aVar2.nextLong()) % height);
                            r0Var.c = currentTimeMillis;
                            r0Var.b = Math.abs(((int) aVar2.nextLong()) % 6) + 4;
                            ((ArrayList[]) s0Var2.f)[i18].add(r0Var);
                            i18++;
                            f14 = f14;
                        }
                        f10 = f14;
                        com.google.android.gms.internal.play_billing.h1[][] h1VarArr = (com.google.android.gms.internal.play_billing.h1[][]) s0Var2.g;
                        if (h1VarArr != null) {
                            j10 = 150;
                            if (h1VarArr.length == width + 1) {
                            }
                        } else {
                            j10 = 150;
                        }
                        s0Var2.g = new com.google.android.gms.internal.play_billing.h1[width + 1][];
                        for (int i19 = 0; i19 <= width; i19++) {
                            ((com.google.android.gms.internal.play_billing.h1[][]) s0Var2.g)[i19] = new com.google.android.gms.internal.play_billing.h1[height + 1];
                            int i20 = 0;
                            while (i20 <= height) {
                                com.google.android.gms.internal.play_billing.h1[][] h1VarArr2 = (com.google.android.gms.internal.play_billing.h1[][]) s0Var2.g;
                                com.google.android.gms.internal.play_billing.h1[] h1VarArr3 = h1VarArr2[i19];
                                com.google.android.gms.internal.play_billing.h1 h1Var = new com.google.android.gms.internal.play_billing.h1();
                                h1Var.d = s0Var2;
                                h1VarArr3[i20] = h1Var;
                                com.google.android.gms.internal.play_billing.h1 h1Var2 = h1VarArr2[i19][i20];
                                h1Var2.getClass();
                                d5.a aVar3 = Utilities.c;
                                h1Var2.a = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.b = Math.abs(((int) aVar3.nextLong()) % 16);
                                h1Var2.c = Math.abs(((int) aVar3.nextLong()) % zs.X4) + currentTimeMillis + j10;
                                i20++;
                                f15 = f15;
                            }
                        }
                        float f16 = f15;
                        float f17 = 0.2f;
                        int i21 = 0;
                        while (i21 <= width) {
                            ArrayList arrayList2 = ((ArrayList[]) s0Var2.f)[i21];
                            int i22 = i16;
                            while (i22 < arrayList2.size()) {
                                r0 r0Var2 = (r0) arrayList2.get(i22);
                                if (currentTimeMillis - r0Var2.c > 50) {
                                    int i23 = r0Var2.a + 1;
                                    r0Var2.a = i23;
                                    r0Var2.c = currentTimeMillis;
                                    f13 = f17;
                                    if (i23 - r0Var2.b < height) {
                                        i15 = 1;
                                        j11 = currentTimeMillis;
                                    } else if (arrayList2.size() == 1) {
                                        r0Var2.a = i16;
                                        r0Var2.c = currentTimeMillis;
                                        i15 = 1;
                                        j11 = currentTimeMillis;
                                        r0Var2.b = Math.abs(((int) Utilities.c.nextLong()) % 6) + i17;
                                    } else {
                                        i15 = 1;
                                        j11 = currentTimeMillis;
                                        arrayList2.remove(r0Var2);
                                        i22--;
                                    }
                                    if (r0Var2.a > r0Var2.b && i22 == arrayList2.size() - i15) {
                                        d5.a aVar4 = Utilities.c;
                                        if (Math.abs(aVar4.nextInt(i17)) == 0) {
                                            r0 r0Var3 = new r0();
                                            r0Var3.a = i16;
                                            currentTimeMillis = j11;
                                            r0Var3.c = currentTimeMillis;
                                            i10 = i17;
                                            r0Var3.b = Math.abs(((int) aVar4.nextLong()) % 6) + 4;
                                            arrayList2.add(r0Var3);
                                        }
                                    }
                                    currentTimeMillis = j11;
                                    i10 = i17;
                                } else {
                                    f13 = f17;
                                    i10 = i17;
                                }
                                int min = Math.min(r0Var2.a, height + 1);
                                int max = Math.max(i16, r0Var2.a - r0Var2.b);
                                while (max < min) {
                                    int i24 = s0Var2.b;
                                    float f18 = i24 * i21;
                                    float f19 = i24 * max;
                                    if (((RectF) s0Var2.c).contains(f18, f19)) {
                                        i11 = i21;
                                        s0Var = s0Var2;
                                        i12 = height;
                                        i13 = width;
                                        arrayList = arrayList2;
                                        i14 = i22;
                                    } else {
                                        i11 = i21;
                                        i12 = height;
                                        float i25 = Utilities.i(((f16 - ((r0Var2.a - max) / (r0Var2.b - 1))) * 0.8f) + f13, f16, 0.0f);
                                        com.google.android.gms.internal.play_billing.h1 h1Var3 = ((com.google.android.gms.internal.play_billing.h1[][]) s0Var2.g)[i11][max];
                                        s0 s0Var3 = (s0) h1Var3.d;
                                        i13 = width;
                                        arrayList = arrayList2;
                                        long j12 = h1Var3.c - currentTimeMillis;
                                        s0Var = s0Var2;
                                        if (j12 < j10) {
                                            float i26 = Utilities.i(1.0f - (j12 / f12), 1.0f, 0.0f);
                                            Paint paint = (Paint) s0Var3.h;
                                            Bitmap[] bitmapArr = (Bitmap[]) s0Var3.d;
                                            i14 = i22;
                                            paint.setAlpha((int) m5.A(1.0f, i26, i25, 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.a], f18, f19, paint);
                                            paint.setAlpha((int) (i25 * i26 * 255.0f));
                                            canvas.drawBitmap(bitmapArr[h1Var3.b], f18, f19, paint);
                                            paint.setAlpha(zs.e4);
                                            if (i26 >= 1.0f) {
                                                h1Var3.a = h1Var3.b;
                                                h1Var3.b = Math.abs(((int) Utilities.c.nextLong()) % 16);
                                                h1Var3.c = Math.abs(((int) r2.nextLong()) % zs.X4) + currentTimeMillis + j10;
                                            }
                                        } else {
                                            i14 = i22;
                                            ((Paint) s0Var3.h).setAlpha((int) (i25 * 255.0f));
                                            canvas.drawBitmap(((Bitmap[]) s0Var3.d)[h1Var3.a], f18, f19, (Paint) s0Var3.h);
                                        }
                                    }
                                    max++;
                                    i21 = i11;
                                    height = i12;
                                    width = i13;
                                    arrayList2 = arrayList;
                                    s0Var2 = s0Var;
                                    i22 = i14;
                                    f16 = 1.0f;
                                }
                                i22++;
                                f17 = f13;
                                i17 = i10;
                                i16 = 0;
                                f16 = 1.0f;
                            }
                            i21++;
                            i16 = 0;
                            f16 = 1.0f;
                        }
                    }
                } else {
                    f10 = 2.0f;
                    if (f2Var != null) {
                        f2Var.d(canvas);
                    } else if (d2Var != null) {
                        Paint paint2 = d2Var.c;
                        if (this.H != null) {
                            float i27 = Utilities.i(r4.getCurrentPosition() / this.H.getDuration(), 1.0f, 0.0f);
                            float f20 = 1.0f / 9;
                            int i28 = (int) (i27 / f20);
                            int i29 = i28 + 1;
                            float g10 = c3.i0.g(i28, f20, i27, f20);
                            float[] fArr = U;
                            f11 = i29 < 10 ? (fArr[i29] * g10) + ((1.0f - g10) * fArr[i28]) : fArr[i28];
                        } else {
                            f11 = 0.2f;
                        }
                        d2Var.f = (((1.0f - Utilities.i(this.G / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f11;
                        ArrayList arrayList3 = d2Var.e;
                        int o10 = i0.b.o(t6.x0(null, t6.Nk, false), 80);
                        if (d2Var.i != o10) {
                            d2Var.i = o10;
                            paint2.setColor(o10);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        for (int i30 = 0; i30 < arrayList3.size(); i30++) {
                            c2 c2Var = (c2) arrayList3.get(i30);
                            d2 d2Var2 = c2Var.g;
                            float[] fArr2 = d2Var2.d;
                            int i31 = i30 * 4;
                            float f21 = c2Var.a;
                            fArr2[i31] = f21;
                            fArr2[i31 + 1] = c2Var.b;
                            fArr2[i31 + 2] = (org.telegram.messenger.i0.L(30.0f) * c2Var.c) + f21;
                            fArr2[i31 + 3] = (org.telegram.messenger.i0.L(30.0f) * c2Var.d) + c2Var.b;
                            float L = org.telegram.messenger.i0.L(4.0f);
                            float f22 = d2Var2.j;
                            float f23 = (f22 / 660.0f) * L * d2Var2.f;
                            float f24 = (c2Var.c * f23) + c2Var.a;
                            c2Var.a = f24;
                            float f25 = (c2Var.d * f23) + c2Var.b;
                            c2Var.b = f25;
                            float f26 = c2Var.f;
                            if (f26 != 1.0f) {
                                float f27 = (f22 / 200.0f) + f26;
                                c2Var.f = f27;
                                if (f27 > 1.0f) {
                                    c2Var.f = 1.0f;
                                }
                            }
                            if (currentTimeMillis2 > c2Var.e || !d2Var.b.contains(f24, f25)) {
                                c2Var.a(currentTimeMillis2, false);
                            }
                        }
                        canvas.drawLines(d2Var.d, paint2);
                    } else {
                        o oVar = this.P;
                        if (oVar != null) {
                            ArrayList arrayList4 = oVar.e;
                            System.currentTimeMillis();
                            for (int i32 = 0; i32 < arrayList4.size(); i32++) {
                                n nVar = (n) arrayList4.get(i32);
                                o oVar2 = nVar.m;
                                Paint paint3 = (Paint) oVar2.i;
                                float f28 = nVar.l;
                                if (f28 != 1.0f) {
                                    float f29 = (oVar2.b / nVar.j) + f28;
                                    nVar.l = f29;
                                    if (f29 > 1.0f) {
                                        nVar.l = 1.0f;
                                    }
                                }
                                if (nVar.f != null) {
                                    canvas.save();
                                    float pow2 = 1.0f - (((float) Math.pow(nVar.l - 0.5f, 2.0d)) * 4.0f);
                                    float C = c3.i0.C(pow2, 0.4f, 0.7f, nVar.k / oVar2.a);
                                    canvas.translate(nVar.b - (nVar.h / 2.0f), nVar.c - (nVar.i / 2.0f));
                                    canvas.scale(C, C, nVar.h / 2.0f, nVar.i / 2.0f);
                                    paint3.setAlpha((int) (nVar.d * pow2));
                                    canvas.drawBitmap(nVar.f, 0.0f, 0.0f, paint3);
                                    canvas.restore();
                                }
                                if (nVar.l >= 1.0f) {
                                    nVar.a(i32, false);
                                }
                            }
                        }
                    }
                }
                canvas.restore();
                invalidate();
                float min2 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f7);
                float measuredWidth = (getMeasuredWidth() - (0.671f * min2)) / f10;
                float f30 = 0.0671f * min2;
                this.M = f30;
                z10 = this.d;
                if (z10) {
                    org.telegram.messenger.i0.P.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.M);
                } else {
                    org.telegram.messenger.i0.P.set(measuredWidth, -f30, getMeasuredWidth() - measuredWidth, min2);
                }
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.inset(-org.telegram.messenger.i0.L(3.0f), -org.telegram.messenger.i0.L(3.0f));
                rectF.inset(-org.telegram.messenger.i0.L(3.0f), -org.telegram.messenger.i0.L(3.0f));
                canvas.drawRoundRect(rectF, this.M + org.telegram.messenger.i0.L(3.0f), this.M + org.telegram.messenger.i0.L(3.0f), this.c);
                rectF.inset(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
                float f31 = this.M;
                Paint paint4 = this.b;
                canvas.drawRoundRect(rectF, f31, f31, paint4);
                if (z10) {
                    rectF.set(measuredWidth, getMeasuredHeight() - min2, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
                } else {
                    rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, min2);
                }
                float L2 = this.M - org.telegram.messenger.i0.L(3.0f);
                this.M = L2;
                aVar = this.K;
                if (aVar != null) {
                    Paint paint5 = aVar.d;
                    if (aVar.g != L2) {
                        if (L2 > 0.05f) {
                            paint5.setShader(aVar.e);
                        } else {
                            paint5.setShader(null);
                        }
                        aVar.g = L2;
                        aVar.invalidateSelf();
                    }
                }
                fqVar = this.L;
                if (fqVar != null) {
                    fqVar.c = this.M;
                }
                ImageReceiver imageReceiver = this.n;
                if (z10) {
                    int i33 = (int) this.M;
                    imageReceiver.K0(i33, i33, 0, 0);
                } else {
                    int i34 = (int) this.M;
                    imageReceiver.K0(0, 0, i34, i34);
                }
                if (!this.F) {
                    imageReceiver.y0(rectF.left, rectF.top, rectF.width(), rectF.height());
                    imageReceiver.h(canvas, null);
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    canvas.drawCircle(imageReceiver.r(), imageReceiver.L0 + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), paint4);
                    return;
                }
                return;
            }
        }
        f10 = 2.0f;
        f7 = 0.9f;
        float min22 = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * f7);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min22)) / f10;
        float f302 = 0.0671f * min22;
        this.M = f302;
        z10 = this.d;
        if (z10) {
        }
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.inset(-org.telegram.messenger.i0.L(3.0f), -org.telegram.messenger.i0.L(3.0f));
        rectF2.inset(-org.telegram.messenger.i0.L(3.0f), -org.telegram.messenger.i0.L(3.0f));
        canvas.drawRoundRect(rectF2, this.M + org.telegram.messenger.i0.L(3.0f), this.M + org.telegram.messenger.i0.L(3.0f), this.c);
        rectF2.inset(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        float f312 = this.M;
        Paint paint42 = this.b;
        canvas.drawRoundRect(rectF2, f312, f312, paint42);
        if (z10) {
        }
        float L22 = this.M - org.telegram.messenger.i0.L(3.0f);
        this.M = L22;
        aVar = this.K;
        if (aVar != null) {
        }
        fqVar = this.L;
        if (fqVar != null) {
        }
        ImageReceiver imageReceiver2 = this.n;
        if (z10) {
        }
        if (!this.F) {
        }
        super.dispatchDraw(canvas);
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
        if (!this.F) {
            a();
        }
        zs.f(this.s).c(this, zs.Y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
        zs.f(this.s).n(this, zs.Y1);
        o oVar = this.P;
        if (oVar != null) {
            HashMap hashMap = (HashMap) oVar.f;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next()).recycle();
            }
            hashMap.clear();
            this.P = null;
        }
        j2 j2Var = this.H;
        if (j2Var != null) {
            this.T = j2Var.getCurrentPosition();
            this.H.release(new f3(7));
            this.H = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            org.telegram.messenger.i0.P.set(measuredWidth2, -this.M, getMeasuredWidth() - measuredWidth2, min);
        } else {
            org.telegram.messenger.i0.P.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.M);
        }
        if (this.S != measuredWidth) {
            this.S = measuredWidth;
            s0 s0Var = this.Q;
            if (s0Var != null) {
                RectF rectF = (RectF) s0Var.c;
                ((Rect) s0Var.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.i0.P);
                rectF.inset(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
            }
            f2 f2Var = this.N;
            if (f2Var != null) {
                RectF rectF2 = f2Var.c;
                RectF rectF3 = f2Var.a;
                int i14 = this.w;
                if (i14 == 6 || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 43 || i14 == 11 || i14 == 4) {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
                } else {
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    f2Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                f2Var.f();
                rectF2.set(org.telegram.messenger.i0.P);
                rectF2.inset(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
            }
            d2 d2Var = this.O;
            if (d2Var != null) {
                RectF rectF5 = d2Var.a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                d2Var.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = d2Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((c2) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            o oVar = this.P;
            if (oVar != null) {
                ((RectF) oVar.g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.g).inset(org.telegram.messenger.i0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.P.e;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((n) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f7 = size;
        float f10 = (f7 - (0.671f * min)) / 2.0f;
        this.M = 0.0671f * min;
        h2 h2Var = this.I;
        h2Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.i0.P.set(f10, 0.0f, f7 - f10, min);
        } else {
            float f11 = size2;
            org.telegram.messenger.i0.P.set(f10, f11 - min, f7 - f10, f11);
        }
        ViewGroup.LayoutParams layoutParams = h2Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.i0.P;
        layoutParams.width = (int) rectF.width();
        h2Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) h2Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) h2Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override // kg.t0
    public void setOffset(float f7) {
        boolean z10;
        boolean z11 = this.d;
        if (f7 < 0.0f) {
            float measuredWidth = (-f7) / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.G = Math.abs(measuredWidth);
            z10 = measuredWidth < 1.0f;
            if (measuredWidth >= 0.1f) {
                r4 = false;
            }
        } else {
            float measuredWidth2 = (-f7) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z10 = measuredWidth2 > -1.0f;
            r4 = measuredWidth2 > -0.1f;
            this.G = Math.abs(measuredWidth2);
        }
        if (z10 != this.x) {
            this.x = z10;
            c();
        }
        if (r4 != this.E) {
            this.E = r4;
            ImageReceiver imageReceiver = this.n;
            imageReceiver.t0 = r4;
            if (r4) {
                imageReceiver.P0(false);
                b();
                return;
            }
            j2 j2Var = this.H;
            if (j2Var != null) {
                this.T = j2Var.getCurrentPosition();
                this.H.release(new f3(7));
                this.H = null;
            }
            imageReceiver.Q0();
        }
    }
}
