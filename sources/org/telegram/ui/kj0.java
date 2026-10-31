package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kj0 {
    public final LaunchActivity a;
    public final ArrayList b = new ArrayList();
    public int c = TLObject.FLAG_31;

    public kj0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.b.isEmpty();
        LaunchActivity launchActivity = this.a;
        try {
            if (isEmpty || launchActivity.getResources().getConfiguration().smallestScreenWidthDp >= 600 || (Build.VERSION.SDK_INT >= 24 && launchActivity.isInMultiWindowMode())) {
                int i10 = this.c;
                if (i10 != Integer.MIN_VALUE) {
                    launchActivity.setRequestedOrientation(i10);
                    this.c = TLObject.FLAG_31;
                    return;
                }
                return;
            }
            if (this.c == Integer.MIN_VALUE) {
                this.c = launchActivity.getRequestedOrientation();
            }
            if (launchActivity.getRequestedOrientation() != 1) {
                launchActivity.setRequestedOrientation(1);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
