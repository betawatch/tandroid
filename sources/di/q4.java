package di;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.cd;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.h9;
import fi.ja;
import fi.la;
import fi.va;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements g7, j9, xh.j, r0.m, OnSuccessListener, w10, dj0, org.telegram.ui.ActionBar.r1, qi0, a20, sg.l1, CameraController.VideoTakeCallback, ft0, h9.h1, f3.g, h2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        p9 p9Var = (p9) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p9Var.w.getLayoutParams();
        marginLayoutParams.topMargin = p9Var.c ? 0 : k1Var.d();
        marginLayoutParams.bottomMargin = p9Var.c ? k1Var.a.f(2).d : k1Var.a();
        marginLayoutParams.leftMargin = I0.a;
        marginLayoutParams.rightMargin = I0.c;
        d9 d9Var = p9Var.s;
        if (d9Var != null) {
            d9Var.requestLayout();
        }
        e9 e9Var = p9Var.w;
        if (e9Var != null) {
            e9Var.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // di.g7
    public void b(boolean z9) {
        j5 j5Var = (j5) this.b;
        if (j5Var != null) {
            j5Var.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // org.telegram.ui.Components.dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i7, View view) {
        gf gfVar;
        switch (this.a) {
            case 7:
                sp0 sp0Var = ((ei.n) this.b).W;
                if (!sp0Var.G.E1 && (view instanceof org.telegram.ui.Cells.o7)) {
                    ij messageObject = ((org.telegram.ui.Cells.o7) view).getMessageObject();
                    if (!sp0Var.c(messageObject)) {
                        sp0Var.e(messageObject);
                        break;
                    } else {
                        sp0Var.g(messageObject);
                        break;
                    }
                }
                break;
            default:
                fi.f3 f3Var = (fi.f3) this.b;
                ArrayList arrayList = f3Var.b0;
                ArrayList arrayList2 = f3Var.h0;
                if (i7 >= 2 && f3Var.W != null && (view instanceof fi.b3)) {
                    int i10 = i7 - 2;
                    if (!f3Var.c0) {
                        if (f3Var.d0) {
                            if (i10 < 0 || i10 >= arrayList.size()) {
                                i10 -= arrayList.size();
                            }
                        }
                        if (i10 >= 0) {
                            gfVar = (gf) f3Var.f0.get(i10);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(gfVar)) {
                                }
                                org.telegram.messenger.g0.b4(f3Var.d);
                                f3Var.j();
                            }
                        }
                    } else if (i10 != 0) {
                        i10 = i7 - 3;
                        if (i10 >= 0 && i10 < f3Var.f0.size()) {
                            gfVar = (gf) f3Var.f0.get(i10);
                            if (arrayList2.isEmpty() && !f3Var.Q) {
                                if (!arrayList2.contains(gfVar)) {
                                    arrayList2.remove(gfVar);
                                } else if (arrayList2.size() + 1 > f3Var.R) {
                                    int i11 = -f3Var.N;
                                    f3Var.N = i11;
                                    org.telegram.messenger.g0.G3(i11, view, null);
                                    org.telegram.messenger.p2.D.a();
                                    break;
                                } else {
                                    arrayList2.add(gfVar);
                                }
                                org.telegram.messenger.g0.b4(f3Var.d);
                                f3Var.j();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        sp0 sp0Var = (sp0) this.b;
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        new ei.q(sp0Var.a, hd.M0(2131746692, null), new ai.i(sp0Var, 15)).show();
        return Boolean.TRUE;
    }

    @Override // org.telegram.ui.Components.qi0
    public void e() {
        ((fi.m1) this.b).invalidate();
    }

    @Override // sg.l1
    public void f() {
        fi.x9 x9Var = (fi.x9) this.b;
        TextView textView = x9Var.X0;
        boolean a10 = x9Var.m0.a();
        ImageView imageView = x9Var.W0;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        switch (this.a) {
            case 9:
                va vaVar = ((la) ((fi.r) this.b)).R1;
                ja jaVar = vaVar.X0;
                if (jaVar != null) {
                    jaVar.s(null, null, true);
                }
                fi.x9 x9Var = vaVar.v1;
                if (x9Var != null) {
                    x9Var.n0();
                }
                la laVar = vaVar.c1;
                if (laVar != null) {
                    laVar.setHasRoundVideo(false);
                }
                fi.e7 e7Var = vaVar.K1;
                if (e7Var != null) {
                    File file = e7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        vaVar.K1.o0 = null;
                    }
                    if (vaVar.K1.p0 != null) {
                        try {
                            new File(vaVar.K1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        vaVar.K1.p0 = null;
                        break;
                    }
                }
                break;
            case 14:
                ((fi.h5) this.b).a.Y1.r();
                break;
            case 19:
                ((hi.d) this.b).run();
                break;
            case 20:
                hi.j jVar = (hi.j) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = jVar.getMessagesController().o1(jVar.R);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, jVar.getParentActivity(), null);
                u1Var2.r(150L);
                jVar.getConnectionsManager().sendRequest(updatestarrefprogram, new hi.b(jVar, u1Var2, 0));
                break;
            default:
                kg.q1 q1Var = (kg.q1) ((bi.s) this.b).b;
                i10 = ((org.telegram.ui.ActionBar.f2) q1Var).currentAccount;
                kg.t1 f10 = kg.t1.f(i10);
                ArrayList arrayList = q1Var.b;
                int i11 = f10.a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        kg.s1 c10 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.b.remove(c10);
                        f10.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new u5(6));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull b22 = qp.s1(i11).b2(p10.i(i11).e());
                            if (b22 != null) {
                                b22.flags2 &= -5;
                                b22.business_greeting_message = null;
                                yr.a0(i11).j2(b22, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull b23 = qp.s1(i11).b2(p10.i(i11).e());
                            if (b23 != null) {
                                b23.flags2 &= -9;
                                b23.business_away_message = null;
                                yr.a0(i11).j2(b23, true);
                            }
                        }
                    }
                    f10.l();
                    yr a02 = yr.a0(i11);
                    a02.a.c(new fi.x0(a02, arrayList, 2));
                    qs.f(i11).k(qs.F1, new Object[0]);
                }
                kg.q1.c0(q1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ft0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 12:
                fi.o9 o9Var = (fi.o9) this.b;
                x31 x31Var = (x31) obj;
                int i12 = x31Var.d;
                fi.e7 e7Var = (fi.e7) x31Var.G;
                o9Var.c(false, true);
                va vaVar = o9Var.O;
                if (e7Var != vaVar.K1 && !vaVar.X1) {
                    vaVar.d1.setSelected(i12);
                    vaVar.X1 = true;
                    bg.m0 m0Var = new bg.m0(vaVar, i12, 9);
                    fi.x9 x9Var = vaVar.v1;
                    fi.e7 e7Var2 = vaVar.K1;
                    if (x9Var != null && e7Var2 != null) {
                        if (x9Var.r0()) {
                            e7Var2.f();
                            Utilities.g.c(new fi.x8(vaVar, x9Var, e7Var2.i0, e7Var2.j0, e7Var2, x9Var.x0.getPainting().E, x9Var.r0(), m0Var, 0));
                            break;
                        } else {
                            m0Var.run();
                            break;
                        }
                    } else {
                        m0Var.run();
                        break;
                    }
                }
                break;
            case 21:
                hi.q.a0((hi.q) this.b, (x31) obj);
                break;
            case 22:
                ((hi.p4) this.b).a0((x31) obj);
                break;
            case 24:
                kg.c1 c1Var = (kg.c1) this.b;
                x31 x31Var2 = (x31) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i13 = x31Var2.d;
                if (i13 == -1) {
                    boolean z9 = !c1Var.d;
                    c1Var.d = z9;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                    c1Var.a.f3.O(true);
                    c1Var.d0(true);
                    break;
                } else if (i13 == -2) {
                    kg.w1 w1Var = new kg.w1(null);
                    w1Var.n = c1Var.n;
                    w1Var.c = new ai.f1(25, c1Var, view);
                    c1Var.presentFragment(w1Var);
                    break;
                } else if (x31Var2.a == 5 && i13 >= 0 && i13 < c1Var.f.length) {
                    if (!hd.a0 ? floatValue < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue > org.telegram.messenger.g0.L(76.0f)) {
                        int i14 = (x31Var2.d + 6) % 7;
                        int i15 = 0;
                        for (int i16 = 0; i16 < c1Var.f[i14].size(); i16++) {
                            if (((kg.b1) c1Var.f[i14].get(i16)).b > i15) {
                                i15 = ((kg.b1) c1Var.f[i14].get(i16)).b;
                            }
                        }
                        int max = Math.max(0, i15 - 1439);
                        int i17 = (x31Var2.d + 1) % 7;
                        int i18 = 1440;
                        for (int i19 = 0; i19 < c1Var.f[i17].size(); i19++) {
                            if (((kg.b1) c1Var.f[i17].get(i19)).a < i18) {
                                i18 = ((kg.b1) c1Var.f[i17].get(i19)).a;
                            }
                        }
                        int i20 = i18 + 1439;
                        CharSequence charSequence = x31Var2.l;
                        ArrayList arrayList = c1Var.f[x31Var2.d];
                        int i21 = 0;
                        while (i11 < 7) {
                            ArrayList arrayList2 = c1Var.f[i11];
                            if (arrayList2 != null) {
                                i21 = Math.max(1, arrayList2.size()) + i21;
                            }
                            i11++;
                        }
                        kg.e1 e1Var = new kg.e1(charSequence, arrayList, max, i20, 28 - i21);
                        e1Var.f = new fi.h9(c1Var, 27);
                        e1Var.h = new ha.b(19, c1Var, x31Var2);
                        c1Var.presentFragment(e1Var);
                        break;
                    } else {
                        if (c1Var.f[x31Var2.d].isEmpty()) {
                            ((org.telegram.ui.Cells.h5) view).setChecked(true);
                            c1Var.f[x31Var2.d].add(new kg.b1(0, 1439));
                            c1Var.c0(x31Var2.d);
                        } else {
                            c1Var.f[x31Var2.d].clear();
                            ((org.telegram.ui.Cells.h5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.h5) view).setValue(kg.c1.f0(c1Var.f[x31Var2.d]));
                        c1Var.d0(true);
                        break;
                    }
                }
                break;
            case 25:
                final kg.e1 e1Var2 = (kg.e1) this.b;
                x31 x31Var3 = (x31) obj;
                final View view2 = (View) obj2;
                int i22 = e1Var2.c;
                int i23 = e1Var2.d;
                ArrayList arrayList3 = e1Var2.b;
                int i24 = x31Var3.d;
                if (i24 == -1) {
                    e1Var2.r = !e1Var2.r;
                    arrayList3.clear();
                    if (e1Var2.r) {
                        arrayList3.add(new kg.b1(0, 1439));
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view2;
                    boolean z10 = e1Var2.r;
                    x31Var3.e = z10;
                    r8Var.setChecked(z10);
                    boolean z11 = e1Var2.r;
                    r8Var.b(org.telegram.ui.ActionBar.k6.x0(null, z11 ? org.telegram.ui.ActionBar.k6.f6 : org.telegram.ui.ActionBar.k6.e6, false), z11);
                    e1Var2.n.f3.O(true);
                    fi.h9 h9Var = e1Var2.f;
                    if (h9Var != null) {
                        h9Var.run();
                        break;
                    }
                } else if (i24 == -2) {
                    if (arrayList3.isEmpty() || e1Var2.Z()) {
                        if (e1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j3 = Utilities.j(480, i23 - 1, i22);
                        arrayList3.add(new kg.b1(j3, Utilities.j(1200, i23, j3 + 1)));
                    } else {
                        int i25 = ((kg.b1) jg.g.i(1, arrayList3)).b;
                        int j10 = Utilities.j(i25 + 30, i23 - 1, i22);
                        arrayList3.add(new kg.b1(j10, Utilities.j((i25 + 1560) / 2, i23, j10 + 1)));
                    }
                    fi.h9 h9Var2 = e1Var2.f;
                    if (h9Var2 != null) {
                        h9Var2.run();
                    }
                    e1Var2.n.f3.O(true);
                    break;
                } else if (x31Var3.a == 3 && (i7 = i24 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i26 = i7 - 1;
                    kg.b1 b1Var = i26 >= 0 ? (kg.b1) arrayList3.get(i26) : null;
                    final kg.b1 b1Var2 = (kg.b1) arrayList3.get(i7);
                    int i27 = i7 + 1;
                    kg.b1 b1Var3 = i27 < arrayList3.size() ? (kg.b1) arrayList3.get(i27) : null;
                    int i28 = x31Var3.d % 3;
                    if (i28 == 0) {
                        Activity parentActivity = e1Var2.getParentActivity();
                        String M0 = hd.M0(2131752750, null);
                        int i29 = b1Var2.a;
                        if (b1Var != null) {
                            i22 = b1Var.b + 1;
                        }
                        org.telegram.ui.Components.v4.U(parentActivity, M0, i29, i22, b1Var2.b - 1, new c20() { // from class: kg.d1
                            @Override // org.telegram.messenger.c20
                            public final void a(Object obj3) {
                                Integer num = (Integer) obj3;
                                switch (i11) {
                                    case 0:
                                        e1 e1Var3 = e1Var2;
                                        boolean a02 = e1Var3.a0();
                                        m8 m8Var = (m8) view2;
                                        int intValue = num.intValue();
                                        b1Var2.a = intValue;
                                        m8Var.w(b1.a(intValue), true);
                                        if (a02 != e1Var3.a0()) {
                                            e1Var3.n.f3.O(true);
                                        }
                                        h9 h9Var3 = e1Var3.f;
                                        if (h9Var3 != null) {
                                            h9Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        e1 e1Var4 = e1Var2;
                                        boolean a03 = e1Var4.a0();
                                        m8 m8Var2 = (m8) view2;
                                        int intValue2 = num.intValue();
                                        b1Var2.b = intValue2;
                                        m8Var2.w(b1.a(intValue2), true);
                                        if (a03 != e1Var4.a0()) {
                                            e1Var4.n.f3.O(true);
                                        }
                                        h9 h9Var4 = e1Var4.f;
                                        if (h9Var4 != null) {
                                            h9Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 1) {
                        Activity parentActivity2 = e1Var2.getParentActivity();
                        String M02 = hd.M0(2131752756, null);
                        int i30 = b1Var2.b;
                        int i31 = b1Var2.a + 1;
                        if (b1Var3 != null) {
                            i23 = b1Var3.a - 1;
                        }
                        org.telegram.ui.Components.v4.U(parentActivity2, M02, i30, i31, i23, new c20() { // from class: kg.d1
                            @Override // org.telegram.messenger.c20
                            public final void a(Object obj3) {
                                Integer num = (Integer) obj3;
                                switch (i10) {
                                    case 0:
                                        e1 e1Var3 = e1Var2;
                                        boolean a02 = e1Var3.a0();
                                        m8 m8Var = (m8) view2;
                                        int intValue = num.intValue();
                                        b1Var2.a = intValue;
                                        m8Var.w(b1.a(intValue), true);
                                        if (a02 != e1Var3.a0()) {
                                            e1Var3.n.f3.O(true);
                                        }
                                        h9 h9Var3 = e1Var3.f;
                                        if (h9Var3 != null) {
                                            h9Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        e1 e1Var4 = e1Var2;
                                        boolean a03 = e1Var4.a0();
                                        m8 m8Var2 = (m8) view2;
                                        int intValue2 = num.intValue();
                                        b1Var2.b = intValue2;
                                        m8Var2.w(b1.a(intValue2), true);
                                        if (a03 != e1Var4.a0()) {
                                            e1Var4.n.f3.O(true);
                                        }
                                        h9 h9Var4 = e1Var4.f;
                                        if (h9Var4 != null) {
                                            h9Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i28 == 2) {
                        arrayList3.remove(i7);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new kg.b1(0, 1439));
                        }
                        e1Var2.n.f3.O(true);
                        fi.h9 h9Var3 = e1Var2.f;
                        if (h9Var3 != null) {
                            h9Var3.run();
                            break;
                        }
                    }
                }
                break;
            default:
                kg.w1.Z((kg.w1) this.b, (x31) obj, (View) obj2);
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 28:
                ((e2.a1) obj).o((e2.e) this.b);
                break;
            default:
                ((e2.a1) obj).D((e2.q1) this.b);
                break;
        }
    }

    @Override // h9.h1
    public Object j(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.m1) this.b).f, obj, false, 26));
    }

    @Override // di.j9
    public void k(float f10, Canvas canvas, RectF rectF, boolean z9) {
        Path path = (Path) this.b;
        if (z9) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.ui.Components.ft0
    public RecyclerView l(View view) {
        ((cd) this.b).getClass();
        return ((ad) view).a;
    }

    @Override // xh.j
    public void m(xh.f fVar, float f10, float f11) {
        f8 f8Var = (f8) this.b;
        if (f8Var.v.y) {
            return;
        }
        fVar.q = new e8(f8Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = f8Var.i;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        fi.s9 s9Var = (fi.s9) this.b;
        va vaVar = s9Var.a;
        fi.g6 g6Var = vaVar.O0;
        int i7 = vaVar.c;
        if (g6Var != null) {
            g6Var.g(true);
        }
        if (vaVar.p0()) {
            vaVar.s.d();
        }
        if (vaVar.G1 == null || vaVar.B0 == null) {
            return;
        }
        vaVar.Q1 = false;
        vaVar.R1 = false;
        fi.c6 c6Var = vaVar.C0;
        if (c6Var != null) {
            c6Var.c(false);
        }
        if (j3 <= 800) {
            vaVar.g(false, true);
            vaVar.c0(false);
            vaVar.J0.b(false, true);
            fi.g6 g6Var2 = vaVar.O0;
            if (g6Var2 != null) {
                g6Var2.g(true);
            }
            try {
                vaVar.G1.delete();
                vaVar.G1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            }
            return;
        }
        vaVar.h0(false, true);
        fi.e7 o4 = fi.e7.o(vaVar.G1, str, j3);
        o4.J0 = vaVar.v0;
        o4.K0 = vaVar.w0;
        o4.B();
        vaVar.g(false, true);
        vaVar.c0(false);
        vaVar.J0.b(false, true);
        fi.g6 g6Var3 = vaVar.O0;
        if (g6Var3 != null) {
            g6Var3.g(true);
        }
        if (!vaVar.A0.j()) {
            vaVar.K1 = o4;
            fi.t8.a(i7, o4);
            vaVar.L1 = false;
            int videoWidth = vaVar.B0.getVideoWidth();
            int videoHeight = vaVar.B0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                fi.e7 e7Var = vaVar.K1;
                e7Var.k0 = videoWidth;
                e7Var.l0 = videoHeight;
                e7Var.A();
            }
            vaVar.K(new fi.q9(s9Var, 3), 0L);
            return;
        }
        vaVar.G1 = null;
        o4.P = 1.0f;
        if (vaVar.A0.l(o4)) {
            fi.e7 a10 = fi.e7.a(vaVar.A0.getLayout(), vaVar.A0.getContent());
            vaVar.K1 = a10;
            fi.t8.a(i7, a10);
            vaVar.L1 = false;
            int videoWidth2 = vaVar.B0.getVideoWidth();
            int videoHeight2 = vaVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                fi.e7 e7Var2 = vaVar.K1;
                e7Var2.k0 = videoWidth2;
                e7Var2.l0 = videoHeight2;
                e7Var2.A();
            }
        }
        vaVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 5:
                ((e1.b) this.b).invoke(obj);
                break;
            case 8:
                ((e1.b) this.b).invoke(obj);
                break;
            default:
                ((ae.d) this.b).invoke(obj);
                break;
        }
    }

    @Override // f3.g
    public long q(long j3) {
        return h2.m0.j((j3 * r0.e) / 1000000, 0L, ((f3.u) this.b).j - 1);
    }

    @Override // org.telegram.ui.Components.ft0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }
}
