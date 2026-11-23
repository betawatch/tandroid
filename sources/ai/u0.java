package ai;

import a8.ma;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.widget.FrameLayout;
import bi.f5;
import bi.i5;
import bi.l4;
import di.s4;
import di.y8;
import fi.p6;
import hi.nb;
import hi.x7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.l3;
import oi.q3;
import oi.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.gi;
import org.telegram.ui.hi;
import org.telegram.ui.ip;
import org.telegram.ui.oi;
import org.telegram.ui.p4;
import org.telegram.ui.sd;
import org.telegram.ui.td;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ji.q qVar;
        int i7 = this.a;
        int i10 = 5;
        int i11 = 2;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                ((s1) obj).a(Integer.valueOf(i13));
                break;
            case 1:
                ExecutorService executorService2 = DictationLid.a;
                ((z0) obj).a(null, 0L, i13);
                break;
            case 2:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", i10.i(i13).n);
                ((r4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 3:
                fc t6 = l4.h().t(gd.a0(null, null, i13, (String) obj), null);
                t6.t = true;
                t6.j();
                break;
            case 4:
                ((f5) obj).L0(i13);
                break;
            case 5:
                ch.f fVar = (ch.f) obj;
                if (fVar.b) {
                    w10 w10Var = fVar.d;
                    if (w10Var != null) {
                        w10Var.a(Boolean.valueOf(i13 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.h3(new u0(fVar, max, i10), max);
                    break;
                }
                break;
            case 6:
                ((di.o0) obj).L0(i13, true);
                break;
            case 7:
                ConnectionsManager.getInstance(((y8) obj).a).cancelRequest(i13, true);
                break;
            case 8:
                ((f2.g) obj).b.onAudioFocusChange(i13);
                break;
            case 9:
                p6 p6Var = (p6) obj;
                ArrayList arrayList = p6Var.g;
                p6Var.v(arrayList);
                s4 s4Var = p6Var.J;
                Collections.sort(arrayList, s4Var);
                ArrayList arrayList2 = p6Var.h;
                p6Var.v(arrayList2);
                Collections.sort(arrayList2, s4Var);
                ks.f(i13).k(ks.y5, new Object[0]);
                break;
            case 10:
                ((hi.p) obj).a(Integer.valueOf(i13));
                break;
            case 11:
                ((w10) obj).a(Integer.valueOf(i13));
                break;
            case 12:
                ((hi.r2) obj).N0(i13);
                break;
            case 13:
                mp.u1(i13).f4((ArrayList) obj, true);
                break;
            case 14:
                nb nbVar = (nb) obj;
                int i14 = nbVar.c;
                nbVar.l();
                nbVar.Y1 = false;
                File file = nbVar.L1.O0;
                if (file != null) {
                    file.delete();
                    nbVar.L1.O0 = null;
                }
                nbVar.V(nbVar.L1, true);
                CharSequence[] charSequenceArr = {nbVar.d1.getText()};
                ArrayList Y = mp.u1(i14).j5() ? ri.d0(i14).Y(charSequenceArr, true, true) : new ArrayList();
                ArrayList Y2 = mp.u1(i14).j5() ? ri.d0(i14).Y(new CharSequence[]{nbVar.L1.C0}, true, true) : new ArrayList();
                x7 x7Var = nbVar.L1;
                x7Var.k = (TextUtils.equals(x7Var.C0, charSequenceArr[0]) && ri.M(Y, Y2)) ? false : true;
                nbVar.L1.C0 = new SpannableString(nbVar.d1.getText());
                nbVar.y();
                nbVar.x();
                x7 x7Var2 = nbVar.L1;
                nbVar.P1 = (x7Var2 == null || !x7Var2.K) ? 0 : 1;
                nbVar.L1 = (x7) nbVar.I1.get(i13);
                nbVar.N(0, 1);
                nbVar.M(0, 1);
                nbVar.e1.b.g3.O(false);
                nbVar.d1.setText(nbVar.L1.C0);
                break;
            case 15:
                ((jg.h0) obj).g(i13);
                break;
            case 16:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 17:
                ji.q qVar2 = (ji.q) obj;
                ji.n nVar = qVar2.a;
                if (qVar2.p0) {
                    if (i13 == 0) {
                        String trim = nVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            qf qfVar = nVar.b;
                            nVar.h("edit", true);
                            ChatActivityEnterView chatActivityEnterView = qfVar.a;
                            int i15 = ChatActivityEnterView.s7;
                            chatActivityEnterView.D2(trim, null);
                            break;
                        }
                    } else if (i13 == 1) {
                        String trim2 = nVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            qf qfVar2 = nVar.b;
                            nVar.h("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = qfVar2.a;
                            int i16 = ChatActivityEnterView.s7;
                            chatActivityEnterView2.D2(trim2, new dd(chatActivityEnterView2, 20));
                            break;
                        }
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                RectF rectF = qVar2.f1;
                                float f10 = rectF.left;
                                float f11 = rectF.top;
                                float f12 = qVar2.j1;
                                new RectF(f10, f11 + f12, rectF.right, rectF.bottom + f12);
                                if (!nVar.n.trim().isEmpty() && (qVar = nVar.h) != null) {
                                    qf qfVar3 = nVar.b;
                                    ji.h hVar = new ji.h(nVar, i12);
                                    ChatActivityEnterView chatActivityEnterView3 = qfVar3.a;
                                    if (chatActivityEnterView3.F3 != null) {
                                        RectF rectF2 = new RectF();
                                        qVar.l(rectF2);
                                        ji.o oVar = new ji.o(qVar, qVar.getContext(), i12);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF2.left + qVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF2.top + qVar.getTop());
                                        oVar.setAlpha(0.0f);
                                        chatActivityEnterView3.c2.addView(oVar, layoutParams);
                                        oVar.post(new ip(qfVar3, oVar, new aa(qVar, i11), hVar, qVar, 2));
                                        break;
                                    }
                                }
                            } else {
                                qf qfVar4 = nVar.b;
                                if (nVar.c == 2) {
                                    qfVar4.e();
                                    bn bnVar = qfVar4.a.F3;
                                    if (bnVar != null) {
                                        bnVar.presentFragment(new r2());
                                        break;
                                    }
                                }
                            }
                        } else if (nVar.h != null && nVar.c == 2) {
                            String[] H = DictationAsr.H();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(gd.N0(2131745068, null));
                            boolean z10 = DictationAsr.z();
                            int i17 = z10 ? 0 : -1;
                            for (int i18 = 0; i18 < H.length; i18++) {
                                arrayList3.add(l0.o(H[i18]));
                                if (!z10 && i17 < 0 && DictationAsr.B(H[i18])) {
                                    i17 = i18 + 1;
                                }
                            }
                            ji.g gVar2 = new ji.g(nVar, H, r7 ? 1 : 0);
                            qf qfVar5 = nVar.b;
                            ji.q qVar3 = nVar.h;
                            ArrayList u10 = ji.n.u(H, z10, gVar2);
                            ChatActivityEnterView chatActivityEnterView4 = qfVar5.a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF3 = new RectF();
                                rectF3.set(qVar3.R);
                                if (!rectF3.isEmpty()) {
                                    ji.o oVar2 = new ji.o(qVar3, qVar3.getContext(), r7 ? 1 : 0);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF3.left + qVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF3.top + qVar3.getTop());
                                    oVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.c2.addView(oVar2, layoutParams2);
                                    oVar2.post(new i5(qfVar5, oVar2, new org.telegram.ui.ActionBar.i5(qVar3), arrayList3, u10, i17, gVar2));
                                    break;
                                }
                            }
                        }
                    } else if (nVar.c == 3 && nVar.h != null && nVar.H != null) {
                        Log.d("VoiceLive", "review: back to the text before the style");
                        nVar.n = nVar.H;
                        nVar.H = null;
                        nVar.h.setStyleIcon(null);
                        nVar.h.setStyleLabel(null);
                        nVar.h.r(nVar.n);
                        break;
                    }
                }
                break;
            case 18:
                try {
                    SQLiteDatabase sQLiteDatabase = ((tr) obj).b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 19:
                m2.d dVar = ((l2.p0) obj).N;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1034, new li.c(Q, i13, 15, r7 ? (char) 1 : (char) 0));
                break;
            case 20:
                n2.s sVar = (n2.s) ((jb.m) obj).c;
                String str = h2.l0.a;
                h2.c cVar = ((l2.a0) sVar).a.C;
                l2.u uVar = new l2.u(i13, i11);
                cVar.getClass();
                ma.p(Looper.myLooper() == ((h2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.A(new fi.l4(23, cVar, uVar));
                cVar.G(Integer.valueOf(i13));
                break;
            case 21:
                oi.b0 b0Var = (oi.b0) obj;
                oi.e0 e0Var = b0Var.f;
                if (b0Var.c && e0Var.F != null && e0Var.a != null) {
                    b0Var.d = true;
                    b0Var.a.n(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.c0 c0Var = e0Var.F;
                    oi.a aVar = e0Var.a;
                    t3 t3Var = ((l3) c0Var).a;
                    t3Var.r3(false);
                    t3Var.p3.c(new q3(t3Var, aVar, i13), b0Var);
                    break;
                }
                break;
            case 22:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 23:
                mp.u1(i13).b3(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 24:
                ((p4) ((org.telegram.ui.f) obj).b).a0(i13, true);
                break;
            case 25:
                org.telegram.ui.Cells.r1 r1Var = ((org.telegram.ui.Cells.g1) obj).a;
                int i19 = r1Var.N5;
                if (i13 == i19) {
                    org.telegram.ui.Cells.d0 d0Var = (org.telegram.ui.Cells.d0) r1Var.I5.get(i19);
                    if (d0Var != null) {
                        org.telegram.ui.Cells.y yVar = d0Var.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var.b(false);
                        if (!r1Var.Q5.r1) {
                            if (d0Var.j != null) {
                                r1Var.n();
                            } else if (d0Var.i != null) {
                                r1Var.n();
                                org.telegram.ui.Cells.m1 m1Var = r1Var.Sa;
                                if (m1Var != null) {
                                    m1Var.I1(r1Var, d0Var.i);
                                }
                            }
                        }
                    }
                    r1Var.N5 = -1;
                    r1Var.q2();
                    break;
                }
                break;
            case 26:
                td tdVar = ((sd) obj).f;
                tdVar.getClass();
                tdVar.c(i13);
                break;
            case 27:
                bn bnVar2 = ((gi) obj).g;
                if (bnVar2.ac == i13) {
                    bnVar2.pb();
                    break;
                }
                break;
            case 28:
                bn bnVar3 = ((hi) obj).g;
                if (bnVar3.ac == i13) {
                    bnVar3.pb();
                    break;
                }
                break;
            default:
                ((oi) obj).a.l(this.b, 0, true, 0, true, 0);
                break;
        }
    }

    public /* synthetic */ u0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
