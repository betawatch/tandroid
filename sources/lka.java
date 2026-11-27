// default package

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lka implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lka(og7 og7Var, jq5 jq5Var) {
        this.b = og7Var;
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
                return ((og7) obj2).b.e((jq5) obj);
        }
    }

    public lka(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.c = shortcutInfoCompatSaverImpl;
        this.b = str;
    }
}
