package ka;

import ah.j;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import b2.r0;
import c3.g0;
import c3.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import e8.i;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import m.k;
import mg.h;
import n7.z0;
import o2.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.z5;
import org.telegram.ui.hv0;
import org.telegram.ui.st0;
import p4.u;
import pg.m;
import pg.t1;
import pg.u0;
import qg.w1;
import r0.n;
import r2.l;
import s4.h1;
import s4.o0;
import s4.p0;
import u2.c1;
import u2.d1;
import u2.p1;
import v7.h5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class c implements k, ro0, o0.b, c1, l1, j, j71, n, w1, r2.k, o, h1, s, s0, w2.d, Continuation {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // s4.h1
    public int C(View view) {
        return o0.v(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).bottomMargin;
    }

    public void D(int i10, int i11, p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        u3.d dVar = (u3.d) this.b;
        u3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        v vVar = dVar.k;
        v vVar2 = dVar.i;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                u3.c cVar = (u3.c) sparseArray.get(dVar.P);
                int i18 = dVar.S;
                v vVar3 = dVar.p;
                if (i18 != 4 || !"V_VP9".equals(cVar.c)) {
                    pVar.q(i11);
                    return;
                } else {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.d(i10);
                u3.c cVar2 = dVar.x;
                int i19 = cVar2.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.d(i10);
                byte[] bArr2 = new byte[i11];
                dVar.x.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                dVar.d(i10);
                dVar.x.k = new g0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(vVar.a, (byte) 0);
                pVar.readFully(vVar.a, 4 - i11, i11);
                vVar.J(0);
                dVar.z = (int) vVar.z();
                return;
            }
            if (i10 == 25506) {
                dVar.d(i10);
                byte[] bArr4 = new byte[i11];
                dVar.x.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw b2.s0.a(null, "Unexpected id: " + i10);
            }
            dVar.d(i10);
            byte[] bArr5 = new byte[i11];
            dVar.x.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.q(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i20 = (vVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i21 = (vVar2.a[3] & 255) + 1;
                dVar.N = i21;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.O = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.Q) - 4;
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw b2.s0.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.N - i16;
                            if (i24 >= i27) {
                                c10 = 1;
                                c11 = 0;
                                dVar.O[i27] = ((i11 - dVar.Q) - i26) - i25;
                                break;
                            }
                            dVar.O[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.j(pVar, i28);
                            if (vVar2.a[i26] == 0) {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j3 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((vVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.j(pVar, i12);
                                    j3 = vVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j3 = (j3 << 8) | (vVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j3 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j3;
                            int[] iArr3 = dVar.O;
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
                        throw b2.s0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.O[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.j(pVar, i14);
                            int i35 = vVar2.a[i34] & 255;
                            int[] iArr4 = dVar.O;
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
                    dVar.O[i13] = ((i11 - dVar.Q) - i34) - i33;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = vVar2.a;
            dVar.K = dVar.l((bArr6[c10] & 255) | (bArr6[c11] << 8)) + dVar.E;
            dVar.R = (cVar3.e == 2 || (i10 == 163 && (vVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.M;
                if (i36 >= dVar.N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((dVar.M * cVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i36], false), 0);
                    dVar.M++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.M;
                if (i37 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                iArr5[i37] = dVar.n(pVar, cVar3, iArr5[i37], true);
                dVar.M++;
            }
        }
    }

    public n4.a G() {
        return new n4.a(((AudioAttributes.Builder) this.b).build());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 H(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    public String J(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            e eVar = (e) this.b;
            f fVar = new f(stringWriter, eVar.a, eVar.b, eVar.c, eVar.d);
            fVar.h(obj);
            fVar.j();
            fVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // qg.w1
    public void K(float f7) {
        st0 st0Var = (st0) this.b;
        u0.e(st0Var.P1).k(String.valueOf(m.a.indexOf(st0Var.W0.getCurrentBrush())), f7);
        t1 t1Var = st0Var.K1;
        t1Var.c = f7;
        st0Var.t0(t1Var, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void P0(int i10, u1 u1Var) {
        ia iaVar = (ia) this.b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ia iaVar = (ia) this.b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(u1 u1Var) {
        return false;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        mm0 mm0Var = (mm0) this.b;
        mm0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        mm0Var.s.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // ah.j
    public void U(ah.a aVar) {
        aVar.a(((wi) this.b).getThemedColor(h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public void W(int i10, long j3) {
        u3.d dVar = (u3.d) this.b;
        if (i10 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i10 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i10) {
            case 131:
                dVar.d(i10);
                dVar.x.e = (int) j3;
                return;
            case 136:
                dVar.d(i10);
                dVar.x.X = j3 == 1;
                return;
            case 155:
                dVar.L = dVar.l(j3);
                return;
            case 159:
                dVar.d(i10);
                dVar.x.Q = (int) j3;
                return;
            case 176:
                dVar.d(i10);
                dVar.x.n = (int) j3;
                return;
            case MessagesStorage.LAST_DB_VERSION /* 179 */:
                dVar.b(i10);
                dVar.F.c(dVar.l(j3));
                return;
            case 186:
                dVar.d(i10);
                dVar.x.o = (int) j3;
                return;
            case 215:
                dVar.d(i10);
                dVar.x.d = (int) j3;
                return;
            case 231:
                dVar.E = dVar.l(j3);
                return;
            case 238:
                dVar.S = (int) j3;
                return;
            case 241:
                if (dVar.H) {
                    return;
                }
                dVar.b(i10);
                dVar.G.c(j3);
                dVar.H = true;
                return;
            case 251:
                dVar.T = true;
                return;
            case 16871:
                dVar.d(i10);
                dVar.x.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                dVar.A = j3 + dVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                dVar.d(i10);
                if (i11 == 0) {
                    dVar.x.y = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.x.y = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.x.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.x.y = 3;
                    return;
                }
            case 21680:
                dVar.d(i10);
                dVar.x.q = (int) j3;
                return;
            case 21682:
                dVar.d(i10);
                dVar.x.s = (int) j3;
                return;
            case 21690:
                dVar.d(i10);
                dVar.x.r = (int) j3;
                return;
            case 21930:
                dVar.d(i10);
                dVar.x.W = j3 == 1;
                return;
            case 21938:
                dVar.d(i10);
                u3.c cVar = dVar.x;
                cVar.z = true;
                cVar.p = (int) j3;
                return;
            case 21998:
                dVar.d(i10);
                dVar.x.g = (int) j3;
                return;
            case 22186:
                dVar.d(i10);
                dVar.x.T = j3;
                return;
            case 22203:
                dVar.d(i10);
                dVar.x.U = j3;
                return;
            case 25188:
                dVar.d(i10);
                dVar.x.R = (int) j3;
                return;
            case 30114:
                dVar.U = j3;
                return;
            case 30321:
                dVar.d(i10);
                int i12 = (int) j3;
                if (i12 == 0) {
                    dVar.x.t = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.x.t = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.x.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.x.t = 3;
                    return;
                }
            case 2352003:
                dVar.d(i10);
                dVar.x.f = (int) j3;
                return;
            case 2807729:
                dVar.t = j3;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.d(i10);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            dVar.x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i10);
                        int g10 = b2.j.g((int) j3);
                        if (g10 != -1) {
                            dVar.x.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i10);
                        dVar.x.z = true;
                        int f7 = b2.j.f((int) j3);
                        if (f7 != -1) {
                            dVar.x.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i10);
                        dVar.x.D = (int) j3;
                        return;
                    case 21949:
                        dVar.d(i10);
                        dVar.x.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ro0
    public void X(float f7, boolean z10) {
        h hVar = (h) this.b;
        float f10 = hVar.b;
        float z11 = e2.z(hVar.c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            r6 r6Var = hVar.e;
            r6Var.getClass();
            r6Var.b(null, z11);
        }
        hVar.invalidate();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hv0 Y1() {
        return null;
    }

    public void Z() {
        o2.k kVar = (o2.k) this.b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.a;
        }
        b2.l1[] l1VarArr = new b2.l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new p1(l1VarArr);
        kVar.G.b(kVar);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 23:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar);
                k7.a.c(I0, aVar);
                I0.writeStrongBinder(null);
                eVar.J0(I0, 2);
                return;
            default:
                v8.e eVar2 = (v8.e) this.b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar2 = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    i iVar = (i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    h5.a(Status.h, Boolean.FALSE, aVar2.b);
                    return;
                }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ia iaVar = (ia) this.b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override // s4.h1
    public int c(View view) {
        return o0.z(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).topMargin;
    }

    public void c0(p4.p pVar, p4.m mVar, Collection collection) {
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
        u uVar = eVar.x.a;
        String d = mVar.d();
        p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c1(int i10, u1 u1Var) {
        return i10 == ((ia) this.b).s;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // ah.j
    public void d(Canvas canvas) {
        wi wiVar = (wi) this.b;
        canvas.drawColor(wiVar.getThemedColor(h6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            wiVar.C2.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean e() {
        return ((ia) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // s4.h1
    public int g() {
        return ((o0) this.b).G();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g0(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        m20 m20Var;
        boolean z11;
        l20 l20Var = (l20) this.b;
        int i10 = l20.w;
        m20 m20Var2 = l20Var.f;
        androidx.mediarouter.app.c cVar = l20Var.e;
        int action = motionEvent.getAction();
        if (l20Var.v == null) {
            l20Var.v = VelocityTracker.obtain();
        }
        l20Var.v.addMovement(motionEvent);
        int i11 = action & 255;
        boolean z12 = i11 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f7 = motionEvent.getX(i12) + f7;
                f10 = motionEvent.getY(i12) + f10;
            }
        }
        float f11 = z12 ? pointerCount - 1 : pointerCount;
        float f12 = f7 / f11;
        float f13 = f10 / f11;
        if (i11 == 0) {
            if (l20Var.g != null && m20Var2.a()) {
                boolean hasMessages = cVar.hasMessages(3);
                if (hasMessages) {
                    cVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = l20Var.m;
                if (motionEvent4 != null && (motionEvent3 = l20Var.n) != null && hasMessages && l20Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y3 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y3 * y3) + (x10 * x10) < l20Var.b) {
                        l20Var.o = true;
                        z10 = l20Var.g.onDoubleTap(l20Var.m) | l20Var.g.onDoubleTapEvent(motionEvent);
                        l20Var.p = f12;
                        l20Var.r = f12;
                        l20Var.q = f13;
                        l20Var.s = f13;
                        motionEvent2 = l20Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        l20Var.m = MotionEvent.obtain(motionEvent);
                        l20Var.k = true;
                        l20Var.l = true;
                        l20Var.h = true;
                        l20Var.j = false;
                        l20Var.i = false;
                        if (l20Var.t) {
                            cVar.removeMessages(2);
                            cVar.sendEmptyMessageAtTime(2, l20Var.m.getDownTime() + i10 + l20Var.u);
                        }
                        cVar.sendEmptyMessageAtTime(1, l20Var.m.getDownTime() + i10);
                        return m20Var2.onDown(motionEvent) | z10;
                    }
                }
                cVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            l20Var.p = f12;
            l20Var.r = f12;
            l20Var.q = f13;
            l20Var.s = f13;
            motionEvent2 = l20Var.m;
            if (motionEvent2 != null) {
            }
            l20Var.m = MotionEvent.obtain(motionEvent);
            l20Var.k = true;
            l20Var.l = true;
            l20Var.h = true;
            l20Var.j = false;
            l20Var.i = false;
            if (l20Var.t) {
            }
            cVar.sendEmptyMessageAtTime(1, l20Var.m.getDownTime() + i10);
            return m20Var2.onDown(motionEvent) | z10;
        }
        if (i11 == 1) {
            l20Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (l20Var.o) {
                onFling = l20Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (l20Var.j) {
                    cVar.removeMessages(3);
                    l20Var.j = false;
                } else if (l20Var.k) {
                    boolean onSingleTapUp = m20Var2.onSingleTapUp(motionEvent);
                    if (l20Var.i && (m20Var = l20Var.g) != null) {
                        m20Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = l20Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, l20Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > l20Var.c || Math.abs(xVelocity) > l20Var.c) {
                        onFling = m20Var2.onFling(l20Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = l20Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            l20Var.n = obtain;
            VelocityTracker velocityTracker2 = l20Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                l20Var.v = null;
            }
            l20Var.o = false;
            l20Var.i = false;
            cVar.removeMessages(1);
            cVar.removeMessages(2);
            return onFling;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                l20Var.v.recycle();
                l20Var.v = null;
                l20Var.o = false;
                l20Var.h = false;
                l20Var.k = false;
                l20Var.l = false;
                l20Var.i = false;
                if (l20Var.j) {
                    l20Var.j = false;
                    return false;
                }
            } else if (i11 == 5) {
                l20Var.p = f12;
                l20Var.r = f12;
                l20Var.q = f13;
                l20Var.s = f13;
                cVar.removeMessages(1);
                cVar.removeMessages(2);
                cVar.removeMessages(3);
                l20Var.o = false;
                l20Var.k = false;
                l20Var.l = false;
                l20Var.i = false;
                if (l20Var.j) {
                    l20Var.j = false;
                    return false;
                }
            } else if (i11 == 6) {
                l20Var.p = f12;
                l20Var.r = f12;
                l20Var.q = f13;
                l20Var.s = f13;
                l20Var.v.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, l20Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = l20Var.v.getXVelocity(pointerId2);
                float yVelocity2 = l20Var.v.getYVelocity(pointerId2);
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    if (i13 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i13);
                        if ((l20Var.v.getYVelocity(pointerId3) * yVelocity2) + (l20Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            l20Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!l20Var.j) {
            float f14 = l20Var.p - f12;
            float f15 = l20Var.q - f13;
            if (l20Var.o) {
                return l20Var.g.onDoubleTapEvent(motionEvent);
            }
            if (l20Var.k) {
                int i14 = (int) (f12 - l20Var.r);
                int i15 = (int) (f13 - l20Var.s);
                int i16 = (i15 * i15) + (i14 * i14);
                if (i16 > l20Var.a) {
                    z11 = m20Var2.onScroll(l20Var.m, motionEvent, f14, f15);
                    l20Var.p = f12;
                    l20Var.q = f13;
                    l20Var.k = false;
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    cVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i16 > l20Var.a) {
                    l20Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f14) >= 1.0f || Math.abs(f15) >= 1.0f) {
                boolean onScroll = m20Var2.onScroll(l20Var.m, motionEvent, f14, f15);
                l20Var.p = f12;
                l20Var.q = f13;
                return onScroll;
            }
        }
        return false;
    }

    @Override // qg.w1
    public float get() {
        st0 st0Var = (st0) this.b;
        int i10 = st0Var.P1;
        m currentBrush = st0Var.W0.getCurrentBrush();
        return currentBrush == null ? u0.e(i10).i : u0.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.ro0
    public CharSequence getContentDescription() {
        h hVar = (h) this.b;
        float f7 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.Components.j71
    public void invalidate() {
        ((og0) this.b).h.invalidate();
    }

    public void j0(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public c k0(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void l(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return e();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // u2.c1
    public void m(d1 d1Var) {
        o2.k kVar = (o2.k) this.b;
        kVar.G.m(kVar);
    }

    @Override // org.telegram.ui.Components.ro0
    public /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(z5 z5Var) {
        return false;
    }

    public /* bridge */ void p0(int i10) {
        k0(i10);
    }

    @Override // o0.b
    public Cursor q(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public Object r0() {
        if (n7.a.b == null) {
            n7.a.b = new cc.k();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public String toString() {
        switch (this.a) {
            case 19:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // r2.k
    public l v(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (i10 < 31 && ((context = (Context) this.b) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new rb.a(20).v(nVar);
        }
        int h = r0.h(((b2.s) nVar.c).r);
        e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
        return new z0(14, new r2.b(h, 0), new r2.b(h, 1)).v(nVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // s4.h1
    public int x() {
        o0 o0Var = (o0) this.b;
        return o0Var.n - o0Var.C();
    }

    @Override // s4.h1
    public View y(int i10) {
        return ((o0) this.b).q(i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ r9 z2() {
        return null;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ c(s6.g gVar, s6.a aVar) {
        this.a = 23;
        this.b = aVar;
    }

    public c(v1.c[] initializers) {
        this.a = 25;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public c(ArrayList arrayList) {
        this.a = 20;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public c(EditText editText) {
        this.a = 15;
        this.b = new z0(editText);
    }

    public c(Context context, Uri uri) {
        this.a = 6;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(Context context, m20 m20Var) {
        this.a = 10;
        this.b = new l20(context, m20Var);
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 27:
                this.b = new qb.b(28);
                break;
            default:
                this.b = new AudioAttributes.Builder();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void B() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}
