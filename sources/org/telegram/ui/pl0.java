package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ pl0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        gn0Var.getClass();
                        break;
                    } else {
                        gn0Var.L.callOnClick();
                        break;
                    }
                } else {
                    gn0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                gn0 gn0Var2 = this.b;
                gn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = gn0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            gn0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            gn0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                gn0 gn0Var3 = this.b;
                gn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = gn0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            gn0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            gn0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                gn0 gn0Var4 = this.b;
                gn0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    gn0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                gn0 gn0Var5 = this.b;
                gn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = gn0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            gn0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            gn0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                gn0 gn0Var6 = this.b;
                gn0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    gn0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                gn0 gn0Var7 = this.b;
                gn0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    gn0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
