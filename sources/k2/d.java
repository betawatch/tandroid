package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.e7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class d extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ e7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e7 e7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = e7Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        e7 e7Var = this.c;
        e7Var.a(b.c((Context) e7Var.b, (b2.e) e7Var.j, (a6.m) e7Var.i));
    }
}
