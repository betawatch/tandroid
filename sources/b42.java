// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b42 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b42(u3b u3bVar, boolean z, int i, List list) {
        this.a = (byte) 2;
        this.d = u3bVar;
        this.b = z;
        this.c = i;
        this.e = list;
    }

    @Override // qac
    public final void a(Object obj) {
        j5 accountInstance;
        byte b = this.a;
        boolean z = this.b;
        int i = this.c;
        final byte b2 = 0;
        char c = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((p42) obj3).R.m((ArrayList) obj2, this.b, this.c, ((Long) obj).longValue());
                break;
            case 1:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                a58 a58Var = ((w38) obj3).a;
                TLRPC.User user = a58Var.T2.getAdapter().x0;
                long j = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                hashMap.put("bot", String.valueOf(j));
                TLRPC.User user2 = a58Var.T2.getAdapter().x0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                d dVar = a58Var.z0.f;
                accountInstance = a58Var.getAccountInstance();
                long j2 = j;
                a6a.R(this.c, a58Var.r1, 0L, l.longValue(), accountInstance, null, null, null, null, hashMap, botInlineResult, a58Var.E1.a, dVar, this.b);
                a58Var.R1.setFieldText("");
                a58Var.a0(l.longValue() <= 0);
                hs6.d0(a58Var.s2).w0(j2, false);
                break;
            case 2:
                u3b u3bVar = (u3b) obj3;
                List list = (List) obj2;
                w3b w3bVar = u3bVar.q;
                TLObject b22 = oc7.r1(u3bVar.c).b2(u3bVar.D);
                u3bVar.G = false;
                if (b22 == null) {
                    u3bVar.J = 0;
                    u3bVar.H = "";
                    gm.r(w3bVar);
                    gm.c3(w3bVar);
                    break;
                } else {
                    u3bVar.q(i, list, z);
                    break;
                }
            default:
                final u6c u6cVar = (u6c) obj2;
                final h71 h71Var = new h71(obj3, i, obj, (byte) 7);
                if (!z) {
                    v6c v6cVar = u6cVar.i;
                    if (!u6cVar.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = u6cVar.b;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(v6cVar.a);
                        final char c2 = c == true ? 1 : 0;
                        connectionsManager.sendRequest(resetauthorization, new RequestDelegate() { // from class: s6c
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (c2) {
                                    case 0:
                                        u6c u6cVar2 = u6cVar;
                                        u6cVar2.getClass();
                                        gm.c3(new t6c(u6cVar2, tLObject, h71Var, tL_error));
                                        break;
                                    case 1:
                                        u6c u6cVar3 = u6cVar;
                                        u6cVar3.getClass();
                                        gm.c3(new t6c(u6cVar3, h71Var, tLObject, tL_error, (byte) 2));
                                        break;
                                    default:
                                        u6c u6cVar4 = u6cVar;
                                        u6cVar4.getClass();
                                        gm.c3(new t6c(u6cVar4, h71Var, tLObject, tL_error, (byte) 0));
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = oc7.r1(v6cVar.a).n1(u6cVar.c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(v6cVar.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: s6c
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b2) {
                                    case 0:
                                        u6c u6cVar2 = u6cVar;
                                        u6cVar2.getClass();
                                        gm.c3(new t6c(u6cVar2, tLObject, h71Var, tL_error));
                                        break;
                                    case 1:
                                        u6c u6cVar3 = u6cVar;
                                        u6cVar3.getClass();
                                        gm.c3(new t6c(u6cVar3, h71Var, tLObject, tL_error, (byte) 2));
                                        break;
                                    default:
                                        u6c u6cVar4 = u6cVar;
                                        u6cVar4.getClass();
                                        gm.c3(new t6c(u6cVar4, h71Var, tLObject, tL_error, (byte) 0));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    v6c v6cVar2 = u6cVar.i;
                    if (!u6cVar.a) {
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = u6cVar.b;
                        changeauthorizationsettings.confirmed = true;
                        final byte b3 = 2;
                        ConnectionsManager.getInstance(v6cVar2.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: s6c
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b3) {
                                    case 0:
                                        u6c u6cVar2 = u6cVar;
                                        u6cVar2.getClass();
                                        gm.c3(new t6c(u6cVar2, tLObject, h71Var, tL_error));
                                        break;
                                    case 1:
                                        u6c u6cVar3 = u6cVar;
                                        u6cVar3.getClass();
                                        gm.c3(new t6c(u6cVar3, h71Var, tLObject, tL_error, (byte) 2));
                                        break;
                                    default:
                                        u6c u6cVar4 = u6cVar;
                                        u6cVar4.getClass();
                                        gm.c3(new t6c(u6cVar4, h71Var, tLObject, tL_error, (byte) 0));
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                        confirmbotconnection.bot_id = oc7.r1(v6cVar2.a).n1(u6cVar.c);
                        ConnectionsManager.getInstance(v6cVar2.a).sendRequestTyped(confirmbotconnection, new s87(u6cVar, h71Var, (byte) 18));
                        break;
                    }
                }
        }
    }

    public /* synthetic */ b42(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ b42(boolean[] zArr, int i, boolean z, u6c u6cVar) {
        this.a = (byte) 3;
        this.d = zArr;
        this.c = i;
        this.b = z;
        this.e = u6cVar;
    }
}
