package jh;

import android.content.Context;
import hh.gb;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r extends gb {
    public final /* synthetic */ Utilities.Callback[] i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, b bVar, Utilities.Callback[] callbackArr) {
        super(context, bVar);
        this.i0 = callbackArr;
    }

    @Override // hh.gb
    public final void e(int i10) {
        this.i0[0].run(Integer.valueOf(i10));
    }
}
