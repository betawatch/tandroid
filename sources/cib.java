// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cib {
    public final o94[] a;
    public final boolean b;
    public final char c;

    /* JADX WARN: Multi-variable type inference failed */
    public cib(o94[] o94VarArr, boolean z, int i) {
        this.a = o94VarArr;
        boolean z2 = false;
        if (o94VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static bib b() {
        bib bibVar = new bib();
        bibVar.b = true;
        bibVar.d = (char) 0;
        return bibVar;
    }

    public abstract void c(zz4 zz4Var, TaskCompletionSource taskCompletionSource);
}
