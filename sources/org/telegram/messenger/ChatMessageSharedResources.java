package org.telegram.messenger;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
