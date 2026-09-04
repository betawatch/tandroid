package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class ChatMessageSharedResources {
    public Drawable chat_msgAvatarLiveLocationDrawable;
    public Drawable chat_redLocationIcon;
    public Context context;
    public org.telegram.ui.q3 inRichMessageResources;
    public org.telegram.ui.q3 outRichMessageResources;

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
