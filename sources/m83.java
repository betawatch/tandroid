// default package

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m83 extends vy5 implements pr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ h93 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m83(h93 h93Var, byte b) {
        super(0);
        this.b = b;
        this.c = h93Var;
    }

    @Override // pr4
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((hd4) this.c.j.getValue()).c;
            default:
                ed4 ed4Var = this.c.a;
                File canonicalFile = ((File) ed4Var.c.invoke()).getCanonicalFile();
                synchronized (ed4.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = ed4.d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new hd4(canonicalFile, ed4Var.a, (kr5) ed4Var.b.invoke(canonicalFile), new dd4(canonicalFile, (byte) 0));
        }
    }
}
