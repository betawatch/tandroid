package ih;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q0;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import v7.u7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class j {
    public static int a(kj kjVar) {
        if (kjVar.D == 17) {
            TLRPC.Message message = kjVar.k;
            int i10 = kjVar.I1;
            TLRPC.MessageMedia o12 = kj.o1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12) : null);
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                int i11 = poll.closed ? 8 : 0;
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-(messageFwdHeader != null ? o5.o(messageFwdHeader.from_id) : kj.B0(kjVar.k))));
                    if (L0 != null) {
                        if (L0.left || L0.kicked) {
                            i11 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - L0.date < 86400) {
                            i11 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!tL_messageMediaPoll.poll.countries_iso2.contains(((q0) wp.r1(i10).y7.O.b).c)) {
                        return i11 | 4;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i10, kj kjVar) {
        if (kjVar.D == 17) {
            TLRPC.Message message = kjVar.k;
            int i11 = kjVar.I1;
            TLRPC.MessageMedia o12 = kj.o1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(o12) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(o12) : null);
            if (tL_messageMediaPoll != null) {
                if (u7.a(i10, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        String str = arrayList2.get(i12);
                        i12++;
                        String str2 = str;
                        String i02 = dd.i0(2131750530, str2);
                        if (!TextUtils.isEmpty(i02)) {
                            str2 = i02;
                        }
                        arrayList.add(str2);
                    }
                    boolean z10 = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        return i0.W2(dd.a0(null, null, z10 ? 2131747132 : 2131747129, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i13 = 0; i13 < arrayList.size() - 1; i13++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i13));
                    }
                    return i0.W2(dd.a0(null, null, z10 ? 2131747131 : 2131747128, stringBuffer, i0.a.g(1, arrayList)));
                }
                if (u7.a(i10, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    return i0.W2(dd.a0(null, null, 2131747133, o5.u(wp.r1(i11).L0(Long.valueOf(-(messageFwdHeader != null ? o5.o(messageFwdHeader.from_id) : kj.B0(kjVar.k)))))));
                }
                if (u7.a(i10, 2)) {
                    return i0.W2(dd.L0(2131747130, null));
                }
            }
        }
        return null;
    }
}
