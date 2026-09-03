package n5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c b = new c(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((Scope) obj).b.compareTo(((Scope) obj2).b);
    }
}
