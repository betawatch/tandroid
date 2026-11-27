// default package

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class isb {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ ksb n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public isb(ksb ksbVar, boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
        this.n = ksbVar;
        this.h = z;
        Utilities.i.c(new Runnable() { // from class: gsb
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
                isb isbVar = isb.this;
                String str2 = str;
                Long l2 = l;
                long j4 = j2;
                long j5 = j3;
                int i6 = i2;
                long j6 = j;
                int i7 = i;
                Runnable runnable2 = runnable;
                long maxScrollDuration = isbVar.n.getMaxScrollDuration();
                try {
                    isbVar.e.setDataSource(str2);
                    String extractMetadata = isbVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        isbVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = isbVar.e.extractMetadata(18);
                    i5 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                    try {
                        String extractMetadata3 = isbVar.e.extractMetadata(19);
                        r16 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                        String extractMetadata4 = isbVar.e.extractMetadata(24);
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
                        isbVar.e = null;
                        cc4.g(e, true);
                        i4 = i3;
                        i5 = r16;
                        if (l2 != null) {
                        }
                        if (j4 != -1) {
                            maxScrollDuration = j5 - j4;
                        }
                        float i10 = Utilities.i((i5 != 0 || i4 == 0) ? 1.0f : i5 / i4, 1.3333334f, 0.5625f);
                        isbVar.g = Math.max(1, i6);
                        isbVar.f = Math.max(1, (int) Math.ceil(i6 * i10));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j6) / j6) * i7) / isbVar.f);
                        isbVar.c = ceil;
                        isbVar.b = (long) (maxScrollDuration / ceil);
                        isbVar.j = -isbVar.b;
                        if (j4 != -1) {
                        }
                        isbVar.b();
                        hl.c3(runnable2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    i3 = 0;
                }
                if (l2 != null) {
                    maxScrollDuration = l2.longValue();
                    isbVar.a = maxScrollDuration;
                }
                if (j4 != -1 && j5 != -1) {
                    maxScrollDuration = j5 - j4;
                }
                float i102 = Utilities.i((i5 != 0 || i4 == 0) ? 1.0f : i5 / i4, 1.3333334f, 0.5625f);
                isbVar.g = Math.max(1, i6);
                isbVar.f = Math.max(1, (int) Math.ceil(i6 * i102));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j6) / j6) * i7) / isbVar.f);
                isbVar.c = ceil2;
                isbVar.b = (long) (maxScrollDuration / ceil2);
                isbVar.j = -isbVar.b;
                if (j4 != -1) {
                    isbVar.j = j4 - isbVar.b;
                }
                isbVar.b();
                hl.c3(runnable2);
            }
        });
    }

    public final void a() {
        this.i = true;
        Utilities.i.a(new s8b(this, (byte) 26));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Bitmap bitmap = ((hsb) obj).a;
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
                cc4.g(e, true);
            }
        }
    }

    public final void b() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        byte b = 26;
        Utilities.i.a(new s8b(this, b));
        Utilities.i.c(new s8b(this, b));
    }
}
