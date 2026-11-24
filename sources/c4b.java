// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4b implements d4b, yqc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ File b;

    public /* synthetic */ c4b(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    @Override // yqc
    public final InputStream b() {
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

    @Override // d4b
    public final Bitmap l(BitmapFactory.Options options) {
        byte b = this.a;
        File file = this.b;
        switch (b) {
        }
        return BitmapFactory.decodeFile(file.getPath(), options);
    }
}
