package m1;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements dd.a {
    public final /* synthetic */ Context b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.b = context;
        this.c = cVar;
    }

    @Override // dd.a
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
