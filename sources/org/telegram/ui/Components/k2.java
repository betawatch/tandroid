package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i7) {
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
