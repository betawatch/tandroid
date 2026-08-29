package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca0 implements f5.d {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ x60 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ca0(LaunchActivity launchActivity, x60 x60Var, Long l10, int i10) {
        this.a = launchActivity;
        this.b = x60Var;
        this.c = l10;
        this.d = i10;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        x60 x60Var = this.b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.x1;
        try {
            x60Var.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.tc X = org.telegram.ui.Components.tc.X();
            if (X != null) {
                j7.l1.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        Long l10 = this.c;
        long longValue = l10.longValue();
        LaunchActivity launchActivity = this.a;
        if (longValue > 0) {
            bundle.putLong("user_id", l10.longValue());
            bundle.putBoolean("my_profile", l10.longValue() == UserConfig.getInstance(launchActivity.K).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}
