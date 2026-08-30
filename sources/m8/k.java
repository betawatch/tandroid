package m8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k extends z5.a {
    public final /* synthetic */ int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(DataHolder dataHolder, int i10, int i11, int i12) {
        super(dataHolder, i10);
        this.d = i12;
        this.e = i11;
    }

    public final String toString() {
        String str;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.a;
                int i10 = this.b;
                dataHolder.f(i10, "event_type");
                if (dataHolder.d[this.c].getInt(i10, dataHolder.c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i11 = this.b;
                    dataHolder.f(i11, "event_type");
                    str = dataHolder.d[this.c].getInt(i11, dataHolder.c.getInt("event_type")) == 2 ? "deleted" : "unknown";
                }
                return yh.l("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.b, this.e, 1).toString(), " }");
            default:
                boolean isLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.a;
                int i12 = this.b;
                dataHolder2.f(i12, "data");
                byte[] blob = dataHolder2.d[this.c].getBlob(i12, dataHolder2.c.getInt("data"));
                int i13 = this.e;
                HashMap hashMap = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    l lVar = new l(dataHolder2, this.b + i14);
                    DataHolder dataHolder3 = lVar.a;
                    int i15 = lVar.b;
                    dataHolder3.f(i15, "asset_key");
                    if (dataHolder3.d[lVar.c].getString(i15, dataHolder3.c.getInt("asset_key")) != null) {
                        int i16 = lVar.b;
                        dataHolder3.f(i16, "asset_key");
                        hashMap.put(dataHolder3.d[lVar.c].getString(i16, dataHolder3.c.getInt("asset_key")), lVar);
                    }
                }
                StringBuilder sb = new StringBuilder("DataItemRef{ ");
                int i17 = this.b;
                dataHolder2.f(i17, "path");
                sb.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.c].getString(i17, dataHolder2.c.getInt("path"))))));
                sb.append(", dataSz=".concat((blob == null ? BuildConfig.BETA_URL : Integer.valueOf(blob.length)).toString()));
                sb.append(", numAssets=" + hashMap.size());
                if (isLoggable && !hashMap.isEmpty()) {
                    sb.append(", assets=[");
                    String str2 = "";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb.append(str2 + ((String) entry.getKey()) + ": " + ((l8.f) entry.getValue()).getId());
                        str2 = ", ";
                    }
                    sb.append("]");
                }
                sb.append(" }");
                return sb.toString();
        }
    }
}
