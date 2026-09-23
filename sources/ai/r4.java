package ai;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p50;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class r4 implements p50 {
    public final /* synthetic */ e6 a;

    public r4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.p50
    public final long a() {
        return this.a.B1;
    }

    @Override // org.telegram.ui.Components.p50
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.p50
    public final int getClassGuid() {
        return this.a.z2;
    }

    @Override // org.telegram.ui.Components.p50
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.p50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.p50
    public final void q(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j3) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        e6 e6Var = this.a;
        TL_stories.StoryItem storyItem = e6Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = e6Var.B1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = e6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, e6Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
            } else {
                accountInstance3 = e6Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, e6Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = e6Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, e6Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j3);
        } else if (photoEntry.path != null) {
            accountInstance = e6Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, e6Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j3);
        }
        e6Var.k0(j3 <= 0);
    }

    @Override // org.telegram.ui.Components.p50
    public final /* synthetic */ boolean v() {
        return false;
    }
}
