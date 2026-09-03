package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ ol0(fn0 fn0Var, int i10) {
        this.a = i10;
        this.b = fn0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.b;
                if (i10 != 5) {
                    if (i10 != 6) {
                        fn0Var.getClass();
                        break;
                    } else {
                        fn0Var.I.callOnClick();
                        break;
                    }
                } else {
                    fn0Var.V[2].requestFocus();
                    break;
                }
            case 1:
                fn0 fn0Var2 = this.b;
                fn0Var2.getClass();
                if (i10 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = fn0Var2.V;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            fn0Var2.V[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            fn0Var2.V[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                fn0 fn0Var3 = this.b;
                fn0Var3.getClass();
                if (i10 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = fn0Var3.X;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            fn0Var3.X[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            fn0Var3.X[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                fn0 fn0Var4 = this.b;
                fn0Var4.getClass();
                if (i10 == 6 || i10 == 5) {
                    fn0Var4.I.callOnClick();
                    break;
                }
                break;
            case 4:
                fn0 fn0Var5 = this.b;
                fn0Var5.getClass();
                if (i10 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = fn0Var5.V;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            fn0Var5.V[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            AndroidUtilities.hideKeyboard(textView);
                            break;
                        } else {
                            fn0Var5.V[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                fn0 fn0Var6 = this.b;
                fn0Var6.getClass();
                if (i10 == 5 || i10 == 6) {
                    fn0Var6.I.callOnClick();
                    break;
                }
                break;
            default:
                fn0 fn0Var7 = this.b;
                fn0Var7.getClass();
                if (i10 == 6 || i10 == 5) {
                    fn0Var7.I.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
