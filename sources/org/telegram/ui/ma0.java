package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements h5.d {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ w10 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ma0(LaunchActivity launchActivity, w10 w10Var, Long l10, int i10) {
        this.a = launchActivity;
        this.b = w10Var;
        this.c = l10;
        this.d = i10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        w10 w10Var = this.b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.y1;
        try {
            w10Var.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.qc X = org.telegram.ui.Components.qc.X();
            if (X != null) {
                kf.k0.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
            bundle.putBoolean("my_profile", l10.longValue() == UserConfig.getInstance(launchActivity.L).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l10.longValue());
        }
        bundle.putInt("open_story_album_id", this.d);
        launchActivity.p0(new ProfileActivity(bundle, null));
    }
}
