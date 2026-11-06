package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                t8 t8Var = (t8) this.b;
                if (i7 != 3) {
                    t8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(t8Var.b);
                return true;
            case 1:
                n9 n9Var = (n9) this.b;
                if (i7 == 6) {
                    fi.d dVar = n9Var.d0;
                    if (dVar.c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    n9Var.getClass();
                }
                return false;
            default:
                oa oaVar = (oa) this.b;
                EditText editText = oaVar.a;
                boolean z9 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i7 != 5 && !z9) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !oaVar.b()) {
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
                            oaVar.setError(false);
                            oaVar.a();
                            Runnable runnable = oaVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            oaVar.setError(true);
                        }
                    } else {
                        oaVar.setError(false);
                        oaVar.a();
                        Runnable runnable2 = oaVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
