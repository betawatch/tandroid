package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class xh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ RichMessageLayout.Text b;
    public final /* synthetic */ RichMessageLayout c;
    public final /* synthetic */ View d;

    public /* synthetic */ xh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.b = text;
        this.d = view;
        this.c = richMessageLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$revealSpoilers$4(this.d, this.c);
                break;
            default:
                this.b.lambda$revealSpoilers$3(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ xh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.b = text;
        this.c = richMessageLayout;
        this.d = view;
    }
}
