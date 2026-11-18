package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hi0 {
    public final LaunchActivity a;
    public final ArrayList b = new ArrayList();
    public int c = TLObject.FLAG_31;

    public hi0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.b.isEmpty();
        LaunchActivity launchActivity = this.a;
        try {
            if (isEmpty || launchActivity.getResources().getConfiguration().smallestScreenWidthDp >= 600 || (Build.VERSION.SDK_INT >= 24 && launchActivity.isInMultiWindowMode())) {
                int i7 = this.c;
                if (i7 != Integer.MIN_VALUE) {
                    launchActivity.setRequestedOrientation(i7);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
