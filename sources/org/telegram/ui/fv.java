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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fv extends org.telegram.ui.Components.fy0 {
    public final /* synthetic */ n7.qa F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(Context context, long j10, n7.qa qaVar) {
        super(context);
        this.F = qaVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.r = j6Var;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, false, false);
        this.s = j6Var2;
        j6Var.setCallback(this);
        j6Var2.setCallback(this);
        this.n = Long.valueOf(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            z8Var.g(14);
            imageReceiver.setForUserOrChat(null, z8Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, z8Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.fy0
    public final void b() {
        n7.qa qaVar = this.F;
        b7 b7Var = (b7) qaVar.c;
        b7Var.Q.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((u6) qaVar.b).a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        b7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
