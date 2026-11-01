package j2;

import ag.c3;
import android.content.SharedPreferences;
import android.widget.EditText;
import e2.o;
import e2.x;
import java.util.List;
import m4.f0;
import m4.f1;
import m4.h1;
import m4.j1;
import m4.n1;
import m4.w;
import org.telegram.messenger.at;
import org.telegram.messenger.di;
import org.telegram.messenger.e20;
import org.telegram.messenger.gs;
import org.telegram.messenger.i0;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.au0;
import v7.t6;
import z3.n;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements o, f1, h1, RequestDelegateTimestamp, u1, gs, e2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(long j10, int i10, Object obj, int i11) {
        this.a = i11;
        this.c = j10;
        this.b = i10;
        this.d = obj;
    }

    @Override // org.telegram.messenger.gs
    public void a(String str) {
        au0.d((au0) this.d, this.c, this.b, str);
    }

    @Override // e2.j
    public void accept(Object obj) {
        n nVar = (n) this.d;
        z3.a aVar = (z3.a) obj;
        nVar.h.getClass();
        byte[] o42 = oa.d.o4(aVar.a, aVar.c);
        x xVar = nVar.c;
        xVar.getClass();
        xVar.L(o42.length, o42);
        nVar.a.d(o42.length, xVar);
        long j10 = aVar.b;
        long j11 = this.c;
        if (j10 == -9223372036854775807L) {
            t6.p(nVar.h.x == Long.MAX_VALUE);
        } else {
            long j12 = nVar.h.x;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        nVar.a.c(j11, this.b | 1, o42.length, 0, null);
    }

    @Override // m4.h1
    public Object f(f0 f0Var, w wVar, int i10) {
        List list = (List) this.d;
        int i11 = this.b;
        return f0Var.q(wVar, list, i11 == -1 ? f0Var.t.m0() : i11, i11 == -1 ? f0Var.t.M0() : this.c);
    }

    @Override // m4.f1
    public void g(n1 n1Var, w wVar) {
        j1 j1Var = (j1) this.d;
        n1Var.r(j1Var.M0(wVar, n1Var, this.b), this.c);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        int i11 = this.a;
        Object obj = this.d;
        int i12 = this.b;
        long j10 = this.c;
        switch (i11) {
            case 4:
                EditText editText = (EditText) obj;
                if (j10 > 0) {
                    TLRPC.UserFull a2 = wp.r1(i12).a2(e20.i(i12).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (a2 != null) {
                        String str = a2.about;
                        if ((str != null ? str : "").equals(trim)) {
                            i0.v1(editText);
                            x1Var.dismiss();
                            break;
                        } else {
                            a2.about = trim;
                            at.f(i12).k(67, Long.valueOf(j10), a2);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    at.e().k(at.P4, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new c3(13), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull M0 = wp.r1(i12).M0(j11);
                    String obj2 = editText.getText().toString();
                    if (M0 != null) {
                        String str2 = M0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            i0.v1(editText);
                            x1Var.dismiss();
                            break;
                        } else {
                            M0.about = obj2;
                            at f7 = at.f(i12);
                            Boolean bool = Boolean.FALSE;
                            f7.k(30, M0, 0, bool, bool);
                        }
                    }
                    at.e().k(at.P4, 2, Long.valueOf(j10));
                    wp r12 = wp.r1(i12);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = r12.i1(-j11);
                    tL_messages_editChatAbout.about = obj2;
                    r12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new di(r12, M0, obj2, 7), 64);
                }
                x1Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = wp.r1(e20.s0).e7.edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
                } else if (i12 == 1) {
                    edit.putInt("MessagesLed", 0);
                } else if (i12 == 0) {
                    edit.putInt("GroupLed", 0);
                } else if (i12 == 3) {
                    edit.putInt("StoriesLed", 0);
                } else if (i12 == 5 || i12 == 4) {
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

    @Override // e2.o
    public void invoke(Object obj) {
        ((b) obj).t((a) this.d, this.b, this.c);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.b, this.c, tLObject, tL_error, j10);
    }

    public /* synthetic */ d(a aVar, int i10, long j10, long j11) {
        this.a = 0;
        this.d = aVar;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ d(Object obj, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j10;
    }

    public /* synthetic */ d(Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j10;
        this.b = i10;
    }
}
