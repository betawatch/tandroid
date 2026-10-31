package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class WearReplyReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a(c cVar, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        jj jjVar;
        int i11 = cVar.a;
        jj jjVar2 = null;
        if (i10 != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i10;
            tL_message.peer_id = vp.r1(i11).y1(j10);
            jjVar = new jj(i11, tL_message, false, false);
        } else {
            jjVar = null;
        }
        if (j11 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j11;
            tL_message2.peer_id = vp.r1(i11).y1(j10);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            jjVar2 = new jj(i11, tL_message2, false, false);
        }
        qz.C(i11).r0(oz.b(charSequence.toString(), j10, jjVar, jjVar2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i12 = 0;
            while (i12 < length) {
                i12 = c3.i0.j(iArr[i12], i12, 1, arrayList);
            }
            hs a02 = hs.a0(i11);
            if (!arrayList.isEmpty()) {
                a02.a.c(new tr(a02, arrayList, j10, 0));
            }
        }
        if (j11 == 0) {
            vp.r1(i11).h3(j10, i10, i10, 0, false, j11, 0, true, 0);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w0.w();
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
        if (longExtra == 0 || intExtra == 0 || !d20.r(intExtra2)) {
            return;
        }
        final c a2 = c.a(intExtra2);
        if (o5.E(longExtra)) {
            if (vp.r1(a2.a).Z1(Long.valueOf(longExtra)) == null) {
                final int i10 = 0;
                Utilities.e.c(new Runnable(this) { // from class: org.telegram.messenger.a30
                    public final /* synthetic */ WearReplyReceiver b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                int i11 = WearReplyReceiver.a;
                                c cVar = a2;
                                hs a02 = hs.a0(cVar.a);
                                long j10 = longExtra;
                                i0.g3(new zm(this.b, cVar, a02.k0(j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                                break;
                            default:
                                int i12 = WearReplyReceiver.a;
                                c cVar2 = a2;
                                hs a03 = hs.a0(cVar2.a);
                                long j11 = longExtra;
                                i0.g3(new zm(this.b, cVar2, a03.P(-j11), charSequence, j11, longExtra2, intExtra, intArrayExtra));
                                break;
                        }
                    }
                });
                return;
            }
        } else if (o5.z(longExtra) && vp.r1(a2.a).L0(Long.valueOf(-longExtra)) == null) {
            final int i11 = 1;
            Utilities.e.c(new Runnable(this) { // from class: org.telegram.messenger.a30
                public final /* synthetic */ WearReplyReceiver b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            int i112 = WearReplyReceiver.a;
                            c cVar = a2;
                            hs a02 = hs.a0(cVar.a);
                            long j10 = longExtra;
                            i0.g3(new zm(this.b, cVar, a02.k0(j10), charSequence, j10, longExtra2, intExtra, intArrayExtra));
                            break;
                        default:
                            int i12 = WearReplyReceiver.a;
                            c cVar2 = a2;
                            hs a03 = hs.a0(cVar2.a);
                            long j11 = longExtra;
                            i0.g3(new zm(this.b, cVar2, a03.P(-j11), charSequence, j11, longExtra2, intExtra, intArrayExtra));
                            break;
                    }
                }
            });
            return;
        }
        a(a2, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
    }
}
