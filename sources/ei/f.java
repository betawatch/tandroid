package ei;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.d6;
import di.s6;
import di.z6;
import java.util.ArrayList;
import li.y1;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.v91;
import org.telegram.ui.ap;
import org.telegram.ui.bb1;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.mv0;
import org.telegram.ui.ov0;
import org.telegram.ui.qa;
import s4.e1;
import s4.w;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends w {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // s4.w
    public void a(RecyclerView recyclerView, e1 e1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, e1Var);
                e1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, e1Var);
                e1Var.a.setPressed(false);
                break;
            case 2:
                super.a(recyclerView, e1Var);
                View view = e1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                break;
            case 3:
                super.a(recyclerView, e1Var);
                e1Var.a.setPressed(false);
                break;
            case 4:
                s71 s71Var = (s71) this.e;
                super.a(recyclerView, e1Var);
                View view2 = e1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof y1) {
                    y1 y1Var = (y1) view2.getBackground();
                    if (y1Var.c) {
                        y1Var.c = false;
                        y1Var.invalidateSelf();
                    }
                }
                if (s71Var.G1()) {
                    s71Var.L1(e1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(ds.h).start();
                    break;
                }
                break;
            case 5:
            default:
                super.a(recyclerView, e1Var);
                break;
            case 6:
                super.a(recyclerView, e1Var);
                e1Var.a.setPressed(false);
                break;
        }
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, e1 e1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                if (!rVar.W.G.E1 || !rVar.v.L(e1Var.b())) {
                    break;
                } else {
                    rVar.f.setItemAnimator(rVar.n);
                    break;
                }
            case 1:
                if (e1Var.f != 1 || !((qa) e1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (e1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 3:
                int b10 = e1Var.b();
                do0 do0Var = (do0) this.e;
                if (b10 >= do0Var.v && e1Var.b() < do0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                s71 s71Var = (s71) this.e;
                if (s71Var.k3 && s71Var.g3.H(e1Var.b()) >= 0) {
                    int i10 = 15;
                    if (s71Var.f3.o == 0) {
                        if (!s71Var.j3) {
                            i10 = 12;
                        }
                    } else if (!s71Var.j3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((jg.i) ((u91) this.e).y).b0(e1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (e1Var.f != 5 || !r(e1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return w.l(0, 0);
    }

    @Override // s4.w
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((r) this.e).W.G.E1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((do0) this.e).I.g();
            case 4:
                s71 s71Var = (s71) this.e;
                return s71Var.k3 && s71Var.m3;
            case 6:
                return true;
        }
    }

    @Override // s4.w
    public void m(Canvas canvas, RecyclerView recyclerView, e1 e1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                s71 s71Var = (s71) this.e;
                if (i10 != 2 || z10 || !s71Var.G1()) {
                    super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        s71Var.K1(e1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                ((u91) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                break;
        }
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, e1 e1Var, e1 e1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((r) this.e).v;
                if (!lVar.L(e1Var.b()) || !lVar.L(e1Var2.b())) {
                    return false;
                }
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                ArrayList arrayList2 = lVar.n;
                z6 z6Var = lVar.e;
                if (z6Var != null && b10 >= 0 && b10 < z6Var.i.size() && b11 >= 0 && b11 < lVar.e.i.size()) {
                    if (lVar.e instanceof s6) {
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
                if (e1Var.f == e1Var2.f) {
                    View view = e1Var2.a;
                    if (!(view instanceof qa) || ((qa) view).G) {
                        ap apVar = ((bp) this.e).f3;
                        int b12 = e1Var.b();
                        int b13 = e1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        bp bpVar = apVar.c;
                        cp cpVar = bpVar.i3;
                        ArrayList arrayList3 = cpVar.N;
                        if (i14 >= cpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            bpVar.g3 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        apVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        apVar.n(b12, 3);
                        apVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (e1Var.f != e1Var2.f) {
                    return false;
                }
                eo eoVar = ((go) this.e).r;
                int b14 = e1Var.b();
                int b15 = e1Var2.b();
                go goVar = eoVar.d;
                int i16 = goVar.t0;
                sh.f fVar = goVar.m1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = goVar.M) && i18 < i10) {
                    sh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = goVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = goVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    eoVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = e1Var2.b();
                do0 do0Var = (do0) this.e;
                ArrayList arrayList4 = do0Var.e;
                if (b17 < do0Var.v || e1Var2.b() >= do0Var.w) {
                    return false;
                }
                int b18 = e1Var.b();
                int b19 = e1Var2.b();
                int i19 = do0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - do0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(do0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                do0Var.c.p(b18, b19);
                return false;
            case 4:
                s71 s71Var = (s71) this.e;
                k71 k71Var = s71Var.g3;
                if (k71Var.H(e1Var.b()) < 0 || k71Var.H(e1Var.b()) != k71Var.H(e1Var2.b())) {
                    return false;
                }
                int b20 = e1Var.b();
                int b21 = e1Var2.b();
                ArrayList arrayList5 = k71Var.y;
                if (k71Var.M != null) {
                    int H = k71Var.H(b20);
                    int H2 = k71Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = k71Var.J(b20);
                        boolean J2 = k71Var.J(b21);
                        arrayList5.add(b21, (u61) arrayList5.remove(b20));
                        k71Var.p(b20, b21);
                        if (k71Var.J(b21) != J) {
                            k71Var.n(b21, 3);
                        }
                        if (k71Var.J(b20) != J2) {
                            k71Var.n(b20, 3);
                        }
                        if (k71Var.L && (i11 = k71Var.K) != H) {
                            k71Var.F(i11);
                        }
                        k71Var.L = true;
                        k71Var.K = H;
                    }
                }
                s71Var.N1();
                return true;
            case 5:
                int b22 = e1Var.b();
                int b23 = e1Var2.b();
                u91 u91Var = (u91) this.e;
                ArrayList arrayList6 = u91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((jg.i) u91Var.y).b0(b22) && ((jg.i) u91Var.y).b0(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    u91Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((r91) obj).a));
                    }
                    n91 n91Var = ((v91) ((jg.i) u91Var.y).a).L;
                    z11 = true;
                    z11 = true;
                    if (n91Var != null) {
                        n91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (e1Var.f != e1Var2.f || !r(e1Var.b()) || !r(e1Var2.b())) {
                    return false;
                }
                mv0 mv0Var = ((ov0) this.e).b;
                int b24 = e1Var.b();
                int b25 = e1Var2.b();
                ov0 ov0Var = mv0Var.d;
                int i23 = ov0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = ov0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = ov0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = ov0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = ov0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    mv0Var.p(b24, b25);
                }
                return true;
        }
    }

    @Override // s4.w
    public void o(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                break;
            default:
                super.o(recyclerView, e1Var, e1Var2, i10, i11, i12);
                break;
        }
    }

    @Override // s4.w
    public void p(e1 e1Var, int i10) {
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                i iVar = rVar.f;
                if (e1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.n;
                    z6 z6Var = lVar.e;
                    if (z6Var != null && lVar.r) {
                        if (z6Var instanceof s6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = z6Var.g;
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
                    if (e1Var != null) {
                        e1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                bp bpVar = (bp) this.e;
                cp cpVar = bpVar.i3;
                if (i10 != 0) {
                    cpVar.L = true;
                    bpVar.I0(false);
                    e1Var.a.setPressed(true);
                    break;
                } else {
                    cpVar.L = false;
                    if (bpVar.g3) {
                        TLRPC.Chat chat = cpVar.X;
                        ArrayList arrayList3 = cpVar.N;
                        ArrayList arrayList4 = cpVar.M;
                        if (chat != null) {
                            bpVar.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = cpVar.X;
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
                            cpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new d6(10));
                            cpVar.X.usernames.clear();
                            cpVar.X.usernames.addAll(arrayList4);
                            cpVar.X.usernames.addAll(arrayList3);
                            cpVar.getMessagesController().putChat(cpVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                go goVar = (go) this.e;
                bb1 bb1Var = goVar.s;
                if (i10 != 0) {
                    bb1Var.setItemAnimator(goVar.v);
                    bb1Var.I0(false);
                    e1Var.a.setPressed(true);
                    f7.i(y6.h5, e1Var.a, goVar.a);
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((do0) this.e).b.I0(false);
                    e1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                s71 s71Var = (s71) this.e;
                if (e1Var != null) {
                    s71Var.d1(false);
                }
                if (i10 == 0) {
                    k71 k71Var = s71Var.g3;
                    if (k71Var.L) {
                        k71Var.F(k71Var.K);
                    }
                    if (s71Var.l3 != null) {
                        s71Var.J1();
                        s71Var.l3 = null;
                        break;
                    }
                } else {
                    s71Var.I0(false);
                    if (e1Var != null) {
                        View view = e1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof y1) {
                            y1 y1Var = (y1) view.getBackground();
                            if (!y1Var.c) {
                                y1Var.c = true;
                                y1Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            s71Var.l3 = e1Var;
                            s71Var.M1(e1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((ov0) this.e).c.I0(false);
                    e1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // s4.w
    public final void q(e1 e1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        ov0 ov0Var = (ov0) this.e;
        return !ov0Var.I || i10 - ov0Var.n0 >= ov0Var.x;
    }

    private final void t(e1 e1Var) {
    }

    private final void u(e1 e1Var) {
    }

    private final void v(e1 e1Var) {
    }

    private final void w(e1 e1Var) {
    }

    private final void x(e1 e1Var) {
    }

    private final void y(e1 e1Var) {
    }

    private final void z(e1 e1Var) {
    }

    private final void s(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i10, int i11, int i12) {
    }
}
