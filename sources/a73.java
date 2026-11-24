// default package

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a73 extends vw5 implements op4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ v73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a73(v73 v73Var, byte b) {
        super(0);
        this.b = b;
        this.c = v73Var;
    }

    @Override // op4
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((hb4) this.c.j.getValue()).c;
            default:
                eb4 eb4Var = this.c.a;
                File canonicalFile = ((File) eb4Var.c.invoke()).getCanonicalFile();
                synchronized (eb4.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = eb4.d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new hb4(canonicalFile, eb4Var.a, (kp5) eb4Var.b.invoke(canonicalFile), new db4(canonicalFile, (byte) 0));
        }
    }
}
