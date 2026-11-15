package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                u8 u8Var = (u8) this.b;
                if (i7 != 3) {
                    u8Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(u8Var.b);
                return true;
            case 1:
                p9 p9Var = (p9) this.b;
                if (i7 == 6) {
                    hi.d dVar = p9Var.e0;
                    if (dVar.d0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    p9Var.getClass();
                }
                return false;
            default:
                pa paVar = (pa) this.b;
                EditText editText = paVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i7 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !paVar.b()) {
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
                            paVar.setError(false);
                            paVar.a();
                            Runnable runnable = paVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            paVar.setError(true);
                        }
                    } else {
                        paVar.setError(false);
                        paVar.a();
                        Runnable runnable2 = paVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
