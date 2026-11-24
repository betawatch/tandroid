package j$.time.format;

import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
