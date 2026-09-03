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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements uk, xd.i, org.telegram.ui.ActionBar.c2, jl0, qg.c, org.telegram.ui.ActionBar.s0, on, AndroidUtilities.IntColorCallback, y4, ti {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    public /* synthetic */ tg(li liVar, int i10) {
        this.a = i10;
        this.b = liVar;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        boolean G1;
        switch (this.a) {
            case 12:
                li liVar = this.b;
                di diVar = liVar.v0;
                if (diVar != liVar.g0 && diVar != liVar.n0) {
                    if (!diVar.H(i10, z4, i11, liVar.s1(), 0L)) {
                        liVar.x2 = true;
                        liVar.dismiss();
                        break;
                    }
                } else {
                    liVar.G1(i10, z4, 0, liVar.s1(), liVar.K0);
                    break;
                }
                break;
            default:
                li liVar2 = this.b;
                cf cfVar = liVar2.e0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                vh vhVar = liVar2.F0;
                liVar2.K0 = k10;
                vhVar.setEffect(k10);
                di diVar2 = liVar2.v0;
                if (diVar2 == liVar2.g0 || diVar2 == liVar2.n0) {
                    G1 = liVar2.G1(i10, z4, i11, liVar2.s1(), k10);
                } else {
                    if (!diVar2.H(i10, z4, i11, liVar2.s1(), k10)) {
                        liVar2.dismiss();
                    }
                    G1 = false;
                }
                cf cfVar2 = liVar2.e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    liVar2.e0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.zn) this.b.c0).b(messageMedia, i10, z4, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.zn) this.b.c0).b(messageMedia, i10, z4, i11, j10);
                break;
            default:
                ((org.telegram.ui.zn) this.b.c0).b(messageMedia, i10, z4, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.on
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, dh.i iVar, ArrayList arrayList, boolean z4, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        li liVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) liVar.c0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (znVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, znVar.Q5, znVar.k5, znVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = znVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = znVar.N8();
                    of2.suggestionParams = znVar.d5;
                    znVar.getSendMessagesHelper().sendMessage(of2);
                    znVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) liVar.c0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (znVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = znVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(znVar2.getAccountInstance(), new dh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), znVar2.Q5, znVar2.k5, znVar2.U3, null, znVar2.i5, z4, i10, znVar2.C8(), j10, znVar2.N8(), znVar2.d5);
                    znVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) view;
        li liVar = this.b;
        if (liVar.S || (user = eiVar.b) == null) {
            return false;
        }
        liVar.w1(eiVar.c, user);
        return true;
    }

    @Override // xd.i
    public void e(xd.j jVar) {
        this.b.u1();
    }

    @Override // qg.c
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        switch (this.a) {
            case 4:
                float f10 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.i5, f6Var);
                int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var);
                li liVar = this.b;
                return liVar.j2 ? i0.a.d(0.75f, v03, liVar.k2) : rg.b.m(f10, v02, v03);
            case 5:
                if (this.b.j2) {
                    return 0;
                }
                return z4 ? 687865855 : -1;
            case 6:
                if (this.b.j2) {
                    return 0;
                }
                return z4 ? 352321535 : -1;
            default:
                li liVar2 = this.b;
                if (liVar2.j2) {
                    if (AndroidUtilities.computePerceivedBrightness(liVar2.k2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z4) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.ti
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        li liVar = this.b;
        ti tiVar = liVar.V;
        if (tiVar != null) {
            tiVar.g(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if (p2Var == null || !(p2Var instanceof org.telegram.ui.zn)) {
            ji jiVar = liVar.W1;
            if (jiVar != null) {
                jiVar.b2(arrayList, charSequence, z4, i10, i11, j10, z10, j11);
                return;
            }
            return;
        }
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var;
        if (znVar.f7()) {
            znVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(znVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, znVar.Q5, znVar.k5, znVar.U3, null, z4, i10, i11, znVar.m5, znVar.C8(), j10, z10, j11);
            znVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        li liVar = this.b;
        liVar.x2 = true;
        liVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        this.b.U0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        li.o(this.b, i10);
    }

    @Override // xd.i
    public /* synthetic */ void a() {
    }
}
