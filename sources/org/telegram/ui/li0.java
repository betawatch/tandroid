package org.telegram.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;

    public /* synthetic */ li0(yj0 yj0Var, int i3) {
        this.a = i3;
        this.b = yj0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                if (i3 != 5) {
                    if (i3 != 6) {
                        yj0Var.getClass();
                        break;
                    } else {
                        yj0Var.M.callOnClick();
                        break;
                    }
                } else {
                    yj0Var.Z[2].requestFocus();
                    break;
                }
            case 1:
                yj0 yj0Var2 = this.b;
                yj0Var2.getClass();
                if (i3 == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = yj0Var2.Z;
                    if (intValue < editTextBoldCursorArr.length) {
                        if (!editTextBoldCursorArr[intValue].isFocusable()) {
                            yj0Var2.Z[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            yj0Var2.Z[intValue].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 2:
                yj0 yj0Var3 = this.b;
                yj0Var3.getClass();
                if (i3 == 5) {
                    int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr2 = yj0Var3.b0;
                    if (intValue2 < editTextBoldCursorArr2.length) {
                        if (!editTextBoldCursorArr2[intValue2].isFocusable()) {
                            yj0Var3.b0[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            yj0Var3.b0[intValue2].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 3:
                yj0 yj0Var4 = this.b;
                yj0Var4.getClass();
                if (i3 == 6 || i3 == 5) {
                    yj0Var4.M.callOnClick();
                    break;
                }
                break;
            case 4:
                yj0 yj0Var5 = this.b;
                yj0Var5.getClass();
                if (i3 == 5) {
                    int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr3 = yj0Var5.Z;
                    if (intValue3 < editTextBoldCursorArr3.length) {
                        if (!editTextBoldCursorArr3[intValue3].isFocusable()) {
                            yj0Var5.Z[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                            textView.clearFocus();
                            org.telegram.messenger.g0.v1(textView);
                            break;
                        } else {
                            yj0Var5.Z[intValue3].requestFocus();
                            break;
                        }
                    }
                }
                break;
            case 5:
                yj0 yj0Var6 = this.b;
                yj0Var6.getClass();
                if (i3 == 5 || i3 == 6) {
                    yj0Var6.M.callOnClick();
                    break;
                }
                break;
            default:
                yj0 yj0Var7 = this.b;
                yj0Var7.getClass();
                if (i3 == 6 || i3 == 5) {
                    yj0Var7.M.callOnClick();
                    break;
                }
                break;
        }
        return true;
    }
}
