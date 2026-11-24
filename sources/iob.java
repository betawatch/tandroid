// default package

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class iob {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ kob n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public iob(kob kobVar, boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
        this.n = kobVar;
        this.h = z;
        Utilities.i.c(new Runnable() { // from class: gob
            /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i3;
                int i4;
                int i5;
                iob iobVar = iob.this;
                String str2 = str;
                Long l2 = l;
                long j4 = j2;
                long j5 = j3;
                int i6 = i2;
                long j6 = j;
                int i7 = i;
                Runnable runnable2 = runnable;
                long maxScrollDuration = iobVar.n.getMaxScrollDuration();
                try {
                    iobVar.e.setDataSource(str2);
                    String extractMetadata = iobVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        iobVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = iobVar.e.extractMetadata(18);
                    i5 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    try {
                        String extractMetadata3 = iobVar.e.extractMetadata(19);
                        r16 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                        String extractMetadata4 = iobVar.e.extractMetadata(24);
                        if (extractMetadata4 != null) {
                            int parseInt = Integer.parseInt(extractMetadata4);
                            if (parseInt == 90 || parseInt == 270) {
                                int i8 = r16;
                                r16 = i5;
                                i5 = i8;
                            }
                        }
                        i4 = r16;
                    } catch (Exception e) {
                        e = e;
                        int i9 = r16;
                        r16 = i5;
                        i3 = i9;
                        iobVar.e = null;
                        fa4.g(e, true);
                        i4 = i3;
                        i5 = r16;
                        if (l2 != null) {
                        }
                        if (j4 != -1) {
                            maxScrollDuration = j5 - j4;
                        }
                        float i10 = Utilities.i((i5 != 0 || i4 == 0) ? 1.0f : i5 / i4, 1.3333334f, 0.5625f);
                        iobVar.g = Math.max(1, i6);
                        iobVar.f = Math.max(1, (int) Math.ceil(i6 * i10));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j6) / j6) * i7) / iobVar.f);
                        iobVar.c = ceil;
                        iobVar.b = (long) (maxScrollDuration / ceil);
                        iobVar.j = -iobVar.b;
                        if (j4 != -1) {
                        }
                        iobVar.b();
                        gl.d3(runnable2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    i3 = 0;
                }
                if (l2 != null) {
                    maxScrollDuration = l2.longValue();
                    iobVar.a = maxScrollDuration;
                }
                if (j4 != -1 && j5 != -1) {
                    maxScrollDuration = j5 - j4;
                }
                float i102 = Utilities.i((i5 != 0 || i4 == 0) ? 1.0f : i5 / i4, 1.3333334f, 0.5625f);
                iobVar.g = Math.max(1, i6);
                iobVar.f = Math.max(1, (int) Math.ceil(i6 * i102));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j6) / j6) * i7) / iobVar.f);
                iobVar.c = ceil2;
                iobVar.b = (long) (maxScrollDuration / ceil2);
                iobVar.j = -iobVar.b;
                if (j4 != -1) {
                    iobVar.j = j4 - iobVar.b;
                }
                iobVar.b();
                gl.d3(runnable2);
            }
        });
    }

    public final void a() {
        this.i = true;
        Utilities.i.a(new cib(this, (byte) 9));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Bitmap bitmap = ((hob) obj).a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e) {
                this.e = null;
                fa4.g(e, true);
            }
        }
    }

    public final void b() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        byte b = 9;
        Utilities.i.a(new cib(this, b));
        Utilities.i.c(new cib(this, b));
    }
}
