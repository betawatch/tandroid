package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                t8 t8Var = (t8) this.b;
                if (i10 != 3) {
                    t8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(t8Var.b);
                return true;
            case 1:
                o9 o9Var = (o9) this.b;
                if (i10 == 6) {
                    ei.d dVar = o9Var.a0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    o9Var.getClass();
                }
                return false;
            default:
                la laVar = (la) this.b;
                EditText editText = laVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i10 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !laVar.b()) {
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
                            laVar.setError(false);
                            laVar.a();
                            Runnable runnable = laVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            laVar.setError(true);
                        }
                    } else {
                        laVar.setError(false);
                        laVar.a();
                        Runnable runnable2 = laVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
