package ni;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import bg.f0;
import bi.t0;
import bi.ya;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.z0;
import org.telegram.messenger.a8;
import org.telegram.messenger.bp;
import org.telegram.messenger.ed;
import org.telegram.messenger.ez;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.im;
import org.telegram.messenger.m5;
import org.telegram.messenger.oc;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.s2;
import org.telegram.messenger.sr;
import org.telegram.messenger.t3;
import org.telegram.messenger.tr;
import org.telegram.messenger.xr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r3;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.u;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a4;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.c5;
import org.telegram.ui.e4;
import org.telegram.ui.eb;
import org.telegram.ui.g4;
import org.telegram.ui.go;
import org.telegram.ui.j1;
import org.telegram.ui.jb;
import org.telegram.ui.k3;
import org.telegram.ui.kp;
import org.telegram.ui.la1;
import org.telegram.ui.lm;
import org.telegram.ui.mb;
import org.telegram.ui.n3;
import org.telegram.ui.oh;
import org.telegram.ui.oo;
import org.telegram.ui.p4;
import org.telegram.ui.pn;
import org.telegram.ui.qn;
import org.telegram.ui.qw;
import org.telegram.ui.si;
import org.telegram.ui.so;
import org.telegram.ui.u3;
import org.telegram.ui.u4;
import org.telegram.ui.v91;
import org.telegram.ui.w5;
import org.telegram.ui.ww;
import org.telegram.ui.x5;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements p, u, cj0, r1, qw, u4, t4, bp, oc, qi0, qh0, qr, ResultCallback, tr, la1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 8:
                an anVar = (an) this.b;
                Uri uri = (Uri) this.c;
                anVar.C8();
                gz.Y(anVar.getAccountInstance(), uri, anVar.j6, anVar.D5, anVar.l4, null, anVar.F5, z9, i7, anVar.W8());
                break;
            case 9:
            default:
                lm lmVar = (lm) this.b;
                ij ijVar = (ij) this.c;
                if (z9) {
                    lmVar.a.getMessagesController().v(ijVar.k.id, i7, m5.o(ijVar.k.peer_id), null, false);
                    break;
                }
                break;
            case 10:
                an anVar2 = (an) this.b;
                anVar2.getSendMessagesHelper().r0(ez.b((String) this.c, anVar2.j6, anVar2.D5, anVar2.l4, null, false, null, null, null, z9, i7, 0, null, false));
                anVar2.Z.setFieldText("");
                anVar2.B9(false);
                break;
        }
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        an.O0((an) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.Components.qh0
    public void b(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        oh ohVar = (oh) this.b;
        ij ijVar = (ij) this.c;
        an anVar = ohVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", ijVar.f1());
        bundle.putLong("report_reaction_from_dialog_id", anVar.j6);
        anVar.presentFragment(new ProfileActivity(bundle, null));
        anVar.O7(true);
    }

    @Override // org.telegram.ui.u4
    public void c(c5 c5Var) {
        eb ebVar = (eb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = c5Var.ordinal();
        if (ordinal == 0) {
            ebVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        jb jbVar = ebVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            f2 f2Var = jbVar.n;
            if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                f2Var.presentFragment(new an(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.qi0
    public void e() {
        an anVar = (an) this.b;
        oi.q qVar = (oi.q) this.c;
        anVar.getClass();
        qVar.g();
        anVar.M9();
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        g4 g4Var = (g4) this.b;
        k3 k3Var = (k3) this.c;
        if (g4Var.K == null || i7 - 1 >= 0) {
            i9 i9Var = g4Var.P0;
            if (i9Var != null) {
                if (i9Var.x()) {
                    g4Var.P0.f(false);
                    return;
                }
                g4Var.P0.f(false);
            }
            e4 adapter = k3Var.getAdapter();
            if ((view instanceof n3) && adapter.E != null) {
                n3 n3Var = (n3) view;
                if (g4Var.H0 == 0) {
                    if ((!n3Var.c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject f22 = qp.s1(g4Var.X).f2("previews");
                        if (f22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.E.id, (TLRPC.User) f22);
                            return;
                        }
                        int i10 = p10.s0;
                        long j3 = adapter.E.id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.H0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new im(g4Var, i10, j3));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 < 0 || i7 >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
            TL_iv.PageBlock x10 = g4.x(pageBlock);
            if (x10 instanceof u3) {
                x10 = ((u3) x10).b;
            }
            if (x10 instanceof TL_iv.pageBlockChannel) {
                qp.s1(g4Var.X).y3(t3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.M, 2, null);
                g4Var.m(false, true);
                return;
            }
            if (x10 instanceof a4) {
                a4 a4Var = (a4) x10;
                g4Var.O(a4Var.a.articles.get(a4Var.b).url, null, null);
                return;
            }
            if (x10 instanceof TL_iv.pageBlockDetails) {
                View w10 = g4.w(view);
                if (w10 instanceof j1) {
                    g4Var.d = null;
                    g4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int b10 = adapter.b();
                    adapter.M();
                    int abs = Math.abs(adapter.b() - b10);
                    j1 j1Var = (j1) w10;
                    j1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    j1Var.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.o(i7 + 1, abs);
                        } else {
                            adapter.p(i7 + 1, abs);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                p4 p4Var = (p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                u1Var.dismiss();
                p4Var.b0(view, true);
                break;
            case 5:
                vf.c.p(((mb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 7:
                bd.a0((bd) this.b, (TLRPC.Chat) this.c);
                break;
            case 18:
                go goVar = (go) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = qp.i1(chat);
                tL_channels_updateUsername.username = "";
                goVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new qn(goVar, 0), 64);
                break;
            case 22:
                g0 g0Var = (g0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(g0Var.a).sendRequestTyped(deletetone, new d3.b(1), new t0(g0Var, h, tL_aiComposeTone, 3));
                break;
            case 23:
                ((f0) this.b).k(((boolean[]) this.c)[0]);
                break;
            case 24:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                ed G0 = hd.E0().G0(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (G0 == null) {
                    G0 = new ed();
                    G0.a = tL_langPackLanguage.native_name;
                    G0.b = tL_langPackLanguage.name;
                    G0.c = tL_langPackLanguage.lang_code;
                    G0.e = tL_langPackLanguage.base_lang_code;
                    G0.f = tL_langPackLanguage.plural_code;
                    G0.g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        G0.d = "remote";
                    } else {
                        G0.d = "unofficial";
                    }
                }
                hd.E0().c(G0, true, false, false, true, p10.s0, null);
                launchActivity.y0(true);
                break;
            case 25:
                org.telegram.ui.Components.f2 f2Var = (org.telegram.ui.Components.f2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z9 = zArr[0];
                boolean z10 = zArr[1];
                ww wwVar = (ww) f2Var.b;
                ArrayList arrayList = (ArrayList) f2Var.c;
                wwVar.getClass();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Long l10 = (Long) arrayList.get(i10);
                    long longValue = l10.longValue();
                    if (z9) {
                        wwVar.getMessagesController().o4(longValue, wwVar.getMessagesController().a2(l10), null, null, false);
                    }
                    if (z10) {
                        wwVar.getMessagesController().X(0, longValue, true);
                    }
                    wwVar.getMessagesController().w(longValue);
                }
                wwVar.n4(false);
                break;
            case 26:
                org.telegram.messenger.voip.k kVar = (org.telegram.messenger.voip.k) this.b;
                EditText editText = (EditText) this.c;
                u1Var.dismiss();
                kVar.a(editText.getText().toString());
                break;
            case 27:
                int[] iArr = (int[]) this.b;
                sr srVar = (sr) this.c;
                int i11 = iArr[0];
                srVar.a(i11 == 0 ? 900 : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            default:
                String str = (String) this.b;
                f2 f2Var2 = (f2) this.c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", g5.r(f2Var2.getCurrentAccount()).s(1));
                    f2Var2.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
        }
    }

    @Override // ni.p
    public void i(j2.n nVar) {
        org.telegram.messenger.g0.h3(new z0((SpannableString) this.b, nVar, (ya) this.c, 12));
    }

    @Override // org.telegram.ui.la1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((kp) this.b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        si siVar = (si) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        an anVar = siVar.b;
        long j10 = anVar.r4;
        if (j3 != j10) {
            return;
        }
        anVar.Qa(j10, false);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        ym ymVar = (ym) this.b;
        qa0 qa0Var = (qa0) this.c;
        Pair pair = (Pair) obj;
        ymVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        r3 r3Var = ymVar.f;
        if (r3Var == null || longValue != r3Var.h(ymVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        qa0Var.x = bitmap;
        qa0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        a8.d("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        switch (this.a) {
            case 17:
                pn pnVar = (pn) this.b;
                u1 u1Var = (u1) this.c;
                pnVar.getClass();
                u1Var.dismiss();
                pnVar.N0 = false;
                if (j3 != 0) {
                    pnVar.v0 = j3;
                    TLRPC.Chat M0 = pnVar.getMessagesController().M0(Long.valueOf(j3));
                    pnVar.w0 = M0;
                    TLRPC.ChatFull chatFull = pnVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z9 = M0.forum_tabs != pnVar.G0;
                    boolean z10 = M0.forum_sidebar != pnVar.H0;
                    pnVar.getMessagesController().a5(pnVar.v0, pnVar.E0, pnVar.G0, pnVar.H0);
                    TLRPC.Chat chat = pnVar.w0;
                    chat.forum = pnVar.E0;
                    chat.forum_tabs = pnVar.G0;
                    chat.forum_sidebar = pnVar.H0;
                    if (z9 || z10) {
                        pnVar.v0(z9);
                        break;
                    }
                }
                break;
            case 18:
            default:
                oo ooVar = (oo) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    ooVar.getClass();
                    break;
                } else {
                    so soVar = ooVar.y.d;
                    if (soVar.s) {
                        soVar.w.set(0, soVar.getMessagesController().M0(Long.valueOf(j3)));
                    } else {
                        soVar.E = j3;
                        soVar.f = soVar.getMessagesController().M0(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
            case 19:
                so soVar2 = (so) this.b;
                f2 f2Var = (f2) this.c;
                if (j3 == 0) {
                    soVar2.getClass();
                    break;
                } else {
                    soVar2.getMessagesController().b5(j3, false);
                    soVar2.d0(soVar2.getMessagesController().M0(Long.valueOf(j3)), f2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        x5 x5Var = (x5) this.b;
        ww wwVar2 = (ww) this.c;
        ArrayList arrayList2 = x5Var.c;
        wwVar2.finishFragment();
        s2 s2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= x5Var.d.size()) {
                    z11 = false;
                    break;
                }
                if (((s2) x5Var.d.get(i13)).a == ((xr) arrayList.get(i12)).a) {
                    s2Var = (s2) x5Var.d.get(i13);
                    break;
                }
                i13++;
            }
            if (!z11) {
                int i14 = x5Var.getMessagesController().r7.c(x5Var.e) == 2 ? 3 : 2;
                ArrayList arrayList3 = x5Var.d;
                s2 s2Var2 = new s2(((xr) arrayList.get(i12)).a, i14);
                arrayList3.add(s2Var2);
                s2Var = s2Var2;
            }
            i12++;
        }
        x5Var.getMessagesController().r7.h(x5Var.e, x5Var.d);
        x5Var.Z();
        if (s2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((w5) arrayList2.get(i15)).c != null && ((w5) arrayList2.get(i15)).c.a == s2Var.a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            x5Var.b.v0(i11);
            org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(11, x5Var, s2Var), 150L);
        }
        return true;
    }

    public /* synthetic */ c(eb ebVar, q1 q1Var, TLRPC.User user) {
        this.a = 6;
        this.b = ebVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
