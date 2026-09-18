package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.a;
        d90 d90Var = jVar.w;
        if (d90Var != null) {
            CharacterStyle characterStyle = d90Var.i;
            final String url = characterStyle instanceof n51 ? ((n51) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.y;
            final float f7 = jVar.x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.w.i;
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, jVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                g3Var.fixNavigationBar();
                g3Var.title = url;
                g3Var.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                            return;
                        }
                        if (i10 == 1) {
                            String str = url;
                            AndroidUtilities.addToClipboard(str);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str.startsWith("@")) {
                                    org.telegram.messenger.w1.o(R.string.UsernameCopied, vc.a0(o2Var), R.raw.copy, 36);
                                } else if (str.startsWith("#") || str.startsWith("$")) {
                                    org.telegram.messenger.w1.o(R.string.HashtagCopied, vc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.w1.o(R.string.LinkCopied, vc.a0(o2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                g3Var.items = charSequenceArr;
                g3Var.onClickListener = onClickListener;
                g3Var.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.a.e();
                    }
                });
                g3Var.show();
            }
            jVar.w = null;
        }
    }
}
