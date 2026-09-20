package bi;

import ai.d9;
import ai.t7;
import ai.t8;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ii.a2;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.aw0;
import org.telegram.ui.fc1;
import org.telegram.ui.gp;
import org.telegram.ui.hp;
import org.telegram.ui.ip;
import org.telegram.ui.oa;
import org.telegram.ui.yv0;
import s4.c1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class g extends s4.v {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, int i10) {
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
                s61 s61Var = (s61) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.c) {
                        a2Var.c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (s61Var.B1()) {
                    s61Var.G1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(qr.h).start();
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
                u uVar = (u) this.e;
                if (!uVar.W.G.C1 || !uVar.v.L(c1Var.b())) {
                    break;
                } else {
                    uVar.f.setItemAnimator(uVar.n);
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
                in0 in0Var = (in0) this.e;
                if (b10 >= in0Var.v && c1Var.b() < in0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                s61 s61Var = (s61) this.e;
                if (s61Var.c3 && s61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (s61Var.X2.o == 0) {
                        if (!s61Var.b3) {
                            i10 = 12;
                        }
                    } else if (!s61Var.b3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((l.d) ((w81) this.e).y).H(c1Var.b())) {
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
                return ((u) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((in0) this.e).I.g();
            case 4:
                s61 s61Var = (s61) this.e;
                return s61Var.c3 && s61Var.e3;
            case 6:
                return true;
        }
    }

    @Override // s4.v
    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                s61 s61Var = (s61) this.e;
                if (i10 != 2 || z10 || !s61Var.B1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        s61Var.F1(c1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((w81) this.e).invalidate();
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
                m mVar = ((u) this.e).v;
                if (!mVar.L(c1Var.b()) || !mVar.L(c1Var2.b())) {
                    return false;
                }
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ArrayList arrayList2 = mVar.n;
                d9 d9Var = mVar.e;
                if (d9Var != null && b10 >= 0 && b10 < d9Var.i.size() && b11 >= 0 && b11 < mVar.e.i.size()) {
                    if (mVar.e instanceof t8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < mVar.e.i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mVar.e.i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(mVar.e.g);
                    }
                    if (!mVar.r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        mVar.r = true;
                    }
                    MessageObject messageObject = (MessageObject) mVar.e.i.get(b10);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    mVar.e.C(arrayList, false);
                    mVar.p(b10, b11);
                }
                return true;
            case 1:
                if (c1Var.f == c1Var2.f) {
                    View view = c1Var2.a;
                    if (!(view instanceof oa) || ((oa) view).G) {
                        gp gpVar = ((hp) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        hp hpVar = gpVar.c;
                        ip ipVar = hpVar.a3;
                        ArrayList arrayList3 = ipVar.N;
                        if (i14 >= ipVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            hpVar.Y2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        gpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        gpVar.n(b12, 3);
                        gpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f != c1Var2.f) {
                    return false;
                }
                sn snVar = ((un) this.e).r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                un unVar = snVar.d;
                int i16 = unVar.t0;
                qh.f fVar = unVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = unVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = unVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = unVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    snVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                in0 in0Var = (in0) this.e;
                ArrayList arrayList4 = in0Var.e;
                if (b17 < in0Var.v || c1Var2.b() >= in0Var.w) {
                    return false;
                }
                int b18 = c1Var.b();
                int b19 = c1Var2.b();
                int i19 = in0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - in0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(in0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                in0Var.c.p(b18, b19);
                return false;
            case 4:
                s61 s61Var = (s61) this.e;
                k61 k61Var = s61Var.Y2;
                if (k61Var.H(c1Var.b()) < 0 || k61Var.H(c1Var.b()) != k61Var.H(c1Var2.b())) {
                    return false;
                }
                int b20 = c1Var.b();
                int b21 = c1Var2.b();
                ArrayList arrayList5 = k61Var.x;
                if (k61Var.L != null) {
                    int H = k61Var.H(b20);
                    int H2 = k61Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = k61Var.J(b20);
                        boolean J2 = k61Var.J(b21);
                        arrayList5.add(b21, (w51) arrayList5.remove(b20));
                        k61Var.p(b20, b21);
                        if (k61Var.J(b21) != J) {
                            k61Var.n(b21, 3);
                        }
                        if (k61Var.J(b20) != J2) {
                            k61Var.n(b20, 3);
                        }
                        if (k61Var.K && (i11 = k61Var.J) != H) {
                            k61Var.F(i11);
                        }
                        k61Var.K = true;
                        k61Var.J = H;
                    }
                }
                s61Var.I1();
                return true;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                w81 w81Var = (w81) this.e;
                ArrayList arrayList6 = w81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l.d) w81Var.y).H(b22) && ((l.d) w81Var.y).H(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    w81Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((t81) obj).a));
                    }
                    o81 o81Var = ((x81) ((l.d) w81Var.y).a).L;
                    z11 = true;
                    z11 = true;
                    if (o81Var != null) {
                        o81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f != c1Var2.f || !r(c1Var.b()) || !r(c1Var2.b())) {
                    return false;
                }
                yv0 yv0Var = ((aw0) this.e).b;
                int b24 = c1Var.b();
                int b25 = c1Var2.b();
                aw0 aw0Var = yv0Var.d;
                int i23 = aw0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = aw0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = aw0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = aw0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = aw0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    yv0Var.p(b24, b25);
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
                u uVar = (u) this.e;
                j jVar = uVar.f;
                if (c1Var != null) {
                    jVar.e1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.n;
                    d9 d9Var = mVar.e;
                    if (d9Var != null && mVar.r) {
                        if (d9Var instanceof t8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = d9Var.g;
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
                            mVar.e.C(arrayList, true);
                        }
                        mVar.r = false;
                    }
                    jVar.setItemAnimator(null);
                    break;
                } else {
                    jVar.J0(false);
                    if (c1Var != null) {
                        c1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                hp hpVar = (hp) this.e;
                ip ipVar = hpVar.a3;
                if (i10 != 0) {
                    ipVar.L = true;
                    hpVar.J0(false);
                    c1Var.a.setPressed(true);
                    break;
                } else {
                    ipVar.L = false;
                    if (hpVar.Y2) {
                        TLRPC.Chat chat = ipVar.X;
                        ArrayList arrayList3 = ipVar.N;
                        ArrayList arrayList4 = ipVar.M;
                        if (chat != null) {
                            hpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = ipVar.X;
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
                            ipVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new t7(10));
                            ipVar.X.usernames.clear();
                            ipVar.X.usernames.addAll(arrayList4);
                            ipVar.X.usernames.addAll(arrayList3);
                            ipVar.getMessagesController().putChat(ipVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                un unVar = (un) this.e;
                fc1 fc1Var = unVar.s;
                if (i10 != 0) {
                    fc1Var.setItemAnimator(unVar.v);
                    fc1Var.J0(false);
                    c1Var.a.setPressed(true);
                    c1Var.a.setBackgroundColor(j6.v0(j6.h5, unVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((in0) this.e).b.J0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                s61 s61Var = (s61) this.e;
                if (c1Var != null) {
                    s61Var.e1(false);
                }
                if (i10 == 0) {
                    k61 k61Var = s61Var.Y2;
                    if (k61Var.K) {
                        k61Var.F(k61Var.J);
                    }
                    if (s61Var.d3 != null) {
                        s61Var.E1();
                        s61Var.d3 = null;
                        break;
                    }
                } else {
                    s61Var.J0(false);
                    if (c1Var != null) {
                        View view = c1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof a2) {
                            a2 a2Var = (a2) view.getBackground();
                            if (!a2Var.c) {
                                a2Var.c = true;
                                a2Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            s61Var.d3 = c1Var;
                            s61Var.H1(c1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((aw0) this.e).c.J0(false);
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
        aw0 aw0Var = (aw0) this.e;
        return !aw0Var.I || i10 - aw0Var.n0 >= aw0Var.x;
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
