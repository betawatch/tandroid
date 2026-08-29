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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements wk, vd.j, org.telegram.ui.ActionBar.b2, bl0, og.c, org.telegram.ui.ActionBar.s0, nn, AndroidUtilities.IntColorCallback, b5, vi {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;

    public /* synthetic */ wg(ni niVar, int i10) {
        this.a = i10;
        this.b = niVar;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        boolean G1;
        switch (this.a) {
            case 12:
                ni niVar = this.b;
                fi fiVar = niVar.u0;
                if (fiVar != niVar.f0 && fiVar != niVar.m0) {
                    if (!fiVar.H(i10, z10, i11, niVar.s1(), 0L)) {
                        niVar.w2 = true;
                        niVar.dismiss();
                        break;
                    }
                } else {
                    niVar.G1(i10, z10, 0, niVar.s1(), niVar.J0);
                    break;
                }
                break;
            default:
                ni niVar2 = this.b;
                ff ffVar = niVar2.d0;
                long k9 = ffVar != null ? ffVar.k() : 0L;
                yh yhVar = niVar2.E0;
                niVar2.J0 = k9;
                yhVar.setEffect(k9);
                fi fiVar2 = niVar2.u0;
                if (fiVar2 == niVar2.f0 || fiVar2 == niVar2.m0) {
                    G1 = niVar2.G1(i10, z10, i11, niVar2.s1(), k9);
                } else {
                    if (!fiVar2.H(i10, z10, i11, niVar2.s1(), k9)) {
                        niVar2.dismiss();
                    }
                    G1 = false;
                }
                ff ffVar2 = niVar2.d0;
                if (ffVar2 != null) {
                    ffVar2.h(!G1);
                    niVar2.d0 = null;
                    break;
                }
                break;
        }
    }

    @Override // vd.j
    public void b(vd.k kVar) {
        this.b.u1();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof gi)) {
            return false;
        }
        gi giVar = (gi) view;
        ni niVar = this.b;
        if (niVar.R || (user = giVar.b) == null) {
            return false;
        }
        niVar.w1(giVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.tn) this.b.b0).d(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.tn) this.b.b0).d(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.tn) this.b.b0).d(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nn
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, bh.i iVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        ni niVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) niVar.b0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (tnVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, tnVar.P5, tnVar.j5, tnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = tnVar.C8();
                    of2.payStars = j10;
                    of2.monoForumPeer = tnVar.N8();
                    of2.suggestionParams = tnVar.c5;
                    tnVar.getSendMessagesHelper().sendMessage(of2);
                    tnVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.tn tnVar2 = (org.telegram.ui.tn) niVar.b0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (tnVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = tnVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(tnVar2.getAccountInstance(), new bh.k(iVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), tnVar2.P5, tnVar2.j5, tnVar2.T3, null, tnVar2.h5, z10, i10, tnVar2.C8(), j10, tnVar2.N8(), tnVar2.c5);
                    tnVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // og.c
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f9 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.a7 : org.telegram.ui.ActionBar.g6.i5, c6Var);
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var);
                ni niVar = this.b;
                return niVar.i2 ? i0.a.d(0.75f, v03, niVar.j2) : pg.a.l(f9, v02, v03);
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
                ni niVar2 = this.b;
                if (niVar2.i2) {
                    if (AndroidUtilities.computePerceivedBrightness(niVar2.j2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ni niVar = this.b;
        niVar.w2 = true;
        niVar.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
        this.b.T0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.Components.vi
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        ni niVar = this.b;
        vi viVar = niVar.U;
        if (viVar != null) {
            viVar.j(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if (o2Var == null || !(o2Var instanceof org.telegram.ui.tn)) {
            li liVar = niVar.V1;
            if (liVar != null) {
                liVar.X1(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
        if (tnVar.f7()) {
            tnVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(tnVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, tnVar.P5, tnVar.j5, tnVar.T3, null, z10, i10, i11, tnVar.l5, tnVar.C8(), j10, z11, j11);
            tnVar.y6();
        }
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        ni.o(this.b, i10);
    }

    @Override // vd.j
    public /* synthetic */ void a() {
    }
}
