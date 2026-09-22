package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class ChatMessageSharedResources {
    public Drawable chat_msgAvatarLiveLocationDrawable;
    public Drawable chat_redLocationIcon;
    public Context context;
    public org.telegram.ui.p3 inRichMessageResources;
    public org.telegram.ui.p3 outRichMessageResources;

    public ChatMessageSharedResources(Context context) {
        this.context = context;
    }

    public Drawable getAvatarLiveLocation() {
        if (this.chat_msgAvatarLiveLocationDrawable == null) {
            this.chat_msgAvatarLiveLocationDrawable = this.context.getResources().getDrawable(R.drawable.livepin).mutate();
        }
        return this.chat_msgAvatarLiveLocationDrawable;
    }

    public Drawable getRedLocationIcon() {
        if (this.chat_redLocationIcon == null) {
            this.chat_redLocationIcon = this.context.getResources().getDrawable(R.drawable.map_pin).mutate();
        }
        return this.chat_redLocationIcon;
    }
}
