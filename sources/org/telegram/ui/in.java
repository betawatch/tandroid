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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class in extends org.telegram.ui.ActionBar.g5 {
    public float r;
    public final /* synthetic */ qn s;

    public in(qn qnVar) {
        this.s = qnVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean a() {
        return this.s.u3 == null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean b() {
        qn qnVar = this.s;
        if (!qnVar.Bc.f) {
            if (qnVar.u3 != null && qnVar.p1 != null) {
                View currentView = qnVar.q1.getCurrentView();
                qn qnVar2 = currentView instanceof sn ? ((sn) currentView).a : qnVar;
                if (!qnVar2.zc.f) {
                    qnVar2.Pb(true);
                    return false;
                }
                int currentPosition = qnVar.p1.a.getCurrentPosition();
                int i10 = qnVar.r1;
                if (currentPosition != i10) {
                    qnVar.p1.a.d(i10, i10);
                    return false;
                }
            } else if (qnVar.zc.f) {
                qnVar.Pb(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean f() {
        return this.s.n3;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void k() {
        qn qnVar = this.s;
        qnVar.O7();
        if (qnVar.o3 != null || qnVar.p3 != null) {
            ImageView imageView = qnVar.T2;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (qnVar.n3) {
            qnVar.I1.getAdapter().U(null, 0, null, false, true);
            qnVar.n3 = false;
            qnVar.j0.H("", true);
        }
        qnVar.j0.setSearchFieldHint(LocaleController.getString(qnVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        qnVar.S2.setVisibility(0);
        ImageView imageView2 = qnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        qnVar.o3 = null;
        qnVar.p3 = null;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        TLRPC.Chat chat;
        int i10;
        int i11;
        MessageObject messageObject;
        qn qnVar = this.s;
        qnVar.s3 = false;
        qnVar.zc();
        qnVar.Mc();
        ImageView imageView = qnVar.S2;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = qnVar.T2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (qnVar.n3) {
            qnVar.I1.getAdapter().U(null, 0, null, false, true);
            qnVar.n3 = false;
        }
        qnVar.I1.setReversed(false);
        qnVar.I1.getAdapter().k0 = false;
        qnVar.p7();
        qnVar.o3 = null;
        qnVar.p3 = null;
        qnVar.u3 = null;
        qnVar.j0.setSearchFieldHint(LocaleController.getString(qnVar.J9() ? R.string.SavedTagSearchHint : R.string.Search));
        qnVar.j0.setSearchFieldCaption(null);
        qnVar.Ac.a(false, true);
        qnVar.Bc.a(false, true);
        org.telegram.ui.ActionBar.x xVar = qnVar.i0;
        if (xVar != null && xVar.o != null) {
            org.telegram.ui.ActionBar.u0 u0Var = qnVar.h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = qnVar.i0;
            if (xVar2 != null) {
                xVar2.f(0);
                qn.S3(qnVar);
            }
            org.telegram.ui.ActionBar.x xVar3 = qnVar.e0;
            if (xVar3 != null) {
                xVar3.f(8);
            }
            ur urVar = qnVar.d0;
            if (urVar != null) {
                urVar.b(false);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.m0;
            if (u0Var2 != null && qnVar.K9) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar4 = qnVar.n0;
            if (xVar4 != null && qnVar.L9) {
                xVar4.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = qnVar.k0;
            if (u0Var3 != null) {
                u0Var3.setVisibility(8);
            }
        } else if (qnVar.Y.i0() && TextUtils.isEmpty(qnVar.Y.getSlowModeTimer()) && ((chat = qnVar.e) == null || ChatObject.canSendPlain(chat))) {
            org.telegram.ui.ActionBar.u0 u0Var4 = qnVar.h0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar5 = qnVar.i0;
            if (xVar5 != null) {
                xVar5.f(8);
            }
            org.telegram.ui.ActionBar.x xVar6 = qnVar.e0;
            if (xVar6 != null) {
                xVar6.f(0);
            }
            ur urVar2 = qnVar.d0;
            if (urVar2 != null) {
                urVar2.b(true);
            }
            org.telegram.ui.ActionBar.u0 u0Var5 = qnVar.m0;
            if (u0Var5 != null && qnVar.K9) {
                u0Var5.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar7 = qnVar.n0;
            if (xVar7 != null && qnVar.L9) {
                xVar7.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var6 = qnVar.k0;
            if (u0Var6 != null) {
                u0Var6.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var7 = qnVar.h0;
            if (u0Var7 != null) {
                u0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar8 = qnVar.n0;
            if (xVar8 != null && qnVar.L9) {
                xVar8.f(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var8 = qnVar.k0;
            if (u0Var8 != null) {
                u0Var8.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var9 = qnVar.m0;
            if (u0Var9 != null && qnVar.K9) {
                u0Var9.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar9 = qnVar.i0;
            if (xVar9 != null) {
                xVar9.f(8);
            }
            org.telegram.ui.ActionBar.x xVar10 = qnVar.e0;
            if (xVar10 != null) {
                xVar10.f(8);
            }
            ur urVar3 = qnVar.d0;
            if (urVar3 != null) {
                urVar3.b(false);
            }
        }
        if (qnVar.q1 != null) {
            if (qnVar.p1.a.getCurrentPosition() != 0) {
                qnVar.p1.a.d(0, 0);
                qnVar.s1 = true;
            } else {
                qnVar.q1.h.clear();
            }
        }
        int i12 = qnVar.R3;
        if (i12 == 3 || i12 == 8 || ((qnVar.d4 == 0 && !UserObject.isReplyUser(qnVar.f)) || ((messageObject = qnVar.X3) != null && messageObject.getRepliesCount() < 10))) {
            qnVar.j0.setVisibility(8);
        }
        qnVar.o0 = false;
        qnVar.getMediaDataController().clearFoundMessageObjects();
        if (qnVar.O3 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i11).clearSearchResults(3);
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i10).clearSearchResults();
        }
        hg.n1 n1Var = qnVar.M3;
        if (n1Var != null) {
            n1Var.l();
        }
        qnVar.Ma();
        qnVar.lc(false);
        qnVar.Cc(0, true);
        qnVar.ad(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 0.0f);
        ofFloat.addUpdateListener(new hn(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        qnVar.zc.a(false, true);
        qnVar.Lc();
        qnVar.q3 = null;
        qnVar.Mc();
        qnVar.zc();
        qk qkVar = qnVar.o1;
        if (qkVar != null) {
            qkVar.d.M(new xq(2));
            qkVar.h = 0L;
            qnVar.o1.g(false);
        }
        ck ckVar = qnVar.p1;
        if (ckVar != null) {
            ckVar.b(false);
        }
        qnVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        ck ckVar;
        int i10;
        qn qnVar = this.s;
        qnVar.s3 = true;
        qnVar.zc();
        qnVar.Mc();
        if (((qnVar.d4 != 0 && qnVar.R3 != 3) || UserObject.isReplyUser(qnVar.f)) && !qnVar.dc) {
            qnVar.qa(null);
        }
        if (qnVar.W4) {
            qnVar.saveKeyboardPositionBeforeTransition();
            if (!qnVar.Pa) {
                Activity parentActivity = qnVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                AndroidUtilities.requestAdjustResize(parentActivity, i10);
            }
            AndroidUtilities.runOnUIThread(new ti(this, 10), 500L);
            aj ajVar = qnVar.g2;
            if (ajVar != null) {
                ajVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var = qnVar.i2;
            if (r40Var != null) {
                r40Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 1.0f);
        ofFloat.addUpdateListener(new hn(this, 0));
        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        qk qkVar = qnVar.o1;
        if (qkVar != null) {
            qkVar.g(!qnVar.Pa && qkVar.a() && qnVar.u3 == null);
        }
        if (qnVar.u3 == null || (ckVar = qnVar.p1) == null) {
            return;
        }
        int currentPosition = ckVar.a.getCurrentPosition();
        int i11 = qnVar.r1;
        if (currentPosition != i11) {
            qnVar.p1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void o(hg.o0 o0Var) {
        qn qnVar = this.s;
        qk qkVar = qnVar.o1;
        if (qkVar != null) {
            qkVar.d.M(new xq(2));
            qkVar.h = 0L;
        }
        qnVar.q3 = null;
        qnVar.Mc();
        qnVar.zc();
        qnVar.ob(false);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void p(ei.e2 e2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var;
        qn qnVar = this.s;
        boolean z10 = false;
        qnVar.Jc(0, 0, -1);
        String obj = e2Var != null ? e2Var.getText().toString() : qnVar.t3;
        qnVar.t3 = obj;
        if (TextUtils.isEmpty(obj) || !(qnVar.t3.startsWith("$") || qnVar.t3.startsWith("#"))) {
            qnVar.u3 = null;
            ck ckVar = qnVar.p1;
            if (ckVar != null) {
                ckVar.b(false);
                qnVar.Lc();
            }
            ck ckVar2 = qnVar.p1;
            if (ckVar2 != null && ckVar2.a.getCurrentPosition() != 0) {
                qnVar.p1.a.d(0, 0);
            }
        } else {
            qnVar.P7();
            if (qnVar.t3.contains("@")) {
                String str = qnVar.t3;
                d6Var = ((org.telegram.ui.ActionBar.n2) qnVar).resourceProvider;
                qnVar.presentFragment(new org.telegram.ui.Components.k40(str, d6Var));
                return;
            }
            if (qnVar.u3 == null) {
                qnVar.u3 = qnVar.t3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, 1.0f);
                ofFloat.addUpdateListener(new hn(this, 2));
                ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                qk qkVar = qnVar.o1;
                if (qkVar != null) {
                    if (!qnVar.Pa && qkVar.a() && qnVar.u3 == null) {
                        z10 = true;
                    }
                    qkVar.g(z10);
                }
            }
            qnVar.u3 = qnVar.t3;
            qnVar.U6(true);
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            HashtagSearchController.getInstance(i11).putToHistory(qnVar.u3);
            qnVar.t1.f.N(true);
            View currentView = qnVar.q1.getCurrentView();
            if (qnVar.O3 == 3) {
                i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i13).clearSearchResults(3);
            } else {
                i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                HashtagSearchController.getInstance(i12).clearSearchResults();
            }
            if (currentView instanceof sn) {
                ((sn) currentView).a.Nc(qnVar.u3);
            }
            qnVar.Lc();
            qnVar.d2.e(true, true);
            qnVar.Pb(true);
            z10 = true;
        }
        ck ckVar3 = qnVar.p1;
        if (ckVar3 != null) {
            ckVar3.b(z10);
        }
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str2 = qnVar.t3;
        long j10 = qnVar.T5;
        long j11 = qnVar.L6;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        mediaDataController.searchMessagesInChat(str2, j10, j11, i10, 0, qnVar.d4, qnVar.o3, qnVar.p3, qnVar.q3);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        qn qnVar = this.s;
        ne.b bVar = qnVar.Bc;
        if (qnVar.u3 == null) {
            qnVar.Pb(false);
        }
        qnVar.O7();
        if (qnVar.n3) {
            qnVar.I1.getAdapter().U("@" + editText.getText().toString(), 0, qnVar.u6, true, true);
        } else if (qnVar.o3 == null && qnVar.p3 == null && qnVar.T2 != null && TextUtils.equals(editText.getText(), LocaleController.getString(R.string.SearchFrom))) {
            qnVar.T2.callOnClick();
        }
        if (qnVar.u3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    qnVar.P7();
                }
                bVar.a(z10, true);
                ei.h1 h1Var = qnVar.q1;
                if (h1Var != null) {
                    h1Var.D(0);
                }
                if (z10) {
                    qnVar.Pb(true);
                }
                qnVar.lc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final boolean u() {
        return this.s.u3 == null;
    }
}
