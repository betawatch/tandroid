package org.telegram.ui.Wallet;

import android.content.Context;
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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.eg;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class w7 extends View {
    public static final /* synthetic */ int B1 = 0;
    public float A0;
    public final Rect A1;
    public float B0;
    public float C0;
    public float D0;
    public final RectF E;
    public float E0;
    public final Paint F;
    public int F0;
    public final Paint G;
    public boolean G0;
    public final RectF H;
    public long H0;
    public final Path I;
    public long I0;
    public final float[] J;
    public VelocityTracker J0;
    public final int[] K;
    public String K0;
    public final q7 L;
    public String L0;
    public final p7 M;
    public long M0;
    public final u7 N;
    public v7 N0;
    public final u7 O;
    public v7 O0;
    public final u7 P;
    public float P0;
    public final u7 Q;
    public float Q0;
    public final u7 R;
    public float R0;
    public final ArrayList S;
    public boolean S0;
    public final Path T;
    public float T0;
    public final Paint U;
    public float U0;
    public final LinearGradient V;
    public boolean V0;
    public final Matrix W;
    public TL_wallet.card W0;
    public String X0;
    public boolean Y0;
    public boolean Z0;
    public final org.telegram.ui.ActionBar.n2 a;
    public float a0;
    public int a1;
    public final boolean b;
    public float b0;
    public final o7 b1;
    public final v5 c;
    public final u7 c0;
    public boolean c1;
    public final n2.e d;
    public final Paint d0;
    public boolean d1;
    public final SharedPreferences e;
    public final uj0 e0;
    public boolean e1;
    public final LinkedHashMap f;
    public boolean f0;
    public v7 f1;
    public v7 g0;
    public j7 g1;
    public final ArrayList h;
    public boolean h0;
    public float[] h1;
    public boolean i0;
    public float i1;
    public boolean j0;
    public final float[] j1;
    public boolean k0;
    public final u7 k1;
    public boolean l0;
    public final u7 l1;
    public boolean m0;
    public final Paint m1;
    public final ArrayList n;
    public boolean n0;
    public final Paint n1;
    public boolean o0;
    public final Matrix o1;
    public boolean p0;
    public final Path p1;
    public int q0;
    public final RectF q1;
    public final Matrix r;
    public float r0;
    public ei.x3 r1;
    public final Matrix s;
    public float s0;
    public ei.x3 s1;
    public float t0;
    public final o1 t1;
    public float u0;
    public final x4 u1;
    public final Matrix v;
    public float v0;
    public final o7 v1;
    public final Matrix w;
    public float w0;
    public final o7 w1;
    public final Paint x;
    public float x0;
    public final r7 x1;
    public final Paint y;
    public float y0;
    public final RectF y1;
    public float z0;
    public final Paint z1;

    public w7(org.telegram.ui.ActionBar.n2 n2Var, v5 v5Var, n2.e eVar, TL_wallet.card cardVar) {
        super(n2Var.getContext());
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
        this.N = new u7(0.0f, 260.0f, 0.78f);
        this.O = new u7(0.0f, 420.0f, 0.72f);
        this.P = new u7(1.0f, 420.0f, 0.38f);
        this.Q = new u7(0.0f, 170.0f, 0.42f);
        this.R = new u7(0.0f, 170.0f, 0.42f);
        this.S = new ArrayList();
        this.T = new Path();
        Paint paint3 = new Paint(1);
        this.U = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.V = linearGradient;
        this.W = new Matrix();
        this.c0 = new u7(0.0f, 120.0f, 1.0f);
        this.d0 = new Paint(1);
        this.P0 = 1.0f;
        this.Q0 = 0.5f;
        this.R0 = 0.5f;
        this.b1 = new o7(this, i10);
        this.j1 = new float[3];
        this.k1 = new u7(0.0f, 260.0f, 1.0f);
        this.l1 = new u7(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.m1 = paint4;
        Paint paint5 = new Paint(1);
        this.n1 = paint5;
        this.o1 = new Matrix();
        this.p1 = new Path();
        this.q1 = new RectF();
        this.t1 = new o1(this, i10);
        int i11 = 2;
        this.u1 = new x4(i11, this);
        this.v1 = new o7(this, i11);
        this.w1 = new o7(this, 3);
        this.x1 = new r7(this);
        this.y1 = new RectF();
        Paint paint6 = new Paint(1);
        this.z1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A1 = new Rect();
        this.a = n2Var;
        int i12 = 0;
        boolean z10 = cardVar != null;
        this.b = z10;
        uj0 uj0Var = new uj0(R.raw.wallet_gift_trash, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.e0 = uj0Var;
        uj0Var.R(this);
        this.c = v5Var;
        this.d = eVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z10) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + n2Var.getCurrentAccount() + "_" + m0.w(n2Var.getCurrentAccount()).s(), 0);
        }
        this.e = sharedPreferences;
        this.K0 = z10 ? null : sharedPreferences.getString("style", null);
        this.c1 = (z10 || MessagesController.getGlobalMainSettings().getBoolean("walletcardstickerhint", false)) ? false : true;
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
        p7 p7Var = new p7(this, getContext());
        this.M = p7Var;
        q7 q7Var = new q7(this, getContext());
        this.L = q7Var;
        v5Var.getFrontFace().addView(p7Var, 0, w7.z5.d(-1.0f, -1));
        v5Var.getFrontFace().addView(q7Var, v5Var.getStickerLayerIndex(), w7.z5.d(-1.0f, -1));
        if (z10) {
            q7Var.addOnLayoutChangeListener(new l7(this, i12));
            d(cardVar);
            return;
        }
        int currentAccount = n2Var.getCurrentAccount();
        MessagesController messagesController = MessagesController.getInstance(currentAccount);
        long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
        TLRPC.UserFull userFull = messagesController.getUserFull(clientUserId);
        if (userFull == null) {
            messagesController.loadFullUser(messagesController.getUser(Long.valueOf(clientUserId)), 0, true, new l(this, 4));
        } else {
            TL_wallet.card cardVar2 = userFull.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
        }
    }

    public static String A(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        return mediaAreaCoordinates == null ? "" : String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public static boolean H(int i10, String str) {
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

    public static Path L(v7 v7Var) {
        Bitmap bitmap;
        int i10;
        int i11;
        boolean z10;
        int i12;
        if (v7Var == null || v7Var.F != null || (bitmap = v7Var.u) == null) {
            if (v7Var == null) {
                return null;
            }
            return v7Var.F;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
        int[] iArr = new int[16384];
        createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
        if (createScaledBitmap != v7Var.u) {
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
        v7Var.F = path;
        return path;
    }

    public static void N(ei.x3 x3Var, float f7, float f10) {
        o(x3Var, 3);
        x3Var.m(0.0f, f7 - x3Var.getPaddingLeft());
        x3Var.setTranslationY(f10 - x3Var.getLayoutParams().height);
        x3Var.invalidate();
    }

    public static double Q(float f7) {
        return Math.round(f7 * 100.0f) / 100.0d;
    }

    public static String V(TL_wallet.card cardVar) {
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
                    sb2.append(A(cardsticker2.coordinates));
                    sb2.append(';');
                }
            }
        }
        sb2.append("bg:");
        TL_wallet.nftItem nftitem2 = cardVar.bg_nft_item;
        sb2.append(nftitem2 == null ? null : nftitem2.address);
        return sb2.toString();
    }

    public static boolean b(v7 v7Var) {
        TL_wallet.nftItem nftitem;
        return (v7Var == null || (nftitem = v7Var.b) == null || nftitem.gift == null) ? false : true;
    }

    public static float c(float f7) {
        float f10 = f7 % 360.0f;
        if (f10 > 180.0f) {
            f10 -= 360.0f;
        }
        return f10 < -180.0f ? f10 + 360.0f : f10;
    }

    public static void g0(int i10, TL_wallet.card cardVar) {
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
        return com.google.android.gms.internal.cast.a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public final boolean B(j7 j7Var) {
        if (!j7Var.isShown()) {
            return false;
        }
        Rect rect = this.A1;
        return j7Var.getGlobalVisibleRect(rect) && rect.width() >= j7Var.getWidth() - 1 && rect.height() >= j7Var.getHeight() - 1;
    }

    public final boolean C() {
        v5 v5Var = this.c;
        this.T0 = v5Var.getFrontFace().getWidth();
        float height = v5Var.getFrontFace().getHeight();
        this.U0 = height;
        if (this.T0 <= 0.0f || height <= 0.0f) {
            return false;
        }
        Matrix matrix = this.r;
        return v5Var.i(this, matrix) && matrix.invert(this.s);
    }

    public final ei.x3 D(int i10, boolean z10) {
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

    public final boolean E() {
        Path L = this.h1 == null ? null : L(this.f1);
        if (L == null) {
            return false;
        }
        float W = W() * this.h1[2];
        Matrix matrix = this.o1;
        matrix.setScale(W, W);
        float[] fArr = this.h1;
        matrix.postTranslate(fArr[0], fArr[1]);
        L.transform(matrix, this.p1);
        return true;
    }

    public final float[] F(float f7) {
        float u10 = (u(f7, 0.45f, 0.82f) - u(f7, 1.3f, 1.72f)) * 0.9f;
        float[] fArr = this.j1;
        fArr[0] = u10;
        fArr[1] = (((float) Math.sin(Utilities.clamp01((f7 - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f7, 0.6f, 0.92f) - u(f7, 1.18f, 1.46f));
        fArr[2] = u(f7, 1.58f, 1.7f) - u(f7, 1.7f, 1.92f);
        return fArr;
    }

    public final void G(v7 v7Var) {
        v7Var.J = 0L;
        u7 u7Var = v7Var.h;
        u7 u7Var2 = v7Var.f;
        u7 u7Var3 = v7Var.e;
        if (v7Var.a.equals(this.K0)) {
            l();
        }
        if (v7Var.b()) {
            float[] P = P(u7Var3.a, u7Var2.a);
            u7Var3.a(P[0]);
            u7Var2.a(P[1]);
        }
        v7Var.H = 4;
        v7Var.W = 0.0f;
        v7Var.X = u7Var3.a;
        v7Var.Y = u7Var2.a;
        v7Var.Z = v7Var.g.a * u7Var.a;
        v7Var.a0 = v7Var.i.a;
        v7Var.b0 = this.r0 > ((float) AndroidUtilities.dp(650.0f)) ? 0.32f : 0.44f;
        this.r0 = 0.0f;
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.n();
        }
        v7Var.c0 = j10 != null ? j10.getScaleX() : 1.0f;
        RectF b02 = b0(v7Var);
        if (b02 != null) {
            float centerX = b02.centerX() - v7Var.X;
            float centerY = b02.centerY() - v7Var.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            v7Var.U = hypot > ((float) AndroidUtilities.dp(6.0f)) ? centerX / hypot : 0.0f;
            v7Var.V = hypot > ((float) AndroidUtilities.dp(6.0f)) ? centerY / hypot : 1.0f;
        }
        v7Var.l.a(0.0f);
        u7Var.a(1.0f);
        long j11 = this.I0 + 1;
        this.I0 = j11;
        v7Var.I = j11;
        R();
        h0();
    }

    public final float[] I(v7 v7Var, float f7, float f10, ArrayList arrayList) {
        float dp = AndroidUtilities.dp(32.0f) / W();
        float f11 = v7Var.h.b;
        for (float f12 = f11; f12 >= dp - 0.001f; f12 -= 0.06f) {
            float[] w9 = w(v7Var, f7, f10, f12, arrayList);
            if (w9 != null && Utilities.dist(w9[0], w9[1], f7, f10) <= AndroidUtilities.dp(26.0f)) {
                return w9;
            }
        }
        return w(v7Var, f7, f10, f11, arrayList);
    }

    public final ArrayList J() {
        ArrayList<RectF> stickerObstacles = this.c.getStickerObstacles();
        float f7 = this.T0 * 0.012f;
        int size = stickerObstacles.size();
        int i10 = 0;
        while (i10 < size) {
            RectF rectF = stickerObstacles.get(i10);
            i10++;
            float f10 = -f7;
            rectF.inset(f10, f10);
        }
        stickerObstacles.get(2).left -= this.T0 * 0.035f;
        return stickerObstacles;
    }

    public final ArrayList K() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new org.telegram.ui.Components.x0(2)));
        return arrayList;
    }

    public final void M(v7 v7Var, float[] fArr, float[] fArr2, boolean z10) {
        long j10 = v7Var.J;
        u7 u7Var = v7Var.o;
        u7 u7Var2 = v7Var.n;
        if (j10 == 0) {
            long j11 = this.M0 + 1;
            this.M0 = j11;
            v7Var.J = j11;
            ArrayList arrayList = new ArrayList();
            for (v7 v7Var2 : this.f.values()) {
                if (v7Var2 != v7Var && v7Var2.b()) {
                    arrayList.add(v7Var2);
                }
            }
            if (arrayList.size() >= 10) {
                List.-EL.sort(arrayList, Comparator$-CC.comparingLong(new org.telegram.ui.Components.x0(3)));
                for (int i10 = 0; i10 <= arrayList.size() - 10; i10++) {
                    v7 v7Var3 = (v7) arrayList.get(i10);
                    if (this.d.O()) {
                        G(v7Var3);
                    } else {
                        X(v7Var3);
                    }
                }
                k();
            }
        }
        v7Var.H = 1;
        v7Var.Q = false;
        v7Var.M = false;
        v7Var.L = false;
        v7Var.P = z10;
        v7Var.O = z10;
        long j12 = this.I0 + 1;
        this.I0 = j12;
        v7Var.I = j12;
        u7Var2.a(0.0f);
        u7Var.a(0.0f);
        u7 u7Var3 = v7Var.e;
        float f7 = z10 ? 150.0f : 500.0f;
        float f10 = z10 ? 0.82f : 1.0f;
        u7Var3.d = f7;
        u7Var3.e = f10;
        u7Var3.a(fArr[0]);
        u7Var3.b = fArr2[0];
        u7 u7Var4 = v7Var.f;
        float f11 = z10 ? 150.0f : 500.0f;
        float f12 = z10 ? 0.82f : 1.0f;
        u7Var4.d = f11;
        u7Var4.e = f12;
        u7Var4.a(fArr[1]);
        float f13 = fArr2[1];
        u7Var4.b = f13;
        v7Var.h.b = fArr2[2];
        u7 u7Var5 = v7Var.g;
        u7Var5.d = 300.0f;
        u7Var5.e = 0.5f;
        u7Var5.b = 1.0f;
        u7 u7Var6 = v7Var.j;
        u7Var6.d = z10 ? 110.0f : 150.0f;
        u7Var6.e = 0.9f;
        u7Var6.b = 0.0f;
        v7Var.m.b = 1.0f;
        v7Var.l.b = 0.0f;
        float f14 = fArr2[0] - fArr[0];
        float f15 = f13 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f14, f15));
        v7Var.U = max > ((float) AndroidUtilities.dp(6.0f)) ? f14 / max : 0.0f;
        v7Var.V = max > ((float) AndroidUtilities.dp(6.0f)) ? f15 / max : 1.0f;
        u7 u7Var7 = v7Var.k;
        u7Var7.a(0.9f);
        u7Var7.b = 0.0f;
        if (z10) {
            float min = Math.min(AndroidUtilities.dp(110.0f), 0.32f * max);
            float f16 = f14 >= 0.0f ? -1.0f : 1.0f;
            u7Var2.a(0.0f);
            u7Var2.c = ((-f15) / max) * min * f16 * 20.0f;
            u7Var.a(0.0f);
            u7Var.c = com.google.android.gms.internal.cast.a6.B(min, 0.5f, (f14 / max) * min * f16, 20.0f);
        }
        R();
        h0();
    }

    public final void O(v7 v7Var, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z10) {
        v7Var.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        v7Var.i.a(c((float) mediaAreaCoordinates.rotation));
        v7Var.N = z10;
        v7Var.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.T0);
        v7Var.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.U0);
        v7Var.g.a(1.0f);
        v7Var.j.a(0.0f);
        v7Var.k.a(0.0f);
        v7Var.n.a(0.0f);
        v7Var.o.a(0.0f);
        v7Var.l.a(0.0f);
        v7Var.H = 2;
        long j10 = this.I0 + 1;
        this.I0 = j10;
        v7Var.I = j10;
        v7Var.m.a(1.0f);
        if (v7Var.J == 0) {
            long j11 = this.M0 + 1;
            this.M0 = j11;
            v7Var.J = j11;
        }
        if (v7Var.a.equals(this.K0)) {
            this.O0 = v7Var;
            this.N0 = v7Var;
            this.P0 = 1.0f;
            e();
        }
    }

    public final float[] P(float f7, float f10) {
        float[] fArr = {f7, f10};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void R() {
        if (!this.b && this.T0 > 0.0f && this.U0 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (v7 v7Var : this.f.values()) {
                boolean b10 = v7Var.b();
                String str = v7Var.a;
                if (b10) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", v7Var.e.b / this.T0);
                        jSONObject.put("y", v7Var.f.b / this.U0);
                        jSONObject.put("r", v7Var.i.b);
                        jSONObject.put("s", v7Var.h.b);
                        jSONObject.put("q", v7Var.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.K0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final void S() {
        if (this.Y0 && this.a1 == 0) {
            if (!this.V0 && (this.k0 || !C())) {
                AndroidUtilities.runOnUIThread(this.b1, 1000L);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList K = K();
            int size = K.size();
            int i10 = 0;
            String str = null;
            int i11 = 0;
            while (i11 < size) {
                Object obj = K.get(i11);
                i11++;
                v7 v7Var = (v7) obj;
                boolean b10 = v7Var.b();
                String str2 = v7Var.a;
                if (b10) {
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(A(c0(v7Var)));
                    sb2.append(';');
                    if (str2.equals(this.K0) && m(v7Var)) {
                        str = str2;
                    }
                }
            }
            if (a1.g.s(sb2, "bg:", str).equals(this.X0)) {
                this.Y0 = false;
                return;
            }
            TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
            ArrayList K2 = K();
            int size2 = K2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = K2.get(i12);
                i12++;
                v7 v7Var2 = (v7) obj2;
                boolean b11 = v7Var2.b();
                String str3 = v7Var2.a;
                if (b11) {
                    TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                    inputwalletcardsticker.nft_address = str3;
                    inputwalletcardsticker.coordinates = c0(v7Var2);
                    setcardstickers.stickers.add(inputwalletcardsticker);
                    if (str3.equals(this.K0) && m(v7Var2)) {
                        setcardstickers.bg_nft_address = str3;
                    }
                }
            }
            this.Y0 = false;
            int currentAccount = this.a.getCurrentAccount();
            TL_wallet.card cardVar = this.W0;
            TL_wallet.card cardVar2 = new TL_wallet.card();
            TL_wallet.card cardVar3 = this.W0;
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
                v7 v7Var3 = (v7) this.f.get(inputwalletcardsticker3.nft_address);
                if (v7Var3 != null && v7Var3.b != null) {
                    TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                    cardsticker.nft = v7Var3.b;
                    cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                    cardVar2.stickers.add(cardsticker);
                    if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                        cardVar2.bg_nft_item = v7Var3.b;
                    }
                }
            }
            g0(currentAccount, cardVar2);
            this.a1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new org.telegram.messenger.a(), new eg(this, currentAccount, cardVar, 3));
        }
    }

    public final TL_wallet.cardSticker T(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.W0;
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

    public final void U(j7 j7Var) {
        removeCallbacks(this.v1);
        this.n0 = true;
        this.k0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        j7Var.animate().cancel();
        j7Var.m(j7Var.getScaleX() * j7Var.q0);
        j7Var.setScaleX(1.0f);
        j7Var.setScaleY(1.0f);
        j7Var.l(1.0f, 150L, null);
        final v7 v = v(j7Var.o0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.n0 = false;
            return;
        }
        i80 I = i80.I(this.a, j7Var);
        I.s = 51;
        if (b(v) || str.equals(this.K0)) {
            final int i10 = 0;
            I.c(R.drawable.msg_colors, LocaleController.getString(str.equals(this.K0) ? R.string.WalletGiftRemoveColor : R.string.WalletGiftApplyColor), new Runnable(this) { // from class: org.telegram.ui.Wallet.n7
                public final /* synthetic */ w7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            w7 w7Var = this.b;
                            org.telegram.ui.ActionBar.n2 n2Var = w7Var.a;
                            v7 v7Var = v;
                            if (!v7Var.a.equals(w7Var.K0) && !w7Var.m(v7Var)) {
                                Context context = w7Var.getContext();
                                int currentAccount = n2Var.getCurrentAccount();
                                xc a02 = xc.a0(n2Var);
                                org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
                                TL_stars.StarGift starGift = v7Var.b.gift;
                                ai.k7.K2(context, currentAccount, a02, resourceProvider, starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null);
                                break;
                            } else {
                                w7Var.e0(v7Var);
                                break;
                            }
                            break;
                        default:
                            w7 w7Var2 = this.b;
                            w7Var2.getClass();
                            w7Var2.d0(v.b);
                            break;
                    }
                }
            }, false);
        }
        final int i11 = 1;
        I.c(R.drawable.msg_sticker, LocaleController.getString(v.b() ? R.string.WalletGiftRemoveFromCard : R.string.WalletGiftAddToCard), new Runnable(this) { // from class: org.telegram.ui.Wallet.n7
            public final /* synthetic */ w7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        w7 w7Var = this.b;
                        org.telegram.ui.ActionBar.n2 n2Var = w7Var.a;
                        v7 v7Var = v;
                        if (!v7Var.a.equals(w7Var.K0) && !w7Var.m(v7Var)) {
                            Context context = w7Var.getContext();
                            int currentAccount = n2Var.getCurrentAccount();
                            xc a02 = xc.a0(n2Var);
                            org.telegram.ui.ActionBar.d6 resourceProvider = n2Var.getResourceProvider();
                            TL_stars.StarGift starGift = v7Var.b.gift;
                            ai.k7.K2(context, currentAccount, a02, resourceProvider, starGift instanceof TL_stars.TL_starGiftUnique ? (TL_stars.TL_starGiftUnique) starGift : null);
                            break;
                        } else {
                            w7Var.e0(v7Var);
                            break;
                        }
                        break;
                    default:
                        w7 w7Var2 = this.b;
                        w7Var2.getClass();
                        w7Var2.d0(v.b);
                        break;
                }
            }
        }, false);
        I.p = new o7(this, 0);
        I.Z();
        performHapticFeedback(0);
    }

    public final float W() {
        return this.T0 * 0.231f;
    }

    public final void X(v7 v7Var) {
        if (v7Var.a.equals(this.K0)) {
            l();
        }
        v7Var.N = false;
        g(v7Var);
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.setScaleX(0.93f);
            j10.setScaleY(0.93f);
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        R();
        h0();
    }

    public final void Y(v7 v7Var, float f7, float f10) {
        float[] fArr;
        this.h0 = true;
        boolean z10 = this.F0 == 2;
        this.j0 = z10;
        if (this.c1) {
            this.d1 = v7Var == this.f1 && !z10;
            this.e1 = false;
            this.c1 = false;
            MessagesController.getGlobalMainSettings().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z11 = v7Var.N;
        u7 u7Var = v7Var.m;
        u7 u7Var2 = v7Var.f;
        u7 u7Var3 = v7Var.e;
        if (z11) {
            v7Var.N = false;
            u7 u7Var4 = v7Var.h;
            u7Var4.d = 420.0f;
            u7Var4.e = 0.8f;
            u7Var4.b = 1.0f;
        }
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.o0 = false;
        if (this.j0) {
            fArr = P(u7Var3.a, u7Var2.a);
        } else {
            RectF b02 = b0(v7Var);
            if (b02 == null) {
                return;
            }
            float[] fArr2 = {b02.centerX(), b02.centerY()};
            u7 u7Var5 = v7Var.g;
            u7Var5.d = 500.0f;
            u7Var5.e = 0.75f;
            u7Var5.a((f(v7Var) * b02.width()) / W());
            u7Var.a(0.0f);
            l5.g0((l5) this.d.c, 0L);
            fArr = fArr2;
        }
        u7Var3.d = 1100.0f;
        u7Var3.e = 0.9f;
        u7Var3.a(fArr[0]);
        u7Var2.d = 1100.0f;
        u7Var2.e = 0.9f;
        u7Var2.a(fArr[1]);
        v7Var.H = 3;
        long j11 = this.I0 + 1;
        this.I0 = j11;
        v7Var.I = j11;
        u7Var.b = 1.0f;
        u7 u7Var6 = v7Var.j;
        u7Var6.d = 320.0f;
        u7Var6.e = 0.75f;
        u7Var6.b = 1.0f;
        v7Var.l.a(0.0f);
        this.u0 = fArr[0] - f7;
        this.v0 = fArr[1] - f10;
        this.N.b = this.j0 ? 1.0f : 0.0f;
        performHapticFeedback(3);
    }

    public final void Z(v7 v7Var, boolean z10) {
        this.N0 = this.O0;
        this.O0 = v7Var;
        this.P0 = 0.0f;
        this.S0 = z10;
        if (v7Var != null) {
            this.Q0 = v7Var.e.b / this.T0;
            this.R0 = v7Var.f.b / this.U0;
        }
        h0();
    }

    public final void a() {
        this.l0 = false;
        removeCallbacks(this.w1);
        removeCallbacks(this.v1);
        this.g0 = null;
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        h0();
    }

    public final void a0(e0 e0Var) {
        TL_wallet.nftItem nftitem;
        ArrayList arrayList = e0Var.a;
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
            v7 v7Var = (v7) it.next();
            int i11 = v7Var.H;
            String str = v7Var.a;
            if (i11 != 3) {
                ArrayList arrayList2 = e0Var.c;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                        if (!wallettransaction.failed && (nftitem = wallettransaction.nft) != null && m0.a(nftitem.address, str)) {
                            if (str.equals(this.K0) || str.equals(this.L0)) {
                                this.L0 = null;
                                this.K0 = null;
                                Z(null, true);
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
            R();
            k();
        }
        h0();
    }

    public final RectF b0(v7 v7Var) {
        j7 j10 = j(v7Var);
        if (j10 != null && j10.isShown()) {
            Matrix matrix = this.v;
            v5.m(j10, matrix);
            Matrix matrix2 = this.w;
            v5.m(this, matrix2);
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

    public final TL_stories.TL_mediaAreaCoordinates c0(v7 v7Var) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float W = W() * v7Var.h.b;
        tL_mediaAreaCoordinates.x = Q((v7Var.e.b / this.T0) * 100.0f);
        tL_mediaAreaCoordinates.y = Q((v7Var.f.b / this.U0) * 100.0f);
        tL_mediaAreaCoordinates.w = Q((W / this.T0) * 100.0f);
        tL_mediaAreaCoordinates.h = Q((W / this.U0) * 100.0f);
        float f7 = v7Var.i.b % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = Q(f7);
        return tL_mediaAreaCoordinates;
    }

    public final void d(TL_wallet.card cardVar) {
        int i10;
        this.W0 = cardVar;
        this.X0 = V(cardVar);
        if (this.Y0 || this.a1 != 0 || this.k0) {
            return;
        }
        TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
        v7 v7Var = null;
        String str = nftitem == null ? null : nftitem.address;
        boolean equals = TextUtils.equals(str, this.K0);
        if (!equals) {
            this.K0 = str;
            this.L0 = null;
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
                v7Var = v(nftitem3);
            }
            this.N0 = v7Var;
            this.O0 = v7Var;
            this.P0 = 1.0f;
            e();
            h0();
            return;
        }
        if (!C()) {
            h0();
            return;
        }
        this.Z0 = true;
        ArrayList K = K();
        int size2 = K.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj = K.get(i12);
            i12++;
            v7 v7Var2 = (v7) obj;
            if (v7Var2.K && (i10 = v7Var2.H) != 3 && i10 != 4 && i10 != 5) {
                TL_wallet.cardSticker T = T(v7Var2.a);
                if (T != null) {
                    if (!v7Var2.b() || !A(c0(v7Var2)).equals(A(T.coordinates))) {
                        O(v7Var2, T.coordinates, v7Var2.N);
                    }
                } else if (v7Var2.b()) {
                    G(v7Var2);
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
                v7 v7Var3 = nftitem4 == null ? null : (v7) linkedHashMap.get(nftitem4.address);
                if (v7Var3 != null && v7Var3.H == 2) {
                    long j10 = this.I0 + 1;
                    this.I0 = j10;
                    v7Var3.I = j10;
                }
            }
        }
        if (!equals) {
            String str2 = this.K0;
            v7 v7Var4 = str2 == null ? null : (v7) linkedHashMap.get(str2);
            if (v7Var4 == null || !v7Var4.b()) {
                Z(null, true);
            } else {
                Z(v7Var4, false);
            }
        }
        this.Z0 = false;
        R();
        h0();
    }

    public final void d0(TL_wallet.nftItem nftitem) {
        if (C()) {
            v7 v = v(nftitem);
            if (v.b()) {
                if (this.d.O()) {
                    G(v);
                } else {
                    X(v);
                }
            } else if (v.H == 0 && b(v)) {
                f0(v);
            }
            k();
        }
    }

    public final void e() {
        float pow;
        v7 v7Var = this.N0;
        float[] g10 = k7.g(v7Var == null ? null : v7Var.t);
        v7 v7Var2 = this.O0;
        float[] g11 = k7.g(v7Var2 == null ? null : v7Var2.t);
        if (this.S0) {
            float f7 = this.P0;
            pow = com.google.android.gms.internal.cast.a6.B(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - this.P0, 4.0d));
        }
        float[] fArr = new float[18];
        System.arraycopy(new float[]{g10[0], g10[1], g10[2], g11[0], g11[1], g11[2], this.Q0, this.R0, pow, this.S0 ? 1.0f : 0.0f}, 0, fArr, 0, 10);
        v7 v7Var3 = this.N0;
        k7.k(fArr, 0, v7Var3 == null ? null : v7Var3.t);
        v7 v7Var4 = this.O0;
        k7.k(fArr, 1, v7Var4 == null ? null : v7Var4.t);
        this.c.setStickerStyle(fArr);
    }

    public final void e0(v7 v7Var) {
        String str = v7Var.a;
        if (str.equals(this.K0)) {
            l();
            return;
        }
        if (m(v7Var)) {
            this.K0 = str;
            if (v7Var.b()) {
                Z(v7Var, false);
                k();
            } else {
                this.L0 = str;
                f0(v7Var);
                if (v7Var.H == 0) {
                    this.L0 = null;
                    this.K0 = null;
                } else {
                    k();
                }
            }
            R();
        }
    }

    public final float f(v7 v7Var) {
        j7 j10 = j(v7Var);
        if (j10 == null) {
            return 0.77f;
        }
        org.telegram.ui.Components.w9 w9Var = j10.y;
        if (j10.getWidth() <= 0 || w9Var.getWidth() <= 0) {
            return 0.77f;
        }
        return ((w9Var.getWidth() / j10.getWidth()) * 288.0f) / 268.0f;
    }

    public final void f0(v7 v7Var) {
        l5.g0((l5) this.d.c, 2600L);
        if (C()) {
            float[] z10 = z(v7Var, this.T0 * 0.6f, this.U0 * 0.68f, true);
            RectF b02 = b0(v7Var);
            int i10 = 0;
            if (z10 == null || b02 == null) {
                j7 j10 = j(v7Var);
                if (j10 != null) {
                    j10.animate().rotation(3.0f).setDuration(90L).withEndAction(new m7(j10, i10)).start();
                    return;
                }
                return;
            }
            v7Var.g.a((f(v7Var) * b02.width()) / W());
            v7Var.m.a(0.0f);
            v7Var.j.a(1.0f);
            float[] fArr = {b02.centerX(), b02.centerY()};
            this.s.mapPoints(fArr);
            M(v7Var, fArr, z10, true);
            performHapticFeedback(3);
        }
    }

    public final void g(v7 v7Var) {
        v7Var.H = 0;
        v7Var.J = 0L;
        v7Var.g.a(1.0f);
        v7Var.h.a(1.0f);
        v7Var.i.a(0.0f);
        v7Var.m.a(0.0f);
        v7Var.j.a(0.0f);
        v7Var.k.a(0.0f);
        j7 j10 = j(v7Var);
        if (j10 != null) {
            j10.animate().cancel();
            j10.setScaleX(1.0f);
            j10.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - AndroidUtilities.dp(64.0f)) - AndroidUtilities.navigationBarHeight;
    }

    public final void h0() {
        if (this.V0 || !isAttachedToWindow()) {
            return;
        }
        r7 r7Var = this.x1;
        removeCallbacks(r7Var);
        postOnAnimation(r7Var);
    }

    public final void i(j7 j7Var) {
        ArrayList arrayList = this.h;
        if (!arrayList.contains(j7Var)) {
            arrayList.add(j7Var);
        }
        v7 v = v(j7Var.o0);
        j7Var.j(v.R, false, v.H == 0 ? 0.0f : 1.0f);
        h0();
    }

    public final j7 j(v7 v7Var) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j7 j7Var = (j7) obj;
            if (j7Var.isAttachedToWindow() && j7Var.o0.address.equals(v7Var.a)) {
                return j7Var;
            }
        }
        return null;
    }

    public final void k() {
        if (this.b || this.Z0) {
            return;
        }
        this.Y0 = true;
        o7 o7Var = this.b1;
        AndroidUtilities.cancelRunOnUIThread(o7Var);
        AndroidUtilities.runOnUIThread(o7Var, 1500L);
    }

    public final void l() {
        this.L0 = null;
        this.K0 = null;
        Z(null, true);
        R();
        k();
    }

    public final boolean m(v7 v7Var) {
        return b(v7Var) && H(this.a.getCurrentAccount(), v7Var.b.gift.slug);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.t1);
        getViewTreeObserver().addOnPreDrawListener(this.u1);
        for (v7 v7Var : this.f.values()) {
            v7Var.c.onAttachedToWindow();
            v7Var.d.onAttachedToWindow();
        }
        h0();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.t1);
        getViewTreeObserver().removeOnPreDrawListener(this.u1);
        removeCallbacks(this.x1);
        removeCallbacks(this.v1);
        for (v7 v7Var : this.f.values()) {
            v7Var.c.onDetachedFromWindow();
            v7Var.d.onDetachedFromWindow();
        }
        this.H0 = 0L;
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
        v7 v7Var;
        RectF rectF;
        ArrayList arrayList;
        u7 u7Var;
        w7 w7Var = this;
        Canvas canvas2 = canvas;
        if (w7Var.C()) {
            float f16 = w7Var.N.a;
            RectF rectF2 = w7Var.H;
            Paint paint = w7Var.x;
            if (f16 < 0.01f) {
                f10 = 0.0f;
                f11 = 2.0f;
                i10 = 0;
                f12 = 0.6f;
                f7 = 0.4f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, w7Var.O.a));
                float clamp01 = Utilities.clamp01(max);
                float dp = AndroidUtilities.dp(56.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                f7 = 0.4f;
                Paint paint2 = w7Var.G;
                paint2.setTextSize(dp2);
                float measureText = (((paint2.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(56.0f)) * max) + dp;
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate(w7Var.getWidth() / 2.0f, ((1.0f - f16) * AndroidUtilities.dp(90.0f)) + w7Var.h());
                float f17 = (f16 * 0.4f) + 0.6f;
                canvas2.scale(f17, f17);
                int i12 = org.telegram.ui.ActionBar.h6.d6;
                org.telegram.ui.ActionBar.n2 n2Var = w7Var.a;
                paint.setColor(i0.b.f(clamp01, org.telegram.ui.ActionBar.h6.w0(i12, n2Var.getResourceProvider()), -1750963));
                paint.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                float f18 = (-measureText) / 2.0f;
                float f19 = measureText / 2.0f;
                rectF2.set(f18, -AndroidUtilities.dp(28.0f), f19, AndroidUtilities.dp(28.0f));
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), paint);
                float dp3 = (f18 + AndroidUtilities.dp(30.0f)) * clamp01;
                float dp4 = AndroidUtilities.dp(21.0f);
                int round = Math.round(w7Var.c0.a);
                f11 = 2.0f;
                uj0 uj0Var = w7Var.e0;
                uj0Var.N(round, false, false);
                float f20 = dp3 - dp4;
                i10 = 0;
                f12 = 0.6f;
                float f21 = -dp4;
                float f22 = dp3 + dp4;
                uj0Var.setBounds((int) f20, (int) f21, (int) f22, (int) dp4);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.b.f(clamp01, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, n2Var.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint3 = w7Var.d0;
                paint3.setColorFilter(porterDuffColorFilter);
                paint3.setAlpha((int) (Utilities.clamp01(f16) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f20, f21, f22, dp4, paint3);
                uj0Var.draw(canvas2);
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
            ArrayList K = w7Var.K();
            int size = K.size();
            int i13 = i10;
            while (i13 < size) {
                int i14 = i13 + 1;
                v7 v7Var2 = (v7) K.get(i13);
                u7 u7Var2 = v7Var2.e;
                u7 u7Var3 = v7Var2.i;
                float f23 = u7Var2.a;
                float f24 = v7Var2.f.a;
                float W = w7Var.W() * v7Var2.g.a * v7Var2.h.a;
                float f25 = v7Var2.j.a;
                int i15 = v7Var2.H;
                if (i15 == 1 && v7Var2.O && f25 > 0.3f) {
                    float[] P = w7Var.P(f23 + v7Var2.n.a, f24 + v7Var2.o.a);
                    float f26 = P[i10];
                    float f27 = P[1];
                    W = com.google.android.gms.internal.cast.a6.A(f25, 0.15f, 1.0f, W);
                    f13 = f27;
                    f23 = f26;
                } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                    f13 = f24;
                } else {
                    i13 = i14;
                }
                float f28 = W;
                Bitmap a2 = v7Var2.a();
                if (a2 == null) {
                    w7Var = this;
                } else if (f28 >= 1.0f) {
                    canvas2.save();
                    canvas2.rotate(u7Var3.a, f23, f13);
                    Paint paint4 = paint;
                    w7Var.t(canvas2, v7Var2, f23, (AndroidUtilities.dp(5.0f) * f25) + AndroidUtilities.dp(1.5f) + f13, com.google.android.gms.internal.cast.a6.A(f25, 0.04f, 1.0f, f28), f25, 0.0f, 1.0f);
                    canvas.restore();
                    float clamp012 = Utilities.clamp01(v7Var2.m.a);
                    if (v7Var2.H != 4 || v7Var2.W <= f12 || w7Var.j(v7Var2) == null) {
                        float f29 = f13;
                        ArrayList arrayList2 = K;
                        int i16 = size;
                        RectF rectF3 = rectF2;
                        canvas2 = canvas;
                        canvas2.save();
                        canvas2.rotate(u7Var3.a, f23, f29);
                        float f30 = f28 / f11;
                        rectF3.set(f23 - f30, f29 - f30, f23 + f30, f30 + f29);
                        if (clamp012 < 1.0f) {
                            paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                            rect = null;
                            canvas2.drawBitmap(v7Var2.v, (Rect) null, rectF3, paint4);
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
                        K = arrayList2;
                        size = i16;
                        w7Var = this;
                    } else {
                        float clamp013 = Utilities.clamp01((v7Var2.W - f12) / f7);
                        float f31 = (1.0f - ((3.0f - (clamp013 * f11)) * (clamp013 * clamp013))) * 0.45f;
                        float clamp014 = (1.0f - (Utilities.clamp01(-v7Var2.V) * f12)) * 0.55f;
                        if (clamp012 < 1.0f) {
                            paint4.setAlpha((int) ((1.0f - clamp012) * 255.0f));
                            ArrayList arrayList3 = K;
                            u7Var = u7Var3;
                            f15 = f28;
                            arrayList = arrayList3;
                            i11 = size;
                            rectF = rectF2;
                            f14 = f13;
                            v7Var = v7Var2;
                            w7Var.r(canvas, v7Var2.v, f23, f14, f15, f31, clamp014, u7Var3.a, v7Var2.U, v7Var2.V);
                        } else {
                            f14 = f13;
                            i11 = size;
                            f15 = f28;
                            v7Var = v7Var2;
                            rectF = rectF2;
                            arrayList = K;
                            u7Var = u7Var3;
                        }
                        if (clamp012 > f10) {
                            paint4.setAlpha((int) (clamp012 * 255.0f));
                            canvas2 = canvas;
                            r(canvas2, a2, f23, f14, f15, f31, clamp014, u7Var.a, v7Var.U, v7Var.V);
                        } else {
                            canvas2 = canvas;
                        }
                        paint4.setAlpha(255);
                        paint = paint4;
                        rectF2 = rectF;
                        i13 = i14;
                        K = arrayList;
                        size = i11;
                        w7Var = this;
                    }
                }
                i13 = i14;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h0();
    }

    public final void p() {
        AndroidUtilities.removeFromParent(this.r1);
        AndroidUtilities.removeFromParent(this.s1);
        this.s1 = null;
        this.r1 = null;
        R();
        AndroidUtilities.cancelRunOnUIThread(this.b1);
        this.V0 = true;
        if (this.Y0) {
            S();
        }
        this.e0.C(false);
        removeCallbacks(this.x1);
        removeCallbacks(this.v1);
        removeCallbacks(this.w1);
        VelocityTracker velocityTracker = this.J0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J0 = null;
        }
        for (v7 v7Var : this.f.values()) {
            v7Var.c.onDetachedFromWindow();
            v7Var.d.onDetachedFromWindow();
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
    public final void q(v7 v7Var, float f7, float f10) {
        boolean z10;
        float f11;
        float W;
        float f12 = this.u0 * 0.9f;
        this.u0 = f12;
        float f13 = this.v0 * 0.9f;
        this.v0 = f13;
        boolean z11 = false;
        float[] fArr = {f12 + f7, f13 + f10};
        this.s.mapPoints(fArr);
        float f14 = fArr[0];
        if (f14 >= 0.0f && f14 <= this.T0) {
            float f15 = fArr[1];
            if (f15 >= 0.0f && f15 <= this.U0) {
                z10 = true;
                if (this.j0 && !z10 && Utilities.dist(f7, f10, getWidth() / 2.0f, h()) < AndroidUtilities.dp(78.0f)) {
                    z11 = true;
                }
                if (z11 != this.o0) {
                    performHapticFeedback(4);
                }
                this.o0 = z11;
                this.N.b = (this.j0 || z10) ? 0.0f : 1.0f;
                this.O.b = !z11 ? 1.0f : 0.0f;
                u7 u7Var = v7Var.e;
                if (z11) {
                    f11 = this.u0;
                } else {
                    float dp = AndroidUtilities.dp(15.0f);
                    Paint paint = this.G;
                    paint.setTextSize(dp);
                    f7 = (getWidth() / 2.0f) - ((paint.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) / 2.0f);
                    f11 = AndroidUtilities.dp(30.0f);
                }
                u7Var.b = f7 + f11;
                v7Var.f.b = !z11 ? h() - AndroidUtilities.dp(46.0f) : f10 + this.v0;
                RectF b02 = b0(v7Var);
                float W2 = b02 != null ? W() : b02.width();
                u7 u7Var2 = v7Var.g;
                if (z11) {
                    W = 1.24f * (z10 ? 1.0f : (W2 * 0.77f) / W());
                } else {
                    W = AndroidUtilities.dp(38.0f) / W();
                }
                u7Var2.b = W;
                if (this.j0) {
                    return;
                }
                u7 u7Var3 = v7Var.i;
                u7Var3.d = 260.0f;
                u7Var3.e = 0.9f;
                float f16 = u7Var3.a;
                u7Var3.b = c((z10 ? this.E0 : 0.0f) - f16) + f16;
                return;
            }
        }
        z10 = false;
        if (this.j0) {
            z11 = true;
        }
        if (z11 != this.o0) {
        }
        this.o0 = z11;
        this.N.b = (this.j0 || z10) ? 0.0f : 1.0f;
        this.O.b = !z11 ? 1.0f : 0.0f;
        u7 u7Var4 = v7Var.e;
        if (z11) {
        }
        u7Var4.b = f7 + f11;
        v7Var.f.b = !z11 ? h() - AndroidUtilities.dp(46.0f) : f10 + this.v0;
        RectF b022 = b0(v7Var);
        if (b022 != null) {
        }
        u7 u7Var22 = v7Var.g;
        if (z11) {
        }
        u7Var22.b = W;
        if (this.j0) {
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

    public final void s(Canvas canvas, v7 v7Var, float f7, float f10, boolean z10) {
        float f11;
        int i10;
        ImageReceiver imageReceiver = v7Var.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v7Var.t;
        Bitmap bitmap = imageReceiver.getBitmap();
        if (bitmap == null || stargiftattributebackdrop == null) {
            return;
        }
        canvas.save();
        float f12 = this.T0;
        float f13 = this.U0;
        Path path = this.I;
        w7.i6.a(path, f12, f13);
        canvas.clipPath(path);
        this.c.j(path, this.T0, this.U0);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i11 >= 0 && !z10) {
            path.rewind();
            path.addCircle(this.Q0 * this.T0, this.R0 * this.U0, f10, Path.Direction.CW);
            canvas.clipPath(path);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
        Paint paint = this.x;
        paint.setColorFilter(porterDuffColorFilter);
        float f14 = this.T0 / 336.0f;
        float f15 = this.U0 / 205.0f;
        int i12 = 16;
        int i13 = 0;
        int i14 = 16;
        while (i14 < 336) {
            int i15 = ((i13 % 2) * 18) + i12;
            while (i15 < 205) {
                float f16 = i14 * f14;
                float f17 = i15 * f15;
                float f18 = 12.0f * f14;
                float clamp01 = Utilities.clamp01(Math.min(Math.min(i14, 336 - i14), Math.min(i15, 205 - i15)) / 48.0f);
                int i16 = i11;
                float B = 0.15f * f7 * com.google.android.gms.internal.cast.a6.B(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
                if (i16 >= 0) {
                    f11 = 2.0f;
                    float clamp012 = Utilities.clamp01((f10 - Utilities.dist(f16, f17, this.Q0 * this.T0, this.R0 * this.U0)) / AndroidUtilities.dp(120.0f));
                    if (z10) {
                        f18 = com.google.android.gms.internal.cast.a6.B(clamp012, 0.8f, 1.0f, f18);
                        B *= 1.0f - Utilities.clamp01(clamp012 * 1.6f);
                    } else {
                        i10 = i15;
                        f18 *= (((((float) Math.sin(clamp012 * 3.141592653589793d)) * 0.28f) + clamp012) * 0.8f) + 0.2f;
                        B *= Utilities.clamp01(clamp012 * 1.6f);
                        paint.setAlpha((int) (B * 255.0f));
                        float f19 = f18 / f11;
                        RectF rectF = this.H;
                        rectF.set(f16 - f19, f17 - f19, f16 + f19, f17 + f19);
                        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
                        i15 = i10 + 37;
                        i11 = i16;
                    }
                } else {
                    f11 = 2.0f;
                }
                i10 = i15;
                paint.setAlpha((int) (B * 255.0f));
                float f192 = f18 / f11;
                RectF rectF2 = this.H;
                rectF2.set(f16 - f192, f17 - f192, f16 + f192, f17 + f192);
                canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
                i15 = i10 + 37;
                i11 = i16;
            }
            i14 += 33;
            i13++;
            i12 = 16;
        }
        paint.setColorFilter(null);
        paint.setAlpha(255);
        canvas.restore();
    }

    public final void t(Canvas canvas, v7 v7Var, float f7, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.01f || v7Var.w == null) {
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
        paint.setAlpha((int) (Utilities.clamp01(v7Var.m.a) * Utilities.clamp01((f13 * 0.12f) + (f12 * (-0.049999997f)) + 0.16f) * 255.0f * f14));
        canvas.drawBitmap(v7Var.w, (Rect) null, rectF, paint);
        paint.setColor(-1);
        paint.setAlpha(alpha);
    }

    public final v7 v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        v7 v7Var = (v7) linkedHashMap.get(str);
        if (v7Var == null) {
            v7Var = new v7(this, nftitem);
            linkedHashMap.put(nftitem.address, v7Var);
        }
        v7Var.b = nftitem;
        return v7Var;
    }

    public final float[] w(v7 v7Var, float f7, float f10, float f11, ArrayList arrayList) {
        float W = W() * 0.5f * f11;
        float f12 = Float.MAX_VALUE;
        float[] fArr = null;
        for (float f13 = W; f13 <= this.U0 - W; f13 += AndroidUtilities.dp(4.0f)) {
            for (float f14 = W; f14 <= this.T0 - W; f14 += AndroidUtilities.dp(4.0f)) {
                float dist = Utilities.dist(f14, f13, f7, f10);
                if (dist < f12 && y(v7Var, f14, f13, f11, arrayList)) {
                    fArr = new float[]{f14, f13, f11};
                    f12 = dist;
                }
            }
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(float f7, float f10, boolean z10) {
        v7 v7Var;
        VelocityTracker velocityTracker;
        float[] I;
        boolean z11;
        char c10;
        float[] fArr;
        boolean z12;
        float[] z13;
        float[] fArr2;
        getParent().requestDisallowInterceptTouchEvent(false);
        removeCallbacks(this.v1);
        removeCallbacks(this.w1);
        this.r0 = f10;
        if (this.h0) {
            l5 l5Var = (l5) this.d.c;
            float f11 = l5Var.J0;
            m3 m3Var = l5Var.L0;
            if (f11 > 0.0f) {
                AndroidUtilities.cancelRunOnUIThread(m3Var);
                AndroidUtilities.runOnUIThread(m3Var, 1650L);
            }
        }
        v7 v7Var2 = this.g0;
        if (v7Var2 != null) {
            ci.g3 g3Var = v7Var2.c;
            u7 u7Var = v7Var2.g;
            u7 u7Var2 = v7Var2.h;
            u7 u7Var3 = v7Var2.i;
            u7 u7Var4 = v7Var2.f;
            u7 u7Var5 = v7Var2.e;
            j7 j10 = j(v7Var2);
            if (j10 != null) {
                j10.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
            }
            if (!this.h0) {
                if (this.i0) {
                    u7 u7Var6 = v7Var2.l;
                    u7Var6.d = 380.0f;
                    u7Var6.e = 0.62f;
                    u7Var6.b = 0.0f;
                    u7Var3.a = c(u7Var3.a);
                    u7Var3.b = c(u7Var3.b);
                    ArrayList J = J();
                    if (!v7Var2.N) {
                        v7Var = v7Var2;
                        if (!y(v7Var, u7Var5.b, u7Var4.b, u7Var2.b, J) && (I = I(v7Var, u7Var5.b, u7Var4.b, J)) != null) {
                            u7Var5.d = 500.0f;
                            u7Var5.e = 1.0f;
                            u7Var5.b = I[0];
                            u7Var4.d = 500.0f;
                            u7Var4.e = 1.0f;
                            u7Var4.b = I[1];
                            float f12 = I[2];
                            if (f12 < u7Var2.b - 0.01f) {
                                u7Var2.d = 420.0f;
                                u7Var2.e = 0.9f;
                                u7Var2.b = f12;
                            }
                        }
                    }
                } else {
                    v7Var = v7Var2;
                    if (!z10) {
                        if (this.p0) {
                            u7Var.c += 3.0f;
                            long j11 = this.I0 + 1;
                            this.I0 = j11;
                            v7Var.I = j11;
                            v7Var.S = true;
                            v7Var.T = false;
                            g3Var.setAllowStartLottieAnimation(true);
                            g3Var.startAnimation();
                            performHapticFeedback(3);
                        } else {
                            ((l5) this.a).A0(v7Var.b);
                        }
                    }
                }
                velocityTracker = this.J0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.J0 = null;
                }
                if (v7Var != null && (this.h0 || this.i0)) {
                    k();
                }
                this.d1 = false;
                this.j0 = false;
                this.o0 = false;
                this.i0 = false;
                this.h0 = false;
                this.l0 = false;
                this.k0 = false;
                this.g0 = null;
                this.N.b = 0.0f;
                this.O.b = 0.0f;
                R();
                h0();
            }
            Matrix matrix = this.s;
            if (z10 && this.F0 == 2) {
                float[] fArr3 = {u7Var5.a, u7Var4.a};
                matrix.mapPoints(fArr3);
                float f13 = this.D0;
                u7Var2.b = f13;
                u7Var3.b = this.E0;
                M(v7Var2, fArr3, new float[]{this.B0, this.C0, f13}, false);
            } else if (z10) {
                G(v7Var2);
            } else if (this.o0) {
                v7Var2.H = 5;
                long j12 = this.I0 + 1;
                this.I0 = j12;
                v7Var2.I = j12;
                v7Var2.J = 0L;
                this.f0 = true;
                u7 u7Var7 = this.c0;
                u7Var7.a(Math.max(30.0f, u7Var7.a));
                u7Var5.d = 500.0f;
                u7Var5.e = 0.9f;
                float dp = AndroidUtilities.dp(15.0f);
                Paint paint = this.G;
                paint.setTextSize(dp);
                u7Var5.b = ((getWidth() / 2.0f) - ((paint.measureText(LocaleController.getString(R.string.Remove)) + AndroidUtilities.dp(72.0f)) / 2.0f)) + AndroidUtilities.dp(30.0f);
                u7Var4.d = 500.0f;
                u7Var4.e = 0.9f;
                u7Var4.b = h();
                u7Var.d = 240.0f;
                u7Var.e = 0.95f;
                u7Var.b = 0.0f;
                v7Var2.j.b = 0.0f;
                u7Var3.b = 0.0f;
                if (v7Var2.a.equals(this.K0)) {
                    l();
                }
                performHapticFeedback(16);
            } else {
                float[] fArr4 = {u7Var5.a, u7Var4.a};
                matrix.mapPoints(fArr4);
                float f14 = fArr4[0];
                if (f14 >= 0.0f && f14 <= this.T0) {
                    float f15 = fArr4[1];
                    if (f15 >= 0.0f && f15 <= this.U0) {
                        z11 = true;
                        if (this.j0) {
                            c10 = 2;
                            fArr = fArr4;
                            if (((float) Math.hypot(f7, f10)) > AndroidUtilities.dp(700.0f) && (z11 || f10 < (-AndroidUtilities.dp(600.0f)))) {
                                z12 = true;
                                z13 = z11 ? z(v7Var2, fArr[0], fArr[1], false) : null;
                                if (z12) {
                                    z13 = z(v7Var2, Math.max(0.0f, Math.min(this.T0, (f7 * 0.08f) + fArr[0])), Math.max(0.0f, Math.min(this.U0, (f10 * 0.08f) + fArr[1])), true);
                                } else if (z11 && this.d1 && (fArr2 = this.h1) != null) {
                                    float dist = Utilities.dist(fArr[0], fArr[1], fArr2[0], fArr2[1]);
                                    float W = W();
                                    float[] fArr5 = this.h1;
                                    if (dist < W * fArr5[c10] * 0.6f) {
                                        v7Var2.N = false;
                                        z13 = (float[]) fArr5.clone();
                                    }
                                }
                                if (z13 != null) {
                                    M(v7Var2, fArr, z13, false);
                                } else {
                                    G(v7Var2);
                                }
                                if (z13 != null) {
                                    v7Var2.P = z12;
                                    if (z12) {
                                        u7Var5.d = 260.0f;
                                        u7Var5.e = 0.8f;
                                        u7Var4.d = 260.0f;
                                        u7Var4.e = 0.8f;
                                    }
                                }
                            }
                        } else {
                            c10 = 2;
                            fArr = fArr4;
                        }
                        z12 = false;
                        if (z11) {
                        }
                        if (z12) {
                        }
                        if (z13 != null) {
                        }
                        if (z13 != null) {
                        }
                    }
                }
                z11 = false;
                if (this.j0) {
                }
                z12 = false;
                if (z11) {
                }
                if (z12) {
                }
                if (z13 != null) {
                }
                if (z13 != null) {
                }
            }
        }
        v7Var = v7Var2;
        velocityTracker = this.J0;
        if (velocityTracker != null) {
        }
        if (v7Var != null) {
            k();
        }
        this.d1 = false;
        this.j0 = false;
        this.o0 = false;
        this.i0 = false;
        this.h0 = false;
        this.l0 = false;
        this.k0 = false;
        this.g0 = null;
        this.N.b = 0.0f;
        this.O.b = 0.0f;
        R();
        h0();
    }

    public final boolean y(v7 v7Var, float f7, float f10, float f11, ArrayList arrayList) {
        float W = W() * 0.36f * f11;
        float W2 = W() * 0.5f * f11;
        if (f7 >= W2 && f7 <= this.T0 - W2 && f10 >= W2 && f10 <= this.U0 - W2) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    for (v7 v7Var2 : this.f.values()) {
                        if (v7Var2 != v7Var && v7Var2.b()) {
                            if (Utilities.dist(v7Var2.e.b, v7Var2.f.b, f7, f10) < (v7Var2.h.b + f11) * W() * 0.29f) {
                            }
                        }
                    }
                    return true;
                }
                Object obj = arrayList.get(i10);
                i10++;
                RectF rectF = (RectF) obj;
                if (Utilities.dist(f7, f10, Math.max(rectF.left, Math.min(rectF.right, f7)), Math.max(rectF.top, Math.min(rectF.bottom, f10))) < W) {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float[] z(v7 v7Var, float f7, float f10, boolean z10) {
        float f11;
        Random random;
        float nextFloat;
        char c10;
        ArrayList J = J();
        float dp = AndroidUtilities.dp(32.0f) / W();
        float f12 = v7Var.h.b;
        char c11 = 2;
        LinkedHashMap linkedHashMap = this.f;
        char c12 = 3;
        boolean z11 = true;
        int i10 = 0;
        if (!z10) {
            RectF rectF = new RectF((RectF) J.get(3));
            rectF.inset(-AndroidUtilities.dp(10.0f), -AndroidUtilities.dp(10.0f));
            if (rectF.contains(f7, f10)) {
                Object[] objArr = false;
                for (v7 v7Var2 : linkedHashMap.values()) {
                    if (v7Var2 != v7Var && v7Var2.b() && v7Var2.N) {
                        objArr = true;
                    }
                }
                if (objArr == false) {
                    float f13 = this.T0;
                    float f14 = this.U0;
                    v5 v5Var = this.c;
                    Path path = this.I;
                    v5Var.j(path, f13, f14);
                    path.computeBounds(rectF, true);
                    v7Var.N = true;
                    float max = Math.max(dp, Math.min(1.1f, (rectF.width() * 1.22f) / W()));
                    return new float[]{rectF.centerX(), ((rectF.height() * 0.08f) + rectF.top) - ((W() * max) * 0.38f), max};
                }
            }
            v7Var.N = false;
            return I(v7Var, f7, f10, new ArrayList());
        }
        v7Var.N = false;
        ArrayList arrayList = new ArrayList();
        for (v7 v7Var3 : linkedHashMap.values()) {
            char c13 = c11;
            if (v7Var3 != v7Var && v7Var3.b()) {
                arrayList.add(v7Var3);
            }
            c11 = c13;
        }
        char c14 = c11;
        Random random2 = new Random((System.nanoTime() / 400000000) + (arrayList.size() * 31) + (v7Var.a.hashCode() * 7919));
        float d = org.telegram.ui.Cells.t0.d(random2, 0.04f, 0.05f);
        float nextFloat2 = (((random2.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.T0;
        float nextFloat3 = this.U0 * (((random2.nextFloat() - 0.5f) * 0.08f) + 0.55f);
        float W = W() * dp * 0.5f;
        float f15 = -3.4028235E38f;
        float[] fArr = null;
        float f16 = W;
        while (f16 <= this.U0 - W) {
            boolean z12 = z11;
            float f17 = W;
            while (true) {
                float f18 = this.T0;
                if (f17 <= f18 - W) {
                    int i11 = i10;
                    float min = Math.min(Math.min(f17, f18 - f17), Math.min(f16, this.U0 - f16));
                    float min2 = Math.min(Math.max(0.74f, 1.0f - (arrayList.size() * d)) * f12, min / (W() * 0.5f));
                    int size = J.size();
                    float f19 = d;
                    float f20 = dp;
                    int i12 = i11;
                    float f21 = Float.MAX_VALUE;
                    while (i12 < size) {
                        ArrayList arrayList2 = J;
                        RectF rectF2 = (RectF) J.get(i12);
                        f21 = Math.min(f21, Utilities.dist(f17, f16, Math.max(rectF2.left, Math.min(rectF2.right, f17)), Math.max(rectF2.top, Math.min(rectF2.bottom, f16))));
                        i12++;
                        J = arrayList2;
                        f12 = f12;
                    }
                    ArrayList arrayList3 = J;
                    float f22 = f12;
                    float min3 = Math.min(min2, f21 / (W() * 0.44f));
                    int i13 = i11;
                    for (int size2 = arrayList.size(); i13 < size2; size2 = size2) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        v7 v7Var4 = (v7) obj;
                        min3 = Math.min(min3, (Utilities.dist(f17, f16, v7Var4.e.b, v7Var4.f.b) / (W() * 0.29f)) - v7Var4.h.b);
                    }
                    float clamp01 = ((Utilities.clamp01((min - ((W() * 0.5f) * min3)) / AndroidUtilities.dp(14.0f)) * 0.1f) + 0.9f) * min3;
                    if (clamp01 < f20) {
                        random = random2;
                    } else {
                        if (arrayList.isEmpty()) {
                            float f23 = this.T0 * 0.6f;
                            float x10 = com.google.android.gms.internal.cast.a6.x(f7, f23, 0.2f, f23);
                            float f24 = this.U0 * 0.68f;
                            nextFloat = (random2.nextFloat() * AndroidUtilities.dp(5.0f)) + (W() * clamp01 * 1.1f) + (Utilities.dist(f17, f16, x10, com.google.android.gms.internal.cast.a6.x(f10, f24, 0.2f, f24)) * (-0.45f));
                            f11 = clamp01;
                            random = random2;
                        } else {
                            float f25 = f16 * clamp01 * clamp01;
                            float f26 = clamp01 * clamp01;
                            int size3 = arrayList.size();
                            float f27 = f17 * clamp01 * clamp01;
                            int i14 = i11;
                            float f28 = Float.MAX_VALUE;
                            float f29 = 0.0f;
                            while (i14 < size3) {
                                Object obj2 = arrayList.get(i14);
                                int i15 = i14 + 1;
                                v7 v7Var5 = (v7) obj2;
                                float f30 = clamp01;
                                u7 u7Var = v7Var5.e;
                                int i16 = size3;
                                u7 u7Var2 = v7Var5.h;
                                Random random3 = random2;
                                u7 u7Var3 = v7Var5.f;
                                f28 = Math.min(f28, Utilities.dist(f17, f16, u7Var.b, u7Var3.b) - ((u7Var2.b + f30) * (W() * 0.4f)));
                                float f31 = u7Var2.b;
                                float f32 = f31 * f31;
                                float f33 = v7Var5.e.b;
                                f27 = (f33 * f32) + f27;
                                f25 = (u7Var3.b * f32) + f25;
                                f26 += f32;
                                f29 = Math.max(0.0f, 1.0f - (Math.abs(u7Var3.b - f16) / (W() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f33 - f17) / (W() * 0.12f))) + f29;
                                clamp01 = f30;
                                i14 = i15;
                                size3 = i16;
                                random2 = random3;
                            }
                            f11 = clamp01;
                            random = random2;
                            nextFloat = ((random.nextFloat() * AndroidUtilities.dp(10.0f)) + (((((Math.min(Math.min(min, f21), W()) * 0.2f) + ((W() * (f11 * 0.9f)) + ((f28 < 0.0f ? f28 * 2.5f : Math.min(f28, W() * 0.3f)) * 1.2f))) - (Utilities.dist(f27 / f26, f25 / f26, nextFloat2, nextFloat3) * 0.35f)) - ((W() * f29) * 0.08f)) - (Utilities.dist(f17, f16, this.T0 * 0.5f, this.U0 * 0.55f) * 0.04f))) - (Utilities.dist(f17, f16, f7, f10) * 0.04f);
                        }
                        if (nextFloat > f15) {
                            c10 = 3;
                            float[] fArr2 = new float[3];
                            fArr2[i11] = f17;
                            fArr2[z12 ? 1 : 0] = f16;
                            fArr2[c14] = f11;
                            f15 = nextFloat;
                            fArr = fArr2;
                            f17 += AndroidUtilities.dp(5.0f);
                            c12 = c10;
                            i10 = i11;
                            d = f19;
                            dp = f20;
                            J = arrayList3;
                            f12 = f22;
                            random2 = random;
                        }
                    }
                    c10 = 3;
                    f17 += AndroidUtilities.dp(5.0f);
                    c12 = c10;
                    i10 = i11;
                    d = f19;
                    dp = f20;
                    J = arrayList3;
                    f12 = f22;
                    random2 = random;
                }
            }
            f16 += AndroidUtilities.dp(5.0f);
            z11 = z12 ? 1 : 0;
            d = d;
            J = J;
        }
        return fArr;
    }
}
