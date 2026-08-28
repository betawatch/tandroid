package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.a;
        m80 m80Var = jVar.w;
        if (m80Var != null) {
            CharacterStyle characterStyle = m80Var.i;
            final String url = characterStyle instanceof p41 ? ((p41) characterStyle).getURL() : characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.y;
            final float f10 = jVar.x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.w.i;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(jVar.getContext(), null, false, false);
                f3Var.fixNavigationBar();
                f3Var.title = url;
                f3Var.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Cells.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        j jVar2 = f.this.a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.D;
                        if (i9 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f10);
                            return;
                        }
                        if (i9 == 1) {
                            String str = url;
                            AndroidUtilities.addToClipboard(str);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str.startsWith("@")) {
                                    org.telegram.messenger.l0.p(R.string.UsernameCopied, oc.a0(o2Var), R.raw.copy, 36);
                                } else if (str.startsWith("#") || str.startsWith("$")) {
                                    org.telegram.messenger.l0.p(R.string.HashtagCopied, oc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.l0.p(R.string.LinkCopied, oc.a0(o2Var), R.raw.copy, 36);
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
