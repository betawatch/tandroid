package oh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s50;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d3 implements s50 {
    public final /* synthetic */ f4 a;

    public d3(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // org.telegram.ui.Components.s50
    public final long a() {
        return this.a.y1;
    }

    @Override // org.telegram.ui.Components.s50
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.s50
    public final int getClassGuid() {
        return this.a.w2;
    }

    @Override // org.telegram.ui.Components.s50
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.s50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.s50
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z4, int i10, int i11, boolean z10, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        f4 f4Var = this.a;
        TL_stories.StoryItem storyItem = f4Var.L1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = f4Var.y1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = f4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, f4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            } else {
                accountInstance3 = f4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, f4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = f4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, f4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
        } else if (photoEntry.path != null) {
            accountInstance = f4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, f4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
        }
        f4Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.s50
    public final /* synthetic */ boolean w() {
        return false;
    }
}
