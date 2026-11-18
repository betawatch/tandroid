package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class bb {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ db n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public bb(db dbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.n = dbVar;
        this.h = z10;
        Utilities.i.c(new Runnable() { // from class: hi.za
            /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i11;
                int i12;
                bb bbVar = bb.this;
                String str2 = str;
                Long l11 = l10;
                long j12 = j10;
                long j13 = j11;
                int i13 = i10;
                long j14 = j3;
                int i14 = i7;
                Runnable runnable2 = runnable;
                long maxScrollDuration = bbVar.n.getMaxScrollDuration();
                try {
                    bbVar.e.setDataSource(str2);
                    String extractMetadata = bbVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        bbVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = bbVar.e.extractMetadata(18);
                    i12 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    try {
                        String extractMetadata3 = bbVar.e.extractMetadata(19);
                        r16 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                        String extractMetadata4 = bbVar.e.extractMetadata(24);
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
                        bbVar.e = null;
                        org.telegram.messenger.a8.g(e, true);
                        i12 = r16;
                        if (l11 != null) {
                        }
                        if (j12 != -1) {
                            maxScrollDuration = j13 - j12;
                        }
                        float i16 = Utilities.i((i12 != 0 || i11 == 0) ? 1.0f : i12 / i11, 1.3333334f, 0.5625f);
                        bbVar.g = Math.max(1, i13);
                        bbVar.f = Math.max(1, (int) Math.ceil(i13 * i16));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j14) / j14) * i14) / bbVar.f);
                        bbVar.c = ceil;
                        bbVar.b = (long) (maxScrollDuration / ceil);
                        bbVar.j = -bbVar.b;
                        if (j12 != -1) {
                        }
                        bbVar.c();
                        org.telegram.messenger.g0.g3(runnable2);
                    }
                } catch (Exception e11) {
                    e = e11;
                    i11 = 0;
                }
                if (l11 != null) {
                    maxScrollDuration = l11.longValue();
                    bbVar.a = maxScrollDuration;
                }
                if (j12 != -1 && j13 != -1) {
                    maxScrollDuration = j13 - j12;
                }
                float i162 = Utilities.i((i12 != 0 || i11 == 0) ? 1.0f : i12 / i11, 1.3333334f, 0.5625f);
                bbVar.g = Math.max(1, i13);
                bbVar.f = Math.max(1, (int) Math.ceil(i13 * i162));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j14) / j14) * i14) / bbVar.f);
                bbVar.c = ceil2;
                bbVar.b = (long) (maxScrollDuration / ceil2);
                bbVar.j = -bbVar.b;
                if (j12 != -1) {
                    bbVar.j = j12 - bbVar.b;
                }
                bbVar.c();
                org.telegram.messenger.g0.g3(runnable2);
            }
        });
    }

    public final void b() {
        this.i = true;
        Utilities.i.a(new k(this, 24));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((ab) obj).a;
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
        int i7 = 24;
        Utilities.i.a(new k(this, i7));
        Utilities.i.c(new k(this, i7));
    }
}
