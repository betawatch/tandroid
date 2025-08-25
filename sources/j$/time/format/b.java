package j$.time.format;

import java.util.Locale;

/* loaded from: classes2.dex */
final class b extends u {
    final /* synthetic */ t e;

    b(t tVar) {
        this.e = tVar;
    }

    @Override // j$.time.format.u
    public final String c(j$.time.chrono.l lVar, j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        return this.e.a(j, textStyle);
    }

    @Override // j$.time.format.u
    public final String d(j$.time.temporal.a aVar, long j, TextStyle textStyle, Locale locale) {
        return this.e.a(j, textStyle);
    }
}
