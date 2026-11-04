package gi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class db {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ fb n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public db(fb fbVar, boolean z10, final String str, final int i3, final int i10, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.n = fbVar;
        this.h = z10;
        Utilities.i.c(new Runnable() { // from class: gi.bb
            /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i11;
                int i12;
                db dbVar = db.this;
                String str2 = str;
                Long l11 = l10;
                long j13 = j11;
                long j14 = j12;
                int i13 = i10;
                long j15 = j10;
                int i14 = i3;
                Runnable runnable2 = runnable;
                long maxScrollDuration = dbVar.n.getMaxScrollDuration();
                try {
                    dbVar.e.setDataSource(str2);
                    String extractMetadata = dbVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        dbVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = dbVar.e.extractMetadata(18);
                    i12 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    try {
                        String extractMetadata3 = dbVar.e.extractMetadata(19);
                        r16 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                        String extractMetadata4 = dbVar.e.extractMetadata(24);
                        if (extractMetadata4 != null) {
                            int parseInt = Integer.parseInt(extractMetadata4);
                            if (parseInt == 90 || parseInt == 270) {
                                int i15 = r16;
                                r16 = i12;
                                i12 = i15;
                            }
                        }
                        i11 = r16;
                    } catch (Exception e10) {
                        e = e10;
                        i11 = r16;
                        r16 = i12;
                        dbVar.e = null;
                        org.telegram.messenger.a8.g(e, true);
                        i12 = r16;
                        if (l11 != null) {
                        }
                        if (j13 != -1) {
                            maxScrollDuration = j14 - j13;
                        }
                        float i16 = Utilities.i((i12 != 0 || i11 == 0) ? 1.0f : i12 / i11, 1.3333334f, 0.5625f);
                        dbVar.g = Math.max(1, i13);
                        dbVar.f = Math.max(1, (int) Math.ceil(i13 * i16));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i14) / dbVar.f);
                        dbVar.c = ceil;
                        dbVar.b = (long) (maxScrollDuration / ceil);
                        dbVar.j = -dbVar.b;
                        if (j13 != -1) {
                        }
                        dbVar.c();
                        org.telegram.messenger.g0.h3(runnable2);
                    }
                } catch (Exception e11) {
                    e = e11;
                    i11 = 0;
                }
                if (l11 != null) {
                    maxScrollDuration = l11.longValue();
                    dbVar.a = maxScrollDuration;
                }
                if (j13 != -1 && j14 != -1) {
                    maxScrollDuration = j14 - j13;
                }
                float i162 = Utilities.i((i12 != 0 || i11 == 0) ? 1.0f : i12 / i11, 1.3333334f, 0.5625f);
                dbVar.g = Math.max(1, i13);
                dbVar.f = Math.max(1, (int) Math.ceil(i13 * i162));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i14) / dbVar.f);
                dbVar.c = ceil2;
                dbVar.b = (long) (maxScrollDuration / ceil2);
                dbVar.j = -dbVar.b;
                if (j13 != -1) {
                    dbVar.j = j13 - dbVar.b;
                }
                dbVar.c();
                org.telegram.messenger.g0.h3(runnable2);
            }
        });
    }

    public final void b() {
        this.i = true;
        Utilities.i.a(new f6(this, 11));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Bitmap bitmap = ((cb) obj).a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        int i3 = 11;
        Utilities.i.a(new f6(this, i3));
        Utilities.i.c(new f6(this, i3));
    }
}
