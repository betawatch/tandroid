package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ p9(w9 w9Var, int i3) {
        this.a = i3;
        this.b = w9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w9 w9Var = this.b;
                if (w9Var.y != null) {
                    org.telegram.messenger.g0.v1(w9Var.O);
                    w9Var.m0(w9Var.y, null);
                    break;
                }
                break;
            case 1:
                w9 w9Var2 = this.b;
                if (w9Var2.y != null) {
                    org.telegram.messenger.g0.v1(w9Var2.O);
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
                            w9Var3.O.setText(coerceToText.toString().trim());
                            bh.g gVar = w9Var3.O;
                            gVar.setSelection(gVar.length());
                            break;
                        } else {
                            w9Var3.T = false;
                            w9Var3.p0(true);
                            break;
                        }
                    } else {
                        w9Var3.T = false;
                        w9Var3.p0(true);
                        break;
                    }
                } else {
                    w9Var3.T = false;
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
