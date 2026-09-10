package org.telegram.ui;

import android.os.Bundle;
import android.os.Vibrator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class id extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ nd a;

    public id(nd ndVar) {
        this.a = ndVar;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        nd ndVar = this.a;
        long j3 = ndVar.i0;
        ed edVar = ndVar.v0;
        if (i10 == -1) {
            if (ndVar.r0) {
                nd.Y(ndVar);
                return;
            } else {
                ndVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = ndVar.h0;
            if (i13 == 0) {
                if (ndVar.getParentActivity() == null) {
                    return;
                }
                if (ndVar.r0) {
                    nd.Y(ndVar);
                    return;
                }
                if (ndVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(ndVar.c);
                    return;
                }
                ndVar.r0 = true;
                AndroidUtilities.runOnUIThread(edVar, 200L);
                if (ndVar.v.h()) {
                    ndVar.q0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.p2) ndVar).currentAccount;
                    ndVar.s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(ndVar.c.getText().toString(), new ArrayList<>(), ndVar.w.getText().toString(), 2, false, null, null, -1, ndVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (ndVar.a0) {
                    Utilities.Callback2 callback2 = ndVar.t0;
                    if (callback2 != null) {
                        callback2.run(ndVar, Long.valueOf(j3));
                    }
                } else {
                    if (ndVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        ndVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!ndVar.Z) {
                        Vibrator vibrator2 = (Vibrator) ndVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ndVar.U);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(edVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.p2) ndVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j10 = ndVar.i0;
                    String str = ndVar.X;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.hd
                        public final /* synthetic */ id b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    nd ndVar2 = this.b.a;
                                    ndVar2.g0(false);
                                    Utilities.Callback2 callback22 = ndVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(ndVar2, Long.valueOf(ndVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    nd ndVar3 = this.b.a;
                                    ndVar3.g0(false);
                                    Utilities.Callback2 callback23 = ndVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(ndVar3, Long.valueOf(ndVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(ndVar, j10, str, runnable, new Runnable(this) { // from class: org.telegram.ui.hd
                        public final /* synthetic */ id b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    nd ndVar2 = this.b.a;
                                    ndVar2.g0(false);
                                    Utilities.Callback2 callback22 = ndVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(ndVar2, Long.valueOf(ndVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    nd ndVar3 = this.b.a;
                                    ndVar3.g0(false);
                                    Utilities.Callback2 callback23 = ndVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(ndVar3, Long.valueOf(ndVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (ndVar.t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    ndVar.presentFragment(new e70(bundle), true);
                }
            }
        }
    }
}
