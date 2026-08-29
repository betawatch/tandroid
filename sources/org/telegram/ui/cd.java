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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cd extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ hd a;

    public cd(hd hdVar) {
        this.a = hdVar;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        hd hdVar = this.a;
        long j10 = hdVar.e0;
        yc ycVar = hdVar.r0;
        if (i10 == -1) {
            if (hdVar.n0) {
                hd.Y(hdVar);
                return;
            } else {
                hdVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = hdVar.d0;
            if (i13 == 0) {
                if (hdVar.getParentActivity() == null) {
                    return;
                }
                if (hdVar.n0) {
                    hd.Y(hdVar);
                    return;
                }
                if (hdVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) hdVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(hdVar.c);
                    return;
                }
                hdVar.n0 = true;
                AndroidUtilities.runOnUIThread(ycVar, 200L);
                if (hdVar.v.h()) {
                    hdVar.m0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.o2) hdVar).currentAccount;
                    hdVar.o0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(hdVar.c.getText().toString(), new ArrayList<>(), hdVar.w.getText().toString(), 2, false, null, null, -1, hdVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (hdVar.W) {
                    Utilities.Callback2 callback2 = hdVar.p0;
                    if (callback2 != null) {
                        callback2.run(hdVar, Long.valueOf(j10));
                    }
                } else {
                    if (hdVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hdVar.getParentActivity());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        hdVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!hdVar.V) {
                        Vibrator vibrator2 = (Vibrator) hdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(hdVar.Q);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(ycVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.o2) hdVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j11 = hdVar.e0;
                    String str = hdVar.T;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.bd
                        public final /* synthetic */ cd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    hd hdVar2 = this.b.a;
                                    hdVar2.g0(false);
                                    Utilities.Callback2 callback22 = hdVar2.p0;
                                    if (callback22 != null) {
                                        callback22.run(hdVar2, Long.valueOf(hdVar2.e0));
                                        break;
                                    }
                                    break;
                                default:
                                    hd hdVar3 = this.b.a;
                                    hdVar3.g0(false);
                                    Utilities.Callback2 callback23 = hdVar3.p0;
                                    if (callback23 != null) {
                                        callback23.run(hdVar3, Long.valueOf(hdVar3.e0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(hdVar, j11, str, runnable, new Runnable(this) { // from class: org.telegram.ui.bd
                        public final /* synthetic */ cd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    hd hdVar2 = this.b.a;
                                    hdVar2.g0(false);
                                    Utilities.Callback2 callback22 = hdVar2.p0;
                                    if (callback22 != null) {
                                        callback22.run(hdVar2, Long.valueOf(hdVar2.e0));
                                        break;
                                    }
                                    break;
                                default:
                                    hd hdVar3 = this.b.a;
                                    hdVar3.g0(false);
                                    Utilities.Callback2 callback23 = hdVar3.p0;
                                    if (callback23 != null) {
                                        callback23.run(hdVar3, Long.valueOf(hdVar3.e0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (hdVar.p0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j10);
                    bundle.putInt("chatType", 2);
                    hdVar.presentFragment(new m60(bundle), true);
                }
            }
        }
    }
}
