package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.Components.c90 {
    public boolean W;
    public final /* synthetic */ wm a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(wm wmVar, Context context, long j10, long j11, wm wmVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j10, j11, wmVar2, e6Var);
        this.a0 = wmVar;
        this.W = true;
    }

    @Override // org.telegram.ui.Components.c90
    public final boolean a() {
        wm wmVar = this.a0;
        return wmVar.T.getVisibility() != 0 || wmVar.C3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.c90
    public final void j() {
        this.a0.Wc();
    }

    @Override // org.telegram.ui.Components.c90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        wm wmVar = this.a0;
        if (wmVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            wmVar.Wa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] h12 = org.telegram.messenger.zi.h1(botInlineResult);
        nh nhVar = wmVar.db;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.ut.K0(wmVar, null, nhVar, str, str2, str3, str3, h12[0], h12[1], -1, wmVar.T9());
    }

    @Override // org.telegram.ui.Components.c90
    public final void l(boolean z10) {
        String M0;
        wm wmVar = this.a0;
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            kg.e1 adapter = getAdapter();
            TLRPC.User user = adapter.x0;
            if (user != null) {
                M0 = user.bot_inline_placeholder;
            } else {
                String str = adapter.r0;
                M0 = (str == null || !str.equals("gif")) ? null : org.telegram.messenger.bd.M0(2131745774, null);
            }
            mjVar.setCaption(M0);
            org.telegram.ui.Components.de deVar = wmVar.a0.Q1;
            if (deVar == null) {
                return;
            }
            if (!z10) {
                deVar.e = false;
                return;
            }
            deVar.e = true;
            deVar.b = System.currentTimeMillis();
            deVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.c90
    public final void m() {
        wm wmVar = this.a0;
        if (wmVar.q5 && ((getAdapter().S == null || wmVar.r5 || wmVar.s5) && wmVar.h != null && getAdapter().S != null)) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.ya);
                String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131745704, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                wmVar.showDialog(s1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        wmVar.Wc();
    }

    @Override // org.telegram.ui.Components.c90
    public final void n(boolean z10) {
        if (this.W != z10) {
            wm wmVar = this.a0;
            org.telegram.messenger.g0.V3(wmVar.s1, !wmVar.isInPreviewMode() && z10, false);
            this.W = z10;
        }
    }
}
