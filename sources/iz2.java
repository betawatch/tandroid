// default package

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class iz2 implements FilenameFilter {
    public final /* synthetic */ byte a;

    public /* synthetic */ iz2(byte b) {
        this.a = b;
    }

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
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
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
