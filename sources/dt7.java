// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dt7 extends g10 {
    public final MediaMetadataRetriever r;
    public final boolean s;

    public dt7(File file) {
        long j;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.a = "OTHER";
            try {
                j = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j = 0;
            }
            this.b = j;
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
                Bitmap bitmap = this.o;
                if (max > 0.0f) {
                    this.p = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / max), (int) (this.o.getHeight() / max), true);
                } else {
                    this.p = bitmap;
                }
            }
        } catch (Exception e) {
            this.s = true;
            fc4.g(e, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                kt6.s(mediaMetadataRetriever2);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final short b(int i) {
        try {
            return Short.parseShort(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i) {
        try {
            return this.r.extractMetadata(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
