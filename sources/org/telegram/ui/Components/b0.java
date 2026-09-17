package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ int c;

    public /* synthetic */ b0(int i10, int i11, Utilities.Callback callback) {
        this.a = i11;
        this.b = callback;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.run(Integer.valueOf(this.c));
                break;
            default:
                Utilities.Callback callback = this.b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.c));
                    break;
                }
                break;
        }
    }
}
