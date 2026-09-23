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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.ActionBar.f5 {
    public float f;
    public final /* synthetic */ xn h;

    public pn(xn xnVar) {
        this.h = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean b() {
        xn xnVar = this.h;
        if (!xnVar.zc.f) {
            if (xnVar.u3 != null && xnVar.p1 != null) {
                View currentView = xnVar.q1.getCurrentView();
                xn xnVar2 = currentView instanceof zn ? ((zn) currentView).a : xnVar;
                if (!xnVar2.xc.f) {
                    xnVar2.Lb(true);
                    return false;
                }
                int currentPosition = xnVar.p1.a.getCurrentPosition();
                int i10 = xnVar.r1;
                if (currentPosition != i10) {
                    xnVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (xnVar.xc.f) {
                xnVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean f() {
        return this.h.n3;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void k() {
        xn xnVar = this.h;
        xnVar.L7();
        if (xnVar.o3 != null || xnVar.p3 != null) {
            ImageView imageView = xnVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (xnVar.n3) {
            xnVar.I1.getAdapter().U(null, 0, null, false, true);
            xnVar.n3 = false;
            xnVar.j0.H("", true);
        }
        xnVar.j0.setSearchFieldHint(LocaleController.getString(xnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        xnVar.S2.setVisibility(0);
        ImageView imageView2 = xnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        xnVar.o3 = null;
        xnVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        xn xnVar = this.h;
        xnVar.s3 = false;
        xnVar.vc();
        xnVar.Ic();
        ImageView imageView = xnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = xnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (xnVar.n3) {
            xnVar.I1.getAdapter().U(null, 0, null, false, true);
            xnVar.n3 = false;
        }
        xnVar.I1.setReversed(false);
        xnVar.I1.getAdapter().k0 = false;
        xnVar.m7();
        xnVar.o3 = null;
        xnVar.p3 = null;
        xnVar.u3 = null;
        xnVar.j0.setSearchFieldHint(LocaleController.getString(xnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        xnVar.j0.setSearchFieldCaption(null);
        xnVar.yc.a(false, true);
        xnVar.zc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = xnVar.i0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.v0 v0Var = xnVar.h0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.i0;
            if (yVar2 != null) {
                yVar2.f(0);
                xn.J3(xnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = xnVar.e0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            cs csVar = xnVar.d0;
            if (csVar != null) {
                csVar.b(false);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = xnVar.m0;
            if (v0Var2 != null && xnVar.K9) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = xnVar.n0;
            if (yVar4 != null && xnVar.L9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = xnVar.k0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
            }
        } else if (xnVar.Y.l0() && TextUtils.isEmpty(xnVar.Y.getSlowModeTimer()) && ((chat = xnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.v0 v0Var4 = xnVar.h0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = xnVar.i0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = xnVar.e0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            cs csVar2 = xnVar.d0;
            if (csVar2 != null) {
                csVar2.b(true);
            }
            org.telegram.ui.ActionBar.v0 v0Var5 = xnVar.m0;
            if (v0Var5 != null && xnVar.K9) {
                v0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = xnVar.n0;
            if (yVar7 != null && xnVar.L9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var6 = xnVar.k0;
            if (v0Var6 != null) {
                v0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.v0 v0Var7 = xnVar.h0;
            if (v0Var7 != null) {
                v0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = xnVar.n0;
            if (yVar8 != null && xnVar.L9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var8 = xnVar.k0;
            if (v0Var8 != null) {
                v0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var9 = xnVar.m0;
            if (v0Var9 != null && xnVar.K9) {
                v0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = xnVar.i0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = xnVar.e0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            cs csVar3 = xnVar.d0;
            if (csVar3 != null) {
                csVar3.b(false);
            }
        }
        if (xnVar.q1 != null) {
            if (xnVar.p1.a.getCurrentPosition() != 0) {
                xnVar.p1.a.d(0, 0);
                xnVar.s1 = true;
            } else {
                xnVar.q1.h.clear();
            }
        }
        int i12 = xnVar.R3;
        if (i12 == 3 || i12 == 8 || ((xnVar.d4 == 0 && !UserObject.isReplyUser(xnVar.f)) || ((messageObject = xnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            xnVar.j0.setVisibility(8);
        }
        xnVar.o0 = false;
        xnVar.getMediaDataController().clearFoundMessageObjects();
        if (xnVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        gg.o1 o1Var = xnVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        xnVar.Ia();
        xnVar.hc(false);
        xnVar.yc(0, true);
        xnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new on(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xnVar.xc.a(false, true);
        xnVar.Hc();
        xnVar.q3 = null;
        xnVar.Ic();
        xnVar.vc();
        vk vkVar = xnVar.o1;
        if (vkVar != null) {
            vkVar.d.M(new gr(2));
            vkVar.h = 0L;
            xnVar.o1.g(false);
        }
        hk hkVar = xnVar.p1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        xnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
        hk hkVar;
        int i10;
        xn xnVar = this.h;
        xnVar.s3 = true;
        xnVar.vc();
        xnVar.Ic();
        if (((xnVar.d4 != 0 && xnVar.R3 != 3) || UserObject.isReplyUser(xnVar.f)) && !xnVar.cc) {
            xnVar.la(null);
        }
        if (xnVar.W4) {
            xnVar.saveKeyboardPositionBeforeTransition();
            if (!xnVar.Oa) {
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new aj(this, 9), 500L);
            fj fjVar = xnVar.g2;
            if (fjVar != null) {
                fjVar.b(true);
            }
            org.telegram.ui.Components.j40 j40Var = xnVar.i2;
            if (j40Var != null) {
                j40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new on(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = xnVar.o1;
        if (vkVar != null) {
            vkVar.g(!xnVar.Oa && vkVar.a() && xnVar.u3 == null);
        }
        if (xnVar.u3 == null || (hkVar = xnVar.p1) == null) {
            return;
        }
        int currentPosition = hkVar.a.getCurrentPosition();
        int i11 = xnVar.r1;
        if (currentPosition != i11) {
            xnVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void o(gg.q0 q0Var) {
        xn xnVar = this.h;
        vk vkVar = xnVar.o1;
        if (vkVar != null) {
            vkVar.d.M(new gr(2));
            vkVar.h = 0L;
        }
        xnVar.q3 = null;
        xnVar.Ic();
        xnVar.vc();
        xnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void p(ci.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        xn xnVar = this.h;
        boolean z10 = false;
        xnVar.Fc(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : xnVar.t3;
        xnVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(xnVar.t3.startsWith("$") || xnVar.t3.startsWith("#"))) {
            xnVar.u3 = null;
            hk hkVar = xnVar.p1;
            if (hkVar != null) {
                hkVar.b(false);
                xnVar.Hc();
            }
            hk hkVar2 = xnVar.p1;
            if (hkVar2 != null && hkVar2.a.getCurrentPosition() != 0) {
                xnVar.p1.a.d(0, 0);
            }
        } else {
            xnVar.M7();
            if (xnVar.t3.contains("@")) {
                String str = xnVar.t3;
                d6Var = ((org.telegram.ui.ActionBar.n2) xnVar).resourceProvider;
                xnVar.presentFragment(new org.telegram.ui.Components.c40(str, d6Var));
                return;
            }
            if (xnVar.u3 == null) {
                xnVar.u3 = xnVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new on(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = xnVar.o1;
                if (vkVar != null) {
                    if (!xnVar.Oa && vkVar.a() && xnVar.u3 == null) {
                        z10 = true;
                    }
                    vkVar.g(z10);
                }
            }
            xnVar.u3 = xnVar.t3;
            xnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(xnVar.u3);
            xnVar.t1.f.N(true);
            View currentView = xnVar.q1.getCurrentView();
            if (xnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof zn) {
                ((zn) currentView).a.Jc(xnVar.u3);
            }
            xnVar.Hc();
            xnVar.d2.e(true, true);
            xnVar.Lb(true);
            z10 = true;
        }
        hk hkVar3 = xnVar.p1;
        if (hkVar3 != null) {
            hkVar3.b(z10);
        }
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str2 = xnVar.t3;
        long j3 = xnVar.T5;
        long j10 = xnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, xnVar.d4, xnVar.o3, xnVar.p3, xnVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        xn xnVar = this.h;
        le.c cVar = xnVar.zc;
        if (xnVar.u3 == null) {
            xnVar.Lb(false);
        }
        xnVar.L7();
        if (xnVar.n3) {
            xnVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, xnVar.u6, true, true);
        } else if (xnVar.o3 == null && xnVar.p3 == null && xnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            xnVar.T2.callOnClick();
        }
        if (xnVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != cVar.f) {
                if (z10) {
                    xnVar.M7();
                }
                cVar.a(z10, true);
                ci.i1 i1Var = xnVar.q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    xnVar.Lb(true);
                }
                xnVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
