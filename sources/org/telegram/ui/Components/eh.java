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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements ol, org.telegram.ui.ActionBar.z1, ne.k, cm0, eh.d, org.telegram.ui.ActionBar.q0, ho, AndroidUtilities.IntColorCallback, f5, ej {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    public /* synthetic */ eh(vi viVar, int i10) {
        this.a = i10;
        this.b = viVar;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        boolean J1;
        switch (this.a) {
            case 12:
                vi viVar = this.b;
                ni niVar = viVar.B0;
                if (niVar != viVar.j0 && niVar != viVar.q0) {
                    if (!niVar.K(i10, z10, i11, viVar.u1(), 0L)) {
                        viVar.D2 = true;
                        viVar.dismiss();
                        break;
                    }
                } else {
                    viVar.J1(i10, z10, 0, viVar.u1(), viVar.Q0);
                    break;
                }
                break;
            default:
                vi viVar2 = this.b;
                of ofVar = viVar2.h0;
                long k10 = ofVar != null ? ofVar.k() : 0L;
                fi fiVar = viVar2.L0;
                viVar2.Q0 = k10;
                fiVar.setEffect(k10);
                ni niVar2 = viVar2.B0;
                if (niVar2 == viVar2.j0 || niVar2 == viVar2.q0) {
                    J1 = viVar2.J1(i10, z10, i11, viVar2.u1(), k10);
                } else {
                    if (!niVar2.K(i10, z10, i11, viVar2.u1(), k10)) {
                        viVar2.dismiss();
                    }
                    J1 = false;
                }
                of ofVar2 = viVar2.h0;
                if (ofVar2 != null) {
                    ofVar2.h(!J1);
                    viVar2.h0 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) view;
        vi viVar = this.b;
        if (viVar.V || (user = oiVar.b) == null) {
            return false;
        }
        viVar.z1(oiVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.ol
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.fo) this.b.f0).b(messageMedia, i10, z10, i11, 0L);
                break;
            case 9:
                ((org.telegram.ui.fo) this.b.f0).b(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.fo) this.b.f0).b(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ho
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, rh.f fVar, ArrayList arrayList, boolean z10, int i10, long j10) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        int i11 = this.a;
        vi viVar = this.b;
        switch (i11) {
            case 10:
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) viVar.f0;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (foVar.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((TLRPC.TL_messageMediaPoll) null, foVar.T5, foVar.n5, foVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                    of2.todo = tL_messageMediaToDo;
                    of2.sendMessageChatArguments = foVar.H8();
                    of2.payStars = j10;
                    of2.monoForumPeer = foVar.S8();
                    of2.suggestionParams = foVar.g5;
                    foVar.getSendMessagesHelper().sendMessage(of2);
                    foVar.B6();
                    break;
                }
                break;
            default:
                org.telegram.ui.fo foVar2 = (org.telegram.ui.fo) viVar.f0;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (foVar2.i7()) {
                    long nextLong = Utilities.random.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        arrayList2 = foVar2.getMediaDataController().getEntities(charSequenceArr, true);
                        str = charSequenceArr[0].toString();
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    SendMessagesHelper.prepareSendingPoll(foVar2.getAccountInstance(), new rh.h(fVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList), foVar2.T5, foVar2.n5, foVar2.X3, null, foVar2.l5, z10, i10, foVar2.H8(), j10, foVar2.S8(), foVar2.g5);
                    foVar2.B6();
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
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        switch (this.a) {
            case 4:
                float f7 = LiteMode.isEnabled(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.g6.w0(z10 ? org.telegram.ui.ActionBar.g6.a7 : org.telegram.ui.ActionBar.g6.i5, c6Var);
                int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var);
                vi viVar = this.b;
                return viVar.p2 ? i0.a.d(0.75f, w03, viVar.q2) : fh.b.m(f7, w02, w03);
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
                vi viVar2 = this.b;
                if (viVar2.p2) {
                    if (AndroidUtilities.computePerceivedBrightness(viVar2.q2) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        vi viVar = this.b;
        viVar.D2 = true;
        viVar.dismiss();
    }

    @Override // org.telegram.ui.Components.ej
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        vi viVar = this.b;
        ej ejVar = viVar.Y;
        if (ejVar != null) {
            ejVar.i(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
        if (m2Var == null || !(m2Var instanceof org.telegram.ui.fo)) {
            ti tiVar = viVar.c2;
            if (tiVar != null) {
                tiVar.s0(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
        if (foVar.i7()) {
            foVar.o8(charSequence, null);
            SendMessagesHelper.prepareSendingAudioDocuments(foVar.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, foVar.T5, foVar.n5, foVar.X3, null, z10, i10, i11, foVar.p5, foVar.H8(), j10, z11, j11);
            foVar.B6();
        }
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void k(int i10) {
        this.b.a1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.messenger.AndroidUtilities.IntColorCallback
    public void run(int i10) {
        vi.u(this.b, i10);
    }

    @Override // ne.k
    public /* synthetic */ void c() {
    }
}
