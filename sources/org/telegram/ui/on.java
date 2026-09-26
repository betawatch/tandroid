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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.ActionBar.e5 {
    public float f;
    public final /* synthetic */ wn h;

    public on(wn wnVar) {
        this.h = wnVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean a() {
        return this.h.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        wn wnVar = this.h;
        if (!wnVar.zc.f) {
            if (wnVar.u3 != null && wnVar.p1 != null) {
                View currentView = wnVar.q1.getCurrentView();
                wn wnVar2 = currentView instanceof yn ? ((yn) currentView).a : wnVar;
                if (!wnVar2.xc.f) {
                    wnVar2.Lb(true);
                    return false;
                }
                int currentPosition = wnVar.p1.a.getCurrentPosition();
                int i10 = wnVar.r1;
                if (currentPosition != i10) {
                    wnVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (wnVar.xc.f) {
                wnVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean f() {
        return this.h.n3;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void k() {
        wn wnVar = this.h;
        wnVar.L7();
        if (wnVar.o3 != null || wnVar.p3 != null) {
            ImageView imageView = wnVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (wnVar.n3) {
            wnVar.I1.getAdapter().U(null, 0, null, false, true);
            wnVar.n3 = false;
            wnVar.j0.H("", true);
        }
        wnVar.j0.setSearchFieldHint(LocaleController.getString(wnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        wnVar.S2.setVisibility(0);
        ImageView imageView2 = wnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        wnVar.o3 = null;
        wnVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        wn wnVar = this.h;
        wnVar.s3 = false;
        wnVar.vc();
        wnVar.Ic();
        ImageView imageView = wnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = wnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (wnVar.n3) {
            wnVar.I1.getAdapter().U(null, 0, null, false, true);
            wnVar.n3 = false;
        }
        wnVar.I1.setReversed(false);
        wnVar.I1.getAdapter().k0 = false;
        wnVar.m7();
        wnVar.o3 = null;
        wnVar.p3 = null;
        wnVar.u3 = null;
        wnVar.j0.setSearchFieldHint(LocaleController.getString(wnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        wnVar.j0.setSearchFieldCaption(null);
        wnVar.yc.a(false, true);
        wnVar.zc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = wnVar.i0;
        if (xVar != null && xVar.o != null) {
            org.telegram.ui.ActionBar.u0 u0Var = wnVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = wnVar.i0;
            if (xVar2 != null) {
                xVar2.f(0);
                wn.J3(wnVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = wnVar.e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            bs bsVar = wnVar.d0;
            if (bsVar != null) {
                bsVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.m0;
            if (u0Var2 != null && wnVar.K9) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = wnVar.n0;
            if (xVar4 != null && wnVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = wnVar.k0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(8);
            }
        } else if (wnVar.Y.k0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer()) && ((chat = wnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var4 = wnVar.h0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = wnVar.i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = wnVar.e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            bs bsVar2 = wnVar.d0;
            if (bsVar2 != null) {
                bsVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = wnVar.m0;
            if (u0Var5 != null && wnVar.K9) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = wnVar.n0;
            if (xVar7 != null && wnVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = wnVar.k0;
            if (u0Var6 != null) {
                u0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var7 = wnVar.h0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = wnVar.n0;
            if (xVar8 != null && wnVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var8 = wnVar.k0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = wnVar.m0;
            if (u0Var9 != null && wnVar.K9) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = wnVar.i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = wnVar.e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            bs bsVar3 = wnVar.d0;
            if (bsVar3 != null) {
                bsVar3.b(false);
            }
        }
        if (wnVar.q1 != null) {
            if (wnVar.p1.a.getCurrentPosition() != 0) {
                wnVar.p1.a.d(0, 0);
                wnVar.s1 = true;
            } else {
                wnVar.q1.h.clear();
            }
        }
        int i12 = wnVar.R3;
        if (i12 == 3 || i12 == 8 || ((wnVar.d4 == 0 && !UserObject.isReplyUser(wnVar.f)) || ((messageObject = wnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            wnVar.j0.setVisibility(8);
        }
        wnVar.o0 = false;
        wnVar.getMediaDataController().clearFoundMessageObjects();
        if (wnVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        gg.o1 o1Var = wnVar.M3;
        if (o1Var != null) {
            o1Var.l();
        }
        wnVar.Ia();
        wnVar.hc(false);
        wnVar.yc(0, true);
        wnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new nn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wnVar.xc.a(false, true);
        wnVar.Hc();
        wnVar.q3 = null;
        wnVar.Ic();
        wnVar.vc();
        vk vkVar = wnVar.o1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
            wnVar.o1.g(false);
        }
        hk hkVar = wnVar.p1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        wnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        hk hkVar;
        int i10;
        wn wnVar = this.h;
        wnVar.s3 = true;
        wnVar.vc();
        wnVar.Ic();
        if (((wnVar.d4 != 0 && wnVar.R3 != 3) || UserObject.isReplyUser(wnVar.f)) && !wnVar.cc) {
            wnVar.la(null);
        }
        if (wnVar.W4) {
            wnVar.saveKeyboardPositionBeforeTransition();
            if (!wnVar.Oa) {
                Activity parentActivity = wnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new aj(this, 9), 500L);
            fj fjVar = wnVar.g2;
            if (fjVar != null) {
                fjVar.b(true);
            }
            org.telegram.ui.Components.j40 j40Var = wnVar.i2;
            if (j40Var != null) {
                j40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new nn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = wnVar.o1;
        if (vkVar != null) {
            vkVar.g(!wnVar.Oa && vkVar.a() && wnVar.u3 == null);
        }
        if (wnVar.u3 == null || (hkVar = wnVar.p1) == null) {
            return;
        }
        int currentPosition = hkVar.a.getCurrentPosition();
        int i11 = wnVar.r1;
        if (currentPosition != i11) {
            wnVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void o(gg.q0 q0Var) {
        wn wnVar = this.h;
        vk vkVar = wnVar.o1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
        }
        wnVar.q3 = null;
        wnVar.Ic();
        wnVar.vc();
        wnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(ci.h2 h2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        wn wnVar = this.h;
        boolean z10 = false;
        wnVar.Fc(0, 0, -1);
        String obj = h2Var != null ? h2Var.getText().toString() : wnVar.t3;
        wnVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(wnVar.t3.startsWith("$") || wnVar.t3.startsWith("#"))) {
            wnVar.u3 = null;
            hk hkVar = wnVar.p1;
            if (hkVar != null) {
                hkVar.b(false);
                wnVar.Hc();
            }
            hk hkVar2 = wnVar.p1;
            if (hkVar2 != null && hkVar2.a.getCurrentPosition() != 0) {
                wnVar.p1.a.d(0, 0);
            }
        } else {
            wnVar.M7();
            if (wnVar.t3.contains("@")) {
                String str = wnVar.t3;
                d6Var = ((org.telegram.ui.ActionBar.m2) wnVar).resourceProvider;
                wnVar.presentFragment(new org.telegram.ui.Components.c40(str, d6Var));
                return;
            }
            if (wnVar.u3 == null) {
                wnVar.u3 = wnVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new nn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.rr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = wnVar.o1;
                if (vkVar != null) {
                    if (!wnVar.Oa && vkVar.a() && wnVar.u3 == null) {
                        z10 = true;
                    }
                    vkVar.g(z10);
                }
            }
            wnVar.u3 = wnVar.t3;
            wnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(wnVar.u3);
            wnVar.t1.f.N(true);
            View currentView = wnVar.q1.getCurrentView();
            if (wnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof yn) {
                ((yn) currentView).a.Jc(wnVar.u3);
            }
            wnVar.Hc();
            wnVar.d2.e(true, true);
            wnVar.Lb(true);
            z10 = true;
        }
        hk hkVar3 = wnVar.p1;
        if (hkVar3 != null) {
            hkVar3.b(z10);
        }
        MediaDataController mediaDataController = wnVar.getMediaDataController();
        String str2 = wnVar.t3;
        long j3 = wnVar.T5;
        long j10 = wnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j3, j10, i10, 0, wnVar.d4, wnVar.o3, wnVar.p3, wnVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        wn wnVar = this.h;
        le.c cVar = wnVar.zc;
        if (wnVar.u3 == null) {
            wnVar.Lb(false);
        }
        wnVar.L7();
        if (wnVar.n3) {
            wnVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, wnVar.u6, true, true);
        } else if (wnVar.o3 == null && wnVar.p3 == null && wnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            wnVar.T2.callOnClick();
        }
        if (wnVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != cVar.f) {
                if (z10) {
                    wnVar.M7();
                }
                cVar.a(z10, true);
                ci.i1 i1Var = wnVar.q1;
                if (i1Var != null) {
                    i1Var.D(0);
                }
                if (z10) {
                    wnVar.Lb(true);
                }
                wnVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean r() {
        return this.h.u3 == null;
    }
}
