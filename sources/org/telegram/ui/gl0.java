package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ gl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                xm0 xm0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        xm0Var.getClass();
                        break;
                    } else {
                        xm0Var.H.callOnClick();
                        break;
                    }
                } else {
                    xm0Var.U[2].requestFocus();
                    break;
                }
            case 1:
                xm0 xm0Var2 = this.b;
                xm0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = xm0Var2.U;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            xm0Var2.U[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            xm0Var2.U[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                xm0 xm0Var3 = this.b;
                xm0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = xm0Var3.W;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            xm0Var3.W[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            xm0Var3.W[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                xm0 xm0Var4 = this.b;
                xm0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    xm0Var4.H.callOnClick();
                    break;
                }
                break;
            case 4:
                xm0 xm0Var5 = this.b;
                xm0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = xm0Var5.U;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            xm0Var5.U[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            xm0Var5.U[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                xm0 xm0Var6 = this.b;
                xm0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    xm0Var6.H.callOnClick();
                    break;
                }
                break;
            default:
                xm0 xm0Var7 = this.b;
                xm0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    xm0Var7.H.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
