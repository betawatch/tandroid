package n2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public final void onChange(boolean z9) {
        this.c.c();
    }
}
