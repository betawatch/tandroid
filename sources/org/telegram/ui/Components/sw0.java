package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sw0 extends ic {
    public sw0(LaunchActivity launchActivity, int i10, TLRPC.Document document) {
        this(launchActivity, null, 1, i10, document, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sw0(Context context, TLObject tLObject, int i10, int i11, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        TLRPC.Document document2;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document3;
        ImageLocation forSticker;
        TLRPC.TL_messages_stickerSet stickerSet2;
        boolean z10 = tLObject instanceof TLRPC.TL_messages_stickerSet;
        if (z10) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            stickerSet = tL_messages_stickerSet.set;
            ArrayList<TLRPC.Document> arrayList2 = tL_messages_stickerSet.documents;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                document3 = arrayList2.get(0);
                document2 = document3;
                if (stickerSet == null && document2 != null && (stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(MessageObject.getInputStickerSet(document2), true)) != null) {
                    stickerSet = stickerSet2.set;
                }
                TLRPC.StickerSet stickerSet3 = stickerSet;
                if (document2 == null) {
                    TLObject closestPhotoSizeWithSize = stickerSet3 != null ? FileLoader.getClosestPhotoSizeWithSize(stickerSet3.thumbs, 90) : null;
                    closestPhotoSizeWithSize = closestPhotoSizeWithSize == null ? document2 : closestPhotoSizeWithSize;
                    boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                    if (z11) {
                        forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2);
                    } else {
                        forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, tLObject instanceof TLRPC.StickerSetCovered ? ((TLRPC.StickerSetCovered) tLObject).set.thumb_version : z10 ? ((TLRPC.TL_messages_stickerSet) tLObject).set.thumb_version : 0);
                    }
                    ImageLocation imageLocation = forSticker;
                    if (z11 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2) || MessageObject.isGifDocument(document2))) {
                        this.a.j(ImageLocation.getForDocument(document2), "50_50", imageLocation, null, 0, tLObject);
                    } else if (imageLocation == null || imageLocation.imageType != 1) {
                        this.a.i(imageLocation, "50_50", "webp", null, tLObject);
                    } else {
                        this.a.i(imageLocation, "50_50", "tgs", null, tLObject);
                    }
                } else {
                    this.a.i(null, null, "webp", null, tLObject);
                }
                if (MessageObject.isTextColorEmoji(document2)) {
                    this.a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                switch (i11) {
                    case 0:
                        if (stickerSet3 != null) {
                            if (stickerSet3.masks) {
                                this.b.setText(LocaleController.getString(R.string.MasksRemoved));
                                this.c.setText(LocaleController.formatString("MasksRemovedInfo", R.string.MasksRemovedInfo, stickerSet3.title));
                                return;
                            } else {
                                if (!stickerSet3.emojis) {
                                    this.b.setText(LocaleController.getString(R.string.StickersRemoved));
                                    this.c.setText(LocaleController.formatString("StickersRemovedInfo", R.string.StickersRemovedInfo, stickerSet3.title));
                                    return;
                                }
                                this.b.setText(LocaleController.getString(R.string.EmojiRemoved));
                                if (i10 > 1) {
                                    this.c.setText(LocaleController.formatPluralString("EmojiRemovedMultipleInfo", i10, new Object[0]));
                                    return;
                                } else {
                                    this.c.setText(LocaleController.formatString("EmojiRemovedInfo", R.string.EmojiRemovedInfo, stickerSet3.title));
                                    return;
                                }
                            }
                        }
                        return;
                    case 1:
                        if (stickerSet3 != null) {
                            if (stickerSet3.masks) {
                                this.b.setText(LocaleController.getString(R.string.MasksArchived));
                                this.c.setText(LocaleController.formatString("MasksArchivedInfo", R.string.MasksArchivedInfo, stickerSet3.title));
                                return;
                            } else if (stickerSet3.emojis) {
                                this.b.setText(LocaleController.getString(R.string.EmojiArchived));
                                this.c.setText(LocaleController.formatString("EmojiArchivedInfo", R.string.EmojiArchivedInfo, stickerSet3.title));
                                return;
                            } else {
                                this.b.setText(LocaleController.getString(R.string.StickersArchived));
                                this.c.setText(LocaleController.formatString("StickersArchivedInfo", R.string.StickersArchivedInfo, stickerSet3.title));
                                return;
                            }
                        }
                        return;
                    case 2:
                        if (stickerSet3 != null) {
                            if (stickerSet3.masks) {
                                this.b.setText(LocaleController.getString(R.string.AddMasksInstalled));
                                this.c.setText(LocaleController.formatString("AddMasksInstalledInfo", R.string.AddMasksInstalledInfo, stickerSet3.title));
                                return;
                            } else {
                                if (!stickerSet3.emojis) {
                                    this.b.setText(LocaleController.getString(R.string.AddStickersInstalled));
                                    this.c.setText(LocaleController.formatString("AddStickersInstalledInfo", R.string.AddStickersInstalledInfo, stickerSet3.title));
                                    return;
                                }
                                this.b.setText(LocaleController.getString(R.string.AddEmojiInstalled));
                                if (i10 > 1) {
                                    this.c.setText(LocaleController.formatPluralString("AddEmojiMultipleInstalledInfo", i10, new Object[0]));
                                    return;
                                } else {
                                    this.c.setText(LocaleController.formatString("AddEmojiInstalledInfo", R.string.AddEmojiInstalledInfo, stickerSet3.title));
                                    return;
                                }
                            }
                        }
                        return;
                    case 3:
                        this.b.setText(LocaleController.getString(R.string.RemovedFromRecent));
                        this.c.setVisibility(8);
                        return;
                    case 4:
                        this.b.setText(LocaleController.getString(R.string.RemovedFromFavorites));
                        this.c.setVisibility(8);
                        return;
                    case 5:
                        this.b.setText(LocaleController.getString(R.string.AddedToFavorites));
                        this.c.setVisibility(8);
                        return;
                    case 6:
                        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
                            this.b.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)));
                            this.c.setText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitlePremium", R.string.LimitReachedFavoriteStickersSubtitlePremium, new Object[0]));
                            return;
                        } else {
                            this.b.setText(LocaleController.formatString("LimitReachedFavoriteStickers", R.string.LimitReachedFavoriteStickers, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitDefault)));
                            this.c.setText(AndroidUtilities.premiumText(LocaleController.formatString("LimitReachedFavoriteStickersSubtitle", R.string.LimitReachedFavoriteStickersSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).stickersFavedLimitPremium)), new y20(context, 2)));
                            return;
                        }
                    case 7:
                        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
                        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() || isPremium) {
                            this.b.setText(LocaleController.formatString(R.string.LimitReachedFavoriteGifs, Integer.valueOf(isPremium ? MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium : MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                            this.c.setText(LocaleController.getString(R.string.LimitReachedFavoriteGifsSubtitlePremium));
                            return;
                        } else {
                            this.b.setText(LocaleController.formatString(R.string.LimitReachedFavoriteGifs, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitDefault)));
                            this.c.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.LimitReachedFavoriteGifsSubtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).savedGifsLimitPremium)), new y20(context, 3)));
                            return;
                        }
                    default:
                        return;
                }
            }
            document3 = document;
            document2 = document3;
            if (stickerSet == null) {
                stickerSet = stickerSet2.set;
            }
            TLRPC.StickerSet stickerSet32 = stickerSet;
            if (document2 == null) {
            }
            if (MessageObject.isTextColorEmoji(document2)) {
            }
            switch (i11) {
            }
        } else if (tLObject instanceof TLRPC.StickerSetCovered) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) tLObject;
            stickerSet = stickerSetCovered.set;
            TLRPC.Document document4 = stickerSetCovered.cover;
            if (document4 != null) {
                document3 = document4;
            } else if (stickerSetCovered.covers.isEmpty()) {
                if ((stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) && (arrayList = (tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents) != null && !arrayList.isEmpty()) {
                    document3 = tL_stickerSetFullCovered.documents.get(0);
                }
                document3 = document;
            } else {
                document3 = stickerSetCovered.covers.get(0);
            }
            document2 = document3;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet322 = stickerSet;
            if (document2 == null) {
            }
            if (MessageObject.isTextColorEmoji(document2)) {
            }
            switch (i11) {
            }
        } else {
            if (document == null && tLObject != null && BuildVars.DEBUG_VERSION) {
                throw new IllegalArgumentException("Invalid type of the given setObject: " + tLObject.getClass());
            }
            document2 = document;
            stickerSet = null;
            if (stickerSet == null) {
            }
            TLRPC.StickerSet stickerSet3222 = stickerSet;
            if (document2 == null) {
            }
            if (MessageObject.isTextColorEmoji(document2)) {
            }
            switch (i11) {
            }
        }
    }
}
