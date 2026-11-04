package org.telegram.messenger.voip;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.n1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class VoIPDebugToSend {
    private final int currentAccount;
    private final HashMap<Long, Data> pending = new HashMap<>();

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public final class Data {
        long access_hash;
        long callId;
        String logPath;
        Instance.FinalState state;

        private Data() {
        }
    }

    public VoIPDebugToSend(int i3) {
        this.currentAccount = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$done$0(TL_phone.saveCallDebug savecalldebug, TLRPC.InputFile inputFile) {
        if (inputFile == null) {
            return;
        }
        TL_phone.saveCallLog savecalllog = new TL_phone.saveCallLog();
        savecalllog.peer = savecalldebug.peer;
        savecalllog.file = inputFile;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalllog, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$done$1(File file, TL_phone.saveCallDebug savecalldebug) {
        w7.G(this.currentAccount).g0(file.getAbsolutePath(), new mi.f(4, this, savecalldebug));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$done$2(Data data, File file, TL_phone.saveCallDebug savecalldebug) {
        File file2 = new File(data.logPath);
        Typeface typeface = org.telegram.messenger.g0.a;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    byte[] bArr = new byte[TLObject.FLAG_13];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        int i3 = 0;
                        if (read == -1) {
                            gZIPOutputStream.close();
                            bufferedInputStream.close();
                            org.telegram.messenger.g0.h3(new l(this, file, savecalldebug, i3));
                            return;
                        }
                        gZIPOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException e10) {
            a8.g(e10, true);
        } catch (IOException e11) {
            a8.g(e11, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$done$3(Data data, TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (r2.a) {
            a8.b("Sent debug logs, response = " + tLObject);
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse) || TextUtils.isEmpty(data.logPath)) {
            return;
        }
        Utilities.g.c(new k(this, data, new File(a1.g.s(new StringBuilder(), data.logPath, ".gzip")), savecalldebug, 0));
    }

    public void done(long j10, boolean z10) {
        Data remove = this.pending.remove(Long.valueOf(j10));
        if (remove == null || !z10) {
            return;
        }
        TL_phone.saveCallDebug savecalldebug = new TL_phone.saveCallDebug();
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        savecalldebug.debug = tL_dataJSON;
        tL_dataJSON.data = remove.state.debugLog;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        savecalldebug.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = remove.access_hash;
        tL_inputPhoneCall.id = remove.callId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new m(this, remove, savecalldebug, 0));
    }

    public void push(long j10, long j11, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(n1.e("" + j10));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        Data data = new Data();
        data.callId = j10;
        data.access_hash = j11;
        data.state = finalState;
        data.logPath = str;
        this.pending.put(Long.valueOf(j10), data);
    }
}
