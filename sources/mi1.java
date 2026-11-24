// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mi1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mi1(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        byte b = this.a;
        int i = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                gl.c3(new z77(obj2, (Object) tL_error, (Object) tLObject, obj, this.b, (byte) 6));
                break;
            case 1:
                gl.c3(new rg(obj2, this.b, (Object) tLObject, obj, (byte) 12));
                break;
            case 2:
                gl.c3(new z77(obj2, (Object) tL_error, (Object) tLObject, obj, this.b, (byte) 8));
                break;
            case 3:
                gl.c3(new rg(obj2, (Object) tLObject, obj, this.b, (byte) 16));
                break;
            case 4:
                gl.c3(new rg(obj2, (Object) tLObject, obj, this.b, (byte) 20));
                break;
            case 5:
                yh6 yh6Var = (yh6) obj2;
                TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
                    if (tL_messages_exportedChatInvites.invites.size() > 0 && tL_chatInviteExported2 != null) {
                        while (i < tL_messages_exportedChatInvites.invites.size()) {
                            if (((TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i)).link.equals(tL_chatInviteExported2.link)) {
                                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.remove(i);
                                gl.c3(new lh6(yh6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                tL_chatInviteExported = null;
                gl.c3(new lh6(yh6Var, tL_chatInviteExported, tL_error, tLObject, this.b, (byte) 0));
            case 6:
                gl.c3(new rg((hq6) obj2, tL_error, tLObject, (String) obj, this.b));
                break;
            case 7:
                gl.c3(new rg(obj2, (Object) tLObject, obj, this.b, (byte) 27));
                break;
            case 8:
                na7 na7Var = (na7) obj2;
                na7Var.getClass();
                gl.c3(new rg((Object) na7Var, (Object) tLObject, this.b, obj, (byte) 29));
                break;
            case 9:
                gl.c3(new d97(obj2, obj, (Object) tLObject, this.b, (byte) 1));
                break;
            case 10:
                gl.c3(new z77(obj2, (Object) tL_error, this.b, (Object) tLObject, obj, (byte) 16));
                break;
            case 11:
                zr9 zr9Var = (zr9) obj2;
                String str = (String) obj;
                vf6 vf6Var = zr9Var.h;
                ArrayList arrayList = zr9Var.g;
                int i2 = zr9Var.m;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    zr9Var.n = str.toLowerCase();
                    na7.q1(i2).b4(tL_channels_channelParticipants.users, false);
                    na7.q1(i2).V3(tL_channels_channelParticipants.chats, false);
                    arrayList.clear();
                    vf6Var.b();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    long e = y6c.h(i2).e();
                    int size = tL_channels_channelParticipants.participants.size();
                    while (i < size) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        long B1 = k27.B1(channelParticipant.peer);
                        if (this.b || B1 != e) {
                            vf6Var.k(channelParticipant, B1);
                        } else {
                            arrayList.remove(channelParticipant);
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 12:
                gl.c3(new d97(obj2, obj, (Object) tLObject, this.b, (byte) 14));
                break;
            default:
                gl.c3(new d97(obj2, (Object) tLObject, this.b, obj, (byte) 15));
                break;
        }
    }

    public /* synthetic */ mi1(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
