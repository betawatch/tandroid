package ci;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.f8;
import bi.g7;
import bi.o8;
import java.util.ArrayList;
import ji.a2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.dw0;
import org.telegram.ui.fw0;
import org.telegram.ui.kc1;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.sa;
import s4.b1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f extends s4.v {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // s4.v
    public void a(RecyclerView recyclerView, b1 b1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, b1Var);
                b1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, b1Var);
                b1Var.a.setPressed(false);
                break;
            case 2:
                super.a(recyclerView, b1Var);
                View view = b1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                break;
            case 3:
                super.a(recyclerView, b1Var);
                b1Var.a.setPressed(false);
                break;
            case 4:
                i71 i71Var = (i71) this.e;
                super.a(recyclerView, b1Var);
                View view2 = b1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.c) {
                        a2Var.c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (i71Var.B1()) {
                    i71Var.G1(b1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(es.h).start();
                    break;
                }
                break;
            case 5:
            default:
                super.a(recyclerView, b1Var);
                break;
            case 6:
                super.a(recyclerView, b1Var);
                b1Var.a.setPressed(false);
                break;
        }
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, b1 b1Var) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                if (!tVar.W.G.C1 || !tVar.v.L(b1Var.b())) {
                    break;
                } else {
                    tVar.f.setItemAnimator(tVar.n);
                    break;
                }
            case 1:
                if (b1Var.f != 1 || !((sa) b1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (b1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 3:
                int b10 = b1Var.b();
                xn0 xn0Var = (xn0) this.e;
                if (b10 >= xn0Var.v && b1Var.b() < xn0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                i71 i71Var = (i71) this.e;
                if (i71Var.a3 && i71Var.W2.H(b1Var.b()) >= 0) {
                    int i10 = 15;
                    if (i71Var.V2.o == 0) {
                        if (!i71Var.Z2) {
                            i10 = 12;
                        }
                    } else if (!i71Var.Z2) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((m.h) ((k91) this.e).y).b(b1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (b1Var.f != 5 || !r(b1Var.b())) {
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
                return ((t) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((xn0) this.e).I.g();
            case 4:
                i71 i71Var = (i71) this.e;
                return i71Var.a3 && i71Var.c3;
            case 6:
                return true;
        }
    }

    @Override // s4.v
    public void m(Canvas canvas, RecyclerView recyclerView, b1 b1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                i71 i71Var = (i71) this.e;
                if (i10 != 2 || z10 || !i71Var.B1()) {
                    super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        i71Var.F1(b1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                ((k91) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                break;
        }
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, b1 b1Var, b1 b1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((t) this.e).v;
                if (!lVar.L(b1Var.b()) || !lVar.L(b1Var2.b())) {
                    return false;
                }
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                ArrayList arrayList2 = lVar.n;
                o8 o8Var = lVar.e;
                if (o8Var != null && b10 >= 0 && b10 < o8Var.i.size() && b11 >= 0 && b11 < lVar.e.i.size()) {
                    if (lVar.e instanceof f8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.e.i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.e.i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.e.g);
                    }
                    if (!lVar.r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.e.i.get(b10);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (b1Var.f == b1Var2.f) {
                    View view = b1Var2.a;
                    if (!(view instanceof sa) || ((sa) view).G) {
                        lp lpVar = ((mp) this.e).V2;
                        int b12 = b1Var.b();
                        int b13 = b1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        mp mpVar = lpVar.c;
                        np npVar = mpVar.Y2;
                        ArrayList arrayList3 = npVar.N;
                        if (i14 >= npVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            mpVar.W2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        lpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        lpVar.n(b12, 3);
                        lpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (b1Var.f != b1Var2.f) {
                    return false;
                }
                go goVar = ((io) this.e).r;
                int b14 = b1Var.b();
                int b15 = b1Var2.b();
                io ioVar = goVar.d;
                int i16 = ioVar.t0;
                rh.f fVar = ioVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = ioVar.M) && i18 < i10) {
                    rh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = ioVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = ioVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    goVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = b1Var2.b();
                xn0 xn0Var = (xn0) this.e;
                ArrayList arrayList4 = xn0Var.e;
                if (b17 < xn0Var.v || b1Var2.b() >= xn0Var.w) {
                    return false;
                }
                int b18 = b1Var.b();
                int b19 = b1Var2.b();
                int i19 = xn0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - xn0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(xn0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                xn0Var.c.p(b18, b19);
                return false;
            case 4:
                i71 i71Var = (i71) this.e;
                a71 a71Var = i71Var.W2;
                if (a71Var.H(b1Var.b()) < 0 || a71Var.H(b1Var.b()) != a71Var.H(b1Var2.b())) {
                    return false;
                }
                int b20 = b1Var.b();
                int b21 = b1Var2.b();
                ArrayList arrayList5 = a71Var.x;
                if (a71Var.L != null) {
                    int H = a71Var.H(b20);
                    int H2 = a71Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = a71Var.J(b20);
                        boolean J2 = a71Var.J(b21);
                        arrayList5.add(b21, (m61) arrayList5.remove(b20));
                        a71Var.p(b20, b21);
                        if (a71Var.J(b21) != J) {
                            a71Var.n(b21, 3);
                        }
                        if (a71Var.J(b20) != J2) {
                            a71Var.n(b20, 3);
                        }
                        if (a71Var.K && (i11 = a71Var.J) != H) {
                            a71Var.F(i11);
                        }
                        a71Var.K = true;
                        a71Var.J = H;
                    }
                }
                i71Var.I1();
                return true;
            case 5:
                int b22 = b1Var.b();
                int b23 = b1Var2.b();
                k91 k91Var = (k91) this.e;
                ArrayList arrayList6 = k91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((m.h) k91Var.y).b(b22) && ((m.h) k91Var.y).b(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    k91Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((h91) obj).a));
                    }
                    d91 d91Var = ((l91) ((m.h) k91Var.y).b).L;
                    z11 = true;
                    z11 = true;
                    if (d91Var != null) {
                        d91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (b1Var.f != b1Var2.f || !r(b1Var.b()) || !r(b1Var2.b())) {
                    return false;
                }
                dw0 dw0Var = ((fw0) this.e).b;
                int b24 = b1Var.b();
                int b25 = b1Var2.b();
                fw0 fw0Var = dw0Var.d;
                int i23 = fw0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = fw0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = fw0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = fw0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = fw0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    dw0Var.p(b24, b25);
                }
                return true;
        }
    }

    @Override // s4.v
    public void o(RecyclerView recyclerView, b1 b1Var, b1 b1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                break;
            default:
                super.o(recyclerView, b1Var, b1Var2, i10, i11, i12);
                break;
        }
    }

    @Override // s4.v
    public void p(b1 b1Var, int i10) {
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                i iVar = tVar.f;
                if (b1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = tVar.v;
                    ArrayList arrayList2 = lVar.n;
                    o8 o8Var = lVar.e;
                    if (o8Var != null && lVar.r) {
                        if (o8Var instanceof f8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = o8Var.g;
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
                            lVar.e.C(arrayList, true);
                        }
                        lVar.r = false;
                    }
                    iVar.setItemAnimator(null);
                    break;
                } else {
                    iVar.I0(false);
                    if (b1Var != null) {
                        b1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                mp mpVar = (mp) this.e;
                np npVar = mpVar.Y2;
                if (i10 != 0) {
                    npVar.L = true;
                    mpVar.I0(false);
                    b1Var.a.setPressed(true);
                    break;
                } else {
                    npVar.L = false;
                    if (mpVar.W2) {
                        TLRPC.Chat chat = npVar.X;
                        ArrayList arrayList3 = npVar.N;
                        ArrayList arrayList4 = npVar.M;
                        if (chat != null) {
                            mpVar.W2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = npVar.X;
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
                            npVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new g7(10));
                            npVar.X.usernames.clear();
                            npVar.X.usernames.addAll(arrayList4);
                            npVar.X.usernames.addAll(arrayList3);
                            npVar.getMessagesController().putChat(npVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                io ioVar = (io) this.e;
                kc1 kc1Var = ioVar.s;
                if (i10 != 0) {
                    kc1Var.setItemAnimator(ioVar.v);
                    kc1Var.I0(false);
                    b1Var.a.setPressed(true);
                    b1Var.a.setBackgroundColor(g6.w0(g6.h5, ioVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((xn0) this.e).b.I0(false);
                    b1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                i71 i71Var = (i71) this.e;
                if (b1Var != null) {
                    i71Var.d1(false);
                }
                if (i10 == 0) {
                    a71 a71Var = i71Var.W2;
                    if (a71Var.K) {
                        a71Var.F(a71Var.J);
                    }
                    if (i71Var.b3 != null) {
                        i71Var.E1();
                        i71Var.b3 = null;
                        break;
                    }
                } else {
                    i71Var.I0(false);
                    if (b1Var != null) {
                        View view = b1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof a2) {
                            a2 a2Var = (a2) view.getBackground();
                            if (!a2Var.c) {
                                a2Var.c = true;
                                a2Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            i71Var.b3 = b1Var;
                            i71Var.H1(b1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((fw0) this.e).c.I0(false);
                    b1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // s4.v
    public final void q(b1 b1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        fw0 fw0Var = (fw0) this.e;
        return !fw0Var.I || i10 - fw0Var.n0 >= fw0Var.x;
    }

    private final void t(b1 b1Var) {
    }

    private final void u(b1 b1Var) {
    }

    private final void v(b1 b1Var) {
    }

    private final void w(b1 b1Var) {
    }

    private final void x(b1 b1Var) {
    }

    private final void y(b1 b1Var) {
    }

    private final void z(b1 b1Var) {
    }

    private final void s(RecyclerView recyclerView, b1 b1Var, b1 b1Var2, int i10, int i11, int i12) {
    }
}
