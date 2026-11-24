// default package

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class etc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o74 b;

    public /* synthetic */ etc(o74 o74Var, byte b) {
        this.a = b;
        this.b = o74Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final byte b2 = 1;
        final byte b3 = 0;
        final o74 o74Var = this.b;
        switch (b) {
            case 0:
                if (!o74Var.c) {
                    o74Var.c = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (htc htcVar : ((HashMap) o74Var.d).values()) {
                        if (!TextUtils.isEmpty(htcVar.b) && currentTimeMillis - htcVar.a <= 604800000) {
                            arrayList.add(0, htcVar);
                            if (arrayList.size() >= 100) {
                                Utilities.e.c(new Runnable() { // from class: ftc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        ArrayList arrayList2 = arrayList;
                                        o74 o74Var2 = o74Var;
                                        switch (b4) {
                                            case 0:
                                                for (int i = 0; i < arrayList2.size(); i++) {
                                                    htc htcVar2 = (htc) arrayList2.get(i);
                                                    ((HashMap) o74Var2.d).put(htcVar2.b, htcVar2);
                                                }
                                                o74Var2.a = true;
                                                o74Var2.b = false;
                                                break;
                                            default:
                                                File file = new File(ba4.z(4), "webmetacache.dat");
                                                if (!file.exists()) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        fa4.g(e, true);
                                                        o74Var2.c = false;
                                                        return;
                                                    }
                                                }
                                                gtc gtcVar = new gtc();
                                                gtcVar.a.addAll(arrayList2);
                                                SerializedData serializedData = new SerializedData(gtcVar.getObjectSize());
                                                gtcVar.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e2) {
                                                    fa4.g(e2, true);
                                                }
                                                gl.d3(new etc(o74Var2, (byte) 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    Utilities.e.c(new Runnable() { // from class: ftc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            ArrayList arrayList2 = arrayList;
                            o74 o74Var2 = o74Var;
                            switch (b4) {
                                case 0:
                                    for (int i = 0; i < arrayList2.size(); i++) {
                                        htc htcVar2 = (htc) arrayList2.get(i);
                                        ((HashMap) o74Var2.d).put(htcVar2.b, htcVar2);
                                    }
                                    o74Var2.a = true;
                                    o74Var2.b = false;
                                    break;
                                default:
                                    File file = new File(ba4.z(4), "webmetacache.dat");
                                    if (!file.exists()) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                            o74Var2.c = false;
                                            return;
                                        }
                                    }
                                    gtc gtcVar = new gtc();
                                    gtcVar.a.addAll(arrayList2);
                                    SerializedData serializedData = new SerializedData(gtcVar.getObjectSize());
                                    gtcVar.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                    }
                                    gl.d3(new etc(o74Var2, (byte) 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                File file = new File(ba4.z(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        gtc gtcVar = new gtc();
                        gtcVar.readParams(serializedData, true);
                        arrayList2.addAll(gtcVar.a);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    gl.d3(new Runnable() { // from class: ftc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            ArrayList arrayList22 = arrayList2;
                            o74 o74Var2 = o74Var;
                            switch (b4) {
                                case 0:
                                    for (int i = 0; i < arrayList22.size(); i++) {
                                        htc htcVar2 = (htc) arrayList22.get(i);
                                        ((HashMap) o74Var2.d).put(htcVar2.b, htcVar2);
                                    }
                                    o74Var2.a = true;
                                    o74Var2.b = false;
                                    break;
                                default:
                                    File file2 = new File(ba4.z(4), "webmetacache.dat");
                                    if (!file2.exists()) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e2) {
                                            fa4.g(e2, true);
                                            o74Var2.c = false;
                                            return;
                                        }
                                    }
                                    gtc gtcVar2 = new gtc();
                                    gtcVar2.a.addAll(arrayList22);
                                    SerializedData serializedData2 = new SerializedData(gtcVar2.getObjectSize());
                                    gtcVar2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e22) {
                                        fa4.g(e22, true);
                                    }
                                    gl.d3(new etc(o74Var2, (byte) 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    o74Var.a = true;
                    break;
                }
            default:
                o74Var.c = false;
                break;
        }
    }
}
