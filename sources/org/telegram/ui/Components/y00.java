package org.telegram.ui.Components;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y00 implements c51, org.telegram.messenger.ec, kg.u1, vr0, l61, org.telegram.ui.r9, qe.b, t2.m, com.google.android.gms.common.api.internal.n, p5.b, ug.k1, tg.t0, com.google.android.gms.common.api.internal.p, y2.d, SuccessContinuation {
    public Object a;

    public /* synthetic */ y00(Object obj) {
        this.a = obj;
    }

    public static String C(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean w(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public void A(long j10, int i3, long j11) {
        w3.f fVar = (w3.f) this.a;
        fVar.j0.getClass();
        if (i3 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i3 == 174) {
            w3.e eVar = new w3.e();
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
            eVar.E = org.telegram.messenger.hs.e3;
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
        if (i3 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i3);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i3 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i3);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i3 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i3 == 20533) {
            fVar.h(i3);
            fVar.y.i = true;
            return;
        }
        if (i3 == 21968) {
            fVar.h(i3);
            fVar.y.z = true;
            return;
        }
        if (i3 == 408125543) {
            long j12 = fVar.s;
            if (j12 != -1 && j12 != j10) {
                throw d2.v0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j10;
            fVar.r = j11;
            return;
        }
        if (i3 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i3 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.f(new e3.t(fVar.v));
                fVar.z = true;
            }
        }
    }

    public void B(int i3, String str) {
        w3.f fVar = (w3.f) this.a;
        if (i3 == 134) {
            fVar.h(i3);
            fVar.y.c = str;
            return;
        }
        if (i3 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw d2.v0.a(null, "DocType " + str + " not supported");
        }
        if (i3 == 21358) {
            fVar.h(i3);
            fVar.y.b = str;
        } else {
            if (i3 != 2274716) {
                return;
            }
            fVar.h(i3);
            fVar.y.Z = str;
        }
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // org.telegram.messenger.ec
    public void D(ImageReceiver imageReceiver) {
        rf0 rf0Var = ((uf0) this.a).h.H0;
        if (rf0Var != null) {
            rf0Var.d();
        }
    }

    @Override // qe.b
    public void F(float f10, int i3) {
        ((qe.h) this.a).h(f10);
    }

    @Override // kg.u1
    public boolean J1(int i3) {
        return i3 == ((lo0) this.a).r;
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.a;
        try {
            w0Var.Q = System.currentTimeMillis();
            w0Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.r9
    public String M0() {
        return ((org.telegram.ui.web.w0) this.a).j0;
    }

    @Override // tg.t0
    public void N() {
        ug.n0 n0Var = (ug.n0) this.a;
        n0Var.b.a.o();
        n0Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.kp0) n0Var).L;
        Drawable[] drawableArr = PhotoViewer.V8;
        photoViewer.a3(true, true);
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((qe.h) this.a).h(f10);
    }

    @Override // tg.t0
    public void Z() {
        ((ug.n0) this.a).x.setViewHidden(true);
    }

    @Override // t2.m
    public void a(int i3, j2.d dVar, long j10, int i10) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i3, 0, dVar.i, j10, i10);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        x8.e eVar = (x8.e) this.a;
        g8.b bVar = (g8.b) obj;
        bVar.getClass();
        g8.a aVar = new g8.a(1, (TaskCompletionSource) obj2);
        try {
            g8.i iVar = (g8.i) bVar.m();
            Bundle A = bVar.A();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i3 = g8.c.a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            A.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(14, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            Bundle bundle = Bundle.EMPTY;
            b8.y9.a(Status.h, Boolean.FALSE, aVar.b);
        }
    }

    @Override // t2.m
    public void b(int i3, int i10, int i11, long j10) {
        ((MediaCodec) this.a).queueInputBuffer(i3, 0, i10, j10, i11);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void c(Object obj) {
        LocationResult locationResult = (LocationResult) this.a;
        org.telegram.messenger.ka kaVar = ((org.telegram.messenger.t9) obj).a;
        List list = locationResult.a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        gi.w5 w5Var = (gi.w5) kaVar;
        if (location == null) {
            w5Var.getClass();
        } else {
            ((org.telegram.messenger.ld) w5Var.b).m(location);
        }
    }

    @Override // org.telegram.ui.Components.vr0
    public void e() {
        ((f60) this.a).k();
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean e1(String str, org.telegram.ui.i9 i9Var) {
        return false;
    }

    @Override // tg.t0
    public void f() {
        ug.n0 n0Var = (ug.n0) this.a;
        n0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new gi.j3(n0Var, 25)).setInterpolator(xq.h);
    }

    public void g(int i3, int i10, e3.p pVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        int i17;
        int i18;
        int i19;
        w3.f fVar = (w3.f) this.a;
        w3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        g2.y yVar = fVar.k;
        g2.y yVar2 = fVar.i;
        int i20 = 2;
        int i21 = 0;
        int i22 = 1;
        if (i3 != 161 && i3 != 163) {
            if (i3 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                w3.e eVar = (w3.e) sparseArray.get(fVar.U);
                int i23 = fVar.X;
                g2.y yVar3 = fVar.p;
                if (i23 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.u(i10);
                    return;
                } else {
                    yVar3.K(i10);
                    pVar.readFully(yVar3.a, 0, i10);
                    return;
                }
            }
            if (i3 == 16877) {
                fVar.h(i3);
                w3.e eVar2 = fVar.y;
                int i24 = eVar2.h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    pVar.u(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i10);
                return;
            }
            if (i3 == 16981) {
                fVar.h(i3);
                byte[] bArr2 = new byte[i10];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i3 == 18402) {
                byte[] bArr3 = new byte[i10];
                pVar.readFully(bArr3, 0, i10);
                fVar.h(i3);
                fVar.y.k = new e3.h0(1, 0, 0, bArr3);
                return;
            }
            if (i3 == 21419) {
                Arrays.fill(yVar.a, (byte) 0);
                pVar.readFully(yVar.a, 4 - i10, i10);
                yVar.N(0);
                fVar.A = (int) yVar.C();
                return;
            }
            if (i3 == 25506) {
                fVar.h(i3);
                byte[] bArr4 = new byte[i10];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i3 != 30322) {
                throw d2.v0.a(null, "Unexpected id: " + i3);
            }
            fVar.h(i3);
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
            yVar2.K(0);
        }
        w3.e eVar3 = (w3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.u(i10 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i25 = (yVar2.a[2] & 6) >> 1;
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
                int i26 = (yVar2.a[3] & org.telegram.messenger.hs.e4) + 1;
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
                            throw d2.v0.a(null, "Unexpected lacing value: " + i25);
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
                            if (yVar2.a[i31] == 0) {
                                throw d2.v0.a(null, "No valid varint length mask found");
                            }
                            int i34 = i21;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    i15 = i22;
                                    j10 = 0;
                                    i16 = i33;
                                    break;
                                }
                                int i35 = i22 << (7 - i34);
                                i14 = i20;
                                if ((yVar2.a[i31] & i35) != 0) {
                                    int i36 = i33 + i34;
                                    fVar.l(pVar, i36);
                                    i15 = i22;
                                    j10 = yVar2.a[i31] & b10 & (~i35);
                                    while (i33 < i36) {
                                        j10 = (j10 << 8) | (yVar2.a[i33] & b10);
                                        i33++;
                                        i36 = i36;
                                        b10 = 255;
                                    }
                                    i16 = i36;
                                    if (i29 > 0) {
                                        j10 -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i37 = (int) j10;
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
                        throw d2.v0.a(null, "EBML lacing sample size out of range.");
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
                            int i41 = yVar2.a[i40] & 255;
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
            byte[] bArr6 = yVar2.a;
            fVar.P = fVar.n((bArr6[i13] & 255) | (bArr6[i12] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i13 || (i3 == 163 && (yVar2.a[i11] & 128) == 128)) ? 1 : i12;
            fVar.O = i11;
            fVar.R = i12;
        }
        if (i3 == 163) {
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

    @Override // cd.a
    public Object get() {
        String packageName = ((Context) ((cd.a) this.a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // org.telegram.ui.Components.vr0
    public org.telegram.ui.ActionBar.y0 h(String str) {
        org.telegram.ui.ActionBar.y0 h = ((f60) this.a).h();
        h.setText(str);
        return h;
    }

    public boolean i(int i3) {
        f61 f61Var = ((n61) this.a).M;
        if (f61Var == null) {
            return false;
        }
        return f61Var.c(i3);
    }

    @Override // org.telegram.ui.Components.c51
    public void invalidate() {
        ((ie0) this.a).h.invalidate();
    }

    public boolean j(String str) {
        String u10 = u(str);
        return "1".equals(u10) || Boolean.parseBoolean(u10);
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    public ClipDescription l() {
        return ((t0.h) this.a).getDescription();
    }

    @Override // org.telegram.ui.Components.vr0
    public org.telegram.ui.ActionBar.y0 n(int i3, Runnable runnable, String str, boolean z10, boolean z11) {
        f60 f60Var = (f60) this.a;
        int x10 = f60Var.x();
        f60Var.c(i3, str, new ci.v6(runnable, z11, f60Var, 25), z10);
        View w10 = f60Var.w(x10);
        if (w10 instanceof org.telegram.ui.ActionBar.y0) {
            return (org.telegram.ui.ActionBar.y0) w10;
        }
        return null;
    }

    public Integer o(String str) {
        String u10 = u(str);
        if (TextUtils.isEmpty(u10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(u10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + C(str) + "(" + u10 + ") into an int");
            return null;
        }
    }

    @Override // org.telegram.ui.r9
    public void onDismiss() {
        org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.a;
        w0Var.y("scan_qr_popup_closed", null);
        w0Var.i0 = false;
    }

    public JSONArray p(String str) {
        String u10 = u(str);
        if (TextUtils.isEmpty(u10)) {
            return null;
        }
        try {
            return new JSONArray(u10);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + C(str) + ": " + u10 + ", falling back to default");
            return null;
        }
    }

    @Override // tg.t0
    public boolean q() {
        return true;
    }

    @Override // kg.u1
    public void r(int i3) {
        lo0 lo0Var = (lo0) this.a;
        oo0 oo0Var = lo0Var.L;
        lo0Var.s = i3;
        if (lo0Var.w != i3) {
            lo0Var.d.clear();
        }
        int i10 = lo0Var.K;
        if (lo0Var.b() != 0 || lo0Var.e.e() || lo0Var.J) {
            oo0Var.q2.b(i10);
        } else {
            oo0Var.J1.e(false, true);
        }
        lo0Var.f();
        int i11 = oo0.R2;
        oo0Var.K0(true);
    }

    @Override // ug.k1
    public void s(float f10) {
        org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.a;
        tg.k0.e(lp0Var.z1).k(String.valueOf(tg.h.a.indexOf(lp0Var.G0.getCurrentBrush())), f10);
        tg.h1 h1Var = lp0Var.u1;
        h1Var.c = f10;
        lp0Var.s0(h1Var, null);
    }

    @Override // t2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public String t(Resources resources, String str, String str2) {
        String[] strArr;
        String u10 = u(str2);
        if (!TextUtils.isEmpty(u10)) {
            return u10;
        }
        String u11 = u(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(u11)) {
            return null;
        }
        int identifier = resources.getIdentifier(u11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", C(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray p10 = p(str2.concat("_loc_args"));
        if (p10 == null) {
            strArr = null;
        } else {
            int length = p10.length();
            strArr = new String[length];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = p10.optString(i3);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + C(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ha.b bVar = (ha.b) obj;
        ua.b bVar2 = (ua.b) this.a;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        z9.m mVar = (z9.m) bVar2.c;
        z9.m mVar2 = (z9.m) bVar2.c;
        z9.m.b(mVar);
        mVar2.m.h(null, mVar2.e.a);
        mVar2.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String u(String str) {
        Bundle bundle = (Bundle) this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void v(int i3, long j10) {
        w3.f fVar = (w3.f) this.a;
        if (i3 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i3);
            if (fVar.H == -1) {
                fVar.H = j10;
                return;
            }
            return;
        }
        if (i3 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i3);
            if (fVar.G == -1) {
                fVar.G = j10;
                return;
            }
            return;
        }
        if (i3 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw d2.v0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i3 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw d2.v0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i3) {
            case org.telegram.messenger.hs.P1 /* 131 */:
                int i10 = (int) j10;
                if (i10 == 1) {
                    fVar.h(i3);
                    fVar.y.e = 2;
                    return;
                }
                if (i10 == 2) {
                    fVar.h(i3);
                    fVar.y.e = 1;
                    return;
                } else if (i10 == 17) {
                    fVar.h(i3);
                    fVar.y.e = 3;
                    return;
                } else if (i10 != 33) {
                    fVar.h(i3);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i3);
                    fVar.y.e = 5;
                    return;
                }
            case org.telegram.messenger.hs.S1 /* 136 */:
                fVar.h(i3);
                fVar.y.Y = j10 == 1;
                return;
            case org.telegram.messenger.hs.l2 /* 155 */:
                fVar.Q = fVar.n(j10);
                return;
            case org.telegram.messenger.hs.p2 /* 159 */:
                fVar.h(i3);
                fVar.y.Q = (int) j10;
                return;
            case org.telegram.messenger.hs.G2 /* 176 */:
                fVar.h(i3);
                fVar.y.n = (int) j10;
                return;
            case org.telegram.messenger.hs.J2 /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i3);
                fVar.E = fVar.n(j10);
                return;
            case org.telegram.messenger.hs.Q2 /* 186 */:
                fVar.h(i3);
                fVar.y.o = (int) j10;
                return;
            case org.telegram.messenger.hs.s3 /* 215 */:
                fVar.h(i3);
                fVar.y.d = (int) j10;
                return;
            case org.telegram.messenger.hs.H3 /* 231 */:
                fVar.M = fVar.n(j10);
                return;
            case org.telegram.messenger.hs.N3 /* 238 */:
                fVar.X = (int) j10;
                return;
            case org.telegram.messenger.hs.W3 /* 247 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i3);
                fVar.F = (int) j10;
                return;
            case org.telegram.messenger.hs.a4 /* 251 */:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i3);
                fVar.y.h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw d2.v0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw d2.v0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw d2.v0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw d2.v0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw d2.v0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                fVar.B = j10 + fVar.s;
                return;
            case 21432:
                int i11 = (int) j10;
                fVar.h(i3);
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
                fVar.h(i3);
                fVar.y.q = (int) j10;
                return;
            case 21682:
                fVar.h(i3);
                fVar.y.s = (int) j10;
                return;
            case 21690:
                fVar.h(i3);
                fVar.y.r = (int) j10;
                return;
            case 21930:
                fVar.h(i3);
                fVar.y.X = j10 == 1;
                return;
            case 21938:
                fVar.h(i3);
                w3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j10;
                return;
            case 21998:
                fVar.h(i3);
                fVar.y.g = (int) j10;
                return;
            case 22186:
                fVar.h(i3);
                fVar.y.T = j10;
                return;
            case 22203:
                fVar.h(i3);
                fVar.y.U = j10;
                return;
            case 25188:
                fVar.h(i3);
                fVar.y.R = (int) j10;
                return;
            case 30114:
                fVar.Z = j10;
                return;
            case 30321:
                fVar.h(i3);
                int i12 = (int) j10;
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
                fVar.h(i3);
                fVar.y.f = (int) j10;
                return;
            case 2807729:
                fVar.t = j10;
                return;
            default:
                switch (i3) {
                    case 21945:
                        fVar.h(i3);
                        int i13 = (int) j10;
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
                        fVar.h(i3);
                        int g7 = d2.n.g((int) j10);
                        if (g7 != -1) {
                            fVar.y.B = g7;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i3);
                        fVar.y.z = true;
                        int f10 = d2.n.f((int) j10);
                        if (f10 != -1) {
                            fVar.y.A = f10;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i3);
                        fVar.y.D = (int) j10;
                        return;
                    case 21949:
                        fVar.h(i3);
                        fVar.y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public void x(float f10) {
        n61 n61Var = (n61) this.a;
        View[] viewArr = n61Var.e;
        if (f10 == 1.0f) {
            if (viewArr[1] != null) {
                n61Var.F();
                n61Var.h.put(n61Var.f[1], viewArr[1]);
                n61Var.removeView(viewArr[1]);
                n61Var.E(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            n61Var.z(n61Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (n61Var.E) {
            n61Var.E(view, (1.0f - f10) * viewArr[0].getMeasuredWidth());
            n61Var.E(viewArr[0], (-r1.getMeasuredWidth()) * f10);
        } else {
            n61Var.E(view, (1.0f - f10) * (-viewArr[0].getMeasuredWidth()));
            n61Var.E(viewArr[0], r1.getMeasuredWidth() * f10);
        }
        n61Var.v(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean y(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        x00 x00Var;
        boolean z11;
        w00 w00Var = (w00) this.a;
        int i3 = w00.w;
        x00 x00Var2 = w00Var.f;
        android.support.v4.media.session.q qVar = w00Var.e;
        int action = motionEvent.getAction();
        if (w00Var.v == null) {
            w00Var.v = VelocityTracker.obtain();
        }
        w00Var.v.addMovement(motionEvent);
        int i10 = action & org.telegram.messenger.hs.e4;
        boolean z12 = i10 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 = motionEvent.getX(i11) + f10;
                f11 = motionEvent.getY(i11) + f11;
            }
        }
        float f12 = z12 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i10 == 0) {
            if (w00Var.g != null && x00Var2.a()) {
                boolean hasMessages = qVar.hasMessages(3);
                if (hasMessages) {
                    qVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = w00Var.m;
                if (motionEvent4 != null && (motionEvent3 = w00Var.n) != null && hasMessages && w00Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y9 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y9 * y9) + (x10 * x10) < w00Var.b) {
                        w00Var.o = true;
                        z10 = w00Var.g.onDoubleTap(w00Var.m) | w00Var.g.onDoubleTapEvent(motionEvent);
                        w00Var.p = f13;
                        w00Var.r = f13;
                        w00Var.q = f14;
                        w00Var.s = f14;
                        motionEvent2 = w00Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        w00Var.m = MotionEvent.obtain(motionEvent);
                        w00Var.k = true;
                        w00Var.l = true;
                        w00Var.h = true;
                        w00Var.j = false;
                        w00Var.i = false;
                        if (w00Var.t) {
                            qVar.removeMessages(2);
                            qVar.sendEmptyMessageAtTime(2, w00Var.m.getDownTime() + i3 + w00Var.u);
                        }
                        qVar.sendEmptyMessageAtTime(1, w00Var.m.getDownTime() + i3);
                        return x00Var2.onDown(motionEvent) | z10;
                    }
                }
                qVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            w00Var.p = f13;
            w00Var.r = f13;
            w00Var.q = f14;
            w00Var.s = f14;
            motionEvent2 = w00Var.m;
            if (motionEvent2 != null) {
            }
            w00Var.m = MotionEvent.obtain(motionEvent);
            w00Var.k = true;
            w00Var.l = true;
            w00Var.h = true;
            w00Var.j = false;
            w00Var.i = false;
            if (w00Var.t) {
            }
            qVar.sendEmptyMessageAtTime(1, w00Var.m.getDownTime() + i3);
            return x00Var2.onDown(motionEvent) | z10;
        }
        if (i10 == 1) {
            w00Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (w00Var.o) {
                onFling = w00Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (w00Var.j) {
                    qVar.removeMessages(3);
                    w00Var.j = false;
                } else if (w00Var.k) {
                    boolean onSingleTapUp = x00Var2.onSingleTapUp(motionEvent);
                    if (w00Var.i && (x00Var = w00Var.g) != null) {
                        x00Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = w00Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, w00Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > w00Var.c || Math.abs(xVelocity) > w00Var.c) {
                        onFling = x00Var2.onFling(w00Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = w00Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            w00Var.n = obtain;
            VelocityTracker velocityTracker2 = w00Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                w00Var.v = null;
            }
            w00Var.o = false;
            w00Var.i = false;
            qVar.removeMessages(1);
            qVar.removeMessages(2);
            return onFling;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                w00Var.v.recycle();
                w00Var.v = null;
                w00Var.o = false;
                w00Var.h = false;
                w00Var.k = false;
                w00Var.l = false;
                w00Var.i = false;
                if (w00Var.j) {
                    w00Var.j = false;
                    return false;
                }
            } else if (i10 == 5) {
                w00Var.p = f13;
                w00Var.r = f13;
                w00Var.q = f14;
                w00Var.s = f14;
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                w00Var.o = false;
                w00Var.k = false;
                w00Var.l = false;
                w00Var.i = false;
                if (w00Var.j) {
                    w00Var.j = false;
                    return false;
                }
            } else if (i10 == 6) {
                w00Var.p = f13;
                w00Var.r = f13;
                w00Var.q = f14;
                w00Var.s = f14;
                w00Var.v.computeCurrentVelocity(1000, w00Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = w00Var.v.getXVelocity(pointerId2);
                float yVelocity2 = w00Var.v.getYVelocity(pointerId2);
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    if (i12 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        if ((w00Var.v.getYVelocity(pointerId3) * yVelocity2) + (w00Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            w00Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!w00Var.j) {
            float f15 = w00Var.p - f13;
            float f16 = w00Var.q - f14;
            if (w00Var.o) {
                return w00Var.g.onDoubleTapEvent(motionEvent);
            }
            if (w00Var.k) {
                int i13 = (int) (f13 - w00Var.r);
                int i14 = (int) (f14 - w00Var.s);
                int i15 = (i14 * i14) + (i13 * i13);
                if (i15 > w00Var.a) {
                    z11 = x00Var2.onScroll(w00Var.m, motionEvent, f15, f16);
                    w00Var.p = f13;
                    w00Var.q = f14;
                    w00Var.k = false;
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    qVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i15 > w00Var.a) {
                    w00Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = x00Var2.onScroll(w00Var.m, motionEvent, f15, f16);
                w00Var.p = f13;
                w00Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    public Bundle z() {
        Bundle bundle = (Bundle) this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public y00(int i3) {
        switch (i3) {
            case 26:
                this.a = new mb.b(4);
                break;
            default:
                this.a = new q2.d(1.0f, 5, 0, false);
                break;
        }
    }

    @Override // ug.k1
    public float get() {
        org.telegram.ui.lp0 lp0Var = (org.telegram.ui.lp0) this.a;
        int i3 = lp0Var.z1;
        tg.h currentBrush = lp0Var.G0.getCurrentBrush();
        if (currentBrush == null) {
            return tg.k0.e(i3).i;
        }
        return tg.k0.e(i3).f(String.valueOf(tg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    public y00(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }

    public y00(Context context, x00 x00Var) {
        this.a = new w00(context, x00Var);
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }

    @Override // t2.m
    public void d() {
    }

    @Override // t2.m
    public void flush() {
    }

    @Override // tg.t0
    public /* synthetic */ void k() {
    }

    @Override // tg.t0
    public void m() {
    }

    @Override // t2.m
    public void shutdown() {
    }

    @Override // t2.m
    public void start() {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
