package ai;

import a8.la;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.widget.FrameLayout;
import bi.c5;
import bi.f5;
import bi.i4;
import di.s4;
import di.y8;
import fi.l4;
import fi.p6;
import hi.c7;
import hi.sa;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.l3;
import oi.q3;
import oi.t3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.gi;
import org.telegram.ui.hi;
import org.telegram.ui.oi;
import org.telegram.ui.p4;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c1(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ji.r rVar;
        int i7 = this.a;
        int i10 = 4;
        int i11 = 2;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                ((e1) obj).a(null, 0L, i13);
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", k10.i(i13).n);
                ((r4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                gc t6 = i4.h().t(hd.a0(null, null, i13, (String) obj), null);
                t6.t = true;
                t6.j();
                break;
            case 3:
                ((c5) obj).L0(i13);
                break;
            case 4:
                ch.f fVar = (ch.f) obj;
                if (fVar.b) {
                    y10 y10Var = fVar.d;
                    if (y10Var != null) {
                        y10Var.a(Boolean.valueOf(i13 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.h3(new c1(fVar, max, i10), max);
                    break;
                }
                break;
            case 5:
                ((di.o0) obj).L0(i13, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((y8) obj).a).cancelRequest(i13, true);
                break;
            case 7:
                ((f2.g) obj).b.onAudioFocusChange(i13);
                break;
            case 8:
                p6 p6Var = (p6) obj;
                ArrayList arrayList = p6Var.g;
                p6Var.v(arrayList);
                s4 s4Var = p6Var.J;
                Collections.sort(arrayList, s4Var);
                ArrayList arrayList2 = p6Var.h;
                p6Var.v(arrayList2);
                Collections.sort(arrayList2, s4Var);
                ls.f(i13).k(ls.y5, new Object[0]);
                break;
            case 9:
                ((hi.q) obj).a(Integer.valueOf(i13));
                break;
            case 10:
                ((hi.i2) obj).N0(i13);
                break;
            case 11:
                np.u1(i13).f4((ArrayList) obj, true);
                break;
            case 12:
                sa saVar = (sa) obj;
                int i14 = saVar.c;
                saVar.l();
                saVar.Y1 = false;
                File file = saVar.L1.O0;
                if (file != null) {
                    file.delete();
                    saVar.L1.O0 = null;
                }
                saVar.V(saVar.L1, true);
                CharSequence[] charSequenceArr = {saVar.d1.getText()};
                ArrayList Y = np.u1(i14).j5() ? si.d0(i14).Y(charSequenceArr, true, true) : new ArrayList();
                ArrayList Y2 = np.u1(i14).j5() ? si.d0(i14).Y(new CharSequence[]{saVar.L1.C0}, true, true) : new ArrayList();
                c7 c7Var = saVar.L1;
                c7Var.k = (TextUtils.equals(c7Var.C0, charSequenceArr[0]) && si.M(Y, Y2)) ? false : true;
                saVar.L1.C0 = new SpannableString(saVar.d1.getText());
                saVar.y();
                saVar.x();
                c7 c7Var2 = saVar.L1;
                saVar.P1 = (c7Var2 == null || !c7Var2.K) ? 0 : 1;
                saVar.L1 = (c7) saVar.I1.get(i13);
                saVar.N(0, 1);
                saVar.M(0, 1);
                saVar.e1.b.g3.O(false);
                saVar.d1.setText(saVar.L1.C0);
                break;
            case 13:
                ((jg.h0) obj).g(i13);
                break;
            case 14:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 15:
                ji.r rVar2 = (ji.r) obj;
                ji.o oVar = rVar2.a;
                if (rVar2.p0) {
                    if (i13 == 0) {
                        String trim = oVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            rf rfVar = oVar.b;
                            oVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = rfVar.a;
                            int i15 = ChatActivityEnterView.s7;
                            chatActivityEnterView.A2(trim, null);
                            break;
                        }
                    } else if (i13 == 1) {
                        String trim2 = oVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            rf rfVar2 = oVar.b;
                            oVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = rfVar2.a;
                            int i16 = ChatActivityEnterView.s7;
                            chatActivityEnterView2.A2(trim2, new dd(chatActivityEnterView2, 20));
                            break;
                        }
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                RectF rectF = rVar2.f1;
                                float f10 = rectF.left;
                                float f11 = rectF.top;
                                float f12 = rVar2.j1;
                                new RectF(f10, f11 + f12, rectF.right, rectF.bottom + f12);
                                if (!oVar.n.trim().isEmpty() && (rVar = oVar.h) != null) {
                                    rf rfVar3 = oVar.b;
                                    ji.g gVar2 = new ji.g(oVar, i12);
                                    ChatActivityEnterView chatActivityEnterView3 = rfVar3.a;
                                    if (chatActivityEnterView3.F3 != null) {
                                        RectF rectF2 = new RectF();
                                        rVar.l(rectF2);
                                        ji.p pVar = new ji.p(rVar, rVar.getContext(), i12);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF2.left + rVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF2.top + rVar.getTop());
                                        pVar.setAlpha(0.0f);
                                        chatActivityEnterView3.c2.addView(pVar, layoutParams);
                                        pVar.post(new wn(rfVar3, pVar, new qf(rVar, r7 ? 1 : 0), gVar2, rVar, 3));
                                        break;
                                    }
                                }
                            } else {
                                rf rfVar4 = oVar.b;
                                if (oVar.c == 2) {
                                    rfVar4.e();
                                    bn bnVar = rfVar4.a.F3;
                                    if (bnVar != null) {
                                        bnVar.presentFragment(new a3());
                                        break;
                                    }
                                }
                            }
                        } else if (oVar.h != null && oVar.c == 2) {
                            String[] E = DictationAsr.E();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(hd.N0(2131745068, null));
                            boolean x10 = DictationAsr.x();
                            int i17 = x10 ? 0 : -1;
                            for (int i18 = 0; i18 < E.length; i18++) {
                                arrayList3.add(p0.q(E[i18]));
                                if (!x10 && i17 < 0 && DictationAsr.A(E[i18])) {
                                    i17 = i18 + 1;
                                }
                            }
                            ji.f fVar2 = new ji.f(oVar, E, r7 ? 1 : 0);
                            rf rfVar5 = oVar.b;
                            ji.r rVar3 = oVar.h;
                            ArrayList v = ji.o.v(E, x10, fVar2);
                            ChatActivityEnterView chatActivityEnterView4 = rfVar5.a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF3 = new RectF();
                                rectF3.set(rVar3.R);
                                if (!rectF3.isEmpty()) {
                                    ji.p pVar2 = new ji.p(rVar3, rVar3.getContext(), r7 ? 1 : 0);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF3.left + rVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF3.top + rVar3.getTop());
                                    pVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.c2.addView(pVar2, layoutParams2);
                                    pVar2.post(new f5(rfVar5, pVar2, new org.telegram.ui.Cells.c5(rVar3), arrayList3, v, i17, fVar2));
                                    break;
                                }
                            }
                        }
                    } else if (oVar.c == 3 && oVar.h != null && oVar.H != null) {
                        Log.d("VoiceLive", "review: back to the text before the style");
                        oVar.n = oVar.H;
                        oVar.H = null;
                        oVar.h.setStyleIcon(null);
                        oVar.h.setStyleLabel(null);
                        oVar.h.r(oVar.n);
                        break;
                    }
                }
                break;
            case 16:
                try {
                    SQLiteDatabase sQLiteDatabase = ((ur) obj).b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 17:
                m2.d dVar = ((l2.o0) obj).N;
                m2.a Q = dVar.Q();
                dVar.V(Q, 1034, new li.c(Q, i13, 15, r7 ? (char) 1 : (char) 0));
                break;
            case 18:
                n2.s sVar = (n2.s) ((k8.a) obj).c;
                String str = h2.l0.a;
                h2.c cVar = ((l2.z) sVar).a.C;
                l2.t tVar = new l2.t(i13, i11);
                cVar.getClass();
                la.p(Looper.myLooper() == ((h2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.A(new l4(23, cVar, tVar));
                cVar.G(Integer.valueOf(i13));
                break;
            case 19:
                oi.b0 b0Var = (oi.b0) obj;
                oi.e0 e0Var = b0Var.f;
                if (b0Var.c && e0Var.F != null && e0Var.a != null) {
                    b0Var.d = true;
                    b0Var.a.m(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.c0 c0Var = e0Var.F;
                    oi.a aVar = e0Var.a;
                    t3 t3Var = ((l3) c0Var).a;
                    t3Var.r3(false);
                    t3Var.p3.x(new q3(t3Var, aVar, i13), b0Var);
                    break;
                }
                break;
            case 20:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 21:
                np.u1(i13).b3(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 22:
                ((p4) ((org.telegram.ui.f) obj).b).a0(i13, true);
                break;
            case 23:
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
            case 24:
                td tdVar = ((sd) obj).f;
                tdVar.getClass();
                tdVar.c(i13);
                break;
            case 25:
                bn bnVar2 = ((gi) obj).g;
                if (bnVar2.ac == i13) {
                    bnVar2.pb();
                    break;
                }
                break;
            case 26:
                bn bnVar3 = ((hi) obj).g;
                if (bnVar3.ac == i13) {
                    bnVar3.pb();
                    break;
                }
                break;
            case 27:
                ((oi) obj).a.l(this.b, 0, true, 0, true, 0);
                break;
            case 28:
                bn bnVar4 = ((gi) obj).g;
                if (bnVar4.ac == i13) {
                    bnVar4.pb();
                    break;
                }
                break;
            default:
                bn bnVar5 = ((hi) obj).g;
                if (bnVar5.ac == i13) {
                    bnVar5.pb();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
