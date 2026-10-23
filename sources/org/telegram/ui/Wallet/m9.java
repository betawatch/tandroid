package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ m9(s9 s9Var, int i10) {
        this.a = i10;
        this.b = s9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                s9 s9Var = this.b;
                if (s9Var.w != null) {
                    AndroidUtilities.hideKeyboard(s9Var.M);
                    s9Var.h0(s9Var.w, null);
                    break;
                }
                break;
            case 1:
                s9 s9Var2 = this.b;
                if (s9Var2.w != null) {
                    AndroidUtilities.hideKeyboard(s9Var2.M);
                    s9Var2.h0(s9Var2.w, null);
                    break;
                }
                break;
            case 2:
                s9 s9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) s9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(s9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            s9Var3.M.setText(coerceToText.toString().trim());
                            ei.e2 e2Var = s9Var3.M;
                            e2Var.setSelection(e2Var.length());
                            break;
                        } else {
                            s9Var3.R = false;
                            s9Var3.k0(true);
                            break;
                        }
                    } else {
                        s9Var3.R = false;
                        s9Var3.k0(true);
                        break;
                    }
                } else {
                    s9Var3.R = false;
                    s9Var3.k0(true);
                    break;
                }
                break;
            default:
                this.b.d0();
                break;
        }
    }
}
