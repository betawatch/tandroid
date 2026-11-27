// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class mi8 {
    public static int a(r47 r47Var) {
        if (r47Var.D == 17) {
            TLRPC.Message message = r47Var.k;
            int i = r47Var.K1;
            TLRPC.MessageMedia n1 = r47.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                int i2 = poll.closed ? 8 : 0;
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-(messageFwdHeader != null ? wf3.n(messageFwdHeader.from_id) : r47.B0(r47Var.k))));
                    if (M0 != null) {
                        if (M0.left || M0.kicked) {
                            i2 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - M0.date < 86400) {
                            i2 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList == null || arrayList.isEmpty()) {
                    return i2;
                }
                return !tL_messageMediaPoll.poll.countries_iso2.contains(uc7.s1(i).l4.Z.f) ? i2 | 4 : i2;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i, r47 r47Var) {
        if (r47Var.D == 17) {
            TLRPC.Message message = r47Var.k;
            int i2 = r47Var.K1;
            TLRPC.MessageMedia n1 = r47.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                if (vsd.a(i, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str = arrayList2.get(i3);
                        i3++;
                        String str2 = str;
                        String i0 = ob6.i0(2131750481, str2);
                        if (!TextUtils.isEmpty(i0)) {
                            str2 = i0;
                        }
                        arrayList.add(str2);
                    }
                    boolean z = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        return hl.S2(ob6.a0(null, null, z ? 2131746844 : 2131746841, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i4));
                    }
                    return hl.S2(ob6.a0(null, null, z ? 2131746843 : 2131746840, stringBuffer, c00.g(1, arrayList)));
                }
                if (vsd.a(i, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    return hl.S2(ob6.a0(null, null, 2131746845, wf3.t(uc7.s1(i2).M0(Long.valueOf(-(messageFwdHeader != null ? wf3.n(messageFwdHeader.from_id) : r47.B0(r47Var.k)))))));
                }
                if (vsd.a(i, 2)) {
                    return hl.S2(ob6.M0(2131746842, null));
                }
            }
        }
        return null;
    }
}
