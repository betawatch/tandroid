package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ r9(w9 w9Var, int i10) {
        this.a = i10;
        this.b = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w9 w9Var = this.b;
                if (w9Var.w != null) {
                    AndroidUtilities.hideKeyboard(w9Var.M);
                    w9Var.f0(w9Var.w, null);
                    break;
                }
                break;
            case 1:
                w9 w9Var2 = this.b;
                if (w9Var2.w != null) {
                    AndroidUtilities.hideKeyboard(w9Var2.M);
                    w9Var2.f0(w9Var2.w, null);
                    break;
                }
                break;
            case 2:
                w9 w9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) w9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(w9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            w9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = w9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            break;
                        } else {
                            w9Var3.R = false;
                            w9Var3.i0(true);
                            break;
                        }
                    } else {
                        w9Var3.R = false;
                        w9Var3.i0(true);
                        break;
                    }
                } else {
                    w9Var3.R = false;
                    w9Var3.i0(true);
                    break;
                }
                break;
            default:
                this.b.c0();
                break;
        }
    }
}
