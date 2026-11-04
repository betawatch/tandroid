package cg;

import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import b8.zb;
import ci.e9;
import ci.y4;
import ei.z6;
import gi.f7;
import gi.i2;
import gi.va;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import mi.l3;
import mi.q3;
import mi.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Cells.e1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ci;
import org.telegram.ui.di;
import org.telegram.ui.hm;
import org.telegram.ui.ji;
import org.telegram.ui.kl;
import org.telegram.ui.r4;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i3, Object obj, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        int i11 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", h10.i(i13).n);
                ((q4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                ConnectionsManager.getInstance(((e9) obj).a).cancelRequest(i13, true);
                break;
            case 2:
                dh.f fVar = (dh.f) obj;
                if (fVar.b) {
                    u10 u10Var = fVar.d;
                    if (u10Var != null) {
                        u10Var.a(Boolean.valueOf(i13 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.i3(new l0(fVar, max, i11), max);
                    break;
                }
                break;
            case 3:
                ((e2.f) obj).b.onAudioFocusChange(i13);
                break;
            case 4:
                z6 z6Var = (z6) obj;
                ArrayList arrayList = z6Var.g;
                z6Var.v(arrayList);
                y4 y4Var = z6Var.J;
                Collections.sort(arrayList, y4Var);
                ArrayList arrayList2 = z6Var.h;
                z6Var.v(arrayList2);
                Collections.sort(arrayList2, y4Var);
                hs.f(i13).k(hs.v5, new Object[0]);
                break;
            case 5:
                ((gi.o) obj).a(Integer.valueOf(i13));
                break;
            case 6:
                ((u10) obj).a(Integer.valueOf(i13));
                break;
            case 7:
                ((i2) obj).M0(i13);
                break;
            case 8:
                hp.s1(i13).Y3((ArrayList) obj, true);
                break;
            case 9:
                va vaVar = (va) obj;
                int i14 = vaVar.c;
                vaVar.l();
                vaVar.Y1 = false;
                File file = vaVar.L1.O0;
                if (file != null) {
                    file.delete();
                    vaVar.L1.O0 = null;
                }
                vaVar.V(vaVar.L1, true);
                CharSequence[] charSequenceArr = {vaVar.d1.getText()};
                ArrayList W = hp.s1(i14).X4() ? li.b0(i14).W(charSequenceArr, true, true) : new ArrayList();
                ArrayList W2 = hp.s1(i14).X4() ? li.b0(i14).W(new CharSequence[]{vaVar.L1.C0}, true, true) : new ArrayList();
                f7 f7Var = vaVar.L1;
                f7Var.k = (TextUtils.equals(f7Var.C0, charSequenceArr[0]) && li.K(W, W2)) ? false : true;
                vaVar.L1.C0 = new SpannableString(vaVar.d1.getText());
                vaVar.y();
                vaVar.x();
                f7 f7Var2 = vaVar.L1;
                vaVar.P1 = (f7Var2 == null || !f7Var2.K) ? 0 : 1;
                vaVar.L1 = (f7) vaVar.I1.get(i13);
                vaVar.N(0, 1);
                vaVar.M(0, 1);
                vaVar.e1.b.g3.O(false);
                vaVar.d1.setText(vaVar.L1.C0);
                break;
            case 10:
                l2.f fVar2 = ((k2.r0) obj).N;
                l2.a Q = fVar2.Q();
                fVar2.V(Q, 1034, new l2.c(Q, i13, i12, (char) (objArr == true ? 1 : 0)));
                break;
            case 11:
                ((kg.e0) obj).g(i13);
                break;
            case 12:
                kh.g gVar = (kh.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 13:
                try {
                    SQLiteDatabase sQLiteDatabase = ((qr) obj).b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 14:
                m2.u uVar = (m2.u) ((m2.t) obj).c;
                String str = g2.n0.a;
                g2.d dVar = ((k2.c0) uVar).a.C;
                k2.v vVar = new k2.v(i13, i11);
                dVar.getClass();
                zb.p(Looper.myLooper() == ((g2.j0) dVar.c).a.getLooper());
                dVar.a++;
                dVar.A(new g2.c(objArr2 == true ? 1 : 0, dVar, vVar));
                dVar.G(Integer.valueOf(i13));
                break;
            case 15:
                mi.c0 c0Var = (mi.c0) obj;
                mi.f0 f0Var = c0Var.f;
                if (c0Var.c && f0Var.F != null && f0Var.a != null) {
                    c0Var.d = true;
                    c0Var.a.m(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    mi.d0 d0Var = f0Var.F;
                    mi.a aVar = f0Var.a;
                    t3 t3Var = ((l3) d0Var).a;
                    t3Var.r3(false);
                    t3Var.p3.T1(new q3(t3Var, aVar, i13), c0Var);
                    break;
                }
                break;
            case 16:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 17:
                hp.s1(i13).V2(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 18:
                ((r4) ((org.telegram.ui.f) obj).b).a0(i13, true);
                break;
            case 19:
                q1 q1Var = ((e1) obj).a;
                int i15 = q1Var.M5;
                if (i13 == i15) {
                    org.telegram.ui.Cells.c0 c0Var2 = (org.telegram.ui.Cells.c0) q1Var.H5.get(i15);
                    if (c0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = c0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var2.b(false);
                        if (!q1Var.P5.p1) {
                            if (c0Var2.j != null) {
                                q1Var.n();
                            } else if (c0Var2.i != null) {
                                q1Var.n();
                                l1 l1Var = q1Var.Ra;
                                if (l1Var != null) {
                                    l1Var.x1(q1Var, c0Var2.i);
                                }
                            }
                        }
                    }
                    q1Var.M5 = -1;
                    q1Var.p2();
                    break;
                }
                break;
            case 20:
                td tdVar = ((sd) obj).f;
                tdVar.getClass();
                tdVar.c(i13);
                break;
            case 21:
                wm wmVar = ((ci) obj).g;
                if (wmVar.Xb == i13) {
                    wmVar.lb();
                    break;
                }
                break;
            case 22:
                wm wmVar2 = ((di) obj).g;
                if (wmVar2.Xb == i13) {
                    wmVar2.lb();
                    break;
                }
                break;
            case 23:
                ((ji) obj).a.l(this.b, 0, true, 0, true, 0);
                break;
            case 24:
                wm wmVar3 = ((ci) obj).g;
                if (wmVar3.Xb == i13) {
                    wmVar3.lb();
                    break;
                }
                break;
            case 25:
                wm wmVar4 = ((di) obj).g;
                if (wmVar4.Xb == i13) {
                    wmVar4.lb();
                    break;
                }
                break;
            case 26:
                wm wmVar5 = ((di) obj).g;
                if (wmVar5.Xb == i13) {
                    wmVar5.lb();
                    break;
                }
                break;
            case 27:
                wm wmVar6 = ((kl) obj).x0;
                wmVar6.C0.h1(i13, wmVar6.N4);
                break;
            case 28:
                i3 = ((d2) ((hm) obj).a).currentAccount;
                ConnectionsManager.getInstance(i3).cancelRequest(i13, true);
                break;
            default:
                hs.f(i13).k(4, new Object[0]);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.q1((ir) obj, 1), 250L);
                break;
        }
    }

    public /* synthetic */ l0(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }
}
