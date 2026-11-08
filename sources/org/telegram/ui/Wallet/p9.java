package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ p9(w9 w9Var, int i7) {
        this.a = i7;
        this.b = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w9 w9Var = this.b;
                if (w9Var.y != null) {
                    org.telegram.messenger.g0.v1(w9Var.N);
                    w9Var.m0(w9Var.y, null);
                    break;
                }
                break;
            case 1:
                w9 w9Var2 = this.b;
                if (w9Var2.y != null) {
                    org.telegram.messenger.g0.v1(w9Var2.N);
                    w9Var2.m0(w9Var2.y, null);
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
                            w9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = w9Var3.N;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            w9Var3.S = false;
                            w9Var3.p0(true);
                            break;
                        }
                    } else {
                        w9Var3.S = false;
                        w9Var3.p0(true);
                        break;
                    }
                } else {
                    w9Var3.S = false;
                    w9Var3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
