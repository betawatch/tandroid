package org.telegram.ui.Wallet;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                j9 j9Var = (j9) this.b;
                if (i7 != 3) {
                    j9Var.getClass();
                    return false;
                }
                org.telegram.messenger.g0.v1(j9Var.b);
                return true;
            case 1:
                da daVar = (da) this.b;
                if (i7 == 6) {
                    hi.e eVar = daVar.e0;
                    if (eVar.e0) {
                        eVar.performClick();
                        return true;
                    }
                } else {
                    daVar.getClass();
                }
                return false;
            default:
                db dbVar = (db) this.b;
                EditText editText = dbVar.a;
                boolean z10 = keyEvent != null && (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160);
                if (i7 != 5 && !z10) {
                    return false;
                }
                if (keyEvent == null || (keyEvent.getAction() == 1 && !keyEvent.isCanceled())) {
                    String lowerCase = editText.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty() || !dbVar.b()) {
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
                            dbVar.setError(false);
                            dbVar.a();
                            Runnable runnable = dbVar.r;
                            if (runnable != null) {
                                editText.post(runnable);
                            }
                        } else {
                            dbVar.setError(true);
                        }
                    } else {
                        dbVar.setError(false);
                        dbVar.a();
                        Runnable runnable2 = dbVar.r;
                        if (runnable2 != null) {
                            editText.post(runnable2);
                        }
                    }
                }
                return true;
        }
    }
}
