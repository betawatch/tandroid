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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.na;
import org.telegram.ui.rv0;
import org.telegram.ui.tv0;
import org.telegram.ui.wb1;
import s4.c1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                d61 d61Var = (d61) this.e;
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
                if (d61Var.A1()) {
                    d61Var.F1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(rr.h).start();
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
                if (c1Var.f != 1 || !((na) c1Var.a).G) {
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
                wm0 wm0Var = (wm0) this.e;
                if (b10 >= wm0Var.v && c1Var.b() < wm0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                d61 d61Var = (d61) this.e;
                if (d61Var.c3 && d61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (d61Var.X2.o == 0) {
                        if (!d61Var.b3) {
                            i10 = 12;
                        }
                    } else if (!d61Var.b3) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((ka.c) ((g81) this.e).y).d(c1Var.b())) {
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
                return ((wm0) this.e).I.g();
            case 4:
                d61 d61Var = (d61) this.e;
                return d61Var.c3 && d61Var.e3;
            case 6:
                return true;
        }
    }

    @Override // s4.v
    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                d61 d61Var = (d61) this.e;
                if (i10 != 2 || z10 || !d61Var.A1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        d61Var.E1(c1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((g81) this.e).invalidate();
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
                    if (!(view instanceof na) || ((na) view).G) {
                        ep epVar = ((fp) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        fp fpVar = epVar.c;
                        gp gpVar = fpVar.a3;
                        ArrayList arrayList3 = gpVar.N;
                        if (i14 >= gpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            fpVar.Y2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        epVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        epVar.n(b12, 3);
                        epVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f != c1Var2.f) {
                    return false;
                }
                tn tnVar = ((vn) this.e).r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                vn vnVar = tnVar.d;
                int i16 = vnVar.t0;
                qh.f fVar = vnVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = vnVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = vnVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = vnVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    tnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                wm0 wm0Var = (wm0) this.e;
                ArrayList arrayList4 = wm0Var.e;
                if (b17 < wm0Var.v || c1Var2.b() >= wm0Var.w) {
                    return false;
                }
                int b18 = c1Var.b();
                int b19 = c1Var2.b();
                int i19 = wm0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - wm0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(wm0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                wm0Var.c.p(b18, b19);
                return false;
            case 4:
                d61 d61Var = (d61) this.e;
                v51 v51Var = d61Var.Y2;
                if (v51Var.H(c1Var.b()) < 0 || v51Var.H(c1Var.b()) != v51Var.H(c1Var2.b())) {
                    return false;
                }
                int b20 = c1Var.b();
                int b21 = c1Var2.b();
                ArrayList arrayList5 = v51Var.x;
                if (v51Var.L != null) {
                    int H = v51Var.H(b20);
                    int H2 = v51Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = v51Var.J(b20);
                        boolean J2 = v51Var.J(b21);
                        arrayList5.add(b21, (h51) arrayList5.remove(b20));
                        v51Var.p(b20, b21);
                        if (v51Var.J(b21) != J) {
                            v51Var.n(b21, 3);
                        }
                        if (v51Var.J(b20) != J2) {
                            v51Var.n(b20, 3);
                        }
                        if (v51Var.K && (i11 = v51Var.J) != H) {
                            v51Var.F(i11);
                        }
                        v51Var.K = true;
                        v51Var.J = H;
                    }
                }
                d61Var.H1();
                return true;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                g81 g81Var = (g81) this.e;
                ArrayList arrayList6 = g81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((ka.c) g81Var.y).d(b22) && ((ka.c) g81Var.y).d(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    g81Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((d81) obj).a));
                    }
                    z71 z71Var = ((h81) ((ka.c) g81Var.y).b).L;
                    z11 = true;
                    z11 = true;
                    if (z71Var != null) {
                        z71Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f != c1Var2.f || !r(c1Var.b()) || !r(c1Var2.b())) {
                    return false;
                }
                rv0 rv0Var = ((tv0) this.e).b;
                int b24 = c1Var.b();
                int b25 = c1Var2.b();
                tv0 tv0Var = rv0Var.d;
                int i23 = tv0Var.n0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = tv0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = tv0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = tv0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = tv0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    rv0Var.p(b24, b25);
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
                    jVar.I0(false);
                    if (c1Var != null) {
                        c1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                fp fpVar = (fp) this.e;
                gp gpVar = fpVar.a3;
                if (i10 != 0) {
                    gpVar.L = true;
                    fpVar.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                } else {
                    gpVar.L = false;
                    if (fpVar.Y2) {
                        TLRPC.Chat chat = gpVar.X;
                        ArrayList arrayList3 = gpVar.N;
                        ArrayList arrayList4 = gpVar.M;
                        if (chat != null) {
                            fpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = gpVar.X;
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
                            gpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u7(10));
                            gpVar.X.usernames.clear();
                            gpVar.X.usernames.addAll(arrayList4);
                            gpVar.X.usernames.addAll(arrayList3);
                            gpVar.getMessagesController().putChat(gpVar.X, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                vn vnVar = (vn) this.e;
                wb1 wb1Var = vnVar.s;
                if (i10 != 0) {
                    wb1Var.setItemAnimator(vnVar.v);
                    wb1Var.I0(false);
                    c1Var.a.setPressed(true);
                    c1Var.a.setBackgroundColor(h6.v0(h6.h5, vnVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((wm0) this.e).b.I0(false);
                    c1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                d61 d61Var = (d61) this.e;
                if (c1Var != null) {
                    d61Var.d1(false);
                }
                if (i10 == 0) {
                    v51 v51Var = d61Var.Y2;
                    if (v51Var.K) {
                        v51Var.F(v51Var.J);
                    }
                    if (d61Var.d3 != null) {
                        d61Var.D1();
                        d61Var.d3 = null;
                        break;
                    }
                } else {
                    d61Var.I0(false);
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
                            d61Var.d3 = c1Var;
                            d61Var.G1(c1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((tv0) this.e).c.I0(false);
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
        tv0 tv0Var = (tv0) this.e;
        return !tv0Var.I || i10 - tv0Var.n0 >= tv0Var.x;
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
