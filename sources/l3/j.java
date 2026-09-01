package l3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import c2.z0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ z0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z0 z0Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = z0Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        z0 z0Var = this.c;
        z0.a(z0Var, g.a((Context) z0Var.b));
    }
}
