package org.telegram.ui.Components;

import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements ml, org.telegram.ui.ActionBar.a2, ne.k, zl0, eh.d, org.telegram.ui.ActionBar.q0, eo, AndroidUtilities.IntColorCallback, e5, cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ dh(ti tiVar, int i10) {
        this.a = i10;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        boolean J1;
        switch (this.a) {
            case 12:
                ti tiVar = this.b;
                li liVar = tiVar.B0;
                if (liVar != tiVar.j0 && liVar != tiVar.q0) {
                    if (!liVar.K(i10, z10, i11, tiVar.u1(), 0L)) {
                        tiVar.D2 = true;
                        tiVar.dismiss();
                        break;
                    }
                } else {
                    tiVar.J1(i10, z10, 0, tiVar.u1(), tiVar.Q0);
                    break;
                }
                break;
            default:
                ti tiVar2 = this.b;
                mf mfVar = tiVar2.h0;
                long j10 = mfVar != null ? mfVar.j() : 0L;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = j10;
                eiVar.setEffect(j10);
                li liVar2 = tiVar2.B0;
                if (liVar2 == tiVar2.j0 || liVar2 == tiVar2.q0) {
                    J1 = tiVar2.J1(i10, z10, i11, tiVar2.u1(), j10);
                } else {
                    if (!liVar2.K(i10, z10, i11, tiVar2.u1(), j10)) {
                        tiVar2.dismiss();
                    }
                    J1 = false;
                }
                mf mfVar2 = tiVar2.h0;
                if (mfVar2 != null) {
                    mfVar2.g(!J1);
                    tiVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof mi)) {
            return false;
        }
        mi miVar = (mi) view;
        ti tiVar = this.b;
        if (tiVar.V || (user = miVar.b) == null) {
            return false;
        }
        tiVar.z1(miVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.ml
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.qn) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.qn) this.b.f0).b(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.qn) this.b.f0).b(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.eo
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        ti tiVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) tiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (qnVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, qnVar.T5, qnVar.n5, qnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = qnVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = qnVar.S8();
                    of2.suggestionParams = qnVar.g5;
                    qnVar.getSendMessagesHelper().sendMessage(of2);
                    qnVar.B6();
                    break;
                }
                break;
            default:
                org.telegram.ui.qn qnVar2 = (org.telegram.ui.qn) tiVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (qnVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = qnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(qnVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), qnVar2.T5, qnVar2.n5, qnVar2.X3, null, qnVar2.l5, z10, i10, qnVar2.H8(), j10, qnVar2.S8(), qnVar2.g5);
                    qnVar2.B6();
                    break;
                }
                break;
        }
    }

    @Override // ne.k
    public void e(ne.l lVar) {
        this.b.x1();
    }

    @Override // eh.d
    public int f(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.a7 : org.telegram.ui.ActionBar.h6.i5, d6Var);
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var);
                ti tiVar = this.b;
                return tiVar.p2 ? i0.a.f(0.75f, w03, tiVar.q2) : fh.c.m(f7, w02, w03);
            case 5:
                if (this.b.p2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 6:
                if (this.b.p2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                ti tiVar2 = this.b;
                if (tiVar2.p2) {
                    if (AndroidUtilities.computePerceivedBrightness(tiVar2.q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ti tiVar = this.b;
        tiVar.D2 = true;
        tiVar.dismiss();
    }

    @Override // org.telegram.ui.Components.cj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        ti tiVar = this.b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.i(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.qn)) {
            ri riVar = tiVar.c2;
            if (riVar != null) {
                riVar.r0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var;
        if (qnVar.i7()) {
            qnVar.o8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(qnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, qnVar.T5, qnVar.n5, qnVar.X3, null, z10, i10, i11, qnVar.p5, qnVar.H8(), j10, z11, j11);
            qnVar.B6();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
        this.b.a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        ti.u(this.b, i10);
    }

    @Override // ne.k
    public /* synthetic */ void c() {
    }
}
