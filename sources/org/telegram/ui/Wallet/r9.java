package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ r9(y9 y9Var, int i7) {
        this.a = i7;
        this.b = y9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                if (y9Var.y != null) {
                    org.telegram.messenger.g0.v1(y9Var.N);
                    y9Var.m0(y9Var.y, null);
                    break;
                }
                break;
            case 1:
                y9 y9Var2 = this.b;
                if (y9Var2.y != null) {
                    org.telegram.messenger.g0.v1(y9Var2.N);
                    y9Var2.m0(y9Var2.y, null);
                    break;
                }
                break;
            case 2:
                y9 y9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) y9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(y9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            y9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = y9Var3.N;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            y9Var3.S = false;
                            y9Var3.p0(true);
                            break;
                        }
                    } else {
                        y9Var3.S = false;
                        y9Var3.p0(true);
                        break;
                    }
                } else {
                    y9Var3.S = false;
                    y9Var3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
