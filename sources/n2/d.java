package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = eVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.c.c();
    }
}
