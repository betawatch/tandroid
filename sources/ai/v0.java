package ai;

import a8.ja;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.widget.FrameLayout;
import di.p4;
import di.v8;
import fi.f6;
import fi.s6;
import hi.d7;
import hi.sa;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import oi.i3;
import oi.n3;
import oi.q3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.gi;
import org.telegram.ui.hi;
import org.telegram.ui.hp;
import org.telegram.ui.lm;
import org.telegram.ui.ni;
import org.telegram.ui.ol;
import org.telegram.ui.sd;
import org.telegram.ui.td;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ji.p pVar;
        int i7;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                ((b1) obj).a(null, 0L, i13);
                break;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", m10.i(i13).n);
                ((o4) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                ch.f fVar = (ch.f) obj;
                if (fVar.b) {
                    z10 z10Var = fVar.d;
                    if (z10Var != null) {
                        z10Var.a(Boolean.valueOf(i13 < 300));
                        try {
                            fVar.a.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fVar.c = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.i3(new v0(fVar, max, i11), max);
                    break;
                }
                break;
            case 3:
                ConnectionsManager.getInstance(((v8) obj).a).cancelRequest(i13, true);
                break;
            case 4:
                ((f2.f) obj).b.onAudioFocusChange(i13);
                break;
            case 5:
                s6 s6Var = (s6) obj;
                ArrayList arrayList = s6Var.g;
                s6Var.v(arrayList);
                p4 p4Var = s6Var.J;
                Collections.sort(arrayList, p4Var);
                ArrayList arrayList2 = s6Var.h;
                s6Var.v(arrayList2);
                Collections.sort(arrayList2, p4Var);
                ns.f(i13).k(ns.v5, new Object[0]);
                break;
            case 6:
                ((hi.o) obj).a(Integer.valueOf(i13));
                break;
            case 7:
                ((hi.i2) obj).M0(i13);
                break;
            case 8:
                np.s1(i13).Y3((ArrayList) obj, true);
                break;
            case 9:
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
                ArrayList W = np.s1(i14).Y4() ? si.b0(i14).W(charSequenceArr, true, true) : new ArrayList();
                ArrayList W2 = np.s1(i14).Y4() ? si.b0(i14).W(new CharSequence[]{saVar.L1.C0}, true, true) : new ArrayList();
                d7 d7Var = saVar.L1;
                d7Var.k = (TextUtils.equals(d7Var.C0, charSequenceArr[0]) && si.K(W, W2)) ? false : true;
                saVar.L1.C0 = new SpannableString(saVar.d1.getText());
                saVar.y();
                saVar.x();
                d7 d7Var2 = saVar.L1;
                saVar.P1 = (d7Var2 == null || !d7Var2.K) ? 0 : 1;
                saVar.L1 = (d7) saVar.I1.get(i13);
                saVar.N(0, 1);
                saVar.M(0, 1);
                saVar.e1.b.g3.O(false);
                saVar.d1.setText(saVar.L1.C0);
                break;
            case 10:
                ((jg.h0) obj).g(i13);
                break;
            case 11:
                jh.g gVar = (jh.g) obj;
                gVar.getClass();
                try {
                    gVar.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 12:
                ji.p pVar2 = (ji.p) obj;
                ji.m mVar = pVar2.a;
                if (pVar2.n0) {
                    if (i13 == 0) {
                        String trim = mVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            gf gfVar = mVar.b;
                            mVar.g("edit", true);
                            ChatActivityEnterView chatActivityEnterView = gfVar.a;
                            int i15 = ChatActivityEnterView.N6;
                            chatActivityEnterView.n2(trim, null);
                            break;
                        }
                    } else if (i13 == 1) {
                        String trim2 = mVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            gf gfVar2 = mVar.b;
                            mVar.g("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = gfVar2.a;
                            int i16 = ChatActivityEnterView.N6;
                            chatActivityEnterView2.n2(trim2, new uc(chatActivityEnterView2, 13));
                            break;
                        }
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            int i17 = 5;
                            if (i13 != 5) {
                                RectF rectF = pVar2.d1;
                                float f10 = rectF.left;
                                float f11 = rectF.top;
                                float f12 = pVar2.h1;
                                new RectF(f10, f11 + f12, rectF.right, rectF.bottom + f12);
                                if (!mVar.n.trim().isEmpty() && (pVar = mVar.h) != null) {
                                    gf gfVar3 = mVar.b;
                                    ji.h hVar = new ji.h(mVar, i12);
                                    ChatActivityEnterView chatActivityEnterView3 = gfVar3.a;
                                    if (chatActivityEnterView3.x3 != null) {
                                        RectF rectF2 = new RectF();
                                        pVar.l(rectF2);
                                        ji.n nVar = new ji.n(pVar, pVar.getContext(), i12);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF2.left + pVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF2.top + pVar.getTop());
                                        nVar.setAlpha(0.0f);
                                        chatActivityEnterView3.U1.addView(nVar, layoutParams);
                                        nVar.post(new hp(gfVar3, nVar, new ou(pVar, i17), hVar, pVar, 2));
                                        break;
                                    }
                                }
                            } else {
                                gf gfVar4 = mVar.b;
                                if (mVar.c == 2) {
                                    gfVar4.e();
                                    an anVar = gfVar4.a.x3;
                                    if (anVar != null) {
                                        anVar.presentFragment(new v2());
                                        break;
                                    }
                                }
                            }
                        } else if (mVar.h != null && mVar.c == 2) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add("Auto-Detect");
                            boolean v = DictationAsr.v();
                            int i18 = v ? 0 : -1;
                            for (int i19 = 0; i19 < C.length; i19++) {
                                arrayList3.add(m0.l(C[i19]));
                                if (!v && i18 < 0 && DictationAsr.y(C[i19])) {
                                    i18 = i19 + 1;
                                }
                            }
                            gf gfVar5 = mVar.b;
                            ji.p pVar3 = mVar.h;
                            ji.g gVar2 = new ji.g(mVar, C, r6 ? 1 : 0);
                            ChatActivityEnterView chatActivityEnterView4 = gfVar5.a;
                            if (chatActivityEnterView4.x3 != null) {
                                RectF rectF3 = new RectF();
                                rectF3.set(pVar3.P);
                                if (!rectF3.isEmpty()) {
                                    ji.n nVar2 = new ji.n(pVar3, pVar3.getContext(), r6 ? 1 : 0);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF3.left + pVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF3.top + pVar3.getTop());
                                    nVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.U1.addView(nVar2, layoutParams2);
                                    nVar2.post(new bg.l0(gfVar5, nVar2, new ff(pVar3, r6 ? 1 : 0), arrayList3, i18, gVar2, 9));
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
            case 13:
                try {
                    SQLiteDatabase sQLiteDatabase = ((vr) obj).b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 14:
                m2.e eVar = ((l2.o0) obj).N;
                m2.a Q = eVar.Q();
                eVar.V(Q, 1034, new li.p(Q, i13, 14, r6 ? (char) 1 : (char) 0));
                break;
            case 15:
                n2.s sVar = (n2.s) ((k8.a) obj).c;
                String str = h2.l0.a;
                h2.c cVar = ((l2.z) sVar).a.C;
                l2.t tVar = new l2.t(i13, i11);
                cVar.getClass();
                ja.p(Looper.myLooper() == ((h2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.A(new f6(19, cVar, tVar));
                cVar.G(Integer.valueOf(i13));
                break;
            case 16:
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
                    q3 q3Var = ((i3) b0Var).a;
                    q3Var.r3(false);
                    q3Var.p3.n(new n3(q3Var, aVar, i13), a0Var);
                    break;
                }
                break;
            case 17:
                ConnectionsManager.lambda$onUpdateConfig$21(i13, (TLRPC.TL_config) obj);
                break;
            case 18:
                np.s1(i13).V2(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 19:
                ((org.telegram.ui.p4) ((org.telegram.ui.f) obj).b).a0(i13, true);
                break;
            case 20:
                org.telegram.ui.Cells.q1 q1Var = ((org.telegram.ui.Cells.f1) obj).a;
                int i20 = q1Var.N5;
                if (i13 == i20) {
                    org.telegram.ui.Cells.c0 c0Var = (org.telegram.ui.Cells.c0) q1Var.I5.get(i20);
                    if (c0Var != null) {
                        org.telegram.ui.Cells.y yVar = c0Var.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var.b(false);
                        if (!q1Var.Q5.r1) {
                            if (c0Var.j != null) {
                                q1Var.n();
                            } else if (c0Var.i != null) {
                                q1Var.n();
                                org.telegram.ui.Cells.l1 l1Var = q1Var.Sa;
                                if (l1Var != null) {
                                    l1Var.I1(q1Var, c0Var.i);
                                }
                            }
                        }
                    }
                    q1Var.N5 = -1;
                    q1Var.q2();
                    break;
                }
                break;
            case 21:
                td tdVar = ((sd) obj).f;
                tdVar.getClass();
                tdVar.c(i13);
                break;
            case 22:
                an anVar2 = ((gi) obj).g;
                if (anVar2.Zb == i13) {
                    anVar2.pb();
                    break;
                }
                break;
            case 23:
                an anVar3 = ((hi) obj).g;
                if (anVar3.Zb == i13) {
                    anVar3.pb();
                    break;
                }
                break;
            case 24:
                ((ni) obj).a.l(this.b, 0, true, 0, true, 0);
                break;
            case 25:
                an anVar4 = ((gi) obj).g;
                if (anVar4.Zb == i13) {
                    anVar4.pb();
                    break;
                }
                break;
            case 26:
                an anVar5 = ((hi) obj).g;
                if (anVar5.Zb == i13) {
                    anVar5.pb();
                    break;
                }
                break;
            case 27:
                an anVar6 = ((hi) obj).g;
                if (anVar6.Zb == i13) {
                    anVar6.pb();
                    break;
                }
                break;
            case 28:
                an anVar7 = ((ol) obj).x0;
                anVar7.C0.h1(i13, anVar7.N4);
                break;
            default:
                i7 = ((org.telegram.ui.ActionBar.e2) ((lm) obj).a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i13, true);
                break;
        }
    }

    public /* synthetic */ v0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
