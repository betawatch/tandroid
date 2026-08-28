package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ o2(int i9) {
        this.a = i9;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                break;
            case 1:
                if (i9 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            case 2:
                if (i9 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            case 3:
                if (i9 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            case 4:
                if (i9 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            default:
                if (i9 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
        }
        return false;
    }
}
