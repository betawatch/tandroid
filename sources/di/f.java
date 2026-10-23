package di;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.a7;
import ci.e6;
import ci.t6;
import java.util.ArrayList;
import ki.a2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.dv0;
import org.telegram.ui.fv0;
import org.telegram.ui.pa;
import org.telegram.ui.sa1;
import org.telegram.ui.uo;
import org.telegram.ui.vo;
import org.telegram.ui.wo;
import s4.b1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                c71 c71Var = (c71) this.e;
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
                if (c71Var.B1()) {
                    c71Var.G1(b1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(bs.h).start();
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
                r rVar = (r) this.e;
                if (!rVar.W.G.C1 || !rVar.v.L(b1Var.b())) {
                    break;
                } else {
                    rVar.f.setItemAnimator(rVar.n);
                    break;
                }
            case 1:
                if (b1Var.f != 1 || !((pa) b1Var.a).G) {
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
                un0 un0Var = (un0) this.e;
                if (b10 >= un0Var.v && b1Var.b() < un0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                c71 c71Var = (c71) this.e;
                if (c71Var.a3 && c71Var.W2.H(b1Var.b()) >= 0) {
                    int i10 = 15;
                    if (c71Var.V2.o == 0) {
                        if (!c71Var.Z2) {
                            i10 = 12;
                        }
                    } else if (!c71Var.Z2) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((l2.f) ((d91) this.e).y).z(b1Var.b())) {
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
                return ((r) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((un0) this.e).I.g();
            case 4:
                c71 c71Var = (c71) this.e;
                return c71Var.a3 && c71Var.c3;
            case 6:
                return true;
        }
    }

    @Override // s4.v
    public void m(Canvas canvas, RecyclerView recyclerView, b1 b1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                c71 c71Var = (c71) this.e;
                if (i10 != 2 || z10 || !c71Var.B1()) {
                    super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        c71Var.F1(b1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                ((d91) this.e).invalidate();
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
                l lVar = ((r) this.e).v;
                if (!lVar.L(b1Var.b()) || !lVar.L(b1Var2.b())) {
                    return false;
                }
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                ArrayList arrayList2 = lVar.n;
                a7 a7Var = lVar.e;
                if (a7Var != null && b10 >= 0 && b10 < a7Var.i.size() && b11 >= 0 && b11 < lVar.e.i.size()) {
                    if (lVar.e instanceof t6) {
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
                    if (!(view instanceof pa) || ((pa) view).G) {
                        uo uoVar = ((vo) this.e).V2;
                        int b12 = b1Var.b();
                        int b13 = b1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        vo voVar = uoVar.c;
                        wo woVar = voVar.Y2;
                        ArrayList arrayList3 = woVar.N;
                        if (i14 >= woVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            voVar.W2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        uoVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        uoVar.n(b12, 3);
                        uoVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (b1Var.f != b1Var2.f) {
                    return false;
                }
                co coVar = ((fo) this.e).r;
                int b14 = b1Var.b();
                int b15 = b1Var2.b();
                fo foVar = coVar.d;
                int i16 = foVar.t0;
                rh.f fVar = foVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = foVar.M) && i18 < i10) {
                    rh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = foVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = foVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    coVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = b1Var2.b();
                un0 un0Var = (un0) this.e;
                ArrayList arrayList4 = un0Var.e;
                if (b17 < un0Var.v || b1Var2.b() >= un0Var.w) {
                    return false;
                }
                int b18 = b1Var.b();
                int b19 = b1Var2.b();
                int i19 = un0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - un0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(un0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                un0Var.c.p(b18, b19);
                return false;
            case 4:
                c71 c71Var = (c71) this.e;
                u61 u61Var = c71Var.W2;
                if (u61Var.H(b1Var.b()) < 0 || u61Var.H(b1Var.b()) != u61Var.H(b1Var2.b())) {
                    return false;
                }
                int b20 = b1Var.b();
                int b21 = b1Var2.b();
                ArrayList arrayList5 = u61Var.x;
                if (u61Var.L != null) {
                    int H = u61Var.H(b20);
                    int H2 = u61Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = u61Var.J(b20);
                        boolean J2 = u61Var.J(b21);
                        arrayList5.add(b21, (h61) arrayList5.remove(b20));
                        u61Var.p(b20, b21);
                        if (u61Var.J(b21) != J) {
                            u61Var.n(b21, 3);
                        }
                        if (u61Var.J(b20) != J2) {
                            u61Var.n(b20, 3);
                        }
                        if (u61Var.K && (i11 = u61Var.J) != H) {
                            u61Var.F(i11);
                        }
                        u61Var.K = true;
                        u61Var.J = H;
                    }
                }
                c71Var.I1();
                return true;
            case 5:
                int b22 = b1Var.b();
                int b23 = b1Var2.b();
                d91 d91Var = (d91) this.e;
                ArrayList arrayList6 = d91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l2.f) d91Var.y).z(b22) && ((l2.f) d91Var.y).z(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    d91Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((a91) obj).a));
                    }
                    w81 w81Var = ((e91) ((l2.f) d91Var.y).b).L;
                    z11 = true;
                    z11 = true;
                    if (w81Var != null) {
                        w81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (b1Var.f != b1Var2.f || !r(b1Var.b()) || !r(b1Var2.b())) {
                    return false;
                }
                dv0 dv0Var = ((fv0) this.e).b;
                int b24 = b1Var.b();
                int b25 = b1Var2.b();
                fv0 fv0Var = dv0Var.d;
                int i23 = fv0Var.n0;
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
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    dv0Var.p(b24, b25);
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
                r rVar = (r) this.e;
                i iVar = rVar.f;
                if (b1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.n;
                    a7 a7Var = lVar.e;
                    if (a7Var != null && lVar.r) {
                        if (a7Var instanceof t6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = a7Var.g;
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
                vo voVar = (vo) this.e;
                wo woVar = voVar.Y2;
                if (i10 != 0) {
                    woVar.L = true;
                    voVar.I0(false);
                    b1Var.a.setPressed(true);
                    break;
                } else {
                    woVar.L = false;
                    if (voVar.W2) {
                        TLRPC.Chat chat = woVar.X;
                        ArrayList arrayList3 = woVar.N;
                        ArrayList arrayList4 = woVar.M;
                        if (chat != null) {
                            voVar.W2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = woVar.X;
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
                            woVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new e6(10));
                            woVar.X.usernames.clear();
                            woVar.X.usernames.addAll(arrayList4);
                            woVar.X.usernames.addAll(arrayList3);
                            woVar.getMessagesController().putChat(woVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                fo foVar = (fo) this.e;
                sa1 sa1Var = foVar.s;
                if (i10 != 0) {
                    sa1Var.setItemAnimator(foVar.v);
                    sa1Var.I0(false);
                    b1Var.a.setPressed(true);
                    b1Var.a.setBackgroundColor(h6.w0(h6.h5, foVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((un0) this.e).b.I0(false);
                    b1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                c71 c71Var = (c71) this.e;
                if (b1Var != null) {
                    c71Var.d1(false);
                }
                if (i10 == 0) {
                    u61 u61Var = c71Var.W2;
                    if (u61Var.K) {
                        u61Var.F(u61Var.J);
                    }
                    if (c71Var.b3 != null) {
                        c71Var.E1();
                        c71Var.b3 = null;
                        break;
                    }
                } else {
                    c71Var.I0(false);
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
                            c71Var.b3 = b1Var;
                            c71Var.H1(b1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((fv0) this.e).c.I0(false);
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
        fv0 fv0Var = (fv0) this.e;
        return !fv0Var.I || i10 - fv0Var.n0 >= fv0Var.x;
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
