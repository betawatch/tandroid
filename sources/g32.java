// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class g32 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g32(p5b p5bVar, boolean z, int i, List list) {
        this.a = (byte) 2;
        this.d = p5bVar;
        this.b = z;
        this.c = i;
        this.e = list;
    }

    @Override // pcc
    public final void a(Object obj) {
        k5 accountInstance;
        byte b = this.a;
        boolean z = this.b;
        int i = this.c;
        final byte b2 = 0;
        char c = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((u32) obj3).R.m((ArrayList) obj2, this.b, this.c, ((Long) obj).longValue());
                break;
            case 1:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l = (Long) obj;
                o68 o68Var = ((j58) obj3).a;
                TLRPC.User user = o68Var.N2.getAdapter().x0;
                long j = user != null ? user.id : 0L;
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.id);
                hashMap.put("query_id", String.valueOf(botInlineResult.query_id));
                hashMap.put("bot", String.valueOf(j));
                TLRPC.User user2 = o68Var.N2.getAdapter().x0;
                hashMap.put("bot_name", user2 != null ? user2.username : "");
                e eVar = o68Var.t0.f;
                accountInstance = o68Var.getAccountInstance();
                long j2 = j;
                r7a.R(this.c, o68Var.l1, 0L, l.longValue(), accountInstance, null, null, null, null, hashMap, botInlineResult, o68Var.y1.a, eVar, this.b);
                o68Var.L1.setFieldText("");
                o68Var.a0(l.longValue() <= 0);
                ls6.d0(o68Var.m2).w0(j2, false);
                break;
            case 2:
                p5b p5bVar = (p5b) obj3;
                List list = (List) obj2;
                r5b r5bVar = p5bVar.q;
                TLObject c2 = uc7.s1(p5bVar.c).c2(p5bVar.D);
                p5bVar.G = false;
                if (c2 == null) {
                    p5bVar.J = 0;
                    p5bVar.H = "";
                    hl.r(r5bVar);
                    hl.c3(r5bVar);
                    break;
                } else {
                    p5bVar.q(i, list, z);
                    break;
                }
            default:
                final t8c t8cVar = (t8c) obj2;
                final i61 i61Var = new i61(obj3, i, obj, (byte) 7);
                if (!z) {
                    u8c u8cVar = t8cVar.i;
                    if (!t8cVar.a) {
                        TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                        resetauthorization.hash = t8cVar.b;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(u8cVar.a);
                        final char c3 = c == true ? 1 : 0;
                        connectionsManager.sendRequest(resetauthorization, new RequestDelegate() { // from class: r8c
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (c3) {
                                    case 0:
                                        t8c t8cVar2 = t8cVar;
                                        t8cVar2.getClass();
                                        hl.c3(new s8c(t8cVar2, tLObject, i61Var, tL_error));
                                        break;
                                    case 1:
                                        t8c t8cVar3 = t8cVar;
                                        t8cVar3.getClass();
                                        hl.c3(new s8c(t8cVar3, i61Var, tLObject, tL_error, (byte) 2));
                                        break;
                                    default:
                                        t8c t8cVar4 = t8cVar;
                                        t8cVar4.getClass();
                                        hl.c3(new s8c(t8cVar4, i61Var, tLObject, tL_error, (byte) 0));
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                        updateconnectedbot.deleted = true;
                        updateconnectedbot.bot = uc7.s1(u8cVar.a).o1(t8cVar.c);
                        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                        ConnectionsManager.getInstance(u8cVar.a).sendRequest(updateconnectedbot, new RequestDelegate() { // from class: r8c
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b2) {
                                    case 0:
                                        t8c t8cVar2 = t8cVar;
                                        t8cVar2.getClass();
                                        hl.c3(new s8c(t8cVar2, tLObject, i61Var, tL_error));
                                        break;
                                    case 1:
                                        t8c t8cVar3 = t8cVar;
                                        t8cVar3.getClass();
                                        hl.c3(new s8c(t8cVar3, i61Var, tLObject, tL_error, (byte) 2));
                                        break;
                                    default:
                                        t8c t8cVar4 = t8cVar;
                                        t8cVar4.getClass();
                                        hl.c3(new s8c(t8cVar4, i61Var, tLObject, tL_error, (byte) 0));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                } else {
                    u8c u8cVar2 = t8cVar.i;
                    if (!t8cVar.a) {
                        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                        changeauthorizationsettings.hash = t8cVar.b;
                        changeauthorizationsettings.confirmed = true;
                        final byte b3 = 2;
                        ConnectionsManager.getInstance(u8cVar2.a).sendRequest(changeauthorizationsettings, new RequestDelegate() { // from class: r8c
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (b3) {
                                    case 0:
                                        t8c t8cVar2 = t8cVar;
                                        t8cVar2.getClass();
                                        hl.c3(new s8c(t8cVar2, tLObject, i61Var, tL_error));
                                        break;
                                    case 1:
                                        t8c t8cVar3 = t8cVar;
                                        t8cVar3.getClass();
                                        hl.c3(new s8c(t8cVar3, i61Var, tLObject, tL_error, (byte) 2));
                                        break;
                                    default:
                                        t8c t8cVar4 = t8cVar;
                                        t8cVar4.getClass();
                                        hl.c3(new s8c(t8cVar4, i61Var, tLObject, tL_error, (byte) 0));
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                        confirmbotconnection.bot_id = uc7.s1(u8cVar2.a).o1(t8cVar.c);
                        ConnectionsManager.getInstance(u8cVar2.a).sendRequestTyped(confirmbotconnection, new ia7(t8cVar, i61Var, (byte) 16));
                        break;
                    }
                }
        }
    }

    public /* synthetic */ g32(Object obj, int i, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ g32(boolean[] zArr, int i, boolean z, t8c t8cVar) {
        this.a = (byte) 3;
        this.d = zArr;
        this.c = i;
        this.b = z;
        this.e = t8cVar;
    }
}
