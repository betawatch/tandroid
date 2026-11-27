package org.telegram.messenger.voip;

import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class TelegramConnectionService extends ConnectionService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f11.a) {
            cc4.l("ConnectionService created");
        }
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (f11.a) {
            cc4.b("onCreateIncomingConnection ");
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras.getInt("call_type") != 1) {
            extras.getInt("call_type");
            return null;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.isOutgoing()) {
            return null;
        }
        return sharedInstance.getConnectionAndStartCall();
    }

    @Override // android.telecom.ConnectionService
    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (f11.a) {
            cc4.d("onCreateIncomingConnectionFailed ");
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().callFailedFromConnectionService();
        }
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (f11.a) {
            cc4.b("onCreateOutgoingConnection ");
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras.getInt("call_type") != 1) {
            extras.getInt("call_type");
            return null;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return null;
        }
        return sharedInstance.getConnectionAndStartCall();
    }

    @Override // android.telecom.ConnectionService
    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (f11.a) {
            cc4.d("onCreateOutgoingConnectionFailed ");
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().callFailedFromConnectionService();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (f11.a) {
            cc4.l("ConnectionService destroyed");
        }
    }
}
