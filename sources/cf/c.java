package cf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import c3.i0;
import java.io.File;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends a {
    public final MediaMetadataRetriever r;
    public final boolean s;

    public c(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.b = j10;
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
            f8.g(e, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                i0.p(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
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
