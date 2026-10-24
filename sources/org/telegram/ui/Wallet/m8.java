package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                o8 o8Var = (o8) this.b;
                if (i10 != 3) {
                    o8Var.getClass();
                    return false;
                }
                AndroidUtilities.hideKeyboard(o8Var.b);
                return true;
            case 1:
                j9 j9Var = (j9) this.b;
                if (i10 == 6) {
                    ei.d dVar = j9Var.c0;
                    if (dVar.c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    j9Var.getClass();
                }
                return false;
            default:
                ia iaVar = (ia) this.b;
                EditText editText = iaVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i10 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !iaVar.b()) {
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
                            iaVar.setError(false);
                            iaVar.a();
                            Runnable runnable = iaVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            iaVar.setError(true);
                        }
                    } else {
                        iaVar.setError(false);
                        iaVar.a();
                        Runnable runnable2 = iaVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
