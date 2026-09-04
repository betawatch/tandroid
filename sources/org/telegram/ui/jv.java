package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.cy0 {
    public final /* synthetic */ o0.a I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(Context context, long j3, o0.a aVar) {
        super(context);
        this.I = aVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.r = p6Var;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, false, false);
        this.s = p6Var2;
        p6Var.setCallback(this);
        p6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        i9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            i9Var.g(14);
            imageReceiver.setForUserOrChat(null, i9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, i9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.cy0
    public final void b() {
        o0.a aVar = this.I;
        z6 z6Var = (z6) aVar.c;
        z6Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) aVar.b).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        z6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
