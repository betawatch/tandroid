package l2;

import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.recyclerview.widget.RecyclerView;
import b2.u0;
import b2.w0;
import c3.i0;
import c3.t;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.q;
import e2.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ki.t1;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.gt0;
import org.telegram.ui.pa1;
import qg.v0;
import rg.v1;
import s4.b1;
import s4.e1;
import s4.h1;
import s4.n0;
import s4.o0;
import tc.u;
import y8.e0;
import zh.r0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public class f implements l.i, i, cp0, ne.f, bh.h, c91, com.google.android.gms.common.api.internal.o, v1, h1, r, OnCompleteListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static void N(String str, TreeMap treeMap) {
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

    public void A(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override // s4.h1
    public int B(View view) {
        return n0.y(view) + ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).rightMargin;
    }

    public void C() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public s0.c D(int i10) {
        return null;
    }

    public s0.c E(int i10) {
        return null;
    }

    @Override // ne.f
    public void F() {
        ((m9) this.b).a.invalidate();
    }

    public void G(int i10, long j10) {
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
            throw w0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw w0.a(null, "ContentEncodingScope " + j10 + " not supported");
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
            case 231:
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
                throw w0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw w0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw w0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw w0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw w0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
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
                        int g10 = b2.n.g((int) j10);
                        if (g10 != -1) {
                            fVar.y.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.h(i10);
                        fVar.y.z = true;
                        int f7 = b2.n.f((int) j10);
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

    public void H(int i10) {
        TLRPC.TL_exportedNoPaidMessagesToken c10;
        r0 r0Var = ((zh.n0) this.b).e;
        if (r0Var != null) {
            int i11 = r0Var.a;
            if (r0Var.d == i10) {
                return;
            }
            if (r0Var.c.d && i10 == 2) {
                i10 = 1;
            }
            r0Var.d = i10;
            MessagesController.getMainSettings(i11).edit().putBoolean("qrNoPaidPermanent", r0Var.d == 2).apply();
            int i12 = r0Var.d;
            if (i12 == 0) {
                if (r0Var.n != 0) {
                    ConnectionsManager.getInstance(i11).cancelRequest(r0Var.n, true);
                    r0Var.n = 0;
                    return;
                }
                return;
            }
            if (i12 == 2 && (c10 = r0Var.c()) != null) {
                r0Var.f = c10;
                r0Var.b.setFreeLink(r0Var.d(c10));
            }
            r0Var.l(false, r0Var.d == 1);
        }
    }

    public void I(float f7) {
        e91 e91Var = (e91) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = e91Var.e;
            View[] viewArr2 = e91Var.e;
            if (viewArr[1] != null) {
                e91Var.F();
                e91Var.h.put(e91Var.f[1], viewArr2[1]);
                e91Var.removeView(viewArr2[1]);
                e91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            e91Var.z(e91Var.b);
            return;
        }
        View[] viewArr3 = e91Var.e;
        View[] viewArr4 = e91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (e91Var.y) {
            e91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            e91Var.E(viewArr4[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            e91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            e91Var.E(viewArr4[0], r1.getMeasuredWidth() * f7);
        }
        e91Var.w(false);
    }

    @Override // bh.h
    public void J(bh.a aVar) {
        aVar.a(((fr0) this.b).getThemedColor(h6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // org.telegram.ui.Components.cp0
    public void L(float f7, boolean z10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 5:
                ng.h hVar = (ng.h) obj;
                float f10 = hVar.b;
                float y3 = k3.y(hVar.c, f10, f7, f10);
                hVar.d = y3;
                if (z10) {
                    s6 s6Var = hVar.e;
                    s6Var.getClass();
                    s6Var.c(null, y3);
                }
                hVar.invalidate();
                break;
            default:
                pa1 pa1Var = (pa1) ((k0) obj);
                int i11 = (int) (h6.q * 100.0f);
                int i12 = (int) (f7 * 100.0f);
                h6.q = f7;
                if (i11 != i12) {
                    ThemeActivity themeActivity = pa1Var.e.e;
                    tl0 tl0Var = (tl0) themeActivity.b.K(themeActivity.f0);
                    if (tl0Var != null) {
                        ((d9) tl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.q * 100.0f))));
                    }
                    h6.E(true);
                    break;
                }
                break;
        }
    }

    public boolean O(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void P(b1 b1Var, u0 u0Var, u0 u0Var2) {
        boolean z10;
        b1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        e1 e1Var = (e1) recyclerView.c0;
        e1Var.getClass();
        int i11 = u0Var.a;
        int i12 = u0Var.b;
        View view = b1Var.a;
        int left = u0Var2 == null ? view.getLeft() : u0Var2.a;
        int top = u0Var2 == null ? view.getTop() : u0Var2.b;
        if (b1Var.j() || (i11 == left && i12 == top)) {
            int i13 = b1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            b1Var.i = (b1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            e1Var.s(b1Var, u0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = e1Var.r(b1Var, u0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void Q(int i10, long j10, long j11) {
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
                throw w0.a(null, "Multiple Segment elements not supported");
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
                fVar.j0.g0(new t(fVar.v));
                fVar.z = true;
            }
        }
    }

    public void R(int i10, String str) {
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
            throw w0.a(null, "DocType " + str + " not supported");
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

    public void S(b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        n0 n0Var = recyclerView.x;
        View view = b1Var.a;
        qf.e eVar = recyclerView.b;
        g3 g3Var = n0Var.a;
        t1 t1Var = (t1) g3Var.b;
        int indexOfChild = ((RecyclerView) t1Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) g3Var.c).F(indexOfChild)) {
                g3Var.X(view);
            }
            t1Var.Y(indexOfChild);
        }
        eVar.g(view);
    }

    public void T(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((u) this.b).c) {
        }
        throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
    }

    @Override // rg.v1
    public void U(float f7) {
        gt0 gt0Var = (gt0) this.b;
        v0.e(gt0Var.P1).k(String.valueOf(qg.m.a.indexOf(gt0Var.W0.getCurrentBrush())), f7);
        qg.t1 t1Var = gt0Var.K1;
        t1Var.c = f7;
        gt0Var.t0(t1Var, null);
    }

    public Object V() {
        if (n7.a.b == null) {
            n7.a.b = new q();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // org.telegram.ui.Components.cp0
    public /* synthetic */ int Y() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // l2.i
    public long a(long j10) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        s6.a aVar = (s6.a) this.b;
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, aVar);
        eVar.I0(H0, 1);
    }

    @Override // bh.h
    public void b(Canvas canvas) {
        fr0 fr0Var = (fr0) this.b;
        canvas.drawColor(fr0Var.getThemedColor(h6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            fr0Var.P0.b(canvas, -3);
        }
    }

    @Override // l2.i
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // l2.i
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public m2.j g(long j10) {
        return (m2.j) this.b;
    }

    @Override // rg.v1
    public float get() {
        gt0 gt0Var = (gt0) this.b;
        int i10 = gt0Var.P1;
        qg.m currentBrush = gt0Var.W0.getCurrentBrush();
        return currentBrush == null ? v0.e(i10).i : v0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.cp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 5:
                ng.h hVar = (ng.h) this.b;
                float f7 = hVar.b;
                return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
            default:
                return " ";
        }
    }

    @Override // ne.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // s4.h1
    public int j(View view) {
        return n0.x(view) - ((ViewGroup.MarginLayoutParams) ((o0) view.getLayoutParams())).leftMargin;
    }

    @Override // ne.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // s4.h1
    public int l() {
        return ((n0) this.b).D();
    }

    @Override // l.i
    public void n(l.k kVar) {
        k2.w0 w0Var = ((ActionMenuView) this.b).K;
        if (w0Var != null) {
            w0Var.n(kVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void o(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
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

    @Override // l2.i
    public long p(long j10, long j11) {
        return 0L;
    }

    @Override // l.i
    public boolean q(l.k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.b).P;
        if (lVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((le.b) lVar).b).W.c).iterator();
        while (it.hasNext()) {
            if (((b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // s4.h1
    public int r() {
        n0 n0Var = (n0) this.b;
        return n0Var.m - n0Var.E();
    }

    @Override // l2.i
    public boolean s() {
        return true;
    }

    public void t(int i10, int i11, c3.p pVar) {
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
                fVar.y.k = new i0(1, 0, 0, bArr3);
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
                throw w0.a(null, "Unexpected id: " + i10);
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
                            throw w0.a(null, "Unexpected lacing value: " + i26);
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
                                throw w0.a(null, "No valid varint length mask found");
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
                        throw w0.a(null, "EBML lacing sample size out of range.");
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

    @Override // l2.i
    public long u() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.cp0
    public void v() {
        int i10 = this.a;
    }

    @Override // l2.i
    public long w(long j10) {
        return 1L;
    }

    @Override // s4.h1
    public View x(int i10) {
        return ((n0) this.b).q(i10);
    }

    @Override // l2.i
    public long y(long j10, long j11) {
        return 1L;
    }

    public boolean z(int i10) {
        w81 w81Var = ((e91) this.b).L;
        if (w81Var == null) {
            return false;
        }
        return w81Var.c(i10);
    }

    public /* synthetic */ f(s6.g gVar, s6.a aVar) {
        this.a = 22;
        this.b = aVar;
    }

    public f(int i10) {
        this.a = i10;
        switch (i10) {
            case 19:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new vh0(this);
                    break;
                }
            default:
                this.b = new HashMap();
                break;
        }
    }

    private final void K() {
    }

    private final void M() {
    }

    @Override // ne.f
    public /* synthetic */ void c() {
    }

    @Override // ne.f
    public /* synthetic */ void m() {
    }

    @Override // ne.f
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // l2.i
    public long d(long j10, long j11) {
        return j11;
    }
}
