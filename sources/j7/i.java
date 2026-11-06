package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new b(7);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public i(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.a = type;
        this.b = credentialRetrievalData;
        this.c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f = protocolType;
        boolean z9 = (xd.d.j(requestType) || xd.d.j(protocolType)) ? false : true;
        boolean z10 = !xd.d.j(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z9 || z10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
        com.google.android.recaptcha.internal.a.s(sb2, "Either type: ", type, ", or requestType: ", requestType);
        throw new IllegalArgumentException(f1.n(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.a);
        xb.b(dest, 2, this.b);
        xb.b(dest, 3, this.c);
        xb.l(dest, 4, this.d);
        xb.l(dest, 5, this.e);
        xb.l(dest, 6, this.f);
        xb.s(dest, r10);
    }
}
