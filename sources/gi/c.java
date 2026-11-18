package gi;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.h6;
import fi.k5;
import fi.z5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import oi.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ov;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ea;
import org.telegram.ui.f61;
import org.telegram.ui.ho;
import org.telegram.ui.ia;
import org.telegram.ui.io;
import org.telegram.ui.jo;
import org.telegram.ui.l4;
import org.telegram.ui.la;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import v4.f1;
import v4.w;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c extends w {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i7) {
        this.d = i7;
        this.e = obj;
    }

    @Override // v4.w
    public void a(RecyclerView recyclerView, f1 f1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, f1Var);
                f1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, f1Var);
                View view = f1Var.a;
                view.setPressed(false);
                view.setTag(R.id.dragging, null);
                break;
            case 2:
                super.a(recyclerView, f1Var);
                f1Var.a.setPressed(false);
                break;
            case 3:
                super.a(recyclerView, f1Var);
                View view2 = f1Var.a;
                view2.setPressed(false);
                view2.setTag(R.id.dragging, null);
                break;
            case 4:
                super.a(recyclerView, f1Var);
                View view3 = f1Var.a;
                view3.setPressed(false);
                view3.setBackground(null);
                break;
            case 5:
                super.a(recyclerView, f1Var);
                f1Var.a.setPressed(false);
                break;
            case 6:
                super.a(recyclerView, f1Var);
                f1Var.a.setPressed(false);
                break;
            case 7:
                e51 e51Var = (e51) this.e;
                super.a(recyclerView, f1Var);
                View view4 = f1Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof w1) {
                    w1 w1Var = (w1) view4.getBackground();
                    if (w1Var.c) {
                        w1Var.c = false;
                        w1Var.invalidateSelf();
                    }
                }
                if (e51Var.D1()) {
                    e51Var.I1(f1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(lr.h).start();
                    break;
                }
                break;
            case 8:
            default:
                super.a(recyclerView, f1Var);
                break;
            case 9:
                super.a(recyclerView, f1Var);
                f1Var.a.setPressed(false);
                break;
        }
    }

    @Override // v4.w
    public final int e(RecyclerView recyclerView, f1 f1Var) {
        ov s5;
        switch (this.d) {
            case 0:
                m mVar = (m) this.e;
                if (!mVar.a0.H.F1 || !mVar.w.L(f1Var.b())) {
                    break;
                } else {
                    mVar.f.setItemAnimator(mVar.n);
                    break;
                }
            case 1:
                if (f1Var.f != 4 || !((ia) f1Var.a).H) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (f1Var.f != 1 || !((ia) f1Var.a).H) {
                    break;
                } else {
                    break;
                }
                break;
            case 3:
                if (f1Var.f == 0) {
                    break;
                }
                break;
            case 4:
                if (f1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 5:
                int b10 = f1Var.b();
                ql0 ql0Var = (ql0) this.e;
                if (b10 >= ql0Var.w && f1Var.b() < ql0Var.x) {
                    break;
                } else {
                    break;
                }
                break;
            case 6:
                int l10 = w.l(0, 0);
                gt0 gt0Var = ((rs0) this.e).y;
                if (gt0Var.F1 && recyclerView.getAdapter() != gt0Var.V && (s5 = s(f1Var)) != null && s5.b) {
                    break;
                }
                break;
            case 7:
                e51 e51Var = (e51) this.e;
                if (e51Var.k3 && e51Var.g3.H(f1Var.b()) >= 0) {
                    int i7 = 15;
                    if (e51Var.f3.o == 0) {
                        if (!e51Var.j3) {
                            i7 = 12;
                        }
                    } else if (!e51Var.j3) {
                        i7 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 8:
                if (!((f71) this.e).E.h(f1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (f1Var.f != 5 || !r(f1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return w.l(0, 0);
    }

    @Override // v4.w
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((m) this.e).a0.H.F1;
            case 5:
                return ((ql0) this.e).J.V1();
            case 7:
                e51 e51Var = (e51) this.e;
                return e51Var.k3 && e51Var.m3;
            case 9:
                return true;
            default:
                return super.k();
        }
    }

    @Override // v4.w
    public void m(Canvas canvas, RecyclerView recyclerView, f1 f1Var, float f10, float f11, int i7, boolean z10) {
        switch (this.d) {
            case 7:
                e51 e51Var = (e51) this.e;
                if (i7 != 2 || z10 || !e51Var.D1()) {
                    super.m(canvas, recyclerView, f1Var, f10, f11, i7, z10);
                    if (i7 == 2 && z10) {
                        e51Var.H1(f1Var);
                        break;
                    }
                }
                break;
            case 8:
                super.m(canvas, recyclerView, f1Var, f10, f11, i7, z10);
                ((f71) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, f1Var, f10, f11, i7, z10);
                break;
        }
    }

    @Override // v4.w
    public final boolean n(RecyclerView recyclerView, f1 f1Var, f1 f1Var2) {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.e;
        switch (i12) {
            case 0:
                h hVar = ((m) obj).w;
                if (!hVar.L(f1Var.b()) || !hVar.L(f1Var2.b())) {
                    break;
                } else {
                    int b10 = f1Var.b();
                    int b11 = f1Var2.b();
                    ArrayList arrayList2 = hVar.n;
                    h6 h6Var = hVar.e;
                    if (h6Var != null && b10 >= 0 && b10 < h6Var.i.size() && b11 >= 0 && b11 < hVar.e.i.size()) {
                        if (hVar.e instanceof z5) {
                            arrayList = new ArrayList();
                            for (int i14 = 0; i14 < hVar.e.i.size(); i14++) {
                                arrayList.add(Integer.valueOf(((fj) hVar.e.i.get(i14)).e1()));
                            }
                        } else {
                            arrayList = new ArrayList(hVar.e.g);
                        }
                        if (!hVar.r) {
                            arrayList2.clear();
                            arrayList2.addAll(arrayList);
                            hVar.r = true;
                        }
                        fj fjVar = (fj) hVar.e.i.get(b10);
                        arrayList.remove(Integer.valueOf(fjVar.e1()));
                        arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(fjVar.e1()));
                        hVar.e.C(arrayList, false);
                        hVar.j(b10, b11);
                        break;
                    }
                }
                break;
            case 1:
                if (f1Var.f == f1Var2.f) {
                    View view = f1Var2.a;
                    if (!(view instanceof ia) || ((ia) view).H) {
                        ea eaVar = ((la) obj).c;
                        int b12 = f1Var.b();
                        int b13 = f1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        la laVar = eaVar.c;
                        ArrayList arrayList3 = laVar.w;
                        if (i15 < arrayList3.size() && i16 < arrayList3.size()) {
                            if (b12 != b13) {
                                laVar.d = true;
                            }
                            arrayList3.add(i16, (TLRPC.TL_username) arrayList3.remove(i15));
                            eaVar.j(b12, b13);
                            int size = arrayList3.size();
                            int i17 = size + 3;
                            if (b12 == i17 || b13 == i17) {
                                eaVar.h(b13, 3);
                                if (b13 == i17) {
                                    i17 = size + 2;
                                }
                                eaVar.h(i17, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                if (f1Var.f == f1Var2.f) {
                    View view2 = f1Var2.a;
                    if (!(view2 instanceof ia) || ((ia) view2).H) {
                        ho hoVar = ((io) obj).f3;
                        int b14 = f1Var.b();
                        int b15 = f1Var2.b();
                        int i18 = b14 - 1;
                        int i19 = b15 - 1;
                        io ioVar = hoVar.c;
                        jo joVar = ioVar.i3;
                        ArrayList arrayList4 = joVar.O;
                        if (i18 < joVar.O.size() && i19 < arrayList4.size()) {
                            if (b14 != b15) {
                                ioVar.g3 = true;
                            }
                            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList4.get(i18);
                            arrayList4.set(i18, (TLRPC.TL_username) arrayList4.get(i19));
                            arrayList4.set(i19, tL_username);
                            hoVar.j(b14, b15);
                            int size2 = arrayList4.size();
                            if (b14 == size2 || b15 == size2) {
                                hoVar.h(b14, 3);
                                hoVar.h(b15, 3);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                int b16 = f1Var.b();
                int b17 = f1Var2.b();
                g8 g8Var = (g8) obj;
                if (!g8Var.p2) {
                    g8Var.q2.c(b16, b17);
                } else if (b16 <= 0 || b17 <= 0) {
                    break;
                } else {
                    g8Var.q2.c(b16 - 1, b17 - 1);
                }
                g8Var.r2.clear();
                g8Var.r2.addAll(g8Var.q2.c);
                g8Var.u1.j(b16, b17);
                break;
            case 4:
                if (f1Var.f != f1Var2.f) {
                    break;
                } else {
                    l4 l4Var = ((rn) obj).r;
                    int b18 = f1Var.b();
                    int b19 = f1Var2.b();
                    rn rnVar = (rn) l4Var.e;
                    int i20 = rnVar.u0;
                    sh.e eVar = rnVar.n1;
                    int i21 = b18 - i20;
                    int i22 = b19 - i20;
                    if (i21 >= 0 && i22 >= 0 && i21 < (i7 = rnVar.N) && i22 < i7) {
                        sh.d b20 = eVar.b(i21);
                        SparseArray sparseArray = eVar.a;
                        sparseArray.put(i21, eVar.b(i22));
                        sparseArray.put(i22, b20);
                        CharSequence[] charSequenceArr = rnVar.L;
                        CharSequence charSequence = charSequenceArr[i21];
                        charSequenceArr[i21] = charSequenceArr[i22];
                        charSequenceArr[i22] = charSequence;
                        boolean[] zArr = rnVar.M;
                        boolean z10 = zArr[i21];
                        zArr[i21] = zArr[i22];
                        zArr[i22] = z10;
                        l4Var.j(b18, b19);
                        break;
                    }
                }
                break;
            case 5:
                int b21 = f1Var2.b();
                ql0 ql0Var = (ql0) obj;
                ArrayList arrayList5 = ql0Var.e;
                if (b21 >= ql0Var.w && f1Var2.b() < ql0Var.x) {
                    int b22 = f1Var.b();
                    int b23 = f1Var2.b();
                    int i23 = ql0Var.w;
                    int i24 = b22 - i23;
                    int i25 = b23 - i23;
                    arrayList5.indexOf(Integer.valueOf(i24));
                    arrayList5.get(b22 - ql0Var.w);
                    fj fjVar2 = (fj) arrayList5.get(i24);
                    fj fjVar3 = (fj) arrayList5.get(i25);
                    arrayList5.set(i24, fjVar3);
                    arrayList5.set(i25, fjVar2);
                    a6 q10 = a6.q(ql0Var.d);
                    ArrayList arrayList6 = q10.H;
                    int indexOf = arrayList6.indexOf(fjVar2);
                    int indexOf2 = arrayList6.indexOf(fjVar3);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, fjVar3);
                        arrayList6.set(indexOf2, fjVar2);
                    }
                    q10.y();
                    ql0Var.c.j(b22, b23);
                    break;
                }
                break;
            case 6:
                rs0 rs0Var = (rs0) obj;
                ArrayList arrayList7 = rs0Var.f;
                gt0 gt0Var = rs0Var.y;
                if (gt0Var.F1 && recyclerView.getAdapter() != gt0Var.V) {
                    ov s5 = s(f1Var);
                    ov s9 = s(f1Var2);
                    if (s5 != null && s9 != null && s5.b && s9.b) {
                        int b24 = f1Var.b();
                        int b25 = f1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s5);
                        rs0Var.j(b24, b25);
                        rs0Var.h = true;
                        break;
                    }
                }
                break;
            case 7:
                e51 e51Var = (e51) obj;
                z41 z41Var = e51Var.g3;
                if (z41Var.H(f1Var.b()) < 0 || z41Var.H(f1Var.b()) != z41Var.H(f1Var2.b())) {
                    break;
                } else {
                    int b26 = f1Var.b();
                    int b27 = f1Var2.b();
                    ArrayList arrayList8 = z41Var.E;
                    if (z41Var.N != null) {
                        int H = z41Var.H(b26);
                        int H2 = z41Var.H(b27);
                        if (H >= 0 && H == H2) {
                            boolean J = z41Var.J(b26);
                            boolean J2 = z41Var.J(b27);
                            arrayList8.add(b27, (l41) arrayList8.remove(b26));
                            z41Var.j(b26, b27);
                            if (z41Var.J(b27) != J) {
                                z41Var.h(b27, 3);
                            }
                            if (z41Var.J(b26) != J2) {
                                z41Var.h(b26, 3);
                            }
                            if (z41Var.M && (i10 = z41Var.L) != H) {
                                z41Var.F(i10);
                            }
                            z41Var.M = true;
                            z41Var.L = H;
                        }
                    }
                    e51Var.K1();
                    break;
                }
                break;
            case 8:
                int b28 = f1Var.b();
                int b29 = f1Var2.b();
                f71 f71Var = (f71) obj;
                ArrayList arrayList9 = f71Var.h;
                if (!f71Var.E.h(b28) || !f71Var.E.h(b29)) {
                    break;
                } else {
                    Pattern pattern = Utilities.a;
                    Object obj2 = arrayList9.get(b28);
                    arrayList9.set(b28, arrayList9.get(b29));
                    arrayList9.set(b29, obj2);
                    f71Var.y.j(b28, b29);
                    ArrayList arrayList10 = new ArrayList();
                    int size3 = arrayList9.size();
                    while (i13 < size3) {
                        Object obj3 = arrayList9.get(i13);
                        i13++;
                        arrayList10.add(Integer.valueOf(((c71) obj3).a));
                    }
                    f71Var.E.k(arrayList10);
                    break;
                }
                break;
            default:
                if (f1Var.f != f1Var2.f || !r(f1Var.b()) || !r(f1Var2.b())) {
                    break;
                } else {
                    nr0 nr0Var = ((pr0) obj).b;
                    int b30 = f1Var.b();
                    int b31 = f1Var2.b();
                    pr0 pr0Var = nr0Var.d;
                    int i26 = pr0Var.o0;
                    int i27 = b30 - i26;
                    int i28 = b31 - i26;
                    if (i27 >= 0 && i28 >= 0 && i27 < (i11 = pr0Var.E) && i28 < i11) {
                        CharSequence[] charSequenceArr2 = pr0Var.w;
                        CharSequence charSequence2 = charSequenceArr2[i27];
                        charSequenceArr2[i27] = charSequenceArr2[i28];
                        charSequenceArr2[i28] = charSequence2;
                        int[] iArr = pr0Var.r;
                        if (iArr != null) {
                            int i29 = iArr[i27];
                            iArr[i27] = iArr[i28];
                            iArr[i28] = i29;
                        }
                        boolean[] zArr2 = pr0Var.x;
                        boolean z11 = zArr2[i27];
                        zArr2[i27] = zArr2[i28];
                        zArr2[i28] = z11;
                        nr0Var.j(b30, b31);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // v4.w
    public void o(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
        switch (this.d) {
            case 1:
            case 7:
                break;
            default:
                super.o(recyclerView, f1Var, f1Var2, i7, i10, i11);
                break;
        }
    }

    @Override // v4.w
    public void p(f1 f1Var, int i7) {
        ArrayList arrayList;
        as0 as0Var;
        int i10 = this.d;
        Object obj = this.e;
        switch (i10) {
            case 0:
                m mVar = (m) obj;
                e eVar = mVar.f;
                if (f1Var != null) {
                    eVar.d1(false);
                }
                if (i7 == 0) {
                    h hVar = mVar.w;
                    ArrayList arrayList2 = hVar.n;
                    h6 h6Var = hVar.e;
                    if (h6Var != null && hVar.r) {
                        if (h6Var instanceof z5) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < hVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((fj) hVar.e.i.get(i11)).e1()));
                            }
                        } else {
                            arrayList = h6Var.g;
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
                    if (f1Var != null) {
                        f1Var.a.setPressed(true);
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
                    f1Var.a.setPressed(true);
                }
                if (f1Var != null) {
                    f1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 2:
                io ioVar = (io) obj;
                jo joVar = ioVar.i3;
                if (i7 != 0) {
                    joVar.M = true;
                    ioVar.I0(false);
                    f1Var.a.setPressed(true);
                    break;
                } else {
                    joVar.M = false;
                    if (ioVar.g3) {
                        TLRPC.Chat chat = joVar.Y;
                        ArrayList arrayList3 = joVar.O;
                        ArrayList arrayList4 = joVar.N;
                        if (chat != null) {
                            ioVar.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = joVar.Y;
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
                            joVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new k5(16));
                            joVar.Y.usernames.clear();
                            joVar.Y.usernames.addAll(arrayList4);
                            joVar.Y.usernames.addAll(arrayList3);
                            joVar.getMessagesController().X3(joVar.Y, true);
                            break;
                        }
                    }
                }
                break;
            case 3:
                r7 r7Var = ((g8) obj).s1;
                if (f1Var != null) {
                    r7Var.d1(false);
                }
                if (i7 != 0) {
                    r7Var.I0(false);
                    if (f1Var != null) {
                        f1Var.a.setPressed(true);
                    }
                }
                if (f1Var != null) {
                    f1Var.a.setTag(R.id.dragging, i7 == 2 ? Boolean.TRUE : null);
                    break;
                }
                break;
            case 4:
                rn rnVar = (rn) obj;
                f61 f61Var = rnVar.s;
                if (i7 != 0) {
                    f61Var.setItemAnimator(rnVar.w);
                    f61Var.I0(false);
                    f1Var.a.setPressed(true);
                    u6.h(n6.h5, f1Var.a, rnVar.a);
                    break;
                }
                break;
            case 5:
                if (i7 != 0) {
                    ((ql0) obj).b.I0(false);
                    f1Var.a.setPressed(true);
                    break;
                }
                break;
            case 6:
                rs0 rs0Var = (rs0) obj;
                ap0 ap0Var = rs0Var.n;
                if (f1Var != null && (as0Var = rs0Var.s) != null) {
                    as0Var.d1(false);
                }
                if (i7 == 0) {
                    g0.r(ap0Var);
                    g0.h3(ap0Var, 300L);
                    break;
                }
                break;
            case 7:
                e51 e51Var = (e51) obj;
                if (f1Var != null) {
                    e51Var.d1(false);
                }
                if (i7 == 0) {
                    z41 z41Var = e51Var.g3;
                    if (z41Var.M) {
                        z41Var.F(z41Var.L);
                    }
                    if (e51Var.l3 != null) {
                        e51Var.G1();
                        e51Var.l3 = null;
                        break;
                    }
                } else {
                    e51Var.I0(false);
                    if (f1Var != null) {
                        View view = f1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof w1) {
                            w1 w1Var = (w1) view.getBackground();
                            if (!w1Var.c) {
                                w1Var.c = true;
                                w1Var.invalidateSelf();
                            }
                        }
                        if (i7 == 2) {
                            e51Var.l3 = f1Var;
                            e51Var.J1(f1Var);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i7 != 0) {
                    ((pr0) obj).c.I0(false);
                    f1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // v4.w
    public final void q(f1 f1Var) {
        int i7 = this.d;
    }

    public boolean r(int i7) {
        pr0 pr0Var = (pr0) this.e;
        return !pr0Var.J || i7 - pr0Var.o0 >= pr0Var.y;
    }

    public ov s(f1 f1Var) {
        int b10;
        rs0 rs0Var = (rs0) this.e;
        if (f1Var != null && (b10 = f1Var.b()) >= 0 && b10 < rs0Var.f.size()) {
            return (ov) rs0Var.f.get(b10);
        }
        return null;
    }

    private final void A(f1 f1Var) {
    }

    private final void B(f1 f1Var) {
    }

    private final void C(f1 f1Var) {
    }

    private final void D(f1 f1Var) {
    }

    private final void E(f1 f1Var) {
    }

    private final void v(f1 f1Var) {
    }

    private final void w(f1 f1Var) {
    }

    private final void x(f1 f1Var) {
    }

    private final void y(f1 f1Var) {
    }

    private final void z(f1 f1Var) {
    }

    private final void t(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
    }

    private final void u(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
    }
}
