// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bg7 extends b7a {
    public final ArrayList a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bg7(String str, ArrayList arrayList) {
        super(r3, null);
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this.a = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg7(ArrayList arrayList, String str, bg7 bg7Var) {
        super(str, bg7Var);
        arrayList.getClass();
        this.a = arrayList;
    }
}
