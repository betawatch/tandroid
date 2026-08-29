package m1;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements bd.a {
    public final /* synthetic */ Context b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.b = context;
        this.c = cVar;
    }

    @Override // bd.a
    public final Object invoke() {
        Context applicationContext = this.b;
        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
        String name = this.c.a;
        kotlin.jvm.internal.j.e(name, "name");
        String fileName = kotlin.jvm.internal.j.g(".preferences_pb", name);
        kotlin.jvm.internal.j.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.j.g(fileName, "datastore/"));
    }
}
