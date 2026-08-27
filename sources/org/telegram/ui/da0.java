package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements d5.d {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ a30 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ int d;

    public /* synthetic */ da0(LaunchActivity launchActivity, a30 a30Var, Long l10, int i10) {
        this.a = launchActivity;
        this.b = a30Var;
        this.c = l10;
        this.d = i10;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        a30 a30Var = this.b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.x1;
        try {
            a30Var.run();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.mc X = org.telegram.ui.Components.mc.X();
            if (X != null) {
                org.telegram.messenger.y1.q(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
