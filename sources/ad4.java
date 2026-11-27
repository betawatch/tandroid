// default package

import java.io.File;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ad4 extends az5 implements sr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad4(Object obj, byte b) {
        super(0);
        this.b = b;
        this.c = obj;
    }

    @Override // sr4
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Object obj = bd4.e;
                File file = (File) this.c;
                synchronized (obj) {
                    bd4.d.remove(file.getAbsolutePath());
                }
                return f9c.a;
            case 1:
                ((ke5) this.c).dispose();
                return f9c.a;
            case 2:
                File file2 = (File) ((yj8) this.c).invoke();
                String name = file2.getName();
                name.getClass();
                int lastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if ((lastIndexOf != -1 ? name.substring(lastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                return fhd.c((shc) this.c);
        }
    }
}
