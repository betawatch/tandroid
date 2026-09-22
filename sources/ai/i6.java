package ai;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i6 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.c6 f;
    public final org.telegram.ui.Components.c6 g;
    public final org.telegram.ui.Components.c6 h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public i6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        qr qrVar = qr.h;
        this.f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.x) {
            imageReceiver.onAttachedToWindow();
        }
        o20[] o20VarArr = ia.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            f9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, f9Var);
        } else {
            if (messageMedia != null && (document = messageMedia.document) != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                imageReceiver.clearImage();
            } else {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            }
        }
    }
}
