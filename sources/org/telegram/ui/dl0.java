package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ dl0(vm0 vm0Var, int i10) {
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
                        vm0Var.H.callOnClick();
                        break;
                    }
                } else {
                    vm0Var.U[2].requestFocus();
                    break;
                }
            case 1:
                vm0 vm0Var2 = this.b;
                vm0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = vm0Var2.U;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            vm0Var2.U[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            vm0Var2.U[intValue].requestFocus();
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
                    EditTextBoldCursor[] editTextBoldCursorArr2 = vm0Var3.W;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            vm0Var3.W[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            vm0Var3.W[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                vm0 vm0Var4 = this.b;
                vm0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    vm0Var4.H.callOnClick();
                    break;
                }
                break;
            case 4:
                vm0 vm0Var5 = this.b;
                vm0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = vm0Var5.U;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            vm0Var5.U[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            vm0Var5.U[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                vm0 vm0Var6 = this.b;
                vm0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    vm0Var6.H.callOnClick();
                    break;
                }
                break;
            default:
                vm0 vm0Var7 = this.b;
                vm0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    vm0Var7.H.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
