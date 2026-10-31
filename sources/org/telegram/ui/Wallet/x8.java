package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                y8 y8Var = (y8) this.b;
                if (i10 != 3) {
                    y8Var.getClass();
                    return false;
                }
                org.telegram.messenger.i0.v1(y8Var.b);
                return true;
            case 1:
                r9 r9Var = (r9) this.b;
                if (i10 == 6) {
                    vh.d dVar = r9Var.d0;
                    if (dVar.c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    r9Var.getClass();
                }
                return false;
            default:
                ra raVar = (ra) this.b;
                EditText editText = raVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i10 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !raVar.b()) {
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
                            raVar.setError(false);
                            raVar.a();
                            Runnable runnable = raVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            raVar.setError(true);
                        }
                    } else {
                        raVar.setError(false);
                        raVar.a();
                        Runnable runnable2 = raVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
