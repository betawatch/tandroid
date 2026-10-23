package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ l9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r9 r9Var = this.b;
                if (r9Var.w != null) {
                    AndroidUtilities.hideKeyboard(r9Var.M);
                    r9Var.h0(r9Var.w, null);
                    break;
                }
                break;
            case 1:
                r9 r9Var2 = this.b;
                if (r9Var2.w != null) {
                    AndroidUtilities.hideKeyboard(r9Var2.M);
                    r9Var2.h0(r9Var2.w, null);
                    break;
                }
                break;
            case 2:
                r9 r9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) r9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(r9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            r9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = r9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            break;
                        } else {
                            r9Var3.R = false;
                            r9Var3.k0(true);
                            break;
                        }
                    } else {
                        r9Var3.R = false;
                        r9Var3.k0(true);
                        break;
                    }
                } else {
                    r9Var3.R = false;
                    r9Var3.k0(true);
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
