// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l4d extends cib {
    public final /* synthetic */ bib d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4d(bib bibVar, o94[] o94VarArr, boolean z, int i) {
        super(o94VarArr, z, i);
        this.d = bibVar;
    }

    @Override // cib
    public final void c(zz4 zz4Var, TaskCompletionSource taskCompletionSource) {
        this.d.a.accept(zz4Var, taskCompletionSource);
    }
}
