package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ f41(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new wv0(this.b, 21));
                break;
            case 1:
                final int i10 = 1;
                final SessionsActivity sessionsActivity = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.h41
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity2 = sessionsActivity;
                        switch (i11) {
                            case 0:
                                if (sessionsActivity2.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.m5.n(null, 2131754285, org.telegram.ui.Components.cc.a0(sessionsActivity2), R.raw.contact_check, 36);
                                    } else {
                                        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(sessionsActivity2), R.raw.error, 36);
                                    }
                                    sessionsActivity2.o0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.o0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity2.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity2), R.raw.contact_check, 36);
                                    sessionsActivity2.o0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i11 = 0; i11 < 4; i11++) {
                    org.telegram.messenger.d20 i12 = org.telegram.messenger.d20.i(i11);
                    if (i12.p()) {
                        i12.d = false;
                        i12.v(false);
                        org.telegram.messenger.vp.r1(i11).W3(org.telegram.messenger.tz.f, org.telegram.messenger.tz.g);
                        ConnectionsManager.getInstance(i11).setUserId(i12.e());
                    }
                }
                break;
            case 2:
                final int i13 = 2;
                final SessionsActivity sessionsActivity2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.h41
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i13;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                        switch (i112) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.m5.n(null, 2131754285, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    } else {
                                        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.error, 36);
                                    }
                                    sessionsActivity22.o0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.o0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.o0(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.messenger.d20 i15 = org.telegram.messenger.d20.i(i14);
                    if (i15.p()) {
                        i15.d = false;
                        i15.v(false);
                        org.telegram.messenger.vp.r1(i14).W3(org.telegram.messenger.tz.f, org.telegram.messenger.tz.g);
                        ConnectionsManager.getInstance(i14).setUserId(i15.e());
                    }
                }
                break;
            default:
                final int i16 = 0;
                final SessionsActivity sessionsActivity3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.h41
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i16;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        SessionsActivity sessionsActivity22 = sessionsActivity3;
                        switch (i112) {
                            case 0:
                                if (sessionsActivity22.getParentActivity() != null) {
                                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                        org.telegram.messenger.m5.n(null, 2131754285, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    } else {
                                        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.error, 36);
                                    }
                                    sessionsActivity22.o0(false);
                                    break;
                                }
                                break;
                            case 1:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.o0(false);
                                    break;
                                }
                                break;
                            default:
                                if (sessionsActivity22.getParentActivity() != null && tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    org.telegram.messenger.m5.n(null, 2131754290, org.telegram.ui.Components.cc.a0(sessionsActivity22), R.raw.contact_check, 36);
                                    sessionsActivity22.o0(false);
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
