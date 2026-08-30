package nh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.q50;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c3 implements q50 {
    public final /* synthetic */ d4 a;

    public c3(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.q50
    public final long a() {
        return this.a.y1;
    }

    @Override // org.telegram.ui.Components.q50
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.q50
    public final int getClassGuid() {
        return this.a.w2;
    }

    @Override // org.telegram.ui.Components.q50
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.q50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.q50
    public final void r(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z4, int i10, int i11, boolean z10, long j10) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        d4 d4Var = this.a;
        TL_stories.StoryItem storyItem = d4Var.L1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = d4Var.y1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, d4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            } else {
                accountInstance3 = d4Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, d4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z4, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j10);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = d4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, d4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
        } else if (photoEntry.path != null) {
            accountInstance = d4Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, d4Var.y1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z4, i10, i11, false, photoEntry.caption, null, 0L, j10);
        }
        d4Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.q50
    public final /* synthetic */ boolean v() {
        return false;
    }
}
