package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dy0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ ey0 b;

    public dy0(ey0 ey0Var, String str) {
        this.b = ey0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.sc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.c6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), resourceProvider);
            acVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            acVar.b.setText(string);
            b10 = a02.b(acVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.rb();
        }
        b10.j();
    }
}
