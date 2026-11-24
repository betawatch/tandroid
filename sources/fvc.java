// default package

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class fvc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x84 b;

    public /* synthetic */ fvc(x84 x84Var, byte b) {
        this.a = b;
        this.b = x84Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final byte b2 = 1;
        final byte b3 = 0;
        final x84 x84Var = this.b;
        switch (b) {
            case 0:
                if (!x84Var.c) {
                    x84Var.c = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (ivc ivcVar : ((HashMap) x84Var.d).values()) {
                        if (!TextUtils.isEmpty(ivcVar.b) && currentTimeMillis - ivcVar.a <= 604800000) {
                            arrayList.add(0, ivcVar);
                            if (arrayList.size() >= 100) {
                                Utilities.e.c(new Runnable() { // from class: gvc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b2;
                                        ArrayList arrayList2 = arrayList;
                                        x84 x84Var2 = x84Var;
                                        switch (b4) {
                                            case 0:
                                                for (int i = 0; i < arrayList2.size(); i++) {
                                                    ivc ivcVar2 = (ivc) arrayList2.get(i);
                                                    ((HashMap) x84Var2.d).put(ivcVar2.b, ivcVar2);
                                                }
                                                x84Var2.a = true;
                                                x84Var2.b = false;
                                                break;
                                            default:
                                                File file = new File(bc4.z(4), "webmetacache.dat");
                                                if (!file.exists()) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        fc4.g(e, true);
                                                        x84Var2.c = false;
                                                        return;
                                                    }
                                                }
                                                hvc hvcVar = new hvc();
                                                hvcVar.a.addAll(arrayList2);
                                                SerializedData serializedData = new SerializedData(hvcVar.getObjectSize());
                                                hvcVar.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e2) {
                                                    fc4.g(e2, true);
                                                }
                                                gm.c3(new fvc(x84Var2, (byte) 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    Utilities.e.c(new Runnable() { // from class: gvc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            ArrayList arrayList2 = arrayList;
                            x84 x84Var2 = x84Var;
                            switch (b4) {
                                case 0:
                                    for (int i = 0; i < arrayList2.size(); i++) {
                                        ivc ivcVar2 = (ivc) arrayList2.get(i);
                                        ((HashMap) x84Var2.d).put(ivcVar2.b, ivcVar2);
                                    }
                                    x84Var2.a = true;
                                    x84Var2.b = false;
                                    break;
                                default:
                                    File file = new File(bc4.z(4), "webmetacache.dat");
                                    if (!file.exists()) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                            x84Var2.c = false;
                                            return;
                                        }
                                    }
                                    hvc hvcVar = new hvc();
                                    hvcVar.a.addAll(arrayList2);
                                    SerializedData serializedData = new SerializedData(hvcVar.getObjectSize());
                                    hvcVar.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
                                    }
                                    gm.c3(new fvc(x84Var2, (byte) 2));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                File file = new File(bc4.z(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        hvc hvcVar = new hvc();
                        hvcVar.readParams(serializedData, true);
                        arrayList2.addAll(hvcVar.a);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    gm.c3(new Runnable() { // from class: gvc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            ArrayList arrayList22 = arrayList2;
                            x84 x84Var2 = x84Var;
                            switch (b4) {
                                case 0:
                                    for (int i = 0; i < arrayList22.size(); i++) {
                                        ivc ivcVar2 = (ivc) arrayList22.get(i);
                                        ((HashMap) x84Var2.d).put(ivcVar2.b, ivcVar2);
                                    }
                                    x84Var2.a = true;
                                    x84Var2.b = false;
                                    break;
                                default:
                                    File file2 = new File(bc4.z(4), "webmetacache.dat");
                                    if (!file2.exists()) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e2) {
                                            fc4.g(e2, true);
                                            x84Var2.c = false;
                                            return;
                                        }
                                    }
                                    hvc hvcVar2 = new hvc();
                                    hvcVar2.a.addAll(arrayList22);
                                    SerializedData serializedData2 = new SerializedData(hvcVar2.getObjectSize());
                                    hvcVar2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e22) {
                                        fc4.g(e22, true);
                                    }
                                    gm.c3(new fvc(x84Var2, (byte) 2));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    x84Var.a = true;
                    break;
                }
            default:
                x84Var.c = false;
                break;
        }
    }
}
