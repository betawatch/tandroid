package org.telegram.messenger.voip;

import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.Instance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.VoIPHelper;

/* loaded from: classes3.dex */
public class VoIPDebugToSend {
    private final int currentAccount;
    private final HashMap<Long, Data> pending = new HashMap<>();

    public VoIPDebugToSend(int i) {
        this.currentAccount = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class Data {
        long access_hash;
        long callId;
        String logPath;
        Instance.FinalState state;

        private Data() {
        }
    }

    public void push(long j, long j2, Instance.FinalState finalState, String str) {
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = VoIPService.getStringFromFile(VoIPHelper.getLogFilePath("" + j, true));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savecalldebug, new RequestDelegate() { // from class: org.telegram.messenger.voip.VoIPDebugToSend$$ExternalSyntheticLambda3
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPDebugToSend.$r8$lambda$KDN788lan_fwQMs6aUn8wDUC3Zs(VoIPDebugToSend.this, remove, savecalldebug, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$KDN788lan_fwQMs6aUn8wDUC3Zs(final VoIPDebugToSend voIPDebugToSend, final Data data, final TL_phone.saveCallDebug savecalldebug, TLObject tLObject, TLRPC.TL_error tL_error) {
        voIPDebugToSend.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Sent debug logs, response = " + tLObject);
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse) || TextUtils.isEmpty(data.logPath)) {
            return;
        }
        final File file = new File(data.logPath + ".gzip");
        Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.voip.VoIPDebugToSend$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VoIPDebugToSend.$r8$lambda$we_Hd6reQlC4bpQw3SW-3N7tMqQ(VoIPDebugToSend.this, data, file, savecalldebug);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$we_Hd6reQlC4bpQw3SW-3N7tMqQ(final VoIPDebugToSend voIPDebugToSend, Data data, final File file, final TL_phone.saveCallDebug savecalldebug) {
        voIPDebugToSend.getClass();
        if (AndroidUtilities.gzip(new File(data.logPath), file)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.voip.VoIPDebugToSend$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    FileLoader.getInstance(r0.currentAccount).uploadFile(file.getAbsolutePath(), new Utilities.Callback() { // from class: org.telegram.messenger.voip.VoIPDebugToSend$$ExternalSyntheticLambda0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            VoIPDebugToSend.$r8$lambda$mUK38SKbO7DmRgx1xlWGZA_RuWs(VoIPDebugToSend.this, r2, (TLRPC.InputFile) obj);
                        }
                    });
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$mUK38SKbO7DmRgx1xlWGZA_RuWs(VoIPDebugToSend voIPDebugToSend, TL_phone.saveCallDebug savecalldebug, TLRPC.InputFile inputFile) {
        voIPDebugToSend.getClass();
        if (inputFile == null) {
            return;
        }
        TL_phone.saveCallLog savecalllog = new TL_phone.saveCallLog();
        savecalllog.peer = savecalldebug.peer;
        savecalllog.file = inputFile;
        ConnectionsManager.getInstance(voIPDebugToSend.currentAccount).sendRequest(savecalllog, null);
    }
}
