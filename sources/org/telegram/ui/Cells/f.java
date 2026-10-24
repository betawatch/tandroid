package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.a;
        z90 z90Var = jVar.w;
        if (z90Var != null) {
            CharacterStyle characterStyle = z90Var.i;
            final String url = characterStyle instanceof q61 ? ((q61) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.y;
            final float f7 = jVar.x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.w.i;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, jVar.getContext(), (org.telegram.ui.ActionBar.g6) null, false);
                h3Var.fixNavigationBar();
                h3Var.title = url;
                h3Var.bigTitle = false;
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
                                    org.telegram.messenger.v0.p(R.string.UsernameCopied, xc.a0(o2Var), R.raw.copy, 36);
                                } else if (str.startsWith("#") || str.startsWith("$")) {
                                    org.telegram.messenger.v0.p(R.string.HashtagCopied, xc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.v0.p(R.string.LinkCopied, xc.a0(o2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                h3Var.items = charSequenceArr;
                h3Var.onClickListener = onClickListener;
                h3Var.setOnHideListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Cells.e
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.a.e();
                    }
                });
                h3Var.show();
            }
            jVar.w = null;
        }
    }
}
