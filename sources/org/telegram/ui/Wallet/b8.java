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
import b8.mf;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ik;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.wf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b8 extends View {
    public static final /* synthetic */ int H1 = 0;
    public float A0;
    public final j5 A1;
    public float B0;
    public final t7 B1;
    public float C0;
    public final t7 C1;
    public float D0;
    public final w7 D1;
    public final Paint E;
    public float E0;
    public final RectF E1;
    public final RectF F;
    public float F0;
    public final Paint F1;
    public final Paint G;
    public float G0;
    public final Rect G1;
    public final Paint H;
    public float H0;
    public final RectF I;
    public float I0;
    public final Path J;
    public float J0;
    public final float[] K;
    public float K0;
    public final int[] L;
    public int L0;
    public final v7 M;
    public boolean M0;
    public final u7 N;
    public long N0;
    public final z7 O;
    public long O0;
    public final z7 P;
    public VelocityTracker P0;
    public final z7 Q;
    public String Q0;
    public final z7 R;
    public String R0;
    public final z7 S;
    public long S0;
    public final ArrayList T;
    public a8 T0;
    public final Path U;
    public a8 U0;
    public final Paint V;
    public float V0;
    public final LinearGradient W;
    public float W0;
    public float X0;
    public boolean Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.d2 a;
    public final Matrix a0;
    public float a1;
    public final boolean b;
    public float b0;
    public boolean b1;
    public final f6 c;
    public float c0;
    public TL_wallet.card c1;
    public final m2.t d;
    public final z7 d0;
    public String d1;
    public final SharedPreferences e;
    public final Paint e0;
    public boolean e1;
    public final LinkedHashMap f;
    public final ch0 f0;
    public boolean f1;
    public boolean g0;
    public int g1;
    public final ArrayList h;
    public a8 h0;
    public final t7 h1;
    public a8 i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public final Paint k0;
    public boolean k1;
    public final Paint l0;
    public a8 l1;
    public final Paint m0;
    public o7 m1;
    public final ArrayList n;
    public boolean n0;
    public float[] n1;
    public boolean o0;
    public float o1;
    public boolean p0;
    public final float[] p1;
    public boolean q0;
    public final z7 q1;
    public final Matrix r;
    public boolean r0;
    public final z7 r1;
    public final Matrix s;
    public boolean s0;
    public final Paint s1;
    public boolean t0;
    public final Paint t1;
    public boolean u0;
    public final Matrix u1;
    public boolean v0;
    public final Path v1;
    public final Matrix w;
    public int w0;
    public final RectF w1;
    public final Matrix x;
    public float x0;
    public gi.l3 x1;
    public final Paint y;
    public float y0;
    public gi.l3 y1;
    public float z0;
    public final i1 z1;

    public b8(org.telegram.ui.ActionBar.d2 d2Var, f6 f6Var, m2.t tVar, TL_wallet.card cardVar) {
        super(d2Var.getContext());
        SharedPreferences sharedPreferences;
        this.f = new LinkedHashMap();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new Matrix();
        this.s = new Matrix();
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Paint(3);
        this.E = new Paint(3);
        this.F = new RectF();
        int i3 = 1;
        Paint paint = new Paint(1);
        this.G = paint;
        Paint paint2 = new Paint(1);
        this.H = paint2;
        this.I = new RectF();
        this.J = new Path();
        this.K = new float[450];
        this.L = new int[hs.C3];
        this.O = new z7(0.0f, 260.0f, 0.78f);
        this.P = new z7(0.0f, 420.0f, 0.72f);
        this.Q = new z7(1.0f, 420.0f, 0.38f);
        this.R = new z7(0.0f, 170.0f, 0.42f);
        this.S = new z7(0.0f, 170.0f, 0.42f);
        this.T = new ArrayList();
        this.U = new Path();
        Paint paint3 = new Paint(1);
        this.V = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.W = linearGradient;
        this.a0 = new Matrix();
        this.d0 = new z7(0.0f, 120.0f, 1.0f);
        this.e0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.V0 = 1.0f;
        this.W0 = 0.5f;
        this.X0 = 0.5f;
        this.h1 = new t7(this, i3);
        this.p1 = new float[3];
        this.q1 = new z7(0.0f, 260.0f, 1.0f);
        this.r1 = new z7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.s1 = paint4;
        Paint paint5 = new Paint(1);
        this.t1 = paint5;
        this.u1 = new Matrix();
        this.v1 = new Path();
        this.w1 = new RectF();
        this.z1 = new i1(this, i3);
        int i10 = 2;
        this.A1 = new j5(i10, this);
        this.B1 = new t7(this, i10);
        this.C1 = new t7(this, 3);
        this.D1 = new w7(this);
        this.E1 = new RectF();
        Paint paint6 = new Paint(1);
        this.F1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G1 = new Rect();
        this.a = d2Var;
        int i11 = 0;
        boolean z10 = cardVar != null;
        this.b = z10;
        ch0 ch0Var = new ch0(R.raw.wallet_gift_trash, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), true, null);
        this.f0 = ch0Var;
        ch0Var.R(this);
        this.c = f6Var;
        this.d = tVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + d2Var.getCurrentAccount() + "_" + k0.x(d2Var.getCurrentAccount()).t(), 0);
        }
        this.e = sharedPreferences;
        this.Q0 = z10 ? null : sharedPreferences.getString("style", null);
        this.i1 = (z10 || hp.e1().getBoolean("walletcardstickerhint", false)) ? false : true;
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
        u7 u7Var = new u7(this, getContext());
        this.N = u7Var;
        v7 v7Var = new v7(this, getContext());
        this.M = v7Var;
        u7Var.setTag(a6.o0);
        f6Var.getFrontFace().addView(u7Var, 0, mf.c(-1.0f, -1));
        f6Var.getFrontFace().addView(v7Var, f6Var.getStickerLayerIndex(), mf.c(-1.0f, -1));
        if (z10) {
            v7Var.addOnLayoutChangeListener(new q7(this, i11));
            d(cardVar);
            return;
        }
        int currentAccount = d2Var.getCurrentAccount();
        hp s12 = hp.s1(currentAccount);
        long e10 = h10.i(currentAccount).e();
        TLRPC.UserFull b22 = s12.b2(e10);
        if (b22 == null) {
            s12.W2(s12.a2(Long.valueOf(e10)), 0, true, new k(this, 4));
        } else {
            TL_wallet.card cardVar2 = b22.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
        }
    }

    public static boolean F(int i3, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            HashSet hashSet = ((org.telegram.messenger.o0) hp.s1(i3).x7.m0.b).c;
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

    public static Path H(a8 a8Var) {
        Bitmap bitmap;
        int i3;
        int i10;
        boolean z10;
        int i11;
        if (a8Var == null || a8Var.F != null || (bitmap = a8Var.u) == null) {
            if (a8Var == null) {
                return null;
            }
            return a8Var.F;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
        int[] iArr = new int[TLObject.FLAG_14];
        createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
        if (createScaledBitmap != a8Var.u) {
            createScaledBitmap.recycle();
        }
        boolean[] zArr = new boolean[TLObject.FLAG_14];
        int i12 = -1;
        for (int i13 = 0; i13 < 16384; i13++) {
            boolean z11 = (iArr[i13] >>> 24) >= 110;
            zArr[i13] = z11;
            if (i12 < 0 && z11) {
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
                i3 = 0;
                break;
            }
            int i23 = i22 * 2;
            i3 = 0;
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
                    z10 = false;
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
                        z10 = true;
                        break;
                    }
                } else {
                    i11 = i25;
                }
                i25 = i11 + 1;
                i14 = i10;
                i24 = i28;
            }
            if (!z10 || (i20 == i15 && i18 == i16)) {
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
        for (int i33 = i3; i33 < i22; i33 += 2) {
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
        path.moveTo((fArr2[i3] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
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
        a8Var.F = path;
        return path;
    }

    public static void J(gi.l3 l3Var, float f10, float f11) {
        o(l3Var, 3);
        l3Var.p(0.0f, f10 - l3Var.getPaddingLeft());
        l3Var.setTranslationY(f11 - l3Var.getLayoutParams().height);
        l3Var.invalidate();
    }

    public static double N(float f10) {
        return Math.round(f10 * 100.0f) / 100.0d;
    }

    public static String T(TL_wallet.card cardVar) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i3);
                i3++;
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

    public static boolean b(a8 a8Var) {
        TL_wallet.nftItem nftitem;
        return (a8Var == null || (nftitem = a8Var.b) == null || nftitem.gift == null) ? false : true;
    }

    public static float c(float f10) {
        float f11 = f10 % 360.0f;
        if (f11 > 180.0f) {
            f11 -= 360.0f;
        }
        return f11 < -180.0f ? f11 + 360.0f : f11;
    }

    public static void e0(int i3, TL_wallet.card cardVar) {
        TLRPC.UserFull b22 = hp.s1(i3).b2(h10.i(i3).e());
        if (b22 == null) {
            return;
        }
        b22.wallet_card = cardVar;
        qr.a0(i3).j2(b22, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(gi.l3 l3Var, int i3) {
        if ((l3Var.getTag() instanceof Integer) && ((Integer) l3Var.getTag()).intValue() == i3) {
            return;
        }
        l3Var.setTag(Integer.valueOf(i3));
        l3Var.a = i3;
        l3Var.p(1.0f, 0.0f);
    }

    public static float u(float f10, float f11, float f12) {
        float l10 = Utilities.l((f10 - f11) / (f12 - f11));
        return com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        return mediaAreaCoordinates == null ? "" : String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        f6 f6Var = this.c;
        this.Z0 = f6Var.getFrontFace().getWidth();
        float height = f6Var.getFrontFace().getHeight();
        this.a1 = height;
        if (this.Z0 <= 0.0f || height <= 0.0f) {
            return false;
        }
        Matrix matrix = this.r;
        return f6Var.g(this, matrix) && matrix.invert(this.s);
    }

    public final gi.l3 B(int i3, boolean z10) {
        gi.l3 l3Var = new gi.l3(getContext(), 3);
        l3Var.r(true);
        l3Var.n(11.0f, 6.0f, z10 ? 15.0f : 11.0f, 7.0f);
        l3Var.k(z10);
        l3Var.L = Layout.Alignment.ALIGN_NORMAL;
        l3Var.s(12.0f);
        l3Var.d = -1L;
        String M0 = bd.M0(i3, null);
        l3Var.h = gi.l3.a(M0, l3Var.getTextPaint());
        l3Var.u(M0);
        l3Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        l3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(l3Var, mf.e(-1, hs.g2, 48));
        return l3Var;
    }

    public final boolean C() {
        Path H = this.n1 == null ? null : H(this.l1);
        if (H == null) {
            return false;
        }
        float U = U() * this.n1[2];
        Matrix matrix = this.u1;
        matrix.setScale(U, U);
        float[] fArr = this.n1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.v1);
        return true;
    }

    public final float[] D(float f10) {
        float u10 = (u(f10, 0.45f, 0.82f) - u(f10, 1.3f, 1.72f)) * 0.9f;
        float[] fArr = this.p1;
        fArr[0] = u10;
        fArr[1] = (((float) Math.sin(Utilities.l((f10 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f10, 0.6f, 0.92f) - u(f10, 1.18f, 1.46f));
        fArr[2] = u(f10, 1.58f, 1.7f) - u(f10, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(a8 a8Var) {
        a8Var.J = 0L;
        z7 z7Var = a8Var.h;
        z7 z7Var2 = a8Var.f;
        z7 z7Var3 = a8Var.e;
        if (a8Var.a.equals(this.Q0)) {
            l();
        }
        if (a8Var.b()) {
            float[] L = L(z7Var3.a, z7Var2.a);
            z7Var3.a(L[0]);
            z7Var2.a(L[1]);
        }
        a8Var.H = 4;
        a8Var.W = 0.0f;
        a8Var.X = z7Var3.a;
        a8Var.Y = z7Var2.a;
        a8Var.Z = a8Var.g.a * z7Var.a;
        a8Var.a0 = a8Var.i.a;
        a8Var.b0 = this.x0 > ((float) org.telegram.messenger.g0.L(650.0f)) ? 0.32f : 0.44f;
        this.x0 = 0.0f;
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.o();
        }
        a8Var.c0 = j10 != null ? j10.getScaleX() : 1.0f;
        RectF Z = Z(a8Var);
        if (Z != null) {
            float centerX = Z.centerX() - a8Var.X;
            float centerY = Z.centerY() - a8Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            a8Var.U = hypot > ((float) org.telegram.messenger.g0.L(6.0f)) ? centerX / hypot : 0.0f;
            a8Var.V = hypot > ((float) org.telegram.messenger.g0.L(6.0f)) ? centerY / hypot : 1.0f;
        }
        a8Var.l.a(0.0f);
        z7Var.a(1.0f);
        long j11 = this.O0 + 1;
        this.O0 = j11;
        a8Var.I = j11;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new ik(5)));
        return arrayList;
    }

    public final void I(a8 a8Var, float[] fArr, float[] fArr2, boolean z10) {
        long j10 = a8Var.J;
        z7 z7Var = a8Var.o;
        z7 z7Var2 = a8Var.n;
        if (j10 == 0) {
            long j11 = this.S0 + 1;
            this.S0 = j11;
            a8Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (a8 a8Var2 : this.f.values()) {
                if (a8Var2 != a8Var && a8Var2.b()) {
                    arrayList.add(a8Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new ik(6)));
                for (int i3 = 0; i3 <= arrayList.size() - 10; i3++) {
                    a8 a8Var3 = (a8) arrayList.get(i3);
                    if (this.d.v0()) {
                        E(a8Var3);
                    } else {
                        V(a8Var3);
                    }
                }
                k();
            }
        }
        a8Var.H = 1;
        a8Var.Q = false;
        a8Var.M = false;
        a8Var.L = false;
        a8Var.P = z10;
        a8Var.O = z10;
        long j12 = this.O0 + 1;
        this.O0 = j12;
        a8Var.I = j12;
        z7Var2.a(0.0f);
        z7Var.a(0.0f);
        z7 z7Var3 = a8Var.e;
        float f10 = z10 ? 150.0f : 500.0f;
        float f11 = z10 ? 0.82f : 1.0f;
        z7Var3.d = f10;
        z7Var3.e = f11;
        z7Var3.a(fArr[0]);
        z7Var3.b = fArr2[0];
        z7 z7Var4 = a8Var.f;
        float f12 = z10 ? 150.0f : 500.0f;
        float f13 = z10 ? 0.82f : 1.0f;
        z7Var4.d = f12;
        z7Var4.e = f13;
        z7Var4.a(fArr[1]);
        float f14 = fArr2[1];
        z7Var4.b = f14;
        a8Var.h.b = fArr2[2];
        z7 z7Var5 = a8Var.g;
        z7Var5.d = 300.0f;
        z7Var5.e = 0.5f;
        z7Var5.b = 1.0f;
        z7 z7Var6 = a8Var.j;
        z7Var6.d = z10 ? 110.0f : 150.0f;
        z7Var6.e = 0.9f;
        z7Var6.b = 0.0f;
        a8Var.m.b = 1.0f;
        a8Var.l.b = 0.0f;
        float f15 = fArr2[0] - fArr[0];
        float f16 = f14 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f15, f16));
        a8Var.U = max > ((float) org.telegram.messenger.g0.L(6.0f)) ? f15 / max : 0.0f;
        a8Var.V = max > ((float) org.telegram.messenger.g0.L(6.0f)) ? f16 / max : 1.0f;
        z7 z7Var7 = a8Var.k;
        z7Var7.a(0.9f);
        z7Var7.b = 0.0f;
        if (z10) {
            float min = Math.min(org.telegram.messenger.g0.L(110.0f), 0.32f * max);
            float f17 = f15 >= 0.0f ? -1.0f : 1.0f;
            z7Var2.a(0.0f);
            z7Var2.c = ((-f16) / max) * min * f17 * 20.0f;
            z7Var.a(0.0f);
            z7Var.c = com.google.android.recaptcha.internal.a.B(min, 0.5f, (f15 / max) * min * f17, 20.0f);
        }
        O();
        f0();
    }

    public final void K(a8 a8Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        a8Var.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        a8Var.i.a(c((float) mediaAreaCoordinates.rotation));
        a8Var.N = z10;
        a8Var.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.Z0);
        a8Var.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.a1);
        a8Var.g.a(1.0f);
        a8Var.j.a(0.0f);
        a8Var.k.a(0.0f);
        a8Var.n.a(0.0f);
        a8Var.o.a(0.0f);
        a8Var.l.a(0.0f);
        a8Var.H = 2;
        long j10 = this.O0 + 1;
        this.O0 = j10;
        a8Var.I = j10;
        a8Var.m.a(1.0f);
        if (a8Var.J == 0) {
            long j11 = this.S0 + 1;
            this.S0 = j11;
            a8Var.J = j11;
        }
        if (a8Var.a.equals(this.Q0)) {
            this.U0 = a8Var;
            this.T0 = a8Var;
            this.V0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f10, float f11) {
        float[] fArr = {f10, f11};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void M(a8 a8Var, float f10, float f11) {
        z7 z7Var = a8Var.e;
        z7 z7Var2 = a8Var.h;
        float[] L = L(z7Var.a, a8Var.f.a);
        float t10 = Utilities.t(f10, f11, L[0], L[1]);
        if (Float.isNaN(this.F0)) {
            this.F0 = t10;
            this.G0 = z7Var2.b;
        }
        if (Math.abs(t10 - this.F0) > org.telegram.messenger.g0.L(5.0f)) {
            z7 z7Var3 = a8Var.q;
            z7Var3.d = 700.0f;
            z7Var3.e = 1.0f;
            z7Var3.b = 1.0f;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f) / U();
        float max = this.j0 ? (this.G0 * t10) / Math.max(1.0f, this.F0) : com.google.android.recaptcha.internal.a.y(1.21f, L2, (t10 - this.F0) / org.telegram.messenger.g0.L(110.0f), this.G0);
        z7Var2.d = 900.0f;
        z7Var2.e = 1.0f;
        z7Var2.b = Math.max(L2, Math.min(1.21f, max));
        if (t10 < org.telegram.messenger.g0.L(14.0f)) {
            this.C0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f11 - L[1], f10 - L[0]));
        if (!Float.isNaN(this.C0)) {
            this.D0 = c(degrees - this.C0) + this.D0;
        }
        this.C0 = degrees;
        float f12 = this.E0 + this.D0;
        float round = Math.round(f12 / 90.0f) * 90;
        boolean z10 = Math.abs(f12 - round) < 5.0f;
        if (z10 && !this.M0) {
            performHapticFeedback(4);
        }
        this.M0 = z10;
        z7 z7Var4 = a8Var.i;
        z7Var4.d = 900.0f;
        z7Var4.e = 0.95f;
        if (z10) {
            f12 = round;
        }
        z7Var4.b = f12;
    }

    public final void O() {
        if (!this.b && this.Z0 > 0.0f && this.a1 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (a8 a8Var : this.f.values()) {
                boolean b10 = a8Var.b();
                String str = a8Var.a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", a8Var.e.b / this.Z0);
                        jSONObject.put("y", a8Var.f.b / this.a1);
                        jSONObject.put("r", a8Var.i.b);
                        jSONObject.put("s", a8Var.h.b);
                        jSONObject.put("q", a8Var.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.Q0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final float P(a8 a8Var) {
        return (((1.0f - (a8Var.q.a * 0.9f)) * a8Var.l.a * 0.04f) + 1.0f) * U() * a8Var.g.a * a8Var.h.a;
    }

    public final void Q() {
        if (this.e1 && this.g1 == 0) {
            if (!this.b1 && (this.q0 || !A())) {
                org.telegram.messenger.g0.i3(this.h1, 1000L);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList G = G();
            int size = G.size();
            int i3 = 0;
            String str = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = G.get(i10);
                i10++;
                a8 a8Var = (a8) obj;
                boolean b10 = a8Var.b();
                String str2 = a8Var.a;
                if (b10) {
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(y(a0(a8Var)));
                    sb2.append(';');
                    if (str2.equals(this.Q0) && m(a8Var)) {
                        str = str2;
                    }
                }
            }
            if (a1.g.s(sb2, "bg:", str).equals(this.d1)) {
                this.e1 = false;
                return;
            }
            TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
            ArrayList G2 = G();
            int size2 = G2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = G2.get(i11);
                i11++;
                a8 a8Var2 = (a8) obj2;
                boolean b11 = a8Var2.b();
                String str3 = a8Var2.a;
                if (b11) {
                    TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                    inputwalletcardsticker.nft_address = str3;
                    inputwalletcardsticker.coordinates = a0(a8Var2);
                    setcardstickers.stickers.add(inputwalletcardsticker);
                    if (str3.equals(this.Q0) && m(a8Var2)) {
                        setcardstickers.bg_nft_address = str3;
                    }
                }
            }
            this.e1 = false;
            int currentAccount = this.a.getCurrentAccount();
            TL_wallet.card cardVar = this.c1;
            TL_wallet.card cardVar2 = new TL_wallet.card();
            TL_wallet.card cardVar3 = this.c1;
            if (cardVar3 != null) {
                cardVar2.address = cardVar3.address;
                cardVar2.balance = cardVar3.balance;
            }
            ArrayList<TL_wallet.inputWalletCardSticker> arrayList = setcardstickers.stickers;
            int size3 = arrayList.size();
            while (i3 < size3) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i3);
                i3++;
                TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
                a8 a8Var3 = (a8) this.f.get(inputwalletcardsticker3.nft_address);
                if (a8Var3 != null && a8Var3.b != null) {
                    TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                    cardsticker.nft = a8Var3.b;
                    cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                    cardVar2.stickers.add(cardsticker);
                    if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                        cardVar2.bg_nft_item = a8Var3.b;
                    }
                }
            }
            e0(currentAccount, cardVar2);
            this.g1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new c3.b(1), new wf(this, currentAccount, cardVar, 3));
        }
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.c1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i3);
                i3++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(o7 o7Var) {
        removeCallbacks(this.B1);
        final int i3 = 1;
        this.t0 = true;
        final int i10 = 0;
        this.q0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        o7Var.animate().cancel();
        o7Var.n(o7Var.getScaleX() * o7Var.z0);
        o7Var.setScaleX(1.0f);
        o7Var.setScaleY(1.0f);
        o7Var.m(1.0f, 150L, null);
        final a8 v = v(o7Var.x0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.t0 = false;
            return;
        }
        f60 I = f60.I(this.a, o7Var);
        I.s = 51;
        if (m(v) || str.equals(this.Q0)) {
            I.c(R.drawable.msg_colors, bd.M0(str.equals(this.Q0) ? 2131743113 : 2131743119, null), new Runnable(this) { // from class: org.telegram.ui.Wallet.s7
                public final /* synthetic */ b8 b;

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
                            b8 b8Var = this.b;
                            b8Var.getClass();
                            b8Var.b0(v.b);
                            break;
                    }
                }
            }, false);
        }
        I.c(R.drawable.msg_sticker, bd.M0(v.b() ? 2131743112 : 2131743120, null), new Runnable(this) { // from class: org.telegram.ui.Wallet.s7
            public final /* synthetic */ b8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.c0(v);
                        break;
                    default:
                        b8 b8Var = this.b;
                        b8Var.getClass();
                        b8Var.b0(v.b);
                        break;
                }
            }
        }, false);
        I.p = new t7(this, i10);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Z0 * 0.231f;
    }

    public final void V(a8 a8Var) {
        if (a8Var.a.equals(this.Q0)) {
            l();
        }
        a8Var.N = false;
        g(a8Var);
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(a8 a8Var, float f10, float f11) {
        float[] fArr;
        this.i0 = null;
        this.n0 = true;
        boolean z10 = this.L0 == 2;
        this.p0 = z10;
        if (this.i1) {
            this.j1 = a8Var == this.l1 && !z10;
            this.k1 = false;
            this.i1 = false;
            hp.e1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z11 = a8Var.N;
        z7 z7Var = a8Var.m;
        z7 z7Var2 = a8Var.f;
        z7 z7Var3 = a8Var.e;
        if (z11) {
            a8Var.N = false;
            z7 z7Var4 = a8Var.h;
            z7Var4.d = 420.0f;
            z7Var4.e = 0.8f;
            z7Var4.b = 1.0f;
        }
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.u0 = false;
        if (this.p0) {
            fArr = L(z7Var3.a, z7Var2.a);
        } else {
            RectF Z = Z(a8Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            z7 z7Var5 = a8Var.g;
            z7Var5.d = 500.0f;
            z7Var5.e = 0.75f;
            z7Var5.a((f(a8Var) * Z.width()) / U());
            z7Var.a(0.0f);
            w5.m0((w5) this.d.c, 0L);
            fArr = fArr2;
        }
        z7Var3.d = 1100.0f;
        z7Var3.e = 0.9f;
        z7Var3.a(fArr[0]);
        z7Var2.d = 1100.0f;
        z7Var2.e = 0.9f;
        z7Var2.a(fArr[1]);
        a8Var.H = 3;
        long j11 = this.O0 + 1;
        this.O0 = j11;
        a8Var.I = j11;
        z7Var.b = 1.0f;
        z7 z7Var6 = a8Var.j;
        z7Var6.d = 320.0f;
        z7Var6.e = 0.75f;
        z7Var6.b = 1.0f;
        a8Var.l.a(0.0f);
        this.A0 = fArr[0] - f10;
        this.B0 = fArr[1] - f11;
        this.O.b = this.p0 ? 1.0f : 0.0f;
        performHapticFeedback(3);
    }

    public final void X(a8 a8Var, boolean z10) {
        this.T0 = this.U0;
        this.U0 = a8Var;
        this.V0 = 0.0f;
        this.Y0 = z10;
        if (a8Var != null) {
            this.W0 = a8Var.e.b / this.Z0;
            this.X0 = a8Var.f.b / this.a1;
        }
        f0();
    }

    public final void Y(c0 c0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = c0Var.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (nftitem2.gift != null) {
                v(nftitem2);
            }
        }
        Iterator it = this.f.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            a8 a8Var = (a8) it.next();
            int i10 = a8Var.H;
            String str = a8Var.a;
            if (i10 != 3) {
                ArrayList arrayList2 = c0Var.c;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && k0.b(nftitem.address, str)) {
                            if (str.equals(this.Q0) || str.equals(this.R0)) {
                                this.R0 = null;
                                this.Q0 = null;
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

    public final RectF Z(a8 a8Var) {
        o7 j10 = j(a8Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.w;
            f6.k(j10, matrix);
            Matrix matrix2 = this.x;
            f6.k(this, matrix2);
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
        this.r0 = false;
        removeCallbacks(this.C1);
        removeCallbacks(this.B1);
        this.h0 = null;
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(a8 a8Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * a8Var.h.b;
        tL_mediaAreaCoordinates.x = N((a8Var.e.b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.y = N((a8Var.f.b / this.a1) * 100.0f);
        tL_mediaAreaCoordinates.w = N((U / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.a1) * 100.0f);
        float f10 = a8Var.i.b % 360.0f;
        if (f10 < 0.0f) {
            f10 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f10);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (A()) {
            a8 v = v(nftitem);
            if (v.b()) {
                if (this.d.v0()) {
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

    public final void c0(a8 a8Var) {
        String str = a8Var.a;
        if (str.equals(this.Q0)) {
            l();
            return;
        }
        if (m(a8Var)) {
            this.Q0 = str;
            if (a8Var.b()) {
                X(a8Var, false);
                k();
            } else {
                this.R0 = str;
                d0(a8Var);
                if (a8Var.H == 0) {
                    this.R0 = null;
                    this.Q0 = null;
                } else {
                    k();
                }
            }
            O();
        }
    }

    public final void d(TL_wallet.card cardVar) {
        int i3;
        this.c1 = cardVar;
        this.d1 = T(cardVar);
        if (this.e1 || this.g1 != 0 || this.q0) {
            return;
        }
        TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
        a8 a8Var = null;
        String str = nftitem == null ? null : nftitem.address;
        boolean equals = TextUtils.equals(str, this.Q0);
        if (!equals) {
            this.Q0 = str;
            this.R0 = null;
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
                a8Var = v(nftitem3);
            }
            this.T0 = a8Var;
            this.U0 = a8Var;
            this.V0 = 1.0f;
            e();
            f0();
            return;
        }
        if (!A()) {
            f0();
            return;
        }
        this.f1 = true;
        ArrayList G = G();
        int size2 = G.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = G.get(i11);
            i11++;
            a8 a8Var2 = (a8) obj;
            if (a8Var2.K && (i3 = a8Var2.H) != 3 && i3 != 4 && i3 != 5) {
                TL_wallet.cardSticker R = R(a8Var2.a);
                if (R != null) {
                    if (!a8Var2.b() || !y(a0(a8Var2)).equals(y(R.coordinates))) {
                        K(a8Var2, R.coordinates, a8Var2.N);
                    }
                } else if (a8Var2.b()) {
                    E(a8Var2);
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
                a8 a8Var3 = nftitem4 == null ? null : (a8) linkedHashMap.get(nftitem4.address);
                if (a8Var3 != null && a8Var3.H == 2) {
                    long j10 = this.O0 + 1;
                    this.O0 = j10;
                    a8Var3.I = j10;
                }
            }
        }
        if (!equals) {
            String str2 = this.Q0;
            a8 a8Var4 = str2 == null ? null : (a8) linkedHashMap.get(str2);
            if (a8Var4 == null || !a8Var4.b()) {
                X(null, true);
            } else {
                X(a8Var4, false);
            }
        }
        this.f1 = false;
        O();
        f0();
    }

    public final void d0(a8 a8Var) {
        w5.m0((w5) this.d.c, 2600L);
        if (A()) {
            float[] x10 = x(a8Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(a8Var);
            int i3 = 0;
            if (x10 == null || Z == null) {
                o7 j10 = j(a8Var);
                if (j10 != null) {
                    j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new r7(j10, i3)).start();
                    return;
                }
                return;
            }
            a8Var.g.a((f(a8Var) * Z.width()) / U());
            a8Var.m.a(0.0f);
            a8Var.j.a(1.0f);
            float[] fArr = {Z.centerX(), Z.centerY()};
            this.s.mapPoints(fArr);
            I(a8Var, fArr, x10, true);
            performHapticFeedback(3);
        }
    }

    public final void e() {
        float pow;
        a8 a8Var = this.T0;
        float[] i3 = p7.i(a8Var == null ? null : a8Var.t);
        a8 a8Var2 = this.U0;
        float[] i10 = p7.i(a8Var2 == null ? null : a8Var2.t);
        if (this.Y0) {
            float f10 = this.V0;
            pow = com.google.android.recaptcha.internal.a.B(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.V0, 4.0d));
        }
        float[] fArr = new float[18];
        System.arraycopy(new float[]{i3[0], i3[1], i3[2], i10[0], i10[1], i10[2], this.W0, this.X0, pow, this.Y0 ? 1.0f : 0.0f}, 0, fArr, 0, 10);
        a8 a8Var3 = this.T0;
        p7.m(fArr, 0, a8Var3 == null ? null : a8Var3.t);
        a8 a8Var4 = this.U0;
        p7.m(fArr, 1, a8Var4 == null ? null : a8Var4.t);
        this.c.setStickerStyle(fArr);
    }

    public final float f(a8 a8Var) {
        o7 j10 = j(a8Var);
        if (j10 == null) {
            return 0.77f;
        }
        org.telegram.ui.Components.k9 k9Var = j10.E;
        if (j10.getWidth() <= 0 || k9Var.getWidth() <= 0) {
            return 0.77f;
        }
        return ((k9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
    }

    public final void f0() {
        if (this.b1 || !isAttachedToWindow()) {
            return;
        }
        w7 w7Var = this.D1;
        removeCallbacks(w7Var);
        postOnAnimation(w7Var);
    }

    public final void g(a8 a8Var) {
        a8Var.H = 0;
        a8Var.J = 0L;
        a8Var.g.a(1.0f);
        a8Var.h.a(1.0f);
        a8Var.i.a(0.0f);
        a8Var.m.a(0.0f);
        a8Var.j.a(0.0f);
        a8Var.k.a(0.0f);
        o7 j10 = j(a8Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - org.telegram.messenger.g0.L(64.0f)) - org.telegram.messenger.g0.n;
    }

    public final void i(o7 o7Var) {
        ArrayList arrayList = this.h;
        if (!arrayList.contains(o7Var)) {
            arrayList.add(o7Var);
        }
        a8 v = v(o7Var.x0);
        o7Var.k(v.R, false, v.H == 0 ? 0.0f : 1.0f);
        f0();
    }

    public final o7 j(a8 a8Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            o7 o7Var = (o7) obj;
            if (o7Var.isAttachedToWindow() && o7Var.x0.address.equals(a8Var.a)) {
                return o7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (this.b || this.f1) {
            return;
        }
        this.e1 = true;
        t7 t7Var = this.h1;
        org.telegram.messenger.g0.r(t7Var);
        org.telegram.messenger.g0.i3(t7Var, 1500L);
    }

    public final void l() {
        this.R0 = null;
        this.Q0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(a8 a8Var) {
        return b(a8Var) && F(this.a.getCurrentAccount(), a8Var.b.gift.slug);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.z1);
        getViewTreeObserver().addOnPreDrawListener(this.A1);
        for (a8 a8Var : this.f.values()) {
            a8Var.c.P();
            a8Var.d.P();
        }
        f0();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.z1);
        getViewTreeObserver().removeOnPreDrawListener(this.A1);
        removeCallbacks(this.D1);
        removeCallbacks(this.B1);
        for (a8 a8Var : this.f.values()) {
            a8Var.c.R();
            a8Var.d.R();
        }
        this.N0 = 0L;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b8.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        f0();
    }

    public final void p() {
        org.telegram.messenger.g0.E2(this.x1);
        org.telegram.messenger.g0.E2(this.y1);
        this.y1 = null;
        this.x1 = null;
        O();
        org.telegram.messenger.g0.r(this.h1);
        this.i0 = null;
        this.b1 = true;
        if (this.e1) {
            Q();
        }
        this.f0.C(false);
        removeCallbacks(this.D1);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        for (a8 a8Var : this.f.values()) {
            a8Var.c.R();
            a8Var.d.R();
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
    public final void q(a8 a8Var, float f10, float f11) {
        boolean z10;
        float f12;
        float U;
        float f13 = this.A0 * 0.9f;
        this.A0 = f13;
        float f14 = this.B0 * 0.9f;
        this.B0 = f14;
        boolean z11 = false;
        float[] fArr = {f13 + f10, f14 + f11};
        this.s.mapPoints(fArr);
        float f15 = fArr[0];
        if (f15 >= 0.0f && f15 <= this.Z0) {
            float f16 = fArr[1];
            if (f16 >= 0.0f && f16 <= this.a1) {
                z10 = true;
                if (this.p0 && !z10 && Utilities.t(f10, f11, getWidth() / 2.0f, h()) < org.telegram.messenger.g0.L(78.0f)) {
                    z11 = true;
                }
                if (z11 != this.u0) {
                    performHapticFeedback(4);
                }
                this.u0 = z11;
                this.O.b = (this.p0 || z10) ? 0.0f : 1.0f;
                this.P.b = !z11 ? 1.0f : 0.0f;
                z7 z7Var = a8Var.e;
                if (z11) {
                    f12 = this.A0;
                } else {
                    float L = org.telegram.messenger.g0.L(15.0f);
                    Paint paint = this.H;
                    paint.setTextSize(L);
                    f10 = (getWidth() / 2.0f) - ((paint.measureText(bd.M0(2131746329, null)) + org.telegram.messenger.g0.L(72.0f)) / 2.0f);
                    f12 = org.telegram.messenger.g0.L(30.0f);
                }
                z7Var.b = f10 + f12;
                a8Var.f.b = !z11 ? h() - org.telegram.messenger.g0.L(46.0f) : f11 + this.B0;
                RectF Z = Z(a8Var);
                float U2 = Z != null ? U() : Z.width();
                z7 z7Var2 = a8Var.g;
                if (z11) {
                    U = 1.24f * (z10 ? 1.0f : (U2 * 0.77f) / U());
                } else {
                    U = org.telegram.messenger.g0.L(38.0f) / U();
                }
                z7Var2.b = U;
                if (this.p0) {
                    return;
                }
                z7 z7Var3 = a8Var.i;
                z7Var3.d = 260.0f;
                z7Var3.e = 0.9f;
                float f17 = z7Var3.a;
                z7Var3.b = c((z10 ? this.K0 : 0.0f) - f17) + f17;
                return;
            }
        }
        z10 = false;
        if (this.p0) {
            z11 = true;
        }
        if (z11 != this.u0) {
        }
        this.u0 = z11;
        this.O.b = (this.p0 || z10) ? 0.0f : 1.0f;
        this.P.b = !z11 ? 1.0f : 0.0f;
        z7 z7Var4 = a8Var.e;
        if (z11) {
        }
        z7Var4.b = f10 + f12;
        a8Var.f.b = !z11 ? h() - org.telegram.messenger.g0.L(46.0f) : f11 + this.B0;
        RectF Z2 = Z(a8Var);
        if (Z2 != null) {
        }
        z7 z7Var22 = a8Var.g;
        if (z11) {
        }
        z7Var22.b = U;
        if (this.p0) {
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
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 > 14) {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.K, 0, this.L, 0, this.y);
                return;
            }
            int i11 = 0;
            for (int i12 = 14; i11 <= i12; i12 = 14) {
                float f25 = ((i11 / 14.0f) - 0.5f) * f19;
                float f26 = ((i3 / 14.0f) - 0.5f) * f19;
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
                    double d10 = min;
                    float sin2 = (f20 - (f18 * ((float) Math.sin(d10)))) - (((float) Math.cos(d10)) * max);
                    float sin3 = (max * ((float) Math.sin(d10))) + ((1.0f - ((float) Math.cos(d10))) * f18);
                    f33 = (((float) Math.cos(d10)) * 0.38f) + 0.62f;
                    f29 = sin2;
                    f32 = sin3;
                } else {
                    f18 = f21;
                }
                float f34 = f22 / (f22 - f32);
                int i13 = i10 * 2;
                float[] fArr = this.K;
                fArr[i13] = (((f29 * f16) - (f30 * f17)) * f34) + f10;
                fArr[i13 + 1] = ((((f30 * f16) + (f29 * f17)) * f34) + f11) - (f32 * 0.15f);
                int i14 = (int) (255.0f * f33);
                this.L[i10] = Color.rgb(i14, i14, i14);
                i11++;
                f19 = f12;
                i10++;
                f21 = f18;
            }
            i3++;
            f19 = f12;
        }
    }

    public final void s(Canvas canvas, a8 a8Var, float f10, float f11, boolean z10) {
        float f12;
        ImageReceiver imageReceiver = a8Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = a8Var.t;
        Bitmap n4 = imageReceiver.n();
        if (n4 == null || stargiftattributebackdrop == null) {
            return;
        }
        canvas.save();
        float f13 = this.Z0;
        float f14 = this.a1;
        Path path = this.J;
        path.rewind();
        float f15 = 0.15f;
        char c2 = 0;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(0.0f, 0.0f, f13, f14, (f13 * 0.15f) / 2.0f, (f14 * 0.15f) / 1.212122f, direction);
        canvas.clipPath(path);
        this.c.h(path, this.Z0, this.a1);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        if (f11 >= 0.0f && !z10) {
            path.rewind();
            path.addCircle(this.W0 * this.Z0, this.X0 * this.a1, f11, direction);
            canvas.clipPath(path);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
        Paint paint = this.y;
        paint.setColorFilter(porterDuffColorFilter);
        float f16 = this.Z0 / 336.0f;
        float f17 = this.a1 / 205.0f;
        int i3 = 16;
        int i10 = 0;
        int i11 = 16;
        while (i11 < 336) {
            int i12 = ((i10 % 2) * 18) + i3;
            while (i12 < 205) {
                float f18 = i11 * f16;
                float f19 = i12 * f17;
                float f20 = f15;
                float f21 = f16 * 12.0f;
                float l10 = Utilities.l(Math.min(Math.min(i11, 336 - i11), Math.min(i12, 205 - i12)) / 48.0f);
                float f22 = f16;
                float B = f10 * f20 * com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10);
                if (f11 >= 0.0f) {
                    float l11 = Utilities.l((f11 - Utilities.t(f18, f19, this.W0 * this.Z0, this.X0 * this.a1)) / org.telegram.messenger.g0.L(120.0f));
                    if (z10) {
                        f21 = com.google.android.recaptcha.internal.a.B(l11, 0.8f, 1.0f, f21);
                        B *= 1.0f - Utilities.l(l11 * 1.6f);
                    } else {
                        f12 = f18;
                        f21 *= (((((float) Math.sin(l11 * 3.141592653589793d)) * 0.28f) + l11) * 0.8f) + 0.2f;
                        B *= Utilities.l(l11 * 1.6f);
                        paint.setAlpha((int) (B * 255.0f));
                        float f23 = f21 / 2.0f;
                        RectF rectF = this.I;
                        rectF.set(f12 - f23, f19 - f23, f12 + f23, f19 + f23);
                        canvas.drawBitmap(n4, (Rect) null, rectF, paint);
                        i12 += 37;
                        f15 = f20;
                        c2 = 0;
                        f16 = f22;
                    }
                }
                f12 = f18;
                paint.setAlpha((int) (B * 255.0f));
                float f232 = f21 / 2.0f;
                RectF rectF2 = this.I;
                rectF2.set(f12 - f232, f19 - f232, f12 + f232, f19 + f232);
                canvas.drawBitmap(n4, (Rect) null, rectF2, paint);
                i12 += 37;
                f15 = f20;
                c2 = 0;
                f16 = f22;
            }
            i11 += 33;
            i10++;
            i3 = 16;
        }
        paint.setColorFilter(null);
        paint.setAlpha(hs.e4);
        canvas.restore();
    }

    public final void t(Canvas canvas, a8 a8Var, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (f15 <= 0.01f || a8Var.w == null) {
            return;
        }
        float f16 = (((0.05f * f13) + 1.0f) * ((f12 * 176.0f) / 128.0f)) / 2.0f;
        float f17 = f10 - f16;
        float f18 = f11 - f16;
        float f19 = f10 + f16;
        float f20 = f11 + f16;
        RectF rectF = this.I;
        rectF.set(f17, f18, f19, f20);
        Paint paint = this.y;
        int alpha = paint.getAlpha();
        paint.setColor(-16044452);
        paint.setAlpha((int) (Utilities.l(a8Var.m.a) * Utilities.l((f14 * 0.12f) + (f13 * (-0.049999997f)) + 0.16f) * 255.0f * f15));
        canvas.drawBitmap(a8Var.w, (Rect) null, rectF, paint);
        paint.setColor(-1);
        paint.setAlpha(alpha);
    }

    public final a8 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        a8 a8Var = (a8) linkedHashMap.get(str);
        if (a8Var == null) {
            a8Var = new a8(this, nftitem);
            linkedHashMap.put(nftitem.address, a8Var);
        }
        a8Var.b = nftitem;
        return a8Var;
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
    public final void w(float f10, float f11, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        float[] x10;
        getParent().requestDisallowInterceptTouchEvent(false);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        this.x0 = f11;
        if (this.n0) {
            w5 w5Var = (w5) this.d.c;
            float f12 = w5Var.J0;
            d4 d4Var = w5Var.L0;
            if (f12 > 0.0f) {
                org.telegram.messenger.g0.r(d4Var);
                org.telegram.messenger.g0.i3(d4Var, 1650L);
            }
        }
        a8 a8Var = this.h0;
        if (a8Var != null) {
            z7 z7Var = a8Var.g;
            z7 z7Var2 = a8Var.i;
            z7 z7Var3 = a8Var.f;
            z7 z7Var4 = a8Var.e;
            o7 j10 = j(a8Var);
            if (j10 != null) {
                j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
            }
            if (this.n0) {
                Matrix matrix = this.s;
                if (z10 && this.L0 == 2) {
                    float[] fArr = {z7Var4.a, z7Var3.a};
                    matrix.mapPoints(fArr);
                    z7 z7Var5 = a8Var.h;
                    float f13 = this.J0;
                    z7Var5.b = f13;
                    z7Var2.b = this.K0;
                    I(a8Var, fArr, new float[]{this.H0, this.I0, f13}, false);
                } else if (z10) {
                    E(a8Var);
                } else if (this.u0) {
                    a8Var.H = 5;
                    long j11 = this.O0 + 1;
                    this.O0 = j11;
                    a8Var.I = j11;
                    a8Var.J = 0L;
                    this.g0 = true;
                    z7 z7Var6 = this.d0;
                    z7Var6.a(Math.max(30.0f, z7Var6.a));
                    z7Var4.d = 500.0f;
                    z7Var4.e = 0.9f;
                    float L = org.telegram.messenger.g0.L(15.0f);
                    Paint paint = this.H;
                    paint.setTextSize(L);
                    z7Var4.b = ((getWidth() / 2.0f) - ((paint.measureText(bd.M0(2131746329, null)) + org.telegram.messenger.g0.L(72.0f)) / 2.0f)) + org.telegram.messenger.g0.L(30.0f);
                    z7Var3.d = 500.0f;
                    z7Var3.e = 0.9f;
                    z7Var3.b = h();
                    z7Var.d = 240.0f;
                    z7Var.e = 0.95f;
                    z7Var.b = 0.0f;
                    a8Var.j.b = 0.0f;
                    z7Var2.b = 0.0f;
                    if (a8Var.a.equals(this.Q0)) {
                        l();
                    }
                    performHapticFeedback(16);
                } else {
                    float[] fArr2 = {z7Var4.a, z7Var3.a};
                    matrix.mapPoints(fArr2);
                    float f14 = fArr2[0];
                    if (f14 >= 0.0f && f14 <= this.Z0) {
                        float f15 = fArr2[1];
                        if (f15 >= 0.0f && f15 <= this.a1) {
                            z11 = true;
                            if (this.p0) {
                                z12 = z11;
                                if (((float) Math.hypot(f10, f11)) > org.telegram.messenger.g0.L(700.0f) && (z12 || f11 < (-org.telegram.messenger.g0.L(600.0f)))) {
                                    z13 = true;
                                    x10 = z12 ? x(a8Var, fArr2[0], fArr2[1], false) : null;
                                    if (z13) {
                                        x10 = x(a8Var, Math.max(0.0f, Math.min(this.Z0, (f10 * 0.08f) + fArr2[0])), Math.max(0.0f, Math.min(this.a1, (f11 * 0.08f) + fArr2[1])), true);
                                    }
                                    if (x10 != null) {
                                        I(a8Var, fArr2, x10, false);
                                    } else {
                                        E(a8Var);
                                    }
                                    if (x10 != null) {
                                        a8Var.P = z13;
                                        if (z13) {
                                            z7Var4.d = 260.0f;
                                            z7Var4.e = 0.8f;
                                            z7Var3.d = 260.0f;
                                            z7Var3.e = 0.8f;
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
                    if (this.p0) {
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
            } else if (this.o0 || this.j0) {
                z7 z7Var7 = a8Var.l;
                z7Var7.d = 380.0f;
                z7Var7.e = 0.62f;
                z7Var7.b = 0.0f;
                z7Var2.a = c(z7Var2.a);
                z7Var2.b = c(z7Var2.b);
            } else if (!z10) {
                if (this.v0) {
                    this.i0 = a8Var;
                    z7Var.c += 3.0f;
                    long j12 = this.O0 + 1;
                    this.O0 = j12;
                    a8Var.I = j12;
                    a8Var.S = true;
                    a8Var.T = false;
                    ei.c3 c3Var = a8Var.c;
                    c3Var.v0 = true;
                    c3Var.P0(false);
                    performHapticFeedback(3);
                } else {
                    ((w5) this.a).H0(a8Var.b);
                }
            }
        }
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        if (a8Var != null && (this.n0 || this.o0 || this.j0)) {
            k();
        }
        this.j1 = false;
        this.p0 = false;
        this.u0 = false;
        this.j0 = false;
        this.o0 = false;
        this.n0 = false;
        this.r0 = false;
        this.q0 = false;
        this.h0 = null;
        this.O.b = 0.0f;
        this.P.b = 0.0f;
        O();
        f0();
    }

    public final float[] x(a8 a8Var, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        float f14;
        ArrayList arrayList;
        float nextFloat;
        if (!z10) {
            a8Var.N = false;
            return new float[]{f10, f11, a8Var.h.b};
        }
        ArrayList<RectF> stickerObstacles = this.c.getStickerObstacles();
        float f15 = this.Z0 * 0.012f;
        int size = stickerObstacles.size();
        int i3 = 0;
        while (i3 < size) {
            RectF rectF = stickerObstacles.get(i3);
            i3++;
            float f16 = -f15;
            rectF.inset(f16, f16);
        }
        stickerObstacles.get(2).left -= this.Z0 * 0.035f;
        float L = org.telegram.messenger.g0.L(32.0f) / U();
        float f17 = a8Var.h.b;
        a8Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (a8 a8Var2 : this.f.values()) {
            if (a8Var2 != a8Var && a8Var2.b()) {
                arrayList2.add(a8Var2);
            }
        }
        boolean z11 = (Float.isNaN(f10) || Float.isNaN(f11)) ? false : true;
        if (!z11 && a8Var == this.l1 && this.n1 != null && arrayList2.isEmpty()) {
            return (float[]) this.n1.clone();
        }
        if (z11) {
            f12 = f10;
            f13 = f11;
        } else {
            f12 = this.Z0 * 0.6f;
            f13 = this.a1 * 0.68f;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (a8Var.a.hashCode() * 7919));
        float nextFloat2 = (random.nextFloat() * 0.04f) + 0.05f;
        float f18 = 0.5f;
        float nextFloat3 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Z0;
        float nextFloat4 = this.a1 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * L * 0.5f;
        float f19 = -3.4028235E38f;
        float[] fArr = null;
        float f20 = U;
        while (f20 <= this.a1 - U) {
            float f21 = f18;
            float f22 = U;
            while (true) {
                float f23 = this.Z0;
                if (f22 <= f23 - U) {
                    float min = Math.min(Math.min(f22, f23 - f22), Math.min(f20, this.a1 - f20));
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
                        z11 = z11;
                    }
                    ArrayList<RectF> arrayList4 = stickerObstacles;
                    boolean z12 = z11;
                    float min3 = Math.min(min2, f27 / (U() * 0.44f));
                    int i11 = 0;
                    for (int size3 = arrayList2.size(); i11 < size3; size3 = size3) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        a8 a8Var3 = (a8) obj;
                        min3 = Math.min(min3, (Utilities.t(f22, f20, a8Var3.e.b, a8Var3.f.b) / (U() * 0.29f)) - a8Var3.h.b);
                    }
                    float l10 = ((Utilities.l((min - ((U() * f21) * min3)) / org.telegram.messenger.g0.L(14.0f)) * 0.1f) + 0.9f) * min3;
                    if (l10 < f25) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f28 = this.Z0 * 0.6f;
                            float y9 = com.google.android.recaptcha.internal.a.y(f12, f28, 0.2f, f28);
                            float f29 = this.a1 * 0.68f;
                            nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(5.0f)) + (U() * 1.1f * l10) + (Utilities.t(f22, f20, y9, com.google.android.recaptcha.internal.a.y(f13, f29, 0.2f, f29)) * (-0.45f));
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
                                a8 a8Var4 = (a8) obj2;
                                float f35 = l10;
                                z7 z7Var = a8Var4.e;
                                int i14 = size4;
                                z7 z7Var2 = a8Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                z7 z7Var3 = a8Var4.f;
                                f33 = Math.min(f33, Utilities.t(f22, f20, z7Var.b, z7Var3.b) - ((z7Var2.b + f35) * (U() * 0.4f)));
                                float f36 = z7Var2.b;
                                float f37 = f36 * f36;
                                float f38 = a8Var4.e.b;
                                f32 = (f38 * f37) + f32;
                                f30 = (z7Var3.b * f37) + f30;
                                f31 += f37;
                                f34 = Math.max(0.0f, 1.0f - (Math.abs(z7Var3.b - f20) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f38 - f22) / (U() * 0.12f))) + f34;
                                l10 = f35;
                                i12 = i13;
                                size4 = i14;
                                arrayList2 = arrayList5;
                            }
                            f14 = l10;
                            arrayList = arrayList2;
                            nextFloat = ((random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + (((((Math.min(Math.min(min, f27), U()) * 0.2f) + ((U() * (f14 * 0.9f)) + ((f33 < 0.0f ? f33 * 2.5f : Math.min(f33, U() * 0.3f)) * 1.2f))) - (Utilities.t(f32 / f31, f30 / f31, nextFloat3, nextFloat4) * 0.35f)) - ((U() * f34) * 0.08f)) - (Utilities.t(f22, f20, this.Z0 * f21, this.a1 * 0.55f) * 0.04f))) - (z12 ? Utilities.t(f22, f20, f12, f13) * 0.04f : 0.0f);
                        }
                        if (nextFloat > f19) {
                            f19 = nextFloat;
                            fArr = new float[]{f22, f20, f14};
                            f22 += org.telegram.messenger.g0.L(5.0f);
                            nextFloat2 = f24;
                            L = f25;
                            f17 = f26;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f22 += org.telegram.messenger.g0.L(5.0f);
                    nextFloat2 = f24;
                    L = f25;
                    f17 = f26;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f20 += org.telegram.messenger.g0.L(5.0f);
            f18 = f21;
            nextFloat2 = nextFloat2;
        }
        return fArr;
    }

    public final boolean z(o7 o7Var) {
        if (!o7Var.isShown()) {
            return false;
        }
        Rect rect = this.G1;
        return o7Var.getGlobalVisibleRect(rect) && rect.width() >= o7Var.getWidth() - 1 && rect.height() >= o7Var.getHeight() - 1;
    }
}
