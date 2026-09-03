package m8;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends z5.a implements l8.f {
    @Override // l8.f
    public final String a() {
        DataHolder dataHolder = this.a;
        int i10 = this.b;
        dataHolder.f(i10, "asset_key");
        return dataHolder.d[this.c].getString(i10, dataHolder.c.getInt("asset_key"));
    }

    @Override // l8.f
    public final String getId() {
        DataHolder dataHolder = this.a;
        int i10 = this.b;
        dataHolder.f(i10, "asset_id");
        return dataHolder.d[this.c].getString(i10, dataHolder.c.getInt("asset_id"));
    }
}
