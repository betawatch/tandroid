package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.NotificationBadge;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class SaveToGallerySettingsHelper {
    public static String CHANNELS_PREF_NAME = "channels_save_gallery_exceptions";
    public static final long DEFAULT_VIDEO_LIMIT = 104857600;
    public static String GROUPS_PREF_NAME = "groups_save_gallery_exceptions";
    public static final long MAX_VIDEO_LIMIT = 4194304000L;
    public static String USERS_PREF_NAME = "users_save_gallery_exceptions";
    public static SharedSettings channels;
    public static SharedSettings groups;
    public static SharedSettings user;

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static class DialogException extends Settings {
        public long dialogId;

        @Override // org.telegram.messenger.SaveToGallerySettingsHelper.Settings
        public CharSequence createDescription(int i10) {
            StringBuilder sb = new StringBuilder();
            if (!enabled()) {
                sb.append(LocaleController.getString(R.string.SaveToGalleryOff));
                return sb;
            }
            if (this.savePhoto) {
                sb.append(LocaleController.getString(R.string.SaveToGalleryPhotos));
            }
            if (this.saveVideo) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                long j10 = this.limitVideo;
                if (j10 > 0 && j10 < 4194304000L) {
                    sb.append(LocaleController.formatString("SaveToGalleryVideosUpTo", R.string.SaveToGalleryVideosUpTo, AndroidUtilities.formatFileSize(j10, true, false)));
                    return sb;
                }
                sb.append(LocaleController.formatString("SaveToGalleryVideos", R.string.SaveToGalleryVideos, new Object[0]));
            }
            return sb;
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static abstract class Settings {
        public long limitVideo = SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT;
        public boolean savePhoto;
        public boolean saveVideo;

        public abstract CharSequence createDescription(int i10);

        public boolean enabled() {
            return this.savePhoto || this.saveVideo;
        }

        public void toggle() {
            if (enabled()) {
                this.saveVideo = false;
                this.savePhoto = false;
            } else {
                this.savePhoto = true;
                this.saveVideo = true;
            }
        }
    }

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public static class SharedSettings extends Settings {
        private int type;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean needSave(FilePathDatabase.FileMeta fileMeta, MessageObject messageObject, int i10) {
            DialogException dialogException = UserConfig.getInstance(i10).getSaveGalleryExceptions(this.type).get(fileMeta.dialogId);
            if (messageObject != null && (messageObject.isOutOwner() || messageObject.isSecretMedia())) {
                return false;
            }
            boolean z4 = (messageObject != null && messageObject.isVideo()) || fileMeta.messageType == 3;
            long size = messageObject != null ? messageObject.getSize() : fileMeta.messageSize;
            boolean z10 = this.saveVideo;
            boolean z11 = this.savePhoto;
            long j10 = this.limitVideo;
            if (dialogException != null) {
                z10 = dialogException.saveVideo;
                z11 = dialogException.savePhoto;
                j10 = dialogException.limitVideo;
            }
            if (z4) {
                if (z10 && (j10 == -1 || size < j10)) {
                    return true;
                }
            } else if (z11) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static SharedSettings read(String str, SharedPreferences sharedPreferences) {
            SharedSettings sharedSettings = new SharedSettings();
            sharedSettings.savePhoto = sharedPreferences.getBoolean(str + "_save_gallery_photo", false);
            sharedSettings.saveVideo = sharedPreferences.getBoolean(str + "_save_gallery_video", false);
            sharedSettings.limitVideo = sharedPreferences.getLong(str + "_save_gallery_limitVideo", SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT);
            return sharedSettings;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void save(String str, SharedPreferences sharedPreferences) {
            sharedPreferences.edit().putBoolean(w.c.e(str, "_save_gallery_photo"), this.savePhoto).putBoolean(w.c.e(str, "_save_gallery_video"), this.saveVideo).putLong(w.c.e(str, "_save_gallery_limitVideo"), this.limitVideo).apply();
        }

        @Override // org.telegram.messenger.SaveToGallerySettingsHelper.Settings
        public CharSequence createDescription(int i10) {
            StringBuilder sb = new StringBuilder();
            if (enabled()) {
                if (this.savePhoto) {
                    sb.append(LocaleController.getString(R.string.SaveToGalleryPhotos));
                }
                if (this.saveVideo) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.SaveToGalleryVideos));
                    long j10 = this.limitVideo;
                    if (j10 > 0 && j10 < 4194304000L) {
                        sb.append(" (");
                        sb.append(AndroidUtilities.formatFileSize(this.limitVideo, true, false));
                        sb.append(")");
                    }
                }
            } else {
                sb.append(LocaleController.getString(R.string.SaveToGalleryOff));
            }
            LongSparseArray<DialogException> saveGalleryExceptions = UserConfig.getInstance(i10).getSaveGalleryExceptions(this.type);
            if (saveGalleryExceptions.size() != 0) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Exception", saveGalleryExceptions.size(), Integer.valueOf(saveGalleryExceptions.size())));
            }
            return sb;
        }

        @Override // org.telegram.messenger.SaveToGallerySettingsHelper.Settings
        public void toggle() {
            super.toggle();
            SaveToGallerySettingsHelper.saveSettings(this.type);
        }
    }

    public static Settings getSettings(int i10) {
        if (i10 == 1) {
            return user;
        }
        if (i10 == 2) {
            return groups;
        }
        if (i10 == 4) {
            return channels;
        }
        return null;
    }

    public static void load(SharedPreferences sharedPreferences) {
        int i10 = (sharedPreferences.getBoolean("save_gallery", false) && BuildVars.NO_SCOPED_STORAGE) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i10 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            SharedSettings sharedSettings = new SharedSettings();
            user = sharedSettings;
            boolean z4 = (i10 & 1) != 0;
            sharedSettings.saveVideo = z4;
            sharedSettings.savePhoto = z4;
            sharedSettings.limitVideo = DEFAULT_VIDEO_LIMIT;
            sharedSettings.save("user", sharedPreferences);
            SharedSettings sharedSettings2 = new SharedSettings();
            groups = sharedSettings2;
            SharedSettings sharedSettings3 = user;
            boolean z10 = (i10 & 2) != 0;
            sharedSettings3.saveVideo = z10;
            sharedSettings2.savePhoto = z10;
            sharedSettings2.limitVideo = DEFAULT_VIDEO_LIMIT;
            sharedSettings2.save("groups", sharedPreferences);
            SharedSettings sharedSettings4 = new SharedSettings();
            channels = sharedSettings4;
            boolean z11 = (i10 & 4) != 0;
            sharedSettings4.saveVideo = z11;
            sharedSettings4.savePhoto = z11;
            sharedSettings4.limitVideo = DEFAULT_VIDEO_LIMIT;
            sharedSettings4.save("channels", sharedPreferences);
        } else {
            user = SharedSettings.read("user", sharedPreferences);
            groups = SharedSettings.read("groups", sharedPreferences);
            channels = SharedSettings.read("channels", sharedPreferences);
        }
        user.type = 1;
        groups.type = 2;
        channels.type = 4;
    }

    public static LongSparseArray<DialogException> loadExceptions(SharedPreferences sharedPreferences) {
        LongSparseArray<DialogException> longSparseArray = new LongSparseArray<>();
        int i10 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        for (int i11 = 0; i11 < i10; i11++) {
            DialogException dialogException = new DialogException();
            dialogException.dialogId = sharedPreferences.getLong(i11 + "_dialog_id", 0L);
            dialogException.savePhoto = sharedPreferences.getBoolean(i11 + "_photo", false);
            dialogException.saveVideo = sharedPreferences.getBoolean(i11 + "_video", false);
            dialogException.limitVideo = sharedPreferences.getLong(i11 + "_limitVideo", DEFAULT_VIDEO_LIMIT);
            long j10 = dialogException.dialogId;
            if (j10 != 0) {
                longSparseArray.put(j10, dialogException);
            }
        }
        return longSparseArray;
    }

    public static boolean needSave(int i10, FilePathDatabase.FileMeta fileMeta, MessageObject messageObject, int i11) {
        SharedSettings sharedSettings;
        if (i10 == 1) {
            sharedSettings = user;
        } else if (i10 == 4) {
            sharedSettings = channels;
        } else {
            if (i10 != 2) {
                return false;
            }
            sharedSettings = groups;
        }
        return sharedSettings.needSave(fileMeta, messageObject, i11);
    }

    public static void saveExceptions(SharedPreferences sharedPreferences, LongSparseArray<DialogException> longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, longSparseArray.size());
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            DialogException valueAt = longSparseArray.valueAt(i10);
            edit.putLong(android.support.v4.media.a.l(i10, "_dialog_id"), valueAt.dialogId);
            edit.putBoolean(i10 + "_photo", valueAt.savePhoto);
            edit.putBoolean(i10 + "_video", valueAt.saveVideo);
            edit.putLong(i10 + "_limitVideo", valueAt.limitVideo);
        }
        edit.apply();
    }

    public static void saveSettings(int i10) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (i10 == 1) {
            user.save("user", sharedPreferences);
        } else if (i10 == 2) {
            groups.save("groups", sharedPreferences);
        } else if (i10 == 4) {
            channels.save("channels", sharedPreferences);
        }
    }
}
