package kh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ec {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ gc n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ec(gc gcVar, boolean z10, final String str, final int i9, final int i10, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.n = gcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() { // from class: kh.cc
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
                int i11;
                int i12;
                ec ecVar = ec.this;
                String str2 = str;
                Long l11 = l10;
                long j13 = j11;
                long j14 = j12;
                int i13 = i10;
                long j15 = j10;
                int i14 = i9;
                Runnable runnable2 = runnable;
                long maxScrollDuration = ecVar.n.getMaxScrollDuration();
                try {
                    ecVar.e.setDataSource(str2);
                    String extractMetadata = ecVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        ecVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = ecVar.e.extractMetadata(18);
                    i11 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                } catch (Exception e10) {
                    e = e10;
                    i11 = 0;
                }
                try {
                    String extractMetadata3 = ecVar.e.extractMetadata(19);
                    i12 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                    try {
                        String extractMetadata4 = ecVar.e.extractMetadata(24);
                        if (extractMetadata4 != null) {
                            int parseInt = Integer.parseInt(extractMetadata4);
                            if (parseInt == 90 || parseInt == 270) {
                                int i15 = i12;
                                i12 = i11;
                                i11 = i15;
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        ecVar.e = null;
                        FileLog.e(e);
                        int i16 = i12;
                        if (l11 != null) {
                        }
                        if (j13 != -1) {
                            maxScrollDuration = j14 - j13;
                        }
                        float clamp = Utilities.clamp((i11 != 0 || i16 == 0) ? 1.0f : i11 / i16, 1.3333334f, 0.5625f);
                        ecVar.g = Math.max(1, i13);
                        ecVar.f = Math.max(1, (int) Math.ceil(i13 * clamp));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i14) / ecVar.f);
                        ecVar.c = ceil;
                        ecVar.b = (long) (maxScrollDuration / ceil);
                        ecVar.j = -ecVar.b;
                        if (j13 != -1) {
                        }
                        ecVar.c();
                        if (runnable2 != null) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    i12 = 0;
                    ecVar.e = null;
                    FileLog.e(e);
                    int i162 = i12;
                    if (l11 != null) {
                    }
                    if (j13 != -1) {
                    }
                    float clamp2 = Utilities.clamp((i11 != 0 || i162 == 0) ? 1.0f : i11 / i162, 1.3333334f, 0.5625f);
                    ecVar.g = Math.max(1, i13);
                    ecVar.f = Math.max(1, (int) Math.ceil(i13 * clamp2));
                    int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i14) / ecVar.f);
                    ecVar.c = ceil2;
                    ecVar.b = (long) (maxScrollDuration / ceil2);
                    ecVar.j = -ecVar.b;
                    if (j13 != -1) {
                    }
                    ecVar.c();
                    if (runnable2 != null) {
                    }
                }
                int i1622 = i12;
                if (l11 != null) {
                    maxScrollDuration = l11.longValue();
                    ecVar.a = maxScrollDuration;
                }
                if (j13 != -1 && j14 != -1) {
                    maxScrollDuration = j14 - j13;
                }
                float clamp22 = Utilities.clamp((i11 != 0 || i1622 == 0) ? 1.0f : i11 / i1622, 1.3333334f, 0.5625f);
                ecVar.g = Math.max(1, i13);
                ecVar.f = Math.max(1, (int) Math.ceil(i13 * clamp22));
                int ceil22 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i14) / ecVar.f);
                ecVar.c = ceil22;
                ecVar.b = (long) (maxScrollDuration / ceil22);
                ecVar.j = -ecVar.b;
                if (j13 != -1) {
                    ecVar.j = j13 - ecVar.b;
                }
                ecVar.c();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
        });
    }

    public final void b() {
        this.i = true;
        Utilities.themeQueue.cancelRunnable(new f1(this, 20));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Bitmap bitmap = ((dc) obj).a;
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
                FileLog.e(e10);
            }
        }
    }

    public final void c() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        int i9 = 20;
        Utilities.themeQueue.cancelRunnable(new f1(this, i9));
        Utilities.themeQueue.postRunnable(new f1(this, i9));
    }
}
