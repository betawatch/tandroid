package b4;

import android.content.SharedPreferences;
import android.widget.EditText;
import b8.zb;
import ei.u5;
import g2.y;
import java.util.List;
import o4.d1;
import o4.e0;
import o4.f1;
import o4.h1;
import o4.l1;
import o4.v;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.or;
import org.telegram.messenger.uh;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements g2.k, g2.p, d1, f1, RequestDelegateTimestamp, p1, or {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(long j10, int i3, Object obj, int i10) {
        this.a = i10;
        this.c = j10;
        this.b = i3;
        this.d = obj;
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        ws0.f((ws0) this.d, this.c, this.b, str);
    }

    @Override // g2.k
    public void accept(Object obj) {
        p pVar = (p) this.d;
        a aVar = (a) obj;
        pVar.h.getClass();
        byte[] q42 = kb.a.q4(aVar.a, aVar.c);
        y yVar = pVar.c;
        yVar.getClass();
        yVar.L(q42.length, q42);
        pVar.a.e(q42.length, yVar);
        long j10 = aVar.b;
        long j11 = this.c;
        if (j10 == -9223372036854775807L) {
            zb.p(pVar.h.x == Long.MAX_VALUE);
        } else {
            long j12 = pVar.h.x;
            j11 = j12 == Long.MAX_VALUE ? j11 + j10 : j10 + j12;
        }
        pVar.a.d(j11, this.b | 1, q42.length, 0, null);
    }

    @Override // o4.d1
    public void b(l1 l1Var, v vVar) {
        h1 h1Var = (h1) this.d;
        l1Var.r(h1Var.M0(vVar, l1Var, this.b), this.c);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        int i10 = this.a;
        Object obj = this.d;
        int i11 = this.b;
        long j10 = this.c;
        switch (i10) {
            case 5:
                EditText editText = (EditText) obj;
                if (j10 > 0) {
                    TLRPC.UserFull b22 = hp.s1(i11).b2(h10.i(i11).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (b22 != null) {
                        String str = b22.about;
                        if ((str != null ? str : "").equals(trim)) {
                            g0.v1(editText);
                            s1Var.dismiss();
                            break;
                        } else {
                            b22.about = trim;
                            hs.f(i11).k(67, Long.valueOf(j10), b22);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    hs.e().k(hs.P4, 2, Long.valueOf(j10));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new u5(18), 2);
                } else {
                    long j11 = -j10;
                    TLRPC.ChatFull N0 = hp.s1(i11).N0(j11);
                    String obj2 = editText.getText().toString();
                    if (N0 != null) {
                        String str2 = N0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            g0.v1(editText);
                            s1Var.dismiss();
                            break;
                        } else {
                            N0.about = obj2;
                            hs f10 = hs.f(i11);
                            Boolean bool = Boolean.FALSE;
                            f10.k(30, N0, 0, bool, bool);
                        }
                    }
                    hs.e().k(hs.P4, 2, Long.valueOf(j10));
                    hp s12 = hp.s1(i11);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = s12.j1(-j11);
                    tL_messages_editChatAbout.about = obj2;
                    s12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new uh(s12, N0, obj2, 7), 64);
                }
                s1Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = hp.s1(h10.t0).d7.edit();
                if (j10 != 0) {
                    edit.putInt("color_" + j10, 0);
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

    @Override // o4.f1
    public Object i(e0 e0Var, v vVar, int i3) {
        List list = (List) this.d;
        int i10 = this.b;
        return e0Var.q(vVar, list, i10 == -1 ? e0Var.t.l0() : i10, i10 == -1 ? e0Var.t.N0() : this.c);
    }

    @Override // g2.p
    public void invoke(Object obj) {
        ((l2.b) obj).z((l2.a) this.d, this.b, this.c);
    }

    @Override // org.telegram.tgnet.RequestDelegateTimestamp
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        ((VoIPService) this.d).lambda$createGroupInstance$78(this.b, this.c, tLObject, tL_error, j10);
    }

    public /* synthetic */ o(Object obj, int i3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i3;
        this.c = j10;
    }

    public /* synthetic */ o(Object obj, long j10, int i3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = j10;
        this.b = i3;
    }

    public /* synthetic */ o(l2.a aVar, int i3, long j10, long j11) {
        this.a = 1;
        this.d = aVar;
        this.b = i3;
        this.c = j10;
    }
}
