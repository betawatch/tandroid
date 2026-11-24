// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ah8 {
    public static int a(k47 k47Var) {
        if (k47Var.D == 17) {
            TLRPC.Message message = k47Var.k;
            int i = k47Var.K1;
            TLRPC.MessageMedia n1 = k47.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                int i2 = poll.closed ? 8 : 0;
                if (poll.subscribers_only) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-(messageFwdHeader != null ? pg3.n(messageFwdHeader.from_id) : k47.B0(k47Var.k))));
                    if (L0 != null) {
                        if (L0.left || L0.kicked) {
                            i2 |= 1;
                        }
                        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                        if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - L0.date < 86400) {
                            i2 |= 2;
                        }
                    }
                }
                ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
                if (arrayList == null || arrayList.isEmpty()) {
                    return i2;
                }
                return !tL_messageMediaPoll.poll.countries_iso2.contains(oc7.r1(i).l4.S.f) ? i2 | 4 : i2;
            }
        }
        return 0;
    }

    public static SpannableStringBuilder b(int i, k47 k47Var) {
        if (k47Var.D == 17) {
            TLRPC.Message message = k47Var.k;
            int i2 = k47Var.K1;
            TLRPC.MessageMedia n1 = k47.n1(message);
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) (TLRPC.TL_messageMediaPoll.class.isInstance(n1) ? (TLRPC.MessageMedia) TLRPC.TL_messageMediaPoll.class.cast(n1) : null);
            if (tL_messageMediaPoll != null) {
                if (iqd.a(i, 4)) {
                    ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
                    ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str = arrayList2.get(i3);
                        i3++;
                        String str2 = str;
                        String i0 = jb6.i0(2131750453, str2);
                        if (!TextUtils.isEmpty(i0)) {
                            str2 = i0;
                        }
                        arrayList.add(str2);
                    }
                    boolean z = tL_messageMediaPoll.poll.subscribers_only;
                    if (arrayList.size() == 1) {
                        return gm.S2(jb6.a0(null, null, z ? 2131746850 : 2131746847, arrayList.get(0)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
                        if (stringBuffer.length() > 0) {
                            stringBuffer.append(", ");
                        }
                        stringBuffer.append((String) arrayList.get(i4));
                    }
                    return gm.S2(jb6.a0(null, null, z ? 2131746849 : 2131746846, stringBuffer, b10.f(1, arrayList)));
                }
                if (iqd.a(i, 1)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                    return gm.S2(jb6.a0(null, null, 2131746851, pg3.t(oc7.r1(i2).L0(Long.valueOf(-(messageFwdHeader != null ? pg3.n(messageFwdHeader.from_id) : k47.B0(k47Var.k)))))));
                }
                if (iqd.a(i, 2)) {
                    return gm.S2(jb6.M0(2131746848, null));
                }
            }
        }
        return null;
    }
}
