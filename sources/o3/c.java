package o3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.widget.EditText;
import b7.q1;
import b7.r1;
import cg.f1;
import cg.f2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.s2;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7.p7;
import n7.qa;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.es0;
import org.telegram.ui.o9;
import org.telegram.ui.ob1;
import org.telegram.ui.ui0;
import org.telegram.ui.w9;
import org.telegram.ui.web.c1;
import ph.h9;
import tf.i1;
import vh.d2;
import vh.e1;
import vh.h0;
import vh.h4;
import vh.j4;
import vh.o3;
import vh.s3;
import vh.y1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements com.google.android.gms.common.api.internal.s, io0, xd.d, yf.m, f71, i1, w9, s2, OnCompleteListener, ra.m, t5.a, v0.i, eo0, y4, h0, v4.f {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c() {
        this.a = 22;
    }

    @Override // dg.s2
    public void A(float f10) {
        h9 h9Var = (h9) this.b;
        f1.e(h9Var.C1).k(String.valueOf(cg.m.a.indexOf(h9Var.L0.getCurrentBrush())), f10);
        f2 f2Var = h9Var.x1;
        f2Var.c = f10;
        h9Var.E0(f2Var, null, false);
    }

    @Override // org.telegram.ui.w9
    public String C0() {
        return ((c1) this.b).f0;
    }

    @Override // yf.m
    public void G1(boolean z4) {
        ze0 ze0Var = (ze0) this.b;
        ze0Var.getClass();
        ye0 ye0Var = ze0Var.a;
        if (ye0Var != null) {
            ((es0) ye0Var).a(z4);
        }
    }

    @Override // tf.i1
    public /* synthetic */ a0.h H0() {
        return null;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        y1 y1Var = (y1) this.b;
        y1Var.s0(i10, i11, z4);
        ui0 ui0Var = y1Var.L0;
        if (ui0Var != null) {
            ui0Var.i();
            y1Var.L0 = null;
        }
    }

    @Override // vh.h0
    public l9 J0() {
        h4 h4Var = ((j4) this.b).D;
        if (h4Var != null) {
            return ((o3) h4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.w9
    public void K(String str) {
        c1 c1Var = (c1) this.b;
        try {
            c1Var.M = System.currentTimeMillis();
            c1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // vh.h0
    public void L0(CharSequence charSequence) {
        h4 h4Var = ((j4) this.b).D;
        if (h4Var != null) {
            o3 o3Var = (o3) h4Var;
            o3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            o3Var.a.s4(charSequence.toString());
        }
    }

    @Override // yf.m
    public void M0(boolean z4) {
        ((ze0) this.b).c.setAspectLock(z4);
    }

    @Override // vh.h0
    public k9 O0() {
        return (j4) this.b;
    }

    @Override // vh.h0
    public vh.a T0() {
        return ((j4) this.b).a;
    }

    @Override // tf.i1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // org.telegram.ui.Components.io0
    public void Y(float f10, boolean z4) {
        ob1 ob1Var = (ob1) ((k0) this.b);
        int i10 = (int) (j6.q * 100.0f);
        int i11 = (int) (f10 * 100.0f);
        j6.q = f10;
        if (i10 != i11) {
            ThemeActivity themeActivity = ob1Var.e.e;
            dl0 dl0Var = (dl0) themeActivity.b.K(themeActivity.c0);
            if (dl0Var != null) {
                ((z8) dl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.q * 100.0f))));
            }
            j6.E(true);
        }
    }

    @Override // vh.h0
    public boolean Y0() {
        j4 j4Var = (j4) this.b;
        h4 h4Var = j4Var.D;
        if (h4Var == null) {
            return false;
        }
        vh.a aVar = j4Var.a;
        return ((o3) h4Var).a.R4();
    }

    @Override // org.telegram.ui.w9
    public /* synthetic */ boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                z7.a aVar = (z7.a) this.b;
                o7.d dVar = new o7.d(0, (TaskCompletionSource) obj2);
                o7.c cVar = (o7.c) ((o7.f) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = o7.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                aVar.writeToParcel(obtain, 0);
                cVar.E0(obtain, 2);
                return;
            case 10:
                p6.b bVar = new p6.b(0, (TaskCompletionSource) obj2);
                r1 r1Var = (r1) ((q1) obj).u();
                q6.v vVar = (q6.v) this.b;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(r1Var.b);
                int i11 = b7.l.a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                vVar.writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    r1Var.a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 21:
                u5.r rVar = new u5.r(1, (TaskCompletionSource) obj2);
                u5.i iVar = (u5.i) ((u5.t) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.t.d(M0, rVar);
                M0.writeStringArray(strArr);
                iVar.R0(M0, 6);
                return;
            default:
                u6.f fVar = (u6.f) this.b;
                v6.f fVar2 = new v6.f(0, (TaskCompletionSource) obj2);
                v6.d dVar2 = (v6.d) ((v6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = e7.a.a;
                obtain4.writeStrongBinder(fVar2);
                e7.a.b(obtain4, fVar);
                e7.a.b(obtain4, gVar);
                ((v6.b) dVar2).E0(obtain4, 6);
                return;
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void b(float f10) {
        vh.y yVar = (vh.y) this.b;
        MessageObject messageObject = yVar.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
        MediaController.getInstance().seekToProgress(yVar.M, f10);
    }

    @Override // vh.h0, vh.d1
    public void c(e1 e1Var) {
        h4 h4Var = ((j4) this.b).D;
        if (h4Var != null) {
            s3 s3Var = ((o3) h4Var).a;
            s3.L1(s3Var, e1Var);
            s3Var.e3.d(e1Var, true);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void d(float f10) {
        MessageObject messageObject = ((vh.y) this.b).M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f10;
    }

    @Override // yf.m
    public void d2() {
        ye0 ye0Var = ((ze0) this.b).a;
        if (ye0Var != null) {
            PhotoViewer photoViewer = ((es0) ye0Var).a;
            if (photoViewer.Z1 == 1) {
                photoViewer.E2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // v4.f
    public int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // vh.h0
    public void f1(int i10, int i11) {
        j4 j4Var = (j4) this.b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.a;
            d2 d2Var = ((o3) h4Var).a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override // xd.d
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // dg.s2
    public float get() {
        h9 h9Var = (h9) this.b;
        int i10 = h9Var.C1;
        cg.m currentBrush = h9Var.L0.getCurrentBrush();
        return currentBrush == null ? f1.e(i10).i : f1.e(i10).f(String.valueOf(cg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.io0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // v4.f
    public long h(int i10) {
        h5.a.f(i10 == 0);
        return 0L;
    }

    @Override // vh.h0
    public void h2() {
        j4 j4Var = (j4) this.b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.a;
            s3.N1(((o3) h4Var).a);
        }
    }

    @Override // xd.d
    public /* synthetic */ boolean i(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.io0
    public /* synthetic */ int j0() {
        return 0;
    }

    @Override // tf.i1
    public void k(int i10) {
        hq0 hq0Var = (hq0) this.b;
        lq0 lq0Var = hq0Var.H;
        hq0Var.s = i10;
        if (hq0Var.v != i10) {
            hq0Var.d.clear();
        }
        int i11 = hq0Var.G;
        if (hq0Var.h() != 0 || hq0Var.e.e() || hq0Var.F) {
            lq0Var.u0.b(i11);
        } else {
            lq0Var.N.e(false, true);
        }
        hq0Var.l();
        int i12 = lq0.X0;
        lq0Var.K0(true);
    }

    @Override // vh.h0
    public void l() {
        j4 j4Var = (j4) this.b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            s3.O1(((o3) h4Var).a, j4Var.a);
        }
    }

    public void m(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    public void n(int i10, int i11, r3.l lVar) {
        char c3;
        char c10;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        x3.d dVar = (x3.d) this.b;
        x3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        h5.w wVar = dVar.i;
        h5.w wVar2 = dVar.g;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.G != 2) {
                    return;
                }
                x3.c cVar = (x3.c) sparseArray.get(dVar.M);
                int i18 = dVar.P;
                h5.w wVar3 = dVar.n;
                if (i18 != 4 || !"V_VP9".equals(cVar.b)) {
                    lVar.n(i11);
                    return;
                } else {
                    wVar3.C(i11);
                    lVar.readFully(wVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.b(i10);
                x3.c cVar2 = dVar.u;
                int i19 = cVar2.g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.n(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.b(i10);
                byte[] bArr2 = new byte[i11];
                dVar.u.i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                dVar.b(i10);
                dVar.u.j = new r3.u(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(wVar.a, (byte) 0);
                lVar.readFully(wVar.a, 4 - i11, i11);
                wVar.F(0);
                dVar.w = (int) wVar.v();
                return;
            }
            if (i10 == 25506) {
                dVar.b(i10);
                byte[] bArr4 = new byte[i11];
                dVar.u.k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw j3.r1.a("Unexpected id: " + i10, null);
            }
            dVar.b(i10);
            byte[] bArr5 = new byte[i11];
            dVar.u.v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.G == 0) {
            dVar.M = (int) eVar.b(lVar, false, true, 8);
            dVar.N = eVar.c;
            dVar.I = -9223372036854775807L;
            dVar.G = 1;
            wVar2.C(0);
        }
        x3.c cVar3 = (x3.c) sparseArray.get(dVar.M);
        if (cVar3 == null) {
            lVar.n(i11 - dVar.N);
            dVar.G = 0;
            return;
        }
        cVar3.X.getClass();
        if (dVar.G == 1) {
            dVar.g(lVar, 3);
            int i20 = (wVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.K = 1;
                int[] iArr = dVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.L = iArr;
                iArr[0] = (i11 - dVar.N) - 3;
            } else {
                dVar.g(lVar, 4);
                int i21 = (wVar2.a[3] & 255) + 1;
                dVar.K = i21;
                int[] iArr2 = dVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.L = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.N) - 4;
                    int i23 = dVar.K;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw j3.r1.a("Unexpected lacing value: " + i20, null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.K - i16;
                            if (i24 >= i27) {
                                c3 = 1;
                                c10 = 0;
                                dVar.L[i27] = ((i11 - dVar.N) - i26) - i25;
                                break;
                            }
                            dVar.L[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.g(lVar, i28);
                            if (wVar2.a[i26] == 0) {
                                throw j3.r1.a("No valid varint length mask found", null);
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j10 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((wVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.g(lVar, i12);
                                    j10 = wVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j10 = (j10 << 8) | (wVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j10;
                            int[] iArr3 = dVar.L;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw j3.r1.a("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.K - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.L[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.g(lVar, i14);
                            int i35 = wVar2.a[i34] & 255;
                            int[] iArr4 = dVar.L;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    dVar.L[i13] = ((i11 - dVar.N) - i34) - i33;
                }
            }
            c3 = 1;
            c10 = 0;
            byte[] bArr6 = wVar2.a;
            dVar.H = dVar.k((bArr6[c3] & 255) | (bArr6[c10] << 8)) + dVar.B;
            dVar.O = (cVar3.d == 2 || (i10 == 163 && (wVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.G = 2;
            dVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.J;
                if (i36 >= dVar.K) {
                    dVar.G = 0;
                    return;
                } else {
                    dVar.c(cVar3, ((dVar.J * cVar3.e) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.H, dVar.O, dVar.l(lVar, cVar3, dVar.L[i36], false), 0);
                    dVar.J++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.J;
                if (i37 >= dVar.K) {
                    return;
                }
                int[] iArr5 = dVar.L;
                iArr5[i37] = dVar.l(lVar, cVar3, iArr5[i37], true);
                dVar.J++;
            }
        }
    }

    public void o(int i10, long j10) {
        x3.d dVar = (x3.d) this.b;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw j3.r1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw j3.r1.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                dVar.b(i10);
                dVar.u.d = (int) j10;
                return;
            case 136:
                dVar.b(i10);
                dVar.u.V = j10 == 1;
                return;
            case 155:
                dVar.I = dVar.k(j10);
                return;
            case 159:
                dVar.b(i10);
                dVar.u.O = (int) j10;
                return;
            case 176:
                dVar.b(i10);
                dVar.u.m = (int) j10;
                return;
            case 179:
                dVar.a(i10);
                dVar.C.e(dVar.k(j10));
                return;
            case 186:
                dVar.b(i10);
                dVar.u.n = (int) j10;
                return;
            case 215:
                dVar.b(i10);
                dVar.u.c = (int) j10;
                return;
            case 231:
                dVar.B = dVar.k(j10);
                return;
            case 238:
                dVar.P = (int) j10;
                return;
            case 241:
                if (dVar.E) {
                    return;
                }
                dVar.a(i10);
                dVar.D.e(j10);
                dVar.E = true;
                return;
            case 251:
                dVar.Q = true;
                return;
            case 16871:
                dVar.b(i10);
                dVar.u.g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw j3.r1.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw j3.r1.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw j3.r1.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw j3.r1.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw j3.r1.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                dVar.x = j10 + dVar.q;
                return;
            case 21432:
                int i11 = (int) j10;
                dVar.b(i10);
                if (i11 == 0) {
                    dVar.u.w = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.u.w = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.u.w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.u.w = 3;
                    return;
                }
            case 21680:
                dVar.b(i10);
                dVar.u.o = (int) j10;
                return;
            case 21682:
                dVar.b(i10);
                dVar.u.q = (int) j10;
                return;
            case 21690:
                dVar.b(i10);
                dVar.u.p = (int) j10;
                return;
            case 21930:
                dVar.b(i10);
                dVar.u.U = j10 == 1;
                return;
            case 21998:
                dVar.b(i10);
                dVar.u.f = (int) j10;
                return;
            case 22186:
                dVar.b(i10);
                dVar.u.R = j10;
                return;
            case 22203:
                dVar.b(i10);
                dVar.u.S = j10;
                return;
            case 25188:
                dVar.b(i10);
                dVar.u.P = (int) j10;
                return;
            case 30114:
                dVar.R = j10;
                return;
            case 30321:
                dVar.b(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    dVar.u.r = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.u.r = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.u.r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.u.r = 3;
                    return;
                }
            case 2352003:
                dVar.b(i10);
                dVar.u.e = (int) j10;
                return;
            case 2807729:
                dVar.r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.b(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            dVar.u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.u.A = 1;
                            return;
                        }
                    case 21946:
                        dVar.b(i10);
                        int c3 = i5.b.c((int) j10);
                        if (c3 != -1) {
                            dVar.u.z = c3;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.b(i10);
                        dVar.u.x = true;
                        int b10 = i5.b.b((int) j10);
                        if (b10 != -1) {
                            dVar.u.y = b10;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.b(i10);
                        dVar.u.B = (int) j10;
                        return;
                    case 21949:
                        dVar.b(i10);
                        dVar.u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        r5.c.h((r5.c) ((r5.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.w9
    public void onDismiss() {
        c1 c1Var = (c1) this.b;
        c1Var.y("scan_qr_popup_closed", null);
        c1Var.e0 = false;
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(i71 i71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // v0.i
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        ld.m mVar = (ld.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        qk0 qk0Var = (qk0) this.b;
        if (z4 && qk0Var.n.n() >= 0) {
            qk0Var.w = true;
        }
        ng0 ng0Var = qk0Var.f;
        dc0 dc0Var = qk0Var.x;
        ng0Var.a(z4, true);
        AndroidUtilities.cancelRunOnUIThread(dc0Var);
        if (z4) {
            AndroidUtilities.runOnUIThread(dc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // t5.a
    public void p(Bitmap bitmap) {
        u5.b bVar = t5.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int d = (int) android.support.v4.media.a.d(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((t5.h) this.b).e(bitmap2, 0);
    }

    @Override // v4.f
    public List q(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // v4.f
    public int r() {
        return 1;
    }

    @Override // yf.m
    public void r0() {
        ye0 ye0Var = ((ze0) this.b).a;
        if (ye0Var != null) {
            ((es0) ye0Var).a.b0.invalidate();
        }
    }

    public p9.b s(JSONObject jSONObject) {
        p9.c uVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            uVar = new db.a(19);
        } else {
            uVar = new h7.u(19);
        }
        return uVar.K((cb.b) this.b, jSONObject);
    }

    @Override // vh.h0
    public void s1() {
        j4 j4Var = (j4) this.b;
        h4 h4Var = j4Var.D;
        if (h4Var != null) {
            vh.a aVar = j4Var.a;
            s3 s3Var = ((o3) h4Var).a;
            d2 d2Var = s3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            s3Var.e3.onContentChanged();
        }
    }

    public void t() {
        s5.h hVar = (s5.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((s5.g) it2.next()).a();
        }
    }

    @Override // tf.i1
    public boolean t1(int i10) {
        return i10 == ((hq0) this.b).r;
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "<" + ((String) this.b) + '>';
            default:
                return super.toString();
        }
    }

    @Override // ra.m
    public Object u2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new pa.j("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new pa.j("Invalid EnumMap type: " + type.toString());
    }

    @Override // xd.d
    public void x() {
        ((f9) this.b).a.invalidate();
    }

    public /* synthetic */ c(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // v0.i
    public void onError(Object obj) {
        w0.d e = (w0.d) obj;
        kotlin.jvm.internal.j.e(e, "e");
        ld.m mVar = (ld.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(p7.a(e));
        }
    }

    @Override // org.telegram.ui.Components.f71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ c(tp0 tp0Var) {
        this.a = 9;
        this.b = (com.google.android.gms.internal.play_billing.r) tp0Var.b;
    }

    public c(EditText editText) {
        this.a = 13;
        this.b = new qa(editText);
    }

    @Override // org.telegram.ui.Components.io0
    public void B() {
    }

    @Override // xd.d
    public /* synthetic */ void a() {
    }

    @Override // xd.d
    public /* synthetic */ void j() {
    }

    @Override // tf.i1
    public /* synthetic */ void J1(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.w9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // xd.d
    public /* synthetic */ void f(boolean z4) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
