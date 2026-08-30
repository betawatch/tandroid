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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.ActionBar.h5 {
    public float f;
    public final /* synthetic */ xn h;

    public pn(xn xnVar) {
        this.h = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean a() {
        return this.h.r3 == null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean b() {
        xn xnVar = this.h;
        if (!xnVar.xc.f) {
            if (xnVar.r3 != null && xnVar.m1 != null) {
                View currentView = xnVar.n1.getCurrentView();
                xn xnVar2 = currentView instanceof zn ? ((zn) currentView).a : xnVar;
                if (!xnVar2.vc.f) {
                    xnVar2.Lb(true);
                    return false;
                }
                int currentPosition = xnVar.m1.a.getCurrentPosition();
                int i10 = xnVar.o1;
                if (currentPosition != i10) {
                    xnVar.m1.a.d(i10, i10);
                    return false;
                }
            } else if (xnVar.vc.f) {
                xnVar.Lb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean f() {
        return this.h.k3;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void k() {
        xn xnVar = this.h;
        xnVar.L7();
        if (xnVar.l3 != null || xnVar.m3 != null) {
            ImageView imageView = xnVar.Q2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (xnVar.k3) {
            xnVar.F1.getAdapter().U(null, 0, null, false, true);
            xnVar.k3 = false;
            xnVar.g0.H("", true);
        }
        xnVar.g0.setSearchFieldHint(LocaleController.getString(xnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        xnVar.P2.setVisibility(0);
        ImageView imageView2 = xnVar.Q2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        xnVar.l3 = null;
        xnVar.m3 = null;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        xn xnVar = this.h;
        xnVar.p3 = false;
        xnVar.vc();
        xnVar.Ic();
        ImageView imageView = xnVar.P2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = xnVar.Q2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (xnVar.k3) {
            xnVar.F1.getAdapter().U(null, 0, null, false, true);
            xnVar.k3 = false;
        }
        xnVar.F1.setReversed(false);
        xnVar.F1.getAdapter().h0 = false;
        xnVar.m7();
        xnVar.l3 = null;
        xnVar.m3 = null;
        xnVar.r3 = null;
        xnVar.g0.setSearchFieldHint(LocaleController.getString(xnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        xnVar.g0.setSearchFieldCaption(null);
        xnVar.wc.a(false, true);
        xnVar.xc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = xnVar.f0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.e0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.f0;
            if (yVar2 != null) {
                yVar2.f(0);
                xn.J3(xnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = xnVar.b0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            cs csVar = xnVar.a0;
            if (csVar != null) {
                csVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.j0;
            if (w0Var2 != null && xnVar.H9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = xnVar.k0;
            if (yVar4 != null && xnVar.I9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.h0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (xnVar.V.k0() && TextUtils.isEmpty(xnVar.V.getSlowModeTimer()) && ((chat = xnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = xnVar.e0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = xnVar.f0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = xnVar.b0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            cs csVar2 = xnVar.a0;
            if (csVar2 != null) {
                csVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = xnVar.j0;
            if (w0Var5 != null && xnVar.H9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = xnVar.k0;
            if (yVar7 != null && xnVar.I9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = xnVar.h0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = xnVar.e0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = xnVar.k0;
            if (yVar8 != null && xnVar.I9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = xnVar.h0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = xnVar.j0;
            if (w0Var9 != null && xnVar.H9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = xnVar.f0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = xnVar.b0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            cs csVar3 = xnVar.a0;
            if (csVar3 != null) {
                csVar3.b(false);
            }
        }
        if (xnVar.n1 != null) {
            if (xnVar.m1.a.getCurrentPosition() != 0) {
                xnVar.m1.a.d(0, 0);
                xnVar.p1 = true;
            } else {
                xnVar.n1.h.clear();
            }
        }
        int i12 = xnVar.O3;
        if (i12 == 3 || i12 == 8 || ((xnVar.a4 == 0 && !UserObject.isReplyUser(xnVar.f)) || ((messageObject = xnVar.U3) != null && messageObject.getRepliesCount() < 10))) {
            xnVar.g0.setVisibility(8);
        }
        xnVar.l0 = false;
        xnVar.getMediaDataController().clearFoundMessageObjects();
        if (xnVar.L3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        tf.y0 y0Var = xnVar.J3;
        if (y0Var != null) {
            y0Var.l();
        }
        xnVar.Ia();
        xnVar.hc(false);
        xnVar.yc(0, true);
        xnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new on(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        xnVar.vc.a(false, true);
        xnVar.Hc();
        xnVar.n3 = null;
        xnVar.Ic();
        xnVar.vc();
        vk vkVar = xnVar.l1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
            xnVar.l1.g(false);
        }
        hk hkVar = xnVar.m1;
        if (hkVar != null) {
            hkVar.b(false);
        }
        xnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        hk hkVar;
        int i10;
        xn xnVar = this.h;
        xnVar.p3 = true;
        xnVar.vc();
        xnVar.Ic();
        if (((xnVar.a4 != 0 && xnVar.O3 != 3) || UserObject.isReplyUser(xnVar.f)) && !xnVar.ac) {
            xnVar.la(null);
        }
        if (xnVar.T4) {
            xnVar.saveKeyboardPositionBeforeTransition();
            if (!xnVar.La) {
                Activity parentActivity = xnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new zi(this, 9), 500L);
            ej ejVar = xnVar.d2;
            if (ejVar != null) {
                ejVar.b(true);
            }
            org.telegram.ui.Components.k40 k40Var = xnVar.f2;
            if (k40Var != null) {
                k40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new on(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        vk vkVar = xnVar.l1;
        if (vkVar != null) {
            vkVar.g(!xnVar.La && vkVar.a() && xnVar.r3 == null);
        }
        if (xnVar.r3 == null || (hkVar = xnVar.m1) == null) {
            return;
        }
        int currentPosition = hkVar.a.getCurrentPosition();
        int i11 = xnVar.o1;
        if (currentPosition != i11) {
            xnVar.m1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void o(tf.e0 e0Var) {
        xn xnVar = this.h;
        vk vkVar = xnVar.l1;
        if (vkVar != null) {
            vkVar.d.M(new fr(2));
            vkVar.h = 0L;
        }
        xnVar.n3 = null;
        xnVar.Ic();
        xnVar.vc();
        xnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void p(kg.f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var;
        xn xnVar = this.h;
        boolean z4 = false;
        xnVar.Fc(0, 0, -1);
        String obj = fVar != null ? fVar.getText().toString() : xnVar.q3;
        xnVar.q3 = obj;
        if (TextUtils.isEmpty(obj) || !(xnVar.q3.startsWith("$") || xnVar.q3.startsWith("#"))) {
            xnVar.r3 = null;
            hk hkVar = xnVar.m1;
            if (hkVar != null) {
                hkVar.b(false);
                xnVar.Hc();
            }
            hk hkVar2 = xnVar.m1;
            if (hkVar2 != null && hkVar2.a.getCurrentPosition() != 0) {
                xnVar.m1.a.d(0, 0);
            }
        } else {
            xnVar.M7();
            if (xnVar.q3.contains("@")) {
                String str = xnVar.q3;
                f6Var = ((org.telegram.ui.ActionBar.p2) xnVar).resourceProvider;
                xnVar.presentFragment(new org.telegram.ui.Components.d40(str, f6Var));
                return;
            }
            if (xnVar.r3 == null) {
                xnVar.r3 = xnVar.q3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new on(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                vk vkVar = xnVar.l1;
                if (vkVar != null) {
                    if (!xnVar.La && vkVar.a() && xnVar.r3 == null) {
                        z4 = true;
                    }
                    vkVar.g(z4);
                }
            }
            xnVar.r3 = xnVar.q3;
            xnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(xnVar.r3);
            xnVar.q1.f.N(true);
            View currentView = xnVar.n1.getCurrentView();
            if (xnVar.L3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof zn) {
                ((zn) currentView).a.Jc(xnVar.r3);
            }
            xnVar.Hc();
            xnVar.a2.e(true, true);
            xnVar.Lb(true);
            z4 = true;
        }
        hk hkVar3 = xnVar.m1;
        if (hkVar3 != null) {
            hkVar3.b(z4);
        }
        MediaDataController mediaDataController = xnVar.getMediaDataController();
        String str2 = xnVar.q3;
        long j10 = xnVar.Q5;
        long j11 = xnVar.I6;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, xnVar.a4, xnVar.l3, xnVar.m3, xnVar.n3);
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        xn xnVar = this.h;
        xd.a aVar = xnVar.xc;
        if (xnVar.r3 == null) {
            xnVar.Lb(false);
        }
        xnVar.L7();
        if (xnVar.k3) {
            xnVar.F1.getAdapter().U("@" + editText.getText().toString(), 0, xnVar.r6, true, true);
        } else if (xnVar.l3 == null && xnVar.m3 == null && xnVar.Q2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            xnVar.Q2.callOnClick();
        }
        if (xnVar.r3 != null) {
            boolean z4 = editText.length() == 0;
            if (z4 != aVar.f) {
                if (z4) {
                    xnVar.M7();
                }
                aVar.a(z4, true);
                ek ekVar = xnVar.n1;
                if (ekVar != null) {
                    ekVar.D(0);
                }
                if (z4) {
                    xnVar.Lb(true);
                }
                xnVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final boolean r() {
        return this.h.r3 == null;
    }
}
