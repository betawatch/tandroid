package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kx0 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ lx0 b;

    public kx0(lx0 lx0Var, String str) {
        this.b = lx0Var;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        org.telegram.ui.Components.ic b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.a));
        org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this.b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.g6 resourceProvider = this.b.d.getResourceProvider();
        a02.getClass();
        if (AndroidUtilities.shouldShowClipboardToast()) {
            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), resourceProvider);
            qbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            qbVar.b.setText(string);
            b10 = a02.b(qbVar, 1500);
        } else {
            b10 = new org.telegram.ui.Components.gb();
        }
        b10.j();
    }
}
