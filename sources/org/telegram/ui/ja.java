package org.telegram.ui;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ja extends s4.u {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ja(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // s4.u
    public void a(RecyclerView recyclerView, s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                View view = c1Var.a;
                view.setPressed(false);
                view.setTag(R.id.dragging, null);
                break;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 2:
                super.a(recyclerView, c1Var);
                View view2 = c1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                break;
            case 3:
                super.a(recyclerView, c1Var);
                View view3 = c1Var.a;
                view3.setPressed(false);
                view3.setBackground(null);
                break;
            case 4:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 5:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 6:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.e;
                super.a(recyclerView, c1Var);
                View view4 = c1Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof bi.h2) {
                    bi.h2 h2Var = (bi.h2) view4.getBackground();
                    if (h2Var.c) {
                        h2Var.c = false;
                        h2Var.invalidateSelf();
                    }
                }
                if (u51Var.D1()) {
                    u51Var.I1(c1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                    break;
                }
                break;
            case 7:
            default:
                super.a(recyclerView, c1Var);
                break;
            case 8:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
            case 9:
                super.a(recyclerView, c1Var);
                c1Var.a.setPressed(false);
                break;
        }
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        org.telegram.messenger.fw s10;
        switch (this.d) {
            case 0:
                if (c1Var.f != 4 || !((la) c1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                if (c1Var.f != 1 || !((la) c1Var.a).G) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (c1Var.f == 0) {
                    break;
                }
                break;
            case 3:
                if (c1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 4:
                int b10 = c1Var.b();
                org.telegram.ui.Components.gm0 gm0Var = (org.telegram.ui.Components.gm0) this.e;
                if (b10 >= gm0Var.w && c1Var.b() < gm0Var.x) {
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                int l4 = s4.u.l(0, 0);
                org.telegram.ui.Components.zt0 zt0Var = ((org.telegram.ui.Components.it0) this.e).y;
                if (zt0Var.E1 && recyclerView.getAdapter() != zt0Var.U && (s10 = s(c1Var)) != null && s10.b) {
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.e;
                if (u51Var.j3 && u51Var.f3.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (u51Var.e3.o == 0) {
                        if (!u51Var.i3) {
                            i10 = 12;
                        }
                    } else if (!u51Var.i3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 7:
                if (!((n2.u) ((org.telegram.ui.Components.v71) this.e).D).G(c1Var.b())) {
                    break;
                } else {
                    break;
                }
            case 8:
                if (c1Var.f != 5 || !r(c1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                uh.i iVar = (uh.i) this.e;
                if (!iVar.W.G.E1 || !iVar.w.L(c1Var.b())) {
                    break;
                } else {
                    iVar.f.setItemAnimator(iVar.n);
                    break;
                }
                break;
        }
        return s4.u.l(0, 0);
    }

    @Override // s4.u
    public boolean k() {
        switch (this.d) {
            case 4:
                return ((org.telegram.ui.Components.gm0) this.e).I.f();
            case 5:
            case 7:
            default:
                return super.k();
            case 6:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.e;
                return u51Var.j3 && u51Var.l3;
            case 8:
                return true;
            case 9:
                return ((uh.i) this.e).W.G.E1;
        }
    }

    @Override // s4.u
    public void m(Canvas canvas, RecyclerView recyclerView, s4.c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 6:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.e;
                if (i10 != 2 || z10 || !u51Var.D1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        u51Var.H1(c1Var);
                        break;
                    }
                }
                break;
            case 7:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((org.telegram.ui.Components.v71) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                break;
        }
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13 = this.d;
        Object obj = this.e;
        int i14 = 0;
        switch (i13) {
            case 0:
                if (c1Var.f == c1Var2.f) {
                    View view = c1Var2.a;
                    if (!(view instanceof la) || ((la) view).G) {
                        ga gaVar = ((oa) obj).c;
                        int b10 = c1Var.b();
                        int b11 = c1Var2.b();
                        int i15 = b10 - 4;
                        int i16 = b11 - 4;
                        oa oaVar = gaVar.c;
                        ArrayList arrayList2 = oaVar.w;
                        if (i15 < arrayList2.size() && i16 < arrayList2.size()) {
                            if (b10 != b11) {
                                oaVar.d = true;
                            }
                            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i15);
                            arrayList2.set(i15, (TLRPC.TL_username) arrayList2.get(i16));
                            arrayList2.set(i16, tL_username);
                            gaVar.j(b10, b11);
                            int size = arrayList2.size() + 3;
                            if (b10 == size || b11 == size) {
                                gaVar.h(b10, 3);
                                gaVar.h(b11, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (c1Var.f == c1Var2.f) {
                    View view2 = c1Var2.a;
                    if (!(view2 instanceof la) || ((la) view2).G) {
                        ap apVar = ((bp) obj).e3;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i17 = b12 - 1;
                        int i18 = b13 - 1;
                        bp bpVar = apVar.c;
                        cp cpVar = bpVar.h3;
                        ArrayList arrayList3 = cpVar.N;
                        if (i17 < cpVar.N.size() && i18 < arrayList3.size()) {
                            if (b12 != b13) {
                                bpVar.f3 = true;
                            }
                            TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList3.get(i17);
                            arrayList3.set(i17, (TLRPC.TL_username) arrayList3.get(i18));
                            arrayList3.set(i18, tL_username2);
                            apVar.j(b12, b13);
                            int size2 = arrayList3.size();
                            if (b12 == size2 || b13 == size2) {
                                apVar.h(b12, 3);
                                apVar.h(b13, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) obj;
                if (!w7Var.l2) {
                    w7Var.m2.c(b14, b15);
                } else if (b14 <= 0 || b15 <= 0) {
                    break;
                } else {
                    w7Var.m2.c(b14 - 1, b15 - 1);
                }
                w7Var.n2.clear();
                w7Var.n2.addAll(w7Var.m2.c);
                w7Var.q1.j(b14, b15);
                break;
            case 3:
                if (c1Var.f != c1Var2.f) {
                    break;
                } else {
                    fg.j jVar = ((org.telegram.ui.Components.jn) obj).r;
                    int b16 = c1Var.b();
                    int b17 = c1Var2.b();
                    org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) jVar.e;
                    int i19 = jnVar.t0;
                    ih.g gVar = jnVar.m1;
                    int i20 = b16 - i19;
                    int i21 = b17 - i19;
                    if (i20 >= 0 && i21 >= 0 && i20 < (i10 = jnVar.M) && i21 < i10) {
                        ih.f b18 = gVar.b(i20);
                        SparseArray sparseArray = gVar.a;
                        sparseArray.put(i20, gVar.b(i21));
                        sparseArray.put(i21, b18);
                        CharSequence[] charSequenceArr = jnVar.K;
                        CharSequence charSequence = charSequenceArr[i20];
                        charSequenceArr[i20] = charSequenceArr[i21];
                        charSequenceArr[i21] = charSequence;
                        boolean[] zArr = jnVar.L;
                        boolean z10 = zArr[i20];
                        zArr[i20] = zArr[i21];
                        zArr[i21] = z10;
                        jVar.j(b16, b17);
                        break;
                    }
                }
                break;
            case 4:
                int b19 = c1Var2.b();
                org.telegram.ui.Components.gm0 gm0Var = (org.telegram.ui.Components.gm0) obj;
                ArrayList arrayList4 = gm0Var.e;
                if (b19 >= gm0Var.w && c1Var2.b() < gm0Var.x) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    int i22 = gm0Var.w;
                    int i23 = b20 - i22;
                    int i24 = b21 - i22;
                    arrayList4.indexOf(Integer.valueOf(i23));
                    arrayList4.get(b20 - gm0Var.w);
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(i23);
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList4.get(i24);
                    arrayList4.set(i23, jjVar2);
                    arrayList4.set(i24, jjVar);
                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(gm0Var.d);
                    ArrayList arrayList5 = q6.G;
                    int indexOf = arrayList5.indexOf(jjVar);
                    int indexOf2 = arrayList5.indexOf(jjVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList5.set(indexOf, jjVar2);
                        arrayList5.set(indexOf2, jjVar);
                    }
                    q6.y();
                    gm0Var.c.j(b20, b21);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) obj;
                ArrayList arrayList6 = it0Var.f;
                org.telegram.ui.Components.zt0 zt0Var = it0Var.y;
                if (zt0Var.E1 && recyclerView.getAdapter() != zt0Var.U) {
                    org.telegram.messenger.fw s10 = s(c1Var);
                    org.telegram.messenger.fw s11 = s(c1Var2);
                    if (s10 != null && s11 != null && s10.b && s11.b) {
                        int b22 = c1Var.b();
                        int b23 = c1Var2.b();
                        arrayList6.remove(b22);
                        arrayList6.add(b23, s10);
                        it0Var.j(b22, b23);
                        it0Var.h = true;
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) obj;
                org.telegram.ui.Components.p51 p51Var = u51Var.f3;
                if (p51Var.H(c1Var.b()) < 0 || p51Var.H(c1Var.b()) != p51Var.H(c1Var2.b())) {
                    break;
                } else {
                    int b24 = c1Var.b();
                    int b25 = c1Var2.b();
                    ArrayList arrayList7 = p51Var.D;
                    if (p51Var.M != null) {
                        int H = p51Var.H(b24);
                        int H2 = p51Var.H(b25);
                        if (H >= 0 && H == H2) {
                            boolean J = p51Var.J(b24);
                            boolean J2 = p51Var.J(b25);
                            arrayList7.add(b25, (org.telegram.ui.Components.a51) arrayList7.remove(b24));
                            p51Var.j(b24, b25);
                            if (p51Var.J(b25) != J) {
                                p51Var.h(b25, 3);
                            }
                            if (p51Var.J(b24) != J2) {
                                p51Var.h(b24, 3);
                            }
                            if (p51Var.L && (i11 = p51Var.K) != H) {
                                p51Var.F(i11);
                            }
                            p51Var.L = true;
                            p51Var.K = H;
                        }
                    }
                    u51Var.K1();
                    break;
                }
                break;
            case 7:
                int b26 = c1Var.b();
                int b27 = c1Var2.b();
                org.telegram.ui.Components.v71 v71Var = (org.telegram.ui.Components.v71) obj;
                ArrayList arrayList8 = v71Var.h;
                if (!((n2.u) v71Var.D).G(b26) || !((n2.u) v71Var.D).G(b27)) {
                    break;
                } else {
                    Pattern pattern = Utilities.a;
                    Object obj2 = arrayList8.get(b26);
                    arrayList8.set(b26, arrayList8.get(b27));
                    arrayList8.set(b27, obj2);
                    v71Var.y.j(b26, b27);
                    ArrayList arrayList9 = new ArrayList();
                    int size3 = arrayList8.size();
                    while (i14 < size3) {
                        Object obj3 = arrayList8.get(i14);
                        i14++;
                        arrayList9.add(Integer.valueOf(((org.telegram.ui.Components.s71) obj3).a));
                    }
                    org.telegram.ui.Components.o71 o71Var = ((org.telegram.ui.Components.w71) ((n2.u) v71Var.D).b).L;
                    if (o71Var != null) {
                        o71Var.a(arrayList9);
                        break;
                    }
                }
                break;
            case 8:
                if (c1Var.f != c1Var2.f || !r(c1Var.b()) || !r(c1Var2.b())) {
                    break;
                } else {
                    ys0 ys0Var = ((at0) obj).b;
                    int b28 = c1Var.b();
                    int b29 = c1Var2.b();
                    at0 at0Var = ys0Var.d;
                    int i25 = at0Var.n0;
                    int i26 = b28 - i25;
                    int i27 = b29 - i25;
                    if (i26 >= 0 && i27 >= 0 && i26 < (i12 = at0Var.D) && i27 < i12) {
                        CharSequence[] charSequenceArr2 = at0Var.w;
                        CharSequence charSequence2 = charSequenceArr2[i26];
                        charSequenceArr2[i26] = charSequenceArr2[i27];
                        charSequenceArr2[i27] = charSequence2;
                        int[] iArr = at0Var.r;
                        if (iArr != null) {
                            int i28 = iArr[i26];
                            iArr[i26] = iArr[i27];
                            iArr[i27] = i28;
                        }
                        boolean[] zArr2 = at0Var.x;
                        boolean z11 = zArr2[i26];
                        zArr2[i26] = zArr2[i27];
                        zArr2[i27] = z11;
                        ys0Var.j(b28, b29);
                        break;
                    }
                }
                break;
            default:
                uh.e eVar = ((uh.i) obj).w;
                if (!eVar.L(c1Var.b()) || !eVar.L(c1Var2.b())) {
                    break;
                } else {
                    int b30 = c1Var.b();
                    int b31 = c1Var2.b();
                    ArrayList arrayList10 = eVar.n;
                    th.x4 x4Var = eVar.e;
                    if (x4Var != null && b30 >= 0 && b30 < x4Var.i.size() && b31 >= 0 && b31 < eVar.e.i.size()) {
                        if (eVar.e instanceof th.q4) {
                            arrayList = new ArrayList();
                            for (int i29 = 0; i29 < eVar.e.i.size(); i29++) {
                                arrayList.add(Integer.valueOf(((org.telegram.messenger.jj) eVar.e.i.get(i29)).f1()));
                            }
                        } else {
                            arrayList = new ArrayList(eVar.e.g);
                        }
                        if (!eVar.r) {
                            arrayList10.clear();
                            arrayList10.addAll(arrayList);
                            eVar.r = true;
                        }
                        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) eVar.e.i.get(b30);
                        arrayList.remove(Integer.valueOf(jjVar3.f1()));
                        arrayList.add(Utilities.j(b31, arrayList.size(), 0), Integer.valueOf(jjVar3.f1()));
                        eVar.e.C(arrayList, false);
                        eVar.j(b30, b31);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // s4.u
    public void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 6:
                break;
            default:
                super.o(recyclerView, c1Var, c1Var2, i10, i11, i12);
                break;
        }
    }

    @Override // s4.u
    public void p(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.rs0 rs0Var;
        ArrayList arrayList;
        int i11 = this.d;
        Object obj = this.e;
        switch (i11) {
            case 0:
                oa oaVar = (oa) obj;
                if (i10 == 0) {
                    oa.c0(oaVar);
                } else {
                    oaVar.b.I0(false);
                    c1Var.a.setPressed(true);
                }
                if (c1Var != null) {
                    c1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 1:
                bp bpVar = (bp) obj;
                cp cpVar = bpVar.h3;
                if (i10 != 0) {
                    cpVar.L = true;
                    bpVar.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                } else {
                    cpVar.L = false;
                    if (bpVar.f3) {
                        TLRPC.Chat chat = cpVar.X;
                        ArrayList arrayList2 = cpVar.N;
                        ArrayList arrayList3 = cpVar.M;
                        if (chat != null) {
                            bpVar.f3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = cpVar.X;
                            tL_inputChannel.channel_id = chat2.id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((TLRPC.TL_username) arrayList3.get(i12)).active) {
                                    arrayList4.add(((TLRPC.TL_username) arrayList3.get(i12)).username);
                                }
                            }
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (((TLRPC.TL_username) arrayList2.get(i13)).active) {
                                    arrayList4.add(((TLRPC.TL_username) arrayList2.get(i13)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList4;
                            cpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new ag.c3(11));
                            cpVar.X.usernames.clear();
                            cpVar.X.usernames.addAll(arrayList3);
                            cpVar.X.usernames.addAll(arrayList2);
                            cpVar.getMessagesController().N3(cpVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.j7 j7Var = ((org.telegram.ui.Components.w7) obj).o1;
                if (c1Var != null) {
                    j7Var.d1(false);
                }
                if (i10 != 0) {
                    j7Var.I0(false);
                    if (c1Var != null) {
                        c1Var.a.setPressed(true);
                    }
                }
                if (c1Var != null) {
                    c1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj;
                w71 w71Var = jnVar.s;
                if (i10 != 0) {
                    w71Var.setItemAnimator(jnVar.w);
                    w71Var.I0(false);
                    c1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, c1Var.a, jnVar.a);
                    break;
                }
                break;
            case 4:
                if (i10 != 0) {
                    ((org.telegram.ui.Components.gm0) obj).b.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) obj;
                org.telegram.ui.Components.uo0 uo0Var = it0Var.n;
                if (c1Var != null && (rs0Var = it0Var.s) != null) {
                    rs0Var.d1(false);
                }
                if (i10 == 0) {
                    org.telegram.messenger.i0.r(uo0Var);
                    org.telegram.messenger.i0.h3(uo0Var, 300L);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) obj;
                if (c1Var != null) {
                    u51Var.d1(false);
                }
                if (i10 == 0) {
                    org.telegram.ui.Components.p51 p51Var = u51Var.f3;
                    if (p51Var.L) {
                        p51Var.F(p51Var.K);
                    }
                    if (u51Var.k3 != null) {
                        u51Var.G1();
                        u51Var.k3 = null;
                        break;
                    }
                } else {
                    u51Var.I0(false);
                    if (c1Var != null) {
                        View view = c1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof bi.h2) {
                            bi.h2 h2Var = (bi.h2) view.getBackground();
                            if (!h2Var.c) {
                                h2Var.c = true;
                                h2Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            u51Var.k3 = c1Var;
                            u51Var.J1(c1Var);
                            break;
                        }
                    }
                }
                break;
            case 8:
                if (i10 != 0) {
                    ((at0) obj).c.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
            case 9:
                uh.i iVar = (uh.i) obj;
                uh.c cVar = iVar.f;
                if (c1Var != null) {
                    cVar.d1(false);
                }
                if (i10 == 0) {
                    uh.e eVar = iVar.w;
                    ArrayList arrayList5 = eVar.n;
                    th.x4 x4Var = eVar.e;
                    if (x4Var != null && eVar.r) {
                        if (x4Var instanceof th.q4) {
                            arrayList = new ArrayList();
                            for (int i14 = 0; i14 < eVar.e.i.size(); i14++) {
                                arrayList.add(Integer.valueOf(((org.telegram.messenger.jj) eVar.e.i.get(i14)).f1()));
                            }
                        } else {
                            arrayList = x4Var.g;
                        }
                        boolean z10 = arrayList5.size() != arrayList.size();
                        if (!z10) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList5.size()) {
                                    if (arrayList5.get(i15) != arrayList.get(i15)) {
                                        z10 = true;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            eVar.e.C(arrayList, true);
                        }
                        eVar.r = false;
                    }
                    cVar.setItemAnimator(null);
                    break;
                } else {
                    cVar.I0(false);
                    if (c1Var != null) {
                        c1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        at0 at0Var = (at0) this.e;
        return !at0Var.I || i10 - at0Var.n0 >= at0Var.y;
    }

    public org.telegram.messenger.fw s(s4.c1 c1Var) {
        int b10;
        org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) this.e;
        if (c1Var != null && (b10 = c1Var.b()) >= 0 && b10 < it0Var.f.size()) {
            return (org.telegram.messenger.fw) it0Var.f.get(b10);
        }
        return null;
    }

    private final void A(s4.c1 c1Var) {
    }

    private final void B(s4.c1 c1Var) {
    }

    private final void C(s4.c1 c1Var) {
    }

    private final void D(s4.c1 c1Var) {
    }

    private final void u(s4.c1 c1Var) {
    }

    private final void v(s4.c1 c1Var) {
    }

    private final void w(s4.c1 c1Var) {
    }

    private final void x(s4.c1 c1Var) {
    }

    private final void y(s4.c1 c1Var) {
    }

    private final void z(s4.c1 c1Var) {
    }

    private final void t(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
