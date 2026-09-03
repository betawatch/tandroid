package l3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import c2.a1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ a1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a1 a1Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = a1Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        a1 a1Var = this.c;
        a1.a(a1Var, g.a((Context) a1Var.b));
    }
}
