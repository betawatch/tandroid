package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dy0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.a.drawChild(canvas, view, j10);
            default:
                return ((we1) this.b).drawChild(canvas, view, j10);
        }
    }
}
