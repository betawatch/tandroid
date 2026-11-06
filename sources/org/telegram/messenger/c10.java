package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c10 extends TLObject {
    public TLRPC.TL_textWithEntities a;
    public ArrayList b = new ArrayList();
    public TLRPC.TL_textWithEntities c;

    public static c10 a(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        c10 c10Var = new c10();
        c10Var.a = poll.question;
        for (int i7 = 0; i7 < poll.answers.size(); i7++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i7);
            TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
            tL_pollAnswer.text = pollAnswer.text;
            tL_pollAnswer.option = pollAnswer.option;
            c10Var.b.add(tL_pollAnswer);
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            c10Var.c = tL_textWithEntities;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_textWithEntities.text = pollResults2.solution;
            tL_textWithEntities.entities = pollResults2.solution_entities;
        }
        return c10Var;
    }

    public static boolean b(ij ijVar, c10 c10Var) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia n1 = ij.n1(ijVar);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll) || (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1).poll) == null) {
            return true;
        }
        if ((poll.question != null) != (c10Var.a != null)) {
            return false;
        }
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        return (pollResults != null && pollResults.solution != null) == (c10Var.c != null) && poll.answers.size() == c10Var.b.size();
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        if ((readInt32 & 1) != 0) {
            this.a = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((readInt32 & 2) != 0) {
            this.b = Vector.deserialize(inputSerializedData, new ch(12), z9);
        }
        if ((readInt32 & 4) != 0) {
            this.c = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(613759672);
        int i7 = this.a != null ? 1 : 0;
        ArrayList arrayList = this.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            i7 |= 2;
        }
        if (this.c != null) {
            i7 |= 4;
        }
        outputSerializedData.writeInt32(i7);
        if ((i7 & 1) != 0) {
            this.a.serializeToStream(outputSerializedData);
        }
        if ((i7 & 2) != 0) {
            Vector.serialize(outputSerializedData, this.b);
        }
        if ((i7 & 4) != 0) {
            this.c.serializeToStream(outputSerializedData);
        }
    }
}
