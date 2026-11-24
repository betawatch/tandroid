// default package

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jw7 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vx7 b;

    public /* synthetic */ jw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                if (i != 5) {
                    if (i != 6) {
                        break;
                    } else {
                        vx7Var.M.callOnClick();
                        break;
                    }
                } else {
                    vx7Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                if (i != 5) {
                    break;
                } else {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = vx7Var.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        boolean isFocusable = editTextBoldCursorArr[intValue].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr2 = vx7Var.Z;
                        if (!isFocusable) {
                            editTextBoldCursorArr2[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            gl.t1(textView);
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
                    EditTextBoldCursor[] editTextBoldCursorArr3 = vx7Var.b0;
                    if (intValue2 < editTextBoldCursorArr3.length) {
                        boolean isFocusable2 = editTextBoldCursorArr3[intValue2].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr4 = vx7Var.b0;
                        if (!isFocusable2) {
                            editTextBoldCursorArr4[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            gl.t1(textView);
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
                    vx7Var.M.callOnClick();
                    break;
                }
            case 4:
                if (i != 5) {
                    break;
                } else {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr5 = vx7Var.Z;
                    if (intValue3 < editTextBoldCursorArr5.length) {
                        boolean isFocusable3 = editTextBoldCursorArr5[intValue3].isFocusable();
                        EditTextBoldCursor[] editTextBoldCursorArr6 = vx7Var.Z;
                        if (!isFocusable3) {
                            editTextBoldCursorArr6[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            gl.t1(textView);
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
                    vx7Var.M.callOnClick();
                    break;
                }
            default:
                if (i != 6 && i != 5) {
                    break;
                } else {
                    vx7Var.M.callOnClick();
                    break;
                }
        }
        return true;
    }
}
