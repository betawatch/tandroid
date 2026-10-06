package bi;

import ai.d9;
import ai.u7;
import ai.u8;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ii.b2;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.y81;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.hp;
import org.telegram.ui.pa;
import org.telegram.ui.sv0;
import org.telegram.ui.uv0;
import org.telegram.ui.xb1;
import s4.c1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                e71 e71Var = (e71) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof b2) {
                    b2 b2Var = (b2) view2.getBackground();
                    if (b2Var.c) {
                        b2Var.c = false;
                        b2Var.invalidateSelf();
                    }
                }
                if (e71Var.B1()) {
                    e71Var.G1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(tr.h).start();
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
                if (c1Var.f != 1 || !((pa) c1Var.a).G) {
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
                on0 on0Var = (on0) this.e;
                if (b10 >= on0Var.v && c1Var.b() < on0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                e71 e71Var = (e71) this.e;
                if (e71Var.j3 && e71Var.f3.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (e71Var.e3.o == 0) {
                        if (!e71Var.i3) {
                            i10 = 12;
                        }
                    } else if (!e71Var.i3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((n2.c) ((g91) this.e).y).b(c1Var.b())) {
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
                return ((on0) this.e).I.g();
            case 4:
                e71 e71Var = (e71) this.e;
                return e71Var.j3 && e71Var.l3;
            case 6:
                return true;
        }
    }

    @Override // s4.v
    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                e71 e71Var = (e71) this.e;
                if (i10 != 2 || z10 || !e71Var.B1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        e71Var.F1(c1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((g91) this.e).invalidate();
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
                    if (mVar.e instanceof u8) {
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
                    if (!(view instanceof pa) || ((pa) view).G) {
                        fp fpVar = ((gp) this.e).e3;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        gp gpVar = fpVar.c;
                        hp hpVar = gpVar.h3;
                        ArrayList arrayList3 = hpVar.O;
                        if (i14 >= hpVar.O.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            gpVar.f3 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        fpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        fpVar.n(b12, 3);
                        fpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f != c1Var2.f) {
                    return false;
                }
                vn vnVar = ((xn) this.e).r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                xn xnVar = vnVar.d;
                int i16 = xnVar.t0;
                qh.f fVar = xnVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = xnVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = xnVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = xnVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    vnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                on0 on0Var = (on0) this.e;
                ArrayList arrayList4 = on0Var.e;
                if (b17 < on0Var.v || c1Var2.b() >= on0Var.w) {
                    return false;
                }
                int b18 = c1Var.b();
                int b19 = c1Var2.b();
                int i19 = on0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - on0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(on0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                on0Var.c.p(b18, b19);
                return false;
            case 4:
                e71 e71Var = (e71) this.e;
                w61 w61Var = e71Var.f3;
                if (w61Var.H(c1Var.b()) < 0 || w61Var.H(c1Var.b()) != w61Var.H(c1Var2.b())) {
                    return false;
                }
                int b20 = c1Var.b();
                int b21 = c1Var2.b();
                ArrayList arrayList5 = w61Var.x;
                if (w61Var.L != null) {
                    int H = w61Var.H(b20);
                    int H2 = w61Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = w61Var.J(b20);
                        boolean J2 = w61Var.J(b21);
                        arrayList5.add(b21, (h61) arrayList5.remove(b20));
                        w61Var.p(b20, b21);
                        if (w61Var.J(b21) != J) {
                            w61Var.n(b21, 3);
                        }
                        if (w61Var.J(b20) != J2) {
                            w61Var.n(b20, 3);
                        }
                        if (w61Var.K && (i11 = w61Var.J) != H) {
                            w61Var.F(i11);
                        }
                        w61Var.K = true;
                        w61Var.J = H;
                    }
                }
                e71Var.I1();
                return true;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                g91 g91Var = (g91) this.e;
                ArrayList arrayList6 = g91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((n2.c) g91Var.y).b(b22) && ((n2.c) g91Var.y).b(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    g91Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((d91) obj).a));
                    }
                    y81 y81Var = ((h91) ((n2.c) g91Var.y).b).L;
                    z11 = true;
                    z11 = true;
                    if (y81Var != null) {
                        y81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f != c1Var2.f || !r(c1Var.b()) || !r(c1Var2.b())) {
                    return false;
                }
                sv0 sv0Var = ((uv0) this.e).b;
                int b24 = c1Var.b();
                int b25 = c1Var2.b();
                uv0 uv0Var = sv0Var.d;
                int i23 = uv0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = uv0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = uv0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = uv0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = uv0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    sv0Var.p(b24, b25);
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
                    jVar.d1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.n;
                    d9 d9Var = mVar.e;
                    if (d9Var != null && mVar.r) {
                        if (d9Var instanceof u8) {
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
                gp gpVar = (gp) this.e;
                hp hpVar = gpVar.h3;
                if (i10 != 0) {
                    hpVar.M = true;
                    gpVar.J0(false);
                    c1Var.a.setPressed(true);
                    break;
                } else {
                    hpVar.M = false;
                    if (gpVar.f3) {
                        TLRPC.Chat chat = hpVar.Y;
                        ArrayList arrayList3 = hpVar.O;
                        ArrayList arrayList4 = hpVar.N;
                        if (chat != null) {
                            gpVar.f3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = hpVar.Y;
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
                            hpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u7(10));
                            hpVar.Y.usernames.clear();
                            hpVar.Y.usernames.addAll(arrayList4);
                            hpVar.Y.usernames.addAll(arrayList3);
                            hpVar.getMessagesController().putChat(hpVar.Y, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                xn xnVar = (xn) this.e;
                xb1 xb1Var = xnVar.s;
                if (i10 != 0) {
                    xb1Var.setItemAnimator(xnVar.v);
                    xb1Var.J0(false);
                    c1Var.a.setPressed(true);
                    c1Var.a.setBackgroundColor(i6.v0(i6.h5, xnVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((on0) this.e).b.J0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                e71 e71Var = (e71) this.e;
                if (c1Var != null) {
                    e71Var.d1(false);
                }
                if (i10 == 0) {
                    w61 w61Var = e71Var.f3;
                    if (w61Var.K) {
                        w61Var.F(w61Var.J);
                    }
                    if (e71Var.k3 != null) {
                        e71Var.E1();
                        e71Var.k3 = null;
                        break;
                    }
                } else {
                    e71Var.J0(false);
                    if (c1Var != null) {
                        View view = c1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof b2) {
                            b2 b2Var = (b2) view.getBackground();
                            if (!b2Var.c) {
                                b2Var.c = true;
                                b2Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            e71Var.k3 = c1Var;
                            e71Var.H1(c1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((uv0) this.e).c.J0(false);
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
        uv0 uv0Var = (uv0) this.e;
        return !uv0Var.I || i10 - uv0Var.n0 >= uv0Var.x;
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
