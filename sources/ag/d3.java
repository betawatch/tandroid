package ag;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import bi.a4;
import bi.d4;
import bi.v3;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.sf;
import org.telegram.ui.aj;
import org.telegram.ui.bj;
import org.telegram.ui.er0;
import org.telegram.ui.fj;
import org.telegram.ui.fn;
import org.telegram.ui.ge;
import org.telegram.ui.he;
import org.telegram.ui.km;
import org.telegram.ui.kq0;
import org.telegram.ui.p4;
import org.telegram.ui.un;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d3(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        CharSequence charSequence;
        int i11 = this.a;
        int i12 = 11;
        int i13 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final int i14 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = ((hs) obj).b;
                    sQLiteDatabase.executeFast("DELETE FROM business_replies WHERE topic_id = " + i14).stepThis().dispose();
                    sQLiteDatabase.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i14).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                bi.g0 g0Var = (bi.g0) obj;
                bi.j0 j0Var = g0Var.f;
                if (g0Var.c && j0Var.E != null && j0Var.a != null) {
                    g0Var.d = true;
                    g0Var.a.m(false);
                    try {
                        g0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    bi.h0 h0Var = j0Var.E;
                    bi.a aVar = j0Var.a;
                    d4 d4Var = ((v3) h0Var).a;
                    d4Var.r3(false);
                    d4Var.o3.v(new a4(d4Var, aVar, i14), g0Var);
                    break;
                }
                break;
            case 2:
                ((c2.f) obj).b.onAudioFocusChange(i14);
                break;
            case 3:
                ((qx) obj).w0(i14, 0, null);
                break;
            case 4:
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var != null) {
                    try {
                        x1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: gf.b
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(d20.s0).cancelRequest(i14, true);
                            }
                        });
                        x1VarArr[0].show();
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 5:
                j2.g gVar = ((i2.s0) obj).M;
                j2.a Q = gVar.Q();
                gVar.V(Q, 1034, new j2.c(Q, i14, i12, (char) (objArr == true ? 1 : 0)));
                break;
            case 6:
                jg.j jVar = (jg.j) obj;
                jVar.L = i14;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                ValueAnimator valueAnimator = jVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(gr.f);
                jVar.P.addUpdateListener(new jg.f(jVar, 5));
                jVar.P.addListener(new jg.g(jVar, i13));
                jVar.P.start();
                break;
            case 7:
                er0 er0Var = (er0) obj;
                ig.q1 q1Var = er0Var.t1;
                er0Var.r0(q1Var, null);
                ig.s0.e(i14).j(q1Var.c);
                break;
            case 8:
                zs.f(i14).k(zs.s3, Boolean.FALSE);
                ((jg.v2) obj).h();
                break;
            case 9:
                k2.w wVar = (k2.w) ((hf.b) obj).c;
                String str = e2.l0.a;
                e2.c cVar = ((i2.c0) wVar).a.C;
                i2.w wVar2 = new i2.w(i14, i13);
                cVar.getClass();
                t6.p(Looper.myLooper() == ((e2.i0) cVar.c).a.getLooper());
                cVar.a++;
                cVar.n(new d1.e(7, cVar, wVar2));
                cVar.t(Integer.valueOf(i14));
                break;
            case 10:
                p80 p80Var = ((mg.n1) obj).e;
                try {
                    if (p80Var.getLayout().getLineForOffset(i14) == 0) {
                        p80Var.getEditableText().insert(i14, "\n");
                        break;
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
                break;
            case 11:
                ConnectionsManager.lambda$onUpdateConfig$21(i14, (TLRPC.TL_config) obj);
                break;
            case 12:
                vp.r1(i14).T2(0, ((TLRPC.Chat) obj).id, true);
                break;
            case 13:
                ((p4) ((org.telegram.ui.e) obj).b).Z(i14, true);
                break;
            case 14:
                org.telegram.ui.Cells.q1 q1Var2 = ((org.telegram.ui.Cells.d1) obj).a;
                int i15 = q1Var2.L5;
                if (i14 == i15) {
                    org.telegram.ui.Cells.c0 c0Var = (org.telegram.ui.Cells.c0) q1Var2.G5.get(i15);
                    if (c0Var != null) {
                        org.telegram.ui.Cells.y yVar = c0Var.s;
                        if (yVar != null) {
                            yVar.setState(StateSet.NOTHING);
                        }
                        c0Var.b(false);
                        if (!q1Var2.O5.p1) {
                            if (c0Var.j != null) {
                                q1Var2.m();
                            } else if (c0Var.i != null) {
                                q1Var2.m();
                                org.telegram.ui.Cells.l1 l1Var = q1Var2.Qa;
                                if (l1Var != null) {
                                    l1Var.q1(q1Var2, c0Var.i);
                                }
                            }
                        }
                    }
                    q1Var2.L5 = -1;
                    q1Var2.n2();
                    break;
                }
                break;
            case 15:
                he heVar = ((ge) obj).f;
                heVar.getClass();
                heVar.c(i14);
                break;
            case 16:
                ((fj) obj).a.k(this.b, 0, true, 0, true, 0);
                break;
            case 17:
                un unVar = ((aj) obj).g;
                if (unVar.Rb == i14) {
                    unVar.bb();
                    break;
                }
                break;
            case 18:
                un unVar2 = ((bj) obj).g;
                if (unVar2.Rb == i14) {
                    unVar2.bb();
                    break;
                }
                break;
            case 19:
                un unVar3 = ((aj) obj).g;
                if (unVar3.Rb == i14) {
                    unVar3.bb();
                    break;
                }
                break;
            case 20:
                un unVar4 = ((bj) obj).g;
                if (unVar4.Rb == i14) {
                    unVar4.bb();
                    break;
                }
                break;
            case 21:
                un unVar5 = ((bj) obj).g;
                if (unVar5.Rb == i14) {
                    unVar5.bb();
                    break;
                }
                break;
            case 22:
                un unVar6 = ((km) obj).w0;
                unVar6.B0.h1(i14, unVar6.M4);
                break;
            case 23:
                i10 = ((org.telegram.ui.ActionBar.k2) ((fn) obj).a).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(i14, true);
                break;
            case 24:
                zs.f(i14).k(4, new Object[0]);
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.q1((zr) obj, 1), 250L);
                break;
            case 25:
                p80 p80Var2 = (p80) obj;
                ArrayList v = i5.r(i14).v(11);
                String L0 = cd.L0(2131751242, null);
                if (v != null && !v.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < v.size()) {
                            if (v.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                L0 = cd.L0(2131751242, null);
                            } else {
                                if ((v.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    L0 = cd.L0(2131751243, null);
                                }
                                i16++;
                            }
                        }
                    }
                }
                p80Var2.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(L0, new org.telegram.ui.Components.f1(objArr2 == true ? 1 : 0, v)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(0.66f)));
                break;
            case 26:
                ((m4.n0) obj).t(i14);
                break;
            case 27:
                nc ncVar = (nc) obj;
                vh.p2 p2Var = ncVar.c1;
                if (ncVar.a1 != i14) {
                    ncVar.setTimer(i14);
                    q20 q20Var = ncVar.q1;
                    if (q20Var != null) {
                        q20Var.a(Integer.valueOf(i14));
                    }
                    if (i14 == 0) {
                        charSequence = cd.L0(ncVar.p1 ? 2131744153 : 2131744158, null);
                        p2Var.h = ncVar.getMeasuredWidth();
                        p2Var.p(false);
                        p2Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        p2Var.e0 = org.telegram.messenger.i0.L(0);
                        p2Var.d0 = -org.telegram.messenger.i0.L(1.0f);
                    } else if (i14 == Integer.MAX_VALUE) {
                        charSequence = cd.L0(ncVar.p1 ? 2131744152 : 2131744157, null);
                        p2Var.h = ncVar.getMeasuredWidth();
                        p2Var.p(false);
                        p2Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        p2Var.e0 = org.telegram.messenger.i0.L(0);
                        p2Var.d0 = -org.telegram.messenger.i0.L(1.0f);
                    } else if (i14 > 0) {
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.G(i14, ncVar.p1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        p2Var.p(true);
                        p2Var.h = vh.p2.a(W2, p2Var.getTextPaint());
                        p2Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        p2Var.e0 = org.telegram.messenger.i0.L(2);
                        p2Var.d0 = 0.0f;
                        charSequence = W2;
                    }
                    p2Var.setTranslationY(((-Math.min(org.telegram.messenger.i0.L(34.0f), ncVar.getEditTextHeight())) - org.telegram.messenger.i0.L(14.0f)) * (ncVar instanceof kq0 ? -1.0f : 1.0f));
                    p2Var.s(charSequence);
                    bi0 bi0Var = new bi0(i14 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f));
                    bi0Var.start();
                    p2Var.j(bi0Var);
                    p2Var.u();
                    ncVar.n1 = false;
                    org.telegram.messenger.i0.r(ncVar.o1);
                    ncVar.invalidate();
                    break;
                }
                break;
            case 28:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i14 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        gfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                im imVar = (im) obj;
                jm jmVar = imVar.P;
                if (i14 == imVar.O && jmVar.x.isShown()) {
                    jmVar.x.d(1, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d3(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
