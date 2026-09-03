package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ z10 c;
    public final /* synthetic */ Long d;

    public /* synthetic */ ka0(LaunchActivity launchActivity, z10 z10Var, Long l10, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = z10Var;
        this.d = l10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.qc X;
        int i10;
        int i11;
        org.telegram.ui.Components.qc X2;
        int i12;
        int i13;
        int i14 = this.a;
        Long l10 = this.d;
        z10 z10Var = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i14) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                try {
                    z10Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R != null) {
                            storyItem.dialogId = l10.longValue();
                            oh.i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                            createOverlayStoryViewer.v();
                            createOverlayStoryViewer.G(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X = org.telegram.ui.Components.qc.X();
                        if (X != null) {
                            i10 = R.raw.story_bomb1;
                            i11 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X = org.telegram.ui.Components.qc.X();
                    if (X != null) {
                        i10 = R.raw.story_bomb2;
                        i11 = R.string.StoryNotFound;
                    }
                }
                l.d.v(i11, X, i10, 36);
                break;
            default:
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    z10Var.run();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (R2 != null) {
                            storyItem.dialogId = l10.longValue();
                            oh.i9 createOverlayStoryViewer2 = R2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.v();
                            createOverlayStoryViewer2.G(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        X2 = org.telegram.ui.Components.qc.X();
                        if (X2 != null) {
                            i12 = R.raw.story_bomb1;
                            i13 = R.string.StoryNotFound;
                        }
                    }
                } else {
                    X2 = org.telegram.ui.Components.qc.X();
                    if (X2 != null) {
                        i12 = R.raw.story_bomb2;
                        i13 = R.string.StoryNotFound;
                    }
                }
                l.d.v(i13, X2, i12, 36);
                break;
        }
    }
}
