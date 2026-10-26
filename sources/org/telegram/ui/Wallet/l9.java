package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                if (r9Var.x != null) {
                    AndroidUtilities.hideKeyboard(r9Var.N);
                    r9Var.i0(r9Var.x, null);
                    break;
                }
                break;
            case 1:
                r9 r9Var2 = this.b;
                if (r9Var2.x != null) {
                    AndroidUtilities.hideKeyboard(r9Var2.N);
                    r9Var2.i0(r9Var2.x, null);
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
                            r9Var3.N.setText(coerceToText.toString().trim());
                            fi.c2 c2Var = r9Var3.N;
                            c2Var.setSelection(c2Var.length());
                            break;
                        } else {
                            r9Var3.S = false;
                            r9Var3.l0(true);
                            break;
                        }
                    } else {
                        r9Var3.S = false;
                        r9Var3.l0(true);
                        break;
                    }
                } else {
                    r9Var3.S = false;
                    r9Var3.l0(true);
                    break;
                }
                break;
            default:
                this.b.e0();
                break;
        }
    }
}
