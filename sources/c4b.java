// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
