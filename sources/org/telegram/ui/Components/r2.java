package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ r2(int i10) {
        this.a = i10;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                break;
            case 1:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            case 2:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            case 3:
                if (i10 == 6) {
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            case 4:
                if (i10 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
            default:
                if (i10 == 6) {
                    textView.clearFocus();
                    AndroidUtilities.hideKeyboard(textView);
                    break;
                }
                break;
        }
        return false;
    }
}
