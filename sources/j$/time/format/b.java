package j$.time.format;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class b extends u {
    public final /* synthetic */ t d;

    public b(t tVar) {
        this.d = tVar;
    }

    @Override // j$.time.format.u
    public final String a(j$.time.chrono.k kVar, j$.time.temporal.o oVar, long j3, TextStyle textStyle, Locale locale) {
        return this.d.a(j3, textStyle);
    }

    @Override // j$.time.format.u
    public final String b(j$.time.temporal.o oVar, long j3, TextStyle textStyle, Locale locale) {
        return this.d.a(j3, textStyle);
    }
}
