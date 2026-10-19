package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ gl0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                vm0 vm0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        vm0Var.getClass();
                        break;
                    } else {
                        vm0Var.L.callOnClick();
                        break;
                    }
                } else {
                    vm0Var.Y[2].requestFocus();
                    break;
                }
            case 1:
                vm0 vm0Var2 = this.b;
                vm0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = vm0Var2.Y;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            vm0Var2.Y[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            vm0Var2.Y[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                vm0 vm0Var3 = this.b;
                vm0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = vm0Var3.a0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            vm0Var3.a0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            vm0Var3.a0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                vm0 vm0Var4 = this.b;
                vm0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    vm0Var4.L.callOnClick();
                    break;
                }
                break;
            case 4:
                vm0 vm0Var5 = this.b;
                vm0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = vm0Var5.Y;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            vm0Var5.Y[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            vm0Var5.Y[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                vm0 vm0Var6 = this.b;
                vm0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    vm0Var6.L.callOnClick();
                    break;
                }
                break;
            default:
                vm0 vm0Var7 = this.b;
                vm0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    vm0Var7.L.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
