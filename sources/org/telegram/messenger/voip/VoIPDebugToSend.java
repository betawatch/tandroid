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
import org.telegram.messenger.voip.Instance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class VoIPDebugToSend {
    private final int currentAccount;
    private final HashMap<Long, Data> pending = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    final class Data {
        long access_hash;
        long callId;
        String logPath;
        Instance.FinalState state;

        private Data() {
        }
    }

    public VoIPDebugToSend(int i) {
        this.currentAccount = i;
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
        bc4.G(this.currentAccount).f0(new ts9(this, savecalldebug, (byte) 20), file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$done$2(Data data, File file, TL_phone.saveCallDebug savecalldebug) {
        File file2 = new File(data.logPath);
        Typeface typeface = gm.a;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    byte[] bArr = new byte[TLObject.FLAG_13];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            gZIPOutputStream.close();
                            bufferedInputStream.close();
                            gm.c3(new gcc(this, file, savecalldebug, (byte) 7));
                            return;
                        }
                        gZIPOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException e) {
            fc4.g(e, true);
        } catch (IOException e2) {
            fc4.g(e2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$done$3(final Data data, final TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (e21.a) {
            fc4.b("Sent debug logs, response = " + tLObject);
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse) || TextUtils.isEmpty(data.logPath)) {
            return;
        }
        final File file = new File(b10.j(new StringBuilder(), data.logPath, ".gzip"));
        Utilities.g.c(new Runnable() { // from class: org.telegram.messenger.voip.c
            @Override // java.lang.Runnable
            public final void run() {
                VoIPDebugToSend.this.lambda$done$2(data, file, savecalldebug);
            }
        });
    }

    public void done(long j, boolean z) {
        final Data remove = this.pending.remove(Long.valueOf(j));
        if (remove == null || !z) {
            return;
        }
        final TL_phone.saveCallDebug savecalldebug = new TL_phone.saveCallDebug();
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        savecalldebug.debug = tL_dataJSON;
        tL_dataJSON.data = remove.state.debugLog;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        savecalldebug.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = remove.access_hash;
        tL_inputPhoneCall.id = remove.callId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new RequestDelegate() { // from class: org.telegram.messenger.voip.d
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPDebugToSend.this.lambda$done$3(remove, savecalldebug, tLObject, tL_error);
            }
        });
    }

    public void push(long j, long j2, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(sic.e(String.valueOf(j)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Data data = new Data();
        data.callId = j;
        data.access_hash = j2;
        data.state = finalState;
        data.logPath = str;
        this.pending.put(Long.valueOf(j), data);
    }
}
