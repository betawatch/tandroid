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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nd extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ sd a;

    public nd(sd sdVar) {
        this.a = sdVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        sd sdVar = this.a;
        long j10 = sdVar.i0;
        jd jdVar = sdVar.v0;
        if (i10 == -1) {
            if (sdVar.r0) {
                sd.Y(sdVar);
                return;
            } else {
                sdVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = sdVar.h0;
            if (i13 == 0) {
                if (sdVar.getParentActivity() == null) {
                    return;
                }
                if (sdVar.r0) {
                    sd.Y(sdVar);
                    return;
                }
                if (sdVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) sdVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(sdVar.c);
                    return;
                }
                sdVar.r0 = true;
                AndroidUtilities.runOnUIThread(jdVar, 200L);
                if (sdVar.v.g()) {
                    sdVar.q0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.m2) sdVar).currentAccount;
                    sdVar.s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(sdVar.c.getText().toString(), new ArrayList<>(), sdVar.w.getText().toString(), 2, false, null, null, -1, sdVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (sdVar.a0) {
                    Utilities.Callback2 callback2 = sdVar.t0;
                    if (callback2 != null) {
                        callback2.run(sdVar, Long.valueOf(j10));
                    }
                } else {
                    if (sdVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sdVar.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        sdVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!sdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) sdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(sdVar.U);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(jdVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.m2) sdVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j11 = sdVar.i0;
                    String str = sdVar.X;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.md
                        public final /* synthetic */ nd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    sd sdVar2 = this.b.a;
                                    sdVar2.g0(false);
                                    Utilities.Callback2 callback22 = sdVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(sdVar2, Long.valueOf(sdVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    sd sdVar3 = this.b.a;
                                    sdVar3.g0(false);
                                    Utilities.Callback2 callback23 = sdVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(sdVar3, Long.valueOf(sdVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(sdVar, j11, str, runnable, new Runnable(this) { // from class: org.telegram.ui.md
                        public final /* synthetic */ nd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    sd sdVar2 = this.b.a;
                                    sdVar2.g0(false);
                                    Utilities.Callback2 callback22 = sdVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(sdVar2, Long.valueOf(sdVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    sd sdVar3 = this.b.a;
                                    sdVar3.g0(false);
                                    Utilities.Callback2 callback23 = sdVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(sdVar3, Long.valueOf(sdVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (sdVar.t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    sdVar.presentFragment(new j70(bundle), true);
                }
            }
        }
    }
}
