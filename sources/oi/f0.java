package oi;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.cd;
import org.telegram.messenger.cm;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.lr;
import org.telegram.messenger.mc;
import org.telegram.messenger.mp;
import org.telegram.messenger.nr;
import org.telegram.messenger.or;
import org.telegram.messenger.sr;
import org.telegram.messenger.xo;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ad;
import org.telegram.ui.at;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.db;
import org.telegram.ui.ib;
import org.telegram.ui.jo;
import org.telegram.ui.lb;
import org.telegram.ui.mm;
import org.telegram.ui.np;
import org.telegram.ui.oa1;
import org.telegram.ui.oh;
import org.telegram.ui.rn;
import org.telegram.ui.ro;
import org.telegram.ui.sn;
import org.telegram.ui.ti;
import org.telegram.ui.vo;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements mt, g4, org.telegram.ui.Cells.u, rj0, org.telegram.ui.ActionBar.q1, ww, org.telegram.ui.u4, org.telegram.ui.Components.a5, xo, mc, gj0, fi0, lr, ResultCallback, or, oa1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 10:
                bn bnVar = (bn) this.b;
                Uri uri = (Uri) this.c;
                bnVar.E8();
                zy.Y(bnVar.getAccountInstance(), uri, bnVar.l6, bnVar.F5, bnVar.m4, null, bnVar.H5, z10, i7, bnVar.Y8());
                break;
            case 11:
            default:
                mm mmVar = (mm) this.b;
                fj fjVar = (fj) this.c;
                if (z10) {
                    mmVar.a.getMessagesController().v(fjVar.k.id, i7, org.telegram.messenger.n5.o(fjVar.k.peer_id), null, false);
                    break;
                }
                break;
            case 12:
                bn bnVar2 = (bn) this.b;
                bnVar2.getSendMessagesHelper().r0(xy.b((String) this.c, bnVar2.l6, bnVar2.F5, bnVar2.m4, null, false, null, null, null, z10, i7, 0, null, false));
                bnVar2.a0.setFieldText("");
                bnVar2.D9(false);
                break;
        }
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.fi0
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        oh ohVar = (oh) this.b;
        fj fjVar = (fj) this.c;
        bn bnVar = ohVar.p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", fjVar.e1());
        bundle.putLong("report_reaction_from_dialog_id", bnVar.l6);
        bnVar.presentFragment(new ProfileActivity(bundle, null));
        bnVar.P7(true);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.u4
    public void c(org.telegram.ui.c5 c5Var) {
        db dbVar = (db) this.b;
        TLRPC.User user = (TLRPC.User) this.c;
        int ordinal = c5Var.ordinal();
        if (ordinal == 0) {
            dbVar.a(user);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        ib ibVar = dbVar.a;
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            org.telegram.ui.ActionBar.g2 g2Var = ibVar.n;
            if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                g2Var.presentFragment(new bn(bundle));
            }
        }
    }

    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        ti tiVar = (ti) this.b;
        long j3 = ((TLRPC.User) this.c).id;
        bn bnVar = tiVar.b;
        long j10 = bnVar.s4;
        if (j3 != j10) {
            return;
        }
        bnVar.Ta(j10, false);
    }

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        bn.Q0((bn) this.b, (Context) this.c, tL_error);
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.b;
        org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.c;
        if (g4Var.L == null || i7 - 1 >= 0) {
            j9 j9Var = g4Var.Q0;
            if (j9Var != null) {
                if (j9Var.x()) {
                    g4Var.Q0.f(false);
                    return;
                }
                g4Var.Q0.f(false);
            }
            org.telegram.ui.e4 adapter = k3Var.getAdapter();
            if ((view instanceof org.telegram.ui.n3) && adapter.F != null) {
                org.telegram.ui.n3 n3Var = (org.telegram.ui.n3) view;
                if (g4Var.I0 == 0) {
                    if ((!n3Var.c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject h22 = mp.u1(g4Var.Y).h2("previews");
                        if (h22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.F.id, (TLRPC.User) h22);
                            return;
                        }
                        int i10 = j10.t0;
                        long j3 = adapter.F.id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new cm(g4Var, i10, j3));
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
            TL_iv.PageBlock x10 = org.telegram.ui.g4.x(pageBlock);
            if (x10 instanceof org.telegram.ui.u3) {
                x10 = ((org.telegram.ui.u3) x10).b;
            }
            if (x10 instanceof TL_iv.pageBlockChannel) {
                mp.u1(g4Var.Y).F3(org.telegram.messenger.v3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.N, 2, null);
                g4Var.m(false, true);
                return;
            }
            if (x10 instanceof org.telegram.ui.a4) {
                org.telegram.ui.a4 a4Var = (org.telegram.ui.a4) x10;
                g4Var.O(a4Var.a.articles.get(a4Var.b).url, null, null);
                return;
            }
            if (x10 instanceof TL_iv.pageBlockDetails) {
                View w10 = org.telegram.ui.g4.w(view);
                if (w10 instanceof org.telegram.ui.j1) {
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
                    org.telegram.ui.j1 j1Var = (org.telegram.ui.j1) w10;
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

    @Override // org.telegram.ui.Components.mt
    public void g() {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                h0 h0Var = (h0) this.c;
                i0Var.i();
                h0Var.k2();
                break;
            default:
                m5 m5Var = (m5) this.b;
                p5 p5Var = (p5) this.c;
                TL_iv.pageTableCell pagetablecell = p5Var.b;
                if (pagetablecell != null) {
                    e6.d(pagetablecell, p5Var.a.getText());
                }
                b3 b3Var = m5Var.F;
                if (b3Var != null && m5Var.a != null) {
                    t3.S1(b3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 5:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) this.b;
                View view = (View) this.c;
                p4Var.getClass();
                t1Var.dismiss();
                p4Var.b0(view, true);
                break;
            case 7:
                vf.c.p(((lb) this.b).getParentActivity(), (String) this.c, true);
                break;
            case 9:
                ad.a0((ad) this.b, (TLRPC.Chat) this.c);
                break;
            case 20:
                jo joVar = (jo) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = mp.k1(chat);
                tL_channels_updateUsername.username = "";
                joVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new sn(joVar, 0), 64);
                break;
            case 24:
                org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(n0Var.a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(n0Var, h, tL_aiComposeTone, 6));
                break;
            case 25:
                ((bg.g0) this.b).d(((boolean[]) this.c)[0]);
                break;
            case 26:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.b;
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                cd G0 = gd.E0().G0(tL_langPackLanguage.official ? "remote_" + tL_langPackLanguage.lang_code : "unofficial_" + tL_langPackLanguage.lang_code);
                if (G0 == null) {
                    G0 = new cd();
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
                gd.E0().c(G0, true, false, false, true, j10.t0, null);
                launchActivity.y0(true);
                break;
            case 27:
                at atVar = (at) this.b;
                boolean[] zArr = (boolean[]) this.c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                cx cxVar = (cx) atVar.b;
                ArrayList arrayList = (ArrayList) atVar.c;
                cxVar.getClass();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Long l10 = (Long) arrayList.get(i10);
                    long longValue = l10.longValue();
                    if (z10) {
                        cxVar.getMessagesController().w4(longValue, cxVar.getMessagesController().c2(l10), null, null, false);
                    }
                    if (z11) {
                        cxVar.getMessagesController().X(0, longValue, true);
                    }
                    cxVar.getMessagesController().w(longValue);
                }
                cxVar.p4(false);
                break;
            case 28:
                li.d dVar = (li.d) this.b;
                EditText editText = (EditText) this.c;
                t1Var.dismiss();
                dVar.a(editText.getText().toString());
                break;
            default:
                int[] iArr = (int[]) this.b;
                nr nrVar = (nr) this.c;
                int i11 = iArr[0];
                nrVar.a(i11 == 0 ? 900 : i11 == 1 ? 3600 : i11 == 2 ? 28800 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void i() {
        bn bnVar = (bn) this.b;
        ri.q qVar = (ri.q) this.c;
        bnVar.getClass();
        qVar.g();
        bnVar.O9();
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((np) this.b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.c);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public void onComplete(Object obj) {
        zm zmVar = (zm) this.b;
        cb0 cb0Var = (cb0) this.c;
        Pair pair = (Pair) obj;
        zmVar.getClass();
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        org.telegram.ui.ActionBar.s3 s3Var = zmVar.f;
        if (s3Var == null || longValue != s3Var.h(zmVar.q ? 1 : 0) || bitmap == null) {
            return;
        }
        cb0Var.x = bitmap;
        cb0Var.i();
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        AtomicReference atomicReference = (AtomicReference) this.c;
        a8.d("mlkit: failed to detect language in message");
        atomicBoolean.set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override // oi.g4
    public void run(long j3) {
        switch (this.a) {
            case 1:
                q3 q3Var = (q3) this.b;
                String str = (String) this.c;
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j3;
                q3Var.a(str, tL_inlineButtonTypeUserProfile);
                break;
            case 19:
                rn rnVar = (rn) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                rnVar.getClass();
                t1Var.dismiss();
                rnVar.O0 = false;
                if (j3 != 0) {
                    rnVar.w0 = j3;
                    TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                    rnVar.x0 = O0;
                    TLRPC.ChatFull chatFull = rnVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    boolean z10 = O0.forum_tabs != rnVar.H0;
                    boolean z11 = O0.forum_sidebar != rnVar.I0;
                    rnVar.getMessagesController().m5(rnVar.w0, rnVar.F0, rnVar.H0, rnVar.I0);
                    TLRPC.Chat chat = rnVar.x0;
                    chat.forum = rnVar.F0;
                    chat.forum_tabs = rnVar.H0;
                    chat.forum_sidebar = rnVar.I0;
                    if (z10 || z11) {
                        rnVar.v0(z10);
                        break;
                    }
                }
                break;
            case 21:
                vo voVar = (vo) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                if (j3 == 0) {
                    voVar.getClass();
                    break;
                } else {
                    voVar.getMessagesController().n5(j3, false);
                    voVar.d0(voVar.getMessagesController().O0(Long.valueOf(j3)), g2Var);
                    break;
                }
            default:
                ro roVar = (ro) this.b;
                Runnable runnable = (Runnable) this.c;
                if (j3 == 0) {
                    roVar.getClass();
                    break;
                } else {
                    vo voVar2 = roVar.y.d;
                    if (voVar2.s) {
                        voVar2.w.set(0, voVar2.getMessagesController().O0(Long.valueOf(j3)));
                    } else {
                        voVar2.F = j3;
                        voVar2.f = voVar2.getMessagesController().O0(Long.valueOf(j3));
                    }
                    runnable.run();
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) this.b;
        cx cxVar2 = (cx) this.c;
        ArrayList arrayList2 = x5Var.c;
        cxVar2.finishFragment();
        org.telegram.messenger.t2 t2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= x5Var.d.size()) {
                    z12 = false;
                    break;
                }
                if (((org.telegram.messenger.t2) x5Var.d.get(i13)).a == ((sr) arrayList.get(i12)).a) {
                    t2Var = (org.telegram.messenger.t2) x5Var.d.get(i13);
                    break;
                }
                i13++;
            }
            if (!z12) {
                int i14 = x5Var.getMessagesController().u7.c(x5Var.e) == 2 ? 3 : 2;
                ArrayList arrayList3 = x5Var.d;
                org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((sr) arrayList.get(i12)).a, i14);
                arrayList3.add(t2Var2);
                t2Var = t2Var2;
            }
            i12++;
        }
        x5Var.getMessagesController().u7.h(x5Var.e, x5Var.d);
        x5Var.Z();
        if (t2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.w5) arrayList2.get(i15)).c != null && ((org.telegram.ui.w5) arrayList2.get(i15)).c.a == t2Var.a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            x5Var.b.v0(i11);
            org.telegram.messenger.g0.h3(new t(28, x5Var, t2Var), 150L);
        }
        return true;
    }

    public /* synthetic */ f0(db dbVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        this.a = 8;
        this.b = dbVar;
        this.c = user;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public /* synthetic */ void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
