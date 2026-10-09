package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ m8(s8 s8Var, int i10) {
        this.a = i10;
        this.b = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                s8 s8Var = this.b;
                if (s8Var.w != null) {
                    AndroidUtilities.hideKeyboard(s8Var.M);
                    s8Var.f0(s8Var.w, null);
                    break;
                }
                break;
            case 1:
                s8 s8Var2 = this.b;
                if (s8Var2.w != null) {
                    AndroidUtilities.hideKeyboard(s8Var2.M);
                    s8Var2.f0(s8Var2.w, null);
                    break;
                }
                break;
            case 2:
                s8 s8Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) s8Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(s8Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            s8Var3.M.setText(coerceToText.toString().trim());
                            ci.g2 g2Var = s8Var3.M;
                            g2Var.setSelection(g2Var.length());
                            break;
                        } else {
                            s8Var3.R = false;
                            s8Var3.i0(true);
                            break;
                        }
                    } else {
                        s8Var3.R = false;
                        s8Var3.i0(true);
                        break;
                    }
                } else {
                    s8Var3.R = false;
                    s8Var3.i0(true);
                    break;
                }
                break;
            default:
                this.b.c0();
                break;
        }
    }
}
