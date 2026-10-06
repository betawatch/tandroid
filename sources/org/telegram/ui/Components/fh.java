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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements el, le.k, org.telegram.ui.ActionBar.a2, ol0, li.m, dh.d, li.l, org.telegram.ui.ActionBar.r0, AndroidUtilities.IntColorCallback, wn, d5, gj {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;

    public /* synthetic */ fh(xi xiVar, int i10) {
        this.a = i10;
        this.b = xiVar;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        boolean F1;
        switch (this.a) {
            case 14:
                xi xiVar = this.b;
                pi piVar = xiVar.y0;
                if (piVar != xiVar.j0 && piVar != xiVar.q0) {
                    if (!piVar.G(i10, z10, i11, xiVar.r1(), 0L)) {
                        xiVar.A2 = true;
                        xiVar.dismiss();
                        break;
                    }
                } else {
                    xiVar.F1(i10, z10, 0, xiVar.r1(), xiVar.N0);
                    break;
                }
                break;
            default:
                xi xiVar2 = this.b;
                of ofVar = xiVar2.h0;
                long k10 = ofVar != null ? ofVar.k() : 0L;
                ei eiVar = xiVar2.I0;
                xiVar2.N0 = k10;
                eiVar.setEffect(k10);
                pi piVar2 = xiVar2.y0;
                if (piVar2 == xiVar2.j0 || piVar2 == xiVar2.q0) {
                    F1 = xiVar2.F1(i10, z10, i11, xiVar2.r1(), k10);
                } else {
                    if (!piVar2.G(i10, z10, i11, xiVar2.r1(), k10)) {
                        xiVar2.dismiss();
                    }
                    F1 = false;
                }
                of ofVar2 = xiVar2.h0;
                if (ofVar2 != null) {
                    ofVar2.h(!F1);
                    xiVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.el
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.yn) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 11:
                ((org.telegram.ui.yn) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
            default:
                ((org.telegram.ui.yn) this.b.f0).b(messageMedia, i10, z10, i11, j3);
                break;
        }
    }

    @Override // le.k
    public void c(le.l lVar) {
        this.b.t1();
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) view;
        xi xiVar = this.b;
        if (xiVar.V || (user = qiVar.b) == null) {
            return false;
        }
        xiVar.v1(qiVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.wn
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, qh.f fVar, ArrayList arrayList, boolean z10, int i10, long j3) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        xi xiVar = this.b;
        switch (i11) {
            case 13:
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) xiVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (ynVar.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, ynVar.R5, ynVar.l5, ynVar.V3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = ynVar.D8();
                    of2.payStars = j3;
                    of2.monoForumPeer = ynVar.O8();
                    of2.suggestionParams = ynVar.e5;
                    ynVar.getSendMessagesHelper().sendMessage(of2);
                    ynVar.y6();
                    break;
                }
                break;
            default:
                org.telegram.ui.yn ynVar2 = (org.telegram.ui.yn) xiVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (ynVar2.f7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = ynVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(ynVar2.getAccountInstance(), new qh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), ynVar2.R5, ynVar2.l5, ynVar2.V3, null, ynVar2.j5, z10, i10, ynVar2.D8(), j3, ynVar2.O8(), ynVar2.e5);
                    ynVar2.y6();
                    break;
                }
                break;
        }
    }

    @Override // li.m
    public int f() {
        xi xiVar = this.b;
        xiVar.getClass();
        return xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xi xiVar = this.b;
        xiVar.A2 = true;
        xiVar.dismiss();
    }

    @Override // dh.d
    public int h(org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int v02 = org.telegram.ui.ActionBar.i6.v0(z10 ? org.telegram.ui.ActionBar.i6.a7 : org.telegram.ui.ActionBar.i6.i5, d6Var);
                int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var);
                xi xiVar = this.b;
                return xiVar.m2 ? i0.a.d(0.75f, v03, xiVar.n2) : eh.b.n(f7, v02, v03);
            case 6:
                if (this.b.m2) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 7:
                if (this.b.m2) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                xi xiVar2 = this.b;
                if (xiVar2.m2) {
                    if (AndroidUtilities.computePerceivedBrightness(xiVar2.n2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.gj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        xi xiVar = this.b;
        gj gjVar = xiVar.Y;
        if (gjVar != null) {
            gjVar.j(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
        if (n2Var == null || !(n2Var instanceof org.telegram.ui.yn)) {
            vi viVar = xiVar.Z1;
            if (viVar != null) {
                viVar.W1(arrayList, charSequence, z10, i10, i11, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
        if (ynVar.f7()) {
            ynVar.l8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(ynVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, ynVar.R5, ynVar.l5, ynVar.V3, null, z10, i10, i11, ynVar.n5, ynVar.D8(), j3, z11, j10);
            ynVar.y6();
        }
    }

    @Override // li.l
    public void k(int i10) {
        xi.t(this.b, i10);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        this.b.X0.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        xi.x(this.b, i10);
    }

    @Override // le.k
    public /* synthetic */ void a() {
    }
}
