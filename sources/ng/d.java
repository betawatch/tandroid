package ng;

import ag.e0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import ei.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mg.i0;
import mg.p;
import org.telegram.messenger.bs;
import org.telegram.messenger.cd;
import org.telegram.messenger.cs;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.gp;
import org.telegram.messenger.gs;
import org.telegram.messenger.i5;
import org.telegram.messenger.jj;
import org.telegram.messenger.mm;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.pc;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w2;
import org.telegram.messenger.w3;
import org.telegram.messenger.zc;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.l;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.u;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b4;
import org.telegram.ui.b5;
import org.telegram.ui.cp;
import org.telegram.ui.f4;
import org.telegram.ui.fn;
import org.telegram.ui.gc1;
import org.telegram.ui.h0;
import org.telegram.ui.h4;
import org.telegram.ui.iq;
import org.telegram.ui.jb;
import org.telegram.ui.kd;
import org.telegram.ui.ki;
import org.telegram.ui.l1;
import org.telegram.ui.l3;
import org.telegram.ui.mp;
import org.telegram.ui.nj;
import org.telegram.ui.o3;
import org.telegram.ui.oo;
import org.telegram.ui.p4;
import org.telegram.ui.pb;
import org.telegram.ui.pb1;
import org.telegram.ui.po;
import org.telegram.ui.qp;
import org.telegram.ui.rv;
import org.telegram.ui.sb;
import org.telegram.ui.sn;
import org.telegram.ui.t4;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.v3;
import org.telegram.ui.w5;
import org.telegram.ui.x5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ux, u, hk0, u1, t4, q4, gp, pc, uj0, ui0, zr, ResultCallback, cs, gc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 8:
                un unVar = (un) this.b;
                Uri uri = (Uri) this.c;
                unVar.v8();
                qz.Y(unVar.getAccountInstance(), uri, unVar.j6, unVar.D5, unVar.l4, null, unVar.F5, z10, i10, unVar.P8());
                break;
            case 9:
            default:
                fn fnVar = (fn) this.b;
                jj jjVar = (jj) this.c;
                if (z10) {
                    fnVar.a.getMessagesController().v(jjVar.k.id, i10, o5.o(jjVar.k.peer_id), null, false);
                    break;
                }
                break;
            case 10:
                un unVar2 = (un) this.b;
                unVar2.getSendMessagesHelper().r0(oz.b((String) this.c, unVar2.j6, unVar2.D5, unVar2.l4, null, false, null, null, null, z10, i10, 0, null, false));
                unVar2.Z.setFieldText("");
                unVar2.r9(false);
                break;
        }
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.gp
    public boolean a(TLRPC.TL_error tL_error) {
        un.R0((un) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        h4 h4Var = (h4) this.b;
        l3 l3Var = (l3) this.c;
        if (h4Var.K == null || i10 - 1 >= 0) {
            k9 k9Var = h4Var.P0;
            if (k9Var != null) {
                if (k9Var.x()) {
                    h4Var.P0.f(false);
                    return;
                }
                h4Var.P0.f(false);
            }
            f4 adapter = l3Var.getAdapter();
            if ((view instanceof o3) && adapter.E != null) {
                o3 o3Var = (o3) view;
                if (h4Var.H0 == 0) {
                    if ((!o3Var.c || f7 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                        TLObject e22 = vp.r1(h4Var.X).e2("previews");
                        if (e22 instanceof TLRPC.TL_user) {
                            h4Var.N(adapter.E.id, (TLRPC.User) e22);
                            return;
                        }
                        int i11 = d20.s0;
                        long j10 = adapter.E.id;
                        h4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        h4Var.H0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new mm(h4Var, i11, j10));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 < 0 || i10 >= adapter.d.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
            TL_iv.PageBlock x10 = h4.x(pageBlock);
            if (x10 instanceof v3) {
                x10 = ((v3) x10).b;
            }
            if (x10 instanceof TL_iv.pageBlockChannel) {
                vp.r1(h4Var.X).v3(w3.K(((TL_iv.pageBlockChannel) x10).channel, false), h4Var.M, 2, null);
                h4Var.m(false, true);
                return;
            }
            if (x10 instanceof b4) {
                b4 b4Var = (b4) x10;
                h4Var.O(b4Var.a.articles.get(b4Var.b).url, null, null);
                return;
            }
            if (x10 instanceof TL_iv.pageBlockDetails) {
                View w9 = h4.w(view);
                if (w9 instanceof l1) {
                    h4Var.d = null;
                    h4Var.f = null;
                    if (adapter.e.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                    pageblockdetails.open = !pageblockdetails.open;
                    int b10 = adapter.b();
                    adapter.M();
                    int abs = Math.abs(adapter.b() - b10);
                    l1 l1Var = (l1) w9;
                    l1Var.f.a(pageblockdetails.open ? 0.0f : 1.0f);
                    l1Var.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.o(i10 + 1, abs);
                        } else {
                            adapter.p(i10 + 1, abs);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        ki kiVar = (ki) this.b;
        jj jjVar = (jj) this.c;
        un unVar = kiVar.p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", jjVar.f1());
        bundle.putLong("report_reaction_from_dialog_id", unVar.j6);
        unVar.presentFragment(new ProfileActivity(bundle, null));
        unVar.I7(true);
    }

    @Override // org.telegram.ui.t4
    public void d(b5 b5Var) {
        jb jbVar = (jb) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            jbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        pb pbVar = jbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            k2 k2Var = pbVar.n;
            if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                k2Var.presentFragment(new un(bundle));
            }
        }
    }

    @Override // org.telegram.ui.Components.uj0
    public void g() {
        un unVar = (un) this.b;
        r rVar = (r) this.c;
        unVar.getClass();
        rVar.g();
        unVar.C9();
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 3:
                p4 p4Var = (p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                x1Var.dismiss();
                p4Var.a0(view, true);
                break;
            case 5:
                gf.f.n(((sb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 7:
                kd.Z((kd) this.b, (TLRPC.Chat) this.c);
                break;
            case 18:
                cp cpVar = (cp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = vp.h1(chat);
                tL_channels_updateUsername.username = "";
                cpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new po(cpVar, 0), 64);
                break;
            case 22:
                g0 g0Var = (g0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(g0Var.a).sendRequestTyped(deletetone, new a3.b(1), new org.telegram.tgnet.e(g0Var, h, tL_aiComposeTone, 1));
                break;
            case 23:
                ((i0) this.b).i(((boolean[]) this.c)[0]);
                break;
            case 24:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                zc F0 = cd.D0().F0(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (F0 == null) {
                    F0 = new zc();
                    F0.a = tL_langPackLanguage.native_name;
                    F0.b = tL_langPackLanguage.name;
                    F0.c = tL_langPackLanguage.lang_code;
                    F0.e = tL_langPackLanguage.base_lang_code;
                    F0.f = tL_langPackLanguage.plural_code;
                    F0.g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        F0.d = "remote";
                    } else {
                        F0.d = "unofficial";
                    }
                }
                cd.D0().c(F0, true, false, false, true, d20.s0, null);
                launchActivity.y0(true);
                break;
            case 25:
                rv rvVar = (rv) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                ay ayVar = (ay) rvVar.b;
                ArrayList arrayList = (ArrayList) rvVar.c;
                ayVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l4 = (Long) arrayList.get(i11);
                    long longValue = l4.longValue();
                    if (z10) {
                        ayVar.getMessagesController().l4(longValue, ayVar.getMessagesController().Z1(l4), null, null, false);
                    }
                    if (z11) {
                        ayVar.getMessagesController().X(0, longValue, true);
                    }
                    ayVar.getMessagesController().w(longValue);
                }
                ayVar.m4(false);
                break;
            case 26:
                e0 e0Var = (e0) this.b;
                EditText editText = (EditText) this.c;
                x1Var.dismiss();
                e0Var.a(editText.getText().toString());
                break;
            case 27:
                int[] iArr = (int[]) this.b;
                bs bsVar = (bs) this.c;
                int i12 = iArr[0];
                bsVar.a(i12 == 0 ? 900 : i12 == 1 ? 3600 : i12 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            case 28:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                q0.a aVar = (q0.a) this.c;
                atomicBoolean.set(true);
                aVar.accept(Boolean.FALSE);
                break;
            default:
                String str = (String) this.c;
                k2 k2Var = (k2) this.b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", i5.r(k2Var.getCurrentAccount()).s(1));
                    k2Var.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                }
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        nj njVar = (nj) this.b;
        long j10 = ((TLRPC.User) this.c).id;
        un unVar = njVar.b;
        long j11 = unVar.r4;
        if (j10 != j11) {
            return;
        }
        unVar.Ga(j11, false);
    }

    @Override // org.telegram.ui.gc1
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((iq) this.b).t0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        sn snVar = (sn) this.b;
        jb0 jb0Var = (jb0) this.c;
        Pair pair = (Pair) obj;
        snVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        y3 y3Var = snVar.f;
        if (y3Var == null || longValue != y3Var.h(snVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        jb0Var.x = bitmap;
        jb0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        l.a(this, th2);
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        f8.d("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        switch (this.a) {
            case 17:
                oo ooVar = (oo) this.b;
                x1 x1Var = (x1) this.c;
                ooVar.getClass();
                x1Var.dismiss();
                ooVar.N0 = false;
                if (j10 != 0) {
                    ooVar.v0 = j10;
                    TLRPC.Chat L0 = ooVar.getMessagesController().L0(Long.valueOf(j10));
                    ooVar.w0 = L0;
                    TLRPC.ChatFull chatFull = ooVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = L0.forum_tabs != ooVar.G0;
                    boolean z11 = L0.forum_sidebar != ooVar.H0;
                    ooVar.getMessagesController().X4(ooVar.v0, ooVar.E0, ooVar.G0, ooVar.H0);
                    TLRPC.Chat chat = ooVar.w0;
                    chat.forum = ooVar.E0;
                    chat.forum_tabs = ooVar.G0;
                    chat.forum_sidebar = ooVar.H0;
                    if (z10 || z11) {
                        ooVar.u0(z10);
                        break;
                    }
                }
                break;
            case 18:
            default:
                mp mpVar = (mp) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j10 == 0) {
                    mpVar.getClass();
                    break;
                } else {
                    qp qpVar = mpVar.y.d;
                    if (qpVar.s) {
                        qpVar.w.set(0, qpVar.getMessagesController().L0(Long.valueOf(j10)));
                    } else {
                        qpVar.E = j10;
                        qpVar.f = qpVar.getMessagesController().L0(Long.valueOf(j10));
                    }
                    runnable.run();
                    break;
                }
            case 19:
                qp qpVar2 = (qp) this.b;
                k2 k2Var = (k2) this.c;
                if (j10 == 0) {
                    qpVar2.getClass();
                    break;
                } else {
                    qpVar2.getMessagesController().Y4(j10, false);
                    qpVar2.c0(qpVar2.getMessagesController().L0(Long.valueOf(j10)), k2Var);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                String str = (String) this.c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((gs) arrayList.get(i12)).a;
                    fVar.e.getSendMessagesHelper().r0(oz.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                ayVar.finishFragment();
                p.h(j10);
                break;
            default:
                x5 x5Var = (x5) this.b;
                ay ayVar2 = (ay) this.c;
                ArrayList arrayList2 = x5Var.c;
                ayVar2.finishFragment();
                w2 w2Var = null;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    boolean z12 = true;
                    if (i14 >= arrayList.size()) {
                        x5Var.getMessagesController().s7.h(x5Var.e, x5Var.d);
                        x5Var.Y();
                        if (w2Var != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((w5) arrayList2.get(i15)).c == null || ((w5) arrayList2.get(i15)).c.a != w2Var.a) {
                                        i15++;
                                    } else {
                                        i13 = i15;
                                    }
                                }
                            }
                            x5Var.b.v0(i13);
                            org.telegram.messenger.i0.h3(new h0(5, x5Var, w2Var), 150L);
                            break;
                        }
                    } else {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= x5Var.d.size()) {
                                z12 = false;
                            } else if (((w2) x5Var.d.get(i16)).a == ((gs) arrayList.get(i14)).a) {
                                w2Var = (w2) x5Var.d.get(i16);
                            } else {
                                i16++;
                            }
                        }
                        if (!z12) {
                            int i17 = x5Var.getMessagesController().s7.c(x5Var.e) == 2 ? 3 : 2;
                            ArrayList arrayList3 = x5Var.d;
                            w2 w2Var2 = new w2(((gs) arrayList.get(i14)).a, i17);
                            arrayList3.add(w2Var2);
                            w2Var = w2Var2;
                        }
                        i14++;
                    }
                }
                break;
        }
        return true;
    }

    public /* synthetic */ d(String str, k2 k2Var) {
        this.a = 29;
        this.c = str;
        this.b = k2Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        l.b(this, tL_error);
    }

    public /* synthetic */ d(jb jbVar, q1 q1Var, TLRPC.User user) {
        this.a = 6;
        this.b = jbVar;
        this.c = user;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
