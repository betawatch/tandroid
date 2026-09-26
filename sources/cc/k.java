package cc;

import n6.l;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class k extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        l.g(str, "Detail message must not be empty");
    }
}
