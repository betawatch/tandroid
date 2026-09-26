package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ n80 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ oa0(LaunchActivity launchActivity, n80 n80Var, Long l4, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = n80Var;
        this.d = l4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        org.telegram.ui.Components.xc X;
        int i10;
        int i11;
        org.telegram.ui.Components.xc X2;
        int i12;
        int i13;
        int i14 = this.a;
        Long l4 = this.d;
        n80 n80Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R != null) {
                            storyItem.dialogId = l4.longValue();
                            ai.jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                            createOverlayStoryViewer.v();
                            createOverlayStoryViewer.F(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X = org.telegram.ui.Components.xc.X();
                        if (X != null) {
                            i10 = R.raw.story_bomb1;
                            i11 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.f0.p(i11, X, i10, 36);
                break;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R2 != null) {
                            storyItem.dialogId = l4.longValue();
                            ai.jc createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.v();
                            createOverlayStoryViewer2.F(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X2 = org.telegram.ui.Components.xc.X();
                        if (X2 != null) {
                            i12 = R.raw.story_bomb1;
                            i13 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X2 = org.telegram.ui.Components.xc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    }
                }
                org.telegram.messenger.f0.p(i13, X2, i12, 36);
                break;
        }
    }
}
