package fi;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ei.k6;
import ei.r6;
import ei.u5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import mi.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.mv;
import org.telegram.messenger.z5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ao;
import org.telegram.ui.bo;
import org.telegram.ui.da;
import org.telegram.ui.dr0;
import org.telegram.ui.fr0;
import org.telegram.ui.ha;
import org.telegram.ui.ka;
import org.telegram.ui.n4;
import org.telegram.ui.u51;
import org.telegram.ui.zn;
import u4.d1;
import u4.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends v {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i3) {
        this.d = i3;
        this.e = obj;
    }

    @Override // u4.v
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
                l41 l41Var = (l41) this.e;
                super.a(recyclerView, d1Var);
                View view4 = d1Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof z1) {
                    z1 z1Var = (z1) view4.getBackground();
                    if (z1Var.c) {
                        z1Var.c = false;
                        z1Var.invalidateSelf();
                    }
                }
                if (l41Var.D1()) {
                    l41Var.I1(d1Var);
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

    @Override // u4.v
    public final int e(RecyclerView recyclerView, d1 d1Var) {
        mv s6;
        switch (this.d) {
            case 0:
                m mVar = (m) this.e;
                if (!mVar.a0.H.F1 || !mVar.w.L(d1Var.b())) {
                    break;
                } else {
                    mVar.f.setItemAnimator(mVar.n);
                    break;
                }
            case 1:
                if (d1Var.f != 4 || !((ha) d1Var.a).H) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (d1Var.f != 1 || !((ha) d1Var.a).H) {
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
                hl0 hl0Var = (hl0) this.e;
                if (b10 >= hl0Var.w && d1Var.b() < hl0Var.x) {
                    break;
                } else {
                    break;
                }
                break;
            case 6:
                int l10 = v.l(0, 0);
                ws0 ws0Var = ((hs0) this.e).y;
                if (ws0Var.F1 && recyclerView.getAdapter() != ws0Var.V && (s6 = s(d1Var)) != null && s6.b) {
                    break;
                }
                break;
            case 7:
                l41 l41Var = (l41) this.e;
                if (l41Var.k3 && l41Var.g3.H(d1Var.b()) >= 0) {
                    int i3 = 15;
                    if (l41Var.f3.o == 0) {
                        if (!l41Var.j3) {
                            i3 = 12;
                        }
                    } else if (!l41Var.j3) {
                        i3 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 8:
                if (!((y00) ((m61) this.e).E).i(d1Var.b())) {
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

    @Override // u4.v
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((m) this.e).a0.H.F1;
            case 5:
                return ((hl0) this.e).J.I();
            case 7:
                l41 l41Var = (l41) this.e;
                return l41Var.k3 && l41Var.m3;
            case 9:
                return true;
            default:
                return super.k();
        }
    }

    @Override // u4.v
    public void m(Canvas canvas, RecyclerView recyclerView, d1 d1Var, float f10, float f11, int i3, boolean z10) {
        switch (this.d) {
            case 7:
                l41 l41Var = (l41) this.e;
                if (i3 != 2 || z10 || !l41Var.D1()) {
                    super.m(canvas, recyclerView, d1Var, f10, f11, i3, z10);
                    if (i3 == 2 && z10) {
                        l41Var.H1(d1Var);
                        break;
                    }
                }
                break;
            case 8:
                super.m(canvas, recyclerView, d1Var, f10, f11, i3, z10);
                ((m61) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, d1Var, f10, f11, i3, z10);
                break;
        }
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, d1 d1Var, d1 d1Var2) {
        ArrayList arrayList;
        int i3;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.e;
        switch (i12) {
            case 0:
                h hVar = ((m) obj).w;
                if (!hVar.L(d1Var.b()) || !hVar.L(d1Var2.b())) {
                    break;
                } else {
                    int b10 = d1Var.b();
                    int b11 = d1Var2.b();
                    ArrayList arrayList2 = hVar.n;
                    r6 r6Var = hVar.e;
                    if (r6Var != null && b10 >= 0 && b10 < r6Var.i.size() && b11 >= 0 && b11 < hVar.e.i.size()) {
                        if (hVar.e instanceof k6) {
                            arrayList = new ArrayList();
                            for (int i14 = 0; i14 < hVar.e.i.size(); i14++) {
                                arrayList.add(Integer.valueOf(((zi) hVar.e.i.get(i14)).f1()));
                            }
                        } else {
                            arrayList = new ArrayList(hVar.e.g);
                        }
                        if (!hVar.r) {
                            arrayList2.clear();
                            arrayList2.addAll(arrayList);
                            hVar.r = true;
                        }
                        zi ziVar = (zi) hVar.e.i.get(b10);
                        arrayList.remove(Integer.valueOf(ziVar.f1()));
                        arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(ziVar.f1()));
                        hVar.e.C(arrayList, false);
                        hVar.j(b10, b11);
                        break;
                    }
                }
                break;
            case 1:
                if (d1Var.f == d1Var2.f) {
                    View view = d1Var2.a;
                    if (!(view instanceof ha) || ((ha) view).H) {
                        da daVar = ((ka) obj).c;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        ka kaVar = daVar.c;
                        ArrayList arrayList3 = kaVar.w;
                        if (i15 < arrayList3.size() && i16 < arrayList3.size()) {
                            if (b12 != b13) {
                                kaVar.d = true;
                            }
                            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i15);
                            arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i16));
                            arrayList3.set(i16, tL_username);
                            daVar.j(b12, b13);
                            int size = arrayList3.size() + 3;
                            if (b12 == size || b13 == size) {
                                daVar.h(b12, 3);
                                daVar.h(b13, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                if (d1Var.f == d1Var2.f) {
                    View view2 = d1Var2.a;
                    if (!(view2 instanceof ha) || ((ha) view2).H) {
                        zn znVar = ((ao) obj).f3;
                        int b14 = d1Var.b();
                        int b15 = d1Var2.b();
                        int i17 = b14 - 1;
                        int i18 = b15 - 1;
                        ao aoVar = znVar.c;
                        bo boVar = aoVar.i3;
                        ArrayList arrayList4 = boVar.O;
                        if (i17 < boVar.O.size() && i18 < arrayList4.size()) {
                            if (b14 != b15) {
                                aoVar.g3 = true;
                            }
                            TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i17);
                            arrayList4.set(i17, (TLRPC.TL_username) arrayList4.get(i18));
                            arrayList4.set(i18, tL_username2);
                            znVar.j(b14, b15);
                            int size2 = arrayList4.size();
                            if (b14 == size2 || b15 == size2) {
                                znVar.h(b14, 3);
                                znVar.h(b15, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                int b16 = d1Var.b();
                int b17 = d1Var2.b();
                z7 z7Var = (z7) obj;
                if (!z7Var.m2) {
                    z7Var.n2.c(b16, b17);
                } else if (b16 <= 0 || b17 <= 0) {
                    break;
                } else {
                    z7Var.n2.c(b16 - 1, b17 - 1);
                }
                z7Var.o2.clear();
                z7Var.o2.addAll(z7Var.n2.c);
                z7Var.r1.j(b16, b17);
                break;
            case 4:
                if (d1Var.f != d1Var2.f) {
                    break;
                } else {
                    n4 n4Var = ((an) obj).r;
                    int b18 = d1Var.b();
                    int b19 = d1Var2.b();
                    an anVar = (an) n4Var.e;
                    int i19 = anVar.u0;
                    th.d dVar = anVar.n1;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    if (i20 >= 0 && i21 >= 0 && i20 < (i3 = anVar.N) && i21 < i3) {
                        th.c b20 = dVar.b(i20);
                        SparseArray sparseArray = dVar.a;
                        sparseArray.put(i20, dVar.b(i21));
                        sparseArray.put(i21, b20);
                        CharSequence[] charSequenceArr = anVar.L;
                        CharSequence charSequence = charSequenceArr[i20];
                        charSequenceArr[i20] = charSequenceArr[i21];
                        charSequenceArr[i21] = charSequence;
                        boolean[] zArr = anVar.M;
                        boolean z10 = zArr[i20];
                        zArr[i20] = zArr[i21];
                        zArr[i21] = z10;
                        n4Var.j(b18, b19);
                        break;
                    }
                }
                break;
            case 5:
                int b21 = d1Var2.b();
                hl0 hl0Var = (hl0) obj;
                ArrayList arrayList5 = hl0Var.e;
                if (b21 >= hl0Var.w && d1Var2.b() < hl0Var.x) {
                    int b22 = d1Var.b();
                    int b23 = d1Var2.b();
                    int i22 = hl0Var.w;
                    int i23 = b22 - i22;
                    int i24 = b23 - i22;
                    arrayList5.indexOf(Integer.valueOf(i23));
                    arrayList5.get(b22 - hl0Var.w);
                    zi ziVar2 = (zi) arrayList5.get(i23);
                    zi ziVar3 = (zi) arrayList5.get(i24);
                    arrayList5.set(i23, ziVar3);
                    arrayList5.set(i24, ziVar2);
                    z5 q10 = z5.q(hl0Var.d);
                    ArrayList arrayList6 = q10.H;
                    int indexOf = arrayList6.indexOf(ziVar2);
                    int indexOf2 = arrayList6.indexOf(ziVar3);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, ziVar3);
                        arrayList6.set(indexOf2, ziVar2);
                    }
                    q10.y();
                    hl0Var.c.j(b22, b23);
                    break;
                }
                break;
            case 6:
                hs0 hs0Var = (hs0) obj;
                ArrayList arrayList7 = hs0Var.f;
                ws0 ws0Var = hs0Var.y;
                if (ws0Var.F1 && recyclerView.getAdapter() != ws0Var.V) {
                    mv s6 = s(d1Var);
                    mv s10 = s(d1Var2);
                    if (s6 != null && s10 != null && s6.b && s10.b) {
                        int b24 = d1Var.b();
                        int b25 = d1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s6);
                        hs0Var.j(b24, b25);
                        hs0Var.h = true;
                        break;
                    }
                }
                break;
            case 7:
                l41 l41Var = (l41) obj;
                f41 f41Var = l41Var.g3;
                if (f41Var.H(d1Var.b()) < 0 || f41Var.H(d1Var.b()) != f41Var.H(d1Var2.b())) {
                    break;
                } else {
                    int b26 = d1Var.b();
                    int b27 = d1Var2.b();
                    ArrayList arrayList8 = f41Var.E;
                    if (f41Var.N != null) {
                        int H = f41Var.H(b26);
                        int H2 = f41Var.H(b27);
                        if (H >= 0 && H == H2) {
                            boolean J = f41Var.J(b26);
                            boolean J2 = f41Var.J(b27);
                            arrayList8.add(b27, (r31) arrayList8.remove(b26));
                            f41Var.j(b26, b27);
                            if (f41Var.J(b27) != J) {
                                f41Var.h(b27, 3);
                            }
                            if (f41Var.J(b26) != J2) {
                                f41Var.h(b26, 3);
                            }
                            if (f41Var.M && (i10 = f41Var.L) != H) {
                                f41Var.F(i10);
                            }
                            f41Var.M = true;
                            f41Var.L = H;
                        }
                    }
                    l41Var.K1();
                    break;
                }
            case 8:
                int b28 = d1Var.b();
                int b29 = d1Var2.b();
                m61 m61Var = (m61) obj;
                ArrayList arrayList9 = m61Var.h;
                if (!((y00) m61Var.E).i(b28) || !((y00) m61Var.E).i(b29)) {
                    break;
                } else {
                    Pattern pattern = Utilities.a;
                    Object obj2 = arrayList9.get(b28);
                    arrayList9.set(b28, arrayList9.get(b29));
                    arrayList9.set(b29, obj2);
                    m61Var.y.j(b28, b29);
                    ArrayList arrayList10 = new ArrayList();
                    int size3 = arrayList9.size();
                    while (i13 < size3) {
                        Object obj3 = arrayList9.get(i13);
                        i13++;
                        arrayList10.add(Integer.valueOf(((j61) obj3).a));
                    }
                    f61 f61Var = ((n61) ((y00) m61Var.E).a).M;
                    if (f61Var != null) {
                        f61Var.a(arrayList10);
                        break;
                    }
                }
                break;
            default:
                if (d1Var.f != d1Var2.f || !r(d1Var.b()) || !r(d1Var2.b())) {
                    break;
                } else {
                    dr0 dr0Var = ((fr0) obj).b;
                    int b30 = d1Var.b();
                    int b31 = d1Var2.b();
                    fr0 fr0Var = dr0Var.d;
                    int i25 = fr0Var.o0;
                    int i26 = b30 - i25;
                    int i27 = b31 - i25;
                    if (i26 >= 0 && i27 >= 0 && i26 < (i11 = fr0Var.E) && i27 < i11) {
                        CharSequence[] charSequenceArr2 = fr0Var.w;
                        CharSequence charSequence2 = charSequenceArr2[i26];
                        charSequenceArr2[i26] = charSequenceArr2[i27];
                        charSequenceArr2[i27] = charSequence2;
                        int[] iArr = fr0Var.r;
                        if (iArr != null) {
                            int i28 = iArr[i26];
                            iArr[i26] = iArr[i27];
                            iArr[i27] = i28;
                        }
                        boolean[] zArr2 = fr0Var.x;
                        boolean z11 = zArr2[i26];
                        zArr2[i26] = zArr2[i27];
                        zArr2[i27] = z11;
                        dr0Var.j(b30, b31);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // u4.v
    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i3, int i10, int i11) {
        switch (this.d) {
            case 7:
                break;
            default:
                super.o(recyclerView, d1Var, d1Var2, i3, i10, i11);
                break;
        }
    }

    @Override // u4.v
    public void p(d1 d1Var, int i3) {
        ArrayList arrayList;
        qr0 qr0Var;
        int i10 = this.d;
        Object obj = this.e;
        switch (i10) {
            case 0:
                m mVar = (m) obj;
                e eVar = mVar.f;
                if (d1Var != null) {
                    eVar.d1(false);
                }
                if (i3 == 0) {
                    h hVar = mVar.w;
                    ArrayList arrayList2 = hVar.n;
                    r6 r6Var = hVar.e;
                    if (r6Var != null && hVar.r) {
                        if (r6Var instanceof k6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < hVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((zi) hVar.e.i.get(i11)).f1()));
                            }
                        } else {
                            arrayList = r6Var.g;
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
                            hVar.e.C(arrayList, true);
                        }
                        hVar.r = false;
                    }
                    eVar.setItemAnimator(null);
                    break;
                } else {
                    eVar.I0(false);
                    if (d1Var != null) {
                        d1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                ka kaVar = (ka) obj;
                if (i3 == 0) {
                    ka.d0(kaVar);
                } else {
                    kaVar.b.I0(false);
                    d1Var.a.setPressed(true);
                }
                if (d1Var != null) {
                    d1Var.a.setTag(R.id.dragging, i3 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 2:
                ao aoVar = (ao) obj;
                bo boVar = aoVar.i3;
                if (i3 != 0) {
                    boVar.M = true;
                    aoVar.I0(false);
                    d1Var.a.setPressed(true);
                    break;
                } else {
                    boVar.M = false;
                    if (aoVar.g3) {
                        TLRPC.Chat chat = boVar.Y;
                        ArrayList arrayList3 = boVar.O;
                        ArrayList arrayList4 = boVar.N;
                        if (chat != null) {
                            aoVar.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = boVar.Y;
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
                            boVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u5(16));
                            boVar.Y.usernames.clear();
                            boVar.Y.usernames.addAll(arrayList4);
                            boVar.Y.usernames.addAll(arrayList3);
                            boVar.getMessagesController().Q3(boVar.Y, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                l7 l7Var = ((z7) obj).p1;
                if (d1Var != null) {
                    l7Var.d1(false);
                }
                if (i3 != 0) {
                    l7Var.I0(false);
                    if (d1Var != null) {
                        d1Var.a.setPressed(true);
                    }
                }
                if (d1Var != null) {
                    d1Var.a.setTag(R.id.dragging, i3 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 4:
                an anVar = (an) obj;
                u51 u51Var = anVar.s;
                if (i3 != 0) {
                    u51Var.setItemAnimator(anVar.w);
                    u51Var.I0(false);
                    d1Var.a.setPressed(true);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, d1Var.a, anVar.a);
                    break;
                }
                break;
            case 5:
                if (i3 != 0) {
                    ((hl0) obj).b.I0(false);
                    d1Var.a.setPressed(true);
                    break;
                }
                break;
            case 6:
                hs0 hs0Var = (hs0) obj;
                sp0 sp0Var = hs0Var.n;
                if (d1Var != null && (qr0Var = hs0Var.s) != null) {
                    qr0Var.d1(false);
                }
                if (i3 == 0) {
                    g0.r(sp0Var);
                    g0.i3(sp0Var, 300L);
                    break;
                }
                break;
            case 7:
                l41 l41Var = (l41) obj;
                if (d1Var != null) {
                    l41Var.d1(false);
                }
                if (i3 == 0) {
                    f41 f41Var = l41Var.g3;
                    if (f41Var.M) {
                        f41Var.F(f41Var.L);
                    }
                    if (l41Var.l3 != null) {
                        l41Var.G1();
                        l41Var.l3 = null;
                        break;
                    }
                } else {
                    l41Var.I0(false);
                    if (d1Var != null) {
                        View view = d1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof z1) {
                            z1 z1Var = (z1) view.getBackground();
                            if (!z1Var.c) {
                                z1Var.c = true;
                                z1Var.invalidateSelf();
                            }
                        }
                        if (i3 == 2) {
                            l41Var.l3 = d1Var;
                            l41Var.J1(d1Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i3 != 0) {
                    ((fr0) obj).c.I0(false);
                    d1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // u4.v
    public final void q(d1 d1Var) {
        int i3 = this.d;
    }

    public boolean r(int i3) {
        fr0 fr0Var = (fr0) this.e;
        return !fr0Var.J || i3 - fr0Var.o0 >= fr0Var.y;
    }

    public mv s(d1 d1Var) {
        int b10;
        hs0 hs0Var = (hs0) this.e;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && b10 < hs0Var.f.size()) {
            return (mv) hs0Var.f.get(b10);
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

    private final void t(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i3, int i10, int i11) {
    }
}
