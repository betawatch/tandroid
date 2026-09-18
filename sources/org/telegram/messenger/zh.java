package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class zh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ RichMessageLayout.Text b;
    public final /* synthetic */ RichMessageLayout c;
    public final /* synthetic */ View d;

    public /* synthetic */ zh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
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

    public /* synthetic */ zh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.b = text;
        this.c = richMessageLayout;
        this.d = view;
    }
}
