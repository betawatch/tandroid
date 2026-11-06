package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Components.g90 {
    public boolean V;
    public final /* synthetic */ an W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(an anVar, Context context, long j3, long j10, an anVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, anVar2, f6Var);
        this.W = anVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.g90
    public final boolean a() {
        an anVar = this.W;
        return anVar.S.getVisibility() != 0 || anVar.B3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.g90
    public final void j() {
        this.W.Wc();
    }

    @Override // org.telegram.ui.Components.g90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        an anVar = this.W;
        if (anVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            anVar.Wa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] h12 = org.telegram.messenger.ij.h1(botInlineResult);
        rh rhVar = anVar.cb;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.vt.N0(anVar, null, rhVar, str, str2, str3, str3, h12[0], h12[1], -1, anVar.T9());
    }

    @Override // org.telegram.ui.Components.g90
    public final void l(boolean z9) {
        String M0;
        an anVar = this.W;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            jg.i1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                M0 = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                M0 = (str == null || !str.equals("gif")) ? null : org.telegram.messenger.hd.M0(2131745765, null);
            }
            qjVar.setCaption(M0);
            org.telegram.ui.Components.fe feVar = anVar.Z.P1;
            if (feVar == null) {
                return;
            }
            if (!z9) {
                feVar.e = false;
                return;
            }
            feVar.e = true;
            feVar.b = System.currentTimeMillis();
            feVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.g90
    public final void m() {
        an anVar = this.W;
        if (anVar.p5 && ((getAdapter().R == null || anVar.q5 || anVar.r5) && anVar.h != null && getAdapter().R != null)) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.xa);
                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131745695, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                anVar.showDialog(u1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        anVar.Wc();
    }

    @Override // org.telegram.ui.Components.g90
    public final void n(boolean z9) {
        if (this.V != z9) {
            an anVar = this.W;
            org.telegram.messenger.g0.V3(anVar.r1, !anVar.isInPreviewMode() && z9, false);
            this.V = z9;
        }
    }
}
