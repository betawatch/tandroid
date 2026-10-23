package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ hf(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.Sb(false);
                break;
            default:
                this.b.Sb(false);
                break;
        }
    }
}
