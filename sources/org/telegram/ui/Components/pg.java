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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements ok, ud.i, org.telegram.ui.ActionBar.a2, rk0, mg.c, org.telegram.ui.ActionBar.r0, hn, AndroidUtilities.IntColorCallback, x4, oi {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi b;

    public /* synthetic */ pg(gi giVar, int i10) {
        this.a = i10;
        this.b = giVar;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        boolean G1;
        switch (this.a) {
            case 12:
                gi giVar = this.b;
                yh yhVar = giVar.u0;
                if (yhVar != giVar.f0 && yhVar != giVar.m0) {
                    if (!yhVar.I(i10, z10, i11, giVar.s1(), 0L)) {
                        giVar.w2 = true;
                        giVar.dismiss();
                        break;
                    }
                } else {
                    giVar.G1(i10, z10, 0, giVar.s1(), giVar.J0);
                    break;
                }
                break;
            default:
                gi giVar2 = this.b;
                ye yeVar = giVar2.d0;
                long k10 = yeVar != null ? yeVar.k() : 0L;
                rh rhVar = giVar2.E0;
                giVar2.J0 = k10;
                rhVar.setEffect(k10);
                yh yhVar2 = giVar2.u0;
                if (yhVar2 == giVar2.f0 || yhVar2 == giVar2.m0) {
                    G1 = giVar2.G1(i10, z10, i11, giVar2.s1(), k10);
                } else {
                    if (!yhVar2.I(i10, z10, i11, giVar2.s1(), k10)) {
                        giVar2.dismiss();
                    }
                    G1 = false;
                }
                ye yeVar2 = giVar2.d0;
                if (yeVar2 != null) {
                    yeVar2.h(!G1);
                    giVar2.d0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) view;
        gi giVar = this.b;
        if (giVar.R || (user = zhVar.b) == null) {
            return false;
        }
        giVar.w1(zhVar.c, user);
        return true;
    }

    @Override // ud.i
    public void c(ud.j jVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.Components.ok
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.rn) this.b.b0).d(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.rn) this.b.b0).d(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.rn) this.b.b0).d(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hn
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, zg.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        gi giVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) giVar.b0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (rnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, rnVar.P5, rnVar.j5, rnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = rnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = rnVar.N8();
                    of2.suggestionParams = rnVar.c5;
                    rnVar.getSendMessagesHelper().sendMessage(of2);
                    rnVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) giVar.b0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (rnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = rnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(rnVar2.getAccountInstance(), new zg.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), rnVar2.P5, rnVar2.j5, rnVar2.T3, null, rnVar2.h5, z10, i10, rnVar2.C8(), j10, rnVar2.N8(), rnVar2.c5);
                    rnVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        gi giVar = this.b;
        giVar.w2 = true;
        giVar.dismiss();
    }

    @Override // org.telegram.ui.Components.oi
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        gi giVar = this.b;
        oi oiVar = giVar.U;
        if (oiVar != null) {
            oiVar.g(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.rn)) {
            ei eiVar = giVar.V1;
            if (eiVar != null) {
                eiVar.P0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
        if (rnVar.f7()) {
            rnVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(rnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, rnVar.P5, rnVar.j5, rnVar.T3, null, z10, i10, i11, rnVar.l5, rnVar.C8(), j10, z11, j11);
            rnVar.y6();
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        this.b.T0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // mg.c
    public int i(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f10 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.a7 : org.telegram.ui.ActionBar.g6.i5, c6Var);
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var);
                gi giVar = this.b;
                return giVar.i2 ? i0.b.d(0.75f, v03, giVar.j2) : ng.c.l(f10, v02, v03);
            case 5:
                if (this.b.i2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 6:
                if (this.b.i2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                gi giVar2 = this.b;
                if (giVar2.i2) {
                    if (AndroidUtilities.computePerceivedBrightness(giVar2.j2) <= 0.72f) {
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
        gi.p(this.b, i10);
    }

    @Override // ud.i
    public /* synthetic */ void b() {
    }
}
