package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.poll.PollAttachedMedia;

/* loaded from: classes5.dex */
public class PollAttachedMediaGallery extends PollAttachedMedia {
    public final MediaController.PhotoEntry photoEntry;
    public final SendMessagesHelper.SendingMediaInfo sendingMediaInfo;

    @Override // org.telegram.ui.Components.poll.PollAttachedMedia
    protected void drawOverlay(Canvas canvas, int i, int i2) {
    }

    public PollAttachedMediaGallery(SendMessagesHelper.SendingMediaInfo sendingMediaInfo) {
        this.sendingMediaInfo = sendingMediaInfo;
        this.photoEntry = sendingMediaInfo.originalPhotoEntry;
    }

    @Override // org.telegram.ui.Components.poll.PollAttachedMedia
    protected void setupImageReceiver(ImageReceiver imageReceiver) {
        ImageLocation imageLocation;
        imageReceiver.setOrientation(0, true);
        MediaController.PhotoEntry photoEntry = this.photoEntry;
        String str = photoEntry.coverPath;
        if (str != null) {
            imageLocation = ImageLocation.getForPath(str);
        } else {
            String str2 = photoEntry.thumbPath;
            if (str2 != null) {
                imageLocation = ImageLocation.getForPath(str2);
            } else if (photoEntry.path != null) {
                if (photoEntry.isVideo && !photoEntry.isLivePhoto) {
                    imageLocation = ImageLocation.getForPath("vthumb://" + this.photoEntry.imageId + ":" + this.photoEntry.path);
                } else {
                    imageLocation = ImageLocation.getForPath("thumb://" + this.photoEntry.imageId + ":" + this.photoEntry.path);
                    MediaController.PhotoEntry photoEntry2 = this.photoEntry;
                    imageReceiver.setOrientation(photoEntry2.orientation, photoEntry2.invert, true);
                }
            } else {
                imageReceiver.clearImage();
                imageLocation = null;
            }
        }
        ImageLocation imageLocation2 = imageLocation;
        if (imageLocation2 != null) {
            imageReceiver.setImage(imageLocation2, null, null, null, null, 0);
        } else {
            imageReceiver.clearImage();
        }
    }
}
