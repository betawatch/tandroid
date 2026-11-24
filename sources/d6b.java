// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class d6b implements e6b, atc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ File b;

    public /* synthetic */ d6b(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    @Override // atc
    public final InputStream a() {
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 3:
                if (file.exists()) {
                    break;
                }
                break;
            case 4:
                if (file.exists()) {
                    break;
                }
                break;
        }
        return new FileInputStream(file);
    }

    @Override // e6b
    public final Bitmap n(BitmapFactory.Options options) {
        byte b = this.a;
        File file = this.b;
        switch (b) {
        }
        return BitmapFactory.decodeFile(file.getPath(), options);
    }
}
