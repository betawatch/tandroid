package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Components.i90 {
    public boolean W;
    public final /* synthetic */ an a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(an anVar, Context context, long j3, long j10, an anVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, anVar2, e6Var);
        this.a0 = anVar;
        this.W = true;
    }

    @Override // org.telegram.ui.Components.i90
    public final boolean a() {
        an anVar = this.a0;
        return anVar.T.getVisibility() != 0 || anVar.C3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.i90
    public final void j() {
        this.a0.ad();
    }

    @Override // org.telegram.ui.Components.i90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        an anVar = this.a0;
        if (anVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            anVar.Za(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] g12 = org.telegram.messenger.gj.g1(botInlineResult);
        rh rhVar = anVar.fb;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.bu.N0(anVar, null, rhVar, str, str2, str3, str3, g12[0], g12[1], -1, anVar.V9());
    }

    @Override // org.telegram.ui.Components.i90
    public final void l(boolean z10) {
        String M0;
        an anVar = this.a0;
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            jg.h1 adapter = getAdapter();
            TLRPC.User user = adapter.x0;
            if (user != null) {
                M0 = user.bot_inline_placeholder;
            } else {
                String str = adapter.r0;
                M0 = (str == null || !str.equals("gif")) ? null : org.telegram.messenger.hd.M0(2131745764, null);
            }
            qjVar.setCaption(M0);
            org.telegram.ui.Components.ge geVar = anVar.a0.x2;
            if (geVar == null) {
                return;
            }
            if (!z10) {
                geVar.e = false;
                return;
            }
            geVar.e = true;
            geVar.b = System.currentTimeMillis();
            geVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.i90
    public final void m() {
        an anVar = this.a0;
        if (anVar.q5 && ((getAdapter().S == null || anVar.r5 || anVar.s5) && anVar.h != null && getAdapter().S != null)) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131745694, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                anVar.showDialog(t1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        anVar.ad();
    }

    @Override // org.telegram.ui.Components.i90
    public final void n(boolean z10) {
        if (this.W != z10) {
            an anVar = this.a0;
            org.telegram.messenger.g0.U3(anVar.s1, !anVar.isInPreviewMode() && z10, false);
            this.W = z10;
        }
    }
}
