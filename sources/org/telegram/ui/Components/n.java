package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.location.LocationResult;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class n implements t4, tj0, uy, org.telegram.ui.nm0, org.telegram.messenger.lc, jg.y1, yr0, u61, org.telegram.ui.r9, te.b, tg.c, tg.l1, u2.m, com.google.android.gms.common.api.internal.n, q5.b {
    public final Object a;

    public /* synthetic */ n(Object obj) {
        this.a = obj;
    }

    public static n x(float f10, int i7) {
        Point point = org.telegram.messenger.g0.q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new n(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new n(i10, i11, i11, i10);
        }
        return (i7 == 1) == (i10 < i11) ? new n(i10, i11, new int[0]) : new n(i11, i10, new int[0]);
    }

    public void A(long j3, int i7, long j10) {
        x3.f fVar = (x3.f) this.a;
        fVar.j0.getClass();
        if (i7 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i7 == 174) {
            x3.e eVar = new x3.e();
            eVar.n = -1;
            eVar.o = -1;
            eVar.p = -1;
            eVar.q = -1;
            eVar.r = -1;
            eVar.s = 0;
            eVar.t = -1;
            eVar.u = 0.0f;
            eVar.v = 0.0f;
            eVar.w = 0.0f;
            eVar.x = null;
            eVar.y = -1;
            eVar.z = false;
            eVar.A = -1;
            eVar.B = -1;
            eVar.C = -1;
            eVar.D = 1000;
            eVar.E = org.telegram.messenger.qs.e3;
            eVar.F = -1.0f;
            eVar.G = -1.0f;
            eVar.H = -1.0f;
            eVar.I = -1.0f;
            eVar.J = -1.0f;
            eVar.K = -1.0f;
            eVar.L = -1.0f;
            eVar.M = -1.0f;
            eVar.N = -1.0f;
            eVar.O = -1.0f;
            eVar.Q = 1;
            eVar.R = -1;
            eVar.S = 8000;
            eVar.T = 0L;
            eVar.U = 0L;
            eVar.W = false;
            eVar.Y = true;
            eVar.Z = "eng";
            fVar.y = eVar;
            eVar.a = fVar.w;
            return;
        }
        if (i7 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i7 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i7 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i7 == 20533) {
            fVar.h(i7);
            fVar.y.i = true;
            return;
        }
        if (i7 == 21968) {
            fVar.h(i7);
            fVar.y.z = true;
            return;
        }
        if (i7 == 408125543) {
            long j11 = fVar.s;
            if (j11 != -1 && j11 != j3) {
                throw e2.t0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j3;
            fVar.r = j10;
            return;
        }
        if (i7 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i7 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.f(new f3.t(fVar.v));
                fVar.z = true;
            }
        }
    }

    public void B(int i7, String str) {
        x3.f fVar = (x3.f) this.a;
        if (i7 == 134) {
            fVar.h(i7);
            fVar.y.c = str;
            return;
        }
        if (i7 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw e2.t0.a(null, "DocType " + str + " not supported");
        }
        if (i7 == 21358) {
            fVar.h(i7);
            fVar.y.b = str;
        } else {
            if (i7 != 2274716) {
                return;
            }
            fVar.h(i7);
            fVar.y.Z = str;
        }
    }

    @Override // te.b
    public void F(float f10, int i7) {
        ((te.h) this.a).f(f10);
    }

    @Override // org.telegram.ui.Components.yr0
    public void G() {
        ((l60) this.a).k();
    }

    @Override // org.telegram.ui.Components.yr0
    public org.telegram.ui.ActionBar.z0 H(String str) {
        org.telegram.ui.ActionBar.z0 h = ((l60) this.a).h();
        h.setText(str);
        return h;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        g0 g0Var = (g0) this.a;
        g0Var.q1(i7, i10, z9);
        g0Var.dismiss();
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.a;
        try {
            x0Var.P = System.currentTimeMillis();
            x0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.lc
    public void O(ImageReceiver imageReceiver) {
        pf0 pf0Var = ((sf0) this.a).h.G0;
        if (pf0Var != null) {
            pf0Var.d();
        }
    }

    @Override // org.telegram.ui.r9
    public String R0() {
        return ((org.telegram.ui.web.x0) this.a).i0;
    }

    @Override // tg.l1
    public void X(float f10) {
        ((tg.c2) this.a).setOutlineWidth(f10);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((te.h) this.a).f(f10);
    }

    @Override // u2.m
    public void a(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.a).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override // u2.m
    public void b(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i7, 0, dVar.i, j3, i10);
    }

    @Override // org.telegram.ui.Components.yr0
    public org.telegram.ui.ActionBar.z0 b0(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        l60 l60Var = (l60) this.a;
        int x10 = l60Var.x();
        l60Var.c(i7, str, new bi.u7(runnable, z10, l60Var, 25), z9);
        View w10 = l60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.z0) {
            return (org.telegram.ui.ActionBar.z0) w10;
        }
        return null;
    }

    @Override // org.telegram.ui.nm0
    public void c(ArrayList arrayList) {
        k30.a((k30) this.a, false, arrayList);
    }

    @Override // org.telegram.ui.Components.tj0
    public void d(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.a;
        chatAttachAlertPhotoLayout.L = z9 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean e(int i7) {
        return ((ChatAttachAlertPhotoLayout) this.a).G.d(i7) == 0;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void f(Object obj) {
        LocationResult locationResult = (LocationResult) this.a;
        org.telegram.messenger.ra raVar = ((org.telegram.messenger.z9) obj).a;
        List list = locationResult.a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        g6.d0 d0Var = (g6.d0) raVar;
        if (location == null) {
            d0Var.getClass();
        } else {
            ((org.telegram.messenger.sd) d0Var.b).m(location);
        }
    }

    @Override // tg.c
    public void g() {
        ((org.telegram.ui.wp0) this.a).r0(null, true);
    }

    @Override // fd.a
    public Object get() {
        String packageName = ((Context) ((fd.a) this.a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Components.uy
    public float getBlurAngle() {
        return ((org.telegram.messenger.hf) this.a).t;
    }

    @Override // org.telegram.ui.Components.uy
    public float getBlurExcludeBlurSize() {
        return ((org.telegram.messenger.hf) this.a).s;
    }

    @Override // org.telegram.ui.Components.uy
    public PointF getBlurExcludePoint() {
        return ((org.telegram.messenger.hf) this.a).r;
    }

    @Override // org.telegram.ui.Components.uy
    public float getBlurExcludeSize() {
        return ((org.telegram.messenger.hf) this.a).q;
    }

    @Override // org.telegram.ui.Components.uy
    public int getBlurType() {
        return ((org.telegram.messenger.hf) this.a).n;
    }

    @Override // org.telegram.ui.Components.uy
    public float getContrastValue() {
        return com.google.android.recaptcha.internal.a.c(((org.telegram.messenger.hf) this.a).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.uy
    public float getEnhanceValue() {
        return ((org.telegram.messenger.hf) this.a).a / 100.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getExposureValue() {
        return ((org.telegram.messenger.hf) this.a).c / 100.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getFadeValue() {
        return ((org.telegram.messenger.hf) this.a).g / 100.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getGrainValue() {
        return (((org.telegram.messenger.hf) this.a).m / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(((org.telegram.messenger.hf) this.a).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.uy
    public float getSaturationValue() {
        float f10 = ((org.telegram.messenger.hf) this.a).f / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(((org.telegram.messenger.hf) this.a).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.uy
    public float getSharpenValue() {
        return com.google.android.recaptcha.internal.a.c(((org.telegram.messenger.hf) this.a).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.uy
    public float getSoftenSkinValue() {
        return ((org.telegram.messenger.hf) this.a).b / 100.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public int getTintHighlightsColor() {
        return ((org.telegram.messenger.hf) this.a).i;
    }

    @Override // org.telegram.ui.Components.uy
    public float getTintHighlightsIntensityValue() {
        return ((org.telegram.messenger.hf) this.a).i == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.uy
    public int getTintShadowsColor() {
        return ((org.telegram.messenger.hf) this.a).h;
    }

    @Override // org.telegram.ui.Components.uy
    public float getTintShadowsIntensityValue() {
        return ((org.telegram.messenger.hf) this.a).h == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getVignetteValue() {
        return ((org.telegram.messenger.hf) this.a).l / 100.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public float getWarmthValue() {
        return ((org.telegram.messenger.hf) this.a).e / 100.0f;
    }

    @Override // org.telegram.ui.Components.uy
    public ByteBuffer h() {
        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) this.a;
        hfVar.p.q();
        return (ByteBuffer) hfVar.p.f;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, org.telegram.ui.j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void j(View view, boolean z9) {
        if (z9 == ((ChatAttachAlertPhotoLayout) this.a).K && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.y.d(q5Var);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean k(int i7) {
        org.telegram.messenger.gf M = ((ChatAttachAlertPhotoLayout) this.a).G.M(i7);
        return M != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(M.C));
    }

    @Override // jg.y1
    public boolean k1(int i7) {
        return i7 == ((ko0) this.a).r;
    }

    @Override // tg.c
    public tg.j l() {
        return ((org.telegram.ui.wp0) this.a).B0;
    }

    @Override // org.telegram.ui.nm0
    public void m() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((k30) this.a).a.startActivityForResult(intent, 14);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.uy
    public boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.uy
    public boolean o() {
        return !((org.telegram.messenger.hf) this.a).p.F();
    }

    @Override // org.telegram.ui.r9
    public void onDismiss() {
        org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.a;
        x0Var.y("scan_qr_popup_closed", null);
        x0Var.h0 = false;
    }

    public void p(int i7, int i10, f3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        int i17;
        int i18;
        int i19;
        x3.f fVar = (x3.f) this.a;
        x3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        h2.x xVar = fVar.k;
        h2.x xVar2 = fVar.i;
        int i20 = 2;
        int i21 = 0;
        int i22 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                x3.e eVar = (x3.e) sparseArray.get(fVar.U);
                int i23 = fVar.X;
                h2.x xVar3 = fVar.p;
                if (i23 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.s(i10);
                    return;
                } else {
                    xVar3.K(i10);
                    pVar.readFully(xVar3.a, 0, i10);
                    return;
                }
            }
            if (i7 == 16877) {
                fVar.h(i7);
                x3.e eVar2 = fVar.y;
                int i24 = eVar2.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.s(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i10);
                return;
            }
            if (i7 == 16981) {
                fVar.h(i7);
                byte[] bArr2 = new byte[i10];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i10];
                pVar.readFully(bArr3, 0, i10);
                fVar.h(i7);
                fVar.y.k = new f3.i0(1, 0, 0, bArr3);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i10, i10);
                xVar.N(0);
                fVar.A = (int) xVar.C();
                return;
            }
            if (i7 == 25506) {
                fVar.h(i7);
                byte[] bArr4 = new byte[i10];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i7 != 30322) {
                throw e2.t0.a(null, "Unexpected id: " + i7);
            }
            fVar.h(i7);
            byte[] bArr5 = new byte[i10];
            fVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i10);
            return;
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        x3.e eVar3 = (x3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.s(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i25 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i25 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i10 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i26 = (xVar2.a[3] & org.telegram.messenger.qs.e4) + 1;
                fVar.S = i26;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i26];
                } else if (iArr2.length < i26) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i26)];
                }
                fVar.T = iArr2;
                if (i25 == 2) {
                    int i27 = (i10 - fVar.V) - 4;
                    int i28 = fVar.S;
                    Arrays.fill(iArr2, 0, i28, i27 / i28);
                } else {
                    if (i25 != 1) {
                        if (i25 != 3) {
                            throw e2.t0.a(null, "Unexpected lacing value: " + i25);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = fVar.S - i22;
                            if (i29 >= i32) {
                                i11 = i20;
                                i12 = i21;
                                i13 = i22;
                                fVar.T[i32] = ((i10 - fVar.V) - i31) - i30;
                                break;
                            }
                            fVar.T[i29] = i21;
                            int i33 = i31 + 1;
                            fVar.l(pVar, i33);
                            if (xVar2.a[i31] == 0) {
                                throw e2.t0.a(null, "No valid varint length mask found");
                            }
                            int i34 = i21;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    i15 = i22;
                                    j3 = 0;
                                    i16 = i33;
                                    break;
                                }
                                int i35 = i22 << (7 - i34);
                                i14 = i20;
                                if ((xVar2.a[i31] & i35) != 0) {
                                    int i36 = i33 + i34;
                                    fVar.l(pVar, i36);
                                    i15 = i22;
                                    j3 = xVar2.a[i31] & b10 & (~i35);
                                    while (i33 < i36) {
                                        j3 = (j3 << 8) | (xVar2.a[i33] & b10);
                                        i33++;
                                        i36 = i36;
                                        b10 = 255;
                                    }
                                    i16 = i36;
                                    if (i29 > 0) {
                                        j3 -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i37 = (int) j3;
                            int[] iArr3 = fVar.T;
                            if (i29 != 0) {
                                i37 += iArr3[i29 - 1];
                            }
                            iArr3[i29] = i37;
                            i30 += i37;
                            i29++;
                            i21 = i34;
                            i20 = i14;
                            i22 = i15;
                            i31 = i16;
                            b10 = 255;
                        }
                        throw e2.t0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = 4;
                    while (true) {
                        i17 = fVar.S - 1;
                        if (i38 >= i17) {
                            break;
                        }
                        fVar.T[i38] = 0;
                        while (true) {
                            i18 = i40 + 1;
                            fVar.l(pVar, i18);
                            int i41 = xVar2.a[i40] & 255;
                            int[] iArr4 = fVar.T;
                            i19 = iArr4[i38] + i41;
                            iArr4[i38] = i19;
                            if (i41 != 255) {
                                break;
                            } else {
                                i40 = i18;
                            }
                        }
                        i39 += i19;
                        i38++;
                        i40 = i18;
                    }
                    fVar.T[i17] = ((i10 - fVar.V) - i40) - i39;
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            byte[] bArr6 = xVar2.a;
            fVar.P = fVar.n((bArr6[i13] & 255) | (bArr6[i12] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i13 || (i7 == 163 && (xVar2.a[i11] & 128) == 128)) ? 1 : i12;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i7 == 163) {
            while (true) {
                int i42 = fVar.R;
                if (i42 >= fVar.S) {
                    fVar.O = 0;
                    return;
                } else {
                    fVar.i(eVar3, ((fVar.R * eVar3.f) / 1000) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i42], false), 0);
                    fVar.R++;
                }
            }
        } else {
            while (true) {
                int i43 = fVar.R;
                if (i43 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i43] = fVar.o(pVar, eVar3, iArr5[i43], true);
                fVar.R++;
            }
        }
    }

    @Override // jg.y1
    public void q(int i7) {
        ko0 ko0Var = (ko0) this.a;
        no0 no0Var = ko0Var.K;
        ko0Var.s = i7;
        if (ko0Var.w != i7) {
            ko0Var.d.clear();
        }
        int i10 = ko0Var.J;
        if (ko0Var.b() != 0 || ko0Var.e.e() || ko0Var.I) {
            no0Var.p2.b(i10);
        } else {
            no0Var.I1.e(false, true);
        }
        ko0Var.f();
        int i11 = no0.Q2;
        no0Var.K0(true);
    }

    public boolean r(int i7) {
        n61 n61Var = ((w61) this.a).L;
        if (n61Var == null) {
            return false;
        }
        return n61Var.c(i7);
    }

    public s0.d s(int i7) {
        return null;
    }

    @Override // u2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0360, code lost:
    
        if (r10.equals("HOME") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewGroup t(Context context, int i7) {
        boolean z9;
        String str;
        zc0 zc0Var;
        org.telegram.messenger.f0 f0Var;
        int i10;
        String M0;
        String str2;
        bd0 bd0Var = (bd0) this.a;
        ArrayList arrayList = bd0Var.C1;
        ArrayList arrayList2 = bd0Var.D1;
        boolean z10 = i7 != 0;
        if (z10) {
            zc0 zc0Var2 = new zc0(context);
            TextView textView = new TextView(context);
            zc0Var2.a = textView;
            int i11 = org.telegram.ui.ActionBar.l6.G6;
            int i12 = bd0.F1;
            org.telegram.ui.ActionBar.g6 g6Var = bd0Var.I0;
            boolean z11 = bd0Var.A1;
            org.telegram.ui.ActionBar.s6.U(textView, i11, g6Var);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z12 = org.telegram.messenger.id.a0;
            zc0Var2.addView(textView, c8.ha.d(-1, -1.0f, (z12 ? 5 : 3) | 48, z12 ? z11 ? 17 : 64 : 72.0f, 10.0f, z12 ? 72.0f : z11 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(context);
            zc0Var2.b = textView2;
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.z6, bd0Var.I0);
            org.telegram.messenger.camera.q.n(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
            boolean z13 = org.telegram.messenger.id.a0;
            zc0Var2.addView(textView2, c8.ha.d(-2, -2.0f, z13 ? 5 : 3, z13 ? z11 ? 17 : 64 : 72.0f, 35.0f, z13 ? 72.0f : z11 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(context);
            zc0Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.m6, bd0Var.I0, PorterDuff.Mode.MULTIPLY);
            boolean z14 = org.telegram.messenger.id.a0;
            zc0Var2.addView(imageView, c8.ha.d(-2, -2.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 20.0f, 20.0f, z14 ? 20.0f : 0.0f, 0.0f));
            zc0Var = zc0Var2;
            if (!z11) {
                Switch r92 = new Switch(context, null);
                zc0Var2.d = r92;
                int i13 = org.telegram.ui.ActionBar.l6.M6;
                int i14 = org.telegram.ui.ActionBar.l6.N6;
                int i15 = org.telegram.ui.ActionBar.l6.d6;
                r92.d(i13, i14, i15, i15);
                zc0Var2.addView(r92, c8.ha.d(37, 40.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                zc0Var = zc0Var2;
            }
        } else {
            ?? ad0Var = new ad0(context);
            ad0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = bd0Var.E1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((org.telegram.messenger.f0) arrayList2.get(0)).c(true);
                z9 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z9 = true;
                    str = null;
                } else {
                    str = org.telegram.messenger.id.d0(bd0Var.a, tL_userContact_old2, null, null);
                    z9 = true;
                }
            }
            w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
            w8Var.u(org.telegram.messenger.g0.L(30.0f));
            w8Var.r(tL_userContact_old2);
            l9 l9Var = new l9(context);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            l9Var.e(tL_userContact_old2, w8Var);
            ad0Var.addView(l9Var, c8.ha.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.camera.q.m(textView3, 1, 17.0f);
            org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.j5, bd0Var.I0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(org.telegram.messenger.g5.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            ad0Var.addView(textView3, c8.ha.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            zc0Var = ad0Var;
            if (str != null) {
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.r5, bd0Var.I0);
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                ad0Var.addView(g10, c8.ha.t(-2, -2, 49, 10, 3, 10, z9 ? 27 : 11));
                zc0Var = ad0Var;
            }
        }
        if (z10) {
            zc0 zc0Var3 = zc0Var;
            int i16 = bd0Var.w1;
            char c10 = 2;
            if (i7 < i16 || i7 >= bd0Var.x1) {
                f0Var = (org.telegram.messenger.f0) arrayList.get(i7 - bd0Var.y1);
                int i17 = f0Var.c;
                if (i17 == 1) {
                    i10 = R.drawable.msg_mention;
                } else if (i17 == 2) {
                    i10 = R.drawable.msg_location;
                } else if (i17 == 3) {
                    i10 = R.drawable.msg_link;
                } else {
                    if (i17 != 4) {
                        if (i17 == 5) {
                            i10 = R.drawable.msg_calendar2;
                        } else if (i17 == 6) {
                            i10 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i10 = R.drawable.msg_info;
                }
            } else {
                f0Var = (org.telegram.messenger.f0) arrayList2.get(i7 - i16);
                i10 = R.drawable.msg_calls;
            }
            boolean z15 = i7 != bd0Var.v1 - 1;
            ImageView imageView2 = zc0Var3.c;
            zc0Var3.a.setText(f0Var.c(true));
            TextView textView4 = zc0Var3.b;
            int i18 = f0Var.c;
            if (i18 == 4) {
                str2 = org.telegram.messenger.id.M0(2131751787, null);
            } else if (i18 == 3) {
                str2 = org.telegram.messenger.id.M0(2131751781, null);
            } else if (i18 == 5) {
                str2 = org.telegram.messenger.id.M0(2131751803, null);
            } else if (i18 == 6) {
                str2 = "ORG".equalsIgnoreCase(f0Var.a(true)) ? org.telegram.messenger.id.M0(2131751792, null) : org.telegram.messenger.id.M0(2131751791, null);
            } else {
                int indexOf = f0Var.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = f0Var.b.substring(0, indexOf);
                    if (f0Var.c != 20) {
                        String[] split = substring.split(";");
                        for (int i19 = 0; i19 < split.length; i19++) {
                            if (split[i19].indexOf(61) < 0) {
                                substring = split[i19];
                            }
                        }
                        String substring2 = substring.startsWith("X-") ? substring.substring(2) : substring;
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case -2015525726:
                                if (substring2.equals("MOBILE")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2064738:
                                if (substring2.equals("CELL")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring2.equals("PREF")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2670353:
                                if (substring2.equals("WORK")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 75532016:
                                if (substring2.equals("OTHER")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                M0 = org.telegram.messenger.id.M0(2131747291, null);
                                break;
                            case 2:
                                M0 = org.telegram.messenger.id.M0(2131747293, null);
                                break;
                            case 3:
                                M0 = org.telegram.messenger.id.M0(2131747292, null);
                                break;
                            case 4:
                                M0 = org.telegram.messenger.id.M0(2131747281, null);
                                break;
                            case 5:
                                M0 = org.telegram.messenger.id.M0(2131747282, null);
                                break;
                            default:
                                M0 = substring2;
                                break;
                        }
                    } else {
                        M0 = substring.substring(2).split(";")[0];
                    }
                    str2 = M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase();
                }
            }
            textView4.setText(str2);
            Switch r82 = zc0Var3.d;
            if (r82 != null) {
                r82.c(f0Var.d, false);
            }
            imageView2.setImageResource(i10);
            zc0Var3.e = z15;
            zc0Var3.setWillNotDraw(!z15);
        }
        return zc0Var;
    }

    public String u(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            pa.d dVar = (pa.d) this.a;
            pa.e eVar = new pa.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public s0.d v(int i7) {
        return null;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    public void w(int i7, long j3) {
        x3.f fVar = (x3.f) this.a;
        if (i7 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            if (fVar.H == -1) {
                fVar.H = j3;
                return;
            }
            return;
        }
        if (i7 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i7);
            if (fVar.G == -1) {
                fVar.G = j3;
                return;
            }
            return;
        }
        if (i7 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw e2.t0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i7 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw e2.t0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i7) {
            case org.telegram.messenger.qs.P1 /* 131 */:
                int i10 = (int) j3;
                if (i10 == 1) {
                    fVar.h(i7);
                    fVar.y.e = 2;
                    return;
                }
                if (i10 == 2) {
                    fVar.h(i7);
                    fVar.y.e = 1;
                    return;
                } else if (i10 == 17) {
                    fVar.h(i7);
                    fVar.y.e = 3;
                    return;
                } else if (i10 != 33) {
                    fVar.h(i7);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i7);
                    fVar.y.e = 5;
                    return;
                }
            case org.telegram.messenger.qs.S1 /* 136 */:
                fVar.h(i7);
                fVar.y.Y = j3 == 1;
                return;
            case org.telegram.messenger.qs.l2 /* 155 */:
                fVar.Q = fVar.n(j3);
                return;
            case org.telegram.messenger.qs.p2 /* 159 */:
                fVar.h(i7);
                fVar.y.Q = (int) j3;
                return;
            case org.telegram.messenger.qs.G2 /* 176 */:
                fVar.h(i7);
                fVar.y.n = (int) j3;
                return;
            case org.telegram.messenger.qs.J2 /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i7);
                fVar.E = fVar.n(j3);
                return;
            case org.telegram.messenger.qs.Q2 /* 186 */:
                fVar.h(i7);
                fVar.y.o = (int) j3;
                return;
            case org.telegram.messenger.qs.s3 /* 215 */:
                fVar.h(i7);
                fVar.y.d = (int) j3;
                return;
            case org.telegram.messenger.qs.H3 /* 231 */:
                fVar.M = fVar.n(j3);
                return;
            case org.telegram.messenger.qs.N3 /* 238 */:
                fVar.X = (int) j3;
                return;
            case org.telegram.messenger.qs.W3 /* 247 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i7);
                fVar.F = (int) j3;
                return;
            case org.telegram.messenger.qs.a4 /* 251 */:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i7);
                fVar.y.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw e2.t0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw e2.t0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw e2.t0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw e2.t0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw e2.t0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                fVar.B = j3 + fVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                fVar.h(i7);
                if (i11 == 0) {
                    fVar.y.y = 0;
                    return;
                }
                if (i11 == 1) {
                    fVar.y.y = 2;
                    return;
                } else if (i11 == 3) {
                    fVar.y.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    fVar.y.y = 3;
                    return;
                }
            case 21680:
                fVar.h(i7);
                fVar.y.q = (int) j3;
                return;
            case 21682:
                fVar.h(i7);
                fVar.y.s = (int) j3;
                return;
            case 21690:
                fVar.h(i7);
                fVar.y.r = (int) j3;
                return;
            case 21930:
                fVar.h(i7);
                fVar.y.X = j3 == 1;
                return;
            case 21938:
                fVar.h(i7);
                x3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j3;
                return;
            case 21998:
                fVar.h(i7);
                fVar.y.g = (int) j3;
                return;
            case 22186:
                fVar.h(i7);
                fVar.y.T = j3;
                return;
            case 22203:
                fVar.h(i7);
                fVar.y.U = j3;
                return;
            case 25188:
                fVar.h(i7);
                fVar.y.R = (int) j3;
                return;
            case 30114:
                fVar.Z = j3;
                return;
            case 30321:
                fVar.h(i7);
                int i12 = (int) j3;
                if (i12 == 0) {
                    fVar.y.t = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.y.t = 1;
                    return;
                } else if (i12 == 2) {
                    fVar.y.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    fVar.y.t = 3;
                    return;
                }
            case 2352003:
                fVar.h(i7);
                fVar.y.f = (int) j3;
                return;
            case 2807729:
                fVar.t = j3;
                return;
            default:
                switch (i7) {
                    case 21945:
                        fVar.h(i7);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            fVar.y.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            fVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.h(i7);
                        int g10 = e2.m.g((int) j3);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i7);
                        fVar.y.z = true;
                        int f10 = e2.m.f((int) j3);
                        if (f10 != -1) {
                            fVar.y.A = f10;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i7);
                        fVar.y.D = (int) j3;
                        return;
                    case 21949:
                        fVar.h(i7);
                        fVar.y.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    public void y(float f10) {
        w61 w61Var = (w61) this.a;
        View[] viewArr = w61Var.e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                w61Var.G();
                w61Var.h.put(w61Var.f[1], viewArr[1]);
                w61Var.removeView(viewArr[1]);
                w61Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            w61Var.A(w61Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (w61Var.D) {
            w61Var.F(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            w61Var.F(viewArr[0], (-r1.getMeasuredWidth()) * f10);
        } else {
            w61Var.F(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            w61Var.F(viewArr[0], r1.getMeasuredWidth() * f10);
        }
        w61Var.x(false);
    }

    public boolean z(int i7, int i10, Bundle bundle) {
        return false;
    }

    public n(int i7) {
        switch (i7) {
            case 15:
                this.a = new SparseArray();
                break;
            case 16:
                if (Build.VERSION.SDK_INT < 26) {
                    this.a = new bf0(this);
                    break;
                } else {
                    this.a = new s0.e(this);
                    break;
                }
            default:
                this.a = new ConcurrentHashMap(16);
                break;
        }
    }

    @Override // tg.l1
    public float get() {
        return ((tg.c2) this.a).F;
    }

    public n(int i7, int i10, int... iArr) {
        v40[] v40VarArr = new v40[(iArr.length / 2) + 1];
        this.a = v40VarArr;
        v40 v40Var = new v40(i7, i10);
        int i11 = 0;
        v40VarArr[0] = v40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((v40[]) this.a)[i12] = new v40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public n(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }

    public n(EditText editText) {
        m4.d0 d0Var = new m4.d0();
        d0Var.a = editText;
        t1.i iVar = new t1.i(editText);
        d0Var.b = iVar;
        editText.addTextChangedListener(iVar);
        if (t1.a.b == null) {
            synchronized (t1.a.a) {
                try {
                    if (t1.a.b == null) {
                        t1.a aVar = new t1.a();
                        try {
                            t1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, t1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        t1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(t1.a.b);
        this.a = d0Var;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }

    @Override // u2.m
    public void flush() {
    }

    @Override // u2.m
    public void i() {
    }

    @Override // u2.m
    public void shutdown() {
    }

    @Override // u2.m
    public void start() {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }
}
