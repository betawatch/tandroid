// default package

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class my7 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xz7 b;

    public /* synthetic */ my7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                if (i != 5) {
                    if (i != 6) {
                        break;
                    } else {
                        xz7Var.M.callOnClick();
                        break;
                    }
                } else {
                    xz7Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                if (i != 5) {
                    break;
                } else {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = xz7Var.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        boolean isFocusable = editTextBoldCursorArr[intValue].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr2 = xz7Var.Z;
                        if (!isFocusable) {
                            editTextBoldCursorArr2[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            gm.t1(textView);
                            break;
                        } else {
                            editTextBoldCursorArr2[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (i != 5) {
                    break;
                } else {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = xz7Var.b0;
                    if (intValue2 < editTextBoldCursorArr3.length) {
                        boolean isFocusable2 = editTextBoldCursorArr3[intValue2].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr4 = xz7Var.b0;
                        if (!isFocusable2) {
                            editTextBoldCursorArr4[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            gm.t1(textView);
                            break;
                        } else {
                            editTextBoldCursorArr4[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (i != 6 && i != 5) {
                    break;
                } else {
                    xz7Var.M.callOnClick();
                    break;
                }
            case 4:
                if (i != 5) {
                    break;
                } else {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr5 = xz7Var.Z;
                    if (intValue3 < editTextBoldCursorArr5.length) {
                        boolean isFocusable3 = editTextBoldCursorArr5[intValue3].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr6 = xz7Var.Z;
                        if (!isFocusable3) {
                            editTextBoldCursorArr6[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            gm.t1(textView);
                            break;
                        } else {
                            editTextBoldCursorArr6[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                if (i != 5 && i != 6) {
                    break;
                } else {
                    xz7Var.M.callOnClick();
                    break;
                }
            default:
                if (i != 6 && i != 5) {
                    break;
                } else {
                    xz7Var.M.callOnClick();
                    break;
                }
        }
        return true;
    }
}
