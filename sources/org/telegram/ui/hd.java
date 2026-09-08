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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hd extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ md a;

    public hd(md mdVar) {
        this.a = mdVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        md mdVar = this.a;
        long j3 = mdVar.i0;
        dd ddVar = mdVar.v0;
        if (i10 == -1) {
            if (mdVar.r0) {
                md.Y(mdVar);
                return;
            } else {
                mdVar.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            int i13 = mdVar.h0;
            if (i13 == 0) {
                if (mdVar.getParentActivity() == null) {
                    return;
                }
                if (mdVar.r0) {
                    md.Y(mdVar);
                    return;
                }
                if (mdVar.c.a.length() == 0) {
                    Vibrator vibrator = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                    }
                    AndroidUtilities.shakeView(mdVar.c);
                    return;
                }
                mdVar.r0 = true;
                AndroidUtilities.runOnUIThread(ddVar, 200L);
                if (mdVar.v.h()) {
                    mdVar.q0 = true;
                    return;
                } else {
                    i12 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                    mdVar.s0 = Integer.valueOf(MessagesController.getInstance(i12).createChat(mdVar.c.getText().toString(), new ArrayList<>(), mdVar.w.getText().toString(), 2, false, null, null, -1, mdVar));
                    return;
                }
            }
            if (i13 == 1) {
                if (mdVar.a0) {
                    Utilities.Callback2 callback2 = mdVar.t0;
                    if (callback2 != null) {
                        callback2.run(mdVar, Long.valueOf(j3));
                    }
                } else {
                    if (mdVar.w.length() == 0) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                        mdVar.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    if (!mdVar.Z) {
                        Vibrator vibrator2 = (Vibrator) mdVar.getParentActivity().getSystemService("vibrator");
                        if (vibrator2 != null) {
                            vibrator2.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(mdVar.U);
                        return;
                    }
                    AndroidUtilities.runOnUIThread(ddVar, 200L);
                    i11 = ((org.telegram.ui.ActionBar.n2) mdVar).currentAccount;
                    MessagesController messagesController = MessagesController.getInstance(i11);
                    long j10 = mdVar.i0;
                    String str = mdVar.X;
                    final int i14 = 0;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.gd
                        public final /* synthetic */ hd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    md mdVar2 = this.b.a;
                                    mdVar2.g0(false);
                                    Utilities.Callback2 callback22 = mdVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(mdVar2, Long.valueOf(mdVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    md mdVar3 = this.b.a;
                                    mdVar3.g0(false);
                                    Utilities.Callback2 callback23 = mdVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(mdVar3, Long.valueOf(mdVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    final int i15 = 1;
                    messagesController.updateChannelUserName(mdVar, j10, str, runnable, new Runnable(this) { // from class: org.telegram.ui.gd
                        public final /* synthetic */ hd b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    md mdVar2 = this.b.a;
                                    mdVar2.g0(false);
                                    Utilities.Callback2 callback22 = mdVar2.t0;
                                    if (callback22 != null) {
                                        callback22.run(mdVar2, Long.valueOf(mdVar2.i0));
                                        break;
                                    }
                                    break;
                                default:
                                    md mdVar3 = this.b.a;
                                    mdVar3.g0(false);
                                    Utilities.Callback2 callback23 = mdVar3.t0;
                                    if (callback23 != null) {
                                        callback23.run(mdVar3, Long.valueOf(mdVar3.i0));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (mdVar.t0 == null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 2);
                    bundle.putLong("chatId", j3);
                    bundle.putInt("chatType", 2);
                    mdVar.presentFragment(new f70(bundle), true);
                }
            }
        }
    }
}
