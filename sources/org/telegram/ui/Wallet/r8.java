package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                s8 s8Var = (s8) this.b;
                if (i7 != 3) {
                    s8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(s8Var.b);
                return true;
            case 1:
                m9 m9Var = (m9) this.b;
                if (i7 == 6) {
                    fi.d dVar = m9Var.d0;
                    if (dVar.c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    m9Var.getClass();
                }
                return false;
            default:
                na naVar = (na) this.b;
                EditText editText = naVar.a;
                boolean z9 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i7 != 5 && !z9) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !naVar.b()) {
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
                            naVar.setError(false);
                            naVar.a();
                            Runnable runnable = naVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            naVar.setError(true);
                        }
                    } else {
                        naVar.setError(false);
                        naVar.a();
                        Runnable runnable2 = naVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
