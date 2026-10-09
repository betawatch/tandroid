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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hv extends org.telegram.ui.Components.ez0 {
    public final /* synthetic */ n6.t I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(Context context, long j3, n6.t tVar) {
        super(context);
        this.I = tVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.r = q6Var;
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, true, false);
        this.s = q6Var2;
        q6Var.setCallback(this);
        q6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j3 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            j9Var.g(14);
            imageReceiver.setForUserOrChat(null, j9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, j9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j3));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.ez0
    public final void b() {
        n6.t tVar = this.I;
        y6 y6Var = (y6) tVar.c;
        y6Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((r6) tVar.b).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
