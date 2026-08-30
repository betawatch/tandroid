package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka0 implements h5.d {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ g00 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ka0(LaunchActivity launchActivity, g00 g00Var, Long l10, int i10) {
        this.a = launchActivity;
        this.b = g00Var;
        this.c = l10;
        this.d = i10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        g00 g00Var = this.b;
        TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
        Pattern pattern = LaunchActivity.y1;
        try {
            g00Var.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity.R();
        if (tL_storyAlbum == null) {
            org.telegram.ui.Components.qc X = org.telegram.ui.Components.qc.X();
            if (X != null) {
                kh.a2.v(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
