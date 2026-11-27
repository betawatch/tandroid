// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class huc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ muc b;

    public /* synthetic */ huc(muc mucVar, byte b) {
        this.a = b;
        this.b = mucVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        muc mucVar = this.b;
        switch (b) {
            case 0:
                if (mucVar.y != null) {
                    hl.t1(mucVar.O);
                    mucVar.l0(mucVar.y, null);
                    break;
                }
                break;
            case 1:
                if (mucVar.y != null) {
                    hl.t1(mucVar.O);
                    mucVar.l0(mucVar.y, null);
                    break;
                }
                break;
            case 2:
                ClipboardManager clipboardManager = (ClipboardManager) mucVar.getParentActivity().getSystemService("clipboard");
                if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() != 0) {
                        CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(mucVar.getParentActivity());
                        if (!TextUtils.isEmpty(coerceToText)) {
                            mucVar.O.setText(coerceToText.toString().trim());
                            m7 m7Var = mucVar.O;
                            m7Var.setSelection(m7Var.length());
                            break;
                        } else {
                            mucVar.T = false;
                            mucVar.o0(true);
                            break;
                        }
                    } else {
                        mucVar.T = false;
                        mucVar.o0(true);
                        break;
                    }
                } else {
                    mucVar.T = false;
                    mucVar.o0(true);
                    break;
                }
                break;
            default:
                mucVar.h0();
                break;
        }
    }
}
