package ci;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.y50;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class k3 implements y50 {
    public final /* synthetic */ q4 a;

    public k3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.y50
    public final long a() {
        return this.a.B1;
    }

    @Override // org.telegram.ui.Components.y50
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.y50
    public final int getClassGuid() {
        return this.a.z2;
    }

    @Override // org.telegram.ui.Components.y50
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.y50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.y50
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        q4 q4Var = this.a;
        TL_stories.StoryItem storyItem = q4Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = q4Var.B1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            } else {
                accountInstance3 = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = q4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
        } else if (photoEntry.path != null) {
            accountInstance = q4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, q4Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
        }
        q4Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.y50
    public final /* synthetic */ boolean x() {
        return false;
    }
}
