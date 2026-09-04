package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import di.g7;
import ji.u4;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ g7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g7 g7Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = g7Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        g7 g7Var = this.c;
        g7Var.a(b.c((Context) g7Var.b, (b2.e) g7Var.j, (u4) g7Var.i));
    }
}
