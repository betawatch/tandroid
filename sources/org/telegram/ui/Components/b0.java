package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
