package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ q9(x9 x9Var, int i7) {
        this.a = i7;
        this.b = x9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                if (x9Var.y != null) {
                    org.telegram.messenger.g0.v1(x9Var.N);
                    x9Var.m0(x9Var.y, null);
                    break;
                }
                break;
            case 1:
                x9 x9Var2 = this.b;
                if (x9Var2.y != null) {
                    org.telegram.messenger.g0.v1(x9Var2.N);
                    x9Var2.m0(x9Var2.y, null);
                    break;
                }
                break;
            case 2:
                x9 x9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) x9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(x9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            x9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = x9Var3.N;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            x9Var3.S = false;
                            x9Var3.p0(true);
                            break;
                        }
                    } else {
                        x9Var3.S = false;
                        x9Var3.p0(true);
                        break;
                    }
                } else {
                    x9Var3.S = false;
                    x9Var3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
