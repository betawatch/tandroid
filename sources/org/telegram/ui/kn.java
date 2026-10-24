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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.ActionBar.k5 {
    public float r;
    public final /* synthetic */ sn s;

    public kn(sn snVar) {
        this.s = snVar;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final boolean a() {
        return this.s.G3 == null;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final boolean b() {
        sn snVar = this.s;
        if (!snVar.Oc.f) {
            if (snVar.G3 != null && snVar.B1 != null) {
                View currentView = snVar.C1.getCurrentView();
                sn snVar2 = currentView instanceof un ? ((un) currentView).a : snVar;
                if (!snVar2.Mc.f) {
                    snVar2.Rb(true);
                    return false;
                }
                int currentPosition = snVar.B1.a.getCurrentPosition();
                int i10 = snVar.D1;
                if (currentPosition != i10) {
                    snVar.B1.a.d(i10, i10);
                    return false;
                }
            } else if (snVar.Mc.f) {
                snVar.Rb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final boolean f() {
        return this.s.z3;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void k() {
        sn snVar = this.s;
        snVar.O7();
        if (snVar.A3 != null || snVar.B3 != null) {
            ImageView imageView = snVar.f3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (snVar.z3) {
            snVar.U1.getAdapter().U(null, 0, null, false, true);
            snVar.z3 = false;
            snVar.j0.H("", true);
        }
        snVar.j0.setSearchFieldHint(LocaleController.getString(snVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        snVar.e3.setVisibility(0);
        ImageView imageView2 = snVar.f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        snVar.A3 = null;
        snVar.B3 = null;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        sn snVar = this.s;
        snVar.E3 = false;
        snVar.Cc();
        snVar.Pc();
        ImageView imageView = snVar.e3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = snVar.f3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (snVar.z3) {
            snVar.U1.getAdapter().U(null, 0, null, false, true);
            snVar.z3 = false;
        }
        snVar.U1.setReversed(false);
        snVar.U1.getAdapter().k0 = false;
        snVar.p7();
        snVar.A3 = null;
        snVar.B3 = null;
        snVar.G3 = null;
        snVar.j0.setSearchFieldHint(LocaleController.getString(snVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        snVar.j0.setSearchFieldCaption(null);
        snVar.Nc.a(false, true);
        snVar.Oc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = snVar.i0;
        if (xVar != null && xVar.o != null) {
            org.telegram.ui.ActionBar.u0 u0Var = snVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = snVar.i0;
            if (xVar2 != null) {
                xVar2.f(0);
                sn.R3(snVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = snVar.e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            wr wrVar = snVar.d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = snVar.m0;
            if (u0Var2 != null && snVar.W9) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = snVar.n0;
            if (xVar4 != null && snVar.X9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = snVar.k0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(8);
            }
        } else if (snVar.Y.h0() && TextUtils.isEmpty(snVar.Y.getSlowModeTimer()) && ((chat = snVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var4 = snVar.h0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = snVar.i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = snVar.e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            wr wrVar2 = snVar.d0;
            if (wrVar2 != null) {
                wrVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = snVar.m0;
            if (u0Var5 != null && snVar.W9) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = snVar.n0;
            if (xVar7 != null && snVar.X9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = snVar.k0;
            if (u0Var6 != null) {
                u0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var7 = snVar.h0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = snVar.n0;
            if (xVar8 != null && snVar.X9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var8 = snVar.k0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = snVar.m0;
            if (u0Var9 != null && snVar.W9) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = snVar.i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = snVar.e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            wr wrVar3 = snVar.d0;
            if (wrVar3 != null) {
                wrVar3.b(false);
            }
        }
        if (snVar.C1 != null) {
            if (snVar.B1.a.getCurrentPosition() != 0) {
                snVar.B1.a.d(0, 0);
                snVar.E1 = true;
            } else {
                snVar.C1.h.clear();
            }
        }
        int i12 = snVar.d4;
        if (i12 == 3 || i12 == 8 || ((snVar.p4 == 0 && !UserObject.isReplyUser(snVar.f)) || ((messageObject = snVar.j4) != null && messageObject.getRepliesCount() < 10))) {
            snVar.j0.setVisibility(8);
        }
        snVar.o0 = false;
        snVar.getMediaDataController().clearFoundMessageObjects();
        if (snVar.a4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        hg.n1 n1Var = snVar.Y3;
        if (n1Var != null) {
            n1Var.l();
        }
        snVar.Ma();
        snVar.oc(false);
        snVar.Fc(0, true);
        snVar.dd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 0.0f);
        ofFloat.addUpdateListener(new jn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        snVar.Mc.a(false, true);
        snVar.Oc();
        snVar.C3 = null;
        snVar.Pc();
        snVar.Cc();
        rk rkVar = snVar.A1;
        if (rkVar != null) {
            rkVar.d.M(new zq(2));
            rkVar.h = 0L;
            snVar.A1.g(false);
        }
        dk dkVar = snVar.B1;
        if (dkVar != null) {
            dkVar.b(false);
        }
        snVar.qb(false);
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void n() {
        dk dkVar;
        int i10;
        sn snVar = this.s;
        snVar.E3 = true;
        snVar.Cc();
        snVar.Pc();
        if (((snVar.p4 != 0 && snVar.d4 != 3) || UserObject.isReplyUser(snVar.f)) && !snVar.qc) {
            snVar.qa(null);
        }
        if (snVar.i5) {
            snVar.saveKeyboardPositionBeforeTransition();
            if (!snVar.bb) {
                Activity parentActivity = snVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ti(this, 10), 500L);
            aj ajVar = snVar.s2;
            if (ajVar != null) {
                ajVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var = snVar.u2;
            if (r40Var != null) {
                r40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 1.0f);
        ofFloat.addUpdateListener(new jn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        rk rkVar = snVar.A1;
        if (rkVar != null) {
            rkVar.g(!snVar.bb && rkVar.a() && snVar.G3 == null);
        }
        if (snVar.G3 == null || (dkVar = snVar.B1) == null) {
            return;
        }
        int currentPosition = dkVar.a.getCurrentPosition();
        int i11 = snVar.D1;
        if (currentPosition != i11) {
            snVar.B1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void o(hg.o0 o0Var) {
        sn snVar = this.s;
        rk rkVar = snVar.A1;
        if (rkVar != null) {
            rkVar.d.M(new zq(2));
            rkVar.h = 0L;
        }
        snVar.C3 = null;
        snVar.Pc();
        snVar.Cc();
        snVar.qb(false);
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void p(ei.e2 e2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var;
        sn snVar = this.s;
        boolean z10 = false;
        snVar.Mc(0, 0, -1);
        String obj = e2Var != null ? e2Var.getText().toString() : snVar.F3;
        snVar.F3 = obj;
        if (TextUtils.isEmpty(obj) || !(snVar.F3.startsWith("$") || snVar.F3.startsWith("#"))) {
            snVar.G3 = null;
            dk dkVar = snVar.B1;
            if (dkVar != null) {
                dkVar.b(false);
                snVar.Oc();
            }
            dk dkVar2 = snVar.B1;
            if (dkVar2 != null && dkVar2.a.getCurrentPosition() != 0) {
                snVar.B1.a.d(0, 0);
            }
        } else {
            snVar.P7();
            if (snVar.F3.contains("@")) {
                String str = snVar.F3;
                g6Var = ((org.telegram.ui.ActionBar.o2) snVar).resourceProvider;
                snVar.presentFragment(new org.telegram.ui.Components.k40(str, g6Var));
                return;
            }
            if (snVar.G3 == null) {
                snVar.G3 = snVar.F3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 1.0f);
                ofFloat.addUpdateListener(new jn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                rk rkVar = snVar.A1;
                if (rkVar != null) {
                    if (!snVar.bb && rkVar.a() && snVar.G3 == null) {
                        z10 = true;
                    }
                    rkVar.g(z10);
                }
            }
            snVar.G3 = snVar.F3;
            snVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(snVar.G3);
            snVar.F1.f.N(true);
            View currentView = snVar.C1.getCurrentView();
            if (snVar.a4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof un) {
                ((un) currentView).a.Qc(snVar.G3);
            }
            snVar.Oc();
            snVar.p2.e(true, true);
            snVar.Rb(true);
            z10 = true;
        }
        dk dkVar3 = snVar.B1;
        if (dkVar3 != null) {
            dkVar3.b(z10);
        }
        MediaDataController mediaDataController = snVar.getMediaDataController();
        String str2 = snVar.F3;
        long j10 = snVar.f6;
        long j11 = snVar.X6;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, snVar.p4, snVar.A3, snVar.B3, snVar.C3);
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        sn snVar = this.s;
        ne.b bVar = snVar.Oc;
        if (snVar.G3 == null) {
            snVar.Rb(false);
        }
        snVar.O7();
        if (snVar.z3) {
            snVar.U1.getAdapter().U("@" + editText.getText().toString(), 0, snVar.G6, true, true);
        } else if (snVar.A3 == null && snVar.B3 == null && snVar.f3 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            snVar.f3.callOnClick();
        }
        if (snVar.G3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    snVar.P7();
                }
                bVar.a(z10, true);
                ei.h1 h1Var = snVar.C1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    snVar.Rb(true);
                }
                snVar.oc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final boolean u() {
        return this.s.G3 == null;
    }
}
