package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.tj;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vh.d b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 h;
    public final /* synthetic */ TLRPC.User n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ zy0(vh.d dVar, jz0 jz0Var, org.telegram.messenger.wp wpVar, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.z2 z2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.b = dVar;
        this.r = jz0Var;
        this.s = wpVar;
        this.e = j10;
        this.n = user;
        this.w = strArr;
        this.c = i10;
        this.d = z2Var;
        this.f = z10;
        this.h = p6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jz0 jz0Var = (jz0) this.r;
                org.telegram.ui.Cells.e6 e6Var = jz0Var.h;
                final org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) this.s;
                String[] strArr = (String[]) this.w;
                final vh.d dVar = this.b;
                if (!dVar.Q) {
                    EditTextBoldCursor textView = e6Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f7 = -jz0Var.D;
                        jz0Var.D = f7;
                        org.telegram.messenger.i0.F3(f7, textView, null);
                        org.telegram.messenger.t2.D.a();
                        break;
                    } else {
                        dVar.setLoading(true);
                        org.telegram.messenger.i0.v1(e6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j10 = this.e;
                        tL_messages_editChatParticipantRank.peer = wpVar.i1(j10);
                        final TLRPC.User user = this.n;
                        tL_messages_editChatParticipantRank.participant = org.telegram.messenger.wp.m1(user);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.c);
                        a3.b bVar = new a3.b(1);
                        final org.telegram.ui.ActionBar.z2 z2Var = this.d;
                        final boolean z10 = this.f;
                        final org.telegram.ui.ActionBar.p6 p6Var = this.h;
                        connectionsManager.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new org.telegram.messenger.k20() { // from class: org.telegram.ui.Components.az0
                            @Override // org.telegram.messenger.k20
                            public final void a(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.f1.s(z2Var2.E, p6Var, tL_error, false);
                                        dVar.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j11 = -j10;
                                long j12 = user.id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                org.telegram.messenger.wp wpVar2 = org.telegram.messenger.wp.this;
                                wpVar2.m5(j11, str, j12);
                                wpVar2.L3(updates, false);
                                z2Var2.dismiss();
                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || T == null) {
                                    return;
                                }
                                wb I = cc.a0(T).I(R.raw.contact_check, org.telegram.messenger.dd.L0(z10 ? 2131744314 : 2131744313, null), tL_messages_editChatParticipantRank2.rank);
                                bb bbVar = I.e;
                                if (bbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) bbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) bbVar.getLayoutParams()).gravity |= 1;
                                }
                                I.j();
                            }
                        });
                        break;
                    }
                }
                break;
            default:
                long[] jArr = (long[]) this.r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.s;
                final Context context = (Context) this.w;
                final vh.d dVar2 = this.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    final long j11 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.c;
                    connectstarrefbot.bot = org.telegram.messenger.wp.r1(i10).n1(starrefprogram.bot_id);
                    connectstarrefbot.peer = org.telegram.messenger.wp.r1(i10).i1(j11);
                    ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.z2 z2Var2 = this.d;
                    final long j12 = this.e;
                    final boolean z11 = this.f;
                    final org.telegram.ui.ActionBar.p6 p6Var2 = this.h;
                    final TLRPC.User user2 = this.n;
                    connectionsManager2.sendRequest(connectstarrefbot, new RequestDelegate() { // from class: xh.o2
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.i0.g3(new tj(vh.d.this, tLObject, i10, j11, z2Var2, starrefprogram, j12, z11, context, p6Var2, user2, tL_error));
                        }
                    });
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zy0(vh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.z2 z2Var, long j10, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user) {
        this.b = dVar;
        this.r = jArr;
        this.c = i10;
        this.s = starrefprogram;
        this.d = z2Var;
        this.e = j10;
        this.f = z10;
        this.w = context;
        this.h = p6Var;
        this.n = user;
    }
}
