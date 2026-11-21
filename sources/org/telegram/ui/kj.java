package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kj extends org.telegram.ui.Components.v90 {
    public boolean W;
    public final /* synthetic */ bn a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(bn bnVar, Context context, long j3, long j10, bn bnVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, j3, j10, bnVar2, h6Var);
        this.a0 = bnVar;
        this.W = true;
    }

    @Override // org.telegram.ui.Components.v90
    public final boolean a() {
        bn bnVar = this.a0;
        return bnVar.T.getVisibility() != 0 || bnVar.C3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.v90
    public final void j() {
        this.a0.ad();
    }

    @Override // org.telegram.ui.Components.v90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        bn bnVar = this.a0;
        if (bnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            bnVar.Za(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] g12 = org.telegram.messenger.fj.g1(botInlineResult);
        rh rhVar = bnVar.gb;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.iu.O0(bnVar, null, rhVar, str, str2, str3, str3, g12[0], g12[1], -1, bnVar.V9());
    }

    @Override // org.telegram.ui.Components.v90
    public final void l(boolean z10) {
        String N0;
        bn bnVar = this.a0;
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            jg.h1 adapter = getAdapter();
            TLRPC.User user = adapter.x0;
            if (user != null) {
                N0 = user.bot_inline_placeholder;
            } else {
                String str = adapter.r0;
                N0 = (str == null || !str.equals("gif")) ? null : org.telegram.messenger.gd.N0(2131745568, null);
            }
            rjVar.setCaption(N0);
            org.telegram.ui.Components.qe qeVar = bnVar.a0.F2;
            if (qeVar == null) {
                return;
            }
            if (!z10) {
                qeVar.e = false;
                return;
            }
            qeVar.e = true;
            qeVar.b = System.currentTimeMillis();
            qeVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.v90
    public final void m() {
        bn bnVar = this.a0;
        if (bnVar.r5 && ((getAdapter().S == null || bnVar.s5 || bnVar.t5) && bnVar.h != null && getAdapter().S != null)) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String N0 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131745498, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                bnVar.showDialog(t1Var);
                g12.edit().putBoolean("secretbot", true).commit();
            }
        }
        bnVar.ad();
    }

    @Override // org.telegram.ui.Components.v90
    public final void n(boolean z10) {
        if (this.W != z10) {
            bn bnVar = this.a0;
            org.telegram.messenger.g0.T3(bnVar.s1, !bnVar.isInPreviewMode() && z10, false);
            this.W = z10;
        }
    }
}
