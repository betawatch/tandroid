package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ s9(z9 z9Var, int i7) {
        this.a = i7;
        this.b = z9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z9 z9Var = this.b;
                if (z9Var.y != null) {
                    org.telegram.messenger.g0.v1(z9Var.O);
                    z9Var.m0(z9Var.y, null);
                    break;
                }
                break;
            case 1:
                z9 z9Var2 = this.b;
                if (z9Var2.y != null) {
                    org.telegram.messenger.g0.v1(z9Var2.O);
                    z9Var2.m0(z9Var2.y, null);
                    break;
                }
                break;
            case 2:
                z9 z9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) z9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(z9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            z9Var3.O.setText(coerceToText.toString().trim());
                            ah.i iVar = z9Var3.O;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            z9Var3.T = false;
                            z9Var3.p0(true);
                            break;
                        }
                    } else {
                        z9Var3.T = false;
                        z9Var3.p0(true);
                        break;
                    }
                } else {
                    z9Var3.T = false;
                    z9Var3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
