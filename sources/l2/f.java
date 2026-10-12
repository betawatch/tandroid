package l2;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a0;
import b2.x0;
import c3.h0;
import c3.t;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.z;
import l.d0;
import l.w;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l0;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.hc1;
import p4.v;
import tc.u;
import y8.e0;
import zh.r3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f implements w, l.i, k1.f, fp0, ne.f, bh.h, i91, s, n5.b, OnCompleteListener, yq0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static void r(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 4:
                ng.h hVar = (ng.h) obj;
                float f10 = hVar.b;
                float y3 = k3.y(hVar.c, f10, f7, f10);
                hVar.d = y3;
                if (z10) {
                    u6 u6Var = hVar.e;
                    u6Var.getClass();
                    u6Var.c(null, y3);
                }
                hVar.invalidate();
                break;
            default:
                hc1 hc1Var = (hc1) ((l0) obj);
                int i11 = (int) (g6.q * 100.0f);
                int i12 = (int) (f7 * 100.0f);
                g6.q = f7;
                if (i11 != i12) {
                    ThemeActivity themeActivity = hc1Var.e.e;
                    wl0 wl0Var = (wl0) themeActivity.b.K(themeActivity.f0);
                    if (wl0Var != null) {
                        ((e9) wl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (g6.q * 100.0f))));
                    }
                    g6.E(true);
                    break;
                }
                break;
        }
    }

    @Override // k1.f
    public Object a(td.p pVar, md.c cVar) {
        return ((z) this.b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        g8.e eVar = (g8.e) this.b;
        r7.z zVar = (r7.z) ((r7.k) obj).u();
        r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
        Parcel N0 = zVar.N0();
        r7.d.c(N0, eVar);
        r7.d.d(N0, fVar);
        N0.writeString(null);
        zVar.R0(N0, 63);
    }

    public void b(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        u3.f fVar = (u3.f) this.b;
        u3.g gVar = fVar.b;
        SparseArray sparseArray = fVar.c;
        x xVar = fVar.k;
        x xVar2 = fVar.i;
        int i21 = 2;
        int i22 = 0;
        int i23 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                u3.e eVar = (u3.e) sparseArray.get(fVar.U);
                int i24 = fVar.X;
                x xVar3 = fVar.p;
                if (i24 != 4 || !"V_VP9".equals(eVar.c)) {
                    pVar.r(i11);
                    return;
                } else {
                    xVar3.K(i11);
                    pVar.readFully(xVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                fVar.h(i10);
                u3.e eVar2 = fVar.y;
                int i25 = eVar2.h;
                if (i25 != 1685485123 && i25 != 1685480259) {
                    pVar.r(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                eVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                fVar.h(i10);
                byte[] bArr2 = new byte[i11];
                fVar.y.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                fVar.h(i10);
                fVar.y.k = new h0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(xVar.a, (byte) 0);
                pVar.readFully(xVar.a, 4 - i11, i11);
                xVar.N(0);
                fVar.A = (int) xVar.C();
                return;
            }
            if (i10 == 25506) {
                fVar.h(i10);
                byte[] bArr4 = new byte[i11];
                fVar.y.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw x0.a(null, "Unexpected id: " + i10);
            }
            fVar.h(i10);
            byte[] bArr5 = new byte[i11];
            fVar.y.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(pVar, false, true, 8);
            fVar.V = gVar.c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            xVar2.K(0);
        }
        u3.e eVar3 = (u3.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            pVar.r(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.a0.getClass();
        if (fVar.O == 1) {
            fVar.l(pVar, 3);
            int i26 = (xVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i26 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.l(pVar, 4);
                int i27 = (xVar2.a[3] & 255) + 1;
                fVar.S = i27;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i27];
                } else if (iArr2.length < i27) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i27)];
                }
                fVar.T = iArr2;
                if (i26 == 2) {
                    int i28 = (i11 - fVar.V) - 4;
                    int i29 = fVar.S;
                    Arrays.fill(iArr2, 0, i29, i28 / i29);
                } else {
                    if (i26 != 1) {
                        if (i26 != 3) {
                            throw x0.a(null, "Unexpected lacing value: " + i26);
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = 4;
                        while (true) {
                            int i33 = fVar.S - i23;
                            if (i30 >= i33) {
                                i12 = i21;
                                i13 = i22;
                                i14 = i23;
                                fVar.T[i33] = ((i11 - fVar.V) - i32) - i31;
                                break;
                            }
                            fVar.T[i30] = i22;
                            int i34 = i32 + 1;
                            fVar.l(pVar, i34);
                            if (xVar2.a[i32] == 0) {
                                throw x0.a(null, "No valid varint length mask found");
                            }
                            int i35 = i22;
                            while (true) {
                                if (i35 >= 8) {
                                    i15 = i21;
                                    i16 = i23;
                                    j10 = 0;
                                    i17 = i34;
                                    break;
                                }
                                int i36 = i23 << (7 - i35);
                                i15 = i21;
                                if ((xVar2.a[i32] & i36) != 0) {
                                    int i37 = i34 + i35;
                                    fVar.l(pVar, i37);
                                    i16 = i23;
                                    j10 = xVar2.a[i32] & b10 & (~i36);
                                    while (i34 < i37) {
                                        j10 = (j10 << 8) | (xVar2.a[i34] & b10);
                                        i34++;
                                        i37 = i37;
                                        b10 = 255;
                                    }
                                    i17 = i37;
                                    if (i30 > 0) {
                                        j10 -= (1 << ((i35 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i35++;
                                    i21 = i15;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i38 = (int) j10;
                            int[] iArr3 = fVar.T;
                            if (i30 != 0) {
                                i38 += iArr3[i30 - 1];
                            }
                            iArr3[i30] = i38;
                            i31 += i38;
                            i30++;
                            i22 = i35;
                            i21 = i15;
                            i23 = i16;
                            i32 = i17;
                            b10 = 255;
                        }
                        throw x0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 4;
                    while (true) {
                        i18 = fVar.S - 1;
                        if (i39 >= i18) {
                            break;
                        }
                        fVar.T[i39] = 0;
                        while (true) {
                            i19 = i41 + 1;
                            fVar.l(pVar, i19);
                            int i42 = xVar2.a[i41] & 255;
                            int[] iArr4 = fVar.T;
                            i20 = iArr4[i39] + i42;
                            iArr4[i39] = i20;
                            if (i42 != 255) {
                                break;
                            } else {
                                i41 = i19;
                            }
                        }
                        i40 += i20;
                        i39++;
                        i41 = i19;
                    }
                    fVar.T[i18] = ((i11 - fVar.V) - i41) - i40;
                }
            }
            i12 = 2;
            i13 = 0;
            i14 = 1;
            byte[] bArr6 = xVar2.a;
            fVar.P = fVar.n((bArr6[i14] & 255) | (bArr6[i13] << 8)) + fVar.M;
            fVar.W = (eVar3.e == i14 || (i10 == 163 && (xVar2.a[i12] & 128) == 128)) ? 1 : i13;
            fVar.O = i12;
            fVar.R = i13;
        }
        if (i10 == 163) {
            while (true) {
                int i43 = fVar.R;
                if (i43 >= fVar.S) {
                    fVar.O = 0;
                    return;
                } else {
                    fVar.i(eVar3, ((fVar.R * eVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + fVar.P, fVar.W, fVar.o(pVar, eVar3, fVar.T[i43], false), 0);
                    fVar.R++;
                }
            }
        } else {
            while (true) {
                int i44 = fVar.R;
                if (i44 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i44] = fVar.o(pVar, eVar3, iArr5[i44], true);
                fVar.R++;
            }
        }
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof d0) {
            ((d0) kVar).z.k().c(false);
        }
        w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    public boolean e(int i10) {
        c91 c91Var = ((k91) this.b).L;
        if (c91Var == null) {
            return false;
        }
        return c91Var.c(i10);
    }

    public void g(int i10, long j10) {
        u3.f fVar = (u3.f) this.b;
        if (i10 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            if (fVar.H == -1) {
                fVar.H = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            if (fVar.G == -1) {
                fVar.G = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw x0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw x0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    fVar.h(i10);
                    fVar.y.e = 2;
                    return;
                }
                if (i11 == 2) {
                    fVar.h(i10);
                    fVar.y.e = 1;
                    return;
                } else if (i11 == 17) {
                    fVar.h(i10);
                    fVar.y.e = 3;
                    return;
                } else if (i11 != 33) {
                    fVar.h(i10);
                    fVar.y.e = -1;
                    return;
                } else {
                    fVar.h(i10);
                    fVar.y.e = 5;
                    return;
                }
            case 136:
                fVar.h(i10);
                fVar.y.Y = j10 == 1;
                return;
            case 155:
                fVar.Q = fVar.n(j10);
                return;
            case 159:
                fVar.h(i10);
                fVar.y.Q = (int) j10;
                return;
            case 176:
                fVar.h(i10);
                fVar.y.n = (int) j10;
                return;
            case MessagesStorage.LAST_DB_VERSION /* 179 */:
                if (fVar.z) {
                    return;
                }
                fVar.g(i10);
                fVar.E = fVar.n(j10);
                return;
            case 186:
                fVar.h(i10);
                fVar.y.o = (int) j10;
                return;
            case 215:
                fVar.h(i10);
                fVar.y.d = (int) j10;
                return;
            case TLRPC.LAYER /* 231 */:
                fVar.M = fVar.n(j10);
                return;
            case 238:
                fVar.X = (int) j10;
                return;
            case 247:
                if (fVar.z) {
                    return;
                }
                fVar.g(i10);
                fVar.F = (int) j10;
                return;
            case 251:
                fVar.Y = true;
                return;
            case 16871:
                fVar.h(i10);
                fVar.y.h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw x0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw x0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw x0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw x0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw x0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                fVar.B = j10 + fVar.s;
                return;
            case 21432:
                int i12 = (int) j10;
                fVar.h(i10);
                if (i12 == 0) {
                    fVar.y.y = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.y.y = 2;
                    return;
                } else if (i12 == 3) {
                    fVar.y.y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    fVar.y.y = 3;
                    return;
                }
            case 21680:
                fVar.h(i10);
                fVar.y.q = (int) j10;
                return;
            case 21682:
                fVar.h(i10);
                fVar.y.s = (int) j10;
                return;
            case 21690:
                fVar.h(i10);
                fVar.y.r = (int) j10;
                return;
            case 21930:
                fVar.h(i10);
                fVar.y.X = j10 == 1;
                return;
            case 21938:
                fVar.h(i10);
                u3.e eVar = fVar.y;
                eVar.z = true;
                eVar.p = (int) j10;
                return;
            case 21998:
                fVar.h(i10);
                fVar.y.g = (int) j10;
                return;
            case 22186:
                fVar.h(i10);
                fVar.y.T = j10;
                return;
            case 22203:
                fVar.h(i10);
                fVar.y.U = j10;
                return;
            case 25188:
                fVar.h(i10);
                fVar.y.R = (int) j10;
                return;
            case 30114:
                fVar.Z = j10;
                return;
            case 30321:
                fVar.h(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    fVar.y.t = 0;
                    return;
                }
                if (i13 == 1) {
                    fVar.y.t = 1;
                    return;
                } else if (i13 == 2) {
                    fVar.y.t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    fVar.y.t = 3;
                    return;
                }
            case 2352003:
                fVar.h(i10);
                fVar.y.f = (int) j10;
                return;
            case 2807729:
                fVar.t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        fVar.h(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            fVar.y.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            fVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.h(i10);
                        int g10 = b2.o.g((int) j10);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i10);
                        fVar.y.z = true;
                        int f7 = b2.o.f((int) j10);
                        if (f7 != -1) {
                            fVar.y.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.h(i10);
                        fVar.y.D = (int) j10;
                        return;
                    case 21949:
                        fVar.h(i10);
                        fVar.y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // hd.a
    public Object get() {
        return new s5.i((Context) ((hd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override // org.telegram.ui.Components.fp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 4:
                ng.h hVar = (ng.h) this.b;
                float f7 = hVar.b;
                return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override // k1.f
    public ee.b getData() {
        return ((z) this.b).c;
    }

    @Override // ne.f
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // ne.f
    public /* synthetic */ boolean i(float f7) {
        return false;
    }

    public void j(float f7) {
        k91 k91Var = (k91) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = k91Var.e;
            View[] viewArr2 = k91Var.e;
            if (viewArr[1] != null) {
                k91Var.F();
                k91Var.h.put(k91Var.f[1], viewArr2[1]);
                k91Var.removeView(viewArr2[1]);
                k91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            k91Var.z(k91Var.b);
            return;
        }
        View[] viewArr3 = k91Var.e;
        View[] viewArr4 = k91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (k91Var.y) {
            k91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            k91Var.E(viewArr4[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            k91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            k91Var.E(viewArr4[0], r1.getMeasuredWidth() * f7);
        }
        k91Var.w(false);
    }

    public void k(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        v vVar = eVar.x.a;
        String d = mVar.d();
        p4.w wVar = new p4.w(vVar, d, eVar.b(vVar, d), false);
        wVar.i(mVar);
        if (eVar.d == wVar) {
            return;
        }
        eVar.h(eVar, wVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((jr0) this.b).getThemedColor(g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // l.i
    public void n(l.k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        m.h hVar = toolbar.a.J;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((a0) it.next()).a.t();
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.b;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            x8.m.L0(e0Var, false, null);
        }
    }

    @Override // l.i
    public boolean p(l.k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // l.w
    public boolean q(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar != null) {
            return wVar.q(kVar);
        }
        return false;
    }

    public void s(int i10, long j10, long j11) {
        u3.f fVar = (u3.f) this.b;
        fVar.j0.getClass();
        if (i10 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i10 == 174) {
            u3.e eVar = new u3.e();
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
            eVar.D = MediaDataController.MAX_STYLE_RUNS_COUNT;
            eVar.E = 200;
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
        if (i10 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i10 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.g(i10);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i10 == 20533) {
            fVar.h(i10);
            fVar.y.i = true;
            return;
        }
        if (i10 == 21968) {
            fVar.h(i10);
            fVar.y.z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = fVar.s;
            if (j12 != -1 && j12 != j10) {
                throw x0.a(null, "Multiple Segment elements not supported");
            }
            fVar.s = j10;
            fVar.r = j11;
            return;
        }
        if (i10 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.D = true;
        } else if (i10 == 524531317 && !fVar.z) {
            if (fVar.d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.j0.K(new t(fVar.v));
                fVar.z = true;
            }
        }
    }

    @Override // org.telegram.ui.Components.yq0
    public void s0() {
        sc k10 = ((r3) this.b).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // ne.f
    public void t() {
        ((p9) this.b).a.invalidate();
    }

    public void u(int i10, String str) {
        u3.f fVar = (u3.f) this.b;
        if (i10 == 134) {
            fVar.h(i10);
            fVar.y.c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.w = str.equals("webm");
                return;
            }
            throw x0.a(null, "DocType " + str + " not supported");
        }
        if (i10 == 21358) {
            fVar.h(i10);
            fVar.y.b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            fVar.h(i10);
            fVar.y.Z = str;
        }
    }

    @Override // bh.h
    public void v(Canvas canvas) {
        jr0 jr0Var = (jr0) this.b;
        canvas.drawColor(jr0Var.getThemedColor(g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            jr0Var.O0.b(canvas, -2);
        }
    }

    public void w(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((u) this.b).c) {
        }
        throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
        int i10 = this.a;
    }

    public f(TextView textView) {
        this.a = 14;
        this.b = new q1.g(textView);
    }

    public f(int i10, int i11) {
        this.a = 10;
        this.b = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.l(i10, i11, "pip_layout_", "_"), 0);
    }

    private final void l() {
    }

    private final void o() {
    }

    @Override // org.telegram.ui.Components.yq0
    public /* synthetic */ void U() {
    }

    @Override // ne.f
    public /* synthetic */ void c() {
    }

    @Override // ne.f
    public /* synthetic */ void m() {
    }

    @Override // ne.f
    public /* synthetic */ void f(boolean z10) {
    }
}
