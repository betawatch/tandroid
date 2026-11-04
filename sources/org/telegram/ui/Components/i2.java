package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ i2(int i3) {
        this.a = i3;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                break;
            case 1:
                if (i3 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            case 2:
                if (i3 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            case 3:
                if (i3 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            case 4:
                if (i3 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
            default:
                if (i3 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    break;
                }
                break;
        }
        return false;
    }
}
