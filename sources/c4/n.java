package c4;

import a8.la;
import android.content.SharedPreferences;
import android.widget.EditText;
import fi.l5;
import h2.x;
import java.util.List;
import org.telegram.messenger.di;
import org.telegram.messenger.g0;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.sr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.jt0;
import p4.a1;
import p4.c1;
import p4.e0;
import p4.e1;
import p4.i1;
import p4.v;
import w7.s;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements h2.j, h2.o, RequestDelegateTimestamp, q1, sr, a1, c1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(long j3, int i7, Object obj, int i10) {
        this.a = i10;
        this.c = j3;
        this.b = i7;
        this.d = obj;
    }

    @Override // org.telegram.messenger.sr
    public void a(String str) {
        jt0.f((jt0) this.d, this.c, this.b, str);
    }

    @Override // h2.j
    public void accept(Object obj) {
        o oVar = (o) this.d;
        a aVar = (a) obj;
        oVar.h.getClass();
        byte[] a02 = s.a0(aVar.a, aVar.c);
        x xVar = oVar.c;
        xVar.getClass();
        xVar.L(a02.length, a02);
        oVar.a.b(a02.length, xVar);
        long j3 = aVar.b;
        long j10 = this.c;
        if (j3 == -9223372036854775807L) {
            la.p(oVar.h.x == Long.MAX_VALUE);
        } else {
            long j11 = oVar.h.x;
            j10 = j11 == Long.MAX_VALUE ? j10 + j3 : j3 + j11;
        }
        oVar.a.c(j10, this.b | 1, a02.length, 0, null);
    }

    @Override // p4.a1
    public void c(i1 i1Var, v vVar) {
        e1 e1Var = (e1) this.d;
        i1Var.s(e1Var.m1(vVar, i1Var, this.b), this.c);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        int i10 = this.a;
        Object obj = this.d;
        int i11 = this.b;
        long j3 = this.c;
        switch (i10) {
            case 3:
                EditText editText = (EditText) obj;
                if (j3 > 0) {
                    TLRPC.UserFull d2 = np.u1(i11).d2(k10.i(i11).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (d2 != null) {
                        String str = d2.about;
                        if ((str != null ? str : "").equals(trim)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            break;
                        } else {
                            d2.about = trim;
                            ls.f(i11).k(67, Long.valueOf(j3), d2);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    ls.e().k(ls.S4, 2, Long.valueOf(j3));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new l5(18), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull P0 = np.u1(i11).P0(j10);
                    String obj2 = editText.getText().toString();
                    if (P0 != null) {
                        String str2 = P0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            break;
                        } else {
                            P0.about = obj2;
                            ls f10 = ls.f(i11);
                            Boolean bool = Boolean.FALSE;
                            f10.k(30, P0, 0, bool, bool);
                        }
                    }
                    ls.e().k(ls.S4, 2, Long.valueOf(j3));
                    np u12 = np.u1(i11);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = u12.l1(-j10);
                    tL_messages_editChatAbout.about = obj2;
                    u12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new di(u12, P0, obj2, 7), 64);
                }
                t1Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = np.u1(k10.t0).g7.edit();
                if (j3 != 0) {
                    edit.putInt("color_" + j3, 0);
                } else if (i11 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i11 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i11 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i11 == 5 || i11 == 4) {
                    edit.putInt("ReactionsLed", 0);
                } else {
                    edit.putInt("ChannelLed", 0);
                }
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        ((m2.b) obj).c((m2.a) this.d, this.b, this.c);
    }

    @Override // p4.c1
    public Object k(e0 e0Var, v vVar, int i7) {
        List list = (List) this.d;
        int i10 = this.b;
        return e0Var.q(vVar, list, i10 == -1 ? e0Var.t.o0() : i10, i10 == -1 ? e0Var.t.l() : this.c);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.b, this.c, tLObject, tL_error, j3);
    }

    public /* synthetic */ n(Object obj, int i7, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = j3;
    }

    public /* synthetic */ n(Object obj, long j3, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = j3;
        this.b = i7;
    }

    public /* synthetic */ n(m2.a aVar, int i7, long j3, long j10) {
        this.a = 1;
        this.d = aVar;
        this.b = i7;
        this.c = j3;
    }
}
