package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.y90 {
    public boolean V;
    public final /* synthetic */ un W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(un unVar, Context context, long j10, long j11, un unVar2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, j10, j11, unVar2, p6Var);
        this.W = unVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.y90
    public final boolean a() {
        un unVar = this.W;
        return unVar.S.getVisibility() != 0 || unVar.B3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.y90
    public final void j() {
        this.W.Mc();
    }

    @Override // org.telegram.ui.Components.y90
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        un unVar = this.W;
        if (unVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            unVar.Ma(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] h12 = org.telegram.messenger.jj.h1(botInlineResult);
        ii iiVar = unVar.cb;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.hu.K0(unVar, null, iiVar, str, str2, str3, str3, h12[0], h12[1], -1, unVar.J9());
    }

    @Override // org.telegram.ui.Components.y90
    public final void l(boolean z10) {
        String L0;
        un unVar = this.W;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            zf.x0 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                L0 = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                L0 = (str == null || !str.equals("gif")) ? null : org.telegram.messenger.cd.L0(2131745781, null);
            }
            mkVar.setCaption(L0);
            org.telegram.ui.Components.ae aeVar = unVar.Z.P1;
            if (aeVar == null) {
                return;
            }
            if (!z10) {
                aeVar.e = false;
                return;
            }
            aeVar.e = true;
            aeVar.b = System.currentTimeMillis();
            aeVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.y90
    public final void m() {
        un unVar = this.W;
        if (unVar.p5 && ((getAdapter().R == null || unVar.q5 || unVar.r5) && unVar.h != null && getAdapter().R != null)) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.xa);
                String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131745711, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                unVar.showDialog(x1Var);
                d12.edit().putBoolean("secretbot", true).commit();
            }
        }
        unVar.Mc();
    }

    @Override // org.telegram.ui.Components.y90
    public final void n(boolean z10) {
        if (this.V != z10) {
            un unVar = this.W;
            org.telegram.messenger.i0.U3(unVar.r1, !unVar.isInPreviewMode() && z10, false);
            this.V = z10;
        }
    }
}
