package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk0 b;

    public /* synthetic */ oi0(bk0 bk0Var, int i7) {
        this.a = i7;
        this.b = bk0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                bk0 bk0Var = this.b;
                if (i7 != 5) {
                    if (i7 != 6) {
                        bk0Var.getClass();
                        break;
                    } else {
                        bk0Var.L.callOnClick();
                        break;
                    }
                } else {
                    bk0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                bk0 bk0Var2 = this.b;
                bk0Var2.getClass();
                if (i7 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = bk0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            bk0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            bk0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                bk0 bk0Var3 = this.b;
                bk0Var3.getClass();
                if (i7 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = bk0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            bk0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            bk0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                bk0 bk0Var4 = this.b;
                bk0Var4.getClass();
                if (i7 == 6 || i7 == 5) {
                    bk0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                bk0 bk0Var5 = this.b;
                bk0Var5.getClass();
                if (i7 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = bk0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            bk0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            bk0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                bk0 bk0Var6 = this.b;
                bk0Var6.getClass();
                if (i7 == 5 || i7 == 6) {
                    bk0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                bk0 bk0Var7 = this.b;
                bk0Var7.getClass();
                if (i7 == 6 || i7 == 5) {
                    bk0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
