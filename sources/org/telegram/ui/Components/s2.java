package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ s2(int i7) {
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
