package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ l2(int i7) {
        this.a = i7;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                break;
            case 1:
                if (i7 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            case 2:
                if (i7 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            case 3:
                if (i7 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            case 4:
                if (i7 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            default:
                if (i7 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
        }
        return false;
    }
}
