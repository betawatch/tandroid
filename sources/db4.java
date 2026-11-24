// default package

import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class db4 extends vw5 implements op4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db4(Object obj, byte b) {
        super(0);
        this.b = b;
        this.c = obj;
    }

    @Override // op4
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Object obj = eb4.e;
                File file = (File) this.c;
                synchronized (obj) {
                    eb4.d.remove(file.getAbsolutePath());
                }
                return g5c.a;
            case 1:
                ((jc5) this.c).dispose();
                return g5c.a;
            case 2:
                File file2 = (File) ((kg8) this.c).invoke();
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
                return mcd.c((tdc) this.c);
        }
    }
}
