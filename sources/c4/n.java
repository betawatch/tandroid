package c4;

import a8.ma;
import android.content.SharedPreferences;
import android.widget.EditText;
import fi.l5;
import h2.x;
import java.util.List;
import org.telegram.messenger.ci;
import org.telegram.messenger.g0;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.it0;
import p4.b1;
import p4.d0;
import p4.d1;
import p4.h1;
import p4.v;
import p4.z0;
import w7.s;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements h2.j, h2.o, RequestDelegateTimestamp, q1, rr, z0, b1 {
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

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        it0.f((it0) this.d, this.c, this.b, str);
    }

    @Override // h2.j
    public void accept(Object obj) {
        o oVar = (o) this.d;
        a aVar = (a) obj;
        oVar.h.getClass();
        byte[] U = s.U(aVar.a, aVar.c);
        x xVar = oVar.c;
        xVar.getClass();
        xVar.L(U.length, U);
        oVar.a.b(U.length, xVar);
        long j3 = aVar.b;
        long j10 = this.c;
        if (j3 == -9223372036854775807L) {
            ma.p(oVar.h.x == Long.MAX_VALUE);
        } else {
            long j11 = oVar.h.x;
            j10 = j11 == Long.MAX_VALUE ? j10 + j3 : j3 + j11;
        }
        oVar.a.c(j10, this.b | 1, U.length, 0, null);
    }

    @Override // p4.z0
    public void c(h1 h1Var, v vVar) {
        d1 d1Var = (d1) this.d;
        h1Var.t(d1Var.m1(vVar, h1Var, this.b), this.c);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
        int i10 = this.a;
        Object obj = this.d;
        int i11 = this.b;
        long j3 = this.c;
        switch (i10) {
            case 3:
                EditText editText = (EditText) obj;
                if (j3 > 0) {
                    TLRPC.UserFull d2 = mp.u1(i11).d2(i10.i(i11).e());
                    String trim = editText.getText().toString().replace("\n", " ").replaceAll(" +", " ").trim();
                    if (d2 != null) {
                        String str = d2.about;
                        if ((str != null ? str : "").equals(trim)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            break;
                        } else {
                            d2.about = trim;
                            ks.f(i11).k(67, Long.valueOf(j3), d2);
                        }
                    }
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.about = trim;
                    updateprofile.flags |= 4;
                    ks.e().k(ks.S4, 2, Long.valueOf(j3));
                    ConnectionsManager.getInstance(i11).sendRequest(updateprofile, new l5(18), 2);
                } else {
                    long j10 = -j3;
                    TLRPC.ChatFull P0 = mp.u1(i11).P0(j10);
                    String obj2 = editText.getText().toString();
                    if (P0 != null) {
                        String str2 = P0.about;
                        if ((str2 != null ? str2 : "").equals(obj2)) {
                            g0.v1(editText);
                            t1Var.dismiss();
                            break;
                        } else {
                            P0.about = obj2;
                            ks f10 = ks.f(i11);
                            Boolean bool = Boolean.FALSE;
                            f10.k(30, P0, 0, bool, bool);
                        }
                    }
                    ks.e().k(ks.S4, 2, Long.valueOf(j3));
                    mp u12 = mp.u1(i11);
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = u12.l1(-j10);
                    tL_messages_editChatAbout.about = obj2;
                    u12.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new ci(u12, P0, obj2, 7), 64);
                }
                t1Var.dismiss();
                break;
            default:
                Runnable runnable = (Runnable) obj;
                SharedPreferences.Editor edit = mp.u1(i10.t0).g7.edit();
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
        ((m2.b) obj).r((m2.a) this.d, this.b, this.c);
    }

    @Override // p4.b1
    public Object j(d0 d0Var, v vVar, int i7) {
        List list = (List) this.d;
        int i10 = this.b;
        return d0Var.q(vVar, list, i10 == -1 ? d0Var.t.p0() : i10, i10 == -1 ? d0Var.t.n() : this.c);
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
