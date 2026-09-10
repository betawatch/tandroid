package bi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ke {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final /* synthetic */ me n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ke(me meVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.n = meVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() { // from class: bi.ie
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
                ke keVar = ke.this;
                String str2 = str;
                Long l10 = l4;
                long j12 = j10;
                long j13 = j11;
                int i14 = i11;
                long j14 = j3;
                int i15 = i10;
                Runnable runnable2 = runnable;
                long maxScrollDuration = keVar.n.getMaxScrollDuration();
                try {
                    keVar.e.setDataSource(str2);
                    String extractMetadata = keVar.e.extractMetadata(9);
                    if (extractMetadata != null) {
                        maxScrollDuration = Long.parseLong(extractMetadata);
                        keVar.a = maxScrollDuration;
                    }
                    String extractMetadata2 = keVar.e.extractMetadata(18);
                    i12 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                } catch (Exception e) {
                    e = e;
                    i12 = 0;
                }
                try {
                    String extractMetadata3 = keVar.e.extractMetadata(19);
                    i13 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                    try {
                        String extractMetadata4 = keVar.e.extractMetadata(24);
                        if (extractMetadata4 != null) {
                            int parseInt = Integer.parseInt(extractMetadata4);
                            if (parseInt == 90 || parseInt == 270) {
                                int i16 = i13;
                                i13 = i12;
                                i12 = i16;
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        keVar.e = null;
                        FileLog.e(e);
                        int i17 = i13;
                        if (l10 != null) {
                        }
                        if (j12 != -1) {
                            maxScrollDuration = j13 - j12;
                        }
                        float clamp = Utilities.clamp((i12 != 0 || i17 == 0) ? 1.0f : i12 / i17, 1.3333334f, 0.5625f);
                        keVar.g = Math.max(1, i14);
                        keVar.f = Math.max(1, (int) Math.ceil(i14 * clamp));
                        int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j14) / j14) * i15) / keVar.f);
                        keVar.c = ceil;
                        keVar.b = (long) (maxScrollDuration / ceil);
                        keVar.j = -keVar.b;
                        if (j12 != -1) {
                        }
                        keVar.c();
                        if (runnable2 != null) {
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    i13 = 0;
                    keVar.e = null;
                    FileLog.e(e);
                    int i172 = i13;
                    if (l10 != null) {
                    }
                    if (j12 != -1) {
                    }
                    float clamp2 = Utilities.clamp((i12 != 0 || i172 == 0) ? 1.0f : i12 / i172, 1.3333334f, 0.5625f);
                    keVar.g = Math.max(1, i14);
                    keVar.f = Math.max(1, (int) Math.ceil(i14 * clamp2));
                    int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j14) / j14) * i15) / keVar.f);
                    keVar.c = ceil2;
                    keVar.b = (long) (maxScrollDuration / ceil2);
                    keVar.j = -keVar.b;
                    if (j12 != -1) {
                    }
                    keVar.c();
                    if (runnable2 != null) {
                    }
                }
                int i1722 = i13;
                if (l10 != null) {
                    maxScrollDuration = l10.longValue();
                    keVar.a = maxScrollDuration;
                }
                if (j12 != -1 && j13 != -1) {
                    maxScrollDuration = j13 - j12;
                }
                float clamp22 = Utilities.clamp((i12 != 0 || i1722 == 0) ? 1.0f : i12 / i1722, 1.3333334f, 0.5625f);
                keVar.g = Math.max(1, i14);
                keVar.f = Math.max(1, (int) Math.ceil(i14 * clamp22));
                int ceil22 = (int) Math.ceil(((Math.max(maxScrollDuration, j14) / j14) * i15) / keVar.f);
                keVar.c = ceil22;
                keVar.b = (long) (maxScrollDuration / ceil22);
                keVar.j = -keVar.b;
                if (j12 != -1) {
                    keVar.j = j12 - keVar.b;
                }
                keVar.c();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
        });
    }

    public final void b() {
        this.i = true;
        Utilities.themeQueue.cancelRunnable(new wc(this, 6));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((je) obj).a;
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
                FileLog.e(e);
            }
        }
    }

    public final void c() {
        if (this.k || this.e == null || this.d.size() >= this.c) {
            return;
        }
        this.k = true;
        this.j += this.b;
        int i10 = 6;
        Utilities.themeQueue.cancelRunnable(new wc(this, i10));
        Utilities.themeQueue.postRunnable(new wc(this, i10));
    }
}
