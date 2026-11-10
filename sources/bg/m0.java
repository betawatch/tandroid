package bg;

import a8.ia;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.StateSet;
import bi.ea;
import bi.s5;
import di.z6;
import fi.e7;
import fi.k2;
import fi.va;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import li.l3;
import li.q3;
import li.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Cells.e1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ii;
import org.telegram.ui.ji;
import org.telegram.ui.nm;
import org.telegram.ui.p4;
import org.telegram.ui.pi;
import org.telegram.ui.ql;
import org.telegram.ui.ud;
import org.telegram.ui.vd;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        int i11 = 2;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", p10.i(i12).n);
                ((r4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 1:
                ConnectionsManager.getInstance(((ea) obj).a).cancelRequest(i12, true);
                break;
            case 2:
                ch.f fVar = (ch.f) obj;
                if (fVar.b) {
                    c20 c20Var = fVar.d;
                    if (c20Var != null) {
                        c20Var.a(Boolean.valueOf(i12 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i12 - 100);
                    org.telegram.messenger.g0.i3(new m0(fVar, max, i11), max);
                    break;
                }
                break;
            case 3:
                z6 z6Var = (z6) obj;
                ArrayList arrayList = z6Var.g;
                z6Var.v(arrayList);
                s5 s5Var = z6Var.J;
                Collections.sort(arrayList, s5Var);
                ArrayList arrayList2 = z6Var.h;
                z6Var.v(arrayList2);
                Collections.sort(arrayList2, s5Var);
                qs.f(i12).k(qs.v5, new Object[0]);
                break;
            case 4:
                ((f2.f) obj).b.onAudioFocusChange(i12);
                break;
            case 5:
                ((fi.o) obj).a(Integer.valueOf(i12));
                break;
            case 6:
                ((c20) obj).a(Integer.valueOf(i12));
                break;
            case 7:
                ((k2) obj).M0(i12);
                break;
            case 8:
                qp.s1(i12).Y3((ArrayList) obj, true);
                break;
            case 9:
                va vaVar = (va) obj;
                int i13 = vaVar.c;
                vaVar.l();
                vaVar.X1 = false;
                File file = vaVar.K1.O0;
                if (file != null) {
                    file.delete();
                    vaVar.K1.O0 = null;
                }
                vaVar.V(vaVar.K1, true);
                CharSequence[] charSequenceArr = {vaVar.c1.getText()};
                ArrayList W = qp.s1(i13).X4() ? ui.b0(i13).W(charSequenceArr, true, true) : new ArrayList();
                ArrayList W2 = qp.s1(i13).X4() ? ui.b0(i13).W(new CharSequence[]{vaVar.K1.C0}, true, true) : new ArrayList();
                e7 e7Var = vaVar.K1;
                e7Var.k = (TextUtils.equals(e7Var.C0, charSequenceArr[0]) && ui.K(W, W2)) ? false : true;
                vaVar.K1.C0 = new SpannableString(vaVar.c1.getText());
                vaVar.y();
                vaVar.x();
                e7 e7Var2 = vaVar.K1;
                vaVar.O1 = (e7Var2 == null || !e7Var2.K) ? 0 : 1;
                vaVar.K1 = (e7) vaVar.H1.get(i12);
                vaVar.N(0, 1);
                vaVar.M(0, 1);
                vaVar.d1.b.f3.O(false);
                vaVar.c1.setText(vaVar.K1.C0);
                break;
            case 10:
                ((jg.h0) obj).g(i12);
                break;
            case 11:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i12);
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 12:
                try {
                    SQLiteDatabase sQLiteDatabase = ((yr) obj).b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 13:
                m2.e eVar = ((l2.r0) obj).M;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1034, new m2.c(Q, i12, 8, r3 ? (char) 1 : (char) 0));
                break;
            case 14:
                li.c0 c0Var = (li.c0) obj;
                li.f0 f0Var = c0Var.f;
                if (c0Var.c && f0Var.E != null && f0Var.a != null) {
                    c0Var.d = true;
                    c0Var.a.m(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    li.d0 d0Var = f0Var.E;
                    li.a aVar = f0Var.a;
                    t3 t3Var = ((l3) d0Var).a;
                    t3Var.r3(false);
                    t3Var.o3.z(new q3(t3Var, aVar, i12), c0Var);
                    break;
                }
                break;
            case 15:
                n2.s sVar = (n2.s) ((j2.n) obj).c;
                String str = h2.m0.a;
                h2.c cVar = ((l2.c0) sVar).a.C;
                l2.u uVar = new l2.u(i12, i11);
                cVar.getClass();
                ia.p(Looper.myLooper() == ((h2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.A(new f2.h(24, cVar, uVar));
                cVar.G(Integer.valueOf(i12));
                break;
            case 16:
                ConnectionsManager.lambda$onUpdateConfig$21(i12, (TLRPC.TL_config) obj);
                break;
            case 17:
                qp.s1(i12).V2(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 18:
                ((p4) ((org.telegram.ui.f) obj).b).a0(i12, true);
                break;
            case 19:
                q1 q1Var = ((e1) obj).a;
                int i14 = q1Var.M5;
                if (i12 == i14) {
                    org.telegram.ui.Cells.c0 c0Var2 = (org.telegram.ui.Cells.c0) q1Var.H5.get(i14);
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
                                    l1Var.v1(q1Var, c0Var2.i);
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
                vd vdVar = ((ud) obj).f;
                vdVar.getClass();
                vdVar.c(i12);
                break;
            case 21:
                cn cnVar = ((ii) obj).g;
                if (cnVar.Yb == i12) {
                    cnVar.ob();
                    break;
                }
                break;
            case 22:
                cn cnVar2 = ((ji) obj).g;
                if (cnVar2.Yb == i12) {
                    cnVar2.ob();
                    break;
                }
                break;
            case 23:
                ((pi) obj).a.l(this.b, 0, true, 0, true, 0);
                break;
            case 24:
                cn cnVar3 = ((ii) obj).g;
                if (cnVar3.Yb == i12) {
                    cnVar3.ob();
                    break;
                }
                break;
            case 25:
                cn cnVar4 = ((ji) obj).g;
                if (cnVar4.Yb == i12) {
                    cnVar4.ob();
                    break;
                }
                break;
            case 26:
                cn cnVar5 = ((ji) obj).g;
                if (cnVar5.Yb == i12) {
                    cnVar5.ob();
                    break;
                }
                break;
            case 27:
                cn cnVar6 = ((ql) obj).w0;
                cnVar6.B0.h1(i12, cnVar6.M4);
                break;
            case 28:
                i7 = ((f2) ((nm) obj).a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i12, true);
                break;
            default:
                qs.f(i12).k(4, new Object[0]);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.q1((qr) obj, 1), 250L);
                break;
        }
    }

    public /* synthetic */ m0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
