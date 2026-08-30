package org.telegram.messenger.voip;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.voip.f2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class VoIPController {
    public static final int DATA_SAVING_ALWAYS = 2;
    public static final int DATA_SAVING_MOBILE = 1;
    public static final int DATA_SAVING_NEVER = 0;
    public static final int DATA_SAVING_ROAMING = 3;
    public static final int ERROR_AUDIO_IO = 3;
    public static final int ERROR_CONNECTION_SERVICE = -5;
    public static final int ERROR_INCOMPATIBLE = 1;
    public static final int ERROR_INSECURE_UPGRADE = -4;
    public static final int ERROR_LOCALIZED = -3;
    public static final int ERROR_PEER_OUTDATED = -1;
    public static final int ERROR_PRIVACY = -2;
    public static final int ERROR_TIMEOUT = 2;
    public static final int ERROR_UNKNOWN = 0;
    public static final int NET_TYPE_3G = 3;
    public static final int NET_TYPE_DIALUP = 10;
    public static final int NET_TYPE_EDGE = 2;
    public static final int NET_TYPE_ETHERNET = 7;
    public static final int NET_TYPE_GPRS = 1;
    public static final int NET_TYPE_HSPA = 4;
    public static final int NET_TYPE_LTE = 5;
    public static final int NET_TYPE_OTHER_HIGH_SPEED = 8;
    public static final int NET_TYPE_OTHER_LOW_SPEED = 9;
    public static final int NET_TYPE_OTHER_MOBILE = 11;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 6;
    public static final int STATE_ESTABLISHED = 3;
    public static final int STATE_FAILED = 4;
    public static final int STATE_RECONNECTING = 5;
    public static final int STATE_WAIT_INIT = 1;
    public static final int STATE_WAIT_INIT_ACK = 2;
    protected long callStartTime;
    protected ConnectionStateListener listener;
    protected long nativeInst = nativeInit(new File(ApplicationLoader.applicationContext.getFilesDir(), "voip_persistent_state.json").getAbsolutePath());

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public interface ConnectionStateListener {
        void onConnectionStateChanged(int i10, boolean z4);

        void onSignalBarCountChanged(int i10);
    }

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static class Stats {
        public long bytesRecvdMobile;
        public long bytesRecvdWifi;
        public long bytesSentMobile;
        public long bytesSentWifi;

        public String toString() {
            return "Stats{bytesRecvdMobile=" + this.bytesRecvdMobile + ", bytesSentWifi=" + this.bytesSentWifi + ", bytesRecvdWifi=" + this.bytesRecvdWifi + ", bytesSentMobile=" + this.bytesSentMobile + '}';
        }
    }

    public static native int getConnectionMaxLayer();

    private String getLogFilePath(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    private void handleSignalBarsChange(int i10) {
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onSignalBarCountChanged(i10);
        }
    }

    private void handleStateChange(int i10) {
        if (i10 == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        ConnectionStateListener connectionStateListener = this.listener;
        if (connectionStateListener != null) {
            connectionStateListener.onConnectionStateChanged(i10, false);
        }
    }

    private native void nativeConnect(long j10);

    private native void nativeDebugCtl(long j10, int i10, int i11);

    private native String nativeGetDebugLog(long j10);

    private native String nativeGetDebugString(long j10);

    private native int nativeGetLastError(long j10);

    private native int nativeGetPeerCapabilities(long j10);

    private native long nativeGetPreferredRelayID(long j10);

    private native void nativeGetStats(long j10, Stats stats);

    private static native String nativeGetVersion();

    private native long nativeInit(String str);

    private static native boolean nativeNeedRate(long j10);

    private native void nativeRelease(long j10);

    private native void nativeRequestCallUpgrade(long j10);

    private native void nativeSetAudioOutputGainControlEnabled(long j10, boolean z4);

    private native void nativeSetConfig(long j10, double d, double d10, int i10, boolean z4, boolean z10, boolean z11, String str, String str2, boolean z12);

    private native void nativeSetEchoCancellationStrength(long j10, int i10);

    private native void nativeSetEncryptionKey(long j10, byte[] bArr, boolean z4);

    private native void nativeSetMicMute(long j10, boolean z4);

    private static native void nativeSetNativeBufferSize(int i10);

    private native void nativeSetNetworkType(long j10, int i10);

    private native void nativeSetProxy(long j10, String str, int i10, String str2, String str3);

    private native void nativeStart(long j10);

    public static void setNativeBufferSize(int i10) {
        nativeSetNativeBufferSize(i10);
    }

    public void connect() {
        ensureNativeInstance();
        nativeConnect(this.nativeInst);
    }

    public void debugCtl(int i10, int i11) {
        ensureNativeInstance();
        nativeDebugCtl(this.nativeInst, i10, i11);
    }

    public void ensureNativeInstance() {
        if (this.nativeInst == 0) {
            throw new IllegalStateException("Native instance is not valid");
        }
    }

    public long getCallDuration() {
        return SystemClock.elapsedRealtime() - this.callStartTime;
    }

    public String getDebugLog() {
        ensureNativeInstance();
        return nativeGetDebugLog(this.nativeInst);
    }

    public String getDebugString() {
        ensureNativeInstance();
        return nativeGetDebugString(this.nativeInst);
    }

    public int getLastError() {
        ensureNativeInstance();
        return nativeGetLastError(this.nativeInst);
    }

    public int getPeerCapabilities() {
        ensureNativeInstance();
        return nativeGetPeerCapabilities(this.nativeInst);
    }

    public long getPreferredRelayID() {
        ensureNativeInstance();
        return nativeGetPreferredRelayID(this.nativeInst);
    }

    public void getStats(Stats stats) {
        ensureNativeInstance();
        if (stats == null) {
            throw new NullPointerException("You're not supposed to pass null here");
        }
        nativeGetStats(this.nativeInst, stats);
    }

    public boolean needRate() {
        ensureNativeInstance();
        return nativeNeedRate(this.nativeInst);
    }

    public void release() {
        ensureNativeInstance();
        nativeRelease(this.nativeInst);
        this.nativeInst = 0L;
    }

    public void requestCallUpgrade() {
        ensureNativeInstance();
        nativeRequestCallUpgrade(this.nativeInst);
    }

    public void setAudioOutputGainControlEnabled(boolean z4) {
        ensureNativeInstance();
        nativeSetAudioOutputGainControlEnabled(this.nativeInst, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setConfig(double d, double d10, int i10, long j10) {
        boolean z4;
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        boolean z12;
        ensureNativeInstance();
        try {
            z4 = AcousticEchoCanceler.isAvailable();
            try {
                z10 = NoiseSuppressor.isAvailable();
            } catch (Throwable unused) {
                z10 = false;
                boolean z13 = MessagesController.getGlobalMainSettings().getBoolean("dbg_dump_call_stats", false);
                j11 = this.nativeInst;
                z11 = true;
                if (z4) {
                }
                j12 = j11;
                z12 = true;
                if (z10) {
                    z11 = false;
                }
                if (!BuildVars.DEBUG_VERSION) {
                }
                nativeSetConfig(j12, d, d10, i10, z12, z11, true, !BuildVars.DEBUG_VERSION ? getLogFilePath(android.support.v4.media.a.n(j10, "voip")) : getLogFilePath(j10), (BuildVars.DEBUG_VERSION || !z13) ? null : getLogFilePath("voipStats"), BuildVars.DEBUG_VERSION);
            }
        } catch (Throwable unused2) {
            z4 = false;
        }
        boolean z132 = MessagesController.getGlobalMainSettings().getBoolean("dbg_dump_call_stats", false);
        j11 = this.nativeInst;
        z11 = true;
        if (z4 || !VoIPServerConfig.getBoolean("use_system_aec", true)) {
            j12 = j11;
            z12 = true;
        } else {
            j12 = j11;
            z12 = false;
        }
        if (z10 && VoIPServerConfig.getBoolean("use_system_ns", true)) {
            z11 = false;
        }
        nativeSetConfig(j12, d, d10, i10, z12, z11, true, !BuildVars.DEBUG_VERSION ? getLogFilePath(android.support.v4.media.a.n(j10, "voip")) : getLogFilePath(j10), (BuildVars.DEBUG_VERSION || !z132) ? null : getLogFilePath("voipStats"), BuildVars.DEBUG_VERSION);
    }

    public void setConnectionStateListener(ConnectionStateListener connectionStateListener) {
        this.listener = connectionStateListener;
    }

    public void setEchoCancellationStrength(int i10) {
        ensureNativeInstance();
        nativeSetEchoCancellationStrength(this.nativeInst, i10);
    }

    public void setEncryptionKey(byte[] bArr, boolean z4) {
        if (bArr.length == 256) {
            ensureNativeInstance();
            nativeSetEncryptionKey(this.nativeInst, bArr, z4);
        } else {
            throw new IllegalArgumentException("key length must be exactly 256 bytes but is " + bArr.length);
        }
    }

    public void setMicMute(boolean z4) {
        ensureNativeInstance();
        nativeSetMicMute(this.nativeInst, z4);
    }

    public void setNetworkType(int i10) {
        ensureNativeInstance();
        nativeSetNetworkType(this.nativeInst, i10);
    }

    public void setProxy(String str, int i10, String str2, String str3) {
        ensureNativeInstance();
        if (str == null) {
            throw new NullPointerException("address can't be null");
        }
        nativeSetProxy(this.nativeInst, str, i10, str2, str3);
    }

    public void start() {
        ensureNativeInstance();
        nativeStart(this.nativeInst);
    }

    private String getLogFilePath(long j10) {
        File f10 = f2.f();
        if (!BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = new ArrayList(Arrays.asList(f10.listFiles()));
            while (arrayList.size() > 20) {
                int i10 = 0;
                File file = (File) arrayList.get(0);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    File file2 = (File) obj;
                    if (file2.getName().endsWith(".log") && file2.lastModified() < file.lastModified()) {
                        file = file2;
                    }
                }
                file.delete();
                arrayList.remove(file);
            }
        }
        return new File(f10, j10 + ".log").getAbsolutePath();
    }
}
