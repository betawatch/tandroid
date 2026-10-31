package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ u9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ba baVar = this.b;
                if (baVar.y != null) {
                    org.telegram.messenger.i0.v1(baVar.N);
                    baVar.l0(baVar.y, null);
                    break;
                }
                break;
            case 1:
                ba baVar2 = this.b;
                if (baVar2.y != null) {
                    org.telegram.messenger.i0.v1(baVar2.N);
                    baVar2.l0(baVar2.y, null);
                    break;
                }
                break;
            case 2:
                ba baVar3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) baVar3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(baVar3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            baVar3.N.setText(coerceToText.toString().trim());
                            org.telegram.ui.ActionBar.n0 n0Var = baVar3.N;
                            n0Var.setSelection(n0Var.length());
                            break;
                        } else {
                            baVar3.S = false;
                            baVar3.o0(true);
                            break;
                        }
                    } else {
                        baVar3.S = false;
                        baVar3.o0(true);
                        break;
                    }
                } else {
                    baVar3.S = false;
                    baVar3.o0(true);
                    break;
                }
                break;
            default:
                this.b.h0();
                break;
        }
    }
}
