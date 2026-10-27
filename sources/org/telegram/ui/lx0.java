package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lx0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ mx0 b;

    public lx0(mx0 mx0Var, String str) {
        this.b = mx0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.qc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.u6 resourceProvider = this.b.d.getResourceProvider();
        b02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), resourceProvider);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.b.setText(string);
            b10 = b02.b(ybVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.pb();
        }
        b10.j();
    }
}
