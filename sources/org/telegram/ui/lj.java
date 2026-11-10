package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.Components.g90 {
    public boolean V;
    public final /* synthetic */ cn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(cn cnVar, Context context, long j3, long j10, cn cnVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, j3, j10, cnVar2, h6Var);
        this.W = cnVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.g90
    public final boolean a() {
        cn cnVar = this.W;
        return cnVar.S.getVisibility() != 0 || cnVar.B3;
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
        this.W.Zc();
    }

    @Override // org.telegram.ui.Components.g90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        cn cnVar = this.W;
        if (cnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            cnVar.Ya(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] g12 = org.telegram.messenger.ij.g1(botInlineResult);
        th thVar = cnVar.eb;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.vt.N0(cnVar, null, thVar, str, str2, str3, str3, g12[0], g12[1], -1, cnVar.U9());
    }

    @Override // org.telegram.ui.Components.g90
    public final void l(boolean z9) {
        String M0;
        cn cnVar = this.W;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            jg.i1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                M0 = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                M0 = (str == null || !str.equals("gif")) ? null : org.telegram.messenger.id.M0(2131745764, null);
            }
            sjVar.setCaption(M0);
            org.telegram.ui.Components.ee eeVar = cnVar.Z.P1;
            if (eeVar == null) {
                return;
            }
            if (!z9) {
                eeVar.e = false;
                return;
            }
            eeVar.e = true;
            eeVar.b = System.currentTimeMillis();
            eeVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.g90
    public final void m() {
        cn cnVar = this.W;
        if (cnVar.p5 && ((getAdapter().R == null || cnVar.q5 || cnVar.r5) && cnVar.h != null && getAdapter().R != null)) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.za);
                String M0 = org.telegram.messenger.id.M0(R.string.AppName, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131745694, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                cnVar.showDialog(u1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        cnVar.Zc();
    }

    @Override // org.telegram.ui.Components.g90
    public final void n(boolean z9) {
        if (this.V != z9) {
            cn cnVar = this.W;
            org.telegram.messenger.g0.V3(cnVar.r1, !cnVar.isInPreviewMode() && z9, false);
            this.V = z9;
        }
    }
}
