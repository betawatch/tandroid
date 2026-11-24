// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k44 implements i59, tcc, qj5, jca, i68, zv7, cx9, uj2, gec, zy2, fd1, kb1, o7, v78, udc, qq7, ldc, nc8 {
    public final /* synthetic */ byte a;
    public Object b;

    public k44(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                break;
            case 17:
                this.b = new Bundle();
                break;
            default:
                this.b = new or4(5, 1.0f, false, (byte) 0);
                break;
        }
    }

    @Override // fd1
    public final kd1 A() {
        tv7 tv7Var = ((z8b) this.b).H0;
        for (int i = 0; i < tv7Var.getChildCount(); i++) {
            if (tv7Var.getChildAt(i) instanceof kd1) {
                return (kd1) tv7Var.getChildAt(i);
            }
        }
        return null;
    }

    public final void B(int i, long j) {
        tl6 tl6Var = (tl6) this.b;
        if (i == 136) {
            tl6Var.h(i);
            tl6Var.B.b0 = j == 1;
            return;
        }
        if (i == 137) {
            tl6Var.k(i).e = j;
            return;
        }
        if (i == 145) {
            tl6Var.k(i).b = j;
            return;
        }
        if (i == 146) {
            tl6Var.k(i).c = j;
            return;
        }
        if (i == 240) {
            if (tl6Var.C) {
                return;
            }
            tl6Var.g(i);
            if (tl6Var.K == -1) {
                tl6Var.K = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (tl6Var.C) {
                return;
            }
            tl6Var.g(i);
            if (tl6Var.J == -1) {
                tl6Var.J = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j != 0) {
                throw bx7.a("ContentEncodingOrder " + j + " not supported", null);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw bx7.a("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        if (i == 29636) {
            tl6Var.k(i).a = j;
            return;
        }
        if (i == 29637) {
            tl6Var.h(i);
            tl6Var.B.e = j;
            return;
        }
        switch (i) {
            case nm7.O1 /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    tl6Var.h(i);
                    tl6Var.B.f = 2;
                    return;
                }
                if (i2 == 2) {
                    tl6Var.h(i);
                    tl6Var.B.f = 1;
                    return;
                } else if (i2 == 17) {
                    tl6Var.h(i);
                    tl6Var.B.f = 3;
                    return;
                } else if (i2 != 33) {
                    tl6Var.h(i);
                    tl6Var.B.f = -1;
                    return;
                } else {
                    tl6Var.h(i);
                    tl6Var.B.f = 5;
                    return;
                }
            case nm7.h2 /* 152 */:
                tl6Var.k(i).d = j == 1;
                return;
            case nm7.k2 /* 155 */:
                tl6Var.X = tl6Var.p(j);
                return;
            case nm7.o2 /* 159 */:
                tl6Var.h(i);
                tl6Var.B.Q = (int) j;
                return;
            case nm7.F2 /* 176 */:
                tl6Var.h(i);
                tl6Var.B.o = (int) j;
                return;
            case nm7.I2 /* 179 */:
                if (tl6Var.C) {
                    return;
                }
                tl6Var.g(i);
                tl6Var.H = tl6Var.p(j);
                return;
            case nm7.P2 /* 186 */:
                tl6Var.h(i);
                tl6Var.B.p = (int) j;
                return;
            case nm7.r3 /* 215 */:
                tl6Var.h(i);
                tl6Var.B.d = (int) j;
                return;
            case nm7.G3 /* 231 */:
                tl6Var.T = tl6Var.p(j);
                return;
            case nm7.M3 /* 238 */:
                tl6Var.e0 = (int) j;
                return;
            case nm7.V3 /* 247 */:
                if (tl6Var.C) {
                    return;
                }
                tl6Var.g(i);
                tl6Var.I = (int) j;
                return;
            case nm7.Z3 /* 251 */:
                tl6Var.f0 = true;
                return;
            case 16871:
                tl6Var.h(i);
                tl6Var.B.i = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw bx7.a("ContentCompAlgo " + j + " not supported", null);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw bx7.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw bx7.a("EBMLReadVersion " + j + " not supported", null);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw bx7.a("ContentEncAlgo " + j + " not supported", null);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw bx7.a("AESSettingsCipherMode " + j + " not supported", null);
                }
                return;
            case 21420:
                tl6Var.E = j + tl6Var.u;
                return;
            case 21432:
                int i3 = (int) j;
                tl6Var.h(i);
                if (i3 == 0) {
                    tl6Var.B.z = 0;
                    return;
                }
                if (i3 == 1) {
                    tl6Var.B.z = 2;
                    return;
                } else if (i3 == 3) {
                    tl6Var.B.z = 1;
                    return;
                } else {
                    if (i3 == 15) {
                        tl6Var.B.z = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                tl6Var.h(i);
                tl6Var.B.r = (int) j;
                return;
            case 21682:
                tl6Var.h(i);
                tl6Var.B.t = (int) j;
                return;
            case 21690:
                tl6Var.h(i);
                tl6Var.B.s = (int) j;
                return;
            case 21930:
                tl6Var.h(i);
                tl6Var.B.a0 = j == 1;
                return;
            case 21938:
                tl6Var.h(i);
                tl6Var.B.q = (int) j;
                return;
            case 21998:
                tl6Var.h(i);
                tl6Var.B.h = (int) j;
                return;
            case 22186:
                tl6Var.h(i);
                tl6Var.B.U = j;
                return;
            case 22203:
                tl6Var.h(i);
                tl6Var.B.V = j;
                return;
            case 25188:
                tl6Var.h(i);
                tl6Var.B.R = (int) j;
                return;
            case 30114:
                tl6Var.g0 = j;
                return;
            case 30321:
                tl6Var.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    tl6Var.B.u = 0;
                    return;
                }
                if (i4 == 1) {
                    tl6Var.B.u = 1;
                    return;
                } else if (i4 == 2) {
                    tl6Var.B.u = 2;
                    return;
                } else {
                    if (i4 == 3) {
                        tl6Var.B.u = 3;
                        return;
                    }
                    return;
                }
            case 2352003:
                tl6Var.h(i);
                tl6Var.B.g = (int) j;
                return;
            case 2807729:
                tl6Var.v = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        tl6Var.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            tl6Var.B.C = 2;
                            return;
                        } else {
                            if (i5 == 2) {
                                tl6Var.B.C = 1;
                                return;
                            }
                            return;
                        }
                    case 21946:
                        tl6Var.h(i);
                        int g = tm2.g((int) j);
                        if (g != -1) {
                            tl6Var.B.B = g;
                            return;
                        }
                        return;
                    case 21947:
                        tl6Var.h(i);
                        int f = tm2.f((int) j);
                        if (f != -1) {
                            tl6Var.B.A = f;
                            return;
                        }
                        return;
                    case 21948:
                        tl6Var.h(i);
                        tl6Var.B.D = (int) j;
                        return;
                    case 21949:
                        tl6Var.h(i);
                        tl6Var.B.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // kb1
    public final String B0() {
        return null;
    }

    public final void C() {
        ((fp4) this.b).d.R();
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        xg8 xg8Var = (xg8) this.b;
        iq5 g = wzcVar.a.g(519);
        xg8Var.r = g;
        xg8Var.d.setPadding(g.a, g.b, g.c, g.d);
        xg8Var.c.requestLayout();
        return wzc.b;
    }

    public final void D(bh6 bh6Var) {
        lh6 lh6Var = (lh6) this.b;
        boolean z = true;
        lh6Var.O = true;
        mh6 mh6Var = lh6Var.h0;
        mh6Var.K = false;
        mh6Var.B1(0, false);
        if (gm.L1()) {
            boolean z2 = mh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z3 = mh6Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            int i = Build.VERSION.SDK_INT;
            boolean z4 = i < 28 || mh6Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z5 = i < 26 || mh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            jh6 jh6Var = lh6Var.a;
            if (jh6Var != null && "888".equals(jh6Var.getText())) {
                z2 = true;
                z3 = true;
                z4 = true;
                z5 = true;
            }
            if (mh6Var.w) {
                mh6Var.r.clear();
                if (!z2) {
                    mh6Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z3) {
                    mh6Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z4) {
                    mh6Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z5 && i >= 26) {
                    mh6Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!mh6Var.r.isEmpty()) {
                    SharedPreferences d1 = oc7.d1();
                    if (!d1.getBoolean("firstlogin", true) && !mh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !mh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            mh6Var.getParentActivity().requestPermissions((String[]) mh6Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                    d1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                    alertDialog$Builder.j(jb6.M0(2131751708, "Continue"), null);
                    int i2 = R.raw.calls_log;
                    he heVar = alertDialog$Builder.a;
                    if (!z2 && (!z3 || !z4)) {
                        heVar.U = jb6.M0(2131754239, "AllowReadCallAndLog");
                    } else if (z3 && z4) {
                        heVar.U = jb6.M0(2131754240, "AllowReadCall");
                        i2 = R.raw.incoming_calls;
                    } else {
                        heVar.U = jb6.M0(2131754238, "AllowReadCallLog");
                    }
                    int i3 = cmb.K5;
                    alertDialog$Builder.l(i2, 46, cmb.w0(null, i3, false), null);
                    alertDialog$Builder.m(i3, null);
                    mh6Var.h = mh6Var.showDialog(heVar);
                    lh6Var.O = true;
                    return;
                }
            }
            z = true;
        }
        kh6 kh6Var = new kh6((byte) 0, this, bh6Var);
        int i4 = bh6.G;
        bh6Var.h.f(z, z);
        gm.d3(kh6Var, 400L);
    }

    @Override // fd1
    public final long E() {
        k9b k9bVar = ((z8b) this.b).W1;
        if (k9bVar != null) {
            return k9bVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // jca
    public final boolean F() {
        switch (this.a) {
            case 8:
                if (gm.C3()) {
                    ((g95) this.b).c1().k(0L, 33, null, null, null, null);
                    break;
                }
                break;
            default:
                ((a58) this.b).I0();
                break;
        }
        return true;
    }

    @Override // fd1
    public final FrameLayout G() {
        return (z8b) this.b;
    }

    @Override // uj2
    public final void G1(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        ej6Var.m(false, false, f);
        ej6Var.invalidate();
    }

    @Override // v78
    public final void H(String str) {
        ((d88) this.b).m0(str);
    }

    @Override // kb1
    public final void I0(yh7 yh7Var) {
        xz7 xz7Var = (xz7) this.b;
        if (!TextUtils.isEmpty(yh7Var.b)) {
            xz7Var.Z[0].setText(yh7Var.b);
        }
        if (!TextUtils.isEmpty(yh7Var.d)) {
            xz7Var.Z[1].setText(yh7Var.d);
        }
        if (!TextUtils.isEmpty(yh7Var.c)) {
            xz7Var.Z[2].setText(yh7Var.c);
        }
        int i = yh7Var.n;
        if (i != 0) {
            if (i == 1) {
                xz7Var.x = "male";
                xz7Var.Z[4].setText(jb6.M0(2131747241, null));
            } else if (i == 2) {
                xz7Var.x = "female";
                xz7Var.Z[4].setText(jb6.M0(2131747302, null));
            }
        }
        if (!TextUtils.isEmpty(yh7Var.m)) {
            String str = yh7Var.m;
            xz7Var.s = str;
            String str2 = (String) xz7Var.Z0.get(str);
            if (str2 != null) {
                xz7Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(yh7Var.l)) {
            String str3 = yh7Var.l;
            xz7Var.w = str3;
            String str4 = (String) xz7Var.Z0.get(str3);
            if (str4 != null) {
                xz7Var.Z[6].setText(str4);
            }
        }
        int i2 = yh7Var.k;
        if (i2 <= 0 || yh7Var.j <= 0 || yh7Var.i <= 0) {
            return;
        }
        xz7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i2), Integer.valueOf(yh7Var.j), Integer.valueOf(yh7Var.i)));
    }

    @Override // nc8
    public final TextureView J() {
        return null;
    }

    @Override // fd1
    public final long K() {
        g6b g6bVar = ((z8b) this.b).b2;
        if (g6bVar == null) {
            return 0L;
        }
        return (long) (g6bVar.a0 * g6bVar.h0);
    }

    @Override // nc8
    public final void L(k47 k47Var) {
        lr8 lr8Var = ((ProfileActivity) this.b).n0;
        if (lr8Var == null || !lr8Var.a) {
            return;
        }
        lr8Var.L.e(true, 0.0f);
        lr8Var.invalidate();
    }

    public final void M(uv6 uv6Var, zu6 zu6Var, ArrayList arrayList) {
        wz4 wz4Var = (wz4) this.b;
        if (uv6Var != wz4Var.y || zu6Var == null) {
            if (uv6Var == wz4Var.e) {
                if (zu6Var != null) {
                    wz4Var.n(wz4Var.d, zu6Var);
                }
                wz4Var.d.n(arrayList);
                return;
            }
            return;
        }
        dw6 dw6Var = wz4Var.x.a;
        String d = zu6Var.d();
        ew6 ew6Var = new ew6(dw6Var, d, wz4Var.b(dw6Var, d), false);
        ew6Var.i(zu6Var);
        if (wz4Var.d != ew6Var) {
            wz4Var.h(wz4Var, ew6Var, wz4Var.y, 3, wz4Var.x, arrayList);
            wz4Var.x = null;
            wz4Var.y = null;
        }
    }

    @Override // fd1
    public final long N() {
        g6b g6bVar = ((z8b) this.b).b2;
        if (g6bVar == null) {
            return 0L;
        }
        return (long) (g6bVar.Z * g6bVar.h0);
    }

    @Override // zv7
    public final void O(float f) {
        sa8 sa8Var = (sa8) this.b;
        m58.e(sa8Var.F1).k(String.valueOf(u11.a.indexOf(sa8Var.M0.getCurrentBrush())), f);
        oeb oebVar = sa8Var.A1;
        oebVar.c = f;
        sa8Var.u0(oebVar, null);
    }

    @Override // fd1
    public final void P(kd1 kd1Var) {
        ((z8b) this.b).a0(kd1Var);
    }

    public final void Q(String str, Bitmap bitmap) {
        qt qtVar = MediaMetadataCompat.d;
        if (!qtVar.containsKey(str) || ((Integer) qtVar.get(str)).intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
        } else {
            u36.j(kt6.o("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    @Override // fd1
    public final void R(long j) {
        h74 h74Var;
        k9b k9bVar = ((z8b) this.b).W1;
        if (k9bVar != null) {
            ndc ndcVar = k9bVar.e;
            if (ndcVar == null || ((h74Var = ndcVar.d) != null && h74Var.c0())) {
                k9bVar.m(j);
            }
        }
    }

    @Override // fd1
    public final void S(w44 w44Var) {
        ((z8b) this.b).B0(w44Var);
    }

    public final void T(long j) {
        qt qtVar = MediaMetadataCompat.d;
        if (!qtVar.containsKey("android.media.metadata.DURATION") || ((Integer) qtVar.get("android.media.metadata.DURATION")).intValue() == 0) {
            ((Bundle) this.b).putLong("android.media.metadata.DURATION", j);
        } else {
            u36.j("The android.media.metadata.DURATION key cannot be used to put a long");
        }
    }

    public final void U(String str, String str2) {
        qt qtVar = MediaMetadataCompat.d;
        if (!qtVar.containsKey(str) || ((Integer) qtVar.get(str)).intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
        } else {
            u36.j(kt6.o("The ", str, " key cannot be used to put a String"));
        }
    }

    public final void V(long j, int i, long j2) {
        tl6 tl6Var = (tl6) this.b;
        tl6Var.q0.getClass();
        if (i == 128) {
            tl6Var.k(i).h = null;
            tl6Var.k(i).i = null;
            return;
        }
        if (i == 160) {
            tl6Var.f0 = false;
            tl6Var.g0 = 0L;
            return;
        }
        if (i == 174) {
            sl6 sl6Var = new sl6();
            sl6Var.o = -1;
            sl6Var.p = -1;
            sl6Var.q = -1;
            sl6Var.r = -1;
            sl6Var.s = -1;
            sl6Var.t = 0;
            sl6Var.u = -1;
            sl6Var.v = 0.0f;
            sl6Var.w = 0.0f;
            sl6Var.x = 0.0f;
            sl6Var.y = null;
            sl6Var.z = -1;
            sl6Var.A = -1;
            sl6Var.B = -1;
            sl6Var.C = -1;
            sl6Var.D = 1000;
            sl6Var.E = nm7.d3;
            sl6Var.F = -1.0f;
            sl6Var.G = -1.0f;
            sl6Var.H = -1.0f;
            sl6Var.I = -1.0f;
            sl6Var.J = -1.0f;
            sl6Var.K = -1.0f;
            sl6Var.L = -1.0f;
            sl6Var.M = -1.0f;
            sl6Var.N = -1.0f;
            sl6Var.O = -1.0f;
            sl6Var.Q = 1;
            sl6Var.R = -1;
            sl6Var.S = -1;
            sl6Var.T = 8000;
            sl6Var.U = 0L;
            sl6Var.V = 0L;
            sl6Var.X = false;
            sl6Var.b0 = true;
            sl6Var.c0 = "eng";
            tl6Var.B = sl6Var;
            sl6Var.a = tl6Var.y;
            return;
        }
        if (i == 187) {
            if (tl6Var.C) {
                return;
            }
            tl6Var.g(i);
            tl6Var.H = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            tl6Var.D = -1;
            tl6Var.E = -1L;
            return;
        }
        if (i == 20533) {
            tl6Var.h(i);
            tl6Var.B.j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = tl6Var.u;
            if (j3 != -1 && j3 != j) {
                throw bx7.a("Multiple Segment elements not supported", null);
            }
            tl6Var.u = j;
            tl6Var.t = j2;
            return;
        }
        if (i == 475249515) {
            if (tl6Var.C) {
                return;
            }
            tl6Var.G = true;
            return;
        }
        if (i == 524531317) {
            if (tl6Var.P == -1 || tl6Var.S) {
                tl6Var.m();
                return;
            } else {
                tl6Var.Q = true;
                return;
            }
        }
        if (i == 182) {
            pl6 pl6Var = new pl6();
            pl6Var.b = -9223372036854775807L;
            pl6Var.c = -9223372036854775807L;
            tl6Var.A = pl6Var;
            return;
        }
        if (i != 183 || tl6Var.C) {
            return;
        }
        tl6Var.g(i);
        tl6Var.I = -1;
        tl6Var.J = -1L;
        tl6Var.K = -1L;
    }

    public final void W(int i, String str) {
        tl6 tl6Var = (tl6) this.b;
        if (i == 133) {
            tl6Var.k(i).h = str;
            return;
        }
        if (i == 134) {
            tl6Var.h(i);
            tl6Var.B.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                tl6Var.y = str.equals("webm");
                return;
            }
            throw bx7.a("DocType " + str + " not supported", null);
        }
        if (i == 17276) {
            tl6Var.k(i).i = str;
            return;
        }
        if (i == 21358) {
            tl6Var.h(i);
            tl6Var.B.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            tl6Var.h(i);
            tl6Var.B.c0 = str;
        }
    }

    @Override // kb1
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override // uj2
    public final boolean a1(float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        View view = null;
        ej6Var.P = null;
        int childCount = ej6Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = ej6Var.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                view = childAt;
                break;
            }
            childCount--;
        }
        return (view == null || ej6Var.Q.contains(view)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x026c, code lost:
    
        throw bx7.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, vb3 vb3Var) {
        int i3;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        long j;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        tl6 tl6Var = (tl6) this.b;
        dbc dbcVar = tl6Var.b;
        SparseArray sparseArray = tl6Var.c;
        yw7 yw7Var = tl6Var.m;
        yw7 yw7Var2 = tl6Var.k;
        byte b3 = 2;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (tl6Var.V == 2) {
                    sl6 sl6Var = (sl6) sparseArray.get(tl6Var.b0);
                    int i12 = tl6Var.e0;
                    yw7 yw7Var3 = tl6Var.r;
                    if (i12 != 4 || !"V_VP9".equals(sl6Var.c)) {
                        vb3Var.m(i2, false);
                        return;
                    }
                    yw7Var3.K(i2);
                    vb3Var.c(yw7Var3.a, 0, i2, false);
                    if (tl6Var.f) {
                        return;
                    }
                    byte[] bArr = yw7Var3.a;
                    byte[] bArr2 = jl2.d;
                    if (i2 >= bArr2.length) {
                        for (int i13 = 0; i13 < bArr2.length; i13++) {
                            if (bArr[i13] != bArr2[i13]) {
                                return;
                            }
                        }
                        yw7Var3.K(0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 16877) {
                tl6Var.h(i);
                sl6 sl6Var2 = tl6Var.B;
                int i14 = sl6Var2.i;
                if (i14 != 1685485123 && i14 != 1685480259) {
                    vb3Var.m(i2, false);
                    return;
                }
                byte[] bArr3 = new byte[i2];
                sl6Var2.P = bArr3;
                vb3Var.c(bArr3, 0, i2, false);
                return;
            }
            if (i == 16981) {
                tl6Var.h(i);
                byte[] bArr4 = new byte[i2];
                tl6Var.B.k = bArr4;
                vb3Var.c(bArr4, 0, i2, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr5 = new byte[i2];
                vb3Var.c(bArr5, 0, i2, false);
                tl6Var.h(i);
                tl6Var.B.l = new xzb(1, 0, 0, bArr5);
                return;
            }
            if (i == 21419) {
                Arrays.fill(yw7Var.a, (byte) 0);
                vb3Var.c(yw7Var.a, 4 - i2, i2, false);
                yw7Var.N(0);
                tl6Var.D = (int) yw7Var.C();
                return;
            }
            if (i == 25506) {
                tl6Var.h(i);
                byte[] bArr6 = new byte[i2];
                tl6Var.B.m = bArr6;
                vb3Var.c(bArr6, 0, i2, false);
                return;
            }
            if (i != 30322) {
                throw bx7.a("Unexpected id: " + i, null);
            }
            tl6Var.h(i);
            byte[] bArr7 = new byte[i2];
            tl6Var.B.y = bArr7;
            vb3Var.c(bArr7, 0, i2, false);
            return;
        }
        int i15 = 8;
        if (tl6Var.V == 0) {
            tl6Var.b0 = (int) dbcVar.d(vb3Var, false, true, 8);
            tl6Var.c0 = dbcVar.b;
            tl6Var.X = -9223372036854775807L;
            tl6Var.V = (byte) 1;
            yw7Var2.K(0);
        }
        sl6 sl6Var3 = (sl6) sparseArray.get(tl6Var.b0);
        if (sl6Var3 == null) {
            vb3Var.m(i2 - tl6Var.c0, false);
            tl6Var.V = (byte) 0;
            return;
        }
        sl6Var3.d0.getClass();
        if (tl6Var.V == 1) {
            tl6Var.n(vb3Var, 3);
            int i16 = (yw7Var2.a[2] & 6) >> 1;
            if (i16 == 0) {
                tl6Var.Z = 1;
                int[] iArr2 = tl6Var.a0;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length << 1, 1)];
                }
                tl6Var.a0 = iArr2;
                iArr2[0] = (i2 - tl6Var.c0) - 3;
            } else {
                tl6Var.n(vb3Var, 4);
                int i17 = (yw7Var2.a[3] & nm7.d4) + 1;
                tl6Var.Z = i17;
                int[] iArr3 = tl6Var.a0;
                if (iArr3 == null) {
                    iArr3 = new int[i17];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i17) {
                        iArr3 = new int[Math.max(iArr3.length << 1, i17)];
                    }
                }
                tl6Var.a0 = iArr3;
                if (i16 == 2) {
                    int i18 = (i2 - tl6Var.c0) - 4;
                    int i19 = tl6Var.Z;
                    Arrays.fill(iArr3, 0, i19, i18 / i19);
                } else if (i16 == 1) {
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = i3;
                    while (true) {
                        i8 = tl6Var.Z - 1;
                        iArr = tl6Var.a0;
                        if (i20 >= i8) {
                            break;
                        }
                        iArr[i20] = 0;
                        while (true) {
                            i9 = i22 + 1;
                            tl6Var.n(vb3Var, i9);
                            int i23 = yw7Var2.a[i22] & 255;
                            int[] iArr4 = tl6Var.a0;
                            i10 = iArr4[i20] + i23;
                            iArr4[i20] = i10;
                            if (i23 != 255) {
                                break;
                            } else {
                                i22 = i9;
                            }
                        }
                        i21 += i10;
                        i20++;
                        i22 = i9;
                    }
                    iArr[i8] = td4.f(i2, tl6Var.c0, i22, i21);
                } else {
                    if (i16 != 3) {
                        throw bx7.a("Unexpected lacing value: " + i16, null);
                    }
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = i3;
                    while (true) {
                        int i27 = tl6Var.Z - 1;
                        int[] iArr5 = tl6Var.a0;
                        if (i24 >= i27) {
                            b = b3;
                            i4 = i11;
                            iArr5[i27] = td4.f(i2, tl6Var.c0, i26, i25);
                            break;
                        }
                        iArr5[i24] = i11;
                        int i28 = i26 + 1;
                        tl6Var.n(vb3Var, i28);
                        if (yw7Var2.a[i26] == 0) {
                            throw bx7.a("No valid varint length mask found", null);
                        }
                        int i29 = i11;
                        while (true) {
                            if (i29 >= i15) {
                                i5 = i15;
                                b2 = b3;
                                i6 = i11;
                                j = 0;
                                i7 = i28;
                                break;
                            }
                            i5 = i15;
                            int i30 = 1 << (7 - i29);
                            i6 = i11;
                            if ((yw7Var2.a[i26] & i30) != 0) {
                                i7 = i28 + i29;
                                tl6Var.n(vb3Var, i7);
                                b2 = b3;
                                j = yw7Var2.a[i26] & 255 & (~i30);
                                while (i28 < i7) {
                                    j = (j << i5) | (yw7Var2.a[i28] & 255);
                                    i28++;
                                }
                                if (i24 > 0) {
                                    j -= (1 << ((i29 * 7) + 6)) - 1;
                                }
                            } else {
                                i29++;
                                i11 = i6;
                                i15 = i5;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i31 = (int) j;
                        int[] iArr6 = tl6Var.a0;
                        if (i24 != 0) {
                            i31 += iArr6[i24 - 1];
                        }
                        iArr6[i24] = i31;
                        i25 += i31;
                        i24++;
                        i26 = i7;
                        i11 = i6;
                        i15 = i5;
                        b3 = b2;
                    }
                }
            }
            b = 2;
            i4 = 0;
            byte[] bArr8 = yw7Var2.a;
            tl6Var.W = tl6Var.p((bArr8[i4] << 8) | (bArr8[1] & 255)) + tl6Var.T;
            tl6Var.d0 = (sl6Var3.f == 1 || (i == 163 && (yw7Var2.a[b] & 128) == 128)) ? 1 : i4;
            tl6Var.V = b;
            tl6Var.Y = i4;
        }
        if (i == 163) {
            while (true) {
                int i32 = tl6Var.Y;
                if (i32 >= tl6Var.Z) {
                    tl6Var.V = (byte) 0;
                    return;
                } else {
                    tl6Var.i(sl6Var3, ((tl6Var.Y * sl6Var3.g) / 1000) + tl6Var.W, tl6Var.d0, tl6Var.r(vb3Var, sl6Var3, tl6Var.a0[i32], false), 0);
                    tl6Var.Y++;
                }
            }
        } else {
            while (true) {
                int i33 = tl6Var.Y;
                if (i33 >= tl6Var.Z) {
                    return;
                }
                int[] iArr7 = tl6Var.a0;
                iArr7[i33] = tl6Var.r(vb3Var, sl6Var3, iArr7[i33], true);
                tl6Var.Y++;
            }
        }
    }

    @Override // uj2
    public final boolean b2() {
        return true;
    }

    @Override // uj2
    public final boolean c1(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        gm.r(ej6Var.I);
        ej6Var.setSkipDrawSelector(true);
        ej6Var.m(true, false, f);
        ej6Var.invalidate();
        ej6Var.R.a(true, true);
        return true;
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        ch4 ch4Var = (ch4) this.b;
        if (view instanceof ida) {
            ch4Var.f(((ida) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof lda) {
            ch4Var.f(((lda) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof eda) {
            ch4Var.f(((eda) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof lx2) {
            ch4Var.f(((lx2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof hg3) {
            if (!ch4Var.p0.u()) {
                hg3 hg3Var = (hg3) view;
                if (hg3Var.Z(f)) {
                    ch4Var.j0.w(hg3Var);
                    return true;
                }
            }
            ch4Var.f(((hg3) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // v78
    public final void e() {
        d88 d88Var = (d88) this.b;
        d88Var.a.c0();
        d88Var.b.c0();
    }

    @Override // udc
    public final void f(float f) {
        ya8 ya8Var;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        if (photoViewer.G2 != null || ((ya8Var = photoViewer.g0) != null && ya8Var.y)) {
            if (!photoViewer.G8 && photoViewer.W7.getVisibility() == 0) {
                f = ((photoViewer.X7.getRightProgress() - photoViewer.X7.getLeftProgress()) * f) + photoViewer.X7.getLeftProgress();
            }
            if (photoViewer.z0() == -9223372036854775807L) {
                photoViewer.a3 = f;
            } else {
                photoViewer.C1((int) (f * r0));
            }
            photoViewer.l2(false);
            photoViewer.u3 = false;
        }
    }

    @Override // uj2
    public final boolean f0() {
        return false;
    }

    @Override // zy2
    public final void g(wy2 wy2Var) {
        ml7 ml7Var = (ml7) this.b;
        ml7Var.x1 = true;
        String str = wy2Var.c;
        ml7Var.H1.setText(str);
        ml7Var.G0(str, wy2Var);
        ml7Var.x1 = false;
        gm.d3(new kl7(this, (byte) 0), 300L);
        ml7Var.J1.requestFocus();
        ll7 ll7Var = ml7Var.J1;
        ll7Var.setSelection(ll7Var.length());
    }

    @Override // zv7
    public final float get() {
        sa8 sa8Var = (sa8) this.b;
        u11 currentBrush = sa8Var.M0.getCurrentBrush();
        int i = sa8Var.F1;
        return currentBrush == null ? m58.e(i).i : m58.e(i).f(String.valueOf(u11.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        return " ";
    }

    @Override // uj2
    public final long getLongPressDuration() {
        return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
    }

    @Override // udc
    public final void h(float f) {
        ka8 ka8Var;
        ka8 ka8Var2;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        ya8 ya8Var = photoViewer.g0;
        if (ya8Var != null && ya8Var.y && (ka8Var2 = photoViewer.s3) != null) {
            int i = photoViewer.q3.h - vdc.S;
            ka8Var2.O = ya8Var;
            if (ka8Var2.a0 != 0) {
                ka8Var2.a0 = 0L;
                ka8Var2.g0 = null;
                ka8Var2.f0 = null;
                ka8Var2.e0 = null;
                ka8Var2.b(-1);
            }
            if (i != 0) {
                ka8Var2.r = i;
                int i2 = ((int) (i * f)) / 5;
                if (ka8Var2.n != i2) {
                    ka8Var2.n = i2;
                }
            }
            ka8Var2.E = gm.g0((int) (((long) (ya8Var.getVideoDuration() * f)) / 1000), false, false);
            ka8Var2.F = (int) Math.ceil(ka8Var2.G.measureText(r0));
            ka8Var2.invalidate();
            if (ka8Var2.f != null) {
                Utilities.e.a(ka8Var2.f);
            }
            double videoDuration = (f * ya8Var.getVideoDuration()) / 1000.0d;
            ka8Var2.P = videoDuration;
            String b = ya8Var.b((int) videoDuration);
            if (b != null) {
                ka8Var2.R.e0(b, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (ka8Var = photoViewer.s3) != null) {
            ka8Var.e(photoViewer.S4, f, photoViewer.q3.h - vdc.S);
        }
        ((PhotoViewer) this.b).l2(true);
        ((PhotoViewer) this.b).R2();
    }

    @Override // o7
    public final void h2() {
        w78 w78Var = (w78) this.b;
        w78Var.R.setText(jb6.M0(w78Var.Z ? 2131745080 : 2131745079, null));
        w78Var.R.setIcon(w78Var.Z ? R.drawable.msg_media : R.drawable.msg_list);
    }

    @Override // i59
    public final void i() {
        ((ch4) this.b).j0.finish();
    }

    @Override // tcc
    public final void invalidate() {
        ((tl4) this.b).m.invalidate();
    }

    @Override // uj2
    public final void j(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        ej6Var.m(false, true, f);
        gm.d3(ej6Var.I, 450L);
        View view2 = ej6Var.P;
        if (view2 != null) {
            view2.performClick();
        }
        ej6Var.P = null;
        ej6Var.invalidate();
        ej6Var.R.a(false, true);
    }

    @Override // cx9
    public final int j0() {
        return 0;
    }

    @Override // i59
    public final void k(float f) {
        ((ch4) this.b).j0.j(f);
    }

    @Override // i68
    public final void m(ArrayList arrayList) {
        ((wn5) this.b).e(arrayList, false);
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        k86 k86Var = (k86) this.b;
        m86 m86Var = k86Var.E;
        int round = Math.round(f * 100.0f);
        if (round != e86.c()) {
            e86.g = pqe.b(round, 0, 100);
            e86.k();
            e86.d(false);
            m86Var.d0();
            ArrayList arrayList = m86Var.s;
            if (arrayList.isEmpty()) {
                m86Var.c0();
            } else if (arrayList.size() >= 2) {
                arrayList.set(1, new g86(2, 0, 0, 0, e86.c() <= 0 ? jb6.M0(2131748628, null) : e86.c() >= 100 ? jb6.M0(2131748627, null) : jb6.a0(null, null, 2131748629, String.format("%d%%", Integer.valueOf(e86.c())))));
                m86Var.d.g(1);
            }
            if (round <= 0 || round >= 100) {
                try {
                    k86Var.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // fd1
    public final void o(boolean z) {
        k9b k9bVar = ((z8b) this.b).W1;
        if (k9bVar != null) {
            k9bVar.x(-8713, z);
        }
    }

    @Override // gec
    public final void onFirstFrameRendered() {
        ym6 ym6Var = (ym6) this.b;
        Surface surface = ym6Var.v1;
        if (surface != null) {
            ym6Var.c1.p(surface);
            ym6Var.y1 = true;
        }
    }

    @Override // ldc
    public final void onStateChanged(boolean z, int i) {
        cl8 cl8Var = (cl8) this.b;
        ndc ndcVar = cl8Var.y;
        if (ndcVar == null) {
            return;
        }
        boolean c0 = ndcVar.c0();
        bl8 bl8Var = cl8Var.N;
        if (c0) {
            gm.c3(bl8Var);
        } else {
            gm.r(bl8Var);
        }
    }

    @Override // ldc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ldc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        ao9 ao9Var = ((cl8) this.b).x;
        if (ao9Var != null) {
            float f2 = i / i2;
            if (Math.abs(ao9Var.A0 - f2) >= 1.0E-4f) {
                ao9Var.A0 = f2;
                ao9Var.requestLayout();
            }
        }
    }

    @Override // nc8
    public final void p(k47 k47Var) {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        profileActivity.a.J0(true);
        wp8 wp8Var = profileActivity.O;
        if (wp8Var != null && wp8Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.d1.setBackgroundColor(on2.f(0.1f, profileActivity.Z1(profileActivity.e5.f), cmb.v0(cmb.Z6, profileActivity.A0)));
    }

    @Override // fd1
    public final FrameLayout q() {
        return ((z8b) this.b).C1;
    }

    @Override // uj2
    public final void r(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        ej6Var.m(false, true, f);
        gm.d3(ej6Var.I, 450L);
        ej6Var.P = null;
        ej6Var.invalidate();
        ej6Var.R.a(false, true);
    }

    @Override // jca
    public final void s() {
        byte b = this.a;
    }

    @Override // fd1
    public final ylb t() {
        return ((z8b) this.b).w1;
    }

    @Override // i68
    public final void t0() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((wn5) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // fd1
    public final kd1 u() {
        z8b z8bVar = (z8b) this.b;
        z8bVar.f2 = true;
        return z8bVar.e0();
    }

    @Override // gec
    public final void w() {
        ym6 ym6Var = (ym6) this.b;
        if (ym6Var.v1 != null) {
            ym6Var.Y0(0, 1);
        }
    }

    @Override // gec
    public final void y() {
        l74 l74Var = ((ym6) this.b).Y;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    @Override // ldc
    public final void onRenderedFirstFrame() {
    }

    private final void c() {
    }

    private final void z() {
    }

    @Override // kb1
    public final void onDismiss() {
    }

    @Override // uj2
    public final void q0() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // uj2
    public final void y0() {
    }

    @Override // o7
    public final void z0() {
    }

    @Override // gec
    public final void a(jec jecVar) {
    }

    @Override // ldc
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekFinished(tk tkVar) {
    }

    @Override // ldc
    public final void onSeekStarted(tk tkVar) {
    }

    @Override // ldc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // kb1
    public final void v(String str) {
    }

    public /* synthetic */ k44(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public k44(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 17;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        mx6.D(bundle);
    }

    @Override // uj2
    public final void I(float f, float f2) {
    }

    @Override // uj2
    public final void l(float f, float f2) {
    }

    @Override // ldc
    public final void onError(ndc ndcVar, Exception exc) {
    }
}
