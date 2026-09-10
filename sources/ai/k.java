package ai;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.g1;
import hi.d2;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.zn;
import org.telegram.ui.bw0;
import org.telegram.ui.ic1;
import org.telegram.ui.kp;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.oa;
import org.telegram.ui.zv0;
import s4.c1;
import zh.a5;
import zh.s4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k extends s4.v {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // s4.v
    public void a(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 2:
                super.a(recyclerView, c1Var);
                View view = c1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                break;
            case 3:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 4:
                r61 r61Var = (r61) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof d2) {
                    d2 d2Var = (d2) view2.getBackground();
                    if (d2Var.c) {
                        d2Var.c = false;
                        d2Var.invalidateSelf();
                    }
                }
                if (r61Var.z1()) {
                    r61Var.E1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(wr.h).start();
                    break;
                }
                break;
            case 5:
            default:
                super.a(recyclerView, c1Var);
                break;
            case 6:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
        }
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                a0 a0Var = (a0) this.e;
                if (!a0Var.W.G.C1 || !a0Var.v.L(c1Var.b())) {
                    break;
                } else {
                    a0Var.f.setItemAnimator(a0Var.n);
                    break;
                }
            case 1:
                if (c1Var.f != 1 || !((oa) c1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (c1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 3:
                int b10 = c1Var.b();
                fn0 fn0Var = (fn0) this.e;
                if (b10 >= fn0Var.v && c1Var.b() < fn0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                r61 r61Var = (r61) this.e;
                if (r61Var.c3 && r61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (r61Var.X2.o == 0) {
                        if (!r61Var.b3) {
                            i10 = 12;
                        }
                    } else if (!r61Var.b3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((l2.h) ((u81) this.e).y).j(c1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (c1Var.f != 5 || !r(c1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return s4.v.l(0, 0);
    }

    @Override // s4.v
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((a0) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((fn0) this.e).I.f();
            case 4:
                r61 r61Var = (r61) this.e;
                return r61Var.c3 && r61Var.e3;
            case 6:
                return true;
        }
    }

    @Override // s4.v
    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                r61 r61Var = (r61) this.e;
                if (i10 != 2 || z10 || !r61Var.z1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        r61Var.D1(c1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((u81) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                break;
        }
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, c1 c1Var, c1 c1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                r rVar = ((a0) this.e).v;
                if (!rVar.L(c1Var.b()) || !rVar.L(c1Var2.b())) {
                    return false;
                }
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ArrayList arrayList2 = rVar.n;
                a5 a5Var = rVar.e;
                if (a5Var != null && b10 >= 0 && b10 < a5Var.i.size() && b11 >= 0 && b11 < rVar.e.i.size()) {
                    if (rVar.e instanceof s4) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < rVar.e.i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) rVar.e.i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(rVar.e.g);
                    }
                    if (!rVar.r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        rVar.r = true;
                    }
                    MessageObject messageObject = (MessageObject) rVar.e.i.get(b10);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    rVar.e.C(arrayList, false);
                    rVar.p(b10, b11);
                }
                return true;
            case 1:
                if (c1Var.f == c1Var2.f) {
                    View view = c1Var2.a;
                    if (!(view instanceof oa) || ((oa) view).G) {
                        kp kpVar = ((lp) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        lp lpVar = kpVar.c;
                        mp mpVar = lpVar.a3;
                        ArrayList arrayList3 = mpVar.N;
                        if (i14 >= mpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            lpVar.Y2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        kpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        kpVar.n(b12, 3);
                        kpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f != c1Var2.f) {
                    return false;
                }
                xn xnVar = ((zn) this.e).r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                zn znVar = xnVar.d;
                int i16 = znVar.t0;
                ph.f fVar = znVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = znVar.M) && i18 < i10) {
                    ph.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = znVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = znVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    xnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                fn0 fn0Var = (fn0) this.e;
                ArrayList arrayList4 = fn0Var.e;
                if (b17 < fn0Var.v || c1Var2.b() >= fn0Var.w) {
                    return false;
                }
                int b18 = c1Var.b();
                int b19 = c1Var2.b();
                int i19 = fn0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - fn0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(fn0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                fn0Var.c.p(b18, b19);
                return false;
            case 4:
                r61 r61Var = (r61) this.e;
                j61 j61Var = r61Var.Y2;
                if (j61Var.H(c1Var.b()) < 0 || j61Var.H(c1Var.b()) != j61Var.H(c1Var2.b())) {
                    return false;
                }
                int b20 = c1Var.b();
                int b21 = c1Var2.b();
                ArrayList arrayList5 = j61Var.x;
                if (j61Var.L != null) {
                    int H = j61Var.H(b20);
                    int H2 = j61Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = j61Var.J(b20);
                        boolean J2 = j61Var.J(b21);
                        arrayList5.add(b21, (v51) arrayList5.remove(b20));
                        j61Var.p(b20, b21);
                        if (j61Var.J(b21) != J) {
                            j61Var.n(b21, 3);
                        }
                        if (j61Var.J(b20) != J2) {
                            j61Var.n(b20, 3);
                        }
                        if (j61Var.K && (i11 = j61Var.J) != H) {
                            j61Var.F(i11);
                        }
                        j61Var.K = true;
                        j61Var.J = H;
                    }
                }
                r61Var.G1();
                return true;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                u81 u81Var = (u81) this.e;
                ArrayList arrayList6 = u81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l2.h) u81Var.y).j(b22) && ((l2.h) u81Var.y).j(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    u81Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((r81) obj).a));
                    }
                    n81 n81Var = ((v81) ((l2.h) u81Var.y).b).L;
                    z11 = true;
                    z11 = true;
                    if (n81Var != null) {
                        n81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f != c1Var2.f || !r(c1Var.b()) || !r(c1Var2.b())) {
                    return false;
                }
                zv0 zv0Var = ((bw0) this.e).b;
                int b24 = c1Var.b();
                int b25 = c1Var2.b();
                bw0 bw0Var = zv0Var.d;
                int i23 = bw0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = bw0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = bw0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = bw0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = bw0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    zv0Var.p(b24, b25);
                }
                return true;
        }
    }

    @Override // s4.v
    public void o(RecyclerView recyclerView, c1 c1Var, c1 c1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                break;
            default:
                super.o(recyclerView, c1Var, c1Var2, i10, i11, i12);
                break;
        }
    }

    @Override // s4.v
    public void p(c1 c1Var, int i10) {
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                a0 a0Var = (a0) this.e;
                o oVar = a0Var.f;
                if (c1Var != null) {
                    oVar.c1(false);
                }
                if (i10 == 0) {
                    r rVar = a0Var.v;
                    ArrayList arrayList2 = rVar.n;
                    a5 a5Var = rVar.e;
                    if (a5Var != null && rVar.r) {
                        if (a5Var instanceof s4) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < rVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) rVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = a5Var.g;
                        }
                        boolean z10 = arrayList2.size() != arrayList.size();
                        if (!z10) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (arrayList2.get(i12) != arrayList.get(i12)) {
                                        z10 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            rVar.e.C(arrayList, true);
                        }
                        rVar.r = false;
                    }
                    oVar.setItemAnimator(null);
                    break;
                } else {
                    oVar.I0(false);
                    if (c1Var != null) {
                        c1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                lp lpVar = (lp) this.e;
                mp mpVar = lpVar.a3;
                if (i10 != 0) {
                    mpVar.L = true;
                    lpVar.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                } else {
                    mpVar.L = false;
                    if (lpVar.Y2) {
                        TLRPC.Chat chat = mpVar.X;
                        ArrayList arrayList3 = mpVar.N;
                        ArrayList arrayList4 = mpVar.M;
                        if (chat != null) {
                            lpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = mpVar.X;
                            tL_inputChannel.channel_id = chat2.id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                                if (((TLRPC.TL_username) arrayList4.get(i13)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList4.get(i13)).username);
                                }
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((TLRPC.TL_username) arrayList3.get(i14)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList3.get(i14)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList5;
                            mpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new g1(6));
                            mpVar.X.usernames.clear();
                            mpVar.X.usernames.addAll(arrayList4);
                            mpVar.X.usernames.addAll(arrayList3);
                            mpVar.getMessagesController().putChat(mpVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                zn znVar = (zn) this.e;
                ic1 ic1Var = znVar.s;
                if (i10 != 0) {
                    ic1Var.setItemAnimator(znVar.v);
                    ic1Var.I0(false);
                    c1Var.a.setPressed(true);
                    c1Var.a.setBackgroundColor(j6.v0(j6.h5, znVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((fn0) this.e).b.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                r61 r61Var = (r61) this.e;
                if (c1Var != null) {
                    r61Var.c1(false);
                }
                if (i10 == 0) {
                    j61 j61Var = r61Var.Y2;
                    if (j61Var.K) {
                        j61Var.F(j61Var.J);
                    }
                    if (r61Var.d3 != null) {
                        r61Var.C1();
                        r61Var.d3 = null;
                        break;
                    }
                } else {
                    r61Var.I0(false);
                    if (c1Var != null) {
                        View view = c1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof d2) {
                            d2 d2Var = (d2) view.getBackground();
                            if (!d2Var.c) {
                                d2Var.c = true;
                                d2Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            r61Var.d3 = c1Var;
                            r61Var.F1(c1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((bw0) this.e).c.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // s4.v
    public final void q(c1 c1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        bw0 bw0Var = (bw0) this.e;
        return !bw0Var.I || i10 - bw0Var.n0 >= bw0Var.x;
    }

    private final void t(c1 c1Var) {
    }

    private final void u(c1 c1Var) {
    }

    private final void v(c1 c1Var) {
    }

    private final void w(c1 c1Var) {
    }

    private final void x(c1 c1Var) {
    }

    private final void y(c1 c1Var) {
    }

    private final void z(c1 c1Var) {
    }

    private final void s(RecyclerView recyclerView, c1 c1Var, c1 c1Var2, int i10, int i11, int i12) {
    }
}
