package i8;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends v5.a implements h8.f {
    @Override // h8.f
    public final String a() {
        DataHolder dataHolder = this.a;
        int i9 = this.b;
        dataHolder.c(i9, "asset_key");
        return dataHolder.d[this.c].getString(i9, dataHolder.c.getInt("asset_key"));
    }

    @Override // h8.f
    public final String getId() {
        DataHolder dataHolder = this.a;
        int i9 = this.b;
        dataHolder.c(i9, "asset_id");
        return dataHolder.d[this.c].getString(i9, dataHolder.c.getInt("asset_id"));
    }
}
