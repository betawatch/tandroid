package bi;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o50;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class d4 implements o50 {
    public final /* synthetic */ o5 a;

    public d4(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.o50
    public final long a() {
        return this.a.B1;
    }

    @Override // org.telegram.ui.Components.o50
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Components.o50
    public final int getClassGuid() {
        return this.a.z2;
    }

    @Override // org.telegram.ui.Components.o50
    public final View getFragmentView() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.o50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.a.getContext());
    }

    @Override // org.telegram.ui.Components.o50
    public final void q(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11, long j3) {
        AccountInstance accountInstance;
        AccountInstance accountInstance2;
        AccountInstance accountInstance3;
        AccountInstance accountInstance4;
        o5 o5Var = this.a;
        TL_stories.StoryItem storyItem = o5Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        storyItem.dialogId = o5Var.B1;
        if (photoEntry.isVideo) {
            if (videoEditedInfo != null) {
                accountInstance4 = o5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance4, photoEntry.path, videoEditedInfo, null, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
            } else {
                accountInstance3 = o5Var.getAccountInstance();
                SendMessagesHelper.prepareSendingVideo(accountInstance3, photoEntry.path, null, null, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z10, i10, i11, false, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
            }
        } else if (photoEntry.imagePath != null) {
            accountInstance2 = o5Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, photoEntry.imagePath, photoEntry.thumbPath, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j3);
        } else if (photoEntry.path != null) {
            accountInstance = o5Var.getAccountInstance();
            SendMessagesHelper.prepareSendingPhoto(accountInstance, photoEntry.path, photoEntry.thumbPath, null, o5Var.B1, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z10, i10, i11, false, photoEntry.caption, null, 0L, j3);
        }
        o5Var.k0(j3 <= 0);
    }

    @Override // org.telegram.ui.Components.o50
    public final /* synthetic */ boolean v() {
        return false;
    }
}
