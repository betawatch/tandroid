package kh;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.c0;
import f2.o1;
import java.util.ArrayList;
import jh.b6;
import jh.j6;
import jh.m5;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.ka;
import org.telegram.ui.ta1;
import org.telegram.ui.vo;
import org.telegram.ui.wo;
import org.telegram.ui.wu0;
import org.telegram.ui.xo;
import org.telegram.ui.yu0;
import rh.u1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g extends c0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override // f2.c0
    public void a(RecyclerView recyclerView, o1 o1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, o1Var);
                o1Var.a.setPressed(false);
                break;
            case 1:
                super.a(recyclerView, o1Var);
                o1Var.a.setPressed(false);
                break;
            case 2:
                super.a(recyclerView, o1Var);
                View view = o1Var.a;
                view.setPressed(false);
                view.setBackground(null);
                break;
            case 3:
                super.a(recyclerView, o1Var);
                o1Var.a.setPressed(false);
                break;
            case 4:
                k51 k51Var = (k51) this.e;
                super.a(recyclerView, o1Var);
                View view2 = o1Var.a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof u1) {
                    u1 u1Var = (u1) view2.getBackground();
                    if (u1Var.c) {
                        u1Var.c = false;
                        u1Var.invalidateSelf();
                    }
                }
                if (k51Var.A1()) {
                    k51Var.F1(o1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(er.h).start();
                    break;
                }
                break;
            case 5:
            default:
                super.a(recyclerView, o1Var);
                break;
            case 6:
                super.a(recyclerView, o1Var);
                o1Var.a.setPressed(false);
                break;
        }
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, o1 o1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                if (!rVar.S.C.y1 || !rVar.v.L(o1Var.b())) {
                    break;
                } else {
                    rVar.f.setItemAnimator(rVar.n);
                    break;
                }
            case 1:
                if (o1Var.f != 1 || !((ka) o1Var.a).C) {
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (o1Var.f == 5) {
                    break;
                } else {
                    break;
                }
            case 3:
                int b10 = o1Var.b();
                jm0 jm0Var = (jm0) this.e;
                if (b10 >= jm0Var.v && o1Var.b() < jm0Var.w) {
                    break;
                } else {
                    break;
                }
                break;
            case 4:
                k51 k51Var = (k51) this.e;
                if (k51Var.Y2 && k51Var.U2.H(o1Var.b()) >= 0) {
                    int i10 = 15;
                    if (k51Var.T2.o == 0) {
                        if (!k51Var.X2) {
                            i10 = 12;
                        }
                    } else if (!k51Var.X2) {
                        i10 = 3;
                    }
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                if (!((m5.o) ((o71) this.e).y).q(o1Var.b())) {
                    break;
                } else {
                    break;
                }
            default:
                if (o1Var.f != 5 || !r(o1Var.b())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return c0.l(0, 0);
    }

    @Override // f2.c0
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((r) this.e).S.C.y1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((jm0) this.e).E.f();
            case 4:
                k51 k51Var = (k51) this.e;
                return k51Var.Y2 && k51Var.a3;
            case 6:
                return true;
        }
    }

    @Override // f2.c0
    public void m(Canvas canvas, RecyclerView recyclerView, o1 o1Var, float f10, float f11, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                k51 k51Var = (k51) this.e;
                if (i10 != 2 || z10 || !k51Var.A1()) {
                    super.m(canvas, recyclerView, o1Var, f10, f11, i10, z10);
                    if (i10 == 2 && z10) {
                        k51Var.E1(o1Var);
                        break;
                    }
                }
                break;
            case 5:
                super.m(canvas, recyclerView, o1Var, f10, f11, i10, z10);
                ((o71) this.e).invalidate();
                break;
            default:
                super.m(canvas, recyclerView, o1Var, f10, f11, i10, z10);
                break;
        }
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, o1 o1Var, o1 o1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                m mVar = ((r) this.e).v;
                if (!mVar.L(o1Var.b()) || !mVar.L(o1Var2.b())) {
                    return false;
                }
                int b10 = o1Var.b();
                int b11 = o1Var2.b();
                ArrayList arrayList2 = mVar.n;
                j6 j6Var = mVar.e;
                if (j6Var != null && b10 >= 0 && b10 < j6Var.i.size() && b11 >= 0 && b11 < mVar.e.i.size()) {
                    if (mVar.e instanceof b6) {
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
                if (o1Var.f == o1Var2.f) {
                    View view = o1Var2.a;
                    if (!(view instanceof ka) || ((ka) view).C) {
                        vo voVar = ((wo) this.e).T2;
                        int b12 = o1Var.b();
                        int b13 = o1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        wo woVar = voVar.c;
                        xo xoVar = woVar.W2;
                        ArrayList arrayList3 = xoVar.J;
                        if (i14 >= xoVar.J.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            woVar.U2 = true;
                        }
                        TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList3.get(i14);
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, tL_username);
                        voVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        voVar.n(b12, 3);
                        voVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (o1Var.f != o1Var2.f) {
                    return false;
                }
                gn gnVar = ((in) this.e).r;
                int b14 = o1Var.b();
                int b15 = o1Var2.b();
                in inVar = gnVar.d;
                int i16 = inVar.p0;
                zg.f fVar = inVar.h1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = inVar.I) && i18 < i10) {
                    zg.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = inVar.G;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = inVar.H;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    gnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = o1Var2.b();
                jm0 jm0Var = (jm0) this.e;
                ArrayList arrayList4 = jm0Var.e;
                if (b17 < jm0Var.v || o1Var2.b() >= jm0Var.w) {
                    return false;
                }
                int b18 = o1Var.b();
                int b19 = o1Var2.b();
                int i19 = jm0Var.v;
                int i20 = b18 - i19;
                int i21 = b19 - i19;
                arrayList4.indexOf(Integer.valueOf(i20));
                arrayList4.get(b18 - jm0Var.v);
                MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i21);
                arrayList4.set(i20, messageObject3);
                arrayList4.set(i21, messageObject2);
                DownloadController.getInstance(jm0Var.d).swapLoadingPriority(messageObject2, messageObject3);
                jm0Var.c.p(b18, b19);
                return false;
            case 4:
                k51 k51Var = (k51) this.e;
                b51 b51Var = k51Var.U2;
                if (b51Var.H(o1Var.b()) < 0 || b51Var.H(o1Var.b()) != b51Var.H(o1Var2.b())) {
                    return false;
                }
                int b20 = o1Var.b();
                int b21 = o1Var2.b();
                ArrayList arrayList5 = b51Var.x;
                if (b51Var.H != null) {
                    int H = b51Var.H(b20);
                    int H2 = b51Var.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = b51Var.J(b20);
                        boolean J2 = b51Var.J(b21);
                        arrayList5.add(b21, (n41) arrayList5.remove(b20));
                        b51Var.p(b20, b21);
                        if (b51Var.J(b21) != J) {
                            b51Var.n(b21, 3);
                        }
                        if (b51Var.J(b20) != J2) {
                            b51Var.n(b20, 3);
                        }
                        if (b51Var.G && (i11 = b51Var.F) != H) {
                            b51Var.F(i11);
                        }
                        b51Var.G = true;
                        b51Var.F = H;
                    }
                }
                k51Var.H1();
                return true;
            case 5:
                int b22 = o1Var.b();
                int b23 = o1Var2.b();
                o71 o71Var = (o71) this.e;
                ArrayList arrayList6 = o71Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((m5.o) o71Var.y).q(b22) && ((m5.o) o71Var.y).q(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    o71Var.x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((l71) obj).a));
                    }
                    g71 g71Var = ((p71) ((m5.o) o71Var.y).b).H;
                    z11 = true;
                    z11 = true;
                    if (g71Var != null) {
                        g71Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (o1Var.f != o1Var2.f || !r(o1Var.b()) || !r(o1Var2.b())) {
                    return false;
                }
                wu0 wu0Var = ((yu0) this.e).b;
                int b24 = o1Var.b();
                int b25 = o1Var2.b();
                yu0 yu0Var = wu0Var.d;
                int i23 = yu0Var.j0;
                int i24 = b24 - i23;
                int i25 = b25 - i23;
                if (i24 >= 0 && i25 >= 0 && i24 < (i12 = yu0Var.y) && i25 < i12) {
                    CharSequence[] charSequenceArr2 = yu0Var.v;
                    CharSequence charSequence2 = charSequenceArr2[i24];
                    charSequenceArr2[i24] = charSequenceArr2[i25];
                    charSequenceArr2[i25] = charSequence2;
                    int[] iArr = yu0Var.r;
                    if (iArr != null) {
                        int i26 = iArr[i24];
                        iArr[i24] = iArr[i25];
                        iArr[i25] = i26;
                    }
                    boolean[] zArr2 = yu0Var.w;
                    boolean z12 = zArr2[i24];
                    zArr2[i24] = zArr2[i25];
                    zArr2[i25] = z12;
                    wu0Var.p(b24, b25);
                }
                return true;
        }
    }

    @Override // f2.c0
    public void o(RecyclerView recyclerView, o1 o1Var, o1 o1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                break;
            default:
                super.o(recyclerView, o1Var, o1Var2, i10, i11, i12);
                break;
        }
    }

    @Override // f2.c0
    public void p(o1 o1Var, int i10) {
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                j jVar = rVar.f;
                if (o1Var != null) {
                    jVar.d1(false);
                }
                if (i10 == 0) {
                    m mVar = rVar.v;
                    ArrayList arrayList2 = mVar.n;
                    j6 j6Var = mVar.e;
                    if (j6Var != null && mVar.r) {
                        if (j6Var instanceof b6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.e.i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.e.i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = j6Var.g;
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
                    if (o1Var != null) {
                        o1Var.a.setPressed(true);
                        break;
                    }
                }
                break;
            case 1:
                wo woVar = (wo) this.e;
                xo xoVar = woVar.W2;
                if (i10 != 0) {
                    xoVar.H = true;
                    woVar.I0(false);
                    o1Var.a.setPressed(true);
                    break;
                } else {
                    xoVar.H = false;
                    if (woVar.U2) {
                        TLRPC.Chat chat = xoVar.T;
                        ArrayList arrayList3 = xoVar.J;
                        ArrayList arrayList4 = xoVar.I;
                        if (chat != null) {
                            woVar.U2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = xoVar.T;
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
                            xoVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new m5(7));
                            xoVar.T.usernames.clear();
                            xoVar.T.usernames.addAll(arrayList4);
                            xoVar.T.usernames.addAll(arrayList3);
                            xoVar.getMessagesController().putChat(xoVar.T, true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                in inVar = (in) this.e;
                ta1 ta1Var = inVar.s;
                if (i10 != 0) {
                    ta1Var.setItemAnimator(inVar.v);
                    ta1Var.I0(false);
                    o1Var.a.setPressed(true);
                    o1Var.a.setBackgroundColor(g6.v0(g6.h5, inVar.a));
                    break;
                }
                break;
            case 3:
                if (i10 != 0) {
                    ((jm0) this.e).b.I0(false);
                    o1Var.a.setPressed(true);
                    break;
                }
                break;
            case 4:
                k51 k51Var = (k51) this.e;
                if (o1Var != null) {
                    k51Var.d1(false);
                }
                if (i10 == 0) {
                    b51 b51Var = k51Var.U2;
                    if (b51Var.G) {
                        b51Var.F(b51Var.F);
                    }
                    if (k51Var.Z2 != null) {
                        k51Var.D1();
                        k51Var.Z2 = null;
                        break;
                    }
                } else {
                    k51Var.I0(false);
                    if (o1Var != null) {
                        View view = o1Var.a;
                        view.setPressed(true);
                        if (view.getBackground() instanceof u1) {
                            u1 u1Var = (u1) view.getBackground();
                            if (!u1Var.c) {
                                u1Var.c = true;
                                u1Var.invalidateSelf();
                            }
                        }
                        if (i10 == 2) {
                            k51Var.Z2 = o1Var;
                            k51Var.G1(o1Var);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 != 0) {
                    ((yu0) this.e).c.I0(false);
                    o1Var.a.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // f2.c0
    public final void q(o1 o1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        yu0 yu0Var = (yu0) this.e;
        return !yu0Var.E || i10 - yu0Var.j0 >= yu0Var.x;
    }

    private final void t(o1 o1Var) {
    }

    private final void u(o1 o1Var) {
    }

    private final void v(o1 o1Var) {
    }

    private final void w(o1 o1Var) {
    }

    private final void x(o1 o1Var) {
    }

    private final void y(o1 o1Var) {
    }

    private final void z(o1 o1Var) {
    }

    private final void s(RecyclerView recyclerView, o1 o1Var, o1 o1Var2, int i10, int i11, int i12) {
    }
}
