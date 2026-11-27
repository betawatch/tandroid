package j$.time.format;

import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class b extends u {
    public final /* synthetic */ t d;

    public b(t tVar) {
        this.d = tVar;
    }

    @Override // j$.time.format.u
    public final String a(j$.time.chrono.a aVar, j$.time.temporal.a aVar2, long j, TextStyle textStyle, Locale locale) {
        return this.d.a(j, textStyle);
    }

    @Override // j$.time.format.u
    public final String b(j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        return this.d.a(j, textStyle);
    }
}
