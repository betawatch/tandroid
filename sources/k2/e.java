package k2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = fVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.c.c();
    }
}
