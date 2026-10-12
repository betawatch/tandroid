package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ l8(r8 r8Var, int i10) {
        this.a = i10;
        this.b = r8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r8 r8Var = this.b;
                if (r8Var.w != null) {
                    AndroidUtilities.hideKeyboard(r8Var.M);
                    r8Var.f0(r8Var.w, null);
                    break;
                }
                break;
            case 1:
                r8 r8Var2 = this.b;
                if (r8Var2.w != null) {
                    AndroidUtilities.hideKeyboard(r8Var2.M);
                    r8Var2.f0(r8Var2.w, null);
                    break;
                }
                break;
            case 2:
                r8 r8Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) r8Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(r8Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            r8Var3.M.setText(coerceToText.toString().trim());
                            di.g2 g2Var = r8Var3.M;
                            g2Var.setSelection(g2Var.length());
                            break;
                        } else {
                            r8Var3.R = false;
                            r8Var3.i0(true);
                            break;
                        }
                    } else {
                        r8Var3.R = false;
                        r8Var3.i0(true);
                        break;
                    }
                } else {
                    r8Var3.R = false;
                    r8Var3.i0(true);
                    break;
                }
                break;
            default:
                this.b.c0();
                break;
        }
    }
}
