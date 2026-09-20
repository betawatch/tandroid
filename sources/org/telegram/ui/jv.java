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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.oy0 {
    public final /* synthetic */ m5.e I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(Context context, long j3, m5.e eVar) {
        super(context);
        this.I = eVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.r = n6Var;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, false, false);
        this.s = n6Var2;
        n6Var.setCallback(this);
        n6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            g9Var.g(14);
            imageReceiver.setForUserOrChat(null, g9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, g9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.oy0
    public final void b() {
        m5.e eVar = this.I;
        z6 z6Var = (z6) eVar.c;
        z6Var.X.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) eVar.b).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        z6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
