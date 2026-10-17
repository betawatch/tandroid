package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ o9(t9 t9Var, int i10) {
        this.a = i10;
        this.b = t9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t9 t9Var = this.b;
                if (t9Var.w != null) {
                    AndroidUtilities.hideKeyboard(t9Var.M);
                    t9Var.f0(t9Var.w, null);
                    break;
                }
                break;
            case 1:
                t9 t9Var2 = this.b;
                if (t9Var2.w != null) {
                    AndroidUtilities.hideKeyboard(t9Var2.M);
                    t9Var2.f0(t9Var2.w, null);
                    break;
                }
                break;
            case 2:
                t9 t9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) t9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(t9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            t9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = t9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            break;
                        } else {
                            t9Var3.R = false;
                            t9Var3.i0(true);
                            break;
                        }
                    } else {
                        t9Var3.R = false;
                        t9Var3.i0(true);
                        break;
                    }
                } else {
                    t9Var3.R = false;
                    t9Var3.i0(true);
                    break;
                }
                break;
            default:
                this.b.c0();
                break;
        }
    }
}
