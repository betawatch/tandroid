package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class vh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ RichMessageLayout.Text b;
    public final /* synthetic */ RichMessageLayout c;
    public final /* synthetic */ View d;

    public /* synthetic */ vh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
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

    public /* synthetic */ vh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.b = text;
        this.c = richMessageLayout;
        this.d = view;
    }
}
