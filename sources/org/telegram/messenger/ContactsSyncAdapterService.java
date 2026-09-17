package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class ContactsSyncAdapterService extends Service {
    private static SyncAdapterImpl sSyncAdapter;

    /* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
    public static class SyncAdapterImpl extends AbstractThreadedSyncAdapter {
        private Context mContext;

        public SyncAdapterImpl(Context context) {
            super(context, true);
            this.mContext = context;
        }

        @Override // android.content.AbstractThreadedSyncAdapter
        public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
            try {
                ContactsSyncAdapterService.performSync(this.mContext, account, bundle, str, contentProviderClient, syncResult);
            } catch (OperationCanceledException e7) {
                FileLog.e(e7);
            }
        }
    }

    private SyncAdapterImpl getSyncAdapter() {
        if (sSyncAdapter == null) {
            sSyncAdapter = new SyncAdapterImpl(this);
        }
        return sSyncAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void performSync(Context context, Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("performSync: " + account.toString());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return getSyncAdapter().getSyncAdapterBinder();
    }
}
