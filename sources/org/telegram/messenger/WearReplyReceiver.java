package org.telegram.messenger;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class WearReplyReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a(j5 j5Var, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        k47 k47Var;
        int i2 = j5Var.a;
        k47 k47Var2 = null;
        if (i != 0) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.id = i;
            tL_message.peer_id = oc7.r1(i2).x1(j);
            k47Var = new k47(i2, tL_message, false, false);
        } else {
            k47Var = null;
        }
        if (j2 != 0) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = "";
            tL_message2.id = (int) j2;
            tL_message2.peer_id = oc7.r1(i2).x1(j);
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
            tL_message2.action = tL_messageActionTopicCreate;
            tL_messageActionTopicCreate.title = "";
            k47Var2 = new k47(i2, tL_message2, false, false);
        }
        a6a.B(i2).q0(y5a.b(charSequence.toString(), j, k47Var, k47Var2, null, true, null, null, null, true, 0, 0, null, false));
        if (iArr != null && iArr.length > 0) {
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                i3 = td4.g(iArr[i3], i3, 1, arrayList);
            }
            cf7 Y = cf7.Y(i2);
            if (!arrayList.isEmpty()) {
                Y.a.c(new me7(Y, arrayList, j, (byte) 0));
            }
        }
        if (j2 == 0) {
            oc7.r1(i2).n3(j, i, i, 0, false, j2, 0, true, 0);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a.v();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            final CharSequence charSequence = resultsFromIntent.getCharSequence("extra_voice_reply");
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            final long longExtra = intent.getLongExtra("dialog_id", 0L);
            final int intExtra = intent.getIntExtra("max_id", 0);
            final long longExtra2 = intent.getLongExtra("topic_id", 0L);
            int intExtra2 = intent.getIntExtra("currentAccount", 0);
            final int[] intArrayExtra = intent.getIntArrayExtra("voice_msg_ids");
            if (longExtra == 0 || intExtra == 0 || !z8c.q(intExtra2)) {
                return;
            }
            final j5 a2 = j5.a(intExtra2);
            if (pg3.D(longExtra)) {
                if (oc7.r1(a2.a).W1(Long.valueOf(longExtra)) == null) {
                    final byte b = 0;
                    Utilities.e.c(new Runnable(this) { // from class: buc
                        public final /* synthetic */ WearReplyReceiver b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (b) {
                                case 0:
                                    int i = WearReplyReceiver.a;
                                    j5 j5Var = a2;
                                    cf7 Y = cf7.Y(j5Var.a);
                                    long j = longExtra;
                                    gm.c3(new y97(this.b, j5Var, Y.h0(j), charSequence, j, longExtra2, intExtra, intArrayExtra));
                                    break;
                                default:
                                    int i2 = WearReplyReceiver.a;
                                    j5 j5Var2 = a2;
                                    cf7 Y2 = cf7.Y(j5Var2.a);
                                    long j2 = longExtra;
                                    gm.c3(new y97(this.b, j5Var2, Y2.O(-j2), charSequence, j2, longExtra2, intExtra, intArrayExtra));
                                    break;
                            }
                        }
                    });
                    return;
                }
            } else if (pg3.y(longExtra) && oc7.r1(a2.a).L0(Long.valueOf(-longExtra)) == null) {
                final byte b2 = 1;
                Utilities.e.c(new Runnable(this) { // from class: buc
                    public final /* synthetic */ WearReplyReceiver b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b2) {
                            case 0:
                                int i = WearReplyReceiver.a;
                                j5 j5Var = a2;
                                cf7 Y = cf7.Y(j5Var.a);
                                long j = longExtra;
                                gm.c3(new y97(this.b, j5Var, Y.h0(j), charSequence, j, longExtra2, intExtra, intArrayExtra));
                                break;
                            default:
                                int i2 = WearReplyReceiver.a;
                                j5 j5Var2 = a2;
                                cf7 Y2 = cf7.Y(j5Var2.a);
                                long j2 = longExtra;
                                gm.c3(new y97(this.b, j5Var2, Y2.O(-j2), charSequence, j2, longExtra2, intExtra, intArrayExtra));
                                break;
                        }
                    }
                });
                return;
            }
            a(a2, charSequence, longExtra, longExtra2, intExtra, intArrayExtra);
        }
    }
}
