package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ ly c;
    public final /* synthetic */ Long d;

    public /* synthetic */ p60(LaunchActivity launchActivity, ly lyVar, Long l10, int i3) {
        this.a = i3;
        this.b = launchActivity;
        this.c = lyVar;
        this.d = l10;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Long l10 = this.d;
        ly lyVar = this.c;
        LaunchActivity launchActivity = this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q != null) {
                            storyItem.dialogId = l10.longValue();
                            ei.r9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
                            createOverlayStoryViewer.J();
                            createOverlayStoryViewer.T(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.fc X = org.telegram.ui.Components.fc.X();
                        if (X != null) {
                            org.telegram.messenger.k5.o(null, 2131744616, X, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.fc X2 = org.telegram.ui.Components.fc.X();
                    if (X2 != null) {
                        org.telegram.messenger.k5.o(null, 2131744616, X2, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
            default:
                String str2 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (storyItem != null) {
                    if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        if (Q2 != null) {
                            storyItem.dialogId = l10.longValue();
                            ei.r9 createOverlayStoryViewer2 = Q2.createOverlayStoryViewer();
                            createOverlayStoryViewer2.J();
                            createOverlayStoryViewer2.T(launchActivity, storyItem, null);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.fc X3 = org.telegram.ui.Components.fc.X();
                        if (X3 != null) {
                            org.telegram.messenger.k5.o(null, 2131744616, X3, R.raw.story_bomb1, 36);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Components.fc X4 = org.telegram.ui.Components.fc.X();
                    if (X4 != null) {
                        org.telegram.messenger.k5.o(null, 2131744616, X4, R.raw.story_bomb2, 36);
                        break;
                    }
                }
                break;
        }
    }
}
