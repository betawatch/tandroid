package oh;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.b0;
import f2.l1;
import java.util.ArrayList;
import nh.d6;
import nh.l6;
import nh.p5;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.w51;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.dp;
import org.telegram.ui.dv0;
import org.telegram.ui.fv0;
import org.telegram.ui.jb1;
import org.telegram.ui.ma;
import vh.v1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class f extends b0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // f2.b0
    public void a(RecyclerView recyclerView, l1 l1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, l1Var);
                l1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, l1Var);
                l1Var.a.setPressed(false);
                break;
            case 2:
                super.a(recyclerView, l1Var);
                View view = l1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                break;
            case 3:
                super.a(recyclerView, l1Var);
                l1Var.a.setPressed(false);
                break;
            case 4:
                g61 g61Var = (g61) this.e;
                super.a(recyclerView, l1Var);
                View view2 = l1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof v1) {
                    v1 v1Var = (v1) view2.getBackground();
                    if (v1Var.c) {
                        v1Var.c = false;
                        v1Var.invalidateSelf();
                    }
                }
                if (g61Var.A1()) {
                    g61Var.F1(l1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(nr.h).start();
                    break;
                }
                break;
            case 5:
            default:
                super.a(recyclerView, l1Var);
                break;
            case 6:
                super.a(recyclerView, l1Var);
                l1Var.a.setPressed(false);
                break;
        }
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, l1 l1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                if (!rVar.T.D.z1 || !rVar.v.L(l1Var.b())) {
                    break;
                } else {
                    rVar.f.setItemAnimator(rVar.n);
                    break;
                }
            case 1:
                if (l1Var.f != 1 || !((ma) l1Var.a).D) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (l1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 3:
                int b10 = l1Var.b();
                dn0 dn0Var = (dn0) this.e;
                if (b10 >= dn0Var.v && l1Var.b() < dn0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                g61 g61Var = (g61) this.e;
                if (g61Var.Z2 && g61Var.V2.H(l1Var.b()) >= 0) {
                    int i10 = 15;
                    if (g61Var.U2.o == 0) {
                        if (!g61Var.Y2) {
                            i10 = 12;
                        }
                    } else if (!g61Var.Y2) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((o2.o) ((k81) this.e).y).j(l1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (l1Var.f != 5 || !r(l1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return b0.l(0, 0);
    }

    @Override // f2.b0
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((r) this.e).T.D.z1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((dn0) this.e).F.f();
            case 4:
                g61 g61Var = (g61) this.e;
                return g61Var.Z2 && g61Var.b3;
            case 6:
                return true;
        }
    }

    @Override // f2.b0
    public void m(Canvas canvas, RecyclerView recyclerView, l1 l1Var, float f10, float f11, int i10, boolean z4) {
        switch (this.d) {
            case 4:
                g61 g61Var = (g61) this.e;
                if (i10 != 2 || z4 || !g61Var.A1()) {
                    super.m(canvas, recyclerView, l1Var, f10, f11, i10, z4);
                    if (i10 == 2 && z4) {
                        g61Var.E1(l1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, l1Var, f10, f11, i10, z4);
                ((k81) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, l1Var, f10, f11, i10, z4);
                break;
        }
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, l1 l1Var, l1 l1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((r) this.e).v;
                if (!lVar.L(l1Var.b()) || !lVar.L(l1Var2.b())) {
                    return false;
                }
                int b10 = l1Var.b();
                int b11 = l1Var2.b();
                ArrayList arrayList2 = lVar.n;
                l6 l6Var = lVar.e;
                if (l6Var != null && b10 >= 0 && b10 < l6Var.i.size() && b11 >= 0 && b11 < lVar.e.i.size()) {
                    if (lVar.e instanceof d6) {
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
                if (l1Var.f == l1Var2.f) {
                    View view = l1Var2.a;
                    if (!(view instanceof ma) || ((ma) view).D) {
                        bp bpVar = ((cp) this.e).U2;
                        int b12 = l1Var.b();
                        int b13 = l1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        cp cpVar = bpVar.c;
                        dp dpVar = cpVar.X2;
                        ArrayList arrayList3 = dpVar.K;
                        if (i14 >= dpVar.K.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            cpVar.V2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        bpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        bpVar.n(b12, 3);
                        bpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (l1Var.f != l1Var2.f) {
                    return false;
                }
                on onVar = ((qn) this.e).r;
                int b14 = l1Var.b();
                int b15 = l1Var2.b();
                qn qnVar = onVar.d;
                int i16 = qnVar.q0;
                dh.i iVar = qnVar.i1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = qnVar.J) && i18 < i10) {
                    dh.h b16 = iVar.b(i17);
                    SparseArray sparseArray = iVar.a;
                    sparseArray.put(i17, iVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = qnVar.H;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = qnVar.I;
                    boolean z4 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z4;
                    onVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = l1Var2.b();
                dn0 dn0Var = (dn0) this.e;
                ArrayList arrayList4 = dn0Var.e;
                if (b17 < dn0Var.v || l1Var2.b() >= dn0Var.w) {
                    return false;
                }
                int b18 = l1Var.b();
                int b19 = l1Var2.b();
                int i19 = dn0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - dn0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(dn0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                dn0Var.c.p(b18, b19);
                return false;
            case 4:
                g61 g61Var = (g61) this.e;
                w51 w51Var = g61Var.V2;
                if (w51Var.H(l1Var.b()) < 0 || w51Var.H(l1Var.b()) != w51Var.H(l1Var2.b())) {
                    return false;
                }
                int b20 = l1Var.b();
                int b21 = l1Var2.b();
                ArrayList arrayList5 = w51Var.x;
                if (w51Var.I != null) {
                    int H = w51Var.H(b20);
                    int H2 = w51Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = w51Var.J(b20);
                        boolean J2 = w51Var.J(b21);
                        arrayList5.add(b21, (i51) arrayList5.remove(b20));
                        w51Var.p(b20, b21);
                        if (w51Var.J(b21) != J) {
                            w51Var.n(b21, 3);
                        }
                        if (w51Var.J(b20) != J2) {
                            w51Var.n(b20, 3);
                        }
                        if (w51Var.H && (i11 = w51Var.G) != H) {
                            w51Var.F(i11);
                        }
                        w51Var.H = true;
                        w51Var.G = H;
                    }
                }
                g61Var.H1();
                return true;
            case 5:
                int b22 = l1Var.b();
                int b23 = l1Var2.b();
                k81 k81Var = (k81) this.e;
                ArrayList arrayList6 = k81Var.h;
                boolean z10 = false;
                int i22 = 0;
                z10 = false;
                if (((o2.o) k81Var.y).j(b22) && ((o2.o) k81Var.y).j(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    k81Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((h81) obj).a));
                    }
                    c81 c81Var = ((l81) ((o2.o) k81Var.y).b).I;
                    z10 = true;
                    z10 = true;
                    if (c81Var != null) {
                        c81Var.a(arrayList7);
                    }
                }
                return z10;
            default:
                if (l1Var.f != l1Var2.f || !r(l1Var.b()) || !r(l1Var2.b())) {
                    return false;
                }
                dv0 dv0Var = ((fv0) this.e).b;
                int b24 = l1Var.b();
                int b25 = l1Var2.b();
                fv0 fv0Var = dv0Var.d;
                int i23 = fv0Var.k0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = fv0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = fv0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = fv0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = fv0Var.w;
                    boolean z11 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z11;
                    dv0Var.p(b24, b25);
                }
                return true;
        }
    }

    @Override // f2.b0
    public void o(RecyclerView recyclerView, l1 l1Var, l1 l1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                break;
            default:
                super.o(recyclerView, l1Var, l1Var2, i10, i11, i12);
                break;
        }
    }

    @Override // f2.b0
    public void p(l1 l1Var, int i10) {
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                i iVar = rVar.f;
                if (l1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.n;
                    l6 l6Var = lVar.e;
                    if (l6Var != null && lVar.r) {
                        if (l6Var instanceof d6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = l6Var.g;
                        }
                        boolean z4 = arrayList2.size() != arrayList.size();
                        if (!z4) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (arrayList2.get(i12) != arrayList.get(i12)) {
                                        z4 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (z4) {
                            lVar.e.C(arrayList, true);
                        }
                        lVar.r = false;
                    }
                    iVar.setItemAnimator(null);
                    break;
                } else {
                    iVar.I0(false);
                    if (l1Var != null) {
                        l1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                cp cpVar = (cp) this.e;
                dp dpVar = cpVar.X2;
                if (i10 != 0) {
                    dpVar.I = true;
                    cpVar.I0(false);
                    l1Var.a.setPressed(true);
                    break;
                } else {
                    dpVar.I = false;
                    if (cpVar.V2) {
                        TLRPC.Chat chat = dpVar.U;
                        ArrayList arrayList3 = dpVar.K;
                        ArrayList arrayList4 = dpVar.J;
                        if (chat != null) {
                            cpVar.V2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = dpVar.U;
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
                            dpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new p5(6));
                            dpVar.U.usernames.clear();
                            dpVar.U.usernames.addAll(arrayList4);
                            dpVar.U.usernames.addAll(arrayList3);
                            dpVar.getMessagesController().putChat(dpVar.U, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                qn qnVar = (qn) this.e;
                jb1 jb1Var = qnVar.s;
                if (i10 != 0) {
                    jb1Var.setItemAnimator(qnVar.v);
                    jb1Var.I0(false);
                    l1Var.a.setPressed(true);
                    l1Var.a.setBackgroundColor(j6.v0(j6.h5, qnVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((dn0) this.e).b.I0(false);
                    l1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                g61 g61Var = (g61) this.e;
                if (l1Var != null) {
                    g61Var.d1(false);
                }
                if (i10 == 0) {
                    w51 w51Var = g61Var.V2;
                    if (w51Var.H) {
                        w51Var.F(w51Var.G);
                    }
                    if (g61Var.a3 != null) {
                        g61Var.D1();
                        g61Var.a3 = null;
                        break;
                    }
                } else {
                    g61Var.I0(false);
                    if (l1Var != null) {
                        View view = l1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof v1) {
                            v1 v1Var = (v1) view.getBackground();
                            if (!v1Var.c) {
                                v1Var.c = true;
                                v1Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            g61Var.a3 = l1Var;
                            g61Var.G1(l1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((fv0) this.e).c.I0(false);
                    l1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // f2.b0
    public final void q(l1 l1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        fv0 fv0Var = (fv0) this.e;
        return !fv0Var.F || i10 - fv0Var.k0 >= fv0Var.x;
    }

    private final void t(l1 l1Var) {
    }

    private final void u(l1 l1Var) {
    }

    private final void v(l1 l1Var) {
    }

    private final void w(l1 l1Var) {
    }

    private final void x(l1 l1Var) {
    }

    private final void y(l1 l1Var) {
    }

    private final void z(l1 l1Var) {
    }

    private final void s(RecyclerView recyclerView, l1 l1Var, l1 l1Var2, int i10, int i11, int i12) {
    }
}
