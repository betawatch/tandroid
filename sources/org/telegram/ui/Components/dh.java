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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements ml, org.telegram.ui.ActionBar.z1, ne.k, cm0, eh.d, org.telegram.ui.ActionBar.q0, eo, AndroidUtilities.IntColorCallback, d5, cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ dh(ti tiVar, int i10) {
        this.a = i10;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        boolean N1;
        switch (this.a) {
            case 12:
                ti tiVar = this.b;
                li liVar = tiVar.B0;
                if (liVar != tiVar.j0 && liVar != tiVar.q0) {
                    if (!liVar.K(i10, z10, i11, tiVar.x1(), 0L)) {
                        tiVar.G2 = true;
                        tiVar.dismiss();
                        break;
                    }
                } else {
                    tiVar.N1(i10, z10, 0, tiVar.x1(), tiVar.Q0);
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
                    N1 = tiVar2.N1(i10, z10, i11, tiVar2.x1(), j10);
                } else {
                    if (!liVar2.K(i10, z10, i11, tiVar2.x1(), j10)) {
                        tiVar2.dismiss();
                    }
                    N1 = false;
                }
                mf mfVar2 = tiVar2.h0;
                if (mfVar2 != null) {
                    mfVar2.g(!N1);
                    tiVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ml
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.sn) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.sn) this.b.f0).b(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.sn) this.b.f0).b(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.eo
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        ti tiVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) tiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (snVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, snVar.f6, snVar.z5, snVar.j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = snVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = snVar.S8();
                    of2.suggestionParams = snVar.s5;
                    snVar.getSendMessagesHelper().sendMessage(of2);
                    snVar.B6();
                    break;
                }
                break;
            default:
                org.telegram.ui.sn snVar2 = (org.telegram.ui.sn) tiVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (snVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = snVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(snVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), snVar2.f6, snVar2.z5, snVar2.j4, null, snVar2.x5, z10, i10, snVar2.H8(), j10, snVar2.S8(), snVar2.s5);
                    snVar2.B6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof mi)) {
            return false;
        }
        mi miVar = (mi) view;
        ti tiVar = this.b;
        if (tiVar.V || (user = miVar.b) == null) {
            return false;
        }
        tiVar.C1(miVar.c, user);
        return true;
    }

    @Override // ne.k
    public void e(ne.l lVar) {
        this.b.A1();
    }

    @Override // org.telegram.ui.Components.cj
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        ti tiVar = this.b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.f(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
        if (o2Var == null || !(o2Var instanceof org.telegram.ui.sn)) {
            ri riVar = tiVar.c2;
            if (riVar != null) {
                riVar.r0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
        if (snVar.i7()) {
            snVar.o8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(snVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, snVar.f6, snVar.z5, snVar.j4, null, z10, i10, i11, snVar.B5, snVar.H8(), j10, z11, j11);
            snVar.B6();
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ti tiVar = this.b;
        tiVar.G2 = true;
        tiVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
        this.b.a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // eh.d
    public int i(org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.i5, g6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, g6Var);
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

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        ti.t(this.b, i10);
    }

    @Override // ne.k
    public /* synthetic */ void a() {
    }
}
