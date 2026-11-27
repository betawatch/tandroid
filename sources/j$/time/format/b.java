package j$.time.format;

import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
