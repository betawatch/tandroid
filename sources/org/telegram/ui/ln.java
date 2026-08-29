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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ln extends org.telegram.ui.ActionBar.e5 {
    public float f;
    public final /* synthetic */ tn h;

    public ln(tn tnVar) {
        this.h = tnVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean a() {
        return this.h.q3 == null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean b() {
        tn tnVar = this.h;
        if (!tnVar.wc.f) {
            if (tnVar.q3 != null && tnVar.l1 != null) {
                View currentView = tnVar.m1.getCurrentView();
                tn tnVar2 = currentView instanceof vn ? ((vn) currentView).a : tnVar;
                if (!tnVar2.uc.f) {
                    tnVar2.Lb(true);
                    return false;
                }
                int currentPosition = tnVar.l1.a.getCurrentPosition();
                int i10 = tnVar.n1;
                if (currentPosition != i10) {
                    tnVar.l1.a.d(i10, i10);
                    return false;
                }
            } else if (tnVar.uc.f) {
                tnVar.Lb(false);
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
        tn tnVar = this.h;
        tnVar.L7();
        if (tnVar.k3 != null || tnVar.l3 != null) {
            ImageView imageView = tnVar.P2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (tnVar.j3) {
            tnVar.E1.getAdapter().U(null, 0, null, false, true);
            tnVar.j3 = false;
            tnVar.f0.H("", true);
        }
        tnVar.f0.setSearchFieldHint(LocaleController.getString(tnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        tnVar.O2.setVisibility(0);
        ImageView imageView2 = tnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        tnVar.k3 = null;
        tnVar.l3 = null;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        tn tnVar = this.h;
        tnVar.o3 = false;
        tnVar.vc();
        tnVar.Ic();
        ImageView imageView = tnVar.O2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = tnVar.P2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (tnVar.j3) {
            tnVar.E1.getAdapter().U(null, 0, null, false, true);
            tnVar.j3 = false;
        }
        tnVar.E1.setReversed(false);
        tnVar.E1.getAdapter().g0 = false;
        tnVar.m7();
        tnVar.k3 = null;
        tnVar.l3 = null;
        tnVar.q3 = null;
        tnVar.f0.setSearchFieldHint(LocaleController.getString(tnVar.E9() ? R.string.SavedTagSearchHint : R.string.Search));
        tnVar.f0.setSearchFieldCaption(null);
        tnVar.vc.a(false, true);
        tnVar.wc.a(false, true);
        org.telegram.ui.ActionBar.z zVar = tnVar.e0;
        if (zVar != null && zVar.o != null) {
            org.telegram.ui.ActionBar.w0 w0Var = tnVar.d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = tnVar.e0;
            if (zVar2 != null) {
                zVar2.f(0);
                tn.J3(tnVar);
            }
            org.telegram.ui.ActionBar.z zVar3 = tnVar.a0;
            if (zVar3 != null) {
                zVar3.f(8);
            }
            vr vrVar = tnVar.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.i0;
            if (w0Var2 != null && tnVar.G9) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar4 = tnVar.j0;
            if (zVar4 != null && tnVar.H9) {
                zVar4.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = tnVar.g0;
            if (w0Var3 != null) {
                w0Var3.setVisibility(8);
            }
        } else if (tnVar.U.k0() && TextUtils.isEmpty(tnVar.U.getSlowModeTimer()) && ((chat = tnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.w0 w0Var4 = tnVar.d0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar5 = tnVar.e0;
            if (zVar5 != null) {
                zVar5.f(8);
            }
            org.telegram.ui.ActionBar.z zVar6 = tnVar.a0;
            if (zVar6 != null) {
                zVar6.f(0);
            }
            vr vrVar2 = tnVar.Z;
            if (vrVar2 != null) {
                vrVar2.b(true);
            }
            org.telegram.ui.ActionBar.w0 w0Var5 = tnVar.i0;
            if (w0Var5 != null && tnVar.G9) {
                w0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar7 = tnVar.j0;
            if (zVar7 != null && tnVar.H9) {
                zVar7.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var6 = tnVar.g0;
            if (w0Var6 != null) {
                w0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.w0 w0Var7 = tnVar.d0;
            if (w0Var7 != null) {
                w0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar8 = tnVar.j0;
            if (zVar8 != null && tnVar.H9) {
                zVar8.f(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var8 = tnVar.g0;
            if (w0Var8 != null) {
                w0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var9 = tnVar.i0;
            if (w0Var9 != null && tnVar.G9) {
                w0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar9 = tnVar.e0;
            if (zVar9 != null) {
                zVar9.f(8);
            }
            org.telegram.ui.ActionBar.z zVar10 = tnVar.a0;
            if (zVar10 != null) {
                zVar10.f(8);
            }
            vr vrVar3 = tnVar.Z;
            if (vrVar3 != null) {
                vrVar3.b(false);
            }
        }
        if (tnVar.m1 != null) {
            if (tnVar.l1.a.getCurrentPosition() != 0) {
                tnVar.l1.a.d(0, 0);
                tnVar.o1 = true;
            } else {
                tnVar.m1.h.clear();
            }
        }
        int i12 = tnVar.N3;
        if (i12 == 3 || i12 == 8 || ((tnVar.Z3 == 0 && !UserObject.isReplyUser(tnVar.f)) || ((messageObject = tnVar.T3) != null && messageObject.getRepliesCount() < 10))) {
            tnVar.f0.setVisibility(8);
        }
        tnVar.k0 = false;
        tnVar.getMediaDataController().clearFoundMessageObjects();
        if (tnVar.K3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        rf.z0 z0Var = tnVar.I3;
        if (z0Var != null) {
            z0Var.l();
        }
        tnVar.Ia();
        tnVar.hc(false);
        tnVar.yc(0, true);
        tnVar.Wc(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 0.0f);
        ofFloat.addUpdateListener(new kn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        tnVar.uc.a(false, true);
        tnVar.Hc();
        tnVar.m3 = null;
        tnVar.Ic();
        tnVar.vc();
        pk pkVar = tnVar.k1;
        if (pkVar != null) {
            pkVar.d.M(new zq(2));
            pkVar.h = 0L;
            tnVar.k1.g(false);
        }
        bk bkVar = tnVar.l1;
        if (bkVar != null) {
            bkVar.b(false);
        }
        tnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        bk bkVar;
        int i10;
        tn tnVar = this.h;
        tnVar.o3 = true;
        tnVar.vc();
        tnVar.Ic();
        if (((tnVar.Z3 != 0 && tnVar.N3 != 3) || UserObject.isReplyUser(tnVar.f)) && !tnVar.Zb) {
            tnVar.la(null);
        }
        if (tnVar.S4) {
            tnVar.saveKeyboardPositionBeforeTransition();
            if (!tnVar.Ka) {
                Activity parentActivity = tnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ui(this, 9), 500L);
            zi ziVar = tnVar.c2;
            if (ziVar != null) {
                ziVar.b(true);
            }
            org.telegram.ui.Components.g40 g40Var = tnVar.e2;
            if (g40Var != null) {
                g40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
        ofFloat.addUpdateListener(new kn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        pk pkVar = tnVar.k1;
        if (pkVar != null) {
            pkVar.g(!tnVar.Ka && pkVar.a() && tnVar.q3 == null);
        }
        if (tnVar.q3 == null || (bkVar = tnVar.l1) == null) {
            return;
        }
        int currentPosition = bkVar.a.getCurrentPosition();
        int i11 = tnVar.n1;
        if (currentPosition != i11) {
            tnVar.l1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void o(rf.f0 f0Var) {
        tn tnVar = this.h;
        pk pkVar = tnVar.k1;
        if (pkVar != null) {
            pkVar.d.M(new zq(2));
            pkVar.h = 0L;
        }
        tnVar.m3 = null;
        tnVar.Ic();
        tnVar.vc();
        tnVar.kb(false);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void p(ig.f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var;
        tn tnVar = this.h;
        boolean z10 = false;
        tnVar.Fc(0, 0, -1);
        String obj = fVar != null ? fVar.getText().toString() : tnVar.p3;
        tnVar.p3 = obj;
        if (TextUtils.isEmpty(obj) || !(tnVar.p3.startsWith("$") || tnVar.p3.startsWith("#"))) {
            tnVar.q3 = null;
            bk bkVar = tnVar.l1;
            if (bkVar != null) {
                bkVar.b(false);
                tnVar.Hc();
            }
            bk bkVar2 = tnVar.l1;
            if (bkVar2 != null && bkVar2.a.getCurrentPosition() != 0) {
                tnVar.l1.a.d(0, 0);
            }
        } else {
            tnVar.M7();
            if (tnVar.p3.contains("@")) {
                String str = tnVar.p3;
                c6Var = ((org.telegram.ui.ActionBar.o2) tnVar).resourceProvider;
                tnVar.presentFragment(new org.telegram.ui.Components.z30(str, c6Var));
                return;
            }
            if (tnVar.q3 == null) {
                tnVar.q3 = tnVar.p3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, 1.0f);
                ofFloat.addUpdateListener(new kn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.jr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                pk pkVar = tnVar.k1;
                if (pkVar != null) {
                    if (!tnVar.Ka && pkVar.a() && tnVar.q3 == null) {
                        z10 = true;
                    }
                    pkVar.g(z10);
                }
            }
            tnVar.q3 = tnVar.p3;
            tnVar.R6(true);
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(tnVar.q3);
            tnVar.p1.f.N(true);
            View currentView = tnVar.m1.getCurrentView();
            if (tnVar.K3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof vn) {
                ((vn) currentView).a.Jc(tnVar.q3);
            }
            tnVar.Hc();
            tnVar.Z1.e(true, true);
            tnVar.Lb(true);
            z10 = true;
        }
        bk bkVar3 = tnVar.l1;
        if (bkVar3 != null) {
            bkVar3.b(z10);
        }
        MediaDataController mediaDataController = tnVar.getMediaDataController();
        String str2 = tnVar.p3;
        long j10 = tnVar.P5;
        long j11 = tnVar.H6;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, tnVar.Z3, tnVar.k3, tnVar.l3, tnVar.m3);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        tn tnVar = this.h;
        vd.a aVar = tnVar.wc;
        if (tnVar.q3 == null) {
            tnVar.Lb(false);
        }
        tnVar.L7();
        if (tnVar.j3) {
            tnVar.E1.getAdapter().U("@" + editText.getText().toString(), 0, tnVar.q6, true, true);
        } else if (tnVar.k3 == null && tnVar.l3 == null && tnVar.P2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            tnVar.P2.callOnClick();
        }
        if (tnVar.q3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f) {
                if (z10) {
                    tnVar.M7();
                }
                aVar.a(z10, true);
                nh.g1 g1Var = tnVar.m1;
                if (g1Var != null) {
                    g1Var.D(0);
                }
                if (z10) {
                    tnVar.Lb(true);
                }
                tnVar.hc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final boolean r() {
        return this.h.q3 == null;
    }
}
