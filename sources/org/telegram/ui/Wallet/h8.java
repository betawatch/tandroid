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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.uk;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ng;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h8 extends View {
    public static final /* synthetic */ int G1 = 0;
    public float A0;
    public final z7 A1;
    public float B0;
    public final z7 B1;
    public float C0;
    public final c8 C1;
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
    public final b8 L;
    public boolean L0;
    public final a8 M;
    public long M0;
    public final f8 N;
    public long N0;
    public final f8 O;
    public VelocityTracker O0;
    public final f8 P;
    public String P0;
    public final f8 Q;
    public String Q0;
    public final f8 R;
    public long R0;
    public final ArrayList S;
    public g8 S0;
    public final Path T;
    public g8 T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public float V0;
    public final Matrix W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.k2 a;
    public float a0;
    public boolean a1;
    public final boolean b;
    public float b0;
    public TL_wallet.card b1;
    public final l6 c;
    public final f8 c0;
    public String c1;
    public final m4.c d;
    public final Paint d0;
    public boolean d1;
    public final SharedPreferences e;
    public final bi0 e0;
    public boolean e1;
    public final LinkedHashMap f;
    public boolean f0;
    public int f1;
    public g8 g0;
    public final z7 g1;
    public final ArrayList h;
    public g8 h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public final Paint j0;
    public boolean j1;
    public final Paint k0;
    public g8 k1;
    public final Paint l0;
    public u7 l1;
    public boolean m0;
    public float[] m1;
    public final ArrayList n;
    public boolean n0;
    public float n1;
    public boolean o0;
    public final float[] o1;
    public boolean p0;
    public final f8 p1;
    public boolean q0;
    public final f8 q1;
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
    public vh.p2 w1;
    public final Matrix x;
    public float x0;
    public vh.p2 x1;
    public final Paint y;
    public float y0;
    public final k1 y1;
    public float z0;
    public final n5 z1;

    public h8(org.telegram.ui.ActionBar.k2 k2Var, l6 l6Var, m4.c cVar, TL_wallet.card cardVar) {
        super(k2Var.getContext());
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
        int i10 = 1;
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[zs.C3];
        this.N = new f8(0.0f, 260.0f, 0.78f);
        this.O = new f8(0.0f, 420.0f, 0.72f);
        this.P = new f8(1.0f, 420.0f, 0.38f);
        this.Q = new f8(0.0f, 170.0f, 0.42f);
        this.R = new f8(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.c0 = new f8(0.0f, 120.0f, 1.0f);
        this.d0 = new Paint(1);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.U0 = 1.0f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.g1 = new z7(this, i10);
        this.o1 = new float[3];
        this.p1 = new f8(0.0f, 260.0f, 1.0f);
        this.q1 = new f8(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.r1 = paint4;
        Paint paint5 = new Paint(1);
        this.s1 = paint5;
        this.t1 = new Matrix();
        this.u1 = new Path();
        this.v1 = new RectF();
        this.y1 = new k1(this, i10);
        int i11 = 2;
        this.z1 = new n5(i11, this);
        this.A1 = new z7(this, i11);
        this.B1 = new z7(this, 3);
        this.C1 = new c8(this);
        this.D1 = new RectF();
        Paint paint6 = new Paint(1);
        this.E1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F1 = new Rect();
        this.a = k2Var;
        int i12 = 0;
        boolean z10 = cardVar != null;
        this.b = z10;
        bi0 bi0Var = new bi0(R.raw.wallet_gift_trash, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), true, null);
        this.e0 = bi0Var;
        bi0Var.R(this);
        this.c = l6Var;
        this.d = cVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + k2Var.getCurrentAccount() + "_" + k0.x(k2Var.getCurrentAccount()).t(), 0);
        }
        this.e = sharedPreferences;
        this.P0 = z10 ? null : sharedPreferences.getString("style", null);
        this.h1 = (z10 || vp.d1().getBoolean("walletcardstickerhint", false)) ? false : true;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(org.telegram.messenger.i0.L(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(org.telegram.messenger.i0.o());
        a8 a8Var = new a8(this, getContext());
        this.M = a8Var;
        b8 b8Var = new b8(this, getContext());
        this.L = b8Var;
        a8Var.setTag(g6.n0);
        l6Var.getFrontFace().addView(a8Var, 0, w7.b6.c(-1.0f, -1));
        l6Var.getFrontFace().addView(b8Var, l6Var.getStickerLayerIndex(), w7.b6.c(-1.0f, -1));
        if (z10) {
            b8Var.addOnLayoutChangeListener(new w7(this, i12));
            d(cardVar);
            return;
        }
        int currentAccount = k2Var.getCurrentAccount();
        vp r12 = vp.r1(currentAccount);
        long e = d20.i(currentAccount).e();
        TLRPC.UserFull a2 = r12.a2(e);
        if (a2 == null) {
            r12.U2(r12.Z1(Long.valueOf(e)), 0, true, new k(this, 4));
        } else {
            TL_wallet.card cardVar2 = a2.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
        }
    }

    public static boolean F(int i10, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.r0) vp.r1(i10).y7.m0.a).c;
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

    public static Path H(g8 g8Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        if (g8Var == null || g8Var.F != null || (bitmap = g8Var.u) == null) {
            if (g8Var == null) {
                return null;
            }
            return g8Var.F;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
        int[] iArr = new int[TLObject.FLAG_14];
        createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
        if (createScaledBitmap != g8Var.u) {
            createScaledBitmap.recycle();
        }
        boolean[] zArr = new boolean[TLObject.FLAG_14];
        int i13 = -1;
        for (int i14 = 0; i14 < 16384; i14++) {
            boolean z11 = (iArr[i14] >>> 24) >= 110;
            zArr[i14] = z11;
            if (i13 < 0 && z11) {
                i13 = i14;
            }
        }
        if (i13 < 0) {
            return null;
        }
        int i15 = 8;
        int[] iArr2 = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] iArr3 = {0, -1, -1, -1, 0, 1, 1, 1};
        int i16 = i13 % 128;
        int i17 = i13 / 128;
        int i18 = i16 - 1;
        float[] fArr = new float[512];
        int i19 = i17;
        int i20 = i19;
        int i21 = i16;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i22 >= 20000) {
                i10 = 0;
                break;
            }
            int i24 = i23 * 2;
            i10 = 0;
            if (i24 + 2 > fArr.length) {
                fArr = Arrays.copyOf(fArr, fArr.length * 2);
            }
            fArr[i24] = i21 + 0.5f;
            fArr[i24 + 1] = i19 + 0.5f;
            i23++;
            int i25 = 0;
            while (i25 < i15 && (iArr2[i25] != i18 - i21 || iArr3[i25] != i20 - i19)) {
                i25++;
            }
            int i26 = 1;
            while (true) {
                if (i26 > i15) {
                    i11 = i15;
                    z10 = false;
                    break;
                }
                int i27 = (i25 + i26) % i15;
                i11 = i15;
                int i28 = i21 + iArr2[i27];
                int i29 = i25;
                int i30 = i19 + iArr3[i27];
                if (i28 >= 0 && i30 >= 0) {
                    i12 = i26;
                    if (i28 < 128 && i30 < 128 && zArr[(i30 * 128) + i28]) {
                        int i31 = (i27 + 7) % 8;
                        int i32 = i21 + iArr2[i31];
                        i20 = i19 + iArr3[i31];
                        i19 = i30;
                        i18 = i32;
                        i21 = i28;
                        z10 = true;
                        break;
                    }
                } else {
                    i12 = i26;
                }
                i26 = i12 + 1;
                i15 = i11;
                i25 = i29;
            }
            if (!z10 || (i21 == i16 && i19 == i17)) {
                break;
            }
            i22++;
            i15 = i11;
        }
        int i33 = (i23 + 1) / 2;
        if (i33 < 3) {
            return null;
        }
        float[] fArr2 = new float[i33 * 2];
        for (int i34 = i10; i34 < i23; i34 += 2) {
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i35 = -3; i35 <= 3; i35++) {
                int i36 = ((((i34 + i35) % i23) + i23) % i23) * 2;
                f7 += fArr[i36];
                f10 += fArr[i36 + 1];
            }
            fArr2[i34] = ((f7 / 7.0f) / 128.0f) - 0.5f;
            fArr2[i34 + 1] = ((f10 / 7.0f) / 128.0f) - 0.5f;
        }
        Path path = new Path();
        path.moveTo((fArr2[i10] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
        int i37 = 1;
        while (i37 <= i33) {
            int i38 = i37 % i33;
            i37++;
            int i39 = i38 * 2;
            float f11 = fArr2[i39];
            float f12 = fArr2[i39 + 1];
            int i40 = (i37 % i33) * 2;
            path.quadTo(f11, f12, (fArr2[i40] + f11) / 2.0f, (fArr2[i40 + 1] + f12) / 2.0f);
        }
        path.close();
        g8Var.F = path;
        return path;
    }

    public static void J(vh.p2 p2Var, float f7, float f10) {
        o(p2Var, 3);
        p2Var.m(0.0f, f7 - p2Var.getPaddingLeft());
        p2Var.setTranslationY(f10 - p2Var.getLayoutParams().height);
        p2Var.invalidate();
    }

    public static double N(float f7) {
        return Math.round(f7 * 100.0f) / 100.0d;
    }

    public static String T(TL_wallet.card cardVar) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i10);
                i10++;
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

    public static boolean b(g8 g8Var) {
        TL_wallet.nftItem nftitem;
        return (g8Var == null || (nftitem = g8Var.b) == null || nftitem.gift == null) ? false : true;
    }

    public static float c(float f7) {
        float f10 = f7 % 360.0f;
        if (f10 > 180.0f) {
            f10 -= 360.0f;
        }
        return f10 < -180.0f ? f10 + 360.0f : f10;
    }

    public static void e0(int i10, TL_wallet.card cardVar) {
        TLRPC.UserFull a2 = vp.r1(i10).a2(d20.i(i10).e());
        if (a2 == null) {
            return;
        }
        a2.wallet_card = cardVar;
        hs.a0(i10).j2(a2, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(vh.p2 p2Var, int i10) {
        if ((p2Var.getTag() instanceof Integer) && ((Integer) p2Var.getTag()).intValue() == i10) {
            return;
        }
        p2Var.setTag(Integer.valueOf(i10));
        p2Var.a = i10;
        p2Var.m(1.0f, 0.0f);
    }

    public static float u(float f7, float f10, float f11) {
        float l4 = Utilities.l((f7 - f10) / (f11 - f10));
        return c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        return mediaAreaCoordinates == null ? "" : String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        l6 l6Var = this.c;
        this.Y0 = l6Var.getFrontFace().getWidth();
        float height = l6Var.getFrontFace().getHeight();
        this.Z0 = height;
        if (this.Y0 <= 0.0f || height <= 0.0f) {
            return false;
        }
        Matrix matrix = this.r;
        return l6Var.g(this, matrix) && matrix.invert(this.s);
    }

    public final vh.p2 B(int i10, boolean z10) {
        vh.p2 p2Var = new vh.p2(getContext(), 3);
        p2Var.p(true);
        p2Var.k(11.0f, 6.0f, z10 ? 15.0f : 11.0f, 7.0f);
        p2Var.i(z10);
        p2Var.K = Layout.Alignment.ALIGN_NORMAL;
        p2Var.q(12.0f);
        p2Var.d = -1L;
        String L0 = cd.L0(i10, null);
        p2Var.h = vh.p2.a(L0, p2Var.getTextPaint());
        p2Var.s(L0);
        p2Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        p2Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(p2Var, w7.b6.e(-1, zs.g2, 48));
        return p2Var;
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

    public final float[] D(float f7) {
        float u10 = (u(f7, 0.45f, 0.82f) - u(f7, 1.3f, 1.72f)) * 0.9f;
        float[] fArr = this.o1;
        fArr[0] = u10;
        fArr[1] = (((float) Math.sin(Utilities.l((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(g8 g8Var) {
        g8Var.J = 0L;
        f8 f8Var = g8Var.h;
        f8 f8Var2 = g8Var.f;
        f8 f8Var3 = g8Var.e;
        if (g8Var.a.equals(this.P0)) {
            l();
        }
        if (g8Var.b()) {
            float[] L = L(f8Var3.a, f8Var2.a);
            f8Var3.a(L[0]);
            f8Var2.a(L[1]);
        }
        g8Var.H = 4;
        g8Var.W = 0.0f;
        g8Var.X = f8Var3.a;
        g8Var.Y = f8Var2.a;
        g8Var.Z = g8Var.g.a * f8Var.a;
        g8Var.a0 = g8Var.i.a;
        g8Var.b0 = this.w0 > ((float) org.telegram.messenger.i0.L(650.0f)) ? 0.32f : 0.44f;
        this.w0 = 0.0f;
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.o();
        }
        g8Var.c0 = j10 != null ? j10.getScaleX() : 1.0f;
        RectF Z = Z(g8Var);
        if (Z != null) {
            float centerX = Z.centerX() - g8Var.X;
            float centerY = Z.centerY() - g8Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            g8Var.U = hypot > ((float) org.telegram.messenger.i0.L(6.0f)) ? centerX / hypot : 0.0f;
            g8Var.V = hypot > ((float) org.telegram.messenger.i0.L(6.0f)) ? centerY / hypot : 1.0f;
        }
        g8Var.l.a(0.0f);
        f8Var.a(1.0f);
        long j11 = this.N0 + 1;
        this.N0 = j11;
        g8Var.I = j11;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new uk(5)));
        return arrayList;
    }

    public final void I(g8 g8Var, float[] fArr, float[] fArr2, boolean z10) {
        long j10 = g8Var.J;
        f8 f8Var = g8Var.o;
        f8 f8Var2 = g8Var.n;
        if (j10 == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            g8Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (g8 g8Var2 : this.f.values()) {
                if (g8Var2 != g8Var && g8Var2.b()) {
                    arrayList.add(g8Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new uk(6)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    g8 g8Var3 = (g8) arrayList.get(i10);
                    if (this.d.L()) {
                        E(g8Var3);
                    } else {
                        V(g8Var3);
                    }
                }
                k();
            }
        }
        g8Var.H = 1;
        g8Var.Q = false;
        g8Var.M = false;
        g8Var.L = false;
        g8Var.P = z10;
        g8Var.O = z10;
        long j12 = this.N0 + 1;
        this.N0 = j12;
        g8Var.I = j12;
        f8Var2.a(0.0f);
        f8Var.a(0.0f);
        f8 f8Var3 = g8Var.e;
        float f7 = z10 ? 150.0f : 500.0f;
        float f10 = z10 ? 0.82f : 1.0f;
        f8Var3.d = f7;
        f8Var3.e = f10;
        f8Var3.a(fArr[0]);
        f8Var3.b = fArr2[0];
        f8 f8Var4 = g8Var.f;
        float f11 = z10 ? 150.0f : 500.0f;
        float f12 = z10 ? 0.82f : 1.0f;
        f8Var4.d = f11;
        f8Var4.e = f12;
        f8Var4.a(fArr[1]);
        float f13 = fArr2[1];
        f8Var4.b = f13;
        g8Var.h.b = fArr2[2];
        f8 f8Var5 = g8Var.g;
        f8Var5.d = 300.0f;
        f8Var5.e = 0.5f;
        f8Var5.b = 1.0f;
        f8 f8Var6 = g8Var.j;
        f8Var6.d = z10 ? 110.0f : 150.0f;
        f8Var6.e = 0.9f;
        f8Var6.b = 0.0f;
        g8Var.m.b = 1.0f;
        g8Var.l.b = 0.0f;
        float f14 = fArr2[0] - fArr[0];
        float f15 = f13 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f14, f15));
        g8Var.U = max > ((float) org.telegram.messenger.i0.L(6.0f)) ? f14 / max : 0.0f;
        g8Var.V = max > ((float) org.telegram.messenger.i0.L(6.0f)) ? f15 / max : 1.0f;
        f8 f8Var7 = g8Var.k;
        f8Var7.a(0.9f);
        f8Var7.b = 0.0f;
        if (z10) {
            float min = Math.min(org.telegram.messenger.i0.L(110.0f), 0.32f * max);
            float f16 = f14 >= 0.0f ? -1.0f : 1.0f;
            f8Var2.a(0.0f);
            f8Var2.c = ((-f15) / max) * min * f16 * 20.0f;
            f8Var.a(0.0f);
            f8Var.c = c3.i0.D(min, 0.5f, (f14 / max) * min * f16, 20.0f);
        }
        O();
        f0();
    }

    public final void K(g8 g8Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        g8Var.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        g8Var.i.a(c((float) mediaAreaCoordinates.rotation));
        g8Var.N = z10;
        g8Var.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.Y0);
        g8Var.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.Z0);
        g8Var.g.a(1.0f);
        g8Var.j.a(0.0f);
        g8Var.k.a(0.0f);
        g8Var.n.a(0.0f);
        g8Var.o.a(0.0f);
        g8Var.l.a(0.0f);
        g8Var.H = 2;
        long j10 = this.N0 + 1;
        this.N0 = j10;
        g8Var.I = j10;
        g8Var.m.a(1.0f);
        if (g8Var.J == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            g8Var.J = j11;
        }
        if (g8Var.a.equals(this.P0)) {
            this.T0 = g8Var;
            this.S0 = g8Var;
            this.U0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void M(g8 g8Var, float f7, float f10) {
        f8 f8Var = g8Var.e;
        f8 f8Var2 = g8Var.h;
        float[] L = L(f8Var.a, g8Var.f.a);
        float t10 = Utilities.t(f7, f10, L[0], L[1]);
        if (Float.isNaN(this.E0)) {
            this.E0 = t10;
            this.F0 = f8Var2.b;
        }
        if (Math.abs(t10 - this.E0) > org.telegram.messenger.i0.L(5.0f)) {
            f8 f8Var3 = g8Var.q;
            f8Var3.d = 700.0f;
            f8Var3.e = 1.0f;
            f8Var3.b = 1.0f;
        }
        float L2 = org.telegram.messenger.i0.L(32.0f) / U();
        float max = this.i0 ? (this.F0 * t10) / Math.max(1.0f, this.E0) : c3.i0.z(1.21f, L2, (t10 - this.E0) / org.telegram.messenger.i0.L(110.0f), this.F0);
        f8Var2.d = 900.0f;
        f8Var2.e = 1.0f;
        f8Var2.b = Math.max(L2, Math.min(1.21f, max));
        if (t10 < org.telegram.messenger.i0.L(14.0f)) {
            this.B0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f10 - L[1], f7 - L[0]));
        if (!Float.isNaN(this.B0)) {
            this.C0 = c(degrees - this.B0) + this.C0;
        }
        this.B0 = degrees;
        float f11 = this.D0 + this.C0;
        float round = Math.round(f11 / 90.0f) * 90;
        boolean z10 = Math.abs(f11 - round) < 5.0f;
        if (z10 && !this.L0) {
            performHapticFeedback(4);
        }
        this.L0 = z10;
        f8 f8Var4 = g8Var.i;
        f8Var4.d = 900.0f;
        f8Var4.e = 0.95f;
        if (z10) {
            f11 = round;
        }
        f8Var4.b = f11;
    }

    public final void O() {
        if (!this.b && this.Y0 > 0.0f && this.Z0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (g8 g8Var : this.f.values()) {
                boolean b10 = g8Var.b();
                String str = g8Var.a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", g8Var.e.b / this.Y0);
                        jSONObject.put("y", g8Var.f.b / this.Z0);
                        jSONObject.put("r", g8Var.i.b);
                        jSONObject.put("s", g8Var.h.b);
                        jSONObject.put("q", g8Var.N);
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

    public final float P(g8 g8Var) {
        return (((1.0f - (g8Var.q.a * 0.9f)) * g8Var.l.a * 0.04f) + 1.0f) * U() * g8Var.g.a * g8Var.h.a;
    }

    public final void Q() {
        if (this.d1 && this.f1 == 0) {
            if (!this.a1 && (this.p0 || !A())) {
                org.telegram.messenger.i0.h3(this.g1, 1000L);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList G = G();
            int size = G.size();
            int i10 = 0;
            String str = null;
            int i11 = 0;
            while (i11 < size) {
                Object obj = G.get(i11);
                i11++;
                g8 g8Var = (g8) obj;
                boolean b10 = g8Var.b();
                String str2 = g8Var.a;
                if (b10) {
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(y(a0(g8Var)));
                    sb2.append(';');
                    if (str2.equals(this.P0) && m(g8Var)) {
                        str = str2;
                    }
                }
            }
            if (a1.g.r(sb2, "bg:", str).equals(this.c1)) {
                this.d1 = false;
                return;
            }
            TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
            ArrayList G2 = G();
            int size2 = G2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = G2.get(i12);
                i12++;
                g8 g8Var2 = (g8) obj2;
                boolean b11 = g8Var2.b();
                String str3 = g8Var2.a;
                if (b11) {
                    TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                    inputwalletcardsticker.nft_address = str3;
                    inputwalletcardsticker.coordinates = a0(g8Var2);
                    setcardstickers.stickers.add(inputwalletcardsticker);
                    if (str3.equals(this.P0) && m(g8Var2)) {
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
            while (i10 < size3) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i10);
                i10++;
                TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
                g8 g8Var3 = (g8) this.f.get(inputwalletcardsticker3.nft_address);
                if (g8Var3 != null && g8Var3.b != null) {
                    TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                    cardsticker.nft = g8Var3.b;
                    cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                    cardVar2.stickers.add(cardsticker);
                    if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                        cardVar2.bg_nft_item = g8Var3.b;
                    }
                }
            }
            e0(currentAccount, cardVar2);
            this.f1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new a3.b(1), new ng(this, currentAccount, cardVar, 3));
        }
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.b1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i10);
                i10++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(u7 u7Var) {
        removeCallbacks(this.A1);
        final int i10 = 1;
        this.s0 = true;
        final int i11 = 0;
        this.p0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        u7Var.animate().cancel();
        u7Var.n(u7Var.getScaleX() * u7Var.y0);
        u7Var.setScaleX(1.0f);
        u7Var.setScaleY(1.0f);
        u7Var.m(1.0f, 150L, null);
        final g8 v = v(u7Var.w0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.s0 = false;
            return;
        }
        z60 I = z60.I(this.a, u7Var);
        I.s = 51;
        if (m(v) || str.equals(this.P0)) {
            I.c(R.drawable.msg_colors, cd.L0(str.equals(this.P0) ? 2131743129 : 2131743135, null), new Runnable(this) { // from class: org.telegram.ui.Wallet.y7
                public final /* synthetic */ h8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.c0(v);
                            break;
                        default:
                            h8 h8Var = this.b;
                            h8Var.getClass();
                            h8Var.b0(v.b);
                            break;
                    }
                }
            }, false);
        }
        I.c(R.drawable.msg_sticker, cd.L0(v.b() ? 2131743128 : 2131743136, null), new Runnable(this) { // from class: org.telegram.ui.Wallet.y7
            public final /* synthetic */ h8 b;

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
                        h8 h8Var = this.b;
                        h8Var.getClass();
                        h8Var.b0(v.b);
                        break;
                }
            }
        }, false);
        I.p = new z7(this, i11);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Y0 * 0.231f;
    }

    public final void V(g8 g8Var) {
        if (g8Var.a.equals(this.P0)) {
            l();
        }
        g8Var.N = false;
        g(g8Var);
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(g8 g8Var, float f7, float f10) {
        float[] fArr;
        this.h0 = null;
        this.m0 = true;
        boolean z10 = this.K0 == 2;
        this.o0 = z10;
        if (this.h1) {
            this.i1 = g8Var == this.k1 && !z10;
            this.j1 = false;
            this.h1 = false;
            vp.d1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z11 = g8Var.N;
        f8 f8Var = g8Var.m;
        f8 f8Var2 = g8Var.f;
        f8 f8Var3 = g8Var.e;
        if (z11) {
            g8Var.N = false;
            f8 f8Var4 = g8Var.h;
            f8Var4.d = 420.0f;
            f8Var4.e = 0.8f;
            f8Var4.b = 1.0f;
        }
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.t0 = false;
        if (this.o0) {
            fArr = L(f8Var3.a, f8Var2.a);
        } else {
            RectF Z = Z(g8Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            f8 f8Var5 = g8Var.g;
            f8Var5.d = 500.0f;
            f8Var5.e = 0.75f;
            f8Var5.a((f(g8Var) * Z.width()) / U());
            f8Var.a(0.0f);
            b6.l0((b6) this.d.c, 0L);
            fArr = fArr2;
        }
        f8Var3.d = 1100.0f;
        f8Var3.e = 0.9f;
        f8Var3.a(fArr[0]);
        f8Var2.d = 1100.0f;
        f8Var2.e = 0.9f;
        f8Var2.a(fArr[1]);
        g8Var.H = 3;
        long j11 = this.N0 + 1;
        this.N0 = j11;
        g8Var.I = j11;
        f8Var.b = 1.0f;
        f8 f8Var6 = g8Var.j;
        f8Var6.d = 320.0f;
        f8Var6.e = 0.75f;
        f8Var6.b = 1.0f;
        g8Var.l.a(0.0f);
        this.z0 = fArr[0] - f7;
        this.A0 = fArr[1] - f10;
        this.N.b = this.o0 ? 1.0f : 0.0f;
        performHapticFeedback(3);
    }

    public final void X(g8 g8Var, boolean z10) {
        this.S0 = this.T0;
        this.T0 = g8Var;
        this.U0 = 0.0f;
        this.X0 = z10;
        if (g8Var != null) {
            this.V0 = g8Var.e.b / this.Y0;
            this.W0 = g8Var.f.b / this.Z0;
        }
        f0();
    }

    public final void Y(c0 c0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = c0Var.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (nftitem2.gift != null) {
                v(nftitem2);
            }
        }
        Iterator it = this.f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            g8 g8Var = (g8) it.next();
            int i11 = g8Var.H;
            String str = g8Var.a;
            if (i11 != 3) {
                ArrayList arrayList2 = c0Var.c;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, str)) {
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
                            z10 = true;
                        }
                    }
                }
            }
        }
        if (z10 && !this.b) {
            O();
            k();
        }
        f0();
    }

    public final RectF Z(g8 g8Var) {
        u7 j10 = j(g8Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.w;
            l6.k(j10, matrix);
            Matrix matrix2 = this.x;
            l6.k(this, matrix2);
            if (!matrix2.invert(matrix2)) {
                return null;
            }
            matrix.postConcat(matrix2);
            RectF rectF = new RectF(0.0f, 0.0f, j10.getWidth(), j10.getHeight());
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

    public final TL_stories.TL_mediaAreaCoordinates a0(g8 g8Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * g8Var.h.b;
        tL_mediaAreaCoordinates.x = N((g8Var.e.b / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.y = N((g8Var.f.b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.w = N((U / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.Z0) * 100.0f);
        float f7 = g8Var.i.b % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f7);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (A()) {
            g8 v = v(nftitem);
            if (v.b()) {
                if (this.d.L()) {
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

    public final void c0(g8 g8Var) {
        String str = g8Var.a;
        if (str.equals(this.P0)) {
            l();
            return;
        }
        if (m(g8Var)) {
            this.P0 = str;
            if (g8Var.b()) {
                X(g8Var, false);
                k();
            } else {
                this.Q0 = str;
                d0(g8Var);
                if (g8Var.H == 0) {
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
        int i10;
        this.b1 = cardVar;
        this.c1 = T(cardVar);
        if (this.d1 || this.f1 != 0 || this.p0) {
            return;
        }
        TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
        g8 g8Var = null;
        String str = nftitem == null ? null : nftitem.address;
        boolean equals = TextUtils.equals(str, this.P0);
        if (!equals) {
            this.P0 = str;
            this.Q0 = null;
        }
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i11);
                i11++;
                TL_wallet.nftItem nftitem2 = cardsticker.nft;
                if (nftitem2 != null && nftitem2.gift != null) {
                    v(nftitem2);
                }
            }
        }
        if (this.b) {
            TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
            if (nftitem3 != null && nftitem3.gift != null) {
                g8Var = v(nftitem3);
            }
            this.S0 = g8Var;
            this.T0 = g8Var;
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
        int i12 = 0;
        while (i12 < size2) {
            Object obj = G.get(i12);
            i12++;
            g8 g8Var2 = (g8) obj;
            if (g8Var2.K && (i10 = g8Var2.H) != 3 && i10 != 4 && i10 != 5) {
                TL_wallet.cardSticker R = R(g8Var2.a);
                if (R != null) {
                    if (!g8Var2.b() || !y(a0(g8Var2)).equals(y(R.coordinates))) {
                        K(g8Var2, R.coordinates, g8Var2.N);
                    }
                } else if (g8Var2.b()) {
                    E(g8Var2);
                }
            }
        }
        ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
        LinkedHashMap linkedHashMap = this.f;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i13 = 0;
            while (i13 < size3) {
                TL_wallet.cardSticker cardsticker2 = arrayList2.get(i13);
                i13++;
                TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                g8 g8Var3 = nftitem4 == null ? null : (g8) linkedHashMap.get(nftitem4.address);
                if (g8Var3 != null && g8Var3.H == 2) {
                    long j10 = this.N0 + 1;
                    this.N0 = j10;
                    g8Var3.I = j10;
                }
            }
        }
        if (!equals) {
            String str2 = this.P0;
            g8 g8Var4 = str2 == null ? null : (g8) linkedHashMap.get(str2);
            if (g8Var4 == null || !g8Var4.b()) {
                X(null, true);
            } else {
                X(g8Var4, false);
            }
        }
        this.e1 = false;
        O();
        f0();
    }

    public final void d0(g8 g8Var) {
        b6.l0((b6) this.d.c, 2600L);
        if (A()) {
            float[] x10 = x(g8Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(g8Var);
            int i10 = 0;
            if (x10 == null || Z == null) {
                u7 j10 = j(g8Var);
                if (j10 != null) {
                    j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new x7(j10, i10)).start();
                    return;
                }
                return;
            }
            g8Var.g.a((f(g8Var) * Z.width()) / U());
            g8Var.m.a(0.0f);
            g8Var.j.a(1.0f);
            float[] fArr = {Z.centerX(), Z.centerY()};
            this.s.mapPoints(fArr);
            I(g8Var, fArr, x10, true);
            performHapticFeedback(3);
        }
    }

    public final void e() {
        float pow;
        g8 g8Var = this.S0;
        float[] i10 = v7.i(g8Var == null ? null : g8Var.t);
        g8 g8Var2 = this.T0;
        float[] i11 = v7.i(g8Var2 == null ? null : g8Var2.t);
        if (this.X0) {
            float f7 = this.U0;
            pow = c3.i0.D(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.U0, 4.0d));
        }
        float[] fArr = new float[18];
        System.arraycopy(new float[]{i10[0], i10[1], i10[2], i11[0], i11[1], i11[2], this.V0, this.W0, pow, this.X0 ? 1.0f : 0.0f}, 0, fArr, 0, 10);
        g8 g8Var3 = this.S0;
        v7.m(fArr, 0, g8Var3 == null ? null : g8Var3.t);
        g8 g8Var4 = this.T0;
        v7.m(fArr, 1, g8Var4 == null ? null : g8Var4.t);
        this.c.setStickerStyle(fArr);
    }

    public final float f(g8 g8Var) {
        u7 j10 = j(g8Var);
        if (j10 == null) {
            return 0.77f;
        }
        org.telegram.ui.Components.g9 g9Var = j10.D;
        if (j10.getWidth() <= 0 || g9Var.getWidth() <= 0) {
            return 0.77f;
        }
        return ((g9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
    }

    public final void f0() {
        if (this.a1 || !isAttachedToWindow()) {
            return;
        }
        c8 c8Var = this.C1;
        removeCallbacks(c8Var);
        postOnAnimation(c8Var);
    }

    public final void g(g8 g8Var) {
        g8Var.H = 0;
        g8Var.J = 0L;
        g8Var.g.a(1.0f);
        g8Var.h.a(1.0f);
        g8Var.i.a(0.0f);
        g8Var.m.a(0.0f);
        g8Var.j.a(0.0f);
        g8Var.k.a(0.0f);
        u7 j10 = j(g8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.i0.L(64.0f)) - org.telegram.messenger.i0.n;
    }

    public final void i(u7 u7Var) {
        ArrayList arrayList = this.h;
        if (!arrayList.contains(u7Var)) {
            arrayList.add(u7Var);
        }
        g8 v = v(u7Var.w0);
        u7Var.k(v.R, false, v.H == 0 ? 0.0f : 1.0f);
        f0();
    }

    public final u7 j(g8 g8Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u7 u7Var = (u7) obj;
            if (u7Var.isAttachedToWindow() && u7Var.w0.address.equals(g8Var.a)) {
                return u7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (this.b || this.e1) {
            return;
        }
        this.d1 = true;
        z7 z7Var = this.g1;
        org.telegram.messenger.i0.r(z7Var);
        org.telegram.messenger.i0.h3(z7Var, 1500L);
    }

    public final void l() {
        this.Q0 = null;
        this.P0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(g8 g8Var) {
        return b(g8Var) && F(this.a.getCurrentAccount(), g8Var.b.gift.slug);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.y1);
        getViewTreeObserver().addOnPreDrawListener(this.z1);
        for (g8 g8Var : this.f.values()) {
            g8Var.c.P();
            g8Var.d.P();
        }
        f0();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.y1);
        getViewTreeObserver().removeOnPreDrawListener(this.z1);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        for (g8 g8Var : this.f.values()) {
            g8Var.c.R();
            g8Var.d.R();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h8.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f0();
    }

    public final void p() {
        org.telegram.messenger.i0.E2(this.w1);
        org.telegram.messenger.i0.E2(this.x1);
        this.x1 = null;
        this.w1 = null;
        O();
        org.telegram.messenger.i0.r(this.g1);
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
        for (g8 g8Var : this.f.values()) {
            g8Var.c.R();
            g8Var.d.R();
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
    public final void q(g8 g8Var, float f7, float f10) {
        boolean z10;
        float f11;
        float U;
        float f12 = this.z0 * 0.9f;
        this.z0 = f12;
        float f13 = this.A0 * 0.9f;
        this.A0 = f13;
        boolean z11 = false;
        float[] fArr = {f12 + f7, f13 + f10};
        this.s.mapPoints(fArr);
        float f14 = fArr[0];
        if (f14 >= 0.0f && f14 <= this.Y0) {
            float f15 = fArr[1];
            if (f15 >= 0.0f && f15 <= this.Z0) {
                z10 = true;
                if (this.o0 && !z10 && Utilities.t(f7, f10, getWidth() / 2.0f, h()) < org.telegram.messenger.i0.L(78.0f)) {
                    z11 = true;
                }
                if (z11 != this.t0) {
                    performHapticFeedback(4);
                }
                this.t0 = z11;
                this.N.b = (this.o0 || z10) ? 0.0f : 1.0f;
                this.O.b = !z11 ? 1.0f : 0.0f;
                f8 f8Var = g8Var.e;
                if (z11) {
                    f11 = this.z0;
                } else {
                    float L = org.telegram.messenger.i0.L(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(L);
                    f7 = (getWidth() / 2.0f) - ((paint.measureText(cd.L0(2131746336, null)) + org.telegram.messenger.i0.L(72.0f)) / 2.0f);
                    f11 = org.telegram.messenger.i0.L(30.0f);
                }
                f8Var.b = f7 + f11;
                g8Var.f.b = !z11 ? h() - org.telegram.messenger.i0.L(46.0f) : f10 + this.A0;
                RectF Z = Z(g8Var);
                float U2 = Z != null ? U() : Z.width();
                f8 f8Var2 = g8Var.g;
                if (z11) {
                    U = 1.24f * (z10 ? 1.0f : (U2 * 0.77f) / U());
                } else {
                    U = org.telegram.messenger.i0.L(38.0f) / U();
                }
                f8Var2.b = U;
                if (this.o0) {
                    return;
                }
                f8 f8Var3 = g8Var.i;
                f8Var3.d = 260.0f;
                f8Var3.e = 0.9f;
                float f16 = f8Var3.a;
                f8Var3.b = c((z10 ? this.J0 : 0.0f) - f16) + f16;
                return;
            }
        }
        z10 = false;
        if (this.o0) {
            z11 = true;
        }
        if (z11 != this.t0) {
        }
        this.t0 = z11;
        this.N.b = (this.o0 || z10) ? 0.0f : 1.0f;
        this.O.b = !z11 ? 1.0f : 0.0f;
        f8 f8Var4 = g8Var.e;
        if (z11) {
        }
        f8Var4.b = f7 + f11;
        g8Var.f.b = !z11 ? h() - org.telegram.messenger.i0.L(46.0f) : f10 + this.A0;
        RectF Z2 = Z(g8Var);
        if (Z2 != null) {
        }
        f8 f8Var22 = g8Var.g;
        if (z11) {
        }
        f8Var22.b = U;
        if (this.o0) {
        }
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17;
        float f18 = f11;
        float f19 = (f18 * f12) + ((-f18) / 2.0f);
        float f20 = 0.3f * f18;
        float f21 = 3.2f * f18;
        float f22 = 0.72f * f13;
        float f23 = f20 * f22;
        double d = f14;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 > 14) {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.y);
                return;
            }
            int i12 = 0;
            for (int i13 = 14; i12 <= i13; i13 = 14) {
                float f24 = ((i12 / 14.0f) - 0.5f) * f18;
                float f25 = ((i10 / 14.0f) - 0.5f) * f18;
                float f26 = (f24 * cos) - (f25 * sin);
                float f27 = (f25 * cos) + (f24 * sin);
                float f28 = (f27 * f16) + (f26 * f15);
                float f29 = (f27 * f15) + ((-f26) * f16);
                float f30 = f19 - f28;
                float f31 = 0.0f;
                float f32 = 1.0f;
                if (f30 > 0.0f) {
                    float min = Math.min(f22, f30 / f20);
                    float max = Math.max(0.0f, f30 - f23);
                    f17 = f20;
                    double d10 = min;
                    float sin2 = (f19 - (f17 * ((float) Math.sin(d10)))) - (((float) Math.cos(d10)) * max);
                    float sin3 = (max * ((float) Math.sin(d10))) + ((1.0f - ((float) Math.cos(d10))) * f17);
                    f32 = (((float) Math.cos(d10)) * 0.38f) + 0.62f;
                    f28 = sin2;
                    f31 = sin3;
                } else {
                    f17 = f20;
                }
                float f33 = f21 / (f21 - f31);
                int i14 = i11 * 2;
                float[] fArr = this.J;
                fArr[i14] = (((f28 * f15) - (f29 * f16)) * f33) + f7;
                fArr[i14 + 1] = ((((f29 * f15) + (f28 * f16)) * f33) + f10) - (f31 * 0.15f);
                int i15 = (int) (255.0f * f32);
                this.K[i11] = Color.rgb(i15, i15, i15);
                i12++;
                f18 = f11;
                i11++;
                f20 = f17;
            }
            i10++;
            f18 = f11;
        }
    }

    public final void s(Canvas canvas, g8 g8Var, float f7, float f10, boolean z10) {
        float f11;
        ImageReceiver imageReceiver = g8Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g8Var.t;
        Bitmap n10 = imageReceiver.n();
        if (n10 == null || stargiftattributebackdrop == null) {
            return;
        }
        canvas.save();
        float f12 = this.Y0;
        float f13 = this.Z0;
        Path path = this.I;
        path.rewind();
        float f14 = 0.15f;
        char c10 = 0;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(0.0f, 0.0f, f12, f13, (f12 * 0.15f) / 2.0f, (f13 * 0.15f) / 1.212122f, direction);
        canvas.clipPath(path);
        this.c.h(path, this.Y0, this.Z0);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        if (f10 >= 0.0f && !z10) {
            path.rewind();
            path.addCircle(this.V0 * this.Y0, this.W0 * this.Z0, f10, direction);
            canvas.clipPath(path);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
        Paint paint = this.y;
        paint.setColorFilter(porterDuffColorFilter);
        float f15 = this.Y0 / 336.0f;
        float f16 = this.Z0 / 205.0f;
        int i10 = 16;
        int i11 = 0;
        int i12 = 16;
        while (i12 < 336) {
            int i13 = ((i11 % 2) * 18) + i10;
            while (i13 < 205) {
                float f17 = i12 * f15;
                float f18 = i13 * f16;
                float f19 = f14;
                float f20 = f15 * 12.0f;
                float l4 = Utilities.l(Math.min(Math.min(i12, 336 - i12), Math.min(i13, 205 - i13)) / 48.0f);
                float f21 = f15;
                float D = f7 * f19 * c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
                if (f10 >= 0.0f) {
                    float l10 = Utilities.l((f10 - Utilities.t(f17, f18, this.V0 * this.Y0, this.W0 * this.Z0)) / org.telegram.messenger.i0.L(120.0f));
                    if (z10) {
                        f20 = c3.i0.D(l10, 0.8f, 1.0f, f20);
                        D *= 1.0f - Utilities.l(l10 * 1.6f);
                    } else {
                        f11 = f17;
                        f20 *= (((((float) Math.sin(l10 * 3.141592653589793d)) * 0.28f) + l10) * 0.8f) + 0.2f;
                        D *= Utilities.l(l10 * 1.6f);
                        paint.setAlpha((int) (D * 255.0f));
                        float f22 = f20 / 2.0f;
                        RectF rectF = this.H;
                        rectF.set(f11 - f22, f18 - f22, f11 + f22, f18 + f22);
                        canvas.drawBitmap(n10, (Rect) null, rectF, paint);
                        i13 += 37;
                        f14 = f19;
                        c10 = 0;
                        f15 = f21;
                    }
                }
                f11 = f17;
                paint.setAlpha((int) (D * 255.0f));
                float f222 = f20 / 2.0f;
                RectF rectF2 = this.H;
                rectF2.set(f11 - f222, f18 - f222, f11 + f222, f18 + f222);
                canvas.drawBitmap(n10, (Rect) null, rectF2, paint);
                i13 += 37;
                f14 = f19;
                c10 = 0;
                f15 = f21;
            }
            i12 += 33;
            i11++;
            i10 = 16;
        }
        paint.setColorFilter(null);
        paint.setAlpha(zs.e4);
        canvas.restore();
    }

    public final void t(Canvas canvas, g8 g8Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.01f || g8Var.w == null) {
            return;
        }
        float f15 = (((0.05f * f12) + 1.0f) * ((f11 * 176.0f) / 128.0f)) / 2.0f;
        float f16 = f7 - f15;
        float f17 = f10 - f15;
        float f18 = f7 + f15;
        float f19 = f10 + f15;
        RectF rectF = this.H;
        rectF.set(f16, f17, f18, f19);
        Paint paint = this.y;
        int alpha = paint.getAlpha();
        paint.setColor(-16044452);
        paint.setAlpha((int) (Utilities.l(g8Var.m.a) * Utilities.l((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
        canvas.drawBitmap(g8Var.w, (Rect) null, rectF, paint);
        paint.setColor(-1);
        paint.setAlpha(alpha);
    }

    public final g8 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        g8 g8Var = (g8) linkedHashMap.get(str);
        if (g8Var == null) {
            g8Var = new g8(this, nftitem);
            linkedHashMap.put(nftitem.address, g8Var);
        }
        g8Var.b = nftitem;
        return g8Var;
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
    public final void w(float f7, float f10, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        float[] x10;
        getParent().requestDisallowInterceptTouchEvent(false);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        this.w0 = f10;
        if (this.m0) {
            b6 b6Var = (b6) this.d.c;
            float f11 = b6Var.I0;
            f4 f4Var = b6Var.K0;
            if (f11 > 0.0f) {
                org.telegram.messenger.i0.r(f4Var);
                org.telegram.messenger.i0.h3(f4Var, 1650L);
            }
        }
        g8 g8Var = this.g0;
        if (g8Var != null) {
            f8 f8Var = g8Var.g;
            f8 f8Var2 = g8Var.i;
            f8 f8Var3 = g8Var.f;
            f8 f8Var4 = g8Var.e;
            u7 j10 = j(g8Var);
            if (j10 != null) {
                j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
            }
            if (this.m0) {
                Matrix matrix = this.s;
                if (z10 && this.K0 == 2) {
                    float[] fArr = {f8Var4.a, f8Var3.a};
                    matrix.mapPoints(fArr);
                    f8 f8Var5 = g8Var.h;
                    float f12 = this.I0;
                    f8Var5.b = f12;
                    f8Var2.b = this.J0;
                    I(g8Var, fArr, new float[]{this.G0, this.H0, f12}, false);
                } else if (z10) {
                    E(g8Var);
                } else if (this.t0) {
                    g8Var.H = 5;
                    long j11 = this.N0 + 1;
                    this.N0 = j11;
                    g8Var.I = j11;
                    g8Var.J = 0L;
                    this.f0 = true;
                    f8 f8Var6 = this.c0;
                    f8Var6.a(Math.max(30.0f, f8Var6.a));
                    f8Var4.d = 500.0f;
                    f8Var4.e = 0.9f;
                    float L = org.telegram.messenger.i0.L(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(L);
                    f8Var4.b = ((getWidth() / 2.0f) - ((paint.measureText(cd.L0(2131746336, null)) + org.telegram.messenger.i0.L(72.0f)) / 2.0f)) + org.telegram.messenger.i0.L(30.0f);
                    f8Var3.d = 500.0f;
                    f8Var3.e = 0.9f;
                    f8Var3.b = h();
                    f8Var.d = 240.0f;
                    f8Var.e = 0.95f;
                    f8Var.b = 0.0f;
                    g8Var.j.b = 0.0f;
                    f8Var2.b = 0.0f;
                    if (g8Var.a.equals(this.P0)) {
                        l();
                    }
                    performHapticFeedback(16);
                } else {
                    float[] fArr2 = {f8Var4.a, f8Var3.a};
                    matrix.mapPoints(fArr2);
                    float f13 = fArr2[0];
                    if (f13 >= 0.0f && f13 <= this.Y0) {
                        float f14 = fArr2[1];
                        if (f14 >= 0.0f && f14 <= this.Z0) {
                            z11 = true;
                            if (this.o0) {
                                z12 = z11;
                                if (((float) Math.hypot(f7, f10)) > org.telegram.messenger.i0.L(700.0f) && (z12 || f10 < (-org.telegram.messenger.i0.L(600.0f)))) {
                                    z13 = true;
                                    x10 = z12 ? x(g8Var, fArr2[0], fArr2[1], false) : null;
                                    if (z13) {
                                        x10 = x(g8Var, Math.max(0.0f, Math.min(this.Y0, (f7 * 0.08f) + fArr2[0])), Math.max(0.0f, Math.min(this.Z0, (f10 * 0.08f) + fArr2[1])), true);
                                    }
                                    if (x10 != null) {
                                        I(g8Var, fArr2, x10, false);
                                    } else {
                                        E(g8Var);
                                    }
                                    if (x10 != null) {
                                        g8Var.P = z13;
                                        if (z13) {
                                            f8Var4.d = 260.0f;
                                            f8Var4.e = 0.8f;
                                            f8Var3.d = 260.0f;
                                            f8Var3.e = 0.8f;
                                        }
                                    }
                                }
                            } else {
                                z12 = z11;
                            }
                            z13 = false;
                            if (z12) {
                            }
                            if (z13) {
                            }
                            if (x10 != null) {
                            }
                            if (x10 != null) {
                            }
                        }
                    }
                    z11 = false;
                    if (this.o0) {
                    }
                    z13 = false;
                    if (z12) {
                    }
                    if (z13) {
                    }
                    if (x10 != null) {
                    }
                    if (x10 != null) {
                    }
                }
            } else if (this.n0 || this.i0) {
                f8 f8Var7 = g8Var.l;
                f8Var7.d = 380.0f;
                f8Var7.e = 0.62f;
                f8Var7.b = 0.0f;
                f8Var2.a = c(f8Var2.a);
                f8Var2.b = c(f8Var2.b);
            } else if (!z10) {
                if (this.u0) {
                    this.h0 = g8Var;
                    f8Var.c += 3.0f;
                    long j12 = this.N0 + 1;
                    this.N0 = j12;
                    g8Var.I = j12;
                    g8Var.S = true;
                    g8Var.T = false;
                    ag.c2 c2Var = g8Var.c;
                    c2Var.u0 = true;
                    c2Var.P0(false);
                    performHapticFeedback(3);
                } else {
                    ((b6) this.a).G0(g8Var.b);
                }
            }
        }
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        if (g8Var != null && (this.m0 || this.n0 || this.i0)) {
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

    public final float[] x(g8 g8Var, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        float f13;
        ArrayList arrayList;
        float nextFloat;
        if (!z10) {
            g8Var.N = false;
            return new float[]{f7, f10, g8Var.h.b};
        }
        ArrayList<RectF> stickerObstacles = this.c.getStickerObstacles();
        float f14 = this.Y0 * 0.012f;
        int size = stickerObstacles.size();
        int i10 = 0;
        while (i10 < size) {
            RectF rectF = stickerObstacles.get(i10);
            i10++;
            float f15 = -f14;
            rectF.inset(f15, f15);
        }
        stickerObstacles.get(2).left -= this.Y0 * 0.035f;
        float L = org.telegram.messenger.i0.L(32.0f) / U();
        float f16 = g8Var.h.b;
        g8Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (g8 g8Var2 : this.f.values()) {
            if (g8Var2 != g8Var && g8Var2.b()) {
                arrayList2.add(g8Var2);
            }
        }
        boolean z11 = (Float.isNaN(f7) || Float.isNaN(f10)) ? false : true;
        if (!z11 && g8Var == this.k1 && this.m1 != null && arrayList2.isEmpty()) {
            return (float[]) this.m1.clone();
        }
        if (z11) {
            f11 = f7;
            f12 = f10;
        } else {
            f11 = this.Y0 * 0.6f;
            f12 = this.Z0 * 0.68f;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (g8Var.a.hashCode() * 7919));
        float nextFloat2 = (random.nextFloat() * 0.04f) + 0.05f;
        float f17 = 0.5f;
        float nextFloat3 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Y0;
        float nextFloat4 = this.Z0 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * L * 0.5f;
        float f18 = -3.4028235E38f;
        float[] fArr = null;
        float f19 = U;
        while (f19 <= this.Z0 - U) {
            float f20 = f17;
            float f21 = U;
            while (true) {
                float f22 = this.Y0;
                if (f21 <= f22 - U) {
                    float min = Math.min(Math.min(f21, f22 - f21), Math.min(f19, this.Z0 - f19));
                    float f23 = nextFloat2;
                    float min2 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * nextFloat2)) * f16, min / (U() * f20));
                    int size2 = stickerObstacles.size();
                    float f24 = L;
                    float f25 = f16;
                    int i11 = 0;
                    float f26 = Float.MAX_VALUE;
                    while (i11 < size2) {
                        ArrayList<RectF> arrayList3 = stickerObstacles;
                        RectF rectF2 = stickerObstacles.get(i11);
                        f26 = Math.min(f26, Utilities.t(f21, f19, Math.max(rectF2.left, Math.min(rectF2.right, f21)), Math.max(rectF2.top, Math.min(rectF2.bottom, f19))));
                        i11++;
                        stickerObstacles = arrayList3;
                        z11 = z11;
                    }
                    ArrayList<RectF> arrayList4 = stickerObstacles;
                    boolean z12 = z11;
                    float min3 = Math.min(min2, f26 / (U() * 0.44f));
                    int i12 = 0;
                    for (int size3 = arrayList2.size(); i12 < size3; size3 = size3) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        g8 g8Var3 = (g8) obj;
                        min3 = Math.min(min3, (Utilities.t(f21, f19, g8Var3.e.b, g8Var3.f.b) / (U() * 0.29f)) - g8Var3.h.b);
                    }
                    float l4 = ((Utilities.l((min - ((U() * f20) * min3)) / org.telegram.messenger.i0.L(14.0f)) * 0.1f) + 0.9f) * min3;
                    if (l4 < f24) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f27 = this.Y0 * 0.6f;
                            float z13 = c3.i0.z(f11, f27, 0.2f, f27);
                            float f28 = this.Z0 * 0.68f;
                            nextFloat = (random.nextFloat() * org.telegram.messenger.i0.L(5.0f)) + (U() * 1.1f * l4) + (Utilities.t(f21, f19, z13, c3.i0.z(f12, f28, 0.2f, f28)) * (-0.45f));
                            f13 = l4;
                            arrayList = arrayList2;
                        } else {
                            float f29 = f19 * l4 * l4;
                            float f30 = l4 * l4;
                            int size4 = arrayList2.size();
                            float f31 = f21 * l4 * l4;
                            int i13 = 0;
                            float f32 = Float.MAX_VALUE;
                            float f33 = 0.0f;
                            while (i13 < size4) {
                                Object obj2 = arrayList2.get(i13);
                                int i14 = i13 + 1;
                                g8 g8Var4 = (g8) obj2;
                                float f34 = l4;
                                f8 f8Var = g8Var4.e;
                                int i15 = size4;
                                f8 f8Var2 = g8Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                f8 f8Var3 = g8Var4.f;
                                f32 = Math.min(f32, Utilities.t(f21, f19, f8Var.b, f8Var3.b) - ((f8Var2.b + f34) * (U() * 0.4f)));
                                float f35 = f8Var2.b;
                                float f36 = f35 * f35;
                                float f37 = g8Var4.e.b;
                                f31 = (f37 * f36) + f31;
                                f29 = (f8Var3.b * f36) + f29;
                                f30 += f36;
                                f33 = Math.max(0.0f, 1.0f - (Math.abs(f8Var3.b - f19) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f37 - f21) / (U() * 0.12f))) + f33;
                                l4 = f34;
                                i13 = i14;
                                size4 = i15;
                                arrayList2 = arrayList5;
                            }
                            f13 = l4;
                            arrayList = arrayList2;
                            nextFloat = ((random.nextFloat() * org.telegram.messenger.i0.L(10.0f)) + (((((Math.min(Math.min(min, f26), U()) * 0.2f) + ((U() * (f13 * 0.9f)) + ((f32 < 0.0f ? f32 * 2.5f : Math.min(f32, U() * 0.3f)) * 1.2f))) - (Utilities.t(f31 / f30, f29 / f30, nextFloat3, nextFloat4) * 0.35f)) - ((U() * f33) * 0.08f)) - (Utilities.t(f21, f19, this.Y0 * f20, this.Z0 * 0.55f) * 0.04f))) - (z12 ? Utilities.t(f21, f19, f11, f12) * 0.04f : 0.0f);
                        }
                        if (nextFloat > f18) {
                            f18 = nextFloat;
                            fArr = new float[]{f21, f19, f13};
                            f21 += org.telegram.messenger.i0.L(5.0f);
                            nextFloat2 = f23;
                            L = f24;
                            f16 = f25;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f21 += org.telegram.messenger.i0.L(5.0f);
                    nextFloat2 = f23;
                    L = f24;
                    f16 = f25;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f19 += org.telegram.messenger.i0.L(5.0f);
            f17 = f20;
            nextFloat2 = nextFloat2;
        }
        return fArr;
    }

    public final boolean z(u7 u7Var) {
        if (!u7Var.isShown()) {
            return false;
        }
        Rect rect = this.F1;
        return u7Var.getGlobalVisibleRect(rect) && rect.width() >= u7Var.getWidth() - 1 && rect.height() >= u7Var.getHeight() - 1;
    }
}
