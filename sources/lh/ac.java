package lh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class ac {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ cc n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ac(cc ccVar, boolean z10, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.n = ccVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() { // from class: lh.yb
            /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i12;
                int i13;
                ac acVar = ac.this;
                String str2 = str;
                Long l11 = l10;
                long j13 = j11;
                long j14 = j12;
                int i14 = i11;
                long j15 = j10;
                int i15 = i10;
                Runnable runnable2 = runnable;
                long maxScrollDuration = acVar.n.getMaxScrollDuration();
                try {
                    acVar.e.setDataSource(str2);
                    String extractMetadata = acVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        acVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = acVar.e.extractMetadata(18);
                    i12 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                } catch (Exception e9) {
                    e = e9;
                    i12 = 0;
                }
                try {
                    String extractMetadata3 = acVar.e.extractMetadata(19);
                    i13 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                    try {
                        String extractMetadata4 = acVar.e.extractMetadata(24);
                        if (extractMetadata4 != null) {
                            int parseInt = Integer.parseInt(extractMetadata4);
                            if (parseInt == 90 || parseInt == 270) {
                                int i16 = i13;
                                i13 = i12;
                                i12 = i16;
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        acVar.e = null;
                        FileLog.e(e);
                        int i17 = i13;
                        if (l11 != null) {
                        }
                        if (j13 != -1) {
                            maxScrollDuration = j14 - j13;
                        }
                        float clamp = Utilities.clamp((i12 != 0 || i17 == 0) ? 1.0f : i12 / i17, 1.3333334f, 0.5625f);
                        acVar.g = Math.max(1, i14);
                        acVar.f = Math.max(1, (int) Math.ceil(i14 * clamp));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i15) / acVar.f);
                        acVar.c = ceil;
                        acVar.b = (long) (maxScrollDuration / ceil);
                        acVar.j = -acVar.b;
                        if (j13 != -1) {
                        }
                        acVar.c();
                        if (runnable2 != null) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    i13 = 0;
                    acVar.e = null;
                    FileLog.e(e);
                    int i172 = i13;
                    if (l11 != null) {
                    }
                    if (j13 != -1) {
                    }
                    float clamp2 = Utilities.clamp((i12 != 0 || i172 == 0) ? 1.0f : i12 / i172, 1.3333334f, 0.5625f);
                    acVar.g = Math.max(1, i14);
                    acVar.f = Math.max(1, (int) Math.ceil(i14 * clamp2));
                    int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i15) / acVar.f);
                    acVar.c = ceil2;
                    acVar.b = (long) (maxScrollDuration / ceil2);
                    acVar.j = -acVar.b;
                    if (j13 != -1) {
                    }
                    acVar.c();
                    if (runnable2 != null) {
                    }
                }
                int i1722 = i13;
                if (l11 != null) {
                    maxScrollDuration = l11.longValue();
                    acVar.a = maxScrollDuration;
                }
                if (j13 != -1 && j14 != -1) {
                    maxScrollDuration = j14 - j13;
                }
                float clamp22 = Utilities.clamp((i12 != 0 || i1722 == 0) ? 1.0f : i12 / i1722, 1.3333334f, 0.5625f);
                acVar.g = Math.max(1, i14);
                acVar.f = Math.max(1, (int) Math.ceil(i14 * clamp22));
                int ceil22 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i15) / acVar.f);
                acVar.c = ceil22;
                acVar.b = (long) (maxScrollDuration / ceil22);
                acVar.j = -acVar.b;
                if (j13 != -1) {
                    acVar.j = j13 - acVar.b;
                }
                acVar.c();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
        });
    }

    public final void b() {
        this.i = true;
        Utilities.themeQueue.cancelRunnable(new kh.c(this, 27));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((zb) obj).a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e9) {
                this.e = null;
                FileLog.e(e9);
            }
        }
    }

    public final void c() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        int i10 = 27;
        Utilities.themeQueue.cancelRunnable(new kh.c(this, i10));
        Utilities.themeQueue.postRunnable(new kh.c(this, i10));
    }
}
