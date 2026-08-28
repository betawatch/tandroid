package ih;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.x40;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d3 implements x40 {
    public final /* synthetic */ i4 a;

    public d3(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.x40
    public final long a() {
        return this.a.x1;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.x40
    public final int getClassGuid() {
        return this.a.v2;
    }

    @Override // org.telegram.ui.Components.x40
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.x40
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.x40
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i9, int i10, boolean z11, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        i4 i4Var = this.a;
        TL_stories.StoryItem storyItem = i4Var.K1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = i4Var.x1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = i4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, i4Var.x1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i9, i10, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            } else {
                accountInstance3 = i4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, i4Var.x1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i9, i10, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = i4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, i4Var.x1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i9, i10, false, photoEntry.caption, null, 0L, j10);
        } else if (photoEntry.path != null) {
            accountInstance = i4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, i4Var.x1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i9, i10, false, photoEntry.caption, null, 0L, j10);
        }
        i4Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean w() {
        return false;
    }
}
