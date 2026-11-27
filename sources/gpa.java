// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gpa extends cpa {
    public final List a;

    public gpa(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
