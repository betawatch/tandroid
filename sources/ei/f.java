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
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.ap;
import org.telegram.ui.kv0;
import org.telegram.ui.mv0;
import org.telegram.ui.qa;
import org.telegram.ui.yo;
import org.telegram.ui.za1;
import org.telegram.ui.zo;
import s4.e1;
import s4.w;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                r71 r71Var = (r71) this.e;
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
                if (r71Var.G1()) {
                    r71Var.L1(e1Var);
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
                co0 co0Var = (co0) this.e;
                if (b10 >= co0Var.v && e1Var.b() < co0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                r71 r71Var = (r71) this.e;
                if (r71Var.k3 && r71Var.g3.H(e1Var.b()) >= 0) {
                    int i10 = 15;
                    if (r71Var.f3.o == 0) {
                        if (!r71Var.j3) {
                            i10 = 12;
                        }
                    } else if (!r71Var.j3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((jg.i) ((t91) this.e).y).b0(e1Var.b())) {
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
                return ((co0) this.e).I.g();
            case 4:
                r71 r71Var = (r71) this.e;
                return r71Var.k3 && r71Var.m3;
            case 6:
                return true;
        }
    }

    @Override // s4.w
    public void m(Canvas canvas, RecyclerView recyclerView, e1 e1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                r71 r71Var = (r71) this.e;
                if (i10 != 2 || z10 || !r71Var.G1()) {
                    super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        r71Var.K1(e1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                ((t91) this.e).invalidate();
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
                        yo yoVar = ((zo) this.e).f3;
                        int b12 = e1Var.b();
                        int b13 = e1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        zo zoVar = yoVar.c;
                        ap apVar = zoVar.i3;
                        ArrayList arrayList3 = apVar.N;
                        if (i14 >= apVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            zoVar.g3 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        yoVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        yoVar.n(b12, 3);
                        yoVar.n(b13, 3);
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
                co0 co0Var = (co0) this.e;
                ArrayList arrayList4 = co0Var.e;
                if (b17 < co0Var.v || e1Var2.b() >= co0Var.w) {
                    return false;
                }
                int b18 = e1Var.b();
                int b19 = e1Var2.b();
                int i19 = co0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - co0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(co0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                co0Var.c.p(b18, b19);
                return false;
            case 4:
                r71 r71Var = (r71) this.e;
                j71 j71Var = r71Var.g3;
                if (j71Var.H(e1Var.b()) < 0 || j71Var.H(e1Var.b()) != j71Var.H(e1Var2.b())) {
                    return false;
                }
                int b20 = e1Var.b();
                int b21 = e1Var2.b();
                ArrayList arrayList5 = j71Var.y;
                if (j71Var.M != null) {
                    int H = j71Var.H(b20);
                    int H2 = j71Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = j71Var.J(b20);
                        boolean J2 = j71Var.J(b21);
                        arrayList5.add(b21, (t61) arrayList5.remove(b20));
                        j71Var.p(b20, b21);
                        if (j71Var.J(b21) != J) {
                            j71Var.n(b21, 3);
                        }
                        if (j71Var.J(b20) != J2) {
                            j71Var.n(b20, 3);
                        }
                        if (j71Var.L && (i11 = j71Var.K) != H) {
                            j71Var.F(i11);
                        }
                        j71Var.L = true;
                        j71Var.K = H;
                    }
                }
                r71Var.N1();
                return true;
            case 5:
                int b22 = e1Var.b();
                int b23 = e1Var2.b();
                t91 t91Var = (t91) this.e;
                ArrayList arrayList6 = t91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((jg.i) t91Var.y).b0(b22) && ((jg.i) t91Var.y).b0(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    t91Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((q91) obj).a));
                    }
                    m91 m91Var = ((u91) ((jg.i) t91Var.y).a).L;
                    z11 = true;
                    z11 = true;
                    if (m91Var != null) {
                        m91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (e1Var.f != e1Var2.f || !r(e1Var.b()) || !r(e1Var2.b())) {
                    return false;
                }
                kv0 kv0Var = ((mv0) this.e).b;
                int b24 = e1Var.b();
                int b25 = e1Var2.b();
                mv0 mv0Var = kv0Var.d;
                int i23 = mv0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = mv0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = mv0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = mv0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = mv0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    kv0Var.p(b24, b25);
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
                zo zoVar = (zo) this.e;
                ap apVar = zoVar.i3;
                if (i10 != 0) {
                    apVar.L = true;
                    zoVar.I0(false);
                    e1Var.a.setPressed(true);
                    break;
                } else {
                    apVar.L = false;
                    if (zoVar.g3) {
                        TLRPC.Chat chat = apVar.X;
                        ArrayList arrayList3 = apVar.N;
                        ArrayList arrayList4 = apVar.M;
                        if (chat != null) {
                            zoVar.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = apVar.X;
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
                            apVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new d6(10));
                            apVar.X.usernames.clear();
                            apVar.X.usernames.addAll(arrayList4);
                            apVar.X.usernames.addAll(arrayList3);
                            apVar.getMessagesController().putChat(apVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                go goVar = (go) this.e;
                za1 za1Var = goVar.s;
                if (i10 != 0) {
                    za1Var.setItemAnimator(goVar.v);
                    za1Var.I0(false);
                    e1Var.a.setPressed(true);
                    f7.i(y6.h5, e1Var.a, goVar.a);
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((co0) this.e).b.I0(false);
                    e1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                r71 r71Var = (r71) this.e;
                if (e1Var != null) {
                    r71Var.d1(false);
                }
                if (i10 == 0) {
                    j71 j71Var = r71Var.g3;
                    if (j71Var.L) {
                        j71Var.F(j71Var.K);
                    }
                    if (r71Var.l3 != null) {
                        r71Var.J1();
                        r71Var.l3 = null;
                        break;
                    }
                } else {
                    r71Var.I0(false);
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
                            r71Var.l3 = e1Var;
                            r71Var.M1(e1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((mv0) this.e).c.I0(false);
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
        mv0 mv0Var = (mv0) this.e;
        return !mv0Var.I || i10 - mv0Var.n0 >= mv0Var.x;
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
