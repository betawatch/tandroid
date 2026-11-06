package ei;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.j6;
import di.q6;
import di.u5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import li.y1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.uv;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.e61;
import org.telegram.ui.ea;
import org.telegram.ui.eo;
import org.telegram.ui.fo;
import org.telegram.ui.go;
import org.telegram.ui.ia;
import org.telegram.ui.l4;
import org.telegram.ui.la;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import v4.d1;
import v4.v;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d extends v {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i7) {
        this.d = i7;
        this.e = obj;
    }

    @Override // v4.v
    public void a(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                d1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, d1Var);
                View view = d1Var.a;
                view.setPressed(false);
                view.setTag(R.id.dragging, null);
                break;
            case 2:
                super.a(recyclerView, d1Var);
                d1Var.a.setPressed(false);
                break;
            case 3:
                super.a(recyclerView, d1Var);
                View view2 = d1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                break;
            case 4:
                super.a(recyclerView, d1Var);
                View view3 = d1Var.a;
                view3.setPressed(false);
                view3.setBackground(null);
                break;
            case 5:
                super.a(recyclerView, d1Var);
                d1Var.a.setPressed(false);
                break;
            case 6:
                super.a(recyclerView, d1Var);
                d1Var.a.setPressed(false);
                break;
            case 7:
                q41 q41Var = (q41) this.e;
                super.a(recyclerView, d1Var);
                View view4 = d1Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof y1) {
                    y1 y1Var = (y1) view4.getBackground();
                    if (y1Var.c) {
                        y1Var.c = false;
                        y1Var.invalidateSelf();
                    }
                }
                if (q41Var.D1()) {
                    q41Var.I1(d1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(xq.h).start();
                    break;
                }
                break;
            case 8:
            default:
                super.a(recyclerView, d1Var);
                break;
            case 9:
                super.a(recyclerView, d1Var);
                d1Var.a.setPressed(false);
                break;
        }
    }

    @Override // v4.v
    public final int e(RecyclerView recyclerView, d1 d1Var) {
        uv s5;
        switch (this.d) {
            case 0:
                n nVar = (n) this.e;
                if (!nVar.W.G.E1 || !nVar.w.L(d1Var.b())) {
                    break;
                } else {
                    nVar.f.setItemAnimator(nVar.n);
                    break;
                }
            case 1:
                if (d1Var.f != 4 || !((ia) d1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (d1Var.f != 1 || !((ia) d1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 3:
                if (d1Var.f == 0) {
                    break;
                }
                break;
            case 4:
                if (d1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 5:
                int b10 = d1Var.b();
                dl0 dl0Var = (dl0) this.e;
                if (b10 >= dl0Var.w && d1Var.b() < dl0Var.x) {
                    break;
                } else {
                    break;
                }
                break;
            case 6:
                int l10 = v.l(0, 0);
                xs0 xs0Var = ((is0) this.e).y;
                if (xs0Var.E1 && recyclerView.getAdapter() != xs0Var.U && (s5 = s(d1Var)) != null && s5.b) {
                    break;
                }
                break;
            case 7:
                q41 q41Var = (q41) this.e;
                if (q41Var.j3 && q41Var.f3.H(d1Var.b()) >= 0) {
                    int i7 = 15;
                    if (q41Var.e3.o == 0) {
                        if (!q41Var.i3) {
                            i7 = 12;
                        }
                    } else if (!q41Var.i3) {
                        i7 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 8:
                if (!((org.telegram.ui.Components.n) ((u61) this.e).D).r(d1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (d1Var.f != 5 || !r(d1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return v.l(0, 0);
    }

    @Override // v4.v
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((n) this.e).W.G.E1;
            case 5:
                return ((dl0) this.e).I.i();
            case 7:
                q41 q41Var = (q41) this.e;
                return q41Var.j3 && q41Var.l3;
            case 9:
                return true;
            default:
                return super.k();
        }
    }

    @Override // v4.v
    public void m(Canvas canvas, RecyclerView recyclerView, d1 d1Var, float f10, float f11, int i7, boolean z9) {
        switch (this.d) {
            case 7:
                q41 q41Var = (q41) this.e;
                if (i7 != 2 || z9 || !q41Var.D1()) {
                    super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                    if (i7 == 2 && z9) {
                        q41Var.H1(d1Var);
                        break;
                    }
                }
                break;
            case 8:
                super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                ((u61) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, d1Var, f10, f11, i7, z9);
                break;
        }
    }

    @Override // v4.v
    public final boolean n(RecyclerView recyclerView, d1 d1Var, d1 d1Var2) {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.e;
        switch (i12) {
            case 0:
                i iVar = ((n) obj).w;
                if (!iVar.L(d1Var.b()) || !iVar.L(d1Var2.b())) {
                    break;
                } else {
                    int b10 = d1Var.b();
                    int b11 = d1Var2.b();
                    ArrayList arrayList2 = iVar.n;
                    q6 q6Var = iVar.e;
                    if (q6Var != null && b10 >= 0 && b10 < q6Var.i.size() && b11 >= 0 && b11 < iVar.e.i.size()) {
                        if (iVar.e instanceof j6) {
                            arrayList = new ArrayList();
                            for (int i14 = 0; i14 < iVar.e.i.size(); i14++) {
                                arrayList.add(Integer.valueOf(((ij) iVar.e.i.get(i14)).f1()));
                            }
                        } else {
                            arrayList = new ArrayList(iVar.e.g);
                        }
                        if (!iVar.r) {
                            arrayList2.clear();
                            arrayList2.addAll(arrayList);
                            iVar.r = true;
                        }
                        ij ijVar = (ij) iVar.e.i.get(b10);
                        arrayList.remove(Integer.valueOf(ijVar.f1()));
                        arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ijVar.f1()));
                        iVar.e.C(arrayList, false);
                        iVar.j(b10, b11);
                        break;
                    }
                }
                break;
            case 1:
                if (d1Var.f == d1Var2.f) {
                    View view = d1Var2.a;
                    if (!(view instanceof ia) || ((ia) view).G) {
                        ea eaVar = ((la) obj).c;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        la laVar = eaVar.c;
                        ArrayList arrayList3 = laVar.w;
                        if (i15 < arrayList3.size() && i16 < arrayList3.size()) {
                            if (b12 != b13) {
                                laVar.d = true;
                            }
                            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i15);
                            arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i16));
                            arrayList3.set(i16, tL_username);
                            eaVar.j(b12, b13);
                            int size = arrayList3.size() + 3;
                            if (b12 == size || b13 == size) {
                                eaVar.h(b12, 3);
                                eaVar.h(b13, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                if (d1Var.f == d1Var2.f) {
                    View view2 = d1Var2.a;
                    if (!(view2 instanceof ia) || ((ia) view2).G) {
                        eo eoVar = ((fo) obj).e3;
                        int b14 = d1Var.b();
                        int b15 = d1Var2.b();
                        int i17 = b14 - 1;
                        int i18 = b15 - 1;
                        fo foVar = eoVar.c;
                        go goVar = foVar.h3;
                        ArrayList arrayList4 = goVar.N;
                        if (i17 < goVar.N.size() && i18 < arrayList4.size()) {
                            if (b14 != b15) {
                                foVar.f3 = true;
                            }
                            TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i17);
                            arrayList4.set(i17, (TLRPC.TL_username) arrayList4.get(i18));
                            arrayList4.set(i18, tL_username2);
                            eoVar.j(b14, b15);
                            int size2 = arrayList4.size();
                            if (b14 == size2 || b15 == size2) {
                                eoVar.h(b14, 3);
                                eoVar.h(b15, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                int b16 = d1Var.b();
                int b17 = d1Var2.b();
                b8 b8Var = (b8) obj;
                if (!b8Var.l2) {
                    b8Var.m2.c(b16, b17);
                } else if (b16 <= 0 || b17 <= 0) {
                    break;
                } else {
                    b8Var.m2.c(b16 - 1, b17 - 1);
                }
                b8Var.n2.clear();
                b8Var.n2.addAll(b8Var.m2.c);
                b8Var.q1.j(b16, b17);
                break;
            case 4:
                if (d1Var.f != d1Var2.f) {
                    break;
                } else {
                    l4 l4Var = ((bn) obj).r;
                    int b18 = d1Var.b();
                    int b19 = d1Var2.b();
                    bn bnVar = (bn) l4Var.e;
                    int i19 = bnVar.t0;
                    sh.d dVar = bnVar.m1;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    if (i20 >= 0 && i21 >= 0 && i20 < (i7 = bnVar.M) && i21 < i7) {
                        sh.c b20 = dVar.b(i20);
                        SparseArray sparseArray = dVar.a;
                        sparseArray.put(i20, dVar.b(i21));
                        sparseArray.put(i21, b20);
                        CharSequence[] charSequenceArr = bnVar.K;
                        CharSequence charSequence = charSequenceArr[i20];
                        charSequenceArr[i20] = charSequenceArr[i21];
                        charSequenceArr[i21] = charSequence;
                        boolean[] zArr = bnVar.L;
                        boolean z9 = zArr[i20];
                        zArr[i20] = zArr[i21];
                        zArr[i21] = z9;
                        l4Var.j(b18, b19);
                        break;
                    }
                }
                break;
            case 5:
                int b21 = d1Var2.b();
                dl0 dl0Var = (dl0) obj;
                ArrayList arrayList5 = dl0Var.e;
                if (b21 >= dl0Var.w && d1Var2.b() < dl0Var.x) {
                    int b22 = d1Var.b();
                    int b23 = d1Var2.b();
                    int i22 = dl0Var.w;
                    int i23 = b22 - i22;
                    int i24 = b23 - i22;
                    arrayList5.indexOf(Integer.valueOf(i23));
                    arrayList5.get(b22 - dl0Var.w);
                    ij ijVar2 = (ij) arrayList5.get(i23);
                    ij ijVar3 = (ij) arrayList5.get(i24);
                    arrayList5.set(i23, ijVar3);
                    arrayList5.set(i24, ijVar2);
                    z5 q10 = z5.q(dl0Var.d);
                    ArrayList arrayList6 = q10.G;
                    int indexOf = arrayList6.indexOf(ijVar2);
                    int indexOf2 = arrayList6.indexOf(ijVar3);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, ijVar3);
                        arrayList6.set(indexOf2, ijVar2);
                    }
                    q10.y();
                    dl0Var.c.j(b22, b23);
                    break;
                }
                break;
            case 6:
                is0 is0Var = (is0) obj;
                ArrayList arrayList7 = is0Var.f;
                xs0 xs0Var = is0Var.y;
                if (xs0Var.E1 && recyclerView.getAdapter() != xs0Var.U) {
                    uv s5 = s(d1Var);
                    uv s9 = s(d1Var2);
                    if (s5 != null && s9 != null && s5.b && s9.b) {
                        int b24 = d1Var.b();
                        int b25 = d1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s5);
                        is0Var.j(b24, b25);
                        is0Var.h = true;
                        break;
                    }
                }
                break;
            case 7:
                q41 q41Var = (q41) obj;
                l41 l41Var = q41Var.f3;
                if (l41Var.H(d1Var.b()) < 0 || l41Var.H(d1Var.b()) != l41Var.H(d1Var2.b())) {
                    break;
                } else {
                    int b26 = d1Var.b();
                    int b27 = d1Var2.b();
                    ArrayList arrayList8 = l41Var.D;
                    if (l41Var.M != null) {
                        int H = l41Var.H(b26);
                        int H2 = l41Var.H(b27);
                        if (H >= 0 && H == H2) {
                            boolean J = l41Var.J(b26);
                            boolean J2 = l41Var.J(b27);
                            arrayList8.add(b27, (x31) arrayList8.remove(b26));
                            l41Var.j(b26, b27);
                            if (l41Var.J(b27) != J) {
                                l41Var.h(b27, 3);
                            }
                            if (l41Var.J(b26) != J2) {
                                l41Var.h(b26, 3);
                            }
                            if (l41Var.L && (i10 = l41Var.K) != H) {
                                l41Var.F(i10);
                            }
                            l41Var.L = true;
                            l41Var.K = H;
                        }
                    }
                    q41Var.K1();
                    break;
                }
            case 8:
                int b28 = d1Var.b();
                int b29 = d1Var2.b();
                u61 u61Var = (u61) obj;
                ArrayList arrayList9 = u61Var.h;
                if (!((org.telegram.ui.Components.n) u61Var.D).r(b28) || !((org.telegram.ui.Components.n) u61Var.D).r(b29)) {
                    break;
                } else {
                    Pattern pattern = Utilities.a;
                    Object obj2 = arrayList9.get(b28);
                    arrayList9.set(b28, arrayList9.get(b29));
                    arrayList9.set(b29, obj2);
                    u61Var.y.j(b28, b29);
                    ArrayList arrayList10 = new ArrayList();
                    int size3 = arrayList9.size();
                    while (i13 < size3) {
                        Object obj3 = arrayList9.get(i13);
                        i13++;
                        arrayList10.add(Integer.valueOf(((r61) obj3).a));
                    }
                    m61 m61Var = ((v61) ((org.telegram.ui.Components.n) u61Var.D).a).L;
                    if (m61Var != null) {
                        m61Var.a(arrayList10);
                        break;
                    }
                }
                break;
            default:
                if (d1Var.f != d1Var2.f || !r(d1Var.b()) || !r(d1Var2.b())) {
                    break;
                } else {
                    nr0 nr0Var = ((pr0) obj).b;
                    int b30 = d1Var.b();
                    int b31 = d1Var2.b();
                    pr0 pr0Var = nr0Var.d;
                    int i25 = pr0Var.n0;
                    int i26 = b30 - i25;
                    int i27 = b31 - i25;
                    if (i26 >= 0 && i27 >= 0 && i26 < (i11 = pr0Var.D) && i27 < i11) {
                        CharSequence[] charSequenceArr2 = pr0Var.w;
                        CharSequence charSequence2 = charSequenceArr2[i26];
                        charSequenceArr2[i26] = charSequenceArr2[i27];
                        charSequenceArr2[i27] = charSequence2;
                        int[] iArr = pr0Var.r;
                        if (iArr != null) {
                            int i28 = iArr[i26];
                            iArr[i26] = iArr[i27];
                            iArr[i27] = i28;
                        }
                        boolean[] zArr2 = pr0Var.x;
                        boolean z10 = zArr2[i26];
                        zArr2[i26] = zArr2[i27];
                        zArr2[i27] = z10;
                        nr0Var.j(b30, b31);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // v4.v
    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
        switch (this.d) {
            case 7:
                break;
            default:
                super.o(recyclerView, d1Var, d1Var2, i7, i10, i11);
                break;
        }
    }

    @Override // v4.v
    public void p(d1 d1Var, int i7) {
        ArrayList arrayList;
        rr0 rr0Var;
        int i10 = this.d;
        Object obj = this.e;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                f fVar = nVar.f;
                if (d1Var != null) {
                    fVar.d1(false);
                }
                if (i7 == 0) {
                    i iVar = nVar.w;
                    ArrayList arrayList2 = iVar.n;
                    q6 q6Var = iVar.e;
                    if (q6Var != null && iVar.r) {
                        if (q6Var instanceof j6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < iVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((ij) iVar.e.i.get(i11)).f1()));
                            }
                        } else {
                            arrayList = q6Var.g;
                        }
                        boolean z9 = arrayList2.size() != arrayList.size();
                        if (!z9) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (arrayList2.get(i12) != arrayList.get(i12)) {
                                        z9 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (z9) {
                            iVar.e.C(arrayList, true);
                        }
                        iVar.r = false;
                    }
                    fVar.setItemAnimator(null);
                    break;
                } else {
                    fVar.I0(false);
                    if (d1Var != null) {
                        d1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                la laVar = (la) obj;
                if (i7 == 0) {
                    la.d0(laVar);
                } else {
                    laVar.b.I0(false);
                    d1Var.a.setPressed(true);
                }
                if (d1Var != null) {
                    d1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 2:
                fo foVar = (fo) obj;
                go goVar = foVar.h3;
                if (i7 != 0) {
                    goVar.L = true;
                    foVar.I0(false);
                    d1Var.a.setPressed(true);
                    break;
                } else {
                    goVar.L = false;
                    if (foVar.f3) {
                        TLRPC.Chat chat = goVar.X;
                        ArrayList arrayList3 = goVar.N;
                        ArrayList arrayList4 = goVar.M;
                        if (chat != null) {
                            foVar.f3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = goVar.X;
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
                            goVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u5(16));
                            goVar.X.usernames.clear();
                            goVar.X.usernames.addAll(arrayList4);
                            goVar.X.usernames.addAll(arrayList3);
                            goVar.getMessagesController().Q3(goVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                n7 n7Var = ((b8) obj).o1;
                if (d1Var != null) {
                    n7Var.d1(false);
                }
                if (i7 != 0) {
                    n7Var.I0(false);
                    if (d1Var != null) {
                        d1Var.a.setPressed(true);
                    }
                }
                if (d1Var != null) {
                    d1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 4:
                bn bnVar = (bn) obj;
                e61 e61Var = bnVar.s;
                if (i7 != 0) {
                    e61Var.setItemAnimator(bnVar.w);
                    e61Var.I0(false);
                    d1Var.a.setPressed(true);
                    r6.i(k6.h5, d1Var.a, bnVar.a);
                    break;
                }
                break;
            case 5:
                if (i7 != 0) {
                    ((dl0) obj).b.I0(false);
                    d1Var.a.setPressed(true);
                    break;
                }
                break;
            case 6:
                is0 is0Var = (is0) obj;
                ir0 ir0Var = is0Var.n;
                if (d1Var != null && (rr0Var = is0Var.s) != null) {
                    rr0Var.d1(false);
                }
                if (i7 == 0) {
                    g0.r(ir0Var);
                    g0.i3(ir0Var, 300L);
                    break;
                }
                break;
            case 7:
                q41 q41Var = (q41) obj;
                if (d1Var != null) {
                    q41Var.d1(false);
                }
                if (i7 == 0) {
                    l41 l41Var = q41Var.f3;
                    if (l41Var.L) {
                        l41Var.F(l41Var.K);
                    }
                    if (q41Var.k3 != null) {
                        q41Var.G1();
                        q41Var.k3 = null;
                        break;
                    }
                } else {
                    q41Var.I0(false);
                    if (d1Var != null) {
                        View view = d1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof y1) {
                            y1 y1Var = (y1) view.getBackground();
                            if (!y1Var.c) {
                                y1Var.c = true;
                                y1Var.invalidateSelf();
                            }
                        }
                        if (i7 == 2) {
                            q41Var.k3 = d1Var;
                            q41Var.J1(d1Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i7 != 0) {
                    ((pr0) obj).c.I0(false);
                    d1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // v4.v
    public final void q(d1 d1Var) {
        int i7 = this.d;
    }

    public boolean r(int i7) {
        pr0 pr0Var = (pr0) this.e;
        return !pr0Var.I || i7 - pr0Var.n0 >= pr0Var.y;
    }

    public uv s(d1 d1Var) {
        int b10;
        is0 is0Var = (is0) this.e;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && b10 < is0Var.f.size()) {
            return (uv) is0Var.f.get(b10);
        }
        return null;
    }

    private final void A(d1 d1Var) {
    }

    private final void B(d1 d1Var) {
    }

    private final void C(d1 d1Var) {
    }

    private final void D(d1 d1Var) {
    }

    private final void u(d1 d1Var) {
    }

    private final void v(d1 d1Var) {
    }

    private final void w(d1 d1Var) {
    }

    private final void x(d1 d1Var) {
    }

    private final void y(d1 d1Var) {
    }

    private final void z(d1 d1Var) {
    }

    private final void t(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i7, int i10, int i11) {
    }
}
