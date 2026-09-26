package jf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.c;
import java.io.File;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class b extends a {
    public final MediaMetadataRetriever r;
    public final boolean s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.b = j3;
            this.c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f = c(1);
            this.g = b(8);
            this.h = c(6);
            this.j = b(0);
            b(10);
            this.k = b(14);
            this.m = c(4);
            byte[] embeddedPicture = this.r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            if (this.o != null) {
                float max = Math.max(r5.getWidth(), this.o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    this.p = Bitmap.createScaledBitmap(this.o, (int) (r0.getWidth() / max), (int) (this.o.getHeight() / max), true);
                } else {
                    this.p = this.o;
                }
            }
        } catch (Exception e) {
            this.s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                c.r(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
