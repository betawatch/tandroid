package ff;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l0 {
    public static void a(TLRPC.Photo photo, TLRPC.User user, boolean z10) {
        ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
        user.flags |= 32;
        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
        user.photo = tL_userProfilePhoto;
        tL_userProfilePhoto.personal = z10;
        tL_userProfilePhoto.photo_id = photo.id;
        ArrayList<TLRPC.VideoSize> arrayList2 = photo.video_sizes;
        tL_userProfilePhoto.has_video = arrayList2 != null && arrayList2.size() > 0;
        if (closestPhotoSizeWithSize != null) {
            user.photo.photo_small = closestPhotoSizeWithSize.location;
        }
        if (closestPhotoSizeWithSize2 != null) {
            user.photo.photo_big = closestPhotoSizeWithSize2.location;
        }
    }

    public static void b(int i9, TLRPC.Photo photo, TLRPC.Photo photo2) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 100);
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
        if (closestPhotoSizeWithSize3 != null && closestPhotoSizeWithSize != null) {
            FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, true).renameTo(FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize3, true));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(closestPhotoSizeWithSize.location.volume_id);
            sb2.append("_");
            String l10 = aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(closestPhotoSizeWithSize3.location.volume_id);
            sb3.append("_");
            ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize3.location.local_id, "@50_50", sb3), ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), false);
        }
        if (closestPhotoSizeWithSize4 == null || closestPhotoSizeWithSize2 == null) {
            return;
        }
        FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize2, true).renameTo(FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize4, true));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(closestPhotoSizeWithSize2.location.volume_id);
        sb4.append("_");
        String l11 = aa.d.l(closestPhotoSizeWithSize2.location.local_id, "@150_150", sb4);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(closestPhotoSizeWithSize4.location.volume_id);
        sb5.append("_");
        ImageLoader.getInstance().replaceImageInCache(l11, aa.d.l(closestPhotoSizeWithSize4.location.local_id, "@150_150", sb5), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), false);
    }
}
