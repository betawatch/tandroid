// default package

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class jo3 {
    public static ArrayList a;
    public static long b;
    public static CountDownLatch c;
    public static long d;

    public static synchronized ArrayList a() {
        synchronized (jo3.class) {
            if (a == null) {
                String string = oc7.d1().getString("speech_models", null);
                if (string == null) {
                    return null;
                }
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(true);
                    ArrayList arrayList = new ArrayList(readInt32);
                    for (int i = 0; i < readInt32; i++) {
                        arrayList.add(TLRPC.TL_transcriptionModel.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                    }
                    serializedData.cleanup();
                    a = arrayList;
                } catch (Throwable th) {
                    Log.d("Dictation", "speech models: cached list unreadable: " + th);
                    oc7.d1().edit().remove("speech_models").apply();
                }
            }
            return a;
        }
    }

    public static boolean b() {
        er3 q = er3.q(z8c.k());
        int e = a.e();
        dr3 p = e == 1 ? q.p() : e == 2 ? q.o() : q.n();
        return p != null && p.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00ea, code lost:
    
        android.util.Log.d("Dictation", "speech models: " + r17 + " download stalled");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(TLRPC.TL_transcriptionModel tL_transcriptionModel, File file, boolean z, io3 io3Var) {
        int i;
        int i2;
        int i3;
        wc7 wc7Var;
        File file2;
        BufferedInputStream bufferedInputStream;
        int i4 = 0;
        if (tL_transcriptionModel != null) {
            TLRPC.Document document = tL_transcriptionModel.document;
            String str = "speech_doc_" + file.getName();
            if (file.exists()) {
                if (oc7.d1().getLong(str, 0L) != document.id) {
                    if (!z && (!a.o() || !er3.q(z8c.k()).p().g)) {
                        Log.d("Dictation", "speech models: " + file.getName() + " has an update, not on Wi-Fi / auto-download");
                        return 0;
                    }
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int k = z8c.k();
            bc4 G = bc4.G(k);
            File J = bc4.J(document, null, true, true);
            if (J.exists()) {
                i3 = 0;
                i = 1;
                file2 = J;
                i2 = -1;
            } else {
                String r = bc4.r(null, document);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                File[] fileArr = new File[1];
                long[] jArr = {SystemClock.elapsedRealtime()};
                ho3 ho3Var = new ho3(r, jArr, io3Var, fileArr, J, countDownLatch);
                int[] iArr = {nm7.X1, nm7.Y1, nm7.Z1};
                i = 1;
                i2 = -1;
                gm.c3(new i77(k, (Object) iArr, (Object) ho3Var, (Object) G, (Object) document, (byte) 13));
                while (true) {
                    try {
                        try {
                            i3 = i4;
                            try {
                                if (countDownLatch.await(10L, TimeUnit.SECONDS)) {
                                    break;
                                }
                                if (SystemClock.elapsedRealtime() - jArr[i3] > 120000) {
                                    break;
                                }
                                i4 = i3;
                            } catch (InterruptedException unused) {
                                wc7Var = new wc7(k, (Object) iArr, (Object) ho3Var, (byte) 21);
                                gm.c3(wc7Var);
                                File file3 = fileArr[i3];
                                if (file3 == null) {
                                }
                                if (file2 != null) {
                                }
                            }
                        } catch (Throwable th) {
                            gm.c3(new wc7(k, (Object) iArr, (Object) ho3Var, (byte) 21));
                            throw th;
                        }
                    } catch (InterruptedException unused2) {
                        i3 = i4;
                    }
                }
                wc7Var = new wc7(k, (Object) iArr, (Object) ho3Var, (byte) 21);
                gm.c3(wc7Var);
                File file32 = fileArr[i3];
                file2 = (file32 == null && file32.exists()) ? fileArr[i3] : null;
            }
            if (file2 != null) {
                return i2;
            }
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(file.getName());
            ?? r4 = ".part";
            sb.append(".part");
            File file4 = new File(parentFile, sb.toString());
            try {
                try {
                    file.getParentFile().mkdirs();
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Log.d("Dictation", "speech models: " + r4.getName() + " unzip failed: " + th);
                        return i2;
                    } finally {
                        file4.delete();
                        file2.delete();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r4 = file;
                Log.d("Dictation", "speech models: " + r4.getName() + " unzip failed: " + th);
                return i2;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file4);
                try {
                    bufferedInputStream.mark(2);
                    int i5 = (bufferedInputStream.read() == 31 && bufferedInputStream.read() == 139) ? i : i3;
                    bufferedInputStream.reset();
                    InputStream gZIPInputStream = i5 != 0 ? new GZIPInputStream(bufferedInputStream, 65536) : bufferedInputStream;
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, i3, read);
                    }
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    if (!file4.renameTo(file)) {
                        Log.d("Dictation", "speech models: couldn't store " + file.getName());
                        return i2;
                    }
                    oc7.d1().edit().putLong(str, document.id).apply();
                    Log.d("Dictation", "speech models: " + file.getName() + " (" + TextUtils.join(",", tL_transcriptionModel.languages) + " v" + tL_transcriptionModel.version + "), " + file2.length() + " → " + file.length() + " bytes in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
                    return i;
                } catch (Throwable th4) {
                    r4 = file;
                    try {
                        try {
                            fileOutputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Throwable th6 = th;
                            try {
                                bufferedInputStream.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        }
                    } catch (Throwable th8) {
                        th4.addSuppressed(th8);
                        throw th4;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                r4 = file;
            }
        } else if (!file.exists()) {
            return -1;
        }
        return 0;
    }

    public static boolean d() {
        ArrayList a2 = a();
        long currentTimeMillis = System.currentTimeMillis() - oc7.d1().getLong("speech_models_checked", 0L);
        if (a2 == null) {
            return true;
        }
        if (currentTimeMillis > (a2.isEmpty() ? 3600000L : 86400000L)) {
            return true;
        }
        if (a2.isEmpty() && b == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e21.c);
        sb.append("/");
        sb.append(DictationAsr.h0());
        return !sb.toString().equals(oc7.d1().getString("speech_models_build", null));
    }

    public static synchronized CountDownLatch e() {
        synchronized (jo3.class) {
            CountDownLatch countDownLatch = c;
            if (countDownLatch != null) {
                return countDownLatch;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = b;
            if (j != 0 && elapsedRealtime - j < 60000) {
                return null;
            }
            int k = z8c.k();
            if (!z8c.q(k)) {
                return null;
            }
            b = elapsedRealtime;
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            c = countDownLatch2;
            TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
            tL_messages_getTranscriptionModels.version = DictationAsr.h0();
            ConnectionsManager.getInstance(k).sendRequest(tL_messages_getTranscriptionModels, new tg(countDownLatch2, (byte) 20));
            return countDownLatch2;
        }
    }

    public static TLRPC.TL_transcriptionModel f(ArrayList arrayList, String... strArr) {
        if (arrayList == null) {
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
            String[] strArr3 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
            Arrays.sort(strArr3);
            if (Arrays.equals(strArr2, strArr3)) {
                return tL_transcriptionModel;
            }
        }
        return null;
    }

    public static void g(File file) {
        oc7.d1().edit().remove("speech_doc_" + file.getName()).apply();
    }

    public static boolean h() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = d;
        if (j == 0 || elapsedRealtime - j > 60000) {
            d = elapsedRealtime;
            if (d()) {
                e();
            }
        }
        ArrayList a2 = a();
        if (a2 != null) {
            int size = a2.size();
            int i = 0;
            while (i < size) {
                Object obj = a2.get(i);
                i++;
                TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(TLRPC.TL_transcriptionModel tL_transcriptionModel, File file) {
        if (tL_transcriptionModel == null || !file.exists()) {
            return false;
        }
        SharedPreferences d1 = oc7.d1();
        StringBuilder sb = new StringBuilder("speech_doc_");
        sb.append(file.getName());
        return d1.getLong(sb.toString(), 0L) != tL_transcriptionModel.document.id;
    }

    public static void j() {
        CountDownLatch e = e();
        if (e != null) {
            new Thread(new go3(e, (byte) 0), "DictationModels").start();
        }
    }

    public static void k(ArrayList arrayList) {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((TLRPC.TL_transcriptionModel) obj).serializeToStream(serializedData);
        }
        oc7.d1().edit().putString("speech_models", Base64.encodeToString(serializedData.toByteArray(), 2)).putLong("speech_models_checked", System.currentTimeMillis()).putString("speech_models_build", e21.c + "/" + DictationAsr.h0()).apply();
        serializedData.cleanup();
    }
}
