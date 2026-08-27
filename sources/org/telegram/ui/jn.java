package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jn extends org.telegram.ui.ActionBar.e5 {
    public float f;
    public final /* synthetic */ rn h;

    public jn(rn rnVar) {
        this.h = rnVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean a() {
        return this.h.q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        rn rnVar = this.h;
        if (!rnVar.wc.f) {
            if (rnVar.q3 != null && rnVar.l1 != null) {
                View currentView = rnVar.m1.getCurrentView();
                rn rnVar2 = currentView instanceof tn ? ((tn) currentView).a : rnVar;
                if (!rnVar2.uc.f) {
                    rnVar2.Lb(true);
                    return false;
                }
                int currentPosition = rnVar.l1.a.getCurrentPosition();
                int i10 = rnVar.n1;
                if (currentPosition != i10) {
                    rnVar.l1.a.d(i10, i10);
                    return false;
                }
            } else if (rnVar.uc.f) {
                rnVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean f() {
        return this.h.j3;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void k() {
        rn rnVar = this.h;
        rnVar.L7();
        if (rnVar.k3 != null || rnVar.l3 != null) {
            ImageView imageView = rnVar.P2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (rnVar.j3) {
            rnVar.E1.getAdapter().U(null, 0, null, false, true);
            rnVar.j3 = false;
            rnVar.f0.H("", true);
        }
        rnVar.f0.setSearchFieldHint(LocaleController.getString(rnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        rnVar.O2.setVisibility(0);
        ImageView imageView2 = rnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        rnVar.k3 = null;
        rnVar.l3 = null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        rn rnVar = this.h;
        rnVar.o3 = false;
        rnVar.vc();
        rnVar.Ic();
        ImageView imageView = rnVar.O2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = rnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (rnVar.j3) {
            rnVar.E1.getAdapter().U(null, 0, null, false, true);
            rnVar.j3 = false;
        }
        rnVar.E1.setReversed(false);
        rnVar.E1.getAdapter().g0 = false;
        rnVar.m7();
        rnVar.k3 = null;
        rnVar.l3 = null;
        rnVar.q3 = null;
        rnVar.f0.setSearchFieldHint(LocaleController.getString(rnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        rnVar.f0.setSearchFieldCaption(null);
        rnVar.vc.a(false, true);
        rnVar.wc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = rnVar.e0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = rnVar.d0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = rnVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
                rn.J3(rnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = rnVar.a0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            xr xrVar = rnVar.Z;
            if (xrVar != null) {
                xrVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.i0;
            if (v0Var2 != null && rnVar.G9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = rnVar.j0;
            if (yVar4 != null && rnVar.H9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = rnVar.g0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (rnVar.U.k0() && TextUtils.isEmpty(rnVar.U.getSlowModeTimer()) && ((chat = rnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = rnVar.d0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = rnVar.e0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = rnVar.a0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            xr xrVar2 = rnVar.Z;
            if (xrVar2 != null) {
                xrVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = rnVar.i0;
            if (v0Var5 != null && rnVar.G9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = rnVar.j0;
            if (yVar7 != null && rnVar.H9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = rnVar.g0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = rnVar.d0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = rnVar.j0;
            if (yVar8 != null && rnVar.H9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = rnVar.g0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = rnVar.i0;
            if (v0Var9 != null && rnVar.G9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = rnVar.e0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = rnVar.a0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            xr xrVar3 = rnVar.Z;
            if (xrVar3 != null) {
                xrVar3.b(false);
            }
        }
        if (rnVar.m1 != null) {
            if (rnVar.l1.a.getCurrentPosition() != 0) {
                rnVar.l1.a.d(0, 0);
                rnVar.o1 = true;
            } else {
                rnVar.m1.h.clear();
            }
        }
        int i12 = rnVar.N3;
        if (i12 == 3 || i12 == 8 || ((rnVar.Z3 == 0 && !UserObject.isReplyUser(rnVar.f)) || ((messageObject = rnVar.T3) != null && messageObject.getRepliesCount() < 10))) {
            rnVar.f0.setVisibility(8);
        }
        rnVar.k0 = false;
        rnVar.getMediaDataController().clearFoundMessageObjects();
        if (rnVar.K3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        pf.y0 y0Var = rnVar.I3;
        if (y0Var != null) {
            y0Var.l();
        }
        rnVar.Ia();
        rnVar.hc(false);
        rnVar.yc(0, true);
        rnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new in(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        rnVar.uc.a(false, true);
        rnVar.Hc();
        rnVar.m3 = null;
        rnVar.Ic();
        rnVar.vc();
        ok okVar = rnVar.k1;
        if (okVar != null) {
            okVar.d.M(new ar(2));
            okVar.h = 0L;
            rnVar.k1.g(false);
        }
        ak akVar = rnVar.l1;
        if (akVar != null) {
            akVar.b(false);
        }
        rnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        ak akVar;
        int i10;
        rn rnVar = this.h;
        rnVar.o3 = true;
        rnVar.vc();
        rnVar.Ic();
        if (((rnVar.Z3 != 0 && rnVar.N3 != 3) || UserObject.isReplyUser(rnVar.f)) && !rnVar.Zb) {
            rnVar.la(null);
        }
        if (rnVar.S4) {
            rnVar.saveKeyboardPositionBeforeTransition();
            if (!rnVar.Ka) {
                Activity parentActivity = rnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ti(this, 9), 500L);
            yi yiVar = rnVar.c2;
            if (yiVar != null) {
                yiVar.b(true);
            }
            org.telegram.ui.Components.x30 x30Var = rnVar.e2;
            if (x30Var != null) {
                x30Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new in(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ok okVar = rnVar.k1;
        if (okVar != null) {
            okVar.g(!rnVar.Ka && okVar.a() && rnVar.q3 == null);
        }
        if (rnVar.q3 == null || (akVar = rnVar.l1) == null) {
            return;
        }
        int currentPosition = akVar.a.getCurrentPosition();
        int i11 = rnVar.n1;
        if (currentPosition != i11) {
            rnVar.l1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void o(pf.e0 e0Var) {
        rn rnVar = this.h;
        ok okVar = rnVar.k1;
        if (okVar != null) {
            okVar.d.M(new ar(2));
            okVar.h = 0L;
        }
        rnVar.m3 = null;
        rnVar.Ic();
        rnVar.vc();
        rnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(gg.g gVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        rn rnVar = this.h;
        boolean z10 = false;
        rnVar.Fc(0, 0, -1);
        String obj = gVar != null ? gVar.getText().toString() : rnVar.p3;
        rnVar.p3 = obj;
        if (TextUtils.isEmpty(obj) || !(rnVar.p3.startsWith("$") || rnVar.p3.startsWith("#"))) {
            rnVar.q3 = null;
            ak akVar = rnVar.l1;
            if (akVar != null) {
                akVar.b(false);
                rnVar.Hc();
            }
            ak akVar2 = rnVar.l1;
            if (akVar2 != null && akVar2.a.getCurrentPosition() != 0) {
                rnVar.l1.a.d(0, 0);
            }
        } else {
            rnVar.M7();
            if (rnVar.p3.contains("@")) {
                String str = rnVar.p3;
                c6Var = ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider;
                rnVar.presentFragment(new org.telegram.ui.Components.q30(str, c6Var));
                return;
            }
            if (rnVar.q3 == null) {
                rnVar.q3 = rnVar.p3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new in(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.er.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ok okVar = rnVar.k1;
                if (okVar != null) {
                    if (!rnVar.Ka && okVar.a() && rnVar.q3 == null) {
                        z10 = true;
                    }
                    okVar.g(z10);
                }
            }
            rnVar.q3 = rnVar.p3;
            rnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(rnVar.q3);
            rnVar.p1.f.N(true);
            View currentView = rnVar.m1.getCurrentView();
            if (rnVar.K3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof tn) {
                ((tn) currentView).a.Jc(rnVar.q3);
            }
            rnVar.Hc();
            rnVar.Z1.e(true, true);
            rnVar.Lb(true);
            z10 = true;
        }
        ak akVar3 = rnVar.l1;
        if (akVar3 != null) {
            akVar3.b(z10);
        }
        MediaDataController mediaDataController = rnVar.getMediaDataController();
        String str2 = rnVar.p3;
        long j10 = rnVar.P5;
        long j11 = rnVar.H6;
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, rnVar.Z3, rnVar.k3, rnVar.l3, rnVar.m3);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        rn rnVar = this.h;
        ud.a aVar = rnVar.wc;
        if (rnVar.q3 == null) {
            rnVar.Lb(false);
        }
        rnVar.L7();
        if (rnVar.j3) {
            rnVar.E1.getAdapter().U("@" + editText.getText().toString(), 0, rnVar.q6, true, true);
        } else if (rnVar.k3 == null && rnVar.l3 == null && rnVar.P2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            rnVar.P2.callOnClick();
        }
        if (rnVar.q3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f) {
                if (z10) {
                    rnVar.M7();
                }
                aVar.a(z10, true);
                lh.h1 h1Var = rnVar.m1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    rnVar.Lb(true);
                }
                rnVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean r() {
        return this.h.q3 == null;
    }
}
