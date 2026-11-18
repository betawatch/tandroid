package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ ga(na naVar, int i7) {
        this.a = i7;
        this.b = naVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                na naVar = this.b;
                if (naVar.y != null) {
                    org.telegram.messenger.g0.v1(naVar.O);
                    naVar.m0(naVar.y, null);
                    break;
                }
                break;
            case 1:
                na naVar2 = this.b;
                if (naVar2.y != null) {
                    org.telegram.messenger.g0.v1(naVar2.O);
                    naVar2.m0(naVar2.y, null);
                    break;
                }
                break;
            case 2:
                na naVar3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) naVar3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(naVar3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            naVar3.O.setText(coerceToText.toString().trim());
                            ah.i iVar = naVar3.O;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            naVar3.T = false;
                            naVar3.p0(true);
                            break;
                        }
                    } else {
                        naVar3.T = false;
                        naVar3.p0(true);
                        break;
                    }
                } else {
                    naVar3.T = false;
                    naVar3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
