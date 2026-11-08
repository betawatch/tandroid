package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class WearReplyReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a(c cVar, CharSequence charSequence, long j3, long j10, int i7, int[] iArr) {
        ij ijVar;
        int i10 = cVar.a;
        ij ijVar2 = null;
        if (i7 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i7;
            tL_message.peer_id = qp.s1(i10).z1(j3);
            ijVar = new ij(i10, tL_message, false, false);
        } else {
            ijVar = null;
        }
        if (j10 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j10;
            tL_message2.peer_id = qp.s1(i10).z1(j3);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            ijVar2 = new ij(i10, tL_message2, false, false);
        }
        gz.C(i10).r0(ez.b(charSequence.toString(), j3, ijVar, ijVar2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i11 = 0;
            while (i11 < length) {
                i11 = com.google.android.recaptcha.internal.a.f(iArr[i11], i11, 1, arrayList);
            }
            yr a02 = yr.a0(i10);
            if (!arrayList.isEmpty()) {
                a02.a.c(new lr(a02, arrayList, j3, 0));
            }
        }
        if (j10 == 0) {
            qp.s1(i10).j3(j3, i7, i7, 0, false, j10, 0, true, 0);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        t0.w();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null) {
            return;
        }
        final CharSequence charSequence = resultsFromIntent.getCharSequence("extra_voice_reply");
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        final long longExtra = intent.getLongExtra("dialog_id", 0L);
        final int intExtra = intent.getIntExtra("max_id", 0);
        final long longExtra2 = intent.getLongExtra("topic_id", 0L);
        int intExtra2 = intent.getIntExtra("currentAccount", 0);
        final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
        if (longExtra == 0 || intExtra == 0 || !p10.r(intExtra2)) {
            return;
        }
        final c a10 = c.a(intExtra2);
        if (m5.E(longExtra)) {
            if (qp.s1(a10.a).a2(Long.valueOf(longExtra)) == null) {
                final int i7 = 0;
                Utilities.e.c(new Runnable(this) { // from class: org.telegram.messenger.l20
                    public final /* synthetic */ WearReplyReceiver b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                int i10 = WearReplyReceiver.a;
                                c cVar = a10;
                                yr a02 = yr.a0(cVar.a);
                                long j3 = longExtra;
                                g0.h3(new fm(this.b, cVar, a02.k0(j3), charSequence, j3, longExtra2, intExtra, intArrayExtra));
                                break;
                            default:
                                int i11 = WearReplyReceiver.a;
                                c cVar2 = a10;
                                yr a03 = yr.a0(cVar2.a);
                                long j10 = longExtra;
                                g0.h3(new fm(this.b, cVar2, a03.P(-j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (m5.z(longExtra) && qp.s1(a10.a).M0(Long.valueOf(-longExtra)) == null) {
            final int i10 = 1;
            Utilities.e.c(new Runnable(this) { // from class: org.telegram.messenger.l20
                public final /* synthetic */ WearReplyReceiver b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            int i102 = WearReplyReceiver.a;
                            c cVar = a10;
                            yr a02 = yr.a0(cVar.a);
                            long j3 = longExtra;
                            g0.h3(new fm(this.b, cVar, a02.k0(j3), charSequence, j3, longExtra2, intExtra, intArrayExtra));
                            break;
                        default:
                            int i11 = WearReplyReceiver.a;
                            c cVar2 = a10;
                            yr a03 = yr.a0(cVar2.a);
                            long j10 = longExtra;
                            g0.h3(new fm(this.b, cVar2, a03.P(-j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                            break;
                    }
                }
            });
            return;
        }
        a(a10, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
    }
}
