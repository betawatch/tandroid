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
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.w7;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class m1 {
    public static ArrayList a;
    public static long b;
    public static CountDownLatch c;
    public static long d;

    public static synchronized ArrayList a() {
        synchronized (m1.class) {
            try {
                if (a == null) {
                    String string = np.g1().getString("speech_models", null);
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
                        np.g1().edit().remove("speech_models").apply();
                    }
                }
                return a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static boolean b() {
        a6 q10 = a6.q(k10.l());
        int e10 = org.telegram.messenger.t0.e();
        z5 p10 = e10 == 1 ? q10.p() : e10 == 2 ? q10.o() : q10.n();
        return p10 != null && p10.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0112, code lost:
    
        android.util.Log.d("Dictation", "speech models: " + r17 + " download stalled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (org.telegram.messenger.a6.q(org.telegram.messenger.k10.l()).p().g != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(TLRPC.TL_transcriptionModel tL_transcriptionModel, File file, boolean z10, l1 l1Var) {
        int i7;
        int i10;
        long j3;
        j1 j1Var;
        File file2;
        BufferedInputStream bufferedInputStream;
        File file3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (tL_transcriptionModel != null) {
            TLRPC.Document document = tL_transcriptionModel.document;
            String str = "speech_doc_" + file.getName();
            if (file.exists()) {
                if (np.g1().getLong(str, 0L) != document.id) {
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
            int l10 = k10.l();
            w7 G = w7.G(l10);
            File J = w7.J(document, null, true, true);
            if (J.exists()) {
                i7 = 1;
                file2 = J;
                i10 = -1;
                j3 = elapsedRealtime;
            } else {
                String r10 = w7.r(null, document);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                File[] fileArr = new File[1];
                long[] jArr = {SystemClock.elapsedRealtime()};
                k1 k1Var = new k1(r10, jArr, l1Var, fileArr, J, countDownLatch);
                int[] iArr = {ls.X1, ls.Y1, ls.Z1};
                i7 = 1;
                i10 = -1;
                org.telegram.messenger.g0.g3(new i1(l10, iArr, k1Var, G, document, 0));
                while (true) {
                    try {
                        try {
                            j3 = elapsedRealtime;
                            try {
                                if (countDownLatch.await(10L, TimeUnit.SECONDS)) {
                                    break;
                                }
                                if (SystemClock.elapsedRealtime() - jArr[0] > 120000) {
                                    break;
                                }
                                elapsedRealtime = j3;
                            } catch (InterruptedException unused) {
                                j1Var = new j1(l10, (Object) iArr, (Object) k1Var, (int) (objArr2 == true ? 1 : 0));
                                org.telegram.messenger.g0.g3(j1Var);
                                File file4 = fileArr[0];
                                if (file4 == null) {
                                }
                                if (file2 != null) {
                                }
                            }
                        } catch (InterruptedException unused2) {
                            j3 = elapsedRealtime;
                        }
                    } catch (Throwable th2) {
                        org.telegram.messenger.g0.g3(new j1(l10, (Object) iArr, (Object) k1Var, (int) (objArr == true ? 1 : 0)));
                        throw th2;
                    }
                }
                j1Var = new j1(l10, (Object) iArr, (Object) k1Var, (int) (objArr3 == true ? 1 : 0));
                org.telegram.messenger.g0.g3(j1Var);
                File file42 = fileArr[0];
                file2 = (file42 == null && file42.exists()) ? fileArr[0] : null;
            }
            if (file2 != null) {
                return i10;
            }
            File file5 = new File(file.getParentFile(), file.getName() + ".part");
            try {
                try {
                    file.getParentFile().mkdirs();
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        Log.d("Dictation", "speech models: " + file3.getName() + " unzip failed: " + th);
                        return i10;
                    } finally {
                        file5.delete();
                        file2.delete();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                file3 = file;
                Log.d("Dictation", "speech models: " + file3.getName() + " unzip failed: " + th);
                return i10;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file5);
                try {
                    bufferedInputStream.mark(2);
                    int i11 = (bufferedInputStream.read() == 31 && bufferedInputStream.read() == 139) ? i7 : 0;
                    bufferedInputStream.reset();
                    InputStream gZIPInputStream = i11 != 0 ? new GZIPInputStream(bufferedInputStream, 65536) : bufferedInputStream;
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    if (!file5.renameTo(file)) {
                        Log.d("Dictation", "speech models: couldn't store " + file.getName());
                        return i10;
                    }
                    np.g1().edit().putLong(str, document.id).apply();
                    Log.d("Dictation", "speech models: " + file.getName() + " (" + TextUtils.join(",", tL_transcriptionModel.languages) + " v" + tL_transcriptionModel.version + "), " + file2.length() + " → " + file.length() + " bytes in " + (SystemClock.elapsedRealtime() - j3) + " ms");
                    return i7;
                } catch (Throwable th5) {
                    file3 = file;
                    try {
                        try {
                            fileOutputStream.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        try {
                            bufferedInputStream.close();
                            throw th8;
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                            throw th8;
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                file3 = file;
            }
        } else if (!file.exists()) {
            return -1;
        }
        return 0;
    }

    public static boolean d() {
        ArrayList a10 = a();
        long currentTimeMillis = System.currentTimeMillis() - np.g1().getLong("speech_models_checked", 0L);
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
        sb2.append(DictationAsr.e0());
        return !sb2.toString().equals(np.g1().getString("speech_models_build", null));
    }

    public static synchronized CountDownLatch e() {
        synchronized (m1.class) {
            CountDownLatch countDownLatch = c;
            if (countDownLatch != null) {
                return countDownLatch;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = b;
            if (j3 != 0 && elapsedRealtime - j3 < 60000) {
                return null;
            }
            int l10 = k10.l();
            if (!k10.r(l10)) {
                return null;
            }
            b = elapsedRealtime;
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            c = countDownLatch2;
            TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
            tL_messages_getTranscriptionModels.version = DictationAsr.e0();
            ConnectionsManager.getInstance(l10).sendRequest(tL_messages_getTranscriptionModels, new g1(countDownLatch2, 0));
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
        np.g1().edit().remove("speech_doc_" + file.getName()).apply();
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
        SharedPreferences g12 = np.g1();
        StringBuilder sb2 = new StringBuilder("speech_doc_");
        sb2.append(file.getName());
        return g12.getLong(sb2.toString(), 0L) != tL_transcriptionModel.document.id;
    }

    public static void j() {
        CountDownLatch e10 = e();
        if (e10 != null) {
            new Thread(new h1(e10, 0), "DictationModels").start();
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
        np.g1().edit().putString("speech_models", Base64.encodeToString(serializedData.toByteArray(), 2)).putLong("speech_models_checked", System.currentTimeMillis()).putString("speech_models_build", org.telegram.messenger.s2.c + "/" + DictationAsr.e0()).apply();
        serializedData.cleanup();
    }
}
