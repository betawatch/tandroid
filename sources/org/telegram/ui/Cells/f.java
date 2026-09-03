package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.a;
        g90 g90Var = jVar.w;
        if (g90Var != null) {
            CharacterStyle characterStyle = g90Var.i;
            final String url = characterStyle instanceof m51 ? ((m51) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.y;
            final float f10 = jVar.x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.w.i;
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(jVar.getContext(), null, false, false);
                g3Var.fixNavigationBar();
                g3Var.title = url;
                g3Var.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.a;
                        org.telegram.ui.ActionBar.p2 p2Var = jVar2.E;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f10);
                            return;
                        }
                        if (i10 == 1) {
                            String str = url;
                            AndroidUtilities.addToClipboard(str);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str.startsWith("@")) {
                                    kf.k0.v(R.string.UsernameCopied, qc.a0(p2Var), R.raw.copy, 36);
                                } else if (str.startsWith("#") || str.startsWith("$")) {
                                    kf.k0.v(R.string.HashtagCopied, qc.a0(p2Var), R.raw.copy, 36);
                                } else {
                                    kf.k0.v(R.string.LinkCopied, qc.a0(p2Var), R.raw.copy, 36);
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
