package org.telegram.ui.Wallet;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa b;

    public /* synthetic */ ha(oa oaVar, int i7) {
        this.a = i7;
        this.b = oaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                oa oaVar = this.b;
                if (oaVar.y != null) {
                    org.telegram.messenger.g0.v1(oaVar.O);
                    oaVar.m0(oaVar.y, null);
                    break;
                }
                break;
            case 1:
                oa oaVar2 = this.b;
                if (oaVar2.y != null) {
                    org.telegram.messenger.g0.v1(oaVar2.O);
                    oaVar2.m0(oaVar2.y, null);
                    break;
                }
                break;
            case 2:
                oa oaVar3 = this.b;
                ClipboardManager clipboardManager = (ClipboardManager) oaVar3.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(oaVar3.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            oaVar3.O.setText(coerceToText.toString().trim());
                            ah.i iVar = oaVar3.O;
                            iVar.setSelection(iVar.length());
                            break;
                        } else {
                            oaVar3.T = false;
                            oaVar3.p0(true);
                            break;
                        }
                    } else {
                        oaVar3.T = false;
                        oaVar3.p0(true);
                        break;
                    }
                } else {
                    oaVar3.T = false;
                    oaVar3.p0(true);
                    break;
                }
                break;
            default:
                this.b.i0();
                break;
        }
    }
}
