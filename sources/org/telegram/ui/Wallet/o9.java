package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ o9(v9 v9Var, int i7) {
        this.a = i7;
        this.b = v9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                if (v9Var.y != null) {
                    org.telegram.messenger.g0.v1(v9Var.N);
                    v9Var.m0(v9Var.y, null);
                    break;
                }
                break;
            case 1:
                v9 v9Var2 = this.b;
                if (v9Var2.y != null) {
                    org.telegram.messenger.g0.v1(v9Var2.N);
                    v9Var2.m0(v9Var2.y, null);
                    break;
                }
                break;
            case 2:
                v9 v9Var3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) v9Var3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(v9Var3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            v9Var3.N.setText(coerceToText.toString().trim());
                            ah.i iVar = v9Var3.N;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            v9Var3.S = false;
                            v9Var3.p0(true);
                            break;
                        }
                    } else {
                        v9Var3.S = false;
                        v9Var3.p0(true);
                        break;
                    }
                } else {
                    v9Var3.S = false;
                    v9Var3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
