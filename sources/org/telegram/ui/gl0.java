package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ gl0(wm0 wm0Var, int i9) {
        this.a = i9;
        this.b = wm0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                wm0 wm0Var = this.b;
                if (i9 != 5) {
                    if (i9 != 6) {
                        wm0Var.getClass();
                        break;
                    } else {
                        wm0Var.H.callOnClick();
                        break;
                    }
                } else {
                    wm0Var.U[2].requestFocus();
                    break;
                }
            case 1:
                wm0 wm0Var2 = this.b;
                wm0Var2.getClass();
                if (i9 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = wm0Var2.U;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            wm0Var2.U[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            wm0Var2.U[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                wm0 wm0Var3 = this.b;
                wm0Var3.getClass();
                if (i9 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = wm0Var3.W;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            wm0Var3.W[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            wm0Var3.W[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                wm0 wm0Var4 = this.b;
                wm0Var4.getClass();
                if (i9 == 6 || i9 == 5) {
                    wm0Var4.H.callOnClick();
                    break;
                }
                break;
            case 4:
                wm0 wm0Var5 = this.b;
                wm0Var5.getClass();
                if (i9 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = wm0Var5.U;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            wm0Var5.U[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            wm0Var5.U[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                wm0 wm0Var6 = this.b;
                wm0Var6.getClass();
                if (i9 == 5 || i9 == 6) {
                    wm0Var6.H.callOnClick();
                    break;
                }
                break;
            default:
                wm0 wm0Var7 = this.b;
                wm0Var7.getClass();
                if (i9 == 6 || i9 == 5) {
                    wm0Var7.H.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
