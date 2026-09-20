package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import ci.g7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        g7Var.a(b.c((Context) g7Var.b, (b2.e) g7Var.j, (a6.m) g7Var.i));
    }
}
