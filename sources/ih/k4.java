package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z10;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k4 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.y5 f;
    public final org.telegram.ui.Components.y5 g;
    public final org.telegram.ui.Components.y5 h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public k4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        gr grVar = gr.h;
        this.f = new org.telegram.ui.Components.y5(profileStoriesView, 420L, grVar);
        this.g = new org.telegram.ui.Components.y5(profileStoriesView, 420L, grVar);
        this.h = new org.telegram.ui.Components.y5(profileStoriesView, 420L, grVar);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.x) {
            imageReceiver.onAttachedToWindow();
        }
        z10[] z10VarArr = p7.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            z8Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, z8Var);
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
