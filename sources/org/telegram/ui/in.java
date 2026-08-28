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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class in extends org.telegram.ui.ActionBar.e5 {
    public float f;
    public final /* synthetic */ qn h;

    public in(qn qnVar) {
        this.h = qnVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean a() {
        return this.h.q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        qn qnVar = this.h;
        if (!qnVar.wc.f) {
            if (qnVar.q3 != null && qnVar.l1 != null) {
                View currentView = qnVar.m1.getCurrentView();
                qn qnVar2 = currentView instanceof sn ? ((sn) currentView).a : qnVar;
                if (!qnVar2.uc.f) {
                    qnVar2.Lb(true);
                    return false;
                }
                int currentPosition = qnVar.l1.a.getCurrentPosition();
                int i9 = qnVar.n1;
                if (currentPosition != i9) {
                    qnVar.l1.a.d(i9, i9);
                    return false;
                }
            } else if (qnVar.uc.f) {
                qnVar.Lb(false);
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
        qn qnVar = this.h;
        qnVar.L7();
        if (qnVar.k3 != null || qnVar.l3 != null) {
            ImageView imageView = qnVar.P2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (qnVar.j3) {
            qnVar.E1.getAdapter().U(null, 0, null, false, true);
            qnVar.j3 = false;
            qnVar.f0.H("", true);
        }
        qnVar.f0.setSearchFieldHint(LocaleController.getString(qnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        qnVar.O2.setVisibility(0);
        ImageView imageView2 = qnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        qnVar.k3 = null;
        qnVar.l3 = null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        TLRPC.Chat chat;
        int i9;
        int i10;
        MessageObject messageObject;
        qn qnVar = this.h;
        qnVar.o3 = false;
        qnVar.vc();
        qnVar.Ic();
        ImageView imageView = qnVar.O2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = qnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (qnVar.j3) {
            qnVar.E1.getAdapter().U(null, 0, null, false, true);
            qnVar.j3 = false;
        }
        qnVar.E1.setReversed(false);
        qnVar.E1.getAdapter().g0 = false;
        qnVar.m7();
        qnVar.k3 = null;
        qnVar.l3 = null;
        qnVar.q3 = null;
        qnVar.f0.setSearchFieldHint(LocaleController.getString(qnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        qnVar.f0.setSearchFieldCaption(null);
        qnVar.vc.a(false, true);
        qnVar.wc.a(false, true);
        org.telegram.ui.ActionBar.y yVar = qnVar.e0;
        if (yVar != null && yVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = qnVar.d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = qnVar.e0;
            if (yVar2 != null) {
                yVar2.f(0);
                qn.J3(qnVar);
            }
            org.telegram.ui.ActionBar.y yVar3 = qnVar.a0;
            if (yVar3 != null) {
                yVar3.f(8);
            }
            wr wrVar = qnVar.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.i0;
            if (w0Var2 != null && qnVar.G9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar4 = qnVar.j0;
            if (yVar4 != null && qnVar.H9) {
                yVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = qnVar.g0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (qnVar.U.j0() && TextUtils.isEmpty(qnVar.U.getSlowModeTimer()) && ((chat = qnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = qnVar.d0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar5 = qnVar.e0;
            if (yVar5 != null) {
                yVar5.f(8);
            }
            org.telegram.ui.ActionBar.y yVar6 = qnVar.a0;
            if (yVar6 != null) {
                yVar6.f(0);
            }
            wr wrVar2 = qnVar.Z;
            if (wrVar2 != null) {
                wrVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = qnVar.i0;
            if (w0Var5 != null && qnVar.G9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar7 = qnVar.j0;
            if (yVar7 != null && qnVar.H9) {
                yVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = qnVar.g0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = qnVar.d0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar8 = qnVar.j0;
            if (yVar8 != null && qnVar.H9) {
                yVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = qnVar.g0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = qnVar.i0;
            if (w0Var9 != null && qnVar.G9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar9 = qnVar.e0;
            if (yVar9 != null) {
                yVar9.f(8);
            }
            org.telegram.ui.ActionBar.y yVar10 = qnVar.a0;
            if (yVar10 != null) {
                yVar10.f(8);
            }
            wr wrVar3 = qnVar.Z;
            if (wrVar3 != null) {
                wrVar3.b(false);
            }
        }
        if (qnVar.m1 != null) {
            if (qnVar.l1.a.getCurrentPosition() != 0) {
                qnVar.l1.a.d(0, 0);
                qnVar.o1 = true;
            } else {
                qnVar.m1.h.clear();
            }
        }
        int i11 = qnVar.N3;
        if (i11 == 3 || i11 == 8 || ((qnVar.Z3 == 0 && !UserObject.isReplyUser(qnVar.f)) || ((messageObject = qnVar.T3) != null && messageObject.getRepliesCount() < 10))) {
            qnVar.f0.setVisibility(8);
        }
        qnVar.k0 = false;
        qnVar.getMediaDataController().clearFoundMessageObjects();
        if (qnVar.K3 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults(3);
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i9).clearSearchResults();
        }
        of.j1 j1Var = qnVar.I3;
        if (j1Var != null) {
            j1Var.l();
        }
        qnVar.Ia();
        qnVar.hc(false);
        qnVar.yc(0, true);
        qnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new hn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        qnVar.uc.a(false, true);
        qnVar.Hc();
        qnVar.m3 = null;
        qnVar.Ic();
        qnVar.vc();
        mk mkVar = qnVar.k1;
        if (mkVar != null) {
            mkVar.d.M(new yq(2));
            mkVar.h = 0L;
            qnVar.k1.g(false);
        }
        yj yjVar = qnVar.l1;
        if (yjVar != null) {
            yjVar.b(false);
        }
        qnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        yj yjVar;
        int i9;
        qn qnVar = this.h;
        qnVar.o3 = true;
        qnVar.vc();
        qnVar.Ic();
        if (((qnVar.Z3 != 0 && qnVar.N3 != 3) || UserObject.isReplyUser(qnVar.f)) && !qnVar.Zb) {
            qnVar.la(null);
        }
        if (qnVar.S4) {
            qnVar.saveKeyboardPositionBeforeTransition();
            if (!qnVar.Ka) {
                Activity parentActivity = qnVar.getParentActivity();
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i9);
            }
            AndroidUtilities.runOnUIThread(new ri(this, 9), 500L);
            wi wiVar = qnVar.c2;
            if (wiVar != null) {
                wiVar.b(true);
            }
            org.telegram.ui.Components.s30 s30Var = qnVar.e2;
            if (s30Var != null) {
                s30Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new hn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        mk mkVar = qnVar.k1;
        if (mkVar != null) {
            mkVar.g(!qnVar.Ka && mkVar.a() && qnVar.q3 == null);
        }
        if (qnVar.q3 == null || (yjVar = qnVar.l1) == null) {
            return;
        }
        int currentPosition = yjVar.a.getCurrentPosition();
        int i10 = qnVar.n1;
        if (currentPosition != i10) {
            qnVar.l1.a.d(i10, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void o(of.m0 m0Var) {
        qn qnVar = this.h;
        mk mkVar = qnVar.k1;
        if (mkVar != null) {
            mkVar.d.M(new yq(2));
            mkVar.h = 0L;
        }
        qnVar.m3 = null;
        qnVar.Ic();
        qnVar.vc();
        qnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(fg.g gVar) {
        int i9;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.b6 b6Var;
        qn qnVar = this.h;
        boolean z10 = false;
        qnVar.Fc(0, 0, -1);
        String obj = gVar != null ? gVar.getText().toString() : qnVar.p3;
        qnVar.p3 = obj;
        if (TextUtils.isEmpty(obj) || !(qnVar.p3.startsWith("$") || qnVar.p3.startsWith("#"))) {
            qnVar.q3 = null;
            yj yjVar = qnVar.l1;
            if (yjVar != null) {
                yjVar.b(false);
                qnVar.Hc();
            }
            yj yjVar2 = qnVar.l1;
            if (yjVar2 != null && yjVar2.a.getCurrentPosition() != 0) {
                qnVar.l1.a.d(0, 0);
            }
        } else {
            qnVar.M7();
            if (qnVar.p3.contains("@")) {
                String str = qnVar.p3;
                b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                qnVar.presentFragment(new org.telegram.ui.Components.l30(str, b6Var));
                return;
            }
            if (qnVar.q3 == null) {
                qnVar.q3 = qnVar.p3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new hn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                mk mkVar = qnVar.k1;
                if (mkVar != null) {
                    if (!qnVar.Ka && mkVar.a() && qnVar.q3 == null) {
                        z10 = true;
                    }
                    mkVar.g(z10);
                }
            }
            qnVar.q3 = qnVar.p3;
            qnVar.R6(true);
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i10).putToHistory(qnVar.q3);
            qnVar.p1.f.N(true);
            View currentView = qnVar.m1.getCurrentView();
            if (qnVar.K3 == 3) {
                i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults(3);
            } else {
                i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i11).clearSearchResults();
            }
            if (currentView instanceof sn) {
                ((sn) currentView).a.Jc(qnVar.q3);
            }
            qnVar.Hc();
            qnVar.Z1.e(true, true);
            qnVar.Lb(true);
            z10 = true;
        }
        yj yjVar3 = qnVar.l1;
        if (yjVar3 != null) {
            yjVar3.b(z10);
        }
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str2 = qnVar.p3;
        long j10 = qnVar.P5;
        long j11 = qnVar.H6;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i9, 0, qnVar.Z3, qnVar.k3, qnVar.l3, qnVar.m3);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        qn qnVar = this.h;
        td.a aVar = qnVar.wc;
        if (qnVar.q3 == null) {
            qnVar.Lb(false);
        }
        qnVar.L7();
        if (qnVar.j3) {
            qnVar.E1.getAdapter().U("@" + editText.getText().toString(), 0, qnVar.q6, true, true);
        } else if (qnVar.k3 == null && qnVar.l3 == null && qnVar.P2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            qnVar.P2.callOnClick();
        }
        if (qnVar.q3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f) {
                if (z10) {
                    qnVar.M7();
                }
                aVar.a(z10, true);
                kh.j1 j1Var = qnVar.m1;
                if (j1Var != null) {
                    j1Var.D(0);
                }
                if (z10) {
                    qnVar.Lb(true);
                }
                qnVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean r() {
        return this.h.q3 == null;
    }
}
