package ai;

import android.content.SharedPreferences;
import android.net.NetworkInfo;
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
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w7;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class j1 {
    public static ArrayList a;
    public static long b;
    public static CountDownLatch c;
    public static long d;

    public static synchronized ArrayList a() {
        synchronized (j1.class) {
            try {
                if (a == null) {
                    String string = mp.g1().getString("speech_models", null);
                    if (string == null) {
                        return null;
                    }
                    try {
                        SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                        int readInt32 = serializedData.readInt32(true);
                        ArrayList arrayList = new ArrayList(readInt32);
                        for (int i7 = 0; i7 < readInt32; i7++) {
                            arrayList.add(TLRPC.TL_transcriptionModel.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                        }
                        serializedData.cleanup();
                        a = arrayList;
                    } catch (Throwable th2) {
                        Log.d("Dictation", "speech models: cached list unreadable: " + th2);
                        mp.g1().edit().remove("speech_models").apply();
                    }
                }
                return a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static boolean b() {
        a6 q10 = a6.q(j10.l());
        int e10 = org.telegram.messenger.t0.e();
        z5 p10 = e10 == 1 ? q10.p() : e10 == 2 ? q10.o() : q10.n();
        return p10 != null && p10.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0110, code lost:
    
        android.util.Log.d(r7, "speech models: " + r17 + " download stalled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (org.telegram.messenger.a6.q(org.telegram.messenger.j10.l()).p().g != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(TLRPC.TL_transcriptionModel tL_transcriptionModel, File file, boolean z10, i1 i1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        String str;
        a1 a1Var;
        File file2;
        if (tL_transcriptionModel != null) {
            TLRPC.Document document = tL_transcriptionModel.document;
            String str2 = "speech_doc_" + file.getName();
            int i13 = 1;
            String str3 = "Dictation";
            if (file.exists()) {
                if (mp.g1().getLong(str2, 0L) != document.id) {
                    if (!z10) {
                        try {
                            org.telegram.messenger.t0.c(false);
                            if (org.telegram.messenger.t0.c != null) {
                                if (org.telegram.messenger.t0.c.getType() != 1) {
                                    if (org.telegram.messenger.t0.c.getType() == 9) {
                                    }
                                }
                                if (org.telegram.messenger.t0.c.getState() == NetworkInfo.State.CONNECTED) {
                                }
                            }
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        Log.d("Dictation", "speech models: " + file.getName() + " has an update, not on Wi-Fi / auto-download");
                        return 0;
                    }
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int l10 = j10.l();
            w7 G = w7.G(l10);
            File J = w7.J(document, null, true, true);
            if (J.exists()) {
                i7 = 0;
                str = "Dictation";
                file2 = J;
                i10 = -1;
            } else {
                String r10 = w7.r(null, document);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                File[] fileArr = new File[1];
                long[] jArr = {SystemClock.elapsedRealtime()};
                h1 h1Var = new h1(r10, jArr, i1Var, fileArr, J, countDownLatch);
                int[] iArr = {ks.X1, ks.Y1, ks.Z1};
                i7 = 0;
                i10 = -1;
                org.telegram.messenger.g0.g3(new g1(l10, iArr, h1Var, G, document, 0));
                while (true) {
                    try {
                        str = str3;
                    } catch (InterruptedException unused) {
                        i12 = i13;
                        str = str3;
                    } catch (Throwable th2) {
                        th = th2;
                        i11 = i13;
                    }
                    try {
                        if (countDownLatch.await(10L, TimeUnit.SECONDS)) {
                            break;
                        }
                        if (SystemClock.elapsedRealtime() - jArr[0] > 120000) {
                            break;
                        }
                        str3 = str;
                        i13 = 1;
                    } catch (InterruptedException unused2) {
                        i12 = 1;
                        a1Var = new a1(l10, iArr, h1Var, i12);
                        org.telegram.messenger.g0.g3(a1Var);
                        File file3 = fileArr[0];
                        if (file3 == null) {
                        }
                        if (file2 != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i11 = 1;
                        org.telegram.messenger.g0.g3(new a1(l10, iArr, h1Var, i11));
                        throw th;
                    }
                }
                a1Var = new a1(l10, iArr, h1Var, 1);
                org.telegram.messenger.g0.g3(a1Var);
                File file32 = fileArr[0];
                file2 = (file32 == null && file32.exists()) ? fileArr[0] : null;
            }
            if (file2 != null) {
                return i10;
            }
            File parentFile = file.getParentFile();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getName());
            ?? r52 = ".part";
            sb2.append(".part");
            File file4 = new File(parentFile, sb2.toString());
            try {
                try {
                    file.getParentFile().mkdirs();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                        try {
                            bufferedInputStream.mark(2);
                            int i14 = (bufferedInputStream.read() == 31 && bufferedInputStream.read() == 139) ? 1 : i7;
                            bufferedInputStream.reset();
                            InputStream gZIPInputStream = i14 != 0 ? new GZIPInputStream(bufferedInputStream, 65536) : bufferedInputStream;
                            byte[] bArr = new byte[65536];
                            while (true) {
                                int read = gZIPInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                int i15 = i7;
                                fileOutputStream.write(bArr, i15, read);
                                i7 = i15;
                            }
                            fileOutputStream.close();
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            r52 = file;
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
                        r52 = file;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r52 = file;
                    try {
                        Log.d(str, "speech models: " + r52.getName() + " unzip failed: " + th);
                        return i10;
                    } finally {
                        file4.delete();
                        file2.delete();
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                Log.d(str, "speech models: " + r52.getName() + " unzip failed: " + th);
                return i10;
            }
            if (!file4.renameTo(file)) {
                Log.d(str, "speech models: couldn't store " + file.getName());
                return i10;
            }
            mp.g1().edit().putLong(str2, document.id).apply();
            Log.d(str, "speech models: " + file.getName() + " (" + TextUtils.join(",", tL_transcriptionModel.languages) + " v" + tL_transcriptionModel.version + "), " + file2.length() + " → " + file.length() + " bytes in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            file4.delete();
            file2.delete();
            return 1;
        }
        if (!file.exists()) {
            return -1;
        }
        return 0;
    }

    public static boolean d() {
        ArrayList a10 = a();
        long currentTimeMillis = System.currentTimeMillis() - mp.g1().getLong("speech_models_checked", 0L);
        if (a10 == null) {
            return true;
        }
        if (currentTimeMillis > (a10.isEmpty() ? 3600000L : 86400000L)) {
            return true;
        }
        if (a10.isEmpty() && b == 0) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.telegram.messenger.s2.c);
        sb2.append("/");
        sb2.append(DictationAsr.X());
        return !sb2.toString().equals(mp.g1().getString("speech_models_build", null));
    }

    public static synchronized CountDownLatch e() {
        synchronized (j1.class) {
            CountDownLatch countDownLatch = c;
            if (countDownLatch != null) {
                return countDownLatch;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = b;
            if (j3 != 0 && elapsedRealtime - j3 < 60000) {
                return null;
            }
            int l10 = j10.l();
            if (!j10.r(l10)) {
                return null;
            }
            b = elapsedRealtime;
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            c = countDownLatch2;
            TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
            tL_messages_getTranscriptionModels.version = DictationAsr.X();
            ConnectionsManager.getInstance(l10).sendRequest(tL_messages_getTranscriptionModels, new e1(countDownLatch2, 0));
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
        mp.g1().edit().remove("speech_doc_" + file.getName()).apply();
    }

    public static boolean h() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = d;
        if (j3 == 0 || elapsedRealtime - j3 > 60000) {
            d = elapsedRealtime;
            if (d()) {
                e();
            }
        }
        ArrayList a10 = a();
        if (a10 != null) {
            int size = a10.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = a10.get(i7);
                i7++;
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
        SharedPreferences g12 = mp.g1();
        StringBuilder sb2 = new StringBuilder("speech_doc_");
        sb2.append(file.getName());
        return g12.getLong(sb2.toString(), 0L) != tL_transcriptionModel.document.id;
    }

    public static void j() {
        CountDownLatch e10 = e();
        if (e10 != null) {
            new Thread(new f1(e10, 0), "DictationModels").start();
        }
    }

    public static void k(ArrayList arrayList) {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((TLRPC.TL_transcriptionModel) obj).serializeToStream(serializedData);
        }
        mp.g1().edit().putString("speech_models", Base64.encodeToString(serializedData.toByteArray(), 2)).putLong("speech_models_checked", System.currentTimeMillis()).putString("speech_models_build", org.telegram.messenger.s2.c + "/" + DictationAsr.X()).apply();
        serializedData.cleanup();
    }
}
