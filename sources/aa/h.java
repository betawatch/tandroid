package aa;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i7 = 0; i7 < 2; i7++) {
                    Object obj = objArr[i7];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return DesugarCollections.unmodifiableList(arrayList).contains(str);
            case 3:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
