// default package

import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nhb implements Vector.TLDeserializer, on5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ nhb(byte b) {
        this.a = b;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 0:
                return TL_stats.TL_statsGroupTopPoster.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TL_stats.TL_statsGroupTopAdmin.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TL_stats.TL_statsGroupTopInviter.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TL_stats.PublicForward.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TL_stories.TL_storyAlbum.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TL_stories.TL_foundStory.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TL_stories.StoryItem.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TL_stories.Boost.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TL_stories.PrepaidGiveaway.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TL_stories.TL_myBoost.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TL_stories.PeerStories.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.TL_recentStory.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_stories.StoryViews.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TL_stories.MediaArea.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TL_stories.StoryReaction.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TL_stories.StoryView.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TL_toncenter.onrampProviderInfo.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TL_toncenter.onrampMethodAvailability.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TLRPC.TL_folderPeer.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.PeerLocated.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TL_wallet.cardSticker.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TL_wallet.currencyRate.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TL_wallet.holderDc.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TL_wallet.nftAttribute.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TL_wallet.nftItem.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TL_wallet.tonConnectRequest.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_wallet.tonConnectSession.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TL_wallet.walletUserAddress.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_wallet.walletTransaction.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if ((imageReceiver.k0 instanceof p74) || (imageReceiver.T instanceof p74) || (imageReceiver.b0 instanceof p74) || (imageReceiver.n0 instanceof p74)) {
            imageReceiver.p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        }
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
    }
}
