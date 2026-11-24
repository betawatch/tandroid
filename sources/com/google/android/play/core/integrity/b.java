package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class b extends bq {
    private String a;
    private y b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        fvc.f("Null token");
        return null;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.a;
        if (str != null && (yVar = this.b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        sc8.j("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
