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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements nl, org.telegram.ui.ActionBar.b2, oe.k, cm0, oi.n, fh.d, oi.m, org.telegram.ui.ActionBar.r0, AndroidUtilities.IntColorCallback, fo, e5, cj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ dh(ti tiVar, int i10) {
        this.a = i10;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        boolean N1;
        switch (this.a) {
            case 14:
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
                bi biVar = tiVar2.L0;
                tiVar2.Q0 = j10;
                biVar.setEffect(j10);
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

    @Override // oe.k
    public void b(oe.l lVar) {
        this.b.A1();
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
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

    @Override // org.telegram.ui.Components.nl
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.wn) this.b.f0).d(messageMedia, i10, z10, i11, 0L);
                break;
            case 12:
                ((org.telegram.ui.wn) this.b.f0).d(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.wn) this.b.f0).d(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.fo
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, sh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        ti tiVar = this.b;
        switch (i11) {
            case 13:
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) tiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (wnVar.o7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, wnVar.j6, wnVar.D5, wnVar.j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = wnVar.O8();
                    of2.payStars = j10;
                    of2.monoForumPeer = wnVar.a9();
                    of2.suggestionParams = wnVar.w5;
                    wnVar.getSendMessagesHelper().sendMessage(of2);
                    wnVar.E6();
                    break;
                }
                break;
            default:
                org.telegram.ui.wn wnVar2 = (org.telegram.ui.wn) tiVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (wnVar2.o7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = wnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(wnVar2.getAccountInstance(), new sh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), wnVar2.j6, wnVar2.D5, wnVar2.j4, null, wnVar2.B5, z10, i10, wnVar2.O8(), j10, wnVar2.a9(), wnVar2.w5);
                    wnVar2.E6();
                    break;
                }
                break;
        }
    }

    @Override // oi.n
    public int f() {
        ti tiVar = this.b;
        tiVar.getClass();
        return tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        this.b.a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ti tiVar = this.b;
        tiVar.G2 = true;
        tiVar.dismiss();
    }

    @Override // fh.d
    public int i(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.y6.w0(z10 ? org.telegram.ui.ActionBar.y6.a7 : org.telegram.ui.ActionBar.y6.i5, u6Var);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var);
                ti tiVar = this.b;
                return tiVar.p2 ? i0.a.f(0.75f, w03, tiVar.q2) : gh.c.n(f7, w02, w03);
            case 6:
                if (this.b.p2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 7:
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

    @Override // org.telegram.ui.Components.cj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        ti tiVar = this.b;
        cj cjVar = tiVar.Y;
        if (cjVar != null) {
            cjVar.j(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (r2Var == null || !(r2Var instanceof org.telegram.ui.wn)) {
            ri riVar = tiVar.c2;
            if (riVar != null) {
                riVar.z0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var;
        if (wnVar.o7()) {
            wnVar.u8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(wnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, wnVar.j6, wnVar.D5, wnVar.j4, null, z10, i10, i11, wnVar.F5, wnVar.O8(), j10, z11, j11);
            wnVar.E6();
        }
    }

    @Override // oi.m
    public void k(int i10) {
        ti.s(this.b, i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        ti.v(this.b, i10);
    }

    @Override // oe.k
    public /* synthetic */ void a() {
    }
}
