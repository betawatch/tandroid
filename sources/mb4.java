// default package

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class mb4 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ mb4(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                int i = this.b;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    File file = (File) arrayList.get(i2);
                    File file2 = new File(file.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        try {
                            if (!file2.delete()) {
                                file2.deleteOnExit();
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        try {
                            File file3 = new File(a.b.getCacheDir(), file.getName() + ".enc.key");
                            if (!file3.delete()) {
                                file3.deleteOnExit();
                            }
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                    } else if (file.exists()) {
                        try {
                            if (!file.delete()) {
                                file.deleteOnExit();
                            }
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                        }
                    }
                    try {
                        File file4 = new File(file.getParentFile(), "q_" + file.getName());
                        if (file4.exists() && !file4.delete()) {
                            file4.deleteOnExit();
                        }
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                }
                if (i == 2) {
                    in5.z().f();
                    break;
                }
                break;
            default:
                uc7.s1(this.b).j4(this.c, true);
                break;
        }
    }

    public /* synthetic */ mb4(ArrayList arrayList, int i) {
        this.c = arrayList;
        this.b = i;
    }
}
