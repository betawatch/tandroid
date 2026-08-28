package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b71 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ b71(SessionsActivity sessionsActivity, int i9) {
        this.a = i9;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ky0(this.b, 19));
                break;
            case 1:
                final int i9 = 1;
                final SessionsActivity sessionsActivity = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.d71
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.telegram.ui.Components.oc a02;
                        int i10;
                        int i11;
                        switch (i9) {
                            case 0:
                                SessionsActivity sessionsActivity2 = sessionsActivity;
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity2);
                                        i10 = R.raw.contact_check;
                                        i11 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity2);
                                        i10 = R.raw.error;
                                        i11 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.l0.p(i11, a02, i10, 36);
                                    sessionsActivity2.j0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.j0(false);
                                    break;
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.j0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i10 = 0; i10 < 4; i10++) {
                    UserConfig userConfig = UserConfig.getInstance(i10);
                    if (userConfig.isClientActivated()) {
                        userConfig.registeredForPush = false;
                        userConfig.saveConfig(false);
                        MessagesController.getInstance(i10).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i10).setUserId(userConfig.getClientUserId());
                    }
                }
                break;
            case 2:
                final int i11 = 2;
                final SessionsActivity sessionsActivity2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.d71
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.telegram.ui.Components.oc a02;
                        int i102;
                        int i112;
                        switch (i11) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity2;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i102 = R.raw.contact_check;
                                        i112 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i102 = R.raw.error;
                                        i112 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.l0.p(i112, a02, i102, 36);
                                    sessionsActivity22.j0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity3 = sessionsActivity2;
                                if (sessionsActivity3.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity3), R.raw.contact_check, 36);
                                    sessionsActivity3.j0(false);
                                    break;
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity2;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.j0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i12 = 0; i12 < 4; i12++) {
                    UserConfig userConfig2 = UserConfig.getInstance(i12);
                    if (userConfig2.isClientActivated()) {
                        userConfig2.registeredForPush = false;
                        userConfig2.saveConfig(false);
                        MessagesController.getInstance(i12).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                        ConnectionsManager.getInstance(i12).setUserId(userConfig2.getClientUserId());
                    }
                }
                break;
            default:
                final int i13 = 0;
                final SessionsActivity sessionsActivity3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.d71
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.telegram.ui.Components.oc a02;
                        int i102;
                        int i112;
                        switch (i13) {
                            case 0:
                                SessionsActivity sessionsActivity22 = sessionsActivity3;
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i102 = R.raw.contact_check;
                                        i112 = R.string.AllWebSessionsTerminated;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(sessionsActivity22);
                                        i102 = R.raw.error;
                                        i112 = R.string.UnknownError;
                                    }
                                    org.telegram.messenger.l0.p(i112, a02, i102, 36);
                                    sessionsActivity22.j0(false);
                                    break;
                                }
                                break;
                            case 1:
                                SessionsActivity sessionsActivity32 = sessionsActivity3;
                                if (sessionsActivity32.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity32), R.raw.contact_check, 36);
                                    sessionsActivity32.j0(false);
                                    break;
                                }
                                break;
                            default:
                                SessionsActivity sessionsActivity4 = sessionsActivity3;
                                if (sessionsActivity4.getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.l0.p(R.string.AllSessionsTerminated, org.telegram.ui.Components.oc.a0(sessionsActivity4), R.raw.contact_check, 36);
                                    sessionsActivity4.j0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
