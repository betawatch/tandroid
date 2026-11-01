package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    baVar.m0(baVar.y, null);
                    break;
                }
                break;
            case 1:
                ba baVar2 = this.b;
                if (baVar2.y != null) {
                    org.telegram.messenger.i0.v1(baVar2.N);
                    baVar2.m0(baVar2.y, null);
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
                            baVar3.p0(true);
                            break;
                        }
                    } else {
                        baVar3.S = false;
                        baVar3.p0(true);
                        break;
                    }
                } else {
                    baVar3.S = false;
                    baVar3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
