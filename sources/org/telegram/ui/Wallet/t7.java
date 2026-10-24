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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.dg;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class t7 extends View {
    public static final /* synthetic */ int G1 = 0;
    public float A0;
    public final l7 A1;
    public float B0;
    public final l7 B1;
    public float C0;
    public final o7 C1;
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
    public final n7 L;
    public boolean L0;
    public final m7 M;
    public long M0;
    public final r7 N;
    public long N0;
    public final r7 O;
    public VelocityTracker O0;
    public final r7 P;
    public String P0;
    public final r7 Q;
    public String Q0;
    public final r7 R;
    public long R0;
    public final ArrayList S;
    public s7 S0;
    public final Path T;
    public s7 T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public float V0;
    public final Matrix W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final org.telegram.ui.ActionBar.o2 a;
    public float a0;
    public boolean a1;
    public final boolean b;
    public float b0;
    public TL_wallet.card b1;
    public final x5 c;
    public final r7 c0;
    public String c1;
    public final mi.q d;
    public final Paint d0;
    public boolean d1;
    public final SharedPreferences e;
    public final yj0 e0;
    public boolean e1;
    public final LinkedHashMap f;
    public boolean f0;
    public int f1;
    public s7 g0;
    public final l7 g1;
    public final ArrayList h;
    public s7 h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public final Paint j0;
    public boolean j1;
    public final Paint k0;
    public s7 k1;
    public final Paint l0;
    public g7 l1;
    public boolean m0;
    public float[] m1;
    public final ArrayList n;
    public boolean n0;
    public float n1;
    public boolean o0;
    public final float[] o1;
    public boolean p0;
    public final r7 p1;
    public boolean q0;
    public final r7 q1;
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
    public final Matrix v;
    public int v0;
    public final RectF v1;
    public final Matrix w;
    public float w0;
    public ei.x3 w1;
    public final Paint x;
    public float x0;
    public ei.x3 x1;
    public final Paint y;
    public float y0;
    public final n1 y1;
    public float z0;
    public final z4 z1;

    public t7(org.telegram.ui.ActionBar.o2 o2Var, x5 x5Var, mi.q qVar, TL_wallet.card cardVar) {
        super(o2Var.getContext());
        SharedPreferences sharedPreferences;
        this.f = new LinkedHashMap();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new Matrix();
        this.s = new Matrix();
        this.v = new Matrix();
        this.w = new Matrix();
        this.x = new Paint(3);
        this.y = new Paint(3);
        this.E = new RectF();
        int i10 = 1;
        Paint paint = new Paint(1);
        this.F = paint;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new RectF();
        this.I = new Path();
        this.J = new float[450];
        this.K = new int[225];
        this.N = new r7(0.0f, 260.0f, 0.78f);
        this.O = new r7(0.0f, 420.0f, 0.72f);
        this.P = new r7(1.0f, 420.0f, 0.38f);
        this.Q = new r7(0.0f, 170.0f, 0.42f);
        this.R = new r7(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.c0 = new r7(0.0f, 120.0f, 1.0f);
        this.d0 = new Paint(1);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.U0 = 1.0f;
        this.V0 = 0.5f;
        this.W0 = 0.5f;
        this.g1 = new l7(this, i10);
        this.o1 = new float[3];
        this.p1 = new r7(0.0f, 260.0f, 1.0f);
        this.q1 = new r7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.r1 = paint4;
        Paint paint5 = new Paint(1);
        this.s1 = paint5;
        this.t1 = new Matrix();
        this.u1 = new Path();
        this.v1 = new RectF();
        this.y1 = new n1(this, i10);
        int i11 = 2;
        this.z1 = new z4(i11, this);
        this.A1 = new l7(this, i11);
        this.B1 = new l7(this, 3);
        this.C1 = new o7(this);
        this.D1 = new RectF();
        Paint paint6 = new Paint(1);
        this.E1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.F1 = new Rect();
        this.a = o2Var;
        int i12 = 0;
        boolean z10 = cardVar != null;
        this.b = z10;
        yj0 yj0Var = new yj0(R.raw.wallet_gift_trash, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.e0 = yj0Var;
        yj0Var.R(this);
        this.c = x5Var;
        this.d = qVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + o2Var.getCurrentAccount() + "_" + l0.w(o2Var.getCurrentAccount()).s(), 0);
        }
        this.e = sharedPreferences;
        this.P0 = z10 ? null : sharedPreferences.getString("style", null);
        this.h1 = (z10 || MessagesController.getGlobalMainSettings().getBoolean("walletcardstickerhint", false)) ? false : true;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(AndroidUtilities.dp(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(AndroidUtilities.bold());
        m7 m7Var = new m7(this, getContext());
        this.M = m7Var;
        n7 n7Var = new n7(this, getContext());
        this.L = n7Var;
        m7Var.setTag(s5.n0);
        x5Var.getFrontFace().addView(m7Var, 0, w7.z5.c(-1.0f, -1));
        x5Var.getFrontFace().addView(n7Var, x5Var.getStickerLayerIndex(), w7.z5.c(-1.0f, -1));
        if (z10) {
            n7Var.addOnLayoutChangeListener(new i7(this, i12));
            d(cardVar);
            return;
        }
        int currentAccount = o2Var.getCurrentAccount();
        MessagesController messagesController = MessagesController.getInstance(currentAccount);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        TLRPC.UserFull userFull = messagesController.getUserFull(clientUserId);
        if (userFull == null) {
            messagesController.loadFullUser(messagesController.getUser(Long.valueOf(clientUserId)), 0, true, new k(this, 4));
        } else {
            TL_wallet.card cardVar2 = userFull.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
        }
    }

    public static boolean F(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(45);
        Set<String> set = AppGlobalConfig.getInstance(i10).walletCardBgGifts.get();
        if (set != null) {
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            }
            if (set.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static Path H(s7 s7Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        if (s7Var == null || s7Var.F != null || (bitmap = s7Var.u) == null) {
            if (s7Var == null) {
                return null;
            }
            return s7Var.F;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
        int[] iArr = new int[16384];
        createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
        if (createScaledBitmap != s7Var.u) {
            createScaledBitmap.recycle();
        }
        boolean[] zArr = new boolean[16384];
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
        s7Var.F = path;
        return path;
    }

    public static void J(ei.x3 x3Var, float f7, float f10) {
        o(x3Var, 3);
        x3Var.m(0.0f, f7 - x3Var.getPaddingLeft());
        x3Var.setTranslationY(f10 - x3Var.getLayoutParams().height);
        x3Var.invalidate();
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

    public static boolean b(s7 s7Var) {
        TL_wallet.nftItem nftitem;
        return (s7Var == null || (nftitem = s7Var.b) == null || nftitem.gift == null) ? false : true;
    }

    public static float c(float f7) {
        float f10 = f7 % 360.0f;
        if (f10 > 180.0f) {
            f10 -= 360.0f;
        }
        return f10 < -180.0f ? f10 + 360.0f : f10;
    }

    public static void e0(int i10, TL_wallet.card cardVar) {
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(UserConfig.getInstance(i10).getClientUserId());
        if (userFull == null) {
            return;
        }
        userFull.wallet_card = cardVar;
        MessagesStorage.getInstance(i10).updateUserInfo(userFull, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.clamp01(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(ei.x3 x3Var, int i10) {
        if ((x3Var.getTag() instanceof Integer) && ((Integer) x3Var.getTag()).intValue() == i10) {
            return;
        }
        x3Var.setTag(Integer.valueOf(i10));
        x3Var.a = i10;
        x3Var.m(1.0f, 0.0f);
    }

    public static float u(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f7 - f10) / (f11 - f10));
        return com.google.android.gms.internal.play_billing.k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        return mediaAreaCoordinates == null ? "" : String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        x5 x5Var = this.c;
        this.Y0 = x5Var.getFrontFace().getWidth();
        float height = x5Var.getFrontFace().getHeight();
        this.Z0 = height;
        if (this.Y0 <= 0.0f || height <= 0.0f) {
            return false;
        }
        Matrix matrix = this.r;
        return x5Var.g(this, matrix) && matrix.invert(this.s);
    }

    public final ei.x3 B(int i10, boolean z10) {
        ei.x3 x3Var = new ei.x3(getContext(), 3);
        x3Var.p(true);
        x3Var.k(11.0f, 6.0f, z10 ? 15.0f : 11.0f, 7.0f);
        x3Var.i(z10);
        x3Var.K = Layout.Alignment.ALIGN_NORMAL;
        x3Var.q(12.0f);
        x3Var.d = -1L;
        String string = LocaleController.getString(i10);
        x3Var.h = ei.x3.a(string, x3Var.getTextPaint());
        x3Var.s(string);
        x3Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        x3Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(x3Var, w7.z5.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 48));
        return x3Var;
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
        fArr[1] = (((float) Math.sin(Utilities.clamp01((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(s7 s7Var) {
        s7Var.J = 0L;
        r7 r7Var = s7Var.h;
        r7 r7Var2 = s7Var.f;
        r7 r7Var3 = s7Var.e;
        if (s7Var.a.equals(this.P0)) {
            l();
        }
        if (s7Var.b()) {
            float[] L = L(r7Var3.a, r7Var2.a);
            r7Var3.a(L[0]);
            r7Var2.a(L[1]);
        }
        s7Var.H = 4;
        s7Var.W = 0.0f;
        s7Var.X = r7Var3.a;
        s7Var.Y = r7Var2.a;
        s7Var.Z = s7Var.g.a * r7Var.a;
        s7Var.a0 = s7Var.i.a;
        s7Var.b0 = this.w0 > ((float) AndroidUtilities.dp(650.0f)) ? 0.32f : 0.44f;
        this.w0 = 0.0f;
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.o();
        }
        s7Var.c0 = j10 != null ? j10.getScaleX() : 1.0f;
        RectF Z = Z(s7Var);
        if (Z != null) {
            float centerX = Z.centerX() - s7Var.X;
            float centerY = Z.centerY() - s7Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            s7Var.U = hypot > ((float) AndroidUtilities.dp(6.0f)) ? centerX / hypot : 0.0f;
            s7Var.V = hypot > ((float) AndroidUtilities.dp(6.0f)) ? centerY / hypot : 1.0f;
        }
        s7Var.l.a(0.0f);
        r7Var.a(1.0f);
        long j11 = this.N0 + 1;
        this.N0 = j11;
        s7Var.I = j11;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new org.telegram.ui.Components.w0(2)));
        return arrayList;
    }

    public final void I(s7 s7Var, float[] fArr, float[] fArr2, boolean z10) {
        long j10 = s7Var.J;
        r7 r7Var = s7Var.o;
        r7 r7Var2 = s7Var.n;
        if (j10 == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            s7Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (s7 s7Var2 : this.f.values()) {
                if (s7Var2 != s7Var && s7Var2.b()) {
                    arrayList.add(s7Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new org.telegram.ui.Components.w0(3)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    s7 s7Var3 = (s7) arrayList.get(i10);
                    if (this.d.O()) {
                        E(s7Var3);
                    } else {
                        V(s7Var3);
                    }
                }
                k();
            }
        }
        s7Var.H = 1;
        s7Var.Q = false;
        s7Var.M = false;
        s7Var.L = false;
        s7Var.P = z10;
        s7Var.O = z10;
        long j12 = this.N0 + 1;
        this.N0 = j12;
        s7Var.I = j12;
        r7Var2.a(0.0f);
        r7Var.a(0.0f);
        r7 r7Var3 = s7Var.e;
        float f7 = z10 ? 150.0f : 500.0f;
        float f10 = z10 ? 0.82f : 1.0f;
        r7Var3.d = f7;
        r7Var3.e = f10;
        r7Var3.a(fArr[0]);
        r7Var3.b = fArr2[0];
        r7 r7Var4 = s7Var.f;
        float f11 = z10 ? 150.0f : 500.0f;
        float f12 = z10 ? 0.82f : 1.0f;
        r7Var4.d = f11;
        r7Var4.e = f12;
        r7Var4.a(fArr[1]);
        float f13 = fArr2[1];
        r7Var4.b = f13;
        s7Var.h.b = fArr2[2];
        r7 r7Var5 = s7Var.g;
        r7Var5.d = 300.0f;
        r7Var5.e = 0.5f;
        r7Var5.b = 1.0f;
        r7 r7Var6 = s7Var.j;
        r7Var6.d = z10 ? 110.0f : 150.0f;
        r7Var6.e = 0.9f;
        r7Var6.b = 0.0f;
        s7Var.m.b = 1.0f;
        s7Var.l.b = 0.0f;
        float f14 = fArr2[0] - fArr[0];
        float f15 = f13 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f14, f15));
        s7Var.U = max > ((float) AndroidUtilities.dp(6.0f)) ? f14 / max : 0.0f;
        s7Var.V = max > ((float) AndroidUtilities.dp(6.0f)) ? f15 / max : 1.0f;
        r7 r7Var7 = s7Var.k;
        r7Var7.a(0.9f);
        r7Var7.b = 0.0f;
        if (z10) {
            float min = Math.min(AndroidUtilities.dp(110.0f), 0.32f * max);
            float f16 = f14 >= 0.0f ? -1.0f : 1.0f;
            r7Var2.a(0.0f);
            r7Var2.c = ((-f15) / max) * min * f16 * 20.0f;
            r7Var.a(0.0f);
            r7Var.c = com.google.android.gms.internal.play_billing.k3.B(min, 0.5f, (f14 / max) * min * f16, 20.0f);
        }
        O();
        f0();
    }

    public final void K(s7 s7Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        s7Var.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        s7Var.i.a(c((float) mediaAreaCoordinates.rotation));
        s7Var.N = z10;
        s7Var.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.Y0);
        s7Var.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.Z0);
        s7Var.g.a(1.0f);
        s7Var.j.a(0.0f);
        s7Var.k.a(0.0f);
        s7Var.n.a(0.0f);
        s7Var.o.a(0.0f);
        s7Var.l.a(0.0f);
        s7Var.H = 2;
        long j10 = this.N0 + 1;
        this.N0 = j10;
        s7Var.I = j10;
        s7Var.m.a(1.0f);
        if (s7Var.J == 0) {
            long j11 = this.R0 + 1;
            this.R0 = j11;
            s7Var.J = j11;
        }
        if (s7Var.a.equals(this.P0)) {
            this.T0 = s7Var;
            this.S0 = s7Var;
            this.U0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void M(s7 s7Var, float f7, float f10) {
        r7 r7Var = s7Var.e;
        r7 r7Var2 = s7Var.h;
        float[] L = L(r7Var.a, s7Var.f.a);
        float dist = Utilities.dist(f7, f10, L[0], L[1]);
        if (Float.isNaN(this.E0)) {
            this.E0 = dist;
            this.F0 = r7Var2.b;
        }
        if (Math.abs(dist - this.E0) > AndroidUtilities.dp(5.0f)) {
            r7 r7Var3 = s7Var.q;
            r7Var3.d = 700.0f;
            r7Var3.e = 1.0f;
            r7Var3.b = 1.0f;
        }
        float dp = AndroidUtilities.dp(32.0f) / U();
        float max = this.i0 ? (this.F0 * dist) / Math.max(1.0f, this.E0) : com.google.android.gms.internal.play_billing.k3.y(1.21f, dp, (dist - this.E0) / AndroidUtilities.dp(110.0f), this.F0);
        r7Var2.d = 900.0f;
        r7Var2.e = 1.0f;
        r7Var2.b = Math.max(dp, Math.min(1.21f, max));
        if (dist < AndroidUtilities.dp(14.0f)) {
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
        r7 r7Var4 = s7Var.i;
        r7Var4.d = 900.0f;
        r7Var4.e = 0.95f;
        if (z10) {
            f11 = round;
        }
        r7Var4.b = f11;
    }

    public final void O() {
        if (!this.b && this.Y0 > 0.0f && this.Z0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (s7 s7Var : this.f.values()) {
                boolean b10 = s7Var.b();
                String str = s7Var.a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", s7Var.e.b / this.Y0);
                        jSONObject.put("y", s7Var.f.b / this.Z0);
                        jSONObject.put("r", s7Var.i.b);
                        jSONObject.put("s", s7Var.h.b);
                        jSONObject.put("q", s7Var.N);
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

    public final float P(s7 s7Var) {
        return (((1.0f - (s7Var.q.a * 0.9f)) * s7Var.l.a * 0.04f) + 1.0f) * U() * s7Var.g.a * s7Var.h.a;
    }

    public final void Q() {
        if (this.d1 && this.f1 == 0) {
            if (!this.a1 && (this.p0 || !A())) {
                AndroidUtilities.runOnUIThread(this.g1, 1000L);
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
                s7 s7Var = (s7) obj;
                boolean b10 = s7Var.b();
                String str2 = s7Var.a;
                if (b10) {
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(y(a0(s7Var)));
                    sb2.append(';');
                    if (str2.equals(this.P0) && m(s7Var)) {
                        str = str2;
                    }
                }
            }
            if (a1.g.s(sb2, "bg:", str).equals(this.c1)) {
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
                s7 s7Var2 = (s7) obj2;
                boolean b11 = s7Var2.b();
                String str3 = s7Var2.a;
                if (b11) {
                    TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                    inputwalletcardsticker.nft_address = str3;
                    inputwalletcardsticker.coordinates = a0(s7Var2);
                    setcardstickers.stickers.add(inputwalletcardsticker);
                    if (str3.equals(this.P0) && m(s7Var2)) {
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
                s7 s7Var3 = (s7) this.f.get(inputwalletcardsticker3.nft_address);
                if (s7Var3 != null && s7Var3.b != null) {
                    TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                    cardsticker.nft = s7Var3.b;
                    cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                    cardVar2.stickers.add(cardsticker);
                    if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                        cardVar2.bg_nft_item = s7Var3.b;
                    }
                }
            }
            e0(currentAccount, cardVar2);
            this.f1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new org.telegram.messenger.a(), new dg(this, currentAccount, cardVar, 3));
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

    public final void S(g7 g7Var) {
        removeCallbacks(this.A1);
        this.s0 = true;
        this.p0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        g7Var.animate().cancel();
        g7Var.n(g7Var.getScaleX() * g7Var.y0);
        g7Var.setScaleX(1.0f);
        g7Var.setScaleY(1.0f);
        g7Var.m(1.0f, 150L, null);
        final s7 v = v(g7Var.w0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.s0 = false;
            return;
        }
        j80 I = j80.I(this.a, g7Var);
        I.s = 51;
        if (m(v) || str.equals(this.P0)) {
            final int i10 = 0;
            I.c(R.drawable.msg_colors, LocaleController.getString(str.equals(this.P0) ? R.string.WalletGiftRemoveColor : R.string.WalletGiftApplyColor), new Runnable(this) { // from class: org.telegram.ui.Wallet.k7
                public final /* synthetic */ t7 b;

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
                            t7 t7Var = this.b;
                            t7Var.getClass();
                            t7Var.b0(v.b);
                            break;
                    }
                }
            }, false);
        }
        final int i11 = 1;
        I.c(R.drawable.msg_sticker, LocaleController.getString(v.b() ? R.string.WalletGiftRemoveFromCard : R.string.WalletGiftAddToCard), new Runnable(this) { // from class: org.telegram.ui.Wallet.k7
            public final /* synthetic */ t7 b;

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
                        t7 t7Var = this.b;
                        t7Var.getClass();
                        t7Var.b0(v.b);
                        break;
                }
            }
        }, false);
        I.p = new l7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Y0 * 0.231f;
    }

    public final void V(s7 s7Var) {
        if (s7Var.a.equals(this.P0)) {
            l();
        }
        s7Var.N = false;
        g(s7Var);
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(s7 s7Var, float f7, float f10) {
        float[] fArr;
        this.h0 = null;
        this.m0 = true;
        boolean z10 = this.K0 == 2;
        this.o0 = z10;
        if (this.h1) {
            this.i1 = s7Var == this.k1 && !z10;
            this.j1 = false;
            this.h1 = false;
            MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z11 = s7Var.N;
        r7 r7Var = s7Var.m;
        r7 r7Var2 = s7Var.f;
        r7 r7Var3 = s7Var.e;
        if (z11) {
            s7Var.N = false;
            r7 r7Var4 = s7Var.h;
            r7Var4.d = 420.0f;
            r7Var4.e = 0.8f;
            r7Var4.b = 1.0f;
        }
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.t0 = false;
        if (this.o0) {
            fArr = L(r7Var3.a, r7Var2.a);
        } else {
            RectF Z = Z(s7Var);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            r7 r7Var5 = s7Var.g;
            r7Var5.d = 500.0f;
            r7Var5.e = 0.75f;
            r7Var5.a((f(s7Var) * Z.width()) / U());
            r7Var.a(0.0f);
            o5.h0((o5) this.d.c, 0L);
            fArr = fArr2;
        }
        r7Var3.d = 1100.0f;
        r7Var3.e = 0.9f;
        r7Var3.a(fArr[0]);
        r7Var2.d = 1100.0f;
        r7Var2.e = 0.9f;
        r7Var2.a(fArr[1]);
        s7Var.H = 3;
        long j11 = this.N0 + 1;
        this.N0 = j11;
        s7Var.I = j11;
        r7Var.b = 1.0f;
        r7 r7Var6 = s7Var.j;
        r7Var6.d = 320.0f;
        r7Var6.e = 0.75f;
        r7Var6.b = 1.0f;
        s7Var.l.a(0.0f);
        this.z0 = fArr[0] - f7;
        this.A0 = fArr[1] - f10;
        this.N.b = this.o0 ? 1.0f : 0.0f;
        performHapticFeedback(3);
    }

    public final void X(s7 s7Var, boolean z10) {
        this.S0 = this.T0;
        this.T0 = s7Var;
        this.U0 = 0.0f;
        this.X0 = z10;
        if (s7Var != null) {
            this.V0 = s7Var.e.b / this.Y0;
            this.W0 = s7Var.f.b / this.Z0;
        }
        f0();
    }

    public final void Y(d0 d0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = d0Var.a;
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
            s7 s7Var = (s7) it.next();
            int i11 = s7Var.H;
            String str = s7Var.a;
            if (i11 != 3) {
                ArrayList arrayList2 = d0Var.c;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && l0.a(nftitem.address, str)) {
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

    public final RectF Z(s7 s7Var) {
        g7 j10 = j(s7Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.v;
            x5.k(j10, matrix);
            Matrix matrix2 = this.w;
            x5.k(this, matrix2);
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

    public final TL_stories.TL_mediaAreaCoordinates a0(s7 s7Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * s7Var.h.b;
        tL_mediaAreaCoordinates.x = N((s7Var.e.b / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.y = N((s7Var.f.b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.w = N((U / this.Y0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.Z0) * 100.0f);
        float f7 = s7Var.i.b % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f7);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (A()) {
            s7 v = v(nftitem);
            if (v.b()) {
                if (this.d.O()) {
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

    public final void c0(s7 s7Var) {
        String str = s7Var.a;
        if (str.equals(this.P0)) {
            l();
            return;
        }
        if (m(s7Var)) {
            this.P0 = str;
            if (s7Var.b()) {
                X(s7Var, false);
                k();
            } else {
                this.Q0 = str;
                d0(s7Var);
                if (s7Var.H == 0) {
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
        s7 s7Var = null;
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
                s7Var = v(nftitem3);
            }
            this.S0 = s7Var;
            this.T0 = s7Var;
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
            s7 s7Var2 = (s7) obj;
            if (s7Var2.K && (i10 = s7Var2.H) != 3 && i10 != 4 && i10 != 5) {
                TL_wallet.cardSticker R = R(s7Var2.a);
                if (R != null) {
                    if (!s7Var2.b() || !y(a0(s7Var2)).equals(y(R.coordinates))) {
                        K(s7Var2, R.coordinates, s7Var2.N);
                    }
                } else if (s7Var2.b()) {
                    E(s7Var2);
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
                s7 s7Var3 = nftitem4 == null ? null : (s7) linkedHashMap.get(nftitem4.address);
                if (s7Var3 != null && s7Var3.H == 2) {
                    long j10 = this.N0 + 1;
                    this.N0 = j10;
                    s7Var3.I = j10;
                }
            }
        }
        if (!equals) {
            String str2 = this.P0;
            s7 s7Var4 = str2 == null ? null : (s7) linkedHashMap.get(str2);
            if (s7Var4 == null || !s7Var4.b()) {
                X(null, true);
            } else {
                X(s7Var4, false);
            }
        }
        this.e1 = false;
        O();
        f0();
    }

    public final void d0(s7 s7Var) {
        o5.h0((o5) this.d.c, 2600L);
        if (A()) {
            float[] x10 = x(s7Var, Float.NaN, Float.NaN, true);
            RectF Z = Z(s7Var);
            int i10 = 0;
            if (x10 == null || Z == null) {
                g7 j10 = j(s7Var);
                if (j10 != null) {
                    j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new j7(j10, i10)).start();
                    return;
                }
                return;
            }
            s7Var.g.a((f(s7Var) * Z.width()) / U());
            s7Var.m.a(0.0f);
            s7Var.j.a(1.0f);
            float[] fArr = {Z.centerX(), Z.centerY()};
            this.s.mapPoints(fArr);
            I(s7Var, fArr, x10, true);
            performHapticFeedback(3);
        }
    }

    public final void e() {
        float pow;
        s7 s7Var = this.S0;
        float[] i10 = h7.i(s7Var == null ? null : s7Var.t);
        s7 s7Var2 = this.T0;
        float[] i11 = h7.i(s7Var2 == null ? null : s7Var2.t);
        if (this.X0) {
            float f7 = this.U0;
            pow = com.google.android.gms.internal.play_billing.k3.B(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.U0, 4.0d));
        }
        float[] fArr = new float[18];
        System.arraycopy(new float[]{i10[0], i10[1], i10[2], i11[0], i11[1], i11[2], this.V0, this.W0, pow, this.X0 ? 1.0f : 0.0f}, 0, fArr, 0, 10);
        s7 s7Var3 = this.S0;
        h7.m(fArr, 0, s7Var3 == null ? null : s7Var3.t);
        s7 s7Var4 = this.T0;
        h7.m(fArr, 1, s7Var4 == null ? null : s7Var4.t);
        this.c.setStickerStyle(fArr);
    }

    public final float f(s7 s7Var) {
        g7 j10 = j(s7Var);
        if (j10 == null) {
            return 0.77f;
        }
        org.telegram.ui.Components.w9 w9Var = j10.y;
        if (j10.getWidth() <= 0 || w9Var.getWidth() <= 0) {
            return 0.77f;
        }
        return ((w9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
    }

    public final void f0() {
        if (this.a1 || !isAttachedToWindow()) {
            return;
        }
        o7 o7Var = this.C1;
        removeCallbacks(o7Var);
        postOnAnimation(o7Var);
    }

    public final void g(s7 s7Var) {
        s7Var.H = 0;
        s7Var.J = 0L;
        s7Var.g.a(1.0f);
        s7Var.h.a(1.0f);
        s7Var.i.a(0.0f);
        s7Var.m.a(0.0f);
        s7Var.j.a(0.0f);
        s7Var.k.a(0.0f);
        g7 j10 = j(s7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - AndroidUtilities.dp(64.0f)) - AndroidUtilities.navigationBarHeight;
    }

    public final void i(g7 g7Var) {
        ArrayList arrayList = this.h;
        if (!arrayList.contains(g7Var)) {
            arrayList.add(g7Var);
        }
        s7 v = v(g7Var.w0);
        g7Var.k(v.R, false, v.H == 0 ? 0.0f : 1.0f);
        f0();
    }

    public final g7 j(s7 s7Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g7 g7Var = (g7) obj;
            if (g7Var.isAttachedToWindow() && g7Var.w0.address.equals(s7Var.a)) {
                return g7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (this.b || this.e1) {
            return;
        }
        this.d1 = true;
        l7 l7Var = this.g1;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 1500L);
    }

    public final void l() {
        this.Q0 = null;
        this.P0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(s7 s7Var) {
        return b(s7Var) && F(this.a.getCurrentAccount(), s7Var.b.gift.slug);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.y1);
        getViewTreeObserver().addOnPreDrawListener(this.z1);
        for (s7 s7Var : this.f.values()) {
            s7Var.c.onAttachedToWindow();
            s7Var.d.onAttachedToWindow();
        }
        f0();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.y1);
        getViewTreeObserver().removeOnPreDrawListener(this.z1);
        removeCallbacks(this.C1);
        removeCallbacks(this.A1);
        for (s7 s7Var : this.f.values()) {
            s7Var.c.onDetachedFromWindow();
            s7Var.d.onDetachedFromWindow();
        }
        this.M0 = 0L;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        Rect rect;
        float f14;
        int i11;
        float f15;
        s7 s7Var;
        RectF rectF;
        ArrayList arrayList;
        r7 r7Var;
        t7 t7Var = this;
        Canvas canvas2 = canvas;
        if (t7Var.A()) {
            float f16 = t7Var.N.a;
            RectF rectF2 = t7Var.H;
            Paint paint = t7Var.x;
            if (f16 < 0.01f) {
                f10 = 0.0f;
                f11 = 2.0f;
                i10 = 0;
                f12 = 0.6f;
                f7 = 0.4f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, t7Var.O.a));
                float clamp01 = Utilities.clamp01(max);
                float dp = AndroidUtilities.dp(56.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                f7 = 0.4f;
                Paint paint2 = t7Var.G;
                paint2.setTextSize(dp2);
                float measureText = (((paint2.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(56.0f)) * max) + dp;
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate(t7Var.getWidth() / 2.0f, ((1.0f - f16) * AndroidUtilities.dp(90.0f)) + t7Var.h());
                float f17 = (f16 * 0.4f) + 0.6f;
                canvas2.scale(f17, f17);
                int i12 = org.telegram.ui.ActionBar.k6.d6;
                org.telegram.ui.ActionBar.o2 o2Var = t7Var.a;
                paint.setColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.k6.w0(i12, o2Var.getResourceProvider()), -1750963));
                paint.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                float f18 = (-measureText) / 2.0f;
                float f19 = measureText / 2.0f;
                rectF2.set(f18, -AndroidUtilities.dp(28.0f), f19, AndroidUtilities.dp(28.0f));
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), paint);
                float dp3 = (f18 + AndroidUtilities.dp(30.0f)) * clamp01;
                float dp4 = AndroidUtilities.dp(21.0f);
                int round = Math.round(t7Var.c0.a);
                f11 = 2.0f;
                yj0 yj0Var = t7Var.e0;
                yj0Var.N(round, false, false);
                float f20 = dp3 - dp4;
                i10 = 0;
                f12 = 0.6f;
                float f21 = -dp4;
                float f22 = dp3 + dp4;
                yj0Var.setBounds((int) f20, (int) f21, (int) f22, (int) dp4);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.f(clamp01, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, o2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint3 = t7Var.d0;
                paint3.setColorFilter(porterDuffColorFilter);
                paint3.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f20, f21, f22, dp4, paint3);
                yj0Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (clamp01 > 0.02f) {
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (Utilities.clamp01((clamp01 - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(AndroidUtilities.dp(22.0f) + dp3, -AndroidUtilities.dp(28.0f), f19 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(28.0f));
                    canvas2.drawText(LocaleController.getString(R.string.Remove), dp3 + AndroidUtilities.dp(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint2);
                    canvas2.restore();
                }
                canvas2.restore();
            }
            paint.setShader(null);
            paint.setColorFilter(null);
            paint.setAlpha(255);
            ArrayList G = t7Var.G();
            int size = G.size();
            int i13 = i10;
            while (i13 < size) {
                int i14 = i13 + 1;
                s7 s7Var2 = (s7) G.get(i13);
                r7 r7Var2 = s7Var2.e;
                r7 r7Var3 = s7Var2.i;
                float f23 = r7Var2.a;
                float f24 = s7Var2.f.a;
                float U = t7Var.U() * s7Var2.g.a * s7Var2.h.a;
                float f25 = s7Var2.j.a;
                int i15 = s7Var2.H;
                if (i15 == 1 && s7Var2.O && f25 > 0.3f) {
                    float[] L = t7Var.L(f23 + s7Var2.n.a, f24 + s7Var2.o.a);
                    float f26 = L[i10];
                    float f27 = L[1];
                    U = com.google.android.gms.internal.play_billing.k3.A(f25, 0.15f, 1.0f, U);
                    f13 = f27;
                    f23 = f26;
                } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                    f13 = f24;
                } else {
                    i13 = i14;
                }
                float f28 = U;
                Bitmap a2 = s7Var2.a();
                if (a2 == null) {
                    t7Var = this;
                } else if (f28 >= 1.0f) {
                    canvas2.save();
                    canvas2.rotate(r7Var3.a, f23, f13);
                    Paint paint4 = paint;
                    t7Var.t(canvas2, s7Var2, f23, (AndroidUtilities.dp(5.0f) * f25) + AndroidUtilities.dp(1.5f) + f13, com.google.android.gms.internal.play_billing.k3.A(f25, 0.04f, 1.0f, f28), f25, 0.0f, 1.0f);
                    canvas.restore();
                    float clamp012 = Utilities.clamp01(s7Var2.m.a);
                    if (s7Var2.H != 4 || s7Var2.W <= f12 || t7Var.j(s7Var2) == null) {
                        float f29 = f13;
                        ArrayList arrayList2 = G;
                        int i16 = size;
                        RectF rectF3 = rectF2;
                        canvas2 = canvas;
                        canvas2.save();
                        canvas2.rotate(r7Var3.a, f23, f29);
                        float f30 = f28 / f11;
                        rectF3.set(f23 - f30, f29 - f30, f23 + f30, f30 + f29);
                        if (clamp012 < 1.0f) {
                            paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                            rect = null;
                            canvas2.drawBitmap(s7Var2.v, (Rect) null, rectF3, paint4);
                        } else {
                            rect = null;
                        }
                        if (clamp012 > f10) {
                            paint4.setAlpha((int) (clamp012 * 255.0f));
                            canvas2.drawBitmap(a2, rect, rectF3, paint4);
                        }
                        paint4.setAlpha(255);
                        canvas2.restore();
                        paint = paint4;
                        rectF2 = rectF3;
                        i13 = i14;
                        G = arrayList2;
                        size = i16;
                        t7Var = this;
                    } else {
                        float clamp013 = Utilities.clamp01((s7Var2.W - f12) / f7);
                        float f31 = (1.0f - ((3.0f - (clamp013 * f11)) * (clamp013 * clamp013))) * 0.45f;
                        float clamp014 = (1.0f - (Utilities.clamp01(-s7Var2.V) * f12)) * 0.55f;
                        if (clamp012 < 1.0f) {
                            paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                            ArrayList arrayList3 = G;
                            r7Var = r7Var3;
                            f15 = f28;
                            arrayList = arrayList3;
                            i11 = size;
                            rectF = rectF2;
                            f14 = f13;
                            s7Var = s7Var2;
                            t7Var.r(canvas, s7Var2.v, f23, f14, f15, f31, clamp014, r7Var3.a, s7Var2.U, s7Var2.V);
                        } else {
                            f14 = f13;
                            i11 = size;
                            f15 = f28;
                            s7Var = s7Var2;
                            rectF = rectF2;
                            arrayList = G;
                            r7Var = r7Var3;
                        }
                        if (clamp012 > f10) {
                            paint4.setAlpha((int) (clamp012 * 255.0f));
                            canvas2 = canvas;
                            r(canvas2, a2, f23, f14, f15, f31, clamp014, r7Var.a, s7Var.U, s7Var.V);
                        } else {
                            canvas2 = canvas;
                        }
                        paint4.setAlpha(255);
                        paint = paint4;
                        rectF2 = rectF;
                        i13 = i14;
                        G = arrayList;
                        size = i11;
                        t7Var = this;
                    }
                }
                i13 = i14;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f0();
    }

    public final void p() {
        AndroidUtilities.removeFromParent(this.w1);
        AndroidUtilities.removeFromParent(this.x1);
        this.x1 = null;
        this.w1 = null;
        O();
        AndroidUtilities.cancelRunOnUIThread(this.g1);
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
        for (s7 s7Var : this.f.values()) {
            s7Var.c.onDetachedFromWindow();
            s7Var.d.onDetachedFromWindow();
        }
        this.h.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(s7 s7Var, float f7, float f10) {
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
                if (this.o0 && !z10 && Utilities.dist(f7, f10, getWidth() / 2.0f, h()) < AndroidUtilities.dp(78.0f)) {
                    z11 = true;
                }
                if (z11 != this.t0) {
                    performHapticFeedback(4);
                }
                this.t0 = z11;
                this.N.b = (this.o0 || z10) ? 0.0f : 1.0f;
                this.O.b = !z11 ? 1.0f : 0.0f;
                r7 r7Var = s7Var.e;
                if (z11) {
                    f11 = this.z0;
                } else {
                    float dp = AndroidUtilities.dp(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(dp);
                    f7 = (getWidth() / 2.0f) - ((paint.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) / 2.0f);
                    f11 = AndroidUtilities.dp(30.0f);
                }
                r7Var.b = f7 + f11;
                s7Var.f.b = !z11 ? h() - AndroidUtilities.dp(46.0f) : f10 + this.A0;
                RectF Z = Z(s7Var);
                float U2 = Z != null ? U() : Z.width();
                r7 r7Var2 = s7Var.g;
                if (z11) {
                    U = 1.24f * (z10 ? 1.0f : (U2 * 0.77f) / U());
                } else {
                    U = AndroidUtilities.dp(38.0f) / U();
                }
                r7Var2.b = U;
                if (this.o0) {
                    return;
                }
                r7 r7Var3 = s7Var.i;
                r7Var3.d = 260.0f;
                r7Var3.e = 0.9f;
                float f16 = r7Var3.a;
                r7Var3.b = c((z10 ? this.J0 : 0.0f) - f16) + f16;
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
        r7 r7Var4 = s7Var.e;
        if (z11) {
        }
        r7Var4.b = f7 + f11;
        s7Var.f.b = !z11 ? h() - AndroidUtilities.dp(46.0f) : f10 + this.A0;
        RectF Z2 = Z(s7Var);
        if (Z2 != null) {
        }
        r7 r7Var22 = s7Var.g;
        if (z11) {
        }
        r7Var22.b = U;
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
                canvas.drawBitmapMesh(bitmap, 14, 14, this.J, 0, this.K, 0, this.x);
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

    public final void s(Canvas canvas, s7 s7Var, float f7, float f10, boolean z10) {
        float f11;
        ImageReceiver imageReceiver = s7Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = s7Var.t;
        Bitmap bitmap = imageReceiver.getBitmap();
        if (bitmap == null || stargiftattributebackdrop == null) {
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
        Paint paint = this.x;
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
                float clamp01 = Utilities.clamp01(Math.min(Math.min(i12, 336 - i12), Math.min(i13, 205 - i13)) / 48.0f);
                float f21 = f15;
                float B = f7 * f19 * com.google.android.gms.internal.play_billing.k3.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
                if (f10 >= 0.0f) {
                    float clamp012 = Utilities.clamp01((f10 - Utilities.dist(f17, f18, this.V0 * this.Y0, this.W0 * this.Z0)) / AndroidUtilities.dp(120.0f));
                    if (z10) {
                        f20 = com.google.android.gms.internal.play_billing.k3.B(clamp012, 0.8f, 1.0f, f20);
                        B *= 1.0f - Utilities.clamp01(clamp012 * 1.6f);
                    } else {
                        f11 = f17;
                        f20 *= (((((float) Math.sin(clamp012 * 3.141592653589793d)) * 0.28f) + clamp012) * 0.8f) + 0.2f;
                        B *= Utilities.clamp01(clamp012 * 1.6f);
                        paint.setAlpha((int) (B * 255.0f));
                        float f22 = f20 / 2.0f;
                        RectF rectF = this.H;
                        rectF.set(f11 - f22, f18 - f22, f11 + f22, f18 + f22);
                        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
                        i13 += 37;
                        f14 = f19;
                        c10 = 0;
                        f15 = f21;
                    }
                }
                f11 = f17;
                paint.setAlpha((int) (B * 255.0f));
                float f222 = f20 / 2.0f;
                RectF rectF2 = this.H;
                rectF2.set(f11 - f222, f18 - f222, f11 + f222, f18 + f222);
                canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
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
        paint.setAlpha(255);
        canvas.restore();
    }

    public final void t(Canvas canvas, s7 s7Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.01f || s7Var.w == null) {
            return;
        }
        float f15 = (((0.05f * f12) + 1.0f) * ((f11 * 176.0f) / 128.0f)) / 2.0f;
        float f16 = f7 - f15;
        float f17 = f10 - f15;
        float f18 = f7 + f15;
        float f19 = f10 + f15;
        RectF rectF = this.H;
        rectF.set(f16, f17, f18, f19);
        Paint paint = this.x;
        int alpha = paint.getAlpha();
        paint.setColor(-16044452);
        paint.setAlpha((int) (Utilities.clamp01(s7Var.m.a) * Utilities.clamp01((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
        canvas.drawBitmap(s7Var.w, (Rect) null, rectF, paint);
        paint.setColor(-1);
        paint.setAlpha(alpha);
    }

    public final s7 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        s7 s7Var = (s7) linkedHashMap.get(str);
        if (s7Var == null) {
            s7Var = new s7(this, nftitem);
            linkedHashMap.put(nftitem.address, s7Var);
        }
        s7Var.b = nftitem;
        return s7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(float f7, float f10, boolean z10) {
        boolean z11;
        float[] fArr;
        boolean z12;
        float[] x10;
        getParent().requestDisallowInterceptTouchEvent(false);
        removeCallbacks(this.A1);
        removeCallbacks(this.B1);
        this.w0 = f10;
        if (this.m0) {
            o5 o5Var = (o5) this.d.c;
            float f11 = o5Var.H0;
            o3 o3Var = o5Var.J0;
            if (f11 > 0.0f) {
                AndroidUtilities.cancelRunOnUIThread(o3Var);
                AndroidUtilities.runOnUIThread(o3Var, 1650L);
            }
        }
        s7 s7Var = this.g0;
        if (s7Var != null) {
            ci.f3 f3Var = s7Var.c;
            r7 r7Var = s7Var.g;
            r7 r7Var2 = s7Var.i;
            r7 r7Var3 = s7Var.f;
            r7 r7Var4 = s7Var.e;
            g7 j10 = j(s7Var);
            if (j10 != null) {
                j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
            }
            if (this.m0) {
                Matrix matrix = this.s;
                if (z10 && this.K0 == 2) {
                    float[] fArr2 = {r7Var4.a, r7Var3.a};
                    matrix.mapPoints(fArr2);
                    r7 r7Var5 = s7Var.h;
                    float f12 = this.I0;
                    r7Var5.b = f12;
                    r7Var2.b = this.J0;
                    I(s7Var, fArr2, new float[]{this.G0, this.H0, f12}, false);
                } else if (z10) {
                    E(s7Var);
                } else if (this.t0) {
                    s7Var.H = 5;
                    long j11 = this.N0 + 1;
                    this.N0 = j11;
                    s7Var.I = j11;
                    s7Var.J = 0L;
                    this.f0 = true;
                    r7 r7Var6 = this.c0;
                    r7Var6.a(Math.max(30.0f, r7Var6.a));
                    r7Var4.d = 500.0f;
                    r7Var4.e = 0.9f;
                    float dp = AndroidUtilities.dp(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(dp);
                    r7Var4.b = ((getWidth() / 2.0f) - ((paint.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) / 2.0f)) + AndroidUtilities.dp(30.0f);
                    r7Var3.d = 500.0f;
                    r7Var3.e = 0.9f;
                    r7Var3.b = h();
                    r7Var.d = 240.0f;
                    r7Var.e = 0.95f;
                    r7Var.b = 0.0f;
                    s7Var.j.b = 0.0f;
                    r7Var2.b = 0.0f;
                    if (s7Var.a.equals(this.P0)) {
                        l();
                    }
                    performHapticFeedback(16);
                } else {
                    float[] fArr3 = {r7Var4.a, r7Var3.a};
                    matrix.mapPoints(fArr3);
                    float f13 = fArr3[0];
                    if (f13 >= 0.0f && f13 <= this.Y0) {
                        float f14 = fArr3[1];
                        if (f14 >= 0.0f && f14 <= this.Z0) {
                            z11 = true;
                            if (this.o0) {
                                fArr = fArr3;
                                if (((float) Math.hypot(f7, f10)) > AndroidUtilities.dp(700.0f) && (z11 || f10 < (-AndroidUtilities.dp(600.0f)))) {
                                    z12 = true;
                                    x10 = z11 ? x(s7Var, fArr[0], fArr[1], false) : null;
                                    if (z12) {
                                        x10 = x(s7Var, Math.max(0.0f, Math.min(this.Y0, (f7 * 0.08f) + fArr[0])), Math.max(0.0f, Math.min(this.Z0, (f10 * 0.08f) + fArr[1])), true);
                                    }
                                    if (x10 != null) {
                                        I(s7Var, fArr, x10, false);
                                    } else {
                                        E(s7Var);
                                    }
                                    if (x10 != null) {
                                        s7Var.P = z12;
                                        if (z12) {
                                            r7Var4.d = 260.0f;
                                            r7Var4.e = 0.8f;
                                            r7Var3.d = 260.0f;
                                            r7Var3.e = 0.8f;
                                        }
                                    }
                                }
                            } else {
                                fArr = fArr3;
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
                    z11 = false;
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
                r7 r7Var7 = s7Var.l;
                r7Var7.d = 380.0f;
                r7Var7.e = 0.62f;
                r7Var7.b = 0.0f;
                r7Var2.a = c(r7Var2.a);
                r7Var2.b = c(r7Var2.b);
            } else if (!z10) {
                if (this.u0) {
                    this.h0 = s7Var;
                    r7Var.c += 3.0f;
                    long j12 = this.N0 + 1;
                    this.N0 = j12;
                    s7Var.I = j12;
                    s7Var.S = true;
                    s7Var.T = false;
                    f3Var.setAllowStartLottieAnimation(true);
                    f3Var.startAnimation();
                    performHapticFeedback(3);
                } else {
                    ((o5) this.a).C0(s7Var.b);
                }
            }
        }
        VelocityTracker velocityTracker = this.O0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O0 = null;
        }
        if (s7Var != null && (this.m0 || this.n0 || this.i0)) {
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

    public final float[] x(s7 s7Var, float f7, float f10, boolean z10) {
        float f11;
        float f12;
        float f13;
        ArrayList arrayList;
        float nextFloat;
        if (!z10) {
            s7Var.N = false;
            return new float[]{f7, f10, s7Var.h.b};
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
        float dp = AndroidUtilities.dp(32.0f) / U();
        float f16 = s7Var.h.b;
        s7Var.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (s7 s7Var2 : this.f.values()) {
            if (s7Var2 != s7Var && s7Var2.b()) {
                arrayList2.add(s7Var2);
            }
        }
        boolean z11 = (Float.isNaN(f7) || Float.isNaN(f10)) ? false : true;
        if (!z11 && s7Var == this.k1 && this.m1 != null && arrayList2.isEmpty()) {
            return (float[]) this.m1.clone();
        }
        if (z11) {
            f11 = f7;
            f12 = f10;
        } else {
            f11 = this.Y0 * 0.6f;
            f12 = this.Z0 * 0.68f;
        }
        Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (s7Var.a.hashCode() * 7919));
        float d = org.telegram.ui.Cells.b1.d(random, 0.04f, 0.05f);
        float f17 = 0.5f;
        float nextFloat2 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Y0;
        float nextFloat3 = this.Z0 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float U = U() * dp * 0.5f;
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
                    float f23 = d;
                    float min2 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * d)) * f16, min / (U() * f20));
                    int size2 = stickerObstacles.size();
                    float f24 = dp;
                    float f25 = f16;
                    int i11 = 0;
                    float f26 = Float.MAX_VALUE;
                    while (i11 < size2) {
                        ArrayList<RectF> arrayList3 = stickerObstacles;
                        RectF rectF2 = stickerObstacles.get(i11);
                        f26 = Math.min(f26, Utilities.dist(f21, f19, Math.max(rectF2.left, Math.min(rectF2.right, f21)), Math.max(rectF2.top, Math.min(rectF2.bottom, f19))));
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
                        s7 s7Var3 = (s7) obj;
                        min3 = Math.min(min3, (Utilities.dist(f21, f19, s7Var3.e.b, s7Var3.f.b) / (U() * 0.29f)) - s7Var3.h.b);
                    }
                    float clamp01 = ((Utilities.clamp01((min - ((U() * f20) * min3)) / AndroidUtilities.dp(14.0f)) * 0.1f) + 0.9f) * min3;
                    if (clamp01 < f24) {
                        arrayList = arrayList2;
                    } else {
                        if (arrayList2.isEmpty()) {
                            float f27 = this.Y0 * 0.6f;
                            float y3 = com.google.android.gms.internal.play_billing.k3.y(f11, f27, 0.2f, f27);
                            float f28 = this.Z0 * 0.68f;
                            nextFloat = (random.nextFloat() * AndroidUtilities.dp(5.0f)) + (U() * 1.1f * clamp01) + (Utilities.dist(f21, f19, y3, com.google.android.gms.internal.play_billing.k3.y(f12, f28, 0.2f, f28)) * (-0.45f));
                            f13 = clamp01;
                            arrayList = arrayList2;
                        } else {
                            float f29 = f19 * clamp01 * clamp01;
                            float f30 = clamp01 * clamp01;
                            int size4 = arrayList2.size();
                            float f31 = f21 * clamp01 * clamp01;
                            int i13 = 0;
                            float f32 = Float.MAX_VALUE;
                            float f33 = 0.0f;
                            while (i13 < size4) {
                                Object obj2 = arrayList2.get(i13);
                                int i14 = i13 + 1;
                                s7 s7Var4 = (s7) obj2;
                                float f34 = clamp01;
                                r7 r7Var = s7Var4.e;
                                int i15 = size4;
                                r7 r7Var2 = s7Var4.h;
                                ArrayList arrayList5 = arrayList2;
                                r7 r7Var3 = s7Var4.f;
                                f32 = Math.min(f32, Utilities.dist(f21, f19, r7Var.b, r7Var3.b) - ((r7Var2.b + f34) * (U() * 0.4f)));
                                float f35 = r7Var2.b;
                                float f36 = f35 * f35;
                                float f37 = s7Var4.e.b;
                                f31 = (f37 * f36) + f31;
                                f29 = (r7Var3.b * f36) + f29;
                                f30 += f36;
                                f33 = Math.max(0.0f, 1.0f - (Math.abs(r7Var3.b - f19) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f37 - f21) / (U() * 0.12f))) + f33;
                                clamp01 = f34;
                                i13 = i14;
                                size4 = i15;
                                arrayList2 = arrayList5;
                            }
                            f13 = clamp01;
                            arrayList = arrayList2;
                            nextFloat = ((random.nextFloat() * AndroidUtilities.dp(10.0f)) + (((((Math.min(Math.min(min, f26), U()) * 0.2f) + ((U() * (f13 * 0.9f)) + ((f32 < 0.0f ? f32 * 2.5f : Math.min(f32, U() * 0.3f)) * 1.2f))) - (Utilities.dist(f31 / f30, f29 / f30, nextFloat2, nextFloat3) * 0.35f)) - ((U() * f33) * 0.08f)) - (Utilities.dist(f21, f19, this.Y0 * f20, this.Z0 * 0.55f) * 0.04f))) - (z12 ? Utilities.dist(f21, f19, f11, f12) * 0.04f : 0.0f);
                        }
                        if (nextFloat > f18) {
                            f18 = nextFloat;
                            fArr = new float[]{f21, f19, f13};
                            f21 += AndroidUtilities.dp(5.0f);
                            d = f23;
                            dp = f24;
                            f16 = f25;
                            stickerObstacles = arrayList4;
                            z11 = z12;
                            arrayList2 = arrayList;
                        }
                    }
                    f21 += AndroidUtilities.dp(5.0f);
                    d = f23;
                    dp = f24;
                    f16 = f25;
                    stickerObstacles = arrayList4;
                    z11 = z12;
                    arrayList2 = arrayList;
                }
            }
            f19 += AndroidUtilities.dp(5.0f);
            f17 = f20;
            d = d;
        }
        return fArr;
    }

    public final boolean z(g7 g7Var) {
        if (!g7Var.isShown()) {
            return false;
        }
        Rect rect = this.F1;
        return g7Var.getGlobalVisibleRect(rect) && rect.width() >= g7Var.getWidth() - 1 && rect.height() >= g7Var.getHeight() - 1;
    }
}
