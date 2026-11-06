package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$-CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sk;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ag;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class c8 extends View {
    public static final /* synthetic */ int G1 = 0;
    public float A0;
    public final u7 A1;
    public float B0;
    public final u7 B1;
    public float C0;
    public final x7 C1;
    public final Paint D;
    public float D0;
    public final RectF D1;
    public final RectF E;
    public float E0;
    public final Paint E1;
    public final Paint F;
    public float F0;
    public final Rect F1;
    public final Paint G;
    public float G0;
    public final RectF H;
    public float H0;
    public final Path I;
    public float I0;
    public final float[] J;
    public float J0;
    public final int[] K;
    public int K0;
    public final w7 L;
    public boolean L0;
    public final v7 M;
    public long M0;
    public final a8 N;
    public long N0;
    public final a8 O;
    public VelocityTracker O0;
    public final a8 P;
    public String P0;
    public final a8 Q;
    public String Q0;
    public final a8 R;
    public long R0;
    public final ArrayList S;
    public b8 S0;
    public final Path T;
    public b8 T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public float V0;
    public final Matrix W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.f2 a;
    public float a0;
    public boolean a1;
    public final boolean b;
    public float b0;
    public TL_wallet.card b1;
    public final h6 c;
    public final a8 c0;
    public String c1;
    public final m4.d0 d;
    public final Paint d0;
    public boolean d1;
    public final SharedPreferences e;
    public final zg0 e0;
    public boolean e1;
    public final LinkedHashMap f;
    public boolean f0;
    public int f1;
    public b8 g0;
    public final u7 g1;
    public final ArrayList h;
    public b8 h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public final Paint j0;
    public boolean j1;
    public final Paint k0;
    public b8 k1;
    public final Paint l0;
    public p7 l1;
    public boolean m0;
    public float[] m1;
    public final ArrayList n;
    public boolean n0;
    public float n1;
    public boolean o0;
    public final float[] o1;
    public boolean p0;
    public final a8 p1;
    public boolean q0;
    public final a8 q1;
    public final Matrix r;
    public boolean r0;
    public final Paint r1;
    public final Matrix s;
    public boolean s0;
    public final Paint s1;
    public boolean t0;
    public final Matrix t1;
    public boolean u0;
    public final Path u1;
    public int v0;
    public final RectF v1;
    public final Matrix w;
    public float w0;
    public fi.m3 w1;
    public final Matrix x;
    public float x0;
    public fi.m3 x1;
    public final Paint y;
    public float y0;
    public final l1 y1;
    public float z0;
    public final l5 z1;

    public c8(org.telegram.ui.ActionBar.f2 f2Var, h6 h6Var, m4.d0 d0Var, TL_wallet.card cardVar) {
        super(f2Var.getContext());
        SharedPreferences sharedPreferences;
        this.f = new LinkedHashMap();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new Matrix();
        this.s = new Matrix();
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Paint(3);
        this.D = new Paint(3);
        this.E = new RectF();
        int i7 = 1;
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[qs.C3];
        this.N = new a8(0.0f, 260.0f, 0.78f);
        this.O = new a8(0.0f, 420.0f, 0.72f);
        this.P = new a8(1.0f, 420.0f, 0.38f);
        this.Q = new a8(0.0f, 170.0f, 0.42f);
        this.R = new a8(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.c0 = new a8(0.0f, 120.0f, 1.0f);
        this.d0 = new Paint(1);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.U0 = 1.0f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.g1 = new u7(this, i7);
        this.o1 = new float[3];
        this.p1 = new a8(0.0f, 260.0f, 1.0f);
        this.q1 = new a8(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.r1 = paint4;
        Paint paint5 = new Paint(1);
        this.s1 = paint5;
        this.t1 = new Matrix();
        this.u1 = new Path();
        this.v1 = new RectF();
        this.y1 = new l1(this, i7);
        int i10 = 2;
        this.z1 = new l5(i10, this);
        this.A1 = new u7(this, i10);
        this.B1 = new u7(this, 3);
        this.C1 = new x7(this);
        this.D1 = new RectF();
        Paint paint6 = new Paint(1);
        this.E1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F1 = new Rect();
        this.a = f2Var;
        int i11 = 0;
        boolean z9 = cardVar != null;
        this.b = z9;
        zg0 zg0Var = new zg0(R.raw.wallet_gift_trash, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
        this.e0 = zg0Var;
        zg0Var.R(this);
        this.c = h6Var;
        this.d = d0Var;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z9) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + f2Var.getCurrentAccount() + "_" + n0.x(f2Var.getCurrentAccount()).t(), 0);
        }
        this.e = sharedPreferences;
        this.P0 = z9 ? null : sharedPreferences.getString("style", null);
        this.h1 = (z9 || qp.e1().getBoolean("walletcardstickerhint", false)) ? false : true;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(org.telegram.messenger.g0.L(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(org.telegram.messenger.g0.o());
        v7 v7Var = new v7(this, getContext());
        this.M = v7Var;
        w7 w7Var = new w7(this, getContext());
        this.L = w7Var;
        v7Var.setTag(c6.n0);
        h6Var.getFrontFace().addView(v7Var, 0, c8.ha.c(-1.0f, -1));
        h6Var.getFrontFace().addView(w7Var, h6Var.getStickerLayerIndex(), c8.ha.c(-1.0f, -1));
        if (z9) {
            w7Var.addOnLayoutChangeListener(new r7(this, i11));
            d(cardVar);
            return;
        }
        int currentAccount = f2Var.getCurrentAccount();
        qp s12 = qp.s1(currentAccount);
        long e10 = p10.i(currentAccount).e();
        TLRPC.UserFull b22 = s12.b2(e10);
        if (b22 == null) {
            s12.W2(s12.a2(Long.valueOf(e10)), 0, true, new k(this, 4));
        } else {
            TL_wallet.card cardVar2 = b22.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
        }
    }

    public static boolean F(int i7, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.o0) qp.s1(i7).x7.m0.b).c;
            if (hashSet != null) {
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                }
                if (hashSet.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Path H(b8 b8Var) {
        Bitmap bitmap;
        int i7;
        int i10;
        boolean z9;
        int i11;
        if (b8Var == null || b8Var.F != null || (bitmap = b8Var.u) == null) {
            if (b8Var == null) {
                return null;
            }
            return b8Var.F;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
        int[] iArr = new int[TLObject.FLAG_14];
        createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
        if (createScaledBitmap != b8Var.u) {
            createScaledBitmap.recycle();
        }
        boolean[] zArr = new boolean[TLObject.FLAG_14];
        int i12 = -1;
        for (int i13 = 0; i13 < 16384; i13++) {
            boolean z10 = (iArr[i13] >>> 24) >= 110;
            zArr[i13] = z10;
            if (i12 < 0 && z10) {
                i12 = i13;
            }
        }
        if (i12 < 0) {
            return null;
        }
        int i14 = 8;
        int[] iArr2 = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] iArr3 = {0, -1, -1, -1, 0, 1, 1, 1};
        int i15 = i12 % 128;
        int i16 = i12 / 128;
        int i17 = i15 - 1;
        float[] fArr = new float[512];
        int i18 = i16;
        int i19 = i18;
        int i20 = i15;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i21 >= 20000) {
                i7 = 0;
                break;
            }
            int i23 = i22 * 2;
            i7 = 0;
            if (i23 + 2 > fArr.length) {
                fArr = Arrays.copyOf(fArr, fArr.length * 2);
            }
            fArr[i23] = i20 + 0.5f;
            fArr[i23 + 1] = i18 + 0.5f;
            i22++;
            int i24 = 0;
            while (i24 < i14 && (iArr2[i24] != i17 - i20 || iArr3[i24] != i19 - i18)) {
                i24++;
            }
            int i25 = 1;
            while (true) {
                if (i25 > i14) {
                    i10 = i14;
                    z9 = false;
                    break;
                }
                int i26 = (i24 + i25) % i14;
                i10 = i14;
                int i27 = i20 + iArr2[i26];
                int i28 = i24;
                int i29 = i18 + iArr3[i26];
                if (i27 >= 0 && i29 >= 0) {
                    i11 = i25;
                    if (i27 < 128 && i29 < 128 && zArr[(i29 * 128) + i27]) {
                        int i30 = (i26 + 7) % 8;
                        int i31 = i20 + iArr2[i30];
                        i19 = i18 + iArr3[i30];
                        i18 = i29;
                        i17 = i31;
                        i20 = i27;
                        z9 = true;
                        break;
                    }
                } else {
                    i11 = i25;
                }
                i25 = i11 + 1;
                i14 = i10;
                i24 = i28;
            }
            if (!z9 || (i20 == i15 && i18 == i16)) {
                break;
            }
            i21++;
            i14 = i10;
        }
        int i32 = (i22 + 1) / 2;
        if (i32 < 3) {
            return null;
        }
        float[] fArr2 = new float[i32 * 2];
        for (int i33 = i7; i33 < i22; i33 += 2) {
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i34 = -3; i34 <= 3; i34++) {
                int i35 = ((((i33 + i34) % i22) + i22) % i22) * 2;
                f10 += fArr[i35];
                f11 += fArr[i35 + 1];
            }
            fArr2[i33] = ((f10 / 7.0f) / 128.0f) - 0.5f;
            fArr2[i33 + 1] = ((f11 / 7.0f) / 128.0f) - 0.5f;
        }
        Path path = new Path();
        path.moveTo((fArr2[i7] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
        int i36 = 1;
        while (i36 <= i32) {
            int i37 = i36 % i32;
            i36++;
            int i38 = i37 * 2;
            float f12 = fArr2[i38];
            float f13 = fArr2[i38 + 1];
            int i39 = (i36 % i32) * 2;
            path.quadTo(f12, f13, (fArr2[i39] + f12) / 2.0f, (fArr2[i39 + 1] + f13) / 2.0f);
        }
        path.close();
        b8Var.F = path;
        return path;
    }

    public static void J(fi.m3 m3Var, float f10, float f11) {
        o(m3Var, 3);
        m3Var.p(0.0f, f10 - m3Var.getPaddingLeft());
        m3Var.setTranslationY(f11 - m3Var.getLayoutParams().height);
        m3Var.invalidate();
    }

    public static double N(float f10) {
        return Math.round(f10 * 100.0f) / 100.0d;
    }

    public static String T(TL_wallet.card cardVar) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i7);
                i7++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null) {
                    sb2.append(nftitem.address);
                    sb2.append(':');
                    sb2.append(y(cardsticker2.coordinates));
                    sb2.append(';');
                }
            }
        }
        sb2.append("bg:");
        TL_wallet.nftItem nftitem2 = cardVar.bg_nft_item;
        sb2.append(nftitem2 == null ? null : nftitem2.address);
        return sb2.toString();
    }

    public static boolean b(b8 b8Var) {
        TL_wallet.nftItem nftitem;
        return (b8Var == null || (nftitem = b8Var.b) == null || nftitem.gift == null) ? false : true;
    }

    public static float c(float f10) {
        float f11 = f10 % 360.0f;
        if (f11 > 180.0f) {
            f11 -= 360.0f;
        }
        return f11 < -180.0f ? f11 + 360.0f : f11;
    }

    public static void e0(int i7, TL_wallet.card cardVar) {
        TLRPC.UserFull b22 = qp.s1(i7).b2(p10.i(i7).e());
        if (b22 == null) {
            return;
        }
        b22.wallet_card = cardVar;
        yr.a0(i7).j2(b22, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(fi.m3 m3Var, int i7) {
        if ((m3Var.getTag() instanceof Integer) && ((Integer) m3Var.getTag()).intValue() == i7) {
            return;
        }
        m3Var.setTag(Integer.valueOf(i7));
        m3Var.a = i7;
        m3Var.p(1.0f, 0.0f);
    }

    public static float u(float f10, float f11, float f12) {
        float l10 = Utilities.l((f10 - f11) / (f12 - f11));
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        return mediaAreaCoordinates == null ? "" : String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        h6 h6Var = this.c;
        this.Y0 = h6Var.getFrontFace().getWidth();
        float height = h6Var.getFrontFace().getHeight();
        this.Z0 = height;
        if (this.Y0 <= 0.0f || height <= 0.0f) {
            return false;
        }
        Matrix matrix = this.r;
        return h6Var.g(this, matrix) && matrix.invert(this.s);
    }

    public final fi.m3 B(int i7, boolean z9) {
        fi.m3 m3Var = new fi.m3(getContext(), 3);
        m3Var.r(true);
        m3Var.n(11.0f, 6.0f, z9 ? 15.0f : 11.0f, 7.0f);
        m3Var.k(z9);
        m3Var.K = Layout.Alignment.ALIGN_NORMAL;
        m3Var.s(12.0f);
        m3Var.d = -1L;
        String M0 = hd.M0(i7, null);
        m3Var.h = fi.m3.a(M0, m3Var.getTextPaint());
        m3Var.u(M0);
        m3Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(m3Var, c8.ha.e(-1, qs.g2, 48));
        return m3Var;
    }

    public final boolean C() {
        Path H = this.m1 == null ? null : H(this.k1);
        if (H == null) {
            return false;
        }
        float U = U() * this.m1[2];
        Matrix matrix = this.t1;
        matrix.setScale(U, U);
        float[] fArr = this.m1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.u1);
        return true;
    }

    public final float[] D(float f10) {
        float u10 = (u(f10, 0.45f, 0.82f) - u(f10, 1.3f, 1.72f)) * 0.9f;
        float[] fArr = this.o1;
        fArr[0] = u10;
        fArr[1] = (((float) Math.sin(Utilities.l((f10 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f10, 0.6f, 0.92f) - u(f10, 1.18f, 1.46f));
        fArr[2] = u(f10, 1.58f, 1.7f) - u(f10, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(b8 b8Var) {
        b8Var.J = 0L;
        a8 a8Var = b8Var.h;
        a8 a8Var2 = b8Var.f;
        a8 a8Var3 = b8Var.e;
        if (b8Var.a.equals(this.P0)) {
            l();
        }
        if (b8Var.b()) {
            float[] L = L(a8Var3.a, a8Var2.a);
            a8Var3.a(L[0]);
            a8Var2.a(L[1]);
        }
        b8Var.H = 4;
        b8Var.W = 0.0f;
        b8Var.X = a8Var3.a;
        b8Var.Y = a8Var2.a;
        b8Var.Z = b8Var.g.a * a8Var.a;
        b8Var.a0 = b8Var.i.a;
        b8Var.b0 = this.w0 > ((float) org.telegram.messenger.g0.L(650.0f)) ? 0.32f : 0.44f;
        this.w0 = 0.0f;
        p7 j3 = j(b8Var);
        if (j3 != null) {
            j3.animate().cancel();
            j3.o();
        }
        b8Var.c0 = j3 != null ? j3.getScaleX() : 1.0f;
        RectF Z = Z(b8Var);
        if (Z != null) {
            float centerX = Z.centerX() - b8Var.X;
            float centerY = Z.centerY() - b8Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            b8Var.U = hypot > ((float) org.telegram.messenger.g0.L(6.0f)) ? centerX / hypot : 0.0f;
            b8Var.V = hypot > ((float) org.telegram.messenger.g0.L(6.0f)) ? centerY / hypot : 1.0f;
        }
        b8Var.l.a(0.0f);
        a8Var.a(1.0f);
        long j10 = this.N0 + 1;
        this.N0 = j10;
        b8Var.I = j10;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new sk(5)));
        return arrayList;
    }

    public final void I(b8 b8Var, float[] fArr, float[] fArr2, boolean z9) {
        long j3 = b8Var.J;
        a8 a8Var = b8Var.o;
        a8 a8Var2 = b8Var.n;
        if (j3 == 0) {
            long j10 = this.R0 + 1;
            this.R0 = j10;
            b8Var.J = j10;
            ArrayList arrayList = new ArrayList();
            for (b8 b8Var2 : this.f.values()) {
                if (b8Var2 != b8Var && b8Var2.b()) {
                    arrayList.add(b8Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new sk(6)));
                for (int i7 = 0; i7 <= arrayList.size() - 10; i7++) {
                    b8 b8Var3 = (b8) arrayList.get(i7);
                    if (this.d.M()) {
                        E(b8Var3);
                    } else {
                        V(b8Var3);
                    }
                }
                k();
            }
        }
        b8Var.H = 1;
        b8Var.Q = false;
        b8Var.M = false;
        b8Var.L = false;
        b8Var.P = z9;
        b8Var.O = z9;
        long j11 = this.N0 + 1;
        this.N0 = j11;
        b8Var.I = j11;
        a8Var2.a(0.0f);
        a8Var.a(0.0f);
        a8 a8Var3 = b8Var.e;
        float f10 = z9 ? 150.0f : 500.0f;
        float f11 = z9 ? 0.82f : 1.0f;
        a8Var3.d = f10;
        a8Var3.e = f11;
        a8Var3.a(fArr[0]);
        a8Var3.b = fArr2[0];
        a8 a8Var4 = b8Var.f;
        float f12 = z9 ? 150.0f : 500.0f;
        float f13 = z9 ? 0.82f : 1.0f;
        a8Var4.d = f12;
        a8Var4.e = f13;
        a8Var4.a(fArr[1]);
        float f14 = fArr2[1];
        a8Var4.b = f14;
        b8Var.h.b = fArr2[2];
        a8 a8Var5 = b8Var.g;
        a8Var5.d = 300.0f;
        a8Var5.e = 0.5f;
        a8Var5.b = 1.0f;
        a8 a8Var6 = b8Var.j;
        a8Var6.d = z9 ? 110.0f : 150.0f;
        a8Var6.e = 0.9f;
        a8Var6.b = 0.0f;
        b8Var.m.b = 1.0f;
        b8Var.l.b = 0.0f;
        float f15 = fArr2[0] - fArr[0];
        float f16 = f14 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f15, f16));
        b8Var.U = max > ((float) org.telegram.messenger.g0.L(6.0f)) ? f15 / max : 0.0f;
        b8Var.V = max > ((float) org.telegram.messenger.g0.L(6.0f)) ? f16 / max : 1.0f;
        a8 a8Var7 = b8Var.k;
        a8Var7.a(0.9f);
        a8Var7.b = 0.0f;
        if (z9) {
            float min = Math.min(org.telegram.messenger.g0.L(110.0f), 0.32f * max);
            float f17 = f15 >= 0.0f ? -1.0f : 1.0f;
            a8Var2.a(0.0f);
            a8Var2.c = ((-f16) / max) * min * f17 * 20.0f;
            a8Var.a(0.0f);
            a8Var.c = com.google.android.recaptcha.internal.a.C(min, 0.5f, (f15 / max) * min * f17, 20.0f);
        }
        O();
        f0();
    }

    public final void K(b8 b8Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z9) {
        b8Var.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        b8Var.i.a(c((float) mediaAreaCoordinates.rotation));
        b8Var.N = z9;
        b8Var.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.Y0);
        b8Var.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.Z0);
        b8Var.g.a(1.0f);
        b8Var.j.a(0.0f);
        b8Var.k.a(0.0f);
        b8Var.n.a(0.0f);
        b8Var.o.a(0.0f);
        b8Var.l.a(0.0f);
        b8Var.H = 2;
        long j3 = this.N0 + 1;
        this.N0 = j3;
        b8Var.I = j3;
        b8Var.m.a(1.0f);
        if (b8Var.J == 0) {
            long j10 = this.R0 + 1;
            this.R0 = j10;
            b8Var.J = j10;
        }
        if (b8Var.a.equals(this.P0)) {
            this.T0 = b8Var;
            this.S0 = b8Var;
            this.U0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f10, float f11) {
        float[] fArr = {f10, f11};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void M(b8 b8Var, float f10, float f11) {
        a8 a8Var = b8Var.e;
        a8 a8Var2 = b8Var.h;
        float[] L = L(a8Var.a, b8Var.f.a);
        float t6 = Utilities.t(f10, f11, L[0], L[1]);
        if (Float.isNaN(this.E0)) {
            this.E0 = t6;
            this.F0 = a8Var2.b;
        }
        if (Math.abs(t6 - this.E0) > org.telegram.messenger.g0.L(5.0f)) {
            a8 a8Var3 = b8Var.q;
            a8Var3.d = 700.0f;
            a8Var3.e = 1.0f;
            a8Var3.b = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f) / U();
        float max = this.i0 ? (this.F0 * t6) / Math.max(1.0f, this.E0) : com.google.android.recaptcha.internal.a.z(1.21f, L2, (t6 - this.E0) / org.telegram.messenger.g0.L(110.0f), this.F0);
        a8Var2.d = 900.0f;
        a8Var2.e = 1.0f;
        a8Var2.b = Math.max(L2, Math.min(1.21f, max));
        if (t6 < org.telegram.messenger.g0.L(14.0f)) {
            this.B0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f11 - L[1], f10 - L[0]));
        if (!Float.isNaN(this.B0)) {
            this.C0 = c(degrees - this.B0) + this.C0;
        }
        this.B0 = degrees;
        float f12 = this.D0 + this.C0;
        float round = Math.round(f12 / 90.0f) * 90;
        boolean z9 = Math.abs(f12 - round) < 5.0f;
        if (z9 && !this.L0) {
            performHapticFeedback(4);
        }
        this.L0 = z9;
        a8 a8Var4 = b8Var.i;
        a8Var4.d = 900.0f;
        a8Var4.e = 0.95f;
        if (z9) {
            f12 = round;
        }
        a8Var4.b = f12;
    }

    public final void O() {
        if (!this.b && this.Y0 > 0.0f && this.Z0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (b8 b8Var : this.f.values()) {
                boolean b10 = b8Var.b();
                String str = b8Var.a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", b8Var.e.b / this.Y0);
                        jSONObject.put("y", b8Var.f.b / this.Z0);
                        jSONObject.put("r", b8Var.i.b);
                        jSONObject.put("s", b8Var.h.b);
                        jSONObject.put("q", b8Var.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.P0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final float P(b8 b8Var) {
        return (((1.0f - (b8Var.q.a * 0.9f)) * b8Var.l.a * 0.04f) + 1.0f) * U() * b8Var.g.a * b8Var.h.a;
    }

    public final void Q() {
        if (this.d1 && this.f1 == 0) {
            if (!this.a1 && (this.p0 || !A())) {
                org.telegram.messenger.g0.i3(this.g1, 1000L);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList G = G();
            int size = G.size();
            int i7 = 0;
            String str = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = G.get(i10);
                i10++;
                b8 b8Var = (b8) obj;
                boolean b10 = b8Var.b();
                String str2 = b8Var.a;
                if (b10) {
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(y(a0(b8Var)));
                    sb2.append(';');
                    if (str2.equals(this.P0) && m(b8Var)) {
                        str = str2;
                    }
                }
            }
            if (a8.p0.s(sb2, "bg:", str).equals(this.c1)) {
                this.d1 = false;
                return;
            }
            TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
            ArrayList G2 = G();
            int size2 = G2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = G2.get(i11);
                i11++;
                b8 b8Var2 = (b8) obj2;
                boolean b11 = b8Var2.b();
                String str3 = b8Var2.a;
                if (b11) {
                    TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                    inputwalletcardsticker.nft_address = str3;
                    inputwalletcardsticker.coordinates = a0(b8Var2);
                    setcardstickers.stickers.add(inputwalletcardsticker);
                    if (str3.equals(this.P0) && m(b8Var2)) {
                        setcardstickers.bg_nft_address = str3;
                    }
                }
            }
            this.d1 = false;
            int currentAccount = this.a.getCurrentAccount();
            TL_wallet.card cardVar = this.b1;
            TL_wallet.card cardVar2 = new TL_wallet.card();
            TL_wallet.card cardVar3 = this.b1;
            if (cardVar3 != null) {
                cardVar2.address = cardVar3.address;
                cardVar2.balance = cardVar3.balance;
            }
            ArrayList<TL_wallet.inputWalletCardSticker> arrayList = setcardstickers.stickers;
            int size3 = arrayList.size();
            while (i7 < size3) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i7);
                i7++;
                TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
                b8 b8Var3 = (b8) this.f.get(inputwalletcardsticker3.nft_address);
                if (b8Var3 != null && b8Var3.b != null) {
                    TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                    cardsticker.nft = b8Var3.b;
                    cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                    cardVar2.stickers.add(cardsticker);
                    if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                        cardVar2.bg_nft_item = b8Var3.b;
                    }
                }
            }
            e0(currentAccount, cardVar2);
            this.f1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new d3.b(1), new ag(this, currentAccount, cardVar, 3));
        }
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.b1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i7);
                i7++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(p7 p7Var) {
        removeCallbacks(this.A1);
        final int i7 = 1;
        this.s0 = true;
        final int i10 = 0;
        this.p0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        p7Var.animate().cancel();
        p7Var.n(p7Var.getScaleX() * p7Var.y0);
        p7Var.setScaleX(1.0f);
        p7Var.setScaleY(1.0f);
        p7Var.m(1.0f, 150L, null);
        final b8 v = v(p7Var.w0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.s0 = false;
            return;
        }
        k60 I = k60.I(this.a, p7Var);
        I.s = 51;
        if (m(v) || str.equals(this.P0)) {
            I.c(R.drawable.msg_colors, hd.M0(str.equals(this.P0) ? 2131743104 : 2131743110, null), new Runnable(this) { // from class: org.telegram.ui.Wallet.t7
                public final /* synthetic */ c8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.c0(v);
                            break;
                        default:
                            c8 c8Var = this.b;
                            c8Var.getClass();
                            c8Var.b0(v.b);
                            break;
                    }
                }
            }, false);
        }
        I.c(R.drawable.msg_sticker, hd.M0(v.b() ? 2131743103 : 2131743111, null), new Runnable(this) { // from class: org.telegram.ui.Wallet.t7
            public final /* synthetic */ c8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.c0(v);
                        break;
                    default:
                        c8 c8Var = this.b;
                        c8Var.getClass();
                        c8Var.b0(v.b);
                        break;
                }
            }
        }, false);
        I.p = new u7(this, i10);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Y0 * 0.231f;
    }

    public final void V(b8 b8Var) {
        if (b8Var.a.equals(this.P0)) {
            l();
        }
        b8Var.N = false;
        g(b8Var);
        p7 j3 = j(b8Var);
        if (j3 != null) {
            j3.setScaleX(0.93f);
            j3.setScaleY(0.93f);
            j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(b8 b8Var, float f10, float f11) {
        float[] fArr;
        this.h0 = null;
        this.m0 = true;
        boolean z9 = this.K0 == 2;
        this.o0 = z9;
        if (this.h1) {
            this.i1 = b8Var == this.k1 && !z9;
            this.j1 = false;
            this.h1 = false;
            qp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z10 = b8Var.N;
        a8 a8Var = b8Var.m;
        a8 a8Var2 = b8Var.f;
        a8 a8Var3 = b8Var.e;
        if (z10) {
            b8Var.N = false;
            a8 a8Var4 = b8Var.h;
            a8Var4.d = 420.0f;
            a8Var4.e = 0.8f;
            a8Var4.b = 1.0f;
        }
        p7 j3 = j(b8Var);
        if (j3 != null) {
            j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.t0 = false;
        if (this.o0) {
            fArr = L(a8Var3.a, a8Var2.a);
        } else {
            RectF Z = Z(b8Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            a8 a8Var5 = b8Var.g;
            a8Var5.d = 500.0f;
            a8Var5.e = 0.75f;
            a8Var5.a((f(b8Var) * Z.width()) / U());
            a8Var.a(0.0f);
            y5.m0((y5) this.d.b, 0L);
            fArr = fArr2;
        }
        a8Var3.d = 1100.0f;
        a8Var3.e = 0.9f;
        a8Var3.a(fArr[0]);
        a8Var2.d = 1100.0f;
        a8Var2.e = 0.9f;
        a8Var2.a(fArr[1]);
        b8Var.H = 3;
        long j10 = this.N0 + 1;
        this.N0 = j10;
        b8Var.I = j10;
        a8Var.b = 1.0f;
        a8 a8Var6 = b8Var.j;
        a8Var6.d = 320.0f;
        a8Var6.e = 0.75f;
        a8Var6.b = 1.0f;
        b8Var.l.a(0.0f);
        this.z0 = fArr[0] - f10;
        this.A0 = fArr[1] - f11;
        this.N.b = this.o0 ? 1.0f : 0.0f;
        performHapticFeedback(3);
    }

    public final void X(b8 b8Var, boolean z9) {
        this.S0 = this.T0;
        this.T0 = b8Var;
        this.U0 = 0.0f;
        this.X0 = z9;
        if (b8Var != null) {
            this.V0 = b8Var.e.b / this.Y0;
            this.W0 = b8Var.f.b / this.Z0;
        }
        f0();
    }

    public final void Y(f0 f0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = f0Var.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (nftitem2.gift != null) {
                v(nftitem2);
            }
        }
        Iterator it = this.f.values().iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            b8 b8Var = (b8) it.next();
            int i10 = b8Var.H;
            String str = b8Var.a;
            if (i10 != 3) {
                ArrayList arrayList2 = f0Var.c;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && n0.b(nftitem.address, str)) {
                            if (str.equals(this.P0) || str.equals(this.Q0)) {
                                this.Q0 = null;
                                this.P0 = null;
                                X(null, true);
                            }
                            it.remove();
                            SharedPreferences sharedPreferences = this.e;
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().remove(str).apply();
                            }
                            z9 = true;
                        }
                    }
                }
            }
        }
        if (z9 && !this.b) {
            O();
            k();
        }
        f0();
    }

    public final RectF Z(b8 b8Var) {
        p7 j3 = j(b8Var);
        if (j3 != null && j3.isShown()) {
            Matrix matrix = this.w;
            h6.k(j3, matrix);
            Matrix matrix2 = this.x;
            h6.k(this, matrix2);
            if (!matrix2.invert(matrix2)) {
                return null;
            }
            matrix.postConcat(matrix2);
            RectF rectF = new RectF(0.0f, 0.0f, j3.getWidth(), j3.getHeight());
            matrix.mapRect(rectF);
            if (rectF.bottom > 0.0f && rectF.top < getHeight()) {
                return rectF;
            }
        }
        return null;
    }

    public final void a() {
        this.q0 = false;
        removeCallbacks(this.B1);
        removeCallbacks(this.A1);
        this.g0 = null;
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(b8 b8Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * b8Var.h.b;
        tL_mediaAreaCoordinates.x = N((b8Var.e.b / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.y = N((b8Var.f.b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.w = N((U / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.Z0) * 100.0f);
        float f10 = b8Var.i.b % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f10);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (A()) {
            b8 v = v(nftitem);
            if (v.b()) {
                if (this.d.M()) {
                    E(v);
                } else {
                    V(v);
                }
            } else if (v.H == 0 && b(v)) {
                d0(v);
            }
            k();
        }
    }

    public final void c0(b8 b8Var) {
        String str = b8Var.a;
        if (str.equals(this.P0)) {
            l();
            return;
        }
        if (m(b8Var)) {
            this.P0 = str;
            if (b8Var.b()) {
                X(b8Var, false);
                k();
            } else {
                this.Q0 = str;
                d0(b8Var);
                if (b8Var.H == 0) {
                    this.Q0 = null;
                    this.P0 = null;
                } else {
                    k();
                }
            }
            O();
        }
    }

    public final void d(TL_wallet.card cardVar) {
        int i7;
        this.b1 = cardVar;
        this.c1 = T(cardVar);
        if (this.d1 || this.f1 != 0 || this.p0) {
            return;
        }
        TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
        b8 b8Var = null;
        String str = nftitem == null ? null : nftitem.address;
        boolean equals = TextUtils.equals(str, this.P0);
        if (!equals) {
            this.P0 = str;
            this.Q0 = null;
        }
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i10);
                i10++;
                TL_wallet.nftItem nftitem2 = cardsticker.nft;
                if (nftitem2 != null && nftitem2.gift != null) {
                    v(nftitem2);
                }
            }
        }
        if (this.b) {
            TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
            if (nftitem3 != null && nftitem3.gift != null) {
                b8Var = v(nftitem3);
            }
            this.S0 = b8Var;
            this.T0 = b8Var;
            this.U0 = 1.0f;
            e();
            f0();
            return;
        }
        if (!A()) {
            f0();
            return;
        }
        this.e1 = true;
        ArrayList G = G();
        int size2 = G.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = G.get(i11);
            i11++;
            b8 b8Var2 = (b8) obj;
            if (b8Var2.K && (i7 = b8Var2.H) != 3 && i7 != 4 && i7 != 5) {
                TL_wallet.cardSticker R = R(b8Var2.a);
                if (R != null) {
                    if (!b8Var2.b() || !y(a0(b8Var2)).equals(y(R.coordinates))) {
                        K(b8Var2, R.coordinates, b8Var2.N);
                    }
                } else if (b8Var2.b()) {
                    E(b8Var2);
                }
            }
        }
        ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
        LinkedHashMap linkedHashMap = this.f;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                TL_wallet.cardSticker cardsticker2 = arrayList2.get(i12);
                i12++;
                TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                b8 b8Var3 = nftitem4 == null ? null : (b8) linkedHashMap.get(nftitem4.address);
                if (b8Var3 != null && b8Var3.H == 2) {
                    long j3 = this.N0 + 1;
                    this.N0 = j3;
                    b8Var3.I = j3;
                }
            }
        }
        if (!equals) {
            String str2 = this.P0;
            b8 b8Var4 = str2 == null ? null : (b8) linkedHashMap.get(str2);
            if (b8Var4 == null || !b8Var4.b()) {
                X(null, true);
            } else {
                X(b8Var4, false);
            }
        }
        this.e1 = false;
        O();
        f0();
    }

    public final void d0(b8 b8Var) {
        y5.m0((y5) this.d.b, 2600L);
        if (A()) {
            float[] x10 = x(b8Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(b8Var);
            int i7 = 0;
            if (x10 == null || Z == null) {
                p7 j3 = j(b8Var);
                if (j3 != null) {
                    j3.animate().rotation(3.0f).setDuration(90L).withEndAction(new s7(j3, i7)).start();
                    return;
                }
                return;
            }
            b8Var.g.a((f(b8Var) * Z.width()) / U());
            b8Var.m.a(0.0f);
            b8Var.j.a(1.0f);
            float[] fArr = {Z.centerX(), Z.centerY()};
            this.s.mapPoints(fArr);
            I(b8Var, fArr, x10, true);
            performHapticFeedback(3);
        }
    }

    public final void e() {
        float pow;
        b8 b8Var = this.S0;
        float[] i7 = q7.i(b8Var == null ? null : b8Var.t);
        b8 b8Var2 = this.T0;
        float[] i10 = q7.i(b8Var2 == null ? null : b8Var2.t);
        if (this.X0) {
            float f10 = this.U0;
            pow = com.google.android.recaptcha.internal.a.C(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.U0, 4.0d));
        }
        float[] fArr = new float[18];
        System.arraycopy(new float[]{i7[0], i7[1], i7[2], i10[0], i10[1], i10[2], this.V0, this.W0, pow, this.X0 ? 1.0f : 0.0f}, 0, fArr, 0, 10);
        b8 b8Var3 = this.S0;
        q7.m(fArr, 0, b8Var3 == null ? null : b8Var3.t);
        b8 b8Var4 = this.T0;
        q7.m(fArr, 1, b8Var4 == null ? null : b8Var4.t);
        this.c.setStickerStyle(fArr);
    }

    public final float f(b8 b8Var) {
        p7 j3 = j(b8Var);
        if (j3 == null) {
            return 0.77f;
        }
        org.telegram.ui.Components.l9 l9Var = j3.D;
        if (j3.getWidth() <= 0 || l9Var.getWidth() <= 0) {
            return 0.77f;
        }
        return ((l9Var.getWidth() / j3.getWidth()) * 288.0f) / 268.0f;
    }

    public final void f0() {
        if (this.a1 || !isAttachedToWindow()) {
            return;
        }
        x7 x7Var = this.C1;
        removeCallbacks(x7Var);
        postOnAnimation(x7Var);
    }

    public final void g(b8 b8Var) {
        b8Var.H = 0;
        b8Var.J = 0L;
        b8Var.g.a(1.0f);
        b8Var.h.a(1.0f);
        b8Var.i.a(0.0f);
        b8Var.m.a(0.0f);
        b8Var.j.a(0.0f);
        b8Var.k.a(0.0f);
        p7 j3 = j(b8Var);
        if (j3 != null) {
            j3.animate().cancel();
            j3.setScaleX(1.0f);
            j3.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.g0.L(64.0f)) - org.telegram.messenger.g0.n;
    }

    public final void i(p7 p7Var) {
        ArrayList arrayList = this.h;
        if (!arrayList.contains(p7Var)) {
            arrayList.add(p7Var);
        }
        b8 v = v(p7Var.w0);
        p7Var.k(v.R, false, v.H == 0 ? 0.0f : 1.0f);
        f0();
    }

    public final p7 j(b8 b8Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            p7 p7Var = (p7) obj;
            if (p7Var.isAttachedToWindow() && p7Var.w0.address.equals(b8Var.a)) {
                return p7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (this.b || this.e1) {
            return;
        }
        this.d1 = true;
        u7 u7Var = this.g1;
        org.telegram.messenger.g0.r(u7Var);
        org.telegram.messenger.g0.i3(u7Var, 1500L);
    }

    public final void l() {
        this.Q0 = null;
        this.P0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(b8 b8Var) {
        return b(b8Var) && F(this.a.getCurrentAccount(), b8Var.b.gift.slug);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.y1);
        getViewTreeObserver().addOnPreDrawListener(this.z1);
        for (b8 b8Var : this.f.values()) {
            b8Var.c.P();
            b8Var.d.P();
        }
        f0();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.y1);
        getViewTreeObserver().removeOnPreDrawListener(this.z1);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        for (b8 b8Var : this.f.values()) {
            b8Var.c.R();
            b8Var.d.R();
        }
        this.M0 = 0L;
        super.onDetachedFromWindow();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r31) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c8.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        f0();
    }

    public final void p() {
        org.telegram.messenger.g0.E2(this.w1);
        org.telegram.messenger.g0.E2(this.x1);
        this.x1 = null;
        this.w1 = null;
        O();
        org.telegram.messenger.g0.r(this.g1);
        this.h0 = null;
        this.a1 = true;
        if (this.d1) {
            Q();
        }
        this.e0.C(false);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        for (b8 b8Var : this.f.values()) {
            b8Var.c.R();
            b8Var.d.R();
        }
        this.h.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(b8 b8Var, float f10, float f11) {
        boolean z9;
        float f12;
        float U;
        float f13 = this.z0 * 0.9f;
        this.z0 = f13;
        float f14 = this.A0 * 0.9f;
        this.A0 = f14;
        boolean z10 = false;
        float[] fArr = {f13 + f10, f14 + f11};
        this.s.mapPoints(fArr);
        float f15 = fArr[0];
        if (f15 >= 0.0f && f15 <= this.Y0) {
            float f16 = fArr[1];
            if (f16 >= 0.0f && f16 <= this.Z0) {
                z9 = true;
                if (this.o0 && !z9 && Utilities.t(f10, f11, getWidth() / 2.0f, h()) < org.telegram.messenger.g0.L(78.0f)) {
                    z10 = true;
                }
                if (z10 != this.t0) {
                    performHapticFeedback(4);
                }
                this.t0 = z10;
                this.N.b = (this.o0 || z9) ? 0.0f : 1.0f;
                this.O.b = !z10 ? 1.0f : 0.0f;
                a8 a8Var = b8Var.e;
                if (z10) {
                    f12 = this.z0;
                } else {
                    float L = org.telegram.messenger.g0.L(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(L);
                    f10 = (getWidth() / 2.0f) - ((paint.measureText(hd.M0(2131746320, null)) + org.telegram.messenger.g0.L(72.0f)) / 2.0f);
                    f12 = org.telegram.messenger.g0.L(30.0f);
                }
                a8Var.b = f10 + f12;
                b8Var.f.b = !z10 ? h() - org.telegram.messenger.g0.L(46.0f) : f11 + this.A0;
                RectF Z = Z(b8Var);
                float U2 = Z != null ? U() : Z.width();
                a8 a8Var2 = b8Var.g;
                if (z10) {
                    U = 1.24f * (z9 ? 1.0f : (U2 * 0.77f) / U());
                } else {
                    U = org.telegram.messenger.g0.L(38.0f) / U();
                }
                a8Var2.b = U;
                if (this.o0) {
                    return;
                }
                a8 a8Var3 = b8Var.i;
                a8Var3.d = 260.0f;
                a8Var3.e = 0.9f;
                float f17 = a8Var3.a;
                a8Var3.b = c((z9 ? this.J0 : 0.0f) - f17) + f17;
                return;
            }
        }
        z9 = false;
        if (this.o0) {
            z10 = true;
        }
        if (z10 != this.t0) {
        }
        this.t0 = z10;
        this.N.b = (this.o0 || z9) ? 0.0f : 1.0f;
        this.O.b = !z10 ? 1.0f : 0.0f;
        a8 a8Var4 = b8Var.e;
        if (z10) {
        }
        a8Var4.b = f10 + f12;
        b8Var.f.b = !z10 ? h() - org.telegram.messenger.g0.L(46.0f) : f11 + this.A0;
        RectF Z2 = Z(b8Var);
        if (Z2 != null) {
        }
        a8 a8Var22 = b8Var.g;
        if (z10) {
        }
        a8Var22.b = U;
        if (this.o0) {
        }
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18;
        float f19 = f12;
        float f20 = (f19 * f13) + ((-f19) / 2.0f);
        float f21 = 0.3f * f19;
        float f22 = 3.2f * f19;
        float f23 = 0.72f * f14;
        float f24 = f21 * f23;
        double d = f15;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 > 14) {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.y);
                return;
            }
            int i11 = 0;
            for (int i12 = 14; i11 <= i12; i12 = 14) {
                float f25 = ((i11 / 14.0f) - 0.5f) * f19;
                float f26 = ((i7 / 14.0f) - 0.5f) * f19;
                float f27 = (f25 * cos) - (f26 * sin);
                float f28 = (f26 * cos) + (f25 * sin);
                float f29 = (f28 * f17) + (f27 * f16);
                float f30 = (f28 * f16) + ((-f27) * f17);
                float f31 = f20 - f29;
                float f32 = 0.0f;
                float f33 = 1.0f;
                if (f31 > 0.0f) {
                    float min = Math.min(f23, f31 / f21);
                    float max = Math.max(0.0f, f31 - f24);
                    f18 = f21;
                    double d2 = min;
                    float sin2 = (f20 - (f18 * ((float) Math.sin(d2)))) - (((float) Math.cos(d2)) * max);
                    float sin3 = (max * ((float) Math.sin(d2))) + ((1.0f - ((float) Math.cos(d2))) * f18);
                    f33 = (((float) Math.cos(d2)) * 0.38f) + 0.62f;
                    f29 = sin2;
                    f32 = sin3;
                } else {
                    f18 = f21;
                }
                float f34 = f22 / (f22 - f32);
                int i13 = i10 * 2;
                float[] fArr = this.J;
                fArr[i13] = (((f29 * f16) - (f30 * f17)) * f34) + f10;
                fArr[i13 + 1] = ((((f30 * f16) + (f29 * f17)) * f34) + f11) - (f32 * 0.15f);
                int i14 = (int) (255.0f * f33);
                this.K[i10] = Color.rgb(i14, i14, i14);
                i11++;
                f19 = f12;
                i10++;
                f21 = f18;
            }
            i7++;
            f19 = f12;
        }
    }

    public final void s(Canvas canvas, b8 b8Var, float f10, float f11, boolean z9) {
        float f12;
        ImageReceiver imageReceiver = b8Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = b8Var.t;
        Bitmap n10 = imageReceiver.n();
        if (n10 == null || stargiftattributebackdrop == null) {
            return;
        }
        canvas.save();
        float f13 = this.Y0;
        float f14 = this.Z0;
        Path path = this.I;
        path.rewind();
        float f15 = 0.15f;
        char c10 = 0;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(0.0f, 0.0f, f13, f14, (f13 * 0.15f) / 2.0f, (f14 * 0.15f) / 1.212122f, direction);
        canvas.clipPath(path);
        this.c.h(path, this.Y0, this.Z0);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        if (f11 >= 0.0f && !z9) {
            path.rewind();
            path.addCircle(this.V0 * this.Y0, this.W0 * this.Z0, f11, direction);
            canvas.clipPath(path);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
        Paint paint = this.y;
        paint.setColorFilter(porterDuffColorFilter);
        float f16 = this.Y0 / 336.0f;
        float f17 = this.Z0 / 205.0f;
        int i7 = 16;
        int i10 = 0;
        int i11 = 16;
        while (i11 < 336) {
            int i12 = ((i10 % 2) * 18) + i7;
            while (i12 < 205) {
                float f18 = i11 * f16;
                float f19 = i12 * f17;
                float f20 = f15;
                float f21 = f16 * 12.0f;
                float l10 = Utilities.l(Math.min(Math.min(i11, 336 - i11), Math.min(i12, 205 - i12)) / 48.0f);
                float f22 = f16;
                float C = f10 * f20 * com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
                if (f11 >= 0.0f) {
                    float l11 = Utilities.l((f11 - Utilities.t(f18, f19, this.V0 * this.Y0, this.W0 * this.Z0)) / org.telegram.messenger.g0.L(120.0f));
                    if (z9) {
                        f21 = com.google.android.recaptcha.internal.a.C(l11, 0.8f, 1.0f, f21);
                        C *= 1.0f - Utilities.l(l11 * 1.6f);
                    } else {
                        f12 = f18;
                        f21 *= (((((float) Math.sin(l11 * 3.141592653589793d)) * 0.28f) + l11) * 0.8f) + 0.2f;
                        C *= Utilities.l(l11 * 1.6f);
                        paint.setAlpha((int) (C * 255.0f));
                        float f23 = f21 / 2.0f;
                        RectF rectF = this.H;
                        rectF.set(f12 - f23, f19 - f23, f12 + f23, f19 + f23);
                        canvas.drawBitmap(n10, (Rect) null, rectF, paint);
                        i12 += 37;
                        f15 = f20;
                        c10 = 0;
                        f16 = f22;
                    }
                }
                f12 = f18;
                paint.setAlpha((int) (C * 255.0f));
                float f232 = f21 / 2.0f;
                RectF rectF2 = this.H;
                rectF2.set(f12 - f232, f19 - f232, f12 + f232, f19 + f232);
                canvas.drawBitmap(n10, (Rect) null, rectF2, paint);
                i12 += 37;
                f15 = f20;
                c10 = 0;
                f16 = f22;
            }
            i11 += 33;
            i10++;
            i7 = 16;
        }
        paint.setColorFilter(null);
        paint.setAlpha(qs.e4);
        canvas.restore();
    }

    public final void t(Canvas canvas, b8 b8Var, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (f15 <= 0.01f || b8Var.w == null) {
            return;
        }
        float f16 = (((0.05f * f13) + 1.0f) * ((f12 * 176.0f) / 128.0f)) / 2.0f;
        float f17 = f10 - f16;
        float f18 = f11 - f16;
        float f19 = f10 + f16;
        float f20 = f11 + f16;
        RectF rectF = this.H;
        rectF.set(f17, f18, f19, f20);
        Paint paint = this.y;
        int alpha = paint.getAlpha();
        paint.setColor(-16044452);
        paint.setAlpha((int) (Utilities.l(b8Var.m.a) * Utilities.l((f14 * 0.12f) + (f13 * (-0.049999997f)) + 0.16f) * 255.0f * f15));
        canvas.drawBitmap(b8Var.w, (Rect) null, rectF, paint);
        paint.setColor(-1);
        paint.setAlpha(alpha);
    }

    public final b8 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        b8 b8Var = (b8) linkedHashMap.get(str);
        if (b8Var == null) {
            b8Var = new b8(this, nftitem);
            linkedHashMap.put(nftitem.address, b8Var);
        }
        b8Var.b = nftitem;
        return b8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(float f10, float f11, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        float[] x10;
        getParent().requestDisallowInterceptTouchEvent(false);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        this.w0 = f11;
        if (this.m0) {
            y5 y5Var = (y5) this.d.b;
            float f12 = y5Var.I0;
            f4 f4Var = y5Var.K0;
            if (f12 > 0.0f) {
                org.telegram.messenger.g0.r(f4Var);
                org.telegram.messenger.g0.i3(f4Var, 1650L);
            }
        }
        b8 b8Var = this.g0;
        if (b8Var != null) {
            a8 a8Var = b8Var.g;
            a8 a8Var2 = b8Var.i;
            a8 a8Var3 = b8Var.f;
            a8 a8Var4 = b8Var.e;
            p7 j3 = j(b8Var);
            if (j3 != null) {
                j3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
            }
            if (this.m0) {
                Matrix matrix = this.s;
                if (z9 && this.K0 == 2) {
                    float[] fArr = {a8Var4.a, a8Var3.a};
                    matrix.mapPoints(fArr);
                    a8 a8Var5 = b8Var.h;
                    float f13 = this.I0;
                    a8Var5.b = f13;
                    a8Var2.b = this.J0;
                    I(b8Var, fArr, new float[]{this.G0, this.H0, f13}, false);
                } else if (z9) {
                    E(b8Var);
                } else if (this.t0) {
                    b8Var.H = 5;
                    long j10 = this.N0 + 1;
                    this.N0 = j10;
                    b8Var.I = j10;
                    b8Var.J = 0L;
                    this.f0 = true;
                    a8 a8Var6 = this.c0;
                    a8Var6.a(Math.max(30.0f, a8Var6.a));
                    a8Var4.d = 500.0f;
                    a8Var4.e = 0.9f;
                    float L = org.telegram.messenger.g0.L(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(L);
                    a8Var4.b = ((getWidth() / 2.0f) - ((paint.measureText(hd.M0(2131746320, null)) + org.telegram.messenger.g0.L(72.0f)) / 2.0f)) + org.telegram.messenger.g0.L(30.0f);
                    a8Var3.d = 500.0f;
                    a8Var3.e = 0.9f;
                    a8Var3.b = h();
                    a8Var.d = 240.0f;
                    a8Var.e = 0.95f;
                    a8Var.b = 0.0f;
                    b8Var.j.b = 0.0f;
                    a8Var2.b = 0.0f;
                    if (b8Var.a.equals(this.P0)) {
                        l();
                    }
                    performHapticFeedback(16);
                } else {
                    float[] fArr2 = {a8Var4.a, a8Var3.a};
                    matrix.mapPoints(fArr2);
                    float f14 = fArr2[0];
                    if (f14 >= 0.0f && f14 <= this.Y0) {
                        float f15 = fArr2[1];
                        if (f15 >= 0.0f && f15 <= this.Z0) {
                            z10 = true;
                            if (this.o0) {
                                z11 = z10;
                                if (((float) Math.hypot(f10, f11)) > org.telegram.messenger.g0.L(700.0f) && (z11 || f11 < (-org.telegram.messenger.g0.L(600.0f)))) {
                                    z12 = true;
                                    x10 = z11 ? x(b8Var, fArr2[0], fArr2[1], false) : null;
                                    if (z12) {
                                        x10 = x(b8Var, Math.max(0.0f, Math.min(this.Y0, (f10 * 0.08f) + fArr2[0])), Math.max(0.0f, Math.min(this.Z0, (f11 * 0.08f) + fArr2[1])), true);
                                    }
                                    if (x10 != null) {
                                        I(b8Var, fArr2, x10, false);
                                    } else {
                                        E(b8Var);
                                    }
                                    if (x10 != null) {
                                        b8Var.P = z12;
                                        if (z12) {
                                            a8Var4.d = 260.0f;
                                            a8Var4.e = 0.8f;
                                            a8Var3.d = 260.0f;
                                            a8Var3.e = 0.8f;
                                        }
                                    }
                                }
                            } else {
                                z11 = z10;
                            }
                            z12 = false;
                            if (z11) {
                            }
                            if (z12) {
                            }
                            if (x10 != null) {
                            }
                            if (x10 != null) {
                            }
                        }
                    }
                    z10 = false;
                    if (this.o0) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    if (z12) {
                    }
                    if (x10 != null) {
                    }
                    if (x10 != null) {
                    }
                }
            } else if (this.n0 || this.i0) {
                a8 a8Var7 = b8Var.l;
                a8Var7.d = 380.0f;
                a8Var7.e = 0.62f;
                a8Var7.b = 0.0f;
                a8Var2.a = c(a8Var2.a);
                a8Var2.b = c(a8Var2.b);
            } else if (!z9) {
                if (this.u0) {
                    this.h0 = b8Var;
                    a8Var.c += 3.0f;
                    long j11 = this.N0 + 1;
                    this.N0 = j11;
                    b8Var.I = j11;
                    b8Var.S = true;
                    b8Var.T = false;
                    di.z2 z2Var = b8Var.c;
                    z2Var.u0 = true;
                    z2Var.P0(false);
                    performHapticFeedback(3);
                } else {
                    ((y5) this.a).H0(b8Var.b);
                }
            }
        }
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        if (b8Var != null && (this.m0 || this.n0 || this.i0)) {
            k();
        }
        this.i1 = false;
        this.o0 = false;
        this.t0 = false;
        this.i0 = false;
        this.n0 = false;
        this.m0 = false;
        this.q0 = false;
        this.p0 = false;
        this.g0 = null;
        this.N.b = 0.0f;
        this.O.b = 0.0f;
        O();
        f0();
    }

    public final float[] x(b8 b8Var, float f10, float f11, boolean z9) {
        float f12;
        float f13;
        float f14;
        ArrayList arrayList;
        float nextFloat;
        if (!z9) {
            b8Var.N = false;
            return new float[]{f10, f11, b8Var.h.b};
        }
        ArrayList<RectF> stickerObstacles = this.c.getStickerObstacles();
        float f15 = this.Y0 * 0.012f;
        int size = stickerObstacles.size();
        int i7 = 0;
        while (i7 < size) {
            RectF rectF = stickerObstacles.get(i7);
            i7++;
            float f16 = -f15;
            rectF.inset(f16, f16);
        }
        stickerObstacles.get(2).left -= this.Y0 * 0.035f;
        float L = org.telegram.messenger.g0.L(32.0f) / U();
        float f17 = b8Var.h.b;
        b8Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (b8 b8Var2 : this.f.values()) {
            if (b8Var2 != b8Var && b8Var2.b()) {
                arrayList2.add(b8Var2);
            }
        }
        boolean z10 = (Float.isNaN(f10) || Float.isNaN(f11)) ? false : true;
        if (!z10 && b8Var == this.k1 && this.m1 != null && arrayList2.isEmpty()) {
            return (float[]) this.m1.clone();
        }
        if (z10) {
            f12 = f10;
            f13 = f11;
        } else {
            f12 = this.Y0 * 0.6f;
            f13 = this.Z0 * 0.68f;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (b8Var.a.hashCode() * 7919));
        float nextFloat2 = (random.nextFloat() * 0.04f) + 0.05f;
        float f18 = 0.5f;
        float nextFloat3 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Y0;
        float nextFloat4 = this.Z0 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * L * 0.5f;
        float f19 = -3.4028235E38f;
        float[] fArr = null;
        float f20 = U;
        while (f20 <= this.Z0 - U) {
            float f21 = f18;
            float f22 = U;
            while (true) {
                float f23 = this.Y0;
                if (f22 <= f23 - U) {
                    float min = Math.min(Math.min(f22, f23 - f22), Math.min(f20, this.Z0 - f20));
                    float f24 = nextFloat2;
                    float min2 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * nextFloat2)) * f17, min / (U() * f21));
                    int size2 = stickerObstacles.size();
                    float f25 = L;
                    float f26 = f17;
                    int i10 = 0;
                    float f27 = Float.MAX_VALUE;
                    while (i10 < size2) {
                        ArrayList<RectF> arrayList3 = stickerObstacles;
                        RectF rectF2 = stickerObstacles.get(i10);
                        f27 = Math.min(f27, Utilities.t(f22, f20, Math.max(rectF2.left, Math.min(rectF2.right, f22)), Math.max(rectF2.top, Math.min(rectF2.bottom, f20))));
                        i10++;
                        stickerObstacles = arrayList3;
                        z10 = z10;
                    }
                    ArrayList<RectF> arrayList4 = stickerObstacles;
                    boolean z11 = z10;
                    float min3 = Math.min(min2, f27 / (U() * 0.44f));
                    int i11 = 0;
                    for (int size3 = arrayList2.size(); i11 < size3; size3 = size3) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        b8 b8Var3 = (b8) obj;
                        min3 = Math.min(min3, (Utilities.t(f22, f20, b8Var3.e.b, b8Var3.f.b) / (U() * 0.29f)) - b8Var3.h.b);
                    }
                    float l10 = ((Utilities.l((min - ((U() * f21) * min3)) / org.telegram.messenger.g0.L(14.0f)) * 0.1f) + 0.9f) * min3;
                    if (l10 < f25) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f28 = this.Y0 * 0.6f;
                            float z12 = com.google.android.recaptcha.internal.a.z(f12, f28, 0.2f, f28);
                            float f29 = this.Z0 * 0.68f;
                            nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(5.0f)) + (U() * 1.1f * l10) + (Utilities.t(f22, f20, z12, com.google.android.recaptcha.internal.a.z(f13, f29, 0.2f, f29)) * (-0.45f));
                            f14 = l10;
                            arrayList = arrayList2;
                        } else {
                            float f30 = f20 * l10 * l10;
                            float f31 = l10 * l10;
                            int size4 = arrayList2.size();
                            float f32 = f22 * l10 * l10;
                            int i12 = 0;
                            float f33 = Float.MAX_VALUE;
                            float f34 = 0.0f;
                            while (i12 < size4) {
                                Object obj2 = arrayList2.get(i12);
                                int i13 = i12 + 1;
                                b8 b8Var4 = (b8) obj2;
                                float f35 = l10;
                                a8 a8Var = b8Var4.e;
                                int i14 = size4;
                                a8 a8Var2 = b8Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                a8 a8Var3 = b8Var4.f;
                                f33 = Math.min(f33, Utilities.t(f22, f20, a8Var.b, a8Var3.b) - ((a8Var2.b + f35) * (U() * 0.4f)));
                                float f36 = a8Var2.b;
                                float f37 = f36 * f36;
                                float f38 = b8Var4.e.b;
                                f32 = (f38 * f37) + f32;
                                f30 = (a8Var3.b * f37) + f30;
                                f31 += f37;
                                f34 = Math.max(0.0f, 1.0f - (Math.abs(a8Var3.b - f20) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f38 - f22) / (U() * 0.12f))) + f34;
                                l10 = f35;
                                i12 = i13;
                                size4 = i14;
                                arrayList2 = arrayList5;
                            }
                            f14 = l10;
                            arrayList = arrayList2;
                            nextFloat = ((random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + (((((Math.min(Math.min(min, f27), U()) * 0.2f) + ((U() * (f14 * 0.9f)) + ((f33 < 0.0f ? f33 * 2.5f : Math.min(f33, U() * 0.3f)) * 1.2f))) - (Utilities.t(f32 / f31, f30 / f31, nextFloat3, nextFloat4) * 0.35f)) - ((U() * f34) * 0.08f)) - (Utilities.t(f22, f20, this.Y0 * f21, this.Z0 * 0.55f) * 0.04f))) - (z11 ? Utilities.t(f22, f20, f12, f13) * 0.04f : 0.0f);
                        }
                        if (nextFloat > f19) {
                            f19 = nextFloat;
                            fArr = new float[]{f22, f20, f14};
                            f22 += org.telegram.messenger.g0.L(5.0f);
                            nextFloat2 = f24;
                            L = f25;
                            f17 = f26;
                            stickerObstacles = arrayList4;
                            z10 = z11;
                            arrayList2 = arrayList;
                        }
                    }
                    f22 += org.telegram.messenger.g0.L(5.0f);
                    nextFloat2 = f24;
                    L = f25;
                    f17 = f26;
                    stickerObstacles = arrayList4;
                    z10 = z11;
                    arrayList2 = arrayList;
                }
            }
            f20 += org.telegram.messenger.g0.L(5.0f);
            f18 = f21;
            nextFloat2 = nextFloat2;
        }
        return fArr;
    }

    public final boolean z(p7 p7Var) {
        if (!p7Var.isShown()) {
            return false;
        }
        Rect rect = this.F1;
        return p7Var.getGlobalVisibleRect(rect) && rect.width() >= p7Var.getWidth() - 1 && rect.height() >= p7Var.getHeight() - 1;
    }
}
