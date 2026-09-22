package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.a;
        o90 o90Var = jVar.w;
        if (o90Var != null) {
            CharacterStyle characterStyle = o90Var.i;
            final String url = characterStyle instanceof c61 ? ((c61) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.y;
            final float f7 = jVar.x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.w.i;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, jVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                f3Var.fixNavigationBar();
                f3Var.title = url;
                f3Var.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.a;
                        org.telegram.ui.ActionBar.n2 n2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                            return;
                        }
                        if (i10 == 1) {
                            String str = url;
                            AndroidUtilities.addToClipboard(str);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str.startsWith("@")) {
                                    org.telegram.messenger.l0.o(R.string.UsernameCopied, xc.a0(n2Var), R.raw.copy, 36);
                                } else if (str.startsWith("#") || str.startsWith("$")) {
                                    org.telegram.messenger.l0.o(R.string.HashtagCopied, xc.a0(n2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.l0.o(R.string.LinkCopied, xc.a0(n2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                f3Var.items = charSequenceArr;
                f3Var.onClickListener = onClickListener;
                f3Var.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.a.e();
                    }
                });
                f3Var.show();
            }
            jVar.w = null;
        }
    }
}
