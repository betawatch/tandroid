package m1;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements rd.a {
    public final /* synthetic */ Context b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.b = context;
        this.c = cVar;
    }

    @Override // rd.a
    public final Object invoke() {
        Context applicationContext = this.b;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        String name = this.c.a;
        kotlin.jvm.internal.i.e(name, "name");
        String fileName = kotlin.jvm.internal.i.g(".preferences_pb", name);
        kotlin.jvm.internal.i.e(fileName, "fileName");
        return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.i.g(fileName, "datastore/"));
    }
}
