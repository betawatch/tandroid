package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                k9 k9Var = (k9) this.b;
                if (i7 != 3) {
                    k9Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(k9Var.b);
                return true;
            case 1:
                ea eaVar = (ea) this.b;
                if (i7 == 6) {
                    hi.e eVar = eaVar.e0;
                    if (eVar.e0) {
                        eVar.performClick();
                        return true;
                    }
                } else {
                    eaVar.getClass();
                }
                return false;
            default:
                eb ebVar = (eb) this.b;
                EditText editText = ebVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i7 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !ebVar.b()) {
                        String str = null;
                        if (!lowerCase.isEmpty()) {
                            String[] mnemonicWordlist = WalletEngine2.getMnemonicWordlist();
                            int length = mnemonicWordlist.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    String str2 = mnemonicWordlist[i10];
                                    if (str2.startsWith(lowerCase)) {
                                        str = str2;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                        if (str != null) {
                            editText.setText(str);
                            editText.setSelection(str.length());
                            ebVar.setError(false);
                            ebVar.a();
                            Runnable runnable = ebVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            ebVar.setError(true);
                        }
                    } else {
                        ebVar.setError(false);
                        ebVar.a();
                        Runnable runnable2 = ebVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
