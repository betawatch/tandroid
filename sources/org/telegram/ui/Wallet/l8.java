package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                n8 n8Var = (n8) this.b;
                if (i10 != 3) {
                    n8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(n8Var.b);
                return true;
            case 1:
                i9 i9Var = (i9) this.b;
                if (i10 == 6) {
                    ei.d dVar = i9Var.a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    i9Var.getClass();
                }
                return false;
            default:
                ha haVar = (ha) this.b;
                EditText editText = haVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i10 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !haVar.b()) {
                        String str = null;
                        if (!lowerCase.isEmpty()) {
                            String[] mnemonicWordlist = WalletEngine2.getMnemonicWordlist();
                            int length = mnemonicWordlist.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    String str2 = mnemonicWordlist[i11];
                                    if (str2.startsWith(lowerCase)) {
                                        str = str2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            editText.setText(str);
                            editText.setSelection(str.length());
                            haVar.setError(false);
                            haVar.a();
                            Runnable runnable = haVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            haVar.setError(true);
                        }
                    } else {
                        haVar.setError(false);
                        haVar.a();
                        Runnable runnable2 = haVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
