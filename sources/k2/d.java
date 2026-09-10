package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import bi.h8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ h8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h8 h8Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = h8Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        h8 h8Var = this.c;
        h8Var.a(b.c((Context) h8Var.b, (b2.e) h8Var.j, (a6.i) h8Var.i));
    }
}
