// default package

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lka implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lka(pg7 pg7Var, jq5 jq5Var) {
        this.b = pg7Var;
        this.c = jq5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (nka) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            default:
                int i = a4f.a;
                z6f.O3();
                int i2 = v6f.a;
                z6f.O3();
                int i3 = a4f.a;
                return ((pg7) obj2).b.e((jq5) obj);
        }
    }

    public lka(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.c = shortcutInfoCompatSaverImpl;
        this.b = str;
    }
}
