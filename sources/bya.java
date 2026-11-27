// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.FileNotFoundException;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class bya implements uka, OnFailureListener, fd, jcc, rcc, Vector.TLDeserializer {
    public final /* synthetic */ byte a;

    public /* synthetic */ bya(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void a(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override // uka
    public final float b(RecyclerView recyclerView) {
        return wka.j(recyclerView);
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 9:
                return TLRPC.AttachMenuPeerType.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_attachMenuBotIcon.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_attachMenuBotIconColor.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.AttachMenuBot.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.RestrictionReason.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.TL_username.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TL_bots.BotInfo.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.TL_messageRange.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.TL_channelAdminLogEvent.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.Chat.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.ChannelParticipant.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TL_sendAsPeer.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.TL_sponsoredMessageReportOption.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.ChatParticipant.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.Reaction.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.ThemeSettings.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_communities.CommunityPeer.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.TL_dcOption.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TLRPC.TL_peerBlocked.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.TL_contact.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        return num.intValue() == 0 ? num2.intValue() == 0 ? ob6.M0(2131748559, null) : ob6.H(',', "Stars", num2.intValue()) : String.valueOf(num2);
    }

    @Override // uka
    public final RecyclerView h(View view) {
        return ((kza) view).a;
    }

    @Override // uka
    public final /* synthetic */ void o(RecyclerView recyclerView) {
        uh9.d(recyclerView);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        idVar.dismiss();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
    }
}
