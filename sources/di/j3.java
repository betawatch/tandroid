package di;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a60;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j3 implements a60 {
    public final /* synthetic */ q4 a;

    public j3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.a60
    public final long a() {
        return this.a.q1;
    }

    @Override // org.telegram.ui.Components.a60
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.a60
    public final int getClassGuid() {
        return this.a.o2;
    }

    @Override // org.telegram.ui.Components.a60
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.a60
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.a60
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        q4 q4Var = this.a;
        TL_stories.StoryItem storyItem = q4Var.D1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = q4Var.q1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, q4Var.q1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            } else {
                accountInstance3 = q4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, q4Var.q1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = q4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, q4Var.q1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
        } else if (photoEntry.path != null) {
            accountInstance = q4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, q4Var.q1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j10);
        }
        q4Var.i0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.a60
    public final /* synthetic */ boolean w() {
        return false;
    }
}
