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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.dy0 {
    public final /* synthetic */ o0.a I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(Context context, long j3, o0.a aVar) {
        super(context);
        this.I = aVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true, false);
        this.r = m6Var;
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, true, false, false);
        this.s = m6Var2;
        m6Var.setCallback(this);
        m6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        f9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            f9Var.g(14);
            imageReceiver.setForUserOrChat(null, f9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, f9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.dy0
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
