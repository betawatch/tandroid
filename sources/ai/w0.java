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
import bi.a5;
import bi.f4;
import di.x8;
import fi.a6;
import fi.p6;
import hi.d7;
import hi.ta;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.k3;
import oi.p3;
import oi.s3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pf;
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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ji.p pVar;
        int i7 = this.a;
        int i10 = 4;
        int i11 = 2;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                ((c1) obj).a(null, 0L, i13);
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j10.i(i13).n);
                ((s4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                gc t6 = f4.g().t(gd.a0(null, null, i13, (String) obj), null);
                t6.t = true;
                t6.j();
                break;
            case 3:
                ((a5) obj).L0(i13);
                break;
            case 4:
                ch.f fVar = (ch.f) obj;
                if (fVar.b) {
                    x10 x10Var = fVar.d;
                    if (x10Var != null) {
                        x10Var.a(Boolean.valueOf(i13 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.h3(new w0(fVar, max, i10), max);
                    break;
                }
                break;
            case 5:
                ((di.o0) obj).L0(i13, true);
                break;
            case 6:
                ConnectionsManager.getInstance(((x8) obj).a).cancelRequest(i13, true);
                break;
            case 7:
                ((f2.g) obj).b.onAudioFocusChange(i13);
                break;
            case 8:
                p6 p6Var = (p6) obj;
                ArrayList arrayList = p6Var.g;
                p6Var.v(arrayList);
                di.s4 s4Var = p6Var.J;
                Collections.sort(arrayList, s4Var);
                ArrayList arrayList2 = p6Var.h;
                p6Var.v(arrayList2);
                Collections.sort(arrayList2, s4Var);
                ks.f(i13).k(ks.x5, new Object[0]);
                break;
            case 9:
                ((hi.p) obj).a(Integer.valueOf(i13));
                break;
            case 10:
                ((hi.j2) obj).N0(i13);
                break;
            case 11:
                mp.u1(i13).f4((ArrayList) obj, true);
                break;
            case 12:
                ta taVar = (ta) obj;
                int i14 = taVar.c;
                taVar.l();
                taVar.Y1 = false;
                File file = taVar.L1.O0;
                if (file != null) {
                    file.delete();
                    taVar.L1.O0 = null;
                }
                taVar.V(taVar.L1, true);
                CharSequence[] charSequenceArr = {taVar.d1.getText()};
                ArrayList Y = mp.u1(i14).j5() ? ri.d0(i14).Y(charSequenceArr, true, true) : new ArrayList();
                ArrayList Y2 = mp.u1(i14).j5() ? ri.d0(i14).Y(new CharSequence[]{taVar.L1.C0}, true, true) : new ArrayList();
                d7 d7Var = taVar.L1;
                d7Var.k = (TextUtils.equals(d7Var.C0, charSequenceArr[0]) && ri.M(Y, Y2)) ? false : true;
                taVar.L1.C0 = new SpannableString(taVar.d1.getText());
                taVar.y();
                taVar.x();
                d7 d7Var2 = taVar.L1;
                taVar.P1 = (d7Var2 == null || !d7Var2.K) ? 0 : 1;
                taVar.L1 = (d7) taVar.I1.get(i13);
                taVar.N(0, 1);
                taVar.M(0, 1);
                taVar.e1.b.g3.O(false);
                taVar.d1.setText(taVar.L1.C0);
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
                ji.p pVar2 = (ji.p) obj;
                ji.m mVar = pVar2.a;
                if (pVar2.p0) {
                    if (i13 == 0) {
                        String trim = mVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            pf pfVar = mVar.b;
                            mVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = pfVar.a;
                            int i15 = ChatActivityEnterView.n7;
                            chatActivityEnterView.x2(trim, null);
                            break;
                        }
                    } else if (i13 == 1) {
                        String trim2 = mVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            pf pfVar2 = mVar.b;
                            mVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = pfVar2.a;
                            int i16 = ChatActivityEnterView.n7;
                            chatActivityEnterView2.x2(trim2, new dd(chatActivityEnterView2, 20));
                            break;
                        }
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 5) {
                                RectF rectF = pVar2.f1;
                                float f10 = rectF.left;
                                float f11 = rectF.top;
                                float f12 = pVar2.j1;
                                new RectF(f10, f11 + f12, rectF.right, rectF.bottom + f12);
                                if (!mVar.n.trim().isEmpty() && (pVar = mVar.h) != null) {
                                    pf pfVar3 = mVar.b;
                                    ji.h hVar = new ji.h(mVar, i12);
                                    ChatActivityEnterView chatActivityEnterView3 = pfVar3.a;
                                    if (chatActivityEnterView3.D3 != null) {
                                        RectF rectF2 = new RectF();
                                        pVar.l(rectF2);
                                        ji.n nVar = new ji.n(pVar, pVar.getContext(), i12);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF2.left + pVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF2.top + pVar.getTop());
                                        nVar.setAlpha(0.0f);
                                        chatActivityEnterView3.a2.addView(nVar, layoutParams);
                                        nVar.post(new wn(pfVar3, nVar, new of(pVar, r7 ? 1 : 0), hVar, pVar, 3));
                                        break;
                                    }
                                }
                            } else {
                                pf pfVar4 = mVar.b;
                                if (mVar.c == 2) {
                                    pfVar4.e();
                                    bn bnVar = pfVar4.a.D3;
                                    if (bnVar != null) {
                                        bnVar.presentFragment(new x2());
                                        break;
                                    }
                                }
                            }
                        } else if (mVar.h != null && mVar.c == 2) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(gd.M0(2131745074, null));
                            boolean v = DictationAsr.v();
                            int i17 = v ? 0 : -1;
                            for (int i18 = 0; i18 < C.length; i18++) {
                                arrayList3.add(n0.p(C[i18]));
                                if (!v && i17 < 0 && DictationAsr.y(C[i18])) {
                                    i17 = i18 + 1;
                                }
                            }
                            pf pfVar5 = mVar.b;
                            ji.p pVar3 = mVar.h;
                            ji.g gVar2 = new ji.g(mVar, C, r7 ? 1 : 0);
                            ChatActivityEnterView chatActivityEnterView4 = pfVar5.a;
                            if (chatActivityEnterView4.D3 != null) {
                                RectF rectF3 = new RectF();
                                rectF3.set(pVar3.R);
                                if (!rectF3.isEmpty()) {
                                    ji.n nVar2 = new ji.n(pVar3, pVar3.getContext(), r7 ? 1 : 0);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF3.left + pVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF3.top + pVar3.getTop());
                                    nVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.a2.addView(nVar2, layoutParams2);
                                    nVar2.post(new bg.m0(pfVar5, nVar2, new b5(pVar3), arrayList3, i17, gVar2, 9));
                                    break;
                                }
                            }
                        }
                    } else if (mVar.c == 3 && mVar.h != null && mVar.H != null) {
                        Log.d("VoiceLive", "review: back to the text before the style");
                        mVar.n = mVar.H;
                        mVar.H = null;
                        mVar.h.setStyleIcon(null);
                        mVar.h.setStyleLabel(null);
                        mVar.h.r(mVar.n);
                        break;
                    }
                }
                break;
            case 16:
                try {
                    SQLiteDatabase sQLiteDatabase = ((tr) obj).b;
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
                cVar.A(new a6(21, cVar, tVar));
                cVar.G(Integer.valueOf(i13));
                break;
            case 19:
                oi.a0 a0Var = (oi.a0) obj;
                oi.d0 d0Var = a0Var.f;
                if (a0Var.c && d0Var.F != null && d0Var.a != null) {
                    a0Var.d = true;
                    a0Var.a.m(false);
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    oi.b0 b0Var = d0Var.F;
                    oi.a aVar = d0Var.a;
                    s3 s3Var = ((k3) b0Var).a;
                    s3Var.r3(false);
                    s3Var.p3.x(new p3(s3Var, aVar, i13), a0Var);
                    break;
                }
                break;
            case 20:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 21:
                mp.u1(i13).b3(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 22:
                ((p4) ((org.telegram.ui.f) obj).b).a0(i13, true);
                break;
            case 23:
                org.telegram.ui.Cells.q1 q1Var = ((org.telegram.ui.Cells.f1) obj).a;
                int i19 = q1Var.N5;
                if (i13 == i19) {
                    org.telegram.ui.Cells.d0 d0Var2 = (org.telegram.ui.Cells.d0) q1Var.I5.get(i19);
                    if (d0Var2 != null) {
                        org.telegram.ui.Cells.y yVar = d0Var2.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        d0Var2.b(false);
                        if (!q1Var.Q5.r1) {
                            if (d0Var2.j != null) {
                                q1Var.n();
                            } else if (d0Var2.i != null) {
                                q1Var.n();
                                org.telegram.ui.Cells.l1 l1Var = q1Var.Sa;
                                if (l1Var != null) {
                                    l1Var.I1(q1Var, d0Var2.i);
                                }
                            }
                        }
                    }
                    q1Var.N5 = -1;
                    q1Var.q2();
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

    public /* synthetic */ w0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
